# OrderRoutingCustomDataListApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomDataList1**](OrderRoutingCustomDataListApi.md#createCustomDataList1) | **POST** /commerce/orders/orderrouting/api/v1/filterDataLists | Create Custom Data List |
| [**deleteCustomDataList**](OrderRoutingCustomDataListApi.md#deleteCustomDataList) | **DELETE** /commerce/orders/orderrouting/api/v1/filterDataLists/{listId} | Delete Custom Data List |
| [**exportListEntriesAsCsv**](OrderRoutingCustomDataListApi.md#exportListEntriesAsCsv) | **GET** /commerce/orders/orderrouting/api/v1/filterDataLists/{listId}/download | Export List Entries As Csv |
| [**getCustomDataListById**](OrderRoutingCustomDataListApi.md#getCustomDataListById) | **GET** /commerce/orders/orderrouting/api/v1/filterDataLists/{listId} | Get Custom Data List By Id |
| [**listCustomDataLists1**](OrderRoutingCustomDataListApi.md#listCustomDataLists1) | **GET** /commerce/orders/orderrouting/api/v1/filterDataLists | List Custom Data Lists |
| [**updateCustomDataList**](OrderRoutingCustomDataListApi.md#updateCustomDataList) | **PUT** /commerce/orders/orderrouting/api/v1/filterDataLists/{listId} | Update Custom Data List |


<a name="createCustomDataList1"></a>
# **createCustomDataList1**
> CustomDataListUploadResponse createCustomDataList1(xVolTenant, xVolSite, name, dataType, _file, description)

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
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingCustomDataListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingCustomDataListApi apiInstance = new OrderRoutingCustomDataListApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    String name = "name_example"; // String | 
    String dataType = "STRING"; // String | 
    File _file = new File("/path/to/file"); // File | 
    String description = "description_example"; // String | 
    try {
      CustomDataListUploadResponse result = apiInstance.createCustomDataList1(xVolTenant, xVolSite, name, dataType, _file, description);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingCustomDataListApi#createCustomDataList1");
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
| **name** | **String**|  | |
| **dataType** | **String**|  | [enum: STRING, NUMBER, LOCATION, DATE] |
| **_file** | **File**|  | |
| **description** | **String**|  | [optional] |

### Return type

[**CustomDataListUploadResponse**](CustomDataListUploadResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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

<a name="deleteCustomDataList"></a>
# **deleteCustomDataList**
> deleteCustomDataList(xVolTenant, xVolSite, listId)

Delete Custom Data List

Delete Custom Data List

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingCustomDataListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingCustomDataListApi apiInstance = new OrderRoutingCustomDataListApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    Integer listId = 56; // Integer | 
    try {
      apiInstance.deleteCustomDataList(xVolTenant, xVolSite, listId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingCustomDataListApi#deleteCustomDataList");
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
| **listId** | **Integer**|  | |

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

<a name="exportListEntriesAsCsv"></a>
# **exportListEntriesAsCsv**
> List&lt;byte[]&gt; exportListEntriesAsCsv(xVolTenant, xVolSite, listId)

Export List Entries As Csv

Export List Entries As Csv

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingCustomDataListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingCustomDataListApi apiInstance = new OrderRoutingCustomDataListApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    Integer listId = 56; // Integer | 
    try {
      List<byte[]> result = apiInstance.exportListEntriesAsCsv(xVolTenant, xVolSite, listId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingCustomDataListApi#exportListEntriesAsCsv");
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
| **listId** | **Integer**|  | |

### Return type

**List&lt;byte[]&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="getCustomDataListById"></a>
# **getCustomDataListById**
> CustomDataListsModel getCustomDataListById(xVolTenant, xVolSite, listId)

Get Custom Data List By Id

Get Custom Data List By Id

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingCustomDataListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingCustomDataListApi apiInstance = new OrderRoutingCustomDataListApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    Integer listId = 56; // Integer | 
    try {
      CustomDataListsModel result = apiInstance.getCustomDataListById(xVolTenant, xVolSite, listId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingCustomDataListApi#getCustomDataListById");
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
| **listId** | **Integer**|  | |

### Return type

[**CustomDataListsModel**](CustomDataListsModel.md)

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

<a name="listCustomDataLists1"></a>
# **listCustomDataLists1**
> PagedResponseCustomDataListsModel listCustomDataLists1(xVolTenant, xVolSite, pagedRequest)

List Custom Data Lists

List Custom Data Lists

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingCustomDataListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingCustomDataListApi apiInstance = new OrderRoutingCustomDataListApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    CustomDataListPagedRequest pagedRequest = new HashMap(); // CustomDataListPagedRequest | 
    try {
      PagedResponseCustomDataListsModel result = apiInstance.listCustomDataLists1(xVolTenant, xVolSite, pagedRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingCustomDataListApi#listCustomDataLists1");
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
| **pagedRequest** | [**CustomDataListPagedRequest**](.md)|  | |

### Return type

[**PagedResponseCustomDataListsModel**](PagedResponseCustomDataListsModel.md)

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

<a name="updateCustomDataList"></a>
# **updateCustomDataList**
> CustomDataListsModel updateCustomDataList(xVolTenant, xVolSite, listId, updateDataListRequest)

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
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingCustomDataListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingCustomDataListApi apiInstance = new OrderRoutingCustomDataListApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    Integer listId = 56; // Integer | 
    UpdateDataListRequest updateDataListRequest = new UpdateDataListRequest(); // UpdateDataListRequest | 
    try {
      CustomDataListsModel result = apiInstance.updateCustomDataList(xVolTenant, xVolSite, listId, updateDataListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingCustomDataListApi#updateCustomDataList");
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
| **listId** | **Integer**|  | |
| **updateDataListRequest** | [**UpdateDataListRequest**](UpdateDataListRequest.md)|  | |

### Return type

[**CustomDataListsModel**](CustomDataListsModel.md)

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

