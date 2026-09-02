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


import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsFacet;
import com.kibocommerce.sdk.catalogadministration.models.FacetCollection;
import com.kibocommerce.sdk.catalogadministration.models.FacetSet;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class FacetsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public FacetsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FacetsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public FacetsApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public FacetsApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public FacetsApi(Builder builder) {
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
     * Build call for addFacet
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsFacet  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addFacetCall(String responseFields, CatalogAdminsFacet catalogAdminsFacet, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsFacet;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/facets";

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
    private okhttp3.Call addFacetValidateBeforeCall(String responseFields, CatalogAdminsFacet catalogAdminsFacet, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = addFacetCall(responseFields, catalogAdminsFacet, _callback);
        return localVarCall;

    }

    /**
     * Add Facet
     * Adds a new Facet to a category in a catalog.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsFacet  (optional)
     * @return CatalogAdminsFacet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsFacet addFacet(String responseFields, CatalogAdminsFacet catalogAdminsFacet) throws ApiException {
        ApiResponse<CatalogAdminsFacet> localVarResp = addFacetWithHttpInfo(responseFields, catalogAdminsFacet);
        return localVarResp.getData();
    }

    /**
     * Add Facet
     * Adds a new Facet to a category in a catalog.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsFacet  (optional)
     * @return ApiResponse&lt;CatalogAdminsFacet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsFacet> addFacetWithHttpInfo(String responseFields, CatalogAdminsFacet catalogAdminsFacet) throws ApiException {
        okhttp3.Call localVarCall = addFacetValidateBeforeCall(responseFields, catalogAdminsFacet, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsFacet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Facet (asynchronously)
     * Adds a new Facet to a category in a catalog.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsFacet  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addFacetAsync(String responseFields, CatalogAdminsFacet catalogAdminsFacet, final ApiCallback<CatalogAdminsFacet> _callback) throws ApiException {

        okhttp3.Call localVarCall = addFacetValidateBeforeCall(responseFields, catalogAdminsFacet, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsFacet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteFacetById
     * @param facetId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteFacetByIdCall(Integer facetId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/facets/{facetId}"
            .replaceAll("\\{" + "facetId" + "\\}", localVarApiClient.escapeString(facetId.toString()));

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
    private okhttp3.Call deleteFacetByIdValidateBeforeCall(Integer facetId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'facetId' is set
        if (facetId == null) {
            throw new ApiException("Missing the required parameter 'facetId' when calling deleteFacetById(Async)");
        }
        

        okhttp3.Call localVarCall = deleteFacetByIdCall(facetId, _callback);
        return localVarCall;

    }

    /**
     * Delete Facet
     * Deletes the Facet definition from the store.
     * @param facetId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteFacetById(Integer facetId) throws ApiException {
        deleteFacetByIdWithHttpInfo(facetId);
    }

    /**
     * Delete Facet
     * Deletes the Facet definition from the store.
     * @param facetId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteFacetByIdWithHttpInfo(Integer facetId) throws ApiException {
        okhttp3.Call localVarCall = deleteFacetByIdValidateBeforeCall(facetId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Facet (asynchronously)
     * Deletes the Facet definition from the store.
     * @param facetId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteFacetByIdAsync(Integer facetId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteFacetByIdValidateBeforeCall(facetId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFacet
     * @param facetId  (required)
     * @param validate  (optional)
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
    public okhttp3.Call getFacetCall(Integer facetId, Boolean validate, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/facets/{facetId}"
            .replaceAll("\\{" + "facetId" + "\\}", localVarApiClient.escapeString(facetId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (validate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("validate", validate));
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
    private okhttp3.Call getFacetValidateBeforeCall(Integer facetId, Boolean validate, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'facetId' is set
        if (facetId == null) {
            throw new ApiException("Missing the required parameter 'facetId' when calling getFacet(Async)");
        }
        

        okhttp3.Call localVarCall = getFacetCall(facetId, validate, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Facet
     * Retrieves the details of a Facet definition.
     * @param facetId  (required)
     * @param validate  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsFacet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsFacet getFacet(Integer facetId, Boolean validate, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsFacet> localVarResp = getFacetWithHttpInfo(facetId, validate, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Facet
     * Retrieves the details of a Facet definition.
     * @param facetId  (required)
     * @param validate  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsFacet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsFacet> getFacetWithHttpInfo(Integer facetId, Boolean validate, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getFacetValidateBeforeCall(facetId, validate, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsFacet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Facet (asynchronously)
     * Retrieves the details of a Facet definition.
     * @param facetId  (required)
     * @param validate  (optional)
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
    public okhttp3.Call getFacetAsync(Integer facetId, Boolean validate, String responseFields, final ApiCallback<CatalogAdminsFacet> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFacetValidateBeforeCall(facetId, validate, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsFacet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFacetCategoryList
     * @param categoryId  (optional)
     * @param categoryCode  (optional)
     * @param includeAvailable  (optional)
     * @param validate  (optional)
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
    public okhttp3.Call getFacetCategoryListCall(Integer categoryId, String categoryCode, Boolean includeAvailable, Boolean validate, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/facets/category";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (categoryId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("categoryId", categoryId));
        }

        if (categoryCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("categoryCode", categoryCode));
        }

        if (includeAvailable != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeAvailable", includeAvailable));
        }

        if (validate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("validate", validate));
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
    private okhttp3.Call getFacetCategoryListValidateBeforeCall(Integer categoryId, String categoryCode, Boolean includeAvailable, Boolean validate, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getFacetCategoryListCall(categoryId, categoryCode, includeAvailable, validate, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Facet Category List
     * Retrieves a list of configured, and optionally available, Facet configurations for the specified category.
     * @param categoryId  (optional)
     * @param categoryCode  (optional)
     * @param includeAvailable  (optional)
     * @param validate  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return FacetSet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public FacetSet getFacetCategoryList(Integer categoryId, String categoryCode, Boolean includeAvailable, Boolean validate, String responseFields) throws ApiException {
        ApiResponse<FacetSet> localVarResp = getFacetCategoryListWithHttpInfo(categoryId, categoryCode, includeAvailable, validate, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Facet Category List
     * Retrieves a list of configured, and optionally available, Facet configurations for the specified category.
     * @param categoryId  (optional)
     * @param categoryCode  (optional)
     * @param includeAvailable  (optional)
     * @param validate  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;FacetSet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FacetSet> getFacetCategoryListWithHttpInfo(Integer categoryId, String categoryCode, Boolean includeAvailable, Boolean validate, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getFacetCategoryListValidateBeforeCall(categoryId, categoryCode, includeAvailable, validate, responseFields, null);
        Type localVarReturnType = new TypeToken<FacetSet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Facet Category List (asynchronously)
     * Retrieves a list of configured, and optionally available, Facet configurations for the specified category.
     * @param categoryId  (optional)
     * @param categoryCode  (optional)
     * @param includeAvailable  (optional)
     * @param validate  (optional)
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
    public okhttp3.Call getFacetCategoryListAsync(Integer categoryId, String categoryCode, Boolean includeAvailable, Boolean validate, String responseFields, final ApiCallback<FacetSet> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFacetCategoryListValidateBeforeCall(categoryId, categoryCode, includeAvailable, validate, responseFields, _callback);
        Type localVarReturnType = new TypeToken<FacetSet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFacetCategoryListLegacy
     * @param categoryId  (required)
     * @param includeAvailable  (optional)
     * @param validate  (optional)
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
    public okhttp3.Call getFacetCategoryListLegacyCall(Integer categoryId, Boolean includeAvailable, Boolean validate, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/facets/category/{categoryId}"
            .replaceAll("\\{" + "categoryId" + "\\}", localVarApiClient.escapeString(categoryId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (includeAvailable != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeAvailable", includeAvailable));
        }

        if (validate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("validate", validate));
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
    private okhttp3.Call getFacetCategoryListLegacyValidateBeforeCall(Integer categoryId, Boolean includeAvailable, Boolean validate, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException("Missing the required parameter 'categoryId' when calling getFacetCategoryListLegacy(Async)");
        }
        

        okhttp3.Call localVarCall = getFacetCategoryListLegacyCall(categoryId, includeAvailable, validate, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Facet Category List (Legacy)
     * Retrieves a list of configured, and optionally available, Facet configurations for the specified category. 
     * @param categoryId  (required)
     * @param includeAvailable  (optional)
     * @param validate  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return FacetSet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public FacetSet getFacetCategoryListLegacy(Integer categoryId, Boolean includeAvailable, Boolean validate, String responseFields) throws ApiException {
        ApiResponse<FacetSet> localVarResp = getFacetCategoryListLegacyWithHttpInfo(categoryId, includeAvailable, validate, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Facet Category List (Legacy)
     * Retrieves a list of configured, and optionally available, Facet configurations for the specified category. 
     * @param categoryId  (required)
     * @param includeAvailable  (optional)
     * @param validate  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;FacetSet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FacetSet> getFacetCategoryListLegacyWithHttpInfo(Integer categoryId, Boolean includeAvailable, Boolean validate, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getFacetCategoryListLegacyValidateBeforeCall(categoryId, includeAvailable, validate, responseFields, null);
        Type localVarReturnType = new TypeToken<FacetSet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Facet Category List (Legacy) (asynchronously)
     * Retrieves a list of configured, and optionally available, Facet configurations for the specified category. 
     * @param categoryId  (required)
     * @param includeAvailable  (optional)
     * @param validate  (optional)
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
    public okhttp3.Call getFacetCategoryListLegacyAsync(Integer categoryId, Boolean includeAvailable, Boolean validate, String responseFields, final ApiCallback<FacetSet> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFacetCategoryListLegacyValidateBeforeCall(categoryId, includeAvailable, validate, responseFields, _callback);
        Type localVarReturnType = new TypeToken<FacetSet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFacets
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
    public okhttp3.Call getFacetsCall(String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/facets";

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
    private okhttp3.Call getFacetsValidateBeforeCall(String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getFacetsCall(responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get facets
     * Retrieves the list of Facet Definition
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return FacetCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public FacetCollection getFacets(String responseFields) throws ApiException {
        ApiResponse<FacetCollection> localVarResp = getFacetsWithHttpInfo(responseFields);
        return localVarResp.getData();
    }

    /**
     * Get facets
     * Retrieves the list of Facet Definition
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;FacetCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FacetCollection> getFacetsWithHttpInfo(String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getFacetsValidateBeforeCall(responseFields, null);
        Type localVarReturnType = new TypeToken<FacetCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get facets (asynchronously)
     * Retrieves the list of Facet Definition
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
    public okhttp3.Call getFacetsAsync(String responseFields, final ApiCallback<FacetCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFacetsValidateBeforeCall(responseFields, _callback);
        Type localVarReturnType = new TypeToken<FacetCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateFacet
     * @param facetId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsFacet  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateFacetCall(Integer facetId, String responseFields, CatalogAdminsFacet catalogAdminsFacet, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsFacet;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/facets/{facetId}"
            .replaceAll("\\{" + "facetId" + "\\}", localVarApiClient.escapeString(facetId.toString()));

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
    private okhttp3.Call updateFacetValidateBeforeCall(Integer facetId, String responseFields, CatalogAdminsFacet catalogAdminsFacet, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'facetId' is set
        if (facetId == null) {
            throw new ApiException("Missing the required parameter 'facetId' when calling updateFacet(Async)");
        }
        

        okhttp3.Call localVarCall = updateFacetCall(facetId, responseFields, catalogAdminsFacet, _callback);
        return localVarCall;

    }

    /**
     * Update Facet
     * Modifies a Facet definition.
     * @param facetId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsFacet  (optional)
     * @return CatalogAdminsFacet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsFacet updateFacet(Integer facetId, String responseFields, CatalogAdminsFacet catalogAdminsFacet) throws ApiException {
        ApiResponse<CatalogAdminsFacet> localVarResp = updateFacetWithHttpInfo(facetId, responseFields, catalogAdminsFacet);
        return localVarResp.getData();
    }

    /**
     * Update Facet
     * Modifies a Facet definition.
     * @param facetId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsFacet  (optional)
     * @return ApiResponse&lt;CatalogAdminsFacet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsFacet> updateFacetWithHttpInfo(Integer facetId, String responseFields, CatalogAdminsFacet catalogAdminsFacet) throws ApiException {
        okhttp3.Call localVarCall = updateFacetValidateBeforeCall(facetId, responseFields, catalogAdminsFacet, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsFacet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Facet (asynchronously)
     * Modifies a Facet definition.
     * @param facetId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsFacet  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateFacetAsync(Integer facetId, String responseFields, CatalogAdminsFacet catalogAdminsFacet, final ApiCallback<CatalogAdminsFacet> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateFacetValidateBeforeCall(facetId, responseFields, catalogAdminsFacet, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsFacet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateFacetSet
     * @param categoryId  (optional)
     * @param categoryCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param facetSet  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateFacetSetCall(Integer categoryId, String categoryCode, String responseFields, FacetSet facetSet, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = facetSet;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/facets/set/edit";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (categoryId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("categoryId", categoryId));
        }

        if (categoryCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("categoryCode", categoryCode));
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
    private okhttp3.Call updateFacetSetValidateBeforeCall(Integer categoryId, String categoryCode, String responseFields, FacetSet facetSet, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = updateFacetSetCall(categoryId, categoryCode, responseFields, facetSet, _callback);
        return localVarCall;

    }

    /**
     * Update Facet Set
     * Modifies a Facet definition.
     * @param categoryId  (optional)
     * @param categoryCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param facetSet  (optional)
     * @return FacetSet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public FacetSet updateFacetSet(Integer categoryId, String categoryCode, String responseFields, FacetSet facetSet) throws ApiException {
        ApiResponse<FacetSet> localVarResp = updateFacetSetWithHttpInfo(categoryId, categoryCode, responseFields, facetSet);
        return localVarResp.getData();
    }

    /**
     * Update Facet Set
     * Modifies a Facet definition.
     * @param categoryId  (optional)
     * @param categoryCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param facetSet  (optional)
     * @return ApiResponse&lt;FacetSet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FacetSet> updateFacetSetWithHttpInfo(Integer categoryId, String categoryCode, String responseFields, FacetSet facetSet) throws ApiException {
        okhttp3.Call localVarCall = updateFacetSetValidateBeforeCall(categoryId, categoryCode, responseFields, facetSet, null);
        Type localVarReturnType = new TypeToken<FacetSet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Facet Set (asynchronously)
     * Modifies a Facet definition.
     * @param categoryId  (optional)
     * @param categoryCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param facetSet  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateFacetSetAsync(Integer categoryId, String categoryCode, String responseFields, FacetSet facetSet, final ApiCallback<FacetSet> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateFacetSetValidateBeforeCall(categoryId, categoryCode, responseFields, facetSet, _callback);
        Type localVarReturnType = new TypeToken<FacetSet>(){}.getType();
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
        public FacetsApi build() {
            return new FacetsApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
