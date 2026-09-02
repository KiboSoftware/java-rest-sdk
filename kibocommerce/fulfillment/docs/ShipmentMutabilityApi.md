# ShipmentMutabilityApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**makeShipmentImmutable**](ShipmentMutabilityApi.md#makeShipmentImmutable) | **PUT** /commerce/shipments/{shipmentNumber}/immutable | makeShipmentImmutable |
| [**makeShipmentMutable**](ShipmentMutabilityApi.md#makeShipmentMutable) | **PUT** /commerce/shipments/{shipmentNumber}/mutable | makeShipmentMutable |


<a name="makeShipmentImmutable"></a>
# **makeShipmentImmutable**
> EntityModelOfShipment makeShipmentImmutable(shipmentNumber, xVolTenant, ifMatch, xVolSite, blockActionsRequest)

makeShipmentImmutable

makeShipmentImmutable

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentMutabilityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentMutabilityApi apiInstance = new ShipmentMutabilityApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    BlockActionsRequest blockActionsRequest = new BlockActionsRequest(); // BlockActionsRequest | blockActionsRequest
    try {
      EntityModelOfShipment result = apiInstance.makeShipmentImmutable(shipmentNumber, xVolTenant, ifMatch, xVolSite, blockActionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentMutabilityApi#makeShipmentImmutable");
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
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |
| **blockActionsRequest** | [**BlockActionsRequest**](BlockActionsRequest.md)| blockActionsRequest | [optional] |

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

<a name="makeShipmentMutable"></a>
# **makeShipmentMutable**
> EntityModelOfShipment makeShipmentMutable(shipmentNumber, xVolTenant, ifMatch, xVolSite, blockActionsRequest)

makeShipmentMutable

makeShipmentMutable

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentMutabilityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentMutabilityApi apiInstance = new ShipmentMutabilityApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    BlockActionsRequest blockActionsRequest = new BlockActionsRequest(); // BlockActionsRequest | blockActionsRequest
    try {
      EntityModelOfShipment result = apiInstance.makeShipmentMutable(shipmentNumber, xVolTenant, ifMatch, xVolSite, blockActionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentMutabilityApi#makeShipmentMutable");
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
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |
| **blockActionsRequest** | [**BlockActionsRequest**](BlockActionsRequest.md)| blockActionsRequest | [optional] |

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

