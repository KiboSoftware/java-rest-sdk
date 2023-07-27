# ShipmentAttributesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteShipmentAttributeUsingDELETE**](ShipmentAttributesApi.md#deleteShipmentAttributeUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/attributes/{key} | Delete Shipment Attribute |
| [**getShipmentAttributeUsingGET**](ShipmentAttributesApi.md#getShipmentAttributeUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/attributes/{key} | Get Shipment Attribute |
| [**getShipmentAttributesUsingGET**](ShipmentAttributesApi.md#getShipmentAttributesUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/attributes | Get Shipment Attributes |
| [**setShipmentAttributeUsingPUT**](ShipmentAttributesApi.md#setShipmentAttributeUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/attributes/{key} | Set Shipment Attribute |
| [**setShipmentAttributesUsingPUT**](ShipmentAttributesApi.md#setShipmentAttributesUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/attributes | Set Shipment Attributes |


<a name="deleteShipmentAttributeUsingDELETE"></a>
# **deleteShipmentAttributeUsingDELETE**
> deleteShipmentAttributeUsingDELETE(shipmentNumber, key)

Delete Shipment Attribute

Delete Shipment Attribute

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributesApi;

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

    ShipmentAttributesApi apiInstance = new ShipmentAttributesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String key = "key_example"; // String | key
    try {
      apiInstance.deleteShipmentAttributeUsingDELETE(shipmentNumber, key);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentAttributesApi#deleteShipmentAttributeUsingDELETE");
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
| **key** | **String**| key | |

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

<a name="getShipmentAttributeUsingGET"></a>
# **getShipmentAttributeUsingGET**
> ShipmentAttribute getShipmentAttributeUsingGET(shipmentNumber, key)

Get Shipment Attribute

Get Shipment Attribute

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributesApi;

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

    ShipmentAttributesApi apiInstance = new ShipmentAttributesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String key = "key_example"; // String | key
    try {
      ShipmentAttribute result = apiInstance.getShipmentAttributeUsingGET(shipmentNumber, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentAttributesApi#getShipmentAttributeUsingGET");
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
| **key** | **String**| key | |

### Return type

[**ShipmentAttribute**](ShipmentAttribute.md)

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

<a name="getShipmentAttributesUsingGET"></a>
# **getShipmentAttributesUsingGET**
> List&lt;ShipmentAttribute&gt; getShipmentAttributesUsingGET(shipmentNumber)

Get Shipment Attributes

Get Shipment Attributes

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributesApi;

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

    ShipmentAttributesApi apiInstance = new ShipmentAttributesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      List<ShipmentAttribute> result = apiInstance.getShipmentAttributesUsingGET(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentAttributesApi#getShipmentAttributesUsingGET");
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

[**List&lt;ShipmentAttribute&gt;**](ShipmentAttribute.md)

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

<a name="setShipmentAttributeUsingPUT"></a>
# **setShipmentAttributeUsingPUT**
> ShipmentAttribute setShipmentAttributeUsingPUT(shipmentNumber, key, shipmentAttribute)

Set Shipment Attribute

Set Shipment Attribute

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributesApi;

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

    ShipmentAttributesApi apiInstance = new ShipmentAttributesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String key = "key_example"; // String | key
    ShipmentAttribute shipmentAttribute = new ShipmentAttribute(); // ShipmentAttribute | 
    try {
      ShipmentAttribute result = apiInstance.setShipmentAttributeUsingPUT(shipmentNumber, key, shipmentAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentAttributesApi#setShipmentAttributeUsingPUT");
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
| **key** | **String**| key | |
| **shipmentAttribute** | [**ShipmentAttribute**](ShipmentAttribute.md)|  | [optional] |

### Return type

[**ShipmentAttribute**](ShipmentAttribute.md)

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

<a name="setShipmentAttributesUsingPUT"></a>
# **setShipmentAttributesUsingPUT**
> List&lt;ShipmentAttribute&gt; setShipmentAttributesUsingPUT(shipmentNumber, shipmentAttribute)

Set Shipment Attributes

Set Shipment Attributes

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributesApi;

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

    ShipmentAttributesApi apiInstance = new ShipmentAttributesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    List<ShipmentAttribute> shipmentAttribute = Arrays.asList(); // List<ShipmentAttribute> | 
    try {
      List<ShipmentAttribute> result = apiInstance.setShipmentAttributesUsingPUT(shipmentNumber, shipmentAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentAttributesApi#setShipmentAttributesUsingPUT");
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
| **shipmentAttribute** | [**List&lt;ShipmentAttribute&gt;**](ShipmentAttribute.md)|  | [optional] |

### Return type

[**List&lt;ShipmentAttribute&gt;**](ShipmentAttribute.md)

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

