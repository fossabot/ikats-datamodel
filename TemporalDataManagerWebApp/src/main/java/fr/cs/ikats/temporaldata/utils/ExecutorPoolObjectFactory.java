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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;

/**
 * ExecutorService pool factory.
 */
public class ExecutorPoolObjectFactory implements PooledObjectFactory<ExecutorService> {

    /**
     * constructor
     */
    public ExecutorPoolObjectFactory() {
    }

    @Override
    public PooledObject<ExecutorService> makeObject() {
        ExecutorService service = Executors.newCachedThreadPool();
        DefaultPooledObject<ExecutorService> object = new DefaultPooledObject<ExecutorService>(service);
        return object;
    }

    @Override
    public void destroyObject(PooledObject<ExecutorService> p) throws Exception {
        p.getObject().shutdownNow();
        p.getObject().awaitTermination(100, TimeUnit.MILLISECONDS);
    }

    @Override
    public boolean validateObject(PooledObject<ExecutorService> p) {
        if (p.getObject().isTerminated()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void activateObject(PooledObject<ExecutorService> p) {
    }

    @Override
    public void passivateObject(PooledObject<ExecutorService> p) {
    }

}
