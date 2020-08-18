/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package my.home.model.datasource;

import android.content.Context;

/**
 * Created by legendmohe on 15/2/13.
 */
public interface AutoCompleteItemDataSource {
    String PREFERENCE_KEY = "GetAutoCompleteItemUsecase_pref_key";
    String CONF_KEY_GET_AUTOCOMPLETE_ITEM = "GetAutoCompleteItemUsecase_conf_key";

    void saveConf(Context context, String confJSONString);

    void loadConf(Context context);

    void getAutoCompleteItems(Context context, String currentInput);
}
