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


import com.kibocommerce.sdk.catalogadministration.models.AssignedDiscount;
import com.kibocommerce.sdk.catalogadministration.models.Coupon;
import com.kibocommerce.sdk.catalogadministration.models.CouponCollection;
import com.kibocommerce.sdk.catalogadministration.models.CouponSet;
import com.kibocommerce.sdk.catalogadministration.models.CouponSetCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CouponSetsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public CouponSetsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CouponSetsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public CouponSetsApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public CouponSetsApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public CouponSetsApi(Builder builder) {
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
     * Build call for addCouponSet
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param couponSet  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addCouponSetCall(String responseFields, CouponSet couponSet, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = couponSet;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/couponsets";

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
    private okhttp3.Call addCouponSetValidateBeforeCall(String responseFields, CouponSet couponSet, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = addCouponSetCall(responseFields, couponSet, _callback);
        return localVarCall;

    }

    /**
     * Add Coupon Set
     * Adds a single CouponSet
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param couponSet  (optional)
     * @return CouponSet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CouponSet addCouponSet(String responseFields, CouponSet couponSet) throws ApiException {
        ApiResponse<CouponSet> localVarResp = addCouponSetWithHttpInfo(responseFields, couponSet);
        return localVarResp.getData();
    }

    /**
     * Add Coupon Set
     * Adds a single CouponSet
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param couponSet  (optional)
     * @return ApiResponse&lt;CouponSet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CouponSet> addCouponSetWithHttpInfo(String responseFields, CouponSet couponSet) throws ApiException {
        okhttp3.Call localVarCall = addCouponSetValidateBeforeCall(responseFields, couponSet, null);
        Type localVarReturnType = new TypeToken<CouponSet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Coupon Set (asynchronously)
     * Adds a single CouponSet
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param couponSet  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addCouponSetAsync(String responseFields, CouponSet couponSet, final ApiCallback<CouponSet> _callback) throws ApiException {

        okhttp3.Call localVarCall = addCouponSetValidateBeforeCall(responseFields, couponSet, _callback);
        Type localVarReturnType = new TypeToken<CouponSet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addCoupons
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param coupon  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addCouponsCall(String couponSetCode, String responseFields, List<Coupon> coupon, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = coupon;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes"
            .replaceAll("\\{" + "couponSetCode" + "\\}", localVarApiClient.escapeString(couponSetCode.toString()));

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
    private okhttp3.Call addCouponsValidateBeforeCall(String couponSetCode, String responseFields, List<Coupon> coupon, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'couponSetCode' is set
        if (couponSetCode == null) {
            throw new ApiException("Missing the required parameter 'couponSetCode' when calling addCoupons(Async)");
        }
        

        okhttp3.Call localVarCall = addCouponsCall(couponSetCode, responseFields, coupon, _callback);
        return localVarCall;

    }

    /**
     * Add Coupons
     * Adds coupon codes to a coupon set.
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param coupon  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void addCoupons(String couponSetCode, String responseFields, List<Coupon> coupon) throws ApiException {
        addCouponsWithHttpInfo(couponSetCode, responseFields, coupon);
    }

    /**
     * Add Coupons
     * Adds coupon codes to a coupon set.
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param coupon  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> addCouponsWithHttpInfo(String couponSetCode, String responseFields, List<Coupon> coupon) throws ApiException {
        okhttp3.Call localVarCall = addCouponsValidateBeforeCall(couponSetCode, responseFields, coupon, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Add Coupons (asynchronously)
     * Adds coupon codes to a coupon set.
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param coupon  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addCouponsAsync(String couponSetCode, String responseFields, List<Coupon> coupon, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = addCouponsValidateBeforeCall(couponSetCode, responseFields, coupon, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for assignDiscount
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param assignedDiscount  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call assignDiscountCall(String couponSetCode, String responseFields, AssignedDiscount assignedDiscount, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = assignedDiscount;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/couponsets/{couponSetCode}/assigneddiscounts"
            .replaceAll("\\{" + "couponSetCode" + "\\}", localVarApiClient.escapeString(couponSetCode.toString()));

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
    private okhttp3.Call assignDiscountValidateBeforeCall(String couponSetCode, String responseFields, AssignedDiscount assignedDiscount, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'couponSetCode' is set
        if (couponSetCode == null) {
            throw new ApiException("Missing the required parameter 'couponSetCode' when calling assignDiscount(Async)");
        }
        

        okhttp3.Call localVarCall = assignDiscountCall(couponSetCode, responseFields, assignedDiscount, _callback);
        return localVarCall;

    }

    /**
     * Assign Discount to Coupon Set
     * Assigns or associates an existing discount to a specified coupon set. Use the couponSetCode parameter to specify the coupon set.
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param assignedDiscount  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void assignDiscount(String couponSetCode, String responseFields, AssignedDiscount assignedDiscount) throws ApiException {
        assignDiscountWithHttpInfo(couponSetCode, responseFields, assignedDiscount);
    }

    /**
     * Assign Discount to Coupon Set
     * Assigns or associates an existing discount to a specified coupon set. Use the couponSetCode parameter to specify the coupon set.
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param assignedDiscount  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> assignDiscountWithHttpInfo(String couponSetCode, String responseFields, AssignedDiscount assignedDiscount) throws ApiException {
        okhttp3.Call localVarCall = assignDiscountValidateBeforeCall(couponSetCode, responseFields, assignedDiscount, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Assign Discount to Coupon Set (asynchronously)
     * Assigns or associates an existing discount to a specified coupon set. Use the couponSetCode parameter to specify the coupon set.
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param assignedDiscount  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call assignDiscountAsync(String couponSetCode, String responseFields, AssignedDiscount assignedDiscount, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = assignDiscountValidateBeforeCall(couponSetCode, responseFields, assignedDiscount, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCoupon
     * @param couponSetCode  (required)
     * @param couponCode  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCouponCall(String couponSetCode, String couponCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes/{couponCode}"
            .replaceAll("\\{" + "couponSetCode" + "\\}", localVarApiClient.escapeString(couponSetCode.toString()))
            .replaceAll("\\{" + "couponCode" + "\\}", localVarApiClient.escapeString(couponCode.toString()));

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
    private okhttp3.Call deleteCouponValidateBeforeCall(String couponSetCode, String couponCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'couponSetCode' is set
        if (couponSetCode == null) {
            throw new ApiException("Missing the required parameter 'couponSetCode' when calling deleteCoupon(Async)");
        }
        
        // verify the required parameter 'couponCode' is set
        if (couponCode == null) {
            throw new ApiException("Missing the required parameter 'couponCode' when calling deleteCoupon(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCouponCall(couponSetCode, couponCode, _callback);
        return localVarCall;

    }

    /**
     * Delete Coupon
     * Deletes a single coupon by its coupon code.
     * @param couponSetCode  (required)
     * @param couponCode  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteCoupon(String couponSetCode, String couponCode) throws ApiException {
        deleteCouponWithHttpInfo(couponSetCode, couponCode);
    }

    /**
     * Delete Coupon
     * Deletes a single coupon by its coupon code.
     * @param couponSetCode  (required)
     * @param couponCode  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteCouponWithHttpInfo(String couponSetCode, String couponCode) throws ApiException {
        okhttp3.Call localVarCall = deleteCouponValidateBeforeCall(couponSetCode, couponCode, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Coupon (asynchronously)
     * Deletes a single coupon by its coupon code.
     * @param couponSetCode  (required)
     * @param couponCode  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCouponAsync(String couponSetCode, String couponCode, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCouponValidateBeforeCall(couponSetCode, couponCode, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCouponSet
     * @param couponSetCode  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCouponSetCall(String couponSetCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/couponsets/{couponSetCode}"
            .replaceAll("\\{" + "couponSetCode" + "\\}", localVarApiClient.escapeString(couponSetCode.toString()));

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
    private okhttp3.Call deleteCouponSetValidateBeforeCall(String couponSetCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'couponSetCode' is set
        if (couponSetCode == null) {
            throw new ApiException("Missing the required parameter 'couponSetCode' when calling deleteCouponSet(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCouponSetCall(couponSetCode, _callback);
        return localVarCall;

    }

    /**
     * Delete Coupon Set
     * Deletes a CouponSet.
     * @param couponSetCode  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteCouponSet(String couponSetCode) throws ApiException {
        deleteCouponSetWithHttpInfo(couponSetCode);
    }

    /**
     * Delete Coupon Set
     * Deletes a CouponSet.
     * @param couponSetCode  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteCouponSetWithHttpInfo(String couponSetCode) throws ApiException {
        okhttp3.Call localVarCall = deleteCouponSetValidateBeforeCall(couponSetCode, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Coupon Set (asynchronously)
     * Deletes a CouponSet.
     * @param couponSetCode  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCouponSetAsync(String couponSetCode, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCouponSetValidateBeforeCall(couponSetCode, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCoupons
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param requestBody  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCouponsCall(String couponSetCode, String responseFields, List<String> requestBody, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes/remove"
            .replaceAll("\\{" + "couponSetCode" + "\\}", localVarApiClient.escapeString(couponSetCode.toString()));

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
    private okhttp3.Call deleteCouponsValidateBeforeCall(String couponSetCode, String responseFields, List<String> requestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'couponSetCode' is set
        if (couponSetCode == null) {
            throw new ApiException("Missing the required parameter 'couponSetCode' when calling deleteCoupons(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCouponsCall(couponSetCode, responseFields, requestBody, _callback);
        return localVarCall;

    }

    /**
     * Delete Coupons
     * Deletes coupons from a coupon set.
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param requestBody  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteCoupons(String couponSetCode, String responseFields, List<String> requestBody) throws ApiException {
        deleteCouponsWithHttpInfo(couponSetCode, responseFields, requestBody);
    }

    /**
     * Delete Coupons
     * Deletes coupons from a coupon set.
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param requestBody  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteCouponsWithHttpInfo(String couponSetCode, String responseFields, List<String> requestBody) throws ApiException {
        okhttp3.Call localVarCall = deleteCouponsValidateBeforeCall(couponSetCode, responseFields, requestBody, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Coupons (asynchronously)
     * Deletes coupons from a coupon set.
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param requestBody  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCouponsAsync(String couponSetCode, String responseFields, List<String> requestBody, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCouponsValidateBeforeCall(couponSetCode, responseFields, requestBody, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAssignedDiscounts
     * @param couponSetCode  (required)
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
    public okhttp3.Call getAssignedDiscountsCall(String couponSetCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/couponsets/{couponSetCode}/assigneddiscounts"
            .replaceAll("\\{" + "couponSetCode" + "\\}", localVarApiClient.escapeString(couponSetCode.toString()));

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
    private okhttp3.Call getAssignedDiscountsValidateBeforeCall(String couponSetCode, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'couponSetCode' is set
        if (couponSetCode == null) {
            throw new ApiException("Missing the required parameter 'couponSetCode' when calling getAssignedDiscounts(Async)");
        }
        

        okhttp3.Call localVarCall = getAssignedDiscountsCall(couponSetCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Assigned Discounts
     * Retrieves the discountIds of any assigned discounts for the specified coupon set.
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return List&lt;AssignedDiscount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<AssignedDiscount> getAssignedDiscounts(String couponSetCode, String responseFields) throws ApiException {
        ApiResponse<List<AssignedDiscount>> localVarResp = getAssignedDiscountsWithHttpInfo(couponSetCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Assigned Discounts
     * Retrieves the discountIds of any assigned discounts for the specified coupon set.
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;List&lt;AssignedDiscount&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<AssignedDiscount>> getAssignedDiscountsWithHttpInfo(String couponSetCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getAssignedDiscountsValidateBeforeCall(couponSetCode, responseFields, null);
        Type localVarReturnType = new TypeToken<List<AssignedDiscount>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Assigned Discounts (asynchronously)
     * Retrieves the discountIds of any assigned discounts for the specified coupon set.
     * @param couponSetCode  (required)
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
    public okhttp3.Call getAssignedDiscountsAsync(String couponSetCode, String responseFields, final ApiCallback<List<AssignedDiscount>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAssignedDiscountsValidateBeforeCall(couponSetCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<List<AssignedDiscount>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCoupon
     * @param couponSetCode  (required)
     * @param couponCode  (required)
     * @param includeCounts  (optional, default to false)
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
    public okhttp3.Call getCouponCall(String couponSetCode, String couponCode, Boolean includeCounts, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes/{couponCode}"
            .replaceAll("\\{" + "couponSetCode" + "\\}", localVarApiClient.escapeString(couponSetCode.toString()))
            .replaceAll("\\{" + "couponCode" + "\\}", localVarApiClient.escapeString(couponCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (includeCounts != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeCounts", includeCounts));
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
    private okhttp3.Call getCouponValidateBeforeCall(String couponSetCode, String couponCode, Boolean includeCounts, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'couponSetCode' is set
        if (couponSetCode == null) {
            throw new ApiException("Missing the required parameter 'couponSetCode' when calling getCoupon(Async)");
        }
        
        // verify the required parameter 'couponCode' is set
        if (couponCode == null) {
            throw new ApiException("Missing the required parameter 'couponCode' when calling getCoupon(Async)");
        }
        

        okhttp3.Call localVarCall = getCouponCall(couponSetCode, couponCode, includeCounts, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Coupon
     * Retrieves a single coupon by its coupon code.
     * @param couponSetCode  (required)
     * @param couponCode  (required)
     * @param includeCounts  (optional, default to false)
     * @param responseGroups  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return Coupon
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public Coupon getCoupon(String couponSetCode, String couponCode, Boolean includeCounts, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<Coupon> localVarResp = getCouponWithHttpInfo(couponSetCode, couponCode, includeCounts, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Coupon
     * Retrieves a single coupon by its coupon code.
     * @param couponSetCode  (required)
     * @param couponCode  (required)
     * @param includeCounts  (optional, default to false)
     * @param responseGroups  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;Coupon&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Coupon> getCouponWithHttpInfo(String couponSetCode, String couponCode, Boolean includeCounts, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getCouponValidateBeforeCall(couponSetCode, couponCode, includeCounts, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<Coupon>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Coupon (asynchronously)
     * Retrieves a single coupon by its coupon code.
     * @param couponSetCode  (required)
     * @param couponCode  (required)
     * @param includeCounts  (optional, default to false)
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
    public okhttp3.Call getCouponAsync(String couponSetCode, String couponCode, Boolean includeCounts, String responseGroups, String responseFields, final ApiCallback<Coupon> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCouponValidateBeforeCall(couponSetCode, couponCode, includeCounts, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<Coupon>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCouponSet
     * @param couponSetCode CouponSetCode for the requested CouponSet (required)
     * @param includeCounts Include the redemption counts and coupon counts (optional, default to false)
     * @param responseGroups \&quot;counts\&quot; includes the number of redemptions, coupon codes, and assigned discounts. (optional)
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
    public okhttp3.Call getCouponSetCall(String couponSetCode, Boolean includeCounts, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/couponsets/{couponSetCode}"
            .replaceAll("\\{" + "couponSetCode" + "\\}", localVarApiClient.escapeString(couponSetCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (includeCounts != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeCounts", includeCounts));
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
    private okhttp3.Call getCouponSetValidateBeforeCall(String couponSetCode, Boolean includeCounts, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'couponSetCode' is set
        if (couponSetCode == null) {
            throw new ApiException("Missing the required parameter 'couponSetCode' when calling getCouponSet(Async)");
        }
        

        okhttp3.Call localVarCall = getCouponSetCall(couponSetCode, includeCounts, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Coupon Set
     * Returns a single CouponSet
     * @param couponSetCode CouponSetCode for the requested CouponSet (required)
     * @param includeCounts Include the redemption counts and coupon counts (optional, default to false)
     * @param responseGroups \&quot;counts\&quot; includes the number of redemptions, coupon codes, and assigned discounts. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CouponSet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CouponSet getCouponSet(String couponSetCode, Boolean includeCounts, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<CouponSet> localVarResp = getCouponSetWithHttpInfo(couponSetCode, includeCounts, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Coupon Set
     * Returns a single CouponSet
     * @param couponSetCode CouponSetCode for the requested CouponSet (required)
     * @param includeCounts Include the redemption counts and coupon counts (optional, default to false)
     * @param responseGroups \&quot;counts\&quot; includes the number of redemptions, coupon codes, and assigned discounts. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CouponSet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CouponSet> getCouponSetWithHttpInfo(String couponSetCode, Boolean includeCounts, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getCouponSetValidateBeforeCall(couponSetCode, includeCounts, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<CouponSet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Coupon Set (asynchronously)
     * Returns a single CouponSet
     * @param couponSetCode CouponSetCode for the requested CouponSet (required)
     * @param includeCounts Include the redemption counts and coupon counts (optional, default to false)
     * @param responseGroups \&quot;counts\&quot; includes the number of redemptions, coupon codes, and assigned discounts. (optional)
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
    public okhttp3.Call getCouponSetAsync(String couponSetCode, Boolean includeCounts, String responseGroups, String responseFields, final ApiCallback<CouponSet> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCouponSetValidateBeforeCall(couponSetCode, includeCounts, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CouponSet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCouponSets
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param includeCounts Include coupon and redemption counts (optional, default to false)
     * @param responseGroups \&quot;counts\&quot; returns discount and couponCode counts (optional)
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
    public okhttp3.Call getCouponSetsCall(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/couponsets";

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

        if (includeCounts != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeCounts", includeCounts));
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
    private okhttp3.Call getCouponSetsValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getCouponSetsCall(startIndex, pageSize, sortBy, filter, includeCounts, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Coupon Sets
     * Returns a paged collection of CouponSets
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param includeCounts Include coupon and redemption counts (optional, default to false)
     * @param responseGroups \&quot;counts\&quot; returns discount and couponCode counts (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CouponSetCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CouponSetCollection getCouponSets(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<CouponSetCollection> localVarResp = getCouponSetsWithHttpInfo(startIndex, pageSize, sortBy, filter, includeCounts, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Coupon Sets
     * Returns a paged collection of CouponSets
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param includeCounts Include coupon and redemption counts (optional, default to false)
     * @param responseGroups \&quot;counts\&quot; returns discount and couponCode counts (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CouponSetCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CouponSetCollection> getCouponSetsWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getCouponSetsValidateBeforeCall(startIndex, pageSize, sortBy, filter, includeCounts, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<CouponSetCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Coupon Sets (asynchronously)
     * Returns a paged collection of CouponSets
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param includeCounts Include coupon and redemption counts (optional, default to false)
     * @param responseGroups \&quot;counts\&quot; returns discount and couponCode counts (optional)
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
    public okhttp3.Call getCouponSetsAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseGroups, String responseFields, final ApiCallback<CouponSetCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCouponSetsValidateBeforeCall(startIndex, pageSize, sortBy, filter, includeCounts, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CouponSetCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCoupons
     * @param couponSetCode  (required)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param includeCounts Includes coupon redemption counts (optional, default to false)
     * @param responseGroups counts (optional)
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
    public okhttp3.Call getCouponsCall(String couponSetCode, Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes"
            .replaceAll("\\{" + "couponSetCode" + "\\}", localVarApiClient.escapeString(couponSetCode.toString()));

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

        if (includeCounts != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeCounts", includeCounts));
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
    private okhttp3.Call getCouponsValidateBeforeCall(String couponSetCode, Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'couponSetCode' is set
        if (couponSetCode == null) {
            throw new ApiException("Missing the required parameter 'couponSetCode' when calling getCoupons(Async)");
        }
        

        okhttp3.Call localVarCall = getCouponsCall(couponSetCode, startIndex, pageSize, sortBy, filter, includeCounts, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Coupons
     * Returns a paged collection of Coupons.
     * @param couponSetCode  (required)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param includeCounts Includes coupon redemption counts (optional, default to false)
     * @param responseGroups counts (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CouponCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CouponCollection getCoupons(String couponSetCode, Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<CouponCollection> localVarResp = getCouponsWithHttpInfo(couponSetCode, startIndex, pageSize, sortBy, filter, includeCounts, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Coupons
     * Returns a paged collection of Coupons.
     * @param couponSetCode  (required)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param includeCounts Includes coupon redemption counts (optional, default to false)
     * @param responseGroups counts (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CouponCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CouponCollection> getCouponsWithHttpInfo(String couponSetCode, Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getCouponsValidateBeforeCall(couponSetCode, startIndex, pageSize, sortBy, filter, includeCounts, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<CouponCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Coupons (asynchronously)
     * Returns a paged collection of Coupons.
     * @param couponSetCode  (required)
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param includeCounts Includes coupon redemption counts (optional, default to false)
     * @param responseGroups counts (optional)
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
    public okhttp3.Call getCouponsAsync(String couponSetCode, Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseGroups, String responseFields, final ApiCallback<CouponCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCouponsValidateBeforeCall(couponSetCode, startIndex, pageSize, sortBy, filter, includeCounts, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CouponCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUniqueCouponSetCode
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
    public okhttp3.Call getUniqueCouponSetCodeCall(String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/couponsets/unique-code";

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
    private okhttp3.Call getUniqueCouponSetCodeValidateBeforeCall(String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getUniqueCouponSetCodeCall(responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Unique Coupon Set Code
     * Returns a random 4 character code that is unique as a coupon set code.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public String getUniqueCouponSetCode(String responseFields) throws ApiException {
        ApiResponse<String> localVarResp = getUniqueCouponSetCodeWithHttpInfo(responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Unique Coupon Set Code
     * Returns a random 4 character code that is unique as a coupon set code.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> getUniqueCouponSetCodeWithHttpInfo(String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getUniqueCouponSetCodeValidateBeforeCall(responseFields, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Unique Coupon Set Code (asynchronously)
     * Returns a random 4 character code that is unique as a coupon set code.
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
    public okhttp3.Call getUniqueCouponSetCodeAsync(String responseFields, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUniqueCouponSetCodeValidateBeforeCall(responseFields, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unAssignDiscount
     * @param couponSetCode  (required)
     * @param discountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call unAssignDiscountCall(String couponSetCode, Integer discountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/couponsets/{couponSetCode}/assigneddiscounts/{discountId}"
            .replaceAll("\\{" + "couponSetCode" + "\\}", localVarApiClient.escapeString(couponSetCode.toString()))
            .replaceAll("\\{" + "discountId" + "\\}", localVarApiClient.escapeString(discountId.toString()));

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
    private okhttp3.Call unAssignDiscountValidateBeforeCall(String couponSetCode, Integer discountId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'couponSetCode' is set
        if (couponSetCode == null) {
            throw new ApiException("Missing the required parameter 'couponSetCode' when calling unAssignDiscount(Async)");
        }
        
        // verify the required parameter 'discountId' is set
        if (discountId == null) {
            throw new ApiException("Missing the required parameter 'discountId' when calling unAssignDiscount(Async)");
        }
        

        okhttp3.Call localVarCall = unAssignDiscountCall(couponSetCode, discountId, _callback);
        return localVarCall;

    }

    /**
     * Unassign Discount from Coupon Set
     * Unassigns or disassociates the specified discount with the specified coupon set.
     * @param couponSetCode  (required)
     * @param discountId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void unAssignDiscount(String couponSetCode, Integer discountId) throws ApiException {
        unAssignDiscountWithHttpInfo(couponSetCode, discountId);
    }

    /**
     * Unassign Discount from Coupon Set
     * Unassigns or disassociates the specified discount with the specified coupon set.
     * @param couponSetCode  (required)
     * @param discountId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> unAssignDiscountWithHttpInfo(String couponSetCode, Integer discountId) throws ApiException {
        okhttp3.Call localVarCall = unAssignDiscountValidateBeforeCall(couponSetCode, discountId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Unassign Discount from Coupon Set (asynchronously)
     * Unassigns or disassociates the specified discount with the specified coupon set.
     * @param couponSetCode  (required)
     * @param discountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call unAssignDiscountAsync(String couponSetCode, Integer discountId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = unAssignDiscountValidateBeforeCall(couponSetCode, discountId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateCouponSet
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param couponSet  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCouponSetCall(String couponSetCode, String responseFields, CouponSet couponSet, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = couponSet;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/couponsets/{couponSetCode}"
            .replaceAll("\\{" + "couponSetCode" + "\\}", localVarApiClient.escapeString(couponSetCode.toString()));

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
    private okhttp3.Call updateCouponSetValidateBeforeCall(String couponSetCode, String responseFields, CouponSet couponSet, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'couponSetCode' is set
        if (couponSetCode == null) {
            throw new ApiException("Missing the required parameter 'couponSetCode' when calling updateCouponSet(Async)");
        }
        

        okhttp3.Call localVarCall = updateCouponSetCall(couponSetCode, responseFields, couponSet, _callback);
        return localVarCall;

    }

    /**
     * Update Coupon Set
     * Update a CouponSet. You can not update the Code or ID once the set is created.
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param couponSet  (optional)
     * @return CouponSet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CouponSet updateCouponSet(String couponSetCode, String responseFields, CouponSet couponSet) throws ApiException {
        ApiResponse<CouponSet> localVarResp = updateCouponSetWithHttpInfo(couponSetCode, responseFields, couponSet);
        return localVarResp.getData();
    }

    /**
     * Update Coupon Set
     * Update a CouponSet. You can not update the Code or ID once the set is created.
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param couponSet  (optional)
     * @return ApiResponse&lt;CouponSet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CouponSet> updateCouponSetWithHttpInfo(String couponSetCode, String responseFields, CouponSet couponSet) throws ApiException {
        okhttp3.Call localVarCall = updateCouponSetValidateBeforeCall(couponSetCode, responseFields, couponSet, null);
        Type localVarReturnType = new TypeToken<CouponSet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Coupon Set (asynchronously)
     * Update a CouponSet. You can not update the Code or ID once the set is created.
     * @param couponSetCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param couponSet  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCouponSetAsync(String couponSetCode, String responseFields, CouponSet couponSet, final ApiCallback<CouponSet> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateCouponSetValidateBeforeCall(couponSetCode, responseFields, couponSet, _callback);
        Type localVarReturnType = new TypeToken<CouponSet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for validateUniqueCouponSetCode
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param body  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateUniqueCouponSetCodeCall(String responseFields, String body, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/couponsets/validate-unique-code";

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
    private okhttp3.Call validateUniqueCouponSetCodeValidateBeforeCall(String responseFields, String body, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = validateUniqueCouponSetCodeCall(responseFields, body, _callback);
        return localVarCall;

    }

    /**
     * Validate Unique Coupon Set Code
     * Tests a coupone set code for uniqueness and validity.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param body  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void validateUniqueCouponSetCode(String responseFields, String body) throws ApiException {
        validateUniqueCouponSetCodeWithHttpInfo(responseFields, body);
    }

    /**
     * Validate Unique Coupon Set Code
     * Tests a coupone set code for uniqueness and validity.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param body  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> validateUniqueCouponSetCodeWithHttpInfo(String responseFields, String body) throws ApiException {
        okhttp3.Call localVarCall = validateUniqueCouponSetCodeValidateBeforeCall(responseFields, body, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Validate Unique Coupon Set Code (asynchronously)
     * Tests a coupone set code for uniqueness and validity.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param body  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateUniqueCouponSetCodeAsync(String responseFields, String body, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = validateUniqueCouponSetCodeValidateBeforeCall(responseFields, body, _callback);
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
        public CouponSetsApi build() {
            return new CouponSetsApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
