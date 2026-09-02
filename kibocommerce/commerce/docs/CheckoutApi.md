# CheckoutApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCheckoutItem**](CheckoutApi.md#addCheckoutItem) | **POST** /commerce/checkouts/{checkoutId}/items | Add Checkout Item |
| [**addDestination**](CheckoutApi.md#addDestination) | **POST** /commerce/checkouts/{checkoutId}/destinations | Add Destination |
| [**applyCoupon**](CheckoutApi.md#applyCoupon) | **PUT** /commerce/checkouts/{checkoutId}/coupons/{couponCode} | Apply Coupon |
| [**bulkUpdateDeliveryDates**](CheckoutApi.md#bulkUpdateDeliveryDates) | **POST** /commerce/checkouts/{checkoutId}/items/deliverydates | Update Delivery Dates of Items in bulk |
| [**bulkUpdateItemDestinations**](CheckoutApi.md#bulkUpdateItemDestinations) | **POST** /commerce/checkouts/{checkoutId}/items/destinations | Bulk Update Item Destinations |
| [**changeCheckoutPriceList**](CheckoutApi.md#changeCheckoutPriceList) | **PUT** /commerce/checkouts/{checkoutId}/priceList | Change Checkout Price List |
| [**createCheckoutAttributes**](CheckoutApi.md#createCheckoutAttributes) | **POST** /commerce/checkouts/{checkoutId}/attributes | Create Checkout Attributes |
| [**createCheckoutFromCart**](CheckoutApi.md#createCheckoutFromCart) | **POST** /commerce/checkouts | Create Checkout From Cart |
| [**createPaymentAction**](CheckoutApi.md#createPaymentAction) | **POST** /commerce/checkouts/{checkoutId}/payments/actions | Create Payment Action |
| [**deleteCheckoutItem**](CheckoutApi.md#deleteCheckoutItem) | **DELETE** /commerce/checkouts/{checkoutId}/items/{itemId} | Delete Checkout Item |
| [**getAvailableActions**](CheckoutApi.md#getAvailableActions) | **GET** /commerce/checkouts/{checkoutId}/actions | Get Available Actions |
| [**getAvailableShippingMethods**](CheckoutApi.md#getAvailableShippingMethods) | **GET** /commerce/checkouts/{checkoutId}/shippingMethods | Get Available Shipping Methods |
| [**getCheckout**](CheckoutApi.md#getCheckout) | **GET** /commerce/checkouts/{checkoutId} | Get Checkout |
| [**getCheckoutAttributes**](CheckoutApi.md#getCheckoutAttributes) | **GET** /commerce/checkouts/{checkoutId}/attributes | Get Checkout Attributes |
| [**getCheckouts**](CheckoutApi.md#getCheckouts) | **GET** /commerce/checkouts | Get Checkouts |
| [**getDestination**](CheckoutApi.md#getDestination) | **GET** /commerce/checkouts/{checkoutId}/destinations/{destinationId} | Get Destination |
| [**getDestinations**](CheckoutApi.md#getDestinations) | **GET** /commerce/checkouts/{checkoutId}/destinations | Get Destinations |
| [**performCheckoutAction**](CheckoutApi.md#performCheckoutAction) | **POST** /commerce/checkouts/{checkoutId}/actions | Perform Checkout Action |
| [**performPaymentAction**](CheckoutApi.md#performPaymentAction) | **POST** /commerce/checkouts/{checkoutId}/payments/{paymentId}/actions | Perform Payment Action |
| [**processDigitalWallet**](CheckoutApi.md#processDigitalWallet) | **PUT** /commerce/checkouts/{checkoutId}/digitalWallet/{digitalWalletType} | Process Digital Wallet |
| [**removeCoupon**](CheckoutApi.md#removeCoupon) | **DELETE** /commerce/checkouts/{checkoutId}/coupons/{couponCode} | Remove Coupon |
| [**removeCoupons**](CheckoutApi.md#removeCoupons) | **DELETE** /commerce/checkouts/{checkoutId}/coupons | Remove Coupons |
| [**removeDestination**](CheckoutApi.md#removeDestination) | **DELETE** /commerce/checkouts/{checkoutId}/destinations/{destinationId} | Remove Destination |
| [**resendCheckoutConfirmationEmail**](CheckoutApi.md#resendCheckoutConfirmationEmail) | **POST** /commerce/checkouts/{checkoutId}/email/resend | Resend Checkout Confirmation Email |
| [**setShippingMethods**](CheckoutApi.md#setShippingMethods) | **POST** /commerce/checkouts/{checkoutId}/shippingMethods | Set Shipping Methods |
| [**splitItem**](CheckoutApi.md#splitItem) | **POST** /commerce/checkouts/{checkoutId}/items/{itemId}/split | Split Item |
| [**updateCheckout**](CheckoutApi.md#updateCheckout) | **POST** /commerce/checkouts/{checkoutId} | Update Checkout |
| [**updateCheckoutAttribute**](CheckoutApi.md#updateCheckoutAttribute) | **PUT** /commerce/checkouts/{checkoutId}/attributes | Update Checkout Attribute |
| [**updateDestination**](CheckoutApi.md#updateDestination) | **PUT** /commerce/checkouts/{checkoutId}/destinations/{destinationId} | Update Destination |
| [**updateGiftInfo**](CheckoutApi.md#updateGiftInfo) | **PUT** /commerce/checkouts/{checkoutId}/items/{itemId}/updateGiftInfo | Update Checkout Item Gift Information |
| [**updateItemDeliveryDate**](CheckoutApi.md#updateItemDeliveryDate) | **PUT** /commerce/checkouts/{checkoutId}/items/{itemId}/deliverydate | Update the Delivery Date of the Item |
| [**updateItemDestination**](CheckoutApi.md#updateItemDestination) | **PUT** /commerce/checkouts/{checkoutId}/items/{itemId}/destination/{destinationId} | Update Item Destination |
| [**updateSubscriptionInfo**](CheckoutApi.md#updateSubscriptionInfo) | **PUT** /commerce/checkouts/{checkoutId}/items/{itemId}/subscriptionInfo | Update Item Subscription Info |
| [**upsertInventoryTags**](CheckoutApi.md#upsertInventoryTags) | **PUT** /commerce/checkouts/{checkoutId}/items/{itemId}/upsert-inventory-tags | Upsert Inventory Tags |
| [**upsertSubstituteInfo**](CheckoutApi.md#upsertSubstituteInfo) | **PUT** /commerce/checkouts/{checkoutId}/items/{itemId}/upsertSubstituteInfo | Update SubstituteInfo on CheckoutItem |


<a name="addCheckoutItem"></a>
# **addCheckoutItem**
> Checkout addCheckoutItem(checkoutId, responseFields, orderItem)

Add Checkout Item

Adds a product or other item to the checkout of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | ID of the checkout to add an item to.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    OrderItem orderItem = new OrderItem(); // OrderItem | All properties of the new item. Required property: Product.ProductCode.
    try {
      Checkout result = apiInstance.addCheckoutItem(checkoutId, responseFields, orderItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#addCheckoutItem");
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
| **checkoutId** | **String**| ID of the checkout to add an item to. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **orderItem** | [**OrderItem**](OrderItem.md)| All properties of the new item. Required property: Product.ProductCode. | [optional] |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addDestination"></a>
# **addDestination**
> CommerceRuntimeDestination addDestination(checkoutId, responseFields, commerceRuntimeDestination)

Add Destination

Adds a specific destination to the checkout.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CommerceRuntimeDestination commerceRuntimeDestination = new CommerceRuntimeDestination(); // CommerceRuntimeDestination | 
    try {
      CommerceRuntimeDestination result = apiInstance.addDestination(checkoutId, responseFields, commerceRuntimeDestination);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#addDestination");
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
| **checkoutId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **commerceRuntimeDestination** | [**CommerceRuntimeDestination**](CommerceRuntimeDestination.md)|  | [optional] |

### Return type

[**CommerceRuntimeDestination**](CommerceRuntimeDestination.md)

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
> Checkout applyCoupon(checkoutId, couponCode, responseFields)

Apply Coupon

Apply a coupon to the Checkout.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | Unique identifier of the Checkout with which to associate the coupon.
    String couponCode = "couponCode_example"; // String | Coupon code that the customer supplies to get the discounted price.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Checkout result = apiInstance.applyCoupon(checkoutId, couponCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#applyCoupon");
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
| **checkoutId** | **String**| Unique identifier of the Checkout with which to associate the coupon. | |
| **couponCode** | **String**| Coupon code that the customer supplies to get the discounted price. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="bulkUpdateDeliveryDates"></a>
# **bulkUpdateDeliveryDates**
> Checkout bulkUpdateDeliveryDates(checkoutId, responseFields, itemsAndDeliveryDates)

Update Delivery Dates of Items in bulk

Update delivery dates of items in bulk

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | ID of the Checkout
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ItemsAndDeliveryDates> itemsAndDeliveryDates = Arrays.asList(); // List<ItemsAndDeliveryDates> | Pairings of Delivery Date and associated ItemIds
    try {
      Checkout result = apiInstance.bulkUpdateDeliveryDates(checkoutId, responseFields, itemsAndDeliveryDates);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#bulkUpdateDeliveryDates");
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
| **checkoutId** | **String**| ID of the Checkout | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **itemsAndDeliveryDates** | [**List&lt;ItemsAndDeliveryDates&gt;**](ItemsAndDeliveryDates.md)| Pairings of Delivery Date and associated ItemIds | [optional] |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="bulkUpdateItemDestinations"></a>
# **bulkUpdateItemDestinations**
> Checkout bulkUpdateItemDestinations(checkoutId, responseFields, itemsForDestination)

Bulk Update Item Destinations

Associate items to destinations in bulk.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | ID of the checkout
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ItemsForDestination> itemsForDestination = Arrays.asList(); // List<ItemsForDestination> | Pairings of destination IDs with their associated items by ID
    try {
      Checkout result = apiInstance.bulkUpdateItemDestinations(checkoutId, responseFields, itemsForDestination);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#bulkUpdateItemDestinations");
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
| **checkoutId** | **String**| ID of the checkout | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **itemsForDestination** | [**List&lt;ItemsForDestination&gt;**](ItemsForDestination.md)| Pairings of destination IDs with their associated items by ID | [optional] |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="changeCheckoutPriceList"></a>
# **changeCheckoutPriceList**
> Checkout changeCheckoutPriceList(checkoutId, responseFields, body)

Change Checkout Price List

Changes the pricelist associated with a checkout.The desired price list code should be specified on the ApiContext.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | Unique identifier of the checkout to change
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    String body = "body_example"; // String | The code for the pricelist to apply
    try {
      Checkout result = apiInstance.changeCheckoutPriceList(checkoutId, responseFields, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#changeCheckoutPriceList");
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
| **checkoutId** | **String**| Unique identifier of the checkout to change | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **body** | **String**| The code for the pricelist to apply | [optional] |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createCheckoutAttributes"></a>
# **createCheckoutAttributes**
> List&lt;CommerceRuntimeOrderAttribute&gt; createCheckoutAttributes(checkoutId, responseFields, commerceRuntimeOrderAttribute)

Create Checkout Attributes

Creates list of checkout attributes specified by checkout Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<CommerceRuntimeOrderAttribute> commerceRuntimeOrderAttribute = Arrays.asList(); // List<CommerceRuntimeOrderAttribute> | 
    try {
      List<CommerceRuntimeOrderAttribute> result = apiInstance.createCheckoutAttributes(checkoutId, responseFields, commerceRuntimeOrderAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#createCheckoutAttributes");
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
| **checkoutId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **commerceRuntimeOrderAttribute** | [**List&lt;CommerceRuntimeOrderAttribute&gt;**](CommerceRuntimeOrderAttribute.md)|  | [optional] |

### Return type

[**List&lt;CommerceRuntimeOrderAttribute&gt;**](CommerceRuntimeOrderAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createCheckoutFromCart"></a>
# **createCheckoutFromCart**
> Checkout createCheckoutFromCart(cartId, responseFields)

Create Checkout From Cart

Creates a new checkout from an existing cart, that is, when the customer chooses to proceed to checkout.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart. This is the original cart ID expressed as a GUID.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Checkout result = apiInstance.createCheckoutFromCart(cartId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#createCheckoutFromCart");
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
| **cartId** | **String**| Unique identifier of the cart. This is the original cart ID expressed as a GUID. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createPaymentAction"></a>
# **createPaymentAction**
> Checkout createPaymentAction(checkoutId, responseFields, paymentAction)

Create Payment Action

Sets the action of the specified payment transaction interaction. Available actions depend on the current status of the payment transaction. If in doubt, get a list of available &lt;a href&#x3D;\&quot;/pages/payment-states#payment-actions\&quot;&gt;payment actions&lt;/a&gt; first. 

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | Unique identifier of the checkout whose payment action you want to change.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PaymentAction paymentAction = new PaymentAction(); // PaymentAction | Action to be performed, along with any metadata.
    try {
      Checkout result = apiInstance.createPaymentAction(checkoutId, responseFields, paymentAction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#createPaymentAction");
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
| **checkoutId** | **String**| Unique identifier of the checkout whose payment action you want to change. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **paymentAction** | [**PaymentAction**](PaymentAction.md)| Action to be performed, along with any metadata. | [optional] |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteCheckoutItem"></a>
# **deleteCheckoutItem**
> Checkout deleteCheckoutItem(checkoutId, itemId)

Delete Checkout Item

Removes a particular item from the checkout of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | 
    String itemId = "itemId_example"; // String | Unique identifier of the item.
    try {
      Checkout result = apiInstance.deleteCheckoutItem(checkoutId, itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#deleteCheckoutItem");
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
| **checkoutId** | **String**|  | |
| **itemId** | **String**| Unique identifier of the item. | |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAvailableActions"></a>
# **getAvailableActions**
> List&lt;String&gt; getAvailableActions(checkoutId, responseFields)

Get Available Actions

Retrieves available actions which depends on the status of the checkout.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | Unique identifier of the checkout whose available actions you want to get.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<String> result = apiInstance.getAvailableActions(checkoutId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#getAvailableActions");
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
| **checkoutId** | **String**| Unique identifier of the checkout whose available actions you want to get. | |
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

<a name="getAvailableShippingMethods"></a>
# **getAvailableShippingMethods**
> List&lt;CheckoutGroupRates&gt; getAvailableShippingMethods(checkoutId, responseFields)

Get Available Shipping Methods

Retrieves available shipping methods for groupings. Typically used to display available shipping method options on the checkout page.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | Unique identifier of the checkout whose shipping methods you want to get.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<CheckoutGroupRates> result = apiInstance.getAvailableShippingMethods(checkoutId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#getAvailableShippingMethods");
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
| **checkoutId** | **String**| Unique identifier of the checkout whose shipping methods you want to get. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;CheckoutGroupRates&gt;**](CheckoutGroupRates.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCheckout"></a>
# **getCheckout**
> Checkout getCheckout(checkoutId, responseFields)

Get Checkout

Retrieves the details of a checkout specified by the checkout ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | Unique identifier of the checkout whose details you want.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Checkout result = apiInstance.getCheckout(checkoutId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#getCheckout");
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
| **checkoutId** | **String**| Unique identifier of the checkout whose details you want. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCheckoutAttributes"></a>
# **getCheckoutAttributes**
> List&lt;CommerceRuntimeOrderAttribute&gt; getCheckoutAttributes(checkoutId, responseFields)

Get Checkout Attributes

Gets the list of attributes specified by checkout Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<CommerceRuntimeOrderAttribute> result = apiInstance.getCheckoutAttributes(checkoutId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#getCheckoutAttributes");
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
| **checkoutId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;CommerceRuntimeOrderAttribute&gt;**](CommerceRuntimeOrderAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCheckouts"></a>
# **getCheckouts**
> CheckoutCollection getCheckouts(startIndex, pageSize, sortBy, filter, q, qLimit, responseFields)

Get Checkouts

Retrieves a list of checkouts according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    Integer startIndex = 56; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.              For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=50. The default value is 0. Optional.
    Integer pageSize = 56; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals,              gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String q = "q_example"; // String | Text to perform a search on
    Integer qLimit = 56; // Integer | Limit of the records to include in a search, used for global search
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CheckoutCollection result = apiInstance.getCheckouts(startIndex, pageSize, sortBy, filter, q, qLimit, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#getCheckouts");
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.              For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;50. The default value is 0. Optional. | [optional] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals,              gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **q** | **String**| Text to perform a search on | [optional] |
| **qLimit** | **Integer**| Limit of the records to include in a search, used for global search | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CheckoutCollection**](CheckoutCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDestination"></a>
# **getDestination**
> CommerceRuntimeDestination getDestination(checkoutId, destinationId, responseFields)

Get Destination

Gets a destination specified by the checkout Id and destination Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | 
    String destinationId = "destinationId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CommerceRuntimeDestination result = apiInstance.getDestination(checkoutId, destinationId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#getDestination");
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
| **checkoutId** | **String**|  | |
| **destinationId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CommerceRuntimeDestination**](CommerceRuntimeDestination.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDestinations"></a>
# **getDestinations**
> List&lt;CommerceRuntimeDestination&gt; getDestinations(checkoutId, responseFields)

Get Destinations

Gets all the destinations specified by the checkout Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<CommerceRuntimeDestination> result = apiInstance.getDestinations(checkoutId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#getDestinations");
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
| **checkoutId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;CommerceRuntimeDestination&gt;**](CommerceRuntimeDestination.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="performCheckoutAction"></a>
# **performCheckoutAction**
> Checkout performCheckoutAction(checkoutId, responseFields, checkoutAction)

Perform Checkout Action

Perform an action on the checkout. Available actions depend on the current state of the checkout. If in doubt, get a list of available checkout actions first.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | Unique identifier of the checkout.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CheckoutAction checkoutAction = new CheckoutAction(); // CheckoutAction | The action to perform
    try {
      Checkout result = apiInstance.performCheckoutAction(checkoutId, responseFields, checkoutAction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#performCheckoutAction");
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
| **checkoutId** | **String**| Unique identifier of the checkout. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **checkoutAction** | [**CheckoutAction**](CheckoutAction.md)| The action to perform | [optional] |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="performPaymentAction"></a>
# **performPaymentAction**
> Checkout performPaymentAction(checkoutId, paymentId, responseFields, paymentAction)

Perform Payment Action

Sets the action of the specified payment transaction interaction. Available actions depend on the current status of the payment transaction. \\r\\nIf in doubt, get a list of available &lt;a href&#x3D;\&quot;/pages/payment-states#payment-actions\&quot;&gt;payment actions&lt;/a&gt; first. Note that for order management-only systems that use No-Operation payment gateways, such as due to the payments being processed by an external storefront or service instead of UCP, these actions will not actually be performed by UCP and instead will be automatically marked as a success.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | Unique identifier of the checkout whose payment action you want to change.
    String paymentId = "paymentId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PaymentAction paymentAction = new PaymentAction(); // PaymentAction | Action to be performed, along with any metadata.
    try {
      Checkout result = apiInstance.performPaymentAction(checkoutId, paymentId, responseFields, paymentAction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#performPaymentAction");
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
| **checkoutId** | **String**| Unique identifier of the checkout whose payment action you want to change. | |
| **paymentId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **paymentAction** | [**PaymentAction**](PaymentAction.md)| Action to be performed, along with any metadata. | [optional] |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="processDigitalWallet"></a>
# **processDigitalWallet**
> Checkout processDigitalWallet(checkoutId, digitalWalletType, responseFields, digitalWallet)

Process Digital Wallet

Processes the digital wallet sent specified by checkout id and digital     wallet type.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | 
    String digitalWalletType = "digitalWalletType_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    DigitalWallet digitalWallet = new DigitalWallet(); // DigitalWallet | 
    try {
      Checkout result = apiInstance.processDigitalWallet(checkoutId, digitalWalletType, responseFields, digitalWallet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#processDigitalWallet");
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
| **checkoutId** | **String**|  | |
| **digitalWalletType** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **digitalWallet** | [**DigitalWallet**](DigitalWallet.md)|  | [optional] |

### Return type

[**Checkout**](Checkout.md)

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
> Checkout removeCoupon(checkoutId, couponCode)

Remove Coupon

Removes a coupon that had been previously applied to the checkout.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | Unique identifier of the checkout with the coupon you want to remove.
    String couponCode = "couponCode_example"; // String | Coupon code to remove.
    try {
      Checkout result = apiInstance.removeCoupon(checkoutId, couponCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#removeCoupon");
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
| **checkoutId** | **String**| Unique identifier of the checkout with the coupon you want to remove. | |
| **couponCode** | **String**| Coupon code to remove. | |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeCoupons"></a>
# **removeCoupons**
> Checkout removeCoupons(checkoutId)

Remove Coupons

Removes all coupons that had been previously applied to the checkout.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | Unique identifier of the order with the coupon you want to remove.
    try {
      Checkout result = apiInstance.removeCoupons(checkoutId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#removeCoupons");
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
| **checkoutId** | **String**| Unique identifier of the order with the coupon you want to remove. | |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeDestination"></a>
# **removeDestination**
> removeDestination(checkoutId, destinationId)

Remove Destination

Removes a destination specified by checkout Id and destination Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | 
    String destinationId = "destinationId_example"; // String | 
    try {
      apiInstance.removeDestination(checkoutId, destinationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#removeDestination");
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
| **checkoutId** | **String**|  | |
| **destinationId** | **String**|  | |

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

<a name="resendCheckoutConfirmationEmail"></a>
# **resendCheckoutConfirmationEmail**
> resendCheckoutConfirmationEmail(checkoutId, responseFields)

Resend Checkout Confirmation Email

Resends email on checkout confirmation.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.resendCheckoutConfirmationEmail(checkoutId, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#resendCheckoutConfirmationEmail");
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
| **checkoutId** | **String**|  | |
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

<a name="setShippingMethods"></a>
# **setShippingMethods**
> Checkout setShippingMethods(checkoutId, responseFields, checkoutGroupShippingMethod)

Set Shipping Methods

Sets the shipping method for specified groupings.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | Unique identifier of the checkout whose shipping methods you want to set.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<CheckoutGroupShippingMethod> checkoutGroupShippingMethod = Arrays.asList(); // List<CheckoutGroupShippingMethod> | Pairings of checkout group to shipping method
    try {
      Checkout result = apiInstance.setShippingMethods(checkoutId, responseFields, checkoutGroupShippingMethod);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#setShippingMethods");
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
| **checkoutId** | **String**| Unique identifier of the checkout whose shipping methods you want to set. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **checkoutGroupShippingMethod** | [**List&lt;CheckoutGroupShippingMethod&gt;**](CheckoutGroupShippingMethod.md)| Pairings of checkout group to shipping method | [optional] |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="splitItem"></a>
# **splitItem**
> Checkout splitItem(checkoutId, itemId, quantity, responseFields)

Split Item

Splits an existing item into two. The new item&#39;s quantity will be !:quantity and the original item&#39;s quantity will be reduced accordingly.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | ID of the checkout containing the item to split
    String itemId = "itemId_example"; // String | The ID of the item to split
    Integer quantity = 1; // Integer | What quantity to split off. Defaults to 1.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Checkout result = apiInstance.splitItem(checkoutId, itemId, quantity, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#splitItem");
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
| **checkoutId** | **String**| ID of the checkout containing the item to split | |
| **itemId** | **String**| The ID of the item to split | |
| **quantity** | **Integer**| What quantity to split off. Defaults to 1. | [optional] [default to 1] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCheckout"></a>
# **updateCheckout**
> Checkout updateCheckout(checkoutId, responseFields, checkout)

Update Checkout

Updates the details of a checkout specified by the checkout ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | Unique identifier of the checkout whose details you want.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Checkout checkout = new Checkout(); // Checkout | Checkout that needs update
    try {
      Checkout result = apiInstance.updateCheckout(checkoutId, responseFields, checkout);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#updateCheckout");
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
| **checkoutId** | **String**| Unique identifier of the checkout whose details you want. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **checkout** | [**Checkout**](Checkout.md)| Checkout that needs update | [optional] |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCheckoutAttribute"></a>
# **updateCheckoutAttribute**
> List&lt;CommerceRuntimeOrderAttribute&gt; updateCheckoutAttribute(checkoutId, removeMissing, responseFields, commerceRuntimeOrderAttribute)

Update Checkout Attribute

Updates the list of checkout attributes specified by checkout id and removes the missing attributes if not passed when removeMissing flag is set.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | 
    Boolean removeMissing = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<CommerceRuntimeOrderAttribute> commerceRuntimeOrderAttribute = Arrays.asList(); // List<CommerceRuntimeOrderAttribute> | 
    try {
      List<CommerceRuntimeOrderAttribute> result = apiInstance.updateCheckoutAttribute(checkoutId, removeMissing, responseFields, commerceRuntimeOrderAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#updateCheckoutAttribute");
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
| **checkoutId** | **String**|  | |
| **removeMissing** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **commerceRuntimeOrderAttribute** | [**List&lt;CommerceRuntimeOrderAttribute&gt;**](CommerceRuntimeOrderAttribute.md)|  | [optional] |

### Return type

[**List&lt;CommerceRuntimeOrderAttribute&gt;**](CommerceRuntimeOrderAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateDestination"></a>
# **updateDestination**
> CommerceRuntimeDestination updateDestination(checkoutId, destinationId, responseFields, commerceRuntimeDestination)

Update Destination

Updates a destination specified by checkout Id and destination Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | 
    String destinationId = "destinationId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CommerceRuntimeDestination commerceRuntimeDestination = new CommerceRuntimeDestination(); // CommerceRuntimeDestination | 
    try {
      CommerceRuntimeDestination result = apiInstance.updateDestination(checkoutId, destinationId, responseFields, commerceRuntimeDestination);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#updateDestination");
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
| **checkoutId** | **String**|  | |
| **destinationId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **commerceRuntimeDestination** | [**CommerceRuntimeDestination**](CommerceRuntimeDestination.md)|  | [optional] |

### Return type

[**CommerceRuntimeDestination**](CommerceRuntimeDestination.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateGiftInfo"></a>
# **updateGiftInfo**
> Checkout updateGiftInfo(checkoutId, itemId, responseFields, giftInfo)

Update Checkout Item Gift Information

Updates the gift information on a checkout item

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | Unique identifier of the checkout.
    String itemId = "itemId_example"; // String | Unique identifier of the checkout item.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    GiftInfo giftInfo = new GiftInfo(); // GiftInfo | Mozu.CommerceRuntime.Contracts.Orders.GiftInfo to use as the update source
    try {
      Checkout result = apiInstance.updateGiftInfo(checkoutId, itemId, responseFields, giftInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#updateGiftInfo");
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
| **checkoutId** | **String**| Unique identifier of the checkout. | |
| **itemId** | **String**| Unique identifier of the checkout item. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **giftInfo** | [**GiftInfo**](GiftInfo.md)| Mozu.CommerceRuntime.Contracts.Orders.GiftInfo to use as the update source | [optional] |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateItemDeliveryDate"></a>
# **updateItemDeliveryDate**
> Checkout updateItemDeliveryDate(checkoutId, itemId, responseFields, body)

Update the Delivery Date of the Item

Update the Delivery Date of the Item

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | ID of the Checkout
    String itemId = "itemId_example"; // String | ID of the item to update
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    OffsetDateTime body = OffsetDateTime.now(); // OffsetDateTime | Delivery DateTme to update to
    try {
      Checkout result = apiInstance.updateItemDeliveryDate(checkoutId, itemId, responseFields, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#updateItemDeliveryDate");
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
| **checkoutId** | **String**| ID of the Checkout | |
| **itemId** | **String**| ID of the item to update | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **body** | **OffsetDateTime**| Delivery DateTme to update to | [optional] |

### Return type

[**Checkout**](Checkout.md)

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
> Checkout updateItemDestination(checkoutId, itemId, destinationId, responseFields)

Update Item Destination

Associate an item to a destination.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | ID of the checkout
    String itemId = "itemId_example"; // String | ID of the item to update
    String destinationId = "destinationId_example"; // String | ID of the destination
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Checkout result = apiInstance.updateItemDestination(checkoutId, itemId, destinationId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#updateItemDestination");
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
| **checkoutId** | **String**| ID of the checkout | |
| **itemId** | **String**| ID of the item to update | |
| **destinationId** | **String**| ID of the destination | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSubscriptionInfo"></a>
# **updateSubscriptionInfo**
> Checkout updateSubscriptionInfo(checkoutId, itemId, responseFields, subscriptionInfo)

Update Item Subscription Info

Updates the subscription info on the Item.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | ID of the checkout
    String itemId = "itemId_example"; // String | ID of the item to update
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SubscriptionInfo subscriptionInfo = new SubscriptionInfo(); // SubscriptionInfo | The Mozu.CommerceRuntime.Contracts.Subscriptions.SubscriptionInfo to use as update source on Item
    try {
      Checkout result = apiInstance.updateSubscriptionInfo(checkoutId, itemId, responseFields, subscriptionInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#updateSubscriptionInfo");
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
| **checkoutId** | **String**| ID of the checkout | |
| **itemId** | **String**| ID of the item to update | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionInfo** | [**SubscriptionInfo**](SubscriptionInfo.md)| The Mozu.CommerceRuntime.Contracts.Subscriptions.SubscriptionInfo to use as update source on Item | [optional] |

### Return type

[**Checkout**](Checkout.md)

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
> Checkout upsertInventoryTags(checkoutId, itemId, responseFields, inventoryTags)

Upsert Inventory Tags

Upsert Inventory Tags

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<InventoryTags> inventoryTags = Arrays.asList(); // List<InventoryTags> | 
    try {
      Checkout result = apiInstance.upsertInventoryTags(checkoutId, itemId, responseFields, inventoryTags);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#upsertInventoryTags");
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
| **checkoutId** | **String**|  | |
| **itemId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **inventoryTags** | [**List&lt;InventoryTags&gt;**](InventoryTags.md)|  | [optional] |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="upsertSubstituteInfo"></a>
# **upsertSubstituteInfo**
> Checkout upsertSubstituteInfo(checkoutId, itemId, responseFields, substituteInfo)

Update SubstituteInfo on CheckoutItem

Update SubstituteInfo on CheckoutItem

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    String checkoutId = "checkoutId_example"; // String | Unique identifier of the checkout.
    String itemId = "itemId_example"; // String | Unique identifier of the checkout item.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SubstituteInfo substituteInfo = new SubstituteInfo(); // SubstituteInfo | Mozu.CommerceRuntime.Contracts.Commerce.SubstituteInfo to use as the update source
    try {
      Checkout result = apiInstance.upsertSubstituteInfo(checkoutId, itemId, responseFields, substituteInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#upsertSubstituteInfo");
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
| **checkoutId** | **String**| Unique identifier of the checkout. | |
| **itemId** | **String**| Unique identifier of the checkout item. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **substituteInfo** | [**SubstituteInfo**](SubstituteInfo.md)| Mozu.CommerceRuntime.Contracts.Commerce.SubstituteInfo to use as the update source | [optional] |

### Return type

[**Checkout**](Checkout.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

