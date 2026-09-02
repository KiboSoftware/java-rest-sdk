# FilesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**download**](FilesApi.md#download) | **GET** /platform/data/files/{id}/content | Download Files |
| [**get**](FilesApi.md#get) | **GET** /platform/data/files/{id} | Get File |
| [**getPublicLink**](FilesApi.md#getPublicLink) | **POST** /platform/data/files/{id}/generatelink | Get Public Link |
| [**upload**](FilesApi.md#upload) | **POST** /platform/data/files | Upload Files |


<a name="download"></a>
# **download**
> download(id, responseFields)

Download Files

Downloads specific files by ID

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String id = "id_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.download(id, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#download");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="get"></a>
# **get**
> DropLocation get(id, responseFields)

Get File

Retrieves file information by ID

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String id = "id_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      DropLocation result = apiInstance.get(id, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#get");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**DropLocation**](DropLocation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPublicLink"></a>
# **getPublicLink**
> String getPublicLink(id, hourDuration, responseFields)

Get Public Link

Generates a public link for the files

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String id = "id_example"; // String | 
    Integer hourDuration = 24; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      String result = apiInstance.getPublicLink(id, hourDuration, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getPublicLink");
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
| **hourDuration** | **Integer**|  | [optional] [default to 24] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="upload"></a>
# **upload**
> DropLocation upload(fileType, fileName, responseFields, body)

Upload Files

Uploads files to the system

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String fileType = "fileType_example"; // String | 
    String fileName = "fileName_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    File body = new File("/path/to/file"); // File | 
    try {
      DropLocation result = apiInstance.upload(fileType, fileName, responseFields, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#upload");
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
| **fileType** | **String**|  | [optional] |
| **fileName** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **body** | **File**|  | [optional] |

### Return type

[**DropLocation**](DropLocation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

