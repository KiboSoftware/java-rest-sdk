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


import com.kibocommerce.sdk.catalogadministration.models.ProductCollectionV1;
import com.kibocommerce.sdk.catalogadministration.models.ProductInCatalogInfoV1;
import com.kibocommerce.sdk.catalogadministration.models.ProductV1;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ProductsV1Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public ProductsV1Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductsV1Api(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public ProductsV1Api(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public ProductsV1Api(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public ProductsV1Api(Builder builder) {
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
     * Build call for addProduct2
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productV1 Properties of the new product. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. Mozu.ProductAdmin.Contracts.Product (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addProduct2Call(String batchJobCode, String responseFields, ProductV1 productV1, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productV1;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/productsV1";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (batchJobCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("batchJobCode", batchJobCode));
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
    private okhttp3.Call addProduct2ValidateBeforeCall(String batchJobCode, String responseFields, ProductV1 productV1, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = addProduct2Call(batchJobCode, responseFields, productV1, _callback);
        return localVarCall;

    }

    /**
     * Add Product
     * Creates a new product. This is the legacy version of the Products API,  which allows you to access product data that hasn&#39;t yet been rewritten to the newer  API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to  support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productV1 Properties of the new product. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. Mozu.ProductAdmin.Contracts.Product (optional)
     * @return ProductV1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductV1 addProduct2(String batchJobCode, String responseFields, ProductV1 productV1) throws ApiException {
        ApiResponse<ProductV1> localVarResp = addProduct2WithHttpInfo(batchJobCode, responseFields, productV1);
        return localVarResp.getData();
    }

    /**
     * Add Product
     * Creates a new product. This is the legacy version of the Products API,  which allows you to access product data that hasn&#39;t yet been rewritten to the newer  API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to  support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productV1 Properties of the new product. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. Mozu.ProductAdmin.Contracts.Product (optional)
     * @return ApiResponse&lt;ProductV1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductV1> addProduct2WithHttpInfo(String batchJobCode, String responseFields, ProductV1 productV1) throws ApiException {
        okhttp3.Call localVarCall = addProduct2ValidateBeforeCall(batchJobCode, responseFields, productV1, null);
        Type localVarReturnType = new TypeToken<ProductV1>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Product (asynchronously)
     * Creates a new product. This is the legacy version of the Products API,  which allows you to access product data that hasn&#39;t yet been rewritten to the newer  API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to  support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productV1 Properties of the new product. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. Mozu.ProductAdmin.Contracts.Product (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addProduct2Async(String batchJobCode, String responseFields, ProductV1 productV1, final ApiCallback<ProductV1> _callback) throws ApiException {

        okhttp3.Call localVarCall = addProduct2ValidateBeforeCall(batchJobCode, responseFields, productV1, _callback);
        Type localVarReturnType = new TypeToken<ProductV1>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addProductInCatalog1
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfoV1  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addProductInCatalog1Call(String productCode, String responseFields, ProductInCatalogInfoV1 productInCatalogInfoV1, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productInCatalogInfoV1;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/productsV1/{productCode}/ProductInCatalogs"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addProductInCatalog1ValidateBeforeCall(String productCode, String responseFields, ProductInCatalogInfoV1 productInCatalogInfoV1, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling addProductInCatalog1(Async)");
        }
        

        okhttp3.Call localVarCall = addProductInCatalog1Call(productCode, responseFields, productInCatalogInfoV1, _callback);
        return localVarCall;

    }

    /**
     * Add Product in Catalogs
     * Adds a new product to your catalogs. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfoV1  (optional)
     * @return ProductInCatalogInfoV1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductInCatalogInfoV1 addProductInCatalog1(String productCode, String responseFields, ProductInCatalogInfoV1 productInCatalogInfoV1) throws ApiException {
        ApiResponse<ProductInCatalogInfoV1> localVarResp = addProductInCatalog1WithHttpInfo(productCode, responseFields, productInCatalogInfoV1);
        return localVarResp.getData();
    }

    /**
     * Add Product in Catalogs
     * Adds a new product to your catalogs. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfoV1  (optional)
     * @return ApiResponse&lt;ProductInCatalogInfoV1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductInCatalogInfoV1> addProductInCatalog1WithHttpInfo(String productCode, String responseFields, ProductInCatalogInfoV1 productInCatalogInfoV1) throws ApiException {
        okhttp3.Call localVarCall = addProductInCatalog1ValidateBeforeCall(productCode, responseFields, productInCatalogInfoV1, null);
        Type localVarReturnType = new TypeToken<ProductInCatalogInfoV1>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Product in Catalogs (asynchronously)
     * Adds a new product to your catalogs. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfoV1  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addProductInCatalog1Async(String productCode, String responseFields, ProductInCatalogInfoV1 productInCatalogInfoV1, final ApiCallback<ProductInCatalogInfoV1> _callback) throws ApiException {

        okhttp3.Call localVarCall = addProductInCatalog1ValidateBeforeCall(productCode, responseFields, productInCatalogInfoV1, _callback);
        Type localVarReturnType = new TypeToken<ProductInCatalogInfoV1>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProduct5
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
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
    public okhttp3.Call getProduct5Call(String productCode, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/productsV1/{productCode}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call getProduct5ValidateBeforeCall(String productCode, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getProduct5(Async)");
        }
        

        okhttp3.Call localVarCall = getProduct5Call(productCode, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product
     * Retrieves details about a product based on the specified response group. This is the legacy version of the Products API,  which allows you to access product data that hasn&#39;t yet been rewritten to the newer  API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to  support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param responseGroups Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ProductV1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductV1 getProduct5(String productCode, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<ProductV1> localVarResp = getProduct5WithHttpInfo(productCode, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product
     * Retrieves details about a product based on the specified response group. This is the legacy version of the Products API,  which allows you to access product data that hasn&#39;t yet been rewritten to the newer  API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to  support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param responseGroups Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;ProductV1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductV1> getProduct5WithHttpInfo(String productCode, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProduct5ValidateBeforeCall(productCode, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<ProductV1>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product (asynchronously)
     * Retrieves details about a product based on the specified response group. This is the legacy version of the Products API,  which allows you to access product data that hasn&#39;t yet been rewritten to the newer  API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to  support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
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
    public okhttp3.Call getProduct5Async(String productCode, String responseGroups, String responseFields, final ApiCallback<ProductV1> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProduct5ValidateBeforeCall(productCode, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<ProductV1>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProductInCatalog3
     * @param productCode  (required)
     * @param catalogId  (required)
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
    public okhttp3.Call getProductInCatalog3Call(String productCode, Integer catalogId, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/productsV1/{productCode}/ProductInCatalogs/{catalogId}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "catalogId" + "\\}", localVarApiClient.escapeString(catalogId.toString()));

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
    private okhttp3.Call getProductInCatalog3ValidateBeforeCall(String productCode, Integer catalogId, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getProductInCatalog3(Async)");
        }
        
        // verify the required parameter 'catalogId' is set
        if (catalogId == null) {
            throw new ApiException("Missing the required parameter 'catalogId' when calling getProductInCatalog3(Async)");
        }
        

        okhttp3.Call localVarCall = getProductInCatalog3Call(productCode, catalogId, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product in Catalog
     * Retrieves a product in a particular catalog. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode  (required)
     * @param catalogId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ProductInCatalogInfoV1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductInCatalogInfoV1 getProductInCatalog3(String productCode, Integer catalogId, String responseFields) throws ApiException {
        ApiResponse<ProductInCatalogInfoV1> localVarResp = getProductInCatalog3WithHttpInfo(productCode, catalogId, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product in Catalog
     * Retrieves a product in a particular catalog. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode  (required)
     * @param catalogId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;ProductInCatalogInfoV1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductInCatalogInfoV1> getProductInCatalog3WithHttpInfo(String productCode, Integer catalogId, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProductInCatalog3ValidateBeforeCall(productCode, catalogId, responseFields, null);
        Type localVarReturnType = new TypeToken<ProductInCatalogInfoV1>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product in Catalog (asynchronously)
     * Retrieves a product in a particular catalog. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode  (required)
     * @param catalogId  (required)
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
    public okhttp3.Call getProductInCatalog3Async(String productCode, Integer catalogId, String responseFields, final ApiCallback<ProductInCatalogInfoV1> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductInCatalog3ValidateBeforeCall(productCode, catalogId, responseFields, _callback);
        Type localVarReturnType = new TypeToken<ProductInCatalogInfoV1>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProductInCatalogs4
     * @param productCode  (required)
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
    public okhttp3.Call getProductInCatalogs4Call(String productCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/productsV1/{productCode}/ProductInCatalogs"
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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getProductInCatalogs4ValidateBeforeCall(String productCode, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getProductInCatalogs4(Async)");
        }
        

        okhttp3.Call localVarCall = getProductInCatalogs4Call(productCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Products in Catalogs
     * Retrieve existing products across all catalog. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return List&lt;ProductInCatalogInfoV1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ProductInCatalogInfoV1> getProductInCatalogs4(String productCode, String responseFields) throws ApiException {
        ApiResponse<List<ProductInCatalogInfoV1>> localVarResp = getProductInCatalogs4WithHttpInfo(productCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Products in Catalogs
     * Retrieve existing products across all catalog. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;List&lt;ProductInCatalogInfoV1&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ProductInCatalogInfoV1>> getProductInCatalogs4WithHttpInfo(String productCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProductInCatalogs4ValidateBeforeCall(productCode, responseFields, null);
        Type localVarReturnType = new TypeToken<List<ProductInCatalogInfoV1>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Products in Catalogs (asynchronously)
     * Retrieve existing products across all catalog. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode  (required)
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
    public okhttp3.Call getProductInCatalogs4Async(String productCode, String responseFields, final ApiCallback<List<ProductInCatalogInfoV1>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductInCatalogs4ValidateBeforeCall(productCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<List<ProductInCatalogInfoV1>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProducts6
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a single query. The default value is 20 and the maximum value is 200. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending or descending order. For example, to sort the results by “ID” ascending then by “CreateDate” descending, use: id asc,createdate desc. (optional)
     * @param responseGroups Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param q  (optional)
     * @param qLimit  (optional)
     * @param noCount  (optional)
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
    public okhttp3.Call getProducts6Call(Integer startIndex, Integer pageSize, String sortBy, String responseGroups, String filter, String q, Integer qLimit, Boolean noCount, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/productsV1";

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

        if (responseGroups != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("responseGroups", responseGroups));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (q != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("q", q));
        }

        if (qLimit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("qLimit", qLimit));
        }

        if (noCount != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("noCount", noCount));
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
    private okhttp3.Call getProducts6ValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String responseGroups, String filter, String q, Integer qLimit, Boolean noCount, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getProducts6Call(startIndex, pageSize, sortBy, responseGroups, filter, q, qLimit, noCount, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Products
     * Retrieves a list of products according to any specified filter criteria and sort options. This is the legacy version of the Products API,  which allows you to access product data that hasn&#39;t yet been rewritten to the newer  API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to  support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a single query. The default value is 20 and the maximum value is 200. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending or descending order. For example, to sort the results by “ID” ascending then by “CreateDate” descending, use: id asc,createdate desc. (optional)
     * @param responseGroups Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param q  (optional)
     * @param qLimit  (optional)
     * @param noCount  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ProductCollectionV1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductCollectionV1 getProducts6(Integer startIndex, Integer pageSize, String sortBy, String responseGroups, String filter, String q, Integer qLimit, Boolean noCount, String responseFields) throws ApiException {
        ApiResponse<ProductCollectionV1> localVarResp = getProducts6WithHttpInfo(startIndex, pageSize, sortBy, responseGroups, filter, q, qLimit, noCount, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Products
     * Retrieves a list of products according to any specified filter criteria and sort options. This is the legacy version of the Products API,  which allows you to access product data that hasn&#39;t yet been rewritten to the newer  API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to  support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a single query. The default value is 20 and the maximum value is 200. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending or descending order. For example, to sort the results by “ID” ascending then by “CreateDate” descending, use: id asc,createdate desc. (optional)
     * @param responseGroups Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param q  (optional)
     * @param qLimit  (optional)
     * @param noCount  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;ProductCollectionV1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductCollectionV1> getProducts6WithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String responseGroups, String filter, String q, Integer qLimit, Boolean noCount, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProducts6ValidateBeforeCall(startIndex, pageSize, sortBy, responseGroups, filter, q, qLimit, noCount, responseFields, null);
        Type localVarReturnType = new TypeToken<ProductCollectionV1>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Products (asynchronously)
     * Retrieves a list of products according to any specified filter criteria and sort options. This is the legacy version of the Products API,  which allows you to access product data that hasn&#39;t yet been rewritten to the newer  API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to  support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a single query. The default value is 20 and the maximum value is 200. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending or descending order. For example, to sort the results by “ID” ascending then by “CreateDate” descending, use: id asc,createdate desc. (optional)
     * @param responseGroups Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param q  (optional)
     * @param qLimit  (optional)
     * @param noCount  (optional)
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
    public okhttp3.Call getProducts6Async(Integer startIndex, Integer pageSize, String sortBy, String responseGroups, String filter, String q, Integer qLimit, Boolean noCount, String responseFields, final ApiCallback<ProductCollectionV1> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProducts6ValidateBeforeCall(startIndex, pageSize, sortBy, responseGroups, filter, q, qLimit, noCount, responseFields, _callback);
        Type localVarReturnType = new TypeToken<ProductCollectionV1>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProduct9
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productV1 Properties of the product that you want to update. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProduct9Call(String productCode, String batchJobCode, String responseFields, ProductV1 productV1, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productV1;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/productsV1/{productCode}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (batchJobCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("batchJobCode", batchJobCode));
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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateProduct9ValidateBeforeCall(String productCode, String batchJobCode, String responseFields, ProductV1 productV1, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updateProduct9(Async)");
        }
        

        okhttp3.Call localVarCall = updateProduct9Call(productCode, batchJobCode, responseFields, productV1, _callback);
        return localVarCall;

    }

    /**
     * Update Product
     * Modifies an existing product. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productV1 Properties of the product that you want to update. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. (optional)
     * @return ProductV1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductV1 updateProduct9(String productCode, String batchJobCode, String responseFields, ProductV1 productV1) throws ApiException {
        ApiResponse<ProductV1> localVarResp = updateProduct9WithHttpInfo(productCode, batchJobCode, responseFields, productV1);
        return localVarResp.getData();
    }

    /**
     * Update Product
     * Modifies an existing product. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productV1 Properties of the product that you want to update. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. (optional)
     * @return ApiResponse&lt;ProductV1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductV1> updateProduct9WithHttpInfo(String productCode, String batchJobCode, String responseFields, ProductV1 productV1) throws ApiException {
        okhttp3.Call localVarCall = updateProduct9ValidateBeforeCall(productCode, batchJobCode, responseFields, productV1, null);
        Type localVarReturnType = new TypeToken<ProductV1>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product (asynchronously)
     * Modifies an existing product. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productV1 Properties of the product that you want to update. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProduct9Async(String productCode, String batchJobCode, String responseFields, ProductV1 productV1, final ApiCallback<ProductV1> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProduct9ValidateBeforeCall(productCode, batchJobCode, responseFields, productV1, _callback);
        Type localVarReturnType = new TypeToken<ProductV1>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProductInCatalog7
     * @param productCode  (required)
     * @param catalogId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfoV1  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductInCatalog7Call(String productCode, Integer catalogId, String responseFields, ProductInCatalogInfoV1 productInCatalogInfoV1, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productInCatalogInfoV1;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/productsV1/{productCode}/ProductInCatalogs/{catalogId}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "catalogId" + "\\}", localVarApiClient.escapeString(catalogId.toString()));

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
    private okhttp3.Call updateProductInCatalog7ValidateBeforeCall(String productCode, Integer catalogId, String responseFields, ProductInCatalogInfoV1 productInCatalogInfoV1, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updateProductInCatalog7(Async)");
        }
        
        // verify the required parameter 'catalogId' is set
        if (catalogId == null) {
            throw new ApiException("Missing the required parameter 'catalogId' when calling updateProductInCatalog7(Async)");
        }
        

        okhttp3.Call localVarCall = updateProductInCatalog7Call(productCode, catalogId, responseFields, productInCatalogInfoV1, _callback);
        return localVarCall;

    }

    /**
     * Update Product in Catalog
     * Updates products in a particular catalog. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode  (required)
     * @param catalogId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfoV1  (optional)
     * @return ProductInCatalogInfoV1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductInCatalogInfoV1 updateProductInCatalog7(String productCode, Integer catalogId, String responseFields, ProductInCatalogInfoV1 productInCatalogInfoV1) throws ApiException {
        ApiResponse<ProductInCatalogInfoV1> localVarResp = updateProductInCatalog7WithHttpInfo(productCode, catalogId, responseFields, productInCatalogInfoV1);
        return localVarResp.getData();
    }

    /**
     * Update Product in Catalog
     * Updates products in a particular catalog. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode  (required)
     * @param catalogId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfoV1  (optional)
     * @return ApiResponse&lt;ProductInCatalogInfoV1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductInCatalogInfoV1> updateProductInCatalog7WithHttpInfo(String productCode, Integer catalogId, String responseFields, ProductInCatalogInfoV1 productInCatalogInfoV1) throws ApiException {
        okhttp3.Call localVarCall = updateProductInCatalog7ValidateBeforeCall(productCode, catalogId, responseFields, productInCatalogInfoV1, null);
        Type localVarReturnType = new TypeToken<ProductInCatalogInfoV1>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product in Catalog (asynchronously)
     * Updates products in a particular catalog. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode  (required)
     * @param catalogId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfoV1  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductInCatalog7Async(String productCode, Integer catalogId, String responseFields, ProductInCatalogInfoV1 productInCatalogInfoV1, final ApiCallback<ProductInCatalogInfoV1> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProductInCatalog7ValidateBeforeCall(productCode, catalogId, responseFields, productInCatalogInfoV1, _callback);
        Type localVarReturnType = new TypeToken<ProductInCatalogInfoV1>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProductInCatalogs8
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfoV1  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductInCatalogs8Call(String productCode, String responseFields, List<ProductInCatalogInfoV1> productInCatalogInfoV1, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productInCatalogInfoV1;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/productsV1/{productCode}/ProductInCatalogs"
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
    private okhttp3.Call updateProductInCatalogs8ValidateBeforeCall(String productCode, String responseFields, List<ProductInCatalogInfoV1> productInCatalogInfoV1, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updateProductInCatalogs8(Async)");
        }
        

        okhttp3.Call localVarCall = updateProductInCatalogs8Call(productCode, responseFields, productInCatalogInfoV1, _callback);
        return localVarCall;

    }

    /**
     * Update Products in Catalogs
     * Updates existing products across your catalogs. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfoV1  (optional)
     * @return List&lt;ProductInCatalogInfoV1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ProductInCatalogInfoV1> updateProductInCatalogs8(String productCode, String responseFields, List<ProductInCatalogInfoV1> productInCatalogInfoV1) throws ApiException {
        ApiResponse<List<ProductInCatalogInfoV1>> localVarResp = updateProductInCatalogs8WithHttpInfo(productCode, responseFields, productInCatalogInfoV1);
        return localVarResp.getData();
    }

    /**
     * Update Products in Catalogs
     * Updates existing products across your catalogs. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfoV1  (optional)
     * @return ApiResponse&lt;List&lt;ProductInCatalogInfoV1&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ProductInCatalogInfoV1>> updateProductInCatalogs8WithHttpInfo(String productCode, String responseFields, List<ProductInCatalogInfoV1> productInCatalogInfoV1) throws ApiException {
        okhttp3.Call localVarCall = updateProductInCatalogs8ValidateBeforeCall(productCode, responseFields, productInCatalogInfoV1, null);
        Type localVarReturnType = new TypeToken<List<ProductInCatalogInfoV1>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Products in Catalogs (asynchronously)
     * Updates existing products across your catalogs. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfoV1  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductInCatalogs8Async(String productCode, String responseFields, List<ProductInCatalogInfoV1> productInCatalogInfoV1, final ApiCallback<List<ProductInCatalogInfoV1>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProductInCatalogs8ValidateBeforeCall(productCode, responseFields, productInCatalogInfoV1, _callback);
        Type localVarReturnType = new TypeToken<List<ProductInCatalogInfoV1>>(){}.getType();
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
        public ProductsV1Api build() {
            return new ProductsV1Api(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
