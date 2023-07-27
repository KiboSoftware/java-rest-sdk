# FutureShipmentApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFutureShipmentsForItemsUsingPOST**](FutureShipmentApi.md#createFutureShipmentsForItemsUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/futureItems | Create Future Shipments for Items |
| [**futureShipmentToReadyUsingPUT**](FutureShipmentApi.md#futureShipmentToReadyUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/futureToReady | Future Shipment to Ready |
| [**updateFutureShipmentDateUsingPUT**](FutureShipmentApi.md#updateFutureShipmentDateUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/futureUpdateDate | Update Future Shipment Date |


<a name="createFutureShipmentsForItemsUsingPOST"></a>
# **createFutureShipmentsForItemsUsingPOST**
> CollectionModelOfEntityModelOfShipment createFutureShipmentsForItemsUsingPOST(shipmentNumber, ifMatch, futureItemsRequest)

Create Future Shipments for Items

Create Future Shipments for Items

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.FutureShipmentApi;

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

    FutureShipmentApi apiInstance = new FutureShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    FutureItemsRequest futureItemsRequest = new FutureItemsRequest(); // FutureItemsRequest | 
    try {
      CollectionModelOfEntityModelOfShipment result = apiInstance.createFutureShipmentsForItemsUsingPOST(shipmentNumber, ifMatch, futureItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureShipmentApi#createFutureShipmentsForItemsUsingPOST");
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
| **futureItemsRequest** | [**FutureItemsRequest**](FutureItemsRequest.md)|  | [optional] |

### Return type

[**CollectionModelOfEntityModelOfShipment**](CollectionModelOfEntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="futureShipmentToReadyUsingPUT"></a>
# **futureShipmentToReadyUsingPUT**
> EntityModelOfShipment futureShipmentToReadyUsingPUT(shipmentNumber, ifMatch)

Future Shipment to Ready

Future Shipment to Ready

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.FutureShipmentApi;

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

    FutureShipmentApi apiInstance = new FutureShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.futureShipmentToReadyUsingPUT(shipmentNumber, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureShipmentApi#futureShipmentToReadyUsingPUT");
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
 - **Accept**: application/json, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="updateFutureShipmentDateUsingPUT"></a>
# **updateFutureShipmentDateUsingPUT**
> EntityModelOfShipment updateFutureShipmentDateUsingPUT(shipmentNumber, ifMatch, futureShipmentUpdateDateRequest)

Update Future Shipment Date

Update Future Shipment Date

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.FutureShipmentApi;

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

    FutureShipmentApi apiInstance = new FutureShipmentApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    FutureShipmentUpdateDateRequest futureShipmentUpdateDateRequest = new FutureShipmentUpdateDateRequest(); // FutureShipmentUpdateDateRequest | 
    try {
      EntityModelOfShipment result = apiInstance.updateFutureShipmentDateUsingPUT(shipmentNumber, ifMatch, futureShipmentUpdateDateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureShipmentApi#updateFutureShipmentDateUsingPUT");
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
| **futureShipmentUpdateDateRequest** | [**FutureShipmentUpdateDateRequest**](FutureShipmentUpdateDateRequest.md)|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

