# BlanketOrderApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBlanketOrderItem**](BlanketOrderApi.md#addBlanketOrderItem) | **POST** /commerce/blanketorders/{blanketOrderId}/items | Add an item to a Blanket Order |
| [**bulkCancelBlanketOrders**](BlanketOrderApi.md#bulkCancelBlanketOrders) | **POST** /commerce/blanketorders/actions/bulk-cancel | Bulk cancel Blanket Orders |
| [**cancelBlanketOrder**](BlanketOrderApi.md#cancelBlanketOrder) | **POST** /commerce/blanketorders/{blanketOrderId}/cancel | Cancel a Blanket Order |
| [**cancelBlanketOrderItem**](BlanketOrderApi.md#cancelBlanketOrderItem) | **POST** /commerce/blanketorders/{blanketOrderId}/items/{itemId}/cancel | Cancel an item on a Blanket Order |
| [**createBlanketOrder**](BlanketOrderApi.md#createBlanketOrder) | **POST** /commerce/blanketorders | Create a new Blanket Order |
| [**createBlanketOrderAttributes**](BlanketOrderApi.md#createBlanketOrderAttributes) | **POST** /commerce/blanketorders/{blanketOrderId}/attributes | Create header-level attributes on a blanket order |
| [**createBlanketOrderItemAttributes**](BlanketOrderApi.md#createBlanketOrderItemAttributes) | **POST** /commerce/blanketorders/{blanketOrderId}/items/{itemId}/attributes | Create line-level attributes on a blanket order item; skips FQNs that already exist |
| [**deleteBlanketOrder**](BlanketOrderApi.md#deleteBlanketOrder) | **DELETE** /commerce/blanketorders/{blanketOrderId} | Delete a Blanket Order |
| [**deleteBlanketOrderAttribute**](BlanketOrderApi.md#deleteBlanketOrderAttribute) | **DELETE** /commerce/blanketorders/{blanketOrderId}/attributes/{attributeFqn} | Delete a single header-level attribute from a blanket order by FQN |
| [**deleteBlanketOrderItem**](BlanketOrderApi.md#deleteBlanketOrderItem) | **DELETE** /commerce/blanketorders/{blanketOrderId}/items/{itemId} | Delete an item from a Blanket Order |
| [**deleteBlanketOrderItemAttribute**](BlanketOrderApi.md#deleteBlanketOrderItemAttribute) | **DELETE** /commerce/blanketorders/{blanketOrderId}/items/{itemId}/attributes/{attributeFqn} | Delete a single line-level attribute from a blanket order item by FQN |
| [**deleteChangeMessage**](BlanketOrderApi.md#deleteChangeMessage) | **DELETE** /commerce/blanketorders/{blanketOrderId}/changemessages/{changeMessageId} | Deletes a change message for a Blanket Order |
| [**getBlanketOrder**](BlanketOrderApi.md#getBlanketOrder) | **GET** /commerce/blanketorders/{blanketOrderId} | Get a Blanket Order by ID |
| [**getBlanketOrderAggregate**](BlanketOrderApi.md#getBlanketOrderAggregate) | **GET** /commerce/blanketorders/aggregate | Aggregate remaining quantity across blanket orders scoped to the current tenant and site. |
| [**getBlanketOrderAttributes**](BlanketOrderApi.md#getBlanketOrderAttributes) | **GET** /commerce/blanketorders/{blanketOrderId}/attributes | Get all header-level attributes for a blanket order |
| [**getBlanketOrderItemAttributes**](BlanketOrderApi.md#getBlanketOrderItemAttributes) | **GET** /commerce/blanketorders/{blanketOrderId}/items/{itemId}/attributes | Get all line-level attributes for a blanket order item |
| [**getBlanketOrders**](BlanketOrderApi.md#getBlanketOrders) | **GET** /commerce/blanketorders | Get a paged collection of Blanket Orders |
| [**getChangeMessage**](BlanketOrderApi.md#getChangeMessage) | **GET** /commerce/blanketorders/{blanketOrderId}/changemessages/{changeMessageId} | Gets a single change message for a Blanket Order |
| [**getChangeMessages**](BlanketOrderApi.md#getChangeMessages) | **GET** /commerce/blanketorders/{blanketOrderId}/changemessages | Gets change messages for a Blanket Order |
| [**getConsumptionRecord**](BlanketOrderApi.md#getConsumptionRecord) | **GET** /commerce/blanketorders/{blanketOrderId}/consumptionrecords/{consumptionRecordId} | Get a single consumption record for a Blanket Order |
| [**getConsumptionRecords**](BlanketOrderApi.md#getConsumptionRecords) | **GET** /commerce/blanketorders/{blanketOrderId}/consumptionrecords | Get consumption records for a Blanket Order |
| [**rollOverBlanketOrder**](BlanketOrderApi.md#rollOverBlanketOrder) | **POST** /commerce/blanketorders/{sourceBlanketOrderId}/rollover | Roll over an expired Blanket Order to create a new order with selected items. |
| [**updateBlanketOrder**](BlanketOrderApi.md#updateBlanketOrder) | **PUT** /commerce/blanketorders/{blanketOrderId} | Update an existing Blanket Order |
| [**updateBlanketOrderAttributes**](BlanketOrderApi.md#updateBlanketOrderAttributes) | **PUT** /commerce/blanketorders/{blanketOrderId}/attributes | Update (upsert) header-level attributes on a blanket order |
| [**updateBlanketOrderItem**](BlanketOrderApi.md#updateBlanketOrderItem) | **PUT** /commerce/blanketorders/{blanketOrderId}/items/{itemId} | Update an item on a Blanket Order |
| [**updateBlanketOrderItemAttributes**](BlanketOrderApi.md#updateBlanketOrderItemAttributes) | **PUT** /commerce/blanketorders/{blanketOrderId}/items/{itemId}/attributes | Upsert line-level attributes on a blanket order item |


<a name="addBlanketOrderItem"></a>
# **addBlanketOrderItem**
> BlanketOrderItem addBlanketOrderItem(blanketOrderId, responseFields, blanketOrderItem)

Add an item to a Blanket Order

Add an item to a Blanket Order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    BlanketOrderItem blanketOrderItem = new BlanketOrderItem(); // BlanketOrderItem | 
    try {
      BlanketOrderItem result = apiInstance.addBlanketOrderItem(blanketOrderId, responseFields, blanketOrderItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#addBlanketOrderItem");
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
| **blanketOrderId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **blanketOrderItem** | [**BlanketOrderItem**](BlanketOrderItem.md)|  | [optional] |

### Return type

[**BlanketOrderItem**](BlanketOrderItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="bulkCancelBlanketOrders"></a>
# **bulkCancelBlanketOrders**
> BulkCancelResult bulkCancelBlanketOrders(responseFields, bulkCancelRequest)

Bulk cancel Blanket Orders

Bulk cancel Blanket Orders.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    BulkCancelRequest bulkCancelRequest = new BulkCancelRequest(); // BulkCancelRequest | 
    try {
      BulkCancelResult result = apiInstance.bulkCancelBlanketOrders(responseFields, bulkCancelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#bulkCancelBlanketOrders");
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
| **bulkCancelRequest** | [**BulkCancelRequest**](BulkCancelRequest.md)|  | [optional] |

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

<a name="cancelBlanketOrder"></a>
# **cancelBlanketOrder**
> BlanketOrder cancelBlanketOrder(blanketOrderId, responseFields, commerceRuntimeCanceledReason)

Cancel a Blanket Order

Cancel a Blanket Order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CommerceRuntimeCanceledReason commerceRuntimeCanceledReason = new CommerceRuntimeCanceledReason(); // CommerceRuntimeCanceledReason | 
    try {
      BlanketOrder result = apiInstance.cancelBlanketOrder(blanketOrderId, responseFields, commerceRuntimeCanceledReason);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#cancelBlanketOrder");
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
| **blanketOrderId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **commerceRuntimeCanceledReason** | [**CommerceRuntimeCanceledReason**](CommerceRuntimeCanceledReason.md)|  | [optional] |

### Return type

[**BlanketOrder**](BlanketOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="cancelBlanketOrderItem"></a>
# **cancelBlanketOrderItem**
> BlanketOrderItem cancelBlanketOrderItem(blanketOrderId, itemId, responseFields, commerceRuntimeCanceledReason)

Cancel an item on a Blanket Order

Cancel an item on a Blanket Order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CommerceRuntimeCanceledReason commerceRuntimeCanceledReason = new CommerceRuntimeCanceledReason(); // CommerceRuntimeCanceledReason | 
    try {
      BlanketOrderItem result = apiInstance.cancelBlanketOrderItem(blanketOrderId, itemId, responseFields, commerceRuntimeCanceledReason);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#cancelBlanketOrderItem");
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
| **blanketOrderId** | **String**|  | |
| **itemId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **commerceRuntimeCanceledReason** | [**CommerceRuntimeCanceledReason**](CommerceRuntimeCanceledReason.md)|  | [optional] |

### Return type

[**BlanketOrderItem**](BlanketOrderItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createBlanketOrder"></a>
# **createBlanketOrder**
> BlanketOrder createBlanketOrder(responseFields, blanketOrder)

Create a new Blanket Order

Create a new Blanket Order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    BlanketOrder blanketOrder = new BlanketOrder(); // BlanketOrder | 
    try {
      BlanketOrder result = apiInstance.createBlanketOrder(responseFields, blanketOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#createBlanketOrder");
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
| **blanketOrder** | [**BlanketOrder**](BlanketOrder.md)|  | [optional] |

### Return type

[**BlanketOrder**](BlanketOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createBlanketOrderAttributes"></a>
# **createBlanketOrderAttributes**
> List&lt;BlanketOrderAttribute&gt; createBlanketOrderAttributes(blanketOrderId, responseFields, blanketOrderAttribute)

Create header-level attributes on a blanket order

Create header-level attributes on a blanket order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<BlanketOrderAttribute> blanketOrderAttribute = Arrays.asList(); // List<BlanketOrderAttribute> | 
    try {
      List<BlanketOrderAttribute> result = apiInstance.createBlanketOrderAttributes(blanketOrderId, responseFields, blanketOrderAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#createBlanketOrderAttributes");
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
| **blanketOrderId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **blanketOrderAttribute** | [**List&lt;BlanketOrderAttribute&gt;**](BlanketOrderAttribute.md)|  | [optional] |

### Return type

[**List&lt;BlanketOrderAttribute&gt;**](BlanketOrderAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createBlanketOrderItemAttributes"></a>
# **createBlanketOrderItemAttributes**
> List&lt;BlanketOrderItemAttribute&gt; createBlanketOrderItemAttributes(blanketOrderId, itemId, responseFields, blanketOrderItemAttribute)

Create line-level attributes on a blanket order item; skips FQNs that already exist

Create line-level attributes on a blanket order item; skips FQNs that already exist.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<BlanketOrderItemAttribute> blanketOrderItemAttribute = Arrays.asList(); // List<BlanketOrderItemAttribute> | 
    try {
      List<BlanketOrderItemAttribute> result = apiInstance.createBlanketOrderItemAttributes(blanketOrderId, itemId, responseFields, blanketOrderItemAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#createBlanketOrderItemAttributes");
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
| **blanketOrderId** | **String**|  | |
| **itemId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **blanketOrderItemAttribute** | [**List&lt;BlanketOrderItemAttribute&gt;**](BlanketOrderItemAttribute.md)|  | [optional] |

### Return type

[**List&lt;BlanketOrderItemAttribute&gt;**](BlanketOrderItemAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteBlanketOrder"></a>
# **deleteBlanketOrder**
> deleteBlanketOrder(blanketOrderId)

Delete a Blanket Order

Delete a Blanket Order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    try {
      apiInstance.deleteBlanketOrder(blanketOrderId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#deleteBlanketOrder");
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
| **blanketOrderId** | **String**|  | |

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

<a name="deleteBlanketOrderAttribute"></a>
# **deleteBlanketOrderAttribute**
> deleteBlanketOrderAttribute(blanketOrderId, attributeFqn)

Delete a single header-level attribute from a blanket order by FQN

Delete a single header-level attribute from a blanket order by FQN.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    String attributeFqn = "attributeFqn_example"; // String | 
    try {
      apiInstance.deleteBlanketOrderAttribute(blanketOrderId, attributeFqn);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#deleteBlanketOrderAttribute");
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
| **blanketOrderId** | **String**|  | |
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

<a name="deleteBlanketOrderItem"></a>
# **deleteBlanketOrderItem**
> deleteBlanketOrderItem(blanketOrderId, itemId)

Delete an item from a Blanket Order

Delete an item from a Blanket Order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    try {
      apiInstance.deleteBlanketOrderItem(blanketOrderId, itemId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#deleteBlanketOrderItem");
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
| **blanketOrderId** | **String**|  | |
| **itemId** | **String**|  | |

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

<a name="deleteBlanketOrderItemAttribute"></a>
# **deleteBlanketOrderItemAttribute**
> deleteBlanketOrderItemAttribute(blanketOrderId, itemId, attributeFqn)

Delete a single line-level attribute from a blanket order item by FQN

Delete a single line-level attribute from a blanket order item by FQN.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    String attributeFqn = "attributeFqn_example"; // String | 
    try {
      apiInstance.deleteBlanketOrderItemAttribute(blanketOrderId, itemId, attributeFqn);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#deleteBlanketOrderItemAttribute");
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
| **blanketOrderId** | **String**|  | |
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

<a name="deleteChangeMessage"></a>
# **deleteChangeMessage**
> deleteChangeMessage(blanketOrderId, changeMessageId)

Deletes a change message for a Blanket Order

Deletes a change message for a Blanket Order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    String changeMessageId = "changeMessageId_example"; // String | 
    try {
      apiInstance.deleteChangeMessage(blanketOrderId, changeMessageId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#deleteChangeMessage");
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
| **blanketOrderId** | **String**|  | |
| **changeMessageId** | **String**|  | |

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

<a name="getBlanketOrder"></a>
# **getBlanketOrder**
> BlanketOrder getBlanketOrder(blanketOrderId, responseFields)

Get a Blanket Order by ID

Get a Blanket Order by ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BlanketOrder result = apiInstance.getBlanketOrder(blanketOrderId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#getBlanketOrder");
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
| **blanketOrderId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**BlanketOrder**](BlanketOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getBlanketOrderAggregate"></a>
# **getBlanketOrderAggregate**
> BlanketOrderAggregateResult getBlanketOrderAggregate(filter, responseFields)

Aggregate remaining quantity across blanket orders scoped to the current tenant and site.

Sums &#x60;items[].remainingQuantity&#x60; and returns breakdowns by product code, customer, and status. Use the &#x60;filter&#x60; parameter to scope the aggregation (e.g. &#x60;items.product.productCode in [SKU1,SKU2]&#x60;, &#x60;customerAccountId eq 1234&#x60;, &#x60;items.status ne Cancelled&#x60;).

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BlanketOrderAggregateResult result = apiInstance.getBlanketOrderAggregate(filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#getBlanketOrderAggregate");
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

[**BlanketOrderAggregateResult**](BlanketOrderAggregateResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getBlanketOrderAttributes"></a>
# **getBlanketOrderAttributes**
> List&lt;BlanketOrderAttribute&gt; getBlanketOrderAttributes(blanketOrderId, responseFields)

Get all header-level attributes for a blanket order

Get all header-level attributes for a blanket order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<BlanketOrderAttribute> result = apiInstance.getBlanketOrderAttributes(blanketOrderId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#getBlanketOrderAttributes");
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
| **blanketOrderId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;BlanketOrderAttribute&gt;**](BlanketOrderAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getBlanketOrderItemAttributes"></a>
# **getBlanketOrderItemAttributes**
> List&lt;BlanketOrderItemAttribute&gt; getBlanketOrderItemAttributes(blanketOrderId, itemId, responseFields)

Get all line-level attributes for a blanket order item

Get all line-level attributes for a blanket order item.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<BlanketOrderItemAttribute> result = apiInstance.getBlanketOrderItemAttributes(blanketOrderId, itemId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#getBlanketOrderItemAttributes");
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
| **blanketOrderId** | **String**|  | |
| **itemId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;BlanketOrderItemAttribute&gt;**](BlanketOrderItemAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getBlanketOrders"></a>
# **getBlanketOrders**
> BlanketOrderCollection getBlanketOrders(startIndex, pageSize, sortBy, filter, q, qLimit, responseFields)

Get a paged collection of Blanket Orders

Get a paged collection of Blanket Orders.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    Integer startIndex = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String q = "q_example"; // String | 
    Integer qLimit = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BlanketOrderCollection result = apiInstance.getBlanketOrders(startIndex, pageSize, sortBy, filter, q, qLimit, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#getBlanketOrders");
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

[**BlanketOrderCollection**](BlanketOrderCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getChangeMessage"></a>
# **getChangeMessage**
> CommerceRuntimeChangeMessage getChangeMessage(blanketOrderId, changeMessageId, responseFields)

Gets a single change message for a Blanket Order

Gets a single change message for a Blanket Order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    String changeMessageId = "changeMessageId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CommerceRuntimeChangeMessage result = apiInstance.getChangeMessage(blanketOrderId, changeMessageId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#getChangeMessage");
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
| **blanketOrderId** | **String**|  | |
| **changeMessageId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CommerceRuntimeChangeMessage**](CommerceRuntimeChangeMessage.md)

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
> ChangeMessageCollection getChangeMessages(blanketOrderId, startIndex, pageSize, responseFields)

Gets change messages for a Blanket Order

Gets change messages for a Blanket Order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    Integer startIndex = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ChangeMessageCollection result = apiInstance.getChangeMessages(blanketOrderId, startIndex, pageSize, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#getChangeMessages");
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
| **blanketOrderId** | **String**|  | |
| **startIndex** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ChangeMessageCollection**](ChangeMessageCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getConsumptionRecord"></a>
# **getConsumptionRecord**
> ConsumptionRecord getConsumptionRecord(blanketOrderId, consumptionRecordId, responseFields)

Get a single consumption record for a Blanket Order

Get a single consumption record for a Blanket Order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    String consumptionRecordId = "consumptionRecordId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ConsumptionRecord result = apiInstance.getConsumptionRecord(blanketOrderId, consumptionRecordId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#getConsumptionRecord");
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
| **blanketOrderId** | **String**|  | |
| **consumptionRecordId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ConsumptionRecord**](ConsumptionRecord.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getConsumptionRecords"></a>
# **getConsumptionRecords**
> ConsumptionRecordCollection getConsumptionRecords(blanketOrderId, startIndex, pageSize, responseFields)

Get consumption records for a Blanket Order

Get consumption records for a Blanket Order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    Integer startIndex = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ConsumptionRecordCollection result = apiInstance.getConsumptionRecords(blanketOrderId, startIndex, pageSize, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#getConsumptionRecords");
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
| **blanketOrderId** | **String**|  | |
| **startIndex** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ConsumptionRecordCollection**](ConsumptionRecordCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="rollOverBlanketOrder"></a>
# **rollOverBlanketOrder**
> BlanketOrder rollOverBlanketOrder(sourceBlanketOrderId, responseFields, rolloverBlanketOrderRequest)

Roll over an expired Blanket Order to create a new order with selected items.

ICKY-2647: Blanket Order Rollover  Source order must be in Expired status. Only Open items can be selected. Creates a new Blanket Order in Open status with copied data: - Customer Account ID - Buyer and Seller contact information - Price List Code - Header and line item attributes

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String sourceBlanketOrderId = "sourceBlanketOrderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    RolloverBlanketOrderRequest rolloverBlanketOrderRequest = new RolloverBlanketOrderRequest(); // RolloverBlanketOrderRequest | 
    try {
      BlanketOrder result = apiInstance.rollOverBlanketOrder(sourceBlanketOrderId, responseFields, rolloverBlanketOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#rollOverBlanketOrder");
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
| **sourceBlanketOrderId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **rolloverBlanketOrderRequest** | [**RolloverBlanketOrderRequest**](RolloverBlanketOrderRequest.md)|  | [optional] |

### Return type

[**BlanketOrder**](BlanketOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateBlanketOrder"></a>
# **updateBlanketOrder**
> BlanketOrder updateBlanketOrder(blanketOrderId, responseFields, blanketOrder)

Update an existing Blanket Order

Update an existing Blanket Order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    BlanketOrder blanketOrder = new BlanketOrder(); // BlanketOrder | 
    try {
      BlanketOrder result = apiInstance.updateBlanketOrder(blanketOrderId, responseFields, blanketOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#updateBlanketOrder");
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
| **blanketOrderId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **blanketOrder** | [**BlanketOrder**](BlanketOrder.md)|  | [optional] |

### Return type

[**BlanketOrder**](BlanketOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateBlanketOrderAttributes"></a>
# **updateBlanketOrderAttributes**
> List&lt;BlanketOrderAttribute&gt; updateBlanketOrderAttributes(blanketOrderId, removeMissing, responseFields, blanketOrderAttribute)

Update (upsert) header-level attributes on a blanket order

Update (upsert) header-level attributes on a blanket order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    Boolean removeMissing = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<BlanketOrderAttribute> blanketOrderAttribute = Arrays.asList(); // List<BlanketOrderAttribute> | 
    try {
      List<BlanketOrderAttribute> result = apiInstance.updateBlanketOrderAttributes(blanketOrderId, removeMissing, responseFields, blanketOrderAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#updateBlanketOrderAttributes");
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
| **blanketOrderId** | **String**|  | |
| **removeMissing** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **blanketOrderAttribute** | [**List&lt;BlanketOrderAttribute&gt;**](BlanketOrderAttribute.md)|  | [optional] |

### Return type

[**List&lt;BlanketOrderAttribute&gt;**](BlanketOrderAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateBlanketOrderItem"></a>
# **updateBlanketOrderItem**
> BlanketOrderItem updateBlanketOrderItem(blanketOrderId, itemId, responseFields, blanketOrderItem)

Update an item on a Blanket Order

Update an item on a Blanket Order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    BlanketOrderItem blanketOrderItem = new BlanketOrderItem(); // BlanketOrderItem | 
    try {
      BlanketOrderItem result = apiInstance.updateBlanketOrderItem(blanketOrderId, itemId, responseFields, blanketOrderItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#updateBlanketOrderItem");
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
| **blanketOrderId** | **String**|  | |
| **itemId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **blanketOrderItem** | [**BlanketOrderItem**](BlanketOrderItem.md)|  | [optional] |

### Return type

[**BlanketOrderItem**](BlanketOrderItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateBlanketOrderItemAttributes"></a>
# **updateBlanketOrderItemAttributes**
> List&lt;BlanketOrderItemAttribute&gt; updateBlanketOrderItemAttributes(blanketOrderId, itemId, removeMissing, responseFields, blanketOrderItemAttribute)

Upsert line-level attributes on a blanket order item

Upsert line-level attributes on a blanket order item.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.BlanketOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlanketOrderApi apiInstance = new BlanketOrderApi(defaultClient);
    String blanketOrderId = "blanketOrderId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    Boolean removeMissing = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<BlanketOrderItemAttribute> blanketOrderItemAttribute = Arrays.asList(); // List<BlanketOrderItemAttribute> | 
    try {
      List<BlanketOrderItemAttribute> result = apiInstance.updateBlanketOrderItemAttributes(blanketOrderId, itemId, removeMissing, responseFields, blanketOrderItemAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlanketOrderApi#updateBlanketOrderItemAttributes");
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
| **blanketOrderId** | **String**|  | |
| **itemId** | **String**|  | |
| **removeMissing** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **blanketOrderItemAttribute** | [**List&lt;BlanketOrderItemAttribute&gt;**](BlanketOrderItemAttribute.md)|  | [optional] |

### Return type

[**List&lt;BlanketOrderItemAttribute&gt;**](BlanketOrderItemAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

