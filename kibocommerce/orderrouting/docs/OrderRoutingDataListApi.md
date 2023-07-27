# OrderRoutingDataListApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomDataListUsingPOST**](OrderRoutingDataListApi.md#createCustomDataListUsingPOST) | **POST** /commerce/orders/orderrouting/api/v1/dataList | createCustomDataList |
| [**deleteCustomDataListUsingDELETE**](OrderRoutingDataListApi.md#deleteCustomDataListUsingDELETE) | **DELETE** /commerce/orders/orderrouting/api/v1/dataList/{dataListID} | deleteCustomDataList |
| [**getCustomDataListUsingGET**](OrderRoutingDataListApi.md#getCustomDataListUsingGET) | **GET** /commerce/orders/orderrouting/api/v1/dataList/{dataListID} | getCustomDataList |
| [**updateCustomDataListUsingPUT**](OrderRoutingDataListApi.md#updateCustomDataListUsingPUT) | **PUT** /commerce/orders/orderrouting/api/v1/dataList/{dataListID} | updateCustomDataList |


<a name="createCustomDataListUsingPOST"></a>
# **createCustomDataListUsingPOST**
> CustomDataListResponse createCustomDataListUsingPOST(xVolSite, xVolTenant, customDataList)

createCustomDataList

createCustomDataList

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingDataListApi apiInstance = new OrderRoutingDataListApi(defaultClient);
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    CustomDataList customDataList = new CustomDataList(); // CustomDataList | customDataList
    try {
      CustomDataListResponse result = apiInstance.createCustomDataListUsingPOST(xVolSite, xVolTenant, customDataList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingDataListApi#createCustomDataListUsingPOST");
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
| **xVolTenant** | **Integer**|  | |
| **customDataList** | [**CustomDataList**](CustomDataList.md)| customDataList | |

### Return type

[**CustomDataListResponse**](CustomDataListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="deleteCustomDataListUsingDELETE"></a>
# **deleteCustomDataListUsingDELETE**
> deleteCustomDataListUsingDELETE(dataListID, xVolSite, xVolTenant)

deleteCustomDataList

deleteCustomDataList

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingDataListApi apiInstance = new OrderRoutingDataListApi(defaultClient);
    Integer dataListID = 56; // Integer | dataListID
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    try {
      apiInstance.deleteCustomDataListUsingDELETE(dataListID, xVolSite, xVolTenant);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingDataListApi#deleteCustomDataListUsingDELETE");
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
| **xVolSite** | **Integer**|  | |
| **xVolTenant** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="getCustomDataListUsingGET"></a>
# **getCustomDataListUsingGET**
> CustomDataListResponse getCustomDataListUsingGET(dataListID, xVolSite, xVolTenant)

getCustomDataList

getCustomDataList

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingDataListApi apiInstance = new OrderRoutingDataListApi(defaultClient);
    Integer dataListID = 56; // Integer | dataListID
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    try {
      CustomDataListResponse result = apiInstance.getCustomDataListUsingGET(dataListID, xVolSite, xVolTenant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingDataListApi#getCustomDataListUsingGET");
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
| **xVolSite** | **Integer**|  | |
| **xVolTenant** | **Integer**|  | |

### Return type

[**CustomDataListResponse**](CustomDataListResponse.md)

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

<a name="updateCustomDataListUsingPUT"></a>
# **updateCustomDataListUsingPUT**
> CustomDataListResponse updateCustomDataListUsingPUT(dataListID, xVolSite, xVolTenant, newDataList)

updateCustomDataList

updateCustomDataList

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingDataListApi apiInstance = new OrderRoutingDataListApi(defaultClient);
    Integer dataListID = 56; // Integer | dataListID
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    CustomDataList newDataList = new CustomDataList(); // CustomDataList | newDataList
    try {
      CustomDataListResponse result = apiInstance.updateCustomDataListUsingPUT(dataListID, xVolSite, xVolTenant, newDataList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingDataListApi#updateCustomDataListUsingPUT");
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
| **xVolSite** | **Integer**|  | |
| **xVolTenant** | **Integer**|  | |
| **newDataList** | [**CustomDataList**](CustomDataList.md)| newDataList | |

### Return type

[**CustomDataListResponse**](CustomDataListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

