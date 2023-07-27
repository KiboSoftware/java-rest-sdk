# SearchTuningRulesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSearchTuningRule**](SearchTuningRulesApi.md#addSearchTuningRule) | **POST** /commerce/catalog/admin/search/searchtuningrules | Add search tuning rule |
| [**deleteSearchTuningRule**](SearchTuningRulesApi.md#deleteSearchTuningRule) | **DELETE** /commerce/catalog/admin/search/searchtuningrules/{searchTuningRuleCode} | Delete search tuning rule |
| [**getSearchTuningRule**](SearchTuningRulesApi.md#getSearchTuningRule) | **GET** /commerce/catalog/admin/search/searchtuningrules/{searchTuningRuleCode} | Get search tuning rule |
| [**getSearchTuningRuleSortFields**](SearchTuningRulesApi.md#getSearchTuningRuleSortFields) | **GET** /commerce/catalog/admin/search/searchtuningrulesortfields | Get search tuning rule sort fields |
| [**getSearchTuningRules**](SearchTuningRulesApi.md#getSearchTuningRules) | **GET** /commerce/catalog/admin/search/searchtuningrules | Get search tuning rules |
| [**updateSearchTuningRule**](SearchTuningRulesApi.md#updateSearchTuningRule) | **PUT** /commerce/catalog/admin/search/searchtuningrules/{searchTuningRuleCode} | Update search tuning rule |
| [**updateSearchTuningRuleSortFields**](SearchTuningRulesApi.md#updateSearchTuningRuleSortFields) | **POST** /commerce/catalog/admin/search/searchtuningrulesortfields | Update search tuning rule sort fields |


<a name="addSearchTuningRule"></a>
# **addSearchTuningRule**
> SearchTuningRule addSearchTuningRule(searchTuningRule)

Add search tuning rule

Add search tuning rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchTuningRulesApi;

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

    SearchTuningRulesApi apiInstance = new SearchTuningRulesApi(defaultClient);
    SearchTuningRule searchTuningRule = new SearchTuningRule(); // SearchTuningRule | 
    try {
      SearchTuningRule result = apiInstance.addSearchTuningRule(searchTuningRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchTuningRulesApi#addSearchTuningRule");
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
| **searchTuningRule** | [**SearchTuningRule**](SearchTuningRule.md)|  | [optional] |

### Return type

[**SearchTuningRule**](SearchTuningRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteSearchTuningRule"></a>
# **deleteSearchTuningRule**
> deleteSearchTuningRule(searchTuningRuleCode)

Delete search tuning rule

Delete search tuning rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchTuningRulesApi;

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

    SearchTuningRulesApi apiInstance = new SearchTuningRulesApi(defaultClient);
    String searchTuningRuleCode = "searchTuningRuleCode_example"; // String | 
    try {
      apiInstance.deleteSearchTuningRule(searchTuningRuleCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchTuningRulesApi#deleteSearchTuningRule");
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
| **searchTuningRuleCode** | **String**|  | |

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

<a name="getSearchTuningRule"></a>
# **getSearchTuningRule**
> SearchTuningRule getSearchTuningRule(searchTuningRuleCode)

Get search tuning rule

Get search tuning rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchTuningRulesApi;

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

    SearchTuningRulesApi apiInstance = new SearchTuningRulesApi(defaultClient);
    String searchTuningRuleCode = "searchTuningRuleCode_example"; // String | 
    try {
      SearchTuningRule result = apiInstance.getSearchTuningRule(searchTuningRuleCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchTuningRulesApi#getSearchTuningRule");
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
| **searchTuningRuleCode** | **String**|  | |

### Return type

[**SearchTuningRule**](SearchTuningRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSearchTuningRuleSortFields"></a>
# **getSearchTuningRuleSortFields**
> SearchTuningRuleSortFields getSearchTuningRuleSortFields()

Get search tuning rule sort fields

Get search tuning rule sort fields

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchTuningRulesApi;

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

    SearchTuningRulesApi apiInstance = new SearchTuningRulesApi(defaultClient);
    try {
      SearchTuningRuleSortFields result = apiInstance.getSearchTuningRuleSortFields();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchTuningRulesApi#getSearchTuningRuleSortFields");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SearchTuningRuleSortFields**](SearchTuningRuleSortFields.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSearchTuningRules"></a>
# **getSearchTuningRules**
> SearchTuningRuleCollection getSearchTuningRules(startIndex, pageSize, sortBy, filter, responseGroups)

Get search tuning rules

Get search tuning rules

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchTuningRulesApi;

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

    SearchTuningRulesApi apiInstance = new SearchTuningRulesApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    try {
      SearchTuningRuleCollection result = apiInstance.getSearchTuningRules(startIndex, pageSize, sortBy, filter, responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchTuningRulesApi#getSearchTuningRules");
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

### Return type

[**SearchTuningRuleCollection**](SearchTuningRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSearchTuningRule"></a>
# **updateSearchTuningRule**
> SearchTuningRule updateSearchTuningRule(searchTuningRuleCode, searchTuningRule)

Update search tuning rule

Update search tuning rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchTuningRulesApi;

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

    SearchTuningRulesApi apiInstance = new SearchTuningRulesApi(defaultClient);
    String searchTuningRuleCode = "searchTuningRuleCode_example"; // String | 
    SearchTuningRule searchTuningRule = new SearchTuningRule(); // SearchTuningRule | 
    try {
      SearchTuningRule result = apiInstance.updateSearchTuningRule(searchTuningRuleCode, searchTuningRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchTuningRulesApi#updateSearchTuningRule");
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
| **searchTuningRuleCode** | **String**|  | |
| **searchTuningRule** | [**SearchTuningRule**](SearchTuningRule.md)|  | [optional] |

### Return type

[**SearchTuningRule**](SearchTuningRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSearchTuningRuleSortFields"></a>
# **updateSearchTuningRuleSortFields**
> SearchTuningRuleSortFields updateSearchTuningRuleSortFields(searchTuningRuleSortFields)

Update search tuning rule sort fields

Update search tuning rule sort fields

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchTuningRulesApi;

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

    SearchTuningRulesApi apiInstance = new SearchTuningRulesApi(defaultClient);
    SearchTuningRuleSortFields searchTuningRuleSortFields = new SearchTuningRuleSortFields(); // SearchTuningRuleSortFields | 
    try {
      SearchTuningRuleSortFields result = apiInstance.updateSearchTuningRuleSortFields(searchTuningRuleSortFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchTuningRulesApi#updateSearchTuningRuleSortFields");
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
| **searchTuningRuleSortFields** | [**SearchTuningRuleSortFields**](SearchTuningRuleSortFields.md)|  | [optional] |

### Return type

[**SearchTuningRuleSortFields**](SearchTuningRuleSortFields.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

