# ShipmentHoldApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**holdShipment**](ShipmentHoldApi.md#holdShipment) | **PUT** /commerce/shipments/{shipmentNumber}/hold | Place Shipment on Hold |
| [**releaseShipment**](ShipmentHoldApi.md#releaseShipment) | **PUT** /commerce/shipments/{shipmentNumber}/holdRelease | Release Shipment from Hold |
| [**updateHoldReleaseDate**](ShipmentHoldApi.md#updateHoldReleaseDate) | **PUT** /commerce/shipments/{shipmentNumber}/holdReleaseDate | Update Hold Release Date |


<a name="holdShipment"></a>
# **holdShipment**
> EntityModelOfShipment holdShipment(shipmentNumber, ifMatch, holdReleaseDateUpdateRequest)

Place Shipment on Hold

Transitions a shipment to HOLD status, suspending normal fulfillment processing.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentHoldApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentHoldApi apiInstance = new ShipmentHoldApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    HoldReleaseDateUpdateRequest holdReleaseDateUpdateRequest = new HoldReleaseDateUpdateRequest(); // HoldReleaseDateUpdateRequest | holdReleaseDateUpdateRequestDto
    try {
      EntityModelOfShipment result = apiInstance.holdShipment(shipmentNumber, ifMatch, holdReleaseDateUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentHoldApi#holdShipment");
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
| **holdReleaseDateUpdateRequest** | [**HoldReleaseDateUpdateRequest**](HoldReleaseDateUpdateRequest.md)| holdReleaseDateUpdateRequestDto | [optional] |

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

<a name="releaseShipment"></a>
# **releaseShipment**
> EntityModelOfShipment releaseShipment(shipmentNumber, ifMatch, isAutoRelease)

Release Shipment from Hold

Transitions a shipment from HOLD status back to its previous status, such as READY, allowing normal fulfillment processing to continue.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentHoldApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentHoldApi apiInstance = new ShipmentHoldApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    Boolean isAutoRelease = false; // Boolean | Whether this is an automatic release.
    try {
      EntityModelOfShipment result = apiInstance.releaseShipment(shipmentNumber, ifMatch, isAutoRelease);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentHoldApi#releaseShipment");
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
| **isAutoRelease** | **Boolean**| Whether this is an automatic release. | [optional] [default to false] |

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

<a name="updateHoldReleaseDate"></a>
# **updateHoldReleaseDate**
> EntityModelOfShipment updateHoldReleaseDate(shipmentNumber, holdReleaseDateUpdateRequest, ifMatch)

Update Hold Release Date

Updates the scheduled release date for a shipment currently on hold. The shipment will be automatically released when the specified date/time is reached.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentHoldApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentHoldApi apiInstance = new ShipmentHoldApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    HoldReleaseDateUpdateRequest holdReleaseDateUpdateRequest = new HoldReleaseDateUpdateRequest(); // HoldReleaseDateUpdateRequest | holdReleaseDateUpdateRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.updateHoldReleaseDate(shipmentNumber, holdReleaseDateUpdateRequest, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentHoldApi#updateHoldReleaseDate");
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
| **holdReleaseDateUpdateRequest** | [**HoldReleaseDateUpdateRequest**](HoldReleaseDateUpdateRequest.md)| holdReleaseDateUpdateRequestDto | |
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

