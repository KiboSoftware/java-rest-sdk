# PaymentInvoiceManagementApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPaymentInvoice**](PaymentInvoiceManagementApi.md#createPaymentInvoice) | **POST** /commerce/shipments/{shipmentNumber}/invoice | Create a payment invoice |
| [**deletePaymentInvoice**](PaymentInvoiceManagementApi.md#deletePaymentInvoice) | **DELETE** /commerce/shipments/{shipmentNumber}/invoice | Delete payment invoice |
| [**getPaymentInvoice**](PaymentInvoiceManagementApi.md#getPaymentInvoice) | **GET** /commerce/shipments/{shipmentNumber}/invoice | Get payment invoice |
| [**patchPaymentInvoice**](PaymentInvoiceManagementApi.md#patchPaymentInvoice) | **PATCH** /commerce/shipments/{shipmentNumber}/invoice | Partially update a payment invoice |
| [**updatePaymentInvoice**](PaymentInvoiceManagementApi.md#updatePaymentInvoice) | **PUT** /commerce/shipments/{shipmentNumber}/invoice | Update a payment invoice |


<a name="createPaymentInvoice"></a>
# **createPaymentInvoice**
> EntityModelOfShipment createPaymentInvoice(shipmentNumber, xVolTenant, paymentInvoice, ifMatch, xVolSite)

Create a payment invoice

Creates a payment invoice for the specified shipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PaymentInvoiceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PaymentInvoiceManagementApi apiInstance = new PaymentInvoiceManagementApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | Shipment number
    Integer xVolTenant = 56; // Integer | 
    PaymentInvoice paymentInvoice = new PaymentInvoice(); // PaymentInvoice | Payment invoice data
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.createPaymentInvoice(shipmentNumber, xVolTenant, paymentInvoice, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentInvoiceManagementApi#createPaymentInvoice");
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
| **shipmentNumber** | **Integer**| Shipment number | |
| **xVolTenant** | **Integer**|  | |
| **paymentInvoice** | [**PaymentInvoice**](PaymentInvoice.md)| Payment invoice data | |
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

<a name="deletePaymentInvoice"></a>
# **deletePaymentInvoice**
> deletePaymentInvoice(shipmentNumber, xVolTenant, ifMatch, xVolSite)

Delete payment invoice

Removes the payment invoice from the specified shipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PaymentInvoiceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PaymentInvoiceManagementApi apiInstance = new PaymentInvoiceManagementApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | Shipment number
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      apiInstance.deletePaymentInvoice(shipmentNumber, xVolTenant, ifMatch, xVolSite);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentInvoiceManagementApi#deletePaymentInvoice");
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
| **shipmentNumber** | **Integer**| Shipment number | |
| **xVolTenant** | **Integer**|  | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

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
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="getPaymentInvoice"></a>
# **getPaymentInvoice**
> EntityModelOfPaymentInvoice getPaymentInvoice(shipmentNumber, xVolTenant, xVolSite)

Get payment invoice

Retrieves the payment invoice for the specified shipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PaymentInvoiceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PaymentInvoiceManagementApi apiInstance = new PaymentInvoiceManagementApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | Shipment number
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfPaymentInvoice result = apiInstance.getPaymentInvoice(shipmentNumber, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentInvoiceManagementApi#getPaymentInvoice");
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
| **shipmentNumber** | **Integer**| Shipment number | |
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfPaymentInvoice**](EntityModelOfPaymentInvoice.md)

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

<a name="patchPaymentInvoice"></a>
# **patchPaymentInvoice**
> EntityModelOfShipment patchPaymentInvoice(shipmentNumber, xVolTenant, paymentInvoice, ifMatch, xVolSite)

Partially update a payment invoice

Partially updates the payment invoice on the specified shipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PaymentInvoiceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PaymentInvoiceManagementApi apiInstance = new PaymentInvoiceManagementApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | Shipment number
    Integer xVolTenant = 56; // Integer | 
    PaymentInvoice paymentInvoice = new PaymentInvoice(); // PaymentInvoice | Partial payment invoice data
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.patchPaymentInvoice(shipmentNumber, xVolTenant, paymentInvoice, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentInvoiceManagementApi#patchPaymentInvoice");
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
| **shipmentNumber** | **Integer**| Shipment number | |
| **xVolTenant** | **Integer**|  | |
| **paymentInvoice** | [**PaymentInvoice**](PaymentInvoice.md)| Partial payment invoice data | |
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
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="updatePaymentInvoice"></a>
# **updatePaymentInvoice**
> EntityModelOfShipment updatePaymentInvoice(shipmentNumber, xVolTenant, paymentInvoice, ifMatch, xVolSite)

Update a payment invoice

Updates the payment invoice on the specified shipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PaymentInvoiceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PaymentInvoiceManagementApi apiInstance = new PaymentInvoiceManagementApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | Shipment number
    Integer xVolTenant = 56; // Integer | 
    PaymentInvoice paymentInvoice = new PaymentInvoice(); // PaymentInvoice | Updated payment invoice data
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.updatePaymentInvoice(shipmentNumber, xVolTenant, paymentInvoice, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentInvoiceManagementApi#updatePaymentInvoice");
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
| **shipmentNumber** | **Integer**| Shipment number | |
| **xVolTenant** | **Integer**|  | |
| **paymentInvoice** | [**PaymentInvoice**](PaymentInvoice.md)| Updated payment invoice data | |
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

