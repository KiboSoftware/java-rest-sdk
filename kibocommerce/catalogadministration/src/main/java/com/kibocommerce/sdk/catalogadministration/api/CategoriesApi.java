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


import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsCategory;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsCategoryAttribute;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsCategoryCollection;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsCategoryPagedCollection;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsDynamicExpression;
import com.kibocommerce.sdk.catalogadministration.models.CategoryAttributeCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CategoriesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public CategoriesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CategoriesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public CategoriesApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public CategoriesApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public CategoriesApi(Builder builder) {
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
     * Build call for addCategory
     * @param incrementSequence Sets the sequence number of the category to the current max sequence value plus 1 (e.g. 5 + 1 &#x3D; 6) (optional, default to false)
     * @param useProvidedId If true, the provided Id value will be used as the CategoryId. If omitted or false, the system will generate a CategoryId (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCategory Properties of the new category. Required properties ParentCategoryID and Content.Name. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addCategoryCall(Boolean incrementSequence, Boolean useProvidedId, String responseFields, CatalogAdminsCategory catalogAdminsCategory, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsCategory;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/categories";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (incrementSequence != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("incrementSequence", incrementSequence));
        }

        if (useProvidedId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("useProvidedId", useProvidedId));
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
    private okhttp3.Call addCategoryValidateBeforeCall(Boolean incrementSequence, Boolean useProvidedId, String responseFields, CatalogAdminsCategory catalogAdminsCategory, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = addCategoryCall(incrementSequence, useProvidedId, responseFields, catalogAdminsCategory, _callback);
        return localVarCall;

    }

    /**
     * Add Category
     * Adds a new category to the catalog&#39;s category hierarchy. Specify a ParentCategoryID to determine where to locate the category in the hierarchy; if not specified it becomes a top-level category. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param incrementSequence Sets the sequence number of the category to the current max sequence value plus 1 (e.g. 5 + 1 &#x3D; 6) (optional, default to false)
     * @param useProvidedId If true, the provided Id value will be used as the CategoryId. If omitted or false, the system will generate a CategoryId (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCategory Properties of the new category. Required properties ParentCategoryID and Content.Name. (optional)
     * @return CatalogAdminsCategory
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsCategory addCategory(Boolean incrementSequence, Boolean useProvidedId, String responseFields, CatalogAdminsCategory catalogAdminsCategory) throws ApiException {
        ApiResponse<CatalogAdminsCategory> localVarResp = addCategoryWithHttpInfo(incrementSequence, useProvidedId, responseFields, catalogAdminsCategory);
        return localVarResp.getData();
    }

    /**
     * Add Category
     * Adds a new category to the catalog&#39;s category hierarchy. Specify a ParentCategoryID to determine where to locate the category in the hierarchy; if not specified it becomes a top-level category. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param incrementSequence Sets the sequence number of the category to the current max sequence value plus 1 (e.g. 5 + 1 &#x3D; 6) (optional, default to false)
     * @param useProvidedId If true, the provided Id value will be used as the CategoryId. If omitted or false, the system will generate a CategoryId (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCategory Properties of the new category. Required properties ParentCategoryID and Content.Name. (optional)
     * @return ApiResponse&lt;CatalogAdminsCategory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsCategory> addCategoryWithHttpInfo(Boolean incrementSequence, Boolean useProvidedId, String responseFields, CatalogAdminsCategory catalogAdminsCategory) throws ApiException {
        okhttp3.Call localVarCall = addCategoryValidateBeforeCall(incrementSequence, useProvidedId, responseFields, catalogAdminsCategory, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategory>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Category (asynchronously)
     * Adds a new category to the catalog&#39;s category hierarchy. Specify a ParentCategoryID to determine where to locate the category in the hierarchy; if not specified it becomes a top-level category. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param incrementSequence Sets the sequence number of the category to the current max sequence value plus 1 (e.g. 5 + 1 &#x3D; 6) (optional, default to false)
     * @param useProvidedId If true, the provided Id value will be used as the CategoryId. If omitted or false, the system will generate a CategoryId (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCategory Properties of the new category. Required properties ParentCategoryID and Content.Name. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addCategoryAsync(Boolean incrementSequence, Boolean useProvidedId, String responseFields, CatalogAdminsCategory catalogAdminsCategory, final ApiCallback<CatalogAdminsCategory> _callback) throws ApiException {

        okhttp3.Call localVarCall = addCategoryValidateBeforeCall(incrementSequence, useProvidedId, responseFields, catalogAdminsCategory, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategory>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addCategoryAttribute
     * @param categoryId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCategoryAttribute  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addCategoryAttributeCall(Integer categoryId, String responseFields, CatalogAdminsCategoryAttribute catalogAdminsCategoryAttribute, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsCategoryAttribute;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/categories/{categoryId}/attributes"
            .replaceAll("\\{" + "categoryId" + "\\}", localVarApiClient.escapeString(categoryId.toString()));

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
    private okhttp3.Call addCategoryAttributeValidateBeforeCall(Integer categoryId, String responseFields, CatalogAdminsCategoryAttribute catalogAdminsCategoryAttribute, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException("Missing the required parameter 'categoryId' when calling addCategoryAttribute(Async)");
        }
        

        okhttp3.Call localVarCall = addCategoryAttributeCall(categoryId, responseFields, catalogAdminsCategoryAttribute, _callback);
        return localVarCall;

    }

    /**
     * Add Category Attribute
     * Adds a new category attribute to the category. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCategoryAttribute  (optional)
     * @return CatalogAdminsCategoryAttribute
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsCategoryAttribute addCategoryAttribute(Integer categoryId, String responseFields, CatalogAdminsCategoryAttribute catalogAdminsCategoryAttribute) throws ApiException {
        ApiResponse<CatalogAdminsCategoryAttribute> localVarResp = addCategoryAttributeWithHttpInfo(categoryId, responseFields, catalogAdminsCategoryAttribute);
        return localVarResp.getData();
    }

    /**
     * Add Category Attribute
     * Adds a new category attribute to the category. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCategoryAttribute  (optional)
     * @return ApiResponse&lt;CatalogAdminsCategoryAttribute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsCategoryAttribute> addCategoryAttributeWithHttpInfo(Integer categoryId, String responseFields, CatalogAdminsCategoryAttribute catalogAdminsCategoryAttribute) throws ApiException {
        okhttp3.Call localVarCall = addCategoryAttributeValidateBeforeCall(categoryId, responseFields, catalogAdminsCategoryAttribute, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategoryAttribute>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Category Attribute (asynchronously)
     * Adds a new category attribute to the category. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCategoryAttribute  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addCategoryAttributeAsync(Integer categoryId, String responseFields, CatalogAdminsCategoryAttribute catalogAdminsCategoryAttribute, final ApiCallback<CatalogAdminsCategoryAttribute> _callback) throws ApiException {

        okhttp3.Call localVarCall = addCategoryAttributeValidateBeforeCall(categoryId, responseFields, catalogAdminsCategoryAttribute, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategoryAttribute>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addProductsToCategory
     * @param categoryId Unique identifier of the category that you want produts added to. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param requestBody A list of products to be added to the category. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addProductsToCategoryCall(Integer categoryId, String responseFields, List<String> requestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/categories/{categoryId}/add-products"
            .replaceAll("\\{" + "categoryId" + "\\}", localVarApiClient.escapeString(categoryId.toString()));

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
    private okhttp3.Call addProductsToCategoryValidateBeforeCall(Integer categoryId, String responseFields, List<String> requestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException("Missing the required parameter 'categoryId' when calling addProductsToCategory(Async)");
        }
        

        okhttp3.Call localVarCall = addProductsToCategoryCall(categoryId, responseFields, requestBody, _callback);
        return localVarCall;

    }

    /**
     * Add Products to Category
     * Adds the products in the provided product code list to the specified category.
     * @param categoryId Unique identifier of the category that you want produts added to. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param requestBody A list of products to be added to the category. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void addProductsToCategory(Integer categoryId, String responseFields, List<String> requestBody) throws ApiException {
        addProductsToCategoryWithHttpInfo(categoryId, responseFields, requestBody);
    }

    /**
     * Add Products to Category
     * Adds the products in the provided product code list to the specified category.
     * @param categoryId Unique identifier of the category that you want produts added to. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param requestBody A list of products to be added to the category. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> addProductsToCategoryWithHttpInfo(Integer categoryId, String responseFields, List<String> requestBody) throws ApiException {
        okhttp3.Call localVarCall = addProductsToCategoryValidateBeforeCall(categoryId, responseFields, requestBody, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Add Products to Category (asynchronously)
     * Adds the products in the provided product code list to the specified category.
     * @param categoryId Unique identifier of the category that you want produts added to. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param requestBody A list of products to be added to the category. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addProductsToCategoryAsync(Integer categoryId, String responseFields, List<String> requestBody, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = addProductsToCategoryValidateBeforeCall(categoryId, responseFields, requestBody, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCategoryAttribute
     * @param categoryId  (required)
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
    public okhttp3.Call deleteCategoryAttributeCall(Integer categoryId, String attributeFQN, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/categories/{categoryId}/attributes/{attributeFQN}"
            .replaceAll("\\{" + "categoryId" + "\\}", localVarApiClient.escapeString(categoryId.toString()))
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
    private okhttp3.Call deleteCategoryAttributeValidateBeforeCall(Integer categoryId, String attributeFQN, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException("Missing the required parameter 'categoryId' when calling deleteCategoryAttribute(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling deleteCategoryAttribute(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCategoryAttributeCall(categoryId, attributeFQN, _callback);
        return localVarCall;

    }

    /**
     * Delete Category Attribute
     * Deletes the category attribute specified by its attributeFQN.
     * @param categoryId  (required)
     * @param attributeFQN  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteCategoryAttribute(Integer categoryId, String attributeFQN) throws ApiException {
        deleteCategoryAttributeWithHttpInfo(categoryId, attributeFQN);
    }

    /**
     * Delete Category Attribute
     * Deletes the category attribute specified by its attributeFQN.
     * @param categoryId  (required)
     * @param attributeFQN  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteCategoryAttributeWithHttpInfo(Integer categoryId, String attributeFQN) throws ApiException {
        okhttp3.Call localVarCall = deleteCategoryAttributeValidateBeforeCall(categoryId, attributeFQN, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Category Attribute (asynchronously)
     * Deletes the category attribute specified by its attributeFQN.
     * @param categoryId  (required)
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
    public okhttp3.Call deleteCategoryAttributeAsync(Integer categoryId, String attributeFQN, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCategoryAttributeValidateBeforeCall(categoryId, attributeFQN, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCategoryById
     * @param categoryId Unique identifier of the category that you want to delete. (required)
     * @param cascadeDelete If true, any subcategories of a category are deleted when this category is deleted. Otherwise only the given category is deleted. Default is false. (optional, default to false)
     * @param forceDelete If true, category (and optionally subcategories) will be deleted even if there are products referecing them.  Default is false. (optional, default to false)
     * @param reassignToParent If true, and child categories of the given category will be reassigned to the parent of the given category. Only applies if cascadeDelete is false. Default is false. (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCategoryByIdCall(Integer categoryId, Boolean cascadeDelete, Boolean forceDelete, Boolean reassignToParent, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/categories/{categoryId}"
            .replaceAll("\\{" + "categoryId" + "\\}", localVarApiClient.escapeString(categoryId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (cascadeDelete != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cascadeDelete", cascadeDelete));
        }

        if (forceDelete != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("forceDelete", forceDelete));
        }

        if (reassignToParent != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("reassignToParent", reassignToParent));
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
    private okhttp3.Call deleteCategoryByIdValidateBeforeCall(Integer categoryId, Boolean cascadeDelete, Boolean forceDelete, Boolean reassignToParent, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException("Missing the required parameter 'categoryId' when calling deleteCategoryById(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCategoryByIdCall(categoryId, cascadeDelete, forceDelete, reassignToParent, _callback);
        return localVarCall;

    }

    /**
     * Delete Category
     * Deletes the category specified by its category ID. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId Unique identifier of the category that you want to delete. (required)
     * @param cascadeDelete If true, any subcategories of a category are deleted when this category is deleted. Otherwise only the given category is deleted. Default is false. (optional, default to false)
     * @param forceDelete If true, category (and optionally subcategories) will be deleted even if there are products referecing them.  Default is false. (optional, default to false)
     * @param reassignToParent If true, and child categories of the given category will be reassigned to the parent of the given category. Only applies if cascadeDelete is false. Default is false. (optional, default to false)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteCategoryById(Integer categoryId, Boolean cascadeDelete, Boolean forceDelete, Boolean reassignToParent) throws ApiException {
        deleteCategoryByIdWithHttpInfo(categoryId, cascadeDelete, forceDelete, reassignToParent);
    }

    /**
     * Delete Category
     * Deletes the category specified by its category ID. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId Unique identifier of the category that you want to delete. (required)
     * @param cascadeDelete If true, any subcategories of a category are deleted when this category is deleted. Otherwise only the given category is deleted. Default is false. (optional, default to false)
     * @param forceDelete If true, category (and optionally subcategories) will be deleted even if there are products referecing them.  Default is false. (optional, default to false)
     * @param reassignToParent If true, and child categories of the given category will be reassigned to the parent of the given category. Only applies if cascadeDelete is false. Default is false. (optional, default to false)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteCategoryByIdWithHttpInfo(Integer categoryId, Boolean cascadeDelete, Boolean forceDelete, Boolean reassignToParent) throws ApiException {
        okhttp3.Call localVarCall = deleteCategoryByIdValidateBeforeCall(categoryId, cascadeDelete, forceDelete, reassignToParent, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Category (asynchronously)
     * Deletes the category specified by its category ID. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId Unique identifier of the category that you want to delete. (required)
     * @param cascadeDelete If true, any subcategories of a category are deleted when this category is deleted. Otherwise only the given category is deleted. Default is false. (optional, default to false)
     * @param forceDelete If true, category (and optionally subcategories) will be deleted even if there are products referecing them.  Default is false. (optional, default to false)
     * @param reassignToParent If true, and child categories of the given category will be reassigned to the parent of the given category. Only applies if cascadeDelete is false. Default is false. (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCategoryByIdAsync(Integer categoryId, Boolean cascadeDelete, Boolean forceDelete, Boolean reassignToParent, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCategoryByIdValidateBeforeCall(categoryId, cascadeDelete, forceDelete, reassignToParent, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCategories
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. The default value is 0. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param includeAttributes  (optional, default to false)
     * @param responseGroups  (optional)
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
    public okhttp3.Call getCategoriesCall(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeAttributes, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/categories";

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

        if (includeAttributes != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeAttributes", includeAttributes));
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
    private okhttp3.Call getCategoriesValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeAttributes, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getCategoriesCall(startIndex, pageSize, sortBy, filter, includeAttributes, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Categories
     * Retrieves a list of categories according to any specified filter criteria and sort options. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. The default value is 0. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param includeAttributes  (optional, default to false)
     * @param responseGroups  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsCategoryPagedCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsCategoryPagedCollection getCategories(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeAttributes, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsCategoryPagedCollection> localVarResp = getCategoriesWithHttpInfo(startIndex, pageSize, sortBy, filter, includeAttributes, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Categories
     * Retrieves a list of categories according to any specified filter criteria and sort options. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. The default value is 0. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param includeAttributes  (optional, default to false)
     * @param responseGroups  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsCategoryPagedCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsCategoryPagedCollection> getCategoriesWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeAttributes, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getCategoriesValidateBeforeCall(startIndex, pageSize, sortBy, filter, includeAttributes, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategoryPagedCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Categories (asynchronously)
     * Retrieves a list of categories according to any specified filter criteria and sort options. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. The default value is 0. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param includeAttributes  (optional, default to false)
     * @param responseGroups  (optional)
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
    public okhttp3.Call getCategoriesAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeAttributes, String responseGroups, String responseFields, final ApiCallback<CatalogAdminsCategoryPagedCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCategoriesValidateBeforeCall(startIndex, pageSize, sortBy, filter, includeAttributes, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategoryPagedCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCategory
     * @param categoryId Unique identifier of the category. (required)
     * @param includeAttributes  (optional, default to false)
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
    public okhttp3.Call getCategoryCall(Integer categoryId, Boolean includeAttributes, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/categories/{categoryId}"
            .replaceAll("\\{" + "categoryId" + "\\}", localVarApiClient.escapeString(categoryId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (includeAttributes != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeAttributes", includeAttributes));
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
    private okhttp3.Call getCategoryValidateBeforeCall(Integer categoryId, Boolean includeAttributes, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException("Missing the required parameter 'categoryId' when calling getCategory(Async)");
        }
        

        okhttp3.Call localVarCall = getCategoryCall(categoryId, includeAttributes, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Category
     * Retrieves the details of a single category. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId Unique identifier of the category. (required)
     * @param includeAttributes  (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsCategory
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsCategory getCategory(Integer categoryId, Boolean includeAttributes, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsCategory> localVarResp = getCategoryWithHttpInfo(categoryId, includeAttributes, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Category
     * Retrieves the details of a single category. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId Unique identifier of the category. (required)
     * @param includeAttributes  (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsCategory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsCategory> getCategoryWithHttpInfo(Integer categoryId, Boolean includeAttributes, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getCategoryValidateBeforeCall(categoryId, includeAttributes, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategory>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Category (asynchronously)
     * Retrieves the details of a single category. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId Unique identifier of the category. (required)
     * @param includeAttributes  (optional, default to false)
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
    public okhttp3.Call getCategoryAsync(Integer categoryId, Boolean includeAttributes, String responseFields, final ApiCallback<CatalogAdminsCategory> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCategoryValidateBeforeCall(categoryId, includeAttributes, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategory>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCategoryAttribute
     * @param categoryId  (required)
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
    public okhttp3.Call getCategoryAttributeCall(Integer categoryId, String attributeFQN, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/categories/{categoryId}/attributes/{attributeFQN}"
            .replaceAll("\\{" + "categoryId" + "\\}", localVarApiClient.escapeString(categoryId.toString()))
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
    private okhttp3.Call getCategoryAttributeValidateBeforeCall(Integer categoryId, String attributeFQN, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException("Missing the required parameter 'categoryId' when calling getCategoryAttribute(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getCategoryAttribute(Async)");
        }
        

        okhttp3.Call localVarCall = getCategoryAttributeCall(categoryId, attributeFQN, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Category Attribute
     * Retrieves the details of a single category attribute. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsCategoryAttribute
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsCategoryAttribute getCategoryAttribute(Integer categoryId, String attributeFQN, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsCategoryAttribute> localVarResp = getCategoryAttributeWithHttpInfo(categoryId, attributeFQN, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Category Attribute
     * Retrieves the details of a single category attribute. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsCategoryAttribute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsCategoryAttribute> getCategoryAttributeWithHttpInfo(Integer categoryId, String attributeFQN, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getCategoryAttributeValidateBeforeCall(categoryId, attributeFQN, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategoryAttribute>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Category Attribute (asynchronously)
     * Retrieves the details of a single category attribute. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId  (required)
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
    public okhttp3.Call getCategoryAttributeAsync(Integer categoryId, String attributeFQN, String responseFields, final ApiCallback<CatalogAdminsCategoryAttribute> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCategoryAttributeValidateBeforeCall(categoryId, attributeFQN, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategoryAttribute>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCategoryAttributes
     * @param categoryId  (required)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 20)
     * @param sortBy  (optional, default to )
     * @param filter  (optional, default to )
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
    public okhttp3.Call getCategoryAttributesCall(Integer categoryId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/categories/{categoryId}/attributes"
            .replaceAll("\\{" + "categoryId" + "\\}", localVarApiClient.escapeString(categoryId.toString()));

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
    private okhttp3.Call getCategoryAttributesValidateBeforeCall(Integer categoryId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException("Missing the required parameter 'categoryId' when calling getCategoryAttributes(Async)");
        }
        

        okhttp3.Call localVarCall = getCategoryAttributesCall(categoryId, startIndex, pageSize, sortBy, filter, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Category Attributes
     * Retrieves a list of category attributes. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId  (required)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 20)
     * @param sortBy  (optional, default to )
     * @param filter  (optional, default to )
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CategoryAttributeCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CategoryAttributeCollection getCategoryAttributes(Integer categoryId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws ApiException {
        ApiResponse<CategoryAttributeCollection> localVarResp = getCategoryAttributesWithHttpInfo(categoryId, startIndex, pageSize, sortBy, filter, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Category Attributes
     * Retrieves a list of category attributes. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId  (required)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 20)
     * @param sortBy  (optional, default to )
     * @param filter  (optional, default to )
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CategoryAttributeCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CategoryAttributeCollection> getCategoryAttributesWithHttpInfo(Integer categoryId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getCategoryAttributesValidateBeforeCall(categoryId, startIndex, pageSize, sortBy, filter, responseFields, null);
        Type localVarReturnType = new TypeToken<CategoryAttributeCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Category Attributes (asynchronously)
     * Retrieves a list of category attributes. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId  (required)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 20)
     * @param sortBy  (optional, default to )
     * @param filter  (optional, default to )
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
    public okhttp3.Call getCategoryAttributesAsync(Integer categoryId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, final ApiCallback<CategoryAttributeCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCategoryAttributesValidateBeforeCall(categoryId, startIndex, pageSize, sortBy, filter, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CategoryAttributeCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getChildCategories
     * @param categoryId Unique identifier of the category whose subcategories you want to get. (required)
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
    public okhttp3.Call getChildCategoriesCall(Integer categoryId, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/categories/{categoryId}/children"
            .replaceAll("\\{" + "categoryId" + "\\}", localVarApiClient.escapeString(categoryId.toString()));

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
    private okhttp3.Call getChildCategoriesValidateBeforeCall(Integer categoryId, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException("Missing the required parameter 'categoryId' when calling getChildCategories(Async)");
        }
        

        okhttp3.Call localVarCall = getChildCategoriesCall(categoryId, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Child Categories
     * Retrieves the immediate subcategories of a category. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId Unique identifier of the category whose subcategories you want to get. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsCategoryCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsCategoryCollection getChildCategories(Integer categoryId, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsCategoryCollection> localVarResp = getChildCategoriesWithHttpInfo(categoryId, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Child Categories
     * Retrieves the immediate subcategories of a category. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId Unique identifier of the category whose subcategories you want to get. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsCategoryCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsCategoryCollection> getChildCategoriesWithHttpInfo(Integer categoryId, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getChildCategoriesValidateBeforeCall(categoryId, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategoryCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Child Categories (asynchronously)
     * Retrieves the immediate subcategories of a category. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId Unique identifier of the category whose subcategories you want to get. (required)
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
    public okhttp3.Call getChildCategoriesAsync(Integer categoryId, String responseFields, final ApiCallback<CatalogAdminsCategoryCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getChildCategoriesValidateBeforeCall(categoryId, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategoryCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeProductsFromCategory
     * @param categoryId Unique identifier of the category that you want products removed from. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param requestBody A list of products to be removed from the category. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeProductsFromCategoryCall(Integer categoryId, String responseFields, List<String> requestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/categories/{categoryId}/remove-products"
            .replaceAll("\\{" + "categoryId" + "\\}", localVarApiClient.escapeString(categoryId.toString()));

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
    private okhttp3.Call removeProductsFromCategoryValidateBeforeCall(Integer categoryId, String responseFields, List<String> requestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException("Missing the required parameter 'categoryId' when calling removeProductsFromCategory(Async)");
        }
        

        okhttp3.Call localVarCall = removeProductsFromCategoryCall(categoryId, responseFields, requestBody, _callback);
        return localVarCall;

    }

    /**
     * Remove Products from Category
     * Removes the products in the provided product code list from the specified category.
     * @param categoryId Unique identifier of the category that you want products removed from. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param requestBody A list of products to be removed from the category. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void removeProductsFromCategory(Integer categoryId, String responseFields, List<String> requestBody) throws ApiException {
        removeProductsFromCategoryWithHttpInfo(categoryId, responseFields, requestBody);
    }

    /**
     * Remove Products from Category
     * Removes the products in the provided product code list from the specified category.
     * @param categoryId Unique identifier of the category that you want products removed from. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param requestBody A list of products to be removed from the category. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> removeProductsFromCategoryWithHttpInfo(Integer categoryId, String responseFields, List<String> requestBody) throws ApiException {
        okhttp3.Call localVarCall = removeProductsFromCategoryValidateBeforeCall(categoryId, responseFields, requestBody, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Remove Products from Category (asynchronously)
     * Removes the products in the provided product code list from the specified category.
     * @param categoryId Unique identifier of the category that you want products removed from. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param requestBody A list of products to be removed from the category. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeProductsFromCategoryAsync(Integer categoryId, String responseFields, List<String> requestBody, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeProductsFromCategoryValidateBeforeCall(categoryId, responseFields, requestBody, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchCategoryAttributes
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param includeAttributes  (optional, default to false)
     * @param responseGroups  (optional)
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
    public okhttp3.Call searchCategoryAttributesCall(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeAttributes, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/categories/searchCategoryAttributes";

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

        if (includeAttributes != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeAttributes", includeAttributes));
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
    private okhttp3.Call searchCategoryAttributesValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeAttributes, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = searchCategoryAttributesCall(startIndex, pageSize, sortBy, filter, includeAttributes, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Search Category Attributes
     * Retrieves a list of categories according to any specified filter criteria and sort options for attributes. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param includeAttributes  (optional, default to false)
     * @param responseGroups  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsCategoryPagedCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsCategoryPagedCollection searchCategoryAttributes(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeAttributes, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsCategoryPagedCollection> localVarResp = searchCategoryAttributesWithHttpInfo(startIndex, pageSize, sortBy, filter, includeAttributes, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Search Category Attributes
     * Retrieves a list of categories according to any specified filter criteria and sort options for attributes. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param includeAttributes  (optional, default to false)
     * @param responseGroups  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsCategoryPagedCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsCategoryPagedCollection> searchCategoryAttributesWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeAttributes, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = searchCategoryAttributesValidateBeforeCall(startIndex, pageSize, sortBy, filter, includeAttributes, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategoryPagedCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search Category Attributes (asynchronously)
     * Retrieves a list of categories according to any specified filter criteria and sort options for attributes. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param includeAttributes  (optional, default to false)
     * @param responseGroups  (optional)
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
    public okhttp3.Call searchCategoryAttributesAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeAttributes, String responseGroups, String responseFields, final ApiCallback<CatalogAdminsCategoryPagedCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchCategoryAttributesValidateBeforeCall(startIndex, pageSize, sortBy, filter, includeAttributes, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategoryPagedCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateCategory
     * @param categoryId Unique identifier of the category that you want to modify. Required. (required)
     * @param cascadeVisibility If true, when changing the display option for the category, change it for all subcategories also. Optional. (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCategory Properties of the category that you want to modify. Required properties ParentCategoryID and Content.Name. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCategoryCall(Integer categoryId, Boolean cascadeVisibility, String responseFields, CatalogAdminsCategory catalogAdminsCategory, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsCategory;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/categories/{categoryId}"
            .replaceAll("\\{" + "categoryId" + "\\}", localVarApiClient.escapeString(categoryId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (cascadeVisibility != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cascadeVisibility", cascadeVisibility));
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
    private okhttp3.Call updateCategoryValidateBeforeCall(Integer categoryId, Boolean cascadeVisibility, String responseFields, CatalogAdminsCategory catalogAdminsCategory, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException("Missing the required parameter 'categoryId' when calling updateCategory(Async)");
        }
        

        okhttp3.Call localVarCall = updateCategoryCall(categoryId, cascadeVisibility, responseFields, catalogAdminsCategory, _callback);
        return localVarCall;

    }

    /**
     * Update Category
     * Modifies a category such as moving it to another location in the category tree, or changing whether it is visible on the storefront. This PUT replaces the existing resource, so be sure to include all the information that you want to maintain for the category. Any unspecified properties are set to null.&lt;br&gt;&lt;br&gt;This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId Unique identifier of the category that you want to modify. Required. (required)
     * @param cascadeVisibility If true, when changing the display option for the category, change it for all subcategories also. Optional. (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCategory Properties of the category that you want to modify. Required properties ParentCategoryID and Content.Name. (optional)
     * @return CatalogAdminsCategory
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsCategory updateCategory(Integer categoryId, Boolean cascadeVisibility, String responseFields, CatalogAdminsCategory catalogAdminsCategory) throws ApiException {
        ApiResponse<CatalogAdminsCategory> localVarResp = updateCategoryWithHttpInfo(categoryId, cascadeVisibility, responseFields, catalogAdminsCategory);
        return localVarResp.getData();
    }

    /**
     * Update Category
     * Modifies a category such as moving it to another location in the category tree, or changing whether it is visible on the storefront. This PUT replaces the existing resource, so be sure to include all the information that you want to maintain for the category. Any unspecified properties are set to null.&lt;br&gt;&lt;br&gt;This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId Unique identifier of the category that you want to modify. Required. (required)
     * @param cascadeVisibility If true, when changing the display option for the category, change it for all subcategories also. Optional. (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCategory Properties of the category that you want to modify. Required properties ParentCategoryID and Content.Name. (optional)
     * @return ApiResponse&lt;CatalogAdminsCategory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsCategory> updateCategoryWithHttpInfo(Integer categoryId, Boolean cascadeVisibility, String responseFields, CatalogAdminsCategory catalogAdminsCategory) throws ApiException {
        okhttp3.Call localVarCall = updateCategoryValidateBeforeCall(categoryId, cascadeVisibility, responseFields, catalogAdminsCategory, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategory>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Category (asynchronously)
     * Modifies a category such as moving it to another location in the category tree, or changing whether it is visible on the storefront. This PUT replaces the existing resource, so be sure to include all the information that you want to maintain for the category. Any unspecified properties are set to null.&lt;br&gt;&lt;br&gt;This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId Unique identifier of the category that you want to modify. Required. (required)
     * @param cascadeVisibility If true, when changing the display option for the category, change it for all subcategories also. Optional. (optional, default to false)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCategory Properties of the category that you want to modify. Required properties ParentCategoryID and Content.Name. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCategoryAsync(Integer categoryId, Boolean cascadeVisibility, String responseFields, CatalogAdminsCategory catalogAdminsCategory, final ApiCallback<CatalogAdminsCategory> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateCategoryValidateBeforeCall(categoryId, cascadeVisibility, responseFields, catalogAdminsCategory, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategory>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateCategoryAttribute
     * @param categoryId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCategoryAttribute  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCategoryAttributeCall(Integer categoryId, String attributeFQN, String responseFields, CatalogAdminsCategoryAttribute catalogAdminsCategoryAttribute, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsCategoryAttribute;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/categories/{categoryId}/attributes/{attributeFQN}"
            .replaceAll("\\{" + "categoryId" + "\\}", localVarApiClient.escapeString(categoryId.toString()))
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
    private okhttp3.Call updateCategoryAttributeValidateBeforeCall(Integer categoryId, String attributeFQN, String responseFields, CatalogAdminsCategoryAttribute catalogAdminsCategoryAttribute, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException("Missing the required parameter 'categoryId' when calling updateCategoryAttribute(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updateCategoryAttribute(Async)");
        }
        

        okhttp3.Call localVarCall = updateCategoryAttributeCall(categoryId, attributeFQN, responseFields, catalogAdminsCategoryAttribute, _callback);
        return localVarCall;

    }

    /**
     * Update Category Attribute
     * Modifies the category attribute. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCategoryAttribute  (optional)
     * @return CatalogAdminsCategoryAttribute
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsCategoryAttribute updateCategoryAttribute(Integer categoryId, String attributeFQN, String responseFields, CatalogAdminsCategoryAttribute catalogAdminsCategoryAttribute) throws ApiException {
        ApiResponse<CatalogAdminsCategoryAttribute> localVarResp = updateCategoryAttributeWithHttpInfo(categoryId, attributeFQN, responseFields, catalogAdminsCategoryAttribute);
        return localVarResp.getData();
    }

    /**
     * Update Category Attribute
     * Modifies the category attribute. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCategoryAttribute  (optional)
     * @return ApiResponse&lt;CatalogAdminsCategoryAttribute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsCategoryAttribute> updateCategoryAttributeWithHttpInfo(Integer categoryId, String attributeFQN, String responseFields, CatalogAdminsCategoryAttribute catalogAdminsCategoryAttribute) throws ApiException {
        okhttp3.Call localVarCall = updateCategoryAttributeValidateBeforeCall(categoryId, attributeFQN, responseFields, catalogAdminsCategoryAttribute, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategoryAttribute>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Category Attribute (asynchronously)
     * Modifies the category attribute. This current version of the Categories API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access category data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param categoryId  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCategoryAttribute  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCategoryAttributeAsync(Integer categoryId, String attributeFQN, String responseFields, CatalogAdminsCategoryAttribute catalogAdminsCategoryAttribute, final ApiCallback<CatalogAdminsCategoryAttribute> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateCategoryAttributeValidateBeforeCall(categoryId, attributeFQN, responseFields, catalogAdminsCategoryAttribute, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsCategoryAttribute>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for validateDynamicExpression
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDynamicExpression  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateDynamicExpressionCall(String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/categories/ValidateDynamicExpression";

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
    private okhttp3.Call validateDynamicExpressionValidateBeforeCall(String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = validateDynamicExpressionCall(responseFields, catalogAdminsDynamicExpression, _callback);
        return localVarCall;

    }

    /**
     * Validate Dynamic Category Expression
     * Validate an expression for a dynamic category.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDynamicExpression  (optional)
     * @return CatalogAdminsDynamicExpression
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsDynamicExpression validateDynamicExpression(String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression) throws ApiException {
        ApiResponse<CatalogAdminsDynamicExpression> localVarResp = validateDynamicExpressionWithHttpInfo(responseFields, catalogAdminsDynamicExpression);
        return localVarResp.getData();
    }

    /**
     * Validate Dynamic Category Expression
     * Validate an expression for a dynamic category.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDynamicExpression  (optional)
     * @return ApiResponse&lt;CatalogAdminsDynamicExpression&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsDynamicExpression> validateDynamicExpressionWithHttpInfo(String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression) throws ApiException {
        okhttp3.Call localVarCall = validateDynamicExpressionValidateBeforeCall(responseFields, catalogAdminsDynamicExpression, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsDynamicExpression>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Validate Dynamic Category Expression (asynchronously)
     * Validate an expression for a dynamic category.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDynamicExpression  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateDynamicExpressionAsync(String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression, final ApiCallback<CatalogAdminsDynamicExpression> _callback) throws ApiException {

        okhttp3.Call localVarCall = validateDynamicExpressionValidateBeforeCall(responseFields, catalogAdminsDynamicExpression, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsDynamicExpression>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for validateRealTimeDynamicExpression
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDynamicExpression  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateRealTimeDynamicExpressionCall(String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/categories/ValidateRealTimeDynamicExpression";

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
    private okhttp3.Call validateRealTimeDynamicExpressionValidateBeforeCall(String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = validateRealTimeDynamicExpressionCall(responseFields, catalogAdminsDynamicExpression, _callback);
        return localVarCall;

    }

    /**
     * Validate Realtime Dynamic Category Expression
     * Validate an expression for a realtime dynamic category.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDynamicExpression  (optional)
     * @return CatalogAdminsDynamicExpression
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsDynamicExpression validateRealTimeDynamicExpression(String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression) throws ApiException {
        ApiResponse<CatalogAdminsDynamicExpression> localVarResp = validateRealTimeDynamicExpressionWithHttpInfo(responseFields, catalogAdminsDynamicExpression);
        return localVarResp.getData();
    }

    /**
     * Validate Realtime Dynamic Category Expression
     * Validate an expression for a realtime dynamic category.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDynamicExpression  (optional)
     * @return ApiResponse&lt;CatalogAdminsDynamicExpression&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsDynamicExpression> validateRealTimeDynamicExpressionWithHttpInfo(String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression) throws ApiException {
        okhttp3.Call localVarCall = validateRealTimeDynamicExpressionValidateBeforeCall(responseFields, catalogAdminsDynamicExpression, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsDynamicExpression>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Validate Realtime Dynamic Category Expression (asynchronously)
     * Validate an expression for a realtime dynamic category.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDynamicExpression  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateRealTimeDynamicExpressionAsync(String responseFields, CatalogAdminsDynamicExpression catalogAdminsDynamicExpression, final ApiCallback<CatalogAdminsDynamicExpression> _callback) throws ApiException {

        okhttp3.Call localVarCall = validateRealTimeDynamicExpressionValidateBeforeCall(responseFields, catalogAdminsDynamicExpression, _callback);
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
        public CategoriesApi build() {
            return new CategoriesApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
