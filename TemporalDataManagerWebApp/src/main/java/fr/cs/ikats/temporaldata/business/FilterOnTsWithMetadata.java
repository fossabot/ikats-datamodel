/**
 * Copyright 2018 CS Systèmes d'Information
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.cs.ikats.temporaldata.business;

import java.util.Collections;
import java.util.List;

import fr.cs.ikats.metadata.model.FunctionalIdentifier;
import fr.cs.ikats.metadata.model.MetadataCriterion;

/**
 * This Class is JSONizable: defines a filter on timeseries with tsmetadata criteria
 */
public class FilterOnTsWithMetadata {

    private String datasetName = "";

    private List<FunctionalIdentifier> tsList = Collections.emptyList();

    private List<MetadataCriterion> criteria = Collections.emptyList();

    /**
     * Getter
     *
     * @return the tsList
     */
    public List<FunctionalIdentifier> getTsList() {
        return tsList;
    }

    /**
     * Setter
     *
     * @param tsList the tsList to set
     */
    public void setTsList(List<FunctionalIdentifier> tsList) {
        this.tsList = tsList;
    }

    /**
     * Getter
     *
     * @return the criteria
     */
    public List<MetadataCriterion> getCriteria() {
        return criteria;
    }

    /**
     * Setter
     *
     * @param criteria the criteria to set
     */
    public void setCriteria(List<MetadataCriterion> criteria) {
        this.criteria = criteria;
    }

    /**
     * Getter
     *
     * @return the datasetName
     */
    public String getDatasetName() {
        return datasetName;
    }

    /**
     * Setter
     *
     * @param datasetName the datasetName to set
     */
    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }
}
