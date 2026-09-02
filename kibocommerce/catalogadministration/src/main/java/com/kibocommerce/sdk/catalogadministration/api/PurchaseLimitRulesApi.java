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


import com.kibocommerce.sdk.catalogadministration.models.PurchaseLimitRule;
import com.kibocommerce.sdk.catalogadministration.models.PurchaseLimitRuleCollection;
import com.kibocommerce.sdk.catalogadministration.models.UpdateRankRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PurchaseLimitRulesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public PurchaseLimitRulesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PurchaseLimitRulesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public PurchaseLimitRulesApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public PurchaseLimitRulesApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public PurchaseLimitRulesApi(Builder builder) {
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
     * Build call for createPurchaseLimitRule
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param purchaseLimitRule  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPurchaseLimitRuleCall(String responseFields, PurchaseLimitRule purchaseLimitRule, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = purchaseLimitRule;

        // create path and map variables
        String localVarPath = "/commerce/rules/purchaselimit";

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
    private okhttp3.Call createPurchaseLimitRuleValidateBeforeCall(String responseFields, PurchaseLimitRule purchaseLimitRule, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createPurchaseLimitRuleCall(responseFields, purchaseLimitRule, _callback);
        return localVarCall;

    }

    /**
     * Create Purchase Limit Rule
     * Creates a new &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt;.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param purchaseLimitRule  (optional)
     * @return PurchaseLimitRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PurchaseLimitRule createPurchaseLimitRule(String responseFields, PurchaseLimitRule purchaseLimitRule) throws ApiException {
        ApiResponse<PurchaseLimitRule> localVarResp = createPurchaseLimitRuleWithHttpInfo(responseFields, purchaseLimitRule);
        return localVarResp.getData();
    }

    /**
     * Create Purchase Limit Rule
     * Creates a new &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt;.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param purchaseLimitRule  (optional)
     * @return ApiResponse&lt;PurchaseLimitRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PurchaseLimitRule> createPurchaseLimitRuleWithHttpInfo(String responseFields, PurchaseLimitRule purchaseLimitRule) throws ApiException {
        okhttp3.Call localVarCall = createPurchaseLimitRuleValidateBeforeCall(responseFields, purchaseLimitRule, null);
        Type localVarReturnType = new TypeToken<PurchaseLimitRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Purchase Limit Rule (asynchronously)
     * Creates a new &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt;.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param purchaseLimitRule  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPurchaseLimitRuleAsync(String responseFields, PurchaseLimitRule purchaseLimitRule, final ApiCallback<PurchaseLimitRule> _callback) throws ApiException {

        okhttp3.Call localVarCall = createPurchaseLimitRuleValidateBeforeCall(responseFields, purchaseLimitRule, _callback);
        Type localVarReturnType = new TypeToken<PurchaseLimitRule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePurchaseLimitRule
     * @param code The code of the purchase limit rule to delete. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePurchaseLimitRuleCall(String code, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/rules/purchaselimit/{code}"
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
    private okhttp3.Call deletePurchaseLimitRuleValidateBeforeCall(String code, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deletePurchaseLimitRule(Async)");
        }
        

        okhttp3.Call localVarCall = deletePurchaseLimitRuleCall(code, _callback);
        return localVarCall;

    }

    /**
     * Delete Purchase Limit Rule
     * Deletes a &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt; by code.
     * @param code The code of the purchase limit rule to delete. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deletePurchaseLimitRule(String code) throws ApiException {
        deletePurchaseLimitRuleWithHttpInfo(code);
    }

    /**
     * Delete Purchase Limit Rule
     * Deletes a &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt; by code.
     * @param code The code of the purchase limit rule to delete. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deletePurchaseLimitRuleWithHttpInfo(String code) throws ApiException {
        okhttp3.Call localVarCall = deletePurchaseLimitRuleValidateBeforeCall(code, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Purchase Limit Rule (asynchronously)
     * Deletes a &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt; by code.
     * @param code The code of the purchase limit rule to delete. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePurchaseLimitRuleAsync(String code, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePurchaseLimitRuleValidateBeforeCall(code, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPurchaseLimitRule
     * @param code The code of the purchase limit rule. (required)
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
    public okhttp3.Call getPurchaseLimitRuleCall(String code, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/rules/purchaselimit/{code}"
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
    private okhttp3.Call getPurchaseLimitRuleValidateBeforeCall(String code, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPurchaseLimitRule(Async)");
        }
        

        okhttp3.Call localVarCall = getPurchaseLimitRuleCall(code, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Purchase Limit Rule by Code
     * Gets &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt; details by code.
     * @param code The code of the purchase limit rule. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return PurchaseLimitRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PurchaseLimitRule getPurchaseLimitRule(String code, String responseFields) throws ApiException {
        ApiResponse<PurchaseLimitRule> localVarResp = getPurchaseLimitRuleWithHttpInfo(code, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Purchase Limit Rule by Code
     * Gets &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt; details by code.
     * @param code The code of the purchase limit rule. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;PurchaseLimitRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PurchaseLimitRule> getPurchaseLimitRuleWithHttpInfo(String code, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getPurchaseLimitRuleValidateBeforeCall(code, responseFields, null);
        Type localVarReturnType = new TypeToken<PurchaseLimitRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Purchase Limit Rule by Code (asynchronously)
     * Gets &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt; details by code.
     * @param code The code of the purchase limit rule. (required)
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
    public okhttp3.Call getPurchaseLimitRuleAsync(String code, String responseFields, final ApiCallback<PurchaseLimitRule> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPurchaseLimitRuleValidateBeforeCall(code, responseFields, _callback);
        Type localVarReturnType = new TypeToken<PurchaseLimitRule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPurchaseLimitRules
     * @param startIndex The start index for pagination. (optional, default to 0)
     * @param pageSize The page size for pagination. (optional, default to 0)
     * @param sortBy The sort by parameter. (optional)
     * @param filter The filter parameter. (optional)
     * @param responseGroups The response groups parameter. (optional)
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
    public okhttp3.Call getPurchaseLimitRulesCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/rules/purchaselimit";

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
    private okhttp3.Call getPurchaseLimitRulesValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getPurchaseLimitRulesCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Purchase Limit Rules
     * Gets a collection of &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rules&lt;/a&gt; according to any specified filter criteria and sort options.
     * @param startIndex The start index for pagination. (optional, default to 0)
     * @param pageSize The page size for pagination. (optional, default to 0)
     * @param sortBy The sort by parameter. (optional)
     * @param filter The filter parameter. (optional)
     * @param responseGroups The response groups parameter. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return PurchaseLimitRuleCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PurchaseLimitRuleCollection getPurchaseLimitRules(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<PurchaseLimitRuleCollection> localVarResp = getPurchaseLimitRulesWithHttpInfo(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Purchase Limit Rules
     * Gets a collection of &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rules&lt;/a&gt; according to any specified filter criteria and sort options.
     * @param startIndex The start index for pagination. (optional, default to 0)
     * @param pageSize The page size for pagination. (optional, default to 0)
     * @param sortBy The sort by parameter. (optional)
     * @param filter The filter parameter. (optional)
     * @param responseGroups The response groups parameter. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;PurchaseLimitRuleCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PurchaseLimitRuleCollection> getPurchaseLimitRulesWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getPurchaseLimitRulesValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<PurchaseLimitRuleCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Purchase Limit Rules (asynchronously)
     * Gets a collection of &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rules&lt;/a&gt; according to any specified filter criteria and sort options.
     * @param startIndex The start index for pagination. (optional, default to 0)
     * @param pageSize The page size for pagination. (optional, default to 0)
     * @param sortBy The sort by parameter. (optional)
     * @param filter The filter parameter. (optional)
     * @param responseGroups The response groups parameter. (optional)
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
    public okhttp3.Call getPurchaseLimitRulesAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback<PurchaseLimitRuleCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPurchaseLimitRulesValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<PurchaseLimitRuleCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updatePurchaseLimitRule
     * @param code The code of the purchase limit rule to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param purchaseLimitRule The updated purchase limit rule. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePurchaseLimitRuleCall(String code, String responseFields, PurchaseLimitRule purchaseLimitRule, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = purchaseLimitRule;

        // create path and map variables
        String localVarPath = "/commerce/rules/purchaselimit/{code}"
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
    private okhttp3.Call updatePurchaseLimitRuleValidateBeforeCall(String code, String responseFields, PurchaseLimitRule purchaseLimitRule, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling updatePurchaseLimitRule(Async)");
        }
        

        okhttp3.Call localVarCall = updatePurchaseLimitRuleCall(code, responseFields, purchaseLimitRule, _callback);
        return localVarCall;

    }

    /**
     * Update Purchase Limit Rule
     * Updates an existing &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt;.
     * @param code The code of the purchase limit rule to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param purchaseLimitRule The updated purchase limit rule. (optional)
     * @return PurchaseLimitRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PurchaseLimitRule updatePurchaseLimitRule(String code, String responseFields, PurchaseLimitRule purchaseLimitRule) throws ApiException {
        ApiResponse<PurchaseLimitRule> localVarResp = updatePurchaseLimitRuleWithHttpInfo(code, responseFields, purchaseLimitRule);
        return localVarResp.getData();
    }

    /**
     * Update Purchase Limit Rule
     * Updates an existing &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt;.
     * @param code The code of the purchase limit rule to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param purchaseLimitRule The updated purchase limit rule. (optional)
     * @return ApiResponse&lt;PurchaseLimitRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PurchaseLimitRule> updatePurchaseLimitRuleWithHttpInfo(String code, String responseFields, PurchaseLimitRule purchaseLimitRule) throws ApiException {
        okhttp3.Call localVarCall = updatePurchaseLimitRuleValidateBeforeCall(code, responseFields, purchaseLimitRule, null);
        Type localVarReturnType = new TypeToken<PurchaseLimitRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Purchase Limit Rule (asynchronously)
     * Updates an existing &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt;.
     * @param code The code of the purchase limit rule to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param purchaseLimitRule The updated purchase limit rule. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePurchaseLimitRuleAsync(String code, String responseFields, PurchaseLimitRule purchaseLimitRule, final ApiCallback<PurchaseLimitRule> _callback) throws ApiException {

        okhttp3.Call localVarCall = updatePurchaseLimitRuleValidateBeforeCall(code, responseFields, purchaseLimitRule, _callback);
        Type localVarReturnType = new TypeToken<PurchaseLimitRule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateRank
     * @param code  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param updateRankRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateRankCall(String code, String responseFields, UpdateRankRequest updateRankRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateRankRequest;

        // create path and map variables
        String localVarPath = "/commerce/rules/purchaselimit/{code}/rank"
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
    private okhttp3.Call updateRankValidateBeforeCall(String code, String responseFields, UpdateRankRequest updateRankRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling updateRank(Async)");
        }
        

        okhttp3.Call localVarCall = updateRankCall(code, responseFields, updateRankRequest, _callback);
        return localVarCall;

    }

    /**
     * Update Purchase Limit Rule Rank
     * Updates the rank for a &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt; and rearranges the ranks of all other rules accordingly.
     * @param code  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param updateRankRequest  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void updateRank(String code, String responseFields, UpdateRankRequest updateRankRequest) throws ApiException {
        updateRankWithHttpInfo(code, responseFields, updateRankRequest);
    }

    /**
     * Update Purchase Limit Rule Rank
     * Updates the rank for a &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt; and rearranges the ranks of all other rules accordingly.
     * @param code  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param updateRankRequest  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateRankWithHttpInfo(String code, String responseFields, UpdateRankRequest updateRankRequest) throws ApiException {
        okhttp3.Call localVarCall = updateRankValidateBeforeCall(code, responseFields, updateRankRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update Purchase Limit Rule Rank (asynchronously)
     * Updates the rank for a &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt; and rearranges the ranks of all other rules accordingly.
     * @param code  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param updateRankRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateRankAsync(String code, String responseFields, UpdateRankRequest updateRankRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateRankValidateBeforeCall(code, responseFields, updateRankRequest, _callback);
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
        public PurchaseLimitRulesApi build() {
            return new PurchaseLimitRulesApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
