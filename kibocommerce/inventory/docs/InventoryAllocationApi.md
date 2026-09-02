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
> JobQueueResponse allocateInventory(allocateInventoryRequest)

Allocate Inventory

Allocates inventory based on the given request

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryAllocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryAllocationApi apiInstance = new InventoryAllocationApi(defaultClient);
    AllocateInventoryRequest allocateInventoryRequest = new AllocateInventoryRequest(); // AllocateInventoryRequest | Request to allocate inventory
    try {
      JobQueueResponse result = apiInstance.allocateInventory(allocateInventoryRequest);
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
| **allocateInventoryRequest** | [**AllocateInventoryRequest**](AllocateInventoryRequest.md)| Request to allocate inventory | |

### Return type

[**JobQueueResponse**](JobQueueResponse.md)

### Authorization

No authorization required

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
> BaseResponse deallocateInventory(allocateInventoryRequest)

Deallocate Inventory

As the Refresh Inventory call does not clear allocated inventory, you can use this Deallocate Inventory call if you have items stuck in \&quot;Allocated\&quot; status. This requires details about the shipment and which specific line items need to be deallocated. For examples on how to find shipments with allocated inventory and perform a deallocation on them, see the &lt;a href&#x3D;\&quot;/pages/inventory-api-overview\&quot;&gt;Inventory API guide&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryAllocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryAllocationApi apiInstance = new InventoryAllocationApi(defaultClient);
    AllocateInventoryRequest allocateInventoryRequest = new AllocateInventoryRequest(); // AllocateInventoryRequest | Request to allocate inventory
    try {
      BaseResponse result = apiInstance.deallocateInventory(allocateInventoryRequest);
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
| **allocateInventoryRequest** | [**AllocateInventoryRequest**](AllocateInventoryRequest.md)| Request to allocate inventory | |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

No authorization required

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
> BaseResponse fulfillInventory(allocateInventoryRequest)

Fulfill Inventory

Fulfills inventory based on the given request

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryAllocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryAllocationApi apiInstance = new InventoryAllocationApi(defaultClient);
    AllocateInventoryRequest allocateInventoryRequest = new AllocateInventoryRequest(); // AllocateInventoryRequest | Request to allocate inventory
    try {
      BaseResponse result = apiInstance.fulfillInventory(allocateInventoryRequest);
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
| **allocateInventoryRequest** | [**AllocateInventoryRequest**](AllocateInventoryRequest.md)| Request to allocate inventory | |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

No authorization required

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
> BaseResponse transitionCart(transitionCartRequest)

Transition Cart

Transitions a cart allocation into a normal order/shipment allocation

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryAllocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryAllocationApi apiInstance = new InventoryAllocationApi(defaultClient);
    TransitionCartRequest transitionCartRequest = new TransitionCartRequest(); // TransitionCartRequest | Request needed for transitioning cart allocations to order/shipment allocations
    try {
      BaseResponse result = apiInstance.transitionCart(transitionCartRequest);
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
| **transitionCartRequest** | [**TransitionCartRequest**](TransitionCartRequest.md)| Request needed for transitioning cart allocations to order/shipment allocations | |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **500** | Internal Server Error |  -  |

