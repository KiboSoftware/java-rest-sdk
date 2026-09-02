# ImportApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callList**](ImportApi.md#callList) | **GET** /platform/data/import | Get Import Jobs |
| [**create**](ImportApi.md#create) | **POST** /platform/data/import | Create Import Job |
| [**delete**](ImportApi.md#delete) | **DELETE** /platform/data/import/{id} | Delete Import Job |
| [**get**](ImportApi.md#get) | **GET** /platform/data/import/{id} | Get Import Job |


<a name="callList"></a>
# **callList**
> List&lt;ImportJob&gt; callList(startIndex, pageSize, filter, responseFields)

Get Import Jobs

Retrieves a list of all import jobs. For detailed usage, file format specifications, and field references, see the [Import/Export API Overview](/pages/import-export-api-overview).

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

    ImportApi apiInstance = new ImportApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ImportJob> result = apiInstance.callList(startIndex, pageSize, filter, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;ImportJob&gt;**](ImportJob.md)

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
> ImportJob create(responseFields, importJob)

Create Import Job

Creates a new import job. For detailed usage, file format specifications, and field references, see the [Import/Export API Overview](/pages/import-export-api-overview).

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

    ImportApi apiInstance = new ImportApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ImportJob importJob = new ImportJob(); // ImportJob | 
    try {
      ImportJob result = apiInstance.create(responseFields, importJob);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **importJob** | [**ImportJob**](ImportJob.md)|  | [optional] |

### Return type

[**ImportJob**](ImportJob.md)

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

Delete Import Job

Deletes an existing import job. For detailed usage, file format specifications, and field references, see the [Import/Export API Overview](/pages/import-export-api-overview).

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
> ImportJob get(id, responseFields)

Get Import Job

Retrieves an import job by ID. For detailed usage, file format specifications, and field references, see the [Import/Export API Overview](/pages/import-export-api-overview).

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

    ImportApi apiInstance = new ImportApi(defaultClient);
    String id = "id_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ImportJob result = apiInstance.get(id, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ImportJob**](ImportJob.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

