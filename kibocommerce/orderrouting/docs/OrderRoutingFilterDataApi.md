# OrderRoutingFilterDataApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFilterAttributes2**](OrderRoutingFilterDataApi.md#getFilterAttributes2) | **GET** /commerce/orders/orderrouting/api/v1/routing/filter-attributes | Get Filter Attributes |
| [**getFilterLogicalGroupsForScenario1**](OrderRoutingFilterDataApi.md#getFilterLogicalGroupsForScenario1) | **GET** /commerce/orders/orderrouting/api/v1/routing/scenarios/{scenarioId}/filterLogicalGroups | Get Filter Logical Groups For Scenario |
| [**getFilterOperators1**](OrderRoutingFilterDataApi.md#getFilterOperators1) | **GET** /commerce/orders/orderrouting/api/v1/routing/filter-operators | Get Filter Operators |
| [**getFilterTypes1**](OrderRoutingFilterDataApi.md#getFilterTypes1) | **GET** /commerce/orders/orderrouting/api/v1/routing/filter-types | Get Filter Types |
| [**getFiltersForScenario1**](OrderRoutingFilterDataApi.md#getFiltersForScenario1) | **GET** /commerce/orders/orderrouting/api/v1/routing/scenarios/{scenarioId}/filters | Get Filters For Scenario |


<a name="getFilterAttributes2"></a>
# **getFilterAttributes2**
> List&lt;FilterAttributeGroupResponse&gt; getFilterAttributes2(xVolTenant, xVolSite)

Get Filter Attributes

Get Filter Attributes

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingFilterDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingFilterDataApi apiInstance = new OrderRoutingFilterDataApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      List<FilterAttributeGroupResponse> result = apiInstance.getFilterAttributes2(xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterDataApi#getFilterAttributes2");
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

### Return type

[**List&lt;FilterAttributeGroupResponse&gt;**](FilterAttributeGroupResponse.md)

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

<a name="getFilterLogicalGroupsForScenario1"></a>
# **getFilterLogicalGroupsForScenario1**
> PagedResponseScenarioFilterLogicalGroupResponse getFilterLogicalGroupsForScenario1(xVolTenant, xVolSite, scenarioId, pagedRequest)

Get Filter Logical Groups For Scenario

Get Filter Logical Groups For Scenario

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingFilterDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingFilterDataApi apiInstance = new OrderRoutingFilterDataApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    Integer scenarioId = 56; // Integer | 
    PagedRequest pagedRequest = new HashMap(); // PagedRequest | 
    try {
      PagedResponseScenarioFilterLogicalGroupResponse result = apiInstance.getFilterLogicalGroupsForScenario1(xVolTenant, xVolSite, scenarioId, pagedRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterDataApi#getFilterLogicalGroupsForScenario1");
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
| **scenarioId** | **Integer**|  | |
| **pagedRequest** | [**PagedRequest**](.md)|  | |

### Return type

[**PagedResponseScenarioFilterLogicalGroupResponse**](PagedResponseScenarioFilterLogicalGroupResponse.md)

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

<a name="getFilterOperators1"></a>
# **getFilterOperators1**
> List&lt;FilterOperator&gt; getFilterOperators1(attributeDataType, xVolTenant, xVolSite, comparisonAttributeDataType, filterTypeID)

Get Filter Operators

Get Filter Operators

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingFilterDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingFilterDataApi apiInstance = new OrderRoutingFilterDataApi(defaultClient);
    String attributeDataType = "attributeDataType_example"; // String | 
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    String comparisonAttributeDataType = "comparisonAttributeDataType_example"; // String | 
    String filterTypeID = "filterTypeID_example"; // String | 
    try {
      List<FilterOperator> result = apiInstance.getFilterOperators1(attributeDataType, xVolTenant, xVolSite, comparisonAttributeDataType, filterTypeID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterDataApi#getFilterOperators1");
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
| **attributeDataType** | **String**|  | |
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |
| **comparisonAttributeDataType** | **String**|  | [optional] |
| **filterTypeID** | **String**|  | [optional] |

### Return type

[**List&lt;FilterOperator&gt;**](FilterOperator.md)

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

<a name="getFilterTypes1"></a>
# **getFilterTypes1**
> List&lt;FilterTypeResponse&gt; getFilterTypes1(xVolTenant, xVolSite)

Get Filter Types

Get Filter Types

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingFilterDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingFilterDataApi apiInstance = new OrderRoutingFilterDataApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    try {
      List<FilterTypeResponse> result = apiInstance.getFilterTypes1(xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterDataApi#getFilterTypes1");
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

### Return type

[**List&lt;FilterTypeResponse&gt;**](FilterTypeResponse.md)

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

<a name="getFiltersForScenario1"></a>
# **getFiltersForScenario1**
> PagedResponseScenarioFilterResponse getFiltersForScenario1(xVolTenant, xVolSite, scenarioId, pagedRequest)

Get Filters For Scenario

Get Filters For Scenario

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingFilterDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingFilterDataApi apiInstance = new OrderRoutingFilterDataApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    Integer scenarioId = 56; // Integer | 
    PagedRequest pagedRequest = new HashMap(); // PagedRequest | 
    try {
      PagedResponseScenarioFilterResponse result = apiInstance.getFiltersForScenario1(xVolTenant, xVolSite, scenarioId, pagedRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterDataApi#getFiltersForScenario1");
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
| **scenarioId** | **Integer**|  | |
| **pagedRequest** | [**PagedRequest**](.md)|  | |

### Return type

[**PagedResponseScenarioFilterResponse**](PagedResponseScenarioFilterResponse.md)

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

