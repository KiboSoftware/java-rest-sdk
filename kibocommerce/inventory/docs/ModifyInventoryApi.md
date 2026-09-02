# ModifyInventoryApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adjust**](ModifyInventoryApi.md#adjust) | **POST** /commerce/inventory/v5/inventory/adjust | Adjust |
| [**delete**](ModifyInventoryApi.md#delete) | **POST** /commerce/inventory/v5/inventory/delete | Delete Inventory |
| [**deleteFutureInventory**](ModifyInventoryApi.md#deleteFutureInventory) | **POST** /commerce/inventory/v5/inventory/deleteFutureInventory | Delete Future Inventory |
| [**deleteItems**](ModifyInventoryApi.md#deleteItems) | **POST** /commerce/inventory/v5/inventory/deleteItems | Delete Items |
| [**redistributeInventoryAcrossTags**](ModifyInventoryApi.md#redistributeInventoryAcrossTags) | **POST** /commerce/inventory/v5/inventory/redistribute | Redistribute Inventory Across Tags |
| [**refresh**](ModifyInventoryApi.md#refresh) | **POST** /commerce/inventory/v5/inventory/refresh | Refresh |
| [**smartAdjustInventory**](ModifyInventoryApi.md#smartAdjustInventory) | **POST** /commerce/inventory/v5/inventory/smart-adjust/ | Smart Adjust Inventory |
| [**smartRefreshInventory**](ModifyInventoryApi.md#smartRefreshInventory) | **POST** /commerce/inventory/v5/inventory/smart-refresh/ | Smart Refresh Inventory |


<a name="adjust"></a>
# **adjust**
> JobIDResponse adjust(adjustRequest)

Adjust

Adjusts the inventory count for a product at a location. It is different from Inventory Refresh because rather than stating the total quantity of the product, this adjustment specifies the amount of change in the form of increments and decrements (+/-). Increments do not require a + sign and may be sent as a simple integer, but decrements must include the – sign. For example, there would be a -2 quantity for an item if there were two fewer than in the previous count, a 2 quantity if there were two more, and a 0 quantity if there were no change.  These requests are placed into a queue of jobs that are processed one at a time. Due to this, the best practice is to submit fewer requests with more items per call, rather than numerous requests with a small number of items each. However, unlike the Refresh API that accepts a maximum of 12000 items per call, this Adjust API only accepts up to 1000 items. If you exceed that limit, a Bad Request error will be returned.  **Recommended:** Consider using the [Smart Adjust](/api-reference/modifyinventory/smart-adjust-inventory) endpoint instead, which automatically routes requests to sync or async processing based on payload size.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ModifyInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ModifyInventoryApi apiInstance = new ModifyInventoryApi(defaultClient);
    AdjustRequest adjustRequest = new AdjustRequest(); // AdjustRequest | Request to adjust inventory
    try {
      JobIDResponse result = apiInstance.adjust(adjustRequest);
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
| **adjustRequest** | [**AdjustRequest**](AdjustRequest.md)| Request to adjust inventory | |

### Return type

[**JobIDResponse**](JobIDResponse.md)

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
| **403** | Forbidden |  -  |

<a name="delete"></a>
# **delete**
> DeleteItemResponse delete(deleteItemRequest, xVolSite)

Delete Inventory

Deletes inventory for a single product identifier (by &#x60;partNumber&#x60;, &#x60;upc&#x60;, or &#x60;sku&#x60;) across all or selected locations. Supports basic regex operators in the identifier field, making it well-suited for pattern-based deletion — for example, removing all products whose part number starts with a given prefix. The operation is asynchronous: the endpoint returns immediately with a list of job IDs (one per affected location) which you can monitor using the Get Job API. Use &#x60;dryRun: true&#x60; to preview the scope of deletion before executing. For step-by-step guidance including dry run workflow, job monitoring, and self-throttling patterns, see the &lt;a href&#x3D;\&quot;/pages/bulk-inventory-deletion\&quot;&gt;Bulk Inventory Deletion guide&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ModifyInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ModifyInventoryApi apiInstance = new ModifyInventoryApi(defaultClient);
    DeleteItemRequest deleteItemRequest = new DeleteItemRequest(); // DeleteItemRequest | Request to delete item(s)
    Integer xVolSite = 56; // Integer | Site ID
    try {
      DeleteItemResponse result = apiInstance.delete(deleteItemRequest, xVolSite);
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
| **deleteItemRequest** | [**DeleteItemRequest**](DeleteItemRequest.md)| Request to delete item(s) | |
| **xVolSite** | **Integer**| Site ID | [optional] |

### Return type

[**DeleteItemResponse**](DeleteItemResponse.md)

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

<a name="deleteFutureInventory"></a>
# **deleteFutureInventory**
> DeleteFutureItemResponse deleteFutureInventory(deleteFutureItemRequest, xVolSite)

Delete Future Inventory

Deletes future inventory.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ModifyInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ModifyInventoryApi apiInstance = new ModifyInventoryApi(defaultClient);
    DeleteFutureItemRequest deleteFutureItemRequest = new DeleteFutureItemRequest(); // DeleteFutureItemRequest | Request to delete future item(s)
    Integer xVolSite = 56; // Integer | Site ID
    try {
      DeleteFutureItemResponse result = apiInstance.deleteFutureInventory(deleteFutureItemRequest, xVolSite);
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
| **deleteFutureItemRequest** | [**DeleteFutureItemRequest**](DeleteFutureItemRequest.md)| Request to delete future item(s) | |
| **xVolSite** | **Integer**| Site ID | [optional] |

### Return type

[**DeleteFutureItemResponse**](DeleteFutureItemResponse.md)

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

<a name="deleteItems"></a>
# **deleteItems**
> DeleteItemResponse deleteItems(deleteItemsRequest, xVolSite)

Delete Items

Deletes inventory for multiple products in a single request. Accepts an array of up to 1,000 product identifiers per request (each specified by &#x60;partNumber&#x60;, &#x60;upc&#x60;, or &#x60;sku&#x60;); the recommended batch size is 500 items. The operation is asynchronous — the endpoint returns immediately with one job ID per affected location for progress tracking. Use &#x60;dryRun: true&#x60; to preview deletion scope before executing. For batch sizing, self-throttling patterns, step-by-step execution workflow, and job monitoring guidance, see the &lt;a href&#x3D;\&quot;/pages/bulk-inventory-deletion\&quot;&gt;Bulk Inventory Deletion guide&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ModifyInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ModifyInventoryApi apiInstance = new ModifyInventoryApi(defaultClient);
    DeleteItemsRequest deleteItemsRequest = new DeleteItemsRequest(); // DeleteItemsRequest | Request to batch delete items
    Integer xVolSite = 56; // Integer | Site ID
    try {
      DeleteItemResponse result = apiInstance.deleteItems(deleteItemsRequest, xVolSite);
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
| **deleteItemsRequest** | [**DeleteItemsRequest**](DeleteItemsRequest.md)| Request to batch delete items | |
| **xVolSite** | **Integer**| Site ID | [optional] |

### Return type

[**DeleteItemResponse**](DeleteItemResponse.md)

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

<a name="redistributeInventoryAcrossTags"></a>
# **redistributeInventoryAcrossTags**
> List&lt;JobQueueResponse&gt; redistributeInventoryAcrossTags()

Redistribute Inventory Across Tags

Create jobs to redistribute inventory across tags for the given tenant

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ModifyInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ModifyInventoryApi apiInstance = new ModifyInventoryApi(defaultClient);
    try {
      List<JobQueueResponse> result = apiInstance.redistributeInventoryAcrossTags();
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
This endpoint does not need any parameter.

### Return type

[**List&lt;JobQueueResponse&gt;**](JobQueueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="refresh"></a>
# **refresh**
> JobIDResponse refresh(refreshRequest)

Refresh

Sets the inventory count for products at a particular location. These requests are placed into a queue of jobs that are processed one at a time. Due to this, the best practice is to submit fewer requests with more items per call, rather than numerous requests with a small number of items each. Unlike the Adjust API that only accepts a maximum of 1000 items per call, this Refresh API can accept up to 12000 items. However, Kibo recommends batches of 3000 items.  **Recommended:** Consider using the [Smart Refresh](/api-reference/modifyinventory/smart-refresh-inventory) endpoint instead, which automatically routes requests to sync or async processing based on payload size.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ModifyInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ModifyInventoryApi apiInstance = new ModifyInventoryApi(defaultClient);
    RefreshRequest refreshRequest = new RefreshRequest(); // RefreshRequest | Request to refresh inventory
    try {
      JobIDResponse result = apiInstance.refresh(refreshRequest);
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
| **refreshRequest** | [**RefreshRequest**](RefreshRequest.md)| Request to refresh inventory | |

### Return type

[**JobIDResponse**](JobIDResponse.md)

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

<a name="smartAdjustInventory"></a>
# **smartAdjustInventory**
> SmartInventoryResponse smartAdjustInventory(adjustRequest)

Smart Adjust Inventory

Dynamically routes inventory adjustment requests to synchronous or asynchronous processing based on payload size. Smaller payloads are generally processed synchronously and return immediate results. Larger payloads are processed asynchronously and return a job ID for tracking. The request schema is identical to the standard Adjust API. For more information, see the &lt;a href&#x3D;\&quot;/pages/smart-inventory-apis\&quot;&gt;Smart Inventory APIs guide&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ModifyInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ModifyInventoryApi apiInstance = new ModifyInventoryApi(defaultClient);
    AdjustRequest adjustRequest = new AdjustRequest(); // AdjustRequest | 
    try {
      SmartInventoryResponse result = apiInstance.smartAdjustInventory(adjustRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModifyInventoryApi#smartAdjustInventory");
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
| **adjustRequest** | [**AdjustRequest**](AdjustRequest.md)|  | |

### Return type

[**SmartInventoryResponse**](SmartInventoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a name="smartRefreshInventory"></a>
# **smartRefreshInventory**
> SmartInventoryResponse smartRefreshInventory(refreshRequest)

Smart Refresh Inventory

Dynamically routes inventory refresh requests to synchronous or asynchronous processing based on payload size. Smaller payloads are generally processed synchronously and return immediate results. Larger payloads are processed asynchronously and return a job ID for tracking. The request schema is identical to the standard Refresh API. For more information, see the &lt;a href&#x3D;\&quot;/pages/smart-inventory-apis\&quot;&gt;Smart Inventory APIs guide&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ModifyInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ModifyInventoryApi apiInstance = new ModifyInventoryApi(defaultClient);
    RefreshRequest refreshRequest = new RefreshRequest(); // RefreshRequest | 
    try {
      SmartInventoryResponse result = apiInstance.smartRefreshInventory(refreshRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModifyInventoryApi#smartRefreshInventory");
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
| **refreshRequest** | [**RefreshRequest**](RefreshRequest.md)|  | |

### Return type

[**SmartInventoryResponse**](SmartInventoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

