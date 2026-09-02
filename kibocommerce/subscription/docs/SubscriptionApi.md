# SubscriptionApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSubscriptionItem**](SubscriptionApi.md#addSubscriptionItem) | **POST** /commerce/subscriptions/{subscriptionId}/items | Add Subscription Item |
| [**applyCoupon**](SubscriptionApi.md#applyCoupon) | **PUT** /commerce/subscriptions/{subscriptionId}/coupons/{couponCode} | Apply Coupon |
| [**changePricelistOnSubscription**](SubscriptionApi.md#changePricelistOnSubscription) | **PUT** /commerce/subscriptions/{subscriptionId}/priceList | Change Pricelist On Subscription |
| [**clearSubscriptionDraft**](SubscriptionApi.md#clearSubscriptionDraft) | **PUT** /commerce/subscriptions/{subscriptionId}/cleardraft | Delete Subscription Draft |
| [**convertToOrder**](SubscriptionApi.md#convertToOrder) | **PUT** /commerce/subscriptions/{subscriptionId}/converttoorder | Convert To Order |
| [**createSubscription**](SubscriptionApi.md#createSubscription) | **POST** /commerce/subscriptions | Creates Subscription |
| [**createSubscriptionAttributes**](SubscriptionApi.md#createSubscriptionAttributes) | **POST** /commerce/subscriptions/{subscriptionId}/attributes | Create Subscription Attributes |
| [**createSubscriptionLineAttributes**](SubscriptionApi.md#createSubscriptionLineAttributes) | **POST** /commerce/subscriptions/{subscriptionId}/items/{subscriptionItemId}/attributes | Create line-level attributes on a subscription item; skips FQNs that already exist |
| [**deleteSubscriptionData**](SubscriptionApi.md#deleteSubscriptionData) | **DELETE** /commerce/subscriptions/{subscriptionId}/data/{subscriptionDataId} | Delete Subscription Data |
| [**deleteSubscriptionItem**](SubscriptionApi.md#deleteSubscriptionItem) | **PUT** /commerce/subscriptions/{subscriptionId}/items/{subscriptionItemId}/remove | Delete Subscription Item |
| [**deleteSubscriptionItemData**](SubscriptionApi.md#deleteSubscriptionItemData) | **DELETE** /commerce/subscriptions/{subscriptionId}/item/{subscriptionItemId}/data/{subscriptionItemDataId} | Delete Subscription Item Data |
| [**deleteSubscriptionLineAttribute**](SubscriptionApi.md#deleteSubscriptionLineAttribute) | **DELETE** /commerce/subscriptions/{subscriptionId}/items/{subscriptionItemId}/attributes/{attributeFqn} | Delete a single line-level attribute from a subscription item by FQN |
| [**getAvailableShipmentMethods**](SubscriptionApi.md#getAvailableShipmentMethods) | **GET** /commerce/subscriptions/{subscriptionId}/shipments/methods | Get Available Shipment Methods |
| [**getReasons**](SubscriptionApi.md#getReasons) | **GET** /commerce/subscriptions/reasons | Get Reasons |
| [**getSubscription**](SubscriptionApi.md#getSubscription) | **GET** /commerce/subscriptions/{subscriptionId} | Gets Subscription |
| [**getSubscriptionAttributes**](SubscriptionApi.md#getSubscriptionAttributes) | **GET** /commerce/subscriptions/{subscriptionId}/attributes | Get Subscription Attributes |
| [**getSubscriptionData**](SubscriptionApi.md#getSubscriptionData) | **GET** /commerce/subscriptions/{subscriptionId}/data | Get Subscription Data |
| [**getSubscriptionItemData**](SubscriptionApi.md#getSubscriptionItemData) | **GET** /commerce/subscriptions/{subscriptionId}/item/{subscriptionItemId}/data | Get Subscription Item Data |
| [**getSubscriptionLineAttributes**](SubscriptionApi.md#getSubscriptionLineAttributes) | **GET** /commerce/subscriptions/{subscriptionId}/items/{subscriptionItemId}/attributes | Get all line-level attributes for a subscription item |
| [**getSubscriptions**](SubscriptionApi.md#getSubscriptions) | **GET** /commerce/subscriptions | Get Subscriptions |
| [**orderNow**](SubscriptionApi.md#orderNow) | **PUT** /commerce/subscriptions/{subscriptionId}/ordernow | Order Now |
| [**orderPartialSubscription**](SubscriptionApi.md#orderPartialSubscription) | **PUT** /commerce/subscriptions/{subscriptionId}/orderpartialdraft | Order Partial Subscription |
| [**performSubscriptionAction**](SubscriptionApi.md#performSubscriptionAction) | **PUT** /commerce/subscriptions/{subscriptionId}/actions | Perform Subscription Action |
| [**removeCoupon**](SubscriptionApi.md#removeCoupon) | **PUT** /commerce/subscriptions/{subscriptionId}/removecoupon | Remove Coupons |
| [**skipSubscription**](SubscriptionApi.md#skipSubscription) | **PUT** /commerce/subscriptions/{subscriptionId}/skip | Skip Subscription |
| [**updateAdjustments**](SubscriptionApi.md#updateAdjustments) | **POST** /commerce/subscriptions/{subscriptionId}/adjustments | Update Adjustments |
| [**updateFulfillmentInfo**](SubscriptionApi.md#updateFulfillmentInfo) | **PUT** /commerce/subscriptions/{subscriptionId}/fulfillmentinfo | Update Fulfillment Info |
| [**updateInstallmentPlan**](SubscriptionApi.md#updateInstallmentPlan) | **PUT** /commerce/subscriptions/{subscriptionId}/installmentPlan | Update Installment plan |
| [**updateItemFulfillment**](SubscriptionApi.md#updateItemFulfillment) | **PUT** /commerce/subscriptions/{subscriptionId}/items/{subscriptionItemId}/fulfillment | Update Item Fulfillment |
| [**updateItemQuantity**](SubscriptionApi.md#updateItemQuantity) | **PUT** /commerce/subscriptions/{subscriptionId}/items/{subscriptionItemId}/quantity/{quantity} | Update Item Quantity |
| [**updateNextOrderDate**](SubscriptionApi.md#updateNextOrderDate) | **PUT** /commerce/subscriptions/{subscriptionId}/nextorderdate | Update Next Order Date |
| [**updatePayment**](SubscriptionApi.md#updatePayment) | **PUT** /commerce/subscriptions/{subscriptionId}/payment | Update Payment |
| [**updateSubscription**](SubscriptionApi.md#updateSubscription) | **PUT** /commerce/subscriptions/{subscriptionId} | Update Subscription |
| [**updateSubscriptionAttribute**](SubscriptionApi.md#updateSubscriptionAttribute) | **PUT** /commerce/subscriptions/{subscriptionId}/attributes | Update Subscription Attribute |
| [**updateSubscriptionData**](SubscriptionApi.md#updateSubscriptionData) | **PUT** /commerce/subscriptions/{subscriptionId}/data/{subscriptionDataId} | Update Subscription Data |
| [**updateSubscriptionFrequency**](SubscriptionApi.md#updateSubscriptionFrequency) | **PUT** /commerce/subscriptions/{subscriptionId}/frequency | Update Subscription Frequency |
| [**updateSubscriptionItemData**](SubscriptionApi.md#updateSubscriptionItemData) | **PUT** /commerce/subscriptions/{subscriptionId}/item/{subscriptionItemId}/data/{subscriptionItemDataId} | Update Subscription Item Data |
| [**updateSubscriptionLineAttributes**](SubscriptionApi.md#updateSubscriptionLineAttributes) | **PUT** /commerce/subscriptions/{subscriptionId}/items/{subscriptionItemId}/attributes | Upsert line-level attributes on a subscription item |
| [**upsertInventoryTags**](SubscriptionApi.md#upsertInventoryTags) | **PUT** /commerce/subscriptions/{subscriptionId}/items/{subscriptionItemId}/upsertinventorytags | Upsert Inventory Tags |


<a name="addSubscriptionItem"></a>
# **addSubscriptionItem**
> SubscriptionRuntimeSubscription addSubscriptionItem(subscriptionId, updateMode, responseFields, subscriptionItem)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | subscription id
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SubscriptionItem subscriptionItem = new SubscriptionItem(); // SubscriptionItem | subscription item to add.
    try {
      SubscriptionRuntimeSubscription result = apiInstance.addSubscriptionItem(subscriptionId, updateMode, responseFields, subscriptionItem);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionItem** | [**SubscriptionItem**](SubscriptionItem.md)| subscription item to add. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="applyCoupon"></a>
# **applyCoupon**
> SubscriptionRuntimeSubscription applyCoupon(subscriptionId, couponCode, updateMode, responseFields)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Unique identifier of the Subscription with which to associate the coupon.
    String couponCode = "couponCode_example"; // String | Coupon code that the customer supplies to get the discounted price.
    String updateMode = "updateMode_example"; // String | updateMode\">Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SubscriptionRuntimeSubscription result = apiInstance.applyCoupon(subscriptionId, couponCode, updateMode, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="changePricelistOnSubscription"></a>
# **changePricelistOnSubscription**
> SubscriptionRuntimeSubscription changePricelistOnSubscription(subscriptionId, updateMode, responseFields, subscriptionPriceList)

Change Pricelist On Subscription

Updates the price list on the subscription.

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SubscriptionPriceList subscriptionPriceList = new SubscriptionPriceList(); // SubscriptionPriceList | The price list to be applied.
    try {
      SubscriptionRuntimeSubscription result = apiInstance.changePricelistOnSubscription(subscriptionId, updateMode, responseFields, subscriptionPriceList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#changePricelistOnSubscription");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionPriceList** | [**SubscriptionPriceList**](SubscriptionPriceList.md)| The price list to be applied. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="clearSubscriptionDraft"></a>
# **clearSubscriptionDraft**
> SubscriptionRuntimeSubscription clearSubscriptionDraft(subscriptionId, responseFields)

Delete Subscription Draft

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SubscriptionRuntimeSubscription result = apiInstance.clearSubscriptionDraft(subscriptionId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="convertToOrder"></a>
# **convertToOrder**
> Order convertToOrder(subscriptionId, responseFields)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Order result = apiInstance.convertToOrder(subscriptionId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Order**](Order.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createSubscription"></a>
# **createSubscription**
> SubscriptionRuntimeSubscription createSubscription(responseFields, subscriptionRuntimeSubscription)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SubscriptionRuntimeSubscription subscriptionRuntimeSubscription = new SubscriptionRuntimeSubscription(); // SubscriptionRuntimeSubscription | The subscription.
    try {
      SubscriptionRuntimeSubscription result = apiInstance.createSubscription(responseFields, subscriptionRuntimeSubscription);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionRuntimeSubscription** | [**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)| The subscription. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createSubscriptionAttributes"></a>
# **createSubscriptionAttributes**
> List&lt;SubscriptionAttribute&gt; createSubscriptionAttributes(subscriptionId, updateMode, responseFields, subscriptionAttribute)

Create Subscription Attributes

Creates list of subscription attributes specified by subscription Id.

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    String updateMode = "updateMode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<SubscriptionAttribute> subscriptionAttribute = Arrays.asList(); // List<SubscriptionAttribute> | 
    try {
      List<SubscriptionAttribute> result = apiInstance.createSubscriptionAttributes(subscriptionId, updateMode, responseFields, subscriptionAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#createSubscriptionAttributes");
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
| **updateMode** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionAttribute** | [**List&lt;SubscriptionAttribute&gt;**](SubscriptionAttribute.md)|  | [optional] |

### Return type

[**List&lt;SubscriptionAttribute&gt;**](SubscriptionAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createSubscriptionLineAttributes"></a>
# **createSubscriptionLineAttributes**
> List&lt;SubscriptionLineAttribute&gt; createSubscriptionLineAttributes(subscriptionId, subscriptionItemId, updateMode, responseFields, subscriptionLineAttribute)

Create line-level attributes on a subscription item; skips FQNs that already exist

Create line-level attributes on a subscription item; skips FQNs that already exist.

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    String subscriptionItemId = "subscriptionItemId_example"; // String | 
    String updateMode = "updateMode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<SubscriptionLineAttribute> subscriptionLineAttribute = Arrays.asList(); // List<SubscriptionLineAttribute> | 
    try {
      List<SubscriptionLineAttribute> result = apiInstance.createSubscriptionLineAttributes(subscriptionId, subscriptionItemId, updateMode, responseFields, subscriptionLineAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#createSubscriptionLineAttributes");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionLineAttribute** | [**List&lt;SubscriptionLineAttribute&gt;**](SubscriptionLineAttribute.md)|  | [optional] |

### Return type

[**List&lt;SubscriptionLineAttribute&gt;**](SubscriptionLineAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteSubscriptionData"></a>
# **deleteSubscriptionData**
> Object deleteSubscriptionData(subscriptionId, subscriptionDataId, updateMode)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Unique Identifier of the Subscription you want to Delete the Databag for
    String subscriptionDataId = "subscriptionDataId_example"; // String | URLEncoded Key for the Value you want to Delete from the Subscription DataBag
    String updateMode = "updateMode_example"; // String | 
    try {
      Object result = apiInstance.deleteSubscriptionData(subscriptionId, subscriptionDataId, updateMode);
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
| **updateMode** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteSubscriptionItem"></a>
# **deleteSubscriptionItem**
> SubscriptionRuntimeSubscription deleteSubscriptionItem(subscriptionId, subscriptionItemId, updateMode, responseFields, subscriptionReason)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | subscription id
    String subscriptionItemId = "subscriptionItemId_example"; // String | subscription item id
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SubscriptionReason subscriptionReason = new SubscriptionReason(); // SubscriptionReason | cancellation reason
    try {
      SubscriptionRuntimeSubscription result = apiInstance.deleteSubscriptionItem(subscriptionId, subscriptionItemId, updateMode, responseFields, subscriptionReason);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionReason** | [**SubscriptionReason**](SubscriptionReason.md)| cancellation reason | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteSubscriptionItemData"></a>
# **deleteSubscriptionItemData**
> Object deleteSubscriptionItemData(subscriptionId, subscriptionItemId, subscriptionItemDataId, updateMode)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Unique Identifier of the Subscription you want to get the Items for
    String subscriptionItemId = "subscriptionItemId_example"; // String | Unique Identifier of the SubscriptionItem you want to delete the Databag for
    String subscriptionItemDataId = "subscriptionItemDataId_example"; // String | URLEncoded Key for the Value you want to Delete from the SubscriptionItem DataBag
    String updateMode = "updateMode_example"; // String | 
    try {
      Object result = apiInstance.deleteSubscriptionItemData(subscriptionId, subscriptionItemId, subscriptionItemDataId, updateMode);
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
| **updateMode** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteSubscriptionLineAttribute"></a>
# **deleteSubscriptionLineAttribute**
> deleteSubscriptionLineAttribute(subscriptionId, subscriptionItemId, attributeFqn, updateMode)

Delete a single line-level attribute from a subscription item by FQN

Delete a single line-level attribute from a subscription item by FQN.

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    String subscriptionItemId = "subscriptionItemId_example"; // String | 
    String attributeFqn = "attributeFqn_example"; // String | 
    String updateMode = "updateMode_example"; // String | 
    try {
      apiInstance.deleteSubscriptionLineAttribute(subscriptionId, subscriptionItemId, attributeFqn, updateMode);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#deleteSubscriptionLineAttribute");
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
| **attributeFqn** | **String**|  | |
| **updateMode** | **String**|  | [optional] |

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

<a name="getAvailableShipmentMethods"></a>
# **getAvailableShipmentMethods**
> List&lt;CommerceRuntimeShippingRate&gt; getAvailableShipmentMethods(subscriptionId, draft, responseFields)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    Boolean draft = true; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<CommerceRuntimeShippingRate> result = apiInstance.getAvailableShipmentMethods(subscriptionId, draft, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;CommerceRuntimeShippingRate&gt;**](CommerceRuntimeShippingRate.md)

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
> SubscriptionReasonCollection getReasons(category, responseFields)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String category = "CANCEL"; // String | Action to get available reasons for. Defaults to CANCEL
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SubscriptionReasonCollection result = apiInstance.getReasons(category, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SubscriptionReasonCollection**](SubscriptionReasonCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSubscription"></a>
# **getSubscription**
> SubscriptionRuntimeSubscription getSubscription(subscriptionId, draft, responseFields)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    Boolean draft = true; // Boolean | return draft version of subscription.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SubscriptionRuntimeSubscription result = apiInstance.getSubscription(subscriptionId, draft, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSubscriptionAttributes"></a>
# **getSubscriptionAttributes**
> List&lt;SubscriptionAttribute&gt; getSubscriptionAttributes(subscriptionId, draft, responseFields)

Get Subscription Attributes

Gets the list of attributes specified by subscription Id.

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    Boolean draft = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<SubscriptionAttribute> result = apiInstance.getSubscriptionAttributes(subscriptionId, draft, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getSubscriptionAttributes");
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
| **draft** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;SubscriptionAttribute&gt;**](SubscriptionAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSubscriptionData"></a>
# **getSubscriptionData**
> Object getSubscriptionData(subscriptionId, draft, responseFields)

Get Subscription Data

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Unique Identifier of the Subscription whose Data you want to get
    Boolean draft = true; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Object result = apiInstance.getSubscriptionData(subscriptionId, draft, responseFields);
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
| **draft** | **Boolean**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSubscriptionItemData"></a>
# **getSubscriptionItemData**
> Object getSubscriptionItemData(subscriptionId, subscriptionItemId, draft, responseFields)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Unique Identifier of the Subscription you want to get the Subscription Items for
    String subscriptionItemId = "subscriptionItemId_example"; // String | Unique Identifier of the SubscriptionItem whose Data you want to get
    Boolean draft = true; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Object result = apiInstance.getSubscriptionItemData(subscriptionId, subscriptionItemId, draft, responseFields);
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
| **draft** | **Boolean**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSubscriptionLineAttributes"></a>
# **getSubscriptionLineAttributes**
> List&lt;SubscriptionLineAttribute&gt; getSubscriptionLineAttributes(subscriptionId, subscriptionItemId, draft, responseFields)

Get all line-level attributes for a subscription item

Get all line-level attributes for a subscription item.

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    String subscriptionItemId = "subscriptionItemId_example"; // String | 
    Boolean draft = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<SubscriptionLineAttribute> result = apiInstance.getSubscriptionLineAttributes(subscriptionId, subscriptionItemId, draft, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getSubscriptionLineAttributes");
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
| **draft** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;SubscriptionLineAttribute&gt;**](SubscriptionLineAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSubscriptions"></a>
# **getSubscriptions**
> SubscriptionRuntimeSubscriptionCollection getSubscriptions(startIndex, pageSize, sortBy, filter, q, qLimit, responseFields)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    Integer startIndex = 56; // Integer | The start index.
    Integer pageSize = 56; // Integer | Size of the page.
    String sortBy = "sortBy_example"; // String | The sort by.
    String filter = "filter_example"; // String | The filter.
    String q = "q_example"; // String | The q.
    Integer qLimit = 56; // Integer | The q limit.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SubscriptionRuntimeSubscriptionCollection result = apiInstance.getSubscriptions(startIndex, pageSize, sortBy, filter, q, qLimit, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SubscriptionRuntimeSubscriptionCollection**](SubscriptionRuntimeSubscriptionCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="orderNow"></a>
# **orderNow**
> SubscriptionRuntimeSubscription orderNow(subscriptionId, responseFields)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SubscriptionRuntimeSubscription result = apiInstance.orderNow(subscriptionId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="orderPartialSubscription"></a>
# **orderPartialSubscription**
> SubscriptionRuntimeSubscription orderPartialSubscription(subscriptionId, responseFields)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SubscriptionRuntimeSubscription result = apiInstance.orderPartialSubscription(subscriptionId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="performSubscriptionAction"></a>
# **performSubscriptionAction**
> SubscriptionRuntimeSubscription performSubscriptionAction(subscriptionId, responseFields, subscriptionAction)

Perform Subscription Action

Perform the specified action on subscription. Available actions are Activate, Pause, Cancel, and RetryFailedContinuityOrder.

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SubscriptionAction subscriptionAction = new SubscriptionAction(); // SubscriptionAction | Action to perform, which can be \"Activate,\" \"Pause,\" \"Cancel\".
    try {
      SubscriptionRuntimeSubscription result = apiInstance.performSubscriptionAction(subscriptionId, responseFields, subscriptionAction);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionAction** | [**SubscriptionAction**](SubscriptionAction.md)| Action to perform, which can be \&quot;Activate,\&quot; \&quot;Pause,\&quot; \&quot;Cancel\&quot;. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeCoupon"></a>
# **removeCoupon**
> SubscriptionRuntimeSubscription removeCoupon(subscriptionId, updateMode, responseFields, subscriptionCoupons)

Remove Coupons

Removes existing coupons from a subscription.

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SubscriptionCoupons subscriptionCoupons = new SubscriptionCoupons(); // SubscriptionCoupons | CouponCodes
    try {
      SubscriptionRuntimeSubscription result = apiInstance.removeCoupon(subscriptionId, updateMode, responseFields, subscriptionCoupons);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionCoupons** | [**SubscriptionCoupons**](SubscriptionCoupons.md)| CouponCodes | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="skipSubscription"></a>
# **skipSubscription**
> SubscriptionRuntimeSubscription skipSubscription(subscriptionId, responseFields)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SubscriptionRuntimeSubscription result = apiInstance.skipSubscription(subscriptionId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateAdjustments"></a>
# **updateAdjustments**
> SubscriptionRuntimeSubscription updateAdjustments(subscriptionId, responseFields, subscriptionAdjustment)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SubscriptionAdjustment subscriptionAdjustment = new SubscriptionAdjustment(); // SubscriptionAdjustment | Adjustments for subscription.
    try {
      SubscriptionRuntimeSubscription result = apiInstance.updateAdjustments(subscriptionId, responseFields, subscriptionAdjustment);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionAdjustment** | [**SubscriptionAdjustment**](SubscriptionAdjustment.md)| Adjustments for subscription. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateFulfillmentInfo"></a>
# **updateFulfillmentInfo**
> FulfillmentInfo updateFulfillmentInfo(subscriptionId, updateMode, responseFields, fulfillmentInfo)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    FulfillmentInfo fulfillmentInfo = new FulfillmentInfo(); // FulfillmentInfo | New fulfillment info for subscription.
    try {
      FulfillmentInfo result = apiInstance.updateFulfillmentInfo(subscriptionId, updateMode, responseFields, fulfillmentInfo);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **fulfillmentInfo** | [**FulfillmentInfo**](FulfillmentInfo.md)| New fulfillment info for subscription. | [optional] |

### Return type

[**FulfillmentInfo**](FulfillmentInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateInstallmentPlan"></a>
# **updateInstallmentPlan**
> SubscriptionRuntimeSubscription updateInstallmentPlan(subscriptionId, updateMode, responseFields, installmentPlanRequest)

Update Installment plan

Updates the installment plan on the subscription.

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    InstallmentPlanRequest installmentPlanRequest = new InstallmentPlanRequest(); // InstallmentPlanRequest | 
    try {
      SubscriptionRuntimeSubscription result = apiInstance.updateInstallmentPlan(subscriptionId, updateMode, responseFields, installmentPlanRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateInstallmentPlan");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **installmentPlanRequest** | [**InstallmentPlanRequest**](InstallmentPlanRequest.md)|  | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateItemFulfillment"></a>
# **updateItemFulfillment**
> SubscriptionRuntimeSubscription updateItemFulfillment(subscriptionId, subscriptionItemId, updateMode, responseFields, subscriptionItem)

Update Item Fulfillment

Update an item&#39;s fulfillment type on an existing subscription.

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | subscription id
    String subscriptionItemId = "subscriptionItemId_example"; // String | subscription item id
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SubscriptionItem subscriptionItem = new SubscriptionItem(); // SubscriptionItem | subscription item id
    try {
      SubscriptionRuntimeSubscription result = apiInstance.updateItemFulfillment(subscriptionId, subscriptionItemId, updateMode, responseFields, subscriptionItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateItemFulfillment");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionItem** | [**SubscriptionItem**](SubscriptionItem.md)| subscription item id | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateItemQuantity"></a>
# **updateItemQuantity**
> SubscriptionRuntimeSubscription updateItemQuantity(subscriptionId, subscriptionItemId, quantity, updateMode, responseFields, subscriptionReason)

Update Item Quantity

Updates an item&#39;s quantity on a existing subscription.

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | subscription id
    String subscriptionItemId = "subscriptionItemId_example"; // String | subscription item id
    Integer quantity = 56; // Integer | New quantity for the specified subscription item.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SubscriptionReason subscriptionReason = new SubscriptionReason(); // SubscriptionReason | cancellation reason if item quantity is decreased.
    try {
      SubscriptionRuntimeSubscription result = apiInstance.updateItemQuantity(subscriptionId, subscriptionItemId, quantity, updateMode, responseFields, subscriptionReason);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionReason** | [**SubscriptionReason**](SubscriptionReason.md)| cancellation reason if item quantity is decreased. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateNextOrderDate"></a>
# **updateNextOrderDate**
> SubscriptionRuntimeSubscription updateNextOrderDate(subscriptionId, responseFields, subscriptionNextOrderDate)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SubscriptionNextOrderDate subscriptionNextOrderDate = new SubscriptionNextOrderDate(); // SubscriptionNextOrderDate | The Next Order date to be set.
    try {
      SubscriptionRuntimeSubscription result = apiInstance.updateNextOrderDate(subscriptionId, responseFields, subscriptionNextOrderDate);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionNextOrderDate** | [**SubscriptionNextOrderDate**](SubscriptionNextOrderDate.md)| The Next Order date to be set. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updatePayment"></a>
# **updatePayment**
> SubscriptionRuntimeSubscription updatePayment(subscriptionId, updateMode, responseFields, payment)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyToOriginal, ApplyToDraft).
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Payment payment = new Payment(); // Payment | The new payment to be applied.
    try {
      SubscriptionRuntimeSubscription result = apiInstance.updatePayment(subscriptionId, updateMode, responseFields, payment);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **payment** | [**Payment**](Payment.md)| The new payment to be applied. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSubscription"></a>
# **updateSubscription**
> SubscriptionRuntimeSubscription updateSubscription(subscriptionId, responseFields, subscriptionRuntimeSubscription)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SubscriptionRuntimeSubscription subscriptionRuntimeSubscription = new SubscriptionRuntimeSubscription(); // SubscriptionRuntimeSubscription | The subscription.
    try {
      SubscriptionRuntimeSubscription result = apiInstance.updateSubscription(subscriptionId, responseFields, subscriptionRuntimeSubscription);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionRuntimeSubscription** | [**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)| The subscription. | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSubscriptionAttribute"></a>
# **updateSubscriptionAttribute**
> List&lt;SubscriptionAttribute&gt; updateSubscriptionAttribute(subscriptionId, removeMissing, updateMode, responseFields, subscriptionAttribute)

Update Subscription Attribute

Updates the list of subscription attributes specified by subscription id and removes the missing attributes if not passed when removeMissing flag is set.

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    Boolean removeMissing = false; // Boolean | 
    String updateMode = "updateMode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<SubscriptionAttribute> subscriptionAttribute = Arrays.asList(); // List<SubscriptionAttribute> | 
    try {
      List<SubscriptionAttribute> result = apiInstance.updateSubscriptionAttribute(subscriptionId, removeMissing, updateMode, responseFields, subscriptionAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateSubscriptionAttribute");
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
| **removeMissing** | **Boolean**|  | [optional] [default to false] |
| **updateMode** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionAttribute** | [**List&lt;SubscriptionAttribute&gt;**](SubscriptionAttribute.md)|  | [optional] |

### Return type

[**List&lt;SubscriptionAttribute&gt;**](SubscriptionAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSubscriptionData"></a>
# **updateSubscriptionData**
> Object updateSubscriptionData(subscriptionId, subscriptionDataId, updateMode, responseFields, body)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Unique Identifier of the Subscription you want to insert / update the Databag for
    String subscriptionDataId = "subscriptionDataId_example"; // String | URLEncoded Key for the Value you want to Insert / Update from the Subscription DataBag
    String updateMode = "updateMode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Object body = null; // Object | Data Object you are trying to insert / update
    try {
      Object result = apiInstance.updateSubscriptionData(subscriptionId, subscriptionDataId, updateMode, responseFields, body);
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
| **updateMode** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **body** | **Object**| Data Object you are trying to insert / update | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSubscriptionFrequency"></a>
# **updateSubscriptionFrequency**
> SubscriptionRuntimeSubscription updateSubscriptionFrequency(subscriptionId, responseFields, frequency)

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | The subscription identifier.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Frequency frequency = new Frequency(); // Frequency | The requested frequency for update
    try {
      SubscriptionRuntimeSubscription result = apiInstance.updateSubscriptionFrequency(subscriptionId, responseFields, frequency);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **frequency** | [**Frequency**](Frequency.md)| The requested frequency for update | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSubscriptionItemData"></a>
# **updateSubscriptionItemData**
> Object updateSubscriptionItemData(subscriptionId, subscriptionItemId, subscriptionItemDataId, updateMode, responseFields, body)

Update Subscription Item Data

Updates the value of the given key on a subscription item bag.

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Unique Identifier of the Subscription you want to get the Items for
    String subscriptionItemId = "subscriptionItemId_example"; // String | Unique Identifier of the SubscriptionItem you want to Insert / Update the Databag for
    String subscriptionItemDataId = "subscriptionItemDataId_example"; // String | URLEncoded Key for the Value you want to Insert / Update from the SubscriptionItem DataBag
    String updateMode = "updateMode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Object body = null; // Object | Data Object you are trying to insert / update
    try {
      Object result = apiInstance.updateSubscriptionItemData(subscriptionId, subscriptionItemId, subscriptionItemDataId, updateMode, responseFields, body);
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
| **updateMode** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **body** | **Object**| Data Object you are trying to insert / update | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSubscriptionLineAttributes"></a>
# **updateSubscriptionLineAttributes**
> List&lt;SubscriptionLineAttribute&gt; updateSubscriptionLineAttributes(subscriptionId, subscriptionItemId, removeMissing, updateMode, responseFields, subscriptionLineAttribute)

Upsert line-level attributes on a subscription item

Upsert line-level attributes on a subscription item.

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    String subscriptionItemId = "subscriptionItemId_example"; // String | 
    Boolean removeMissing = false; // Boolean | 
    String updateMode = "updateMode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<SubscriptionLineAttribute> subscriptionLineAttribute = Arrays.asList(); // List<SubscriptionLineAttribute> | 
    try {
      List<SubscriptionLineAttribute> result = apiInstance.updateSubscriptionLineAttributes(subscriptionId, subscriptionItemId, removeMissing, updateMode, responseFields, subscriptionLineAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateSubscriptionLineAttributes");
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
| **removeMissing** | **Boolean**|  | [optional] [default to false] |
| **updateMode** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionLineAttribute** | [**List&lt;SubscriptionLineAttribute&gt;**](SubscriptionLineAttribute.md)|  | [optional] |

### Return type

[**List&lt;SubscriptionLineAttribute&gt;**](SubscriptionLineAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="upsertInventoryTags"></a>
# **upsertInventoryTags**
> SubscriptionRuntimeSubscription upsertInventoryTags(subscriptionId, subscriptionItemId, updateMode, responseFields, inventoryTags)

Upsert Inventory Tags

Updates and replaces inventory tags.

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    String subscriptionItemId = "subscriptionItemId_example"; // String | 
    String updateMode = "updateMode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<InventoryTags> inventoryTags = Arrays.asList(); // List<InventoryTags> | 
    try {
      SubscriptionRuntimeSubscription result = apiInstance.upsertInventoryTags(subscriptionId, subscriptionItemId, updateMode, responseFields, inventoryTags);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **inventoryTags** | [**List&lt;InventoryTags&gt;**](InventoryTags.md)|  | [optional] |

### Return type

[**SubscriptionRuntimeSubscription**](SubscriptionRuntimeSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

