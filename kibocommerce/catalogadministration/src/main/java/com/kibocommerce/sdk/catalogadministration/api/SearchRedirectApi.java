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


import com.kibocommerce.sdk.catalogadministration.models.SearchRedirect;
import com.kibocommerce.sdk.catalogadministration.models.SearchRedirectCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SearchRedirectApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public SearchRedirectApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchRedirectApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public SearchRedirectApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public SearchRedirectApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public SearchRedirectApi(Builder builder) {
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
     * Build call for addSearchRedirect
     * @param fromSystemDefault  (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param searchRedirect  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addSearchRedirectCall(Boolean fromSystemDefault, String responseFields, SearchRedirect searchRedirect, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = searchRedirect;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/search/redirect";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fromSystemDefault != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromSystemDefault", fromSystemDefault));
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
    private okhttp3.Call addSearchRedirectValidateBeforeCall(Boolean fromSystemDefault, String responseFields, SearchRedirect searchRedirect, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = addSearchRedirectCall(fromSystemDefault, responseFields, searchRedirect, _callback);
        return localVarCall;

    }

    /**
     * Add Search Redirect
     * Adds a search redirect for a specific site.
     * @param fromSystemDefault  (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param searchRedirect  (optional)
     * @return SearchRedirect
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SearchRedirect addSearchRedirect(Boolean fromSystemDefault, String responseFields, SearchRedirect searchRedirect) throws ApiException {
        ApiResponse<SearchRedirect> localVarResp = addSearchRedirectWithHttpInfo(fromSystemDefault, responseFields, searchRedirect);
        return localVarResp.getData();
    }

    /**
     * Add Search Redirect
     * Adds a search redirect for a specific site.
     * @param fromSystemDefault  (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param searchRedirect  (optional)
     * @return ApiResponse&lt;SearchRedirect&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchRedirect> addSearchRedirectWithHttpInfo(Boolean fromSystemDefault, String responseFields, SearchRedirect searchRedirect) throws ApiException {
        okhttp3.Call localVarCall = addSearchRedirectValidateBeforeCall(fromSystemDefault, responseFields, searchRedirect, null);
        Type localVarReturnType = new TypeToken<SearchRedirect>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Search Redirect (asynchronously)
     * Adds a search redirect for a specific site.
     * @param fromSystemDefault  (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param searchRedirect  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addSearchRedirectAsync(Boolean fromSystemDefault, String responseFields, SearchRedirect searchRedirect, final ApiCallback<SearchRedirect> _callback) throws ApiException {

        okhttp3.Call localVarCall = addSearchRedirectValidateBeforeCall(fromSystemDefault, responseFields, searchRedirect, _callback);
        Type localVarReturnType = new TypeToken<SearchRedirect>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteSearchRedirect
     * @param redirectId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSearchRedirectCall(String redirectId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/search/redirect/{redirectId}"
            .replaceAll("\\{" + "redirectId" + "\\}", localVarApiClient.escapeString(redirectId.toString()));

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
    private okhttp3.Call deleteSearchRedirectValidateBeforeCall(String redirectId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'redirectId' is set
        if (redirectId == null) {
            throw new ApiException("Missing the required parameter 'redirectId' when calling deleteSearchRedirect(Async)");
        }
        

        okhttp3.Call localVarCall = deleteSearchRedirectCall(redirectId, _callback);
        return localVarCall;

    }

    /**
     * Delete Search Redirect
     * Deletes a specific redirect for a site.
     * @param redirectId  (required)
     * @return SearchRedirect
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SearchRedirect deleteSearchRedirect(String redirectId) throws ApiException {
        ApiResponse<SearchRedirect> localVarResp = deleteSearchRedirectWithHttpInfo(redirectId);
        return localVarResp.getData();
    }

    /**
     * Delete Search Redirect
     * Deletes a specific redirect for a site.
     * @param redirectId  (required)
     * @return ApiResponse&lt;SearchRedirect&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchRedirect> deleteSearchRedirectWithHttpInfo(String redirectId) throws ApiException {
        okhttp3.Call localVarCall = deleteSearchRedirectValidateBeforeCall(redirectId, null);
        Type localVarReturnType = new TypeToken<SearchRedirect>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete Search Redirect (asynchronously)
     * Deletes a specific redirect for a site.
     * @param redirectId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSearchRedirectAsync(String redirectId, final ApiCallback<SearchRedirect> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteSearchRedirectValidateBeforeCall(redirectId, _callback);
        Type localVarReturnType = new TypeToken<SearchRedirect>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSearchRedirect
     * @param redirectId  (required)
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
    public okhttp3.Call getSearchRedirectCall(String redirectId, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/search/redirect/{redirectId}"
            .replaceAll("\\{" + "redirectId" + "\\}", localVarApiClient.escapeString(redirectId.toString()));

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
    private okhttp3.Call getSearchRedirectValidateBeforeCall(String redirectId, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'redirectId' is set
        if (redirectId == null) {
            throw new ApiException("Missing the required parameter 'redirectId' when calling getSearchRedirect(Async)");
        }
        

        okhttp3.Call localVarCall = getSearchRedirectCall(redirectId, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Search Redirect
     * Get search redirect by redirect id.
     * @param redirectId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return SearchRedirect
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SearchRedirect getSearchRedirect(String redirectId, String responseFields) throws ApiException {
        ApiResponse<SearchRedirect> localVarResp = getSearchRedirectWithHttpInfo(redirectId, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Search Redirect
     * Get search redirect by redirect id.
     * @param redirectId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;SearchRedirect&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchRedirect> getSearchRedirectWithHttpInfo(String redirectId, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getSearchRedirectValidateBeforeCall(redirectId, responseFields, null);
        Type localVarReturnType = new TypeToken<SearchRedirect>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Search Redirect (asynchronously)
     * Get search redirect by redirect id.
     * @param redirectId  (required)
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
    public okhttp3.Call getSearchRedirectAsync(String redirectId, String responseFields, final ApiCallback<SearchRedirect> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSearchRedirectValidateBeforeCall(redirectId, responseFields, _callback);
        Type localVarReturnType = new TypeToken<SearchRedirect>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSearchRedirects
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
    public okhttp3.Call getSearchRedirectsCall(String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/search/redirect";

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
    private okhttp3.Call getSearchRedirectsValidateBeforeCall(String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSearchRedirectsCall(responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Search Redirects
     * Get search redirect list.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return SearchRedirectCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SearchRedirectCollection getSearchRedirects(String responseFields) throws ApiException {
        ApiResponse<SearchRedirectCollection> localVarResp = getSearchRedirectsWithHttpInfo(responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Search Redirects
     * Get search redirect list.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;SearchRedirectCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchRedirectCollection> getSearchRedirectsWithHttpInfo(String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getSearchRedirectsValidateBeforeCall(responseFields, null);
        Type localVarReturnType = new TypeToken<SearchRedirectCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Search Redirects (asynchronously)
     * Get search redirect list.
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
    public okhttp3.Call getSearchRedirectsAsync(String responseFields, final ApiCallback<SearchRedirectCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSearchRedirectsValidateBeforeCall(responseFields, _callback);
        Type localVarReturnType = new TypeToken<SearchRedirectCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateSearchRedirect
     * @param redirectId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param searchRedirect  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSearchRedirectCall(String redirectId, String responseFields, SearchRedirect searchRedirect, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = searchRedirect;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/search/redirect/{redirectId}"
            .replaceAll("\\{" + "redirectId" + "\\}", localVarApiClient.escapeString(redirectId.toString()));

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
    private okhttp3.Call updateSearchRedirectValidateBeforeCall(String redirectId, String responseFields, SearchRedirect searchRedirect, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'redirectId' is set
        if (redirectId == null) {
            throw new ApiException("Missing the required parameter 'redirectId' when calling updateSearchRedirect(Async)");
        }
        

        okhttp3.Call localVarCall = updateSearchRedirectCall(redirectId, responseFields, searchRedirect, _callback);
        return localVarCall;

    }

    /**
     * Update Search Redirect
     * Update a search redirect for a specific site.
     * @param redirectId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param searchRedirect  (optional)
     * @return SearchRedirect
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SearchRedirect updateSearchRedirect(String redirectId, String responseFields, SearchRedirect searchRedirect) throws ApiException {
        ApiResponse<SearchRedirect> localVarResp = updateSearchRedirectWithHttpInfo(redirectId, responseFields, searchRedirect);
        return localVarResp.getData();
    }

    /**
     * Update Search Redirect
     * Update a search redirect for a specific site.
     * @param redirectId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param searchRedirect  (optional)
     * @return ApiResponse&lt;SearchRedirect&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchRedirect> updateSearchRedirectWithHttpInfo(String redirectId, String responseFields, SearchRedirect searchRedirect) throws ApiException {
        okhttp3.Call localVarCall = updateSearchRedirectValidateBeforeCall(redirectId, responseFields, searchRedirect, null);
        Type localVarReturnType = new TypeToken<SearchRedirect>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Search Redirect (asynchronously)
     * Update a search redirect for a specific site.
     * @param redirectId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param searchRedirect  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSearchRedirectAsync(String redirectId, String responseFields, SearchRedirect searchRedirect, final ApiCallback<SearchRedirect> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateSearchRedirectValidateBeforeCall(redirectId, responseFields, searchRedirect, _callback);
        Type localVarReturnType = new TypeToken<SearchRedirect>(){}.getType();
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
        public SearchRedirectApi build() {
            return new SearchRedirectApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
