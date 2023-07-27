# ShipmentPackagesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteShipmentPackageUsingDELETE**](ShipmentPackagesApi.md#deleteShipmentPackageUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/packages/{packageId} | Delete Shipment Package |
| [**deleteShipmentPackagesUsingDELETE**](ShipmentPackagesApi.md#deleteShipmentPackagesUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/packages/bulk | Delete Shipment Packages |
| [**newPackageUsingPOST**](ShipmentPackagesApi.md#newPackageUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/packages | Create Shipment Package |
| [**newPackagesUsingPOST**](ShipmentPackagesApi.md#newPackagesUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/packages/bulk | Bulk Create Shipment Packages |
| [**updatePackageUsingPUT**](ShipmentPackagesApi.md#updatePackageUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/packages/{packageId} | Update Shipment Package |


<a name="deleteShipmentPackageUsingDELETE"></a>
# **deleteShipmentPackageUsingDELETE**
> deleteShipmentPackageUsingDELETE(shipmentNumber, packageId, ifMatch)

Delete Shipment Package

Delete Shipment Package

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesApi;

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

    ShipmentPackagesApi apiInstance = new ShipmentPackagesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String packageId = "packageId_example"; // String | packageId
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      apiInstance.deleteShipmentPackageUsingDELETE(shipmentNumber, packageId, ifMatch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentPackagesApi#deleteShipmentPackageUsingDELETE");
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
| **packageId** | **String**| packageId | |
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
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="deleteShipmentPackagesUsingDELETE"></a>
# **deleteShipmentPackagesUsingDELETE**
> EntityModelOfShipment deleteShipmentPackagesUsingDELETE(shipmentNumber, ifMatch)

Delete Shipment Packages

Delete Shipment Packages

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesApi;

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

    ShipmentPackagesApi apiInstance = new ShipmentPackagesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.deleteShipmentPackagesUsingDELETE(shipmentNumber, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentPackagesApi#deleteShipmentPackagesUsingDELETE");
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
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="newPackageUsingPOST"></a>
# **newPackageUsingPOST**
> EntityModelOfShipment newPackageUsingPOST(shipmentNumber, ifMatch, fulfillmentPackage)

Create Shipment Package

Create Shipment Package

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesApi;

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

    ShipmentPackagesApi apiInstance = new ShipmentPackagesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    FulfillmentPackage fulfillmentPackage = new FulfillmentPackage(); // FulfillmentPackage | 
    try {
      EntityModelOfShipment result = apiInstance.newPackageUsingPOST(shipmentNumber, ifMatch, fulfillmentPackage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentPackagesApi#newPackageUsingPOST");
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
| **fulfillmentPackage** | [**FulfillmentPackage**](FulfillmentPackage.md)|  | [optional] |

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

<a name="newPackagesUsingPOST"></a>
# **newPackagesUsingPOST**
> EntityModelOfShipment newPackagesUsingPOST(shipmentNumber, ifMatch, fulfillmentPackage)

Bulk Create Shipment Packages

Bulk Create Shipment Packages

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesApi;

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

    ShipmentPackagesApi apiInstance = new ShipmentPackagesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    List<FulfillmentPackage> fulfillmentPackage = Arrays.asList(); // List<FulfillmentPackage> | 
    try {
      EntityModelOfShipment result = apiInstance.newPackagesUsingPOST(shipmentNumber, ifMatch, fulfillmentPackage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentPackagesApi#newPackagesUsingPOST");
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
| **fulfillmentPackage** | [**List&lt;FulfillmentPackage&gt;**](FulfillmentPackage.md)|  | [optional] |

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

<a name="updatePackageUsingPUT"></a>
# **updatePackageUsingPUT**
> EntityModelOfShipment updatePackageUsingPUT(shipmentNumber, packageId, ifMatch, fulfillmentPackage)

Update Shipment Package

Update Shipment Package

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesApi;

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

    ShipmentPackagesApi apiInstance = new ShipmentPackagesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String packageId = "packageId_example"; // String | packageId
    String ifMatch = "ifMatch_example"; // String | If-Match
    FulfillmentPackage fulfillmentPackage = new FulfillmentPackage(); // FulfillmentPackage | 
    try {
      EntityModelOfShipment result = apiInstance.updatePackageUsingPUT(shipmentNumber, packageId, ifMatch, fulfillmentPackage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentPackagesApi#updatePackageUsingPUT");
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
| **packageId** | **String**| packageId | |
| **ifMatch** | **String**| If-Match | [optional] |
| **fulfillmentPackage** | [**FulfillmentPackage**](FulfillmentPackage.md)|  | [optional] |

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

