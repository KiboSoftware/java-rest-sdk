# SearchRedirectApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSearchRedirect**](SearchRedirectApi.md#addSearchRedirect) | **POST** /commerce/catalog/admin/search/redirect | Add search redirect |
| [**deleteSearchRedirect**](SearchRedirectApi.md#deleteSearchRedirect) | **DELETE** /commerce/catalog/admin/search/redirect/{redirectId} | Delete search redirect |
| [**getSearchRedirect**](SearchRedirectApi.md#getSearchRedirect) | **GET** /commerce/catalog/admin/search/redirect/{redirectId} | Get search redirect |
| [**getSearchRedirects**](SearchRedirectApi.md#getSearchRedirects) | **GET** /commerce/catalog/admin/search/redirect | Get search redirects |
| [**updateSearchRedirect**](SearchRedirectApi.md#updateSearchRedirect) | **PUT** /commerce/catalog/admin/search/redirect/{redirectId} | Update search redirect |


<a name="addSearchRedirect"></a>
# **addSearchRedirect**
> SearchRedirect addSearchRedirect(fromSystemDefault, searchRedirect)

Add search redirect

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchRedirectApi apiInstance = new SearchRedirectApi(defaultClient);
    Boolean fromSystemDefault = false; // Boolean | 
    SearchRedirect searchRedirect = new SearchRedirect(); // SearchRedirect | 
    try {
      SearchRedirect result = apiInstance.addSearchRedirect(fromSystemDefault, searchRedirect);
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
| **searchRedirect** | [**SearchRedirect**](SearchRedirect.md)|  | [optional] |

### Return type

[**SearchRedirect**](SearchRedirect.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteSearchRedirect"></a>
# **deleteSearchRedirect**
> SearchRedirect deleteSearchRedirect(redirectId)

Delete search redirect

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSearchRedirect"></a>
# **getSearchRedirect**
> SearchRedirect getSearchRedirect(redirectId)

Get search redirect

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchRedirectApi apiInstance = new SearchRedirectApi(defaultClient);
    String redirectId = "redirectId_example"; // String | 
    try {
      SearchRedirect result = apiInstance.getSearchRedirect(redirectId);
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

### Return type

[**SearchRedirect**](SearchRedirect.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSearchRedirects"></a>
# **getSearchRedirects**
> SearchRedirectCollection getSearchRedirects()

Get search redirects

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchRedirectApi apiInstance = new SearchRedirectApi(defaultClient);
    try {
      SearchRedirectCollection result = apiInstance.getSearchRedirects();
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
This endpoint does not need any parameter.

### Return type

[**SearchRedirectCollection**](SearchRedirectCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSearchRedirect"></a>
# **updateSearchRedirect**
> SearchRedirect updateSearchRedirect(redirectId, searchRedirect)

Update search redirect

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchRedirectApi apiInstance = new SearchRedirectApi(defaultClient);
    String redirectId = "redirectId_example"; // String | 
    SearchRedirect searchRedirect = new SearchRedirect(); // SearchRedirect | 
    try {
      SearchRedirect result = apiInstance.updateSearchRedirect(redirectId, searchRedirect);
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
| **searchRedirect** | [**SearchRedirect**](SearchRedirect.md)|  | [optional] |

### Return type

[**SearchRedirect**](SearchRedirect.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

