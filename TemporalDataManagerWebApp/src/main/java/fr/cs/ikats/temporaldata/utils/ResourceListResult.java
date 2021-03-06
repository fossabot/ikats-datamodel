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

package fr.cs.ikats.temporaldata.utils;

import java.util.List;

/**
 * Generic wrapper of a web service result with (0..N) resources T.
 * Ought to be translated to JSON response of web service.
 * @param <T> resource type
 */
public class ResourceListResult<T> {

    private final List<T> result;
    private final ServiceStatus status;

    /**
     *
     * @param argValue list of resources
     * @param aStatusInfo status information
     */
    public ResourceListResult(List<T> argValue, ServiceStatus aStatusInfo) {
        result = argValue;
        status = aStatusInfo;
    }

    /**
     *
     * @return result list
     */
    public List<T> getResult() {
        return result;
    }

    /**
     *
     * @return status
     */
    public ServiceStatus getStatus() {
        return status;
    }
}
