# OrderRoutingFilterApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteFilterUsingDELETE**](OrderRoutingFilterApi.md#deleteFilterUsingDELETE) | **DELETE** /commerce/orders/orderrouting/api/v1/filter/delete/{filterID} | deleteFilter |
| [**getFilterUsingGET**](OrderRoutingFilterApi.md#getFilterUsingGET) | **GET** /commerce/orders/orderrouting/api/v1/filter/{filterID} | getFilter |
| [**saveCriteriaSetFilterUsingPOST**](OrderRoutingFilterApi.md#saveCriteriaSetFilterUsingPOST) | **POST** /commerce/orders/orderrouting/api/v1/filter/criteriaSet | saveCriteriaSetFilter |
| [**saveCustomDataListFilterUsingPOST**](OrderRoutingFilterApi.md#saveCustomDataListFilterUsingPOST) | **POST** /commerce/orders/orderrouting/api/v1/filter/customDataListFilter | saveCustomDataListFilter |
| [**saveCustomDataValueFilterUsingPOST**](OrderRoutingFilterApi.md#saveCustomDataValueFilterUsingPOST) | **POST** /commerce/orders/orderrouting/api/v1/filter/customDataValueFilter | saveCustomDataValueFilter |
| [**testFilterUsingGET**](OrderRoutingFilterApi.md#testFilterUsingGET) | **GET** /commerce/orders/orderrouting/api/v1/filter/testcriteria | testFilter |
| [**testSetFilterUsingGET**](OrderRoutingFilterApi.md#testSetFilterUsingGET) | **GET** /commerce/orders/orderrouting/api/v1/filter/testset | testSetFilter |


<a name="deleteFilterUsingDELETE"></a>
# **deleteFilterUsingDELETE**
> deleteFilterUsingDELETE(filterID, xVolSite, xVolTenant)

deleteFilter

deleteFilter

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingFilterApi apiInstance = new OrderRoutingFilterApi(defaultClient);
    Integer filterID = 56; // Integer | filterID
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    try {
      apiInstance.deleteFilterUsingDELETE(filterID, xVolSite, xVolTenant);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterApi#deleteFilterUsingDELETE");
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
| **filterID** | **Integer**| filterID | |
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
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="getFilterUsingGET"></a>
# **getFilterUsingGET**
> AbstractFilter getFilterUsingGET(filterID, xVolSite, xVolTenant)

getFilter

getFilter

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingFilterApi apiInstance = new OrderRoutingFilterApi(defaultClient);
    Integer filterID = 56; // Integer | filterID
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    try {
      AbstractFilter result = apiInstance.getFilterUsingGET(filterID, xVolSite, xVolTenant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterApi#getFilterUsingGET");
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
| **filterID** | **Integer**| filterID | |
| **xVolSite** | **Integer**|  | |
| **xVolTenant** | **Integer**|  | |

### Return type

[**AbstractFilter**](AbstractFilter.md)

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

<a name="saveCriteriaSetFilterUsingPOST"></a>
# **saveCriteriaSetFilterUsingPOST**
> AbstractFilter saveCriteriaSetFilterUsingPOST(xVolSite, xVolTenant, loc)

saveCriteriaSetFilter

saveCriteriaSetFilter

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingFilterApi apiInstance = new OrderRoutingFilterApi(defaultClient);
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    LocationCriteriaSetFilter loc = new LocationCriteriaSetFilter(); // LocationCriteriaSetFilter | loc
    try {
      AbstractFilter result = apiInstance.saveCriteriaSetFilterUsingPOST(xVolSite, xVolTenant, loc);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterApi#saveCriteriaSetFilterUsingPOST");
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
| **loc** | [**LocationCriteriaSetFilter**](LocationCriteriaSetFilter.md)| loc | |

### Return type

[**AbstractFilter**](AbstractFilter.md)

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

<a name="saveCustomDataListFilterUsingPOST"></a>
# **saveCustomDataListFilterUsingPOST**
> AbstractFilter saveCustomDataListFilterUsingPOST(xVolSite, xVolTenant, filter)

saveCustomDataListFilter

saveCustomDataListFilter

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingFilterApi apiInstance = new OrderRoutingFilterApi(defaultClient);
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    CustomDataListFilter filter = new CustomDataListFilter(); // CustomDataListFilter | filter
    try {
      AbstractFilter result = apiInstance.saveCustomDataListFilterUsingPOST(xVolSite, xVolTenant, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterApi#saveCustomDataListFilterUsingPOST");
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
| **filter** | [**CustomDataListFilter**](CustomDataListFilter.md)| filter | |

### Return type

[**AbstractFilter**](AbstractFilter.md)

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

<a name="saveCustomDataValueFilterUsingPOST"></a>
# **saveCustomDataValueFilterUsingPOST**
> AbstractFilter saveCustomDataValueFilterUsingPOST(xVolSite, xVolTenant, customDataValueFilter)

saveCustomDataValueFilter

saveCustomDataValueFilter

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingFilterApi apiInstance = new OrderRoutingFilterApi(defaultClient);
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    CustomDataValueFilter customDataValueFilter = new CustomDataValueFilter(); // CustomDataValueFilter | customDataValueFilter
    try {
      AbstractFilter result = apiInstance.saveCustomDataValueFilterUsingPOST(xVolSite, xVolTenant, customDataValueFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterApi#saveCustomDataValueFilterUsingPOST");
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
| **customDataValueFilter** | [**CustomDataValueFilter**](CustomDataValueFilter.md)| customDataValueFilter | |

### Return type

[**AbstractFilter**](AbstractFilter.md)

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

<a name="testFilterUsingGET"></a>
# **testFilterUsingGET**
> AbstractFilter testFilterUsingGET(xVolSite, xVolTenant)

testFilter

testFilter

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingFilterApi apiInstance = new OrderRoutingFilterApi(defaultClient);
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    try {
      AbstractFilter result = apiInstance.testFilterUsingGET(xVolSite, xVolTenant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterApi#testFilterUsingGET");
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

### Return type

[**AbstractFilter**](AbstractFilter.md)

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

<a name="testSetFilterUsingGET"></a>
# **testSetFilterUsingGET**
> AbstractFilter testSetFilterUsingGET(xVolSite, xVolTenant)

testSetFilter

testSetFilter

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingFilterApi apiInstance = new OrderRoutingFilterApi(defaultClient);
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    try {
      AbstractFilter result = apiInstance.testSetFilterUsingGET(xVolSite, xVolTenant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingFilterApi#testSetFilterUsingGET");
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

### Return type

[**AbstractFilter**](AbstractFilter.md)

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

