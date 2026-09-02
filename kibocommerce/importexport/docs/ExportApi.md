# ExportApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callList**](ExportApi.md#callList) | **GET** /platform/data/export | Get Export Jobs |
| [**create**](ExportApi.md#create) | **POST** /platform/data/export | Create Export Job |
| [**delete**](ExportApi.md#delete) | **DELETE** /platform/data/export/{id} | Delete Export Job |
| [**get**](ExportApi.md#get) | **GET** /platform/data/export/{id} | Get Export Job |


<a name="callList"></a>
# **callList**
> List&lt;ExportJob&gt; callList(startIndex, pageSize, filter, responseFields)

Get Export Jobs

Retrieves a list of all export jobs. For detailed usage, file format specifications, and field references, see the [Import/Export API Overview](/pages/import-export-api-overview).

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.ExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ExportApi apiInstance = new ExportApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ExportJob> result = apiInstance.callList(startIndex, pageSize, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportApi#callList");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;ExportJob&gt;**](ExportJob.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="create"></a>
# **create**
> ExportJob create(responseFields, exportJob)

Create Export Job

Creates a new export job. For detailed usage, file format specifications, and field references, see the [Import/Export API Overview](/pages/import-export-api-overview).

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.ExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ExportApi apiInstance = new ExportApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ExportJob exportJob = new ExportJob(); // ExportJob | 
    try {
      ExportJob result = apiInstance.create(responseFields, exportJob);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportApi#create");
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
| **exportJob** | [**ExportJob**](ExportJob.md)|  | [optional] |

### Return type

[**ExportJob**](ExportJob.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="delete"></a>
# **delete**
> delete(id)

Delete Export Job

Deletes an existing export job. For detailed usage, file format specifications, and field references, see the [Import/Export API Overview](/pages/import-export-api-overview).

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.ExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ExportApi apiInstance = new ExportApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.delete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportApi#delete");
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
> ExportJob get(id, responseFields)

Get Export Job

Retrieves an export job by ID. For detailed usage, file format specifications, and field references, see the [Import/Export API Overview](/pages/import-export-api-overview).

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.ExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ExportApi apiInstance = new ExportApi(defaultClient);
    String id = "id_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ExportJob result = apiInstance.get(id, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportApi#get");
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

[**ExportJob**](ExportJob.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

