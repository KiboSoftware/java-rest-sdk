# GiftReceiptApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**itemGiftReceiptUpdate**](GiftReceiptApi.md#itemGiftReceiptUpdate) | **PUT** /commerce/shipments/{shipmentNumber}/itemGiftReceipt | itemGiftReceiptUpdate |
| [**shipmentGiftReceiptUpdate**](GiftReceiptApi.md#shipmentGiftReceiptUpdate) | **PUT** /commerce/shipments/{orderId}/shipmentGiftReceipt | shipmentGiftReceiptUpdate |


<a name="itemGiftReceiptUpdate"></a>
# **itemGiftReceiptUpdate**
> EntityModelOfShipment itemGiftReceiptUpdate(shipmentNumber, xVolTenant, itemGiftReceiptRequest, xVolSite)

itemGiftReceiptUpdate

itemGiftReceiptUpdate

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.GiftReceiptApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    GiftReceiptApi apiInstance = new GiftReceiptApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    ItemGiftReceiptRequest itemGiftReceiptRequest = new ItemGiftReceiptRequest(); // ItemGiftReceiptRequest | itemGiftReceiptRequestDto
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.itemGiftReceiptUpdate(shipmentNumber, xVolTenant, itemGiftReceiptRequest, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GiftReceiptApi#itemGiftReceiptUpdate");
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
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **itemGiftReceiptRequest** | [**ItemGiftReceiptRequest**](ItemGiftReceiptRequest.md)| itemGiftReceiptRequestDto | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="shipmentGiftReceiptUpdate"></a>
# **shipmentGiftReceiptUpdate**
> CollectionModelOfShipment shipmentGiftReceiptUpdate(orderId, xVolTenant, shipmentGiftReceiptRequest, xVolSite)

shipmentGiftReceiptUpdate

shipmentGiftReceiptUpdate

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.GiftReceiptApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    GiftReceiptApi apiInstance = new GiftReceiptApi(defaultClient);
    String orderId = "orderId_example"; // String | orderId
    Integer xVolTenant = 56; // Integer | 
    ShipmentGiftReceiptRequest shipmentGiftReceiptRequest = new ShipmentGiftReceiptRequest(); // ShipmentGiftReceiptRequest | shipmentGiftReceiptRequestDto
    Integer xVolSite = 56; // Integer | 
    try {
      CollectionModelOfShipment result = apiInstance.shipmentGiftReceiptUpdate(orderId, xVolTenant, shipmentGiftReceiptRequest, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GiftReceiptApi#shipmentGiftReceiptUpdate");
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
| **orderId** | **String**| orderId | |
| **xVolTenant** | **Integer**|  | |
| **shipmentGiftReceiptRequest** | [**ShipmentGiftReceiptRequest**](ShipmentGiftReceiptRequest.md)| shipmentGiftReceiptRequestDto | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**CollectionModelOfShipment**](CollectionModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

