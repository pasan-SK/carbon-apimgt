/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.wso2.apk.apimgt.api;

public interface NewPostLoginExecutor extends LoginPostExecutor {

    /**
     * Return all groups for the given user for the purpose of sharing applications and subscriptions.
     *
     * @param response login response
     * @return String Array containing all the groups
     */
    String[] getGroupingIdentifierList(String response);

    /**
     * Returns True to enable multi group application sharing for the implementations based on NewPostLoginExecutor
     *
     * @return true
     */
    default public boolean isMultiGrpAppSharing() {
        return true;
    }
}