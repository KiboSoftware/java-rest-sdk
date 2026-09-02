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


import com.kibocommerce.sdk.catalogadministration.models.ProductVariation;
import com.kibocommerce.sdk.catalogadministration.models.ProductVariationCollection;
import com.kibocommerce.sdk.catalogadministration.models.ProductVariationDeltaPrice;
import com.kibocommerce.sdk.catalogadministration.models.ProductVariationFixedPrice;
import com.kibocommerce.sdk.catalogadministration.models.ProductVariationPagedCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ProductVariationsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public ProductVariationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductVariationsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public ProductVariationsApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public ProductVariationsApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public ProductVariationsApi(Builder builder) {
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
     * Build call for addProductVariationLocalizedDeltaPrice
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationDeltaPrice  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addProductVariationLocalizedDeltaPriceCall(String productCode, String variationKey, String responseFields, ProductVariationDeltaPrice productVariationDeltaPrice, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productVariationDeltaPrice;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "variationKey" + "\\}", localVarApiClient.escapeString(variationKey.toString()));

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
    private okhttp3.Call addProductVariationLocalizedDeltaPriceValidateBeforeCall(String productCode, String variationKey, String responseFields, ProductVariationDeltaPrice productVariationDeltaPrice, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling addProductVariationLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'variationKey' is set
        if (variationKey == null) {
            throw new ApiException("Missing the required parameter 'variationKey' when calling addProductVariationLocalizedDeltaPrice(Async)");
        }
        

        okhttp3.Call localVarCall = addProductVariationLocalizedDeltaPriceCall(productCode, variationKey, responseFields, productVariationDeltaPrice, _callback);
        return localVarCall;

    }

    /**
     * Add Product Variation Localized Delta Price
     * Add a product variation localized delta price.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationDeltaPrice  (optional)
     * @return ProductVariationDeltaPrice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductVariationDeltaPrice addProductVariationLocalizedDeltaPrice(String productCode, String variationKey, String responseFields, ProductVariationDeltaPrice productVariationDeltaPrice) throws ApiException {
        ApiResponse<ProductVariationDeltaPrice> localVarResp = addProductVariationLocalizedDeltaPriceWithHttpInfo(productCode, variationKey, responseFields, productVariationDeltaPrice);
        return localVarResp.getData();
    }

    /**
     * Add Product Variation Localized Delta Price
     * Add a product variation localized delta price.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationDeltaPrice  (optional)
     * @return ApiResponse&lt;ProductVariationDeltaPrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductVariationDeltaPrice> addProductVariationLocalizedDeltaPriceWithHttpInfo(String productCode, String variationKey, String responseFields, ProductVariationDeltaPrice productVariationDeltaPrice) throws ApiException {
        okhttp3.Call localVarCall = addProductVariationLocalizedDeltaPriceValidateBeforeCall(productCode, variationKey, responseFields, productVariationDeltaPrice, null);
        Type localVarReturnType = new TypeToken<ProductVariationDeltaPrice>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Product Variation Localized Delta Price (asynchronously)
     * Add a product variation localized delta price.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationDeltaPrice  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addProductVariationLocalizedDeltaPriceAsync(String productCode, String variationKey, String responseFields, ProductVariationDeltaPrice productVariationDeltaPrice, final ApiCallback<ProductVariationDeltaPrice> _callback) throws ApiException {

        okhttp3.Call localVarCall = addProductVariationLocalizedDeltaPriceValidateBeforeCall(productCode, variationKey, responseFields, productVariationDeltaPrice, _callback);
        Type localVarReturnType = new TypeToken<ProductVariationDeltaPrice>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addProductVariationLocalizedPrice
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationFixedPrice  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addProductVariationLocalizedPriceCall(String productCode, String variationKey, String responseFields, ProductVariationFixedPrice productVariationFixedPrice, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productVariationFixedPrice;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "variationKey" + "\\}", localVarApiClient.escapeString(variationKey.toString()));

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
    private okhttp3.Call addProductVariationLocalizedPriceValidateBeforeCall(String productCode, String variationKey, String responseFields, ProductVariationFixedPrice productVariationFixedPrice, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling addProductVariationLocalizedPrice(Async)");
        }
        
        // verify the required parameter 'variationKey' is set
        if (variationKey == null) {
            throw new ApiException("Missing the required parameter 'variationKey' when calling addProductVariationLocalizedPrice(Async)");
        }
        

        okhttp3.Call localVarCall = addProductVariationLocalizedPriceCall(productCode, variationKey, responseFields, productVariationFixedPrice, _callback);
        return localVarCall;

    }

    /**
     * Add Product Variation Localized Price
     * Add a product variation localized price.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationFixedPrice  (optional)
     * @return ProductVariationFixedPrice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductVariationFixedPrice addProductVariationLocalizedPrice(String productCode, String variationKey, String responseFields, ProductVariationFixedPrice productVariationFixedPrice) throws ApiException {
        ApiResponse<ProductVariationFixedPrice> localVarResp = addProductVariationLocalizedPriceWithHttpInfo(productCode, variationKey, responseFields, productVariationFixedPrice);
        return localVarResp.getData();
    }

    /**
     * Add Product Variation Localized Price
     * Add a product variation localized price.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationFixedPrice  (optional)
     * @return ApiResponse&lt;ProductVariationFixedPrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductVariationFixedPrice> addProductVariationLocalizedPriceWithHttpInfo(String productCode, String variationKey, String responseFields, ProductVariationFixedPrice productVariationFixedPrice) throws ApiException {
        okhttp3.Call localVarCall = addProductVariationLocalizedPriceValidateBeforeCall(productCode, variationKey, responseFields, productVariationFixedPrice, null);
        Type localVarReturnType = new TypeToken<ProductVariationFixedPrice>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Product Variation Localized Price (asynchronously)
     * Add a product variation localized price.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationFixedPrice  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addProductVariationLocalizedPriceAsync(String productCode, String variationKey, String responseFields, ProductVariationFixedPrice productVariationFixedPrice, final ApiCallback<ProductVariationFixedPrice> _callback) throws ApiException {

        okhttp3.Call localVarCall = addProductVariationLocalizedPriceValidateBeforeCall(productCode, variationKey, responseFields, productVariationFixedPrice, _callback);
        Type localVarReturnType = new TypeToken<ProductVariationFixedPrice>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteProductVariation
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param variationKey Unique identifier for a single product variation. System-supplied and read-only. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteProductVariationCall(String productCode, String variationKey, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/variations/{variationKey}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "variationKey" + "\\}", localVarApiClient.escapeString(variationKey.toString()));

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
    private okhttp3.Call deleteProductVariationValidateBeforeCall(String productCode, String variationKey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling deleteProductVariation(Async)");
        }
        
        // verify the required parameter 'variationKey' is set
        if (variationKey == null) {
            throw new ApiException("Missing the required parameter 'variationKey' when calling deleteProductVariation(Async)");
        }
        

        okhttp3.Call localVarCall = deleteProductVariationCall(productCode, variationKey, _callback);
        return localVarCall;

    }

    /**
     * Delete Product Variation
     * Deletes an existing product variation. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param variationKey Unique identifier for a single product variation. System-supplied and read-only. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteProductVariation(String productCode, String variationKey) throws ApiException {
        deleteProductVariationWithHttpInfo(productCode, variationKey);
    }

    /**
     * Delete Product Variation
     * Deletes an existing product variation. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param variationKey Unique identifier for a single product variation. System-supplied and read-only. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteProductVariationWithHttpInfo(String productCode, String variationKey) throws ApiException {
        okhttp3.Call localVarCall = deleteProductVariationValidateBeforeCall(productCode, variationKey, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Product Variation (asynchronously)
     * Deletes an existing product variation. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param variationKey Unique identifier for a single product variation. System-supplied and read-only. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteProductVariationAsync(String productCode, String variationKey, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteProductVariationValidateBeforeCall(productCode, variationKey, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteProductVariationLocalizedDeltaPrice
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteProductVariationLocalizedDeltaPriceCall(String productCode, String variationKey, String currencyCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice/{currencyCode}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "variationKey" + "\\}", localVarApiClient.escapeString(variationKey.toString()))
            .replaceAll("\\{" + "currencyCode" + "\\}", localVarApiClient.escapeString(currencyCode.toString()));

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
    private okhttp3.Call deleteProductVariationLocalizedDeltaPriceValidateBeforeCall(String productCode, String variationKey, String currencyCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling deleteProductVariationLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'variationKey' is set
        if (variationKey == null) {
            throw new ApiException("Missing the required parameter 'variationKey' when calling deleteProductVariationLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling deleteProductVariationLocalizedDeltaPrice(Async)");
        }
        

        okhttp3.Call localVarCall = deleteProductVariationLocalizedDeltaPriceCall(productCode, variationKey, currencyCode, _callback);
        return localVarCall;

    }

    /**
     * Delete Product Variation Localized Delta Price
     * Delete the product variation localized delta prices for a specific currency.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteProductVariationLocalizedDeltaPrice(String productCode, String variationKey, String currencyCode) throws ApiException {
        deleteProductVariationLocalizedDeltaPriceWithHttpInfo(productCode, variationKey, currencyCode);
    }

    /**
     * Delete Product Variation Localized Delta Price
     * Delete the product variation localized delta prices for a specific currency.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteProductVariationLocalizedDeltaPriceWithHttpInfo(String productCode, String variationKey, String currencyCode) throws ApiException {
        okhttp3.Call localVarCall = deleteProductVariationLocalizedDeltaPriceValidateBeforeCall(productCode, variationKey, currencyCode, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Product Variation Localized Delta Price (asynchronously)
     * Delete the product variation localized delta prices for a specific currency.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteProductVariationLocalizedDeltaPriceAsync(String productCode, String variationKey, String currencyCode, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteProductVariationLocalizedDeltaPriceValidateBeforeCall(productCode, variationKey, currencyCode, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteProductVariationLocalizedPrice
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteProductVariationLocalizedPriceCall(String productCode, String variationKey, String currencyCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice/{currencyCode}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "variationKey" + "\\}", localVarApiClient.escapeString(variationKey.toString()))
            .replaceAll("\\{" + "currencyCode" + "\\}", localVarApiClient.escapeString(currencyCode.toString()));

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
    private okhttp3.Call deleteProductVariationLocalizedPriceValidateBeforeCall(String productCode, String variationKey, String currencyCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling deleteProductVariationLocalizedPrice(Async)");
        }
        
        // verify the required parameter 'variationKey' is set
        if (variationKey == null) {
            throw new ApiException("Missing the required parameter 'variationKey' when calling deleteProductVariationLocalizedPrice(Async)");
        }
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling deleteProductVariationLocalizedPrice(Async)");
        }
        

        okhttp3.Call localVarCall = deleteProductVariationLocalizedPriceCall(productCode, variationKey, currencyCode, _callback);
        return localVarCall;

    }

    /**
     * Delete Product Variation Localized Price by Currency
     * Delete the product variation localized price for a specific currency code.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteProductVariationLocalizedPrice(String productCode, String variationKey, String currencyCode) throws ApiException {
        deleteProductVariationLocalizedPriceWithHttpInfo(productCode, variationKey, currencyCode);
    }

    /**
     * Delete Product Variation Localized Price by Currency
     * Delete the product variation localized price for a specific currency code.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteProductVariationLocalizedPriceWithHttpInfo(String productCode, String variationKey, String currencyCode) throws ApiException {
        okhttp3.Call localVarCall = deleteProductVariationLocalizedPriceValidateBeforeCall(productCode, variationKey, currencyCode, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Product Variation Localized Price by Currency (asynchronously)
     * Delete the product variation localized price for a specific currency code.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteProductVariationLocalizedPriceAsync(String productCode, String variationKey, String currencyCode, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteProductVariationLocalizedPriceValidateBeforeCall(productCode, variationKey, currencyCode, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProductVariation
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param variationKey Unique identifier for a single product variation. System-supplied and read-only. (required)
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
    public okhttp3.Call getProductVariationCall(String productCode, String variationKey, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/variations/{variationKey}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "variationKey" + "\\}", localVarApiClient.escapeString(variationKey.toString()));

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
    private okhttp3.Call getProductVariationValidateBeforeCall(String productCode, String variationKey, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getProductVariation(Async)");
        }
        
        // verify the required parameter 'variationKey' is set
        if (variationKey == null) {
            throw new ApiException("Missing the required parameter 'variationKey' when calling getProductVariation(Async)");
        }
        

        okhttp3.Call localVarCall = getProductVariationCall(productCode, variationKey, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Variation
     * Retrieves an existing product variation for a specific product and variation key. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param variationKey Unique identifier for a single product variation. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ProductVariation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductVariation getProductVariation(String productCode, String variationKey, String responseFields) throws ApiException {
        ApiResponse<ProductVariation> localVarResp = getProductVariationWithHttpInfo(productCode, variationKey, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Variation
     * Retrieves an existing product variation for a specific product and variation key. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param variationKey Unique identifier for a single product variation. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;ProductVariation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductVariation> getProductVariationWithHttpInfo(String productCode, String variationKey, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProductVariationValidateBeforeCall(productCode, variationKey, responseFields, null);
        Type localVarReturnType = new TypeToken<ProductVariation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Variation (asynchronously)
     * Retrieves an existing product variation for a specific product and variation key. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param variationKey Unique identifier for a single product variation. System-supplied and read-only. (required)
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
    public okhttp3.Call getProductVariationAsync(String productCode, String variationKey, String responseFields, final ApiCallback<ProductVariation> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductVariationValidateBeforeCall(productCode, variationKey, responseFields, _callback);
        Type localVarReturnType = new TypeToken<ProductVariation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProductVariationLocalizedDeltaPrice
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
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
    public okhttp3.Call getProductVariationLocalizedDeltaPriceCall(String productCode, String variationKey, String currencyCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice/{currencyCode}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "variationKey" + "\\}", localVarApiClient.escapeString(variationKey.toString()))
            .replaceAll("\\{" + "currencyCode" + "\\}", localVarApiClient.escapeString(currencyCode.toString()));

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
    private okhttp3.Call getProductVariationLocalizedDeltaPriceValidateBeforeCall(String productCode, String variationKey, String currencyCode, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getProductVariationLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'variationKey' is set
        if (variationKey == null) {
            throw new ApiException("Missing the required parameter 'variationKey' when calling getProductVariationLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling getProductVariationLocalizedDeltaPrice(Async)");
        }
        

        okhttp3.Call localVarCall = getProductVariationLocalizedDeltaPriceCall(productCode, variationKey, currencyCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Variation Localized Delta Price
     * Retrieve the product variation localized delta prices for a specific currency.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ProductVariationDeltaPrice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductVariationDeltaPrice getProductVariationLocalizedDeltaPrice(String productCode, String variationKey, String currencyCode, String responseFields) throws ApiException {
        ApiResponse<ProductVariationDeltaPrice> localVarResp = getProductVariationLocalizedDeltaPriceWithHttpInfo(productCode, variationKey, currencyCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Variation Localized Delta Price
     * Retrieve the product variation localized delta prices for a specific currency.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;ProductVariationDeltaPrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductVariationDeltaPrice> getProductVariationLocalizedDeltaPriceWithHttpInfo(String productCode, String variationKey, String currencyCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProductVariationLocalizedDeltaPriceValidateBeforeCall(productCode, variationKey, currencyCode, responseFields, null);
        Type localVarReturnType = new TypeToken<ProductVariationDeltaPrice>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Variation Localized Delta Price (asynchronously)
     * Retrieve the product variation localized delta prices for a specific currency.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
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
    public okhttp3.Call getProductVariationLocalizedDeltaPriceAsync(String productCode, String variationKey, String currencyCode, String responseFields, final ApiCallback<ProductVariationDeltaPrice> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductVariationLocalizedDeltaPriceValidateBeforeCall(productCode, variationKey, currencyCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<ProductVariationDeltaPrice>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProductVariationLocalizedDeltaPrices
     * @param productCode  (required)
     * @param variationKey  (required)
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
    public okhttp3.Call getProductVariationLocalizedDeltaPricesCall(String productCode, String variationKey, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "variationKey" + "\\}", localVarApiClient.escapeString(variationKey.toString()));

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
    private okhttp3.Call getProductVariationLocalizedDeltaPricesValidateBeforeCall(String productCode, String variationKey, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getProductVariationLocalizedDeltaPrices(Async)");
        }
        
        // verify the required parameter 'variationKey' is set
        if (variationKey == null) {
            throw new ApiException("Missing the required parameter 'variationKey' when calling getProductVariationLocalizedDeltaPrices(Async)");
        }
        

        okhttp3.Call localVarCall = getProductVariationLocalizedDeltaPricesCall(productCode, variationKey, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Variation Localized Delta Prices
     * Get product variation localized delta prices.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return List&lt;ProductVariationDeltaPrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ProductVariationDeltaPrice> getProductVariationLocalizedDeltaPrices(String productCode, String variationKey, String responseFields) throws ApiException {
        ApiResponse<List<ProductVariationDeltaPrice>> localVarResp = getProductVariationLocalizedDeltaPricesWithHttpInfo(productCode, variationKey, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Variation Localized Delta Prices
     * Get product variation localized delta prices.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;List&lt;ProductVariationDeltaPrice&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ProductVariationDeltaPrice>> getProductVariationLocalizedDeltaPricesWithHttpInfo(String productCode, String variationKey, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProductVariationLocalizedDeltaPricesValidateBeforeCall(productCode, variationKey, responseFields, null);
        Type localVarReturnType = new TypeToken<List<ProductVariationDeltaPrice>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Variation Localized Delta Prices (asynchronously)
     * Get product variation localized delta prices.
     * @param productCode  (required)
     * @param variationKey  (required)
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
    public okhttp3.Call getProductVariationLocalizedDeltaPricesAsync(String productCode, String variationKey, String responseFields, final ApiCallback<List<ProductVariationDeltaPrice>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductVariationLocalizedDeltaPricesValidateBeforeCall(productCode, variationKey, responseFields, _callback);
        Type localVarReturnType = new TypeToken<List<ProductVariationDeltaPrice>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProductVariationLocalizedPrice
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
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
    public okhttp3.Call getProductVariationLocalizedPriceCall(String productCode, String variationKey, String currencyCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice/{currencyCode}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "variationKey" + "\\}", localVarApiClient.escapeString(variationKey.toString()))
            .replaceAll("\\{" + "currencyCode" + "\\}", localVarApiClient.escapeString(currencyCode.toString()));

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
    private okhttp3.Call getProductVariationLocalizedPriceValidateBeforeCall(String productCode, String variationKey, String currencyCode, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getProductVariationLocalizedPrice(Async)");
        }
        
        // verify the required parameter 'variationKey' is set
        if (variationKey == null) {
            throw new ApiException("Missing the required parameter 'variationKey' when calling getProductVariationLocalizedPrice(Async)");
        }
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling getProductVariationLocalizedPrice(Async)");
        }
        

        okhttp3.Call localVarCall = getProductVariationLocalizedPriceCall(productCode, variationKey, currencyCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Variation Localized Price by Currency
     * Get the product variation localized price for a specific currency code.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ProductVariationFixedPrice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductVariationFixedPrice getProductVariationLocalizedPrice(String productCode, String variationKey, String currencyCode, String responseFields) throws ApiException {
        ApiResponse<ProductVariationFixedPrice> localVarResp = getProductVariationLocalizedPriceWithHttpInfo(productCode, variationKey, currencyCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Variation Localized Price by Currency
     * Get the product variation localized price for a specific currency code.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;ProductVariationFixedPrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductVariationFixedPrice> getProductVariationLocalizedPriceWithHttpInfo(String productCode, String variationKey, String currencyCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProductVariationLocalizedPriceValidateBeforeCall(productCode, variationKey, currencyCode, responseFields, null);
        Type localVarReturnType = new TypeToken<ProductVariationFixedPrice>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Variation Localized Price by Currency (asynchronously)
     * Get the product variation localized price for a specific currency code.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
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
    public okhttp3.Call getProductVariationLocalizedPriceAsync(String productCode, String variationKey, String currencyCode, String responseFields, final ApiCallback<ProductVariationFixedPrice> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductVariationLocalizedPriceValidateBeforeCall(productCode, variationKey, currencyCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<ProductVariationFixedPrice>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProductVariationLocalizedPrices
     * @param productCode  (required)
     * @param variationKey  (required)
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
    public okhttp3.Call getProductVariationLocalizedPricesCall(String productCode, String variationKey, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "variationKey" + "\\}", localVarApiClient.escapeString(variationKey.toString()));

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
    private okhttp3.Call getProductVariationLocalizedPricesValidateBeforeCall(String productCode, String variationKey, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getProductVariationLocalizedPrices(Async)");
        }
        
        // verify the required parameter 'variationKey' is set
        if (variationKey == null) {
            throw new ApiException("Missing the required parameter 'variationKey' when calling getProductVariationLocalizedPrices(Async)");
        }
        

        okhttp3.Call localVarCall = getProductVariationLocalizedPricesCall(productCode, variationKey, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Variation Localized Prices
     * Get product variation localized prices.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return List&lt;ProductVariationFixedPrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ProductVariationFixedPrice> getProductVariationLocalizedPrices(String productCode, String variationKey, String responseFields) throws ApiException {
        ApiResponse<List<ProductVariationFixedPrice>> localVarResp = getProductVariationLocalizedPricesWithHttpInfo(productCode, variationKey, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Variation Localized Prices
     * Get product variation localized prices.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;List&lt;ProductVariationFixedPrice&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ProductVariationFixedPrice>> getProductVariationLocalizedPricesWithHttpInfo(String productCode, String variationKey, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProductVariationLocalizedPricesValidateBeforeCall(productCode, variationKey, responseFields, null);
        Type localVarReturnType = new TypeToken<List<ProductVariationFixedPrice>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Variation Localized Prices (asynchronously)
     * Get product variation localized prices.
     * @param productCode  (required)
     * @param variationKey  (required)
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
    public okhttp3.Call getProductVariationLocalizedPricesAsync(String productCode, String variationKey, String responseFields, final ApiCallback<List<ProductVariationFixedPrice>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductVariationLocalizedPricesValidateBeforeCall(productCode, variationKey, responseFields, _callback);
        Type localVarReturnType = new TypeToken<List<ProductVariationFixedPrice>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProductVariations
     * @param productCode Merchant-supplied code associated with the product, for example, a SKU. Required. (required)
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
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
    public okhttp3.Call getProductVariationsCall(String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/variations"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()));

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
    private okhttp3.Call getProductVariationsValidateBeforeCall(String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getProductVariations(Async)");
        }
        

        okhttp3.Call localVarCall = getProductVariationsCall(productCode, startIndex, pageSize, sortBy, filter, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Variations
     * Retrieves a paged list of product variations for a specific product according to any specified filter criteria and sort options. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param productCode Merchant-supplied code associated with the product, for example, a SKU. Required. (required)
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ProductVariationPagedCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductVariationPagedCollection getProductVariations(String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws ApiException {
        ApiResponse<ProductVariationPagedCollection> localVarResp = getProductVariationsWithHttpInfo(productCode, startIndex, pageSize, sortBy, filter, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Variations
     * Retrieves a paged list of product variations for a specific product according to any specified filter criteria and sort options. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param productCode Merchant-supplied code associated with the product, for example, a SKU. Required. (required)
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;ProductVariationPagedCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductVariationPagedCollection> getProductVariationsWithHttpInfo(String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProductVariationsValidateBeforeCall(productCode, startIndex, pageSize, sortBy, filter, responseFields, null);
        Type localVarReturnType = new TypeToken<ProductVariationPagedCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Variations (asynchronously)
     * Retrieves a paged list of product variations for a specific product according to any specified filter criteria and sort options. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param productCode Merchant-supplied code associated with the product, for example, a SKU. Required. (required)
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
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
    public okhttp3.Call getProductVariationsAsync(String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, final ApiCallback<ProductVariationPagedCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductVariationsValidateBeforeCall(productCode, startIndex, pageSize, sortBy, filter, responseFields, _callback);
        Type localVarReturnType = new TypeToken<ProductVariationPagedCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProductVariation
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param variationKey Unique identifier for a single variation. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariation Properties of the product variation that you are modifying. Required. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductVariationCall(String productCode, String variationKey, String responseFields, ProductVariation productVariation, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productVariation;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/variations/{variationKey}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "variationKey" + "\\}", localVarApiClient.escapeString(variationKey.toString()));

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
    private okhttp3.Call updateProductVariationValidateBeforeCall(String productCode, String variationKey, String responseFields, ProductVariation productVariation, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updateProductVariation(Async)");
        }
        
        // verify the required parameter 'variationKey' is set
        if (variationKey == null) {
            throw new ApiException("Missing the required parameter 'variationKey' when calling updateProductVariation(Async)");
        }
        

        okhttp3.Call localVarCall = updateProductVariationCall(productCode, variationKey, responseFields, productVariation, _callback);
        return localVarCall;

    }

    /**
     * Update Product Variation
     * Modifies an existing product variation specified by its variation key. Typically used to change the price or inventory count of an existing product variation. Read-only options are ignored.&lt;br&gt;&lt;br&gt;This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param variationKey Unique identifier for a single variation. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariation Properties of the product variation that you are modifying. Required. (optional)
     * @return ProductVariation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductVariation updateProductVariation(String productCode, String variationKey, String responseFields, ProductVariation productVariation) throws ApiException {
        ApiResponse<ProductVariation> localVarResp = updateProductVariationWithHttpInfo(productCode, variationKey, responseFields, productVariation);
        return localVarResp.getData();
    }

    /**
     * Update Product Variation
     * Modifies an existing product variation specified by its variation key. Typically used to change the price or inventory count of an existing product variation. Read-only options are ignored.&lt;br&gt;&lt;br&gt;This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param variationKey Unique identifier for a single variation. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariation Properties of the product variation that you are modifying. Required. (optional)
     * @return ApiResponse&lt;ProductVariation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductVariation> updateProductVariationWithHttpInfo(String productCode, String variationKey, String responseFields, ProductVariation productVariation) throws ApiException {
        okhttp3.Call localVarCall = updateProductVariationValidateBeforeCall(productCode, variationKey, responseFields, productVariation, null);
        Type localVarReturnType = new TypeToken<ProductVariation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product Variation (asynchronously)
     * Modifies an existing product variation specified by its variation key. Typically used to change the price or inventory count of an existing product variation. Read-only options are ignored.&lt;br&gt;&lt;br&gt;This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param variationKey Unique identifier for a single variation. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariation Properties of the product variation that you are modifying. Required. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductVariationAsync(String productCode, String variationKey, String responseFields, ProductVariation productVariation, final ApiCallback<ProductVariation> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProductVariationValidateBeforeCall(productCode, variationKey, responseFields, productVariation, _callback);
        Type localVarReturnType = new TypeToken<ProductVariation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProductVariationLocalizedDeltaPrice
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationDeltaPrice  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductVariationLocalizedDeltaPriceCall(String productCode, String variationKey, String currencyCode, String responseFields, ProductVariationDeltaPrice productVariationDeltaPrice, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productVariationDeltaPrice;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice/{currencyCode}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "variationKey" + "\\}", localVarApiClient.escapeString(variationKey.toString()))
            .replaceAll("\\{" + "currencyCode" + "\\}", localVarApiClient.escapeString(currencyCode.toString()));

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
    private okhttp3.Call updateProductVariationLocalizedDeltaPriceValidateBeforeCall(String productCode, String variationKey, String currencyCode, String responseFields, ProductVariationDeltaPrice productVariationDeltaPrice, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updateProductVariationLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'variationKey' is set
        if (variationKey == null) {
            throw new ApiException("Missing the required parameter 'variationKey' when calling updateProductVariationLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling updateProductVariationLocalizedDeltaPrice(Async)");
        }
        

        okhttp3.Call localVarCall = updateProductVariationLocalizedDeltaPriceCall(productCode, variationKey, currencyCode, responseFields, productVariationDeltaPrice, _callback);
        return localVarCall;

    }

    /**
     * Update Product Variation Localized Delta Price
     * Update the product variation localized delta prices for a specific currency.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationDeltaPrice  (optional)
     * @return ProductVariationDeltaPrice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductVariationDeltaPrice updateProductVariationLocalizedDeltaPrice(String productCode, String variationKey, String currencyCode, String responseFields, ProductVariationDeltaPrice productVariationDeltaPrice) throws ApiException {
        ApiResponse<ProductVariationDeltaPrice> localVarResp = updateProductVariationLocalizedDeltaPriceWithHttpInfo(productCode, variationKey, currencyCode, responseFields, productVariationDeltaPrice);
        return localVarResp.getData();
    }

    /**
     * Update Product Variation Localized Delta Price
     * Update the product variation localized delta prices for a specific currency.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationDeltaPrice  (optional)
     * @return ApiResponse&lt;ProductVariationDeltaPrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductVariationDeltaPrice> updateProductVariationLocalizedDeltaPriceWithHttpInfo(String productCode, String variationKey, String currencyCode, String responseFields, ProductVariationDeltaPrice productVariationDeltaPrice) throws ApiException {
        okhttp3.Call localVarCall = updateProductVariationLocalizedDeltaPriceValidateBeforeCall(productCode, variationKey, currencyCode, responseFields, productVariationDeltaPrice, null);
        Type localVarReturnType = new TypeToken<ProductVariationDeltaPrice>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product Variation Localized Delta Price (asynchronously)
     * Update the product variation localized delta prices for a specific currency.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationDeltaPrice  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductVariationLocalizedDeltaPriceAsync(String productCode, String variationKey, String currencyCode, String responseFields, ProductVariationDeltaPrice productVariationDeltaPrice, final ApiCallback<ProductVariationDeltaPrice> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProductVariationLocalizedDeltaPriceValidateBeforeCall(productCode, variationKey, currencyCode, responseFields, productVariationDeltaPrice, _callback);
        Type localVarReturnType = new TypeToken<ProductVariationDeltaPrice>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProductVariationLocalizedDeltaPrices
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationDeltaPrice  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductVariationLocalizedDeltaPricesCall(String productCode, String variationKey, String responseFields, List<ProductVariationDeltaPrice> productVariationDeltaPrice, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productVariationDeltaPrice;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "variationKey" + "\\}", localVarApiClient.escapeString(variationKey.toString()));

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
    private okhttp3.Call updateProductVariationLocalizedDeltaPricesValidateBeforeCall(String productCode, String variationKey, String responseFields, List<ProductVariationDeltaPrice> productVariationDeltaPrice, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updateProductVariationLocalizedDeltaPrices(Async)");
        }
        
        // verify the required parameter 'variationKey' is set
        if (variationKey == null) {
            throw new ApiException("Missing the required parameter 'variationKey' when calling updateProductVariationLocalizedDeltaPrices(Async)");
        }
        

        okhttp3.Call localVarCall = updateProductVariationLocalizedDeltaPricesCall(productCode, variationKey, responseFields, productVariationDeltaPrice, _callback);
        return localVarCall;

    }

    /**
     * Update Product Variation Localized Delta Prices
     * Update product variation localized delta prices.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationDeltaPrice  (optional)
     * @return List&lt;ProductVariationDeltaPrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ProductVariationDeltaPrice> updateProductVariationLocalizedDeltaPrices(String productCode, String variationKey, String responseFields, List<ProductVariationDeltaPrice> productVariationDeltaPrice) throws ApiException {
        ApiResponse<List<ProductVariationDeltaPrice>> localVarResp = updateProductVariationLocalizedDeltaPricesWithHttpInfo(productCode, variationKey, responseFields, productVariationDeltaPrice);
        return localVarResp.getData();
    }

    /**
     * Update Product Variation Localized Delta Prices
     * Update product variation localized delta prices.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationDeltaPrice  (optional)
     * @return ApiResponse&lt;List&lt;ProductVariationDeltaPrice&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ProductVariationDeltaPrice>> updateProductVariationLocalizedDeltaPricesWithHttpInfo(String productCode, String variationKey, String responseFields, List<ProductVariationDeltaPrice> productVariationDeltaPrice) throws ApiException {
        okhttp3.Call localVarCall = updateProductVariationLocalizedDeltaPricesValidateBeforeCall(productCode, variationKey, responseFields, productVariationDeltaPrice, null);
        Type localVarReturnType = new TypeToken<List<ProductVariationDeltaPrice>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product Variation Localized Delta Prices (asynchronously)
     * Update product variation localized delta prices.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationDeltaPrice  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductVariationLocalizedDeltaPricesAsync(String productCode, String variationKey, String responseFields, List<ProductVariationDeltaPrice> productVariationDeltaPrice, final ApiCallback<List<ProductVariationDeltaPrice>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProductVariationLocalizedDeltaPricesValidateBeforeCall(productCode, variationKey, responseFields, productVariationDeltaPrice, _callback);
        Type localVarReturnType = new TypeToken<List<ProductVariationDeltaPrice>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProductVariationLocalizedPrice
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationFixedPrice  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductVariationLocalizedPriceCall(String productCode, String variationKey, String currencyCode, String responseFields, ProductVariationFixedPrice productVariationFixedPrice, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productVariationFixedPrice;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice/{currencyCode}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "variationKey" + "\\}", localVarApiClient.escapeString(variationKey.toString()))
            .replaceAll("\\{" + "currencyCode" + "\\}", localVarApiClient.escapeString(currencyCode.toString()));

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
    private okhttp3.Call updateProductVariationLocalizedPriceValidateBeforeCall(String productCode, String variationKey, String currencyCode, String responseFields, ProductVariationFixedPrice productVariationFixedPrice, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updateProductVariationLocalizedPrice(Async)");
        }
        
        // verify the required parameter 'variationKey' is set
        if (variationKey == null) {
            throw new ApiException("Missing the required parameter 'variationKey' when calling updateProductVariationLocalizedPrice(Async)");
        }
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling updateProductVariationLocalizedPrice(Async)");
        }
        

        okhttp3.Call localVarCall = updateProductVariationLocalizedPriceCall(productCode, variationKey, currencyCode, responseFields, productVariationFixedPrice, _callback);
        return localVarCall;

    }

    /**
     * Update Product Variation Localized Price by Currency
     * Update the product variation localized price for a specific currency code.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationFixedPrice  (optional)
     * @return ProductVariationFixedPrice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductVariationFixedPrice updateProductVariationLocalizedPrice(String productCode, String variationKey, String currencyCode, String responseFields, ProductVariationFixedPrice productVariationFixedPrice) throws ApiException {
        ApiResponse<ProductVariationFixedPrice> localVarResp = updateProductVariationLocalizedPriceWithHttpInfo(productCode, variationKey, currencyCode, responseFields, productVariationFixedPrice);
        return localVarResp.getData();
    }

    /**
     * Update Product Variation Localized Price by Currency
     * Update the product variation localized price for a specific currency code.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationFixedPrice  (optional)
     * @return ApiResponse&lt;ProductVariationFixedPrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductVariationFixedPrice> updateProductVariationLocalizedPriceWithHttpInfo(String productCode, String variationKey, String currencyCode, String responseFields, ProductVariationFixedPrice productVariationFixedPrice) throws ApiException {
        okhttp3.Call localVarCall = updateProductVariationLocalizedPriceValidateBeforeCall(productCode, variationKey, currencyCode, responseFields, productVariationFixedPrice, null);
        Type localVarReturnType = new TypeToken<ProductVariationFixedPrice>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product Variation Localized Price by Currency (asynchronously)
     * Update the product variation localized price for a specific currency code.
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationFixedPrice  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductVariationLocalizedPriceAsync(String productCode, String variationKey, String currencyCode, String responseFields, ProductVariationFixedPrice productVariationFixedPrice, final ApiCallback<ProductVariationFixedPrice> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProductVariationLocalizedPriceValidateBeforeCall(productCode, variationKey, currencyCode, responseFields, productVariationFixedPrice, _callback);
        Type localVarReturnType = new TypeToken<ProductVariationFixedPrice>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProductVariationLocalizedPrices
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationFixedPrice  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductVariationLocalizedPricesCall(String productCode, String variationKey, String responseFields, List<ProductVariationFixedPrice> productVariationFixedPrice, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productVariationFixedPrice;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "variationKey" + "\\}", localVarApiClient.escapeString(variationKey.toString()));

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
    private okhttp3.Call updateProductVariationLocalizedPricesValidateBeforeCall(String productCode, String variationKey, String responseFields, List<ProductVariationFixedPrice> productVariationFixedPrice, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updateProductVariationLocalizedPrices(Async)");
        }
        
        // verify the required parameter 'variationKey' is set
        if (variationKey == null) {
            throw new ApiException("Missing the required parameter 'variationKey' when calling updateProductVariationLocalizedPrices(Async)");
        }
        

        okhttp3.Call localVarCall = updateProductVariationLocalizedPricesCall(productCode, variationKey, responseFields, productVariationFixedPrice, _callback);
        return localVarCall;

    }

    /**
     * Update Product Variation Localized Prices
     * Update product variation localized prices
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationFixedPrice  (optional)
     * @return List&lt;ProductVariationFixedPrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ProductVariationFixedPrice> updateProductVariationLocalizedPrices(String productCode, String variationKey, String responseFields, List<ProductVariationFixedPrice> productVariationFixedPrice) throws ApiException {
        ApiResponse<List<ProductVariationFixedPrice>> localVarResp = updateProductVariationLocalizedPricesWithHttpInfo(productCode, variationKey, responseFields, productVariationFixedPrice);
        return localVarResp.getData();
    }

    /**
     * Update Product Variation Localized Prices
     * Update product variation localized prices
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationFixedPrice  (optional)
     * @return ApiResponse&lt;List&lt;ProductVariationFixedPrice&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ProductVariationFixedPrice>> updateProductVariationLocalizedPricesWithHttpInfo(String productCode, String variationKey, String responseFields, List<ProductVariationFixedPrice> productVariationFixedPrice) throws ApiException {
        okhttp3.Call localVarCall = updateProductVariationLocalizedPricesValidateBeforeCall(productCode, variationKey, responseFields, productVariationFixedPrice, null);
        Type localVarReturnType = new TypeToken<List<ProductVariationFixedPrice>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product Variation Localized Prices (asynchronously)
     * Update product variation localized prices
     * @param productCode  (required)
     * @param variationKey  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationFixedPrice  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductVariationLocalizedPricesAsync(String productCode, String variationKey, String responseFields, List<ProductVariationFixedPrice> productVariationFixedPrice, final ApiCallback<List<ProductVariationFixedPrice>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProductVariationLocalizedPricesValidateBeforeCall(productCode, variationKey, responseFields, productVariationFixedPrice, _callback);
        Type localVarReturnType = new TypeToken<List<ProductVariationFixedPrice>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProductVariations
     * @param productCode Merchant-supplied code associated with the product, for example, a SKU. Required. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationCollection Properties of the product variations that you are modifying. Required. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductVariationsCall(String productCode, String responseFields, ProductVariationCollection productVariationCollection, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productVariationCollection;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/variations"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()));

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
    private okhttp3.Call updateProductVariationsValidateBeforeCall(String productCode, String responseFields, ProductVariationCollection productVariationCollection, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updateProductVariations(Async)");
        }
        

        okhttp3.Call localVarCall = updateProductVariationsCall(productCode, responseFields, productVariationCollection, _callback);
        return localVarCall;

    }

    /**
     * Update Product Variations
     * Modifies multiple product variations for an existing product in one operation. Use to set IsActive to true for variations that represent configurable options for sale. Also use to change the price or inventory count of an existing product variation. Read-only options are ignored.&lt;br&gt;&lt;br&gt;This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode Merchant-supplied code associated with the product, for example, a SKU. Required. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationCollection Properties of the product variations that you are modifying. Required. (optional)
     * @return ProductVariationCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductVariationCollection updateProductVariations(String productCode, String responseFields, ProductVariationCollection productVariationCollection) throws ApiException {
        ApiResponse<ProductVariationCollection> localVarResp = updateProductVariationsWithHttpInfo(productCode, responseFields, productVariationCollection);
        return localVarResp.getData();
    }

    /**
     * Update Product Variations
     * Modifies multiple product variations for an existing product in one operation. Use to set IsActive to true for variations that represent configurable options for sale. Also use to change the price or inventory count of an existing product variation. Read-only options are ignored.&lt;br&gt;&lt;br&gt;This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode Merchant-supplied code associated with the product, for example, a SKU. Required. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationCollection Properties of the product variations that you are modifying. Required. (optional)
     * @return ApiResponse&lt;ProductVariationCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductVariationCollection> updateProductVariationsWithHttpInfo(String productCode, String responseFields, ProductVariationCollection productVariationCollection) throws ApiException {
        okhttp3.Call localVarCall = updateProductVariationsValidateBeforeCall(productCode, responseFields, productVariationCollection, null);
        Type localVarReturnType = new TypeToken<ProductVariationCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product Variations (asynchronously)
     * Modifies multiple product variations for an existing product in one operation. Use to set IsActive to true for variations that represent configurable options for sale. Also use to change the price or inventory count of an existing product variation. Read-only options are ignored.&lt;br&gt;&lt;br&gt;This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode Merchant-supplied code associated with the product, for example, a SKU. Required. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productVariationCollection Properties of the product variations that you are modifying. Required. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductVariationsAsync(String productCode, String responseFields, ProductVariationCollection productVariationCollection, final ApiCallback<ProductVariationCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProductVariationsValidateBeforeCall(productCode, responseFields, productVariationCollection, _callback);
        Type localVarReturnType = new TypeToken<ProductVariationCollection>(){}.getType();
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
        public ProductVariationsApi build() {
            return new ProductVariationsApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
