/*
 * Inventory
 * Swagger JSON for inventory apis
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.inventory.api;
import com.kibocommerce.sdk.common.*;

import com.kibocommerce.sdk.common.ApiCallback;
import com.kibocommerce.sdk.common.ApiClient;
import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.common.ApiResponse;
import com.kibocommerce.sdk.common.Configuration;

import com.kibocommerce.sdk.common.Pair;
import com.kibocommerce.sdk.common.ProgressRequestBody;
import com.kibocommerce.sdk.common.ProgressResponseBody;

import com.kibocommerce.sdk.inventory.ServerConfiguration;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.kibocommerce.sdk.inventory.models.AllocateInventory500Response;
import com.kibocommerce.sdk.inventory.models.AllocateInventoryRequest;
import com.kibocommerce.sdk.inventory.models.BaseResponse;
import com.kibocommerce.sdk.inventory.models.JobQueueResponse;
import com.kibocommerce.sdk.inventory.models.TransitionCartRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class InventoryAllocationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public InventoryAllocationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InventoryAllocationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public InventoryAllocationApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public InventoryAllocationApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public InventoryAllocationApi(Builder builder) {
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
     * Build call for allocateInventory
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call allocateInventoryCall(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = allocateInventoryRequest;

        // create path and map variables
        String localVarPath = "/commerce/inventory/v5/inventory/allocate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xVolTenant != null) {
            localVarHeaderParams.put("x-vol-tenant", localVarApiClient.parameterToString(xVolTenant));
        }

        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call allocateInventoryValidateBeforeCall(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling allocateInventory(Async)");
        }
        
        // verify the required parameter 'allocateInventoryRequest' is set
        if (allocateInventoryRequest == null) {
            throw new ApiException("Missing the required parameter 'allocateInventoryRequest' when calling allocateInventory(Async)");
        }
        

        okhttp3.Call localVarCall = allocateInventoryCall(xVolTenant, allocateInventoryRequest, _callback);
        return localVarCall;

    }

    /**
     * Allocate Inventory
     * Allocates inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @return JobQueueResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public JobQueueResponse allocateInventory(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest) throws ApiException {
        ApiResponse<JobQueueResponse> localVarResp = allocateInventoryWithHttpInfo(xVolTenant, allocateInventoryRequest);
        return localVarResp.getData();
    }

    /**
     * Allocate Inventory
     * Allocates inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @return ApiResponse&lt;JobQueueResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<JobQueueResponse> allocateInventoryWithHttpInfo(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest) throws ApiException {
        okhttp3.Call localVarCall = allocateInventoryValidateBeforeCall(xVolTenant, allocateInventoryRequest, null);
        Type localVarReturnType = new TypeToken<JobQueueResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Allocate Inventory (asynchronously)
     * Allocates inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call allocateInventoryAsync(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ApiCallback<JobQueueResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = allocateInventoryValidateBeforeCall(xVolTenant, allocateInventoryRequest, _callback);
        Type localVarReturnType = new TypeToken<JobQueueResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deallocateInventory
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deallocateInventoryCall(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = allocateInventoryRequest;

        // create path and map variables
        String localVarPath = "/commerce/inventory/v5/inventory/deallocate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xVolTenant != null) {
            localVarHeaderParams.put("x-vol-tenant", localVarApiClient.parameterToString(xVolTenant));
        }

        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call deallocateInventoryValidateBeforeCall(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling deallocateInventory(Async)");
        }
        
        // verify the required parameter 'allocateInventoryRequest' is set
        if (allocateInventoryRequest == null) {
            throw new ApiException("Missing the required parameter 'allocateInventoryRequest' when calling deallocateInventory(Async)");
        }
        

        okhttp3.Call localVarCall = deallocateInventoryCall(xVolTenant, allocateInventoryRequest, _callback);
        return localVarCall;

    }

    /**
     * Deallocate Inventory
     * Deallocates inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @return BaseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public BaseResponse deallocateInventory(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest) throws ApiException {
        ApiResponse<BaseResponse> localVarResp = deallocateInventoryWithHttpInfo(xVolTenant, allocateInventoryRequest);
        return localVarResp.getData();
    }

    /**
     * Deallocate Inventory
     * Deallocates inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @return ApiResponse&lt;BaseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BaseResponse> deallocateInventoryWithHttpInfo(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest) throws ApiException {
        okhttp3.Call localVarCall = deallocateInventoryValidateBeforeCall(xVolTenant, allocateInventoryRequest, null);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Deallocate Inventory (asynchronously)
     * Deallocates inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deallocateInventoryAsync(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ApiCallback<BaseResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deallocateInventoryValidateBeforeCall(xVolTenant, allocateInventoryRequest, _callback);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for fulfillInventory
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fulfillInventoryCall(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = allocateInventoryRequest;

        // create path and map variables
        String localVarPath = "/commerce/inventory/v5/inventory/fulfill";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xVolTenant != null) {
            localVarHeaderParams.put("x-vol-tenant", localVarApiClient.parameterToString(xVolTenant));
        }

        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call fulfillInventoryValidateBeforeCall(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling fulfillInventory(Async)");
        }
        
        // verify the required parameter 'allocateInventoryRequest' is set
        if (allocateInventoryRequest == null) {
            throw new ApiException("Missing the required parameter 'allocateInventoryRequest' when calling fulfillInventory(Async)");
        }
        

        okhttp3.Call localVarCall = fulfillInventoryCall(xVolTenant, allocateInventoryRequest, _callback);
        return localVarCall;

    }

    /**
     * Fulfill Inventory
     * Fulfills inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @return BaseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public BaseResponse fulfillInventory(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest) throws ApiException {
        ApiResponse<BaseResponse> localVarResp = fulfillInventoryWithHttpInfo(xVolTenant, allocateInventoryRequest);
        return localVarResp.getData();
    }

    /**
     * Fulfill Inventory
     * Fulfills inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @return ApiResponse&lt;BaseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BaseResponse> fulfillInventoryWithHttpInfo(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest) throws ApiException {
        okhttp3.Call localVarCall = fulfillInventoryValidateBeforeCall(xVolTenant, allocateInventoryRequest, null);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fulfill Inventory (asynchronously)
     * Fulfills inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fulfillInventoryAsync(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ApiCallback<BaseResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = fulfillInventoryValidateBeforeCall(xVolTenant, allocateInventoryRequest, _callback);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for transitionCart
     * @param xVolTenant Tenant ID (required)
     * @param transitionCartRequest Request needed for transitioning cart allocations to order/shipment allocations (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call transitionCartCall(Integer xVolTenant, TransitionCartRequest transitionCartRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = transitionCartRequest;

        // create path and map variables
        String localVarPath = "/commerce/inventory/v5/inventory/transitionCart";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xVolTenant != null) {
            localVarHeaderParams.put("x-vol-tenant", localVarApiClient.parameterToString(xVolTenant));
        }

        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call transitionCartValidateBeforeCall(Integer xVolTenant, TransitionCartRequest transitionCartRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling transitionCart(Async)");
        }
        
        // verify the required parameter 'transitionCartRequest' is set
        if (transitionCartRequest == null) {
            throw new ApiException("Missing the required parameter 'transitionCartRequest' when calling transitionCart(Async)");
        }
        

        okhttp3.Call localVarCall = transitionCartCall(xVolTenant, transitionCartRequest, _callback);
        return localVarCall;

    }

    /**
     * Transition Cart
     * Transitions a cart allocation into a normal order/shipment allocation
     * @param xVolTenant Tenant ID (required)
     * @param transitionCartRequest Request needed for transitioning cart allocations to order/shipment allocations (required)
     * @return BaseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public BaseResponse transitionCart(Integer xVolTenant, TransitionCartRequest transitionCartRequest) throws ApiException {
        ApiResponse<BaseResponse> localVarResp = transitionCartWithHttpInfo(xVolTenant, transitionCartRequest);
        return localVarResp.getData();
    }

    /**
     * Transition Cart
     * Transitions a cart allocation into a normal order/shipment allocation
     * @param xVolTenant Tenant ID (required)
     * @param transitionCartRequest Request needed for transitioning cart allocations to order/shipment allocations (required)
     * @return ApiResponse&lt;BaseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BaseResponse> transitionCartWithHttpInfo(Integer xVolTenant, TransitionCartRequest transitionCartRequest) throws ApiException {
        okhttp3.Call localVarCall = transitionCartValidateBeforeCall(xVolTenant, transitionCartRequest, null);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Transition Cart (asynchronously)
     * Transitions a cart allocation into a normal order/shipment allocation
     * @param xVolTenant Tenant ID (required)
     * @param transitionCartRequest Request needed for transitioning cart allocations to order/shipment allocations (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call transitionCartAsync(Integer xVolTenant, TransitionCartRequest transitionCartRequest, final ApiCallback<BaseResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = transitionCartValidateBeforeCall(xVolTenant, transitionCartRequest, _callback);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
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
        public InventoryAllocationApi build() {
            return new InventoryAllocationApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
