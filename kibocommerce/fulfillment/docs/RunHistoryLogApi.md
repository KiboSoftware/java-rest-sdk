# RunHistoryLogApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteRunHistory**](RunHistoryLogApi.md#deleteRunHistory) | **DELETE** /commerce/fulfillment/rebalancer/audit/runs/{runId}/log | deleteRunHistory |
| [**log**](RunHistoryLogApi.md#log) | **POST** /commerce/fulfillment/rebalancer/audit/runs/{runId}/log | log |


<a name="deleteRunHistory"></a>
# **deleteRunHistory**
> deleteRunHistory(runId, xVolTenant, xVolSite)

deleteRunHistory

deleteRunHistory

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RunHistoryLogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RunHistoryLogApi apiInstance = new RunHistoryLogApi(defaultClient);
    String runId = "runId_example"; // String | runId
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      apiInstance.deleteRunHistory(runId, xVolTenant, xVolSite);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunHistoryLogApi#deleteRunHistory");
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
| **runId** | **String**| runId | |
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="log"></a>
# **log**
> LogBatchResponseDto log(runId, xVolTenant, logBatchRequestDto, xVolSite)

log

log

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RunHistoryLogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RunHistoryLogApi apiInstance = new RunHistoryLogApi(defaultClient);
    String runId = "runId_example"; // String | runId
    Integer xVolTenant = 56; // Integer | 
    LogBatchRequestDto logBatchRequestDto = new LogBatchRequestDto(); // LogBatchRequestDto | request
    Integer xVolSite = 56; // Integer | 
    try {
      LogBatchResponseDto result = apiInstance.log(runId, xVolTenant, logBatchRequestDto, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunHistoryLogApi#log");
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
| **runId** | **String**| runId | |
| **xVolTenant** | **Integer**|  | |
| **logBatchRequestDto** | [**LogBatchRequestDto**](LogBatchRequestDto.md)| request | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**LogBatchResponseDto**](LogBatchResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

