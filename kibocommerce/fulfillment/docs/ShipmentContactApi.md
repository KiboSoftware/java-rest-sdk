# ShipmentContactApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAlternateContact**](ShipmentContactApi.md#deleteAlternateContact) | **DELETE** /commerce/shipments/{shipmentNumber}/alternateContact | deleteAlternateContact |
| [**getAlternateContact**](ShipmentContactApi.md#getAlternateContact) | **GET** /commerce/shipments/{shipmentNumber}/alternateContact | getAlternateContact |
| [**getCustomerContact**](ShipmentContactApi.md#getCustomerContact) | **GET** /commerce/shipments/{shipmentNumber}/customerContact | getCustomerContact |
| [**getDestinationContact**](ShipmentContactApi.md#getDestinationContact) | **GET** /commerce/shipments/{shipmentNumber}/destinationContact | getDestinationContact |
| [**updateAlternateContact**](ShipmentContactApi.md#updateAlternateContact) | **PUT** /commerce/shipments/{shipmentNumber}/alternateContact | updateAlternateContact |
| [**updateCustomerContact**](ShipmentContactApi.md#updateCustomerContact) | **PUT** /commerce/shipments/{shipmentNumber}/customerContact | updateCustomerContact |
| [**updateDestinationContact**](ShipmentContactApi.md#updateDestinationContact) | **PUT** /commerce/shipments/{shipmentNumber}/destinationContact | updateDestinationContact |


<a name="deleteAlternateContact"></a>
# **deleteAlternateContact**
> deleteAlternateContact(shipmentNumber, ifMatch)

deleteAlternateContact

Delete a shipment&#39;s alternate contact details.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentContactApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentContactApi apiInstance = new ShipmentContactApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      apiInstance.deleteAlternateContact(shipmentNumber, ifMatch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentContactApi#deleteAlternateContact");
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

<a name="getAlternateContact"></a>
# **getAlternateContact**
> EntityModelOfContact getAlternateContact(shipmentNumber)

getAlternateContact

Get the designated alternate contact for a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentContactApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentContactApi apiInstance = new ShipmentContactApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      EntityModelOfContact result = apiInstance.getAlternateContact(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentContactApi#getAlternateContact");
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

[**EntityModelOfContact**](EntityModelOfContact.md)

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

<a name="getCustomerContact"></a>
# **getCustomerContact**
> EntityModelOfContact getCustomerContact(shipmentNumber)

getCustomerContact

Get the customer contact information of a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentContactApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentContactApi apiInstance = new ShipmentContactApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      EntityModelOfContact result = apiInstance.getCustomerContact(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentContactApi#getCustomerContact");
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

[**EntityModelOfContact**](EntityModelOfContact.md)

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

<a name="getDestinationContact"></a>
# **getDestinationContact**
> EntityModelOfContact getDestinationContact(shipmentNumber)

getDestinationContact

Get the destination contact for a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentContactApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentContactApi apiInstance = new ShipmentContactApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      EntityModelOfContact result = apiInstance.getDestinationContact(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentContactApi#getDestinationContact");
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

[**EntityModelOfContact**](EntityModelOfContact.md)

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

<a name="updateAlternateContact"></a>
# **updateAlternateContact**
> EntityModelOfContact updateAlternateContact(shipmentNumber, updateContactRequest, ifMatch)

updateAlternateContact

Update the designated alternate contact of a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentContactApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentContactApi apiInstance = new ShipmentContactApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    UpdateContactRequest updateContactRequest = new UpdateContactRequest(); // UpdateContactRequest | updateContactRequest
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfContact result = apiInstance.updateAlternateContact(shipmentNumber, updateContactRequest, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentContactApi#updateAlternateContact");
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
| **updateContactRequest** | [**UpdateContactRequest**](UpdateContactRequest.md)| updateContactRequest | |
| **ifMatch** | **String**| If-Match | [optional] |

### Return type

[**EntityModelOfContact**](EntityModelOfContact.md)

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

<a name="updateCustomerContact"></a>
# **updateCustomerContact**
> EntityModelOfContact updateCustomerContact(shipmentNumber, updateContactRequest, ifMatch)

updateCustomerContact

Update the customer contact information of a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentContactApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentContactApi apiInstance = new ShipmentContactApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    UpdateContactRequest updateContactRequest = new UpdateContactRequest(); // UpdateContactRequest | updateContactRequest
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfContact result = apiInstance.updateCustomerContact(shipmentNumber, updateContactRequest, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentContactApi#updateCustomerContact");
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
| **updateContactRequest** | [**UpdateContactRequest**](UpdateContactRequest.md)| updateContactRequest | |
| **ifMatch** | **String**| If-Match | [optional] |

### Return type

[**EntityModelOfContact**](EntityModelOfContact.md)

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

<a name="updateDestinationContact"></a>
# **updateDestinationContact**
> EntityModelOfContact updateDestinationContact(shipmentNumber, updateContactRequest, ifMatch)

updateDestinationContact

Update the destination contact of a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentContactApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentContactApi apiInstance = new ShipmentContactApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    UpdateContactRequest updateContactRequest = new UpdateContactRequest(); // UpdateContactRequest | updateContactRequest
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfContact result = apiInstance.updateDestinationContact(shipmentNumber, updateContactRequest, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentContactApi#updateDestinationContact");
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
| **updateContactRequest** | [**UpdateContactRequest**](UpdateContactRequest.md)| updateContactRequest | |
| **ifMatch** | **String**| If-Match | [optional] |

### Return type

[**EntityModelOfContact**](EntityModelOfContact.md)

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

