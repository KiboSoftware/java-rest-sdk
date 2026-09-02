# OrderRoutingStrategyExportApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exportStrategy**](OrderRoutingStrategyExportApi.md#exportStrategy) | **GET** /commerce/orders/orderrouting/api/v1/strategies/{strategyId}/export | Export Strategy |
| [**importStrategy**](OrderRoutingStrategyExportApi.md#importStrategy) | **POST** /commerce/orders/orderrouting/api/v1/strategies/import | Import Strategy |


<a name="exportStrategy"></a>
# **exportStrategy**
> StrategyExportDto exportStrategy(xVolTenant, xVolSite, strategyId)

Export Strategy

Export Strategy

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingStrategyExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingStrategyExportApi apiInstance = new OrderRoutingStrategyExportApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    String strategyId = "strategyId_example"; // String | 
    try {
      StrategyExportDto result = apiInstance.exportStrategy(xVolTenant, xVolSite, strategyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingStrategyExportApi#exportStrategy");
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
| **xVolSite** | **Integer**|  | |
| **strategyId** | **String**|  | |

### Return type

[**StrategyExportDto**](StrategyExportDto.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="importStrategy"></a>
# **importStrategy**
> String importStrategy(xVolTenant, xVolSite, strategyImportDto)

Import Strategy

Import Strategy

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingStrategyExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingStrategyExportApi apiInstance = new OrderRoutingStrategyExportApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    StrategyImportDto strategyImportDto = new StrategyImportDto(); // StrategyImportDto | 
    try {
      String result = apiInstance.importStrategy(xVolTenant, xVolSite, strategyImportDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingStrategyExportApi#importStrategy");
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
| **xVolSite** | **Integer**|  | |
| **strategyImportDto** | [**StrategyImportDto**](StrategyImportDto.md)|  | |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

