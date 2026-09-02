# DisruptionEventsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listReservationDisruptions**](DisruptionEventsApi.md#listReservationDisruptions) | **GET** /commerce/fulfillment/rebalancer/disruptions/reservations | listReservationDisruptions |
| [**listRunEvents**](DisruptionEventsApi.md#listRunEvents) | **GET** /commerce/fulfillment/rebalancer/runs/{runId}/events | listRunEvents |
| [**listShipmentDisruptions**](DisruptionEventsApi.md#listShipmentDisruptions) | **GET** /commerce/fulfillment/rebalancer/disruptions/shipments | listShipmentDisruptions |


<a name="listReservationDisruptions"></a>
# **listReservationDisruptions**
> PageOfDisruptionEventDto listReservationDisruptions(xVolTenant, eventType, jobId, locationCode, page, pageSize, status, upc, xVolSite)

listReservationDisruptions

listReservationDisruptions

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.DisruptionEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    DisruptionEventsApi apiInstance = new DisruptionEventsApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    String eventType = "eventType_example"; // String | 
    String jobId = "jobId_example"; // String | 
    String locationCode = "locationCode_example"; // String | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String status = "status_example"; // String | 
    String upc = "upc_example"; // String | 
    Integer xVolSite = 56; // Integer | 
    try {
      PageOfDisruptionEventDto result = apiInstance.listReservationDisruptions(xVolTenant, eventType, jobId, locationCode, page, pageSize, status, upc, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DisruptionEventsApi#listReservationDisruptions");
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
| **eventType** | **String**|  | [optional] |
| **jobId** | **String**|  | [optional] |
| **locationCode** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **status** | **String**|  | [optional] |
| **upc** | **String**|  | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**PageOfDisruptionEventDto**](PageOfDisruptionEventDto.md)

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

<a name="listRunEvents"></a>
# **listRunEvents**
> PageOfDisruptionEventDto listRunEvents(runId, xVolTenant, eventType, jobId, locationCode, page, pageSize, status, upc, xVolSite)

listRunEvents

listRunEvents

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.DisruptionEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    DisruptionEventsApi apiInstance = new DisruptionEventsApi(defaultClient);
    String runId = "runId_example"; // String | runId
    Integer xVolTenant = 56; // Integer | 
    String eventType = "eventType_example"; // String | 
    String jobId = "jobId_example"; // String | 
    String locationCode = "locationCode_example"; // String | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String status = "status_example"; // String | 
    String upc = "upc_example"; // String | 
    Integer xVolSite = 56; // Integer | 
    try {
      PageOfDisruptionEventDto result = apiInstance.listRunEvents(runId, xVolTenant, eventType, jobId, locationCode, page, pageSize, status, upc, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DisruptionEventsApi#listRunEvents");
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
| **eventType** | **String**|  | [optional] |
| **jobId** | **String**|  | [optional] |
| **locationCode** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **status** | **String**|  | [optional] |
| **upc** | **String**|  | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**PageOfDisruptionEventDto**](PageOfDisruptionEventDto.md)

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

<a name="listShipmentDisruptions"></a>
# **listShipmentDisruptions**
> PageOfDisruptionEventDto listShipmentDisruptions(xVolTenant, eventType, jobId, locationCode, page, pageSize, status, upc, xVolSite)

listShipmentDisruptions

listShipmentDisruptions

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.DisruptionEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    DisruptionEventsApi apiInstance = new DisruptionEventsApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    String eventType = "eventType_example"; // String | 
    String jobId = "jobId_example"; // String | 
    String locationCode = "locationCode_example"; // String | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String status = "status_example"; // String | 
    String upc = "upc_example"; // String | 
    Integer xVolSite = 56; // Integer | 
    try {
      PageOfDisruptionEventDto result = apiInstance.listShipmentDisruptions(xVolTenant, eventType, jobId, locationCode, page, pageSize, status, upc, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DisruptionEventsApi#listShipmentDisruptions");
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
| **eventType** | **String**|  | [optional] |
| **jobId** | **String**|  | [optional] |
| **locationCode** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **status** | **String**|  | [optional] |
| **upc** | **String**|  | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**PageOfDisruptionEventDto**](PageOfDisruptionEventDto.md)

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

