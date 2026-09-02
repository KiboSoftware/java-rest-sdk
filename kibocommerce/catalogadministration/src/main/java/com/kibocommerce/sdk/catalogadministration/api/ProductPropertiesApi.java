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


import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsProductProperty;
import com.kibocommerce.sdk.catalogadministration.models.ProductPropertyValueLocalizedContent;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ProductPropertiesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public ProductPropertiesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductPropertiesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public ProductPropertiesApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public ProductPropertiesApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public ProductPropertiesApi(Builder builder) {
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
     * Build call for addProperty
     * @param productCode  (required)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductProperty  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPropertyCall(String productCode, String batchJobCode, String responseFields, CatalogAdminsProductProperty catalogAdminsProductProperty, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsProductProperty;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Properties"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addPropertyValidateBeforeCall(String productCode, String batchJobCode, String responseFields, CatalogAdminsProductProperty catalogAdminsProductProperty, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling addProperty(Async)");
        }
        

        okhttp3.Call localVarCall = addPropertyCall(productCode, batchJobCode, responseFields, catalogAdminsProductProperty, _callback);
        return localVarCall;

    }

    /**
     * Add Product Property
     * Add a property to a product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductProperty  (optional)
     * @return CatalogAdminsProductProperty
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsProductProperty addProperty(String productCode, String batchJobCode, String responseFields, CatalogAdminsProductProperty catalogAdminsProductProperty) throws ApiException {
        ApiResponse<CatalogAdminsProductProperty> localVarResp = addPropertyWithHttpInfo(productCode, batchJobCode, responseFields, catalogAdminsProductProperty);
        return localVarResp.getData();
    }

    /**
     * Add Product Property
     * Add a property to a product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductProperty  (optional)
     * @return ApiResponse&lt;CatalogAdminsProductProperty&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsProductProperty> addPropertyWithHttpInfo(String productCode, String batchJobCode, String responseFields, CatalogAdminsProductProperty catalogAdminsProductProperty) throws ApiException {
        okhttp3.Call localVarCall = addPropertyValidateBeforeCall(productCode, batchJobCode, responseFields, catalogAdminsProductProperty, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsProductProperty>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Product Property (asynchronously)
     * Add a property to a product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductProperty  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPropertyAsync(String productCode, String batchJobCode, String responseFields, CatalogAdminsProductProperty catalogAdminsProductProperty, final ApiCallback<CatalogAdminsProductProperty> _callback) throws ApiException {

        okhttp3.Call localVarCall = addPropertyValidateBeforeCall(productCode, batchJobCode, responseFields, catalogAdminsProductProperty, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsProductProperty>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addPropertyValueLocalizedContent
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productPropertyValueLocalizedContent  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPropertyValueLocalizedContentCall(String productCode, String attributeFQN, String value, String responseFields, ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productPropertyValueLocalizedContent;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "value" + "\\}", localVarApiClient.escapeString(value.toString()));

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
    private okhttp3.Call addPropertyValueLocalizedContentValidateBeforeCall(String productCode, String attributeFQN, String value, String responseFields, ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling addPropertyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling addPropertyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling addPropertyValueLocalizedContent(Async)");
        }
        

        okhttp3.Call localVarCall = addPropertyValueLocalizedContentCall(productCode, attributeFQN, value, responseFields, productPropertyValueLocalizedContent, _callback);
        return localVarCall;

    }

    /**
     * Add Product Property Localized Content
     * Add property value localized content.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productPropertyValueLocalizedContent  (optional)
     * @return ProductPropertyValueLocalizedContent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductPropertyValueLocalizedContent addPropertyValueLocalizedContent(String productCode, String attributeFQN, String value, String responseFields, ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent) throws ApiException {
        ApiResponse<ProductPropertyValueLocalizedContent> localVarResp = addPropertyValueLocalizedContentWithHttpInfo(productCode, attributeFQN, value, responseFields, productPropertyValueLocalizedContent);
        return localVarResp.getData();
    }

    /**
     * Add Product Property Localized Content
     * Add property value localized content.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productPropertyValueLocalizedContent  (optional)
     * @return ApiResponse&lt;ProductPropertyValueLocalizedContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductPropertyValueLocalizedContent> addPropertyValueLocalizedContentWithHttpInfo(String productCode, String attributeFQN, String value, String responseFields, ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent) throws ApiException {
        okhttp3.Call localVarCall = addPropertyValueLocalizedContentValidateBeforeCall(productCode, attributeFQN, value, responseFields, productPropertyValueLocalizedContent, null);
        Type localVarReturnType = new TypeToken<ProductPropertyValueLocalizedContent>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Product Property Localized Content (asynchronously)
     * Add property value localized content.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productPropertyValueLocalizedContent  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPropertyValueLocalizedContentAsync(String productCode, String attributeFQN, String value, String responseFields, ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent, final ApiCallback<ProductPropertyValueLocalizedContent> _callback) throws ApiException {

        okhttp3.Call localVarCall = addPropertyValueLocalizedContentValidateBeforeCall(productCode, attributeFQN, value, responseFields, productPropertyValueLocalizedContent, _callback);
        Type localVarReturnType = new TypeToken<ProductPropertyValueLocalizedContent>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteProperty
     * @param productCode  (required)
     * @param attributeFQN  (required)
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
    public okhttp3.Call deletePropertyCall(String productCode, String attributeFQN, String batchJobCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

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
    private okhttp3.Call deletePropertyValidateBeforeCall(String productCode, String attributeFQN, String batchJobCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling deleteProperty(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling deleteProperty(Async)");
        }
        

        okhttp3.Call localVarCall = deletePropertyCall(productCode, attributeFQN, batchJobCode, _callback);
        return localVarCall;

    }

    /**
     * Delete Product Property
     * Delete a specific product property.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param batchJobCode  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteProperty(String productCode, String attributeFQN, String batchJobCode) throws ApiException {
        deletePropertyWithHttpInfo(productCode, attributeFQN, batchJobCode);
    }

    /**
     * Delete Product Property
     * Delete a specific product property.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param batchJobCode  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deletePropertyWithHttpInfo(String productCode, String attributeFQN, String batchJobCode) throws ApiException {
        okhttp3.Call localVarCall = deletePropertyValidateBeforeCall(productCode, attributeFQN, batchJobCode, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Product Property (asynchronously)
     * Delete a specific product property.
     * @param productCode  (required)
     * @param attributeFQN  (required)
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
    public okhttp3.Call deletePropertyAsync(String productCode, String attributeFQN, String batchJobCode, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePropertyValidateBeforeCall(productCode, attributeFQN, batchJobCode, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePropertyValueLocalizedContent
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePropertyValueLocalizedContentCall(String productCode, String attributeFQN, String value, String localeCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent/{localeCode}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "value" + "\\}", localVarApiClient.escapeString(value.toString()))
            .replaceAll("\\{" + "localeCode" + "\\}", localVarApiClient.escapeString(localeCode.toString()));

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
    private okhttp3.Call deletePropertyValueLocalizedContentValidateBeforeCall(String productCode, String attributeFQN, String value, String localeCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling deletePropertyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling deletePropertyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling deletePropertyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'localeCode' is set
        if (localeCode == null) {
            throw new ApiException("Missing the required parameter 'localeCode' when calling deletePropertyValueLocalizedContent(Async)");
        }
        

        okhttp3.Call localVarCall = deletePropertyValueLocalizedContentCall(productCode, attributeFQN, value, localeCode, _callback);
        return localVarCall;

    }

    /**
     * Delete Product Property Localized Content by Locale
     * Delete property value localized content by locale code.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deletePropertyValueLocalizedContent(String productCode, String attributeFQN, String value, String localeCode) throws ApiException {
        deletePropertyValueLocalizedContentWithHttpInfo(productCode, attributeFQN, value, localeCode);
    }

    /**
     * Delete Product Property Localized Content by Locale
     * Delete property value localized content by locale code.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deletePropertyValueLocalizedContentWithHttpInfo(String productCode, String attributeFQN, String value, String localeCode) throws ApiException {
        okhttp3.Call localVarCall = deletePropertyValueLocalizedContentValidateBeforeCall(productCode, attributeFQN, value, localeCode, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Product Property Localized Content by Locale (asynchronously)
     * Delete property value localized content by locale code.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePropertyValueLocalizedContentAsync(String productCode, String attributeFQN, String value, String localeCode, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePropertyValueLocalizedContentValidateBeforeCall(productCode, attributeFQN, value, localeCode, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProperties
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
    public okhttp3.Call getPropertiesCall(String productCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Properties"
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
    private okhttp3.Call getPropertiesValidateBeforeCall(String productCode, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getProperties(Async)");
        }
        

        okhttp3.Call localVarCall = getPropertiesCall(productCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Properties
     * Get properties for a product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return List&lt;CatalogAdminsProductProperty&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<CatalogAdminsProductProperty> getProperties(String productCode, String responseFields) throws ApiException {
        ApiResponse<List<CatalogAdminsProductProperty>> localVarResp = getPropertiesWithHttpInfo(productCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Properties
     * Get properties for a product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;List&lt;CatalogAdminsProductProperty&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<CatalogAdminsProductProperty>> getPropertiesWithHttpInfo(String productCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getPropertiesValidateBeforeCall(productCode, responseFields, null);
        Type localVarReturnType = new TypeToken<List<CatalogAdminsProductProperty>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Properties (asynchronously)
     * Get properties for a product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
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
    public okhttp3.Call getPropertiesAsync(String productCode, String responseFields, final ApiCallback<List<CatalogAdminsProductProperty>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPropertiesValidateBeforeCall(productCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<List<CatalogAdminsProductProperty>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProperty
     * @param productCode  (required)
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
    public okhttp3.Call getPropertyCall(String productCode, String attributeFQN, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
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
    private okhttp3.Call getPropertyValidateBeforeCall(String productCode, String attributeFQN, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getProperty(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getProperty(Async)");
        }
        

        okhttp3.Call localVarCall = getPropertyCall(productCode, attributeFQN, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Property
     * Get a specific product property. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsProductProperty
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsProductProperty getProperty(String productCode, String attributeFQN, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsProductProperty> localVarResp = getPropertyWithHttpInfo(productCode, attributeFQN, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Property
     * Get a specific product property. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsProductProperty&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsProductProperty> getPropertyWithHttpInfo(String productCode, String attributeFQN, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getPropertyValidateBeforeCall(productCode, attributeFQN, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsProductProperty>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Property (asynchronously)
     * Get a specific product property. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
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
    public okhttp3.Call getPropertyAsync(String productCode, String attributeFQN, String responseFields, final ApiCallback<CatalogAdminsProductProperty> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPropertyValidateBeforeCall(productCode, attributeFQN, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsProductProperty>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPropertyValueLocalizedContent
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
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
    public okhttp3.Call getPropertyValueLocalizedContentCall(String productCode, String attributeFQN, String value, String localeCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent/{localeCode}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "value" + "\\}", localVarApiClient.escapeString(value.toString()))
            .replaceAll("\\{" + "localeCode" + "\\}", localVarApiClient.escapeString(localeCode.toString()));

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
    private okhttp3.Call getPropertyValueLocalizedContentValidateBeforeCall(String productCode, String attributeFQN, String value, String localeCode, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getPropertyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getPropertyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling getPropertyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'localeCode' is set
        if (localeCode == null) {
            throw new ApiException("Missing the required parameter 'localeCode' when calling getPropertyValueLocalizedContent(Async)");
        }
        

        okhttp3.Call localVarCall = getPropertyValueLocalizedContentCall(productCode, attributeFQN, value, localeCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Property Localized Content by Locale
     * Get property value localized content.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ProductPropertyValueLocalizedContent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductPropertyValueLocalizedContent getPropertyValueLocalizedContent(String productCode, String attributeFQN, String value, String localeCode, String responseFields) throws ApiException {
        ApiResponse<ProductPropertyValueLocalizedContent> localVarResp = getPropertyValueLocalizedContentWithHttpInfo(productCode, attributeFQN, value, localeCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Property Localized Content by Locale
     * Get property value localized content.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;ProductPropertyValueLocalizedContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductPropertyValueLocalizedContent> getPropertyValueLocalizedContentWithHttpInfo(String productCode, String attributeFQN, String value, String localeCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getPropertyValueLocalizedContentValidateBeforeCall(productCode, attributeFQN, value, localeCode, responseFields, null);
        Type localVarReturnType = new TypeToken<ProductPropertyValueLocalizedContent>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Property Localized Content by Locale (asynchronously)
     * Get property value localized content.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
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
    public okhttp3.Call getPropertyValueLocalizedContentAsync(String productCode, String attributeFQN, String value, String localeCode, String responseFields, final ApiCallback<ProductPropertyValueLocalizedContent> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPropertyValueLocalizedContentValidateBeforeCall(productCode, attributeFQN, value, localeCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<ProductPropertyValueLocalizedContent>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPropertyValueLocalizedContents
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
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
    public okhttp3.Call getPropertyValueLocalizedContentsCall(String productCode, String attributeFQN, String value, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "value" + "\\}", localVarApiClient.escapeString(value.toString()));

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
    private okhttp3.Call getPropertyValueLocalizedContentsValidateBeforeCall(String productCode, String attributeFQN, String value, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getPropertyValueLocalizedContents(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getPropertyValueLocalizedContents(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling getPropertyValueLocalizedContents(Async)");
        }
        

        okhttp3.Call localVarCall = getPropertyValueLocalizedContentsCall(productCode, attributeFQN, value, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Property Localized Contents
     * Get property value localized content.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return List&lt;ProductPropertyValueLocalizedContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ProductPropertyValueLocalizedContent> getPropertyValueLocalizedContents(String productCode, String attributeFQN, String value, String responseFields) throws ApiException {
        ApiResponse<List<ProductPropertyValueLocalizedContent>> localVarResp = getPropertyValueLocalizedContentsWithHttpInfo(productCode, attributeFQN, value, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Property Localized Contents
     * Get property value localized content.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;List&lt;ProductPropertyValueLocalizedContent&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ProductPropertyValueLocalizedContent>> getPropertyValueLocalizedContentsWithHttpInfo(String productCode, String attributeFQN, String value, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getPropertyValueLocalizedContentsValidateBeforeCall(productCode, attributeFQN, value, responseFields, null);
        Type localVarReturnType = new TypeToken<List<ProductPropertyValueLocalizedContent>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Property Localized Contents (asynchronously)
     * Get property value localized content.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
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
    public okhttp3.Call getPropertyValueLocalizedContentsAsync(String productCode, String attributeFQN, String value, String responseFields, final ApiCallback<List<ProductPropertyValueLocalizedContent>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPropertyValueLocalizedContentsValidateBeforeCall(productCode, attributeFQN, value, responseFields, _callback);
        Type localVarReturnType = new TypeToken<List<ProductPropertyValueLocalizedContent>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProperty
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param batchJobCode  (optional)
     * @param allowSyscalcValueUpdates  (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductProperty  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePropertyCall(String productCode, String attributeFQN, String batchJobCode, Boolean allowSyscalcValueUpdates, String responseFields, CatalogAdminsProductProperty catalogAdminsProductProperty, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsProductProperty;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (batchJobCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("batchJobCode", batchJobCode));
        }

        if (allowSyscalcValueUpdates != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("allowSyscalcValueUpdates", allowSyscalcValueUpdates));
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
    private okhttp3.Call updatePropertyValidateBeforeCall(String productCode, String attributeFQN, String batchJobCode, Boolean allowSyscalcValueUpdates, String responseFields, CatalogAdminsProductProperty catalogAdminsProductProperty, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updateProperty(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updateProperty(Async)");
        }
        

        okhttp3.Call localVarCall = updatePropertyCall(productCode, attributeFQN, batchJobCode, allowSyscalcValueUpdates, responseFields, catalogAdminsProductProperty, _callback);
        return localVarCall;

    }

    /**
     * Update Product Property
     * Update a specific product property. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param batchJobCode  (optional)
     * @param allowSyscalcValueUpdates  (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductProperty  (optional)
     * @return CatalogAdminsProductProperty
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsProductProperty updateProperty(String productCode, String attributeFQN, String batchJobCode, Boolean allowSyscalcValueUpdates, String responseFields, CatalogAdminsProductProperty catalogAdminsProductProperty) throws ApiException {
        ApiResponse<CatalogAdminsProductProperty> localVarResp = updatePropertyWithHttpInfo(productCode, attributeFQN, batchJobCode, allowSyscalcValueUpdates, responseFields, catalogAdminsProductProperty);
        return localVarResp.getData();
    }

    /**
     * Update Product Property
     * Update a specific product property. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param batchJobCode  (optional)
     * @param allowSyscalcValueUpdates  (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductProperty  (optional)
     * @return ApiResponse&lt;CatalogAdminsProductProperty&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsProductProperty> updatePropertyWithHttpInfo(String productCode, String attributeFQN, String batchJobCode, Boolean allowSyscalcValueUpdates, String responseFields, CatalogAdminsProductProperty catalogAdminsProductProperty) throws ApiException {
        okhttp3.Call localVarCall = updatePropertyValidateBeforeCall(productCode, attributeFQN, batchJobCode, allowSyscalcValueUpdates, responseFields, catalogAdminsProductProperty, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsProductProperty>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product Property (asynchronously)
     * Update a specific product property. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param batchJobCode  (optional)
     * @param allowSyscalcValueUpdates  (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsProductProperty  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePropertyAsync(String productCode, String attributeFQN, String batchJobCode, Boolean allowSyscalcValueUpdates, String responseFields, CatalogAdminsProductProperty catalogAdminsProductProperty, final ApiCallback<CatalogAdminsProductProperty> _callback) throws ApiException {

        okhttp3.Call localVarCall = updatePropertyValidateBeforeCall(productCode, attributeFQN, batchJobCode, allowSyscalcValueUpdates, responseFields, catalogAdminsProductProperty, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsProductProperty>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updatePropertyValueLocalizedContent
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productPropertyValueLocalizedContent  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePropertyValueLocalizedContentCall(String productCode, String attributeFQN, String value, String localeCode, String responseFields, ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productPropertyValueLocalizedContent;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent/{localeCode}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "value" + "\\}", localVarApiClient.escapeString(value.toString()))
            .replaceAll("\\{" + "localeCode" + "\\}", localVarApiClient.escapeString(localeCode.toString()));

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
    private okhttp3.Call updatePropertyValueLocalizedContentValidateBeforeCall(String productCode, String attributeFQN, String value, String localeCode, String responseFields, ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updatePropertyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updatePropertyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling updatePropertyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'localeCode' is set
        if (localeCode == null) {
            throw new ApiException("Missing the required parameter 'localeCode' when calling updatePropertyValueLocalizedContent(Async)");
        }
        

        okhttp3.Call localVarCall = updatePropertyValueLocalizedContentCall(productCode, attributeFQN, value, localeCode, responseFields, productPropertyValueLocalizedContent, _callback);
        return localVarCall;

    }

    /**
     * Update Product Property Localized Content by Locale
     * Update property value localized content by locale code.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productPropertyValueLocalizedContent  (optional)
     * @return ProductPropertyValueLocalizedContent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductPropertyValueLocalizedContent updatePropertyValueLocalizedContent(String productCode, String attributeFQN, String value, String localeCode, String responseFields, ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent) throws ApiException {
        ApiResponse<ProductPropertyValueLocalizedContent> localVarResp = updatePropertyValueLocalizedContentWithHttpInfo(productCode, attributeFQN, value, localeCode, responseFields, productPropertyValueLocalizedContent);
        return localVarResp.getData();
    }

    /**
     * Update Product Property Localized Content by Locale
     * Update property value localized content by locale code.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productPropertyValueLocalizedContent  (optional)
     * @return ApiResponse&lt;ProductPropertyValueLocalizedContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductPropertyValueLocalizedContent> updatePropertyValueLocalizedContentWithHttpInfo(String productCode, String attributeFQN, String value, String localeCode, String responseFields, ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent) throws ApiException {
        okhttp3.Call localVarCall = updatePropertyValueLocalizedContentValidateBeforeCall(productCode, attributeFQN, value, localeCode, responseFields, productPropertyValueLocalizedContent, null);
        Type localVarReturnType = new TypeToken<ProductPropertyValueLocalizedContent>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product Property Localized Content by Locale (asynchronously)
     * Update property value localized content by locale code.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productPropertyValueLocalizedContent  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePropertyValueLocalizedContentAsync(String productCode, String attributeFQN, String value, String localeCode, String responseFields, ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent, final ApiCallback<ProductPropertyValueLocalizedContent> _callback) throws ApiException {

        okhttp3.Call localVarCall = updatePropertyValueLocalizedContentValidateBeforeCall(productCode, attributeFQN, value, localeCode, responseFields, productPropertyValueLocalizedContent, _callback);
        Type localVarReturnType = new TypeToken<ProductPropertyValueLocalizedContent>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updatePropertyValueLocalizedContents
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productPropertyValueLocalizedContent  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePropertyValueLocalizedContentsCall(String productCode, String attributeFQN, String value, String responseFields, List<ProductPropertyValueLocalizedContent> productPropertyValueLocalizedContent, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productPropertyValueLocalizedContent;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "value" + "\\}", localVarApiClient.escapeString(value.toString()));

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
    private okhttp3.Call updatePropertyValueLocalizedContentsValidateBeforeCall(String productCode, String attributeFQN, String value, String responseFields, List<ProductPropertyValueLocalizedContent> productPropertyValueLocalizedContent, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updatePropertyValueLocalizedContents(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updatePropertyValueLocalizedContents(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling updatePropertyValueLocalizedContents(Async)");
        }
        

        okhttp3.Call localVarCall = updatePropertyValueLocalizedContentsCall(productCode, attributeFQN, value, responseFields, productPropertyValueLocalizedContent, _callback);
        return localVarCall;

    }

    /**
     * Update Product Property Localized Content
     * Update property value localized content.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productPropertyValueLocalizedContent  (optional)
     * @return List&lt;ProductPropertyValueLocalizedContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ProductPropertyValueLocalizedContent> updatePropertyValueLocalizedContents(String productCode, String attributeFQN, String value, String responseFields, List<ProductPropertyValueLocalizedContent> productPropertyValueLocalizedContent) throws ApiException {
        ApiResponse<List<ProductPropertyValueLocalizedContent>> localVarResp = updatePropertyValueLocalizedContentsWithHttpInfo(productCode, attributeFQN, value, responseFields, productPropertyValueLocalizedContent);
        return localVarResp.getData();
    }

    /**
     * Update Product Property Localized Content
     * Update property value localized content.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productPropertyValueLocalizedContent  (optional)
     * @return ApiResponse&lt;List&lt;ProductPropertyValueLocalizedContent&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ProductPropertyValueLocalizedContent>> updatePropertyValueLocalizedContentsWithHttpInfo(String productCode, String attributeFQN, String value, String responseFields, List<ProductPropertyValueLocalizedContent> productPropertyValueLocalizedContent) throws ApiException {
        okhttp3.Call localVarCall = updatePropertyValueLocalizedContentsValidateBeforeCall(productCode, attributeFQN, value, responseFields, productPropertyValueLocalizedContent, null);
        Type localVarReturnType = new TypeToken<List<ProductPropertyValueLocalizedContent>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product Property Localized Content (asynchronously)
     * Update property value localized content.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productPropertyValueLocalizedContent  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePropertyValueLocalizedContentsAsync(String productCode, String attributeFQN, String value, String responseFields, List<ProductPropertyValueLocalizedContent> productPropertyValueLocalizedContent, final ApiCallback<List<ProductPropertyValueLocalizedContent>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updatePropertyValueLocalizedContentsValidateBeforeCall(productCode, attributeFQN, value, responseFields, productPropertyValueLocalizedContent, _callback);
        Type localVarReturnType = new TypeToken<List<ProductPropertyValueLocalizedContent>>(){}.getType();
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
        public ProductPropertiesApi build() {
            return new ProductPropertiesApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
