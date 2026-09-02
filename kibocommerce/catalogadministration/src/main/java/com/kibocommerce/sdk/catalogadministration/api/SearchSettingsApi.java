/*
 * Kibo Catalog Admin Services
 * <div id=\"overview_CATALOG_ADMIN\">             <h2>CATALOG ADMINISTRATION</h2>             <p>The Catalog Administration APIs are a collection of resources for configuring the catalogs and products offered to your shoppers, including                 discounts and coupon sets, faceting, price lists, and different types or variations of products. See the                 <a href=\"/concept-guides/catalog\">Catalog user guides</a>                 for information about the related features in the Unified Commerce Admin.</p>             <p>Use the <strong>Attributes</strong> resource to manage localization and attribute configurations for your catalogs. This current version of the Attributes API includes localizedContent to                 support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy API model. If                 you were a client prior to May 2024 and have upgraded your implementation to support this feature,                 you can still access attribute data that has not yet been rewritten to the new model by providing                 an x-api-version header set to \"1\". </p>             <p>Use the <strong>Categories</strong> resource to organize products and control where they appear on the storefront. Create                 and maintain a hierarchy of categories and subcategories where the site will store properties. This current version of the Categories API includes localizedContent to                 support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy API model. If                 you were a client prior to May 2024 and have upgraded your implementation to support this feature,                 you can still access category data that has not yet been rewritten to the new model by providing                 an x-api-version header set to \"1\". </p>             <p>Use the <strong>Coupon Sets</strong> resource to view and create coupon sets. You can use coupon sets to group multiple                 coupon codes together and associate them with one or more discounts.</p>             <p>Use the <strong>Currency</strong> resource to manage the currency localization rules and exchange rates for any of the                 currencies that are supported for placing orders in.</p>             <p>Use the <strong>Discounts</strong> and <strong>Discount Settings</strong> resources to define and manage discounts to apply to products, product categories, or                 orders. This current version of the Discounts API includes localizedContent to                 support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy Products API model. If                 you were a client prior to May 2024 and have upgraded your implementation to support this feature,                 you can still access discount data that has not yet been rewritten to the new model by providing                 an x-api-version header set to \"1\". </p>             <p>Use the <strong>Facets</strong> resource to manage the facets shoppers use to filter product display results on a                 storefront. Facets can include categories, product attributes, or prices, and use either a range of                 values or discrete values.</p>             <p>Use the <strong>Master Catalog</strong> resource to view details of the master catalogs associated with a tenant and to                 manage the product publishing mode for each master catalog.</p>             <p>Use the <strong>Price Lists</strong> resources to view and create price lists. You can use price lists to override the                 catalog pricing of products for specific customer segments and/or sites.</p>             <p>Use the <strong>Products</strong>, <strong>Product Types/Extras/Options/Properties</strong>, and <strong>Product Sort Definitions</strong> resources to create new product definitions in the master catalog and determine which                 catalogs will feature products. This current version of the Products API includes localizedContent to                 support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy Products API model. If                 you were a client prior to May 2024 and have upgraded your implementation to support this feature,                 you can still access product data that has not yet been rewritten to the new model by providing                 an x-api-version header set to \"1\".</p>             <p>Use the <strong>Publishing</strong> resource to publish pending product updates together as part of a set.</p>             <p>Use the <strong>Search</strong> resource to manage all settings and options for providing product search on your site, as                 well as search tuning rules.</p>         </div>
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogadministration.api;
import com.kibocommerce.sdk.common.*;

import com.kibocommerce.sdk.common.ApiCallback;
import com.kibocommerce.sdk.common.ApiClient;
import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.common.ApiResponse;
import com.kibocommerce.sdk.common.Configuration;

import com.kibocommerce.sdk.common.Pair;
import com.kibocommerce.sdk.common.ProgressRequestBody;
import com.kibocommerce.sdk.common.ProgressResponseBody;

import com.kibocommerce.sdk.catalogadministration.ServerConfiguration;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.kibocommerce.sdk.catalogadministration.models.SearchSettings;
import com.kibocommerce.sdk.catalogadministration.models.SearchSettingsCollection;
import com.kibocommerce.sdk.catalogadministration.models.SiteSearchSettings;
import com.kibocommerce.sdk.catalogadministration.models.SpellcheckUpdate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SearchSettingsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public SearchSettingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchSettingsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public SearchSettingsApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public SearchSettingsApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public SearchSettingsApi(Builder builder) {
        this.localCustomBaseUrl = builder.configuration.getServerForTemplate(localServerBaseTemplate);
        this.localVarApiClient = builder.configuration.getClient();
        this.localHeaders = builder.configuration.getHeaders();
    }
    public ApiClient getApiClient() {
        return localVarApiClient;
    }
    public Map<String, String> getHeaders(){
        return localHeaders;
    }
    public void setHeaders(Map<String, String> headers){
        this.localHeaders = headers;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for addSearchSetting
     * @param fromSystemDefault  (optional, default to false)
     * @param copyFromName  (optional)
     * @param name  (optional)
     * @param makeDefault  (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param searchSettings  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addSearchSettingCall(Boolean fromSystemDefault, String copyFromName, String name, Boolean makeDefault, String responseFields, SearchSettings searchSettings, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = searchSettings;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/search/settings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fromSystemDefault != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromSystemDefault", fromSystemDefault));
        }

        if (copyFromName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("copyFromName", copyFromName));
        }

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (makeDefault != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("makeDefault", makeDefault));
        }

        if (responseFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("responseFields", responseFields));
        }

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addSearchSettingValidateBeforeCall(Boolean fromSystemDefault, String copyFromName, String name, Boolean makeDefault, String responseFields, SearchSettings searchSettings, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = addSearchSettingCall(fromSystemDefault, copyFromName, name, makeDefault, responseFields, searchSettings, _callback);
        return localVarCall;

    }

    /**
     * Add Search Settings
     * Adds the Search Settings for a specific site.
     * @param fromSystemDefault  (optional, default to false)
     * @param copyFromName  (optional)
     * @param name  (optional)
     * @param makeDefault  (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param searchSettings  (optional)
     * @return SearchSettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SearchSettings addSearchSetting(Boolean fromSystemDefault, String copyFromName, String name, Boolean makeDefault, String responseFields, SearchSettings searchSettings) throws ApiException {
        ApiResponse<SearchSettings> localVarResp = addSearchSettingWithHttpInfo(fromSystemDefault, copyFromName, name, makeDefault, responseFields, searchSettings);
        return localVarResp.getData();
    }

    /**
     * Add Search Settings
     * Adds the Search Settings for a specific site.
     * @param fromSystemDefault  (optional, default to false)
     * @param copyFromName  (optional)
     * @param name  (optional)
     * @param makeDefault  (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param searchSettings  (optional)
     * @return ApiResponse&lt;SearchSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchSettings> addSearchSettingWithHttpInfo(Boolean fromSystemDefault, String copyFromName, String name, Boolean makeDefault, String responseFields, SearchSettings searchSettings) throws ApiException {
        okhttp3.Call localVarCall = addSearchSettingValidateBeforeCall(fromSystemDefault, copyFromName, name, makeDefault, responseFields, searchSettings, null);
        Type localVarReturnType = new TypeToken<SearchSettings>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Search Settings (asynchronously)
     * Adds the Search Settings for a specific site.
     * @param fromSystemDefault  (optional, default to false)
     * @param copyFromName  (optional)
     * @param name  (optional)
     * @param makeDefault  (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param searchSettings  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addSearchSettingAsync(Boolean fromSystemDefault, String copyFromName, String name, Boolean makeDefault, String responseFields, SearchSettings searchSettings, final ApiCallback<SearchSettings> _callback) throws ApiException {

        okhttp3.Call localVarCall = addSearchSettingValidateBeforeCall(fromSystemDefault, copyFromName, name, makeDefault, responseFields, searchSettings, _callback);
        Type localVarReturnType = new TypeToken<SearchSettings>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteSearchSetting
     * @param name  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSearchSettingCall(String name, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/search/settings/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteSearchSettingValidateBeforeCall(String name, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSearchSetting(Async)");
        }
        

        okhttp3.Call localVarCall = deleteSearchSettingCall(name, _callback);
        return localVarCall;

    }

    /**
     * Delete Search Settings by Name
     * Delete the Search Settings for a specific site by name.
     * @param name  (required)
     * @return SearchSettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SearchSettings deleteSearchSetting(String name) throws ApiException {
        ApiResponse<SearchSettings> localVarResp = deleteSearchSettingWithHttpInfo(name);
        return localVarResp.getData();
    }

    /**
     * Delete Search Settings by Name
     * Delete the Search Settings for a specific site by name.
     * @param name  (required)
     * @return ApiResponse&lt;SearchSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchSettings> deleteSearchSettingWithHttpInfo(String name) throws ApiException {
        okhttp3.Call localVarCall = deleteSearchSettingValidateBeforeCall(name, null);
        Type localVarReturnType = new TypeToken<SearchSettings>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete Search Settings by Name (asynchronously)
     * Delete the Search Settings for a specific site by name.
     * @param name  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSearchSettingAsync(String name, final ApiCallback<SearchSettings> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteSearchSettingValidateBeforeCall(name, _callback);
        Type localVarReturnType = new TypeToken<SearchSettings>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteSiteSearchSettings
     * @param name  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSiteSearchSettingsCall(String name, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/search/{name}/sitesearchsettings"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteSiteSearchSettingsValidateBeforeCall(String name, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSiteSearchSettings(Async)");
        }
        

        okhttp3.Call localVarCall = deleteSiteSearchSettingsCall(name, _callback);
        return localVarCall;

    }

    /**
     * Delete Site Search Settings
     * Deletes the SiteSearchSettings for a specific SearchSetting by name.
     * @param name  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteSiteSearchSettings(String name) throws ApiException {
        deleteSiteSearchSettingsWithHttpInfo(name);
    }

    /**
     * Delete Site Search Settings
     * Deletes the SiteSearchSettings for a specific SearchSetting by name.
     * @param name  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteSiteSearchSettingsWithHttpInfo(String name) throws ApiException {
        okhttp3.Call localVarCall = deleteSiteSearchSettingsValidateBeforeCall(name, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Site Search Settings (asynchronously)
     * Deletes the SiteSearchSettings for a specific SearchSetting by name.
     * @param name  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSiteSearchSettingsAsync(String name, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteSiteSearchSettingsValidateBeforeCall(name, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSearchSetting
     * @param name  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSearchSettingCall(String name, String responseFields, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/search/settings/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (responseFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("responseFields", responseFields));
        }

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSearchSettingValidateBeforeCall(String name, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSearchSetting(Async)");
        }
        

        okhttp3.Call localVarCall = getSearchSettingCall(name, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Search Settings by Name
     * Get specific site search settings by name.
     * @param name  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return SearchSettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SearchSettings getSearchSetting(String name, String responseFields) throws ApiException {
        ApiResponse<SearchSettings> localVarResp = getSearchSettingWithHttpInfo(name, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Search Settings by Name
     * Get specific site search settings by name.
     * @param name  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;SearchSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchSettings> getSearchSettingWithHttpInfo(String name, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getSearchSettingValidateBeforeCall(name, responseFields, null);
        Type localVarReturnType = new TypeToken<SearchSettings>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Search Settings by Name (asynchronously)
     * Get specific site search settings by name.
     * @param name  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSearchSettingAsync(String name, String responseFields, final ApiCallback<SearchSettings> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSearchSettingValidateBeforeCall(name, responseFields, _callback);
        Type localVarReturnType = new TypeToken<SearchSettings>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSearchSettings
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSearchSettingsCall(String responseFields, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/search/settings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (responseFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("responseFields", responseFields));
        }

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSearchSettingsValidateBeforeCall(String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSearchSettingsCall(responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Search Settings
     * Get site search settings list.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return SearchSettingsCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SearchSettingsCollection getSearchSettings(String responseFields) throws ApiException {
        ApiResponse<SearchSettingsCollection> localVarResp = getSearchSettingsWithHttpInfo(responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Search Settings
     * Get site search settings list.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;SearchSettingsCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchSettingsCollection> getSearchSettingsWithHttpInfo(String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getSearchSettingsValidateBeforeCall(responseFields, null);
        Type localVarReturnType = new TypeToken<SearchSettingsCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Search Settings (asynchronously)
     * Get site search settings list.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSearchSettingsAsync(String responseFields, final ApiCallback<SearchSettingsCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSearchSettingsValidateBeforeCall(responseFields, _callback);
        Type localVarReturnType = new TypeToken<SearchSettingsCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSiteSearchSettings
     * @param name  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSiteSearchSettingsCall(String name, String responseFields, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/search/{name}/sitesearchsettings"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (responseFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("responseFields", responseFields));
        }

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSiteSearchSettingsValidateBeforeCall(String name, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSiteSearchSettings(Async)");
        }
        

        okhttp3.Call localVarCall = getSiteSearchSettingsCall(name, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Site Search Settings
     * Get SiteSearchSettings for a specific SearchSettings by name.
     * @param name  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return SiteSearchSettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SiteSearchSettings getSiteSearchSettings(String name, String responseFields) throws ApiException {
        ApiResponse<SiteSearchSettings> localVarResp = getSiteSearchSettingsWithHttpInfo(name, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Site Search Settings
     * Get SiteSearchSettings for a specific SearchSettings by name.
     * @param name  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;SiteSearchSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SiteSearchSettings> getSiteSearchSettingsWithHttpInfo(String name, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getSiteSearchSettingsValidateBeforeCall(name, responseFields, null);
        Type localVarReturnType = new TypeToken<SiteSearchSettings>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Site Search Settings (asynchronously)
     * Get SiteSearchSettings for a specific SearchSettings by name.
     * @param name  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSiteSearchSettingsAsync(String name, String responseFields, final ApiCallback<SiteSearchSettings> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSiteSearchSettingsValidateBeforeCall(name, responseFields, _callback);
        Type localVarReturnType = new TypeToken<SiteSearchSettings>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSystemDefaultSettings
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSystemDefaultSettingsCall(String responseFields, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/search/settings/systemdefault";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (responseFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("responseFields", responseFields));
        }

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSystemDefaultSettingsValidateBeforeCall(String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSystemDefaultSettingsCall(responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get System Default Search Settings
     * Get the system default search settings.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return SearchSettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SearchSettings getSystemDefaultSettings(String responseFields) throws ApiException {
        ApiResponse<SearchSettings> localVarResp = getSystemDefaultSettingsWithHttpInfo(responseFields);
        return localVarResp.getData();
    }

    /**
     * Get System Default Search Settings
     * Get the system default search settings.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;SearchSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchSettings> getSystemDefaultSettingsWithHttpInfo(String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getSystemDefaultSettingsValidateBeforeCall(responseFields, null);
        Type localVarReturnType = new TypeToken<SearchSettings>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get System Default Search Settings (asynchronously)
     * Get the system default search settings.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSystemDefaultSettingsAsync(String responseFields, final ApiCallback<SearchSettings> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSystemDefaultSettingsValidateBeforeCall(responseFields, _callback);
        Type localVarReturnType = new TypeToken<SearchSettings>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateSearchSetting
     * @param name  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param searchSettings  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSearchSettingCall(String name, String responseFields, SearchSettings searchSettings, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = searchSettings;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/search/settings/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (responseFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("responseFields", responseFields));
        }

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateSearchSettingValidateBeforeCall(String name, String responseFields, SearchSettings searchSettings, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling updateSearchSetting(Async)");
        }
        

        okhttp3.Call localVarCall = updateSearchSettingCall(name, responseFields, searchSettings, _callback);
        return localVarCall;

    }

    /**
     * Update Search Settings by Name
     * Update site search settings for a specific site by name.
     * @param name  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param searchSettings  (optional)
     * @return SearchSettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SearchSettings updateSearchSetting(String name, String responseFields, SearchSettings searchSettings) throws ApiException {
        ApiResponse<SearchSettings> localVarResp = updateSearchSettingWithHttpInfo(name, responseFields, searchSettings);
        return localVarResp.getData();
    }

    /**
     * Update Search Settings by Name
     * Update site search settings for a specific site by name.
     * @param name  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param searchSettings  (optional)
     * @return ApiResponse&lt;SearchSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchSettings> updateSearchSettingWithHttpInfo(String name, String responseFields, SearchSettings searchSettings) throws ApiException {
        okhttp3.Call localVarCall = updateSearchSettingValidateBeforeCall(name, responseFields, searchSettings, null);
        Type localVarReturnType = new TypeToken<SearchSettings>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Search Settings by Name (asynchronously)
     * Update site search settings for a specific site by name.
     * @param name  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param searchSettings  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSearchSettingAsync(String name, String responseFields, SearchSettings searchSettings, final ApiCallback<SearchSettings> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateSearchSettingValidateBeforeCall(name, responseFields, searchSettings, _callback);
        Type localVarReturnType = new TypeToken<SearchSettings>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateSiteSearchSettings
     * @param name  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param siteSearchSettings  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSiteSearchSettingsCall(String name, String responseFields, SiteSearchSettings siteSearchSettings, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = siteSearchSettings;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/search/{name}/sitesearchsettings"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (responseFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("responseFields", responseFields));
        }

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateSiteSearchSettingsValidateBeforeCall(String name, String responseFields, SiteSearchSettings siteSearchSettings, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling updateSiteSearchSettings(Async)");
        }
        

        okhttp3.Call localVarCall = updateSiteSearchSettingsCall(name, responseFields, siteSearchSettings, _callback);
        return localVarCall;

    }

    /**
     * Update Site Search Settings
     * Updates the SiteSearchSettings for a specific SearchSetting by name.
     * @param name  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param siteSearchSettings  (optional)
     * @return SiteSearchSettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SiteSearchSettings updateSiteSearchSettings(String name, String responseFields, SiteSearchSettings siteSearchSettings) throws ApiException {
        ApiResponse<SiteSearchSettings> localVarResp = updateSiteSearchSettingsWithHttpInfo(name, responseFields, siteSearchSettings);
        return localVarResp.getData();
    }

    /**
     * Update Site Search Settings
     * Updates the SiteSearchSettings for a specific SearchSetting by name.
     * @param name  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param siteSearchSettings  (optional)
     * @return ApiResponse&lt;SiteSearchSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SiteSearchSettings> updateSiteSearchSettingsWithHttpInfo(String name, String responseFields, SiteSearchSettings siteSearchSettings) throws ApiException {
        okhttp3.Call localVarCall = updateSiteSearchSettingsValidateBeforeCall(name, responseFields, siteSearchSettings, null);
        Type localVarReturnType = new TypeToken<SiteSearchSettings>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Site Search Settings (asynchronously)
     * Updates the SiteSearchSettings for a specific SearchSetting by name.
     * @param name  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param siteSearchSettings  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSiteSearchSettingsAsync(String name, String responseFields, SiteSearchSettings siteSearchSettings, final ApiCallback<SiteSearchSettings> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateSiteSearchSettingsValidateBeforeCall(name, responseFields, siteSearchSettings, _callback);
        Type localVarReturnType = new TypeToken<SiteSearchSettings>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateSpellCheck
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param spellcheckUpdate  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSpellCheckCall(String responseFields, SpellcheckUpdate spellcheckUpdate, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = spellcheckUpdate;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/search/spellcheck";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (responseFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("responseFields", responseFields));
        }

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateSpellCheckValidateBeforeCall(String responseFields, SpellcheckUpdate spellcheckUpdate, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = updateSpellCheckCall(responseFields, spellcheckUpdate, _callback);
        return localVarCall;

    }

    /**
     * Update Spellcheck Settings
     * Update Spellcheck for SiteSearchSettings.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param spellcheckUpdate  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void updateSpellCheck(String responseFields, SpellcheckUpdate spellcheckUpdate) throws ApiException {
        updateSpellCheckWithHttpInfo(responseFields, spellcheckUpdate);
    }

    /**
     * Update Spellcheck Settings
     * Update Spellcheck for SiteSearchSettings.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param spellcheckUpdate  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateSpellCheckWithHttpInfo(String responseFields, SpellcheckUpdate spellcheckUpdate) throws ApiException {
        okhttp3.Call localVarCall = updateSpellCheckValidateBeforeCall(responseFields, spellcheckUpdate, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update Spellcheck Settings (asynchronously)
     * Update Spellcheck for SiteSearchSettings.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param spellcheckUpdate  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSpellCheckAsync(String responseFields, SpellcheckUpdate spellcheckUpdate, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateSpellCheckValidateBeforeCall(responseFields, spellcheckUpdate, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class Builder {
        private KiboConfiguration configuration;
        private Map<String, String> customHeaders;
        public Builder() {
        }
        public Builder withHeaders(Map<String, String> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }
        public Builder withConfig(KiboConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public SearchSettingsApi build() {
            return new SearchSettingsApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
