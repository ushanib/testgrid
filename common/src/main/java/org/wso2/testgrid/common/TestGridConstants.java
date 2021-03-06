/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.testgrid.common;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Class to maintain constants across modules.
 *
 * @since 1.0.0
 */
public class TestGridConstants {

    // Logging constants
    public static final String TEST_LOG_FILE_NAME = "test-run.log";
    public static final String TESTGRID_HOME_ENV = "TESTGRID_HOME";
    public static final String TESTGRID_HOME_SYSTEM_PROPERTY = "testgrid.home";
    public static final Path DEFAULT_TESTGRID_HOME = Paths.get(System.getProperty("user.home"), ".testgrid");

}
