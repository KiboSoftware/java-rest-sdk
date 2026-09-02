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


import java.time.OffsetDateTime;
import com.kibocommerce.sdk.catalogadministration.models.PriceListBulkResult;
import com.kibocommerce.sdk.catalogadministration.models.PriceListEntry;
import com.kibocommerce.sdk.catalogadministration.models.PriceListEntryCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PriceListEntriesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public PriceListEntriesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PriceListEntriesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public PriceListEntriesApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public PriceListEntriesApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public PriceListEntriesApi(Builder builder) {
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
     * Build call for addPriceListEntry
     * @param priceListCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPriceListEntryCall(String priceListCode, String responseFields, PriceListEntry priceListEntry, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = priceListEntry;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/pricelists/{priceListCode}/entries"
            .replaceAll("\\{" + "priceListCode" + "\\}", localVarApiClient.escapeString(priceListCode.toString()));

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
    private okhttp3.Call addPriceListEntryValidateBeforeCall(String priceListCode, String responseFields, PriceListEntry priceListEntry, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'priceListCode' is set
        if (priceListCode == null) {
            throw new ApiException("Missing the required parameter 'priceListCode' when calling addPriceListEntry(Async)");
        }
        

        okhttp3.Call localVarCall = addPriceListEntryCall(priceListCode, responseFields, priceListEntry, _callback);
        return localVarCall;

    }

    /**
     * Add Price List Entry
     * Adds an entry to a price list.
     * @param priceListCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @return PriceListEntry
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PriceListEntry addPriceListEntry(String priceListCode, String responseFields, PriceListEntry priceListEntry) throws ApiException {
        ApiResponse<PriceListEntry> localVarResp = addPriceListEntryWithHttpInfo(priceListCode, responseFields, priceListEntry);
        return localVarResp.getData();
    }

    /**
     * Add Price List Entry
     * Adds an entry to a price list.
     * @param priceListCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @return ApiResponse&lt;PriceListEntry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PriceListEntry> addPriceListEntryWithHttpInfo(String priceListCode, String responseFields, PriceListEntry priceListEntry) throws ApiException {
        okhttp3.Call localVarCall = addPriceListEntryValidateBeforeCall(priceListCode, responseFields, priceListEntry, null);
        Type localVarReturnType = new TypeToken<PriceListEntry>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Price List Entry (asynchronously)
     * Adds an entry to a price list.
     * @param priceListCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPriceListEntryAsync(String priceListCode, String responseFields, PriceListEntry priceListEntry, final ApiCallback<PriceListEntry> _callback) throws ApiException {

        okhttp3.Call localVarCall = addPriceListEntryValidateBeforeCall(priceListCode, responseFields, priceListEntry, _callback);
        Type localVarReturnType = new TypeToken<PriceListEntry>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for bulkAddPriceListEntries
     * @param publishEvents  (optional, default to true)
     * @param invalidateCache  (optional, default to true)
     * @param allowPartialSuccess Returns status codes of 200 (complete success), 206 (some entries failed validation), 409 (all entries failed validation), or 500 (unexpected failure) (optional)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkAddPriceListEntriesCall(Boolean publishEvents, Boolean invalidateCache, Boolean allowPartialSuccess, String batchJobCode, String responseFields, List<PriceListEntry> priceListEntry, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = priceListEntry;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/pricelists/bulkaddentries";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (publishEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("publishEvents", publishEvents));
        }

        if (invalidateCache != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invalidateCache", invalidateCache));
        }

        if (allowPartialSuccess != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("allowPartialSuccess", allowPartialSuccess));
        }

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
    private okhttp3.Call bulkAddPriceListEntriesValidateBeforeCall(Boolean publishEvents, Boolean invalidateCache, Boolean allowPartialSuccess, String batchJobCode, String responseFields, List<PriceListEntry> priceListEntry, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = bulkAddPriceListEntriesCall(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry, _callback);
        return localVarCall;

    }

    /**
     * Bulk Add Price List Entries
     * Add bulk price list entries. By default, any single error will cause the entire batch to fail. If desired, set allowPartialSuccess&#x3D;true to allow valid entries to be completed even if others in the batch fail.
     * @param publishEvents  (optional, default to true)
     * @param invalidateCache  (optional, default to true)
     * @param allowPartialSuccess Returns status codes of 200 (complete success), 206 (some entries failed validation), 409 (all entries failed validation), or 500 (unexpected failure) (optional)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @return PriceListBulkResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PriceListBulkResult bulkAddPriceListEntries(Boolean publishEvents, Boolean invalidateCache, Boolean allowPartialSuccess, String batchJobCode, String responseFields, List<PriceListEntry> priceListEntry) throws ApiException {
        ApiResponse<PriceListBulkResult> localVarResp = bulkAddPriceListEntriesWithHttpInfo(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry);
        return localVarResp.getData();
    }

    /**
     * Bulk Add Price List Entries
     * Add bulk price list entries. By default, any single error will cause the entire batch to fail. If desired, set allowPartialSuccess&#x3D;true to allow valid entries to be completed even if others in the batch fail.
     * @param publishEvents  (optional, default to true)
     * @param invalidateCache  (optional, default to true)
     * @param allowPartialSuccess Returns status codes of 200 (complete success), 206 (some entries failed validation), 409 (all entries failed validation), or 500 (unexpected failure) (optional)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @return ApiResponse&lt;PriceListBulkResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PriceListBulkResult> bulkAddPriceListEntriesWithHttpInfo(Boolean publishEvents, Boolean invalidateCache, Boolean allowPartialSuccess, String batchJobCode, String responseFields, List<PriceListEntry> priceListEntry) throws ApiException {
        okhttp3.Call localVarCall = bulkAddPriceListEntriesValidateBeforeCall(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry, null);
        Type localVarReturnType = new TypeToken<PriceListBulkResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Bulk Add Price List Entries (asynchronously)
     * Add bulk price list entries. By default, any single error will cause the entire batch to fail. If desired, set allowPartialSuccess&#x3D;true to allow valid entries to be completed even if others in the batch fail.
     * @param publishEvents  (optional, default to true)
     * @param invalidateCache  (optional, default to true)
     * @param allowPartialSuccess Returns status codes of 200 (complete success), 206 (some entries failed validation), 409 (all entries failed validation), or 500 (unexpected failure) (optional)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkAddPriceListEntriesAsync(Boolean publishEvents, Boolean invalidateCache, Boolean allowPartialSuccess, String batchJobCode, String responseFields, List<PriceListEntry> priceListEntry, final ApiCallback<PriceListBulkResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = bulkAddPriceListEntriesValidateBeforeCall(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry, _callback);
        Type localVarReturnType = new TypeToken<PriceListBulkResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for bulkDeletePriceListEntries
     * @param publishEvents  (optional, default to true)
     * @param invalidateCache  (optional, default to true)
     * @param allowPartialSuccess  (optional)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkDeletePriceListEntriesCall(Boolean publishEvents, Boolean invalidateCache, Boolean allowPartialSuccess, String batchJobCode, String responseFields, List<PriceListEntry> priceListEntry, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = priceListEntry;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/pricelists/bulkdeleteentries";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (publishEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("publishEvents", publishEvents));
        }

        if (invalidateCache != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invalidateCache", invalidateCache));
        }

        if (allowPartialSuccess != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("allowPartialSuccess", allowPartialSuccess));
        }

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
    private okhttp3.Call bulkDeletePriceListEntriesValidateBeforeCall(Boolean publishEvents, Boolean invalidateCache, Boolean allowPartialSuccess, String batchJobCode, String responseFields, List<PriceListEntry> priceListEntry, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = bulkDeletePriceListEntriesCall(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry, _callback);
        return localVarCall;

    }

    /**
     * Bulk Delete Price List Entries
     * Deletes up to 5000 price list entries in bulk. By default, any single error will cause the entire batch to fail. If desired, set allowPartialSuccess&#x3D;true to allow valid entries to be completed even if others in the batch fail.
     * @param publishEvents  (optional, default to true)
     * @param invalidateCache  (optional, default to true)
     * @param allowPartialSuccess  (optional)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @return PriceListBulkResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PriceListBulkResult bulkDeletePriceListEntries(Boolean publishEvents, Boolean invalidateCache, Boolean allowPartialSuccess, String batchJobCode, String responseFields, List<PriceListEntry> priceListEntry) throws ApiException {
        ApiResponse<PriceListBulkResult> localVarResp = bulkDeletePriceListEntriesWithHttpInfo(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry);
        return localVarResp.getData();
    }

    /**
     * Bulk Delete Price List Entries
     * Deletes up to 5000 price list entries in bulk. By default, any single error will cause the entire batch to fail. If desired, set allowPartialSuccess&#x3D;true to allow valid entries to be completed even if others in the batch fail.
     * @param publishEvents  (optional, default to true)
     * @param invalidateCache  (optional, default to true)
     * @param allowPartialSuccess  (optional)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @return ApiResponse&lt;PriceListBulkResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PriceListBulkResult> bulkDeletePriceListEntriesWithHttpInfo(Boolean publishEvents, Boolean invalidateCache, Boolean allowPartialSuccess, String batchJobCode, String responseFields, List<PriceListEntry> priceListEntry) throws ApiException {
        okhttp3.Call localVarCall = bulkDeletePriceListEntriesValidateBeforeCall(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry, null);
        Type localVarReturnType = new TypeToken<PriceListBulkResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Bulk Delete Price List Entries (asynchronously)
     * Deletes up to 5000 price list entries in bulk. By default, any single error will cause the entire batch to fail. If desired, set allowPartialSuccess&#x3D;true to allow valid entries to be completed even if others in the batch fail.
     * @param publishEvents  (optional, default to true)
     * @param invalidateCache  (optional, default to true)
     * @param allowPartialSuccess  (optional)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkDeletePriceListEntriesAsync(Boolean publishEvents, Boolean invalidateCache, Boolean allowPartialSuccess, String batchJobCode, String responseFields, List<PriceListEntry> priceListEntry, final ApiCallback<PriceListBulkResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = bulkDeletePriceListEntriesValidateBeforeCall(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry, _callback);
        Type localVarReturnType = new TypeToken<PriceListBulkResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for bulkUpdatePriceListEntries
     * @param publishEvents  (optional, default to true)
     * @param invalidateCache  (optional, default to true)
     * @param allowPartialSuccess  (optional)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkUpdatePriceListEntriesCall(Boolean publishEvents, Boolean invalidateCache, Boolean allowPartialSuccess, String batchJobCode, String responseFields, List<PriceListEntry> priceListEntry, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = priceListEntry;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/pricelists/bulkupdateentries";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (publishEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("publishEvents", publishEvents));
        }

        if (invalidateCache != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invalidateCache", invalidateCache));
        }

        if (allowPartialSuccess != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("allowPartialSuccess", allowPartialSuccess));
        }

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
    private okhttp3.Call bulkUpdatePriceListEntriesValidateBeforeCall(Boolean publishEvents, Boolean invalidateCache, Boolean allowPartialSuccess, String batchJobCode, String responseFields, List<PriceListEntry> priceListEntry, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = bulkUpdatePriceListEntriesCall(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry, _callback);
        return localVarCall;

    }

    /**
     * Bulk Update Price List Entries.
     * Updates up to 5000 price list entries in bulk. By default, any single error will cause the entire batch to fail. If desired, set allowPartialSuccess&#x3D;true to allow valid entries to be completed even if others in the batch fail. &lt;p&gt;This method performs an upsert, which will add missing entries if they do not exist. It can be used in place of Bulk Add Price List Entries to simplify application logic when the desired behavior is to update an entry or add the entry if it does not exist.&lt;/p&gt; &lt;p&gt;Disable the publishEvents parameter to prevent publishing the event related to updating price list entries in the system. Disabling this property helps you prevent performance delays if you expect the event to trigger the re-indexing of a large number of products, or if you want to postpone the operations of other applications and services listening for the event. Disable the invalidateCache parameter if you expect to encounter unacceptable performance hits related to clearing the cache for each product in the price list entries.&lt;/p&gt;
     * @param publishEvents  (optional, default to true)
     * @param invalidateCache  (optional, default to true)
     * @param allowPartialSuccess  (optional)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @return PriceListBulkResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PriceListBulkResult bulkUpdatePriceListEntries(Boolean publishEvents, Boolean invalidateCache, Boolean allowPartialSuccess, String batchJobCode, String responseFields, List<PriceListEntry> priceListEntry) throws ApiException {
        ApiResponse<PriceListBulkResult> localVarResp = bulkUpdatePriceListEntriesWithHttpInfo(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry);
        return localVarResp.getData();
    }

    /**
     * Bulk Update Price List Entries.
     * Updates up to 5000 price list entries in bulk. By default, any single error will cause the entire batch to fail. If desired, set allowPartialSuccess&#x3D;true to allow valid entries to be completed even if others in the batch fail. &lt;p&gt;This method performs an upsert, which will add missing entries if they do not exist. It can be used in place of Bulk Add Price List Entries to simplify application logic when the desired behavior is to update an entry or add the entry if it does not exist.&lt;/p&gt; &lt;p&gt;Disable the publishEvents parameter to prevent publishing the event related to updating price list entries in the system. Disabling this property helps you prevent performance delays if you expect the event to trigger the re-indexing of a large number of products, or if you want to postpone the operations of other applications and services listening for the event. Disable the invalidateCache parameter if you expect to encounter unacceptable performance hits related to clearing the cache for each product in the price list entries.&lt;/p&gt;
     * @param publishEvents  (optional, default to true)
     * @param invalidateCache  (optional, default to true)
     * @param allowPartialSuccess  (optional)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @return ApiResponse&lt;PriceListBulkResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PriceListBulkResult> bulkUpdatePriceListEntriesWithHttpInfo(Boolean publishEvents, Boolean invalidateCache, Boolean allowPartialSuccess, String batchJobCode, String responseFields, List<PriceListEntry> priceListEntry) throws ApiException {
        okhttp3.Call localVarCall = bulkUpdatePriceListEntriesValidateBeforeCall(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry, null);
        Type localVarReturnType = new TypeToken<PriceListBulkResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Bulk Update Price List Entries. (asynchronously)
     * Updates up to 5000 price list entries in bulk. By default, any single error will cause the entire batch to fail. If desired, set allowPartialSuccess&#x3D;true to allow valid entries to be completed even if others in the batch fail. &lt;p&gt;This method performs an upsert, which will add missing entries if they do not exist. It can be used in place of Bulk Add Price List Entries to simplify application logic when the desired behavior is to update an entry or add the entry if it does not exist.&lt;/p&gt; &lt;p&gt;Disable the publishEvents parameter to prevent publishing the event related to updating price list entries in the system. Disabling this property helps you prevent performance delays if you expect the event to trigger the re-indexing of a large number of products, or if you want to postpone the operations of other applications and services listening for the event. Disable the invalidateCache parameter if you expect to encounter unacceptable performance hits related to clearing the cache for each product in the price list entries.&lt;/p&gt;
     * @param publishEvents  (optional, default to true)
     * @param invalidateCache  (optional, default to true)
     * @param allowPartialSuccess  (optional)
     * @param batchJobCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkUpdatePriceListEntriesAsync(Boolean publishEvents, Boolean invalidateCache, Boolean allowPartialSuccess, String batchJobCode, String responseFields, List<PriceListEntry> priceListEntry, final ApiCallback<PriceListBulkResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = bulkUpdatePriceListEntriesValidateBeforeCall(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry, _callback);
        Type localVarReturnType = new TypeToken<PriceListBulkResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePriceListEntry
     * @param priceListCode  (required)
     * @param productCode  (required)
     * @param currencyCode  (required)
     * @param startDate  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePriceListEntryCall(String priceListCode, String productCode, String currencyCode, OffsetDateTime startDate, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/pricelists/{priceListCode}/entries/{productCode}/{currencyCode}"
            .replaceAll("\\{" + "priceListCode" + "\\}", localVarApiClient.escapeString(priceListCode.toString()))
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "currencyCode" + "\\}", localVarApiClient.escapeString(currencyCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startDate", startDate));
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
    private okhttp3.Call deletePriceListEntryValidateBeforeCall(String priceListCode, String productCode, String currencyCode, OffsetDateTime startDate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'priceListCode' is set
        if (priceListCode == null) {
            throw new ApiException("Missing the required parameter 'priceListCode' when calling deletePriceListEntry(Async)");
        }
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling deletePriceListEntry(Async)");
        }
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling deletePriceListEntry(Async)");
        }
        

        okhttp3.Call localVarCall = deletePriceListEntryCall(priceListCode, productCode, currencyCode, startDate, _callback);
        return localVarCall;

    }

    /**
     * Delete Price List Entry by Currency
     * Deletes a price liste entry for a particular product and currency code.
     * @param priceListCode  (required)
     * @param productCode  (required)
     * @param currencyCode  (required)
     * @param startDate  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deletePriceListEntry(String priceListCode, String productCode, String currencyCode, OffsetDateTime startDate) throws ApiException {
        deletePriceListEntryWithHttpInfo(priceListCode, productCode, currencyCode, startDate);
    }

    /**
     * Delete Price List Entry by Currency
     * Deletes a price liste entry for a particular product and currency code.
     * @param priceListCode  (required)
     * @param productCode  (required)
     * @param currencyCode  (required)
     * @param startDate  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deletePriceListEntryWithHttpInfo(String priceListCode, String productCode, String currencyCode, OffsetDateTime startDate) throws ApiException {
        okhttp3.Call localVarCall = deletePriceListEntryValidateBeforeCall(priceListCode, productCode, currencyCode, startDate, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Price List Entry by Currency (asynchronously)
     * Deletes a price liste entry for a particular product and currency code.
     * @param priceListCode  (required)
     * @param productCode  (required)
     * @param currencyCode  (required)
     * @param startDate  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePriceListEntryAsync(String priceListCode, String productCode, String currencyCode, OffsetDateTime startDate, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePriceListEntryValidateBeforeCall(priceListCode, productCode, currencyCode, startDate, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPriceListEntries
     * @param priceListCode  (required)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
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
    public okhttp3.Call getPriceListEntriesCall(String priceListCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/pricelists/{priceListCode}/entries"
            .replaceAll("\\{" + "priceListCode" + "\\}", localVarApiClient.escapeString(priceListCode.toString()));

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
    private okhttp3.Call getPriceListEntriesValidateBeforeCall(String priceListCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'priceListCode' is set
        if (priceListCode == null) {
            throw new ApiException("Missing the required parameter 'priceListCode' when calling getPriceListEntries(Async)");
        }
        

        okhttp3.Call localVarCall = getPriceListEntriesCall(priceListCode, startIndex, pageSize, sortBy, filter, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Price List Entries
     * Retrieves the entries within a price list.
     * @param priceListCode  (required)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return PriceListEntryCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PriceListEntryCollection getPriceListEntries(String priceListCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws ApiException {
        ApiResponse<PriceListEntryCollection> localVarResp = getPriceListEntriesWithHttpInfo(priceListCode, startIndex, pageSize, sortBy, filter, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Price List Entries
     * Retrieves the entries within a price list.
     * @param priceListCode  (required)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;PriceListEntryCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PriceListEntryCollection> getPriceListEntriesWithHttpInfo(String priceListCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getPriceListEntriesValidateBeforeCall(priceListCode, startIndex, pageSize, sortBy, filter, responseFields, null);
        Type localVarReturnType = new TypeToken<PriceListEntryCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Price List Entries (asynchronously)
     * Retrieves the entries within a price list.
     * @param priceListCode  (required)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
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
    public okhttp3.Call getPriceListEntriesAsync(String priceListCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, final ApiCallback<PriceListEntryCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPriceListEntriesValidateBeforeCall(priceListCode, startIndex, pageSize, sortBy, filter, responseFields, _callback);
        Type localVarReturnType = new TypeToken<PriceListEntryCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPriceListEntry
     * @param priceListCode  (required)
     * @param productCode  (required)
     * @param currencyCode  (required)
     * @param startDate  (optional)
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
    public okhttp3.Call getPriceListEntryCall(String priceListCode, String productCode, String currencyCode, OffsetDateTime startDate, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/pricelists/{priceListCode}/entries/{productCode}/{currencyCode}"
            .replaceAll("\\{" + "priceListCode" + "\\}", localVarApiClient.escapeString(priceListCode.toString()))
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "currencyCode" + "\\}", localVarApiClient.escapeString(currencyCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startDate", startDate));
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
    private okhttp3.Call getPriceListEntryValidateBeforeCall(String priceListCode, String productCode, String currencyCode, OffsetDateTime startDate, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'priceListCode' is set
        if (priceListCode == null) {
            throw new ApiException("Missing the required parameter 'priceListCode' when calling getPriceListEntry(Async)");
        }
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getPriceListEntry(Async)");
        }
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling getPriceListEntry(Async)");
        }
        

        okhttp3.Call localVarCall = getPriceListEntryCall(priceListCode, productCode, currencyCode, startDate, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Price List Entries by Currency
     * Retrieves price list entries for a particular product and currency code.
     * @param priceListCode  (required)
     * @param productCode  (required)
     * @param currencyCode  (required)
     * @param startDate  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return PriceListEntry
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PriceListEntry getPriceListEntry(String priceListCode, String productCode, String currencyCode, OffsetDateTime startDate, String responseFields) throws ApiException {
        ApiResponse<PriceListEntry> localVarResp = getPriceListEntryWithHttpInfo(priceListCode, productCode, currencyCode, startDate, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Price List Entries by Currency
     * Retrieves price list entries for a particular product and currency code.
     * @param priceListCode  (required)
     * @param productCode  (required)
     * @param currencyCode  (required)
     * @param startDate  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;PriceListEntry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PriceListEntry> getPriceListEntryWithHttpInfo(String priceListCode, String productCode, String currencyCode, OffsetDateTime startDate, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getPriceListEntryValidateBeforeCall(priceListCode, productCode, currencyCode, startDate, responseFields, null);
        Type localVarReturnType = new TypeToken<PriceListEntry>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Price List Entries by Currency (asynchronously)
     * Retrieves price list entries for a particular product and currency code.
     * @param priceListCode  (required)
     * @param productCode  (required)
     * @param currencyCode  (required)
     * @param startDate  (optional)
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
    public okhttp3.Call getPriceListEntryAsync(String priceListCode, String productCode, String currencyCode, OffsetDateTime startDate, String responseFields, final ApiCallback<PriceListEntry> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPriceListEntryValidateBeforeCall(priceListCode, productCode, currencyCode, startDate, responseFields, _callback);
        Type localVarReturnType = new TypeToken<PriceListEntry>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updatePriceListEntry
     * @param priceListCode  (required)
     * @param productCode  (required)
     * @param currencyCode  (required)
     * @param startDate  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePriceListEntryCall(String priceListCode, String productCode, String currencyCode, OffsetDateTime startDate, String responseFields, PriceListEntry priceListEntry, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = priceListEntry;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/pricelists/{priceListCode}/entries/{productCode}/{currencyCode}"
            .replaceAll("\\{" + "priceListCode" + "\\}", localVarApiClient.escapeString(priceListCode.toString()))
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "currencyCode" + "\\}", localVarApiClient.escapeString(currencyCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startDate", startDate));
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
    private okhttp3.Call updatePriceListEntryValidateBeforeCall(String priceListCode, String productCode, String currencyCode, OffsetDateTime startDate, String responseFields, PriceListEntry priceListEntry, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'priceListCode' is set
        if (priceListCode == null) {
            throw new ApiException("Missing the required parameter 'priceListCode' when calling updatePriceListEntry(Async)");
        }
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updatePriceListEntry(Async)");
        }
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling updatePriceListEntry(Async)");
        }
        

        okhttp3.Call localVarCall = updatePriceListEntryCall(priceListCode, productCode, currencyCode, startDate, responseFields, priceListEntry, _callback);
        return localVarCall;

    }

    /**
     * Update Price List Entry by Currency
     * Updates price list entry for a particular product and currency code.
     * @param priceListCode  (required)
     * @param productCode  (required)
     * @param currencyCode  (required)
     * @param startDate  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @return PriceListEntry
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PriceListEntry updatePriceListEntry(String priceListCode, String productCode, String currencyCode, OffsetDateTime startDate, String responseFields, PriceListEntry priceListEntry) throws ApiException {
        ApiResponse<PriceListEntry> localVarResp = updatePriceListEntryWithHttpInfo(priceListCode, productCode, currencyCode, startDate, responseFields, priceListEntry);
        return localVarResp.getData();
    }

    /**
     * Update Price List Entry by Currency
     * Updates price list entry for a particular product and currency code.
     * @param priceListCode  (required)
     * @param productCode  (required)
     * @param currencyCode  (required)
     * @param startDate  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @return ApiResponse&lt;PriceListEntry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PriceListEntry> updatePriceListEntryWithHttpInfo(String priceListCode, String productCode, String currencyCode, OffsetDateTime startDate, String responseFields, PriceListEntry priceListEntry) throws ApiException {
        okhttp3.Call localVarCall = updatePriceListEntryValidateBeforeCall(priceListCode, productCode, currencyCode, startDate, responseFields, priceListEntry, null);
        Type localVarReturnType = new TypeToken<PriceListEntry>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Price List Entry by Currency (asynchronously)
     * Updates price list entry for a particular product and currency code.
     * @param priceListCode  (required)
     * @param productCode  (required)
     * @param currencyCode  (required)
     * @param startDate  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param priceListEntry  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePriceListEntryAsync(String priceListCode, String productCode, String currencyCode, OffsetDateTime startDate, String responseFields, PriceListEntry priceListEntry, final ApiCallback<PriceListEntry> _callback) throws ApiException {

        okhttp3.Call localVarCall = updatePriceListEntryValidateBeforeCall(priceListCode, productCode, currencyCode, startDate, responseFields, priceListEntry, _callback);
        Type localVarReturnType = new TypeToken<PriceListEntry>(){}.getType();
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
        public PriceListEntriesApi build() {
            return new PriceListEntriesApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
