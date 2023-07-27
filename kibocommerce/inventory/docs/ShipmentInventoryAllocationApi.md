# ShipmentInventoryAllocationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getShipmentInventoryAllocations**](ShipmentInventoryAllocationApi.md#getShipmentInventoryAllocations) | **POST** /commerce/inventory/v5/inventory/shipmentInventoryAllocations | Get Shipment Inventory Allocations |


<a name="getShipmentInventoryAllocations"></a>
# **getShipmentInventoryAllocations**
> ShipmentInventoryAllocationResponse getShipmentInventoryAllocations(xVolTenant, shipmentInventoryAllocationRequest)

Get Shipment Inventory Allocations

Get future Inventory Allocations by shipment Ids

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ShipmentInventoryAllocationApi;

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

    ShipmentInventoryAllocationApi apiInstance = new ShipmentInventoryAllocationApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    ShipmentInventoryAllocationRequest shipmentInventoryAllocationRequest = new ShipmentInventoryAllocationRequest(); // ShipmentInventoryAllocationRequest | Request to future and current inventory allocations of item
    try {
      ShipmentInventoryAllocationResponse result = apiInstance.getShipmentInventoryAllocations(xVolTenant, shipmentInventoryAllocationRequest);
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **shipmentInventoryAllocationRequest** | [**ShipmentInventoryAllocationRequest**](ShipmentInventoryAllocationRequest.md)| Request to future and current inventory allocations of item | |

### Return type

[**ShipmentInventoryAllocationResponse**](ShipmentInventoryAllocationResponse.md)

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

