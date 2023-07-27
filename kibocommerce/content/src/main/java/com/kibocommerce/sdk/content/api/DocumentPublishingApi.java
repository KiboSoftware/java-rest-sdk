/*
 * Kibo Content Service
 * OpenAPI Spec for Kibo Content Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.content.api;
import com.kibocommerce.sdk.common.*;

import com.kibocommerce.sdk.common.ApiCallback;
import com.kibocommerce.sdk.common.ApiClient;
import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.common.ApiResponse;
import com.kibocommerce.sdk.common.Configuration;

import com.kibocommerce.sdk.common.Pair;
import com.kibocommerce.sdk.common.ProgressRequestBody;
import com.kibocommerce.sdk.common.ProgressResponseBody;

import com.kibocommerce.sdk.content.ServerConfiguration;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.kibocommerce.sdk.content.models.DocumentDraftSummaryPagedCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DocumentPublishingApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public DocumentPublishingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DocumentPublishingApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public DocumentPublishingApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public DocumentPublishingApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public DocumentPublishingApi(Builder builder) {
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
     * Build call for deleteDocumentDrafts
     * @param documentLists  (optional)
     * @param requestBody  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteDocumentDraftsCall(String documentLists, List<String> requestBody, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/content/documentpublishing/draft";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (documentLists != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("documentLists", documentLists));
        }

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "text/plain", "application/octet-stream", "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth", "clientOauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteDocumentDraftsValidateBeforeCall(String documentLists, List<String> requestBody, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = deleteDocumentDraftsCall(documentLists, requestBody, _callback);
        return localVarCall;

    }

    /**
     * Delete Document Drafts
     * Remove draft of each Document associated with te id in documentIds. Send empty body to remove all drafts
     * @param documentLists  (optional)
     * @param requestBody  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void deleteDocumentDrafts(String documentLists, List<String> requestBody) throws ApiException {
        deleteDocumentDraftsWithHttpInfo(documentLists, requestBody);
    }

    /**
     * Delete Document Drafts
     * Remove draft of each Document associated with te id in documentIds. Send empty body to remove all drafts
     * @param documentLists  (optional)
     * @param requestBody  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteDocumentDraftsWithHttpInfo(String documentLists, List<String> requestBody) throws ApiException {
        okhttp3.Call localVarCall = deleteDocumentDraftsValidateBeforeCall(documentLists, requestBody, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Document Drafts (asynchronously)
     * Remove draft of each Document associated with te id in documentIds. Send empty body to remove all drafts
     * @param documentLists  (optional)
     * @param requestBody  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteDocumentDraftsAsync(String documentLists, List<String> requestBody, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteDocumentDraftsValidateBeforeCall(documentLists, requestBody, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for listDocumentDraftSummaries
     * @param pageSize maximum number of items to return (optional)
     * @param startIndex  (optional)
     * @param documentLists  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listDocumentDraftSummariesCall(Integer pageSize, Integer startIndex, String documentLists, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/content/documentpublishing/draft";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        if (startIndex != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startIndex", startIndex));
        }

        if (documentLists != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("documentLists", documentLists));
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
    private okhttp3.Call listDocumentDraftSummariesValidateBeforeCall(Integer pageSize, Integer startIndex, String documentLists, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listDocumentDraftSummariesCall(pageSize, startIndex, documentLists, _callback);
        return localVarCall;

    }

    /**
     * Get Document Draft Summaries
     * Get Document Draft Summaries
     * @param pageSize maximum number of items to return (optional)
     * @param startIndex  (optional)
     * @param documentLists  (optional)
     * @return DocumentDraftSummaryPagedCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public DocumentDraftSummaryPagedCollection listDocumentDraftSummaries(Integer pageSize, Integer startIndex, String documentLists) throws ApiException {
        ApiResponse<DocumentDraftSummaryPagedCollection> localVarResp = listDocumentDraftSummariesWithHttpInfo(pageSize, startIndex, documentLists);
        return localVarResp.getData();
    }

    /**
     * Get Document Draft Summaries
     * Get Document Draft Summaries
     * @param pageSize maximum number of items to return (optional)
     * @param startIndex  (optional)
     * @param documentLists  (optional)
     * @return ApiResponse&lt;DocumentDraftSummaryPagedCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DocumentDraftSummaryPagedCollection> listDocumentDraftSummariesWithHttpInfo(Integer pageSize, Integer startIndex, String documentLists) throws ApiException {
        okhttp3.Call localVarCall = listDocumentDraftSummariesValidateBeforeCall(pageSize, startIndex, documentLists, null);
        Type localVarReturnType = new TypeToken<DocumentDraftSummaryPagedCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Document Draft Summaries (asynchronously)
     * Get Document Draft Summaries
     * @param pageSize maximum number of items to return (optional)
     * @param startIndex  (optional)
     * @param documentLists  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listDocumentDraftSummariesAsync(Integer pageSize, Integer startIndex, String documentLists, final ApiCallback<DocumentDraftSummaryPagedCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = listDocumentDraftSummariesValidateBeforeCall(pageSize, startIndex, documentLists, _callback);
        Type localVarReturnType = new TypeToken<DocumentDraftSummaryPagedCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for publishDocuments
     * @param documentLists  (optional)
     * @param requestBody  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call publishDocumentsCall(String documentLists, List<String> requestBody, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/content/documentpublishing/active";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (documentLists != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("documentLists", documentLists));
        }

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "text/plain", "application/octet-stream", "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth", "clientOauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call publishDocumentsValidateBeforeCall(String documentLists, List<String> requestBody, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = publishDocumentsCall(documentLists, requestBody, _callback);
        return localVarCall;

    }

    /**
     * Publish Documents
     * Publishes draft of each Document associated with the id in documentIds. Send empty body to publish all drafts
     * @param documentLists  (optional)
     * @param requestBody  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void publishDocuments(String documentLists, List<String> requestBody) throws ApiException {
        publishDocumentsWithHttpInfo(documentLists, requestBody);
    }

    /**
     * Publish Documents
     * Publishes draft of each Document associated with the id in documentIds. Send empty body to publish all drafts
     * @param documentLists  (optional)
     * @param requestBody  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> publishDocumentsWithHttpInfo(String documentLists, List<String> requestBody) throws ApiException {
        okhttp3.Call localVarCall = publishDocumentsValidateBeforeCall(documentLists, requestBody, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Publish Documents (asynchronously)
     * Publishes draft of each Document associated with the id in documentIds. Send empty body to publish all drafts
     * @param documentLists  (optional)
     * @param requestBody  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call publishDocumentsAsync(String documentLists, List<String> requestBody, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = publishDocumentsValidateBeforeCall(documentLists, requestBody, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
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
        public DocumentPublishingApi build() {
            return new DocumentPublishingApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}