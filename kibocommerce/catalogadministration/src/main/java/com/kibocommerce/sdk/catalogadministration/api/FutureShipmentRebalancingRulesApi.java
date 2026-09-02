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


import com.kibocommerce.sdk.catalogadministration.models.FutureShipmentRebalancingRule;
import com.kibocommerce.sdk.catalogadministration.models.FutureShipmentRebalancingRuleCollection;
import com.kibocommerce.sdk.catalogadministration.models.UpdateRankRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class FutureShipmentRebalancingRulesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public FutureShipmentRebalancingRulesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FutureShipmentRebalancingRulesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public FutureShipmentRebalancingRulesApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public FutureShipmentRebalancingRulesApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public FutureShipmentRebalancingRulesApi(Builder builder) {
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
     * Build call for createRule
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param futureShipmentRebalancingRule The rule to create. Code is auto-generated if omitted. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Rule created successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation failed. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Code already exists for this tenant. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createRuleCall(String responseFields, FutureShipmentRebalancingRule futureShipmentRebalancingRule, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = futureShipmentRebalancingRule;

        // create path and map variables
        String localVarPath = "/commerce/rules/futureshipmentrebalancing";

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
    private okhttp3.Call createRuleValidateBeforeCall(String responseFields, FutureShipmentRebalancingRule futureShipmentRebalancingRule, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createRuleCall(responseFields, futureShipmentRebalancingRule, _callback);
        return localVarCall;

    }

    /**
     * Create future shipment rebalancing rule
     * Creates a new future shipment rebalancing rule.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param futureShipmentRebalancingRule The rule to create. Code is auto-generated if omitted. (optional)
     * @return FutureShipmentRebalancingRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Rule created successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation failed. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Code already exists for this tenant. </td><td>  -  </td></tr>
     </table>
     */
    public FutureShipmentRebalancingRule createRule(String responseFields, FutureShipmentRebalancingRule futureShipmentRebalancingRule) throws ApiException {
        ApiResponse<FutureShipmentRebalancingRule> localVarResp = createRuleWithHttpInfo(responseFields, futureShipmentRebalancingRule);
        return localVarResp.getData();
    }

    /**
     * Create future shipment rebalancing rule
     * Creates a new future shipment rebalancing rule.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param futureShipmentRebalancingRule The rule to create. Code is auto-generated if omitted. (optional)
     * @return ApiResponse&lt;FutureShipmentRebalancingRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Rule created successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation failed. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Code already exists for this tenant. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FutureShipmentRebalancingRule> createRuleWithHttpInfo(String responseFields, FutureShipmentRebalancingRule futureShipmentRebalancingRule) throws ApiException {
        okhttp3.Call localVarCall = createRuleValidateBeforeCall(responseFields, futureShipmentRebalancingRule, null);
        Type localVarReturnType = new TypeToken<FutureShipmentRebalancingRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create future shipment rebalancing rule (asynchronously)
     * Creates a new future shipment rebalancing rule.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param futureShipmentRebalancingRule The rule to create. Code is auto-generated if omitted. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Rule created successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation failed. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Code already exists for this tenant. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createRuleAsync(String responseFields, FutureShipmentRebalancingRule futureShipmentRebalancingRule, final ApiCallback<FutureShipmentRebalancingRule> _callback) throws ApiException {

        okhttp3.Call localVarCall = createRuleValidateBeforeCall(responseFields, futureShipmentRebalancingRule, _callback);
        Type localVarReturnType = new TypeToken<FutureShipmentRebalancingRule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteRule
     * @param code The rule code to delete. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Rule deleted successfully. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Rule not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteRuleCall(String code, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/rules/futureshipmentrebalancing/{code}"
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
    private okhttp3.Call deleteRuleValidateBeforeCall(String code, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteRule(Async)");
        }
        

        okhttp3.Call localVarCall = deleteRuleCall(code, _callback);
        return localVarCall;

    }

    /**
     * Delete future shipment rebalancing rule
     * Deletes a future shipment rebalancing rule by code.
     * @param code The rule code to delete. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Rule deleted successfully. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Rule not found. </td><td>  -  </td></tr>
     </table>
     */
    public void deleteRule(String code) throws ApiException {
        deleteRuleWithHttpInfo(code);
    }

    /**
     * Delete future shipment rebalancing rule
     * Deletes a future shipment rebalancing rule by code.
     * @param code The rule code to delete. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Rule deleted successfully. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Rule not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteRuleWithHttpInfo(String code) throws ApiException {
        okhttp3.Call localVarCall = deleteRuleValidateBeforeCall(code, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete future shipment rebalancing rule (asynchronously)
     * Deletes a future shipment rebalancing rule by code.
     * @param code The rule code to delete. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Rule deleted successfully. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Rule not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteRuleAsync(String code, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteRuleValidateBeforeCall(code, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRule
     * @param code The unique rule code. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Rule found. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Rule not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRuleCall(String code, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/rules/futureshipmentrebalancing/{code}"
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
    private okhttp3.Call getRuleValidateBeforeCall(String code, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getRule(Async)");
        }
        

        okhttp3.Call localVarCall = getRuleCall(code, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get future shipment rebalancing rule by code
     * Gets a future shipment rebalancing rule details by code.
     * @param code The unique rule code. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return FutureShipmentRebalancingRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Rule found. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Rule not found. </td><td>  -  </td></tr>
     </table>
     */
    public FutureShipmentRebalancingRule getRule(String code, String responseFields) throws ApiException {
        ApiResponse<FutureShipmentRebalancingRule> localVarResp = getRuleWithHttpInfo(code, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get future shipment rebalancing rule by code
     * Gets a future shipment rebalancing rule details by code.
     * @param code The unique rule code. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;FutureShipmentRebalancingRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Rule found. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Rule not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FutureShipmentRebalancingRule> getRuleWithHttpInfo(String code, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getRuleValidateBeforeCall(code, responseFields, null);
        Type localVarReturnType = new TypeToken<FutureShipmentRebalancingRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get future shipment rebalancing rule by code (asynchronously)
     * Gets a future shipment rebalancing rule details by code.
     * @param code The unique rule code. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Rule found. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Rule not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRuleAsync(String code, String responseFields, final ApiCallback<FutureShipmentRebalancingRule> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRuleValidateBeforeCall(code, responseFields, _callback);
        Type localVarReturnType = new TypeToken<FutureShipmentRebalancingRule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRules
     * @param startIndex Zero-based start index for pagination. (optional, default to 0)
     * @param pageSize Number of items per page. (optional, default to 0)
     * @param sortBy Sort expression (e.g. &#39;rank asc&#39;). (optional)
     * @param filter Filter expression (e.g. &#39;enabled eq true&#39;). (optional)
     * @param responseGroups Response groups (currently unused). (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Rule collection returned successfully. </td><td>  -  </td></tr>
        <tr><td> 412 </td><td> Feature not enabled for this tenant. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRulesCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/rules/futureshipmentrebalancing";

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
    private okhttp3.Call getRulesValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getRulesCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get future shipment rebalancing rules
     * Gets a collection of future shipment rebalancing rules according to any specified filter criteria and sort options.
     * @param startIndex Zero-based start index for pagination. (optional, default to 0)
     * @param pageSize Number of items per page. (optional, default to 0)
     * @param sortBy Sort expression (e.g. &#39;rank asc&#39;). (optional)
     * @param filter Filter expression (e.g. &#39;enabled eq true&#39;). (optional)
     * @param responseGroups Response groups (currently unused). (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return FutureShipmentRebalancingRuleCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Rule collection returned successfully. </td><td>  -  </td></tr>
        <tr><td> 412 </td><td> Feature not enabled for this tenant. </td><td>  -  </td></tr>
     </table>
     */
    public FutureShipmentRebalancingRuleCollection getRules(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<FutureShipmentRebalancingRuleCollection> localVarResp = getRulesWithHttpInfo(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get future shipment rebalancing rules
     * Gets a collection of future shipment rebalancing rules according to any specified filter criteria and sort options.
     * @param startIndex Zero-based start index for pagination. (optional, default to 0)
     * @param pageSize Number of items per page. (optional, default to 0)
     * @param sortBy Sort expression (e.g. &#39;rank asc&#39;). (optional)
     * @param filter Filter expression (e.g. &#39;enabled eq true&#39;). (optional)
     * @param responseGroups Response groups (currently unused). (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;FutureShipmentRebalancingRuleCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Rule collection returned successfully. </td><td>  -  </td></tr>
        <tr><td> 412 </td><td> Feature not enabled for this tenant. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FutureShipmentRebalancingRuleCollection> getRulesWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getRulesValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<FutureShipmentRebalancingRuleCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get future shipment rebalancing rules (asynchronously)
     * Gets a collection of future shipment rebalancing rules according to any specified filter criteria and sort options.
     * @param startIndex Zero-based start index for pagination. (optional, default to 0)
     * @param pageSize Number of items per page. (optional, default to 0)
     * @param sortBy Sort expression (e.g. &#39;rank asc&#39;). (optional)
     * @param filter Filter expression (e.g. &#39;enabled eq true&#39;). (optional)
     * @param responseGroups Response groups (currently unused). (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Rule collection returned successfully. </td><td>  -  </td></tr>
        <tr><td> 412 </td><td> Feature not enabled for this tenant. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRulesAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback<FutureShipmentRebalancingRuleCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRulesValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<FutureShipmentRebalancingRuleCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateRank
     * @param code The rule code whose rank to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param updateRankRequest Contains OldRank and NewRank values. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Rank updated successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> OldRank or NewRank is invalid. </td><td>  -  </td></tr>
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
        String localVarPath = "/commerce/rules/futureshipmentrebalancing/{code}/rank"
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
     * Update future shipment rebalancing rule rank
     * Updates the rank for a future shipment rebalancing rule and rearranges the ranks of all other rules accordingly.
     * @param code The rule code whose rank to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param updateRankRequest Contains OldRank and NewRank values. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Rank updated successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> OldRank or NewRank is invalid. </td><td>  -  </td></tr>
     </table>
     */
    public void updateRank(String code, String responseFields, UpdateRankRequest updateRankRequest) throws ApiException {
        updateRankWithHttpInfo(code, responseFields, updateRankRequest);
    }

    /**
     * Update future shipment rebalancing rule rank
     * Updates the rank for a future shipment rebalancing rule and rearranges the ranks of all other rules accordingly.
     * @param code The rule code whose rank to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param updateRankRequest Contains OldRank and NewRank values. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Rank updated successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> OldRank or NewRank is invalid. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateRankWithHttpInfo(String code, String responseFields, UpdateRankRequest updateRankRequest) throws ApiException {
        okhttp3.Call localVarCall = updateRankValidateBeforeCall(code, responseFields, updateRankRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update future shipment rebalancing rule rank (asynchronously)
     * Updates the rank for a future shipment rebalancing rule and rearranges the ranks of all other rules accordingly.
     * @param code The rule code whose rank to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param updateRankRequest Contains OldRank and NewRank values. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Rank updated successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> OldRank or NewRank is invalid. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateRankAsync(String code, String responseFields, UpdateRankRequest updateRankRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateRankValidateBeforeCall(code, responseFields, updateRankRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateRule
     * @param code The rule code to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param futureShipmentRebalancingRule The updated rule. Code in body must match URL code. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Rule updated successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation failed. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Rule not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateRuleCall(String code, String responseFields, FutureShipmentRebalancingRule futureShipmentRebalancingRule, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = futureShipmentRebalancingRule;

        // create path and map variables
        String localVarPath = "/commerce/rules/futureshipmentrebalancing/{code}"
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
    private okhttp3.Call updateRuleValidateBeforeCall(String code, String responseFields, FutureShipmentRebalancingRule futureShipmentRebalancingRule, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling updateRule(Async)");
        }
        

        okhttp3.Call localVarCall = updateRuleCall(code, responseFields, futureShipmentRebalancingRule, _callback);
        return localVarCall;

    }

    /**
     * Update future shipment rebalancing rule
     * Updates an existing future shipment rebalancing rule.
     * @param code The rule code to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param futureShipmentRebalancingRule The updated rule. Code in body must match URL code. (optional)
     * @return FutureShipmentRebalancingRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Rule updated successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation failed. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Rule not found. </td><td>  -  </td></tr>
     </table>
     */
    public FutureShipmentRebalancingRule updateRule(String code, String responseFields, FutureShipmentRebalancingRule futureShipmentRebalancingRule) throws ApiException {
        ApiResponse<FutureShipmentRebalancingRule> localVarResp = updateRuleWithHttpInfo(code, responseFields, futureShipmentRebalancingRule);
        return localVarResp.getData();
    }

    /**
     * Update future shipment rebalancing rule
     * Updates an existing future shipment rebalancing rule.
     * @param code The rule code to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param futureShipmentRebalancingRule The updated rule. Code in body must match URL code. (optional)
     * @return ApiResponse&lt;FutureShipmentRebalancingRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Rule updated successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation failed. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Rule not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FutureShipmentRebalancingRule> updateRuleWithHttpInfo(String code, String responseFields, FutureShipmentRebalancingRule futureShipmentRebalancingRule) throws ApiException {
        okhttp3.Call localVarCall = updateRuleValidateBeforeCall(code, responseFields, futureShipmentRebalancingRule, null);
        Type localVarReturnType = new TypeToken<FutureShipmentRebalancingRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update future shipment rebalancing rule (asynchronously)
     * Updates an existing future shipment rebalancing rule.
     * @param code The rule code to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param futureShipmentRebalancingRule The updated rule. Code in body must match URL code. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Rule updated successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation failed. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Rule not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateRuleAsync(String code, String responseFields, FutureShipmentRebalancingRule futureShipmentRebalancingRule, final ApiCallback<FutureShipmentRebalancingRule> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateRuleValidateBeforeCall(code, responseFields, futureShipmentRebalancingRule, _callback);
        Type localVarReturnType = new TypeToken<FutureShipmentRebalancingRule>(){}.getType();
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
        public FutureShipmentRebalancingRulesApi build() {
            return new FutureShipmentRebalancingRulesApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
