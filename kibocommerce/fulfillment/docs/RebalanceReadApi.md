# RebalanceReadApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCurrentRankedShipments**](RebalanceReadApi.md#getCurrentRankedShipments) | **GET** /commerce/fulfillment/rebalancer/runs/current/shipments | getCurrentRankedShipments |
| [**getCurrentRun**](RebalanceReadApi.md#getCurrentRun) | **GET** /commerce/fulfillment/rebalancer/runs/current | getCurrentRun |
| [**getRankedShipments**](RebalanceReadApi.md#getRankedShipments) | **GET** /commerce/fulfillment/rebalancer/runs/{jobId}/shipments | getRankedShipments |


<a name="getCurrentRankedShipments"></a>
# **getCurrentRankedShipments**
> Object getCurrentRankedShipments(xVolTenant, page, pageSize, queue, xVolSite)

getCurrentRankedShipments

getCurrentRankedShipments

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalanceReadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalanceReadApi apiInstance = new RebalanceReadApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer page = 0; // Integer | page
    Integer pageSize = 50; // Integer | pageSize
    String queue = "queue_example"; // String | queue
    Integer xVolSite = 56; // Integer | 
    try {
      Object result = apiInstance.getCurrentRankedShipments(xVolTenant, page, pageSize, queue, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalanceReadApi#getCurrentRankedShipments");
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
| **xVolTenant** | **Integer**|  | |
| **page** | **Integer**| page | [optional] [default to 0] |
| **pageSize** | **Integer**| pageSize | [optional] [default to 50] |
| **queue** | **String**| queue | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getCurrentRun"></a>
# **getCurrentRun**
> Object getCurrentRun(xVolTenant, queue, xVolSite)

getCurrentRun

getCurrentRun

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalanceReadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalanceReadApi apiInstance = new RebalanceReadApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    String queue = "queue_example"; // String | queue
    Integer xVolSite = 56; // Integer | 
    try {
      Object result = apiInstance.getCurrentRun(xVolTenant, queue, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalanceReadApi#getCurrentRun");
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
| **xVolTenant** | **Integer**|  | |
| **queue** | **String**| queue | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getRankedShipments"></a>
# **getRankedShipments**
> Object getRankedShipments(jobId, xVolTenant, page, pageSize, queue, xVolSite)

getRankedShipments

getRankedShipments

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalanceReadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalanceReadApi apiInstance = new RebalanceReadApi(defaultClient);
    String jobId = "jobId_example"; // String | jobId
    Integer xVolTenant = 56; // Integer | 
    Integer page = 0; // Integer | page
    Integer pageSize = 50; // Integer | pageSize
    String queue = "queue_example"; // String | queue
    Integer xVolSite = 56; // Integer | 
    try {
      Object result = apiInstance.getRankedShipments(jobId, xVolTenant, page, pageSize, queue, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalanceReadApi#getRankedShipments");
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
| **jobId** | **String**| jobId | |
| **xVolTenant** | **Integer**|  | |
| **page** | **Integer**| page | [optional] [default to 0] |
| **pageSize** | **Integer**| pageSize | [optional] [default to 50] |
| **queue** | **String**| queue | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

