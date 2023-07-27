# OrderRoutingLocationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocationByLocationCodeUsingGET**](OrderRoutingLocationApi.md#getLocationByLocationCodeUsingGET) | **GET** /commerce/orders/orderrouting/api/v1/location/{locationCode} | getLocationByLocationCode |
| [**getLocationsUsingGET**](OrderRoutingLocationApi.md#getLocationsUsingGET) | **GET** /commerce/orders/orderrouting/api/v1/location | getLocations |


<a name="getLocationByLocationCodeUsingGET"></a>
# **getLocationByLocationCodeUsingGET**
> LocationResponseModel getLocationByLocationCodeUsingGET(locationCode, xVolSite, xVolTenant)

getLocationByLocationCode

getLocationByLocationCode

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingLocationApi apiInstance = new OrderRoutingLocationApi(defaultClient);
    String locationCode = "locationCode_example"; // String | locationCode
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | x-vol-tenant
    try {
      LocationResponseModel result = apiInstance.getLocationByLocationCodeUsingGET(locationCode, xVolSite, xVolTenant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingLocationApi#getLocationByLocationCodeUsingGET");
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
| **locationCode** | **String**| locationCode | |
| **xVolSite** | **Integer**|  | |
| **xVolTenant** | **Integer**| x-vol-tenant | |

### Return type

[**LocationResponseModel**](LocationResponseModel.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getLocationsUsingGET"></a>
# **getLocationsUsingGET**
> LocationListResponseModel getLocationsUsingGET(xVolSite, xVolTenant, pageNum, pageSize)

getLocations

getLocations

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingLocationApi apiInstance = new OrderRoutingLocationApi(defaultClient);
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | x-vol-tenant
    Integer pageNum = 56; // Integer | pageNum
    Integer pageSize = 56; // Integer | pageSize
    try {
      LocationListResponseModel result = apiInstance.getLocationsUsingGET(xVolSite, xVolTenant, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingLocationApi#getLocationsUsingGET");
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
| **xVolSite** | **Integer**|  | |
| **xVolTenant** | **Integer**| x-vol-tenant | |
| **pageNum** | **Integer**| pageNum | [optional] |
| **pageSize** | **Integer**| pageSize | [optional] |

### Return type

[**LocationListResponseModel**](LocationListResponseModel.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

