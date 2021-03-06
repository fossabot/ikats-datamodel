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

package fr.cs.ikats.temporaldata.exception;

/**
 * exception indicating no ressoure is found
 */
public class ResourceNotFoundException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = -7372675465107111550L;

    /**
     *
     */
    public ResourceNotFoundException() {
    }

    /**
     * @param message error message
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }

    /**
     * @param cause the root cause
     */
    public ResourceNotFoundException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message error message
     * @param cause the root cause
     */
    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }


}
