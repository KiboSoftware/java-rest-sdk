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


import com.kibocommerce.sdk.catalogadministration.models.AttributeTypeRuleCollection;
import com.kibocommerce.sdk.catalogadministration.models.AttributeVocabularyValueLocalizedContent;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsAttribute;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsAttributeCollection;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsAttributeLocalizedContent;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsAttributeVocabularyValue;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ProductAttributesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public ProductAttributesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductAttributesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public ProductAttributesApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public ProductAttributesApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public ProductAttributesApi(Builder builder) {
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
     * Build call for addAttribute
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttribute  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addAttributeCall(String responseFields, CatalogAdminsAttribute catalogAdminsAttribute, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsAttribute;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes";

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
    private okhttp3.Call addAttributeValidateBeforeCall(String responseFields, CatalogAdminsAttribute catalogAdminsAttribute, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = addAttributeCall(responseFields, catalogAdminsAttribute, _callback);
        return localVarCall;

    }

    /**
     * Add Product Attribute
     * Create a new attribute. The attribute name, attribute type, input type, and data type are required. This current version of the Attributes API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access attribute data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttribute  (optional)
     * @return CatalogAdminsAttribute
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsAttribute addAttribute(String responseFields, CatalogAdminsAttribute catalogAdminsAttribute) throws ApiException {
        ApiResponse<CatalogAdminsAttribute> localVarResp = addAttributeWithHttpInfo(responseFields, catalogAdminsAttribute);
        return localVarResp.getData();
    }

    /**
     * Add Product Attribute
     * Create a new attribute. The attribute name, attribute type, input type, and data type are required. This current version of the Attributes API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access attribute data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttribute  (optional)
     * @return ApiResponse&lt;CatalogAdminsAttribute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsAttribute> addAttributeWithHttpInfo(String responseFields, CatalogAdminsAttribute catalogAdminsAttribute) throws ApiException {
        okhttp3.Call localVarCall = addAttributeValidateBeforeCall(responseFields, catalogAdminsAttribute, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttribute>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Product Attribute (asynchronously)
     * Create a new attribute. The attribute name, attribute type, input type, and data type are required. This current version of the Attributes API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access attribute data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttribute  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addAttributeAsync(String responseFields, CatalogAdminsAttribute catalogAdminsAttribute, final ApiCallback<CatalogAdminsAttribute> _callback) throws ApiException {

        okhttp3.Call localVarCall = addAttributeValidateBeforeCall(responseFields, catalogAdminsAttribute, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttribute>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addAttributeVocabularyValue
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeVocabularyValue  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addAttributeVocabularyValueCall(String attributeFQN, String responseFields, CatalogAdminsAttributeVocabularyValue catalogAdminsAttributeVocabularyValue, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsAttributeVocabularyValue;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addAttributeVocabularyValueValidateBeforeCall(String attributeFQN, String responseFields, CatalogAdminsAttributeVocabularyValue catalogAdminsAttributeVocabularyValue, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling addAttributeVocabularyValue(Async)");
        }
        

        okhttp3.Call localVarCall = addAttributeVocabularyValueCall(attributeFQN, responseFields, catalogAdminsAttributeVocabularyValue, _callback);
        return localVarCall;

    }

    /**
     * Add Vocabulary Value
     * Creates product attribute vocabulary values
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeVocabularyValue  (optional)
     * @return CatalogAdminsAttributeVocabularyValue
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsAttributeVocabularyValue addAttributeVocabularyValue(String attributeFQN, String responseFields, CatalogAdminsAttributeVocabularyValue catalogAdminsAttributeVocabularyValue) throws ApiException {
        ApiResponse<CatalogAdminsAttributeVocabularyValue> localVarResp = addAttributeVocabularyValueWithHttpInfo(attributeFQN, responseFields, catalogAdminsAttributeVocabularyValue);
        return localVarResp.getData();
    }

    /**
     * Add Vocabulary Value
     * Creates product attribute vocabulary values
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeVocabularyValue  (optional)
     * @return ApiResponse&lt;CatalogAdminsAttributeVocabularyValue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsAttributeVocabularyValue> addAttributeVocabularyValueWithHttpInfo(String attributeFQN, String responseFields, CatalogAdminsAttributeVocabularyValue catalogAdminsAttributeVocabularyValue) throws ApiException {
        okhttp3.Call localVarCall = addAttributeVocabularyValueValidateBeforeCall(attributeFQN, responseFields, catalogAdminsAttributeVocabularyValue, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttributeVocabularyValue>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Vocabulary Value (asynchronously)
     * Creates product attribute vocabulary values
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeVocabularyValue  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addAttributeVocabularyValueAsync(String attributeFQN, String responseFields, CatalogAdminsAttributeVocabularyValue catalogAdminsAttributeVocabularyValue, final ApiCallback<CatalogAdminsAttributeVocabularyValue> _callback) throws ApiException {

        okhttp3.Call localVarCall = addAttributeVocabularyValueValidateBeforeCall(attributeFQN, responseFields, catalogAdminsAttributeVocabularyValue, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttributeVocabularyValue>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addAttributeVocabularyValueLocalizedContent
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeVocabularyValueLocalizedContent  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addAttributeVocabularyValueLocalizedContentCall(String attributeFQN, String value, String responseFields, AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = attributeVocabularyValueLocalizedContent;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent"
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
    private okhttp3.Call addAttributeVocabularyValueLocalizedContentValidateBeforeCall(String attributeFQN, String value, String responseFields, AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling addAttributeVocabularyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling addAttributeVocabularyValueLocalizedContent(Async)");
        }
        

        okhttp3.Call localVarCall = addAttributeVocabularyValueLocalizedContentCall(attributeFQN, value, responseFields, attributeVocabularyValueLocalizedContent, _callback);
        return localVarCall;

    }

    /**
     * Add Vocabulary Value Localized Content
     * Creates vocabulary value localized content
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeVocabularyValueLocalizedContent  (optional)
     * @return AttributeVocabularyValueLocalizedContent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AttributeVocabularyValueLocalizedContent addAttributeVocabularyValueLocalizedContent(String attributeFQN, String value, String responseFields, AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent) throws ApiException {
        ApiResponse<AttributeVocabularyValueLocalizedContent> localVarResp = addAttributeVocabularyValueLocalizedContentWithHttpInfo(attributeFQN, value, responseFields, attributeVocabularyValueLocalizedContent);
        return localVarResp.getData();
    }

    /**
     * Add Vocabulary Value Localized Content
     * Creates vocabulary value localized content
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeVocabularyValueLocalizedContent  (optional)
     * @return ApiResponse&lt;AttributeVocabularyValueLocalizedContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttributeVocabularyValueLocalizedContent> addAttributeVocabularyValueLocalizedContentWithHttpInfo(String attributeFQN, String value, String responseFields, AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent) throws ApiException {
        okhttp3.Call localVarCall = addAttributeVocabularyValueLocalizedContentValidateBeforeCall(attributeFQN, value, responseFields, attributeVocabularyValueLocalizedContent, null);
        Type localVarReturnType = new TypeToken<AttributeVocabularyValueLocalizedContent>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Vocabulary Value Localized Content (asynchronously)
     * Creates vocabulary value localized content
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeVocabularyValueLocalizedContent  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addAttributeVocabularyValueLocalizedContentAsync(String attributeFQN, String value, String responseFields, AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent, final ApiCallback<AttributeVocabularyValueLocalizedContent> _callback) throws ApiException {

        okhttp3.Call localVarCall = addAttributeVocabularyValueLocalizedContentValidateBeforeCall(attributeFQN, value, responseFields, attributeVocabularyValueLocalizedContent, _callback);
        Type localVarReturnType = new TypeToken<AttributeVocabularyValueLocalizedContent>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addLocalizedContent
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeLocalizedContent  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addLocalizedContentCall(String attributeFQN, String responseFields, CatalogAdminsAttributeLocalizedContent catalogAdminsAttributeLocalizedContent, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsAttributeLocalizedContent;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addLocalizedContentValidateBeforeCall(String attributeFQN, String responseFields, CatalogAdminsAttributeLocalizedContent catalogAdminsAttributeLocalizedContent, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling addLocalizedContent(Async)");
        }
        

        okhttp3.Call localVarCall = addLocalizedContentCall(attributeFQN, responseFields, catalogAdminsAttributeLocalizedContent, _callback);
        return localVarCall;

    }

    /**
     * Add Localized Content
     * Creates product attribute localized content
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeLocalizedContent  (optional)
     * @return CatalogAdminsAttributeLocalizedContent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsAttributeLocalizedContent addLocalizedContent(String attributeFQN, String responseFields, CatalogAdminsAttributeLocalizedContent catalogAdminsAttributeLocalizedContent) throws ApiException {
        ApiResponse<CatalogAdminsAttributeLocalizedContent> localVarResp = addLocalizedContentWithHttpInfo(attributeFQN, responseFields, catalogAdminsAttributeLocalizedContent);
        return localVarResp.getData();
    }

    /**
     * Add Localized Content
     * Creates product attribute localized content
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeLocalizedContent  (optional)
     * @return ApiResponse&lt;CatalogAdminsAttributeLocalizedContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsAttributeLocalizedContent> addLocalizedContentWithHttpInfo(String attributeFQN, String responseFields, CatalogAdminsAttributeLocalizedContent catalogAdminsAttributeLocalizedContent) throws ApiException {
        okhttp3.Call localVarCall = addLocalizedContentValidateBeforeCall(attributeFQN, responseFields, catalogAdminsAttributeLocalizedContent, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttributeLocalizedContent>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Localized Content (asynchronously)
     * Creates product attribute localized content
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeLocalizedContent  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addLocalizedContentAsync(String attributeFQN, String responseFields, CatalogAdminsAttributeLocalizedContent catalogAdminsAttributeLocalizedContent, final ApiCallback<CatalogAdminsAttributeLocalizedContent> _callback) throws ApiException {

        okhttp3.Call localVarCall = addLocalizedContentValidateBeforeCall(attributeFQN, responseFields, catalogAdminsAttributeLocalizedContent, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttributeLocalizedContent>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteAttribute
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
    public okhttp3.Call deleteAttributeCall(String attributeFQN, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}"
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
    private okhttp3.Call deleteAttributeValidateBeforeCall(String attributeFQN, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling deleteAttribute(Async)");
        }
        

        okhttp3.Call localVarCall = deleteAttributeCall(attributeFQN, _callback);
        return localVarCall;

    }

    /**
     * Delete Product Attribute
     * Deletes a product attribute by its FQN
     * @param attributeFQN  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteAttribute(String attributeFQN) throws ApiException {
        deleteAttributeWithHttpInfo(attributeFQN);
    }

    /**
     * Delete Product Attribute
     * Deletes a product attribute by its FQN
     * @param attributeFQN  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteAttributeWithHttpInfo(String attributeFQN) throws ApiException {
        okhttp3.Call localVarCall = deleteAttributeValidateBeforeCall(attributeFQN, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Product Attribute (asynchronously)
     * Deletes a product attribute by its FQN
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
    public okhttp3.Call deleteAttributeAsync(String attributeFQN, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteAttributeValidateBeforeCall(attributeFQN, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteAttributeVocabularyValue
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAttributeVocabularyValueCall(String attributeFQN, String value, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}"
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "value" + "\\}", localVarApiClient.escapeString(value.toString()));

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
    private okhttp3.Call deleteAttributeVocabularyValueValidateBeforeCall(String attributeFQN, String value, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling deleteAttributeVocabularyValue(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling deleteAttributeVocabularyValue(Async)");
        }
        

        okhttp3.Call localVarCall = deleteAttributeVocabularyValueCall(attributeFQN, value, _callback);
        return localVarCall;

    }

    /**
     * Delete Vocabulary Value
     * Deletes a product attribute vocabulary value
     * @param attributeFQN  (required)
     * @param value  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteAttributeVocabularyValue(String attributeFQN, String value) throws ApiException {
        deleteAttributeVocabularyValueWithHttpInfo(attributeFQN, value);
    }

    /**
     * Delete Vocabulary Value
     * Deletes a product attribute vocabulary value
     * @param attributeFQN  (required)
     * @param value  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteAttributeVocabularyValueWithHttpInfo(String attributeFQN, String value) throws ApiException {
        okhttp3.Call localVarCall = deleteAttributeVocabularyValueValidateBeforeCall(attributeFQN, value, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Vocabulary Value (asynchronously)
     * Deletes a product attribute vocabulary value
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAttributeVocabularyValueAsync(String attributeFQN, String value, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteAttributeVocabularyValueValidateBeforeCall(attributeFQN, value, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteAttributeVocabularyValueLocalizedContent
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAttributeVocabularyValueLocalizedContentCall(String attributeFQN, String value, String localeCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent/{localeCode}"
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "value" + "\\}", localVarApiClient.escapeString(value.toString()))
            .replaceAll("\\{" + "localeCode" + "\\}", localVarApiClient.escapeString(localeCode.toString()));

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
    private okhttp3.Call deleteAttributeVocabularyValueLocalizedContentValidateBeforeCall(String attributeFQN, String value, String localeCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling deleteAttributeVocabularyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling deleteAttributeVocabularyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'localeCode' is set
        if (localeCode == null) {
            throw new ApiException("Missing the required parameter 'localeCode' when calling deleteAttributeVocabularyValueLocalizedContent(Async)");
        }
        

        okhttp3.Call localVarCall = deleteAttributeVocabularyValueLocalizedContentCall(attributeFQN, value, localeCode, _callback);
        return localVarCall;

    }

    /**
     * Delete Vocabulary Value Localized Content by Locale Code
     * Delete product attribute vocabulary value localized content by its locale code
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteAttributeVocabularyValueLocalizedContent(String attributeFQN, String value, String localeCode) throws ApiException {
        deleteAttributeVocabularyValueLocalizedContentWithHttpInfo(attributeFQN, value, localeCode);
    }

    /**
     * Delete Vocabulary Value Localized Content by Locale Code
     * Delete product attribute vocabulary value localized content by its locale code
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteAttributeVocabularyValueLocalizedContentWithHttpInfo(String attributeFQN, String value, String localeCode) throws ApiException {
        okhttp3.Call localVarCall = deleteAttributeVocabularyValueLocalizedContentValidateBeforeCall(attributeFQN, value, localeCode, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Vocabulary Value Localized Content by Locale Code (asynchronously)
     * Delete product attribute vocabulary value localized content by its locale code
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAttributeVocabularyValueLocalizedContentAsync(String attributeFQN, String value, String localeCode, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteAttributeVocabularyValueLocalizedContentValidateBeforeCall(attributeFQN, value, localeCode, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteLocalizedContent
     * @param attributeFQN  (required)
     * @param localeCode  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteLocalizedContentCall(String attributeFQN, String localeCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent/{localeCode}"
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "localeCode" + "\\}", localVarApiClient.escapeString(localeCode.toString()));

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
    private okhttp3.Call deleteLocalizedContentValidateBeforeCall(String attributeFQN, String localeCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling deleteLocalizedContent(Async)");
        }
        
        // verify the required parameter 'localeCode' is set
        if (localeCode == null) {
            throw new ApiException("Missing the required parameter 'localeCode' when calling deleteLocalizedContent(Async)");
        }
        

        okhttp3.Call localVarCall = deleteLocalizedContentCall(attributeFQN, localeCode, _callback);
        return localVarCall;

    }

    /**
     * Delete Localized Content by Locale Code
     * Deletes localized content by its locale code
     * @param attributeFQN  (required)
     * @param localeCode  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteLocalizedContent(String attributeFQN, String localeCode) throws ApiException {
        deleteLocalizedContentWithHttpInfo(attributeFQN, localeCode);
    }

    /**
     * Delete Localized Content by Locale Code
     * Deletes localized content by its locale code
     * @param attributeFQN  (required)
     * @param localeCode  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteLocalizedContentWithHttpInfo(String attributeFQN, String localeCode) throws ApiException {
        okhttp3.Call localVarCall = deleteLocalizedContentValidateBeforeCall(attributeFQN, localeCode, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Localized Content by Locale Code (asynchronously)
     * Deletes localized content by its locale code
     * @param attributeFQN  (required)
     * @param localeCode  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteLocalizedContentAsync(String attributeFQN, String localeCode, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteLocalizedContentValidateBeforeCall(attributeFQN, localeCode, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAttribute
     * @param attributeFQN  (required)
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
    public okhttp3.Call getAttributeCall(String attributeFQN, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}"
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call getAttributeValidateBeforeCall(String attributeFQN, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getAttribute(Async)");
        }
        

        okhttp3.Call localVarCall = getAttributeCall(attributeFQN, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Attribute
     * Retrieves a product attribute by its FQN. This current version of the Attributes API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access attribute data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param attributeFQN  (required)
     * @param responseGroups  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsAttribute
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsAttribute getAttribute(String attributeFQN, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsAttribute> localVarResp = getAttributeWithHttpInfo(attributeFQN, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Attribute
     * Retrieves a product attribute by its FQN. This current version of the Attributes API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access attribute data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param attributeFQN  (required)
     * @param responseGroups  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsAttribute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsAttribute> getAttributeWithHttpInfo(String attributeFQN, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getAttributeValidateBeforeCall(attributeFQN, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttribute>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Attribute (asynchronously)
     * Retrieves a product attribute by its FQN. This current version of the Attributes API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access attribute data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param attributeFQN  (required)
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
    public okhttp3.Call getAttributeAsync(String attributeFQN, String responseGroups, String responseFields, final ApiCallback<CatalogAdminsAttribute> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAttributeValidateBeforeCall(attributeFQN, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttribute>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAttributeLocalizedContent
     * @param attributeFQN  (required)
     * @param localeCode  (required)
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
    public okhttp3.Call getAttributeLocalizedContentCall(String attributeFQN, String localeCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent/{localeCode}"
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "localeCode" + "\\}", localVarApiClient.escapeString(localeCode.toString()));

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
    private okhttp3.Call getAttributeLocalizedContentValidateBeforeCall(String attributeFQN, String localeCode, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getAttributeLocalizedContent(Async)");
        }
        
        // verify the required parameter 'localeCode' is set
        if (localeCode == null) {
            throw new ApiException("Missing the required parameter 'localeCode' when calling getAttributeLocalizedContent(Async)");
        }
        

        okhttp3.Call localVarCall = getAttributeLocalizedContentCall(attributeFQN, localeCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Localized Content by Locale Code
     * Retrieves localized content by its locale code
     * @param attributeFQN  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsAttributeLocalizedContent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsAttributeLocalizedContent getAttributeLocalizedContent(String attributeFQN, String localeCode, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsAttributeLocalizedContent> localVarResp = getAttributeLocalizedContentWithHttpInfo(attributeFQN, localeCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Localized Content by Locale Code
     * Retrieves localized content by its locale code
     * @param attributeFQN  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsAttributeLocalizedContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsAttributeLocalizedContent> getAttributeLocalizedContentWithHttpInfo(String attributeFQN, String localeCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getAttributeLocalizedContentValidateBeforeCall(attributeFQN, localeCode, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttributeLocalizedContent>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Localized Content by Locale Code (asynchronously)
     * Retrieves localized content by its locale code
     * @param attributeFQN  (required)
     * @param localeCode  (required)
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
    public okhttp3.Call getAttributeLocalizedContentAsync(String attributeFQN, String localeCode, String responseFields, final ApiCallback<CatalogAdminsAttributeLocalizedContent> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAttributeLocalizedContentValidateBeforeCall(attributeFQN, localeCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttributeLocalizedContent>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAttributeLocalizedContents
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
    public okhttp3.Call getAttributeLocalizedContentsCall(String attributeFQN, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent"
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
    private okhttp3.Call getAttributeLocalizedContentsValidateBeforeCall(String attributeFQN, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getAttributeLocalizedContents(Async)");
        }
        

        okhttp3.Call localVarCall = getAttributeLocalizedContentsCall(attributeFQN, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Localized Content
     * Retrieves product attribute localized content
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return List&lt;CatalogAdminsAttributeLocalizedContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<CatalogAdminsAttributeLocalizedContent> getAttributeLocalizedContents(String attributeFQN, String responseFields) throws ApiException {
        ApiResponse<List<CatalogAdminsAttributeLocalizedContent>> localVarResp = getAttributeLocalizedContentsWithHttpInfo(attributeFQN, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Localized Content
     * Retrieves product attribute localized content
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;List&lt;CatalogAdminsAttributeLocalizedContent&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<CatalogAdminsAttributeLocalizedContent>> getAttributeLocalizedContentsWithHttpInfo(String attributeFQN, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getAttributeLocalizedContentsValidateBeforeCall(attributeFQN, responseFields, null);
        Type localVarReturnType = new TypeToken<List<CatalogAdminsAttributeLocalizedContent>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Localized Content (asynchronously)
     * Retrieves product attribute localized content
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
    public okhttp3.Call getAttributeLocalizedContentsAsync(String attributeFQN, String responseFields, final ApiCallback<List<CatalogAdminsAttributeLocalizedContent>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAttributeLocalizedContentsValidateBeforeCall(attributeFQN, responseFields, _callback);
        Type localVarReturnType = new TypeToken<List<CatalogAdminsAttributeLocalizedContent>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAttributeTypeRules
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
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
    public okhttp3.Call getAttributeTypeRulesCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/typerules";

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
    private okhttp3.Call getAttributeTypeRulesValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getAttributeTypeRulesCall(startIndex, pageSize, sortBy, filter, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Attribute Type Rules
     * Retrieves a paged list of attribute type rules according to any specified filter criteria and sort options.
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return AttributeTypeRuleCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AttributeTypeRuleCollection getAttributeTypeRules(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws ApiException {
        ApiResponse<AttributeTypeRuleCollection> localVarResp = getAttributeTypeRulesWithHttpInfo(startIndex, pageSize, sortBy, filter, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Attribute Type Rules
     * Retrieves a paged list of attribute type rules according to any specified filter criteria and sort options.
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;AttributeTypeRuleCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttributeTypeRuleCollection> getAttributeTypeRulesWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getAttributeTypeRulesValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseFields, null);
        Type localVarReturnType = new TypeToken<AttributeTypeRuleCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Attribute Type Rules (asynchronously)
     * Retrieves a paged list of attribute type rules according to any specified filter criteria and sort options.
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
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
    public okhttp3.Call getAttributeTypeRulesAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, final ApiCallback<AttributeTypeRuleCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAttributeTypeRulesValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseFields, _callback);
        Type localVarReturnType = new TypeToken<AttributeTypeRuleCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAttributeVocabularyValue
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
    public okhttp3.Call getAttributeVocabularyValueCall(String attributeFQN, String value, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}"
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
    private okhttp3.Call getAttributeVocabularyValueValidateBeforeCall(String attributeFQN, String value, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getAttributeVocabularyValue(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling getAttributeVocabularyValue(Async)");
        }
        

        okhttp3.Call localVarCall = getAttributeVocabularyValueCall(attributeFQN, value, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Vocabulary Value
     * Retrieves a product attribute vocabulary value
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsAttributeVocabularyValue
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsAttributeVocabularyValue getAttributeVocabularyValue(String attributeFQN, String value, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsAttributeVocabularyValue> localVarResp = getAttributeVocabularyValueWithHttpInfo(attributeFQN, value, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Vocabulary Value
     * Retrieves a product attribute vocabulary value
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsAttributeVocabularyValue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsAttributeVocabularyValue> getAttributeVocabularyValueWithHttpInfo(String attributeFQN, String value, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getAttributeVocabularyValueValidateBeforeCall(attributeFQN, value, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttributeVocabularyValue>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Vocabulary Value (asynchronously)
     * Retrieves a product attribute vocabulary value
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
    public okhttp3.Call getAttributeVocabularyValueAsync(String attributeFQN, String value, String responseFields, final ApiCallback<CatalogAdminsAttributeVocabularyValue> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAttributeVocabularyValueValidateBeforeCall(attributeFQN, value, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttributeVocabularyValue>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAttributeVocabularyValueLocalizedContent
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
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
    public okhttp3.Call getAttributeVocabularyValueLocalizedContentCall(String attributeFQN, String value, String localeCode, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent/{localeCode}"
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "value" + "\\}", localVarApiClient.escapeString(value.toString()))
            .replaceAll("\\{" + "localeCode" + "\\}", localVarApiClient.escapeString(localeCode.toString()));

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
    private okhttp3.Call getAttributeVocabularyValueLocalizedContentValidateBeforeCall(String attributeFQN, String value, String localeCode, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getAttributeVocabularyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling getAttributeVocabularyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'localeCode' is set
        if (localeCode == null) {
            throw new ApiException("Missing the required parameter 'localeCode' when calling getAttributeVocabularyValueLocalizedContent(Async)");
        }
        

        okhttp3.Call localVarCall = getAttributeVocabularyValueLocalizedContentCall(attributeFQN, value, localeCode, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Vocabulary Value Localized Content by Locale Code
     * Get product attribute vocabulary value localized content by its locale code
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return AttributeVocabularyValueLocalizedContent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AttributeVocabularyValueLocalizedContent getAttributeVocabularyValueLocalizedContent(String attributeFQN, String value, String localeCode, String responseFields) throws ApiException {
        ApiResponse<AttributeVocabularyValueLocalizedContent> localVarResp = getAttributeVocabularyValueLocalizedContentWithHttpInfo(attributeFQN, value, localeCode, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Vocabulary Value Localized Content by Locale Code
     * Get product attribute vocabulary value localized content by its locale code
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;AttributeVocabularyValueLocalizedContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttributeVocabularyValueLocalizedContent> getAttributeVocabularyValueLocalizedContentWithHttpInfo(String attributeFQN, String value, String localeCode, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getAttributeVocabularyValueLocalizedContentValidateBeforeCall(attributeFQN, value, localeCode, responseFields, null);
        Type localVarReturnType = new TypeToken<AttributeVocabularyValueLocalizedContent>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Vocabulary Value Localized Content by Locale Code (asynchronously)
     * Get product attribute vocabulary value localized content by its locale code
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
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
    public okhttp3.Call getAttributeVocabularyValueLocalizedContentAsync(String attributeFQN, String value, String localeCode, String responseFields, final ApiCallback<AttributeVocabularyValueLocalizedContent> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAttributeVocabularyValueLocalizedContentValidateBeforeCall(attributeFQN, value, localeCode, responseFields, _callback);
        Type localVarReturnType = new TypeToken<AttributeVocabularyValueLocalizedContent>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAttributeVocabularyValueLocalizedContents
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
    public okhttp3.Call getAttributeVocabularyValueLocalizedContentsCall(String attributeFQN, String value, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent"
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
    private okhttp3.Call getAttributeVocabularyValueLocalizedContentsValidateBeforeCall(String attributeFQN, String value, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getAttributeVocabularyValueLocalizedContents(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling getAttributeVocabularyValueLocalizedContents(Async)");
        }
        

        okhttp3.Call localVarCall = getAttributeVocabularyValueLocalizedContentsCall(attributeFQN, value, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Vocabulary Value Localized Content
     * Retrieves vocabulary value localized content
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return List&lt;AttributeVocabularyValueLocalizedContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<AttributeVocabularyValueLocalizedContent> getAttributeVocabularyValueLocalizedContents(String attributeFQN, String value, String responseFields) throws ApiException {
        ApiResponse<List<AttributeVocabularyValueLocalizedContent>> localVarResp = getAttributeVocabularyValueLocalizedContentsWithHttpInfo(attributeFQN, value, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Vocabulary Value Localized Content
     * Retrieves vocabulary value localized content
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;List&lt;AttributeVocabularyValueLocalizedContent&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<AttributeVocabularyValueLocalizedContent>> getAttributeVocabularyValueLocalizedContentsWithHttpInfo(String attributeFQN, String value, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getAttributeVocabularyValueLocalizedContentsValidateBeforeCall(attributeFQN, value, responseFields, null);
        Type localVarReturnType = new TypeToken<List<AttributeVocabularyValueLocalizedContent>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Vocabulary Value Localized Content (asynchronously)
     * Retrieves vocabulary value localized content
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
    public okhttp3.Call getAttributeVocabularyValueLocalizedContentsAsync(String attributeFQN, String value, String responseFields, final ApiCallback<List<AttributeVocabularyValueLocalizedContent>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAttributeVocabularyValueLocalizedContentsValidateBeforeCall(attributeFQN, value, responseFields, _callback);
        Type localVarReturnType = new TypeToken<List<AttributeVocabularyValueLocalizedContent>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAttributeVocabularyValues
     * @param attributeFQN  (required)
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
    public okhttp3.Call getAttributeVocabularyValuesCall(String attributeFQN, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues"
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call getAttributeVocabularyValuesValidateBeforeCall(String attributeFQN, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling getAttributeVocabularyValues(Async)");
        }
        

        okhttp3.Call localVarCall = getAttributeVocabularyValuesCall(attributeFQN, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Vocabulary Values
     * Retrieves product attribute vocabulary values
     * @param attributeFQN  (required)
     * @param responseGroups  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return List&lt;CatalogAdminsAttributeVocabularyValue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<CatalogAdminsAttributeVocabularyValue> getAttributeVocabularyValues(String attributeFQN, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<List<CatalogAdminsAttributeVocabularyValue>> localVarResp = getAttributeVocabularyValuesWithHttpInfo(attributeFQN, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Vocabulary Values
     * Retrieves product attribute vocabulary values
     * @param attributeFQN  (required)
     * @param responseGroups  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;List&lt;CatalogAdminsAttributeVocabularyValue&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<CatalogAdminsAttributeVocabularyValue>> getAttributeVocabularyValuesWithHttpInfo(String attributeFQN, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getAttributeVocabularyValuesValidateBeforeCall(attributeFQN, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<List<CatalogAdminsAttributeVocabularyValue>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Vocabulary Values (asynchronously)
     * Retrieves product attribute vocabulary values
     * @param attributeFQN  (required)
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
    public okhttp3.Call getAttributeVocabularyValuesAsync(String attributeFQN, String responseGroups, String responseFields, final ApiCallback<List<CatalogAdminsAttributeVocabularyValue>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAttributeVocabularyValuesValidateBeforeCall(attributeFQN, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<List<CatalogAdminsAttributeVocabularyValue>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAttributes
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
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
    public okhttp3.Call getAttributesCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes";

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
    private okhttp3.Call getAttributesValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getAttributesCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, _callback);
        return localVarCall;

    }

    /**
     * Get Product Attributes.
     * Get product attributes. This current version of the Attributes API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access attribute data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param responseGroups  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return CatalogAdminsAttributeCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsAttributeCollection getAttributes(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields) throws ApiException {
        ApiResponse<CatalogAdminsAttributeCollection> localVarResp = getAttributesWithHttpInfo(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
        return localVarResp.getData();
    }

    /**
     * Get Product Attributes.
     * Get product attributes. This current version of the Attributes API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access attribute data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param responseGroups  (optional)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @return ApiResponse&lt;CatalogAdminsAttributeCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsAttributeCollection> getAttributesWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields) throws ApiException {
        okhttp3.Call localVarCall = getAttributesValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttributeCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Product Attributes. (asynchronously)
     * Get product attributes. This current version of the Attributes API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access attribute data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 0)
     * @param sortBy  (optional)
     * @param filter  (optional)
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
    public okhttp3.Call getAttributesAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseGroups, String responseFields, final ApiCallback<CatalogAdminsAttributeCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAttributesValidateBeforeCall(startIndex, pageSize, sortBy, filter, responseGroups, responseFields, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttributeCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateAttribute
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttribute  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAttributeCall(String attributeFQN, String responseFields, CatalogAdminsAttribute catalogAdminsAttribute, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsAttribute;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}"
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
    private okhttp3.Call updateAttributeValidateBeforeCall(String attributeFQN, String responseFields, CatalogAdminsAttribute catalogAdminsAttribute, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updateAttribute(Async)");
        }
        

        okhttp3.Call localVarCall = updateAttributeCall(attributeFQN, responseFields, catalogAdminsAttribute, _callback);
        return localVarCall;

    }

    /**
     * Update Product Attribute
     * Updates a product attribute by its FQN. This current version of the Attributes API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access attribute data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttribute  (optional)
     * @return CatalogAdminsAttribute
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsAttribute updateAttribute(String attributeFQN, String responseFields, CatalogAdminsAttribute catalogAdminsAttribute) throws ApiException {
        ApiResponse<CatalogAdminsAttribute> localVarResp = updateAttributeWithHttpInfo(attributeFQN, responseFields, catalogAdminsAttribute);
        return localVarResp.getData();
    }

    /**
     * Update Product Attribute
     * Updates a product attribute by its FQN. This current version of the Attributes API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access attribute data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttribute  (optional)
     * @return ApiResponse&lt;CatalogAdminsAttribute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsAttribute> updateAttributeWithHttpInfo(String attributeFQN, String responseFields, CatalogAdminsAttribute catalogAdminsAttribute) throws ApiException {
        okhttp3.Call localVarCall = updateAttributeValidateBeforeCall(attributeFQN, responseFields, catalogAdminsAttribute, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttribute>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Product Attribute (asynchronously)
     * Updates a product attribute by its FQN. This current version of the Attributes API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access attribute data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttribute  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAttributeAsync(String attributeFQN, String responseFields, CatalogAdminsAttribute catalogAdminsAttribute, final ApiCallback<CatalogAdminsAttribute> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateAttributeValidateBeforeCall(attributeFQN, responseFields, catalogAdminsAttribute, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttribute>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateAttributeVocabularyValue
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeVocabularyValue  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAttributeVocabularyValueCall(String attributeFQN, String value, String responseFields, CatalogAdminsAttributeVocabularyValue catalogAdminsAttributeVocabularyValue, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsAttributeVocabularyValue;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}"
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
    private okhttp3.Call updateAttributeVocabularyValueValidateBeforeCall(String attributeFQN, String value, String responseFields, CatalogAdminsAttributeVocabularyValue catalogAdminsAttributeVocabularyValue, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updateAttributeVocabularyValue(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling updateAttributeVocabularyValue(Async)");
        }
        

        okhttp3.Call localVarCall = updateAttributeVocabularyValueCall(attributeFQN, value, responseFields, catalogAdminsAttributeVocabularyValue, _callback);
        return localVarCall;

    }

    /**
     * Update Vocabulary Value
     * Updates a product attribute vocabulary value
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeVocabularyValue  (optional)
     * @return CatalogAdminsAttributeVocabularyValue
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsAttributeVocabularyValue updateAttributeVocabularyValue(String attributeFQN, String value, String responseFields, CatalogAdminsAttributeVocabularyValue catalogAdminsAttributeVocabularyValue) throws ApiException {
        ApiResponse<CatalogAdminsAttributeVocabularyValue> localVarResp = updateAttributeVocabularyValueWithHttpInfo(attributeFQN, value, responseFields, catalogAdminsAttributeVocabularyValue);
        return localVarResp.getData();
    }

    /**
     * Update Vocabulary Value
     * Updates a product attribute vocabulary value
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeVocabularyValue  (optional)
     * @return ApiResponse&lt;CatalogAdminsAttributeVocabularyValue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsAttributeVocabularyValue> updateAttributeVocabularyValueWithHttpInfo(String attributeFQN, String value, String responseFields, CatalogAdminsAttributeVocabularyValue catalogAdminsAttributeVocabularyValue) throws ApiException {
        okhttp3.Call localVarCall = updateAttributeVocabularyValueValidateBeforeCall(attributeFQN, value, responseFields, catalogAdminsAttributeVocabularyValue, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttributeVocabularyValue>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Vocabulary Value (asynchronously)
     * Updates a product attribute vocabulary value
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeVocabularyValue  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAttributeVocabularyValueAsync(String attributeFQN, String value, String responseFields, CatalogAdminsAttributeVocabularyValue catalogAdminsAttributeVocabularyValue, final ApiCallback<CatalogAdminsAttributeVocabularyValue> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateAttributeVocabularyValueValidateBeforeCall(attributeFQN, value, responseFields, catalogAdminsAttributeVocabularyValue, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttributeVocabularyValue>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateAttributeVocabularyValueLocalizedContent
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeVocabularyValueLocalizedContent  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAttributeVocabularyValueLocalizedContentCall(String attributeFQN, String value, String localeCode, String responseFields, AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = attributeVocabularyValueLocalizedContent;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent/{localeCode}"
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "value" + "\\}", localVarApiClient.escapeString(value.toString()))
            .replaceAll("\\{" + "localeCode" + "\\}", localVarApiClient.escapeString(localeCode.toString()));

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
    private okhttp3.Call updateAttributeVocabularyValueLocalizedContentValidateBeforeCall(String attributeFQN, String value, String localeCode, String responseFields, AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updateAttributeVocabularyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling updateAttributeVocabularyValueLocalizedContent(Async)");
        }
        
        // verify the required parameter 'localeCode' is set
        if (localeCode == null) {
            throw new ApiException("Missing the required parameter 'localeCode' when calling updateAttributeVocabularyValueLocalizedContent(Async)");
        }
        

        okhttp3.Call localVarCall = updateAttributeVocabularyValueLocalizedContentCall(attributeFQN, value, localeCode, responseFields, attributeVocabularyValueLocalizedContent, _callback);
        return localVarCall;

    }

    /**
     * Update Vocabulary Value Localized Content by Locale Code
     * Update product attribute vocabulary value localized content by its locale code
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeVocabularyValueLocalizedContent  (optional)
     * @return AttributeVocabularyValueLocalizedContent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AttributeVocabularyValueLocalizedContent updateAttributeVocabularyValueLocalizedContent(String attributeFQN, String value, String localeCode, String responseFields, AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent) throws ApiException {
        ApiResponse<AttributeVocabularyValueLocalizedContent> localVarResp = updateAttributeVocabularyValueLocalizedContentWithHttpInfo(attributeFQN, value, localeCode, responseFields, attributeVocabularyValueLocalizedContent);
        return localVarResp.getData();
    }

    /**
     * Update Vocabulary Value Localized Content by Locale Code
     * Update product attribute vocabulary value localized content by its locale code
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeVocabularyValueLocalizedContent  (optional)
     * @return ApiResponse&lt;AttributeVocabularyValueLocalizedContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttributeVocabularyValueLocalizedContent> updateAttributeVocabularyValueLocalizedContentWithHttpInfo(String attributeFQN, String value, String localeCode, String responseFields, AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent) throws ApiException {
        okhttp3.Call localVarCall = updateAttributeVocabularyValueLocalizedContentValidateBeforeCall(attributeFQN, value, localeCode, responseFields, attributeVocabularyValueLocalizedContent, null);
        Type localVarReturnType = new TypeToken<AttributeVocabularyValueLocalizedContent>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Vocabulary Value Localized Content by Locale Code (asynchronously)
     * Update product attribute vocabulary value localized content by its locale code
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeVocabularyValueLocalizedContent  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAttributeVocabularyValueLocalizedContentAsync(String attributeFQN, String value, String localeCode, String responseFields, AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent, final ApiCallback<AttributeVocabularyValueLocalizedContent> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateAttributeVocabularyValueLocalizedContentValidateBeforeCall(attributeFQN, value, localeCode, responseFields, attributeVocabularyValueLocalizedContent, _callback);
        Type localVarReturnType = new TypeToken<AttributeVocabularyValueLocalizedContent>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateAttributeVocabularyValueLocalizedContents
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeVocabularyValueLocalizedContent  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAttributeVocabularyValueLocalizedContentsCall(String attributeFQN, String value, String responseFields, List<AttributeVocabularyValueLocalizedContent> attributeVocabularyValueLocalizedContent, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = attributeVocabularyValueLocalizedContent;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent"
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
    private okhttp3.Call updateAttributeVocabularyValueLocalizedContentsValidateBeforeCall(String attributeFQN, String value, String responseFields, List<AttributeVocabularyValueLocalizedContent> attributeVocabularyValueLocalizedContent, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updateAttributeVocabularyValueLocalizedContents(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling updateAttributeVocabularyValueLocalizedContents(Async)");
        }
        

        okhttp3.Call localVarCall = updateAttributeVocabularyValueLocalizedContentsCall(attributeFQN, value, responseFields, attributeVocabularyValueLocalizedContent, _callback);
        return localVarCall;

    }

    /**
     * Update Vocabulary Value Localized Content
     * Updates vocabulary value localized content
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeVocabularyValueLocalizedContent  (optional)
     * @return List&lt;AttributeVocabularyValueLocalizedContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<AttributeVocabularyValueLocalizedContent> updateAttributeVocabularyValueLocalizedContents(String attributeFQN, String value, String responseFields, List<AttributeVocabularyValueLocalizedContent> attributeVocabularyValueLocalizedContent) throws ApiException {
        ApiResponse<List<AttributeVocabularyValueLocalizedContent>> localVarResp = updateAttributeVocabularyValueLocalizedContentsWithHttpInfo(attributeFQN, value, responseFields, attributeVocabularyValueLocalizedContent);
        return localVarResp.getData();
    }

    /**
     * Update Vocabulary Value Localized Content
     * Updates vocabulary value localized content
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeVocabularyValueLocalizedContent  (optional)
     * @return ApiResponse&lt;List&lt;AttributeVocabularyValueLocalizedContent&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<AttributeVocabularyValueLocalizedContent>> updateAttributeVocabularyValueLocalizedContentsWithHttpInfo(String attributeFQN, String value, String responseFields, List<AttributeVocabularyValueLocalizedContent> attributeVocabularyValueLocalizedContent) throws ApiException {
        okhttp3.Call localVarCall = updateAttributeVocabularyValueLocalizedContentsValidateBeforeCall(attributeFQN, value, responseFields, attributeVocabularyValueLocalizedContent, null);
        Type localVarReturnType = new TypeToken<List<AttributeVocabularyValueLocalizedContent>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Vocabulary Value Localized Content (asynchronously)
     * Updates vocabulary value localized content
     * @param attributeFQN  (required)
     * @param value  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param attributeVocabularyValueLocalizedContent  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAttributeVocabularyValueLocalizedContentsAsync(String attributeFQN, String value, String responseFields, List<AttributeVocabularyValueLocalizedContent> attributeVocabularyValueLocalizedContent, final ApiCallback<List<AttributeVocabularyValueLocalizedContent>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateAttributeVocabularyValueLocalizedContentsValidateBeforeCall(attributeFQN, value, responseFields, attributeVocabularyValueLocalizedContent, _callback);
        Type localVarReturnType = new TypeToken<List<AttributeVocabularyValueLocalizedContent>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateAttributeVocabularyValues
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeVocabularyValue  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAttributeVocabularyValuesCall(String attributeFQN, String responseFields, List<CatalogAdminsAttributeVocabularyValue> catalogAdminsAttributeVocabularyValue, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsAttributeVocabularyValue;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues"
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
    private okhttp3.Call updateAttributeVocabularyValuesValidateBeforeCall(String attributeFQN, String responseFields, List<CatalogAdminsAttributeVocabularyValue> catalogAdminsAttributeVocabularyValue, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updateAttributeVocabularyValues(Async)");
        }
        

        okhttp3.Call localVarCall = updateAttributeVocabularyValuesCall(attributeFQN, responseFields, catalogAdminsAttributeVocabularyValue, _callback);
        return localVarCall;

    }

    /**
     * Update Vocabulary Values
     * Updates product attribute vocabulary values
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeVocabularyValue  (optional)
     * @return List&lt;CatalogAdminsAttributeVocabularyValue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<CatalogAdminsAttributeVocabularyValue> updateAttributeVocabularyValues(String attributeFQN, String responseFields, List<CatalogAdminsAttributeVocabularyValue> catalogAdminsAttributeVocabularyValue) throws ApiException {
        ApiResponse<List<CatalogAdminsAttributeVocabularyValue>> localVarResp = updateAttributeVocabularyValuesWithHttpInfo(attributeFQN, responseFields, catalogAdminsAttributeVocabularyValue);
        return localVarResp.getData();
    }

    /**
     * Update Vocabulary Values
     * Updates product attribute vocabulary values
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeVocabularyValue  (optional)
     * @return ApiResponse&lt;List&lt;CatalogAdminsAttributeVocabularyValue&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<CatalogAdminsAttributeVocabularyValue>> updateAttributeVocabularyValuesWithHttpInfo(String attributeFQN, String responseFields, List<CatalogAdminsAttributeVocabularyValue> catalogAdminsAttributeVocabularyValue) throws ApiException {
        okhttp3.Call localVarCall = updateAttributeVocabularyValuesValidateBeforeCall(attributeFQN, responseFields, catalogAdminsAttributeVocabularyValue, null);
        Type localVarReturnType = new TypeToken<List<CatalogAdminsAttributeVocabularyValue>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Vocabulary Values (asynchronously)
     * Updates product attribute vocabulary values
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeVocabularyValue  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAttributeVocabularyValuesAsync(String attributeFQN, String responseFields, List<CatalogAdminsAttributeVocabularyValue> catalogAdminsAttributeVocabularyValue, final ApiCallback<List<CatalogAdminsAttributeVocabularyValue>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateAttributeVocabularyValuesValidateBeforeCall(attributeFQN, responseFields, catalogAdminsAttributeVocabularyValue, _callback);
        Type localVarReturnType = new TypeToken<List<CatalogAdminsAttributeVocabularyValue>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateLocalizedContent
     * @param attributeFQN  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeLocalizedContent  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateLocalizedContentCall(String attributeFQN, String localeCode, String responseFields, CatalogAdminsAttributeLocalizedContent catalogAdminsAttributeLocalizedContent, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsAttributeLocalizedContent;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent/{localeCode}"
            .replaceAll("\\{" + "attributeFQN" + "\\}", localVarApiClient.escapeString(attributeFQN.toString()))
            .replaceAll("\\{" + "localeCode" + "\\}", localVarApiClient.escapeString(localeCode.toString()));

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
    private okhttp3.Call updateLocalizedContentValidateBeforeCall(String attributeFQN, String localeCode, String responseFields, CatalogAdminsAttributeLocalizedContent catalogAdminsAttributeLocalizedContent, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updateLocalizedContent(Async)");
        }
        
        // verify the required parameter 'localeCode' is set
        if (localeCode == null) {
            throw new ApiException("Missing the required parameter 'localeCode' when calling updateLocalizedContent(Async)");
        }
        

        okhttp3.Call localVarCall = updateLocalizedContentCall(attributeFQN, localeCode, responseFields, catalogAdminsAttributeLocalizedContent, _callback);
        return localVarCall;

    }

    /**
     * Update Localized Content by Locale Code
     * Updates localized content by its locale code
     * @param attributeFQN  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeLocalizedContent  (optional)
     * @return CatalogAdminsAttributeLocalizedContent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CatalogAdminsAttributeLocalizedContent updateLocalizedContent(String attributeFQN, String localeCode, String responseFields, CatalogAdminsAttributeLocalizedContent catalogAdminsAttributeLocalizedContent) throws ApiException {
        ApiResponse<CatalogAdminsAttributeLocalizedContent> localVarResp = updateLocalizedContentWithHttpInfo(attributeFQN, localeCode, responseFields, catalogAdminsAttributeLocalizedContent);
        return localVarResp.getData();
    }

    /**
     * Update Localized Content by Locale Code
     * Updates localized content by its locale code
     * @param attributeFQN  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeLocalizedContent  (optional)
     * @return ApiResponse&lt;CatalogAdminsAttributeLocalizedContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CatalogAdminsAttributeLocalizedContent> updateLocalizedContentWithHttpInfo(String attributeFQN, String localeCode, String responseFields, CatalogAdminsAttributeLocalizedContent catalogAdminsAttributeLocalizedContent) throws ApiException {
        okhttp3.Call localVarCall = updateLocalizedContentValidateBeforeCall(attributeFQN, localeCode, responseFields, catalogAdminsAttributeLocalizedContent, null);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttributeLocalizedContent>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Localized Content by Locale Code (asynchronously)
     * Updates localized content by its locale code
     * @param attributeFQN  (required)
     * @param localeCode  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeLocalizedContent  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateLocalizedContentAsync(String attributeFQN, String localeCode, String responseFields, CatalogAdminsAttributeLocalizedContent catalogAdminsAttributeLocalizedContent, final ApiCallback<CatalogAdminsAttributeLocalizedContent> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateLocalizedContentValidateBeforeCall(attributeFQN, localeCode, responseFields, catalogAdminsAttributeLocalizedContent, _callback);
        Type localVarReturnType = new TypeToken<CatalogAdminsAttributeLocalizedContent>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateLocalizedContents
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeLocalizedContent  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateLocalizedContentsCall(String attributeFQN, String responseFields, List<CatalogAdminsAttributeLocalizedContent> catalogAdminsAttributeLocalizedContent, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = catalogAdminsAttributeLocalizedContent;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent"
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
    private okhttp3.Call updateLocalizedContentsValidateBeforeCall(String attributeFQN, String responseFields, List<CatalogAdminsAttributeLocalizedContent> catalogAdminsAttributeLocalizedContent, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'attributeFQN' is set
        if (attributeFQN == null) {
            throw new ApiException("Missing the required parameter 'attributeFQN' when calling updateLocalizedContents(Async)");
        }
        

        okhttp3.Call localVarCall = updateLocalizedContentsCall(attributeFQN, responseFields, catalogAdminsAttributeLocalizedContent, _callback);
        return localVarCall;

    }

    /**
     * Update Localized Content
     * Updates product attribute localized content
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeLocalizedContent  (optional)
     * @return List&lt;CatalogAdminsAttributeLocalizedContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<CatalogAdminsAttributeLocalizedContent> updateLocalizedContents(String attributeFQN, String responseFields, List<CatalogAdminsAttributeLocalizedContent> catalogAdminsAttributeLocalizedContent) throws ApiException {
        ApiResponse<List<CatalogAdminsAttributeLocalizedContent>> localVarResp = updateLocalizedContentsWithHttpInfo(attributeFQN, responseFields, catalogAdminsAttributeLocalizedContent);
        return localVarResp.getData();
    }

    /**
     * Update Localized Content
     * Updates product attribute localized content
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeLocalizedContent  (optional)
     * @return ApiResponse&lt;List&lt;CatalogAdminsAttributeLocalizedContent&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<CatalogAdminsAttributeLocalizedContent>> updateLocalizedContentsWithHttpInfo(String attributeFQN, String responseFields, List<CatalogAdminsAttributeLocalizedContent> catalogAdminsAttributeLocalizedContent) throws ApiException {
        okhttp3.Call localVarCall = updateLocalizedContentsValidateBeforeCall(attributeFQN, responseFields, catalogAdminsAttributeLocalizedContent, null);
        Type localVarReturnType = new TypeToken<List<CatalogAdminsAttributeLocalizedContent>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Localized Content (asynchronously)
     * Updates product attribute localized content
     * @param attributeFQN  (required)
     * @param responseFields limits which fields are returned in the response body (optional)
     * @param catalogAdminsAttributeLocalizedContent  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateLocalizedContentsAsync(String attributeFQN, String responseFields, List<CatalogAdminsAttributeLocalizedContent> catalogAdminsAttributeLocalizedContent, final ApiCallback<List<CatalogAdminsAttributeLocalizedContent>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateLocalizedContentsValidateBeforeCall(attributeFQN, responseFields, catalogAdminsAttributeLocalizedContent, _callback);
        Type localVarReturnType = new TypeToken<List<CatalogAdminsAttributeLocalizedContent>>(){}.getType();
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
        public ProductAttributesApi build() {
            return new ProductAttributesApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
