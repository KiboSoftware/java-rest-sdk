# ShipmentApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**backorderItems**](ShipmentApi.md#backorderItems) | **POST** /commerce/shipments/{shipmentNumber}/backorderedItems | backorderItems |
| [**backorderItemsUpdate**](ShipmentApi.md#backorderItemsUpdate) | **PUT** /commerce/shipments/{shipmentNumber}/backorderedItems | Update Backorder Items |
| [**backorderShipment**](ShipmentApi.md#backorderShipment) | **POST** /commerce/shipments/{shipmentNumber}/backordered | backorderShipment |
| [**cancelItems**](ShipmentApi.md#cancelItems) | **PUT** /commerce/shipments/{shipmentNumber}/canceledItems | cancelItems |
| [**cancelShipment**](ShipmentApi.md#cancelShipment) | **PUT** /commerce/shipments/{shipmentNumber}/canceled | cancelShipment |
| [**cancelShipments**](ShipmentApi.md#cancelShipments) | **PUT** /commerce/shipments/order/{orderId}/canceled | Cancel Order Shipments |
| [**customerAtCurbside**](ShipmentApi.md#customerAtCurbside) | **PUT** /commerce/shipments/{shipmentNumber}/customerAtCurbside | customerAtCurbside |
| [**customerAtStore**](ShipmentApi.md#customerAtStore) | **PUT** /commerce/shipments/{shipmentNumber}/customerAtStore | customerAtStore |
| [**customerCareItems**](ShipmentApi.md#customerCareItems) | **POST** /commerce/shipments/{shipmentNumber}/customerCaredItems | customerCareItems |
| [**customerCareShipment**](ShipmentApi.md#customerCareShipment) | **PUT** /commerce/shipments/{shipmentNumber}/customerCared | customerCareShipment |
| [**customerInTransit**](ShipmentApi.md#customerInTransit) | **PUT** /commerce/shipments/{shipmentNumber}/customerInTransit | Customer in Transit |
| [**deleteShipment**](ShipmentApi.md#deleteShipment) | **DELETE** /commerce/shipments/{shipmentNumber} | deleteShipment |
| [**deleteShipmentsOfOrder**](ShipmentApi.md#deleteShipmentsOfOrder) | **DELETE** /commerce/shipments/order/{orderId} | Delete Order Shipments |
| [**destinationUpdate**](ShipmentApi.md#destinationUpdate) | **PUT** /commerce/shipments/{shipmentNumber}/destination | Destination Update |
| [**estimatedDeliveryDateClear**](ShipmentApi.md#estimatedDeliveryDateClear) | **DELETE** /commerce/shipments/{shipmentNumber}/estimatedDeliveryDate | estimatedDeliveryDateClear |
| [**estimatedDeliveryDateUpdate**](ShipmentApi.md#estimatedDeliveryDateUpdate) | **PUT** /commerce/shipments/{shipmentNumber}/estimatedDeliveryDateUpdate | estimatedDeliveryDateUpdate |
| [**execute**](ShipmentApi.md#execute) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskName}/completed | Execute Task |
| [**fulfillShipment**](ShipmentApi.md#fulfillShipment) | **PUT** /commerce/shipments/{shipmentNumber}/fulfilled | fulfillShipment |
| [**getLocationShipmentCount**](ShipmentApi.md#getLocationShipmentCount) | **GET** /commerce/shipments/locationShipmentCount | getLocationShipmentCount |
| [**getLocationSummaryReport**](ShipmentApi.md#getLocationSummaryReport) | **GET** /commerce/shipments/locationSummaryReport | getLocationSummaryReport |
| [**getShipment**](ShipmentApi.md#getShipment) | **GET** /commerce/shipments/{shipmentNumber} | getShipment |
| [**getShipmentStepCountByShipmentType**](ShipmentApi.md#getShipmentStepCountByShipmentType) | **GET** /commerce/shipments/countsByStep | Get Shipment Step Count by Shipment Type |
| [**getShipments**](ShipmentApi.md#getShipments) | **GET** /commerce/shipments | getShipments |
| [**getTasks**](ShipmentApi.md#getTasks) | **GET** /commerce/shipments/{shipmentNumber}/tasks | Get Tasks |
| [**getWorkflowVariable**](ShipmentApi.md#getWorkflowVariable) | **GET** /commerce/shipments/{shipmentNumber}/workflow/variables/{variableName} | getWorkflowVariable |
| [**getWorkflowVariables**](ShipmentApi.md#getWorkflowVariables) | **GET** /commerce/shipments/{shipmentNumber}/workflow/variables | getWorkflowVariables |
| [**itemsReadyForPack**](ShipmentApi.md#itemsReadyForPack) | **POST** /commerce/shipments/{shipmentNumber}/itemsReadyForPack | itemsReadyForPack |
| [**itemsReadyForPrep**](ShipmentApi.md#itemsReadyForPrep) | **POST** /commerce/shipments/{shipmentNumber}/itemsReadyForPrep | itemsReadyForPrep |
| [**newShipment**](ShipmentApi.md#newShipment) | **POST** /commerce/shipments | newShipment |
| [**newShipmentViaProxy**](ShipmentApi.md#newShipmentViaProxy) | **POST** /commerce/shipments/newShipmentViaProxy | newShipmentViaProxy |
| [**newShipments**](ShipmentApi.md#newShipments) | **POST** /commerce/shipments/bulk | Create Shipments |
| [**pickupItems**](ShipmentApi.md#pickupItems) | **POST** /commerce/shipments/{shipmentNumber}/pickedUpItems | Picked Up Items |
| [**reassignItems**](ShipmentApi.md#reassignItems) | **PUT** /commerce/shipments/{shipmentNumber}/reassignedItems | reassignItems |
| [**reassignShipment**](ShipmentApi.md#reassignShipment) | **PUT** /commerce/shipments/{shipmentNumber}/reassigned | Reassign Shipments |
| [**receiveTransfer**](ShipmentApi.md#receiveTransfer) | **PUT** /commerce/shipments/{shipmentNumber}/received | receiveTransfer |
| [**refreshShipment**](ShipmentApi.md#refreshShipment) | **PUT** /commerce/shipments/{shipmentNumber}/refresh | refreshShipment |
| [**rejectItems**](ShipmentApi.md#rejectItems) | **PUT** /commerce/shipments/{shipmentNumber}/rejectedItems | rejectItems |
| [**rejectShipment**](ShipmentApi.md#rejectShipment) | **PUT** /commerce/shipments/{shipmentNumber}/rejected | rejectShipment |
| [**renderOrderSummary**](ShipmentApi.md#renderOrderSummary) | **GET** /commerce/shipments/{shipmentNumber}/order-summary/html | Render Order Summary |
| [**renderPackingSlip**](ShipmentApi.md#renderPackingSlip) | **GET** /commerce/shipments/{shipmentNumber}/rendition/html | Render Packing Slip |
| [**replaceShipment**](ShipmentApi.md#replaceShipment) | **PUT** /commerce/shipments/{shipmentNumber} | Replace Shipment |
| [**resendItemEmail**](ShipmentApi.md#resendItemEmail) | **PUT** /commerce/shipments/{shipmentNumber}/items/{lineId}/email/resend | resendItemEmail |
| [**resendShipmentEmail**](ShipmentApi.md#resendShipmentEmail) | **PUT** /commerce/shipments/{shipmentNumber}/email/resend | resendShipmentEmail |
| [**resetStockValidation**](ShipmentApi.md#resetStockValidation) | **DELETE** /commerce/shipments/{shipmentNumber}/items/{lineId}/validateStock | resetStockValidation |
| [**retryFulfillingShipment**](ShipmentApi.md#retryFulfillingShipment) | **PUT** /commerce/shipments/{shipmentNumber}/retried | retryFulfillingShipment |
| [**revert**](ShipmentApi.md#revert) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskName}/reverted | Revert Task |
| [**searchAndReceiveTransfer**](ShipmentApi.md#searchAndReceiveTransfer) | **PUT** /commerce/shipments/received/{search} | Search and Receive Transfer |
| [**searchReceivableShipment**](ShipmentApi.md#searchReceivableShipment) | **GET** /commerce/shipments/receivable/{search} | searchReceivableShipment |
| [**searchShipments**](ShipmentApi.md#searchShipments) | **POST** /commerce/shipments/search | searchShipments |
| [**setWorkflowVariable**](ShipmentApi.md#setWorkflowVariable) | **POST** /commerce/shipments/{shipmentNumber}/workflow/variables | setWorkflowVariable |
| [**skipTask**](ShipmentApi.md#skipTask) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskName}/skipped | Skip Task |
| [**transferItems**](ShipmentApi.md#transferItems) | **PUT** /commerce/shipments/{shipmentNumber}/transferredItems | transferItems |
| [**transferShipment**](ShipmentApi.md#transferShipment) | **PUT** /commerce/shipments/{shipmentNumber}/transferred | transferShipment |
| [**updateFulfillmentFields**](ShipmentApi.md#updateFulfillmentFields) | **PUT** /commerce/shipments/{shipmentNumber}/fulfillmentFields | updateFulfillmentFields |
| [**updateGiftCardInfo**](ShipmentApi.md#updateGiftCardInfo) | **PUT** /commerce/shipments/{shipmentNumber}/giftCardInfo | updateGiftCardInfo |
| [**updateLastCancellationDate**](ShipmentApi.md#updateLastCancellationDate) | **PUT** /commerce/shipments/{shipmentNumber}/lastCancellationDate | updateLastCancellationDate |
| [**validateStockItem**](ShipmentApi.md#validateStockItem) | **PUT** /commerce/shipments/{shipmentNumber}/items/{lineId}/validateStock | validateStockItem |
| [**workflowDefinitionImage**](ShipmentApi.md#workflowDefinitionImage) | **GET** /commerce/shipments/{shipmentNumber}/workflow-definition-image | Workflow Definition Image |
| [**workflowInstanceImage**](ShipmentApi.md#workflowInstanceImage) | **GET** /commerce/shipments/{shipmentNumber}/workflow-instance-image | workflowInstanceImage |


<a name="backorderItems"></a>
# **backorderItems**
> EntityModelOfShipment backorderItems(shipmentNumber, backorderItemsRequestDto, ifMatch)

backorderItems

Backorder items from a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    BackorderItemsRequest backorderItemsRequestDto = new BackorderItemsRequest(); // BackorderItemsRequest | backorderItemsRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.backorderItems(shipmentNumber, backorderItemsRequestDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#backorderItems");
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
| **backorderItemsRequestDto** | [**BackorderItemsRequest**](BackorderItemsRequest.md)| backorderItemsRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="backorderItemsUpdate"></a>
# **backorderItemsUpdate**
> EntityModelOfShipment backorderItemsUpdate(shipmentNumber, backorderItemsUpdateRequestDto, ifMatch)

Update Backorder Items

Update a shipment&#39;s backordered items.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    BackorderItemsUpdateRequest backorderItemsUpdateRequestDto = new BackorderItemsUpdateRequest(); // BackorderItemsUpdateRequest | backorderItemsUpdateRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.backorderItemsUpdate(shipmentNumber, backorderItemsUpdateRequestDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#backorderItemsUpdate");
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
| **backorderItemsUpdateRequestDto** | [**BackorderItemsUpdateRequest**](BackorderItemsUpdateRequest.md)| backorderItemsUpdateRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="backorderShipment"></a>
# **backorderShipment**
> EntityModelOfShipment backorderShipment(shipmentNumber, backorderShipmentRequestDto, ifMatch)

backorderShipment

Backorder a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    BackorderShipmentRequest backorderShipmentRequestDto = new BackorderShipmentRequest(); // BackorderShipmentRequest | backorderShipmentRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.backorderShipment(shipmentNumber, backorderShipmentRequestDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#backorderShipment");
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
| **backorderShipmentRequestDto** | [**BackorderShipmentRequest**](BackorderShipmentRequest.md)| backorderShipmentRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="cancelItems"></a>
# **cancelItems**
> EntityModelOfShipment cancelItems(shipmentNumber, cancelItemsRequestDto, ifMatch)

cancelItems

Cancel items from a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    CancelItemsRequest cancelItemsRequestDto = new CancelItemsRequest(); // CancelItemsRequest | cancelItemsRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.cancelItems(shipmentNumber, cancelItemsRequestDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#cancelItems");
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
| **cancelItemsRequestDto** | [**CancelItemsRequest**](CancelItemsRequest.md)| cancelItemsRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="cancelShipment"></a>
# **cancelShipment**
> EntityModelOfShipment cancelShipment(shipmentNumber, cancelShipmentRequestDto, ifMatch)

cancelShipment

Cancel a specific shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    CancelShipment cancelShipmentRequestDto = new CancelShipment(); // CancelShipment | cancelShipmentRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.cancelShipment(shipmentNumber, cancelShipmentRequestDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#cancelShipment");
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
| **cancelShipmentRequestDto** | [**CancelShipment**](CancelShipment.md)| cancelShipmentRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="cancelShipments"></a>
# **cancelShipments**
> CollectionModelOfShipment cancelShipments(orderId, cancelShipmentRequestDto)

Cancel Order Shipments

Cancel an order&#39;s shipments.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String orderId = "orderId_example"; // String | orderId
    CancelShipment cancelShipmentRequestDto = new CancelShipment(); // CancelShipment | cancelShipmentRequestDto
    try {
      CollectionModelOfShipment result = apiInstance.cancelShipments(orderId, cancelShipmentRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#cancelShipments");
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
| **cancelShipmentRequestDto** | [**CancelShipment**](CancelShipment.md)| cancelShipmentRequestDto | |

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

<a name="customerAtCurbside"></a>
# **customerAtCurbside**
> EntityModelOfShipment customerAtCurbside(shipmentNumber, pickupInfo, ifMatch)

customerAtCurbside

Indicates that the customer is ready for curbside pickup.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Map<String, Object> pickupInfo = null; // Map<String, Object> | pickupInfo
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.customerAtCurbside(shipmentNumber, pickupInfo, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#customerAtCurbside");
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
| **pickupInfo** | [**Map&lt;String, Object&gt;**](Object.md)| pickupInfo | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="customerAtStore"></a>
# **customerAtStore**
> EntityModelOfShipment customerAtStore(shipmentNumber, ifMatch)

customerAtStore

Indicates that a customer is ready for in-store pickup.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.customerAtStore(shipmentNumber, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#customerAtStore");
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
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="customerCareItems"></a>
# **customerCareItems**
> EntityModelOfShipment customerCareItems(shipmentNumber, rejectItemsRequestDto, ifMatch)

customerCareItems

Places shipment items into Customer Care.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    RejectItemsRequest rejectItemsRequestDto = new RejectItemsRequest(); // RejectItemsRequest | rejectItemsRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.customerCareItems(shipmentNumber, rejectItemsRequestDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#customerCareItems");
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
| **rejectItemsRequestDto** | [**RejectItemsRequest**](RejectItemsRequest.md)| rejectItemsRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="customerCareShipment"></a>
# **customerCareShipment**
> EntityModelOfShipment customerCareShipment(shipmentNumber, rejectShipmentRequestDto, ifMatch)

customerCareShipment

Places a shipment into Customer Care.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    RejectShipment rejectShipmentRequestDto = new RejectShipment(); // RejectShipment | rejectShipmentRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.customerCareShipment(shipmentNumber, rejectShipmentRequestDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#customerCareShipment");
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
| **rejectShipmentRequestDto** | [**RejectShipment**](RejectShipment.md)| rejectShipmentRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="customerInTransit"></a>
# **customerInTransit**
> EntityModelOfShipment customerInTransit(shipmentNumber, ifMatch)

Customer in Transit

Indicates that the customer is in transit for pickup.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.customerInTransit(shipmentNumber, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#customerInTransit");
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
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="deleteShipment"></a>
# **deleteShipment**
> deleteShipment(shipmentNumber, ifMatch)

deleteShipment

Delete a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      apiInstance.deleteShipment(shipmentNumber, ifMatch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#deleteShipment");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="deleteShipmentsOfOrder"></a>
# **deleteShipmentsOfOrder**
> deleteShipmentsOfOrder(orderId)

Delete Order Shipments

Delete the shipments of an order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String orderId = "orderId_example"; // String | orderId
    try {
      apiInstance.deleteShipmentsOfOrder(orderId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#deleteShipmentsOfOrder");
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

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="destinationUpdate"></a>
# **destinationUpdate**
> EntityModelOfShipment destinationUpdate(shipmentNumber, destinationDto, ifMatch)

Destination Update

Update a shipment&#39;s destination.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    FulfillmentAPIDestination destinationDto = new FulfillmentAPIDestination(); // FulfillmentAPIDestination | destinationDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.destinationUpdate(shipmentNumber, destinationDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#destinationUpdate");
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
| **destinationDto** | [**FulfillmentAPIDestination**](FulfillmentAPIDestination.md)| destinationDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="estimatedDeliveryDateClear"></a>
# **estimatedDeliveryDateClear**
> EntityModelOfShipment estimatedDeliveryDateClear(shipmentNumber, xVolTenant, ifMatch, xVolSite)

estimatedDeliveryDateClear

estimatedDeliveryDateClear

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.estimatedDeliveryDateClear(shipmentNumber, xVolTenant, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#estimatedDeliveryDateClear");
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

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="estimatedDeliveryDateUpdate"></a>
# **estimatedDeliveryDateUpdate**
> EntityModelOfShipment estimatedDeliveryDateUpdate(shipmentNumber, xVolTenant, estimatedDeliveryDateUpdateRequest, ifMatch, xVolSite)

estimatedDeliveryDateUpdate

estimatedDeliveryDateUpdate

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    EstimatedDeliveryDateUpdateRequest estimatedDeliveryDateUpdateRequest = new EstimatedDeliveryDateUpdateRequest(); // EstimatedDeliveryDateUpdateRequest | estimatedDeliveryDateUpdateRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.estimatedDeliveryDateUpdate(shipmentNumber, xVolTenant, estimatedDeliveryDateUpdateRequest, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#estimatedDeliveryDateUpdate");
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
| **estimatedDeliveryDateUpdateRequest** | [**EstimatedDeliveryDateUpdateRequest**](EstimatedDeliveryDateUpdateRequest.md)| estimatedDeliveryDateUpdateRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |
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

<a name="execute"></a>
# **execute**
> EntityModelOfShipment execute(shipmentNumber, taskName, taskCompleteDto, ifMatch)

Execute Task

Complete a shipment task.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String taskName = "taskName_example"; // String | taskName
    TaskComplete taskCompleteDto = new TaskComplete(); // TaskComplete | taskCompleteDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.execute(shipmentNumber, taskName, taskCompleteDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#execute");
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
| **taskName** | **String**| taskName | |
| **taskCompleteDto** | [**TaskComplete**](TaskComplete.md)| taskCompleteDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="fulfillShipment"></a>
# **fulfillShipment**
> EntityModelOfShipment fulfillShipment(shipmentNumber, ifMatch)

fulfillShipment

Mark a shipment as fulfilled.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.fulfillShipment(shipmentNumber, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#fulfillShipment");
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
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getLocationShipmentCount"></a>
# **getLocationShipmentCount**
> CollectionModelOfLocationShipmentCount getLocationShipmentCount(locationCodes, startDateTime, xVolTenant, bypassSearchIndex, xVolSite)

getLocationShipmentCount

getLocationShipmentCount

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    List<String> locationCodes = Arrays.asList(); // List<String> | locationCodes
    OffsetDateTime startDateTime = OffsetDateTime.now(); // OffsetDateTime | startDateTime
    Integer xVolTenant = 56; // Integer | 
    Boolean bypassSearchIndex = true; // Boolean | bypassSearchIndex
    Integer xVolSite = 56; // Integer | 
    try {
      CollectionModelOfLocationShipmentCount result = apiInstance.getLocationShipmentCount(locationCodes, startDateTime, xVolTenant, bypassSearchIndex, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#getLocationShipmentCount");
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
| **locationCodes** | [**List&lt;String&gt;**](String.md)| locationCodes | |
| **startDateTime** | **OffsetDateTime**| startDateTime | |
| **xVolTenant** | **Integer**|  | |
| **bypassSearchIndex** | **Boolean**| bypassSearchIndex | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**CollectionModelOfLocationShipmentCount**](CollectionModelOfLocationShipmentCount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getLocationSummaryReport"></a>
# **getLocationSummaryReport**
> CollectionModelOfLocationSummary getLocationSummaryReport(locationCodes, startDateTime, bypassSearchIndex)

getLocationSummaryReport

Get a location summary report.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    List<String> locationCodes = Arrays.asList(); // List<String> | locationCodes
    OffsetDateTime startDateTime = OffsetDateTime.now(); // OffsetDateTime | startDateTime
    Boolean bypassSearchIndex = true; // Boolean | bypassSearchIndex
    try {
      CollectionModelOfLocationSummary result = apiInstance.getLocationSummaryReport(locationCodes, startDateTime, bypassSearchIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#getLocationSummaryReport");
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
| **locationCodes** | [**List&lt;String&gt;**](String.md)| locationCodes | |
| **startDateTime** | **OffsetDateTime**| startDateTime | |
| **bypassSearchIndex** | **Boolean**| bypassSearchIndex | [optional] |

### Return type

[**CollectionModelOfLocationSummary**](CollectionModelOfLocationSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getShipment"></a>
# **getShipment**
> EntityModelOfShipment getShipment(shipmentNumber)

getShipment

Get a specific shipment by its number.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      EntityModelOfShipment result = apiInstance.getShipment(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#getShipment");
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

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getShipmentStepCountByShipmentType"></a>
# **getShipmentStepCountByShipmentType**
> EntityModelOfDashboardResponse getShipmentStepCountByShipmentType(shipmentType, assignedLocations)

Get Shipment Step Count by Shipment Type

Get the step counts of shipment types.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String shipmentType = "shipmentType_example"; // String | shipmentType
    List<String> assignedLocations = Arrays.asList(); // List<String> | assignedLocations
    try {
      EntityModelOfDashboardResponse result = apiInstance.getShipmentStepCountByShipmentType(shipmentType, assignedLocations);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#getShipmentStepCountByShipmentType");
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
| **shipmentType** | **String**| shipmentType | |
| **assignedLocations** | [**List&lt;String&gt;**](String.md)| assignedLocations | [optional] |

### Return type

[**EntityModelOfDashboardResponse**](EntityModelOfDashboardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getShipments"></a>
# **getShipments**
> PagedModelOfEntityModelOfShipment getShipments(bypassSearchIndex, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName)

getShipments

A paged list of shipments is returned according to any specified filter criteria and sort options. These Fulfillment APIs use a different paging  and filtering scheme than most other APIs in the system. For more information,  see the &lt;a href&#x3D;\&quot;/pages/sorting-and-filtering-apis\&quot;&gt;Sorting &amp; Filtering APIs guide&lt;/a&gt;  in the knowledge base.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Boolean bypassSearchIndex = true; // Boolean | 
    String filter = "filter_example"; // String | 
    Boolean isLate = true; // Boolean | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String quickSearch = "quickSearch_example"; // String | 
    String sort = "sort_example"; // String | 
    String workflowTaskName = "workflowTaskName_example"; // String | 
    try {
      PagedModelOfEntityModelOfShipment result = apiInstance.getShipments(bypassSearchIndex, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#getShipments");
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
| **bypassSearchIndex** | **Boolean**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **isLate** | **Boolean**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **quickSearch** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **workflowTaskName** | **String**|  | [optional] |

### Return type

[**PagedModelOfEntityModelOfShipment**](PagedModelOfEntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getTasks"></a>
# **getTasks**
> CollectionModelOfTask getTasks(shipmentNumber)

Get Tasks

Get all shipment tasks.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      CollectionModelOfTask result = apiInstance.getTasks(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#getTasks");
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

### Return type

[**CollectionModelOfTask**](CollectionModelOfTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getWorkflowVariable"></a>
# **getWorkflowVariable**
> BpmVariable getWorkflowVariable(shipmentNumber, variableName, xVolTenant, xVolSite)

getWorkflowVariable

getWorkflowVariable

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String variableName = "variableName_example"; // String | variableName
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      BpmVariable result = apiInstance.getWorkflowVariable(shipmentNumber, variableName, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#getWorkflowVariable");
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
| **variableName** | **String**| variableName | |
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**BpmVariable**](BpmVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getWorkflowVariables"></a>
# **getWorkflowVariables**
> List&lt;BpmVariable&gt; getWorkflowVariables(shipmentNumber, xVolTenant, xVolSite)

getWorkflowVariables

getWorkflowVariables

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      List<BpmVariable> result = apiInstance.getWorkflowVariables(shipmentNumber, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#getWorkflowVariables");
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
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**List&lt;BpmVariable&gt;**](BpmVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="itemsReadyForPack"></a>
# **itemsReadyForPack**
> EntityModelOfShipment itemsReadyForPack(shipmentNumber, xVolTenant, readyForPackItemsRequest, ifMatch, xVolSite)

itemsReadyForPack

itemsReadyForPack

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    ReadyForPackItemsRequest readyForPackItemsRequest = new ReadyForPackItemsRequest(); // ReadyForPackItemsRequest | readyForPackItemsRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.itemsReadyForPack(shipmentNumber, xVolTenant, readyForPackItemsRequest, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#itemsReadyForPack");
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
| **readyForPackItemsRequest** | [**ReadyForPackItemsRequest**](ReadyForPackItemsRequest.md)| readyForPackItemsRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |
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

<a name="itemsReadyForPrep"></a>
# **itemsReadyForPrep**
> EntityModelOfShipment itemsReadyForPrep(shipmentNumber, xVolTenant, readyForPrepItemsRequest, ifMatch, xVolSite)

itemsReadyForPrep

itemsReadyForPrep

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    ReadyForPrepItemsRequest readyForPrepItemsRequest = new ReadyForPrepItemsRequest(); // ReadyForPrepItemsRequest | readyForPrepItemsRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.itemsReadyForPrep(shipmentNumber, xVolTenant, readyForPrepItemsRequest, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#itemsReadyForPrep");
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
| **readyForPrepItemsRequest** | [**ReadyForPrepItemsRequest**](ReadyForPrepItemsRequest.md)| readyForPrepItemsRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |
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

<a name="newShipment"></a>
# **newShipment**
> EntityModelOfShipment newShipment(xVolTenant, newShipment, xVolSite)

newShipment

Create a new shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    FulfillmentAPIShipment newShipment = new FulfillmentAPIShipment(); // FulfillmentAPIShipment | newShipment
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.newShipment(xVolTenant, newShipment, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#newShipment");
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
| **xVolTenant** | **Integer**|  | |
| **newShipment** | [**FulfillmentAPIShipment**](FulfillmentAPIShipment.md)| newShipment | |
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

<a name="newShipmentViaProxy"></a>
# **newShipmentViaProxy**
> EntityModelOfShipment newShipmentViaProxy(xVolTenant, fulfillmentAPIShipment, xVolSite)

newShipmentViaProxy

newShipmentViaProxy

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    FulfillmentAPIShipment fulfillmentAPIShipment = new FulfillmentAPIShipment(); // FulfillmentAPIShipment | newShipment
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.newShipmentViaProxy(xVolTenant, fulfillmentAPIShipment, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#newShipmentViaProxy");
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
| **xVolTenant** | **Integer**|  | |
| **fulfillmentAPIShipment** | [**FulfillmentAPIShipment**](FulfillmentAPIShipment.md)| newShipment | |
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

<a name="newShipments"></a>
# **newShipments**
> CollectionModelOfEntityModelOfShipment newShipments(xVolTenant, newShipments, xVolSite)

Create Shipments

Create new shipments in bulk.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    List<FulfillmentAPIShipment> newShipments = Arrays.asList(); // List<FulfillmentAPIShipment> | newShipments
    Integer xVolSite = 56; // Integer | 
    try {
      CollectionModelOfEntityModelOfShipment result = apiInstance.newShipments(xVolTenant, newShipments, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#newShipments");
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
| **xVolTenant** | **Integer**|  | |
| **newShipments** | [**List&lt;FulfillmentAPIShipment&gt;**](FulfillmentAPIShipment.md)| newShipments | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**CollectionModelOfEntityModelOfShipment**](CollectionModelOfEntityModelOfShipment.md)

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

<a name="pickupItems"></a>
# **pickupItems**
> EntityModelOfShipment pickupItems(shipmentNumber, pickupItemsRequestDto, ifMatch)

Picked Up Items

Mark shipment items as picked up.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    PickupItemsRequest pickupItemsRequestDto = new PickupItemsRequest(); // PickupItemsRequest | pickupItemsRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.pickupItems(shipmentNumber, pickupItemsRequestDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#pickupItems");
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
| **pickupItemsRequestDto** | [**PickupItemsRequest**](PickupItemsRequest.md)| pickupItemsRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="reassignItems"></a>
# **reassignItems**
> EntityModelOfShipment reassignItems(shipmentNumber, reassignItemsRequestDto, ifMatch)

reassignItems

Reassign shipment items.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    ReassignItemsRequest reassignItemsRequestDto = new ReassignItemsRequest(); // ReassignItemsRequest | reassignItemsRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.reassignItems(shipmentNumber, reassignItemsRequestDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#reassignItems");
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
| **reassignItemsRequestDto** | [**ReassignItemsRequest**](ReassignItemsRequest.md)| reassignItemsRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="reassignShipment"></a>
# **reassignShipment**
> EntityModelOfShipment reassignShipment(shipmentNumber, reassignShipmentRequestDto, ifMatch)

Reassign Shipments

Reassign a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    ReassignShipment reassignShipmentRequestDto = new ReassignShipment(); // ReassignShipment | reassignShipmentRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.reassignShipment(shipmentNumber, reassignShipmentRequestDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#reassignShipment");
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
| **reassignShipmentRequestDto** | [**ReassignShipment**](ReassignShipment.md)| reassignShipmentRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="receiveTransfer"></a>
# **receiveTransfer**
> EntityModelOfShipment receiveTransfer(shipmentNumber, ifMatch)

receiveTransfer

Mark a transfer shipment as received.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.receiveTransfer(shipmentNumber, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#receiveTransfer");
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
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="refreshShipment"></a>
# **refreshShipment**
> EntityModelOfShipment refreshShipment(shipmentNumber, ifMatch, shouldLog)

refreshShipment

Refresh a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    Boolean shouldLog = true; // Boolean | shouldLog
    try {
      EntityModelOfShipment result = apiInstance.refreshShipment(shipmentNumber, ifMatch, shouldLog);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#refreshShipment");
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
| **shouldLog** | **Boolean**| shouldLog | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="rejectItems"></a>
# **rejectItems**
> EntityModelOfShipment rejectItems(shipmentNumber, rejectItemsRequestDto, ifMatch)

rejectItems

Reject shipment items.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    RejectItemsRequest rejectItemsRequestDto = new RejectItemsRequest(); // RejectItemsRequest | rejectItemsRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.rejectItems(shipmentNumber, rejectItemsRequestDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#rejectItems");
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
| **rejectItemsRequestDto** | [**RejectItemsRequest**](RejectItemsRequest.md)| rejectItemsRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="rejectShipment"></a>
# **rejectShipment**
> EntityModelOfShipment rejectShipment(shipmentNumber, rejectShipmentRequestDto, ifMatch)

rejectShipment

Reject a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    RejectShipment rejectShipmentRequestDto = new RejectShipment(); // RejectShipment | rejectShipmentRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.rejectShipment(shipmentNumber, rejectShipmentRequestDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#rejectShipment");
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
| **rejectShipmentRequestDto** | [**RejectShipment**](RejectShipment.md)| rejectShipmentRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="renderOrderSummary"></a>
# **renderOrderSummary**
> EntityModelOfRenderedContent renderOrderSummary(shipmentNumber)

Render Order Summary

Render an order summary in HTML.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      EntityModelOfRenderedContent result = apiInstance.renderOrderSummary(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#renderOrderSummary");
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

### Return type

[**EntityModelOfRenderedContent**](EntityModelOfRenderedContent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="renderPackingSlip"></a>
# **renderPackingSlip**
> EntityModelOfRenderedContent renderPackingSlip(shipmentNumber)

Render Packing Slip

Render a packing slip in HTML.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      EntityModelOfRenderedContent result = apiInstance.renderPackingSlip(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#renderPackingSlip");
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

### Return type

[**EntityModelOfRenderedContent**](EntityModelOfRenderedContent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="replaceShipment"></a>
# **replaceShipment**
> EntityModelOfShipment replaceShipment(shipmentNumber, newShipment, ifMatch, updateFields)

Replace Shipment

Update and replace an existing shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    FulfillmentAPIShipment newShipment = new FulfillmentAPIShipment(); // FulfillmentAPIShipment | newShipment
    String ifMatch = "ifMatch_example"; // String | If-Match
    List<String> updateFields = Arrays.asList(); // List<String> | updateFields
    try {
      EntityModelOfShipment result = apiInstance.replaceShipment(shipmentNumber, newShipment, ifMatch, updateFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#replaceShipment");
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
| **newShipment** | [**FulfillmentAPIShipment**](FulfillmentAPIShipment.md)| newShipment | |
| **ifMatch** | **String**| If-Match | [optional] |
| **updateFields** | [**List&lt;String&gt;**](String.md)| updateFields | [optional] |

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

<a name="resendItemEmail"></a>
# **resendItemEmail**
> resendItemEmail(lineId, shipmentNumber, ifMatch)

resendItemEmail

Resend an item email notification.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer lineId = 56; // Integer | lineId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      apiInstance.resendItemEmail(lineId, shipmentNumber, ifMatch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#resendItemEmail");
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
| **ifMatch** | **String**| If-Match | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="resendShipmentEmail"></a>
# **resendShipmentEmail**
> resendShipmentEmail(shipmentNumber, ifMatch)

resendShipmentEmail

Resend a shipment confirmation email.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      apiInstance.resendShipmentEmail(shipmentNumber, ifMatch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#resendShipmentEmail");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="resetStockValidation"></a>
# **resetStockValidation**
> EntityModelOfShipment resetStockValidation(lineId, shipmentNumber, xVolTenant, ifMatch, xVolSite)

resetStockValidation

resetStockValidation

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer lineId = 56; // Integer | lineId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.resetStockValidation(lineId, shipmentNumber, xVolTenant, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#resetStockValidation");
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
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="retryFulfillingShipment"></a>
# **retryFulfillingShipment**
> EntityModelOfShipment retryFulfillingShipment(shipmentNumber, ifMatch)

retryFulfillingShipment

Attempt to fulfill a shipment again.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.retryFulfillingShipment(shipmentNumber, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#retryFulfillingShipment");
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
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="revert"></a>
# **revert**
> EntityModelOfShipment revert(shipmentNumber, taskName, ifMatch)

Revert Task

Revert a shipment task.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String taskName = "taskName_example"; // String | taskName
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.revert(shipmentNumber, taskName, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#revert");
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
| **taskName** | **String**| taskName | |
| **ifMatch** | **String**| If-Match | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="searchAndReceiveTransfer"></a>
# **searchAndReceiveTransfer**
> EntityModelOfShipment searchAndReceiveTransfer(search, ifMatch)

Search and Receive Transfer

Search for and receive a transfer shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String search = "search_example"; // String | search
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.searchAndReceiveTransfer(search, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#searchAndReceiveTransfer");
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
| **search** | **String**| search | |
| **ifMatch** | **String**| If-Match | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="searchReceivableShipment"></a>
# **searchReceivableShipment**
> EntityModelOfShipment searchReceivableShipment(search, xVolTenant, xVolSite)

searchReceivableShipment

searchReceivableShipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String search = "search_example"; // String | search
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.searchReceivableShipment(search, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#searchReceivableShipment");
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
| **search** | **String**| search | |
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="searchShipments"></a>
# **searchShipments**
> PagedModelOfEntityModelOfShipment searchShipments(xVolTenant, getShipmentsRequest, xVolSite)

searchShipments

searchShipments

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    GetShipmentsRequest getShipmentsRequest = new GetShipmentsRequest(); // GetShipmentsRequest | request
    Integer xVolSite = 56; // Integer | 
    try {
      PagedModelOfEntityModelOfShipment result = apiInstance.searchShipments(xVolTenant, getShipmentsRequest, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#searchShipments");
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
| **xVolTenant** | **Integer**|  | |
| **getShipmentsRequest** | [**GetShipmentsRequest**](GetShipmentsRequest.md)| request | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**PagedModelOfEntityModelOfShipment**](PagedModelOfEntityModelOfShipment.md)

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

<a name="setWorkflowVariable"></a>
# **setWorkflowVariable**
> setWorkflowVariable(shipmentNumber, xVolTenant, bpmVariable, ifMatch, xVolSite)

setWorkflowVariable

setWorkflowVariable

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    BpmVariable bpmVariable = new BpmVariable(); // BpmVariable | variableDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      apiInstance.setWorkflowVariable(shipmentNumber, xVolTenant, bpmVariable, ifMatch, xVolSite);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#setWorkflowVariable");
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
| **bpmVariable** | [**BpmVariable**](BpmVariable.md)| variableDto | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="skipTask"></a>
# **skipTask**
> EntityModelOfShipment skipTask(shipmentNumber, taskName, ifMatch)

Skip Task

Skip a shipment task.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String taskName = "taskName_example"; // String | taskName
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.skipTask(shipmentNumber, taskName, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#skipTask");
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
| **taskName** | **String**| taskName | |
| **ifMatch** | **String**| If-Match | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="transferItems"></a>
# **transferItems**
> EntityModelOfShipment transferItems(shipmentNumber, transferItemsRequestDto, ifMatch)

transferItems

Transfer items from a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    TransferItemsRequest transferItemsRequestDto = new TransferItemsRequest(); // TransferItemsRequest | transferItemsRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.transferItems(shipmentNumber, transferItemsRequestDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#transferItems");
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
| **transferItemsRequestDto** | [**TransferItemsRequest**](TransferItemsRequest.md)| transferItemsRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="transferShipment"></a>
# **transferShipment**
> EntityModelOfShipment transferShipment(shipmentNumber, transferShipmentRequestDto, ifMatch)

transferShipment

Transfer a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    TransferShipment transferShipmentRequestDto = new TransferShipment(); // TransferShipment | transferShipmentRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.transferShipment(shipmentNumber, transferShipmentRequestDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#transferShipment");
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
| **transferShipmentRequestDto** | [**TransferShipment**](TransferShipment.md)| transferShipmentRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="updateFulfillmentFields"></a>
# **updateFulfillmentFields**
> EntityModelOfShipment updateFulfillmentFields(shipmentNumber, items, ifMatch)

updateFulfillmentFields

Update a shipment&#39;s fulfillment fields.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    List<FilterOptionDtoResultItem> items = Arrays.asList(); // List<FilterOptionDtoResultItem> | items
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.updateFulfillmentFields(shipmentNumber, items, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#updateFulfillmentFields");
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
| **items** | [**List&lt;FilterOptionDtoResultItem&gt;**](FilterOptionDtoResultItem.md)| items | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="updateGiftCardInfo"></a>
# **updateGiftCardInfo**
> EntityModelOfShipment updateGiftCardInfo(shipmentNumber, giftCardInfoRequestDto, ifMatch)

updateGiftCardInfo

Update the gift card information of a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    GiftCardInfoRequest giftCardInfoRequestDto = new GiftCardInfoRequest(); // GiftCardInfoRequest | giftCardInfoRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.updateGiftCardInfo(shipmentNumber, giftCardInfoRequestDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#updateGiftCardInfo");
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
| **giftCardInfoRequestDto** | [**GiftCardInfoRequest**](GiftCardInfoRequest.md)| giftCardInfoRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |

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

<a name="updateLastCancellationDate"></a>
# **updateLastCancellationDate**
> EntityModelOfShipment updateLastCancellationDate(shipmentNumber, xVolTenant, lastCancellationDateDto, ifMatch, xVolSite)

updateLastCancellationDate

updateLastCancellationDate

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    LastCancellationDateDto lastCancellationDateDto = new LastCancellationDateDto(); // LastCancellationDateDto | lastCancellationDateDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.updateLastCancellationDate(shipmentNumber, xVolTenant, lastCancellationDateDto, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#updateLastCancellationDate");
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
| **lastCancellationDateDto** | [**LastCancellationDateDto**](LastCancellationDateDto.md)| lastCancellationDateDto | |
| **ifMatch** | **String**| If-Match | [optional] |
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

<a name="validateStockItem"></a>
# **validateStockItem**
> EntityModelOfShipment validateStockItem(lineId, shipmentNumber, xVolTenant, validateStockItem, ifMatch, xVolSite)

validateStockItem

validateStockItem

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer lineId = 56; // Integer | lineId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    ValidateStockItem validateStockItem = new ValidateStockItem(); // ValidateStockItem | request
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.validateStockItem(lineId, shipmentNumber, xVolTenant, validateStockItem, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#validateStockItem");
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
| **validateStockItem** | [**ValidateStockItem**](ValidateStockItem.md)| request | |
| **ifMatch** | **String**| If-Match | [optional] |
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

<a name="workflowDefinitionImage"></a>
# **workflowDefinitionImage**
> String workflowDefinitionImage(shipmentNumber)

Workflow Definition Image

Get the workflow definition image of a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      String result = apiInstance.workflowDefinitionImage(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#workflowDefinitionImage");
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

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/svg+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="workflowInstanceImage"></a>
# **workflowInstanceImage**
> String workflowInstanceImage(shipmentNumber)

workflowInstanceImage

Get a workflow instance image for a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      String result = apiInstance.workflowInstanceImage(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#workflowInstanceImage");
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

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/svg+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

