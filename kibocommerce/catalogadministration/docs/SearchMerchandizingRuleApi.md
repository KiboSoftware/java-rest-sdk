# SearchMerchandizingRuleApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cloneSearchMerchandizingRule**](SearchMerchandizingRuleApi.md#cloneSearchMerchandizingRule) | **GET** /commerce/catalog/admin/searchmerchandizingrules/{code}/clone | Clone Search Merchandizing Rule |
| [**createSearchMerchandizingRule**](SearchMerchandizingRuleApi.md#createSearchMerchandizingRule) | **POST** /commerce/catalog/admin/searchmerchandizingrules | Create Search Merchandizing Rule |
| [**deleteSearchMerchandizingRule**](SearchMerchandizingRuleApi.md#deleteSearchMerchandizingRule) | **DELETE** /commerce/catalog/admin/searchmerchandizingrules/{code} | Delete Search Merchandizing Rule |
| [**getSearchMerchandizingRule**](SearchMerchandizingRuleApi.md#getSearchMerchandizingRule) | **GET** /commerce/catalog/admin/searchmerchandizingrules/{code} | Get Search Merchandizing Rule |
| [**getSearchMerchandizingRules**](SearchMerchandizingRuleApi.md#getSearchMerchandizingRules) | **GET** /commerce/catalog/admin/searchmerchandizingrules | Get Search Merchandizing Rules |
| [**updateSearchMerchandizingRule**](SearchMerchandizingRuleApi.md#updateSearchMerchandizingRule) | **PUT** /commerce/catalog/admin/searchmerchandizingrules/{code} | Update Search Merchandizing Rule |


<a name="cloneSearchMerchandizingRule"></a>
# **cloneSearchMerchandizingRule**
> CatalogAdminsSearchMerchandizingRule cloneSearchMerchandizingRule(code)

Clone Search Merchandizing Rule

Clone Search Merchandizing Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchMerchandizingRuleApi;

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

    SearchMerchandizingRuleApi apiInstance = new SearchMerchandizingRuleApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      CatalogAdminsSearchMerchandizingRule result = apiInstance.cloneSearchMerchandizingRule(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchMerchandizingRuleApi#cloneSearchMerchandizingRule");
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
| **code** | **String**|  | |

### Return type

[**CatalogAdminsSearchMerchandizingRule**](CatalogAdminsSearchMerchandizingRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createSearchMerchandizingRule"></a>
# **createSearchMerchandizingRule**
> CatalogAdminsSearchMerchandizingRule createSearchMerchandizingRule(catalogAdminsSearchMerchandizingRule)

Create Search Merchandizing Rule

Create Search Merchandizing Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchMerchandizingRuleApi;

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

    SearchMerchandizingRuleApi apiInstance = new SearchMerchandizingRuleApi(defaultClient);
    CatalogAdminsSearchMerchandizingRule catalogAdminsSearchMerchandizingRule = new CatalogAdminsSearchMerchandizingRule(); // CatalogAdminsSearchMerchandizingRule | 
    try {
      CatalogAdminsSearchMerchandizingRule result = apiInstance.createSearchMerchandizingRule(catalogAdminsSearchMerchandizingRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchMerchandizingRuleApi#createSearchMerchandizingRule");
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
| **catalogAdminsSearchMerchandizingRule** | [**CatalogAdminsSearchMerchandizingRule**](CatalogAdminsSearchMerchandizingRule.md)|  | [optional] |

### Return type

[**CatalogAdminsSearchMerchandizingRule**](CatalogAdminsSearchMerchandizingRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteSearchMerchandizingRule"></a>
# **deleteSearchMerchandizingRule**
> deleteSearchMerchandizingRule(code)

Delete Search Merchandizing Rule

Delete Search Merchandizing Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchMerchandizingRuleApi;

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

    SearchMerchandizingRuleApi apiInstance = new SearchMerchandizingRuleApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      apiInstance.deleteSearchMerchandizingRule(code);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchMerchandizingRuleApi#deleteSearchMerchandizingRule");
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
| **code** | **String**|  | |

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

<a name="getSearchMerchandizingRule"></a>
# **getSearchMerchandizingRule**
> CatalogAdminsSearchMerchandizingRule getSearchMerchandizingRule(code)

Get Search Merchandizing Rule

Get Search Merchandizing Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchMerchandizingRuleApi;

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

    SearchMerchandizingRuleApi apiInstance = new SearchMerchandizingRuleApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      CatalogAdminsSearchMerchandizingRule result = apiInstance.getSearchMerchandizingRule(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchMerchandizingRuleApi#getSearchMerchandizingRule");
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
| **code** | **String**|  | |

### Return type

[**CatalogAdminsSearchMerchandizingRule**](CatalogAdminsSearchMerchandizingRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSearchMerchandizingRules"></a>
# **getSearchMerchandizingRules**
> SearchMerchandizingRuleCollection getSearchMerchandizingRules(startIndex, pageSize, sortBy, filter, responseGroups, q)

Get Search Merchandizing Rules

Get Search Merchandizing Rules

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchMerchandizingRuleApi;

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

    SearchMerchandizingRuleApi apiInstance = new SearchMerchandizingRuleApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    String q = "q_example"; // String | 
    try {
      SearchMerchandizingRuleCollection result = apiInstance.getSearchMerchandizingRules(startIndex, pageSize, sortBy, filter, responseGroups, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchMerchandizingRuleApi#getSearchMerchandizingRules");
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
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 0] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **responseGroups** | **String**|  | [optional] |
| **q** | **String**|  | [optional] |

### Return type

[**SearchMerchandizingRuleCollection**](SearchMerchandizingRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSearchMerchandizingRule"></a>
# **updateSearchMerchandizingRule**
> CatalogAdminsSearchMerchandizingRule updateSearchMerchandizingRule(code, catalogAdminsSearchMerchandizingRule)

Update Search Merchandizing Rule

Update Search Merchandizing Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchMerchandizingRuleApi;

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

    SearchMerchandizingRuleApi apiInstance = new SearchMerchandizingRuleApi(defaultClient);
    String code = "code_example"; // String | 
    CatalogAdminsSearchMerchandizingRule catalogAdminsSearchMerchandizingRule = new CatalogAdminsSearchMerchandizingRule(); // CatalogAdminsSearchMerchandizingRule | 
    try {
      CatalogAdminsSearchMerchandizingRule result = apiInstance.updateSearchMerchandizingRule(code, catalogAdminsSearchMerchandizingRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchMerchandizingRuleApi#updateSearchMerchandizingRule");
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
| **code** | **String**|  | |
| **catalogAdminsSearchMerchandizingRule** | [**CatalogAdminsSearchMerchandizingRule**](CatalogAdminsSearchMerchandizingRule.md)|  | [optional] |

### Return type

[**CatalogAdminsSearchMerchandizingRule**](CatalogAdminsSearchMerchandizingRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

