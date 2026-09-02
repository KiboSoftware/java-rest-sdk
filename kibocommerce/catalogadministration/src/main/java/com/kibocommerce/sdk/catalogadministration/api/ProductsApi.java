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


import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsProduct;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsProductCollection;
import com.kibocommerce.sdk.catalogadministration.models.ProductCodeRename;
import com.kibocommerce.sdk.catalogadministration.models.ProductInCatalogInfo;
import com.kibocommerce.sdk.catalogadministration.models.ProductTypeChangeRequest;
import com.kibocommerce.sdk.catalogadministration.models.ProductTypeChangeResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ProductsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public ProductsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public ProductsApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public ProductsApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public ProductsApi(Builder builder) {
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
     * Build call for addProduct
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProduct Properties of the new product. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. Mozu.ProductAdmin.Contracts.Product (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addProductCall(String batchJobCode, String responseFields, CatalogAdminsProduct catalogAdminsProduct, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsProduct;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products";

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
    private okhttp3.Call addProductValidateBeforeCall(String batchJobCode, String responseFields, CatalogAdminsProduct catalogAdminsProduct, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = addProductCall(batchJobCode, responseFields, catalogAdminsProduct, _callback);
        return localVarCall;

    }

    /**
     * Add Product
     * Creates a new product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProduct Properties of the new product. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. Mozu.ProductAdmin.Contracts.Product (optional)
     * @return CatalogAdminsProduct
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsProduct addProduct(String batchJobCode, String responseFields, CatalogAdminsProduct catalogAdminsProduct) throws ApiException {
        ApiResponse<CatalogAdminsProduct> localVarResp = addProductWithHttpInfo(batchJobCode, responseFields, catalogAdminsProduct);
        return localVarResp.getData();
    }

    /**
     * Add Product
     * Creates a new product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProduct Properties of the new product. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. Mozu.ProductAdmin.Contracts.Product (optional)
     * @return ApiResponse&lt;CatalogAdminsProduct&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsProduct> addProductWithHttpInfo(String batchJobCode, String responseFields, CatalogAdminsProduct catalogAdminsProduct) throws ApiException {
        okhttp3.Call localVarCall = addProductValidateBeforeCall(batchJobCode, responseFields, catalogAdminsProduct, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsProduct>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Product (asynchronously)
     * Creates a new product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProduct Properties of the new product. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. Mozu.ProductAdmin.Contracts.Product (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addProductAsync(String batchJobCode, String responseFields, CatalogAdminsProduct catalogAdminsProduct, final ApiCallback<CatalogAdminsProduct> _callback) throws ApiException {

        okhttp3.Call localVarCall = addProductValidateBeforeCall(batchJobCode, responseFields, catalogAdminsProduct, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsProduct>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addProductInCatalog
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfo  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addProductInCatalogCall(String productCode, String responseFields, ProductInCatalogInfo productInCatalogInfo, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productInCatalogInfo;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/ProductInCatalogs"
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
    private okhttp3.Call addProductInCatalogValidateBeforeCall(String productCode, String responseFields, ProductInCatalogInfo productInCatalogInfo, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling addProductInCatalog(Async)");
        }
        

        okhttp3.Call localVarCall = addProductInCatalogCall(productCode, responseFields, productInCatalogInfo, _callback);
        return localVarCall;

    }

    /**
     * Add Product in Catalogs
     * Add a product to catalogs. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfo  (optional)
     * @return ProductInCatalogInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductInCatalogInfo addProductInCatalog(String productCode, String responseFields, ProductInCatalogInfo productInCatalogInfo) throws ApiException {
        ApiResponse<ProductInCatalogInfo> localVarResp = addProductInCatalogWithHttpInfo(productCode, responseFields, productInCatalogInfo);
        return localVarResp.getData();
    }

    /**
     * Add Product in Catalogs
     * Add a product to catalogs. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfo  (optional)
     * @return ApiResponse&lt;ProductInCatalogInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductInCatalogInfo> addProductInCatalogWithHttpInfo(String productCode, String responseFields, ProductInCatalogInfo productInCatalogInfo) throws ApiException {
        okhttp3.Call localVarCall = addProductInCatalogValidateBeforeCall(productCode, responseFields, productInCatalogInfo, null);
        Type localVarReturnType = new TypeToken<ProductInCatalogInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Product in Catalogs (asynchronously)
     * Add a product to catalogs. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfo  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addProductInCatalogAsync(String productCode, String responseFields, ProductInCatalogInfo productInCatalogInfo, final ApiCallback<ProductInCatalogInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = addProductInCatalogValidateBeforeCall(productCode, responseFields, productInCatalogInfo, _callback);
        Type localVarReturnType = new TypeToken<ProductInCatalogInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for changeProductType
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productTypeChangeRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call changeProductTypeCall(String productCode, String responseFields, ProductTypeChangeRequest productTypeChangeRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productTypeChangeRequest;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/changeproducttype"
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
    private okhttp3.Call changeProductTypeValidateBeforeCall(String productCode, String responseFields, ProductTypeChangeRequest productTypeChangeRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling changeProductType(Async)");
        }
        

        okhttp3.Call localVarCall = changeProductTypeCall(productCode, responseFields, productTypeChangeRequest, _callback);
        return localVarCall;

    }

    /**
     * Change product type.
     * Change a product&#39;s product type. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productTypeChangeRequest  (optional)
     * @return ProductTypeChangeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductTypeChangeResponse changeProductType(String productCode, String responseFields, ProductTypeChangeRequest productTypeChangeRequest) throws ApiException {
        ApiResponse<ProductTypeChangeResponse> localVarResp = changeProductTypeWithHttpInfo(productCode, responseFields, productTypeChangeRequest);
        return localVarResp.getData();
    }

    /**
     * Change product type.
     * Change a product&#39;s product type. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productTypeChangeRequest  (optional)
     * @return ApiResponse&lt;ProductTypeChangeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductTypeChangeResponse> changeProductTypeWithHttpInfo(String productCode, String responseFields, ProductTypeChangeRequest productTypeChangeRequest) throws ApiException {
        okhttp3.Call localVarCall = changeProductTypeValidateBeforeCall(productCode, responseFields, productTypeChangeRequest, null);
        Type localVarReturnType = new TypeToken<ProductTypeChangeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Change product type. (asynchronously)
     * Change a product&#39;s product type. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productTypeChangeRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call changeProductTypeAsync(String productCode, String responseFields, ProductTypeChangeRequest productTypeChangeRequest, final ApiCallback<ProductTypeChangeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = changeProductTypeValidateBeforeCall(productCode, responseFields, productTypeChangeRequest, _callback);
        Type localVarReturnType = new TypeToken<ProductTypeChangeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteProduct
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param batchJobCode  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteProductCall(String productCode, String batchJobCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (batchJobCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("batchJobCode", batchJobCode));
        }

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
    private okhttp3.Call deleteProductValidateBeforeCall(String productCode, String batchJobCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling deleteProduct(Async)");
        }
        

        okhttp3.Call localVarCall = deleteProductCall(productCode, batchJobCode, _callback);
        return localVarCall;

    }

    /**
     * Delete Product
     * Deletes the product specified by its product code.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param batchJobCode  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteProduct(String productCode, String batchJobCode) throws ApiException {
        deleteProductWithHttpInfo(productCode, batchJobCode);
    }

    /**
     * Delete Product
     * Deletes the product specified by its product code.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param batchJobCode  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteProductWithHttpInfo(String productCode, String batchJobCode) throws ApiException {
        okhttp3.Call localVarCall = deleteProductValidateBeforeCall(productCode, batchJobCode, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Product (asynchronously)
     * Deletes the product specified by its product code.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param batchJobCode  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteProductAsync(String productCode, String batchJobCode, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteProductValidateBeforeCall(productCode, batchJobCode, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteProductInCatalog
     * @param productCode  (required)
     * @param catalogId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteProductInCatalogCall(String productCode, Integer catalogId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/ProductInCatalogs/{catalogId}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "catalogId" + "\\}", localVarApiClient.escapeString(catalogId.toString()));

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
    private okhttp3.Call deleteProductInCatalogValidateBeforeCall(String productCode, Integer catalogId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling deleteProductInCatalog(Async)");
        }
        
        // verify the required parameter 'catalogId' is set
        if (catalogId == null) {
            throw new ApiException("Missing the required parameter 'catalogId' when calling deleteProductInCatalog(Async)");
        }
        

        okhttp3.Call localVarCall = deleteProductInCatalogCall(productCode, catalogId, _callback);
        return localVarCall;

    }

    /**
     * Delete Product in Catalog
     * Delete a product in a particular catalog.
     * @param productCode  (required)
     * @param catalogId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteProductInCatalog(String productCode, Integer catalogId) throws ApiException {
        deleteProductInCatalogWithHttpInfo(productCode, catalogId);
    }

    /**
     * Delete Product in Catalog
     * Delete a product in a particular catalog.
     * @param productCode  (required)
     * @param catalogId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteProductInCatalogWithHttpInfo(String productCode, Integer catalogId) throws ApiException {
        okhttp3.Call localVarCall = deleteProductInCatalogValidateBeforeCall(productCode, catalogId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Product in Catalog (asynchronously)
     * Delete a product in a particular catalog.
     * @param productCode  (required)
     * @param catalogId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteProductInCatalogAsync(String productCode, Integer catalogId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteProductInCatalogValidateBeforeCall(productCode, catalogId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProduct
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
    public okhttp3.Call getProductCall(String productCode, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}"
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
    private okhttp3.Call getProductValidateBeforeCall(String productCode, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getProduct(Async)");
        }
        

        okhttp3.Call localVarCall = getProductCall(productCode, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product
     * Retrieves details about a product based on the specified response group. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param responseGroups Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsProduct
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsProduct getProduct(String productCode, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsProduct> localVarResp = getProductWithHttpInfo(productCode, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product
     * Retrieves details about a product based on the specified response group. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param responseGroups Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsProduct&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsProduct> getProductWithHttpInfo(String productCode, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProductValidateBeforeCall(productCode, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsProduct>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product (asynchronously)
     * Retrieves details about a product based on the specified response group. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
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
    public okhttp3.Call getProductAsync(String productCode, String responseGroups, String responseFields, final ApiCallback<CatalogAdminsProduct> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductValidateBeforeCall(productCode, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsProduct>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProductInCatalog
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
    public okhttp3.Call getProductInCatalogCall(String productCode, Integer catalogId, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/ProductInCatalogs/{catalogId}"
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
    private okhttp3.Call getProductInCatalogValidateBeforeCall(String productCode, Integer catalogId, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getProductInCatalog(Async)");
        }
        
        // verify the required parameter 'catalogId' is set
        if (catalogId == null) {
            throw new ApiException("Missing the required parameter 'catalogId' when calling getProductInCatalog(Async)");
        }
        

        okhttp3.Call localVarCall = getProductInCatalogCall(productCode, catalogId, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product in Catalog
     * Retrieves a product in a particular catalog. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param catalogId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ProductInCatalogInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductInCatalogInfo getProductInCatalog(String productCode, Integer catalogId, String responseFields) throws ApiException {
        ApiResponse<ProductInCatalogInfo> localVarResp = getProductInCatalogWithHttpInfo(productCode, catalogId, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product in Catalog
     * Retrieves a product in a particular catalog. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param catalogId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;ProductInCatalogInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductInCatalogInfo> getProductInCatalogWithHttpInfo(String productCode, Integer catalogId, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProductInCatalogValidateBeforeCall(productCode, catalogId, responseFields, null);
        Type localVarReturnType = new TypeToken<ProductInCatalogInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product in Catalog (asynchronously)
     * Retrieves a product in a particular catalog. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
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
    public okhttp3.Call getProductInCatalogAsync(String productCode, Integer catalogId, String responseFields, final ApiCallback<ProductInCatalogInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductInCatalogValidateBeforeCall(productCode, catalogId, responseFields, _callback);
        Type localVarReturnType = new TypeToken<ProductInCatalogInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProductInCatalogs
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
    public okhttp3.Call getProductInCatalogsCall(String productCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/ProductInCatalogs"
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
    private okhttp3.Call getProductInCatalogsValidateBeforeCall(String productCode, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getProductInCatalogs(Async)");
        }
        

        okhttp3.Call localVarCall = getProductInCatalogsCall(productCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Products in Catalogs
     * Retrieve products in catalogs. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return List&lt;ProductInCatalogInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ProductInCatalogInfo> getProductInCatalogs(String productCode, String responseFields) throws ApiException {
        ApiResponse<List<ProductInCatalogInfo>> localVarResp = getProductInCatalogsWithHttpInfo(productCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Products in Catalogs
     * Retrieve products in catalogs. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;List&lt;ProductInCatalogInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ProductInCatalogInfo>> getProductInCatalogsWithHttpInfo(String productCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProductInCatalogsValidateBeforeCall(productCode, responseFields, null);
        Type localVarReturnType = new TypeToken<List<ProductInCatalogInfo>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Products in Catalogs (asynchronously)
     * Retrieve products in catalogs. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
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
    public okhttp3.Call getProductInCatalogsAsync(String productCode, String responseFields, final ApiCallback<List<ProductInCatalogInfo>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductInCatalogsValidateBeforeCall(productCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<List<ProductInCatalogInfo>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProducts
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
    public okhttp3.Call getProductsCall(Integer startIndex, Integer pageSize, String sortBy, String responseGroups, String filter, String q, Integer qLimit, Boolean noCount, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products";

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
    private okhttp3.Call getProductsValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String responseGroups, String filter, String q, Integer qLimit, Boolean noCount, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getProductsCall(startIndex, pageSize, sortBy, responseGroups, filter, q, qLimit, noCount, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Products
     * Retrieves a list of products according to any specified filter criteria and sort options. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a single query. The default value is 20 and the maximum value is 200. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending or descending order. For example, to sort the results by “ID” ascending then by “CreateDate” descending, use: id asc,createdate desc. (optional)
     * @param responseGroups Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param q  (optional)
     * @param qLimit  (optional)
     * @param noCount  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsProductCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsProductCollection getProducts(Integer startIndex, Integer pageSize, String sortBy, String responseGroups, String filter, String q, Integer qLimit, Boolean noCount, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsProductCollection> localVarResp = getProductsWithHttpInfo(startIndex, pageSize, sortBy, responseGroups, filter, q, qLimit, noCount, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Products
     * Retrieves a list of products according to any specified filter criteria and sort options. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a single query. The default value is 20 and the maximum value is 200. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending or descending order. For example, to sort the results by “ID” ascending then by “CreateDate” descending, use: id asc,createdate desc. (optional)
     * @param responseGroups Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param q  (optional)
     * @param qLimit  (optional)
     * @param noCount  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsProductCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsProductCollection> getProductsWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String responseGroups, String filter, String q, Integer qLimit, Boolean noCount, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getProductsValidateBeforeCall(startIndex, pageSize, sortBy, responseGroups, filter, q, qLimit, noCount, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsProductCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Products (asynchronously)
     * Retrieves a list of products according to any specified filter criteria and sort options. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
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
    public okhttp3.Call getProductsAsync(Integer startIndex, Integer pageSize, String sortBy, String responseGroups, String filter, String q, Integer qLimit, Boolean noCount, String responseFields, final ApiCallback<CatalogAdminsProductCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductsValidateBeforeCall(startIndex, pageSize, sortBy, responseGroups, filter, q, qLimit, noCount, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsProductCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for renameProductCodes
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productCodeRename An array specifying the existing productCode and the new productCode it should be renamed to (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call renameProductCodesCall(String responseFields, List<ProductCodeRename> productCodeRename, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productCodeRename;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/Actions/RenameProductCodes";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call renameProductCodesValidateBeforeCall(String responseFields, List<ProductCodeRename> productCodeRename, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = renameProductCodesCall(responseFields, productCodeRename, _callback);
        return localVarCall;

    }

    /**
     * Rename Product Codes
     * Action that allows productCodes to be renamed.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productCodeRename An array specifying the existing productCode and the new productCode it should be renamed to (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void renameProductCodes(String responseFields, List<ProductCodeRename> productCodeRename) throws ApiException {
        renameProductCodesWithHttpInfo(responseFields, productCodeRename);
    }

    /**
     * Rename Product Codes
     * Action that allows productCodes to be renamed.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productCodeRename An array specifying the existing productCode and the new productCode it should be renamed to (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> renameProductCodesWithHttpInfo(String responseFields, List<ProductCodeRename> productCodeRename) throws ApiException {
        okhttp3.Call localVarCall = renameProductCodesValidateBeforeCall(responseFields, productCodeRename, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Rename Product Codes (asynchronously)
     * Action that allows productCodes to be renamed.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productCodeRename An array specifying the existing productCode and the new productCode it should be renamed to (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call renameProductCodesAsync(String responseFields, List<ProductCodeRename> productCodeRename, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = renameProductCodesValidateBeforeCall(responseFields, productCodeRename, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProduct
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProduct Properties of the product that you want to update. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductCall(String productCode, String batchJobCode, String responseFields, CatalogAdminsProduct catalogAdminsProduct, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsProduct;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}"
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
    private okhttp3.Call updateProductValidateBeforeCall(String productCode, String batchJobCode, String responseFields, CatalogAdminsProduct catalogAdminsProduct, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updateProduct(Async)");
        }
        

        okhttp3.Call localVarCall = updateProductCall(productCode, batchJobCode, responseFields, catalogAdminsProduct, _callback);
        return localVarCall;

    }

    /**
     * Update Product
     * Modifies an existing product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProduct Properties of the product that you want to update. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. (optional)
     * @return CatalogAdminsProduct
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsProduct updateProduct(String productCode, String batchJobCode, String responseFields, CatalogAdminsProduct catalogAdminsProduct) throws ApiException {
        ApiResponse<CatalogAdminsProduct> localVarResp = updateProductWithHttpInfo(productCode, batchJobCode, responseFields, catalogAdminsProduct);
        return localVarResp.getData();
    }

    /**
     * Update Product
     * Modifies an existing product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProduct Properties of the product that you want to update. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. (optional)
     * @return ApiResponse&lt;CatalogAdminsProduct&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsProduct> updateProductWithHttpInfo(String productCode, String batchJobCode, String responseFields, CatalogAdminsProduct catalogAdminsProduct) throws ApiException {
        okhttp3.Call localVarCall = updateProductValidateBeforeCall(productCode, batchJobCode, responseFields, catalogAdminsProduct, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsProduct>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product (asynchronously)
     * Modifies an existing product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode Merchant-created code associated with the product, for example, a SKU. Required. (required)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProduct Properties of the product that you want to update. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductAsync(String productCode, String batchJobCode, String responseFields, CatalogAdminsProduct catalogAdminsProduct, final ApiCallback<CatalogAdminsProduct> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProductValidateBeforeCall(productCode, batchJobCode, responseFields, catalogAdminsProduct, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsProduct>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProductInCatalog
     * @param productCode  (required)
     * @param catalogId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfo  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductInCatalogCall(String productCode, Integer catalogId, String responseFields, ProductInCatalogInfo productInCatalogInfo, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productInCatalogInfo;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/ProductInCatalogs/{catalogId}"
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
    private okhttp3.Call updateProductInCatalogValidateBeforeCall(String productCode, Integer catalogId, String responseFields, ProductInCatalogInfo productInCatalogInfo, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updateProductInCatalog(Async)");
        }
        
        // verify the required parameter 'catalogId' is set
        if (catalogId == null) {
            throw new ApiException("Missing the required parameter 'catalogId' when calling updateProductInCatalog(Async)");
        }
        

        okhttp3.Call localVarCall = updateProductInCatalogCall(productCode, catalogId, responseFields, productInCatalogInfo, _callback);
        return localVarCall;

    }

    /**
     * Update Product in Catalog
     * Update a product in a particular catalog. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param catalogId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfo  (optional)
     * @return ProductInCatalogInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductInCatalogInfo updateProductInCatalog(String productCode, Integer catalogId, String responseFields, ProductInCatalogInfo productInCatalogInfo) throws ApiException {
        ApiResponse<ProductInCatalogInfo> localVarResp = updateProductInCatalogWithHttpInfo(productCode, catalogId, responseFields, productInCatalogInfo);
        return localVarResp.getData();
    }

    /**
     * Update Product in Catalog
     * Update a product in a particular catalog. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param catalogId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfo  (optional)
     * @return ApiResponse&lt;ProductInCatalogInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductInCatalogInfo> updateProductInCatalogWithHttpInfo(String productCode, Integer catalogId, String responseFields, ProductInCatalogInfo productInCatalogInfo) throws ApiException {
        okhttp3.Call localVarCall = updateProductInCatalogValidateBeforeCall(productCode, catalogId, responseFields, productInCatalogInfo, null);
        Type localVarReturnType = new TypeToken<ProductInCatalogInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product in Catalog (asynchronously)
     * Update a product in a particular catalog. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param catalogId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfo  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductInCatalogAsync(String productCode, Integer catalogId, String responseFields, ProductInCatalogInfo productInCatalogInfo, final ApiCallback<ProductInCatalogInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProductInCatalogValidateBeforeCall(productCode, catalogId, responseFields, productInCatalogInfo, _callback);
        Type localVarReturnType = new TypeToken<ProductInCatalogInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProductInCatalogs
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfo  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductInCatalogsCall(String productCode, String responseFields, List<ProductInCatalogInfo> productInCatalogInfo, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productInCatalogInfo;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/ProductInCatalogs"
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
    private okhttp3.Call updateProductInCatalogsValidateBeforeCall(String productCode, String responseFields, List<ProductInCatalogInfo> productInCatalogInfo, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updateProductInCatalogs(Async)");
        }
        

        okhttp3.Call localVarCall = updateProductInCatalogsCall(productCode, responseFields, productInCatalogInfo, _callback);
        return localVarCall;

    }

    /**
     * Update Product in Catalogs
     * Updates existing products across your catalogs. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfo  (optional)
     * @return List&lt;ProductInCatalogInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ProductInCatalogInfo> updateProductInCatalogs(String productCode, String responseFields, List<ProductInCatalogInfo> productInCatalogInfo) throws ApiException {
        ApiResponse<List<ProductInCatalogInfo>> localVarResp = updateProductInCatalogsWithHttpInfo(productCode, responseFields, productInCatalogInfo);
        return localVarResp.getData();
    }

    /**
     * Update Product in Catalogs
     * Updates existing products across your catalogs. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfo  (optional)
     * @return ApiResponse&lt;List&lt;ProductInCatalogInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ProductInCatalogInfo>> updateProductInCatalogsWithHttpInfo(String productCode, String responseFields, List<ProductInCatalogInfo> productInCatalogInfo) throws ApiException {
        okhttp3.Call localVarCall = updateProductInCatalogsValidateBeforeCall(productCode, responseFields, productInCatalogInfo, null);
        Type localVarReturnType = new TypeToken<List<ProductInCatalogInfo>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product in Catalogs (asynchronously)
     * Updates existing products across your catalogs. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productInCatalogInfo  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductInCatalogsAsync(String productCode, String responseFields, List<ProductInCatalogInfo> productInCatalogInfo, final ApiCallback<List<ProductInCatalogInfo>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProductInCatalogsValidateBeforeCall(productCode, responseFields, productInCatalogInfo, _callback);
        Type localVarReturnType = new TypeToken<List<ProductInCatalogInfo>>(){}.getType();
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
        public ProductsApi build() {
            return new ProductsApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
