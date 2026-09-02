# OrderRoutingGroupApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteGroup**](OrderRoutingGroupApi.md#deleteGroup) | **DELETE** /commerce/orders/orderrouting/api/v1/group/delete/{groupID} | Delete Group |
| [**getGroup**](OrderRoutingGroupApi.md#getGroup) | **GET** /commerce/orders/orderrouting/api/v1/group/{groupID} | Get Group |
| [**saveGroup**](OrderRoutingGroupApi.md#saveGroup) | **POST** /commerce/orders/orderrouting/api/v1/group | Save Group |
| [**setGroupFilters**](OrderRoutingGroupApi.md#setGroupFilters) | **POST** /commerce/orders/orderrouting/api/v1/group/{groupID}/setFilters | Set Group Filters |
| [**setGroupSorts**](OrderRoutingGroupApi.md#setGroupSorts) | **POST** /commerce/orders/orderrouting/api/v1/group/{groupID}/setSorts | Set Group Sorts |
| [**testGroup**](OrderRoutingGroupApi.md#testGroup) | **GET** /commerce/orders/orderrouting/api/v1/group/test | Test Group |


<a name="deleteGroup"></a>
# **deleteGroup**
> deleteGroup(groupID, xVolTenant, xVolSite)

Delete Group

Delete Group

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingGroupApi apiInstance = new OrderRoutingGroupApi(defaultClient);
    Integer groupID = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    try {
      apiInstance.deleteGroup(groupID, xVolTenant, xVolSite);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingGroupApi#deleteGroup");
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
| **groupID** | **Integer**|  | |
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="getGroup"></a>
# **getGroup**
> OrderRoutingLocationGroup getGroup(groupID, xVolTenant, xVolSite)

Get Group

Retrieves a routing group by ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingGroupApi apiInstance = new OrderRoutingGroupApi(defaultClient);
    Integer groupID = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    try {
      OrderRoutingLocationGroup result = apiInstance.getGroup(groupID, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingGroupApi#getGroup");
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
| **groupID** | **Integer**|  | |
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |

### Return type

[**OrderRoutingLocationGroup**](OrderRoutingLocationGroup.md)

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

<a name="saveGroup"></a>
# **saveGroup**
> OrderRoutingLocationGroup saveGroup(locationGroupModel)

Save Group

Saves a routing group.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingGroupApi apiInstance = new OrderRoutingGroupApi(defaultClient);
    LocationGroupModel locationGroupModel = new LocationGroupModel(); // LocationGroupModel | 
    try {
      OrderRoutingLocationGroup result = apiInstance.saveGroup(locationGroupModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingGroupApi#saveGroup");
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
| **locationGroupModel** | [**LocationGroupModel**](LocationGroupModel.md)|  | |

### Return type

[**OrderRoutingLocationGroup**](OrderRoutingLocationGroup.md)

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

<a name="setGroupFilters"></a>
# **setGroupFilters**
> OrderRoutingLocationGroup setGroupFilters(groupID, xVolTenant, xVolSite, requestBody)

Set Group Filters

Sets a routing group&#39;s filters.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingGroupApi apiInstance = new OrderRoutingGroupApi(defaultClient);
    Integer groupID = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    Set<Integer> requestBody = Arrays.asList(); // Set<Integer> | 
    try {
      OrderRoutingLocationGroup result = apiInstance.setGroupFilters(groupID, xVolTenant, xVolSite, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingGroupApi#setGroupFilters");
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
| **groupID** | **Integer**|  | |
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |
| **requestBody** | [**Set&lt;Integer&gt;**](Integer.md)|  | |

### Return type

[**OrderRoutingLocationGroup**](OrderRoutingLocationGroup.md)

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

<a name="setGroupSorts"></a>
# **setGroupSorts**
> OrderRoutingLocationGroup setGroupSorts(groupID, xVolTenant, xVolSite, locationSort)

Set Group Sorts

Sets a routing group&#39;s sorting options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingGroupApi apiInstance = new OrderRoutingGroupApi(defaultClient);
    Integer groupID = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    List<LocationSort> locationSort = Arrays.asList(); // List<LocationSort> | 
    try {
      OrderRoutingLocationGroup result = apiInstance.setGroupSorts(groupID, xVolTenant, xVolSite, locationSort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingGroupApi#setGroupSorts");
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
| **groupID** | **Integer**|  | |
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |
| **locationSort** | [**List&lt;LocationSort&gt;**](LocationSort.md)|  | |

### Return type

[**OrderRoutingLocationGroup**](OrderRoutingLocationGroup.md)

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

<a name="testGroup"></a>
# **testGroup**
> OrderRoutingLocationGroup testGroup()

Test Group

Tests a routing group.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingGroupApi apiInstance = new OrderRoutingGroupApi(defaultClient);
    try {
      OrderRoutingLocationGroup result = apiInstance.testGroup();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingGroupApi#testGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrderRoutingLocationGroup**](OrderRoutingLocationGroup.md)

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

