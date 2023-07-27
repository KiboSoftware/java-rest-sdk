# SubscriptionApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSubscriptionItem**](SubscriptionApi.md#addSubscriptionItem) | **POST** /commerce/subscriptions/{subscriptionId}/items | Add Subscription Item |
| [**applyCoupon**](SubscriptionApi.md#applyCoupon) | **PUT** /commerce/subscriptions/{subscriptionId}/coupons/{couponCode} | Apply Coupon |
| [**clearSubscriptionDraft**](SubscriptionApi.md#clearSubscriptionDraft) | **PUT** /commerce/subscriptions/{subscriptionId}/cleardraft | Delete subscription draft |
| [**convertToOrder**](SubscriptionApi.md#convertToOrder) | **PUT** /commerce/subscriptions/{subscriptionId}/converttoorder | Convert To Order |
| [**createSubscription**](SubscriptionApi.md#createSubscription) | **POST** /commerce/subscriptions | Creates Subscription |
| [**deleteSubscriptionData**](SubscriptionApi.md#deleteSubscriptionData) | **DELETE** /commerce/subscriptions/{subscriptionId}/data/{subscriptionDataId} | Delete Subscription Data |
| [**deleteSubscriptionItem**](SubscriptionApi.md#deleteSubscriptionItem) | **PUT** /commerce/subscriptions/{subscriptionId}/items/{subscriptionItemId}/remove | Delete Subscription Item |
| [**deleteSubscriptionItemData**](SubscriptionApi.md#deleteSubscriptionItemData) | **DELETE** /commerce/subscriptions/{subscriptionId}/item/{subscriptionItemId}/data/{subscriptionItemDataId} | Delete Subscription Item Data |
| [**getAvailableShipmentMethods**](SubscriptionApi.md#getAvailableShipmentMethods) | **GET** /commerce/subscriptions/{subscriptionId}/shipments/methods | Get Available Shipment Methods |
| [**getReasons**](SubscriptionApi.md#getReasons) | **GET** /commerce/subscriptions/reasons | Get Reasons |
| [**getSubscription**](SubscriptionApi.md#getSubscription) | **GET** /commerce/subscriptions/{subscriptionId} | Gets Subscription |
| [**getSubscriptionData**](SubscriptionApi.md#getSubscriptionData) | **GET** /commerce/subscriptions/{subscriptionId}/data | Get subscription Data |
| [**getSubscriptionItemData**](SubscriptionApi.md#getSubscriptionItemData) | **GET** /commerce/subscriptions/{subscriptionId}/item/{subscriptionItemId}/data | Get Subscription Item Data |
| [**getSubscriptions**](SubscriptionApi.md#getSubscriptions) | **GET** /commerce/subscriptions | Get Subscriptions |
| [**orderNow**](SubscriptionApi.md#orderNow) | **PUT** /commerce/subscriptions/{subscriptionId}/ordernow | Order Now |
| [**orderPartialSubscription**](SubscriptionApi.md#orderPartialSubscription) | **PUT** /commerce/subscriptions/{subscriptionId}/orderpartialdraft | Order Partial Subscription |
| [**performSubscriptionAction**](SubscriptionApi.md#performSubscriptionAction) | **PUT** /commerce/subscriptions/{subscriptionId}/actions | Perform Subscription Action |
| [**removeCoupon**](SubscriptionApi.md#removeCoupon) | **PUT** /commerce/subscriptions/{subscriptionId}/removecoupon | Remove coupons from subscription and draft |
| [**removeOneTimeCoupon**](SubscriptionApi.md#removeOneTimeCoupon) | **PUT** /commerce/subscriptions/{subscriptionId}/removeonetimecoupon | Remove one time coupons from subscription |
| [**skipSubscription**](SubscriptionApi.md#skipSubscription) | **PUT** /commerce/subscriptions/{subscriptionId}/skip | Skip Subscription |
| [**updateAdjustments**](SubscriptionApi.md#updateAdjustments) | **POST** /commerce/subscriptions/{subscriptionId}/adjustments | Update Adjustments |
| [**updateFulfillmentInfo**](SubscriptionApi.md#updateFulfillmentInfo) | **PUT** /commerce/subscriptions/{subscriptionId}/fulfillmentinfo | Update Fulfillment Info |
| [**updateItemQuantity**](SubscriptionApi.md#updateItemQuantity) | **PUT** /commerce/subscriptions/{subscriptionId}/items/{subscriptionItemId}/quantity/{quantity} | Update Item Quantity |
| [**updateNextOrderDate**](SubscriptionApi.md#updateNextOrderDate) | **PUT** /commerce/subscriptions/{subscriptionId}/nextorderdate | Update Next Order Date |
| [**updatePayment**](SubscriptionApi.md#updatePayment) | **PUT** /commerce/subscriptions/{subscriptionId}/payment | Update Payment |
| [**updateSubscription**](SubscriptionApi.md#updateSubscription) | **PUT** /commerce/subscriptions/{subscriptionId} | Update Subscription |
| [**updateSubscriptionData**](SubscriptionApi.md#updateSubscriptionData) | **PUT** /commerce/subscriptions/{subscriptionId}/data/{subscriptionDataId} | Update Subscription Data |
| [**updateSubscriptionFrequency**](SubscriptionApi.md#updateSubscriptionFrequency) | **PUT** /commerce/subscriptions/{subscriptionId}/frequency | Update Subscription Frequency |
| [**updateSubscriptionItemData**](SubscriptionApi.md#updateSubscriptionItemData) | **PUT** /commerce/subscriptions/{subscriptionId}/item/{subscriptionItemId}/data/{subscriptionItemDataId} | Update Subscription Item Data |
| [**upsertInventoryTags**](SubscriptionApi.md#upsertInventoryTags) | **PUT** /commerce/subscriptions/{subscriptionId}/items/{subscriptionItemId}/upsertinventorytags | Upsert Inventory Tags |


<a name="addSubscriptionItem"></a>
# **addSubscriptionItem**
> SubscriptionRuntimeSubscription addSubscriptionItem(subscriptionId, updateMode, subscriptionItem)

Add Subscription Item

Add a subscription item in existing subscription.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | subscription id
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    SubscriptionItem subscriptionItem = new SubscriptionItem(); // SubscriptionItem | subscription item to add.
    try {
      SubscriptionRuntimeSubscription result = apiInstance.addSubscriptionItem(subscriptionId, updateMode, subscriptionItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#addSubscriptionItem");
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
| **subscriptionId** | **String**| subscription id | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft). | [optional] |
| **subscriptionItem** | [**SubscriptionItem**](SubscriptionItem.md)| subscription item to add. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="applyCoupon"></a>
# **applyCoupon**
> SubscriptionRuntimeSubscription applyCoupon(subscriptionId, couponCode, updateMode)

Apply Coupon

Apply coupon to the Subscription.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Unique identifier of the Subscription with which to associate the coupon.
    String couponCode = "couponCode_example"; // String | Coupon code that the customer supplies to get the discounted price.
    String updateMode = "updateMode_example"; // String | updateMode\">Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    try {
      SubscriptionRuntimeSubscription result = apiInstance.applyCoupon(subscriptionId, couponCode, updateMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#applyCoupon");
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
| **subscriptionId** | **String**| Unique identifier of the Subscription with which to associate the coupon. | |
| **couponCode** | **String**| Coupon code that the customer supplies to get the discounted price. | |
| **updateMode** | **String**| updateMode\&quot;&gt;Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft). | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="clearSubscriptionDraft"></a>
# **clearSubscriptionDraft**
> SubscriptionRuntimeSubscription clearSubscriptionDraft(subscriptionId)

Delete subscription draft

Delete subscription draft

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    try {
      SubscriptionRuntimeSubscription result = apiInstance.clearSubscriptionDraft(subscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#clearSubscriptionDraft");
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
| **subscriptionId** | **String**|  | |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="convertToOrder"></a>
# **convertToOrder**
> Order convertToOrder(subscriptionId)

Convert To Order

Convert the subscription to order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    try {
      Order result = apiInstance.convertToOrder(subscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#convertToOrder");
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
| **subscriptionId** | **String**| The subscription identifier. | |

### Return type

[**Order**](Order.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createSubscription"></a>
# **createSubscription**
> SubscriptionRuntimeSubscription createSubscription(subscriptionRuntimeSubscription)

Creates Subscription

Creates and validates a new subscription.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    SubscriptionRuntimeSubscription subscriptionRuntimeSubscription = new SubscriptionRuntimeSubscription(); // SubscriptionRuntimeSubscription | The subscription.
    try {
      SubscriptionRuntimeSubscription result = apiInstance.createSubscription(subscriptionRuntimeSubscription);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#createSubscription");
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
| **subscriptionRuntimeSubscription** | [**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)| The subscription. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteSubscriptionData"></a>
# **deleteSubscriptionData**
> Object deleteSubscriptionData(subscriptionId, subscriptionDataId)

Delete Subscription Data

Delete Value of the given Key in the SubscriptionData bag.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Unique Identifier of the Subscription you want to Delete the Databag for
    String subscriptionDataId = "subscriptionDataId_example"; // String | URLEncoded Key for the Value you want to Delete from the Subscription DataBag
    try {
      Object result = apiInstance.deleteSubscriptionData(subscriptionId, subscriptionDataId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#deleteSubscriptionData");
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
| **subscriptionId** | **String**| Unique Identifier of the Subscription you want to Delete the Databag for | |
| **subscriptionDataId** | **String**| URLEncoded Key for the Value you want to Delete from the Subscription DataBag | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteSubscriptionItem"></a>
# **deleteSubscriptionItem**
> SubscriptionRuntimeSubscription deleteSubscriptionItem(subscriptionId, subscriptionItemId, updateMode, subscriptionReason)

Delete Subscription Item

Removes a particular subscription item from the subscription

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | subscription id
    String subscriptionItemId = "subscriptionItemId_example"; // String | subscription item id
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    SubscriptionReason subscriptionReason = new SubscriptionReason(); // SubscriptionReason | cancellation reason
    try {
      SubscriptionRuntimeSubscription result = apiInstance.deleteSubscriptionItem(subscriptionId, subscriptionItemId, updateMode, subscriptionReason);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#deleteSubscriptionItem");
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
| **subscriptionId** | **String**| subscription id | |
| **subscriptionItemId** | **String**| subscription item id | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft). | [optional] |
| **subscriptionReason** | [**SubscriptionReason**](SubscriptionReason.md)| cancellation reason | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteSubscriptionItemData"></a>
# **deleteSubscriptionItemData**
> Object deleteSubscriptionItemData(subscriptionId, subscriptionItemId, subscriptionItemDataId)

Delete Subscription Item Data

Deletes the Value of the given Key in the SubscriptionItem Data bag.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Unique Identifier of the Subscription you want to get the Items for
    String subscriptionItemId = "subscriptionItemId_example"; // String | Unique Identifier of the SubscriptionItem you want to delete the Databag for
    String subscriptionItemDataId = "subscriptionItemDataId_example"; // String | URLEncoded Key for the Value you want to Delete from the SubscriptionItem DataBag
    try {
      Object result = apiInstance.deleteSubscriptionItemData(subscriptionId, subscriptionItemId, subscriptionItemDataId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#deleteSubscriptionItemData");
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
| **subscriptionId** | **String**| Unique Identifier of the Subscription you want to get the Items for | |
| **subscriptionItemId** | **String**| Unique Identifier of the SubscriptionItem you want to delete the Databag for | |
| **subscriptionItemDataId** | **String**| URLEncoded Key for the Value you want to Delete from the SubscriptionItem DataBag | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAvailableShipmentMethods"></a>
# **getAvailableShipmentMethods**
> List&lt;CommerceRuntimeShippingRate&gt; getAvailableShipmentMethods(subscriptionId, draft)

Get Available Shipment Methods

Gets valid shipping methods for subscription

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    Boolean draft = true; // Boolean | 
    try {
      List<CommerceRuntimeShippingRate> result = apiInstance.getAvailableShipmentMethods(subscriptionId, draft);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getAvailableShipmentMethods");
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
| **subscriptionId** | **String**|  | |
| **draft** | **Boolean**|  | [optional] |

### Return type

[**List&lt;CommerceRuntimeShippingRate&gt;**](CommerceRuntimeShippingRate.md)

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
> SubscriptionReasonCollection getReasons(category)

Get Reasons

Gets available subscription action reasons for the given category. If no category is supplied will give available Cancel action reasons.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String category = "CANCEL"; // String | Action to get available reasons for. Defaults to CANCEL
    try {
      SubscriptionReasonCollection result = apiInstance.getReasons(category);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getReasons");
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
| **category** | **String**| Action to get available reasons for. Defaults to CANCEL | [optional] [default to CANCEL] |

### Return type

[**SubscriptionReasonCollection**](SubscriptionReasonCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSubscription"></a>
# **getSubscription**
> SubscriptionRuntimeSubscription getSubscription(subscriptionId, draft)

Gets Subscription

Retrieves the details of a subscription specified by the subscription ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    Boolean draft = true; // Boolean | return draft version of subscription.
    try {
      SubscriptionRuntimeSubscription result = apiInstance.getSubscription(subscriptionId, draft);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getSubscription");
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
| **subscriptionId** | **String**| The subscription identifier. | |
| **draft** | **Boolean**| return draft version of subscription. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSubscriptionData"></a>
# **getSubscriptionData**
> Object getSubscriptionData(subscriptionId)

Get subscription Data

Retrieves all the values in the Subscription Data bag

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Unique Identifier of the Subscription whose Data you want to get
    try {
      Object result = apiInstance.getSubscriptionData(subscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getSubscriptionData");
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
| **subscriptionId** | **String**| Unique Identifier of the Subscription whose Data you want to get | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSubscriptionItemData"></a>
# **getSubscriptionItemData**
> Object getSubscriptionItemData(subscriptionId, subscriptionItemId)

Get Subscription Item Data

Retrieves a specific value in the SubscriptionItem Data bag.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Unique Identifier of the Subscription you want to get the Subscription Items for
    String subscriptionItemId = "subscriptionItemId_example"; // String | Unique Identifier of the SubscriptionItem whose Data you want to get
    try {
      Object result = apiInstance.getSubscriptionItemData(subscriptionId, subscriptionItemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getSubscriptionItemData");
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
| **subscriptionId** | **String**| Unique Identifier of the Subscription you want to get the Subscription Items for | |
| **subscriptionItemId** | **String**| Unique Identifier of the SubscriptionItem whose Data you want to get | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSubscriptions"></a>
# **getSubscriptions**
> SubscriptionRuntimeSubscriptionCollection getSubscriptions(startIndex, pageSize, sortBy, filter, q, qLimit)

Get Subscriptions

Retrieves a list of subscriptions according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    Integer startIndex = 56; // Integer | The start index.
    Integer pageSize = 56; // Integer | Size of the page.
    String sortBy = "sortBy_example"; // String | The sort by.
    String filter = "filter_example"; // String | The filter.
    String q = "q_example"; // String | The q.
    Integer qLimit = 56; // Integer | The q limit.
    try {
      SubscriptionRuntimeSubscriptionCollection result = apiInstance.getSubscriptions(startIndex, pageSize, sortBy, filter, q, qLimit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getSubscriptions");
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
| **startIndex** | **Integer**| The start index. | [optional] |
| **pageSize** | **Integer**| Size of the page. | [optional] |
| **sortBy** | **String**| The sort by. | [optional] |
| **filter** | **String**| The filter. | [optional] |
| **q** | **String**| The q. | [optional] |
| **qLimit** | **Integer**| The q limit. | [optional] |

### Return type

[**SubscriptionRuntimeSubscriptionCollection**](SubscriptionRuntimeSubscriptionCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="orderNow"></a>
# **orderNow**
> SubscriptionRuntimeSubscription orderNow(subscriptionId)

Order Now

Lets the user place an instant order from the subscription.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    try {
      SubscriptionRuntimeSubscription result = apiInstance.orderNow(subscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#orderNow");
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
| **subscriptionId** | **String**|  | |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="orderPartialSubscription"></a>
# **orderPartialSubscription**
> SubscriptionRuntimeSubscription orderPartialSubscription(subscriptionId)

Order Partial Subscription

Lets the user place an order from Partial Draft.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    try {
      SubscriptionRuntimeSubscription result = apiInstance.orderPartialSubscription(subscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#orderPartialSubscription");
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
| **subscriptionId** | **String**|  | |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="performSubscriptionAction"></a>
# **performSubscriptionAction**
> SubscriptionRuntimeSubscription performSubscriptionAction(subscriptionId, subscriptionAction)

Perform Subscription Action

Perform the specified action on subscription. Available actions are Activate, Pause, and Cancel.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    SubscriptionAction subscriptionAction = new SubscriptionAction(); // SubscriptionAction | Action to perform, which can be \"Activate,\" \"Pause,\" \"Cancel\".
    try {
      SubscriptionRuntimeSubscription result = apiInstance.performSubscriptionAction(subscriptionId, subscriptionAction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#performSubscriptionAction");
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
| **subscriptionId** | **String**| The subscription identifier. | |
| **subscriptionAction** | [**SubscriptionAction**](SubscriptionAction.md)| Action to perform, which can be \&quot;Activate,\&quot; \&quot;Pause,\&quot; \&quot;Cancel\&quot;. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeCoupon"></a>
# **removeCoupon**
> SubscriptionRuntimeSubscription removeCoupon(subscriptionId, updateMode, subscriptionCoupons)

Remove coupons from subscription and draft

Remove coupons from subscription and draft

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    SubscriptionCoupons subscriptionCoupons = new SubscriptionCoupons(); // SubscriptionCoupons | CouponCodes
    try {
      SubscriptionRuntimeSubscription result = apiInstance.removeCoupon(subscriptionId, updateMode, subscriptionCoupons);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#removeCoupon");
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
| **subscriptionId** | **String**|  | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft). | [optional] |
| **subscriptionCoupons** | [**SubscriptionCoupons**](SubscriptionCoupons.md)| CouponCodes | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeOneTimeCoupon"></a>
# **removeOneTimeCoupon**
> SubscriptionRuntimeSubscription removeOneTimeCoupon(subscriptionId, updateMode, subscriptionCoupons)

Remove one time coupons from subscription

Remove one time coupons from subscription

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    SubscriptionCoupons subscriptionCoupons = new SubscriptionCoupons(); // SubscriptionCoupons | CouponCodes
    try {
      SubscriptionRuntimeSubscription result = apiInstance.removeOneTimeCoupon(subscriptionId, updateMode, subscriptionCoupons);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#removeOneTimeCoupon");
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
| **subscriptionId** | **String**|  | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft). | [optional] |
| **subscriptionCoupons** | [**SubscriptionCoupons**](SubscriptionCoupons.md)| CouponCodes | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="skipSubscription"></a>
# **skipSubscription**
> SubscriptionRuntimeSubscription skipSubscription(subscriptionId)

Skip Subscription

Skips the next continuity order for the subscription.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    try {
      SubscriptionRuntimeSubscription result = apiInstance.skipSubscription(subscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#skipSubscription");
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
| **subscriptionId** | **String**| The subscription identifier. | |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateAdjustments"></a>
# **updateAdjustments**
> SubscriptionRuntimeSubscription updateAdjustments(subscriptionId, subscriptionAdjustment)

Update Adjustments

Update item, shipping and handling adjustments on the subscription.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    SubscriptionAdjustment subscriptionAdjustment = new SubscriptionAdjustment(); // SubscriptionAdjustment | Adjustments for subscription.
    try {
      SubscriptionRuntimeSubscription result = apiInstance.updateAdjustments(subscriptionId, subscriptionAdjustment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateAdjustments");
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
| **subscriptionId** | **String**| The subscription identifier. | |
| **subscriptionAdjustment** | [**SubscriptionAdjustment**](SubscriptionAdjustment.md)| Adjustments for subscription. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateFulfillmentInfo"></a>
# **updateFulfillmentInfo**
> FulfillmentInfo updateFulfillmentInfo(subscriptionId, updateMode, fulfillmentInfo)

Update Fulfillment Info

Modifies the Fulfillment Info for a subscription.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    FulfillmentInfo fulfillmentInfo = new FulfillmentInfo(); // FulfillmentInfo | New fulfillment info for subscription.
    try {
      FulfillmentInfo result = apiInstance.updateFulfillmentInfo(subscriptionId, updateMode, fulfillmentInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateFulfillmentInfo");
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
| **subscriptionId** | **String**| The subscription identifier. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft). | [optional] |
| **fulfillmentInfo** | [**FulfillmentInfo**](FulfillmentInfo.md)| New fulfillment info for subscription. | [optional] |

### Return type

[**FulfillmentInfo**](FulfillmentInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateItemQuantity"></a>
# **updateItemQuantity**
> SubscriptionRuntimeSubscription updateItemQuantity(subscriptionId, subscriptionItemId, quantity, updateMode, subscriptionReason)

Update Item Quantity

Update Item Quantity on existing subscription.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | subscription id
    String subscriptionItemId = "subscriptionItemId_example"; // String | subscription item id
    Integer quantity = 56; // Integer | New quantity for the specified subscription item.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    SubscriptionReason subscriptionReason = new SubscriptionReason(); // SubscriptionReason | cancellation reason if item quantity is decreased.
    try {
      SubscriptionRuntimeSubscription result = apiInstance.updateItemQuantity(subscriptionId, subscriptionItemId, quantity, updateMode, subscriptionReason);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateItemQuantity");
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
| **subscriptionId** | **String**| subscription id | |
| **subscriptionItemId** | **String**| subscription item id | |
| **quantity** | **Integer**| New quantity for the specified subscription item. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft). | [optional] |
| **subscriptionReason** | [**SubscriptionReason**](SubscriptionReason.md)| cancellation reason if item quantity is decreased. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateNextOrderDate"></a>
# **updateNextOrderDate**
> SubscriptionRuntimeSubscription updateNextOrderDate(subscriptionId, subscriptionNextOrderDate)

Update Next Order Date

Updates the next order date on an existing subscription

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    SubscriptionNextOrderDate subscriptionNextOrderDate = new SubscriptionNextOrderDate(); // SubscriptionNextOrderDate | The Next Order date to be set.
    try {
      SubscriptionRuntimeSubscription result = apiInstance.updateNextOrderDate(subscriptionId, subscriptionNextOrderDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateNextOrderDate");
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
| **subscriptionId** | **String**| The subscription identifier. | |
| **subscriptionNextOrderDate** | [**SubscriptionNextOrderDate**](SubscriptionNextOrderDate.md)| The Next Order date to be set. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updatePayment"></a>
# **updatePayment**
> SubscriptionRuntimeSubscription updatePayment(subscriptionId, updateMode, payment)

Update Payment

Updates the payment on the subscription.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    Payment payment = new Payment(); // Payment | The new payment to be applied.
    try {
      SubscriptionRuntimeSubscription result = apiInstance.updatePayment(subscriptionId, updateMode, payment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updatePayment");
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
| **subscriptionId** | **String**| The subscription identifier. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft). | [optional] |
| **payment** | [**Payment**](Payment.md)| The new payment to be applied. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSubscription"></a>
# **updateSubscription**
> SubscriptionRuntimeSubscription updateSubscription(subscriptionId, subscriptionRuntimeSubscription)

Update Subscription

Update the info for an existing subscription

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    SubscriptionRuntimeSubscription subscriptionRuntimeSubscription = new SubscriptionRuntimeSubscription(); // SubscriptionRuntimeSubscription | The subscription.
    try {
      SubscriptionRuntimeSubscription result = apiInstance.updateSubscription(subscriptionId, subscriptionRuntimeSubscription);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateSubscription");
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
| **subscriptionId** | **String**| The subscription identifier. | |
| **subscriptionRuntimeSubscription** | [**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)| The subscription. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSubscriptionData"></a>
# **updateSubscriptionData**
> Object updateSubscriptionData(subscriptionId, subscriptionDataId, body)

Update Subscription Data

Insert / Updates the Value of the given Key in the Subscription Data bag.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Unique Identifier of the Subscription you want to insert / update the Databag for
    String subscriptionDataId = "subscriptionDataId_example"; // String | URLEncoded Key for the Value you want to Insert / Update from the Subscription DataBag
    Object body = null; // Object | Data Object you are trying to insert / update
    try {
      Object result = apiInstance.updateSubscriptionData(subscriptionId, subscriptionDataId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateSubscriptionData");
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
| **subscriptionId** | **String**| Unique Identifier of the Subscription you want to insert / update the Databag for | |
| **subscriptionDataId** | **String**| URLEncoded Key for the Value you want to Insert / Update from the Subscription DataBag | |
| **body** | **Object**| Data Object you are trying to insert / update | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSubscriptionFrequency"></a>
# **updateSubscriptionFrequency**
> SubscriptionRuntimeSubscription updateSubscriptionFrequency(subscriptionId, frequency)

Update Subscription Frequency

Update the frequency on an existing subscription

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    Frequency frequency = new Frequency(); // Frequency | The requested frequency for update
    try {
      SubscriptionRuntimeSubscription result = apiInstance.updateSubscriptionFrequency(subscriptionId, frequency);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateSubscriptionFrequency");
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
| **subscriptionId** | **String**| The subscription identifier. | |
| **frequency** | [**Frequency**](Frequency.md)| The requested frequency for update | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSubscriptionItemData"></a>
# **updateSubscriptionItemData**
> Object updateSubscriptionItemData(subscriptionId, subscriptionItemId, subscriptionItemDataId, body)

Update Subscription Item Data

Insert / Updates the Value of the given Key in the SubscriptionItem Data bag.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Unique Identifier of the Subscription you want to get the Items for
    String subscriptionItemId = "subscriptionItemId_example"; // String | Unique Identifier of the SubscriptionItem you want to Insert / Update the Databag for
    String subscriptionItemDataId = "subscriptionItemDataId_example"; // String | URLEncoded Key for the Value you want to Insert / Update from the SubscriptionItem DataBag
    Object body = null; // Object | Data Object you are trying to insert / update
    try {
      Object result = apiInstance.updateSubscriptionItemData(subscriptionId, subscriptionItemId, subscriptionItemDataId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateSubscriptionItemData");
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
| **subscriptionId** | **String**| Unique Identifier of the Subscription you want to get the Items for | |
| **subscriptionItemId** | **String**| Unique Identifier of the SubscriptionItem you want to Insert / Update the Databag for | |
| **subscriptionItemDataId** | **String**| URLEncoded Key for the Value you want to Insert / Update from the SubscriptionItem DataBag | |
| **body** | **Object**| Data Object you are trying to insert / update | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="upsertInventoryTags"></a>
# **upsertInventoryTags**
> SubscriptionRuntimeSubscription upsertInventoryTags(subscriptionId, subscriptionItemId, updateMode, inventoryTags)

Upsert Inventory Tags

Upsert Inventory Tags

### Example
```java
// Import classes:
import com.kibocommerce.sdk.subscription.ApiClient;
import com.kibocommerce.sdk.subscription.ApiException;
import com.kibocommerce.sdk.subscription.Configuration;
import com.kibocommerce.sdk.subscription.auth.*;
import com.kibocommerce.sdk.subscription.models.*;
import com.kibocommerce.sdk.subscription.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    String subscriptionItemId = "subscriptionItemId_example"; // String | 
    String updateMode = "updateMode_example"; // String | 
    List<InventoryTags> inventoryTags = Arrays.asList(); // List<InventoryTags> | 
    try {
      SubscriptionRuntimeSubscription result = apiInstance.upsertInventoryTags(subscriptionId, subscriptionItemId, updateMode, inventoryTags);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#upsertInventoryTags");
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
| **subscriptionId** | **String**|  | |
| **subscriptionItemId** | **String**|  | |
| **updateMode** | **String**|  | [optional] |
| **inventoryTags** | [**List&lt;InventoryTags&gt;**](InventoryTags.md)|  | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

