# OrderRoutingDataListApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomDataList**](OrderRoutingDataListApi.md#createCustomDataList) | **POST** /commerce/orders/orderrouting/api/v1/dataList | Create Custom Data List |
| [**deleteCustomDataList1**](OrderRoutingDataListApi.md#deleteCustomDataList1) | **DELETE** /commerce/orders/orderrouting/api/v1/dataList/{dataListID} | Delete Custom Data List |
| [**getCustomDataList**](OrderRoutingDataListApi.md#getCustomDataList) | **GET** /commerce/orders/orderrouting/api/v1/dataList/{dataListID} | Get Custom Data List |
| [**updateCustomDataList**](OrderRoutingDataListApi.md#updateCustomDataList) | **PUT** /commerce/orders/orderrouting/api/v1/dataList/{dataListID} | Update Custom Data List |


<a name="createCustomDataList"></a>
# **createCustomDataList**
> CustomDataListResponse createCustomDataList(xVolTenant, xVolSite, customDataList)

Create Custom Data List

Create Custom Data List

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingDataListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingDataListApi apiInstance = new OrderRoutingDataListApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    CustomDataList customDataList = new CustomDataList(); // CustomDataList | 
    try {
      CustomDataListResponse result = apiInstance.createCustomDataList(xVolTenant, xVolSite, customDataList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingDataListApi#createCustomDataList");
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
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |
| **customDataList** | [**CustomDataList**](CustomDataList.md)|  | |

### Return type

[**CustomDataListResponse**](CustomDataListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="deleteCustomDataList1"></a>
# **deleteCustomDataList1**
> deleteCustomDataList1(dataListID)

Delete Custom Data List

Deletes a custom data list.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingDataListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingDataListApi apiInstance = new OrderRoutingDataListApi(defaultClient);
    Integer dataListID = 56; // Integer | dataListID
    try {
      apiInstance.deleteCustomDataList1(dataListID);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingDataListApi#deleteCustomDataList1");
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
| **dataListID** | **Integer**| dataListID | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="getCustomDataList"></a>
# **getCustomDataList**
> CustomDataListResponse getCustomDataList(dataListID, xVolTenant, xVolSite)

Get Custom Data List

Get Custom Data List

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingDataListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingDataListApi apiInstance = new OrderRoutingDataListApi(defaultClient);
    Integer dataListID = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    try {
      CustomDataListResponse result = apiInstance.getCustomDataList(dataListID, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingDataListApi#getCustomDataList");
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
| **dataListID** | **Integer**|  | |
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |

### Return type

[**CustomDataListResponse**](CustomDataListResponse.md)

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

<a name="updateCustomDataList"></a>
# **updateCustomDataList**
> CustomDataListResponse updateCustomDataList(dataListID, xVolTenant, xVolSite, customDataList)

Update Custom Data List

Update Custom Data List

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingDataListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingDataListApi apiInstance = new OrderRoutingDataListApi(defaultClient);
    Integer dataListID = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    CustomDataList customDataList = new CustomDataList(); // CustomDataList | 
    try {
      CustomDataListResponse result = apiInstance.updateCustomDataList(dataListID, xVolTenant, xVolSite, customDataList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingDataListApi#updateCustomDataList");
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
| **dataListID** | **Integer**|  | |
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |
| **customDataList** | [**CustomDataList**](CustomDataList.md)|  | |

### Return type

[**CustomDataListResponse**](CustomDataListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

