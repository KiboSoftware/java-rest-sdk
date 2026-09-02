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


import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsCurrencyExchangeRate;
import com.kibocommerce.sdk.catalogadministration.models.CurrencyExchangeRateCollection;
import com.kibocommerce.sdk.catalogadministration.models.CurrencyLocalization;
import com.kibocommerce.sdk.catalogadministration.models.CurrencyLocalizationCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CurrencyApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public CurrencyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CurrencyApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public CurrencyApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public CurrencyApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public CurrencyApi(Builder builder) {
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
     * Build call for addCurrencyExchangeRates
     * @param currencyCode Currency code (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCurrencyExchangeRate Exchange rates for the currency (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addCurrencyExchangeRatesCall(String currencyCode, String responseFields, List<CatalogAdminsCurrencyExchangeRate> catalogAdminsCurrencyExchangeRate, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsCurrencyExchangeRate;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/currency/{currencyCode}/exchangerates"
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
    private okhttp3.Call addCurrencyExchangeRatesValidateBeforeCall(String currencyCode, String responseFields, List<CatalogAdminsCurrencyExchangeRate> catalogAdminsCurrencyExchangeRate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling addCurrencyExchangeRates(Async)");
        }
        

        okhttp3.Call localVarCall = addCurrencyExchangeRatesCall(currencyCode, responseFields, catalogAdminsCurrencyExchangeRate, _callback);
        return localVarCall;

    }

    /**
     * Update Currency Exchange Rates
     * Updates the details of a currency localization.
     * @param currencyCode Currency code (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCurrencyExchangeRate Exchange rates for the currency (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void addCurrencyExchangeRates(String currencyCode, String responseFields, List<CatalogAdminsCurrencyExchangeRate> catalogAdminsCurrencyExchangeRate) throws ApiException {
        addCurrencyExchangeRatesWithHttpInfo(currencyCode, responseFields, catalogAdminsCurrencyExchangeRate);
    }

    /**
     * Update Currency Exchange Rates
     * Updates the details of a currency localization.
     * @param currencyCode Currency code (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCurrencyExchangeRate Exchange rates for the currency (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> addCurrencyExchangeRatesWithHttpInfo(String currencyCode, String responseFields, List<CatalogAdminsCurrencyExchangeRate> catalogAdminsCurrencyExchangeRate) throws ApiException {
        okhttp3.Call localVarCall = addCurrencyExchangeRatesValidateBeforeCall(currencyCode, responseFields, catalogAdminsCurrencyExchangeRate, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update Currency Exchange Rates (asynchronously)
     * Updates the details of a currency localization.
     * @param currencyCode Currency code (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCurrencyExchangeRate Exchange rates for the currency (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addCurrencyExchangeRatesAsync(String currencyCode, String responseFields, List<CatalogAdminsCurrencyExchangeRate> catalogAdminsCurrencyExchangeRate, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = addCurrencyExchangeRatesValidateBeforeCall(currencyCode, responseFields, catalogAdminsCurrencyExchangeRate, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for addCurrencyLocalization
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param currencyLocalization Properties of the currency-localization to create. Required properties: CurrencyCode (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addCurrencyLocalizationCall(String responseFields, CurrencyLocalization currencyLocalization, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = currencyLocalization;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/currency";

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
    private okhttp3.Call addCurrencyLocalizationValidateBeforeCall(String responseFields, CurrencyLocalization currencyLocalization, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = addCurrencyLocalizationCall(responseFields, currencyLocalization, _callback);
        return localVarCall;

    }

    /**
     * Add Currency Localization
     * Adds a new currency localization.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param currencyLocalization Properties of the currency-localization to create. Required properties: CurrencyCode (optional)
     * @return CurrencyLocalization
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CurrencyLocalization addCurrencyLocalization(String responseFields, CurrencyLocalization currencyLocalization) throws ApiException {
        ApiResponse<CurrencyLocalization> localVarResp = addCurrencyLocalizationWithHttpInfo(responseFields, currencyLocalization);
        return localVarResp.getData();
    }

    /**
     * Add Currency Localization
     * Adds a new currency localization.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param currencyLocalization Properties of the currency-localization to create. Required properties: CurrencyCode (optional)
     * @return ApiResponse&lt;CurrencyLocalization&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CurrencyLocalization> addCurrencyLocalizationWithHttpInfo(String responseFields, CurrencyLocalization currencyLocalization) throws ApiException {
        okhttp3.Call localVarCall = addCurrencyLocalizationValidateBeforeCall(responseFields, currencyLocalization, null);
        Type localVarReturnType = new TypeToken<CurrencyLocalization>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Currency Localization (asynchronously)
     * Adds a new currency localization.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param currencyLocalization Properties of the currency-localization to create. Required properties: CurrencyCode (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addCurrencyLocalizationAsync(String responseFields, CurrencyLocalization currencyLocalization, final ApiCallback<CurrencyLocalization> _callback) throws ApiException {

        okhttp3.Call localVarCall = addCurrencyLocalizationValidateBeforeCall(responseFields, currencyLocalization, _callback);
        Type localVarReturnType = new TypeToken<CurrencyLocalization>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCurrencyExchangeRate
     * @param currencyCode Currency code (required)
     * @param toCurrencyCode C (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCurrencyExchangeRateCall(String currencyCode, String toCurrencyCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/currency/{currencyCode}/exchangerates/{toCurrencyCode}"
            .replaceAll("\\{" + "currencyCode" + "\\}", localVarApiClient.escapeString(currencyCode.toString()))
            .replaceAll("\\{" + "toCurrencyCode" + "\\}", localVarApiClient.escapeString(toCurrencyCode.toString()));

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
    private okhttp3.Call deleteCurrencyExchangeRateValidateBeforeCall(String currencyCode, String toCurrencyCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling deleteCurrencyExchangeRate(Async)");
        }
        
        // verify the required parameter 'toCurrencyCode' is set
        if (toCurrencyCode == null) {
            throw new ApiException("Missing the required parameter 'toCurrencyCode' when calling deleteCurrencyExchangeRate(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCurrencyExchangeRateCall(currencyCode, toCurrencyCode, _callback);
        return localVarCall;

    }

    /**
     * Delete Currency Exchange Rate
     * Delete a single exchange rate for a specified currency code and target currency code.
     * @param currencyCode Currency code (required)
     * @param toCurrencyCode C (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteCurrencyExchangeRate(String currencyCode, String toCurrencyCode) throws ApiException {
        deleteCurrencyExchangeRateWithHttpInfo(currencyCode, toCurrencyCode);
    }

    /**
     * Delete Currency Exchange Rate
     * Delete a single exchange rate for a specified currency code and target currency code.
     * @param currencyCode Currency code (required)
     * @param toCurrencyCode C (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteCurrencyExchangeRateWithHttpInfo(String currencyCode, String toCurrencyCode) throws ApiException {
        okhttp3.Call localVarCall = deleteCurrencyExchangeRateValidateBeforeCall(currencyCode, toCurrencyCode, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Currency Exchange Rate (asynchronously)
     * Delete a single exchange rate for a specified currency code and target currency code.
     * @param currencyCode Currency code (required)
     * @param toCurrencyCode C (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCurrencyExchangeRateAsync(String currencyCode, String toCurrencyCode, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCurrencyExchangeRateValidateBeforeCall(currencyCode, toCurrencyCode, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCurrencyLocalization
     * @param currencyCode Currency code. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCurrencyLocalizationCall(String currencyCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/currency/{currencyCode}"
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
    private okhttp3.Call deleteCurrencyLocalizationValidateBeforeCall(String currencyCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling deleteCurrencyLocalization(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCurrencyLocalizationCall(currencyCode, _callback);
        return localVarCall;

    }

    /**
     * Delete Currency Localization
     * Deletes the currency localization specified by its currency code.
     * @param currencyCode Currency code. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteCurrencyLocalization(String currencyCode) throws ApiException {
        deleteCurrencyLocalizationWithHttpInfo(currencyCode);
    }

    /**
     * Delete Currency Localization
     * Deletes the currency localization specified by its currency code.
     * @param currencyCode Currency code. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteCurrencyLocalizationWithHttpInfo(String currencyCode) throws ApiException {
        okhttp3.Call localVarCall = deleteCurrencyLocalizationValidateBeforeCall(currencyCode, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Currency Localization (asynchronously)
     * Deletes the currency localization specified by its currency code.
     * @param currencyCode Currency code. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCurrencyLocalizationAsync(String currencyCode, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCurrencyLocalizationValidateBeforeCall(currencyCode, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCurrencyExchangeRate
     * @param currencyCode Currency code (required)
     * @param toCurrencyCode Target currency code (required)
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
    public okhttp3.Call getCurrencyExchangeRateCall(String currencyCode, String toCurrencyCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/currency/{currencyCode}/exchangerates/{toCurrencyCode}"
            .replaceAll("\\{" + "currencyCode" + "\\}", localVarApiClient.escapeString(currencyCode.toString()))
            .replaceAll("\\{" + "toCurrencyCode" + "\\}", localVarApiClient.escapeString(toCurrencyCode.toString()));

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
    private okhttp3.Call getCurrencyExchangeRateValidateBeforeCall(String currencyCode, String toCurrencyCode, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling getCurrencyExchangeRate(Async)");
        }
        
        // verify the required parameter 'toCurrencyCode' is set
        if (toCurrencyCode == null) {
            throw new ApiException("Missing the required parameter 'toCurrencyCode' when calling getCurrencyExchangeRate(Async)");
        }
        

        okhttp3.Call localVarCall = getCurrencyExchangeRateCall(currencyCode, toCurrencyCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Currency Exchange Rate
     * Retrieves a single exchange rate for a specified currency code and target currency code.
     * @param currencyCode Currency code (required)
     * @param toCurrencyCode Target currency code (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsCurrencyExchangeRate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsCurrencyExchangeRate getCurrencyExchangeRate(String currencyCode, String toCurrencyCode, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsCurrencyExchangeRate> localVarResp = getCurrencyExchangeRateWithHttpInfo(currencyCode, toCurrencyCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Currency Exchange Rate
     * Retrieves a single exchange rate for a specified currency code and target currency code.
     * @param currencyCode Currency code (required)
     * @param toCurrencyCode Target currency code (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsCurrencyExchangeRate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsCurrencyExchangeRate> getCurrencyExchangeRateWithHttpInfo(String currencyCode, String toCurrencyCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getCurrencyExchangeRateValidateBeforeCall(currencyCode, toCurrencyCode, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsCurrencyExchangeRate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Currency Exchange Rate (asynchronously)
     * Retrieves a single exchange rate for a specified currency code and target currency code.
     * @param currencyCode Currency code (required)
     * @param toCurrencyCode Target currency code (required)
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
    public okhttp3.Call getCurrencyExchangeRateAsync(String currencyCode, String toCurrencyCode, String responseFields, final ApiCallback<CatalogAdminsCurrencyExchangeRate> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCurrencyExchangeRateValidateBeforeCall(currencyCode, toCurrencyCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsCurrencyExchangeRate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCurrencyExchangeRates
     * @param currencyCode Currency code (required)
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
    public okhttp3.Call getCurrencyExchangeRatesCall(String currencyCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/currency/{currencyCode}/exchangerates"
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
    private okhttp3.Call getCurrencyExchangeRatesValidateBeforeCall(String currencyCode, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling getCurrencyExchangeRates(Async)");
        }
        

        okhttp3.Call localVarCall = getCurrencyExchangeRatesCall(currencyCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Currency Exchange Rates
     * Retrieves a list of exchange rates for a specified currency code and filter criteria.
     * @param currencyCode Currency code (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CurrencyExchangeRateCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CurrencyExchangeRateCollection getCurrencyExchangeRates(String currencyCode, String responseFields) throws ApiException {
        ApiResponse<CurrencyExchangeRateCollection> localVarResp = getCurrencyExchangeRatesWithHttpInfo(currencyCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Currency Exchange Rates
     * Retrieves a list of exchange rates for a specified currency code and filter criteria.
     * @param currencyCode Currency code (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CurrencyExchangeRateCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CurrencyExchangeRateCollection> getCurrencyExchangeRatesWithHttpInfo(String currencyCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getCurrencyExchangeRatesValidateBeforeCall(currencyCode, responseFields, null);
        Type localVarReturnType = new TypeToken<CurrencyExchangeRateCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Currency Exchange Rates (asynchronously)
     * Retrieves a list of exchange rates for a specified currency code and filter criteria.
     * @param currencyCode Currency code (required)
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
    public okhttp3.Call getCurrencyExchangeRatesAsync(String currencyCode, String responseFields, final ApiCallback<CurrencyExchangeRateCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCurrencyExchangeRatesValidateBeforeCall(currencyCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CurrencyExchangeRateCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCurrencyLocalization
     * @param currencyCode Currency code. (required)
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
    public okhttp3.Call getCurrencyLocalizationCall(String currencyCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/currency/{currencyCode}"
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
    private okhttp3.Call getCurrencyLocalizationValidateBeforeCall(String currencyCode, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling getCurrencyLocalization(Async)");
        }
        

        okhttp3.Call localVarCall = getCurrencyLocalizationCall(currencyCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Currency Localization
     * Gets a single currency localization.
     * @param currencyCode Currency code. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CurrencyLocalization
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CurrencyLocalization getCurrencyLocalization(String currencyCode, String responseFields) throws ApiException {
        ApiResponse<CurrencyLocalization> localVarResp = getCurrencyLocalizationWithHttpInfo(currencyCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Currency Localization
     * Gets a single currency localization.
     * @param currencyCode Currency code. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CurrencyLocalization&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CurrencyLocalization> getCurrencyLocalizationWithHttpInfo(String currencyCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getCurrencyLocalizationValidateBeforeCall(currencyCode, responseFields, null);
        Type localVarReturnType = new TypeToken<CurrencyLocalization>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Currency Localization (asynchronously)
     * Gets a single currency localization.
     * @param currencyCode Currency code. (required)
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
    public okhttp3.Call getCurrencyLocalizationAsync(String currencyCode, String responseFields, final ApiCallback<CurrencyLocalization> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCurrencyLocalizationValidateBeforeCall(currencyCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CurrencyLocalization>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCurrencyLocalizations
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
    public okhttp3.Call getCurrencyLocalizationsCall(String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/currency";

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
    private okhttp3.Call getCurrencyLocalizationsValidateBeforeCall(String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getCurrencyLocalizationsCall(responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Currency Localizations
     * Gets all currency localizations.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CurrencyLocalizationCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CurrencyLocalizationCollection getCurrencyLocalizations(String responseFields) throws ApiException {
        ApiResponse<CurrencyLocalizationCollection> localVarResp = getCurrencyLocalizationsWithHttpInfo(responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Currency Localizations
     * Gets all currency localizations.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CurrencyLocalizationCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CurrencyLocalizationCollection> getCurrencyLocalizationsWithHttpInfo(String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getCurrencyLocalizationsValidateBeforeCall(responseFields, null);
        Type localVarReturnType = new TypeToken<CurrencyLocalizationCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Currency Localizations (asynchronously)
     * Gets all currency localizations.
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
    public okhttp3.Call getCurrencyLocalizationsAsync(String responseFields, final ApiCallback<CurrencyLocalizationCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCurrencyLocalizationsValidateBeforeCall(responseFields, _callback);
        Type localVarReturnType = new TypeToken<CurrencyLocalizationCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateCurrencyExchangeRates
     * @param currencyCode Currency code (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCurrencyExchangeRate Exchange rates for the currency (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCurrencyExchangeRatesCall(String currencyCode, String responseFields, List<CatalogAdminsCurrencyExchangeRate> catalogAdminsCurrencyExchangeRate, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsCurrencyExchangeRate;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/currency/{currencyCode}/exchangerates"
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
    private okhttp3.Call updateCurrencyExchangeRatesValidateBeforeCall(String currencyCode, String responseFields, List<CatalogAdminsCurrencyExchangeRate> catalogAdminsCurrencyExchangeRate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling updateCurrencyExchangeRates(Async)");
        }
        

        okhttp3.Call localVarCall = updateCurrencyExchangeRatesCall(currencyCode, responseFields, catalogAdminsCurrencyExchangeRate, _callback);
        return localVarCall;

    }

    /**
     * Bulk Update Currency Exchange Rates
     * Update multiple exchange rates for a specified currency code.
     * @param currencyCode Currency code (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCurrencyExchangeRate Exchange rates for the currency (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void updateCurrencyExchangeRates(String currencyCode, String responseFields, List<CatalogAdminsCurrencyExchangeRate> catalogAdminsCurrencyExchangeRate) throws ApiException {
        updateCurrencyExchangeRatesWithHttpInfo(currencyCode, responseFields, catalogAdminsCurrencyExchangeRate);
    }

    /**
     * Bulk Update Currency Exchange Rates
     * Update multiple exchange rates for a specified currency code.
     * @param currencyCode Currency code (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCurrencyExchangeRate Exchange rates for the currency (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateCurrencyExchangeRatesWithHttpInfo(String currencyCode, String responseFields, List<CatalogAdminsCurrencyExchangeRate> catalogAdminsCurrencyExchangeRate) throws ApiException {
        okhttp3.Call localVarCall = updateCurrencyExchangeRatesValidateBeforeCall(currencyCode, responseFields, catalogAdminsCurrencyExchangeRate, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Bulk Update Currency Exchange Rates (asynchronously)
     * Update multiple exchange rates for a specified currency code.
     * @param currencyCode Currency code (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsCurrencyExchangeRate Exchange rates for the currency (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCurrencyExchangeRatesAsync(String currencyCode, String responseFields, List<CatalogAdminsCurrencyExchangeRate> catalogAdminsCurrencyExchangeRate, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateCurrencyExchangeRatesValidateBeforeCall(currencyCode, responseFields, catalogAdminsCurrencyExchangeRate, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateCurrencyLocalization
     * @param currencyCode Currency code. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param currencyLocalization Properties of the currency-localization to update. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCurrencyLocalizationCall(String currencyCode, String responseFields, CurrencyLocalization currencyLocalization, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = currencyLocalization;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/currency/{currencyCode}"
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
    private okhttp3.Call updateCurrencyLocalizationValidateBeforeCall(String currencyCode, String responseFields, CurrencyLocalization currencyLocalization, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling updateCurrencyLocalization(Async)");
        }
        

        okhttp3.Call localVarCall = updateCurrencyLocalizationCall(currencyCode, responseFields, currencyLocalization, _callback);
        return localVarCall;

    }

    /**
     * Update Currency Localization
     * Updates the details of a currency localization.
     * @param currencyCode Currency code. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param currencyLocalization Properties of the currency-localization to update. (optional)
     * @return CurrencyLocalization
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CurrencyLocalization updateCurrencyLocalization(String currencyCode, String responseFields, CurrencyLocalization currencyLocalization) throws ApiException {
        ApiResponse<CurrencyLocalization> localVarResp = updateCurrencyLocalizationWithHttpInfo(currencyCode, responseFields, currencyLocalization);
        return localVarResp.getData();
    }

    /**
     * Update Currency Localization
     * Updates the details of a currency localization.
     * @param currencyCode Currency code. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param currencyLocalization Properties of the currency-localization to update. (optional)
     * @return ApiResponse&lt;CurrencyLocalization&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CurrencyLocalization> updateCurrencyLocalizationWithHttpInfo(String currencyCode, String responseFields, CurrencyLocalization currencyLocalization) throws ApiException {
        okhttp3.Call localVarCall = updateCurrencyLocalizationValidateBeforeCall(currencyCode, responseFields, currencyLocalization, null);
        Type localVarReturnType = new TypeToken<CurrencyLocalization>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Currency Localization (asynchronously)
     * Updates the details of a currency localization.
     * @param currencyCode Currency code. (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param currencyLocalization Properties of the currency-localization to update. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCurrencyLocalizationAsync(String currencyCode, String responseFields, CurrencyLocalization currencyLocalization, final ApiCallback<CurrencyLocalization> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateCurrencyLocalizationValidateBeforeCall(currencyCode, responseFields, currencyLocalization, _callback);
        Type localVarReturnType = new TypeToken<CurrencyLocalization>(){}.getType();
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
        public CurrencyApi build() {
            return new CurrencyApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
