/*******************************************************************************
 * Copyright 2015
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.tudarmstadt.ukp.uby.uima.annotator.test;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngine;
import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription;
import static org.apache.uima.fit.factory.ExternalResourceFactory.createExternalResourceDescription;
import static org.apache.uima.fit.util.JCasUtil.select;

import java.io.File;
import java.io.FileNotFoundException;

import org.apache.uima.UIMAException;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.fit.testing.factory.TokenBuilder;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;
import org.dom4j.DocumentException;
import org.junit.Ignore;
import org.junit.Test;

import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.ADJ;
import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.NN;
import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS;
import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.V;
import de.tudarmstadt.ukp.dkpro.core.api.resources.ResourceObjectProviderBase;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Lemma;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.tudarmstadt.ukp.dkpro.core.api.semantics.type.SemanticField;
import de.tudarmstadt.ukp.dkpro.core.testing.AssertAnnotations;
import de.tudarmstadt.ukp.lmf.transform.DBConfig;
import de.tudarmstadt.ukp.lmf.transform.LMFDBUtils;
import de.tudarmstadt.ukp.lmf.transform.XMLToDBTransformer;
import de.tudarmstadt.ukp.uby.resource.UbyResource;
import de.tudarmstadt.ukp.uby.resource.UbySemanticFieldResource;
import de.tudarmstadt.ukp.uby.uima.annotator.UbySemanticFieldAnnotator;


public class UbySemanticFieldAnnotatorTest
{

	@Test
	public void testUbySemanticFieldAnnotatorOnInMemDb()
		throws Exception
	{
        String[] semanticFields = new String[] { "communication", "communication", "UNKNOWN",
                "communication", "UNKNOWN" };
	    
        runAnnotatorTestOnInMemDb("en", "Answers question most questions .", 
               new String[] { "answer", "question", "most", "question", "." }, 
                new String[] { "NN", "V", "NOT_RELEVANT", "NN", "$." }, 
                semanticFields);
  
        
        // botnet: Wiktionary domain=question (just for the test case) -> question: WordNet semantic field = communication
         runAnnotatorTestOnInMemDb("en", "Botnets question most questions .", 
                new String[] { "botnet", "question", "most", "question", "." }, 
                new String[] { "NN", "V", "NOT_RELEVANT", "NN", "$." }, 
                semanticFields);
       
        
	}

	@Ignore
	@Test
	public void testUbySemanticFieldAnnotatorOnMySqlDb()
		throws Exception
	{
        String[] lemmas = new String[] { "vanilla", "in", "the", "blue", "sky", "prefer",
                "braveness", "over", "jumpiness", "." };

        String[] pos = new String[] { "NN", "NOT_RELEVANT", "NOT_RELEVANT", "ADJ", "NN", "V", "NN",
                "NOT_RELEVANT", "NN", "$." };

        String[] semanticFields = new String[] { "plant", "UNKNOWN", "UNKNOWN", "all" , "object" , "emotion" , "attribute" , "UNKNOWN" , "feeling" , "UNKNOWN" };
        
        runAnnotatorTestOnMySqlDb("en",
                "Vanilla in the blue sky prefers braveness over jumpiness .", lemmas, pos,
                semanticFields);
        
 
        String[] lemmas2 = new String[] { "vanilla", "in", "the", "distantGalaxyBehindJupiter",
                "prefer", "braveness", "over", "jumpiness", "." };

        String[] pos2 = new String[] { "NN", "NOT_RELEVANT", "NOT_RELEVANT", "NN", "V", "NN",
                "NOT_RELEVANT", "NN", "$." };

        String[] semanticFields2 = new String[] { "plant", "UNKNOWN", "UNKNOWN", "UNKNOWN" , "emotion" , "attribute" , "UNKNOWN" , "feeling" , "UNKNOWN" };
               
        runAnnotatorTestOnMySqlDb("en",
                "Vanilla in the distantGalaxyBehindJupiter prefers braveness over jumpiness .",
                lemmas2, pos2, semanticFields2);

	}

	/**
	 * This is the test case that uses an embedded DB
	 * use of in-memory DB is commented out
	 *
	 */	 
    private void runAnnotatorTestOnInMemDb(String language, String testDocument,
            String[] documentLemmas, String[] documentPosTags, String[] documentUbySemanticFields)
        throws UIMAException, FileNotFoundException, DocumentException, IllegalArgumentException
    {
	 	DBConfig dbConfig = new DBConfig("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1","org.h2.Driver","h2","root","pass",false);
		
		LMFDBUtils.createTables(dbConfig);
		
		XMLToDBTransformer transformer;
		transformer = new XMLToDBTransformer(dbConfig);
		transformer.transform(new File("src/test/resources/UbyTestLexicon.xml"),"UbyTest");
		
		 
		AnalysisEngineDescription processor = createEngineDescription(

				createEngineDescription(UbySemanticFieldAnnotator.class,
						UbySemanticFieldAnnotator.PARAM_UBY_SEMANTIC_FIELD_RESOURCE, 
							createExternalResourceDescription(UbySemanticFieldResource.class,
									UbySemanticFieldResource.RES_UBY,				                
					                createExternalResourceDescription(UbyResource.class,
					                		UbyResource.PARAM_MODEL_LOCATION, ResourceObjectProviderBase.NOT_REQUIRED,
					                        UbyResource.PARAM_URL, "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1",
					                        UbyResource.PARAM_DRIVER, "org.h2.Driver",
					                        UbyResource.PARAM_DIALECT, "h2",
					                        UbyResource.PARAM_USERNAME, "root",
					                        UbyResource.PARAM_PASSWORD, "pass"
									)))
		);

		AnalysisEngine engine = createEngine(processor);
		JCas aJCas = engine.newJCas();
		aJCas.setDocumentLanguage(language);

		TokenBuilder<Token, Sentence> tb = new TokenBuilder<Token, Sentence>(Token.class,
				Sentence.class);
		tb.buildTokens(aJCas, testDocument);

		int offset = 0;
		for (Token token : JCasUtil.select(aJCas, Token.class)) {
			
			if (documentPosTags[offset].matches("NN")) {
				NN nn = new NN(aJCas, token.getBegin(), token.getEnd());
				nn.setPosValue(documentPosTags[offset]);
				nn.addToIndexes();
				token.setPos(nn);
			} else if (documentPosTags[offset].matches("V")) {
				V v = new V(aJCas, token.getBegin(), token.getEnd());
				v.setPosValue(documentPosTags[offset]);
				v.addToIndexes();
				token.setPos(v);
			} else if (documentPosTags[offset].matches("ADJ")) {
				ADJ adj = new ADJ(aJCas, token.getBegin(), token.getEnd());
				adj.setPosValue(documentPosTags[offset]);
				adj.addToIndexes();
				token.setPos(adj);				
			} else {
				POS pos = new POS(aJCas, token.getBegin(), token.getEnd());
				pos.setPosValue(documentPosTags[offset]);
				pos.addToIndexes();
				token.setPos(pos);
			}
			
			Lemma lemma = new Lemma(aJCas, token.getBegin(), token.getEnd());
			lemma.setValue(documentLemmas[offset]);
			lemma.addToIndexes();
			token.setLemma(lemma);

			offset++;
		}
		engine.process(aJCas);

		AssertAnnotations.assertSemanticField(documentUbySemanticFields,
				select(aJCas, SemanticField.class));
	
	}	

    private void runAnnotatorTestOnMySqlDb(String language, String testDocument,
            String[] documentLemmas, String[] documentPosTags, String[] documentUbySemanticFields)
        throws UIMAException
    {
        AnalysisEngineDescription processor = createEngineDescription(

        createEngineDescription(
                UbySemanticFieldAnnotator.class,
                UbySemanticFieldAnnotator.PARAM_UBY_SEMANTIC_FIELD_RESOURCE,
                createExternalResourceDescription(UbySemanticFieldResource.class,
						UbySemanticFieldResource.RES_UBY,				                
		                createExternalResourceDescription(UbyResource.class,
		                		UbyResource.PARAM_MODEL_LOCATION, ResourceObjectProviderBase.NOT_REQUIRED,
		                        UbyResource.PARAM_URL, "localhost/uby_lite_0_6_0",
		                        UbyResource.PARAM_DRIVER, "com.mysql.jdbc.Driver",
		                        UbyResource.PARAM_DIALECT, "mysql",
		                        UbyResource.PARAM_USERNAME, "root",
		                        UbyResource.PARAM_PASSWORD, "pass"))));
                		
		AnalysisEngine engine = createEngine(processor);
		JCas aJCas = engine.newJCas();
		aJCas.setDocumentLanguage(language);

		TokenBuilder<Token, Sentence> tb = new TokenBuilder<Token, Sentence>(Token.class,
				Sentence.class);
		tb.buildTokens(aJCas, testDocument);

		int offset = 0;
		for (Token token : JCasUtil.select(aJCas, Token.class)) {
			
			if (documentPosTags[offset].matches("NN")) {
				NN nn = new NN(aJCas, token.getBegin(), token.getEnd());
				nn.setPosValue(documentPosTags[offset]);
				nn.addToIndexes();
				token.setPos(nn);
			} else if (documentPosTags[offset].matches("V")) {
				V v = new V(aJCas, token.getBegin(), token.getEnd());
				v.setPosValue(documentPosTags[offset]);
				v.addToIndexes();
				token.setPos(v);
			} else if (documentPosTags[offset].matches("ADJ")) {
				ADJ adj = new ADJ(aJCas, token.getBegin(), token.getEnd());
				adj.setPosValue(documentPosTags[offset]);
				adj.addToIndexes();
				token.setPos(adj);				
			} else {
				POS pos = new POS(aJCas, token.getBegin(), token.getEnd());
				pos.setPosValue(documentPosTags[offset]);
				pos.addToIndexes();
				token.setPos(pos);
			}
			
			Lemma lemma = new Lemma(aJCas, token.getBegin(), token.getEnd());
			lemma.setValue(documentLemmas[offset]);
			lemma.addToIndexes();
			token.setLemma(lemma);

			offset++;
		}
		engine.process(aJCas);

		AssertAnnotations.assertSemanticField(documentUbySemanticFields,
				select(aJCas, SemanticField.class));
	}
}
