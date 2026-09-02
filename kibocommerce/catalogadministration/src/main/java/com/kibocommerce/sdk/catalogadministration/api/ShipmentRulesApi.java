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


import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsDynamicExpression;
import com.kibocommerce.sdk.catalogadministration.models.ShipmentRule;
import com.kibocommerce.sdk.catalogadministration.models.ShipmentRuleCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ShipmentRulesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public ShipmentRulesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ShipmentRulesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public ShipmentRulesApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public ShipmentRulesApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public ShipmentRulesApi(Builder builder) {
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
     * Build call for createShipmentRule
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param shipmentRule The shipment rule to create. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createShipmentRuleCall(String responseFields, ShipmentRule shipmentRule, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = shipmentRule;

        // create path and map variables
        String localVarPath = "/commerce/rules/shipment";

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
    private okhttp3.Call createShipmentRuleValidateBeforeCall(String responseFields, ShipmentRule shipmentRule, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createShipmentRuleCall(responseFields, shipmentRule, _callback);
        return localVarCall;

    }

    /**
     * Create shipment rule
     * Creates a new shipment rule.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param shipmentRule The shipment rule to create. (optional)
     * @return ShipmentRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ShipmentRule createShipmentRule(String responseFields, ShipmentRule shipmentRule) throws ApiException {
        ApiResponse<ShipmentRule> localVarResp = createShipmentRuleWithHttpInfo(responseFields, shipmentRule);
        return localVarResp.getData();
    }

    /**
     * Create shipment rule
     * Creates a new shipment rule.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param shipmentRule The shipment rule to create. (optional)
     * @return ApiResponse&lt;ShipmentRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ShipmentRule> createShipmentRuleWithHttpInfo(String responseFields, ShipmentRule shipmentRule) throws ApiException {
        okhttp3.Call localVarCall = createShipmentRuleValidateBeforeCall(responseFields, shipmentRule, null);
        Type localVarReturnType = new TypeToken<ShipmentRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create shipment rule (asynchronously)
     * Creates a new shipment rule.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param shipmentRule The shipment rule to create. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createShipmentRuleAsync(String responseFields, ShipmentRule shipmentRule, final ApiCallback<ShipmentRule> _callback) throws ApiException {

        okhttp3.Call localVarCall = createShipmentRuleValidateBeforeCall(responseFields, shipmentRule, _callback);
        Type localVarReturnType = new TypeToken<ShipmentRule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteShipmentRule
     * @param code The code of the rule to delete. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteShipmentRuleCall(String code, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/rules/shipment/{code}"
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
    private okhttp3.Call deleteShipmentRuleValidateBeforeCall(String code, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteShipmentRule(Async)");
        }
        

        okhttp3.Call localVarCall = deleteShipmentRuleCall(code, _callback);
        return localVarCall;

    }

    /**
     * Delete shipment rule
     * Delete a shipment rule.
     * @param code The code of the rule to delete. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteShipmentRule(String code) throws ApiException {
        deleteShipmentRuleWithHttpInfo(code);
    }

    /**
     * Delete shipment rule
     * Delete a shipment rule.
     * @param code The code of the rule to delete. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteShipmentRuleWithHttpInfo(String code) throws ApiException {
        okhttp3.Call localVarCall = deleteShipmentRuleValidateBeforeCall(code, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete shipment rule (asynchronously)
     * Delete a shipment rule.
     * @param code The code of the rule to delete. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteShipmentRuleAsync(String code, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteShipmentRuleValidateBeforeCall(code, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getShipmentRule
     * @param code The code of the rule. (required)
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
    public okhttp3.Call getShipmentRuleCall(String code, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/rules/shipment/{code}"
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
    private okhttp3.Call getShipmentRuleValidateBeforeCall(String code, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getShipmentRule(Async)");
        }
        

        okhttp3.Call localVarCall = getShipmentRuleCall(code, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get shipment rule by code
     * Retrieves the details of a single shipment rule.
     * @param code The code of the rule. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ShipmentRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ShipmentRule getShipmentRule(String code, String responseFields) throws ApiException {
        ApiResponse<ShipmentRule> localVarResp = getShipmentRuleWithHttpInfo(code, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get shipment rule by code
     * Retrieves the details of a single shipment rule.
     * @param code The code of the rule. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;ShipmentRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ShipmentRule> getShipmentRuleWithHttpInfo(String code, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getShipmentRuleValidateBeforeCall(code, responseFields, null);
        Type localVarReturnType = new TypeToken<ShipmentRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get shipment rule by code (asynchronously)
     * Retrieves the details of a single shipment rule.
     * @param code The code of the rule. (required)
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
    public okhttp3.Call getShipmentRuleAsync(String code, String responseFields, final ApiCallback<ShipmentRule> _callback) throws ApiException {

        okhttp3.Call localVarCall = getShipmentRuleValidateBeforeCall(code, responseFields, _callback);
        Type localVarReturnType = new TypeToken<ShipmentRule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getShipmentRules
     * @param startIndex The start index. (optional, default to 0)
     * @param pageSize The page size. (optional, default to 0)
     * @param sortBy The sort by. (optional)
     * @param filter The filter. (optional)
     * @param responseGroups The response groups. (optional)
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
    public okhttp3.Call getShipmentRulesCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/rules/shipment";

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
    private okhttp3.Call getShipmentRulesValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getShipmentRulesCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get shipment rules
     * Retrieves a list of shipment rules.
     * @param startIndex The start index. (optional, default to 0)
     * @param pageSize The page size. (optional, default to 0)
     * @param sortBy The sort by. (optional)
     * @param filter The filter. (optional)
     * @param responseGroups The response groups. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ShipmentRuleCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ShipmentRuleCollection getShipmentRules(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<ShipmentRuleCollection> localVarResp = getShipmentRulesWithHttpInfo(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get shipment rules
     * Retrieves a list of shipment rules.
     * @param startIndex The start index. (optional, default to 0)
     * @param pageSize The page size. (optional, default to 0)
     * @param sortBy The sort by. (optional)
     * @param filter The filter. (optional)
     * @param responseGroups The response groups. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;ShipmentRuleCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ShipmentRuleCollection> getShipmentRulesWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getShipmentRulesValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<ShipmentRuleCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get shipment rules (asynchronously)
     * Retrieves a list of shipment rules.
     * @param startIndex The start index. (optional, default to 0)
     * @param pageSize The page size. (optional, default to 0)
     * @param sortBy The sort by. (optional)
     * @param filter The filter. (optional)
     * @param responseGroups The response groups. (optional)
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
    public okhttp3.Call getShipmentRulesAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback<ShipmentRuleCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getShipmentRulesValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<ShipmentRuleCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for parseShipmentExpression
     * @param fulfillmentLocationCode The fulfillment location code to filter by. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDynamicExpression The dynamic expression to parse. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call parseShipmentExpressionCall(String fulfillmentLocationCode, String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsDynamicExpression;

        // create path and map variables
        String localVarPath = "/commerce/rules/shipment/expression/parse";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fulfillmentLocationCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fulfillmentLocationCode", fulfillmentLocationCode));
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
    private okhttp3.Call parseShipmentExpressionValidateBeforeCall(String fulfillmentLocationCode, String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = parseShipmentExpressionCall(fulfillmentLocationCode, responseFields, catalogAdminsDynamicExpression, _callback);
        return localVarCall;

    }

    /**
     * Parse Shipment Expression
     * Parses a shipment expression and returns the query string for retrieving shipments that match the criteria.
     * @param fulfillmentLocationCode The fulfillment location code to filter by. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDynamicExpression The dynamic expression to parse. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public String parseShipmentExpression(String fulfillmentLocationCode, String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression) throws ApiException {
        ApiResponse<String> localVarResp = parseShipmentExpressionWithHttpInfo(fulfillmentLocationCode, responseFields, catalogAdminsDynamicExpression);
        return localVarResp.getData();
    }

    /**
     * Parse Shipment Expression
     * Parses a shipment expression and returns the query string for retrieving shipments that match the criteria.
     * @param fulfillmentLocationCode The fulfillment location code to filter by. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDynamicExpression The dynamic expression to parse. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> parseShipmentExpressionWithHttpInfo(String fulfillmentLocationCode, String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression) throws ApiException {
        okhttp3.Call localVarCall = parseShipmentExpressionValidateBeforeCall(fulfillmentLocationCode, responseFields, catalogAdminsDynamicExpression, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Parse Shipment Expression (asynchronously)
     * Parses a shipment expression and returns the query string for retrieving shipments that match the criteria.
     * @param fulfillmentLocationCode The fulfillment location code to filter by. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDynamicExpression The dynamic expression to parse. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call parseShipmentExpressionAsync(String fulfillmentLocationCode, String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = parseShipmentExpressionValidateBeforeCall(fulfillmentLocationCode, responseFields, catalogAdminsDynamicExpression, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateShipmentRule
     * @param code The code of the rule to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param shipmentRule The updated shipment rule. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateShipmentRuleCall(String code, String responseFields, ShipmentRule shipmentRule, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = shipmentRule;

        // create path and map variables
        String localVarPath = "/commerce/rules/shipment/{code}"
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
    private okhttp3.Call updateShipmentRuleValidateBeforeCall(String code, String responseFields, ShipmentRule shipmentRule, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling updateShipmentRule(Async)");
        }
        

        okhttp3.Call localVarCall = updateShipmentRuleCall(code, responseFields, shipmentRule, _callback);
        return localVarCall;

    }

    /**
     * Update shipment rule
     * Update an existing shipment rule.
     * @param code The code of the rule to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param shipmentRule The updated shipment rule. (optional)
     * @return ShipmentRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ShipmentRule updateShipmentRule(String code, String responseFields, ShipmentRule shipmentRule) throws ApiException {
        ApiResponse<ShipmentRule> localVarResp = updateShipmentRuleWithHttpInfo(code, responseFields, shipmentRule);
        return localVarResp.getData();
    }

    /**
     * Update shipment rule
     * Update an existing shipment rule.
     * @param code The code of the rule to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param shipmentRule The updated shipment rule. (optional)
     * @return ApiResponse&lt;ShipmentRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ShipmentRule> updateShipmentRuleWithHttpInfo(String code, String responseFields, ShipmentRule shipmentRule) throws ApiException {
        okhttp3.Call localVarCall = updateShipmentRuleValidateBeforeCall(code, responseFields, shipmentRule, null);
        Type localVarReturnType = new TypeToken<ShipmentRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update shipment rule (asynchronously)
     * Update an existing shipment rule.
     * @param code The code of the rule to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param shipmentRule The updated shipment rule. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateShipmentRuleAsync(String code, String responseFields, ShipmentRule shipmentRule, final ApiCallback<ShipmentRule> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateShipmentRuleValidateBeforeCall(code, responseFields, shipmentRule, _callback);
        Type localVarReturnType = new TypeToken<ShipmentRule>(){}.getType();
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
        public ShipmentRulesApi build() {
            return new ShipmentRulesApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
