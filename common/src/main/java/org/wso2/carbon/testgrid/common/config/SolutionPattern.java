/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbon.testgrid.common.config;

import java.util.Map;

/**
 * Defines the configuration of a single solution pattern.
 */
public class SolutionPattern {

    private String name;
    private boolean enabled;
    private String infraProvider;//ex. AWS, OpenStack, GCC
    private String instanceType; //ex. EC2, ECS, K8S
    private String automationEngine; //ex. puppet, Ansible
    private Credentials instanceCredentials;
    private Map<String, String> instanceMap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getInfraProvider() {
        return infraProvider;
    }

    public void setInfraProvider(String infraProvider) {
        this.infraProvider = infraProvider;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public Credentials getInstanceCredentials() {
        return instanceCredentials;
    }

    public void setInstanceCredentials(Credentials instanceCredentials) {
        this.instanceCredentials = instanceCredentials;
    }

    public Map<String, String> getInstanceMap() {
        return instanceMap;
    }

    public void setInstanceMap(Map<String, String> instanceMap) {
        this.instanceMap = instanceMap;
    }

    public String getAutomationEngine() {
        return automationEngine;
    }

    public void setAutomationEngine(String automationEngine) {
        this.automationEngine = automationEngine;
    }
}