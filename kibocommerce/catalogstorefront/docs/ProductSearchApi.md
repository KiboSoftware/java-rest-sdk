# ProductSearchApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchDebug**](ProductSearchApi.md#searchDebug) | **GET** /commerce/catalog/storefront/productsearch/searchDebug | Searches the items displayed on the storefront. Used for debugging explain plans from solr |
| [**storefrontGetRandomAccessCursor**](ProductSearchApi.md#storefrontGetRandomAccessCursor) | **GET** /commerce/catalog/storefront/productsearch/randomAccessCursor | Gets list of cursors for search results |
| [**storefrontSearch**](ProductSearchApi.md#storefrontSearch) | **GET** /commerce/catalog/storefront/productsearch/search | Search for products. |
| [**storefrontSiteSearch**](ProductSearchApi.md#storefrontSiteSearch) | **GET** /commerce/catalog/storefront/productsearch/siteSearch | Site Search - Searches the items displayed on the storefront. |
| [**storefrontSuggest**](ProductSearchApi.md#storefrontSuggest) | **GET** /commerce/catalog/storefront/productsearch/suggest | Gets suggested search terms |
| [**storefrontSuggest2**](ProductSearchApi.md#storefrontSuggest2) | **GET** /commerce/catalog/storefront/productsearch/suggest2 | Gets suggested search terms |
| [**storefrontVisualSearch**](ProductSearchApi.md#storefrontVisualSearch) | **GET** /commerce/catalog/storefront/productsearch/visualsearch | Type ahead - Searches the items displayed on the storefront. |
| [**suggestDebug**](ProductSearchApi.md#suggestDebug) | **GET** /commerce/catalog/storefront/productsearch/suggestdebug | Debugging relevancy for the Suggest endpoint |


<a name="searchDebug"></a>
# **searchDebug**
> searchDebug(query, filter, facetTemplate, facetTemplateSubset, facet, facetFieldRangeQuery, facetHierPrefix, facetHierValue, facetHierDepth, facetStartIndex, facetPageSize, facetSettings, facetValueFilter, sortBy, sliceSearchResults, pageSize, startIndex, searchSettings, enableSearchTuningRules, searchTuningRuleContext, searchTuningRuleCode, responseGroups, facetTemplateExclude, facetPrefix, responseOptions, cursorMark, facetValueSort, returnUrl, mid, omitNamespace, campaignId, merchandizingRuleCode, responseFields, rows, start, q)

Searches the items displayed on the storefront. Used for debugging explain plans from solr

Searches the items displayed on the storefront for products or product options that the shopper types in a search query. Used for debugging explain plans from solr

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductSearchApi apiInstance = new ProductSearchApi(defaultClient);
    String query = "query_example"; // String | The terms to search on.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String facetTemplate = "facetTemplate_example"; // String | The template to use for what facets to compute. ex: categoryId:id
    String facetTemplateSubset = "facetTemplateSubset_example"; // String | If you only want to return a subset of the facets defined in the template. ex: category,price,rating
    String facet = "facet_example"; // String | Fields to facet on in addition to the optionally provided facetTemplate. ex: category,price,rating
    String facetFieldRangeQuery = "facetFieldRangeQuery_example"; // String | Facet field range. ex: field:[val+TO+val] can also label
    String facetHierPrefix = "facetHierPrefix_example"; // String | Facet hierarchy prefix. Skip these levels on a hierarchical facet. ex: field:foo/bar/bing
    String facetHierValue = "facetHierValue_example"; // String | Find the node to start with given a unique lookup value, instead of requiring a prefix path. ex: field:bing
    String facetHierDepth = "facetHierDepth_example"; // String | Facet hierarchy depth. Number of levels to return. ex: category:1
    String facetStartIndex = "facetStartIndex_example"; // String | Facet offset
    String facetPageSize = "facetPageSize_example"; // String | Facet page size
    String facetSettings = "facetSettings_example"; // String | Deprecated
    String facetValueFilter = "facetValueFilter_example"; // String | Apply facet values as a filter. ex: category:3,price:[* TO 100]
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    Boolean sliceSearchResults = false; // Boolean | Whether to slice results or not
    Integer pageSize = 56; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 12 and the maximum value is 200. Optional.
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. The default value is 0. Optional.
    String searchSettings = "searchSettings_example"; // String | The name of a SiteSearchSettings (search relevancy settings) scheme to use. Defaults to whichever Settings is marked as IsDefault=true.
    Boolean enableSearchTuningRules = true; // Boolean | Use search-tuning-rules or not
    String searchTuningRuleContext = "searchTuningRuleContext_example"; // String | The filters which the search tuning rules will match on.
    String searchTuningRuleCode = "searchTuningRuleCode_example"; // String | Search-Tuning-Rule Code
    String responseGroups = "responseGroups_example"; // String | A list of property groups to return instead of using the granular responseFields param. ex: categories,properties,options
    String facetTemplateExclude = "facetTemplateExclude_example"; // String | 
    String facetPrefix = "facetPrefix_example"; // String | 
    String responseOptions = "responseOptions_example"; // String | 
    String cursorMark = "cursorMark_example"; // String | Pass in * to begin a deep page operation. The response will include a nextCursorMark value. Pass this into the next call. Continue with this pattern until nextCursorMark is null.
    String facetValueSort = "facetValueSort_example"; // String | 
    Boolean returnUrl = false; // Boolean | Only respond with the request made to the search-engine, for one \"groups\" parameter value. Default is false. Optional parameter.
    String mid = "mid_example"; // String | Personalization Id (Monetate Id)
    Boolean omitNamespace = true; // Boolean | 
    String campaignId = "campaignId_example"; // String | 
    String merchandizingRuleCode = "merchandizingRuleCode_example"; // String | Optional. Use a specific search-merchandizing-rule code if provided.
    String responseFields = "responseFields_example"; // String | 
    Integer rows = 56; // Integer | 
    Integer start = 56; // Integer | 
    String q = "q_example"; // String | optional alternative to query for debugging tools
    try {
      apiInstance.searchDebug(query, filter, facetTemplate, facetTemplateSubset, facet, facetFieldRangeQuery, facetHierPrefix, facetHierValue, facetHierDepth, facetStartIndex, facetPageSize, facetSettings, facetValueFilter, sortBy, sliceSearchResults, pageSize, startIndex, searchSettings, enableSearchTuningRules, searchTuningRuleContext, searchTuningRuleCode, responseGroups, facetTemplateExclude, facetPrefix, responseOptions, cursorMark, facetValueSort, returnUrl, mid, omitNamespace, campaignId, merchandizingRuleCode, responseFields, rows, start, q);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductSearchApi#searchDebug");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**| The terms to search on. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **facetTemplate** | **String**| The template to use for what facets to compute. ex: categoryId:id | [optional] |
| **facetTemplateSubset** | **String**| If you only want to return a subset of the facets defined in the template. ex: category,price,rating | [optional] |
| **facet** | **String**| Fields to facet on in addition to the optionally provided facetTemplate. ex: category,price,rating | [optional] |
| **facetFieldRangeQuery** | **String**| Facet field range. ex: field:[val+TO+val] can also label | [optional] |
| **facetHierPrefix** | **String**| Facet hierarchy prefix. Skip these levels on a hierarchical facet. ex: field:foo/bar/bing | [optional] |
| **facetHierValue** | **String**| Find the node to start with given a unique lookup value, instead of requiring a prefix path. ex: field:bing | [optional] |
| **facetHierDepth** | **String**| Facet hierarchy depth. Number of levels to return. ex: category:1 | [optional] |
| **facetStartIndex** | **String**| Facet offset | [optional] |
| **facetPageSize** | **String**| Facet page size | [optional] |
| **facetSettings** | **String**| Deprecated | [optional] |
| **facetValueFilter** | **String**| Apply facet values as a filter. ex: category:3,price:[* TO 100] | [optional] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **sliceSearchResults** | **Boolean**| Whether to slice results or not | [optional] [default to false] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 12 and the maximum value is 200. Optional. | [optional] |
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. The default value is 0. Optional. | [optional] [default to 0] |
| **searchSettings** | **String**| The name of a SiteSearchSettings (search relevancy settings) scheme to use. Defaults to whichever Settings is marked as IsDefault&#x3D;true. | [optional] |
| **enableSearchTuningRules** | **Boolean**| Use search-tuning-rules or not | [optional] [default to true] |
| **searchTuningRuleContext** | **String**| The filters which the search tuning rules will match on. | [optional] |
| **searchTuningRuleCode** | **String**| Search-Tuning-Rule Code | [optional] |
| **responseGroups** | **String**| A list of property groups to return instead of using the granular responseFields param. ex: categories,properties,options | [optional] |
| **facetTemplateExclude** | **String**|  | [optional] |
| **facetPrefix** | **String**|  | [optional] |
| **responseOptions** | **String**|  | [optional] |
| **cursorMark** | **String**| Pass in * to begin a deep page operation. The response will include a nextCursorMark value. Pass this into the next call. Continue with this pattern until nextCursorMark is null. | [optional] |
| **facetValueSort** | **String**|  | [optional] |
| **returnUrl** | **Boolean**| Only respond with the request made to the search-engine, for one \&quot;groups\&quot; parameter value. Default is false. Optional parameter. | [optional] [default to false] |
| **mid** | **String**| Personalization Id (Monetate Id) | [optional] |
| **omitNamespace** | **Boolean**|  | [optional] |
| **campaignId** | **String**|  | [optional] |
| **merchandizingRuleCode** | **String**| Optional. Use a specific search-merchandizing-rule code if provided. | [optional] |
| **responseFields** | **String**|  | [optional] |
| **rows** | **Integer**|  | [optional] |
| **start** | **Integer**|  | [optional] |
| **q** | **String**| optional alternative to query for debugging tools | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="storefrontGetRandomAccessCursor"></a>
# **storefrontGetRandomAccessCursor**
> ProductSearchRandomAccessCursor storefrontGetRandomAccessCursor(query, filter, pageSize)

Gets list of cursors for search results

Generate a list of cursors that then allows you to retrieve all products with efficient deep paging.     Optionally provide a query and/or filter to generate a cursor for a subset of products.     After retrieving the cursor, provide a cursorMark to the cursorMark argument of the /search or /getProducts operations.     You may provide cursorMarks in any order or even in parallel operations.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductSearchApi apiInstance = new ProductSearchApi(defaultClient);
    String query = "query_example"; // String | Optional terms to search on. Only matching products will be included in the cursor.
    String filter = "filter_example"; // String | Optional set of filter expressions to filter on. Only matching products will be included in the cursor.
    Integer pageSize = 56; // Integer | 
    try {
      ProductSearchRandomAccessCursor result = apiInstance.storefrontGetRandomAccessCursor(query, filter, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductSearchApi#storefrontGetRandomAccessCursor");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**| Optional terms to search on. Only matching products will be included in the cursor. | [optional] |
| **filter** | **String**| Optional set of filter expressions to filter on. Only matching products will be included in the cursor. | [optional] |
| **pageSize** | **Integer**|  | [optional] |

### Return type

[**ProductSearchRandomAccessCursor**](ProductSearchRandomAccessCursor.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="storefrontSearch"></a>
# **storefrontSearch**
> ProductSearchResult storefrontSearch(query, filter, facetTemplate, facetTemplateSubset, facet, facetFieldRangeQuery, facetHierPrefix, facetHierValue, facetHierDepth, facetStartIndex, facetPageSize, facetSettings, facetValueFilter, sortBy, pageSize, startIndex, searchSettings, enableSearchTuningRules, searchTuningRuleContext, searchTuningRuleCode, responseGroups, facetTemplateExclude, facetPrefix, responseOptions, cursorMark, facetValueSort, defaultSort, shouldSlice, mid, omitNamespace, includeAllImages, spellcorrectOverride, useSubscriptionPricing, merchandizingRuleCode)

Search for products.

Searches the categories displayed on the storefront for products or product options that the shopper types in a search query.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductSearchApi apiInstance = new ProductSearchApi(defaultClient);
    String query = "query_example"; // String | The terms to search on.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String facetTemplate = "facetTemplate_example"; // String | 
    String facetTemplateSubset = "facetTemplateSubset_example"; // String | 
    String facet = "facet_example"; // String | 
    String facetFieldRangeQuery = "facetFieldRangeQuery_example"; // String | 
    String facetHierPrefix = "facetHierPrefix_example"; // String | 
    String facetHierValue = "facetHierValue_example"; // String | 
    String facetHierDepth = "facetHierDepth_example"; // String | 
    String facetStartIndex = "facetStartIndex_example"; // String | 
    String facetPageSize = "facetPageSize_example"; // String | 
    String facetSettings = "facetSettings_example"; // String | 
    String facetValueFilter = "facetValueFilter_example"; // String | 
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    Integer pageSize = 56; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 12 and the maximum value is 200. Optional.
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. The default value is 0. Optional.
    String searchSettings = "searchSettings_example"; // String | 
    Boolean enableSearchTuningRules = true; // Boolean | 
    String searchTuningRuleContext = "searchTuningRuleContext_example"; // String | 
    String searchTuningRuleCode = "searchTuningRuleCode_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    String facetTemplateExclude = "facetTemplateExclude_example"; // String | 
    String facetPrefix = "facetPrefix_example"; // String | 
    String responseOptions = "responseOptions_example"; // String | 
    String cursorMark = "cursorMark_example"; // String | Pass in * to begin a deep page operation. The response will include a nextCursorMark value. Pass this into the next call. Continue with this pattern until nextCursorMark is null.
    String facetValueSort = "facetValueSort_example"; // String | 
    String defaultSort = "defaultSort_example"; // String | 
    Boolean shouldSlice = true; // Boolean | 
    String mid = "mid_example"; // String | 
    Boolean omitNamespace = true; // Boolean | 
    Boolean includeAllImages = false; // Boolean | Optional. If true return all images instead of default images.
    String spellcorrectOverride = "Default"; // String | 
    Boolean useSubscriptionPricing = false; // Boolean | 
    String merchandizingRuleCode = "merchandizingRuleCode_example"; // String | Optional. Use a specific search-merchandizing-rule code if provided.
    try {
      ProductSearchResult result = apiInstance.storefrontSearch(query, filter, facetTemplate, facetTemplateSubset, facet, facetFieldRangeQuery, facetHierPrefix, facetHierValue, facetHierDepth, facetStartIndex, facetPageSize, facetSettings, facetValueFilter, sortBy, pageSize, startIndex, searchSettings, enableSearchTuningRules, searchTuningRuleContext, searchTuningRuleCode, responseGroups, facetTemplateExclude, facetPrefix, responseOptions, cursorMark, facetValueSort, defaultSort, shouldSlice, mid, omitNamespace, includeAllImages, spellcorrectOverride, useSubscriptionPricing, merchandizingRuleCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductSearchApi#storefrontSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**| The terms to search on. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **facetTemplate** | **String**|  | [optional] |
| **facetTemplateSubset** | **String**|  | [optional] |
| **facet** | **String**|  | [optional] |
| **facetFieldRangeQuery** | **String**|  | [optional] |
| **facetHierPrefix** | **String**|  | [optional] |
| **facetHierValue** | **String**|  | [optional] |
| **facetHierDepth** | **String**|  | [optional] |
| **facetStartIndex** | **String**|  | [optional] |
| **facetPageSize** | **String**|  | [optional] |
| **facetSettings** | **String**|  | [optional] |
| **facetValueFilter** | **String**|  | [optional] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 12 and the maximum value is 200. Optional. | [optional] |
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. The default value is 0. Optional. | [optional] [default to 0] |
| **searchSettings** | **String**|  | [optional] |
| **enableSearchTuningRules** | **Boolean**|  | [optional] [default to true] |
| **searchTuningRuleContext** | **String**|  | [optional] |
| **searchTuningRuleCode** | **String**|  | [optional] |
| **responseGroups** | **String**|  | [optional] |
| **facetTemplateExclude** | **String**|  | [optional] |
| **facetPrefix** | **String**|  | [optional] |
| **responseOptions** | **String**|  | [optional] |
| **cursorMark** | **String**| Pass in * to begin a deep page operation. The response will include a nextCursorMark value. Pass this into the next call. Continue with this pattern until nextCursorMark is null. | [optional] |
| **facetValueSort** | **String**|  | [optional] |
| **defaultSort** | **String**|  | [optional] |
| **shouldSlice** | **Boolean**|  | [optional] |
| **mid** | **String**|  | [optional] |
| **omitNamespace** | **Boolean**|  | [optional] |
| **includeAllImages** | **Boolean**| Optional. If true return all images instead of default images. | [optional] [default to false] |
| **spellcorrectOverride** | **String**|  | [optional] [default to Default] |
| **useSubscriptionPricing** | **Boolean**|  | [optional] [default to false] |
| **merchandizingRuleCode** | **String**| Optional. Use a specific search-merchandizing-rule code if provided. | [optional] |

### Return type

[**ProductSearchResult**](ProductSearchResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="storefrontSiteSearch"></a>
# **storefrontSiteSearch**
> ProductSearchResult storefrontSiteSearch(query, filter, facetTemplate, facetTemplateSubset, facet, facetFieldRangeQuery, facetHierPrefix, facetHierValue, facetHierDepth, facetStartIndex, facetPageSize, facetSettings, facetValueFilter, sortBy, pageSize, startIndex, searchSettings, enableSearchTuningRules, searchTuningRuleContext, searchTuningRuleCode, responseGroups, facetTemplateExclude, facetPrefix, responseOptions, cursorMark, facetValueSort, defaultSort, shouldSlice, mid, fieldList, omitNamespace, includeAllImages, spellcorrectOverride, useSubscriptionPricing, merchandizingRuleCode)

Site Search - Searches the items displayed on the storefront.

Site Search - Searches the items displayed on the storefront.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductSearchApi apiInstance = new ProductSearchApi(defaultClient);
    String query = "query_example"; // String | The terms to search on.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String facetTemplate = "facetTemplate_example"; // String | 
    String facetTemplateSubset = "facetTemplateSubset_example"; // String | 
    String facet = "facet_example"; // String | 
    String facetFieldRangeQuery = "facetFieldRangeQuery_example"; // String | 
    String facetHierPrefix = "facetHierPrefix_example"; // String | 
    String facetHierValue = "facetHierValue_example"; // String | 
    String facetHierDepth = "facetHierDepth_example"; // String | 
    String facetStartIndex = "facetStartIndex_example"; // String | 
    String facetPageSize = "facetPageSize_example"; // String | 
    String facetSettings = "facetSettings_example"; // String | 
    String facetValueFilter = "facetValueFilter_example"; // String | 
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    Integer pageSize = 56; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 12 and the maximum value is 200. Optional.
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. The default value is 0. Optional.
    String searchSettings = "searchSettings_example"; // String | 
    Boolean enableSearchTuningRules = true; // Boolean | 
    String searchTuningRuleContext = "searchTuningRuleContext_example"; // String | 
    String searchTuningRuleCode = "searchTuningRuleCode_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    String facetTemplateExclude = "facetTemplateExclude_example"; // String | 
    String facetPrefix = "facetPrefix_example"; // String | 
    String responseOptions = "responseOptions_example"; // String | 
    String cursorMark = "cursorMark_example"; // String | Pass in * to begin a deep page operation. The response will include a nextCursorMark value. Pass this into the next call. Continue with this pattern until nextCursorMark is null.
    String facetValueSort = "facetValueSort_example"; // String | 
    String defaultSort = "defaultSort_example"; // String | 
    Boolean shouldSlice = true; // Boolean | 
    String mid = "mid_example"; // String | 
    String fieldList = "fieldList_example"; // String | 
    Boolean omitNamespace = true; // Boolean | 
    Boolean includeAllImages = false; // Boolean | Optional. If true return all images instead of default images.
    String spellcorrectOverride = "Default"; // String | 
    Boolean useSubscriptionPricing = false; // Boolean | 
    String merchandizingRuleCode = "merchandizingRuleCode_example"; // String | Optional. Use a specific search-merchandizing-rule code if provided.
    try {
      ProductSearchResult result = apiInstance.storefrontSiteSearch(query, filter, facetTemplate, facetTemplateSubset, facet, facetFieldRangeQuery, facetHierPrefix, facetHierValue, facetHierDepth, facetStartIndex, facetPageSize, facetSettings, facetValueFilter, sortBy, pageSize, startIndex, searchSettings, enableSearchTuningRules, searchTuningRuleContext, searchTuningRuleCode, responseGroups, facetTemplateExclude, facetPrefix, responseOptions, cursorMark, facetValueSort, defaultSort, shouldSlice, mid, fieldList, omitNamespace, includeAllImages, spellcorrectOverride, useSubscriptionPricing, merchandizingRuleCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductSearchApi#storefrontSiteSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**| The terms to search on. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **facetTemplate** | **String**|  | [optional] |
| **facetTemplateSubset** | **String**|  | [optional] |
| **facet** | **String**|  | [optional] |
| **facetFieldRangeQuery** | **String**|  | [optional] |
| **facetHierPrefix** | **String**|  | [optional] |
| **facetHierValue** | **String**|  | [optional] |
| **facetHierDepth** | **String**|  | [optional] |
| **facetStartIndex** | **String**|  | [optional] |
| **facetPageSize** | **String**|  | [optional] |
| **facetSettings** | **String**|  | [optional] |
| **facetValueFilter** | **String**|  | [optional] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 12 and the maximum value is 200. Optional. | [optional] |
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. The default value is 0. Optional. | [optional] [default to 0] |
| **searchSettings** | **String**|  | [optional] |
| **enableSearchTuningRules** | **Boolean**|  | [optional] [default to true] |
| **searchTuningRuleContext** | **String**|  | [optional] |
| **searchTuningRuleCode** | **String**|  | [optional] |
| **responseGroups** | **String**|  | [optional] |
| **facetTemplateExclude** | **String**|  | [optional] |
| **facetPrefix** | **String**|  | [optional] |
| **responseOptions** | **String**|  | [optional] |
| **cursorMark** | **String**| Pass in * to begin a deep page operation. The response will include a nextCursorMark value. Pass this into the next call. Continue with this pattern until nextCursorMark is null. | [optional] |
| **facetValueSort** | **String**|  | [optional] |
| **defaultSort** | **String**|  | [optional] |
| **shouldSlice** | **Boolean**|  | [optional] |
| **mid** | **String**|  | [optional] |
| **fieldList** | **String**|  | [optional] |
| **omitNamespace** | **Boolean**|  | [optional] |
| **includeAllImages** | **Boolean**| Optional. If true return all images instead of default images. | [optional] [default to false] |
| **spellcorrectOverride** | **String**|  | [optional] [default to Default] |
| **useSubscriptionPricing** | **Boolean**|  | [optional] [default to false] |
| **merchandizingRuleCode** | **String**| Optional. Use a specific search-merchandizing-rule code if provided. | [optional] |

### Return type

[**ProductSearchResult**](ProductSearchResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="storefrontSuggest"></a>
# **storefrontSuggest**
> SearchSuggestionResult storefrontSuggest(query, groups, pageSize, mid, filter)

Gets suggested search terms

Suggests possible search terms as the shopper enters search text.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductSearchApi apiInstance = new ProductSearchApi(defaultClient);
    String query = "query_example"; // String | Comma delimited list of suggestion groups that should be returned. The default is everything
    String groups = "groups_example"; // String | 
    Integer pageSize = 56; // Integer | Indicates the maximum number of entities to return from a query. The default value is 10 and the maximum value is 200. Optional.
    String mid = "mid_example"; // String | 
    String filter = "filter_example"; // String | 
    try {
      SearchSuggestionResult result = apiInstance.storefrontSuggest(query, groups, pageSize, mid, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductSearchApi#storefrontSuggest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**| Comma delimited list of suggestion groups that should be returned. The default is everything | [optional] |
| **groups** | **String**|  | [optional] |
| **pageSize** | **Integer**| Indicates the maximum number of entities to return from a query. The default value is 10 and the maximum value is 200. Optional. | [optional] |
| **mid** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |

### Return type

[**SearchSuggestionResult**](SearchSuggestionResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="storefrontSuggest2"></a>
# **storefrontSuggest2**
> SearchSuggestionResult storefrontSuggest2(query, groups, pageSize, searchSettingsName, mid, filter)

Gets suggested search terms

Suggests possible search terms as the shopper enters search text.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductSearchApi apiInstance = new ProductSearchApi(defaultClient);
    String query = "query_example"; // String | Comma delimited list of suggestion groups that should be returned. The default is everything
    String groups = "groups_example"; // String | 
    Integer pageSize = 56; // Integer | Indicates the maximum number of entities to return from a query. The default value is 10 and the maximum value is 200. Optional.
    String searchSettingsName = "searchSettingsName_example"; // String | 
    String mid = "mid_example"; // String | 
    String filter = "filter_example"; // String | 
    try {
      SearchSuggestionResult result = apiInstance.storefrontSuggest2(query, groups, pageSize, searchSettingsName, mid, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductSearchApi#storefrontSuggest2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**| Comma delimited list of suggestion groups that should be returned. The default is everything | [optional] |
| **groups** | **String**|  | [optional] |
| **pageSize** | **Integer**| Indicates the maximum number of entities to return from a query. The default value is 10 and the maximum value is 200. Optional. | [optional] |
| **searchSettingsName** | **String**|  | [optional] |
| **mid** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |

### Return type

[**SearchSuggestionResult**](SearchSuggestionResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="storefrontVisualSearch"></a>
# **storefrontVisualSearch**
> VisualSearchResult storefrontVisualSearch(searchTerm, filters, returnfields, searchfields, ignoregrouping, numResults, pageNumber, applicationId, catalogId, sessionId, trackingId, apiKey, revision, cip, displayDebug)

Type ahead - Searches the items displayed on the storefront.

Type ahead - Searches the items displayed on the storefront.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductSearchApi apiInstance = new ProductSearchApi(defaultClient);
    String searchTerm = "searchTerm_example"; // String | 
    List<RequestFilter> filters = Arrays.asList(); // List<RequestFilter> | 
    List<String> returnfields = Arrays.asList(); // List<String> | 
    List<String> searchfields = Arrays.asList(); // List<String> | 
    Boolean ignoregrouping = true; // Boolean | 
    Integer numResults = 56; // Integer | 
    Integer pageNumber = 56; // Integer | 
    String applicationId = "applicationId_example"; // String | 
    String catalogId = "catalogId_example"; // String | 
    String sessionId = "sessionId_example"; // String | 
    String trackingId = "trackingId_example"; // String | 
    String apiKey = "apiKey_example"; // String | 
    String revision = "revision_example"; // String | 
    String cip = "cip_example"; // String | 
    Boolean displayDebug = true; // Boolean | 
    try {
      VisualSearchResult result = apiInstance.storefrontVisualSearch(searchTerm, filters, returnfields, searchfields, ignoregrouping, numResults, pageNumber, applicationId, catalogId, sessionId, trackingId, apiKey, revision, cip, displayDebug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductSearchApi#storefrontVisualSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **searchTerm** | **String**|  | |
| **filters** | [**List&lt;RequestFilter&gt;**](RequestFilter.md)|  | [optional] |
| **returnfields** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **searchfields** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ignoregrouping** | **Boolean**|  | [optional] |
| **numResults** | **Integer**|  | [optional] |
| **pageNumber** | **Integer**|  | [optional] |
| **applicationId** | **String**|  | [optional] |
| **catalogId** | **String**|  | [optional] |
| **sessionId** | **String**|  | [optional] |
| **trackingId** | **String**|  | [optional] |
| **apiKey** | **String**|  | [optional] |
| **revision** | **String**|  | [optional] |
| **cip** | **String**|  | [optional] |
| **displayDebug** | **Boolean**|  | [optional] |

### Return type

[**VisualSearchResult**](VisualSearchResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="suggestDebug"></a>
# **suggestDebug**
> suggestDebug(groups, query, pageSize, searchSettingsName, mid, filter, campaignId, returnUrl)

Debugging relevancy for the Suggest endpoint

Comma delimited list of suggestion groups that should be returned. The default is everything. e.g. categories, products.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductSearchApi apiInstance = new ProductSearchApi(defaultClient);
    String groups = "groups_example"; // String | Comma delimited list of suggestion groups that should be returned. The default is everything. e.g. categories, products
    String query = "query_example"; // String | The terms to search on.
    Integer pageSize = 56; // Integer | Indicates the maximum number of entities to return from a query. The default value is 10 and the maximum value is 200. Optional.
    String searchSettingsName = "searchSettingsName_example"; // String | Specific Search Configuration. Optional parameter
    String mid = "mid_example"; // String | Session Id. Optional parameter
    String filter = "filter_example"; // String | 
    String campaignId = "campaignId_example"; // String | Used to debug with a specific campaign. Optional parameter
    Boolean returnUrl = false; // Boolean | Only respond with the request made to the search-engine, for one \"groups\" parameter value. Default is false. Optional parameter.
    try {
      apiInstance.suggestDebug(groups, query, pageSize, searchSettingsName, mid, filter, campaignId, returnUrl);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductSearchApi#suggestDebug");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groups** | **String**| Comma delimited list of suggestion groups that should be returned. The default is everything. e.g. categories, products | [optional] |
| **query** | **String**| The terms to search on. | [optional] |
| **pageSize** | **Integer**| Indicates the maximum number of entities to return from a query. The default value is 10 and the maximum value is 200. Optional. | [optional] |
| **searchSettingsName** | **String**| Specific Search Configuration. Optional parameter | [optional] |
| **mid** | **String**| Session Id. Optional parameter | [optional] |
| **filter** | **String**|  | [optional] |
| **campaignId** | **String**| Used to debug with a specific campaign. Optional parameter | [optional] |
| **returnUrl** | **Boolean**| Only respond with the request made to the search-engine, for one \&quot;groups\&quot; parameter value. Default is false. Optional parameter. | [optional] [default to false] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

