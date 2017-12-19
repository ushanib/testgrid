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
package org.wso2.testgrid.common;

import org.wso2.testgrid.common.util.StringUtil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * This represents a model of the DeploymentPattern.
 *
 * @since 1.0.0
 */
@Entity
@Table(name = DeploymentPattern.DEPLOYMENT_PATTERN_TABLE)
public class DeploymentPattern extends AbstractUUIDEntity implements Serializable {

    /**
     * Deployment pattern table name.
     */
    public static final String DEPLOYMENT_PATTERN_TABLE = "deployment_pattern";

    /**
     * Column names of the table.
     */
    public static final String NAME_COLUMN = "name";
    public static final String PRODUCT_COLUMN = "product";

    private static final long serialVersionUID = -4345126378695708155L;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, targetEntity = Product.class,
               fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "PRODUCT_id", referencedColumnName = ID_COLUMN)
    private Product product;

    @OneToMany(mappedBy = "deploymentPattern", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TestPlan> testPlans = new ArrayList<>();

    /**
     * Returns the name of the test plan.
     *
     * @return the name of the test plan
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of test plan.
     *
     * @param name name of the test plan
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the product associated with the deployment pattern.
     *
     * @return product associated with the deployment pattern
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the product associated with the deployment pattern.
     *
     * @param product product associated with the deployment pattern
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Returns the test plans associated with.
     *
     * @return test plans associated with
     */
    public List<TestPlan> getTestPlans() {
        return testPlans;
    }

    /**
     * Sets the test plans associated with.
     *
     * @param testPlans test plans associated with
     */
    public void setTestPlans(List<TestPlan> testPlans) {
        this.testPlans = testPlans;
    }

    @Override
    public String toString() {
        return StringUtil.concatStrings("DeploymentPattern{",
                "id='", this.getId(), "\'",
                ", name='", name, "\'",
                ", createdTimestamp='", this.getCreatedTimestamp(), "\'",
                ", modifiedTimestamp='", this.getModifiedTimestamp(), "\'",
                ", product='", product, "\'",
                '}');
    }
}