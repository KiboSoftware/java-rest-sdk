# OrderRoutingFilterApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteFilter2**](OrderRoutingFilterApi.md#deleteFilter2) | **DELETE** /commerce/orders/orderrouting/api/v1/filter/delete/{filterID} | Delete Filter |
| [**getFilter**](OrderRoutingFilterApi.md#getFilter) | **GET** /commerce/orders/orderrouting/api/v1/filter/{filterID} | Get Filter |
| [**saveCriteriaSetFilter**](OrderRoutingFilterApi.md#saveCriteriaSetFilter) | **POST** /commerce/orders/orderrouting/api/v1/filter/criteriaSet | Save Criteria Set Filter |
| [**saveCustomDataListFilter**](OrderRoutingFilterApi.md#saveCustomDataListFilter) | **POST** /commerce/orders/orderrouting/api/v1/filter/customDataListFilter | Save Custom Data List Filter |
| [**saveCustomDataValueFilter**](OrderRoutingFilterApi.md#saveCustomDataValueFilter) | **POST** /commerce/orders/orderrouting/api/v1/filter/customDataValueFilter | Save Custom Data Value Filter |
| [**testFilter**](OrderRoutingFilterApi.md#testFilter) | **GET** /commerce/orders/orderrouting/api/v1/filter/testcriteria | Test Filter |
| [**testSetFilter**](OrderRoutingFilterApi.md#testSetFilter) | **GET** /commerce/orders/orderrouting/api/v1/filter/testset | Test Set Filter |


<a name="deleteFilter2"></a>
# **deleteFilter2**
> deleteFilter2(filterID, xVolTenant, xVolSite)

Delete Filter

Deletes a filter

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingFilterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingFilterApi apiInstance = new OrderRoutingFilterApi(defaultClient);
    Integer filterID = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    try {
      apiInstance.deleteFilter2(filterID, xVolTenant, xVolSite);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterApi#deleteFilter2");
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
| **filterID** | **Integer**|  | |
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

<a name="getFilter"></a>
# **getFilter**
> AbstractFilter getFilter(filterID, xVolTenant, xVolSite)

Get Filter

Retrieves a filter by ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingFilterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingFilterApi apiInstance = new OrderRoutingFilterApi(defaultClient);
    Integer filterID = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    try {
      AbstractFilter result = apiInstance.getFilter(filterID, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterApi#getFilter");
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
| **filterID** | **Integer**|  | |
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |

### Return type

[**AbstractFilter**](AbstractFilter.md)

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

<a name="saveCriteriaSetFilter"></a>
# **saveCriteriaSetFilter**
> AbstractFilter saveCriteriaSetFilter(xVolTenant, xVolSite, locationCriteriaSetFilter)

Save Criteria Set Filter

Saves a criteria set filter.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingFilterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingFilterApi apiInstance = new OrderRoutingFilterApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    LocationCriteriaSetFilter locationCriteriaSetFilter = new LocationCriteriaSetFilter(); // LocationCriteriaSetFilter | 
    try {
      AbstractFilter result = apiInstance.saveCriteriaSetFilter(xVolTenant, xVolSite, locationCriteriaSetFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterApi#saveCriteriaSetFilter");
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
| **locationCriteriaSetFilter** | [**LocationCriteriaSetFilter**](LocationCriteriaSetFilter.md)|  | |

### Return type

[**AbstractFilter**](AbstractFilter.md)

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

<a name="saveCustomDataListFilter"></a>
# **saveCustomDataListFilter**
> AbstractFilter saveCustomDataListFilter(customDataListFilter)

Save Custom Data List Filter

Saves a custom data list filter.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingFilterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingFilterApi apiInstance = new OrderRoutingFilterApi(defaultClient);
    CustomDataListFilter customDataListFilter = new CustomDataListFilter(); // CustomDataListFilter | 
    try {
      AbstractFilter result = apiInstance.saveCustomDataListFilter(customDataListFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterApi#saveCustomDataListFilter");
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
| **customDataListFilter** | [**CustomDataListFilter**](CustomDataListFilter.md)|  | |

### Return type

[**AbstractFilter**](AbstractFilter.md)

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

<a name="saveCustomDataValueFilter"></a>
# **saveCustomDataValueFilter**
> AbstractFilter saveCustomDataValueFilter(customDataValueFilter)

Save Custom Data Value Filter

Saves a custom data value filter.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingFilterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingFilterApi apiInstance = new OrderRoutingFilterApi(defaultClient);
    CustomDataValueFilter customDataValueFilter = new CustomDataValueFilter(); // CustomDataValueFilter | 
    try {
      AbstractFilter result = apiInstance.saveCustomDataValueFilter(customDataValueFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterApi#saveCustomDataValueFilter");
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
| **customDataValueFilter** | [**CustomDataValueFilter**](CustomDataValueFilter.md)|  | |

### Return type

[**AbstractFilter**](AbstractFilter.md)

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

<a name="testFilter"></a>
# **testFilter**
> AbstractFilter testFilter()

Test Filter

Tests a filter.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingFilterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingFilterApi apiInstance = new OrderRoutingFilterApi(defaultClient);
    try {
      AbstractFilter result = apiInstance.testFilter();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterApi#testFilter");
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

[**AbstractFilter**](AbstractFilter.md)

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

<a name="testSetFilter"></a>
# **testSetFilter**
> AbstractFilter testSetFilter()

Test Set Filter

Tests a set filter.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingFilterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingFilterApi apiInstance = new OrderRoutingFilterApi(defaultClient);
    try {
      AbstractFilter result = apiInstance.testSetFilter();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterApi#testSetFilter");
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

[**AbstractFilter**](AbstractFilter.md)

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

