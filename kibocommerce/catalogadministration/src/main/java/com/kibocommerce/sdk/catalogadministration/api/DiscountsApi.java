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


import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsDiscount;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsDiscountCollection;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsDiscountTarget;
import com.kibocommerce.sdk.catalogadministration.models.DiscountLocalizedContent;
import com.kibocommerce.sdk.catalogadministration.models.DiscountTag;
import com.kibocommerce.sdk.catalogadministration.models.DiscountTagCollection;
import com.kibocommerce.sdk.catalogadministration.models.ExpressionValidationResult;
import com.kibocommerce.sdk.catalogadministration.models.TagCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DiscountsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public DiscountsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DiscountsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public DiscountsApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public DiscountsApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public DiscountsApi(Builder builder) {
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
     * Build call for createDiscount
     * @param tagCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDiscount Properties of the discount to create. Required properties: Content.Name, AmountType, StartDate, and Target.Type. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createDiscountCall(String tagCode, String responseFields, CatalogAdminsDiscount catalogAdminsDiscount, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsDiscount;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/discounts";

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
    private okhttp3.Call createDiscountValidateBeforeCall(String tagCode, String responseFields, CatalogAdminsDiscount catalogAdminsDiscount, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createDiscountCall(tagCode, responseFields, catalogAdminsDiscount, _callback);
        return localVarCall;

    }

    /**
     * Create Discount
     * Creates a discount. This current version of the Discounts API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access discount data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param tagCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDiscount Properties of the discount to create. Required properties: Content.Name, AmountType, StartDate, and Target.Type. (optional)
     * @return CatalogAdminsDiscount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsDiscount createDiscount(String tagCode, String responseFields, CatalogAdminsDiscount catalogAdminsDiscount) throws ApiException {
        ApiResponse<CatalogAdminsDiscount> localVarResp = createDiscountWithHttpInfo(tagCode, responseFields, catalogAdminsDiscount);
        return localVarResp.getData();
    }

    /**
     * Create Discount
     * Creates a discount. This current version of the Discounts API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access discount data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param tagCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDiscount Properties of the discount to create. Required properties: Content.Name, AmountType, StartDate, and Target.Type. (optional)
     * @return ApiResponse&lt;CatalogAdminsDiscount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsDiscount> createDiscountWithHttpInfo(String tagCode, String responseFields, CatalogAdminsDiscount catalogAdminsDiscount) throws ApiException {
        okhttp3.Call localVarCall = createDiscountValidateBeforeCall(tagCode, responseFields, catalogAdminsDiscount, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsDiscount>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Discount (asynchronously)
     * Creates a discount. This current version of the Discounts API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access discount data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param tagCode  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDiscount Properties of the discount to create. Required properties: Content.Name, AmountType, StartDate, and Target.Type. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createDiscountAsync(String tagCode, String responseFields, CatalogAdminsDiscount catalogAdminsDiscount, final ApiCallback<CatalogAdminsDiscount> _callback) throws ApiException {

        okhttp3.Call localVarCall = createDiscountValidateBeforeCall(tagCode, responseFields, catalogAdminsDiscount, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsDiscount>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteDiscount
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteDiscountCall(Integer discountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/discounts/{discountId}"
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
    private okhttp3.Call deleteDiscountValidateBeforeCall(Integer discountId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'discountId' is set
        if (discountId == null) {
            throw new ApiException("Missing the required parameter 'discountId' when calling deleteDiscount(Async)");
        }
        

        okhttp3.Call localVarCall = deleteDiscountCall(discountId, _callback);
        return localVarCall;

    }

    /**
     * Delete Discount
     * Deletes a discount specified by its discount ID.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteDiscount(Integer discountId) throws ApiException {
        deleteDiscountWithHttpInfo(discountId);
    }

    /**
     * Delete Discount
     * Deletes a discount specified by its discount ID.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteDiscountWithHttpInfo(Integer discountId) throws ApiException {
        okhttp3.Call localVarCall = deleteDiscountValidateBeforeCall(discountId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Discount (asynchronously)
     * Deletes a discount specified by its discount ID.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteDiscountAsync(Integer discountId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteDiscountValidateBeforeCall(discountId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for generateRandomCoupon
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
    public okhttp3.Call generateRandomCouponCall(String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/discounts/generate-random-coupon";

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
    private okhttp3.Call generateRandomCouponValidateBeforeCall(String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = generateRandomCouponCall(responseFields, _callback);
        return localVarCall;

    }

    /**
     * Generate Random Coupon
     * Generates a random code for a coupon.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public String generateRandomCoupon(String responseFields) throws ApiException {
        ApiResponse<String> localVarResp = generateRandomCouponWithHttpInfo(responseFields);
        return localVarResp.getData();
    }

    /**
     * Generate Random Coupon
     * Generates a random code for a coupon.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> generateRandomCouponWithHttpInfo(String responseFields) throws ApiException {
        okhttp3.Call localVarCall = generateRandomCouponValidateBeforeCall(responseFields, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Generate Random Coupon (asynchronously)
     * Generates a random code for a coupon.
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
    public okhttp3.Call generateRandomCouponAsync(String responseFields, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = generateRandomCouponValidateBeforeCall(responseFields, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDiscount
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
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
    public okhttp3.Call getDiscountCall(Integer discountId, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/discounts/{discountId}"
            .replaceAll("\\{" + "discountId" + "\\}", localVarApiClient.escapeString(discountId.toString()));

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
    private okhttp3.Call getDiscountValidateBeforeCall(Integer discountId, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'discountId' is set
        if (discountId == null) {
            throw new ApiException("Missing the required parameter 'discountId' when calling getDiscount(Async)");
        }
        

        okhttp3.Call localVarCall = getDiscountCall(discountId, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Discount
     * Retrieves the details of a single discount. This current version of the Discounts API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access discount data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsDiscount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsDiscount getDiscount(Integer discountId, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsDiscount> localVarResp = getDiscountWithHttpInfo(discountId, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Discount
     * Retrieves the details of a single discount. This current version of the Discounts API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access discount data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsDiscount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsDiscount> getDiscountWithHttpInfo(Integer discountId, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getDiscountValidateBeforeCall(discountId, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsDiscount>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Discount (asynchronously)
     * Retrieves the details of a single discount. This current version of the Discounts API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access discount data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
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
    public okhttp3.Call getDiscountAsync(Integer discountId, String responseFields, final ApiCallback<CatalogAdminsDiscount> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDiscountValidateBeforeCall(discountId, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsDiscount>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDiscountContent
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
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
    public okhttp3.Call getDiscountContentCall(Integer discountId, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/discounts/{discountId}/content"
            .replaceAll("\\{" + "discountId" + "\\}", localVarApiClient.escapeString(discountId.toString()));

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
    private okhttp3.Call getDiscountContentValidateBeforeCall(Integer discountId, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'discountId' is set
        if (discountId == null) {
            throw new ApiException("Missing the required parameter 'discountId' when calling getDiscountContent(Async)");
        }
        

        okhttp3.Call localVarCall = getDiscountContentCall(discountId, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Discount Content
     * Retrieves the localized content specified for the specified discount.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return DiscountLocalizedContent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public DiscountLocalizedContent getDiscountContent(Integer discountId, String responseFields) throws ApiException {
        ApiResponse<DiscountLocalizedContent> localVarResp = getDiscountContentWithHttpInfo(discountId, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Discount Content
     * Retrieves the localized content specified for the specified discount.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;DiscountLocalizedContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DiscountLocalizedContent> getDiscountContentWithHttpInfo(Integer discountId, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getDiscountContentValidateBeforeCall(discountId, responseFields, null);
        Type localVarReturnType = new TypeToken<DiscountLocalizedContent>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Discount Content (asynchronously)
     * Retrieves the localized content specified for the specified discount.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
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
    public okhttp3.Call getDiscountContentAsync(Integer discountId, String responseFields, final ApiCallback<DiscountLocalizedContent> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDiscountContentValidateBeforeCall(discountId, responseFields, _callback);
        Type localVarReturnType = new TypeToken<DiscountLocalizedContent>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDiscountTarget
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
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
    public okhttp3.Call getDiscountTargetCall(Integer discountId, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/discounts/{discountId}/target"
            .replaceAll("\\{" + "discountId" + "\\}", localVarApiClient.escapeString(discountId.toString()));

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
    private okhttp3.Call getDiscountTargetValidateBeforeCall(Integer discountId, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'discountId' is set
        if (discountId == null) {
            throw new ApiException("Missing the required parameter 'discountId' when calling getDiscountTarget(Async)");
        }
        

        okhttp3.Call localVarCall = getDiscountTargetCall(discountId, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Discount Target
     * Retrieves the discount target, that is which products, categories, or shipping methods are eligible for the discount.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsDiscountTarget
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsDiscountTarget getDiscountTarget(Integer discountId, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsDiscountTarget> localVarResp = getDiscountTargetWithHttpInfo(discountId, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Discount Target
     * Retrieves the discount target, that is which products, categories, or shipping methods are eligible for the discount.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsDiscountTarget&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsDiscountTarget> getDiscountTargetWithHttpInfo(Integer discountId, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getDiscountTargetValidateBeforeCall(discountId, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsDiscountTarget>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Discount Target (asynchronously)
     * Retrieves the discount target, that is which products, categories, or shipping methods are eligible for the discount.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
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
    public okhttp3.Call getDiscountTargetAsync(Integer discountId, String responseFields, final ApiCallback<CatalogAdminsDiscountTarget> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDiscountTargetValidateBeforeCall(discountId, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsDiscountTarget>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDiscounts
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
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
    public okhttp3.Call getDiscountsCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/discounts";

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
    private okhttp3.Call getDiscountsValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getDiscountsCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Discounts
     * Retrieves a list of discounts according to any specified filter criteria and sort options. This current version of the Discounts API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access discount data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param responseGroups  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsDiscountCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsDiscountCollection getDiscounts(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsDiscountCollection> localVarResp = getDiscountsWithHttpInfo(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Discounts
     * Retrieves a list of discounts according to any specified filter criteria and sort options. This current version of the Discounts API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access discount data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param responseGroups  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsDiscountCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsDiscountCollection> getDiscountsWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getDiscountsValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsDiscountCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Discounts (asynchronously)
     * Retrieves a list of discounts according to any specified filter criteria and sort options. This current version of the Discounts API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access discount data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
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
    public okhttp3.Call getDiscountsAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback<CatalogAdminsDiscountCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDiscountsValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsDiscountCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTags
     * @param discountId  (required)
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
    public okhttp3.Call getTagsCall(Integer discountId, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/discounts/{discountId}/tags"
            .replaceAll("\\{" + "discountId" + "\\}", localVarApiClient.escapeString(discountId.toString()));

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
    private okhttp3.Call getTagsValidateBeforeCall(Integer discountId, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'discountId' is set
        if (discountId == null) {
            throw new ApiException("Missing the required parameter 'discountId' when calling getTags(Async)");
        }
        

        okhttp3.Call localVarCall = getTagsCall(discountId, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Discount Tags
     * Retrieves all tags associated to a discount
     * @param discountId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return TagCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public TagCollection getTags(Integer discountId, String responseFields) throws ApiException {
        ApiResponse<TagCollection> localVarResp = getTagsWithHttpInfo(discountId, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Discount Tags
     * Retrieves all tags associated to a discount
     * @param discountId  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;TagCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TagCollection> getTagsWithHttpInfo(Integer discountId, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getTagsValidateBeforeCall(discountId, responseFields, null);
        Type localVarReturnType = new TypeToken<TagCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Discount Tags (asynchronously)
     * Retrieves all tags associated to a discount
     * @param discountId  (required)
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
    public okhttp3.Call getTagsAsync(Integer discountId, String responseFields, final ApiCallback<TagCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTagsValidateBeforeCall(discountId, responseFields, _callback);
        Type localVarReturnType = new TypeToken<TagCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateDiscount
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDiscount Properties of the discount to update.              Required properties: Content.Name, AmountType, StartDate, and Target.Type.              Any unspecified properties are set to null and boolean variables are set to false. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateDiscountCall(Integer discountId, String responseFields, CatalogAdminsDiscount catalogAdminsDiscount, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsDiscount;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/discounts/{discountId}"
            .replaceAll("\\{" + "discountId" + "\\}", localVarApiClient.escapeString(discountId.toString()));

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
    private okhttp3.Call updateDiscountValidateBeforeCall(Integer discountId, String responseFields, CatalogAdminsDiscount catalogAdminsDiscount, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'discountId' is set
        if (discountId == null) {
            throw new ApiException("Missing the required parameter 'discountId' when calling updateDiscount(Async)");
        }
        

        okhttp3.Call localVarCall = updateDiscountCall(discountId, responseFields, catalogAdminsDiscount, _callback);
        return localVarCall;

    }

    /**
     * Update Discount
     * Modifies a discount. This current version of the Discounts API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access discount data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDiscount Properties of the discount to update.              Required properties: Content.Name, AmountType, StartDate, and Target.Type.              Any unspecified properties are set to null and boolean variables are set to false. (optional)
     * @return CatalogAdminsDiscount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsDiscount updateDiscount(Integer discountId, String responseFields, CatalogAdminsDiscount catalogAdminsDiscount) throws ApiException {
        ApiResponse<CatalogAdminsDiscount> localVarResp = updateDiscountWithHttpInfo(discountId, responseFields, catalogAdminsDiscount);
        return localVarResp.getData();
    }

    /**
     * Update Discount
     * Modifies a discount. This current version of the Discounts API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access discount data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDiscount Properties of the discount to update.              Required properties: Content.Name, AmountType, StartDate, and Target.Type.              Any unspecified properties are set to null and boolean variables are set to false. (optional)
     * @return ApiResponse&lt;CatalogAdminsDiscount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsDiscount> updateDiscountWithHttpInfo(Integer discountId, String responseFields, CatalogAdminsDiscount catalogAdminsDiscount) throws ApiException {
        okhttp3.Call localVarCall = updateDiscountValidateBeforeCall(discountId, responseFields, catalogAdminsDiscount, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsDiscount>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Discount (asynchronously)
     * Modifies a discount. This current version of the Discounts API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access discount data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDiscount Properties of the discount to update.              Required properties: Content.Name, AmountType, StartDate, and Target.Type.              Any unspecified properties are set to null and boolean variables are set to false. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateDiscountAsync(Integer discountId, String responseFields, CatalogAdminsDiscount catalogAdminsDiscount, final ApiCallback<CatalogAdminsDiscount> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateDiscountValidateBeforeCall(discountId, responseFields, catalogAdminsDiscount, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsDiscount>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateDiscountContent
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param discountLocalizedContent New Name and/or LocaleCode. Properties of the content to update. Required property: Name. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateDiscountContentCall(Integer discountId, String responseFields, DiscountLocalizedContent discountLocalizedContent, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = discountLocalizedContent;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/discounts/{discountId}/content"
            .replaceAll("\\{" + "discountId" + "\\}", localVarApiClient.escapeString(discountId.toString()));

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
    private okhttp3.Call updateDiscountContentValidateBeforeCall(Integer discountId, String responseFields, DiscountLocalizedContent discountLocalizedContent, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'discountId' is set
        if (discountId == null) {
            throw new ApiException("Missing the required parameter 'discountId' when calling updateDiscountContent(Async)");
        }
        

        okhttp3.Call localVarCall = updateDiscountContentCall(discountId, responseFields, discountLocalizedContent, _callback);
        return localVarCall;

    }

    /**
     * Update Discount Content
     * Modifies the localized content for the specified discount. Allows you to rename the discount without modifying any other discount properties.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param discountLocalizedContent New Name and/or LocaleCode. Properties of the content to update. Required property: Name. (optional)
     * @return DiscountLocalizedContent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public DiscountLocalizedContent updateDiscountContent(Integer discountId, String responseFields, DiscountLocalizedContent discountLocalizedContent) throws ApiException {
        ApiResponse<DiscountLocalizedContent> localVarResp = updateDiscountContentWithHttpInfo(discountId, responseFields, discountLocalizedContent);
        return localVarResp.getData();
    }

    /**
     * Update Discount Content
     * Modifies the localized content for the specified discount. Allows you to rename the discount without modifying any other discount properties.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param discountLocalizedContent New Name and/or LocaleCode. Properties of the content to update. Required property: Name. (optional)
     * @return ApiResponse&lt;DiscountLocalizedContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DiscountLocalizedContent> updateDiscountContentWithHttpInfo(Integer discountId, String responseFields, DiscountLocalizedContent discountLocalizedContent) throws ApiException {
        okhttp3.Call localVarCall = updateDiscountContentValidateBeforeCall(discountId, responseFields, discountLocalizedContent, null);
        Type localVarReturnType = new TypeToken<DiscountLocalizedContent>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Discount Content (asynchronously)
     * Modifies the localized content for the specified discount. Allows you to rename the discount without modifying any other discount properties.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param discountLocalizedContent New Name and/or LocaleCode. Properties of the content to update. Required property: Name. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateDiscountContentAsync(Integer discountId, String responseFields, DiscountLocalizedContent discountLocalizedContent, final ApiCallback<DiscountLocalizedContent> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateDiscountContentValidateBeforeCall(discountId, responseFields, discountLocalizedContent, _callback);
        Type localVarReturnType = new TypeToken<DiscountLocalizedContent>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateDiscountTags
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param discountTag  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateDiscountTagsCall(String responseFields, List<DiscountTag> discountTag, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = discountTag;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/discounts/tags";

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
    private okhttp3.Call updateDiscountTagsValidateBeforeCall(String responseFields, List<DiscountTag> discountTag, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = updateDiscountTagsCall(responseFields, discountTag, _callback);
        return localVarCall;

    }

    /**
     * Update Discount Tags
     * Modifies tags of the discount. The original tags are overwritten.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param discountTag  (optional)
     * @return DiscountTagCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public DiscountTagCollection updateDiscountTags(String responseFields, List<DiscountTag> discountTag) throws ApiException {
        ApiResponse<DiscountTagCollection> localVarResp = updateDiscountTagsWithHttpInfo(responseFields, discountTag);
        return localVarResp.getData();
    }

    /**
     * Update Discount Tags
     * Modifies tags of the discount. The original tags are overwritten.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param discountTag  (optional)
     * @return ApiResponse&lt;DiscountTagCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DiscountTagCollection> updateDiscountTagsWithHttpInfo(String responseFields, List<DiscountTag> discountTag) throws ApiException {
        okhttp3.Call localVarCall = updateDiscountTagsValidateBeforeCall(responseFields, discountTag, null);
        Type localVarReturnType = new TypeToken<DiscountTagCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Discount Tags (asynchronously)
     * Modifies tags of the discount. The original tags are overwritten.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param discountTag  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateDiscountTagsAsync(String responseFields, List<DiscountTag> discountTag, final ApiCallback<DiscountTagCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateDiscountTagsValidateBeforeCall(responseFields, discountTag, _callback);
        Type localVarReturnType = new TypeToken<DiscountTagCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateDiscountTarget
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDiscountTarget Properties of the discount target to modify.              Required properties: Target.Type. Any unspecified properties are set to null and boolean variables to false. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateDiscountTargetCall(Integer discountId, String responseFields, CatalogAdminsDiscountTarget catalogAdminsDiscountTarget, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsDiscountTarget;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/discounts/{discountId}/target"
            .replaceAll("\\{" + "discountId" + "\\}", localVarApiClient.escapeString(discountId.toString()));

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
    private okhttp3.Call updateDiscountTargetValidateBeforeCall(Integer discountId, String responseFields, CatalogAdminsDiscountTarget catalogAdminsDiscountTarget, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'discountId' is set
        if (discountId == null) {
            throw new ApiException("Missing the required parameter 'discountId' when calling updateDiscountTarget(Async)");
        }
        

        okhttp3.Call localVarCall = updateDiscountTargetCall(discountId, responseFields, catalogAdminsDiscountTarget, _callback);
        return localVarCall;

    }

    /**
     * Update Discount Target
     * Modifies properties of the discount target, for example, the dollar amount, or percentage off the price.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDiscountTarget Properties of the discount target to modify.              Required properties: Target.Type. Any unspecified properties are set to null and boolean variables to false. (optional)
     * @return CatalogAdminsDiscountTarget
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsDiscountTarget updateDiscountTarget(Integer discountId, String responseFields, CatalogAdminsDiscountTarget catalogAdminsDiscountTarget) throws ApiException {
        ApiResponse<CatalogAdminsDiscountTarget> localVarResp = updateDiscountTargetWithHttpInfo(discountId, responseFields, catalogAdminsDiscountTarget);
        return localVarResp.getData();
    }

    /**
     * Update Discount Target
     * Modifies properties of the discount target, for example, the dollar amount, or percentage off the price.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDiscountTarget Properties of the discount target to modify.              Required properties: Target.Type. Any unspecified properties are set to null and boolean variables to false. (optional)
     * @return ApiResponse&lt;CatalogAdminsDiscountTarget&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsDiscountTarget> updateDiscountTargetWithHttpInfo(Integer discountId, String responseFields, CatalogAdminsDiscountTarget catalogAdminsDiscountTarget) throws ApiException {
        okhttp3.Call localVarCall = updateDiscountTargetValidateBeforeCall(discountId, responseFields, catalogAdminsDiscountTarget, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsDiscountTarget>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Discount Target (asynchronously)
     * Modifies properties of the discount target, for example, the dollar amount, or percentage off the price.
     * @param discountId Unique identifier of the discount. System-supplied and read-only. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDiscountTarget Properties of the discount target to modify.              Required properties: Target.Type. Any unspecified properties are set to null and boolean variables to false. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateDiscountTargetAsync(Integer discountId, String responseFields, CatalogAdminsDiscountTarget catalogAdminsDiscountTarget, final ApiCallback<CatalogAdminsDiscountTarget> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateDiscountTargetValidateBeforeCall(discountId, responseFields, catalogAdminsDiscountTarget, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsDiscountTarget>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for validateDiscountExpression
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDiscount  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateDiscountExpressionCall(String responseFields, CatalogAdminsDiscount catalogAdminsDiscount, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsDiscount;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/discounts/expressions/validate";

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
    private okhttp3.Call validateDiscountExpressionValidateBeforeCall(String responseFields, CatalogAdminsDiscount catalogAdminsDiscount, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = validateDiscountExpressionCall(responseFields, catalogAdminsDiscount, _callback);
        return localVarCall;

    }

    /**
     * Validate Discount Expression
     * Validate a discount expression.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDiscount  (optional)
     * @return ExpressionValidationResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ExpressionValidationResult validateDiscountExpression(String responseFields, CatalogAdminsDiscount catalogAdminsDiscount) throws ApiException {
        ApiResponse<ExpressionValidationResult> localVarResp = validateDiscountExpressionWithHttpInfo(responseFields, catalogAdminsDiscount);
        return localVarResp.getData();
    }

    /**
     * Validate Discount Expression
     * Validate a discount expression.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDiscount  (optional)
     * @return ApiResponse&lt;ExpressionValidationResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ExpressionValidationResult> validateDiscountExpressionWithHttpInfo(String responseFields, CatalogAdminsDiscount catalogAdminsDiscount) throws ApiException {
        okhttp3.Call localVarCall = validateDiscountExpressionValidateBeforeCall(responseFields, catalogAdminsDiscount, null);
        Type localVarReturnType = new TypeToken<ExpressionValidationResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Validate Discount Expression (asynchronously)
     * Validate a discount expression.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsDiscount  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateDiscountExpressionAsync(String responseFields, CatalogAdminsDiscount catalogAdminsDiscount, final ApiCallback<ExpressionValidationResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = validateDiscountExpressionValidateBeforeCall(responseFields, catalogAdminsDiscount, _callback);
        Type localVarReturnType = new TypeToken<ExpressionValidationResult>(){}.getType();
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
        public DiscountsApi build() {
            return new DiscountsApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
