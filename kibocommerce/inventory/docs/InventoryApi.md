# InventoryApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aggregate**](InventoryApi.md#aggregate) | **POST** /commerce/inventory/v5/inventory/aggregate | Aggregate |
| [**postQueryInventory**](InventoryApi.md#postQueryInventory) | **POST** /commerce/inventory/v5/inventory | Get Inventory (POST) |


<a name="aggregate"></a>
# **aggregate**
> List&lt;AggregateResponse&gt; aggregate(aggregateRequest, xVolSite)

Aggregate

Aggregates inventory.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryApi apiInstance = new InventoryApi(defaultClient);
    AggregateRequest aggregateRequest = new AggregateRequest(); // AggregateRequest | Request to aggregate inventory
    Integer xVolSite = 56; // Integer | Site ID
    try {
      List<AggregateResponse> result = apiInstance.aggregate(aggregateRequest, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#aggregate");
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
| **aggregateRequest** | [**AggregateRequest**](AggregateRequest.md)| Request to aggregate inventory | |
| **xVolSite** | **Integer**| Site ID | [optional] |

### Return type

[**List&lt;AggregateResponse&gt;**](AggregateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="postQueryInventory"></a>
# **postQueryInventory**
> List&lt;InventoryResponse&gt; postQueryInventory(inventoryRequest, xVolSite)

Get Inventory (POST)

Queries for specified inventory at given location. To call the version of this API with RIS (&lt;a href&#x3D;\&quot;/pages/real-time-inventory-service\&quot;&gt;real-time inventory service&lt;/a&gt;) data, use the /commerce/realtime-inventory/v5/inventory endpoint instead.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryApi apiInstance = new InventoryApi(defaultClient);
    InventoryRequest inventoryRequest = new InventoryRequest(); // InventoryRequest | Request to get inventory
    Integer xVolSite = 56; // Integer | Site ID
    try {
      List<InventoryResponse> result = apiInstance.postQueryInventory(inventoryRequest, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#postQueryInventory");
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
| **inventoryRequest** | [**InventoryRequest**](InventoryRequest.md)| Request to get inventory | |
| **xVolSite** | **Integer**| Site ID | [optional] |

### Return type

[**List&lt;InventoryResponse&gt;**](InventoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

