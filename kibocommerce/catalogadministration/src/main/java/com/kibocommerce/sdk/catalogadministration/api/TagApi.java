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


import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsTag;
import com.kibocommerce.sdk.catalogadministration.models.TagCollection;
import com.kibocommerce.sdk.catalogadministration.models.TagNodeTree;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TagApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public TagApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TagApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public TagApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public TagApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public TagApi(Builder builder) {
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
     * Build call for createTag
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsTag  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTagCall(String responseFields, CatalogAdminsTag catalogAdminsTag, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsTag;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/tags";

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
    private okhttp3.Call createTagValidateBeforeCall(String responseFields, CatalogAdminsTag catalogAdminsTag, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createTagCall(responseFields, catalogAdminsTag, _callback);
        return localVarCall;

    }

    /**
     * Create Tag
     * Creates a tag.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsTag  (optional)
     * @return CatalogAdminsTag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsTag createTag(String responseFields, CatalogAdminsTag catalogAdminsTag) throws ApiException {
        ApiResponse<CatalogAdminsTag> localVarResp = createTagWithHttpInfo(responseFields, catalogAdminsTag);
        return localVarResp.getData();
    }

    /**
     * Create Tag
     * Creates a tag.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsTag  (optional)
     * @return ApiResponse&lt;CatalogAdminsTag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsTag> createTagWithHttpInfo(String responseFields, CatalogAdminsTag catalogAdminsTag) throws ApiException {
        okhttp3.Call localVarCall = createTagValidateBeforeCall(responseFields, catalogAdminsTag, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsTag>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Tag (asynchronously)
     * Creates a tag.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsTag  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTagAsync(String responseFields, CatalogAdminsTag catalogAdminsTag, final ApiCallback<CatalogAdminsTag> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTagValidateBeforeCall(responseFields, catalogAdminsTag, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsTag>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteTag
     * @param tagCode  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteTagCall(String tagCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/tags/{tagCode}"
            .replaceAll("\\{" + "tagCode" + "\\}", localVarApiClient.escapeString(tagCode.toString()));

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
    private okhttp3.Call deleteTagValidateBeforeCall(String tagCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'tagCode' is set
        if (tagCode == null) {
            throw new ApiException("Missing the required parameter 'tagCode' when calling deleteTag(Async)");
        }
        

        okhttp3.Call localVarCall = deleteTagCall(tagCode, _callback);
        return localVarCall;

    }

    /**
     * Delete Tag
     * Deletes a Tag specified by its tagCode.
     * @param tagCode  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteTag(String tagCode) throws ApiException {
        deleteTagWithHttpInfo(tagCode);
    }

    /**
     * Delete Tag
     * Deletes a Tag specified by its tagCode.
     * @param tagCode  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteTagWithHttpInfo(String tagCode) throws ApiException {
        okhttp3.Call localVarCall = deleteTagValidateBeforeCall(tagCode, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Tag (asynchronously)
     * Deletes a Tag specified by its tagCode.
     * @param tagCode  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteTagAsync(String tagCode, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteTagValidateBeforeCall(tagCode, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNodeTree
     * @param tagCode  (optional)
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
    public okhttp3.Call getNodeTreeCall(String tagCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/tags/node/tree";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tagCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tagCode", tagCode));
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
    private okhttp3.Call getNodeTreeValidateBeforeCall(String tagCode, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getNodeTreeCall(tagCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Tag Collection as Tag Tree
     * Retrieves the tag collection as tag tree for specified tagCode.
     * @param tagCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return TagNodeTree
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public TagNodeTree getNodeTree(String tagCode, String responseFields) throws ApiException {
        ApiResponse<TagNodeTree> localVarResp = getNodeTreeWithHttpInfo(tagCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Tag Collection as Tag Tree
     * Retrieves the tag collection as tag tree for specified tagCode.
     * @param tagCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;TagNodeTree&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TagNodeTree> getNodeTreeWithHttpInfo(String tagCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getNodeTreeValidateBeforeCall(tagCode, responseFields, null);
        Type localVarReturnType = new TypeToken<TagNodeTree>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Tag Collection as Tag Tree (asynchronously)
     * Retrieves the tag collection as tag tree for specified tagCode.
     * @param tagCode  (optional)
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
    public okhttp3.Call getNodeTreeAsync(String tagCode, String responseFields, final ApiCallback<TagNodeTree> _callback) throws ApiException {

        okhttp3.Call localVarCall = getNodeTreeValidateBeforeCall(tagCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<TagNodeTree>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTag
     * @param tagCode  (required)
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
    public okhttp3.Call getTagCall(String tagCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/tags/{tagCode}"
            .replaceAll("\\{" + "tagCode" + "\\}", localVarApiClient.escapeString(tagCode.toString()));

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
    private okhttp3.Call getTagValidateBeforeCall(String tagCode, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'tagCode' is set
        if (tagCode == null) {
            throw new ApiException("Missing the required parameter 'tagCode' when calling getTag(Async)");
        }
        

        okhttp3.Call localVarCall = getTagCall(tagCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Tag
     * Retrieves the details of a single tag.
     * @param tagCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsTag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsTag getTag(String tagCode, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsTag> localVarResp = getTagWithHttpInfo(tagCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Tag
     * Retrieves the details of a single tag.
     * @param tagCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsTag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsTag> getTagWithHttpInfo(String tagCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getTagValidateBeforeCall(tagCode, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsTag>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Tag (asynchronously)
     * Retrieves the details of a single tag.
     * @param tagCode  (required)
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
    public okhttp3.Call getTagAsync(String tagCode, String responseFields, final ApiCallback<CatalogAdminsTag> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTagValidateBeforeCall(tagCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsTag>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTags
     * @param path  (optional)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
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
    public okhttp3.Call getTagsCall(String path, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/tags";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (path != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("path", path));
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
    private okhttp3.Call getTagsValidateBeforeCall(String path, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getTagsCall(path, startIndex, pageSize, sortBy, filter, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Tags
     * Retrieves a list of tags.
     * @param path  (optional)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param responseGroups  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return TagCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public TagCollection getTags(String path, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<TagCollection> localVarResp = getTagsWithHttpInfo(path, startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Tags
     * Retrieves a list of tags.
     * @param path  (optional)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param responseGroups  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;TagCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TagCollection> getTagsWithHttpInfo(String path, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getTagsValidateBeforeCall(path, startIndex, pageSize, sortBy, filter, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<TagCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Tags (asynchronously)
     * Retrieves a list of tags.
     * @param path  (optional)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
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
    public okhttp3.Call getTagsAsync(String path, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback<TagCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTagsValidateBeforeCall(path, startIndex, pageSize, sortBy, filter, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<TagCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateTag
     * @param tagCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsTag  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateTagCall(String tagCode, String responseFields, CatalogAdminsTag catalogAdminsTag, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsTag;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/tags/{tagCode}"
            .replaceAll("\\{" + "tagCode" + "\\}", localVarApiClient.escapeString(tagCode.toString()));

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
    private okhttp3.Call updateTagValidateBeforeCall(String tagCode, String responseFields, CatalogAdminsTag catalogAdminsTag, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'tagCode' is set
        if (tagCode == null) {
            throw new ApiException("Missing the required parameter 'tagCode' when calling updateTag(Async)");
        }
        

        okhttp3.Call localVarCall = updateTagCall(tagCode, responseFields, catalogAdminsTag, _callback);
        return localVarCall;

    }

    /**
     * Update Tag
     * Modifies a tag.
     * @param tagCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsTag  (optional)
     * @return CatalogAdminsTag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsTag updateTag(String tagCode, String responseFields, CatalogAdminsTag catalogAdminsTag) throws ApiException {
        ApiResponse<CatalogAdminsTag> localVarResp = updateTagWithHttpInfo(tagCode, responseFields, catalogAdminsTag);
        return localVarResp.getData();
    }

    /**
     * Update Tag
     * Modifies a tag.
     * @param tagCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsTag  (optional)
     * @return ApiResponse&lt;CatalogAdminsTag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsTag> updateTagWithHttpInfo(String tagCode, String responseFields, CatalogAdminsTag catalogAdminsTag) throws ApiException {
        okhttp3.Call localVarCall = updateTagValidateBeforeCall(tagCode, responseFields, catalogAdminsTag, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsTag>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Tag (asynchronously)
     * Modifies a tag.
     * @param tagCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsTag  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateTagAsync(String tagCode, String responseFields, CatalogAdminsTag catalogAdminsTag, final ApiCallback<CatalogAdminsTag> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateTagValidateBeforeCall(tagCode, responseFields, catalogAdminsTag, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsTag>(){}.getType();
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
        public TagApi build() {
            return new TagApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
