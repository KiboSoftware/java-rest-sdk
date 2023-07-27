# OrderRoutingGroupApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteGroupUsingDELETE**](OrderRoutingGroupApi.md#deleteGroupUsingDELETE) | **DELETE** /commerce/orders/orderrouting/api/v1/group/delete/{groupID} | deleteGroup |
| [**getGroupUsingGET**](OrderRoutingGroupApi.md#getGroupUsingGET) | **GET** /commerce/orders/orderrouting/api/v1/group/{groupID} | getGroup |
| [**saveGroupUsingPOST**](OrderRoutingGroupApi.md#saveGroupUsingPOST) | **POST** /commerce/orders/orderrouting/api/v1/group | saveGroup |
| [**setGroupFiltersUsingPOST**](OrderRoutingGroupApi.md#setGroupFiltersUsingPOST) | **POST** /commerce/orders/orderrouting/api/v1/group/{groupID}/setFilters | setGroupFilters |
| [**setGroupSortsUsingPOST**](OrderRoutingGroupApi.md#setGroupSortsUsingPOST) | **POST** /commerce/orders/orderrouting/api/v1/group/{groupID}/setSorts | setGroupSorts |
| [**testGroupUsingGET**](OrderRoutingGroupApi.md#testGroupUsingGET) | **GET** /commerce/orders/orderrouting/api/v1/group/test | testGroup |


<a name="deleteGroupUsingDELETE"></a>
# **deleteGroupUsingDELETE**
> deleteGroupUsingDELETE(groupID, xVolSite, xVolTenant)

deleteGroup

deleteGroup

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingGroupApi apiInstance = new OrderRoutingGroupApi(defaultClient);
    Integer groupID = 56; // Integer | groupID
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    try {
      apiInstance.deleteGroupUsingDELETE(groupID, xVolSite, xVolTenant);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingGroupApi#deleteGroupUsingDELETE");
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
| **groupID** | **Integer**| groupID | |
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

<a name="getGroupUsingGET"></a>
# **getGroupUsingGET**
> ApiDocumentationLocationGroup getGroupUsingGET(groupID, xVolSite, xVolTenant)

getGroup

getGroup

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingGroupApi apiInstance = new OrderRoutingGroupApi(defaultClient);
    Integer groupID = 56; // Integer | groupID
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    try {
      ApiDocumentationLocationGroup result = apiInstance.getGroupUsingGET(groupID, xVolSite, xVolTenant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingGroupApi#getGroupUsingGET");
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
| **groupID** | **Integer**| groupID | |
| **xVolSite** | **Integer**|  | |
| **xVolTenant** | **Integer**|  | |

### Return type

[**ApiDocumentationLocationGroup**](ApiDocumentationLocationGroup.md)

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

<a name="saveGroupUsingPOST"></a>
# **saveGroupUsingPOST**
> ApiDocumentationLocationGroup saveGroupUsingPOST(xVolSite, xVolTenant, loc)

saveGroup

saveGroup

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingGroupApi apiInstance = new OrderRoutingGroupApi(defaultClient);
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    LocationGroupModel loc = new LocationGroupModel(); // LocationGroupModel | loc
    try {
      ApiDocumentationLocationGroup result = apiInstance.saveGroupUsingPOST(xVolSite, xVolTenant, loc);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingGroupApi#saveGroupUsingPOST");
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
| **loc** | [**LocationGroupModel**](LocationGroupModel.md)| loc | |

### Return type

[**ApiDocumentationLocationGroup**](ApiDocumentationLocationGroup.md)

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

<a name="setGroupFiltersUsingPOST"></a>
# **setGroupFiltersUsingPOST**
> ApiDocumentationLocationGroup setGroupFiltersUsingPOST(groupID, xVolSite, xVolTenant, filterIDs)

setGroupFilters

setGroupFilters

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingGroupApi apiInstance = new OrderRoutingGroupApi(defaultClient);
    Integer groupID = 56; // Integer | groupID
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    List<Integer> filterIDs = Arrays.asList(); // List<Integer> | filterIDs
    try {
      ApiDocumentationLocationGroup result = apiInstance.setGroupFiltersUsingPOST(groupID, xVolSite, xVolTenant, filterIDs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingGroupApi#setGroupFiltersUsingPOST");
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
| **groupID** | **Integer**| groupID | |
| **xVolSite** | **Integer**|  | |
| **xVolTenant** | **Integer**|  | |
| **filterIDs** | [**List&lt;Integer&gt;**](Integer.md)| filterIDs | |

### Return type

[**ApiDocumentationLocationGroup**](ApiDocumentationLocationGroup.md)

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

<a name="setGroupSortsUsingPOST"></a>
# **setGroupSortsUsingPOST**
> ApiDocumentationLocationGroup setGroupSortsUsingPOST(groupID, xVolSite, xVolTenant, sorts)

setGroupSorts

setGroupSorts

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingGroupApi apiInstance = new OrderRoutingGroupApi(defaultClient);
    Integer groupID = 56; // Integer | groupID
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    List<LocationSort> sorts = Arrays.asList(); // List<LocationSort> | sorts
    try {
      ApiDocumentationLocationGroup result = apiInstance.setGroupSortsUsingPOST(groupID, xVolSite, xVolTenant, sorts);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingGroupApi#setGroupSortsUsingPOST");
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
| **groupID** | **Integer**| groupID | |
| **xVolSite** | **Integer**|  | |
| **xVolTenant** | **Integer**|  | |
| **sorts** | [**List&lt;LocationSort&gt;**](LocationSort.md)| sorts | |

### Return type

[**ApiDocumentationLocationGroup**](ApiDocumentationLocationGroup.md)

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

<a name="testGroupUsingGET"></a>
# **testGroupUsingGET**
> ApiDocumentationLocationGroup testGroupUsingGET(xVolSite, xVolTenant)

testGroup

testGroup

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderRoutingGroupApi apiInstance = new OrderRoutingGroupApi(defaultClient);
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    try {
      ApiDocumentationLocationGroup result = apiInstance.testGroupUsingGET(xVolSite, xVolTenant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingGroupApi#testGroupUsingGET");
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

[**ApiDocumentationLocationGroup**](ApiDocumentationLocationGroup.md)

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

