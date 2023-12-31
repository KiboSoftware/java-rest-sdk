/*
 * Kibo Catalog Admin Services
 * OpenAPI Spec for Kibo Catalog Admin Services
 *
 * The version of the OpenAPI document: 1.0.0
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


import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsPriceList;
import com.kibocommerce.sdk.catalogadministration.models.PriceListCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PriceListsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public PriceListsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PriceListsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public PriceListsApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public PriceListsApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public PriceListsApi(Builder builder) {
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
     * Build call for addPriceList
     * @param catalogAdminsPriceList  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPriceListCall(CatalogAdminsPriceList catalogAdminsPriceList, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsPriceList;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/pricelists";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        String[] localVarAuthNames = new String[] { "bearerAuth", "clientOauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addPriceListValidateBeforeCall(CatalogAdminsPriceList catalogAdminsPriceList, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = addPriceListCall(catalogAdminsPriceList, _callback);
        return localVarCall;

    }

    /**
     * Add price list
     * 
     * @param catalogAdminsPriceList  (optional)
     * @return CatalogAdminsPriceList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsPriceList addPriceList(CatalogAdminsPriceList catalogAdminsPriceList) throws ApiException {
        ApiResponse<CatalogAdminsPriceList> localVarResp = addPriceListWithHttpInfo(catalogAdminsPriceList);
        return localVarResp.getData();
    }

    /**
     * Add price list
     * 
     * @param catalogAdminsPriceList  (optional)
     * @return ApiResponse&lt;CatalogAdminsPriceList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsPriceList> addPriceListWithHttpInfo(CatalogAdminsPriceList catalogAdminsPriceList) throws ApiException {
        okhttp3.Call localVarCall = addPriceListValidateBeforeCall(catalogAdminsPriceList, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsPriceList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add price list (asynchronously)
     * 
     * @param catalogAdminsPriceList  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPriceListAsync(CatalogAdminsPriceList catalogAdminsPriceList, final ApiCallback<CatalogAdminsPriceList> _callback) throws ApiException {

        okhttp3.Call localVarCall = addPriceListValidateBeforeCall(catalogAdminsPriceList, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsPriceList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePriceList
     * @param priceListCode  (required)
     * @param cascadeDeleteEntries  (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePriceListCall(String priceListCode, Boolean cascadeDeleteEntries, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/pricelists/{priceListCode}"
            .replaceAll("\\{" + "priceListCode" + "\\}", localVarApiClient.escapeString(priceListCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (cascadeDeleteEntries != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cascadeDeleteEntries", cascadeDeleteEntries));
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

        String[] localVarAuthNames = new String[] { "bearerAuth", "clientOauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deletePriceListValidateBeforeCall(String priceListCode, Boolean cascadeDeleteEntries, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'priceListCode' is set
        if (priceListCode == null) {
            throw new ApiException("Missing the required parameter 'priceListCode' when calling deletePriceList(Async)");
        }
        

        okhttp3.Call localVarCall = deletePriceListCall(priceListCode, cascadeDeleteEntries, _callback);
        return localVarCall;

    }

    /**
     * Delete price list
     * 
     * @param priceListCode  (required)
     * @param cascadeDeleteEntries  (optional, default to false)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void deletePriceList(String priceListCode, Boolean cascadeDeleteEntries) throws ApiException {
        deletePriceListWithHttpInfo(priceListCode, cascadeDeleteEntries);
    }

    /**
     * Delete price list
     * 
     * @param priceListCode  (required)
     * @param cascadeDeleteEntries  (optional, default to false)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deletePriceListWithHttpInfo(String priceListCode, Boolean cascadeDeleteEntries) throws ApiException {
        okhttp3.Call localVarCall = deletePriceListValidateBeforeCall(priceListCode, cascadeDeleteEntries, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete price list (asynchronously)
     * 
     * @param priceListCode  (required)
     * @param cascadeDeleteEntries  (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePriceListAsync(String priceListCode, Boolean cascadeDeleteEntries, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePriceListValidateBeforeCall(priceListCode, cascadeDeleteEntries, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPriceList
     * @param priceListCode  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPriceListCall(String priceListCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/pricelists/{priceListCode}"
            .replaceAll("\\{" + "priceListCode" + "\\}", localVarApiClient.escapeString(priceListCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        String[] localVarAuthNames = new String[] { "bearerAuth", "clientOauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPriceListValidateBeforeCall(String priceListCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'priceListCode' is set
        if (priceListCode == null) {
            throw new ApiException("Missing the required parameter 'priceListCode' when calling getPriceList(Async)");
        }
        

        okhttp3.Call localVarCall = getPriceListCall(priceListCode, _callback);
        return localVarCall;

    }

    /**
     * Get price list
     * 
     * @param priceListCode  (required)
     * @return CatalogAdminsPriceList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsPriceList getPriceList(String priceListCode) throws ApiException {
        ApiResponse<CatalogAdminsPriceList> localVarResp = getPriceListWithHttpInfo(priceListCode);
        return localVarResp.getData();
    }

    /**
     * Get price list
     * 
     * @param priceListCode  (required)
     * @return ApiResponse&lt;CatalogAdminsPriceList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsPriceList> getPriceListWithHttpInfo(String priceListCode) throws ApiException {
        okhttp3.Call localVarCall = getPriceListValidateBeforeCall(priceListCode, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsPriceList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get price list (asynchronously)
     * 
     * @param priceListCode  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPriceListAsync(String priceListCode, final ApiCallback<CatalogAdminsPriceList> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPriceListValidateBeforeCall(priceListCode, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsPriceList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPriceLists
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPriceListsCall(Integer startIndex, Integer pageSize, String sortBy, String filter, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/pricelists";

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

        String[] localVarAuthNames = new String[] { "bearerAuth", "clientOauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPriceListsValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String filter, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getPriceListsCall(startIndex, pageSize, sortBy, filter, _callback);
        return localVarCall;

    }

    /**
     * Get price lists
     * 
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @return PriceListCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public PriceListCollection getPriceLists(Integer startIndex, Integer pageSize, String sortBy, String filter) throws ApiException {
        ApiResponse<PriceListCollection> localVarResp = getPriceListsWithHttpInfo(startIndex, pageSize, sortBy, filter);
        return localVarResp.getData();
    }

    /**
     * Get price lists
     * 
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @return ApiResponse&lt;PriceListCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PriceListCollection> getPriceListsWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String filter) throws ApiException {
        okhttp3.Call localVarCall = getPriceListsValidateBeforeCall(startIndex, pageSize, sortBy, filter, null);
        Type localVarReturnType = new TypeToken<PriceListCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get price lists (asynchronously)
     * 
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPriceListsAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, final ApiCallback<PriceListCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPriceListsValidateBeforeCall(startIndex, pageSize, sortBy, filter, _callback);
        Type localVarReturnType = new TypeToken<PriceListCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updatePriceList
     * @param priceListCode  (required)
     * @param catalogAdminsPriceList  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePriceListCall(String priceListCode, CatalogAdminsPriceList catalogAdminsPriceList, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsPriceList;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/pricelists/{priceListCode}"
            .replaceAll("\\{" + "priceListCode" + "\\}", localVarApiClient.escapeString(priceListCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        String[] localVarAuthNames = new String[] { "bearerAuth", "clientOauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updatePriceListValidateBeforeCall(String priceListCode, CatalogAdminsPriceList catalogAdminsPriceList, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'priceListCode' is set
        if (priceListCode == null) {
            throw new ApiException("Missing the required parameter 'priceListCode' when calling updatePriceList(Async)");
        }
        

        okhttp3.Call localVarCall = updatePriceListCall(priceListCode, catalogAdminsPriceList, _callback);
        return localVarCall;

    }

    /**
     * Update price list
     * 
     * @param priceListCode  (required)
     * @param catalogAdminsPriceList  (optional)
     * @return CatalogAdminsPriceList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsPriceList updatePriceList(String priceListCode, CatalogAdminsPriceList catalogAdminsPriceList) throws ApiException {
        ApiResponse<CatalogAdminsPriceList> localVarResp = updatePriceListWithHttpInfo(priceListCode, catalogAdminsPriceList);
        return localVarResp.getData();
    }

    /**
     * Update price list
     * 
     * @param priceListCode  (required)
     * @param catalogAdminsPriceList  (optional)
     * @return ApiResponse&lt;CatalogAdminsPriceList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsPriceList> updatePriceListWithHttpInfo(String priceListCode, CatalogAdminsPriceList catalogAdminsPriceList) throws ApiException {
        okhttp3.Call localVarCall = updatePriceListValidateBeforeCall(priceListCode, catalogAdminsPriceList, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsPriceList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update price list (asynchronously)
     * 
     * @param priceListCode  (required)
     * @param catalogAdminsPriceList  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePriceListAsync(String priceListCode, CatalogAdminsPriceList catalogAdminsPriceList, final ApiCallback<CatalogAdminsPriceList> _callback) throws ApiException {

        okhttp3.Call localVarCall = updatePriceListValidateBeforeCall(priceListCode, catalogAdminsPriceList, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsPriceList>(){}.getType();
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
        public PriceListsApi build() {
            return new PriceListsApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
