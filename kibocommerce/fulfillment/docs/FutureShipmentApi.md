# FutureShipmentApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFutureShipmentsForFutureAllocatableItems**](FutureShipmentApi.md#createFutureShipmentsForFutureAllocatableItems) | **POST** /commerce/shipments/{shipmentNumber}/futureAllocatableItems | createFutureShipmentsForFutureAllocatableItems |
| [**createFutureShipmentsForItems**](FutureShipmentApi.md#createFutureShipmentsForItems) | **POST** /commerce/shipments/{shipmentNumber}/futureItems | Create Future Shipment for Items |
| [**futureShipmentToReady**](FutureShipmentApi.md#futureShipmentToReady) | **PUT** /commerce/shipments/{shipmentNumber}/futureToReady | futureShipmentToReady |
| [**updateFutureShipmentDate**](FutureShipmentApi.md#updateFutureShipmentDate) | **PUT** /commerce/shipments/{shipmentNumber}/futureUpdateDate | updateFutureShipmentDate |


<a name="createFutureShipmentsForFutureAllocatableItems"></a>
# **createFutureShipmentsForFutureAllocatableItems**
> CollectionModelOfEntityModelOfShipment createFutureShipmentsForFutureAllocatableItems(shipmentNumber, xVolTenant, futureItemsRequest, ifMatch, xVolSite)

createFutureShipmentsForFutureAllocatableItems

createFutureShipmentsForFutureAllocatableItems

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.FutureShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    FutureShipmentApi apiInstance = new FutureShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    FutureItemsRequest futureItemsRequest = new FutureItemsRequest(); // FutureItemsRequest | futureItemsRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      CollectionModelOfEntityModelOfShipment result = apiInstance.createFutureShipmentsForFutureAllocatableItems(shipmentNumber, xVolTenant, futureItemsRequest, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureShipmentApi#createFutureShipmentsForFutureAllocatableItems");
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
| **futureItemsRequest** | [**FutureItemsRequest**](FutureItemsRequest.md)| futureItemsRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**CollectionModelOfEntityModelOfShipment**](CollectionModelOfEntityModelOfShipment.md)

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

<a name="createFutureShipmentsForItems"></a>
# **createFutureShipmentsForItems**
> CollectionModelOfEntityModelOfShipment createFutureShipmentsForItems(shipmentNumber, futureItemsRequestDto, ifMatch)

Create Future Shipment for Items

Create a future shipment for future items.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.FutureShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    FutureShipmentApi apiInstance = new FutureShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    FutureItemsRequest futureItemsRequestDto = new FutureItemsRequest(); // FutureItemsRequest | futureItemsRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      CollectionModelOfEntityModelOfShipment result = apiInstance.createFutureShipmentsForItems(shipmentNumber, futureItemsRequestDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureShipmentApi#createFutureShipmentsForItems");
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
| **futureItemsRequestDto** | [**FutureItemsRequest**](FutureItemsRequest.md)| futureItemsRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |

### Return type

[**CollectionModelOfEntityModelOfShipment**](CollectionModelOfEntityModelOfShipment.md)

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

<a name="futureShipmentToReady"></a>
# **futureShipmentToReady**
> EntityModelOfShipment futureShipmentToReady(shipmentNumber, ifMatch)

futureShipmentToReady

Move a Future shipment to Ready.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.FutureShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    FutureShipmentApi apiInstance = new FutureShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.futureShipmentToReady(shipmentNumber, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureShipmentApi#futureShipmentToReady");
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
| **ifMatch** | **String**| If-Match | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="updateFutureShipmentDate"></a>
# **updateFutureShipmentDate**
> EntityModelOfShipment updateFutureShipmentDate(shipmentNumber, futureShipmentUpdateDateRequestDto, ifMatch)

updateFutureShipmentDate

Update a future shipment&#39;s expected date.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.FutureShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    FutureShipmentApi apiInstance = new FutureShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    FutureShipmentUpdateDateRequest futureShipmentUpdateDateRequestDto = new FutureShipmentUpdateDateRequest(); // FutureShipmentUpdateDateRequest | futureShipmentUpdateDateRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.updateFutureShipmentDate(shipmentNumber, futureShipmentUpdateDateRequestDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureShipmentApi#updateFutureShipmentDate");
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
| **futureShipmentUpdateDateRequestDto** | [**FutureShipmentUpdateDateRequest**](FutureShipmentUpdateDateRequest.md)| futureShipmentUpdateDateRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

