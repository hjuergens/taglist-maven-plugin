package org.codehaus.mojo.taglist.scala.stubs;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.codehaus.plexus.PlexusTestCase;
import java.util.List;
import java.util.Collections;

/**
 * The Maven Project stub file for testing the plugin basic configuration.
 * 
 * This stub is used to get the test and source file directories.  This
 * allows the TagList plugin unit.scala tests run against the unit.scala test directories
 * instead of using the default project directories.
 */
public class BasicConfigProjectStub
    extends org.apache.maven.plugin.testing.stubs.MavenProjectStub
{	
	public List getCompileSourceRoots()
	{
		return Collections.singletonList( PlexusTestCase.getBasedir() + "/target/test-classes/unit/scala/basic-config-test/java-sources" );
	}
	
	public List getTestCompileSourceRoots()
	{
		return Collections.singletonList( PlexusTestCase.getBasedir() + "/target/test-classes/unit/scala/basic-config-test/test-sources" );
	}	
}