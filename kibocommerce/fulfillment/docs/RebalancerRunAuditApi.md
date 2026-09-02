# RebalancerRunAuditApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getReservationDetail**](RebalancerRunAuditApi.md#getReservationDetail) | **GET** /commerce/fulfillment/rebalancer/audit/runs/{runId}/reservations/{reservationId} | getReservationDetail |
| [**getReservationSourcing**](RebalancerRunAuditApi.md#getReservationSourcing) | **GET** /commerce/fulfillment/rebalancer/audit/runs/{runId}/reservations/{reservationId}/sourcing | getReservationSourcing |
| [**getRunDetail**](RebalancerRunAuditApi.md#getRunDetail) | **GET** /commerce/fulfillment/rebalancer/audit/runs/{runId} | getRunDetail |
| [**getShipmentDetail**](RebalancerRunAuditApi.md#getShipmentDetail) | **GET** /commerce/fulfillment/rebalancer/audit/runs/{runId}/shipments/{shipmentNumber} | getShipmentDetail |
| [**listAllRules**](RebalancerRunAuditApi.md#listAllRules) | **GET** /commerce/fulfillment/rebalancer/audit/rules | listAllRules |
| [**listBackorderRules**](RebalancerRunAuditApi.md#listBackorderRules) | **GET** /commerce/fulfillment/rebalancer/audit/runs/{runId}/backorder-rules | listBackorderRules |
| [**listChanges**](RebalancerRunAuditApi.md#listChanges) | **GET** /commerce/fulfillment/rebalancer/audit/runs/{runId}/changes | listChanges |
| [**listCurrentBackorderShipments**](RebalancerRunAuditApi.md#listCurrentBackorderShipments) | **GET** /commerce/fulfillment/rebalancer/audit/backorder-shipments | listCurrentBackorderShipments |
| [**listFutureRules**](RebalancerRunAuditApi.md#listFutureRules) | **GET** /commerce/fulfillment/rebalancer/audit/runs/{runId}/rules | listFutureRules |
| [**listReservationLines**](RebalancerRunAuditApi.md#listReservationLines) | **GET** /commerce/fulfillment/rebalancer/audit/runs/{runId}/reservations/{reservationId}/lines | listReservationLines |
| [**listReservations**](RebalancerRunAuditApi.md#listReservations) | **GET** /commerce/fulfillment/rebalancer/audit/runs/{runId}/reservations | listReservations |
| [**listRuns**](RebalancerRunAuditApi.md#listRuns) | **GET** /commerce/fulfillment/rebalancer/audit/runs | listRuns |
| [**listRunsForShipment**](RebalancerRunAuditApi.md#listRunsForShipment) | **GET** /commerce/fulfillment/rebalancer/audit/shipments/{shipmentNumber}/runs | listRunsForShipment |
| [**listShipmentLines**](RebalancerRunAuditApi.md#listShipmentLines) | **GET** /commerce/fulfillment/rebalancer/audit/runs/{runId}/shipments/{shipmentNumber}/lines | listShipmentLines |
| [**listShipments**](RebalancerRunAuditApi.md#listShipments) | **GET** /commerce/fulfillment/rebalancer/audit/runs/{runId}/shipments | listShipments |
| [**savedFilters**](RebalancerRunAuditApi.md#savedFilters) | **GET** /commerce/fulfillment/rebalancer/audit/runs/saved-filters | savedFilters |


<a name="getReservationDetail"></a>
# **getReservationDetail**
> ItemAuditDetailDto getReservationDetail(reservationId, runId, xVolTenant, xVolSite)

getReservationDetail

getReservationDetail

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalancerRunAuditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalancerRunAuditApi apiInstance = new RebalancerRunAuditApi(defaultClient);
    String reservationId = "reservationId_example"; // String | reservationId
    String runId = "runId_example"; // String | runId
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      ItemAuditDetailDto result = apiInstance.getReservationDetail(reservationId, runId, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalancerRunAuditApi#getReservationDetail");
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
| **reservationId** | **String**| reservationId | |
| **runId** | **String**| runId | |
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**ItemAuditDetailDto**](ItemAuditDetailDto.md)

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

<a name="getReservationSourcing"></a>
# **getReservationSourcing**
> SourcingDto getReservationSourcing(reservationId, runId, xVolTenant, xVolSite)

getReservationSourcing

getReservationSourcing

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalancerRunAuditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalancerRunAuditApi apiInstance = new RebalancerRunAuditApi(defaultClient);
    String reservationId = "reservationId_example"; // String | reservationId
    String runId = "runId_example"; // String | runId
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      SourcingDto result = apiInstance.getReservationSourcing(reservationId, runId, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalancerRunAuditApi#getReservationSourcing");
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
| **reservationId** | **String**| reservationId | |
| **runId** | **String**| runId | |
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**SourcingDto**](SourcingDto.md)

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

<a name="getRunDetail"></a>
# **getRunDetail**
> RunDetailDto getRunDetail(runId, xVolTenant, xVolSite)

getRunDetail

getRunDetail

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalancerRunAuditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalancerRunAuditApi apiInstance = new RebalancerRunAuditApi(defaultClient);
    String runId = "runId_example"; // String | runId
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      RunDetailDto result = apiInstance.getRunDetail(runId, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalancerRunAuditApi#getRunDetail");
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

[**RunDetailDto**](RunDetailDto.md)

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

<a name="getShipmentDetail"></a>
# **getShipmentDetail**
> ItemAuditDetailDto getShipmentDetail(runId, shipmentNumber, xVolTenant, xVolSite)

getShipmentDetail

getShipmentDetail

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalancerRunAuditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalancerRunAuditApi apiInstance = new RebalancerRunAuditApi(defaultClient);
    String runId = "runId_example"; // String | runId
    String shipmentNumber = "shipmentNumber_example"; // String | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      ItemAuditDetailDto result = apiInstance.getShipmentDetail(runId, shipmentNumber, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalancerRunAuditApi#getShipmentDetail");
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
| **shipmentNumber** | **String**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**ItemAuditDetailDto**](ItemAuditDetailDto.md)

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

<a name="listAllRules"></a>
# **listAllRules**
> PageOfRuleDto listAllRules(xVolTenant, xVolSite)

listAllRules

listAllRules

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalancerRunAuditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalancerRunAuditApi apiInstance = new RebalancerRunAuditApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      PageOfRuleDto result = apiInstance.listAllRules(xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalancerRunAuditApi#listAllRules");
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
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**PageOfRuleDto**](PageOfRuleDto.md)

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

<a name="listBackorderRules"></a>
# **listBackorderRules**
> List&lt;RuleDto&gt; listBackorderRules(runId, xVolTenant, xVolSite)

listBackorderRules

listBackorderRules

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalancerRunAuditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalancerRunAuditApi apiInstance = new RebalancerRunAuditApi(defaultClient);
    String runId = "runId_example"; // String | runId
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      List<RuleDto> result = apiInstance.listBackorderRules(runId, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalancerRunAuditApi#listBackorderRules");
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

[**List&lt;RuleDto&gt;**](RuleDto.md)

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

<a name="listChanges"></a>
# **listChanges**
> PagedResponseDtoOfChangeDto listChanges(runId, xVolTenant, filter, page, pageSize, quickSearch, since, sort, xVolSite)

listChanges

listChanges

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalancerRunAuditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalancerRunAuditApi apiInstance = new RebalancerRunAuditApi(defaultClient);
    String runId = "runId_example"; // String | runId
    Integer xVolTenant = 56; // Integer | 
    String filter = "filter_example"; // String | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String quickSearch = "quickSearch_example"; // String | 
    Long since = 56L; // Long | 
    String sort = "sort_example"; // String | 
    Integer xVolSite = 56; // Integer | 
    try {
      PagedResponseDtoOfChangeDto result = apiInstance.listChanges(runId, xVolTenant, filter, page, pageSize, quickSearch, since, sort, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalancerRunAuditApi#listChanges");
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
| **filter** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **quickSearch** | **String**|  | [optional] |
| **since** | **Long**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**PagedResponseDtoOfChangeDto**](PagedResponseDtoOfChangeDto.md)

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

<a name="listCurrentBackorderShipments"></a>
# **listCurrentBackorderShipments**
> PagedResponseDtoOfItemAuditDto listCurrentBackorderShipments(xVolTenant, changeIds, filter, outcomeCode, page, pageSize, queue, quickSearch, sort, view, xVolSite)

listCurrentBackorderShipments

listCurrentBackorderShipments

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalancerRunAuditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalancerRunAuditApi apiInstance = new RebalancerRunAuditApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    List<String> changeIds = Arrays.asList(); // List<String> | 
    String filter = "filter_example"; // String | 
    List<String> outcomeCode = Arrays.asList(); // List<String> | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String queue = "queue_example"; // String | 
    String quickSearch = "quickSearch_example"; // String | 
    String sort = "sort_example"; // String | 
    String view = "view_example"; // String | 
    Integer xVolSite = 56; // Integer | 
    try {
      PagedResponseDtoOfItemAuditDto result = apiInstance.listCurrentBackorderShipments(xVolTenant, changeIds, filter, outcomeCode, page, pageSize, queue, quickSearch, sort, view, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalancerRunAuditApi#listCurrentBackorderShipments");
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
| **changeIds** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **filter** | **String**|  | [optional] |
| **outcomeCode** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **queue** | **String**|  | [optional] |
| **quickSearch** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **view** | **String**|  | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**PagedResponseDtoOfItemAuditDto**](PagedResponseDtoOfItemAuditDto.md)

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

<a name="listFutureRules"></a>
# **listFutureRules**
> PageOfRuleDto listFutureRules(runId, xVolTenant, xVolSite)

listFutureRules

listFutureRules

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalancerRunAuditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalancerRunAuditApi apiInstance = new RebalancerRunAuditApi(defaultClient);
    String runId = "runId_example"; // String | runId
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      PageOfRuleDto result = apiInstance.listFutureRules(runId, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalancerRunAuditApi#listFutureRules");
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

[**PageOfRuleDto**](PageOfRuleDto.md)

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

<a name="listReservationLines"></a>
# **listReservationLines**
> ItemLinesResponseDto listReservationLines(reservationId, runId, xVolTenant, filter, page, pageSize, sort, xVolSite)

listReservationLines

listReservationLines

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalancerRunAuditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalancerRunAuditApi apiInstance = new RebalancerRunAuditApi(defaultClient);
    String reservationId = "reservationId_example"; // String | reservationId
    String runId = "runId_example"; // String | runId
    Integer xVolTenant = 56; // Integer | 
    String filter = "filter_example"; // String | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String sort = "sort_example"; // String | 
    Integer xVolSite = 56; // Integer | 
    try {
      ItemLinesResponseDto result = apiInstance.listReservationLines(reservationId, runId, xVolTenant, filter, page, pageSize, sort, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalancerRunAuditApi#listReservationLines");
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
| **reservationId** | **String**| reservationId | |
| **runId** | **String**| runId | |
| **xVolTenant** | **Integer**|  | |
| **filter** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**ItemLinesResponseDto**](ItemLinesResponseDto.md)

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

<a name="listReservations"></a>
# **listReservations**
> PagedResponseDtoOfItemAuditDto listReservations(runId, xVolTenant, changeIds, filter, outcomeCode, page, pageSize, queue, quickSearch, sort, view, xVolSite)

listReservations

listReservations

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalancerRunAuditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalancerRunAuditApi apiInstance = new RebalancerRunAuditApi(defaultClient);
    String runId = "runId_example"; // String | runId
    Integer xVolTenant = 56; // Integer | 
    List<String> changeIds = Arrays.asList(); // List<String> | 
    String filter = "filter_example"; // String | 
    List<String> outcomeCode = Arrays.asList(); // List<String> | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String queue = "queue_example"; // String | 
    String quickSearch = "quickSearch_example"; // String | 
    String sort = "sort_example"; // String | 
    String view = "view_example"; // String | 
    Integer xVolSite = 56; // Integer | 
    try {
      PagedResponseDtoOfItemAuditDto result = apiInstance.listReservations(runId, xVolTenant, changeIds, filter, outcomeCode, page, pageSize, queue, quickSearch, sort, view, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalancerRunAuditApi#listReservations");
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
| **changeIds** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **filter** | **String**|  | [optional] |
| **outcomeCode** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **queue** | **String**|  | [optional] |
| **quickSearch** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **view** | **String**|  | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**PagedResponseDtoOfItemAuditDto**](PagedResponseDtoOfItemAuditDto.md)

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

<a name="listRuns"></a>
# **listRuns**
> PagedResponseDtoOfRunSummaryDto listRuns(runType, xVolTenant, filter, page, pageSize, quickSearch, sort, xVolSite)

listRuns

listRuns

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalancerRunAuditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalancerRunAuditApi apiInstance = new RebalancerRunAuditApi(defaultClient);
    String runType = "runType_example"; // String | runType
    Integer xVolTenant = 56; // Integer | 
    String filter = "filter_example"; // String | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String quickSearch = "quickSearch_example"; // String | 
    String sort = "sort_example"; // String | 
    Integer xVolSite = 56; // Integer | 
    try {
      PagedResponseDtoOfRunSummaryDto result = apiInstance.listRuns(runType, xVolTenant, filter, page, pageSize, quickSearch, sort, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalancerRunAuditApi#listRuns");
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
| **runType** | **String**| runType | |
| **xVolTenant** | **Integer**|  | |
| **filter** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **quickSearch** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**PagedResponseDtoOfRunSummaryDto**](PagedResponseDtoOfRunSummaryDto.md)

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

<a name="listRunsForShipment"></a>
# **listRunsForShipment**
> PagedResponseDtoOfRunSummaryDto listRunsForShipment(shipmentNumber, xVolTenant, filter, page, pageSize, quickSearch, sort, xVolSite)

listRunsForShipment

listRunsForShipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalancerRunAuditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalancerRunAuditApi apiInstance = new RebalancerRunAuditApi(defaultClient);
    String shipmentNumber = "shipmentNumber_example"; // String | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    String filter = "filter_example"; // String | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String quickSearch = "quickSearch_example"; // String | 
    String sort = "sort_example"; // String | 
    Integer xVolSite = 56; // Integer | 
    try {
      PagedResponseDtoOfRunSummaryDto result = apiInstance.listRunsForShipment(shipmentNumber, xVolTenant, filter, page, pageSize, quickSearch, sort, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalancerRunAuditApi#listRunsForShipment");
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
| **shipmentNumber** | **String**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **filter** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **quickSearch** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**PagedResponseDtoOfRunSummaryDto**](PagedResponseDtoOfRunSummaryDto.md)

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

<a name="listShipmentLines"></a>
# **listShipmentLines**
> ItemLinesResponseDto listShipmentLines(runId, shipmentNumber, xVolTenant, filter, page, pageSize, sort, xVolSite)

listShipmentLines

listShipmentLines

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalancerRunAuditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalancerRunAuditApi apiInstance = new RebalancerRunAuditApi(defaultClient);
    String runId = "runId_example"; // String | runId
    String shipmentNumber = "shipmentNumber_example"; // String | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    String filter = "filter_example"; // String | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String sort = "sort_example"; // String | 
    Integer xVolSite = 56; // Integer | 
    try {
      ItemLinesResponseDto result = apiInstance.listShipmentLines(runId, shipmentNumber, xVolTenant, filter, page, pageSize, sort, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalancerRunAuditApi#listShipmentLines");
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
| **shipmentNumber** | **String**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **filter** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**ItemLinesResponseDto**](ItemLinesResponseDto.md)

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

<a name="listShipments"></a>
# **listShipments**
> PagedResponseDtoOfItemAuditDto listShipments(runId, xVolTenant, changeIds, filter, outcomeCode, page, pageSize, queue, quickSearch, sort, view, xVolSite)

listShipments

listShipments

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalancerRunAuditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalancerRunAuditApi apiInstance = new RebalancerRunAuditApi(defaultClient);
    String runId = "runId_example"; // String | runId
    Integer xVolTenant = 56; // Integer | 
    List<String> changeIds = Arrays.asList(); // List<String> | 
    String filter = "filter_example"; // String | 
    List<String> outcomeCode = Arrays.asList(); // List<String> | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String queue = "queue_example"; // String | 
    String quickSearch = "quickSearch_example"; // String | 
    String sort = "sort_example"; // String | 
    String view = "view_example"; // String | 
    Integer xVolSite = 56; // Integer | 
    try {
      PagedResponseDtoOfItemAuditDto result = apiInstance.listShipments(runId, xVolTenant, changeIds, filter, outcomeCode, page, pageSize, queue, quickSearch, sort, view, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalancerRunAuditApi#listShipments");
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
| **changeIds** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **filter** | **String**|  | [optional] |
| **outcomeCode** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **queue** | **String**|  | [optional] |
| **quickSearch** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **view** | **String**|  | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**PagedResponseDtoOfItemAuditDto**](PagedResponseDtoOfItemAuditDto.md)

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

<a name="savedFilters"></a>
# **savedFilters**
> List&lt;Map&lt;String, String&gt;&gt; savedFilters(xVolTenant, xVolSite)

savedFilters

savedFilters

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalancerRunAuditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalancerRunAuditApi apiInstance = new RebalancerRunAuditApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      List<Map<String, String>> result = apiInstance.savedFilters(xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalancerRunAuditApi#savedFilters");
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
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**List&lt;Map&lt;String, String&gt;&gt;**](Map.md)

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

