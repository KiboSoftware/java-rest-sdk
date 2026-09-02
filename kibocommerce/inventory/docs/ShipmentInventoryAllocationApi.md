# ShipmentInventoryAllocationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getShipmentInventoryAllocations**](ShipmentInventoryAllocationApi.md#getShipmentInventoryAllocations) | **POST** /commerce/inventory/v5/inventory/shipmentInventoryAllocations | Get Shipment Inventory Allocations |


<a name="getShipmentInventoryAllocations"></a>
# **getShipmentInventoryAllocations**
> ShipmentInventoryAllocationResponse getShipmentInventoryAllocations(shipmentInventoryAllocationRequest)

Get Shipment Inventory Allocations

Get future Inventory Allocations by shipment Ids

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ShipmentInventoryAllocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentInventoryAllocationApi apiInstance = new ShipmentInventoryAllocationApi(defaultClient);
    ShipmentInventoryAllocationRequest shipmentInventoryAllocationRequest = new ShipmentInventoryAllocationRequest(); // ShipmentInventoryAllocationRequest | Request to future and current inventory allocations of item
    try {
      ShipmentInventoryAllocationResponse result = apiInstance.getShipmentInventoryAllocations(shipmentInventoryAllocationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentInventoryAllocationApi#getShipmentInventoryAllocations");
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
| **shipmentInventoryAllocationRequest** | [**ShipmentInventoryAllocationRequest**](ShipmentInventoryAllocationRequest.md)| Request to future and current inventory allocations of item | |

### Return type

[**ShipmentInventoryAllocationResponse**](ShipmentInventoryAllocationResponse.md)

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

