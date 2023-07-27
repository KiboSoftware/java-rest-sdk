# ShipmentContactApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAlternateContactUsingDELETE**](ShipmentContactApi.md#deleteAlternateContactUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/alternateContact | Delete Alternate Contact |
| [**getAlternateContactUsingGET**](ShipmentContactApi.md#getAlternateContactUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/alternateContact | Get Alternate Contact |
| [**getCustomerContactUsingGET**](ShipmentContactApi.md#getCustomerContactUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/customerContact | Get Customer Contact |
| [**getDestinationContactUsingGET**](ShipmentContactApi.md#getDestinationContactUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/destinationContact | Get Destination Contact |
| [**updateAlternateContactUsingPUT**](ShipmentContactApi.md#updateAlternateContactUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/alternateContact | Update Alternate Contact |
| [**updateCustomerContactUsingPUT**](ShipmentContactApi.md#updateCustomerContactUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerContact | Update Customer Contact |
| [**updateDestinationContactUsingPUT**](ShipmentContactApi.md#updateDestinationContactUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/destinationContact | Update Destination Contact |


<a name="deleteAlternateContactUsingDELETE"></a>
# **deleteAlternateContactUsingDELETE**
> deleteAlternateContactUsingDELETE(shipmentNumber, ifMatch)

Delete Alternate Contact

Delete Alternate Contact

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentContactApi;

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

    ShipmentContactApi apiInstance = new ShipmentContactApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      apiInstance.deleteAlternateContactUsingDELETE(shipmentNumber, ifMatch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentContactApi#deleteAlternateContactUsingDELETE");
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

<a name="getAlternateContactUsingGET"></a>
# **getAlternateContactUsingGET**
> EntityModelOfContact getAlternateContactUsingGET(shipmentNumber)

Get Alternate Contact

Get Alternate Contact

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentContactApi;

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

    ShipmentContactApi apiInstance = new ShipmentContactApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      EntityModelOfContact result = apiInstance.getAlternateContactUsingGET(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentContactApi#getAlternateContactUsingGET");
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

<a name="getCustomerContactUsingGET"></a>
# **getCustomerContactUsingGET**
> EntityModelOfContact getCustomerContactUsingGET(shipmentNumber)

Get Customer Contact

Get Customer Contact

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentContactApi;

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

    ShipmentContactApi apiInstance = new ShipmentContactApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      EntityModelOfContact result = apiInstance.getCustomerContactUsingGET(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentContactApi#getCustomerContactUsingGET");
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

<a name="getDestinationContactUsingGET"></a>
# **getDestinationContactUsingGET**
> EntityModelOfContact getDestinationContactUsingGET(shipmentNumber)

Get Destination Contact

Get Destination Contact

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentContactApi;

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

    ShipmentContactApi apiInstance = new ShipmentContactApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      EntityModelOfContact result = apiInstance.getDestinationContactUsingGET(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentContactApi#getDestinationContactUsingGET");
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

<a name="updateAlternateContactUsingPUT"></a>
# **updateAlternateContactUsingPUT**
> EntityModelOfContact updateAlternateContactUsingPUT(shipmentNumber, ifMatch, updateContactRequest)

Update Alternate Contact

Update Alternate Contact

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentContactApi;

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

    ShipmentContactApi apiInstance = new ShipmentContactApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    UpdateContactRequest updateContactRequest = new UpdateContactRequest(); // UpdateContactRequest | 
    try {
      EntityModelOfContact result = apiInstance.updateAlternateContactUsingPUT(shipmentNumber, ifMatch, updateContactRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentContactApi#updateAlternateContactUsingPUT");
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
| **updateContactRequest** | [**UpdateContactRequest**](UpdateContactRequest.md)|  | [optional] |

### Return type

[**EntityModelOfContact**](EntityModelOfContact.md)

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

<a name="updateCustomerContactUsingPUT"></a>
# **updateCustomerContactUsingPUT**
> EntityModelOfContact updateCustomerContactUsingPUT(shipmentNumber, ifMatch, updateContactRequest)

Update Customer Contact

Update Customer Contact

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentContactApi;

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

    ShipmentContactApi apiInstance = new ShipmentContactApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    UpdateContactRequest updateContactRequest = new UpdateContactRequest(); // UpdateContactRequest | 
    try {
      EntityModelOfContact result = apiInstance.updateCustomerContactUsingPUT(shipmentNumber, ifMatch, updateContactRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentContactApi#updateCustomerContactUsingPUT");
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
| **updateContactRequest** | [**UpdateContactRequest**](UpdateContactRequest.md)|  | [optional] |

### Return type

[**EntityModelOfContact**](EntityModelOfContact.md)

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

<a name="updateDestinationContactUsingPUT"></a>
# **updateDestinationContactUsingPUT**
> EntityModelOfContact updateDestinationContactUsingPUT(shipmentNumber, ifMatch, updateContactRequest)

Update Destination Contact

Update Destination Contact

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentContactApi;

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

    ShipmentContactApi apiInstance = new ShipmentContactApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    UpdateContactRequest updateContactRequest = new UpdateContactRequest(); // UpdateContactRequest | 
    try {
      EntityModelOfContact result = apiInstance.updateDestinationContactUsingPUT(shipmentNumber, ifMatch, updateContactRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentContactApi#updateDestinationContactUsingPUT");
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
| **updateContactRequest** | [**UpdateContactRequest**](UpdateContactRequest.md)|  | [optional] |

### Return type

[**EntityModelOfContact**](EntityModelOfContact.md)

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

