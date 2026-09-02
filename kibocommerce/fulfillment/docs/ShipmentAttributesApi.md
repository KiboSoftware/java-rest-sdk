# ShipmentAttributesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createShipmentAttributes**](ShipmentAttributesApi.md#createShipmentAttributes) | **POST** /commerce/shipments/{shipmentNumber}/attributes | createShipmentAttributes |
| [**deleteShipmentAttribute**](ShipmentAttributesApi.md#deleteShipmentAttribute) | **DELETE** /commerce/shipments/{shipmentNumber}/attributes/{key} | deleteShipmentMapAttribute |
| [**getShipmentAttribute**](ShipmentAttributesApi.md#getShipmentAttribute) | **GET** /commerce/shipments/{shipmentNumber}/attributes/{key} | getShipmentMapAttribute |
| [**getShipmentAttributes**](ShipmentAttributesApi.md#getShipmentAttributes) | **GET** /commerce/shipments/{shipmentNumber}/attributes | getShipmentMapAttributes |
| [**setShipmentAttribute**](ShipmentAttributesApi.md#setShipmentAttribute) | **PUT** /commerce/shipments/{shipmentNumber}/attributes/{key} | setShipmentMapAttribute |
| [**setShipmentAttributes**](ShipmentAttributesApi.md#setShipmentAttributes) | **PUT** /commerce/shipments/{shipmentNumber}/attributes | setShipmentMapAttributes |


<a name="createShipmentAttributes"></a>
# **createShipmentAttributes**
> EntityModelOfShipment createShipmentAttributes(shipmentNumber, xVolTenant, fulfillmentAPIShipmentAttribute, ifMatch, xVolSite, xVolVersion)

createShipmentAttributes

createShipmentAttributes

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentAttributesApi apiInstance = new ShipmentAttributesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    List<FulfillmentAPIShipmentAttribute> fulfillmentAPIShipmentAttribute = Arrays.asList(); // List<FulfillmentAPIShipmentAttribute> | attributeDtos
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    String xVolVersion = "xVolVersion_example"; // String | x-vol-version
    try {
      EntityModelOfShipment result = apiInstance.createShipmentAttributes(shipmentNumber, xVolTenant, fulfillmentAPIShipmentAttribute, ifMatch, xVolSite, xVolVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentAttributesApi#createShipmentAttributes");
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
| **fulfillmentAPIShipmentAttribute** | [**List&lt;FulfillmentAPIShipmentAttribute&gt;**](FulfillmentAPIShipmentAttribute.md)| attributeDtos | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |
| **xVolVersion** | **String**| x-vol-version | [optional] |

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

<a name="deleteShipmentAttribute"></a>
# **deleteShipmentAttribute**
> deleteShipmentAttribute(key, shipmentNumber)

deleteShipmentMapAttribute

Delete a shipment attribute.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentAttributesApi apiInstance = new ShipmentAttributesApi(defaultClient);
    String key = "key_example"; // String | key
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      apiInstance.deleteShipmentAttribute(key, shipmentNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentAttributesApi#deleteShipmentAttribute");
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
| **key** | **String**| key | |
| **shipmentNumber** | **Integer**| shipmentNumber | |

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

<a name="getShipmentAttribute"></a>
# **getShipmentAttribute**
> FulfillmentAPIShipmentAttribute getShipmentAttribute(key, shipmentNumber)

getShipmentMapAttribute

Get a shipment attribute by its key.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentAttributesApi apiInstance = new ShipmentAttributesApi(defaultClient);
    String key = "key_example"; // String | key
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      FulfillmentAPIShipmentAttribute result = apiInstance.getShipmentAttribute(key, shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentAttributesApi#getShipmentAttribute");
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
| **key** | **String**| key | |
| **shipmentNumber** | **Integer**| shipmentNumber | |

### Return type

[**FulfillmentAPIShipmentAttribute**](FulfillmentAPIShipmentAttribute.md)

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

<a name="getShipmentAttributes"></a>
# **getShipmentAttributes**
> List&lt;FulfillmentAPIShipmentAttribute&gt; getShipmentAttributes(shipmentNumber)

getShipmentMapAttributes

Get a shipment&#39;s attributes.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentAttributesApi apiInstance = new ShipmentAttributesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      List<FulfillmentAPIShipmentAttribute> result = apiInstance.getShipmentAttributes(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentAttributesApi#getShipmentAttributes");
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

[**List&lt;FulfillmentAPIShipmentAttribute&gt;**](FulfillmentAPIShipmentAttribute.md)

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

<a name="setShipmentAttribute"></a>
# **setShipmentAttribute**
> FulfillmentAPIShipmentAttribute setShipmentAttribute(key, shipmentNumber, attribute)

setShipmentMapAttribute

Set a shipment&#39;s attribute value.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentAttributesApi apiInstance = new ShipmentAttributesApi(defaultClient);
    String key = "key_example"; // String | key
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    FulfillmentAPIShipmentAttribute attribute = new FulfillmentAPIShipmentAttribute(); // FulfillmentAPIShipmentAttribute | attribute
    try {
      FulfillmentAPIShipmentAttribute result = apiInstance.setShipmentAttribute(key, shipmentNumber, attribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentAttributesApi#setShipmentAttribute");
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
| **key** | **String**| key | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **attribute** | [**FulfillmentAPIShipmentAttribute**](FulfillmentAPIShipmentAttribute.md)| attribute | |

### Return type

[**FulfillmentAPIShipmentAttribute**](FulfillmentAPIShipmentAttribute.md)

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

<a name="setShipmentAttributes"></a>
# **setShipmentAttributes**
> List&lt;FulfillmentAPIShipmentAttribute&gt; setShipmentAttributes(shipmentNumber, attributes)

setShipmentMapAttributes

Set a shipment&#39;s attributes.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentAttributesApi apiInstance = new ShipmentAttributesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    List<FulfillmentAPIShipmentAttribute> attributes = Arrays.asList(); // List<FulfillmentAPIShipmentAttribute> | attributes
    try {
      List<FulfillmentAPIShipmentAttribute> result = apiInstance.setShipmentAttributes(shipmentNumber, attributes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentAttributesApi#setShipmentAttributes");
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
| **attributes** | [**List&lt;FulfillmentAPIShipmentAttribute&gt;**](FulfillmentAPIShipmentAttribute.md)| attributes | |

### Return type

[**List&lt;FulfillmentAPIShipmentAttribute&gt;**](FulfillmentAPIShipmentAttribute.md)

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

