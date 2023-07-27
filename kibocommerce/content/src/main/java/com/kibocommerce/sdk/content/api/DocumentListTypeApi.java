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


import com.kibocommerce.sdk.content.models.DocumentListType;
import com.kibocommerce.sdk.content.models.DocumentListTypeCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DocumentListTypeApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public DocumentListTypeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DocumentListTypeApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public DocumentListTypeApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public DocumentListTypeApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public DocumentListTypeApi(Builder builder) {
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
     * Build call for createDocumentListType
     * @param documentListType  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createDocumentListTypeCall(DocumentListType documentListType, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = documentListType;

        // create path and map variables
        String localVarPath = "/content/documentlistTypes";

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
    private okhttp3.Call createDocumentListTypeValidateBeforeCall(DocumentListType documentListType, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createDocumentListTypeCall(documentListType, _callback);
        return localVarCall;

    }

    /**
     * Create Document List Type
     * Create Document List Type
     * @param documentListType  (optional)
     * @return DocumentListType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public DocumentListType createDocumentListType(DocumentListType documentListType) throws ApiException {
        ApiResponse<DocumentListType> localVarResp = createDocumentListTypeWithHttpInfo(documentListType);
        return localVarResp.getData();
    }

    /**
     * Create Document List Type
     * Create Document List Type
     * @param documentListType  (optional)
     * @return ApiResponse&lt;DocumentListType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DocumentListType> createDocumentListTypeWithHttpInfo(DocumentListType documentListType) throws ApiException {
        okhttp3.Call localVarCall = createDocumentListTypeValidateBeforeCall(documentListType, null);
        Type localVarReturnType = new TypeToken<DocumentListType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Document List Type (asynchronously)
     * Create Document List Type
     * @param documentListType  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createDocumentListTypeAsync(DocumentListType documentListType, final ApiCallback<DocumentListType> _callback) throws ApiException {

        okhttp3.Call localVarCall = createDocumentListTypeValidateBeforeCall(documentListType, _callback);
        Type localVarReturnType = new TypeToken<DocumentListType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDocumentListType
     * @param documentListTypeFQN  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDocumentListTypeCall(String documentListTypeFQN, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/content/documentlistTypes/{documentListTypeFQN}"
            .replaceAll("\\{" + "documentListTypeFQN" + "\\}", localVarApiClient.escapeString(documentListTypeFQN.toString()));

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
    private okhttp3.Call getDocumentListTypeValidateBeforeCall(String documentListTypeFQN, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'documentListTypeFQN' is set
        if (documentListTypeFQN == null) {
            throw new ApiException("Missing the required parameter 'documentListTypeFQN' when calling getDocumentListType(Async)");
        }
        

        okhttp3.Call localVarCall = getDocumentListTypeCall(documentListTypeFQN, _callback);
        return localVarCall;

    }

    /**
     * Get Document List Type
     * Get Document List Type
     * @param documentListTypeFQN  (required)
     * @return DocumentListType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public DocumentListType getDocumentListType(String documentListTypeFQN) throws ApiException {
        ApiResponse<DocumentListType> localVarResp = getDocumentListTypeWithHttpInfo(documentListTypeFQN);
        return localVarResp.getData();
    }

    /**
     * Get Document List Type
     * Get Document List Type
     * @param documentListTypeFQN  (required)
     * @return ApiResponse&lt;DocumentListType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DocumentListType> getDocumentListTypeWithHttpInfo(String documentListTypeFQN) throws ApiException {
        okhttp3.Call localVarCall = getDocumentListTypeValidateBeforeCall(documentListTypeFQN, null);
        Type localVarReturnType = new TypeToken<DocumentListType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Document List Type (asynchronously)
     * Get Document List Type
     * @param documentListTypeFQN  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDocumentListTypeAsync(String documentListTypeFQN, final ApiCallback<DocumentListType> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDocumentListTypeValidateBeforeCall(documentListTypeFQN, _callback);
        Type localVarReturnType = new TypeToken<DocumentListType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDocumentListTypes
     * @param pageSize  (optional)
     * @param startIndex  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDocumentListTypesCall(Integer pageSize, Integer startIndex, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/content/documentlistTypes";

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
    private okhttp3.Call getDocumentListTypesValidateBeforeCall(Integer pageSize, Integer startIndex, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getDocumentListTypesCall(pageSize, startIndex, _callback);
        return localVarCall;

    }

    /**
     * Get Document List Types
     * Get Document List Types
     * @param pageSize  (optional)
     * @param startIndex  (optional)
     * @return DocumentListTypeCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public DocumentListTypeCollection getDocumentListTypes(Integer pageSize, Integer startIndex) throws ApiException {
        ApiResponse<DocumentListTypeCollection> localVarResp = getDocumentListTypesWithHttpInfo(pageSize, startIndex);
        return localVarResp.getData();
    }

    /**
     * Get Document List Types
     * Get Document List Types
     * @param pageSize  (optional)
     * @param startIndex  (optional)
     * @return ApiResponse&lt;DocumentListTypeCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DocumentListTypeCollection> getDocumentListTypesWithHttpInfo(Integer pageSize, Integer startIndex) throws ApiException {
        okhttp3.Call localVarCall = getDocumentListTypesValidateBeforeCall(pageSize, startIndex, null);
        Type localVarReturnType = new TypeToken<DocumentListTypeCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Document List Types (asynchronously)
     * Get Document List Types
     * @param pageSize  (optional)
     * @param startIndex  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDocumentListTypesAsync(Integer pageSize, Integer startIndex, final ApiCallback<DocumentListTypeCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDocumentListTypesValidateBeforeCall(pageSize, startIndex, _callback);
        Type localVarReturnType = new TypeToken<DocumentListTypeCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateDocumentListType
     * @param documentListTypeFQN The name of the document documentListName to update (required)
     * @param documentListType Content Collection values to apply (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateDocumentListTypeCall(String documentListTypeFQN, DocumentListType documentListType, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = documentListType;

        // create path and map variables
        String localVarPath = "/content/documentlistTypes/{documentListTypeFQN}"
            .replaceAll("\\{" + "documentListTypeFQN" + "\\}", localVarApiClient.escapeString(documentListTypeFQN.toString()));

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
    private okhttp3.Call updateDocumentListTypeValidateBeforeCall(String documentListTypeFQN, DocumentListType documentListType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'documentListTypeFQN' is set
        if (documentListTypeFQN == null) {
            throw new ApiException("Missing the required parameter 'documentListTypeFQN' when calling updateDocumentListType(Async)");
        }
        

        okhttp3.Call localVarCall = updateDocumentListTypeCall(documentListTypeFQN, documentListType, _callback);
        return localVarCall;

    }

    /**
     * Update Document List Type
     * Update Document List Type
     * @param documentListTypeFQN The name of the document documentListName to update (required)
     * @param documentListType Content Collection values to apply (optional)
     * @return DocumentListType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public DocumentListType updateDocumentListType(String documentListTypeFQN, DocumentListType documentListType) throws ApiException {
        ApiResponse<DocumentListType> localVarResp = updateDocumentListTypeWithHttpInfo(documentListTypeFQN, documentListType);
        return localVarResp.getData();
    }

    /**
     * Update Document List Type
     * Update Document List Type
     * @param documentListTypeFQN The name of the document documentListName to update (required)
     * @param documentListType Content Collection values to apply (optional)
     * @return ApiResponse&lt;DocumentListType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DocumentListType> updateDocumentListTypeWithHttpInfo(String documentListTypeFQN, DocumentListType documentListType) throws ApiException {
        okhttp3.Call localVarCall = updateDocumentListTypeValidateBeforeCall(documentListTypeFQN, documentListType, null);
        Type localVarReturnType = new TypeToken<DocumentListType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Document List Type (asynchronously)
     * Update Document List Type
     * @param documentListTypeFQN The name of the document documentListName to update (required)
     * @param documentListType Content Collection values to apply (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateDocumentListTypeAsync(String documentListTypeFQN, DocumentListType documentListType, final ApiCallback<DocumentListType> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateDocumentListTypeValidateBeforeCall(documentListTypeFQN, documentListType, _callback);
        Type localVarReturnType = new TypeToken<DocumentListType>(){}.getType();
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
        public DocumentListTypeApi build() {
            return new DocumentListTypeApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
