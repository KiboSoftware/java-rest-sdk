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
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsProductRule;
import com.kibocommerce.sdk.catalogadministration.models.ProductRuleCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ProductRulesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public ProductRulesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductRulesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public ProductRulesApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public ProductRulesApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public ProductRulesApi(Builder builder) {
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
     * Build call for createProductRule
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductRule The product rule to create. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createProductRuleCall(String responseFields, CatalogAdminsProductRule catalogAdminsProductRule, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsProductRule;

        // create path and map variables
        String localVarPath = "/commerce/rules/product";

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
    private okhttp3.Call createProductRuleValidateBeforeCall(String responseFields, CatalogAdminsProductRule catalogAdminsProductRule, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createProductRuleCall(responseFields, catalogAdminsProductRule, _callback);
        return localVarCall;

    }

    /**
     * Create Product Rule
     * Creates a new product rule.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductRule The product rule to create. (optional)
     * @return CatalogAdminsProductRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsProductRule createProductRule(String responseFields, CatalogAdminsProductRule catalogAdminsProductRule) throws ApiException {
        ApiResponse<CatalogAdminsProductRule> localVarResp = createProductRuleWithHttpInfo(responseFields, catalogAdminsProductRule);
        return localVarResp.getData();
    }

    /**
     * Create Product Rule
     * Creates a new product rule.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductRule The product rule to create. (optional)
     * @return ApiResponse&lt;CatalogAdminsProductRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsProductRule> createProductRuleWithHttpInfo(String responseFields, CatalogAdminsProductRule catalogAdminsProductRule) throws ApiException {
        okhttp3.Call localVarCall = createProductRuleValidateBeforeCall(responseFields, catalogAdminsProductRule, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsProductRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Product Rule (asynchronously)
     * Creates a new product rule.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductRule The product rule to create. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createProductRuleAsync(String responseFields, CatalogAdminsProductRule catalogAdminsProductRule, final ApiCallback<CatalogAdminsProductRule> _callback) throws ApiException {

        okhttp3.Call localVarCall = createProductRuleValidateBeforeCall(responseFields, catalogAdminsProductRule, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsProductRule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteProductRule
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
    public okhttp3.Call deleteProductRuleCall(String code, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/rules/product/{code}"
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
    private okhttp3.Call deleteProductRuleValidateBeforeCall(String code, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteProductRule(Async)");
        }
        

        okhttp3.Call localVarCall = deleteProductRuleCall(code, _callback);
        return localVarCall;

    }

    /**
     * Delete Product Rules
     * Delete a product rules.
     * @param code The code of the rule to delete. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteProductRule(String code) throws ApiException {
        deleteProductRuleWithHttpInfo(code);
    }

    /**
     * Delete Product Rules
     * Delete a product rules.
     * @param code The code of the rule to delete. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteProductRuleWithHttpInfo(String code) throws ApiException {
        okhttp3.Call localVarCall = deleteProductRuleValidateBeforeCall(code, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Product Rules (asynchronously)
     * Delete a product rules.
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
    public okhttp3.Call deleteProductRuleAsync(String code, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteProductRuleValidateBeforeCall(code, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getExpressionFieldDefinitions
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
    public okhttp3.Call getExpressionFieldDefinitionsCall(String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/rules/product/product-rule-fields";

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
    private okhttp3.Call getExpressionFieldDefinitionsValidateBeforeCall(String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getExpressionFieldDefinitionsCall(responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Expression Field Definition
     * Get expression field definition
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public Object getExpressionFieldDefinitions(String responseFields) throws ApiException {
        ApiResponse<Object> localVarResp = getExpressionFieldDefinitionsWithHttpInfo(responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Expression Field Definition
     * Get expression field definition
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> getExpressionFieldDefinitionsWithHttpInfo(String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getExpressionFieldDefinitionsValidateBeforeCall(responseFields, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Expression Field Definition (asynchronously)
     * Get expression field definition
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
    public okhttp3.Call getExpressionFieldDefinitionsAsync(String responseFields, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExpressionFieldDefinitionsValidateBeforeCall(responseFields, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProductRule
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
    public okhttp3.Call getProductRuleCall(String code, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/rules/product/{code}"
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
    private okhttp3.Call getProductRuleValidateBeforeCall(String code, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getProductRule(Async)");
        }
        

        okhttp3.Call localVarCall = getProductRuleCall(code, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Rule by Code
     * Retrieves the details of a single product rule.
     * @param code The code of the rule. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsProductRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsProductRule getProductRule(String code, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsProductRule> localVarResp = getProductRuleWithHttpInfo(code, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Rule by Code
     * Retrieves the details of a single product rule.
     * @param code The code of the rule. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsProductRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsProductRule> getProductRuleWithHttpInfo(String code, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProductRuleValidateBeforeCall(code, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsProductRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Rule by Code (asynchronously)
     * Retrieves the details of a single product rule.
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
    public okhttp3.Call getProductRuleAsync(String code, String responseFields, final ApiCallback<CatalogAdminsProductRule> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductRuleValidateBeforeCall(code, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsProductRule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProductRules
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
    public okhttp3.Call getProductRulesCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/rules/product";

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
    private okhttp3.Call getProductRulesValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getProductRulesCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Rules
     * Retrieves a list of product rules according to any specified filter criteria and sort options.
     * @param startIndex The start index. (optional, default to 0)
     * @param pageSize The page size. (optional, default to 0)
     * @param sortBy The sort by. (optional)
     * @param filter The filter. (optional)
     * @param responseGroups The response groups. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ProductRuleCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductRuleCollection getProductRules(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<ProductRuleCollection> localVarResp = getProductRulesWithHttpInfo(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Rules
     * Retrieves a list of product rules according to any specified filter criteria and sort options.
     * @param startIndex The start index. (optional, default to 0)
     * @param pageSize The page size. (optional, default to 0)
     * @param sortBy The sort by. (optional)
     * @param filter The filter. (optional)
     * @param responseGroups The response groups. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;ProductRuleCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductRuleCollection> getProductRulesWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProductRulesValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<ProductRuleCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Rules (asynchronously)
     * Retrieves a list of product rules according to any specified filter criteria and sort options.
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
    public okhttp3.Call getProductRulesAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback<ProductRuleCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductRulesValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<ProductRuleCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProductRule
     * @param code The code of the rule to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductRule The updated product rule. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductRuleCall(String code, String responseFields, CatalogAdminsProductRule catalogAdminsProductRule, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsProductRule;

        // create path and map variables
        String localVarPath = "/commerce/rules/product/{code}"
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
    private okhttp3.Call updateProductRuleValidateBeforeCall(String code, String responseFields, CatalogAdminsProductRule catalogAdminsProductRule, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling updateProductRule(Async)");
        }
        

        okhttp3.Call localVarCall = updateProductRuleCall(code, responseFields, catalogAdminsProductRule, _callback);
        return localVarCall;

    }

    /**
     * Update Product Rule
     * Update an existing product rules.
     * @param code The code of the rule to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductRule The updated product rule. (optional)
     * @return CatalogAdminsProductRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsProductRule updateProductRule(String code, String responseFields, CatalogAdminsProductRule catalogAdminsProductRule) throws ApiException {
        ApiResponse<CatalogAdminsProductRule> localVarResp = updateProductRuleWithHttpInfo(code, responseFields, catalogAdminsProductRule);
        return localVarResp.getData();
    }

    /**
     * Update Product Rule
     * Update an existing product rules.
     * @param code The code of the rule to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductRule The updated product rule. (optional)
     * @return ApiResponse&lt;CatalogAdminsProductRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsProductRule> updateProductRuleWithHttpInfo(String code, String responseFields, CatalogAdminsProductRule catalogAdminsProductRule) throws ApiException {
        okhttp3.Call localVarCall = updateProductRuleValidateBeforeCall(code, responseFields, catalogAdminsProductRule, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsProductRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product Rule (asynchronously)
     * Update an existing product rules.
     * @param code The code of the rule to update. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductRule The updated product rule. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductRuleAsync(String code, String responseFields, CatalogAdminsProductRule catalogAdminsProductRule, final ApiCallback<CatalogAdminsProductRule> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProductRuleValidateBeforeCall(code, responseFields, catalogAdminsProductRule, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsProductRule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for validateExpression
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDynamicExpression The expression to validate. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateExpressionCall(String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/rules/product/validate";

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
    private okhttp3.Call validateExpressionValidateBeforeCall(String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = validateExpressionCall(responseFields, catalogAdminsDynamicExpression, _callback);
        return localVarCall;

    }

    /**
     * Validate Expression
     * Validate the expression for a product rules
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDynamicExpression The expression to validate. (optional)
     * @return CatalogAdminsDynamicExpression
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsDynamicExpression validateExpression(String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression) throws ApiException {
        ApiResponse<CatalogAdminsDynamicExpression> localVarResp = validateExpressionWithHttpInfo(responseFields, catalogAdminsDynamicExpression);
        return localVarResp.getData();
    }

    /**
     * Validate Expression
     * Validate the expression for a product rules
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDynamicExpression The expression to validate. (optional)
     * @return ApiResponse&lt;CatalogAdminsDynamicExpression&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsDynamicExpression> validateExpressionWithHttpInfo(String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression) throws ApiException {
        okhttp3.Call localVarCall = validateExpressionValidateBeforeCall(responseFields, catalogAdminsDynamicExpression, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsDynamicExpression>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Validate Expression (asynchronously)
     * Validate the expression for a product rules
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDynamicExpression The expression to validate. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateExpressionAsync(String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression, final ApiCallback<CatalogAdminsDynamicExpression> _callback) throws ApiException {

        okhttp3.Call localVarCall = validateExpressionValidateBeforeCall(responseFields, catalogAdminsDynamicExpression, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsDynamicExpression>(){}.getType();
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
        public ProductRulesApi build() {
            return new ProductRulesApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
