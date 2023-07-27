# ShipmentNotesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteShipmentNoteUsingDELETE**](ShipmentNotesApi.md#deleteShipmentNoteUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/notes/{noteId} | Delete Shipment Note |
| [**newShipmentNoteUsingPOST**](ShipmentNotesApi.md#newShipmentNoteUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/notes | Create Shipment Note |
| [**updateShipmentNoteUsingPUT**](ShipmentNotesApi.md#updateShipmentNoteUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/notes/{noteId} | Update Shipment Note |


<a name="deleteShipmentNoteUsingDELETE"></a>
# **deleteShipmentNoteUsingDELETE**
> deleteShipmentNoteUsingDELETE(shipmentNumber, noteId, ifMatch)

Delete Shipment Note

Delete Shipment Note

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentNotesApi;

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

    ShipmentNotesApi apiInstance = new ShipmentNotesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String noteId = "noteId_example"; // String | noteId
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      apiInstance.deleteShipmentNoteUsingDELETE(shipmentNumber, noteId, ifMatch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentNotesApi#deleteShipmentNoteUsingDELETE");
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
| **noteId** | **String**| noteId | |
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

<a name="newShipmentNoteUsingPOST"></a>
# **newShipmentNoteUsingPOST**
> EntityModelOfShipment newShipmentNoteUsingPOST(shipmentNumber, ifMatch, fulfillmentShipmentNote)

Create Shipment Note

Create Shipment Note

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentNotesApi;

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

    ShipmentNotesApi apiInstance = new ShipmentNotesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    FulfillmentShipmentNote fulfillmentShipmentNote = new FulfillmentShipmentNote(); // FulfillmentShipmentNote | 
    try {
      EntityModelOfShipment result = apiInstance.newShipmentNoteUsingPOST(shipmentNumber, ifMatch, fulfillmentShipmentNote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentNotesApi#newShipmentNoteUsingPOST");
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
| **fulfillmentShipmentNote** | [**FulfillmentShipmentNote**](FulfillmentShipmentNote.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, */*, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Shipment note added |  -  |
| **201** | Created |  -  |
| **400** | Invalid Input |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="updateShipmentNoteUsingPUT"></a>
# **updateShipmentNoteUsingPUT**
> EntityModelOfShipment updateShipmentNoteUsingPUT(shipmentNumber, noteId, ifMatch, fulfillmentShipmentNote)

Update Shipment Note

Update Shipment Note

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentNotesApi;

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

    ShipmentNotesApi apiInstance = new ShipmentNotesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String noteId = "noteId_example"; // String | noteId
    String ifMatch = "ifMatch_example"; // String | If-Match
    FulfillmentShipmentNote fulfillmentShipmentNote = new FulfillmentShipmentNote(); // FulfillmentShipmentNote | 
    try {
      EntityModelOfShipment result = apiInstance.updateShipmentNoteUsingPUT(shipmentNumber, noteId, ifMatch, fulfillmentShipmentNote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentNotesApi#updateShipmentNoteUsingPUT");
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
| **noteId** | **String**| noteId | |
| **ifMatch** | **String**| If-Match | [optional] |
| **fulfillmentShipmentNote** | [**FulfillmentShipmentNote**](FulfillmentShipmentNote.md)|  | [optional] |

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
| **400** | Invalid Input |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

