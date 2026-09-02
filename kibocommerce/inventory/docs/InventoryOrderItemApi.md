# InventoryOrderItemApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOrderItemInformation**](InventoryOrderItemApi.md#getOrderItemInformation) | **POST** /commerce/inventory/v5/inventory/getOrderItemInformation | Get Order Item Information |


<a name="getOrderItemInformation"></a>
# **getOrderItemInformation**
> List&lt;OrderItemInformation&gt; getOrderItemInformation(orderItemInformationRequest)

Get Order Item Information

Retrieves the information for a specific order item

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryOrderItemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryOrderItemApi apiInstance = new InventoryOrderItemApi(defaultClient);
    OrderItemInformationRequest orderItemInformationRequest = new OrderItemInformationRequest(); // OrderItemInformationRequest | Request to retrieve order item information
    try {
      List<OrderItemInformation> result = apiInstance.getOrderItemInformation(orderItemInformationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryOrderItemApi#getOrderItemInformation");
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
| **orderItemInformationRequest** | [**OrderItemInformationRequest**](OrderItemInformationRequest.md)| Request to retrieve order item information | |

### Return type

[**List&lt;OrderItemInformation&gt;**](OrderItemInformation.md)

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

