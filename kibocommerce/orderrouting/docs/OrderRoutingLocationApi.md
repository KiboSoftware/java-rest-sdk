# OrderRoutingLocationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocationByLocationCode**](OrderRoutingLocationApi.md#getLocationByLocationCode) | **GET** /commerce/orders/orderrouting/api/v1/location/{locationCode} | Get Location by Location Code |
| [**getLocations**](OrderRoutingLocationApi.md#getLocations) | **GET** /commerce/orders/orderrouting/api/v1/location | Get Locations |


<a name="getLocationByLocationCode"></a>
# **getLocationByLocationCode**
> LocationResponseModel getLocationByLocationCode(xVolTenant, locationCode, xVolSite)

Get Location by Location Code

Retrieve a specific location by its location code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingLocationApi apiInstance = new OrderRoutingLocationApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    String locationCode = "locationCode_example"; // String | 
    Integer xVolSite = 56; // Integer | Site
    try {
      LocationResponseModel result = apiInstance.getLocationByLocationCode(xVolTenant, locationCode, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingLocationApi#getLocationByLocationCode");
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
| **locationCode** | **String**|  | |
| **xVolSite** | **Integer**| Site | |

### Return type

[**LocationResponseModel**](LocationResponseModel.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="getLocations"></a>
# **getLocations**
> LocationListResponseModel getLocations(xVolTenant, xVolSite, pageNum, pageSize)

Get Locations

Retrieve a list of locations.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingLocationApi apiInstance = new OrderRoutingLocationApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | Site
    Integer pageNum = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      LocationListResponseModel result = apiInstance.getLocations(xVolTenant, xVolSite, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingLocationApi#getLocations");
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
| **xVolSite** | **Integer**| Site | |
| **pageNum** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |

### Return type

[**LocationListResponseModel**](LocationListResponseModel.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

