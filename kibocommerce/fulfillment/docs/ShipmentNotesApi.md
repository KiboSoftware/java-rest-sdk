# ShipmentNotesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteShipmentNote**](ShipmentNotesApi.md#deleteShipmentNote) | **DELETE** /commerce/shipments/{shipmentNumber}/notes/{noteId} | deleteShipmentNote |
| [**newShipmentNote**](ShipmentNotesApi.md#newShipmentNote) | **POST** /commerce/shipments/{shipmentNumber}/notes | New Shipment Note |
| [**updateShipmentNote**](ShipmentNotesApi.md#updateShipmentNote) | **PUT** /commerce/shipments/{shipmentNumber}/notes/{noteId} | updateShipmentNote |


<a name="deleteShipmentNote"></a>
# **deleteShipmentNote**
> deleteShipmentNote(noteId, shipmentNumber, ifMatch)

deleteShipmentNote

Delete an existing shipment note.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentNotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentNotesApi apiInstance = new ShipmentNotesApi(defaultClient);
    String noteId = "noteId_example"; // String | noteId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      apiInstance.deleteShipmentNote(noteId, shipmentNumber, ifMatch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentNotesApi#deleteShipmentNote");
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
| **noteId** | **String**| noteId | |
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

<a name="newShipmentNote"></a>
# **newShipmentNote**
> EntityModelOfShipment newShipmentNote(shipmentNumber, shipmentNoteDto, ifMatch)

New Shipment Note

Add a new note to a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentNotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentNotesApi apiInstance = new ShipmentNotesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    FulfillmentAPIShipmentNote shipmentNoteDto = new FulfillmentAPIShipmentNote(); // FulfillmentAPIShipmentNote | shipmentNoteDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.newShipmentNote(shipmentNumber, shipmentNoteDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentNotesApi#newShipmentNote");
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
| **shipmentNoteDto** | [**FulfillmentAPIShipmentNote**](FulfillmentAPIShipmentNote.md)| shipmentNoteDto | |
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

<a name="updateShipmentNote"></a>
# **updateShipmentNote**
> EntityModelOfShipment updateShipmentNote(noteId, shipmentNumber, shipmentNoteDto, ifMatch)

updateShipmentNote

Update an existing shipment note.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentNotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentNotesApi apiInstance = new ShipmentNotesApi(defaultClient);
    String noteId = "noteId_example"; // String | noteId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    FulfillmentAPIShipmentNote shipmentNoteDto = new FulfillmentAPIShipmentNote(); // FulfillmentAPIShipmentNote | shipmentNoteDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.updateShipmentNote(noteId, shipmentNumber, shipmentNoteDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentNotesApi#updateShipmentNote");
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
| **noteId** | **String**| noteId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **shipmentNoteDto** | [**FulfillmentAPIShipmentNote**](FulfillmentAPIShipmentNote.md)| shipmentNoteDto | |
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

