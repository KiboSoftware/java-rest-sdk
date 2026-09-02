# SearchRedirectApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSearchRedirect**](SearchRedirectApi.md#addSearchRedirect) | **POST** /commerce/catalog/admin/search/redirect | Add Search Redirect |
| [**deleteSearchRedirect**](SearchRedirectApi.md#deleteSearchRedirect) | **DELETE** /commerce/catalog/admin/search/redirect/{redirectId} | Delete Search Redirect |
| [**getSearchRedirect**](SearchRedirectApi.md#getSearchRedirect) | **GET** /commerce/catalog/admin/search/redirect/{redirectId} | Get Search Redirect |
| [**getSearchRedirects**](SearchRedirectApi.md#getSearchRedirects) | **GET** /commerce/catalog/admin/search/redirect | Get Search Redirects |
| [**updateSearchRedirect**](SearchRedirectApi.md#updateSearchRedirect) | **PUT** /commerce/catalog/admin/search/redirect/{redirectId} | Update Search Redirect |


<a name="addSearchRedirect"></a>
# **addSearchRedirect**
> SearchRedirect addSearchRedirect(fromSystemDefault, responseFields, searchRedirect)

Add Search Redirect

Adds a search redirect for a specific site.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchRedirectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchRedirectApi apiInstance = new SearchRedirectApi(defaultClient);
    Boolean fromSystemDefault = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SearchRedirect searchRedirect = new SearchRedirect(); // SearchRedirect | 
    try {
      SearchRedirect result = apiInstance.addSearchRedirect(fromSystemDefault, responseFields, searchRedirect);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchRedirectApi#addSearchRedirect");
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
| **fromSystemDefault** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **searchRedirect** | [**SearchRedirect**](SearchRedirect.md)|  | [optional] |

### Return type

[**SearchRedirect**](SearchRedirect.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteSearchRedirect"></a>
# **deleteSearchRedirect**
> SearchRedirect deleteSearchRedirect(redirectId)

Delete Search Redirect

Deletes a specific redirect for a site.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchRedirectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchRedirectApi apiInstance = new SearchRedirectApi(defaultClient);
    String redirectId = "redirectId_example"; // String | 
    try {
      SearchRedirect result = apiInstance.deleteSearchRedirect(redirectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchRedirectApi#deleteSearchRedirect");
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
| **redirectId** | **String**|  | |

### Return type

[**SearchRedirect**](SearchRedirect.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSearchRedirect"></a>
# **getSearchRedirect**
> SearchRedirect getSearchRedirect(redirectId, responseFields)

Get Search Redirect

Get search redirect by redirect id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchRedirectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchRedirectApi apiInstance = new SearchRedirectApi(defaultClient);
    String redirectId = "redirectId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SearchRedirect result = apiInstance.getSearchRedirect(redirectId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchRedirectApi#getSearchRedirect");
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
| **redirectId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SearchRedirect**](SearchRedirect.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSearchRedirects"></a>
# **getSearchRedirects**
> SearchRedirectCollection getSearchRedirects(responseFields)

Get Search Redirects

Get search redirect list.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchRedirectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchRedirectApi apiInstance = new SearchRedirectApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SearchRedirectCollection result = apiInstance.getSearchRedirects(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchRedirectApi#getSearchRedirects");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SearchRedirectCollection**](SearchRedirectCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSearchRedirect"></a>
# **updateSearchRedirect**
> SearchRedirect updateSearchRedirect(redirectId, responseFields, searchRedirect)

Update Search Redirect

Update a search redirect for a specific site.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchRedirectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchRedirectApi apiInstance = new SearchRedirectApi(defaultClient);
    String redirectId = "redirectId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SearchRedirect searchRedirect = new SearchRedirect(); // SearchRedirect | 
    try {
      SearchRedirect result = apiInstance.updateSearchRedirect(redirectId, responseFields, searchRedirect);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchRedirectApi#updateSearchRedirect");
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
| **redirectId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **searchRedirect** | [**SearchRedirect**](SearchRedirect.md)|  | [optional] |

### Return type

[**SearchRedirect**](SearchRedirect.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

