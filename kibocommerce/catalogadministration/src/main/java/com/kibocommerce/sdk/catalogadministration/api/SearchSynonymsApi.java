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


import com.kibocommerce.sdk.catalogadministration.models.SynonymDefinition;
import com.kibocommerce.sdk.catalogadministration.models.SynonymDefinitionCollection;
import com.kibocommerce.sdk.catalogadministration.models.SynonymDefinitionPagedCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SearchSynonymsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public SearchSynonymsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchSynonymsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public SearchSynonymsApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public SearchSynonymsApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public SearchSynonymsApi(Builder builder) {
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
     * Build call for addSynonymDefinition
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param synonymDefinition  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addSynonymDefinitionCall(String responseFields, SynonymDefinition synonymDefinition, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = synonymDefinition;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/search/synonyms";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addSynonymDefinitionValidateBeforeCall(String responseFields, SynonymDefinition synonymDefinition, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = addSynonymDefinitionCall(responseFields, synonymDefinition, _callback);
        return localVarCall;

    }

    /**
     * Add Synonym Definition
     * Add synonym definition
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param synonymDefinition  (optional)
     * @return SynonymDefinition
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SynonymDefinition addSynonymDefinition(String responseFields, SynonymDefinition synonymDefinition) throws ApiException {
        ApiResponse<SynonymDefinition> localVarResp = addSynonymDefinitionWithHttpInfo(responseFields, synonymDefinition);
        return localVarResp.getData();
    }

    /**
     * Add Synonym Definition
     * Add synonym definition
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param synonymDefinition  (optional)
     * @return ApiResponse&lt;SynonymDefinition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SynonymDefinition> addSynonymDefinitionWithHttpInfo(String responseFields, SynonymDefinition synonymDefinition) throws ApiException {
        okhttp3.Call localVarCall = addSynonymDefinitionValidateBeforeCall(responseFields, synonymDefinition, null);
        Type localVarReturnType = new TypeToken<SynonymDefinition>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Synonym Definition (asynchronously)
     * Add synonym definition
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param synonymDefinition  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addSynonymDefinitionAsync(String responseFields, SynonymDefinition synonymDefinition, final ApiCallback<SynonymDefinition> _callback) throws ApiException {

        okhttp3.Call localVarCall = addSynonymDefinitionValidateBeforeCall(responseFields, synonymDefinition, _callback);
        Type localVarReturnType = new TypeToken<SynonymDefinition>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteSynonymDefinition
     * @param synonymId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSynonymDefinitionCall(Integer synonymId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/search/synonyms/{synonymId}"
            .replaceAll("\\{" + "synonymId" + "\\}", localVarApiClient.escapeString(synonymId.toString()));

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
    private okhttp3.Call deleteSynonymDefinitionValidateBeforeCall(Integer synonymId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'synonymId' is set
        if (synonymId == null) {
            throw new ApiException("Missing the required parameter 'synonymId' when calling deleteSynonymDefinition(Async)");
        }
        

        okhttp3.Call localVarCall = deleteSynonymDefinitionCall(synonymId, _callback);
        return localVarCall;

    }

    /**
     * Delete Synonym Definition
     * Delete a specific synonym definition by ID.
     * @param synonymId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteSynonymDefinition(Integer synonymId) throws ApiException {
        deleteSynonymDefinitionWithHttpInfo(synonymId);
    }

    /**
     * Delete Synonym Definition
     * Delete a specific synonym definition by ID.
     * @param synonymId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteSynonymDefinitionWithHttpInfo(Integer synonymId) throws ApiException {
        okhttp3.Call localVarCall = deleteSynonymDefinitionValidateBeforeCall(synonymId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Synonym Definition (asynchronously)
     * Delete a specific synonym definition by ID.
     * @param synonymId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSynonymDefinitionAsync(Integer synonymId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteSynonymDefinitionValidateBeforeCall(synonymId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAllSynonymDefinitionCollectionsForMasterCatalog
     * @param languageCode  (required)
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
    public okhttp3.Call getAllSynonymDefinitionCollectionsForMasterCatalogCall(String languageCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/search/master-catalog-synonym-definitions/{languageCode}"
            .replaceAll("\\{" + "languageCode" + "\\}", localVarApiClient.escapeString(languageCode.toString()));

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
    private okhttp3.Call getAllSynonymDefinitionCollectionsForMasterCatalogValidateBeforeCall(String languageCode, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'languageCode' is set
        if (languageCode == null) {
            throw new ApiException("Missing the required parameter 'languageCode' when calling getAllSynonymDefinitionCollectionsForMasterCatalog(Async)");
        }
        

        okhttp3.Call localVarCall = getAllSynonymDefinitionCollectionsForMasterCatalogCall(languageCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Synonym Definition Collections
     * Get synonym definition collections.
     * @param languageCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return SynonymDefinitionCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SynonymDefinitionCollection getAllSynonymDefinitionCollectionsForMasterCatalog(String languageCode, String responseFields) throws ApiException {
        ApiResponse<SynonymDefinitionCollection> localVarResp = getAllSynonymDefinitionCollectionsForMasterCatalogWithHttpInfo(languageCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Synonym Definition Collections
     * Get synonym definition collections.
     * @param languageCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;SynonymDefinitionCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SynonymDefinitionCollection> getAllSynonymDefinitionCollectionsForMasterCatalogWithHttpInfo(String languageCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getAllSynonymDefinitionCollectionsForMasterCatalogValidateBeforeCall(languageCode, responseFields, null);
        Type localVarReturnType = new TypeToken<SynonymDefinitionCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Synonym Definition Collections (asynchronously)
     * Get synonym definition collections.
     * @param languageCode  (required)
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
    public okhttp3.Call getAllSynonymDefinitionCollectionsForMasterCatalogAsync(String languageCode, String responseFields, final ApiCallback<SynonymDefinitionCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllSynonymDefinitionCollectionsForMasterCatalogValidateBeforeCall(languageCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<SynonymDefinitionCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSynonymDefinition
     * @param synonymId  (required)
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
    public okhttp3.Call getSynonymDefinitionCall(Integer synonymId, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/search/synonyms/{synonymId}"
            .replaceAll("\\{" + "synonymId" + "\\}", localVarApiClient.escapeString(synonymId.toString()));

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
    private okhttp3.Call getSynonymDefinitionValidateBeforeCall(Integer synonymId, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'synonymId' is set
        if (synonymId == null) {
            throw new ApiException("Missing the required parameter 'synonymId' when calling getSynonymDefinition(Async)");
        }
        

        okhttp3.Call localVarCall = getSynonymDefinitionCall(synonymId, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Synonym Definition
     * Get a specific synonym definition by ID.
     * @param synonymId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return SynonymDefinition
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SynonymDefinition getSynonymDefinition(Integer synonymId, String responseFields) throws ApiException {
        ApiResponse<SynonymDefinition> localVarResp = getSynonymDefinitionWithHttpInfo(synonymId, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Synonym Definition
     * Get a specific synonym definition by ID.
     * @param synonymId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;SynonymDefinition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SynonymDefinition> getSynonymDefinitionWithHttpInfo(Integer synonymId, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getSynonymDefinitionValidateBeforeCall(synonymId, responseFields, null);
        Type localVarReturnType = new TypeToken<SynonymDefinition>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Synonym Definition (asynchronously)
     * Get a specific synonym definition by ID.
     * @param synonymId  (required)
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
    public okhttp3.Call getSynonymDefinitionAsync(Integer synonymId, String responseFields, final ApiCallback<SynonymDefinition> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSynonymDefinitionValidateBeforeCall(synonymId, responseFields, _callback);
        Type localVarReturnType = new TypeToken<SynonymDefinition>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSynonymDefinitionCollection
     * @param localeCode  (required)
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
    public okhttp3.Call getSynonymDefinitionCollectionCall(String localeCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/search/synonym-definitions/{localeCode}"
            .replaceAll("\\{" + "localeCode" + "\\}", localVarApiClient.escapeString(localeCode.toString()));

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
    private okhttp3.Call getSynonymDefinitionCollectionValidateBeforeCall(String localeCode, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'localeCode' is set
        if (localeCode == null) {
            throw new ApiException("Missing the required parameter 'localeCode' when calling getSynonymDefinitionCollection(Async)");
        }
        

        okhttp3.Call localVarCall = getSynonymDefinitionCollectionCall(localeCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Synonym Definition Collection
     * Get synonym definition collection.
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return SynonymDefinitionCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SynonymDefinitionCollection getSynonymDefinitionCollection(String localeCode, String responseFields) throws ApiException {
        ApiResponse<SynonymDefinitionCollection> localVarResp = getSynonymDefinitionCollectionWithHttpInfo(localeCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Synonym Definition Collection
     * Get synonym definition collection.
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;SynonymDefinitionCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SynonymDefinitionCollection> getSynonymDefinitionCollectionWithHttpInfo(String localeCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getSynonymDefinitionCollectionValidateBeforeCall(localeCode, responseFields, null);
        Type localVarReturnType = new TypeToken<SynonymDefinitionCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Synonym Definition Collection (asynchronously)
     * Get synonym definition collection.
     * @param localeCode  (required)
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
    public okhttp3.Call getSynonymDefinitionCollectionAsync(String localeCode, String responseFields, final ApiCallback<SynonymDefinitionCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSynonymDefinitionCollectionValidateBeforeCall(localeCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<SynonymDefinitionCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSynonymDefinitions
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
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
    public okhttp3.Call getSynonymDefinitionsCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/search/synonyms";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startIndex != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startIndex", startIndex));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        if (sortBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortBy", sortBy));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSynonymDefinitionsValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSynonymDefinitionsCall(startIndex, pageSize, sortBy, filter, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Synonym Definitions
     * Get synonym definitions.
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return SynonymDefinitionPagedCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SynonymDefinitionPagedCollection getSynonymDefinitions(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws ApiException {
        ApiResponse<SynonymDefinitionPagedCollection> localVarResp = getSynonymDefinitionsWithHttpInfo(startIndex, pageSize, sortBy, filter, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Synonym Definitions
     * Get synonym definitions.
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;SynonymDefinitionPagedCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SynonymDefinitionPagedCollection> getSynonymDefinitionsWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getSynonymDefinitionsValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseFields, null);
        Type localVarReturnType = new TypeToken<SynonymDefinitionPagedCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Synonym Definitions (asynchronously)
     * Get synonym definitions.
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
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
    public okhttp3.Call getSynonymDefinitionsAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, final ApiCallback<SynonymDefinitionPagedCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSynonymDefinitionsValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseFields, _callback);
        Type localVarReturnType = new TypeToken<SynonymDefinitionPagedCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateSynonymDefinition
     * @param synonymId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param synonymDefinition  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSynonymDefinitionCall(Integer synonymId, String responseFields, SynonymDefinition synonymDefinition, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = synonymDefinition;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/search/synonyms/{synonymId}"
            .replaceAll("\\{" + "synonymId" + "\\}", localVarApiClient.escapeString(synonymId.toString()));

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
    private okhttp3.Call updateSynonymDefinitionValidateBeforeCall(Integer synonymId, String responseFields, SynonymDefinition synonymDefinition, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'synonymId' is set
        if (synonymId == null) {
            throw new ApiException("Missing the required parameter 'synonymId' when calling updateSynonymDefinition(Async)");
        }
        

        okhttp3.Call localVarCall = updateSynonymDefinitionCall(synonymId, responseFields, synonymDefinition, _callback);
        return localVarCall;

    }

    /**
     * Update Synonym Definition
     * Update a specific synonym definition by ID.
     * @param synonymId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param synonymDefinition  (optional)
     * @return SynonymDefinition
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SynonymDefinition updateSynonymDefinition(Integer synonymId, String responseFields, SynonymDefinition synonymDefinition) throws ApiException {
        ApiResponse<SynonymDefinition> localVarResp = updateSynonymDefinitionWithHttpInfo(synonymId, responseFields, synonymDefinition);
        return localVarResp.getData();
    }

    /**
     * Update Synonym Definition
     * Update a specific synonym definition by ID.
     * @param synonymId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param synonymDefinition  (optional)
     * @return ApiResponse&lt;SynonymDefinition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SynonymDefinition> updateSynonymDefinitionWithHttpInfo(Integer synonymId, String responseFields, SynonymDefinition synonymDefinition) throws ApiException {
        okhttp3.Call localVarCall = updateSynonymDefinitionValidateBeforeCall(synonymId, responseFields, synonymDefinition, null);
        Type localVarReturnType = new TypeToken<SynonymDefinition>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Synonym Definition (asynchronously)
     * Update a specific synonym definition by ID.
     * @param synonymId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param synonymDefinition  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSynonymDefinitionAsync(Integer synonymId, String responseFields, SynonymDefinition synonymDefinition, final ApiCallback<SynonymDefinition> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateSynonymDefinitionValidateBeforeCall(synonymId, responseFields, synonymDefinition, _callback);
        Type localVarReturnType = new TypeToken<SynonymDefinition>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateSynonymDefinitionCollection
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param synonymDefinitionCollection  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSynonymDefinitionCollectionCall(String localeCode, String responseFields, SynonymDefinitionCollection synonymDefinitionCollection, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = synonymDefinitionCollection;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/search/synonym-definitions/{localeCode}"
            .replaceAll("\\{" + "localeCode" + "\\}", localVarApiClient.escapeString(localeCode.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateSynonymDefinitionCollectionValidateBeforeCall(String localeCode, String responseFields, SynonymDefinitionCollection synonymDefinitionCollection, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'localeCode' is set
        if (localeCode == null) {
            throw new ApiException("Missing the required parameter 'localeCode' when calling updateSynonymDefinitionCollection(Async)");
        }
        

        okhttp3.Call localVarCall = updateSynonymDefinitionCollectionCall(localeCode, responseFields, synonymDefinitionCollection, _callback);
        return localVarCall;

    }

    /**
     * Add Synonym Definition Collection
     * Add or update a synonym definition collection.
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param synonymDefinitionCollection  (optional)
     * @return SynonymDefinitionCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SynonymDefinitionCollection updateSynonymDefinitionCollection(String localeCode, String responseFields, SynonymDefinitionCollection synonymDefinitionCollection) throws ApiException {
        ApiResponse<SynonymDefinitionCollection> localVarResp = updateSynonymDefinitionCollectionWithHttpInfo(localeCode, responseFields, synonymDefinitionCollection);
        return localVarResp.getData();
    }

    /**
     * Add Synonym Definition Collection
     * Add or update a synonym definition collection.
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param synonymDefinitionCollection  (optional)
     * @return ApiResponse&lt;SynonymDefinitionCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SynonymDefinitionCollection> updateSynonymDefinitionCollectionWithHttpInfo(String localeCode, String responseFields, SynonymDefinitionCollection synonymDefinitionCollection) throws ApiException {
        okhttp3.Call localVarCall = updateSynonymDefinitionCollectionValidateBeforeCall(localeCode, responseFields, synonymDefinitionCollection, null);
        Type localVarReturnType = new TypeToken<SynonymDefinitionCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Synonym Definition Collection (asynchronously)
     * Add or update a synonym definition collection.
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param synonymDefinitionCollection  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSynonymDefinitionCollectionAsync(String localeCode, String responseFields, SynonymDefinitionCollection synonymDefinitionCollection, final ApiCallback<SynonymDefinitionCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateSynonymDefinitionCollectionValidateBeforeCall(localeCode, responseFields, synonymDefinitionCollection, _callback);
        Type localVarReturnType = new TypeToken<SynonymDefinitionCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
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
        public SearchSynonymsApi build() {
            return new SearchSynonymsApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
