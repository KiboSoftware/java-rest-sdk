# InventoryAllocationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateInventoryAllocation**](InventoryAllocationApi.md#updateInventoryAllocation) | **PUT** /commerce/shipments/{shipmentNumber}/items/{lineId}/updateInventoryAllocation | updateInventoryAllocation |


<a name="updateInventoryAllocation"></a>
# **updateInventoryAllocation**
> EntityModelOfShipment updateInventoryAllocation(lineId, shipmentNumber, xVolTenant, inventoryAllocation, ifMatch, xVolSite)

updateInventoryAllocation

updateInventoryAllocation

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.InventoryAllocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryAllocationApi apiInstance = new InventoryAllocationApi(defaultClient);
    Integer lineId = 56; // Integer | lineId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    List<InventoryAllocation> inventoryAllocation = Arrays.asList(); // List<InventoryAllocation> | inventoryAllocationDtoList
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.updateInventoryAllocation(lineId, shipmentNumber, xVolTenant, inventoryAllocation, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryAllocationApi#updateInventoryAllocation");
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
| **lineId** | **Integer**| lineId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **inventoryAllocation** | [**List&lt;InventoryAllocation&gt;**](InventoryAllocation.md)| inventoryAllocationDtoList | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

