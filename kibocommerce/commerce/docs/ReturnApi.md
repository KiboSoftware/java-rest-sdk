# ReturnApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**autoRefund**](ReturnApi.md#autoRefund) | **POST** /commerce/returns/{returnId}/autorefund | Attempt to automatically refund the return |
| [**createPackage**](ReturnApi.md#createPackage) | **POST** /commerce/returns/{returnId}/packages | Apply a package to the return |
| [**createPackageShipments**](ReturnApi.md#createPackageShipments) | **POST** /commerce/returns/{returnId}/shipments | Creates a shipment by grouping together multiple packages into logical shipments |
| [**createPaymentActionForReturn**](ReturnApi.md#createPaymentActionForReturn) | **POST** /commerce/returns/{returnId}/payments/actions | Create Payment Action For Return |
| [**createReturn**](ReturnApi.md#createReturn) | **POST** /commerce/returns | Create Returns |
| [**createReturnItem**](ReturnApi.md#createReturnItem) | **POST** /commerce/returns/{returnId}/items | Create Return Item |
| [**createReturnNote**](ReturnApi.md#createReturnNote) | **POST** /commerce/returns/{returnId}/notes | Create Return Note |
| [**createReturnShippingOrder**](ReturnApi.md#createReturnShippingOrder) | **POST** /commerce/returns/{returnId}/ship | Create Return Shipping Order |
| [**deleteOrderItem**](ReturnApi.md#deleteOrderItem) | **DELETE** /commerce/returns/{orderId}/items/{orderItemId} | Delete Order Item |
| [**deletePackage**](ReturnApi.md#deletePackage) | **DELETE** /commerce/returns/{returnId}/packages/{packageId} | Delete an order package |
| [**deleteReturn**](ReturnApi.md#deleteReturn) | **DELETE** /commerce/returns/{returnId} | Delete Return |
| [**deleteReturnNote**](ReturnApi.md#deleteReturnNote) | **DELETE** /commerce/returns/{returnId}/notes/{noteId} | Delete Return Note |
| [**deleteShipment**](ReturnApi.md#deleteShipment) | **DELETE** /commerce/returns/{returnId}/shipments/{shipmentId} | Deletes an existing return shipment |
| [**getAvailableReturnActions**](ReturnApi.md#getAvailableReturnActions) | **GET** /commerce/returns/{returnId}/actions | Get Available Return Actions |
| [**getPackage**](ReturnApi.md#getPackage) | **GET** /commerce/returns/{returnId}/packages/{packageId} | Get an order package |
| [**getPackageLabel**](ReturnApi.md#getPackageLabel) | **GET** /commerce/returns/{returnId}/packages/{packageId}/label | Get an order package |
| [**getPayment**](ReturnApi.md#getPayment) | **GET** /commerce/returns/{returnId}/payments/{paymentId} | Get Payment |
| [**getPaymentDistribution**](ReturnApi.md#getPaymentDistribution) | **GET** /commerce/returns/{returnId}/paymentDistribution | Get Payment Distribution |
| [**getPayments**](ReturnApi.md#getPayments) | **GET** /commerce/returns/{returnId}/payments | Get Payments |
| [**getReasons**](ReturnApi.md#getReasons) | **GET** /commerce/returns/reasons | Get Reasons |
| [**getReturn**](ReturnApi.md#getReturn) | **GET** /commerce/returns/{returnId} | Get Return |
| [**getReturnItem**](ReturnApi.md#getReturnItem) | **GET** /commerce/returns/{returnId}/items/{returnItemId} | Get Return Item |
| [**getReturnItems**](ReturnApi.md#getReturnItems) | **GET** /commerce/returns/{returnId}/items | Get Return Items |
| [**getReturnLabel**](ReturnApi.md#getReturnLabel) | **GET** /commerce/returns/{returnId}/shipping/label | Get Return Label |
| [**getReturnNote**](ReturnApi.md#getReturnNote) | **GET** /commerce/returns/{returnId}/notes/{noteId} | Get Return Note |
| [**getReturnNotes**](ReturnApi.md#getReturnNotes) | **GET** /commerce/returns/{returnId}/notes | Get Return Notes |
| [**getReturns**](ReturnApi.md#getReturns) | **GET** /commerce/returns | Get Returns |
| [**getShipment**](ReturnApi.md#getShipment) | **GET** /commerce/returns/{returnId}/shipments/{shipmentId} | Allows a shipment to be retrieved for the order |
| [**performPaymentActionForReturn**](ReturnApi.md#performPaymentActionForReturn) | **POST** /commerce/returns/{returnId}/payments/{paymentId}/actions | Perform Payment Action For Return |
| [**performReturnActions**](ReturnApi.md#performReturnActions) | **POST** /commerce/returns/actions | Delete Return |
| [**resendReturnEmail**](ReturnApi.md#resendReturnEmail) | **PUT** /commerce/returns/email/resend | Resend Return Email |
| [**restockReturnItems**](ReturnApi.md#restockReturnItems) | **POST** /commerce/returns/{returnId}/restock | Restock Return Items |
| [**updatePackage**](ReturnApi.md#updatePackage) | **PUT** /commerce/returns/{returnId}/packages/{packageId} | Delete an order package |
| [**updateReturn**](ReturnApi.md#updateReturn) | **PUT** /commerce/returns/{returnId} | Get Reasons |
| [**updateReturnNote**](ReturnApi.md#updateReturnNote) | **PUT** /commerce/returns/{returnId}/notes/{noteId} | Update Return Note |


<a name="autoRefund"></a>
# **autoRefund**
> ModelReturn autoRefund(returnId, autoRefundRequest)

Attempt to automatically refund the return

Attempt to automatically refund the return

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Return Id
    List<AutoRefundRequest> autoRefundRequest = Arrays.asList(); // List<AutoRefundRequest> | List of return item id with proccessing fee
    try {
      ModelReturn result = apiInstance.autoRefund(returnId, autoRefundRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#autoRefund");
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
| **returnId** | **String**| Return Id | |
| **autoRefundRequest** | [**List&lt;AutoRefundRequest&gt;**](AutoRefundRequest.md)| List of return item id with proccessing fee | [optional] |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createPackage"></a>
# **createPackage**
> CommerceRuntimePackage createPackage(returnId, commerceRuntimePackage)

Apply a package to the return

 package?

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return with which to associate the package.
    CommerceRuntimePackage commerceRuntimePackage = new CommerceRuntimePackage(); // CommerceRuntimePackage | Package to create and add to the return
    try {
      CommerceRuntimePackage result = apiInstance.createPackage(returnId, commerceRuntimePackage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#createPackage");
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
| **returnId** | **String**| Unique identifier of the return with which to associate the package. | |
| **commerceRuntimePackage** | [**CommerceRuntimePackage**](CommerceRuntimePackage.md)| Package to create and add to the return | [optional] |

### Return type

[**CommerceRuntimePackage**](CommerceRuntimePackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createPackageShipments"></a>
# **createPackageShipments**
> List&lt;CommerceRuntimePackage&gt; createPackageShipments(returnId, requestBody)

Creates a shipment by grouping together multiple packages into logical shipments



### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the order which is ready to be shipped.
    List<String> requestBody = Arrays.asList(); // List<String> | Package ids to use in creating shipments.
    try {
      List<CommerceRuntimePackage> result = apiInstance.createPackageShipments(returnId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#createPackageShipments");
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
| **returnId** | **String**| Unique identifier of the order which is ready to be shipped. | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| Package ids to use in creating shipments. | [optional] |

### Return type

[**List&lt;CommerceRuntimePackage&gt;**](CommerceRuntimePackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createPaymentActionForReturn"></a>
# **createPaymentActionForReturn**
> ModelReturn createPaymentActionForReturn(returnId, paymentAction)

Create Payment Action For Return

Sets the action of the specified payment transaction interaction. Available actions depend on the current status of the payment transaction.If in doubt, get a list of available payment actions first.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | 
    PaymentAction paymentAction = new PaymentAction(); // PaymentAction | Action to specify. Possible actions can be \"Create,\" \"Capture,\" \"Void,\" \"AuthCapture,\" or \"ReceiveCheck.\"
    try {
      ModelReturn result = apiInstance.createPaymentActionForReturn(returnId, paymentAction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#createPaymentActionForReturn");
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
| **returnId** | **String**|  | |
| **paymentAction** | [**PaymentAction**](PaymentAction.md)| Action to specify. Possible actions can be \&quot;Create,\&quot; \&quot;Capture,\&quot; \&quot;Void,\&quot; \&quot;AuthCapture,\&quot; or \&quot;ReceiveCheck.\&quot; | [optional] |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createReturn"></a>
# **createReturn**
> ModelReturn createReturn(modelReturn)

Create Returns

Creates a new Return for an order or product list.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    ModelReturn modelReturn = new ModelReturn(); // ModelReturn | 
    try {
      ModelReturn result = apiInstance.createReturn(modelReturn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#createReturn");
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
| **modelReturn** | [**ModelReturn**](ModelReturn.md)|  | [optional] |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createReturnItem"></a>
# **createReturnItem**
> ModelReturn createReturnItem(returnId, returnItem)

Create Return Item

Adds a return item to the return.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | ID of the order to add an item to.
    ReturnItem returnItem = new ReturnItem(); // ReturnItem | All properties of the new return item.
    try {
      ModelReturn result = apiInstance.createReturnItem(returnId, returnItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#createReturnItem");
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
| **returnId** | **String**| ID of the order to add an item to. | |
| **returnItem** | [**ReturnItem**](ReturnItem.md)| All properties of the new return item. | [optional] |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createReturnNote"></a>
# **createReturnNote**
> OrderNote createReturnNote(returnId, orderNote)

Create Return Note

Adds a note to the return. This is an internal note that the merchant might want to add to a return. This note is visible in Admin for customer service representatives to see.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return to which you want to add a note.
    OrderNote orderNote = new OrderNote(); // OrderNote | Text of the note. Maximum 256 characters.
    try {
      OrderNote result = apiInstance.createReturnNote(returnId, orderNote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#createReturnNote");
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
| **returnId** | **String**| Unique identifier of the return to which you want to add a note. | |
| **orderNote** | [**OrderNote**](OrderNote.md)| Text of the note. Maximum 256 characters. | [optional] |

### Return type

[**OrderNote**](OrderNote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createReturnShippingOrder"></a>
# **createReturnShippingOrder**
> Order createReturnShippingOrder(returnId, returnItemSpecifier)

Create Return Shipping Order

Creates a child order for the return for processing replacments. The request body (a collection of ReturnItemSpecifier) is optional. If the body is empty, the operation replaces all remaining items marked for replace. If you want to replace only a specific item(s) marked for return, you must specify the item(s) in the request body.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | The ID of the parent return
    List<ReturnItemSpecifier> returnItemSpecifier = Arrays.asList(); // List<ReturnItemSpecifier> | Optionally specify which items to include and in what quantities
    try {
      Order result = apiInstance.createReturnShippingOrder(returnId, returnItemSpecifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#createReturnShippingOrder");
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
| **returnId** | **String**| The ID of the parent return | |
| **returnItemSpecifier** | [**List&lt;ReturnItemSpecifier&gt;**](ReturnItemSpecifier.md)| Optionally specify which items to include and in what quantities | [optional] |

### Return type

[**Order**](Order.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteOrderItem"></a>
# **deleteOrderItem**
> ModelReturn deleteOrderItem(orderId, orderItemId, returnId, returnItemId)

Delete Order Item

Removes a particular return item from the return of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String orderItemId = "orderItemId_example"; // String | 
    String returnId = "returnId_example"; // String | 
    String returnItemId = "returnItemId_example"; // String | Unique identifier of the order item.
    try {
      ModelReturn result = apiInstance.deleteOrderItem(orderId, orderItemId, returnId, returnItemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#deleteOrderItem");
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
| **orderId** | **String**|  | |
| **orderItemId** | **String**|  | |
| **returnId** | **String**|  | [optional] |
| **returnItemId** | **String**| Unique identifier of the order item. | [optional] |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deletePackage"></a>
# **deletePackage**
> deletePackage(returnId, packageId)

Delete an order package



### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return with which to associate the package.
    String packageId = "packageId_example"; // String | Package to remove from the return
    try {
      apiInstance.deletePackage(returnId, packageId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#deletePackage");
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
| **returnId** | **String**| Unique identifier of the return with which to associate the package. | |
| **packageId** | **String**| Package to remove from the return | |

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
| **200** | Success |  -  |

<a name="deleteReturn"></a>
# **deleteReturn**
> deleteReturn(returnId)

Delete Return

Deletes a return specified by return Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | 
    try {
      apiInstance.deleteReturn(returnId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#deleteReturn");
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
| **returnId** | **String**|  | |

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
| **200** | Success |  -  |

<a name="deleteReturnNote"></a>
# **deleteReturnNote**
> deleteReturnNote(returnId, noteId)

Delete Return Note

Deletes a specific note on a return.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return whose note you want to delete.
    String noteId = "noteId_example"; // String | Unique identifier of the note whose text you want to delete.
    try {
      apiInstance.deleteReturnNote(returnId, noteId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#deleteReturnNote");
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
| **returnId** | **String**| Unique identifier of the return whose note you want to delete. | |
| **noteId** | **String**| Unique identifier of the note whose text you want to delete. | |

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
| **200** | Success |  -  |

<a name="deleteShipment"></a>
# **deleteShipment**
> deleteShipment(returnId, shipmentId)

Deletes an existing return shipment

Deletes an existing return shipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | ID of the return
    String shipmentId = "shipmentId_example"; // String | Shipment ID of the return.
    try {
      apiInstance.deleteShipment(returnId, shipmentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#deleteShipment");
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
| **returnId** | **String**| ID of the return | |
| **shipmentId** | **String**| Shipment ID of the return. | |

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
| **200** | Success |  -  |

<a name="getAvailableReturnActions"></a>
# **getAvailableReturnActions**
> List&lt;String&gt; getAvailableReturnActions(returnId)

Get Available Return Actions

Gets all the available actions on the return specified by return Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | 
    try {
      List<String> result = apiInstance.getAvailableReturnActions(returnId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getAvailableReturnActions");
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
| **returnId** | **String**|  | |

### Return type

**List&lt;String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPackage"></a>
# **getPackage**
> CommerceRuntimePackage getPackage(returnId, packageId)

Get an order package

Get an order package

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return with which to associate the package.
    String packageId = "packageId_example"; // String | Package to remove from the return
    try {
      CommerceRuntimePackage result = apiInstance.getPackage(returnId, packageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getPackage");
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
| **returnId** | **String**| Unique identifier of the return with which to associate the package. | |
| **packageId** | **String**| Package to remove from the return | |

### Return type

[**CommerceRuntimePackage**](CommerceRuntimePackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPackageLabel"></a>
# **getPackageLabel**
> getPackageLabel(returnId, packageId, returnAsBase64Png)

Get an order package

Get an order package

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return with which to associate the package.
    String packageId = "packageId_example"; // String | Package to remove from the return
    Boolean returnAsBase64Png = true; // Boolean | Return as base64 png
    try {
      apiInstance.getPackageLabel(returnId, packageId, returnAsBase64Png);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getPackageLabel");
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
| **returnId** | **String**| Unique identifier of the return with which to associate the package. | |
| **packageId** | **String**| Package to remove from the return | |
| **returnAsBase64Png** | **Boolean**| Return as base64 png | [optional] |

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
| **200** | Success |  -  |

<a name="getPayment"></a>
# **getPayment**
> Payment getPayment(returnId, paymentId)

Get Payment

Gets specific payment on the return specified by return Id and payment Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | 
    String paymentId = "paymentId_example"; // String | 
    try {
      Payment result = apiInstance.getPayment(returnId, paymentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getPayment");
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
| **returnId** | **String**|  | |
| **paymentId** | **String**|  | |

### Return type

[**Payment**](Payment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPaymentDistribution"></a>
# **getPaymentDistribution**
> ReturnRefundDetails getPaymentDistribution(returnId)

Get Payment Distribution

Get Payment Distribution

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Return Id
    try {
      ReturnRefundDetails result = apiInstance.getPaymentDistribution(returnId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getPaymentDistribution");
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
| **returnId** | **String**| Return Id | |

### Return type

[**ReturnRefundDetails**](ReturnRefundDetails.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPayments"></a>
# **getPayments**
> PaymentCollection getPayments(returnId)

Get Payments

Gets payments on the return specified by return Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | 
    try {
      PaymentCollection result = apiInstance.getPayments(returnId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getPayments");
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
| **returnId** | **String**|  | |

### Return type

[**PaymentCollection**](PaymentCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getReasons"></a>
# **getReasons**
> ReasonCollection getReasons()

Get Reasons

Gets all the return reasons.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    try {
      ReasonCollection result = apiInstance.getReasons();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getReasons");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReasonCollection**](ReasonCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getReturn"></a>
# **getReturn**
> ModelReturn getReturn(returnId)

Get Return

Allows for retrieval for a return given only the return Id.  Further manipulation of that returns must be done off of the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | 
    try {
      ModelReturn result = apiInstance.getReturn(returnId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getReturn");
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
| **returnId** | **String**|  | |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getReturnItem"></a>
# **getReturnItem**
> ReturnItem getReturnItem(returnId, returnItemId)

Get Return Item

Retrieves the details of a single return item.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return whose item you want to get.
    String returnItemId = "returnItemId_example"; // String | Unique identifier of the return item whose details you want to get.
    try {
      ReturnItem result = apiInstance.getReturnItem(returnId, returnItemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getReturnItem");
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
| **returnId** | **String**| Unique identifier of the return whose item you want to get. | |
| **returnItemId** | **String**| Unique identifier of the return item whose details you want to get. | |

### Return type

[**ReturnItem**](ReturnItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getReturnItems"></a>
# **getReturnItems**
> ReturnItemCollection getReturnItems(returnId)

Get Return Items

Retrieves the details of all return items in an order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return whose items you want to get.
    try {
      ReturnItemCollection result = apiInstance.getReturnItems(returnId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getReturnItems");
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
| **returnId** | **String**| Unique identifier of the return whose items you want to get. | |

### Return type

[**ReturnItemCollection**](ReturnItemCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getReturnLabel"></a>
# **getReturnLabel**
> CarrierServiceGenerateLabelResponse getReturnLabel(returnId)

Get Return Label

Gets the return label specified by returnId.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | 
    try {
      CarrierServiceGenerateLabelResponse result = apiInstance.getReturnLabel(returnId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getReturnLabel");
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
| **returnId** | **String**|  | |

### Return type

[**CarrierServiceGenerateLabelResponse**](CarrierServiceGenerateLabelResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getReturnNote"></a>
# **getReturnNote**
> OrderNote getReturnNote(returnId, noteId)

Get Return Note

Retrieves a specific note from a return.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return whose note you want to get.
    String noteId = "noteId_example"; // String | Unique identifier of the note whose text you want to get.
    try {
      OrderNote result = apiInstance.getReturnNote(returnId, noteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getReturnNote");
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
| **returnId** | **String**| Unique identifier of the return whose note you want to get. | |
| **noteId** | **String**| Unique identifier of the note whose text you want to get. | |

### Return type

[**OrderNote**](OrderNote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getReturnNotes"></a>
# **getReturnNotes**
> List&lt;OrderNote&gt; getReturnNotes(returnId)

Get Return Notes

Retrieves a list of all notes for a return.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return whose notes you want to get.
    try {
      List<OrderNote> result = apiInstance.getReturnNotes(returnId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getReturnNotes");
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
| **returnId** | **String**| Unique identifier of the return whose notes you want to get. | |

### Return type

[**List&lt;OrderNote&gt;**](OrderNote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getReturns"></a>
# **getReturns**
> ReturnCollection getReturns(startIndex, pageSize, sortBy, filter, q)

Get Returns

Provides a paged, collection of returns for a Site.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 20; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String q = "q_example"; // String | 
    try {
      ReturnCollection result = apiInstance.getReturns(startIndex, pageSize, sortBy, filter, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getReturns");
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
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 20] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **q** | **String**|  | [optional] |

### Return type

[**ReturnCollection**](ReturnCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getShipment"></a>
# **getShipment**
> CommerceRuntimeShipment getShipment(returnId, shipmentId)

Allows a shipment to be retrieved for the order



### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | ID of the return
    String shipmentId = "shipmentId_example"; // String | Shipment ID of the return.
    try {
      CommerceRuntimeShipment result = apiInstance.getShipment(returnId, shipmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getShipment");
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
| **returnId** | **String**| ID of the return | |
| **shipmentId** | **String**| Shipment ID of the return. | |

### Return type

[**CommerceRuntimeShipment**](CommerceRuntimeShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="performPaymentActionForReturn"></a>
# **performPaymentActionForReturn**
> ModelReturn performPaymentActionForReturn(returnId, paymentId, paymentAction)

Perform Payment Action For Return

Sets the action of the specified payment transaction interaction. Available actions depend on the current status of the payment transaction.If in doubt, get a list of available payment actions first.  To retrieve the list of available actions, use an operation like GetAvailableReturnActions to view the actions available for the resource you are updating.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | 
    String paymentId = "paymentId_example"; // String | 
    PaymentAction paymentAction = new PaymentAction(); // PaymentAction | Action to specify. Possible actions can be \"Create,\" \"Capture,\" \"Void,\" \"AuthCapture,\" or \"ReceiveCheck.\"
    try {
      ModelReturn result = apiInstance.performPaymentActionForReturn(returnId, paymentId, paymentAction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#performPaymentActionForReturn");
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
| **returnId** | **String**|  | |
| **paymentId** | **String**|  | |
| **paymentAction** | [**PaymentAction**](PaymentAction.md)| Action to specify. Possible actions can be \&quot;Create,\&quot; \&quot;Capture,\&quot; \&quot;Void,\&quot; \&quot;AuthCapture,\&quot; or \&quot;ReceiveCheck.\&quot; | [optional] |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="performReturnActions"></a>
# **performReturnActions**
> ReturnCollection performReturnActions(returnAction)

Delete Return

Perform Return Action.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    ReturnAction returnAction = new ReturnAction(); // ReturnAction | A ReturnAction instance that takes the name of the action to be performed and a list of Return Ids upon which to perform the action.
    try {
      ReturnCollection result = apiInstance.performReturnActions(returnAction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#performReturnActions");
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
| **returnAction** | [**ReturnAction**](ReturnAction.md)| A ReturnAction instance that takes the name of the action to be performed and a list of Return Ids upon which to perform the action. | [optional] |

### Return type

[**ReturnCollection**](ReturnCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="resendReturnEmail"></a>
# **resendReturnEmail**
> resendReturnEmail(returnAction)

Resend Return Email

Resends return email.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    ReturnAction returnAction = new ReturnAction(); // ReturnAction | 
    try {
      apiInstance.resendReturnEmail(returnAction);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#resendReturnEmail");
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
| **returnAction** | [**ReturnAction**](ReturnAction.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="restockReturnItems"></a>
# **restockReturnItems**
> ModelReturn restockReturnItems(returnId, restockableReturnItem)

Restock Return Items

API to restock return item.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Return ID
    List<RestockableReturnItem> restockableReturnItem = Arrays.asList(); // List<RestockableReturnItem> | List of return items with quantity to be restocked
    try {
      ModelReturn result = apiInstance.restockReturnItems(returnId, restockableReturnItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#restockReturnItems");
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
| **returnId** | **String**| Return ID | |
| **restockableReturnItem** | [**List&lt;RestockableReturnItem&gt;**](RestockableReturnItem.md)| List of return items with quantity to be restocked | [optional] |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updatePackage"></a>
# **updatePackage**
> CommerceRuntimePackage updatePackage(returnId, packageId, commerceRuntimePackage)

Delete an order package



### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return with which to associate the package.
    String packageId = "packageId_example"; // String | Package to update on the return
    CommerceRuntimePackage commerceRuntimePackage = new CommerceRuntimePackage(); // CommerceRuntimePackage | Package content to update on the return
    try {
      CommerceRuntimePackage result = apiInstance.updatePackage(returnId, packageId, commerceRuntimePackage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#updatePackage");
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
| **returnId** | **String**| Unique identifier of the return with which to associate the package. | |
| **packageId** | **String**| Package to update on the return | |
| **commerceRuntimePackage** | [**CommerceRuntimePackage**](CommerceRuntimePackage.md)| Package content to update on the return | [optional] |

### Return type

[**CommerceRuntimePackage**](CommerceRuntimePackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateReturn"></a>
# **updateReturn**
> ModelReturn updateReturn(returnId, modelReturn)

Get Reasons

Gets all the return reasons.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | 
    ModelReturn modelReturn = new ModelReturn(); // ModelReturn | 
    try {
      ModelReturn result = apiInstance.updateReturn(returnId, modelReturn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#updateReturn");
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
| **returnId** | **String**|  | |
| **modelReturn** | [**ModelReturn**](ModelReturn.md)|  | [optional] |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateReturnNote"></a>
# **updateReturnNote**
> OrderNote updateReturnNote(returnId, noteId, orderNote)

Update Return Note

Updates a specific note for a return.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReturnApi;

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return whose note you want to update.
    String noteId = "noteId_example"; // String | Unique identifier of the note whose text you want to update.
    OrderNote orderNote = new OrderNote(); // OrderNote | Text of the note.
    try {
      OrderNote result = apiInstance.updateReturnNote(returnId, noteId, orderNote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#updateReturnNote");
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
| **returnId** | **String**| Unique identifier of the return whose note you want to update. | |
| **noteId** | **String**| Unique identifier of the note whose text you want to update. | |
| **orderNote** | [**OrderNote**](OrderNote.md)| Text of the note. | [optional] |

### Return type

[**OrderNote**](OrderNote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

