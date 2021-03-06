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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.log4j.Logger;

/**
 * Handler of exception InvalidValue.
 * Returns a NOT ACCEPTABLE (406) response status.
 */
@Provider
public class InvalidValueExceptionHandler implements ExceptionMapper<InvalidValueException> {

    private static Logger logger = Logger.getLogger(InvalidValueExceptionHandler.class);

    @Override
    public Response toResponse(InvalidValueException exception) {
        logger.error(exception);
        return Response.status(Status.NOT_ACCEPTABLE).entity(exception.getMessage()).build();
    }

}
