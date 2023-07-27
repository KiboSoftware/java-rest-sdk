# ModifyInventoryApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adjust**](ModifyInventoryApi.md#adjust) | **POST** /commerce/inventory/v5/inventory/adjust | Adjust |
| [**delete**](ModifyInventoryApi.md#delete) | **POST** /commerce/inventory/v5/inventory/delete | Delete |
| [**deleteFutureInventory**](ModifyInventoryApi.md#deleteFutureInventory) | **POST** /commerce/inventory/v5/inventory/deleteFutureInventory | Delete-future-inventory |
| [**deleteItems**](ModifyInventoryApi.md#deleteItems) | **POST** /commerce/inventory/v5/inventory/deleteItems | Delete-items |
| [**redistributeInventoryAcrossTags**](ModifyInventoryApi.md#redistributeInventoryAcrossTags) | **POST** /commerce/inventory/v5/inventory/redistribute | Redistribute Inventory Across Tags |
| [**refresh**](ModifyInventoryApi.md#refresh) | **POST** /commerce/inventory/v5/inventory/refresh | Refresh |


<a name="adjust"></a>
# **adjust**
> JobIDResponse adjust(xVolTenant, adjustRequest)

Adjust

Adjust Inventory

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ModifyInventoryApi;

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

    ModifyInventoryApi apiInstance = new ModifyInventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    AdjustRequest adjustRequest = new AdjustRequest(); // AdjustRequest | Request to adjust inventory
    try {
      JobIDResponse result = apiInstance.adjust(xVolTenant, adjustRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModifyInventoryApi#adjust");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **adjustRequest** | [**AdjustRequest**](AdjustRequest.md)| Request to adjust inventory | |

### Return type

[**JobIDResponse**](JobIDResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

<a name="delete"></a>
# **delete**
> DeleteItemResponse delete(xVolTenant, deleteItemRequest, xVolSite)

Delete

Delete Inventory

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ModifyInventoryApi;

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

    ModifyInventoryApi apiInstance = new ModifyInventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    DeleteItemRequest deleteItemRequest = new DeleteItemRequest(); // DeleteItemRequest | Request to delete item(s)
    Integer xVolSite = 56; // Integer | Site ID
    try {
      DeleteItemResponse result = apiInstance.delete(xVolTenant, deleteItemRequest, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModifyInventoryApi#delete");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **deleteItemRequest** | [**DeleteItemRequest**](DeleteItemRequest.md)| Request to delete item(s) | |
| **xVolSite** | **Integer**| Site ID | [optional] |

### Return type

[**DeleteItemResponse**](DeleteItemResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="deleteFutureInventory"></a>
# **deleteFutureInventory**
> DeleteFutureItemResponse deleteFutureInventory(xVolTenant, deleteFutureItemRequest, xVolSite)

Delete-future-inventory

Delete Future Inventory

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ModifyInventoryApi;

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

    ModifyInventoryApi apiInstance = new ModifyInventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    DeleteFutureItemRequest deleteFutureItemRequest = new DeleteFutureItemRequest(); // DeleteFutureItemRequest | Request to delete future item(s)
    Integer xVolSite = 56; // Integer | Site ID
    try {
      DeleteFutureItemResponse result = apiInstance.deleteFutureInventory(xVolTenant, deleteFutureItemRequest, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModifyInventoryApi#deleteFutureInventory");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **deleteFutureItemRequest** | [**DeleteFutureItemRequest**](DeleteFutureItemRequest.md)| Request to delete future item(s) | |
| **xVolSite** | **Integer**| Site ID | [optional] |

### Return type

[**DeleteFutureItemResponse**](DeleteFutureItemResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="deleteItems"></a>
# **deleteItems**
> DeleteItemResponse deleteItems(xVolTenant, deleteItemsRequest, xVolSite)

Delete-items

Delete Multiple Inventory

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ModifyInventoryApi;

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

    ModifyInventoryApi apiInstance = new ModifyInventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    DeleteItemsRequest deleteItemsRequest = new DeleteItemsRequest(); // DeleteItemsRequest | Request to batch delete items
    Integer xVolSite = 56; // Integer | Site ID
    try {
      DeleteItemResponse result = apiInstance.deleteItems(xVolTenant, deleteItemsRequest, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModifyInventoryApi#deleteItems");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **deleteItemsRequest** | [**DeleteItemsRequest**](DeleteItemsRequest.md)| Request to batch delete items | |
| **xVolSite** | **Integer**| Site ID | [optional] |

### Return type

[**DeleteItemResponse**](DeleteItemResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="redistributeInventoryAcrossTags"></a>
# **redistributeInventoryAcrossTags**
> List&lt;JobQueueResponse&gt; redistributeInventoryAcrossTags(xVolTenant)

Redistribute Inventory Across Tags

Create jobs to redistribute inventory across tags for the given tenant

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ModifyInventoryApi;

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

    ModifyInventoryApi apiInstance = new ModifyInventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    try {
      List<JobQueueResponse> result = apiInstance.redistributeInventoryAcrossTags(xVolTenant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModifyInventoryApi#redistributeInventoryAcrossTags");
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
| **xVolTenant** | **Integer**| Tenant ID | |

### Return type

[**List&lt;JobQueueResponse&gt;**](JobQueueResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="refresh"></a>
# **refresh**
> JobIDResponse refresh(xVolTenant, refreshRequest)

Refresh

Refresh Inventory

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ModifyInventoryApi;

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

    ModifyInventoryApi apiInstance = new ModifyInventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    RefreshRequest refreshRequest = new RefreshRequest(); // RefreshRequest | Request to refresh inventory
    try {
      JobIDResponse result = apiInstance.refresh(xVolTenant, refreshRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModifyInventoryApi#refresh");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **refreshRequest** | [**RefreshRequest**](RefreshRequest.md)| Request to refresh inventory | |

### Return type

[**JobIDResponse**](JobIDResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

