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


import com.kibocommerce.sdk.catalogadministration.models.QuickEditChangeProductTypeActions;
import com.kibocommerce.sdk.catalogadministration.models.QuickEditChangeProductTypeResponse;
import com.kibocommerce.sdk.catalogadministration.models.QuickEditProductActions;
import com.kibocommerce.sdk.catalogadministration.models.QuickEditProductInCatalogActions;
import com.kibocommerce.sdk.catalogadministration.models.QuickEditProductPropertyActions;
import com.kibocommerce.sdk.catalogadministration.models.QuickEditResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ProductQuickEditApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public ProductQuickEditApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductQuickEditApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public ProductQuickEditApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public ProductQuickEditApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public ProductQuickEditApi(Builder builder) {
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
     * Build call for updateProductInCatalog
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param quickEditProductInCatalogActions Mozu.ProductAdmin.Contracts.QuickEditProductInCatalogActions (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductInCatalogCall(String responseFields, QuickEditProductInCatalogActions quickEditProductInCatalogActions, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = quickEditProductInCatalogActions;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/quickedit/products/productincatalog";

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
    private okhttp3.Call updateProductInCatalogValidateBeforeCall(String responseFields, QuickEditProductInCatalogActions quickEditProductInCatalogActions, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = updateProductInCatalogCall(responseFields, quickEditProductInCatalogActions, _callback);
        return localVarCall;

    }

    /**
     * Quick Edit Product in Catalog
     * Updates products in catalog through quick edit. Values will be     added, not replaced. The Quick Edit APIs are designed primarily for the Quick Edit UI. They are not advised for bulk product updates through a batch job. For efficiently updating your catalog through a batch job, use the Import Export APIs or the Catalog Administration APIs directly.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param quickEditProductInCatalogActions Mozu.ProductAdmin.Contracts.QuickEditProductInCatalogActions (optional)
     * @return QuickEditResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QuickEditResponse updateProductInCatalog(String responseFields, QuickEditProductInCatalogActions quickEditProductInCatalogActions) throws ApiException {
        ApiResponse<QuickEditResponse> localVarResp = updateProductInCatalogWithHttpInfo(responseFields, quickEditProductInCatalogActions);
        return localVarResp.getData();
    }

    /**
     * Quick Edit Product in Catalog
     * Updates products in catalog through quick edit. Values will be     added, not replaced. The Quick Edit APIs are designed primarily for the Quick Edit UI. They are not advised for bulk product updates through a batch job. For efficiently updating your catalog through a batch job, use the Import Export APIs or the Catalog Administration APIs directly.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param quickEditProductInCatalogActions Mozu.ProductAdmin.Contracts.QuickEditProductInCatalogActions (optional)
     * @return ApiResponse&lt;QuickEditResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QuickEditResponse> updateProductInCatalogWithHttpInfo(String responseFields, QuickEditProductInCatalogActions quickEditProductInCatalogActions) throws ApiException {
        okhttp3.Call localVarCall = updateProductInCatalogValidateBeforeCall(responseFields, quickEditProductInCatalogActions, null);
        Type localVarReturnType = new TypeToken<QuickEditResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Quick Edit Product in Catalog (asynchronously)
     * Updates products in catalog through quick edit. Values will be     added, not replaced. The Quick Edit APIs are designed primarily for the Quick Edit UI. They are not advised for bulk product updates through a batch job. For efficiently updating your catalog through a batch job, use the Import Export APIs or the Catalog Administration APIs directly.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param quickEditProductInCatalogActions Mozu.ProductAdmin.Contracts.QuickEditProductInCatalogActions (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductInCatalogAsync(String responseFields, QuickEditProductInCatalogActions quickEditProductInCatalogActions, final ApiCallback<QuickEditResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProductInCatalogValidateBeforeCall(responseFields, quickEditProductInCatalogActions, _callback);
        Type localVarReturnType = new TypeToken<QuickEditResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProductProperties
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param quickEditProductPropertyActions Mozu.ProductAdmin.Contracts.QuickEditProductPropertyActions (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductPropertiesCall(String responseFields, QuickEditProductPropertyActions quickEditProductPropertyActions, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = quickEditProductPropertyActions;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/quickedit/products/properties";

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
    private okhttp3.Call updateProductPropertiesValidateBeforeCall(String responseFields, QuickEditProductPropertyActions quickEditProductPropertyActions, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = updateProductPropertiesCall(responseFields, quickEditProductPropertyActions, _callback);
        return localVarCall;

    }

    /**
     * Quick Edit Properties
     * Updates product properties through quick edits. Values will be added, not replaced. The Quick Edit APIs are designed primarily for the Quick Edit UI. They are not advised for bulk product updates through a batch job. For efficiently updating your catalog through a batch job, use the Import Export APIs or the Catalog Administration APIs directly.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param quickEditProductPropertyActions Mozu.ProductAdmin.Contracts.QuickEditProductPropertyActions (optional)
     * @return QuickEditResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QuickEditResponse updateProductProperties(String responseFields, QuickEditProductPropertyActions quickEditProductPropertyActions) throws ApiException {
        ApiResponse<QuickEditResponse> localVarResp = updateProductPropertiesWithHttpInfo(responseFields, quickEditProductPropertyActions);
        return localVarResp.getData();
    }

    /**
     * Quick Edit Properties
     * Updates product properties through quick edits. Values will be added, not replaced. The Quick Edit APIs are designed primarily for the Quick Edit UI. They are not advised for bulk product updates through a batch job. For efficiently updating your catalog through a batch job, use the Import Export APIs or the Catalog Administration APIs directly.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param quickEditProductPropertyActions Mozu.ProductAdmin.Contracts.QuickEditProductPropertyActions (optional)
     * @return ApiResponse&lt;QuickEditResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QuickEditResponse> updateProductPropertiesWithHttpInfo(String responseFields, QuickEditProductPropertyActions quickEditProductPropertyActions) throws ApiException {
        okhttp3.Call localVarCall = updateProductPropertiesValidateBeforeCall(responseFields, quickEditProductPropertyActions, null);
        Type localVarReturnType = new TypeToken<QuickEditResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Quick Edit Properties (asynchronously)
     * Updates product properties through quick edits. Values will be added, not replaced. The Quick Edit APIs are designed primarily for the Quick Edit UI. They are not advised for bulk product updates through a batch job. For efficiently updating your catalog through a batch job, use the Import Export APIs or the Catalog Administration APIs directly.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param quickEditProductPropertyActions Mozu.ProductAdmin.Contracts.QuickEditProductPropertyActions (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductPropertiesAsync(String responseFields, QuickEditProductPropertyActions quickEditProductPropertyActions, final ApiCallback<QuickEditResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProductPropertiesValidateBeforeCall(responseFields, quickEditProductPropertyActions, _callback);
        Type localVarReturnType = new TypeToken<QuickEditResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProductType
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param quickEditChangeProductTypeActions Mozu.ProductAdmin.Contracts.QuickEditChangeProductTypeActions (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductTypeCall(String responseFields, QuickEditChangeProductTypeActions quickEditChangeProductTypeActions, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = quickEditChangeProductTypeActions;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/quickedit/products/producttype";

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
    private okhttp3.Call updateProductTypeValidateBeforeCall(String responseFields, QuickEditChangeProductTypeActions quickEditChangeProductTypeActions, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = updateProductTypeCall(responseFields, quickEditChangeProductTypeActions, _callback);
        return localVarCall;

    }

    /**
     * Endpoint used to apply updates for product type
     * Endpoint used to apply updates for product type
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param quickEditChangeProductTypeActions Mozu.ProductAdmin.Contracts.QuickEditChangeProductTypeActions (optional)
     * @return QuickEditChangeProductTypeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QuickEditChangeProductTypeResponse updateProductType(String responseFields, QuickEditChangeProductTypeActions quickEditChangeProductTypeActions) throws ApiException {
        ApiResponse<QuickEditChangeProductTypeResponse> localVarResp = updateProductTypeWithHttpInfo(responseFields, quickEditChangeProductTypeActions);
        return localVarResp.getData();
    }

    /**
     * Endpoint used to apply updates for product type
     * Endpoint used to apply updates for product type
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param quickEditChangeProductTypeActions Mozu.ProductAdmin.Contracts.QuickEditChangeProductTypeActions (optional)
     * @return ApiResponse&lt;QuickEditChangeProductTypeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QuickEditChangeProductTypeResponse> updateProductTypeWithHttpInfo(String responseFields, QuickEditChangeProductTypeActions quickEditChangeProductTypeActions) throws ApiException {
        okhttp3.Call localVarCall = updateProductTypeValidateBeforeCall(responseFields, quickEditChangeProductTypeActions, null);
        Type localVarReturnType = new TypeToken<QuickEditChangeProductTypeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Endpoint used to apply updates for product type (asynchronously)
     * Endpoint used to apply updates for product type
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param quickEditChangeProductTypeActions Mozu.ProductAdmin.Contracts.QuickEditChangeProductTypeActions (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductTypeAsync(String responseFields, QuickEditChangeProductTypeActions quickEditChangeProductTypeActions, final ApiCallback<QuickEditChangeProductTypeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProductTypeValidateBeforeCall(responseFields, quickEditChangeProductTypeActions, _callback);
        Type localVarReturnType = new TypeToken<QuickEditChangeProductTypeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProducts
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param quickEditProductActions  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductsCall(String responseFields, QuickEditProductActions quickEditProductActions, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = quickEditProductActions;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/quickedit/products";

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
    private okhttp3.Call updateProductsValidateBeforeCall(String responseFields, QuickEditProductActions quickEditProductActions, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = updateProductsCall(responseFields, quickEditProductActions, _callback);
        return localVarCall;

    }

    /**
     * Quick Edit Products
     * Applies top level product updates. The Quick Edit APIs are designed primarily for the Quick Edit UI. They are not advised for bulk product updates through a batch job. For efficiently updating your catalog through a batch job, use the Import Export APIs or the Catalog Administration APIs directly.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param quickEditProductActions  (optional)
     * @return QuickEditResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QuickEditResponse updateProducts(String responseFields, QuickEditProductActions quickEditProductActions) throws ApiException {
        ApiResponse<QuickEditResponse> localVarResp = updateProductsWithHttpInfo(responseFields, quickEditProductActions);
        return localVarResp.getData();
    }

    /**
     * Quick Edit Products
     * Applies top level product updates. The Quick Edit APIs are designed primarily for the Quick Edit UI. They are not advised for bulk product updates through a batch job. For efficiently updating your catalog through a batch job, use the Import Export APIs or the Catalog Administration APIs directly.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param quickEditProductActions  (optional)
     * @return ApiResponse&lt;QuickEditResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QuickEditResponse> updateProductsWithHttpInfo(String responseFields, QuickEditProductActions quickEditProductActions) throws ApiException {
        okhttp3.Call localVarCall = updateProductsValidateBeforeCall(responseFields, quickEditProductActions, null);
        Type localVarReturnType = new TypeToken<QuickEditResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Quick Edit Products (asynchronously)
     * Applies top level product updates. The Quick Edit APIs are designed primarily for the Quick Edit UI. They are not advised for bulk product updates through a batch job. For efficiently updating your catalog through a batch job, use the Import Export APIs or the Catalog Administration APIs directly.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param quickEditProductActions  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProductsAsync(String responseFields, QuickEditProductActions quickEditProductActions, final ApiCallback<QuickEditResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProductsValidateBeforeCall(responseFields, quickEditProductActions, _callback);
        Type localVarReturnType = new TypeToken<QuickEditResponse>(){}.getType();
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
        public ProductQuickEditApi build() {
            return new ProductQuickEditApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
