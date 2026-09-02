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


import com.kibocommerce.sdk.catalogadministration.models.ProductExtra;
import com.kibocommerce.sdk.catalogadministration.models.ProductExtraValueDeltaPrice;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ProductExtrasApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public ProductExtrasApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductExtrasApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public ProductExtrasApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public ProductExtrasApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public ProductExtrasApi(Builder builder) {
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
     * Build call for addExtra
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtra  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addExtraCall(String productCode, String responseFields, ProductExtra productExtra, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productExtra;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Extras"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()));

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
    private okhttp3.Call addExtraValidateBeforeCall(String productCode, String responseFields, ProductExtra productExtra, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling addExtra(Async)");
        }
        

        okhttp3.Call localVarCall = addExtraCall(productCode, responseFields, productExtra, _callback);
        return localVarCall;

    }

    /**
     * Add Product Extra
     * Add extra. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtra  (optional)
     * @return ProductExtra
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductExtra addExtra(String productCode, String responseFields, ProductExtra productExtra) throws ApiException {
        ApiResponse<ProductExtra> localVarResp = addExtraWithHttpInfo(productCode, responseFields, productExtra);
        return localVarResp.getData();
    }

    /**
     * Add Product Extra
     * Add extra. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtra  (optional)
     * @return ApiResponse&lt;ProductExtra&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductExtra> addExtraWithHttpInfo(String productCode, String responseFields, ProductExtra productExtra) throws ApiException {
        okhttp3.Call localVarCall = addExtraValidateBeforeCall(productCode, responseFields, productExtra, null);
        Type localVarReturnType = new TypeToken<ProductExtra>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Product Extra (asynchronously)
     * Add extra. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtra  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addExtraAsync(String productCode, String responseFields, ProductExtra productExtra, final ApiCallback<ProductExtra> _callback) throws ApiException {

        okhttp3.Call localVarCall = addExtraValidateBeforeCall(productCode, responseFields, productExtra, _callback);
        Type localVarReturnType = new TypeToken<ProductExtra>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addExtraValueLocalizedDeltaPrice
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtraValueDeltaPrice  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addExtraValueLocalizedDeltaPriceCall(String productCode, String attributeFQN, String value, String responseFields, ProductExtraValueDeltaPrice productExtraValueDeltaPrice, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productExtraValueDeltaPrice;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "value" + "\\}", localVarApiClient.escapeString(value.toString()));

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
    private okhttp3.Call addExtraValueLocalizedDeltaPriceValidateBeforeCall(String productCode, String attributeFQN, String value, String responseFields, ProductExtraValueDeltaPrice productExtraValueDeltaPrice, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling addExtraValueLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling addExtraValueLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling addExtraValueLocalizedDeltaPrice(Async)");
        }
        

        okhttp3.Call localVarCall = addExtraValueLocalizedDeltaPriceCall(productCode, attributeFQN, value, responseFields, productExtraValueDeltaPrice, _callback);
        return localVarCall;

    }

    /**
     * Add Extra Localized Delta Price
     * Add a extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtraValueDeltaPrice  (optional)
     * @return ProductExtraValueDeltaPrice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductExtraValueDeltaPrice addExtraValueLocalizedDeltaPrice(String productCode, String attributeFQN, String value, String responseFields, ProductExtraValueDeltaPrice productExtraValueDeltaPrice) throws ApiException {
        ApiResponse<ProductExtraValueDeltaPrice> localVarResp = addExtraValueLocalizedDeltaPriceWithHttpInfo(productCode, attributeFQN, value, responseFields, productExtraValueDeltaPrice);
        return localVarResp.getData();
    }

    /**
     * Add Extra Localized Delta Price
     * Add a extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtraValueDeltaPrice  (optional)
     * @return ApiResponse&lt;ProductExtraValueDeltaPrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductExtraValueDeltaPrice> addExtraValueLocalizedDeltaPriceWithHttpInfo(String productCode, String attributeFQN, String value, String responseFields, ProductExtraValueDeltaPrice productExtraValueDeltaPrice) throws ApiException {
        okhttp3.Call localVarCall = addExtraValueLocalizedDeltaPriceValidateBeforeCall(productCode, attributeFQN, value, responseFields, productExtraValueDeltaPrice, null);
        Type localVarReturnType = new TypeToken<ProductExtraValueDeltaPrice>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Extra Localized Delta Price (asynchronously)
     * Add a extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtraValueDeltaPrice  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addExtraValueLocalizedDeltaPriceAsync(String productCode, String attributeFQN, String value, String responseFields, ProductExtraValueDeltaPrice productExtraValueDeltaPrice, final ApiCallback<ProductExtraValueDeltaPrice> _callback) throws ApiException {

        okhttp3.Call localVarCall = addExtraValueLocalizedDeltaPriceValidateBeforeCall(productCode, attributeFQN, value, responseFields, productExtraValueDeltaPrice, _callback);
        Type localVarReturnType = new TypeToken<ProductExtraValueDeltaPrice>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteExtra
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteExtraCall(String productCode, String attributeFQN, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

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
    private okhttp3.Call deleteExtraValidateBeforeCall(String productCode, String attributeFQN, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling deleteExtra(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling deleteExtra(Async)");
        }
        

        okhttp3.Call localVarCall = deleteExtraCall(productCode, attributeFQN, _callback);
        return localVarCall;

    }

    /**
     * Delete Product Extra
     * Delete extra
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteExtra(String productCode, String attributeFQN) throws ApiException {
        deleteExtraWithHttpInfo(productCode, attributeFQN);
    }

    /**
     * Delete Product Extra
     * Delete extra
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteExtraWithHttpInfo(String productCode, String attributeFQN) throws ApiException {
        okhttp3.Call localVarCall = deleteExtraValidateBeforeCall(productCode, attributeFQN, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Product Extra (asynchronously)
     * Delete extra
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteExtraAsync(String productCode, String attributeFQN, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteExtraValidateBeforeCall(productCode, attributeFQN, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteExtraValueLocalizedDeltaPrice
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param currencyCode  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteExtraValueLocalizedDeltaPriceCall(String productCode, String attributeFQN, String value, String currencyCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice/{currencyCode}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "value" + "\\}", localVarApiClient.escapeString(value.toString()))
            .replaceAll("\\{" + "currencyCode" + "\\}", localVarApiClient.escapeString(currencyCode.toString()));

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
    private okhttp3.Call deleteExtraValueLocalizedDeltaPriceValidateBeforeCall(String productCode, String attributeFQN, String value, String currencyCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling deleteExtraValueLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling deleteExtraValueLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling deleteExtraValueLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling deleteExtraValueLocalizedDeltaPrice(Async)");
        }
        

        okhttp3.Call localVarCall = deleteExtraValueLocalizedDeltaPriceCall(productCode, attributeFQN, value, currencyCode, _callback);
        return localVarCall;

    }

    /**
     * Delete Extra Localized Delta Price
     * Delete extra value localized delta price.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param currencyCode  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteExtraValueLocalizedDeltaPrice(String productCode, String attributeFQN, String value, String currencyCode) throws ApiException {
        deleteExtraValueLocalizedDeltaPriceWithHttpInfo(productCode, attributeFQN, value, currencyCode);
    }

    /**
     * Delete Extra Localized Delta Price
     * Delete extra value localized delta price.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param currencyCode  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteExtraValueLocalizedDeltaPriceWithHttpInfo(String productCode, String attributeFQN, String value, String currencyCode) throws ApiException {
        okhttp3.Call localVarCall = deleteExtraValueLocalizedDeltaPriceValidateBeforeCall(productCode, attributeFQN, value, currencyCode, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Extra Localized Delta Price (asynchronously)
     * Delete extra value localized delta price.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param currencyCode  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteExtraValueLocalizedDeltaPriceAsync(String productCode, String attributeFQN, String value, String currencyCode, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteExtraValueLocalizedDeltaPriceValidateBeforeCall(productCode, attributeFQN, value, currencyCode, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getExtra
     * @param productCode  (required)
     * @param attributeFQN  (required)
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
    public okhttp3.Call getExtraCall(String productCode, String attributeFQN, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

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
    private okhttp3.Call getExtraValidateBeforeCall(String productCode, String attributeFQN, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getExtra(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getExtra(Async)");
        }
        

        okhttp3.Call localVarCall = getExtraCall(productCode, attributeFQN, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Extra
     * Get individual extra. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ProductExtra
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductExtra getExtra(String productCode, String attributeFQN, String responseFields) throws ApiException {
        ApiResponse<ProductExtra> localVarResp = getExtraWithHttpInfo(productCode, attributeFQN, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Extra
     * Get individual extra. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;ProductExtra&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductExtra> getExtraWithHttpInfo(String productCode, String attributeFQN, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getExtraValidateBeforeCall(productCode, attributeFQN, responseFields, null);
        Type localVarReturnType = new TypeToken<ProductExtra>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Extra (asynchronously)
     * Get individual extra. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
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
    public okhttp3.Call getExtraAsync(String productCode, String attributeFQN, String responseFields, final ApiCallback<ProductExtra> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExtraValidateBeforeCall(productCode, attributeFQN, responseFields, _callback);
        Type localVarReturnType = new TypeToken<ProductExtra>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getExtraValueLocalizedDeltaPrice
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param currencyCode  (required)
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
    public okhttp3.Call getExtraValueLocalizedDeltaPriceCall(String productCode, String attributeFQN, String value, String currencyCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice/{currencyCode}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "value" + "\\}", localVarApiClient.escapeString(value.toString()))
            .replaceAll("\\{" + "currencyCode" + "\\}", localVarApiClient.escapeString(currencyCode.toString()));

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
    private okhttp3.Call getExtraValueLocalizedDeltaPriceValidateBeforeCall(String productCode, String attributeFQN, String value, String currencyCode, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getExtraValueLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getExtraValueLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling getExtraValueLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling getExtraValueLocalizedDeltaPrice(Async)");
        }
        

        okhttp3.Call localVarCall = getExtraValueLocalizedDeltaPriceCall(productCode, attributeFQN, value, currencyCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Extra Localized Delta Price by Currency
     * Get extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ProductExtraValueDeltaPrice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductExtraValueDeltaPrice getExtraValueLocalizedDeltaPrice(String productCode, String attributeFQN, String value, String currencyCode, String responseFields) throws ApiException {
        ApiResponse<ProductExtraValueDeltaPrice> localVarResp = getExtraValueLocalizedDeltaPriceWithHttpInfo(productCode, attributeFQN, value, currencyCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Extra Localized Delta Price by Currency
     * Get extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;ProductExtraValueDeltaPrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductExtraValueDeltaPrice> getExtraValueLocalizedDeltaPriceWithHttpInfo(String productCode, String attributeFQN, String value, String currencyCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getExtraValueLocalizedDeltaPriceValidateBeforeCall(productCode, attributeFQN, value, currencyCode, responseFields, null);
        Type localVarReturnType = new TypeToken<ProductExtraValueDeltaPrice>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Extra Localized Delta Price by Currency (asynchronously)
     * Get extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param currencyCode  (required)
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
    public okhttp3.Call getExtraValueLocalizedDeltaPriceAsync(String productCode, String attributeFQN, String value, String currencyCode, String responseFields, final ApiCallback<ProductExtraValueDeltaPrice> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExtraValueLocalizedDeltaPriceValidateBeforeCall(productCode, attributeFQN, value, currencyCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<ProductExtraValueDeltaPrice>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getExtraValueLocalizedDeltaPrices
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
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
    public okhttp3.Call getExtraValueLocalizedDeltaPricesCall(String productCode, String attributeFQN, String value, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "value" + "\\}", localVarApiClient.escapeString(value.toString()));

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
    private okhttp3.Call getExtraValueLocalizedDeltaPricesValidateBeforeCall(String productCode, String attributeFQN, String value, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getExtraValueLocalizedDeltaPrices(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getExtraValueLocalizedDeltaPrices(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling getExtraValueLocalizedDeltaPrices(Async)");
        }
        

        okhttp3.Call localVarCall = getExtraValueLocalizedDeltaPricesCall(productCode, attributeFQN, value, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Extra Localized Delta Price
     * Get extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return List&lt;ProductExtraValueDeltaPrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ProductExtraValueDeltaPrice> getExtraValueLocalizedDeltaPrices(String productCode, String attributeFQN, String value, String responseFields) throws ApiException {
        ApiResponse<List<ProductExtraValueDeltaPrice>> localVarResp = getExtraValueLocalizedDeltaPricesWithHttpInfo(productCode, attributeFQN, value, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Extra Localized Delta Price
     * Get extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;List&lt;ProductExtraValueDeltaPrice&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ProductExtraValueDeltaPrice>> getExtraValueLocalizedDeltaPricesWithHttpInfo(String productCode, String attributeFQN, String value, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getExtraValueLocalizedDeltaPricesValidateBeforeCall(productCode, attributeFQN, value, responseFields, null);
        Type localVarReturnType = new TypeToken<List<ProductExtraValueDeltaPrice>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Extra Localized Delta Price (asynchronously)
     * Get extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
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
    public okhttp3.Call getExtraValueLocalizedDeltaPricesAsync(String productCode, String attributeFQN, String value, String responseFields, final ApiCallback<List<ProductExtraValueDeltaPrice>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExtraValueLocalizedDeltaPricesValidateBeforeCall(productCode, attributeFQN, value, responseFields, _callback);
        Type localVarReturnType = new TypeToken<List<ProductExtraValueDeltaPrice>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getExtras
     * @param productCode  (required)
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
    public okhttp3.Call getExtrasCall(String productCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Extras"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()));

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
    private okhttp3.Call getExtrasValidateBeforeCall(String productCode, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling getExtras(Async)");
        }
        

        okhttp3.Call localVarCall = getExtrasCall(productCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Extras
     * Get extras for the product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return List&lt;ProductExtra&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ProductExtra> getExtras(String productCode, String responseFields) throws ApiException {
        ApiResponse<List<ProductExtra>> localVarResp = getExtrasWithHttpInfo(productCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Extras
     * Get extras for the product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;List&lt;ProductExtra&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ProductExtra>> getExtrasWithHttpInfo(String productCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getExtrasValidateBeforeCall(productCode, responseFields, null);
        Type localVarReturnType = new TypeToken<List<ProductExtra>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Extras (asynchronously)
     * Get extras for the product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
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
    public okhttp3.Call getExtrasAsync(String productCode, String responseFields, final ApiCallback<List<ProductExtra>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExtrasValidateBeforeCall(productCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<List<ProductExtra>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateExtra
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtra  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateExtraCall(String productCode, String attributeFQN, String responseFields, ProductExtra productExtra, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productExtra;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

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
    private okhttp3.Call updateExtraValidateBeforeCall(String productCode, String attributeFQN, String responseFields, ProductExtra productExtra, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updateExtra(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updateExtra(Async)");
        }
        

        okhttp3.Call localVarCall = updateExtraCall(productCode, attributeFQN, responseFields, productExtra, _callback);
        return localVarCall;

    }

    /**
     * Update Product Extra
     * Update extra. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtra  (optional)
     * @return ProductExtra
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductExtra updateExtra(String productCode, String attributeFQN, String responseFields, ProductExtra productExtra) throws ApiException {
        ApiResponse<ProductExtra> localVarResp = updateExtraWithHttpInfo(productCode, attributeFQN, responseFields, productExtra);
        return localVarResp.getData();
    }

    /**
     * Update Product Extra
     * Update extra. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtra  (optional)
     * @return ApiResponse&lt;ProductExtra&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductExtra> updateExtraWithHttpInfo(String productCode, String attributeFQN, String responseFields, ProductExtra productExtra) throws ApiException {
        okhttp3.Call localVarCall = updateExtraValidateBeforeCall(productCode, attributeFQN, responseFields, productExtra, null);
        Type localVarReturnType = new TypeToken<ProductExtra>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product Extra (asynchronously)
     * Update extra. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtra  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateExtraAsync(String productCode, String attributeFQN, String responseFields, ProductExtra productExtra, final ApiCallback<ProductExtra> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateExtraValidateBeforeCall(productCode, attributeFQN, responseFields, productExtra, _callback);
        Type localVarReturnType = new TypeToken<ProductExtra>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateExtraValueLocalizedDeltaPrice
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtraValueDeltaPrice  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateExtraValueLocalizedDeltaPriceCall(String productCode, String attributeFQN, String value, String currencyCode, String responseFields, ProductExtraValueDeltaPrice productExtraValueDeltaPrice, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productExtraValueDeltaPrice;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice/{currencyCode}"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "value" + "\\}", localVarApiClient.escapeString(value.toString()))
            .replaceAll("\\{" + "currencyCode" + "\\}", localVarApiClient.escapeString(currencyCode.toString()));

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
    private okhttp3.Call updateExtraValueLocalizedDeltaPriceValidateBeforeCall(String productCode, String attributeFQN, String value, String currencyCode, String responseFields, ProductExtraValueDeltaPrice productExtraValueDeltaPrice, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updateExtraValueLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updateExtraValueLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling updateExtraValueLocalizedDeltaPrice(Async)");
        }
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling updateExtraValueLocalizedDeltaPrice(Async)");
        }
        

        okhttp3.Call localVarCall = updateExtraValueLocalizedDeltaPriceCall(productCode, attributeFQN, value, currencyCode, responseFields, productExtraValueDeltaPrice, _callback);
        return localVarCall;

    }

    /**
     * Update Extra Localized Delta Price by Currency
     * Update extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtraValueDeltaPrice  (optional)
     * @return ProductExtraValueDeltaPrice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductExtraValueDeltaPrice updateExtraValueLocalizedDeltaPrice(String productCode, String attributeFQN, String value, String currencyCode, String responseFields, ProductExtraValueDeltaPrice productExtraValueDeltaPrice) throws ApiException {
        ApiResponse<ProductExtraValueDeltaPrice> localVarResp = updateExtraValueLocalizedDeltaPriceWithHttpInfo(productCode, attributeFQN, value, currencyCode, responseFields, productExtraValueDeltaPrice);
        return localVarResp.getData();
    }

    /**
     * Update Extra Localized Delta Price by Currency
     * Update extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtraValueDeltaPrice  (optional)
     * @return ApiResponse&lt;ProductExtraValueDeltaPrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductExtraValueDeltaPrice> updateExtraValueLocalizedDeltaPriceWithHttpInfo(String productCode, String attributeFQN, String value, String currencyCode, String responseFields, ProductExtraValueDeltaPrice productExtraValueDeltaPrice) throws ApiException {
        okhttp3.Call localVarCall = updateExtraValueLocalizedDeltaPriceValidateBeforeCall(productCode, attributeFQN, value, currencyCode, responseFields, productExtraValueDeltaPrice, null);
        Type localVarReturnType = new TypeToken<ProductExtraValueDeltaPrice>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Extra Localized Delta Price by Currency (asynchronously)
     * Update extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param currencyCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtraValueDeltaPrice  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateExtraValueLocalizedDeltaPriceAsync(String productCode, String attributeFQN, String value, String currencyCode, String responseFields, ProductExtraValueDeltaPrice productExtraValueDeltaPrice, final ApiCallback<ProductExtraValueDeltaPrice> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateExtraValueLocalizedDeltaPriceValidateBeforeCall(productCode, attributeFQN, value, currencyCode, responseFields, productExtraValueDeltaPrice, _callback);
        Type localVarReturnType = new TypeToken<ProductExtraValueDeltaPrice>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateExtraValueLocalizedDeltaPrices
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtraValueDeltaPrice  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateExtraValueLocalizedDeltaPricesCall(String productCode, String attributeFQN, String value, String responseFields, List<ProductExtraValueDeltaPrice> productExtraValueDeltaPrice, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productExtraValueDeltaPrice;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice"
            .replaceAll("\\{" + "productCode" + "\\}", localVarApiClient.escapeString(productCode.toString()))
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "value" + "\\}", localVarApiClient.escapeString(value.toString()));

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
    private okhttp3.Call updateExtraValueLocalizedDeltaPricesValidateBeforeCall(String productCode, String attributeFQN, String value, String responseFields, List<ProductExtraValueDeltaPrice> productExtraValueDeltaPrice, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling updateExtraValueLocalizedDeltaPrices(Async)");
        }
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updateExtraValueLocalizedDeltaPrices(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling updateExtraValueLocalizedDeltaPrices(Async)");
        }
        

        okhttp3.Call localVarCall = updateExtraValueLocalizedDeltaPricesCall(productCode, attributeFQN, value, responseFields, productExtraValueDeltaPrice, _callback);
        return localVarCall;

    }

    /**
     * Update Extra Localized Delta Price
     * Update extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtraValueDeltaPrice  (optional)
     * @return List&lt;ProductExtraValueDeltaPrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ProductExtraValueDeltaPrice> updateExtraValueLocalizedDeltaPrices(String productCode, String attributeFQN, String value, String responseFields, List<ProductExtraValueDeltaPrice> productExtraValueDeltaPrice) throws ApiException {
        ApiResponse<List<ProductExtraValueDeltaPrice>> localVarResp = updateExtraValueLocalizedDeltaPricesWithHttpInfo(productCode, attributeFQN, value, responseFields, productExtraValueDeltaPrice);
        return localVarResp.getData();
    }

    /**
     * Update Extra Localized Delta Price
     * Update extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtraValueDeltaPrice  (optional)
     * @return ApiResponse&lt;List&lt;ProductExtraValueDeltaPrice&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ProductExtraValueDeltaPrice>> updateExtraValueLocalizedDeltaPricesWithHttpInfo(String productCode, String attributeFQN, String value, String responseFields, List<ProductExtraValueDeltaPrice> productExtraValueDeltaPrice) throws ApiException {
        okhttp3.Call localVarCall = updateExtraValueLocalizedDeltaPricesValidateBeforeCall(productCode, attributeFQN, value, responseFields, productExtraValueDeltaPrice, null);
        Type localVarReturnType = new TypeToken<List<ProductExtraValueDeltaPrice>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Extra Localized Delta Price (asynchronously)
     * Update extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param productCode  (required)
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param productExtraValueDeltaPrice  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateExtraValueLocalizedDeltaPricesAsync(String productCode, String attributeFQN, String value, String responseFields, List<ProductExtraValueDeltaPrice> productExtraValueDeltaPrice, final ApiCallback<List<ProductExtraValueDeltaPrice>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateExtraValueLocalizedDeltaPricesValidateBeforeCall(productCode, attributeFQN, value, responseFields, productExtraValueDeltaPrice, _callback);
        Type localVarReturnType = new TypeToken<List<ProductExtraValueDeltaPrice>>(){}.getType();
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
        public ProductExtrasApi build() {
            return new ProductExtrasApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
