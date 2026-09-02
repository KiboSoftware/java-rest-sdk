# ReturnApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**autoRefund**](ReturnApi.md#autoRefund) | **POST** /commerce/returns/{returnId}/autorefund | Auto Refund Return |
| [**createPackage**](ReturnApi.md#createPackage) | **POST** /commerce/returns/{returnId}/packages | Add Package to Return |
| [**createPackageShipments**](ReturnApi.md#createPackageShipments) | **POST** /commerce/returns/{returnId}/shipments | Create Return Shipment |
| [**createPaymentActionForReturn**](ReturnApi.md#createPaymentActionForReturn) | **POST** /commerce/returns/{returnId}/payments/actions | Create Payment Action For Return |
| [**createReturn**](ReturnApi.md#createReturn) | **POST** /commerce/returns | Create Returns |
| [**createReturnAttributes**](ReturnApi.md#createReturnAttributes) | **POST** /commerce/returns/{returnId}/attributes | Create Return Attributes |
| [**createReturnItem**](ReturnApi.md#createReturnItem) | **POST** /commerce/returns/{returnId}/items | Create Return Item |
| [**createReturnItemAttributes**](ReturnApi.md#createReturnItemAttributes) | **POST** /commerce/returns/{returnId}/items/{returnItemId}/attributes | Create Return Item Attributes |
| [**createReturnNote**](ReturnApi.md#createReturnNote) | **POST** /commerce/returns/{returnId}/notes | Create Return Note |
| [**createReturnShippingOrder**](ReturnApi.md#createReturnShippingOrder) | **POST** /commerce/returns/{returnId}/ship | Create Return Shipping Order |
| [**deleteOrderItem**](ReturnApi.md#deleteOrderItem) | **DELETE** /commerce/returns/{orderId}/items/{orderItemId} | Delete Order Item |
| [**deletePackage**](ReturnApi.md#deletePackage) | **DELETE** /commerce/returns/{returnId}/packages/{packageId} | Delete Return Package |
| [**deleteReturn**](ReturnApi.md#deleteReturn) | **DELETE** /commerce/returns/{returnId} | Delete Return |
| [**deleteReturnNote**](ReturnApi.md#deleteReturnNote) | **DELETE** /commerce/returns/{returnId}/notes/{noteId} | Delete Return Note |
| [**deleteShipment**](ReturnApi.md#deleteShipment) | **DELETE** /commerce/returns/{returnId}/shipments/{shipmentId} | Delete Return Shipment |
| [**disposeReturnItems**](ReturnApi.md#disposeReturnItems) | **POST** /commerce/returns/{returnId}/disposition | Dispose Return Items |
| [**getAvailableReturnActions**](ReturnApi.md#getAvailableReturnActions) | **GET** /commerce/returns/{returnId}/actions | Get Available Return Actions |
| [**getPackage**](ReturnApi.md#getPackage) | **GET** /commerce/returns/{returnId}/packages/{packageId} | Get Return Package |
| [**getPackageLabel**](ReturnApi.md#getPackageLabel) | **GET** /commerce/returns/{returnId}/packages/{packageId}/label | Get Return Package Label |
| [**getPayment**](ReturnApi.md#getPayment) | **GET** /commerce/returns/{returnId}/payments/{paymentId} | Get Payment |
| [**getPaymentDistribution**](ReturnApi.md#getPaymentDistribution) | **GET** /commerce/returns/{returnId}/paymentDistribution | Get Payment Distribution |
| [**getPayments**](ReturnApi.md#getPayments) | **GET** /commerce/returns/{returnId}/payments | Get Payments |
| [**getReasons**](ReturnApi.md#getReasons) | **GET** /commerce/returns/reasons | Get Reasons |
| [**getReturn**](ReturnApi.md#getReturn) | **GET** /commerce/returns/{returnId} | Get Return |
| [**getReturnAttributes**](ReturnApi.md#getReturnAttributes) | **GET** /commerce/returns/{returnId}/attributes | Get Return Attributes |
| [**getReturnItem**](ReturnApi.md#getReturnItem) | **GET** /commerce/returns/{returnId}/items/{returnItemId} | Get Return Item |
| [**getReturnItemAttributes**](ReturnApi.md#getReturnItemAttributes) | **GET** /commerce/returns/{returnId}/items/{returnItemId}/attributes | Get Return Item Attributes |
| [**getReturnItems**](ReturnApi.md#getReturnItems) | **GET** /commerce/returns/{returnId}/items | Get Return Items |
| [**getReturnLabel**](ReturnApi.md#getReturnLabel) | **GET** /commerce/returns/{returnId}/shipping/label | Get Return Label |
| [**getReturnNote**](ReturnApi.md#getReturnNote) | **GET** /commerce/returns/{returnId}/notes/{noteId} | Get Return Note |
| [**getReturnNotes**](ReturnApi.md#getReturnNotes) | **GET** /commerce/returns/{returnId}/notes | Get Return Notes |
| [**getReturnedItemConditions**](ReturnApi.md#getReturnedItemConditions) | **GET** /commerce/returns/restock/conditions | Get Item Conditions |
| [**getReturns**](ReturnApi.md#getReturns) | **GET** /commerce/returns | Get Returns |
| [**getShipment**](ReturnApi.md#getShipment) | **GET** /commerce/returns/{returnId}/shipments/{shipmentId} | Get Return Shipment |
| [**performPaymentActionForReturn**](ReturnApi.md#performPaymentActionForReturn) | **POST** /commerce/returns/{returnId}/payments/{paymentId}/actions | Perform Payment Action For Return |
| [**performReturnActions**](ReturnApi.md#performReturnActions) | **POST** /commerce/returns/actions | Perform Return Action |
| [**resendReturnEmail**](ReturnApi.md#resendReturnEmail) | **PUT** /commerce/returns/email/resend | Resend Return Email |
| [**restockReturnItems**](ReturnApi.md#restockReturnItems) | **POST** /commerce/returns/{returnId}/restock | Restock Return Items |
| [**updatePackage**](ReturnApi.md#updatePackage) | **PUT** /commerce/returns/{returnId}/packages/{packageId} | Update Return Package |
| [**updateReturn**](ReturnApi.md#updateReturn) | **PUT** /commerce/returns/{returnId} | Update Return |
| [**updateReturnAttributes**](ReturnApi.md#updateReturnAttributes) | **PUT** /commerce/returns/{returnId}/attributes | Update Return Attributes |
| [**updateReturnItemAttributes**](ReturnApi.md#updateReturnItemAttributes) | **PUT** /commerce/returns/{returnId}/items/{returnItemId}/attributes | Update Return Item Attributes |
| [**updateReturnNote**](ReturnApi.md#updateReturnNote) | **PUT** /commerce/returns/{returnId}/notes/{noteId} | Update Return Note |


<a name="autoRefund"></a>
# **autoRefund**
> ModelReturn autoRefund(returnId, responseFields, autoRefundRequest)

Auto Refund Return

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Return Id
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<AutoRefundRequest> autoRefundRequest = Arrays.asList(); // List<AutoRefundRequest> | List of return item id with proccessing fee
    try {
      ModelReturn result = apiInstance.autoRefund(returnId, responseFields, autoRefundRequest);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **autoRefundRequest** | [**List&lt;AutoRefundRequest&gt;**](AutoRefundRequest.md)| List of return item id with proccessing fee | [optional] |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createPackage"></a>
# **createPackage**
> CommerceRuntimePackage createPackage(returnId, responseFields, commerceRuntimePackage)

Add Package to Return

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return with which to associate the package.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CommerceRuntimePackage commerceRuntimePackage = new CommerceRuntimePackage(); // CommerceRuntimePackage | Package to create and add to the return
    try {
      CommerceRuntimePackage result = apiInstance.createPackage(returnId, responseFields, commerceRuntimePackage);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **commerceRuntimePackage** | [**CommerceRuntimePackage**](CommerceRuntimePackage.md)| Package to create and add to the return | [optional] |

### Return type

[**CommerceRuntimePackage**](CommerceRuntimePackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createPackageShipments"></a>
# **createPackageShipments**
> List&lt;CommerceRuntimePackage&gt; createPackageShipments(returnId, responseFields, requestBody)

Create Return Shipment

Creates a shipment by grouping together multiple packages into logical shipments.

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the order which is ready to be shipped.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<String> requestBody = Arrays.asList(); // List<String> | Package ids to use in creating shipments.
    try {
      List<CommerceRuntimePackage> result = apiInstance.createPackageShipments(returnId, responseFields, requestBody);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **requestBody** | [**List&lt;String&gt;**](String.md)| Package ids to use in creating shipments. | [optional] |

### Return type

[**List&lt;CommerceRuntimePackage&gt;**](CommerceRuntimePackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createPaymentActionForReturn"></a>
# **createPaymentActionForReturn**
> ModelReturn createPaymentActionForReturn(returnId, responseFields, paymentAction)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PaymentAction paymentAction = new PaymentAction(); // PaymentAction | Action to specify. Possible actions can be \"Create,\" \"Capture,\" \"Void,\" \"AuthCapture,\" or \"ReceiveCheck.\"
    try {
      ModelReturn result = apiInstance.createPaymentActionForReturn(returnId, responseFields, paymentAction);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **paymentAction** | [**PaymentAction**](PaymentAction.md)| Action to specify. Possible actions can be \&quot;Create,\&quot; \&quot;Capture,\&quot; \&quot;Void,\&quot; \&quot;AuthCapture,\&quot; or \&quot;ReceiveCheck.\&quot; | [optional] |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createReturn"></a>
# **createReturn**
> ModelReturn createReturn(responseFields, modelReturn)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ModelReturn modelReturn = new ModelReturn(); // ModelReturn | 
    try {
      ModelReturn result = apiInstance.createReturn(responseFields, modelReturn);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **modelReturn** | [**ModelReturn**](ModelReturn.md)|  | [optional] |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createReturnAttributes"></a>
# **createReturnAttributes**
> List&lt;ReturnAttribute&gt; createReturnAttributes(returnId, responseFields, returnAttribute)

Create Return Attributes

Adds an attributeSet to the return. This is an internal attributeSet that the merchant might want to add to a return.

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return to which you want to add an attributeSet.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ReturnAttribute> returnAttribute = Arrays.asList(); // List<ReturnAttribute> | Attributes to upsert.
    try {
      List<ReturnAttribute> result = apiInstance.createReturnAttributes(returnId, responseFields, returnAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#createReturnAttributes");
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
| **returnId** | **String**| Unique identifier of the return to which you want to add an attributeSet. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **returnAttribute** | [**List&lt;ReturnAttribute&gt;**](ReturnAttribute.md)| Attributes to upsert. | [optional] |

### Return type

[**List&lt;ReturnAttribute&gt;**](ReturnAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createReturnItem"></a>
# **createReturnItem**
> ModelReturn createReturnItem(returnId, responseFields, returnItem)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | ID of the order to add an item to.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ReturnItem returnItem = new ReturnItem(); // ReturnItem | All properties of the new return item.
    try {
      ModelReturn result = apiInstance.createReturnItem(returnId, responseFields, returnItem);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **returnItem** | [**ReturnItem**](ReturnItem.md)| All properties of the new return item. | [optional] |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createReturnItemAttributes"></a>
# **createReturnItemAttributes**
> List&lt;ReturnAttribute&gt; createReturnItemAttributes(returnId, returnItemId, responseFields, returnAttribute)

Create Return Item Attributes

Adds attributes to the return item. This is an internal attribute that the merchant might want to add to a return item.

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return.
    String returnItemId = "returnItemId_example"; // String | Unique identifier of the return item to which you want to add attributes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ReturnAttribute> returnAttribute = Arrays.asList(); // List<ReturnAttribute> | Attributes to upsert.
    try {
      List<ReturnAttribute> result = apiInstance.createReturnItemAttributes(returnId, returnItemId, responseFields, returnAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#createReturnItemAttributes");
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
| **returnId** | **String**| Unique identifier of the return. | |
| **returnItemId** | **String**| Unique identifier of the return item to which you want to add attributes. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **returnAttribute** | [**List&lt;ReturnAttribute&gt;**](ReturnAttribute.md)| Attributes to upsert. | [optional] |

### Return type

[**List&lt;ReturnAttribute&gt;**](ReturnAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createReturnNote"></a>
# **createReturnNote**
> OrderNote createReturnNote(returnId, responseFields, orderNote)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return to which you want to add a note.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    OrderNote orderNote = new OrderNote(); // OrderNote | Text of the note. Maximum 256 characters.
    try {
      OrderNote result = apiInstance.createReturnNote(returnId, responseFields, orderNote);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **orderNote** | [**OrderNote**](OrderNote.md)| Text of the note. Maximum 256 characters. | [optional] |

### Return type

[**OrderNote**](OrderNote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createReturnShippingOrder"></a>
# **createReturnShippingOrder**
> Order createReturnShippingOrder(returnId, responseFields, returnItemSpecifier)

Create Return Shipping Order

Creates a child order for the return for processing replacements. The request body (a collection of ReturnItemSpecifier) is optional. If the body is empty, the operation replaces all remaining items marked for replace. If you want to replace only a specific item(s) marked for return, you must specify the item(s) in the request body.

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | The ID of the parent return
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ReturnItemSpecifier> returnItemSpecifier = Arrays.asList(); // List<ReturnItemSpecifier> | Optionally specify which items to include and in what quantities
    try {
      Order result = apiInstance.createReturnShippingOrder(returnId, responseFields, returnItemSpecifier);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **returnItemSpecifier** | [**List&lt;ReturnItemSpecifier&gt;**](ReturnItemSpecifier.md)| Optionally specify which items to include and in what quantities | [optional] |

### Return type

[**Order**](Order.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deletePackage"></a>
# **deletePackage**
> deletePackage(returnId, packageId)

Delete Return Package

Delete a package from the return.

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteShipment"></a>
# **deleteShipment**
> deleteShipment(returnId, shipmentId)

Delete Return Shipment

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="disposeReturnItems"></a>
# **disposeReturnItems**
> ModelReturn disposeReturnItems(returnId, responseFields, disposeReturnItem)

Dispose Return Items

Restock &lt;a href&#x3D;\&quot;/pages/receive-a-return#with-reverse-logistics\&quot;&gt;return items at a disposition location&lt;/a&gt;.

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Return ID
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<DisposeReturnItem> disposeReturnItem = Arrays.asList(); // List<DisposeReturnItem> | List of return items with quantity to be disposed
    try {
      ModelReturn result = apiInstance.disposeReturnItems(returnId, responseFields, disposeReturnItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#disposeReturnItems");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **disposeReturnItem** | [**List&lt;DisposeReturnItem&gt;**](DisposeReturnItem.md)| List of return items with quantity to be disposed | [optional] |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAvailableReturnActions"></a>
# **getAvailableReturnActions**
> List&lt;String&gt; getAvailableReturnActions(returnId, responseFields)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<String> result = apiInstance.getAvailableReturnActions(returnId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPackage"></a>
# **getPackage**
> CommerceRuntimePackage getPackage(returnId, packageId, responseFields)

Get Return Package

Get an return package.

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return with which to associate the package.
    String packageId = "packageId_example"; // String | Package to remove from the return
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CommerceRuntimePackage result = apiInstance.getPackage(returnId, packageId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CommerceRuntimePackage**](CommerceRuntimePackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPackageLabel"></a>
# **getPackageLabel**
> getPackageLabel(returnId, packageId, returnAsBase64Png, responseFields)

Get Return Package Label

Get a return package label

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return with which to associate the package.
    String packageId = "packageId_example"; // String | Package to remove from the return
    Boolean returnAsBase64Png = true; // Boolean | Return as base64 png
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.getPackageLabel(returnId, packageId, returnAsBase64Png, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPayment"></a>
# **getPayment**
> Payment getPayment(returnId, paymentId, responseFields)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | 
    String paymentId = "paymentId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Payment result = apiInstance.getPayment(returnId, paymentId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Payment**](Payment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPaymentDistribution"></a>
# **getPaymentDistribution**
> ReturnRefundDetails getPaymentDistribution(returnId, responseFields)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Return Id
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReturnRefundDetails result = apiInstance.getPaymentDistribution(returnId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ReturnRefundDetails**](ReturnRefundDetails.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPayments"></a>
# **getPayments**
> PaymentCollection getPayments(returnId, responseFields)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PaymentCollection result = apiInstance.getPayments(returnId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PaymentCollection**](PaymentCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReasons"></a>
# **getReasons**
> ReasonCollection getReasons(responseFields)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReasonCollection result = apiInstance.getReasons(responseFields);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ReasonCollection**](ReasonCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReturn"></a>
# **getReturn**
> ModelReturn getReturn(returnId, responseFields)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ModelReturn result = apiInstance.getReturn(returnId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReturnAttributes"></a>
# **getReturnAttributes**
> List&lt;ReturnAttribute&gt; getReturnAttributes(returnId, responseFields)

Get Return Attributes

Retrieves a list of all attribute sets for a return.

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return whose attributeSets you want to get.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ReturnAttribute> result = apiInstance.getReturnAttributes(returnId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getReturnAttributes");
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
| **returnId** | **String**| Unique identifier of the return whose attributeSets you want to get. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;ReturnAttribute&gt;**](ReturnAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReturnItem"></a>
# **getReturnItem**
> ReturnItem getReturnItem(returnId, returnItemId, responseFields)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return whose item you want to get.
    String returnItemId = "returnItemId_example"; // String | Unique identifier of the return item whose details you want to get.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReturnItem result = apiInstance.getReturnItem(returnId, returnItemId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ReturnItem**](ReturnItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReturnItemAttributes"></a>
# **getReturnItemAttributes**
> List&lt;ReturnAttribute&gt; getReturnItemAttributes(returnId, returnItemId, responseFields)

Get Return Item Attributes

Retrieves a list of all attributes for a return item.

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return.
    String returnItemId = "returnItemId_example"; // String | Unique identifier of the return item whose attributes you want to get.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ReturnAttribute> result = apiInstance.getReturnItemAttributes(returnId, returnItemId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getReturnItemAttributes");
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
| **returnId** | **String**| Unique identifier of the return. | |
| **returnItemId** | **String**| Unique identifier of the return item whose attributes you want to get. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;ReturnAttribute&gt;**](ReturnAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReturnItems"></a>
# **getReturnItems**
> ReturnItemCollection getReturnItems(returnId, responseFields)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return whose items you want to get.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReturnItemCollection result = apiInstance.getReturnItems(returnId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ReturnItemCollection**](ReturnItemCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReturnLabel"></a>
# **getReturnLabel**
> CommerceRuntimeShipmentResponse getReturnLabel(returnId, responseFields)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CommerceRuntimeShipmentResponse result = apiInstance.getReturnLabel(returnId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CommerceRuntimeShipmentResponse**](CommerceRuntimeShipmentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReturnNote"></a>
# **getReturnNote**
> OrderNote getReturnNote(returnId, noteId, responseFields)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return whose note you want to get.
    String noteId = "noteId_example"; // String | Unique identifier of the note whose text you want to get.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      OrderNote result = apiInstance.getReturnNote(returnId, noteId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**OrderNote**](OrderNote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReturnNotes"></a>
# **getReturnNotes**
> List&lt;OrderNote&gt; getReturnNotes(returnId, responseFields)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return whose notes you want to get.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<OrderNote> result = apiInstance.getReturnNotes(returnId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;OrderNote&gt;**](OrderNote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReturnedItemConditions"></a>
# **getReturnedItemConditions**
> ReasonCollection getReturnedItemConditions(responseFields)

Get Item Conditions

Gets the item conditions for the returns

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReasonCollection result = apiInstance.getReturnedItemConditions(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#getReturnedItemConditions");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ReasonCollection**](ReasonCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReturns"></a>
# **getReturns**
> ReturnCollection getReturns(startIndex, pageSize, sortBy, filter, q, responseFields)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 20; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String q = "q_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReturnCollection result = apiInstance.getReturns(startIndex, pageSize, sortBy, filter, q, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ReturnCollection**](ReturnCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getShipment"></a>
# **getShipment**
> Shipment getShipment(returnId, shipmentId, responseFields)

Get Return Shipment

Retrieves a return shipment

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | ID of the return
    String shipmentId = "shipmentId_example"; // String | Shipment ID of the return.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Shipment result = apiInstance.getShipment(returnId, shipmentId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Shipment**](Shipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="performPaymentActionForReturn"></a>
# **performPaymentActionForReturn**
> ModelReturn performPaymentActionForReturn(returnId, paymentId, responseFields, paymentAction)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | 
    String paymentId = "paymentId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PaymentAction paymentAction = new PaymentAction(); // PaymentAction | Action to specify. Possible actions can be \"Create,\" \"Capture,\" \"Void,\" \"AuthCapture,\" or \"ReceiveCheck.\"
    try {
      ModelReturn result = apiInstance.performPaymentActionForReturn(returnId, paymentId, responseFields, paymentAction);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **paymentAction** | [**PaymentAction**](PaymentAction.md)| Action to specify. Possible actions can be \&quot;Create,\&quot; \&quot;Capture,\&quot; \&quot;Void,\&quot; \&quot;AuthCapture,\&quot; or \&quot;ReceiveCheck.\&quot; | [optional] |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="performReturnActions"></a>
# **performReturnActions**
> ReturnCollection performReturnActions(responseFields, returnAction)

Perform Return Action

Performs a specified action on one or more returns.

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ReturnAction returnAction = new ReturnAction(); // ReturnAction | A ReturnAction instance that takes the name of the action to be performed and a list of Return Ids upon which to perform the action.
    try {
      ReturnCollection result = apiInstance.performReturnActions(responseFields, returnAction);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **returnAction** | [**ReturnAction**](ReturnAction.md)| A ReturnAction instance that takes the name of the action to be performed and a list of Return Ids upon which to perform the action. | [optional] |

### Return type

[**ReturnCollection**](ReturnCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="resendReturnEmail"></a>
# **resendReturnEmail**
> resendReturnEmail(responseFields, returnAction)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ReturnAction returnAction = new ReturnAction(); // ReturnAction | 
    try {
      apiInstance.resendReturnEmail(responseFields, returnAction);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **returnAction** | [**ReturnAction**](ReturnAction.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="restockReturnItems"></a>
# **restockReturnItems**
> ModelReturn restockReturnItems(returnId, responseFields, restockableReturnItem)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Return ID
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<RestockableReturnItem> restockableReturnItem = Arrays.asList(); // List<RestockableReturnItem> | List of return items with quantity to be restocked
    try {
      ModelReturn result = apiInstance.restockReturnItems(returnId, responseFields, restockableReturnItem);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **restockableReturnItem** | [**List&lt;RestockableReturnItem&gt;**](RestockableReturnItem.md)| List of return items with quantity to be restocked | [optional] |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updatePackage"></a>
# **updatePackage**
> CommerceRuntimePackage updatePackage(returnId, packageId, responseFields, commerceRuntimePackage)

Update Return Package

Updates a return&#39;s package.

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return with which to associate the package.
    String packageId = "packageId_example"; // String | Package to update on the return
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CommerceRuntimePackage commerceRuntimePackage = new CommerceRuntimePackage(); // CommerceRuntimePackage | Package content to update on the return
    try {
      CommerceRuntimePackage result = apiInstance.updatePackage(returnId, packageId, responseFields, commerceRuntimePackage);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **commerceRuntimePackage** | [**CommerceRuntimePackage**](CommerceRuntimePackage.md)| Package content to update on the return | [optional] |

### Return type

[**CommerceRuntimePackage**](CommerceRuntimePackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateReturn"></a>
# **updateReturn**
> ModelReturn updateReturn(returnId, responseFields, modelReturn)

Update Return

Updates an existing return.

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ModelReturn modelReturn = new ModelReturn(); // ModelReturn | 
    try {
      ModelReturn result = apiInstance.updateReturn(returnId, responseFields, modelReturn);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **modelReturn** | [**ModelReturn**](ModelReturn.md)|  | [optional] |

### Return type

[**ModelReturn**](ModelReturn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateReturnAttributes"></a>
# **updateReturnAttributes**
> List&lt;ReturnAttribute&gt; updateReturnAttributes(returnId, removeMissing, responseFields, returnAttribute)

Update Return Attributes

Updates a specific return attribute set of a return.

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return whose attributeSet you want to update.
    Boolean removeMissing = false; // Boolean | Indicates that items missing from the collection should be removed.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ReturnAttribute> returnAttribute = Arrays.asList(); // List<ReturnAttribute> | Attributes to upsert.
    try {
      List<ReturnAttribute> result = apiInstance.updateReturnAttributes(returnId, removeMissing, responseFields, returnAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#updateReturnAttributes");
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
| **returnId** | **String**| Unique identifier of the return whose attributeSet you want to update. | |
| **removeMissing** | **Boolean**| Indicates that items missing from the collection should be removed. | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **returnAttribute** | [**List&lt;ReturnAttribute&gt;**](ReturnAttribute.md)| Attributes to upsert. | [optional] |

### Return type

[**List&lt;ReturnAttribute&gt;**](ReturnAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateReturnItemAttributes"></a>
# **updateReturnItemAttributes**
> List&lt;ReturnAttribute&gt; updateReturnItemAttributes(returnId, returnItemId, removeMissing, responseFields, returnAttribute)

Update Return Item Attributes

Updates a specific return item attribute set of a return item.

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return.
    String returnItemId = "returnItemId_example"; // String | Unique identifier of the return item whose attributes you want to update.
    Boolean removeMissing = false; // Boolean | Indicates that items missing from the collection should be removed.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ReturnAttribute> returnAttribute = Arrays.asList(); // List<ReturnAttribute> | Attributes to upsert.
    try {
      List<ReturnAttribute> result = apiInstance.updateReturnItemAttributes(returnId, returnItemId, removeMissing, responseFields, returnAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#updateReturnItemAttributes");
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
| **returnId** | **String**| Unique identifier of the return. | |
| **returnItemId** | **String**| Unique identifier of the return item whose attributes you want to update. | |
| **removeMissing** | **Boolean**| Indicates that items missing from the collection should be removed. | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **returnAttribute** | [**List&lt;ReturnAttribute&gt;**](ReturnAttribute.md)| Attributes to upsert. | [optional] |

### Return type

[**List&lt;ReturnAttribute&gt;**](ReturnAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateReturnNote"></a>
# **updateReturnNote**
> OrderNote updateReturnNote(returnId, noteId, responseFields, orderNote)

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

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    String returnId = "returnId_example"; // String | Unique identifier of the return whose note you want to update.
    String noteId = "noteId_example"; // String | Unique identifier of the note whose text you want to update.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    OrderNote orderNote = new OrderNote(); // OrderNote | Text of the note.
    try {
      OrderNote result = apiInstance.updateReturnNote(returnId, noteId, responseFields, orderNote);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **orderNote** | [**OrderNote**](OrderNote.md)| Text of the note. | [optional] |

### Return type

[**OrderNote**](OrderNote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

