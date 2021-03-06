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
package de.tudarmstadt.ukp.lmf.model.enums;

import de.tudarmstadt.ukp.lmf.model.semantics.SenseExample;

/**
 * Enumeration of different types of {@link SenseExample}s.
 */
public enum EExampleType {
	
	/** Example sentence illustrating a subcategorization frame.
	 *  ISOcat: http://www.isocat.org/datcat/DC-4630 */
    subcatFrame,

	/** Example sentence illustrating syntactic usage.
	 *  ISOcat: http://www.isocat.org/datcat/DC-455 */
    syntacticUsage,

	/** Example sentence illustrating a word's meaning.
	 *  ISOcat: http://www.isocat.org/datcat/DC-3778 */
    senseInstance,

	/** Example sentence illustrating the use of an idiomatic expression.
	 *  ISOcat: http://www.isocat.org/datcat/DC-351 */
    idiomaticExpression,
    
    other;

}
