# ShipmentItemAttributesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createShipmentItemAttributes**](ShipmentItemAttributesApi.md#createShipmentItemAttributes) | **POST** /commerce/shipments/{shipmentNumber}/items/attributes | createShipmentItemAttributes |
| [**getShipmentItemAttributes**](ShipmentItemAttributesApi.md#getShipmentItemAttributes) | **GET** /commerce/shipments/{shipmentNumber}/items/attributes | getShipmentItemAttributes |
| [**updateShipmentItemAttributes**](ShipmentItemAttributesApi.md#updateShipmentItemAttributes) | **PUT** /commerce/shipments/{shipmentNumber}/items/attributes/bulk | updateShipmentItemAttributes |
| [**updateSingleItemAttributes**](ShipmentItemAttributesApi.md#updateSingleItemAttributes) | **PUT** /commerce/shipments/{shipmentNumber}/items/attributes/{lineId} | updateSingleItemAttributes |


<a name="createShipmentItemAttributes"></a>
# **createShipmentItemAttributes**
> EntityModelOfShipment createShipmentItemAttributes(shipmentNumber, xVolTenant, itemAttributes, ifMatch, xVolSite)

createShipmentItemAttributes

createShipmentItemAttributes

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentItemAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentItemAttributesApi apiInstance = new ShipmentItemAttributesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    List<ItemAttributes> itemAttributes = Arrays.asList(); // List<ItemAttributes> | itemAttributesList
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.createShipmentItemAttributes(shipmentNumber, xVolTenant, itemAttributes, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentItemAttributesApi#createShipmentItemAttributes");
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
| **itemAttributes** | [**List&lt;ItemAttributes&gt;**](ItemAttributes.md)| itemAttributesList | |
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

<a name="getShipmentItemAttributes"></a>
# **getShipmentItemAttributes**
> List&lt;ItemAttributes&gt; getShipmentItemAttributes(shipmentNumber, xVolTenant, xVolSite)

getShipmentItemAttributes

getShipmentItemAttributes

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentItemAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentItemAttributesApi apiInstance = new ShipmentItemAttributesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      List<ItemAttributes> result = apiInstance.getShipmentItemAttributes(shipmentNumber, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentItemAttributesApi#getShipmentItemAttributes");
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

[**List&lt;ItemAttributes&gt;**](ItemAttributes.md)

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

<a name="updateShipmentItemAttributes"></a>
# **updateShipmentItemAttributes**
> EntityModelOfShipment updateShipmentItemAttributes(shipmentNumber, xVolTenant, itemAttributes, ifMatch, removeMissing, xVolSite)

updateShipmentItemAttributes

updateShipmentItemAttributes

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentItemAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentItemAttributesApi apiInstance = new ShipmentItemAttributesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    List<ItemAttributes> itemAttributes = Arrays.asList(); // List<ItemAttributes> | itemAttributesList
    String ifMatch = "ifMatch_example"; // String | If-Match
    Boolean removeMissing = false; // Boolean | removeMissing
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.updateShipmentItemAttributes(shipmentNumber, xVolTenant, itemAttributes, ifMatch, removeMissing, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentItemAttributesApi#updateShipmentItemAttributes");
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
| **itemAttributes** | [**List&lt;ItemAttributes&gt;**](ItemAttributes.md)| itemAttributesList | |
| **ifMatch** | **String**| If-Match | [optional] |
| **removeMissing** | **Boolean**| removeMissing | [optional] [default to false] |
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

<a name="updateSingleItemAttributes"></a>
# **updateSingleItemAttributes**
> EntityModelOfShipment updateSingleItemAttributes(lineId, shipmentNumber, xVolTenant, shipmentItemAttribute, ifMatch, removeMissing, xVolSite)

updateSingleItemAttributes

updateSingleItemAttributes

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentItemAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentItemAttributesApi apiInstance = new ShipmentItemAttributesApi(defaultClient);
    Integer lineId = 56; // Integer | lineId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    List<ShipmentItemAttribute> shipmentItemAttribute = Arrays.asList(); // List<ShipmentItemAttribute> | attributesList
    String ifMatch = "ifMatch_example"; // String | If-Match
    Boolean removeMissing = false; // Boolean | removeMissing
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.updateSingleItemAttributes(lineId, shipmentNumber, xVolTenant, shipmentItemAttribute, ifMatch, removeMissing, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentItemAttributesApi#updateSingleItemAttributes");
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
| **shipmentItemAttribute** | [**List&lt;ShipmentItemAttribute&gt;**](ShipmentItemAttribute.md)| attributesList | |
| **ifMatch** | **String**| If-Match | [optional] |
| **removeMissing** | **Boolean**| removeMissing | [optional] [default to false] |
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

