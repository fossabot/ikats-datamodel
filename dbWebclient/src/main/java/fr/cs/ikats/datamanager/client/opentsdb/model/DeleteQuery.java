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

package fr.cs.ikats.datamanager.client.opentsdb.model;

/**
 *
 */
public class DeleteQuery extends TSQuery {

    boolean delete = true;

    /**
     *
     * @param start
     * @param end
     */
    public DeleteQuery(String start, String end) {
        super(start, end);
    }

    /**
     * @param start
     * @param end
     * @param tsuid
     */
    public DeleteQuery(String start, String end, String tsuid) {
        super(start, end, tsuid);
    }

    /**
     * Getter
     * @return the delete
     */
    public boolean isDelete() {
        return delete;
    }

    /**
     * Setter
     * @param delete the delete to set
     */
    public void setDelete(boolean delete) {
        this.delete = delete;
    }

}
