/*
 * Copyright 2019 Arcus Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.iris.type.handler;

public class DoubleHandler extends TypeHandlerImpl<Double> {

   public DoubleHandler() {
      super(Double.class, Number.class, String.class);
   }

   @Override
   protected Double convert(Object value) {
   // TODO:  do we need to check if a BigInteger or BigDecimal could fit into a double?
      if(value instanceof Number) {
         return ((Number) value).doubleValue();
      }
      return Double.valueOf((String) value);
   }

}

