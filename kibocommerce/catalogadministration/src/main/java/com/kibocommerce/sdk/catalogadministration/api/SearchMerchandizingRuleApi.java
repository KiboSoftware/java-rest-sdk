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


import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsSearchMerchandizingRule;
import com.kibocommerce.sdk.catalogadministration.models.SearchMerchandizingRuleCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SearchMerchandizingRuleApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public SearchMerchandizingRuleApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchMerchandizingRuleApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public SearchMerchandizingRuleApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public SearchMerchandizingRuleApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public SearchMerchandizingRuleApi(Builder builder) {
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
     * Build call for cloneSearchMerchandizingRule
     * @param code  (required)
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
    public okhttp3.Call cloneSearchMerchandizingRuleCall(String code, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/searchmerchandizingrules/{code}/clone"
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

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
    private okhttp3.Call cloneSearchMerchandizingRuleValidateBeforeCall(String code, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling cloneSearchMerchandizingRule(Async)");
        }
        

        okhttp3.Call localVarCall = cloneSearchMerchandizingRuleCall(code, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Clone Search Merchandizing Rule
     * Clones a search merchandizing rule.
     * @param code  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsSearchMerchandizingRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsSearchMerchandizingRule cloneSearchMerchandizingRule(String code, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsSearchMerchandizingRule> localVarResp = cloneSearchMerchandizingRuleWithHttpInfo(code, responseFields);
        return localVarResp.getData();
    }

    /**
     * Clone Search Merchandizing Rule
     * Clones a search merchandizing rule.
     * @param code  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsSearchMerchandizingRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsSearchMerchandizingRule> cloneSearchMerchandizingRuleWithHttpInfo(String code, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = cloneSearchMerchandizingRuleValidateBeforeCall(code, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsSearchMerchandizingRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Clone Search Merchandizing Rule (asynchronously)
     * Clones a search merchandizing rule.
     * @param code  (required)
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
    public okhttp3.Call cloneSearchMerchandizingRuleAsync(String code, String responseFields, final ApiCallback<CatalogAdminsSearchMerchandizingRule> _callback) throws ApiException {

        okhttp3.Call localVarCall = cloneSearchMerchandizingRuleValidateBeforeCall(code, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsSearchMerchandizingRule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createSearchMerchandizingRule
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsSearchMerchandizingRule  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSearchMerchandizingRuleCall(String responseFields, CatalogAdminsSearchMerchandizingRule catalogAdminsSearchMerchandizingRule, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsSearchMerchandizingRule;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/searchmerchandizingrules";

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
    private okhttp3.Call createSearchMerchandizingRuleValidateBeforeCall(String responseFields, CatalogAdminsSearchMerchandizingRule catalogAdminsSearchMerchandizingRule, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createSearchMerchandizingRuleCall(responseFields, catalogAdminsSearchMerchandizingRule, _callback);
        return localVarCall;

    }

    /**
     * Create Search Merchandizing Rule
     * Create a new search merchandizing rule.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsSearchMerchandizingRule  (optional)
     * @return CatalogAdminsSearchMerchandizingRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsSearchMerchandizingRule createSearchMerchandizingRule(String responseFields, CatalogAdminsSearchMerchandizingRule catalogAdminsSearchMerchandizingRule) throws ApiException {
        ApiResponse<CatalogAdminsSearchMerchandizingRule> localVarResp = createSearchMerchandizingRuleWithHttpInfo(responseFields, catalogAdminsSearchMerchandizingRule);
        return localVarResp.getData();
    }

    /**
     * Create Search Merchandizing Rule
     * Create a new search merchandizing rule.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsSearchMerchandizingRule  (optional)
     * @return ApiResponse&lt;CatalogAdminsSearchMerchandizingRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsSearchMerchandizingRule> createSearchMerchandizingRuleWithHttpInfo(String responseFields, CatalogAdminsSearchMerchandizingRule catalogAdminsSearchMerchandizingRule) throws ApiException {
        okhttp3.Call localVarCall = createSearchMerchandizingRuleValidateBeforeCall(responseFields, catalogAdminsSearchMerchandizingRule, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsSearchMerchandizingRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Search Merchandizing Rule (asynchronously)
     * Create a new search merchandizing rule.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsSearchMerchandizingRule  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSearchMerchandizingRuleAsync(String responseFields, CatalogAdminsSearchMerchandizingRule catalogAdminsSearchMerchandizingRule, final ApiCallback<CatalogAdminsSearchMerchandizingRule> _callback) throws ApiException {

        okhttp3.Call localVarCall = createSearchMerchandizingRuleValidateBeforeCall(responseFields, catalogAdminsSearchMerchandizingRule, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsSearchMerchandizingRule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteSearchMerchandizingRule
     * @param code  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSearchMerchandizingRuleCall(String code, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/searchmerchandizingrules/{code}"
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

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
    private okhttp3.Call deleteSearchMerchandizingRuleValidateBeforeCall(String code, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteSearchMerchandizingRule(Async)");
        }
        

        okhttp3.Call localVarCall = deleteSearchMerchandizingRuleCall(code, _callback);
        return localVarCall;

    }

    /**
     * Delete Search Merchandizing Rule
     * Deletes a search merchandizing rule.
     * @param code  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteSearchMerchandizingRule(String code) throws ApiException {
        deleteSearchMerchandizingRuleWithHttpInfo(code);
    }

    /**
     * Delete Search Merchandizing Rule
     * Deletes a search merchandizing rule.
     * @param code  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteSearchMerchandizingRuleWithHttpInfo(String code) throws ApiException {
        okhttp3.Call localVarCall = deleteSearchMerchandizingRuleValidateBeforeCall(code, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Search Merchandizing Rule (asynchronously)
     * Deletes a search merchandizing rule.
     * @param code  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSearchMerchandizingRuleAsync(String code, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteSearchMerchandizingRuleValidateBeforeCall(code, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSearchMerchandizingRule
     * @param code  (required)
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
    public okhttp3.Call getSearchMerchandizingRuleCall(String code, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/searchmerchandizingrules/{code}"
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

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
    private okhttp3.Call getSearchMerchandizingRuleValidateBeforeCall(String code, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getSearchMerchandizingRule(Async)");
        }
        

        okhttp3.Call localVarCall = getSearchMerchandizingRuleCall(code, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Search Merchandizing Rule
     * Retrieves a search merchandizing rule based on its code.
     * @param code  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsSearchMerchandizingRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsSearchMerchandizingRule getSearchMerchandizingRule(String code, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsSearchMerchandizingRule> localVarResp = getSearchMerchandizingRuleWithHttpInfo(code, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Search Merchandizing Rule
     * Retrieves a search merchandizing rule based on its code.
     * @param code  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsSearchMerchandizingRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsSearchMerchandizingRule> getSearchMerchandizingRuleWithHttpInfo(String code, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getSearchMerchandizingRuleValidateBeforeCall(code, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsSearchMerchandizingRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Search Merchandizing Rule (asynchronously)
     * Retrieves a search merchandizing rule based on its code.
     * @param code  (required)
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
    public okhttp3.Call getSearchMerchandizingRuleAsync(String code, String responseFields, final ApiCallback<CatalogAdminsSearchMerchandizingRule> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSearchMerchandizingRuleValidateBeforeCall(code, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsSearchMerchandizingRule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSearchMerchandizingRules
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param responseGroups  (optional)
     * @param q  (optional)
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
    public okhttp3.Call getSearchMerchandizingRulesCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String q, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/searchmerchandizingrules";

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

        if (responseGroups != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("responseGroups", responseGroups));
        }

        if (q != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("q", q));
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
    private okhttp3.Call getSearchMerchandizingRulesValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String q, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSearchMerchandizingRulesCall(startIndex, pageSize, sortBy, filter, responseGroups, q, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Search Merchandizing Rules
     * Retrieve a list of all search merchandizing rules. You can filter this query by CategoryCode, which supports an EQ (equals) filter with the syntax /catalog/admin/searchmerchandizingrules/?filter&#x3D;categorycode eq AAA
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param responseGroups  (optional)
     * @param q  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return SearchMerchandizingRuleCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SearchMerchandizingRuleCollection getSearchMerchandizingRules(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String q, String responseFields) throws ApiException {
        ApiResponse<SearchMerchandizingRuleCollection> localVarResp = getSearchMerchandizingRulesWithHttpInfo(startIndex, pageSize, sortBy, filter, responseGroups, q, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Search Merchandizing Rules
     * Retrieve a list of all search merchandizing rules. You can filter this query by CategoryCode, which supports an EQ (equals) filter with the syntax /catalog/admin/searchmerchandizingrules/?filter&#x3D;categorycode eq AAA
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param responseGroups  (optional)
     * @param q  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;SearchMerchandizingRuleCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchMerchandizingRuleCollection> getSearchMerchandizingRulesWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String q, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getSearchMerchandizingRulesValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseGroups, q, responseFields, null);
        Type localVarReturnType = new TypeToken<SearchMerchandizingRuleCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Search Merchandizing Rules (asynchronously)
     * Retrieve a list of all search merchandizing rules. You can filter this query by CategoryCode, which supports an EQ (equals) filter with the syntax /catalog/admin/searchmerchandizingrules/?filter&#x3D;categorycode eq AAA
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param responseGroups  (optional)
     * @param q  (optional)
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
    public okhttp3.Call getSearchMerchandizingRulesAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String q, String responseFields, final ApiCallback<SearchMerchandizingRuleCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSearchMerchandizingRulesValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseGroups, q, responseFields, _callback);
        Type localVarReturnType = new TypeToken<SearchMerchandizingRuleCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateSearchMerchandizingRule
     * @param code  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsSearchMerchandizingRule  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSearchMerchandizingRuleCall(String code, String responseFields, CatalogAdminsSearchMerchandizingRule catalogAdminsSearchMerchandizingRule, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsSearchMerchandizingRule;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/searchmerchandizingrules/{code}"
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

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
    private okhttp3.Call updateSearchMerchandizingRuleValidateBeforeCall(String code, String responseFields, CatalogAdminsSearchMerchandizingRule catalogAdminsSearchMerchandizingRule, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling updateSearchMerchandizingRule(Async)");
        }
        

        okhttp3.Call localVarCall = updateSearchMerchandizingRuleCall(code, responseFields, catalogAdminsSearchMerchandizingRule, _callback);
        return localVarCall;

    }

    /**
     * Update Search Merchandizing Rule
     * Updates an existing search merchandizing rule.
     * @param code  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsSearchMerchandizingRule  (optional)
     * @return CatalogAdminsSearchMerchandizingRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsSearchMerchandizingRule updateSearchMerchandizingRule(String code, String responseFields, CatalogAdminsSearchMerchandizingRule catalogAdminsSearchMerchandizingRule) throws ApiException {
        ApiResponse<CatalogAdminsSearchMerchandizingRule> localVarResp = updateSearchMerchandizingRuleWithHttpInfo(code, responseFields, catalogAdminsSearchMerchandizingRule);
        return localVarResp.getData();
    }

    /**
     * Update Search Merchandizing Rule
     * Updates an existing search merchandizing rule.
     * @param code  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsSearchMerchandizingRule  (optional)
     * @return ApiResponse&lt;CatalogAdminsSearchMerchandizingRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsSearchMerchandizingRule> updateSearchMerchandizingRuleWithHttpInfo(String code, String responseFields, CatalogAdminsSearchMerchandizingRule catalogAdminsSearchMerchandizingRule) throws ApiException {
        okhttp3.Call localVarCall = updateSearchMerchandizingRuleValidateBeforeCall(code, responseFields, catalogAdminsSearchMerchandizingRule, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsSearchMerchandizingRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Search Merchandizing Rule (asynchronously)
     * Updates an existing search merchandizing rule.
     * @param code  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsSearchMerchandizingRule  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSearchMerchandizingRuleAsync(String code, String responseFields, CatalogAdminsSearchMerchandizingRule catalogAdminsSearchMerchandizingRule, final ApiCallback<CatalogAdminsSearchMerchandizingRule> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateSearchMerchandizingRuleValidateBeforeCall(code, responseFields, catalogAdminsSearchMerchandizingRule, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsSearchMerchandizingRule>(){}.getType();
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
        public SearchMerchandizingRuleApi build() {
            return new SearchMerchandizingRuleApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
