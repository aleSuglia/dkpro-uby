/*******************************************************************************
 * Copyright 2013
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
package de.tudarmstadt.ukp.uby.resource;

import java.util.Map;

import org.apache.uima.fit.component.Resource_ImplBase;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.fit.descriptor.ExternalResourceLocator;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceSpecifier;

import de.tudarmstadt.ukp.lmf.api.Uby;
import de.tudarmstadt.ukp.lmf.exceptions.UbyInvalidArgumentException;
import de.tudarmstadt.ukp.lmf.transform.DBConfig;

/**
 * Locate an UBY object.
 *
 * @author Judith Eckle-Kohler
 */
public class UbyResourceLocator extends Resource_ImplBase implements ExternalResourceLocator {
	public static final String PARAM_URL = "ubyDatabaseUrl";
	@ConfigurationParameter(name = PARAM_URL, mandatory = true)
	private String ubyDatabaseUrl;

	public static final String PARAM_DRIVER = "databaseDriver";
	@ConfigurationParameter(name = PARAM_DRIVER, mandatory = true)
	private String databaseDriver;
	
	//vendor name of the accessed database, e.g. mysql, hsqldb
	public static final String PARAM_DRIVER_NAME = "databaseDriverName"; //name of database driver (this parameter is called "vendor" in DBConfig), e.g. mysql, h2
	@ConfigurationParameter(name = PARAM_DRIVER_NAME, mandatory = true)
	private String databaseDriverName;
	
	public static final String PARAM_USERNAME = "ubyUsername";
	@ConfigurationParameter(name = PARAM_USERNAME, mandatory = true)
	private String ubyUsername;
	
	public static final String PARAM_PASSWORD = "ubyPassword";
	@ConfigurationParameter(name = PARAM_PASSWORD, mandatory = true)
	private String ubyPassword;


	private Uby resource;

	@SuppressWarnings("rawtypes")
	@Override
	public boolean initialize(ResourceSpecifier aSpecifier, Map aAdditionalParams)
			throws ResourceInitializationException {
		if (!super.initialize(aSpecifier, aAdditionalParams)) {
			return false;
		}

		try {
			DBConfig dbConfig = new DBConfig(ubyDatabaseUrl,databaseDriver,databaseDriverName,ubyUsername,ubyPassword,false);

			resource = new Uby(dbConfig);

		} catch (UbyInvalidArgumentException e) {
			throw new ResourceInitializationException(e);
		}
		return true;
	}

	@Override
    public Uby getResource() {
		return resource;
	}
}
