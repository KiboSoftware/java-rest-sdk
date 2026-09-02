# ShipmentDataApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteShipmentData**](ShipmentDataApi.md#deleteShipmentData) | **DELETE** /commerce/shipments/{shipmentNumber}/data | deleteShipmentData |
| [**deleteShipmentDataByKey**](ShipmentDataApi.md#deleteShipmentDataByKey) | **DELETE** /commerce/shipments/{shipmentNumber}/data/{key} | deleteShipmentDataByKey |
| [**deleteShipmentItemData**](ShipmentDataApi.md#deleteShipmentItemData) | **DELETE** /commerce/shipments/{shipmentNumber}/items/{lineId}/data | deleteShipmentItemData |
| [**deleteShipmentItemDataByKey**](ShipmentDataApi.md#deleteShipmentItemDataByKey) | **DELETE** /commerce/shipments/{shipmentNumber}/items/{lineId}/data/{key} | deleteShipmentItemDataByKey |
| [**getShipmentData**](ShipmentDataApi.md#getShipmentData) | **GET** /commerce/shipments/{shipmentNumber}/data | getShipmentData |
| [**getShipmentItemData**](ShipmentDataApi.md#getShipmentItemData) | **GET** /commerce/shipments/{shipmentNumber}/items/{lineId}/data | getShipmentItemData |
| [**replaceShipmentData**](ShipmentDataApi.md#replaceShipmentData) | **PUT** /commerce/shipments/{shipmentNumber}/data | replaceShipmentData |
| [**replaceShipmentItemData**](ShipmentDataApi.md#replaceShipmentItemData) | **PUT** /commerce/shipments/{shipmentNumber}/items/{lineId}/data | replaceShipmentItemData |


<a name="deleteShipmentData"></a>
# **deleteShipmentData**
> deleteShipmentData(shipmentNumber)

deleteShipmentData

Delete a shipment&#39;s data.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentDataApi apiInstance = new ShipmentDataApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      apiInstance.deleteShipmentData(shipmentNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentDataApi#deleteShipmentData");
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

<a name="deleteShipmentDataByKey"></a>
# **deleteShipmentDataByKey**
> deleteShipmentDataByKey(key, shipmentNumber)

deleteShipmentDataByKey

Delete a shipment data entry by its key.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentDataApi apiInstance = new ShipmentDataApi(defaultClient);
    String key = "key_example"; // String | key
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      apiInstance.deleteShipmentDataByKey(key, shipmentNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentDataApi#deleteShipmentDataByKey");
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

<a name="deleteShipmentItemData"></a>
# **deleteShipmentItemData**
> deleteShipmentItemData(lineId, shipmentNumber)

deleteShipmentItemData

Delete shipment item data.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentDataApi apiInstance = new ShipmentDataApi(defaultClient);
    Integer lineId = 56; // Integer | lineId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      apiInstance.deleteShipmentItemData(lineId, shipmentNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentDataApi#deleteShipmentItemData");
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

<a name="deleteShipmentItemDataByKey"></a>
# **deleteShipmentItemDataByKey**
> deleteShipmentItemDataByKey(key, lineId, shipmentNumber)

deleteShipmentItemDataByKey

Delete a shipment item data record by its key.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentDataApi apiInstance = new ShipmentDataApi(defaultClient);
    String key = "key_example"; // String | key
    Integer lineId = 56; // Integer | lineId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      apiInstance.deleteShipmentItemDataByKey(key, lineId, shipmentNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentDataApi#deleteShipmentItemDataByKey");
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
| **lineId** | **Integer**| lineId | |
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

<a name="getShipmentData"></a>
# **getShipmentData**
> Map&lt;String, Object&gt; getShipmentData(shipmentNumber)

getShipmentData

Get the data of a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentDataApi apiInstance = new ShipmentDataApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      Map<String, Object> result = apiInstance.getShipmentData(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentDataApi#getShipmentData");
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

<a name="getShipmentItemData"></a>
# **getShipmentItemData**
> Map&lt;String, Object&gt; getShipmentItemData(lineId, shipmentNumber)

getShipmentItemData

Get the data of a shipment line item.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentDataApi apiInstance = new ShipmentDataApi(defaultClient);
    Integer lineId = 56; // Integer | lineId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      Map<String, Object> result = apiInstance.getShipmentItemData(lineId, shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentDataApi#getShipmentItemData");
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

### Return type

**Map&lt;String, Object&gt;**

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

<a name="replaceShipmentData"></a>
# **replaceShipmentData**
> Map&lt;String, Object&gt; replaceShipmentData(shipmentNumber, data, merge)

replaceShipmentData

Update and replace a shipment&#39;s data.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentDataApi apiInstance = new ShipmentDataApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Map<String, Object> data = null; // Map<String, Object> | data
    Boolean merge = false; // Boolean | merge
    try {
      Map<String, Object> result = apiInstance.replaceShipmentData(shipmentNumber, data, merge);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentDataApi#replaceShipmentData");
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
| **data** | [**Map&lt;String, Object&gt;**](Object.md)| data | |
| **merge** | **Boolean**| merge | [optional] [default to false] |

### Return type

**Map&lt;String, Object&gt;**

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

<a name="replaceShipmentItemData"></a>
# **replaceShipmentItemData**
> Map&lt;String, Object&gt; replaceShipmentItemData(lineId, shipmentNumber, data, merge)

replaceShipmentItemData

Replace shipment item data.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentDataApi apiInstance = new ShipmentDataApi(defaultClient);
    Integer lineId = 56; // Integer | lineId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Map<String, Object> data = null; // Map<String, Object> | data
    Boolean merge = false; // Boolean | merge
    try {
      Map<String, Object> result = apiInstance.replaceShipmentItemData(lineId, shipmentNumber, data, merge);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentDataApi#replaceShipmentItemData");
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
| **data** | [**Map&lt;String, Object&gt;**](Object.md)| data | |
| **merge** | **Boolean**| merge | [optional] [default to false] |

### Return type

**Map&lt;String, Object&gt;**

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

