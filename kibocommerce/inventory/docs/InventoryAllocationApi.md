# InventoryAllocationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**allocateInventory**](InventoryAllocationApi.md#allocateInventory) | **POST** /commerce/inventory/v5/inventory/allocate | Allocate Inventory |
| [**deallocateInventory**](InventoryAllocationApi.md#deallocateInventory) | **POST** /commerce/inventory/v5/inventory/deallocate | Deallocate Inventory |
| [**fulfillInventory**](InventoryAllocationApi.md#fulfillInventory) | **POST** /commerce/inventory/v5/inventory/fulfill | Fulfill Inventory |
| [**transitionCart**](InventoryAllocationApi.md#transitionCart) | **POST** /commerce/inventory/v5/inventory/transitionCart | Transition Cart |


<a name="allocateInventory"></a>
# **allocateInventory**
> JobQueueResponse allocateInventory(xVolTenant, allocateInventoryRequest)

Allocate Inventory

Allocates inventory based on the given request

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryAllocationApi;

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

    InventoryAllocationApi apiInstance = new InventoryAllocationApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    AllocateInventoryRequest allocateInventoryRequest = new AllocateInventoryRequest(); // AllocateInventoryRequest | Request to allocate inventory
    try {
      JobQueueResponse result = apiInstance.allocateInventory(xVolTenant, allocateInventoryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryAllocationApi#allocateInventory");
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
| **allocateInventoryRequest** | [**AllocateInventoryRequest**](AllocateInventoryRequest.md)| Request to allocate inventory | |

### Return type

[**JobQueueResponse**](JobQueueResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **500** | Internal Server Error |  -  |

<a name="deallocateInventory"></a>
# **deallocateInventory**
> BaseResponse deallocateInventory(xVolTenant, allocateInventoryRequest)

Deallocate Inventory

Deallocates inventory based on the given request

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryAllocationApi;

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

    InventoryAllocationApi apiInstance = new InventoryAllocationApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    AllocateInventoryRequest allocateInventoryRequest = new AllocateInventoryRequest(); // AllocateInventoryRequest | Request to allocate inventory
    try {
      BaseResponse result = apiInstance.deallocateInventory(xVolTenant, allocateInventoryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryAllocationApi#deallocateInventory");
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
| **allocateInventoryRequest** | [**AllocateInventoryRequest**](AllocateInventoryRequest.md)| Request to allocate inventory | |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **500** | Internal Server Error |  -  |

<a name="fulfillInventory"></a>
# **fulfillInventory**
> BaseResponse fulfillInventory(xVolTenant, allocateInventoryRequest)

Fulfill Inventory

Fulfills inventory based on the given request

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryAllocationApi;

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

    InventoryAllocationApi apiInstance = new InventoryAllocationApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    AllocateInventoryRequest allocateInventoryRequest = new AllocateInventoryRequest(); // AllocateInventoryRequest | Request to allocate inventory
    try {
      BaseResponse result = apiInstance.fulfillInventory(xVolTenant, allocateInventoryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryAllocationApi#fulfillInventory");
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
| **allocateInventoryRequest** | [**AllocateInventoryRequest**](AllocateInventoryRequest.md)| Request to allocate inventory | |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **500** | Internal Server Error |  -  |

<a name="transitionCart"></a>
# **transitionCart**
> BaseResponse transitionCart(xVolTenant, transitionCartRequest)

Transition Cart

Transitions a cart allocation into a normal order/shipment allocation

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryAllocationApi;

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

    InventoryAllocationApi apiInstance = new InventoryAllocationApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    TransitionCartRequest transitionCartRequest = new TransitionCartRequest(); // TransitionCartRequest | Request needed for transitioning cart allocations to order/shipment allocations
    try {
      BaseResponse result = apiInstance.transitionCart(xVolTenant, transitionCartRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryAllocationApi#transitionCart");
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
| **transitionCartRequest** | [**TransitionCartRequest**](TransitionCartRequest.md)| Request needed for transitioning cart allocations to order/shipment allocations | |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **500** | Internal Server Error |  -  |

