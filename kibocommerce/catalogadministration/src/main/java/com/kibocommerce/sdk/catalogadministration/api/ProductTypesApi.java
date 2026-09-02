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


import com.kibocommerce.sdk.catalogadministration.models.AttributeInProductType;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsProductOption;
import com.kibocommerce.sdk.catalogadministration.models.ProductType;
import com.kibocommerce.sdk.catalogadministration.models.ProductTypeCollection;
import com.kibocommerce.sdk.catalogadministration.models.ProductVariationPagedCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ProductTypesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public ProductTypesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductTypesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public ProductTypesApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public ProductTypesApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public ProductTypesApi(Builder builder) {
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
     * Build call for addExtra
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addExtraCall(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = attributeInProductType;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Extras"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()));

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
    private okhttp3.Call addExtraValidateBeforeCall(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling addExtra(Async)");
        }
        

        okhttp3.Call localVarCall = addExtraCall(productTypeId, responseFields, attributeInProductType, _callback);
        return localVarCall;

    }

    /**
     * Add Product Type Extra
     * Add a product type extra.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @return AttributeInProductType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AttributeInProductType addExtra(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType) throws ApiException {
        ApiResponse<AttributeInProductType> localVarResp = addExtraWithHttpInfo(productTypeId, responseFields, attributeInProductType);
        return localVarResp.getData();
    }

    /**
     * Add Product Type Extra
     * Add a product type extra.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @return ApiResponse&lt;AttributeInProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttributeInProductType> addExtraWithHttpInfo(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType) throws ApiException {
        okhttp3.Call localVarCall = addExtraValidateBeforeCall(productTypeId, responseFields, attributeInProductType, null);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Product Type Extra (asynchronously)
     * Add a product type extra.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addExtraAsync(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback<AttributeInProductType> _callback) throws ApiException {

        okhttp3.Call localVarCall = addExtraValidateBeforeCall(productTypeId, responseFields, attributeInProductType, _callback);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addOption
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addOptionCall(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = attributeInProductType;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Options"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()));

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
    private okhttp3.Call addOptionValidateBeforeCall(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling addOption(Async)");
        }
        

        okhttp3.Call localVarCall = addOptionCall(productTypeId, responseFields, attributeInProductType, _callback);
        return localVarCall;

    }

    /**
     * Add Product Type Option
     * Add a product option to a product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @return AttributeInProductType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AttributeInProductType addOption(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType) throws ApiException {
        ApiResponse<AttributeInProductType> localVarResp = addOptionWithHttpInfo(productTypeId, responseFields, attributeInProductType);
        return localVarResp.getData();
    }

    /**
     * Add Product Type Option
     * Add a product option to a product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @return ApiResponse&lt;AttributeInProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttributeInProductType> addOptionWithHttpInfo(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType) throws ApiException {
        okhttp3.Call localVarCall = addOptionValidateBeforeCall(productTypeId, responseFields, attributeInProductType, null);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Product Type Option (asynchronously)
     * Add a product option to a product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addOptionAsync(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback<AttributeInProductType> _callback) throws ApiException {

        okhttp3.Call localVarCall = addOptionValidateBeforeCall(productTypeId, responseFields, attributeInProductType, _callback);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addProductType
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productType  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addProductTypeCall(String responseFields, ProductType productType, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productType;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes";

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
    private okhttp3.Call addProductTypeValidateBeforeCall(String responseFields, ProductType productType, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = addProductTypeCall(responseFields, productType, _callback);
        return localVarCall;

    }

    /**
     * Add Product Type
     * Get product type by Id.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productType  (optional)
     * @return ProductType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductType addProductType(String responseFields, ProductType productType) throws ApiException {
        ApiResponse<ProductType> localVarResp = addProductTypeWithHttpInfo(responseFields, productType);
        return localVarResp.getData();
    }

    /**
     * Add Product Type
     * Get product type by Id.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productType  (optional)
     * @return ApiResponse&lt;ProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductType> addProductTypeWithHttpInfo(String responseFields, ProductType productType) throws ApiException {
        okhttp3.Call localVarCall = addProductTypeValidateBeforeCall(responseFields, productType, null);
        Type localVarReturnType = new TypeToken<ProductType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Product Type (asynchronously)
     * Get product type by Id.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productType  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addProductTypeAsync(String responseFields, ProductType productType, final ApiCallback<ProductType> _callback) throws ApiException {

        okhttp3.Call localVarCall = addProductTypeValidateBeforeCall(responseFields, productType, _callback);
        Type localVarReturnType = new TypeToken<ProductType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addProperty
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPropertyCall(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = attributeInProductType;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()));

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
    private okhttp3.Call addPropertyValidateBeforeCall(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling addProperty(Async)");
        }
        

        okhttp3.Call localVarCall = addPropertyCall(productTypeId, responseFields, attributeInProductType, _callback);
        return localVarCall;

    }

    /**
     * Add Product Type Property
     * Add a property to a product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @return AttributeInProductType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AttributeInProductType addProperty(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType) throws ApiException {
        ApiResponse<AttributeInProductType> localVarResp = addPropertyWithHttpInfo(productTypeId, responseFields, attributeInProductType);
        return localVarResp.getData();
    }

    /**
     * Add Product Type Property
     * Add a property to a product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @return ApiResponse&lt;AttributeInProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttributeInProductType> addPropertyWithHttpInfo(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType) throws ApiException {
        okhttp3.Call localVarCall = addPropertyValidateBeforeCall(productTypeId, responseFields, attributeInProductType, null);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Product Type Property (asynchronously)
     * Add a property to a product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPropertyAsync(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback<AttributeInProductType> _callback) throws ApiException {

        okhttp3.Call localVarCall = addPropertyValidateBeforeCall(productTypeId, responseFields, attributeInProductType, _callback);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addVariantProperty
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addVariantPropertyCall(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = attributeInProductType;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/VariantProperties"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()));

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
    private okhttp3.Call addVariantPropertyValidateBeforeCall(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling addVariantProperty(Async)");
        }
        

        okhttp3.Call localVarCall = addVariantPropertyCall(productTypeId, responseFields, attributeInProductType, _callback);
        return localVarCall;

    }

    /**
     * Add Variant Product Type Property
     * Add a variant property to a product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @return AttributeInProductType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AttributeInProductType addVariantProperty(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType) throws ApiException {
        ApiResponse<AttributeInProductType> localVarResp = addVariantPropertyWithHttpInfo(productTypeId, responseFields, attributeInProductType);
        return localVarResp.getData();
    }

    /**
     * Add Variant Product Type Property
     * Add a variant property to a product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @return ApiResponse&lt;AttributeInProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttributeInProductType> addVariantPropertyWithHttpInfo(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType) throws ApiException {
        okhttp3.Call localVarCall = addVariantPropertyValidateBeforeCall(productTypeId, responseFields, attributeInProductType, null);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Variant Product Type Property (asynchronously)
     * Add a variant property to a product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addVariantPropertyAsync(Integer productTypeId, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback<AttributeInProductType> _callback) throws ApiException {

        okhttp3.Call localVarCall = addVariantPropertyValidateBeforeCall(productTypeId, responseFields, attributeInProductType, _callback);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteExtra
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteExtraCall(Integer productTypeId, String attributeFQN, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Extras/{attributeFQN}"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

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
    private okhttp3.Call deleteExtraValidateBeforeCall(Integer productTypeId, String attributeFQN, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling deleteExtra(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling deleteExtra(Async)");
        }
        

        okhttp3.Call localVarCall = deleteExtraCall(productTypeId, attributeFQN, _callback);
        return localVarCall;

    }

    /**
     * Delete Product Type Extra
     * Delete a product type extra.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteExtra(Integer productTypeId, String attributeFQN) throws ApiException {
        deleteExtraWithHttpInfo(productTypeId, attributeFQN);
    }

    /**
     * Delete Product Type Extra
     * Delete a product type extra.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteExtraWithHttpInfo(Integer productTypeId, String attributeFQN) throws ApiException {
        okhttp3.Call localVarCall = deleteExtraValidateBeforeCall(productTypeId, attributeFQN, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Product Type Extra (asynchronously)
     * Delete a product type extra.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteExtraAsync(Integer productTypeId, String attributeFQN, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteExtraValidateBeforeCall(productTypeId, attributeFQN, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteOption
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteOptionCall(Integer productTypeId, String attributeFQN, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Options/{attributeFQN}"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

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
    private okhttp3.Call deleteOptionValidateBeforeCall(Integer productTypeId, String attributeFQN, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling deleteOption(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling deleteOption(Async)");
        }
        

        okhttp3.Call localVarCall = deleteOptionCall(productTypeId, attributeFQN, _callback);
        return localVarCall;

    }

    /**
     * Delete Product Type Option
     * Delete a product type option by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteOption(Integer productTypeId, String attributeFQN) throws ApiException {
        deleteOptionWithHttpInfo(productTypeId, attributeFQN);
    }

    /**
     * Delete Product Type Option
     * Delete a product type option by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteOptionWithHttpInfo(Integer productTypeId, String attributeFQN) throws ApiException {
        okhttp3.Call localVarCall = deleteOptionValidateBeforeCall(productTypeId, attributeFQN, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Product Type Option (asynchronously)
     * Delete a product type option by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteOptionAsync(Integer productTypeId, String attributeFQN, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteOptionValidateBeforeCall(productTypeId, attributeFQN, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteProductType
     * @param productTypeId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteProductTypeCall(Integer productTypeId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()));

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
    private okhttp3.Call deleteProductTypeValidateBeforeCall(Integer productTypeId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling deleteProductType(Async)");
        }
        

        okhttp3.Call localVarCall = deleteProductTypeCall(productTypeId, _callback);
        return localVarCall;

    }

    /**
     * Delete Product Type
     * Delete product type.
     * @param productTypeId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteProductType(Integer productTypeId) throws ApiException {
        deleteProductTypeWithHttpInfo(productTypeId);
    }

    /**
     * Delete Product Type
     * Delete product type.
     * @param productTypeId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteProductTypeWithHttpInfo(Integer productTypeId) throws ApiException {
        okhttp3.Call localVarCall = deleteProductTypeValidateBeforeCall(productTypeId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Product Type (asynchronously)
     * Delete product type.
     * @param productTypeId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteProductTypeAsync(Integer productTypeId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteProductTypeValidateBeforeCall(productTypeId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteProperty
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePropertyCall(Integer productTypeId, String attributeFQN, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties/{attributeFQN}"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

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
    private okhttp3.Call deletePropertyValidateBeforeCall(Integer productTypeId, String attributeFQN, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling deleteProperty(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling deleteProperty(Async)");
        }
        

        okhttp3.Call localVarCall = deletePropertyCall(productTypeId, attributeFQN, _callback);
        return localVarCall;

    }

    /**
     * Delete Product Type Property
     * Delete a product type property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteProperty(Integer productTypeId, String attributeFQN) throws ApiException {
        deletePropertyWithHttpInfo(productTypeId, attributeFQN);
    }

    /**
     * Delete Product Type Property
     * Delete a product type property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deletePropertyWithHttpInfo(Integer productTypeId, String attributeFQN) throws ApiException {
        okhttp3.Call localVarCall = deletePropertyValidateBeforeCall(productTypeId, attributeFQN, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Product Type Property (asynchronously)
     * Delete a product type property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePropertyAsync(Integer productTypeId, String attributeFQN, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePropertyValidateBeforeCall(productTypeId, attributeFQN, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteVariantProperty
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteVariantPropertyCall(Integer productTypeId, String attributeFQN, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/VariantProperties/{attributeFQN}"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

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
    private okhttp3.Call deleteVariantPropertyValidateBeforeCall(Integer productTypeId, String attributeFQN, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling deleteVariantProperty(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling deleteVariantProperty(Async)");
        }
        

        okhttp3.Call localVarCall = deleteVariantPropertyCall(productTypeId, attributeFQN, _callback);
        return localVarCall;

    }

    /**
     * Delete Variant Product Type Property
     * Delete a variant property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteVariantProperty(Integer productTypeId, String attributeFQN) throws ApiException {
        deleteVariantPropertyWithHttpInfo(productTypeId, attributeFQN);
    }

    /**
     * Delete Variant Product Type Property
     * Delete a variant property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteVariantPropertyWithHttpInfo(Integer productTypeId, String attributeFQN) throws ApiException {
        okhttp3.Call localVarCall = deleteVariantPropertyValidateBeforeCall(productTypeId, attributeFQN, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Variant Product Type Property (asynchronously)
     * Delete a variant property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteVariantPropertyAsync(Integer productTypeId, String attributeFQN, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteVariantPropertyValidateBeforeCall(productTypeId, attributeFQN, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for generateProductVariations
     * @param productTypeId  (required)
     * @param productCode  (optional)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductOption  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call generateProductVariationsCall(Integer productTypeId, String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, List<CatalogAdminsProductOption> catalogAdminsProductOption, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsProductOption;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/variations"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (productCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("productCode", productCode));
        }

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
    private okhttp3.Call generateProductVariationsValidateBeforeCall(Integer productTypeId, String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, List<CatalogAdminsProductOption> catalogAdminsProductOption, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling generateProductVariations(Async)");
        }
        

        okhttp3.Call localVarCall = generateProductVariationsCall(productTypeId, productCode, startIndex, pageSize, sortBy, filter, responseFields, catalogAdminsProductOption, _callback);
        return localVarCall;

    }

    /**
     * Generate Product Variations
     * Generate product variations for a product type.
     * @param productTypeId  (required)
     * @param productCode  (optional)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductOption  (optional)
     * @return ProductVariationPagedCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductVariationPagedCollection generateProductVariations(Integer productTypeId, String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, List<CatalogAdminsProductOption> catalogAdminsProductOption) throws ApiException {
        ApiResponse<ProductVariationPagedCollection> localVarResp = generateProductVariationsWithHttpInfo(productTypeId, productCode, startIndex, pageSize, sortBy, filter, responseFields, catalogAdminsProductOption);
        return localVarResp.getData();
    }

    /**
     * Generate Product Variations
     * Generate product variations for a product type.
     * @param productTypeId  (required)
     * @param productCode  (optional)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductOption  (optional)
     * @return ApiResponse&lt;ProductVariationPagedCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductVariationPagedCollection> generateProductVariationsWithHttpInfo(Integer productTypeId, String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, List<CatalogAdminsProductOption> catalogAdminsProductOption) throws ApiException {
        okhttp3.Call localVarCall = generateProductVariationsValidateBeforeCall(productTypeId, productCode, startIndex, pageSize, sortBy, filter, responseFields, catalogAdminsProductOption, null);
        Type localVarReturnType = new TypeToken<ProductVariationPagedCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Generate Product Variations (asynchronously)
     * Generate product variations for a product type.
     * @param productTypeId  (required)
     * @param productCode  (optional)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductOption  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call generateProductVariationsAsync(Integer productTypeId, String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, List<CatalogAdminsProductOption> catalogAdminsProductOption, final ApiCallback<ProductVariationPagedCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = generateProductVariationsValidateBeforeCall(productTypeId, productCode, startIndex, pageSize, sortBy, filter, responseFields, catalogAdminsProductOption, _callback);
        Type localVarReturnType = new TypeToken<ProductVariationPagedCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getExtra
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
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
    public okhttp3.Call getExtraCall(Integer productTypeId, String attributeFQN, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Extras/{attributeFQN}"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

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
    private okhttp3.Call getExtraValidateBeforeCall(Integer productTypeId, String attributeFQN, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling getExtra(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getExtra(Async)");
        }
        

        okhttp3.Call localVarCall = getExtraCall(productTypeId, attributeFQN, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Type Extra
     * Get a product type extra.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return AttributeInProductType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AttributeInProductType getExtra(Integer productTypeId, String attributeFQN, String responseFields) throws ApiException {
        ApiResponse<AttributeInProductType> localVarResp = getExtraWithHttpInfo(productTypeId, attributeFQN, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Type Extra
     * Get a product type extra.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;AttributeInProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttributeInProductType> getExtraWithHttpInfo(Integer productTypeId, String attributeFQN, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getExtraValidateBeforeCall(productTypeId, attributeFQN, responseFields, null);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Type Extra (asynchronously)
     * Get a product type extra.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
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
    public okhttp3.Call getExtraAsync(Integer productTypeId, String attributeFQN, String responseFields, final ApiCallback<AttributeInProductType> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExtraValidateBeforeCall(productTypeId, attributeFQN, responseFields, _callback);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getExtras
     * @param productTypeId  (required)
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
    public okhttp3.Call getExtrasCall(Integer productTypeId, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Extras"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()));

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
    private okhttp3.Call getExtrasValidateBeforeCall(Integer productTypeId, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling getExtras(Async)");
        }
        

        okhttp3.Call localVarCall = getExtrasCall(productTypeId, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Type Extras
     * Get a list of product type extras.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return List&lt;AttributeInProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<AttributeInProductType> getExtras(Integer productTypeId, String responseFields) throws ApiException {
        ApiResponse<List<AttributeInProductType>> localVarResp = getExtrasWithHttpInfo(productTypeId, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Type Extras
     * Get a list of product type extras.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;List&lt;AttributeInProductType&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<AttributeInProductType>> getExtrasWithHttpInfo(Integer productTypeId, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getExtrasValidateBeforeCall(productTypeId, responseFields, null);
        Type localVarReturnType = new TypeToken<List<AttributeInProductType>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Type Extras (asynchronously)
     * Get a list of product type extras.
     * @param productTypeId  (required)
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
    public okhttp3.Call getExtrasAsync(Integer productTypeId, String responseFields, final ApiCallback<List<AttributeInProductType>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExtrasValidateBeforeCall(productTypeId, responseFields, _callback);
        Type localVarReturnType = new TypeToken<List<AttributeInProductType>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getOption
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
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
    public okhttp3.Call getOptionCall(Integer productTypeId, String attributeFQN, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Options/{attributeFQN}"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

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
    private okhttp3.Call getOptionValidateBeforeCall(Integer productTypeId, String attributeFQN, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling getOption(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getOption(Async)");
        }
        

        okhttp3.Call localVarCall = getOptionCall(productTypeId, attributeFQN, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Type Option
     * Get an individual product type option by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return AttributeInProductType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AttributeInProductType getOption(Integer productTypeId, String attributeFQN, String responseFields) throws ApiException {
        ApiResponse<AttributeInProductType> localVarResp = getOptionWithHttpInfo(productTypeId, attributeFQN, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Type Option
     * Get an individual product type option by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;AttributeInProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttributeInProductType> getOptionWithHttpInfo(Integer productTypeId, String attributeFQN, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getOptionValidateBeforeCall(productTypeId, attributeFQN, responseFields, null);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Type Option (asynchronously)
     * Get an individual product type option by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
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
    public okhttp3.Call getOptionAsync(Integer productTypeId, String attributeFQN, String responseFields, final ApiCallback<AttributeInProductType> _callback) throws ApiException {

        okhttp3.Call localVarCall = getOptionValidateBeforeCall(productTypeId, attributeFQN, responseFields, _callback);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getOptions
     * @param productTypeId  (required)
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
    public okhttp3.Call getOptionsCall(Integer productTypeId, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Options"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()));

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
    private okhttp3.Call getOptionsValidateBeforeCall(Integer productTypeId, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling getOptions(Async)");
        }
        

        okhttp3.Call localVarCall = getOptionsCall(productTypeId, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Type Options
     * Get options for the product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return List&lt;AttributeInProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<AttributeInProductType> getOptions(Integer productTypeId, String responseFields) throws ApiException {
        ApiResponse<List<AttributeInProductType>> localVarResp = getOptionsWithHttpInfo(productTypeId, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Type Options
     * Get options for the product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;List&lt;AttributeInProductType&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<AttributeInProductType>> getOptionsWithHttpInfo(Integer productTypeId, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getOptionsValidateBeforeCall(productTypeId, responseFields, null);
        Type localVarReturnType = new TypeToken<List<AttributeInProductType>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Type Options (asynchronously)
     * Get options for the product type.
     * @param productTypeId  (required)
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
    public okhttp3.Call getOptionsAsync(Integer productTypeId, String responseFields, final ApiCallback<List<AttributeInProductType>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getOptionsValidateBeforeCall(productTypeId, responseFields, _callback);
        Type localVarReturnType = new TypeToken<List<AttributeInProductType>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProductType
     * @param productTypeId  (required)
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
    public okhttp3.Call getProductTypeCall(Integer productTypeId, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()));

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
    private okhttp3.Call getProductTypeValidateBeforeCall(Integer productTypeId, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling getProductType(Async)");
        }
        

        okhttp3.Call localVarCall = getProductTypeCall(productTypeId, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Type
     * Get product type by Id.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ProductType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductType getProductType(Integer productTypeId, String responseFields) throws ApiException {
        ApiResponse<ProductType> localVarResp = getProductTypeWithHttpInfo(productTypeId, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Type
     * Get product type by Id.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;ProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductType> getProductTypeWithHttpInfo(Integer productTypeId, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProductTypeValidateBeforeCall(productTypeId, responseFields, null);
        Type localVarReturnType = new TypeToken<ProductType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Type (asynchronously)
     * Get product type by Id.
     * @param productTypeId  (required)
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
    public okhttp3.Call getProductTypeAsync(Integer productTypeId, String responseFields, final ApiCallback<ProductType> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductTypeValidateBeforeCall(productTypeId, responseFields, _callback);
        Type localVarReturnType = new TypeToken<ProductType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProductTypes
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a single query. The default value is 20 and the maximum value is 200. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending or descending order. For example, to sort the results by “ID” ascending then by “CreateDate” descending, use: id asc,createdate desc. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param responseGroups Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode. (optional)
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
    public okhttp3.Call getProductTypesCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes";

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
    private okhttp3.Call getProductTypesValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getProductTypesCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Types
     * Retrieves a list of product types according to any specified filter criteria and sort options.
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a single query. The default value is 20 and the maximum value is 200. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending or descending order. For example, to sort the results by “ID” ascending then by “CreateDate” descending, use: id asc,createdate desc. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param responseGroups Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ProductTypeCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductTypeCollection getProductTypes(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<ProductTypeCollection> localVarResp = getProductTypesWithHttpInfo(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Types
     * Retrieves a list of product types according to any specified filter criteria and sort options.
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a single query. The default value is 20 and the maximum value is 200. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending or descending order. For example, to sort the results by “ID” ascending then by “CreateDate” descending, use: id asc,createdate desc. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param responseGroups Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;ProductTypeCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductTypeCollection> getProductTypesWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProductTypesValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<ProductTypeCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Types (asynchronously)
     * Retrieves a list of product types according to any specified filter criteria and sort options.
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a single query. The default value is 20 and the maximum value is 200. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending or descending order. For example, to sort the results by “ID” ascending then by “CreateDate” descending, use: id asc,createdate desc. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param responseGroups Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode. (optional)
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
    public okhttp3.Call getProductTypesAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback<ProductTypeCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductTypesValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<ProductTypeCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProperties
     * @param productTypeId  (required)
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
    public okhttp3.Call getPropertiesCall(Integer productTypeId, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()));

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
    private okhttp3.Call getPropertiesValidateBeforeCall(Integer productTypeId, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling getProperties(Async)");
        }
        

        okhttp3.Call localVarCall = getPropertiesCall(productTypeId, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Type Properties
     * Get properties of a product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return List&lt;AttributeInProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<AttributeInProductType> getProperties(Integer productTypeId, String responseFields) throws ApiException {
        ApiResponse<List<AttributeInProductType>> localVarResp = getPropertiesWithHttpInfo(productTypeId, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Type Properties
     * Get properties of a product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;List&lt;AttributeInProductType&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<AttributeInProductType>> getPropertiesWithHttpInfo(Integer productTypeId, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getPropertiesValidateBeforeCall(productTypeId, responseFields, null);
        Type localVarReturnType = new TypeToken<List<AttributeInProductType>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Type Properties (asynchronously)
     * Get properties of a product type.
     * @param productTypeId  (required)
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
    public okhttp3.Call getPropertiesAsync(Integer productTypeId, String responseFields, final ApiCallback<List<AttributeInProductType>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPropertiesValidateBeforeCall(productTypeId, responseFields, _callback);
        Type localVarReturnType = new TypeToken<List<AttributeInProductType>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProperty
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
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
    public okhttp3.Call getPropertyCall(Integer productTypeId, String attributeFQN, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties/{attributeFQN}"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

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
    private okhttp3.Call getPropertyValidateBeforeCall(Integer productTypeId, String attributeFQN, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling getProperty(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getProperty(Async)");
        }
        

        okhttp3.Call localVarCall = getPropertyCall(productTypeId, attributeFQN, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Type Property
     * Get a product type property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return AttributeInProductType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AttributeInProductType getProperty(Integer productTypeId, String attributeFQN, String responseFields) throws ApiException {
        ApiResponse<AttributeInProductType> localVarResp = getPropertyWithHttpInfo(productTypeId, attributeFQN, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Type Property
     * Get a product type property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;AttributeInProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttributeInProductType> getPropertyWithHttpInfo(Integer productTypeId, String attributeFQN, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getPropertyValidateBeforeCall(productTypeId, attributeFQN, responseFields, null);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Type Property (asynchronously)
     * Get a product type property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
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
    public okhttp3.Call getPropertyAsync(Integer productTypeId, String attributeFQN, String responseFields, final ApiCallback<AttributeInProductType> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPropertyValidateBeforeCall(productTypeId, attributeFQN, responseFields, _callback);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVariantProperties
     * @param productTypeId  (required)
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
    public okhttp3.Call getVariantPropertiesCall(Integer productTypeId, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/VariantProperties"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()));

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
    private okhttp3.Call getVariantPropertiesValidateBeforeCall(Integer productTypeId, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling getVariantProperties(Async)");
        }
        

        okhttp3.Call localVarCall = getVariantPropertiesCall(productTypeId, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Variant Product Type Properties
     * Get variant properties for a product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return List&lt;AttributeInProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<AttributeInProductType> getVariantProperties(Integer productTypeId, String responseFields) throws ApiException {
        ApiResponse<List<AttributeInProductType>> localVarResp = getVariantPropertiesWithHttpInfo(productTypeId, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Variant Product Type Properties
     * Get variant properties for a product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;List&lt;AttributeInProductType&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<AttributeInProductType>> getVariantPropertiesWithHttpInfo(Integer productTypeId, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getVariantPropertiesValidateBeforeCall(productTypeId, responseFields, null);
        Type localVarReturnType = new TypeToken<List<AttributeInProductType>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Variant Product Type Properties (asynchronously)
     * Get variant properties for a product type.
     * @param productTypeId  (required)
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
    public okhttp3.Call getVariantPropertiesAsync(Integer productTypeId, String responseFields, final ApiCallback<List<AttributeInProductType>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getVariantPropertiesValidateBeforeCall(productTypeId, responseFields, _callback);
        Type localVarReturnType = new TypeToken<List<AttributeInProductType>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVariantProperty
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
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
    public okhttp3.Call getVariantPropertyCall(Integer productTypeId, String attributeFQN, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/VariantProperties/{attributeFQN}"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

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
    private okhttp3.Call getVariantPropertyValidateBeforeCall(Integer productTypeId, String attributeFQN, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling getVariantProperty(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getVariantProperty(Async)");
        }
        

        okhttp3.Call localVarCall = getVariantPropertyCall(productTypeId, attributeFQN, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Variant Product Type Property
     * Get a variant property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return AttributeInProductType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AttributeInProductType getVariantProperty(Integer productTypeId, String attributeFQN, String responseFields) throws ApiException {
        ApiResponse<AttributeInProductType> localVarResp = getVariantPropertyWithHttpInfo(productTypeId, attributeFQN, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Variant Product Type Property
     * Get a variant property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;AttributeInProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttributeInProductType> getVariantPropertyWithHttpInfo(Integer productTypeId, String attributeFQN, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getVariantPropertyValidateBeforeCall(productTypeId, attributeFQN, responseFields, null);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Variant Product Type Property (asynchronously)
     * Get a variant property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
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
    public okhttp3.Call getVariantPropertyAsync(Integer productTypeId, String attributeFQN, String responseFields, final ApiCallback<AttributeInProductType> _callback) throws ApiException {

        okhttp3.Call localVarCall = getVariantPropertyValidateBeforeCall(productTypeId, attributeFQN, responseFields, _callback);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateExtra
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateExtraCall(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = attributeInProductType;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Extras/{attributeFQN}"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

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
    private okhttp3.Call updateExtraValidateBeforeCall(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling updateExtra(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updateExtra(Async)");
        }
        

        okhttp3.Call localVarCall = updateExtraCall(productTypeId, attributeFQN, responseFields, attributeInProductType, _callback);
        return localVarCall;

    }

    /**
     * Update Product Type Extra
     * Update a product type extra
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @return AttributeInProductType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AttributeInProductType updateExtra(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType) throws ApiException {
        ApiResponse<AttributeInProductType> localVarResp = updateExtraWithHttpInfo(productTypeId, attributeFQN, responseFields, attributeInProductType);
        return localVarResp.getData();
    }

    /**
     * Update Product Type Extra
     * Update a product type extra
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @return ApiResponse&lt;AttributeInProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttributeInProductType> updateExtraWithHttpInfo(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType) throws ApiException {
        okhttp3.Call localVarCall = updateExtraValidateBeforeCall(productTypeId, attributeFQN, responseFields, attributeInProductType, null);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product Type Extra (asynchronously)
     * Update a product type extra
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateExtraAsync(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback<AttributeInProductType> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateExtraValidateBeforeCall(productTypeId, attributeFQN, responseFields, attributeInProductType, _callback);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateOption
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateOptionCall(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = attributeInProductType;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Options/{attributeFQN}"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

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
    private okhttp3.Call updateOptionValidateBeforeCall(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling updateOption(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updateOption(Async)");
        }
        

        okhttp3.Call localVarCall = updateOptionCall(productTypeId, attributeFQN, responseFields, attributeInProductType, _callback);
        return localVarCall;

    }

    /**
     * Update Product Type Option
     * Update a product option type by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @return AttributeInProductType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AttributeInProductType updateOption(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType) throws ApiException {
        ApiResponse<AttributeInProductType> localVarResp = updateOptionWithHttpInfo(productTypeId, attributeFQN, responseFields, attributeInProductType);
        return localVarResp.getData();
    }

    /**
     * Update Product Type Option
     * Update a product option type by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @return ApiResponse&lt;AttributeInProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttributeInProductType> updateOptionWithHttpInfo(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType) throws ApiException {
        okhttp3.Call localVarCall = updateOptionValidateBeforeCall(productTypeId, attributeFQN, responseFields, attributeInProductType, null);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product Type Option (asynchronously)
     * Update a product option type by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateOptionAsync(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback<AttributeInProductType> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateOptionValidateBeforeCall(productTypeId, attributeFQN, responseFields, attributeInProductType, _callback);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProductType
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productType  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductTypeCall(Integer productTypeId, String responseFields, ProductType productType, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productType;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()));

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
    private okhttp3.Call updateProductTypeValidateBeforeCall(Integer productTypeId, String responseFields, ProductType productType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling updateProductType(Async)");
        }
        

        okhttp3.Call localVarCall = updateProductTypeCall(productTypeId, responseFields, productType, _callback);
        return localVarCall;

    }

    /**
     * Update Product Type
     * Update product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productType  (optional)
     * @return ProductType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductType updateProductType(Integer productTypeId, String responseFields, ProductType productType) throws ApiException {
        ApiResponse<ProductType> localVarResp = updateProductTypeWithHttpInfo(productTypeId, responseFields, productType);
        return localVarResp.getData();
    }

    /**
     * Update Product Type
     * Update product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productType  (optional)
     * @return ApiResponse&lt;ProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductType> updateProductTypeWithHttpInfo(Integer productTypeId, String responseFields, ProductType productType) throws ApiException {
        okhttp3.Call localVarCall = updateProductTypeValidateBeforeCall(productTypeId, responseFields, productType, null);
        Type localVarReturnType = new TypeToken<ProductType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product Type (asynchronously)
     * Update product type.
     * @param productTypeId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productType  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductTypeAsync(Integer productTypeId, String responseFields, ProductType productType, final ApiCallback<ProductType> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProductTypeValidateBeforeCall(productTypeId, responseFields, productType, _callback);
        Type localVarReturnType = new TypeToken<ProductType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProperty
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePropertyCall(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = attributeInProductType;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties/{attributeFQN}"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

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
    private okhttp3.Call updatePropertyValidateBeforeCall(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling updateProperty(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updateProperty(Async)");
        }
        

        okhttp3.Call localVarCall = updatePropertyCall(productTypeId, attributeFQN, responseFields, attributeInProductType, _callback);
        return localVarCall;

    }

    /**
     * Update Product Type Property
     * Update a product type property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @return AttributeInProductType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AttributeInProductType updateProperty(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType) throws ApiException {
        ApiResponse<AttributeInProductType> localVarResp = updatePropertyWithHttpInfo(productTypeId, attributeFQN, responseFields, attributeInProductType);
        return localVarResp.getData();
    }

    /**
     * Update Product Type Property
     * Update a product type property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @return ApiResponse&lt;AttributeInProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttributeInProductType> updatePropertyWithHttpInfo(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType) throws ApiException {
        okhttp3.Call localVarCall = updatePropertyValidateBeforeCall(productTypeId, attributeFQN, responseFields, attributeInProductType, null);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product Type Property (asynchronously)
     * Update a product type property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePropertyAsync(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback<AttributeInProductType> _callback) throws ApiException {

        okhttp3.Call localVarCall = updatePropertyValidateBeforeCall(productTypeId, attributeFQN, responseFields, attributeInProductType, _callback);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateVariantProperty
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateVariantPropertyCall(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = attributeInProductType;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/VariantProperties/{attributeFQN}"
            .replaceAll("\\{" + "productTypeId" + "\\}", localVarApiClient.escapeString(productTypeId.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

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
    private okhttp3.Call updateVariantPropertyValidateBeforeCall(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productTypeId' is set
        if (productTypeId == null) {
            throw new ApiException("Missing the required parameter 'productTypeId' when calling updateVariantProperty(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updateVariantProperty(Async)");
        }
        

        okhttp3.Call localVarCall = updateVariantPropertyCall(productTypeId, attributeFQN, responseFields, attributeInProductType, _callback);
        return localVarCall;

    }

    /**
     * Update Variant Product Type Property
     * Update a variant property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @return AttributeInProductType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AttributeInProductType updateVariantProperty(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType) throws ApiException {
        ApiResponse<AttributeInProductType> localVarResp = updateVariantPropertyWithHttpInfo(productTypeId, attributeFQN, responseFields, attributeInProductType);
        return localVarResp.getData();
    }

    /**
     * Update Variant Product Type Property
     * Update a variant property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @return ApiResponse&lt;AttributeInProductType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttributeInProductType> updateVariantPropertyWithHttpInfo(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType) throws ApiException {
        okhttp3.Call localVarCall = updateVariantPropertyValidateBeforeCall(productTypeId, attributeFQN, responseFields, attributeInProductType, null);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Variant Product Type Property (asynchronously)
     * Update a variant property by its FQN.
     * @param productTypeId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeInProductType  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateVariantPropertyAsync(Integer productTypeId, String attributeFQN, String responseFields, AttributeInProductType attributeInProductType, final ApiCallback<AttributeInProductType> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateVariantPropertyValidateBeforeCall(productTypeId, attributeFQN, responseFields, attributeInProductType, _callback);
        Type localVarReturnType = new TypeToken<AttributeInProductType>(){}.getType();
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
        public ProductTypesApi build() {
            return new ProductTypesApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
