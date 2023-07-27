# ShipmentDataApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteShipmentDataByKeyUsingDELETE**](ShipmentDataApi.md#deleteShipmentDataByKeyUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/data/{key} | Delete Shipment Data by Key |
| [**deleteShipmentDataUsingDELETE**](ShipmentDataApi.md#deleteShipmentDataUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/data | Delete Shipment Data |
| [**deleteShipmentItemDataByKeyUsingDELETE**](ShipmentDataApi.md#deleteShipmentItemDataByKeyUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/items/{lineId}/data/{key} | Delete Shipment Item Data by Key |
| [**deleteShipmentItemDataUsingDELETE**](ShipmentDataApi.md#deleteShipmentItemDataUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/items/{lineId}/data | Delete Shipment Item Data |
| [**getShipmentDataUsingGET**](ShipmentDataApi.md#getShipmentDataUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/data | Get Shipment Data |
| [**getShipmentItemDataUsingGET**](ShipmentDataApi.md#getShipmentItemDataUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/items/{lineId}/data | Get Shipment Item Data |
| [**replaceShipmentDataUsingPUT**](ShipmentDataApi.md#replaceShipmentDataUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/data | Replace Shipment Data |
| [**replaceShipmentItemDataUsingPUT**](ShipmentDataApi.md#replaceShipmentItemDataUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/items/{lineId}/data | Replace Shipment Item Data |


<a name="deleteShipmentDataByKeyUsingDELETE"></a>
# **deleteShipmentDataByKeyUsingDELETE**
> deleteShipmentDataByKeyUsingDELETE(shipmentNumber, key)

Delete Shipment Data by Key

Delete Shipment Data by Key

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentDataApi;

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

    ShipmentDataApi apiInstance = new ShipmentDataApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String key = "key_example"; // String | key
    try {
      apiInstance.deleteShipmentDataByKeyUsingDELETE(shipmentNumber, key);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentDataApi#deleteShipmentDataByKeyUsingDELETE");
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

<a name="deleteShipmentDataUsingDELETE"></a>
# **deleteShipmentDataUsingDELETE**
> deleteShipmentDataUsingDELETE(shipmentNumber)

Delete Shipment Data

Delete Shipment Data

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentDataApi;

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

    ShipmentDataApi apiInstance = new ShipmentDataApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      apiInstance.deleteShipmentDataUsingDELETE(shipmentNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentDataApi#deleteShipmentDataUsingDELETE");
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

<a name="deleteShipmentItemDataByKeyUsingDELETE"></a>
# **deleteShipmentItemDataByKeyUsingDELETE**
> deleteShipmentItemDataByKeyUsingDELETE(shipmentNumber, lineId, key)

Delete Shipment Item Data by Key

Delete Shipment Item Data by Key

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentDataApi;

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

    ShipmentDataApi apiInstance = new ShipmentDataApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer lineId = 56; // Integer | lineId
    String key = "key_example"; // String | key
    try {
      apiInstance.deleteShipmentItemDataByKeyUsingDELETE(shipmentNumber, lineId, key);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentDataApi#deleteShipmentItemDataByKeyUsingDELETE");
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

<a name="deleteShipmentItemDataUsingDELETE"></a>
# **deleteShipmentItemDataUsingDELETE**
> deleteShipmentItemDataUsingDELETE(shipmentNumber, lineId)

Delete Shipment Item Data

Delete Shipment Item Data

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentDataApi;

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

    ShipmentDataApi apiInstance = new ShipmentDataApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer lineId = 56; // Integer | lineId
    try {
      apiInstance.deleteShipmentItemDataUsingDELETE(shipmentNumber, lineId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentDataApi#deleteShipmentItemDataUsingDELETE");
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

<a name="getShipmentDataUsingGET"></a>
# **getShipmentDataUsingGET**
> Map&lt;String, Object&gt; getShipmentDataUsingGET(shipmentNumber)

Get Shipment Data

Get Shipment Data

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentDataApi;

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

    ShipmentDataApi apiInstance = new ShipmentDataApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      Map<String, Object> result = apiInstance.getShipmentDataUsingGET(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentDataApi#getShipmentDataUsingGET");
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

**Map&lt;String, Object&gt;**

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

<a name="getShipmentItemDataUsingGET"></a>
# **getShipmentItemDataUsingGET**
> Map&lt;String, Object&gt; getShipmentItemDataUsingGET(shipmentNumber, lineId)

Get Shipment Item Data

Get Shipment Item Data

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentDataApi;

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

    ShipmentDataApi apiInstance = new ShipmentDataApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer lineId = 56; // Integer | lineId
    try {
      Map<String, Object> result = apiInstance.getShipmentItemDataUsingGET(shipmentNumber, lineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentDataApi#getShipmentItemDataUsingGET");
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

### Return type

**Map&lt;String, Object&gt;**

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

<a name="replaceShipmentDataUsingPUT"></a>
# **replaceShipmentDataUsingPUT**
> Map&lt;String, Object&gt; replaceShipmentDataUsingPUT(shipmentNumber, merge, requestBody)

Replace Shipment Data

Replace Shipment Data

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentDataApi;

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

    ShipmentDataApi apiInstance = new ShipmentDataApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Boolean merge = true; // Boolean | merge
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      Map<String, Object> result = apiInstance.replaceShipmentDataUsingPUT(shipmentNumber, merge, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentDataApi#replaceShipmentDataUsingPUT");
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
| **merge** | **Boolean**| merge | [optional] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **201** | Created |  -  |
| **400** | Invalid Input |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="replaceShipmentItemDataUsingPUT"></a>
# **replaceShipmentItemDataUsingPUT**
> Map&lt;String, Object&gt; replaceShipmentItemDataUsingPUT(shipmentNumber, lineId, merge, requestBody)

Replace Shipment Item Data

Replace Shipment Item Data

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentDataApi;

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

    ShipmentDataApi apiInstance = new ShipmentDataApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer lineId = 56; // Integer | lineId
    Boolean merge = true; // Boolean | merge
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      Map<String, Object> result = apiInstance.replaceShipmentItemDataUsingPUT(shipmentNumber, lineId, merge, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentDataApi#replaceShipmentItemDataUsingPUT");
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
| **merge** | **Boolean**| merge | [optional] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

### Return type

**Map&lt;String, Object&gt;**

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

