# HistoryApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadEntitiesAsync**](HistoryApi.md#downloadEntitiesAsync) | **GET** /history/{rightHistoryId}/{leftHistoryId}/download | Download Histories |
| [**downloadEntityAsync**](HistoryApi.md#downloadEntityAsync) | **GET** /history/{historyId}/download | Download History |
| [**getDiff**](HistoryApi.md#getDiff) | **GET** /history/{historyId}/diff | Get History Diff |
| [**getHistoryAsync**](HistoryApi.md#getHistoryAsync) | **GET** /history | Get History |
| [**getHistoryByIdAsync**](HistoryApi.md#getHistoryByIdAsync) | **GET** /history/{historyId} | Get History by ID |


<a name="downloadEntitiesAsync"></a>
# **downloadEntitiesAsync**
> downloadEntitiesAsync(rightHistoryId, leftHistoryId, responseFields)

Download Histories

Downloads the entities as a ZIP file by their history IDs.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.auditlogs.ApiClient;
import com.kibocommerce.sdk.auditlogs.ApiException;
import com.kibocommerce.sdk.auditlogs.Configuration;
import com.kibocommerce.sdk.auditlogs.auth.*;
import com.kibocommerce.sdk.auditlogs.models.*;
import com.kibocommerce.sdk.auditlogs.api.HistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    HistoryApi apiInstance = new HistoryApi(defaultClient);
    String rightHistoryId = "rightHistoryId_example"; // String | The ID of the right history record.
    String leftHistoryId = "leftHistoryId_example"; // String | The ID of the left history record.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.downloadEntitiesAsync(rightHistoryId, leftHistoryId, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoryApi#downloadEntitiesAsync");
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
| **rightHistoryId** | **String**| The ID of the right history record. | |
| **leftHistoryId** | **String**| The ID of the left history record. | |
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

<a name="downloadEntityAsync"></a>
# **downloadEntityAsync**
> downloadEntityAsync(historyId, responseFields)

Download History

Downloads the entity as a JSON file by its history ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.auditlogs.ApiClient;
import com.kibocommerce.sdk.auditlogs.ApiException;
import com.kibocommerce.sdk.auditlogs.Configuration;
import com.kibocommerce.sdk.auditlogs.auth.*;
import com.kibocommerce.sdk.auditlogs.models.*;
import com.kibocommerce.sdk.auditlogs.api.HistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    HistoryApi apiInstance = new HistoryApi(defaultClient);
    String historyId = "historyId_example"; // String | The ID of the history record.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.downloadEntityAsync(historyId, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoryApi#downloadEntityAsync");
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
| **historyId** | **String**| The ID of the history record. | |
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

<a name="getDiff"></a>
# **getDiff**
> Object getDiff(historyId, responseFields)

Get History Diff

Retrieves diff for history by ID or entity type. Retrieves the modified file(s) of given history compared to the previous. version of entity

### Example
```java
// Import classes:
import com.kibocommerce.sdk.auditlogs.ApiClient;
import com.kibocommerce.sdk.auditlogs.ApiException;
import com.kibocommerce.sdk.auditlogs.Configuration;
import com.kibocommerce.sdk.auditlogs.auth.*;
import com.kibocommerce.sdk.auditlogs.models.*;
import com.kibocommerce.sdk.auditlogs.api.HistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    HistoryApi apiInstance = new HistoryApi(defaultClient);
    String historyId = "historyId_example"; // String | History Id
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Object result = apiInstance.getDiff(historyId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoryApi#getDiff");
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
| **historyId** | **String**| History Id | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getHistoryAsync"></a>
# **getHistoryAsync**
> HistoryCollection getHistoryAsync(startIndex, pageSize, sortBy, filter, Q, qlimit, responseFields)

Get History

Retrieves a collection of history records with optional paging parameters. Paging parameters include startIndex, pageSize, sortBy, filter, q, and qLimit.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.auditlogs.ApiClient;
import com.kibocommerce.sdk.auditlogs.ApiException;
import com.kibocommerce.sdk.auditlogs.Configuration;
import com.kibocommerce.sdk.auditlogs.auth.*;
import com.kibocommerce.sdk.auditlogs.models.*;
import com.kibocommerce.sdk.auditlogs.api.HistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    HistoryApi apiInstance = new HistoryApi(defaultClient);
    Integer startIndex = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String Q = "Q_example"; // String | 
    Integer qlimit = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      HistoryCollection result = apiInstance.getHistoryAsync(startIndex, pageSize, sortBy, filter, Q, qlimit, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoryApi#getHistoryAsync");
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
| **startIndex** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **Q** | **String**|  | [optional] |
| **qlimit** | **Integer**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**HistoryCollection**](HistoryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getHistoryByIdAsync"></a>
# **getHistoryByIdAsync**
> History getHistoryByIdAsync(historyId, responseFields)

Get History by ID

Retrieves a history record by its ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.auditlogs.ApiClient;
import com.kibocommerce.sdk.auditlogs.ApiException;
import com.kibocommerce.sdk.auditlogs.Configuration;
import com.kibocommerce.sdk.auditlogs.auth.*;
import com.kibocommerce.sdk.auditlogs.models.*;
import com.kibocommerce.sdk.auditlogs.api.HistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    HistoryApi apiInstance = new HistoryApi(defaultClient);
    String historyId = "historyId_example"; // String | The ID of the history record.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      History result = apiInstance.getHistoryByIdAsync(historyId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoryApi#getHistoryByIdAsync");
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
| **historyId** | **String**| The ID of the history record. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**History**](History.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

