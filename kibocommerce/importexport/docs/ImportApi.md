# ImportApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callList**](ImportApi.md#callList) | **GET** /platform/data/import | List |
| [**create**](ImportApi.md#create) | **POST** /platform/data/import | Create |
| [**delete**](ImportApi.md#delete) | **DELETE** /platform/data/import/{id} | Delete |
| [**get**](ImportApi.md#get) | **GET** /platform/data/import/{id} | Get |


<a name="callList"></a>
# **callList**
> List&lt;ImportJob&gt; callList(startIndex, pageSize, filter)

List

List

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.ImportApi;

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

    ImportApi apiInstance = new ImportApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String filter = "filter_example"; // String | 
    try {
      List<ImportJob> result = apiInstance.callList(startIndex, pageSize, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#callList");
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
| **filter** | **String**|  | [optional] |

### Return type

[**List&lt;ImportJob&gt;**](ImportJob.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="create"></a>
# **create**
> ImportJob create(importJob)

Create

Create

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.ImportApi;

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

    ImportApi apiInstance = new ImportApi(defaultClient);
    ImportJob importJob = new ImportJob(); // ImportJob | 
    try {
      ImportJob result = apiInstance.create(importJob);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#create");
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
| **importJob** | [**ImportJob**](ImportJob.md)|  | [optional] |

### Return type

[**ImportJob**](ImportJob.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="delete"></a>
# **delete**
> delete(id)

Delete

Delete

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.ImportApi;

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

    ImportApi apiInstance = new ImportApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.delete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#delete");
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
| **id** | **String**|  | |

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

<a name="get"></a>
# **get**
> ImportJob get(id)

Get

Get

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.ImportApi;

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

    ImportApi apiInstance = new ImportApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      ImportJob result = apiInstance.get(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#get");
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
| **id** | **String**|  | |

### Return type

[**ImportJob**](ImportJob.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

