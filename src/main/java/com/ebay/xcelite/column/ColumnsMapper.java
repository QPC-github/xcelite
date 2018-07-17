/*
  Copyright [2013-2014] eBay Software Foundation

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package com.ebay.xcelite.column;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Set;

/**
 * Class description...
 *
 * @author kharel (kharel@ebay.com)
 * created Nov 5, 2013
 */
public class ColumnsMapper {

    private final Map<String, Col> columnsMap;

    public ColumnsMapper(Set<Col> columns) {
        columnsMap = Maps.newHashMap();
        for (Col col: columns) {
            columnsMap.put(col.getName(), col);
        }
    }

    public Col getColumn(String name) {
        return columnsMap.get(name);
    }
}
