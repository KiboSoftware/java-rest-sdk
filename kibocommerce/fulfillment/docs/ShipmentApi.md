# ShipmentApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**backorderItemsUpdateUsingPUT**](ShipmentApi.md#backorderItemsUpdateUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/backorderedItems | Backorder Items Update |
| [**backorderItemsUsingPOST**](ShipmentApi.md#backorderItemsUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/backorderedItems | Backorder Items |
| [**backorderShipmentUsingPOST**](ShipmentApi.md#backorderShipmentUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/backordered | Backorder Shipment |
| [**cancelItemsUsingPUT**](ShipmentApi.md#cancelItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/canceledItems | Cancel Items |
| [**cancelShipmentUsingPUT**](ShipmentApi.md#cancelShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/canceled | Cancel Shipment |
| [**cancelShipmentsUsingPUT**](ShipmentApi.md#cancelShipmentsUsingPUT) | **PUT** /commerce/shipments/order/{orderId}/canceled | Cancel Shipments |
| [**customerAtCurbsideUsingPUT**](ShipmentApi.md#customerAtCurbsideUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerAtCurbside | Customer At Curbside |
| [**customerAtStoreUsingPUT**](ShipmentApi.md#customerAtStoreUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerAtStore | Customer At Store |
| [**customerCareItemsUsingPOST**](ShipmentApi.md#customerCareItemsUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/customerCaredItems | Customer Care Items |
| [**customerCareShipmentUsingPUT**](ShipmentApi.md#customerCareShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerCared | Customer Care Shipment |
| [**customerInTransitUsingPUT**](ShipmentApi.md#customerInTransitUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerInTransit | Customer In Transit |
| [**deleteShipmentUsingDELETE**](ShipmentApi.md#deleteShipmentUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber} | Delete Shipment |
| [**deleteShipmentsOfOrderUsingDELETE**](ShipmentApi.md#deleteShipmentsOfOrderUsingDELETE) | **DELETE** /commerce/shipments/order/{orderId} | Delete Shipments from Order |
| [**destinationUpdateUsingPUT**](ShipmentApi.md#destinationUpdateUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/destination | Update Destination |
| [**executeUsingPUT**](ShipmentApi.md#executeUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskName}/completed | Complete Workflow Task |
| [**fulfillShipmentUsingPUT**](ShipmentApi.md#fulfillShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/fulfilled | Fulfill Shipment |
| [**getLocationSummaryReportUsingGET**](ShipmentApi.md#getLocationSummaryReportUsingGET) | **GET** /commerce/shipments/locationSummaryReport | Get Location Summary Report |
| [**getShipmentStepCountByShipmentTypeUsingGET**](ShipmentApi.md#getShipmentStepCountByShipmentTypeUsingGET) | **GET** /commerce/shipments/countsByStep | Get Workflow Task Counts |
| [**getShipmentUsingGET**](ShipmentApi.md#getShipmentUsingGET) | **GET** /commerce/shipments/{shipmentNumber} | Get Shipment |
| [**getShipmentsUsingGET**](ShipmentApi.md#getShipmentsUsingGET) | **GET** /commerce/shipments | Get Shipments |
| [**getTasksUsingGET**](ShipmentApi.md#getTasksUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/tasks | Get Workflow Tasks |
| [**newShipmentUsingPOST**](ShipmentApi.md#newShipmentUsingPOST) | **POST** /commerce/shipments | Create Shipment |
| [**newShipmentsUsingPOST**](ShipmentApi.md#newShipmentsUsingPOST) | **POST** /commerce/shipments/bulk | Bulk Create Shipments |
| [**pickupItemsUsingPOST**](ShipmentApi.md#pickupItemsUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/pickedUpItems | Pickup Items |
| [**reassignItemsUsingPUT**](ShipmentApi.md#reassignItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/reassignedItems | Reassign Items |
| [**reassignShipmentUsingPUT**](ShipmentApi.md#reassignShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/reassigned | Reassign Shipment |
| [**receiveTransferUsingPUT**](ShipmentApi.md#receiveTransferUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/received | Receive Transfer |
| [**refreshShipmentUsingPUT**](ShipmentApi.md#refreshShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/refresh | Refresh Shipment |
| [**rejectItemsUsingPUT**](ShipmentApi.md#rejectItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/rejectedItems | Reject Items |
| [**rejectShipmentUsingPUT**](ShipmentApi.md#rejectShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/rejected | Reject Shipment |
| [**renderOrderSummaryUsingGET1**](ShipmentApi.md#renderOrderSummaryUsingGET1) | **GET** /commerce/shipments/{shipmentNumber}/order-summary/html | Render Order Summary by Shipment Number |
| [**renderPackingSlipUsingGET**](ShipmentApi.md#renderPackingSlipUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/rendition/html | Render Shipment Packing Slip |
| [**replaceShipmentUsingPUT**](ShipmentApi.md#replaceShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber} | Update Shipment |
| [**resendItemEmailUsingPUT**](ShipmentApi.md#resendItemEmailUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/items/{lineId}/email/resend | Resend Item Email |
| [**resendShipmentEmailUsingPUT**](ShipmentApi.md#resendShipmentEmailUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/email/resend | Resend Shipment Email |
| [**retryFulfillingShipmentUsingPUT**](ShipmentApi.md#retryFulfillingShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/retried | Retry Fulfilling Shipment |
| [**revertUsingPUT**](ShipmentApi.md#revertUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskName}/reverted | Revert Workflow Task |
| [**searchAndReceiveTransferUsingPUT**](ShipmentApi.md#searchAndReceiveTransferUsingPUT) | **PUT** /commerce/shipments/received/{search} | Find and Receive Transfer |
| [**skipTaskUsingPUT**](ShipmentApi.md#skipTaskUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskName}/skipped | Skip Workflow Task |
| [**transferItemsUsingPUT**](ShipmentApi.md#transferItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/transferredItems | Transfer Items |
| [**transferShipmentUsingPUT**](ShipmentApi.md#transferShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/transferred | Transfer Shipment |
| [**updateFulfillmentFieldsUsingPUT**](ShipmentApi.md#updateFulfillmentFieldsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/fulfillmentFields | Update Fulfillment Fields |
| [**updateGiftCardInfoUsingPUT**](ShipmentApi.md#updateGiftCardInfoUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/giftCardInfo | Update Gift Card Info |
| [**workflowDefinitionImageUsingGET**](ShipmentApi.md#workflowDefinitionImageUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/workflow-definition-image | Get Workflow Definition Image |
| [**workflowInstanceImageUsingGET**](ShipmentApi.md#workflowInstanceImageUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/workflow-instance-image | Get Workflow Instance Image |


<a name="backorderItemsUpdateUsingPUT"></a>
# **backorderItemsUpdateUsingPUT**
> EntityModelOfShipment backorderItemsUpdateUsingPUT(shipmentNumber, ifMatch, backorderItemsUpdateRequest)

Backorder Items Update

When an item is in backorder, its expected release date can be modified to reflect any changes in inventory levels or manufacturing estimates. This should be kept up-to-date so that customer communications such as notification emails can accurately inform the customer about when their item is expected to be available or shipped.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    BackorderItemsUpdateRequest backorderItemsUpdateRequest = new BackorderItemsUpdateRequest(); // BackorderItemsUpdateRequest | 
    try {
      EntityModelOfShipment result = apiInstance.backorderItemsUpdateUsingPUT(shipmentNumber, ifMatch, backorderItemsUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#backorderItemsUpdateUsingPUT");
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
| **backorderItemsUpdateRequest** | [**BackorderItemsUpdateRequest**](BackorderItemsUpdateRequest.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="backorderItemsUsingPOST"></a>
# **backorderItemsUsingPOST**
> EntityModelOfShipment backorderItemsUsingPOST(shipmentNumber, ifMatch, backorderItemsRequest)

Backorder Items

If a shipment is accepted by a location but some items of the shipment are temporarily out of stock, those particular items can be placed on backorder. These items will be placed into a pending Backorder state until inventory is in stock, at which point they are “released” from backorder to continue with the fulfillment process. This will not backorder the entire shipment, only the particular items waiting for inventory.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    BackorderItemsRequest backorderItemsRequest = new BackorderItemsRequest(); // BackorderItemsRequest | 
    try {
      EntityModelOfShipment result = apiInstance.backorderItemsUsingPOST(shipmentNumber, ifMatch, backorderItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#backorderItemsUsingPOST");
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
| **backorderItemsRequest** | [**BackorderItemsRequest**](BackorderItemsRequest.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="backorderShipmentUsingPOST"></a>
# **backorderShipmentUsingPOST**
> EntityModelOfShipment backorderShipmentUsingPOST(shipmentNumber, ifMatch, backorderShipmentRequest)

Backorder Shipment

If a shipment is accepted by a location but the contents of the shipment are temporarily out of stock, the shipment can be placed on backorder. This means that the shipment will remain in the pending Backorder state while it waits for the inventory to be in stock, at which point it is “released” from backorder to continue with the fulfillment process.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    BackorderShipmentRequest backorderShipmentRequest = new BackorderShipmentRequest(); // BackorderShipmentRequest | 
    try {
      EntityModelOfShipment result = apiInstance.backorderShipmentUsingPOST(shipmentNumber, ifMatch, backorderShipmentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#backorderShipmentUsingPOST");
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
| **backorderShipmentRequest** | [**BackorderShipmentRequest**](BackorderShipmentRequest.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="cancelItemsUsingPUT"></a>
# **cancelItemsUsingPUT**
> EntityModelOfShipment cancelItemsUsingPUT(shipmentNumber, ifMatch, cancelItemsRequest)

Cancel Items

Cancel Items

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    CancelItemsRequest cancelItemsRequest = new CancelItemsRequest(); // CancelItemsRequest | 
    try {
      EntityModelOfShipment result = apiInstance.cancelItemsUsingPUT(shipmentNumber, ifMatch, cancelItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#cancelItemsUsingPUT");
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
| **cancelItemsRequest** | [**CancelItemsRequest**](CancelItemsRequest.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="cancelShipmentUsingPUT"></a>
# **cancelShipmentUsingPUT**
> EntityModelOfShipment cancelShipmentUsingPUT(shipmentNumber, ifMatch, cancelShipment)

Cancel Shipment

Cancel Shipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    CancelShipment cancelShipment = new CancelShipment(); // CancelShipment | 
    try {
      EntityModelOfShipment result = apiInstance.cancelShipmentUsingPUT(shipmentNumber, ifMatch, cancelShipment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#cancelShipmentUsingPUT");
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
| **cancelShipment** | [**CancelShipment**](CancelShipment.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="cancelShipmentsUsingPUT"></a>
# **cancelShipmentsUsingPUT**
> CollectionModelOfShipment cancelShipmentsUsingPUT(orderId, cancelShipment)

Cancel Shipments

Cancel Shipments

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String orderId = "orderId_example"; // String | orderId
    CancelShipment cancelShipment = new CancelShipment(); // CancelShipment | 
    try {
      CollectionModelOfShipment result = apiInstance.cancelShipmentsUsingPUT(orderId, cancelShipment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#cancelShipmentsUsingPUT");
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
| **cancelShipment** | [**CancelShipment**](CancelShipment.md)|  | [optional] |

### Return type

[**CollectionModelOfShipment**](CollectionModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="customerAtCurbsideUsingPUT"></a>
# **customerAtCurbsideUsingPUT**
> EntityModelOfShipment customerAtCurbsideUsingPUT(shipmentNumber, ifMatch, requestBody)

Customer At Curbside

Indicate that a customer has arrived for curbside pickup of this shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      EntityModelOfShipment result = apiInstance.customerAtCurbsideUsingPUT(shipmentNumber, ifMatch, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#customerAtCurbsideUsingPUT");
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
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="customerAtStoreUsingPUT"></a>
# **customerAtStoreUsingPUT**
> EntityModelOfShipment customerAtStoreUsingPUT(shipmentNumber, ifMatch)

Customer At Store

Indicate that the customer has arrived for store pickup of this shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.customerAtStoreUsingPUT(shipmentNumber, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#customerAtStoreUsingPUT");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="customerCareItemsUsingPOST"></a>
# **customerCareItemsUsingPOST**
> EntityModelOfShipment customerCareItemsUsingPOST(shipmentNumber, ifMatch, rejectItemsRequest)

Customer Care Items

Send items to Customer Care

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    RejectItemsRequest rejectItemsRequest = new RejectItemsRequest(); // RejectItemsRequest | 
    try {
      EntityModelOfShipment result = apiInstance.customerCareItemsUsingPOST(shipmentNumber, ifMatch, rejectItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#customerCareItemsUsingPOST");
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
| **rejectItemsRequest** | [**RejectItemsRequest**](RejectItemsRequest.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="customerCareShipmentUsingPUT"></a>
# **customerCareShipmentUsingPUT**
> EntityModelOfShipment customerCareShipmentUsingPUT(shipmentNumber, ifMatch, rejectShipment)

Customer Care Shipment

Send a shipment to Customer Care

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    RejectShipment rejectShipment = new RejectShipment(); // RejectShipment | 
    try {
      EntityModelOfShipment result = apiInstance.customerCareShipmentUsingPUT(shipmentNumber, ifMatch, rejectShipment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#customerCareShipmentUsingPUT");
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
| **rejectShipment** | [**RejectShipment**](RejectShipment.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="customerInTransitUsingPUT"></a>
# **customerInTransitUsingPUT**
> EntityModelOfShipment customerInTransitUsingPUT(shipmentNumber, ifMatch)

Customer In Transit

Indicate that a customer is on their way to the store for curbside delivery.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.customerInTransitUsingPUT(shipmentNumber, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#customerInTransitUsingPUT");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="deleteShipmentUsingDELETE"></a>
# **deleteShipmentUsingDELETE**
> deleteShipmentUsingDELETE(shipmentNumber, ifMatch)

Delete Shipment

Delete Shipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | Number of the shipment to be deleted. Cannot be empty.
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      apiInstance.deleteShipmentUsingDELETE(shipmentNumber, ifMatch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#deleteShipmentUsingDELETE");
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
| **shipmentNumber** | **Integer**| Number of the shipment to be deleted. Cannot be empty. | |
| **ifMatch** | **String**| If-Match | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="deleteShipmentsOfOrderUsingDELETE"></a>
# **deleteShipmentsOfOrderUsingDELETE**
> deleteShipmentsOfOrderUsingDELETE(orderId)

Delete Shipments from Order

Delete Shipments from Order

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order to delete shipments from. Cannot be empty.
    try {
      apiInstance.deleteShipmentsOfOrderUsingDELETE(orderId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#deleteShipmentsOfOrderUsingDELETE");
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
| **orderId** | **String**| Unique identifier of the order to delete shipments from. Cannot be empty. | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="destinationUpdateUsingPUT"></a>
# **destinationUpdateUsingPUT**
> EntityModelOfShipment destinationUpdateUsingPUT(shipmentNumber, ifMatch, fulfillmentDestination)

Update Destination

Update Destination

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    FulfillmentDestination fulfillmentDestination = new FulfillmentDestination(); // FulfillmentDestination | 
    try {
      EntityModelOfShipment result = apiInstance.destinationUpdateUsingPUT(shipmentNumber, ifMatch, fulfillmentDestination);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#destinationUpdateUsingPUT");
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
| **fulfillmentDestination** | [**FulfillmentDestination**](FulfillmentDestination.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="executeUsingPUT"></a>
# **executeUsingPUT**
> EntityModelOfShipment executeUsingPUT(shipmentNumber, taskName, ifMatch, taskComplete)

Complete Workflow Task

Complete Workflow Task

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String taskName = "taskName_example"; // String | taskName
    String ifMatch = "ifMatch_example"; // String | If-Match
    TaskComplete taskComplete = new TaskComplete(); // TaskComplete | 
    try {
      EntityModelOfShipment result = apiInstance.executeUsingPUT(shipmentNumber, taskName, ifMatch, taskComplete);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#executeUsingPUT");
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
| **taskComplete** | [**TaskComplete**](TaskComplete.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="fulfillShipmentUsingPUT"></a>
# **fulfillShipmentUsingPUT**
> EntityModelOfShipment fulfillShipmentUsingPUT(shipmentNumber, ifMatch)

Fulfill Shipment

Fulfill Shipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.fulfillShipmentUsingPUT(shipmentNumber, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#fulfillShipmentUsingPUT");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Shipment not found |  -  |

<a name="getLocationSummaryReportUsingGET"></a>
# **getLocationSummaryReportUsingGET**
> CollectionModelOfLocationSummary getLocationSummaryReportUsingGET(locationCodes, startDateTime, bypassSearchIndex)

Get Location Summary Report

Get Location Summary Report

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String locationCodes = "locationCodes_example"; // String | locationCodes
    OffsetDateTime startDateTime = OffsetDateTime.now(); // OffsetDateTime | startDateTime
    Boolean bypassSearchIndex = true; // Boolean | bypassSearchIndex
    try {
      CollectionModelOfLocationSummary result = apiInstance.getLocationSummaryReportUsingGET(locationCodes, startDateTime, bypassSearchIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#getLocationSummaryReportUsingGET");
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
| **locationCodes** | **String**| locationCodes | |
| **startDateTime** | **OffsetDateTime**| startDateTime | |
| **bypassSearchIndex** | **Boolean**| bypassSearchIndex | [optional] |

### Return type

[**CollectionModelOfLocationSummary**](CollectionModelOfLocationSummary.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getShipmentStepCountByShipmentTypeUsingGET"></a>
# **getShipmentStepCountByShipmentTypeUsingGET**
> EntityModelOfDashboardResponse getShipmentStepCountByShipmentTypeUsingGET(shipmentType, assignedLocations)

Get Workflow Task Counts

Get Workflow Task Counts

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String shipmentType = "shipmentType_example"; // String | shipmentType
    String assignedLocations = "assignedLocations_example"; // String | assignedLocations
    try {
      EntityModelOfDashboardResponse result = apiInstance.getShipmentStepCountByShipmentTypeUsingGET(shipmentType, assignedLocations);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#getShipmentStepCountByShipmentTypeUsingGET");
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
| **assignedLocations** | **String**| assignedLocations | [optional] |

### Return type

[**EntityModelOfDashboardResponse**](EntityModelOfDashboardResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getShipmentUsingGET"></a>
# **getShipmentUsingGET**
> EntityModelOfShipment getShipmentUsingGET(shipmentNumber)

Get Shipment

Get shipment information. Note that the schema supports both assignedLocationCode and fulfillmentLocationCode fields at the shipment level. These fields are usually be the same, except when assignedLocationCode becomes the receiving location code after a transfer shipment is shipped.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      EntityModelOfShipment result = apiInstance.getShipmentUsingGET(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#getShipmentUsingGET");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getShipmentsUsingGET"></a>
# **getShipmentsUsingGET**
> PagedModelOfEntityModelOfShipment getShipmentsUsingGET(bypassSearchIndex, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName)

Get Shipments

A paged list of shipments is returned according to any specified filter criteria and sort options

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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
      PagedModelOfEntityModelOfShipment result = apiInstance.getShipmentsUsingGET(bypassSearchIndex, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#getShipmentsUsingGET");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid Input |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** |  |  -  |

<a name="getTasksUsingGET"></a>
# **getTasksUsingGET**
> CollectionModelOfTask getTasksUsingGET(shipmentNumber)

Get Workflow Tasks

Get Workflow Tasks

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | Number of the shipment to be searched. Cannot be empty.
    try {
      CollectionModelOfTask result = apiInstance.getTasksUsingGET(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#getTasksUsingGET");
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
| **shipmentNumber** | **Integer**| Number of the shipment to be searched. Cannot be empty. | |

### Return type

[**CollectionModelOfTask**](CollectionModelOfTask.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="newShipmentUsingPOST"></a>
# **newShipmentUsingPOST**
> EntityModelOfShipment newShipmentUsingPOST(fulfillmentShipment)

Create Shipment

Create Shipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    FulfillmentShipment fulfillmentShipment = new FulfillmentShipment(); // FulfillmentShipment | 
    try {
      EntityModelOfShipment result = apiInstance.newShipmentUsingPOST(fulfillmentShipment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#newShipmentUsingPOST");
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
| **fulfillmentShipment** | [**FulfillmentShipment**](FulfillmentShipment.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Shipment created |  -  |
| **400** | Invalid Input |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="newShipmentsUsingPOST"></a>
# **newShipmentsUsingPOST**
> CollectionModelOfEntityModelOfShipment newShipmentsUsingPOST(fulfillmentShipment)

Bulk Create Shipments

Bulk Create Shipments

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    List<FulfillmentShipment> fulfillmentShipment = Arrays.asList(); // List<FulfillmentShipment> | 
    try {
      CollectionModelOfEntityModelOfShipment result = apiInstance.newShipmentsUsingPOST(fulfillmentShipment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#newShipmentsUsingPOST");
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
| **fulfillmentShipment** | [**List&lt;FulfillmentShipment&gt;**](FulfillmentShipment.md)|  | [optional] |

### Return type

[**CollectionModelOfEntityModelOfShipment**](CollectionModelOfEntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="pickupItemsUsingPOST"></a>
# **pickupItemsUsingPOST**
> EntityModelOfShipment pickupItemsUsingPOST(shipmentNumber, ifMatch, pickupItemsRequest)

Pickup Items

Individual items within a shipment can be marked as picked up in BOPIS (Buy Online Pickup in Store) shipments. This is particularly useful in cases such as partial pickup, in which the pickup location requested a transfer for some items that they did not have in stock but they allow the customer to pick up the items they have ready. In this event, the pickup shipment cannot go straight to the Fulfilled (“Complete”) step because it is still waiting on other items to be received. That partial quantity of items that are picked up early can be called out through this API.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    PickupItemsRequest pickupItemsRequest = new PickupItemsRequest(); // PickupItemsRequest | 
    try {
      EntityModelOfShipment result = apiInstance.pickupItemsUsingPOST(shipmentNumber, ifMatch, pickupItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#pickupItemsUsingPOST");
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
| **pickupItemsRequest** | [**PickupItemsRequest**](PickupItemsRequest.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="reassignItemsUsingPUT"></a>
# **reassignItemsUsingPUT**
> EntityModelOfShipment reassignItemsUsingPUT(shipmentNumber, ifMatch, reassignItemsRequest)

Reassign Items

Reassign particular items from a shipment while leaving the rest of the items at the original location. This is often referred to as “splitting the shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    ReassignItemsRequest reassignItemsRequest = new ReassignItemsRequest(); // ReassignItemsRequest | 
    try {
      EntityModelOfShipment result = apiInstance.reassignItemsUsingPUT(shipmentNumber, ifMatch, reassignItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#reassignItemsUsingPUT");
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
| **reassignItemsRequest** | [**ReassignItemsRequest**](ReassignItemsRequest.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="reassignShipmentUsingPUT"></a>
# **reassignShipmentUsingPUT**
> EntityModelOfShipment reassignShipmentUsingPUT(shipmentNumber, ifMatch, reassignShipment)

Reassign Shipment

Reassign an entire shipment to a new fulfillment location, including all packages and items within it. Note that the blockAssignment field is not always necessary to provide in the request, as OMS defaults to “false” if it is not provided in the request. However, it must be provided in order to enable the assignment blocking when desired, such as if the reassignment was due to lack of inventory and similar shipments should not be assigned to this location until it has inventory back in stock.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    ReassignShipment reassignShipment = new ReassignShipment(); // ReassignShipment | 
    try {
      EntityModelOfShipment result = apiInstance.reassignShipmentUsingPUT(shipmentNumber, ifMatch, reassignShipment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#reassignShipmentUsingPUT");
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
| **reassignShipment** | [**ReassignShipment**](ReassignShipment.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="receiveTransferUsingPUT"></a>
# **receiveTransferUsingPUT**
> EntityModelOfShipment receiveTransferUsingPUT(shipmentNumber, ifMatch)

Receive Transfer

After a transfer shipment has been created and fulfilled by the second location, the original pickup location that requested those transfer items must indicate that they have received everything before they can progress in the BOPIS fulfillment flow. Once the location validates that they have received their transfers with this call, the shipment will leave the Wait For Transfer state and continue to Customer Pickup.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.receiveTransferUsingPUT(shipmentNumber, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#receiveTransferUsingPUT");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="refreshShipmentUsingPUT"></a>
# **refreshShipmentUsingPUT**
> EntityModelOfShipment refreshShipmentUsingPUT(shipmentNumber, shouldLog, ifMatch)

Refresh Shipment

Refresh Shipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Boolean shouldLog = true; // Boolean | shouldLog
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.refreshShipmentUsingPUT(shipmentNumber, shouldLog, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#refreshShipmentUsingPUT");
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
| **shouldLog** | **Boolean**| shouldLog | [optional] |
| **ifMatch** | **String**| If-Match | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="rejectItemsUsingPUT"></a>
# **rejectItemsUsingPUT**
> EntityModelOfShipment rejectItemsUsingPUT(shipmentNumber, ifMatch, rejectItemsRequest)

Reject Items

Reject items in the shipment that are not available for fulfillment at this location. This will assign a new transfer shipment to an eligible location based on order routing rules.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    RejectItemsRequest rejectItemsRequest = new RejectItemsRequest(); // RejectItemsRequest | 
    try {
      EntityModelOfShipment result = apiInstance.rejectItemsUsingPUT(shipmentNumber, ifMatch, rejectItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#rejectItemsUsingPUT");
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
| **rejectItemsRequest** | [**RejectItemsRequest**](RejectItemsRequest.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="rejectShipmentUsingPUT"></a>
# **rejectShipmentUsingPUT**
> EntityModelOfShipment rejectShipmentUsingPUT(shipmentNumber, ifMatch, rejectShipment)

Reject Shipment

Reject an entire shipment whose items are not available for fulfillment at this location. This will reassign the shipment to an eligible location based on order routing rules.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    RejectShipment rejectShipment = new RejectShipment(); // RejectShipment | 
    try {
      EntityModelOfShipment result = apiInstance.rejectShipmentUsingPUT(shipmentNumber, ifMatch, rejectShipment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#rejectShipmentUsingPUT");
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
| **rejectShipment** | [**RejectShipment**](RejectShipment.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="renderOrderSummaryUsingGET1"></a>
# **renderOrderSummaryUsingGET1**
> EntityModelOfstring renderOrderSummaryUsingGET1(shipmentNumber)

Render Order Summary by Shipment Number

Render order summary by shipment number in HTML format for printing

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      EntityModelOfstring result = apiInstance.renderOrderSummaryUsingGET1(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#renderOrderSummaryUsingGET1");
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

[**EntityModelOfstring**](EntityModelOfstring.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="renderPackingSlipUsingGET"></a>
# **renderPackingSlipUsingGET**
> EntityModelOfstring renderPackingSlipUsingGET(shipmentNumber)

Render Shipment Packing Slip

Render shipment packing slip in HTML format for printing

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      EntityModelOfstring result = apiInstance.renderPackingSlipUsingGET(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#renderPackingSlipUsingGET");
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

[**EntityModelOfstring**](EntityModelOfstring.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="replaceShipmentUsingPUT"></a>
# **replaceShipmentUsingPUT**
> EntityModelOfShipment replaceShipmentUsingPUT(shipmentNumber, updateFields, ifMatch, fulfillmentShipment)

Update Shipment

Update Shipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | Number of the shipment to update. Cannot be empty.
    String updateFields = "updateFields_example"; // String | List of shipment fields to update.
    String ifMatch = "ifMatch_example"; // String | If-Match
    FulfillmentShipment fulfillmentShipment = new FulfillmentShipment(); // FulfillmentShipment | 
    try {
      EntityModelOfShipment result = apiInstance.replaceShipmentUsingPUT(shipmentNumber, updateFields, ifMatch, fulfillmentShipment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#replaceShipmentUsingPUT");
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
| **shipmentNumber** | **Integer**| Number of the shipment to update. Cannot be empty. | |
| **updateFields** | **String**| List of shipment fields to update. | [optional] |
| **ifMatch** | **String**| If-Match | [optional] |
| **fulfillmentShipment** | [**FulfillmentShipment**](FulfillmentShipment.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **201** | Created |  -  |
| **400** | Invalid shipment number supplied |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Shipment not found |  -  |
| **405** | Validation exception |  -  |

<a name="resendItemEmailUsingPUT"></a>
# **resendItemEmailUsingPUT**
> resendItemEmailUsingPUT(shipmentNumber, lineId, ifMatch)

Resend Item Email

Resend Item Email

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer lineId = 56; // Integer | lineId
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      apiInstance.resendItemEmailUsingPUT(shipmentNumber, lineId, ifMatch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#resendItemEmailUsingPUT");
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
| **lineId** | **Integer**| lineId | |
| **ifMatch** | **String**| If-Match | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

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

<a name="resendShipmentEmailUsingPUT"></a>
# **resendShipmentEmailUsingPUT**
> resendShipmentEmailUsingPUT(shipmentNumber, ifMatch)

Resend Shipment Email

Resend Shipment Email

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      apiInstance.resendShipmentEmailUsingPUT(shipmentNumber, ifMatch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#resendShipmentEmailUsingPUT");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

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

<a name="retryFulfillingShipmentUsingPUT"></a>
# **retryFulfillingShipmentUsingPUT**
> EntityModelOfShipment retryFulfillingShipmentUsingPUT(shipmentNumber, ifMatch)

Retry Fulfilling Shipment

Retry Fulfilling Shipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.retryFulfillingShipmentUsingPUT(shipmentNumber, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#retryFulfillingShipmentUsingPUT");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="revertUsingPUT"></a>
# **revertUsingPUT**
> EntityModelOfShipment revertUsingPUT(shipmentNumber, taskName, ifMatch)

Revert Workflow Task

Revert Workflow Task

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String taskName = "taskName_example"; // String | taskName
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.revertUsingPUT(shipmentNumber, taskName, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#revertUsingPUT");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="searchAndReceiveTransferUsingPUT"></a>
# **searchAndReceiveTransferUsingPUT**
> EntityModelOfShipment searchAndReceiveTransferUsingPUT(search, ifMatch)

Find and Receive Transfer

Find and Receive Transfer

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String search = "search_example"; // String | search
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.searchAndReceiveTransferUsingPUT(search, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#searchAndReceiveTransferUsingPUT");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="skipTaskUsingPUT"></a>
# **skipTaskUsingPUT**
> EntityModelOfShipment skipTaskUsingPUT(shipmentNumber, taskName, ifMatch)

Skip Workflow Task

Skip Workflow Task

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String taskName = "taskName_example"; // String | taskName
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.skipTaskUsingPUT(shipmentNumber, taskName, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#skipTaskUsingPUT");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="transferItemsUsingPUT"></a>
# **transferItemsUsingPUT**
> EntityModelOfShipment transferItemsUsingPUT(shipmentNumber, ifMatch, transferItemsRequest)

Transfer Items

If a pickup location for a BOPIS (Buy Online Pickup in Store) shipment does not have all items available in stock, then they can request a transfer from another location. Submitting this transfer request will send the information about the unavailable items to a second location, who will then ship the items to the fulfiller so that the customer can pick them up at the original store location they selected when submitting their order. It is possible for only some items in the shipment to be needed as a transfer, as opposed to the entire shipment, so this API facilitates creating a transfer for those specific items and quantities.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    TransferItemsRequest transferItemsRequest = new TransferItemsRequest(); // TransferItemsRequest | 
    try {
      EntityModelOfShipment result = apiInstance.transferItemsUsingPUT(shipmentNumber, ifMatch, transferItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#transferItemsUsingPUT");
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
| **transferItemsRequest** | [**TransferItemsRequest**](TransferItemsRequest.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="transferShipmentUsingPUT"></a>
# **transferShipmentUsingPUT**
> EntityModelOfShipment transferShipmentUsingPUT(shipmentNumber, ifMatch, transferShipment)

Transfer Shipment

If a pickup location for a BOPIS (Buy Online Pickup in Store) shipment does not have all items available in stock, then they can request a transfer from another location. Submitting this transfer request will send the information about the shipment to a second location, who will then ship the items to the fulfiller so that the customer can pick them up at the original store location they selected when submitting their order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    TransferShipment transferShipment = new TransferShipment(); // TransferShipment | 
    try {
      EntityModelOfShipment result = apiInstance.transferShipmentUsingPUT(shipmentNumber, ifMatch, transferShipment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#transferShipmentUsingPUT");
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
| **transferShipment** | [**TransferShipment**](TransferShipment.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="updateFulfillmentFieldsUsingPUT"></a>
# **updateFulfillmentFieldsUsingPUT**
> EntityModelOfShipment updateFulfillmentFieldsUsingPUT(shipmentNumber, ifMatch, fulfillmentItem)

Update Fulfillment Fields

Update Fulfillment Fields

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    List<FulfillmentItem> fulfillmentItem = Arrays.asList(); // List<FulfillmentItem> | 
    try {
      EntityModelOfShipment result = apiInstance.updateFulfillmentFieldsUsingPUT(shipmentNumber, ifMatch, fulfillmentItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#updateFulfillmentFieldsUsingPUT");
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
| **fulfillmentItem** | [**List&lt;FulfillmentItem&gt;**](FulfillmentItem.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="updateGiftCardInfoUsingPUT"></a>
# **updateGiftCardInfoUsingPUT**
> EntityModelOfShipment updateGiftCardInfoUsingPUT(shipmentNumber, ifMatch, giftCardInfoRequest)

Update Gift Card Info

Update Gift Card Info

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    GiftCardInfoRequest giftCardInfoRequest = new GiftCardInfoRequest(); // GiftCardInfoRequest | 
    try {
      EntityModelOfShipment result = apiInstance.updateGiftCardInfoUsingPUT(shipmentNumber, ifMatch, giftCardInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#updateGiftCardInfoUsingPUT");
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
| **giftCardInfoRequest** | [**GiftCardInfoRequest**](GiftCardInfoRequest.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="workflowDefinitionImageUsingGET"></a>
# **workflowDefinitionImageUsingGET**
> String workflowDefinitionImageUsingGET(shipmentNumber)

Get Workflow Definition Image

Get Workflow Definition Image

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      String result = apiInstance.workflowDefinitionImageUsingGET(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#workflowDefinitionImageUsingGET");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

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

<a name="workflowInstanceImageUsingGET"></a>
# **workflowInstanceImageUsingGET**
> String workflowInstanceImageUsingGET(shipmentNumber)

Get Workflow Instance Image

Get Workflow Instance Image

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentApi;

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

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      String result = apiInstance.workflowInstanceImageUsingGET(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#workflowInstanceImageUsingGET");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

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

