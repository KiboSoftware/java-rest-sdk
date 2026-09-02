# CallOffOrderApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addItem**](CallOffOrderApi.md#addItem) | **POST** /commerce/callofforders/{callOffOrderId}/items | Add Item |
| [**bulkCancelCallOffOrders**](CallOffOrderApi.md#bulkCancelCallOffOrders) | **POST** /commerce/callofforders/actions/bulk-cancel | Bulk cancel call-off orders |
| [**cancelItem**](CallOffOrderApi.md#cancelItem) | **POST** /commerce/callofforders/{callOffOrderId}/items/{itemId}/cancel | Cancel Item |
| [**createCallOffOrder**](CallOffOrderApi.md#createCallOffOrder) | **POST** /commerce/callofforders | Create Call Off Order |
| [**createCallOffOrderAttributes**](CallOffOrderApi.md#createCallOffOrderAttributes) | **POST** /commerce/callofforders/{callOffOrderId}/attributes | Create header-level attributes on a call-off order |
| [**createCallOffOrderItemAttributes**](CallOffOrderApi.md#createCallOffOrderItemAttributes) | **POST** /commerce/callofforders/{callOffOrderId}/items/{itemId}/attributes | Create line-level attributes on a call-off order item; skips FQNs that already exist |
| [**deleteCallOffOrderAttribute**](CallOffOrderApi.md#deleteCallOffOrderAttribute) | **DELETE** /commerce/callofforders/{callOffOrderId}/attributes/{attributeFqn} | Delete a single header-level attribute from a call-off order by FQN |
| [**deleteCallOffOrderItemAttribute**](CallOffOrderApi.md#deleteCallOffOrderItemAttribute) | **DELETE** /commerce/callofforders/{callOffOrderId}/items/{itemId}/attributes/{attributeFqn} | Delete a single line-level attribute from a call-off order item by FQN |
| [**getAvailableActions**](CallOffOrderApi.md#getAvailableActions) | **GET** /commerce/callofforders/{callOffOrderId}/actions | Get Available Actions |
| [**getCallOffOrder**](CallOffOrderApi.md#getCallOffOrder) | **GET** /commerce/callofforders/{callOffOrderId} | Get Call Off Order |
| [**getCallOffOrderAggregate**](CallOffOrderApi.md#getCallOffOrderAggregate) | **GET** /commerce/callofforders/aggregate | Aggregate requested quantity across call-off orders spanning every site in the current tenant. |
| [**getCallOffOrderAttributes**](CallOffOrderApi.md#getCallOffOrderAttributes) | **GET** /commerce/callofforders/{callOffOrderId}/attributes | Get all header-level attributes for a call-off order |
| [**getCallOffOrderItemAttributes**](CallOffOrderApi.md#getCallOffOrderItemAttributes) | **GET** /commerce/callofforders/{callOffOrderId}/items/{itemId}/attributes | Get all line-level attributes for a call-off order item |
| [**getCallOffOrders**](CallOffOrderApi.md#getCallOffOrders) | **GET** /commerce/callofforders | Get Call Off Orders |
| [**getChangeMessages**](CallOffOrderApi.md#getChangeMessages) | **GET** /commerce/callofforders/{callOffOrderId}/changemessages | Get Change Messages |
| [**getCreditHoldReasons**](CallOffOrderApi.md#getCreditHoldReasons) | **GET** /commerce/callofforders/credithold/reasons | Returns the list of available credit hold reasons for Call-Off Orders |
| [**performAction**](CallOffOrderApi.md#performAction) | **POST** /commerce/callofforders/{callOffOrderId}/actions | Perform Action |
| [**releaseCallOffOrder**](CallOffOrderApi.md#releaseCallOffOrder) | **POST** /commerce/callofforders/{callOffOrderId}/release | Release Call Off Order |
| [**updateCallOffOrder**](CallOffOrderApi.md#updateCallOffOrder) | **PUT** /commerce/callofforders/{callOffOrderId} | Update Call Off Order |
| [**updateCallOffOrderAttributes**](CallOffOrderApi.md#updateCallOffOrderAttributes) | **PUT** /commerce/callofforders/{callOffOrderId}/attributes | Update (upsert) header-level attributes on a call-off order |
| [**updateCallOffOrderItemAttributes**](CallOffOrderApi.md#updateCallOffOrderItemAttributes) | **PUT** /commerce/callofforders/{callOffOrderId}/items/{itemId}/attributes | Upsert line-level attributes on a call-off order item |
| [**updateItemDestination**](CallOffOrderApi.md#updateItemDestination) | **PUT** /commerce/callofforders/{callOffOrderId}/items/{itemId}/destination | Update Item Destination |
| [**updateItemDestinationById**](CallOffOrderApi.md#updateItemDestinationById) | **PUT** /commerce/callofforders/{callOffOrderId}/items/{itemId}/destination/{destinationId} | Update Item Destination By Id |
| [**updateItemPrice**](CallOffOrderApi.md#updateItemPrice) | **PUT** /commerce/callofforders/{callOffOrderId}/items/{itemId}/price/{unitPrice} | Update Item Price |
| [**updateItemQuantity**](CallOffOrderApi.md#updateItemQuantity) | **PUT** /commerce/callofforders/{callOffOrderId}/items/{itemId}/quantity/{quantity} | Update Item Quantity |
| [**updateItemRequestedShipDate**](CallOffOrderApi.md#updateItemRequestedShipDate) | **PUT** /commerce/callofforders/{callOffOrderId}/items/{itemId}/shipdate | Update Item Requested Ship Date |


<a name="addItem"></a>
# **addItem**
> CallOffOrder addItem(callOffOrderId, responseFields, callOffOrderItem)

Add Item

Add Item

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CallOffOrderItem callOffOrderItem = new CallOffOrderItem(); // CallOffOrderItem | 
    try {
      CallOffOrder result = apiInstance.addItem(callOffOrderId, responseFields, callOffOrderItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#addItem");
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
| **callOffOrderId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **callOffOrderItem** | [**CallOffOrderItem**](CallOffOrderItem.md)|  | [optional] |

### Return type

[**CallOffOrder**](CallOffOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="bulkCancelCallOffOrders"></a>
# **bulkCancelCallOffOrders**
> BulkCancelResult bulkCancelCallOffOrders(responseFields, bulkCancelRequest)

Bulk cancel call-off orders

Bulk cancel call-off orders.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    BulkCancelRequest bulkCancelRequest = new BulkCancelRequest(); // BulkCancelRequest | Bulk cancel request.
    try {
      BulkCancelResult result = apiInstance.bulkCancelCallOffOrders(responseFields, bulkCancelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#bulkCancelCallOffOrders");
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
| **bulkCancelRequest** | [**BulkCancelRequest**](BulkCancelRequest.md)| Bulk cancel request. | [optional] |

### Return type

[**BulkCancelResult**](BulkCancelResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="cancelItem"></a>
# **cancelItem**
> CallOffOrder cancelItem(callOffOrderId, itemId, responseFields, callOffOrderAction)

Cancel Item

Cancel Item

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CallOffOrderAction callOffOrderAction = new CallOffOrderAction(); // CallOffOrderAction | 
    try {
      CallOffOrder result = apiInstance.cancelItem(callOffOrderId, itemId, responseFields, callOffOrderAction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#cancelItem");
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
| **callOffOrderId** | **String**|  | |
| **itemId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **callOffOrderAction** | [**CallOffOrderAction**](CallOffOrderAction.md)|  | [optional] |

### Return type

[**CallOffOrder**](CallOffOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createCallOffOrder"></a>
# **createCallOffOrder**
> CallOffOrder createCallOffOrder(responseFields, callOffOrder)

Create Call Off Order

Create Call Off Order

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CallOffOrder callOffOrder = new CallOffOrder(); // CallOffOrder | 
    try {
      CallOffOrder result = apiInstance.createCallOffOrder(responseFields, callOffOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#createCallOffOrder");
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
| **callOffOrder** | [**CallOffOrder**](CallOffOrder.md)|  | [optional] |

### Return type

[**CallOffOrder**](CallOffOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createCallOffOrderAttributes"></a>
# **createCallOffOrderAttributes**
> List&lt;CallOffOrderAttribute&gt; createCallOffOrderAttributes(callOffOrderId, responseFields, callOffOrderAttribute)

Create header-level attributes on a call-off order

Create header-level attributes on a call-off order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<CallOffOrderAttribute> callOffOrderAttribute = Arrays.asList(); // List<CallOffOrderAttribute> | 
    try {
      List<CallOffOrderAttribute> result = apiInstance.createCallOffOrderAttributes(callOffOrderId, responseFields, callOffOrderAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#createCallOffOrderAttributes");
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
| **callOffOrderId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **callOffOrderAttribute** | [**List&lt;CallOffOrderAttribute&gt;**](CallOffOrderAttribute.md)|  | [optional] |

### Return type

[**List&lt;CallOffOrderAttribute&gt;**](CallOffOrderAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createCallOffOrderItemAttributes"></a>
# **createCallOffOrderItemAttributes**
> List&lt;CallOffOrderItemAttribute&gt; createCallOffOrderItemAttributes(callOffOrderId, itemId, responseFields, callOffOrderItemAttribute)

Create line-level attributes on a call-off order item; skips FQNs that already exist

Create line-level attributes on a call-off order item; skips FQNs that already exist.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<CallOffOrderItemAttribute> callOffOrderItemAttribute = Arrays.asList(); // List<CallOffOrderItemAttribute> | 
    try {
      List<CallOffOrderItemAttribute> result = apiInstance.createCallOffOrderItemAttributes(callOffOrderId, itemId, responseFields, callOffOrderItemAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#createCallOffOrderItemAttributes");
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
| **callOffOrderId** | **String**|  | |
| **itemId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **callOffOrderItemAttribute** | [**List&lt;CallOffOrderItemAttribute&gt;**](CallOffOrderItemAttribute.md)|  | [optional] |

### Return type

[**List&lt;CallOffOrderItemAttribute&gt;**](CallOffOrderItemAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteCallOffOrderAttribute"></a>
# **deleteCallOffOrderAttribute**
> deleteCallOffOrderAttribute(callOffOrderId, attributeFqn)

Delete a single header-level attribute from a call-off order by FQN

Delete a single header-level attribute from a call-off order by FQN.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String attributeFqn = "attributeFqn_example"; // String | 
    try {
      apiInstance.deleteCallOffOrderAttribute(callOffOrderId, attributeFqn);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#deleteCallOffOrderAttribute");
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
| **callOffOrderId** | **String**|  | |
| **attributeFqn** | **String**|  | |

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

<a name="deleteCallOffOrderItemAttribute"></a>
# **deleteCallOffOrderItemAttribute**
> deleteCallOffOrderItemAttribute(callOffOrderId, itemId, attributeFqn)

Delete a single line-level attribute from a call-off order item by FQN

Delete a single line-level attribute from a call-off order item by FQN.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    String attributeFqn = "attributeFqn_example"; // String | 
    try {
      apiInstance.deleteCallOffOrderItemAttribute(callOffOrderId, itemId, attributeFqn);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#deleteCallOffOrderItemAttribute");
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
| **callOffOrderId** | **String**|  | |
| **itemId** | **String**|  | |
| **attributeFqn** | **String**|  | |

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

<a name="getAvailableActions"></a>
# **getAvailableActions**
> List&lt;String&gt; getAvailableActions(callOffOrderId, responseFields)

Get Available Actions

Get Available Actions

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<String> result = apiInstance.getAvailableActions(callOffOrderId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#getAvailableActions");
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
| **callOffOrderId** | **String**|  | |
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

<a name="getCallOffOrder"></a>
# **getCallOffOrder**
> CallOffOrder getCallOffOrder(callOffOrderId, responseFields)

Get Call Off Order

Get Call Off Order

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CallOffOrder result = apiInstance.getCallOffOrder(callOffOrderId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#getCallOffOrder");
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
| **callOffOrderId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CallOffOrder**](CallOffOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCallOffOrderAggregate"></a>
# **getCallOffOrderAggregate**
> CallOffOrderAggregateResult getCallOffOrderAggregate(filter, responseFields)

Aggregate requested quantity across call-off orders spanning every site in the current tenant.

Sums &#x60;items[].requestedQty&#x60; and returns breakdowns by product code, customer, status, and requested ship month. Use the &#x60;filter&#x60; parameter to scope the aggregation (e.g. &#x60;items.product.productCode in [SKU1,SKU2]&#x60;, &#x60;customerAccountId eq 1234&#x60;, &#x60;items.status ne Cancelled&#x60;, &#x60;items.requestedShipDate ge 2026-01-01&#x60;).

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CallOffOrderAggregateResult result = apiInstance.getCallOffOrderAggregate(filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#getCallOffOrderAggregate");
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
| **filter** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CallOffOrderAggregateResult**](CallOffOrderAggregateResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCallOffOrderAttributes"></a>
# **getCallOffOrderAttributes**
> List&lt;CallOffOrderAttribute&gt; getCallOffOrderAttributes(callOffOrderId, responseFields)

Get all header-level attributes for a call-off order

Get all header-level attributes for a call-off order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<CallOffOrderAttribute> result = apiInstance.getCallOffOrderAttributes(callOffOrderId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#getCallOffOrderAttributes");
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
| **callOffOrderId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;CallOffOrderAttribute&gt;**](CallOffOrderAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCallOffOrderItemAttributes"></a>
# **getCallOffOrderItemAttributes**
> List&lt;CallOffOrderItemAttribute&gt; getCallOffOrderItemAttributes(callOffOrderId, itemId, responseFields)

Get all line-level attributes for a call-off order item

Get all line-level attributes for a call-off order item.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<CallOffOrderItemAttribute> result = apiInstance.getCallOffOrderItemAttributes(callOffOrderId, itemId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#getCallOffOrderItemAttributes");
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
| **callOffOrderId** | **String**|  | |
| **itemId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;CallOffOrderItemAttribute&gt;**](CallOffOrderItemAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCallOffOrders"></a>
# **getCallOffOrders**
> CallOffOrderCollection getCallOffOrders(startIndex, pageSize, sortBy, filter, q, qLimit, responseFields)

Get Call Off Orders

Get Call Off Orders

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    Integer startIndex = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String q = "q_example"; // String | 
    Integer qLimit = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CallOffOrderCollection result = apiInstance.getCallOffOrders(startIndex, pageSize, sortBy, filter, q, qLimit, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#getCallOffOrders");
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
| **startIndex** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **q** | **String**|  | [optional] |
| **qLimit** | **Integer**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CallOffOrderCollection**](CallOffOrderCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getChangeMessages"></a>
# **getChangeMessages**
> CallOffOrderChangeMessageCollection getChangeMessages(callOffOrderId, startIndex, pageSize, responseFields)

Get Change Messages

Get Change Messages

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 20; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CallOffOrderChangeMessageCollection result = apiInstance.getChangeMessages(callOffOrderId, startIndex, pageSize, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#getChangeMessages");
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
| **callOffOrderId** | **String**|  | |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 20] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CallOffOrderChangeMessageCollection**](CallOffOrderChangeMessageCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCreditHoldReasons"></a>
# **getCreditHoldReasons**
> CreditHoldReasonCollection getCreditHoldReasons(responseFields)

Returns the list of available credit hold reasons for Call-Off Orders

Returns the list of available credit hold reasons for Call-Off Orders.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CreditHoldReasonCollection result = apiInstance.getCreditHoldReasons(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#getCreditHoldReasons");
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

[**CreditHoldReasonCollection**](CreditHoldReasonCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="performAction"></a>
# **performAction**
> CallOffOrder performAction(callOffOrderId, responseFields, callOffOrderAction)

Perform Action

Perform Action

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CallOffOrderAction callOffOrderAction = new CallOffOrderAction(); // CallOffOrderAction | 
    try {
      CallOffOrder result = apiInstance.performAction(callOffOrderId, responseFields, callOffOrderAction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#performAction");
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
| **callOffOrderId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **callOffOrderAction** | [**CallOffOrderAction**](CallOffOrderAction.md)|  | [optional] |

### Return type

[**CallOffOrder**](CallOffOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="releaseCallOffOrder"></a>
# **releaseCallOffOrder**
> CallOffOrder releaseCallOffOrder(callOffOrderId, responseFields, releaseCallOffOrderRequest)

Release Call Off Order

Release Call Off Order

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ReleaseCallOffOrderRequest releaseCallOffOrderRequest = new ReleaseCallOffOrderRequest(); // ReleaseCallOffOrderRequest | 
    try {
      CallOffOrder result = apiInstance.releaseCallOffOrder(callOffOrderId, responseFields, releaseCallOffOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#releaseCallOffOrder");
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
| **callOffOrderId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **releaseCallOffOrderRequest** | [**ReleaseCallOffOrderRequest**](ReleaseCallOffOrderRequest.md)|  | [optional] |

### Return type

[**CallOffOrder**](CallOffOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCallOffOrder"></a>
# **updateCallOffOrder**
> CallOffOrder updateCallOffOrder(callOffOrderId, responseFields, callOffOrder)

Update Call Off Order

Update Call Off Order

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CallOffOrder callOffOrder = new CallOffOrder(); // CallOffOrder | 
    try {
      CallOffOrder result = apiInstance.updateCallOffOrder(callOffOrderId, responseFields, callOffOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#updateCallOffOrder");
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
| **callOffOrderId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **callOffOrder** | [**CallOffOrder**](CallOffOrder.md)|  | [optional] |

### Return type

[**CallOffOrder**](CallOffOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCallOffOrderAttributes"></a>
# **updateCallOffOrderAttributes**
> List&lt;CallOffOrderAttribute&gt; updateCallOffOrderAttributes(callOffOrderId, removeMissing, responseFields, callOffOrderAttribute)

Update (upsert) header-level attributes on a call-off order

Update (upsert) header-level attributes on a call-off order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    Boolean removeMissing = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<CallOffOrderAttribute> callOffOrderAttribute = Arrays.asList(); // List<CallOffOrderAttribute> | 
    try {
      List<CallOffOrderAttribute> result = apiInstance.updateCallOffOrderAttributes(callOffOrderId, removeMissing, responseFields, callOffOrderAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#updateCallOffOrderAttributes");
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
| **callOffOrderId** | **String**|  | |
| **removeMissing** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **callOffOrderAttribute** | [**List&lt;CallOffOrderAttribute&gt;**](CallOffOrderAttribute.md)|  | [optional] |

### Return type

[**List&lt;CallOffOrderAttribute&gt;**](CallOffOrderAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCallOffOrderItemAttributes"></a>
# **updateCallOffOrderItemAttributes**
> List&lt;CallOffOrderItemAttribute&gt; updateCallOffOrderItemAttributes(callOffOrderId, itemId, removeMissing, responseFields, callOffOrderItemAttribute)

Upsert line-level attributes on a call-off order item

Upsert line-level attributes on a call-off order item.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    Boolean removeMissing = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<CallOffOrderItemAttribute> callOffOrderItemAttribute = Arrays.asList(); // List<CallOffOrderItemAttribute> | 
    try {
      List<CallOffOrderItemAttribute> result = apiInstance.updateCallOffOrderItemAttributes(callOffOrderId, itemId, removeMissing, responseFields, callOffOrderItemAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#updateCallOffOrderItemAttributes");
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
| **callOffOrderId** | **String**|  | |
| **itemId** | **String**|  | |
| **removeMissing** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **callOffOrderItemAttribute** | [**List&lt;CallOffOrderItemAttribute&gt;**](CallOffOrderItemAttribute.md)|  | [optional] |

### Return type

[**List&lt;CallOffOrderItemAttribute&gt;**](CallOffOrderItemAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateItemDestination"></a>
# **updateItemDestination**
> CallOffOrder updateItemDestination(callOffOrderId, itemId, responseFields, commerceRuntimeDestination)

Update Item Destination

Update Item Destination

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CommerceRuntimeDestination commerceRuntimeDestination = new CommerceRuntimeDestination(); // CommerceRuntimeDestination | 
    try {
      CallOffOrder result = apiInstance.updateItemDestination(callOffOrderId, itemId, responseFields, commerceRuntimeDestination);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#updateItemDestination");
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
| **callOffOrderId** | **String**|  | |
| **itemId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **commerceRuntimeDestination** | [**CommerceRuntimeDestination**](CommerceRuntimeDestination.md)|  | [optional] |

### Return type

[**CallOffOrder**](CallOffOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateItemDestinationById"></a>
# **updateItemDestinationById**
> CallOffOrder updateItemDestinationById(callOffOrderId, itemId, destinationId, responseFields)

Update Item Destination By Id

Update Item Destination By Id

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    String destinationId = "destinationId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CallOffOrder result = apiInstance.updateItemDestinationById(callOffOrderId, itemId, destinationId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#updateItemDestinationById");
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
| **callOffOrderId** | **String**|  | |
| **itemId** | **String**|  | |
| **destinationId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CallOffOrder**](CallOffOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateItemPrice"></a>
# **updateItemPrice**
> CallOffOrder updateItemPrice(callOffOrderId, itemId, unitPrice, responseFields)

Update Item Price

Update Item Price

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    Double unitPrice = 3.4D; // Double | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CallOffOrder result = apiInstance.updateItemPrice(callOffOrderId, itemId, unitPrice, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#updateItemPrice");
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
| **callOffOrderId** | **String**|  | |
| **itemId** | **String**|  | |
| **unitPrice** | **Double**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CallOffOrder**](CallOffOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateItemQuantity"></a>
# **updateItemQuantity**
> CallOffOrder updateItemQuantity(callOffOrderId, itemId, quantity, responseFields)

Update Item Quantity

Update Item Quantity

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    Integer quantity = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CallOffOrder result = apiInstance.updateItemQuantity(callOffOrderId, itemId, quantity, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#updateItemQuantity");
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
| **callOffOrderId** | **String**|  | |
| **itemId** | **String**|  | |
| **quantity** | **Integer**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CallOffOrder**](CallOffOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateItemRequestedShipDate"></a>
# **updateItemRequestedShipDate**
> CallOffOrder updateItemRequestedShipDate(callOffOrderId, itemId, responseFields, body)

Update Item Requested Ship Date

Update Item Requested Ship Date

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderApi apiInstance = new CallOffOrderApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    OffsetDateTime body = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      CallOffOrder result = apiInstance.updateItemRequestedShipDate(callOffOrderId, itemId, responseFields, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderApi#updateItemRequestedShipDate");
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
| **callOffOrderId** | **String**|  | |
| **itemId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **body** | **OffsetDateTime**|  | [optional] |

### Return type

[**CallOffOrder**](CallOffOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

