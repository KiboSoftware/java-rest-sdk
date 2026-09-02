# CartApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addExtendedProperties**](CartApi.md#addExtendedProperties) | **POST** /commerce/carts/current/extendedproperties | Adds Extended Properties |
| [**addItemToCart**](CartApi.md#addItemToCart) | **POST** /commerce/carts/current/items | Add Item To Cart |
| [**addItemToCartByCartId**](CartApi.md#addItemToCartByCartId) | **POST** /commerce/carts/{cartId}/items | Add Item To Cart By CartId |
| [**addItemsToCart**](CartApi.md#addItemsToCart) | **POST** /commerce/carts/current/bulkitems | Add Items To Cart |
| [**addItemsToCartByCartId**](CartApi.md#addItemsToCartByCartId) | **POST** /commerce/carts/{cartId}/bulkitems | Add Items To Cart By CartId |
| [**applyCoupon**](CartApi.md#applyCoupon) | **PUT** /commerce/carts/{cartId}/coupons/{couponCode} | Apply Coupon |
| [**deleteCart**](CartApi.md#deleteCart) | **DELETE** /commerce/carts/{cartId} | Delete Cart |
| [**deleteCartItem**](CartApi.md#deleteCartItem) | **DELETE** /commerce/carts/current/items/{cartItemId} | Delete Cart Item |
| [**deleteCartItemByCartId**](CartApi.md#deleteCartItemByCartId) | **DELETE** /commerce/carts/{cartId}/items/{cartItemId} | Delete Cart Item By CartId |
| [**deleteCartItems**](CartApi.md#deleteCartItems) | **PUT** /commerce/carts/current/bulkitems/delete | Delete Multiple Cart Items |
| [**deleteCartItemsByCartId**](CartApi.md#deleteCartItemsByCartId) | **PUT** /commerce/carts/{cartId}/bulkitems/delete | Delete Multiple Cart Items By CartId |
| [**deleteCurrentCart**](CartApi.md#deleteCurrentCart) | **DELETE** /commerce/carts/current | Delete Current Cart |
| [**deleteExtendedProperties**](CartApi.md#deleteExtendedProperties) | **DELETE** /commerce/carts/current/extendedproperties | Delete Extended Properties. |
| [**deleteExtendedProperty**](CartApi.md#deleteExtendedProperty) | **DELETE** /commerce/carts/current/extendedproperties/{key} | Delete Extended Property |
| [**deleteUserCart**](CartApi.md#deleteUserCart) | **DELETE** /commerce/carts/user/{userId} | Delete User Cart |
| [**getCart**](CartApi.md#getCart) | **GET** /commerce/carts/{cartId} | Get Cart |
| [**getCartItem**](CartApi.md#getCartItem) | **GET** /commerce/carts/current/items/{cartItemId} | Get Cart Item |
| [**getCartItemByCartId**](CartApi.md#getCartItemByCartId) | **GET** /commerce/carts/{cartId}/items/{cartItemId} | Get Cart Item By CartId |
| [**getCartItems**](CartApi.md#getCartItems) | **GET** /commerce/carts/current/items | Get Cart Items |
| [**getCartItemsByCartId**](CartApi.md#getCartItemsByCartId) | **GET** /commerce/carts/{cartId}/items | Get Cart Items By CartId |
| [**getCartSummary**](CartApi.md#getCartSummary) | **GET** /commerce/carts/summary | Get Cart Summary |
| [**getCartSummaryByCartId**](CartApi.md#getCartSummaryByCartId) | **GET** /commerce/carts/{cartId}/summary | Get Cart Summary By Cart Id |
| [**getExtendedProperties**](CartApi.md#getExtendedProperties) | **GET** /commerce/carts/current/extendedproperties | Get Extended Properties |
| [**getMessages**](CartApi.md#getMessages) | **GET** /commerce/carts/current/messages | Get Messages |
| [**getOrCreateCart**](CartApi.md#getOrCreateCart) | **GET** /commerce/carts/current | Get Or Create Cart |
| [**getOrCreateUserCart**](CartApi.md#getOrCreateUserCart) | **POST** /commerce/carts/user/{userId} | Get Or Create User Cart |
| [**getUserCart**](CartApi.md#getUserCart) | **GET** /commerce/carts/user/{userId} | Get User Cart |
| [**getUserCartSummary**](CartApi.md#getUserCartSummary) | **GET** /commerce/carts/user/{userId}/summary | Get User Cart Summary |
| [**rejectSuggestedDiscount**](CartApi.md#rejectSuggestedDiscount) | **POST** /commerce/carts/{cartId}/rejectautodiscount/{discountId} | Reject Suggested Discount |
| [**removeAllCartItems**](CartApi.md#removeAllCartItems) | **DELETE** /commerce/carts/current/items | Remove All Cart Items |
| [**removeAllCartItemsByCartId**](CartApi.md#removeAllCartItemsByCartId) | **DELETE** /commerce/carts/{cartId}/items | Remove All Cart Items By CartId |
| [**removeAllMessages**](CartApi.md#removeAllMessages) | **DELETE** /commerce/carts/current/messages | Remove All Messages |
| [**removeCoupon**](CartApi.md#removeCoupon) | **DELETE** /commerce/carts/{cartId}/coupons/{couponCode} | Remove Coupon |
| [**removeCoupons**](CartApi.md#removeCoupons) | **DELETE** /commerce/carts/{cartId}/coupons | Remove Coupons |
| [**removeMessage**](CartApi.md#removeMessage) | **DELETE** /commerce/carts/current/messages/{messageId} | Remove Message |
| [**updateCart**](CartApi.md#updateCart) | **PUT** /commerce/carts/current | Update Cart |
| [**updateCartByCartId**](CartApi.md#updateCartByCartId) | **PUT** /commerce/carts/{cartId} | Update Cart By Cart Id |
| [**updateCartItem**](CartApi.md#updateCartItem) | **PUT** /commerce/carts/current/items/{cartItemId} | Update Cart Item |
| [**updateCartItemByCartId**](CartApi.md#updateCartItemByCartId) | **PUT** /commerce/carts/{cartId}/items/{cartItemId} | Update Cart Item By CartId |
| [**updateCartItemQuantity**](CartApi.md#updateCartItemQuantity) | **PUT** /commerce/carts/current/items/{cartItemId}/{quantity} | Update Cart Item Quantity |
| [**updateCartItemQuantityByCartId**](CartApi.md#updateCartItemQuantityByCartId) | **PUT** /commerce/carts/{cartId}/items/{cartItemId}/{quantity} | Update Cart Item Quantity By CartId |
| [**updateCartItems**](CartApi.md#updateCartItems) | **PUT** /commerce/carts/current/bulkitems | Update Cart Items |
| [**updateCartItemsByCartId**](CartApi.md#updateCartItemsByCartId) | **PUT** /commerce/carts/{cartId}/bulkitems | Update Cart Items By CartId |
| [**updateExtendedProperties**](CartApi.md#updateExtendedProperties) | **PUT** /commerce/carts/current/extendedproperties | Update Extended Properties |
| [**updateExtendedProperty**](CartApi.md#updateExtendedProperty) | **PUT** /commerce/carts/current/extendedproperties/{key} | Update Extended Property |
| [**updateUserCart**](CartApi.md#updateUserCart) | **PUT** /commerce/carts/user/{userId} | Update User Cart |


<a name="addExtendedProperties"></a>
# **addExtendedProperties**
> List&lt;ExtendedProperty&gt; addExtendedProperties(responseFields, extendedProperty)

Adds Extended Properties

Add Extended Properties on the current cart. Store an arbitrary number of cart extended properties such as tracking strings, marketing sources, affiliates, sales personnel/data, and so on, on a per cart basis. Each cart may have none, one, or more than one entry in the extended properties collection, and all values in the extended properties collection are represented as strings. When you create an order from a cart, all extended properties are retained from the cart and copied to the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ExtendedProperty> extendedProperty = Arrays.asList(); // List<ExtendedProperty> | Extended properties
    try {
      List<ExtendedProperty> result = apiInstance.addExtendedProperties(responseFields, extendedProperty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#addExtendedProperties");
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
| **extendedProperty** | [**List&lt;ExtendedProperty&gt;**](ExtendedProperty.md)| Extended properties | [optional] |

### Return type

[**List&lt;ExtendedProperty&gt;**](ExtendedProperty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addItemToCart"></a>
# **addItemToCart**
> CartItem addItemToCart(zipCode, responseFields, cartItem)

Add Item To Cart

Adds a product or other item to the cart of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String zipCode = "zipCode_example"; // String | Zip Code used for inventory reservation if cart having STH items.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CartItem cartItem = new CartItem(); // CartItem | All properties of the new cart item. Required property: Product.ProductCode.
    try {
      CartItem result = apiInstance.addItemToCart(zipCode, responseFields, cartItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#addItemToCart");
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
| **zipCode** | **String**| Zip Code used for inventory reservation if cart having STH items. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **cartItem** | [**CartItem**](CartItem.md)| All properties of the new cart item. Required property: Product.ProductCode. | [optional] |

### Return type

[**CartItem**](CartItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addItemToCartByCartId"></a>
# **addItemToCartByCartId**
> CartItem addItemToCartByCartId(cartId, zipCode, responseFields, cartItem)

Add Item To Cart By CartId

Adds a product or a cart item to the cart specified by the cart ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart.
    String zipCode = "zipCode_example"; // String | Zip Code used for inventory reservation if cart having STH items.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CartItem cartItem = new CartItem(); // CartItem | All properties of the new cart item. Required property: Product.ProductCode.
    try {
      CartItem result = apiInstance.addItemToCartByCartId(cartId, zipCode, responseFields, cartItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#addItemToCartByCartId");
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
| **cartId** | **String**| Unique identifier of the cart. | |
| **zipCode** | **String**| Zip Code used for inventory reservation if cart having STH items. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **cartItem** | [**CartItem**](CartItem.md)| All properties of the new cart item. Required property: Product.ProductCode. | [optional] |

### Return type

[**CartItem**](CartItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addItemsToCart"></a>
# **addItemsToCart**
> addItemsToCart(throwErrorOnInvalidItems, zipCode, responseFields, cartItem)

Add Items To Cart

Adds multiple cart items to the cart of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    Boolean throwErrorOnInvalidItems = true; // Boolean | When set to true none of the items will be added when some items are invalid. when set to false valid items are added and invalid items are removed
    String zipCode = "zipCode_example"; // String | Zip Code used for inventory reservation if cart having STH items.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<CartItem> cartItem = Arrays.asList(); // List<CartItem> | The items to add to the cart
    try {
      apiInstance.addItemsToCart(throwErrorOnInvalidItems, zipCode, responseFields, cartItem);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#addItemsToCart");
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
| **throwErrorOnInvalidItems** | **Boolean**| When set to true none of the items will be added when some items are invalid. when set to false valid items are added and invalid items are removed | [optional] |
| **zipCode** | **String**| Zip Code used for inventory reservation if cart having STH items. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **cartItem** | [**List&lt;CartItem&gt;**](CartItem.md)| The items to add to the cart | [optional] |

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

<a name="addItemsToCartByCartId"></a>
# **addItemsToCartByCartId**
> addItemsToCartByCartId(cartId, throwErrorOnInvalidItems, zipCode, responseFields, cartItem)

Add Items To Cart By CartId

Adds multiple cart items to the cart specified by cartId.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart.
    Boolean throwErrorOnInvalidItems = true; // Boolean | When set to true none of the items will be added when some items are invalid. when set to false valid items are added and invalid items are removed
    String zipCode = "zipCode_example"; // String | Zip Code used for inventory reservation if cart having STH items.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<CartItem> cartItem = Arrays.asList(); // List<CartItem> | The items to add to the cart
    try {
      apiInstance.addItemsToCartByCartId(cartId, throwErrorOnInvalidItems, zipCode, responseFields, cartItem);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#addItemsToCartByCartId");
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
| **cartId** | **String**| Unique identifier of the cart. | |
| **throwErrorOnInvalidItems** | **Boolean**| When set to true none of the items will be added when some items are invalid. when set to false valid items are added and invalid items are removed | [optional] |
| **zipCode** | **String**| Zip Code used for inventory reservation if cart having STH items. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **cartItem** | [**List&lt;CartItem&gt;**](CartItem.md)| The items to add to the cart | [optional] |

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

<a name="applyCoupon"></a>
# **applyCoupon**
> Cart applyCoupon(cartId, couponCode, responseFields)

Apply Coupon

Apply coupon to the cart.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart with which to associate the coupon.
    String couponCode = "couponCode_example"; // String | Coupon code that the customer supplies to get the discounted price.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Cart result = apiInstance.applyCoupon(cartId, couponCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#applyCoupon");
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
| **cartId** | **String**| Unique identifier of the cart with which to associate the coupon. | |
| **couponCode** | **String**| Coupon code that the customer supplies to get the discounted price. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Cart**](Cart.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteCart"></a>
# **deleteCart**
> deleteCart(cartId)

Delete Cart

Deletes the cart by cart ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart.
    try {
      apiInstance.deleteCart(cartId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#deleteCart");
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
| **cartId** | **String**| Unique identifier of the cart. | |

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

<a name="deleteCartItem"></a>
# **deleteCartItem**
> deleteCartItem(cartItemId)

Delete Cart Item

Removes a particular cart item from the cart of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartItemId = "cartItemId_example"; // String | Unique identifier of the cart item.
    try {
      apiInstance.deleteCartItem(cartItemId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#deleteCartItem");
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
| **cartItemId** | **String**| Unique identifier of the cart item. | |

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

<a name="deleteCartItemByCartId"></a>
# **deleteCartItemByCartId**
> deleteCartItemByCartId(cartId, cartItemId)

Delete Cart Item By CartId

Removes a particular cart item from the cart specified by cart item Id and cart Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart.
    String cartItemId = "cartItemId_example"; // String | Unique identifier of the cart item.
    try {
      apiInstance.deleteCartItemByCartId(cartId, cartItemId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#deleteCartItemByCartId");
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
| **cartId** | **String**| Unique identifier of the cart. | |
| **cartItemId** | **String**| Unique identifier of the cart item. | |

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

<a name="deleteCartItems"></a>
# **deleteCartItems**
> deleteCartItems(responseFields, requestBody)

Delete Multiple Cart Items

Removes multiple cart items from the cart of the current shopper in a single operation.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<String> requestBody = Arrays.asList(); // List<String> | List of cart item IDs to remove
    try {
      apiInstance.deleteCartItems(responseFields, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#deleteCartItems");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of cart item IDs to remove | [optional] |

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

<a name="deleteCartItemsByCartId"></a>
# **deleteCartItemsByCartId**
> deleteCartItemsByCartId(cartId, responseFields, requestBody)

Delete Multiple Cart Items By CartId

Removes multiple cart items from the specified cart in a single operation.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<String> requestBody = Arrays.asList(); // List<String> | List of cart item IDs to remove
    try {
      apiInstance.deleteCartItemsByCartId(cartId, responseFields, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#deleteCartItemsByCartId");
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
| **cartId** | **String**| Unique identifier of the cart | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of cart item IDs to remove | [optional] |

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

<a name="deleteCurrentCart"></a>
# **deleteCurrentCart**
> deleteCurrentCart()

Delete Current Cart

Deletes the cart of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    try {
      apiInstance.deleteCurrentCart();
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#deleteCurrentCart");
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

<a name="deleteExtendedProperties"></a>
# **deleteExtendedProperties**
> deleteExtendedProperties(requestBody)

Delete Extended Properties.

Delete extended properties on the current cart.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    List<String> requestBody = Arrays.asList(); // List<String> | Extended properties.
    try {
      apiInstance.deleteExtendedProperties(requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#deleteExtendedProperties");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| Extended properties. | [optional] |

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

<a name="deleteExtendedProperty"></a>
# **deleteExtendedProperty**
> deleteExtendedProperty(key)

Delete Extended Property

Delete extended property on the current cart using the key.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String key = "key_example"; // String | Unique identifier of the extended property
    try {
      apiInstance.deleteExtendedProperty(key);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#deleteExtendedProperty");
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
| **key** | **String**| Unique identifier of the extended property | |

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

<a name="deleteUserCart"></a>
# **deleteUserCart**
> deleteUserCart(userId, accountId)

Delete User Cart

Deletes the cart of the user by user ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String userId = "userId_example"; // String | Unique identifier of the user.
    Integer accountId = 56; // Integer | Unique identifier of the customer account.
    try {
      apiInstance.deleteUserCart(userId, accountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#deleteUserCart");
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
| **userId** | **String**| Unique identifier of the user. | |
| **accountId** | **Integer**| Unique identifier of the customer account. | [optional] |

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

<a name="getCart"></a>
# **getCart**
> Cart getCart(cartId, responseFields)

Get Cart

Retrieves the details of the cart specified by cart ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Cart result = apiInstance.getCart(cartId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#getCart");
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
| **cartId** | **String**| Unique identifier of the cart. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Cart**](Cart.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCartItem"></a>
# **getCartItem**
> CartItem getCartItem(cartItemId, responseFields)

Get Cart Item

Retrieves an individual cart item from the cart of the current shopper specified by its cart item Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartItemId = "cartItemId_example"; // String | Unique identifier of the cart item.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CartItem result = apiInstance.getCartItem(cartItemId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#getCartItem");
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
| **cartItemId** | **String**| Unique identifier of the cart item. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CartItem**](CartItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCartItemByCartId"></a>
# **getCartItemByCartId**
> CartItem getCartItemByCartId(cartId, cartItemId, responseFields)

Get Cart Item By CartId

Retrieves an individual cart item from the cart by cart Id and cart item Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart.
    String cartItemId = "cartItemId_example"; // String | Unique identifier of the cart item.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CartItem result = apiInstance.getCartItemByCartId(cartId, cartItemId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#getCartItemByCartId");
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
| **cartId** | **String**| Unique identifier of the cart. | |
| **cartItemId** | **String**| Unique identifier of the cart item. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CartItem**](CartItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCartItems"></a>
# **getCartItems**
> CartItemCollection getCartItems(responseFields)

Get Cart Items

Retrieves the details of each cart item such as the product name, stock count, unit price, discounts, quantity ordered and total price

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CartItemCollection result = apiInstance.getCartItems(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#getCartItems");
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

[**CartItemCollection**](CartItemCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCartItemsByCartId"></a>
# **getCartItemsByCartId**
> CartItemCollection getCartItemsByCartId(cartId, responseFields)

Get Cart Items By CartId

Retrieves the details of each cart item such as the product name, stock count, unit price, discounts, quantity ordered and total price for the cart by cartId.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CartItemCollection result = apiInstance.getCartItemsByCartId(cartId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#getCartItemsByCartId");
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
| **cartId** | **String**| Unique identifier of the cart. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CartItemCollection**](CartItemCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCartSummary"></a>
# **getCartSummary**
> CartSummary getCartSummary(responseFields)

Get Cart Summary

Retrieves the number of items in the active cart, total cost of items in the cart and the cart expiration. (Anonymous shoppers cart expires in 14 days.)

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CartSummary result = apiInstance.getCartSummary(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#getCartSummary");
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

[**CartSummary**](CartSummary.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCartSummaryByCartId"></a>
# **getCartSummaryByCartId**
> CartSummary getCartSummaryByCartId(cartId, responseFields)

Get Cart Summary By Cart Id

Retrieves the number of items in the specified cart, total cost of items in the cart, and whether the cart has expired by cartId. All anonymous idle carts that do not proceed to checkout expire after 14 days.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CartSummary result = apiInstance.getCartSummaryByCartId(cartId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#getCartSummaryByCartId");
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
| **cartId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CartSummary**](CartSummary.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getExtendedProperties"></a>
# **getExtendedProperties**
> List&lt;ExtendedProperty&gt; getExtendedProperties(responseFields)

Get Extended Properties

Get extended properties on a cart.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ExtendedProperty> result = apiInstance.getExtendedProperties(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#getExtendedProperties");
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

[**List&lt;ExtendedProperty&gt;**](ExtendedProperty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getMessages"></a>
# **getMessages**
> CartChangeMessageCollection getMessages(responseFields)

Get Messages

Retrieves messages to and from the current shopper. These are messages supplied by the system to notify the shopper of price increases or decreases or product unavailability.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CartChangeMessageCollection result = apiInstance.getMessages(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#getMessages");
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

[**CartChangeMessageCollection**](CartChangeMessageCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getOrCreateCart"></a>
# **getOrCreateCart**
> Cart getOrCreateCart(responseFields)

Get Or Create Cart

Retrieves a cart&#39;s contents for the current shopper.  If the shopper does not have an active cart on the site, one is created.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Cart result = apiInstance.getOrCreateCart(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#getOrCreateCart");
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

[**Cart**](Cart.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getOrCreateUserCart"></a>
# **getOrCreateUserCart**
> Cart getOrCreateUserCart(userId, accountId, responseFields)

Get Or Create User Cart

Get the current cart or create a new cart for the user specified by user ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String userId = "userId_example"; // String | Unique identifier of the user.
    Integer accountId = 56; // Integer | Unique identifier of the customer account.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Cart result = apiInstance.getOrCreateUserCart(userId, accountId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#getOrCreateUserCart");
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
| **userId** | **String**| Unique identifier of the user. | |
| **accountId** | **Integer**| Unique identifier of the customer account. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Cart**](Cart.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getUserCart"></a>
# **getUserCart**
> Cart getUserCart(userId, accountId, responseFields)

Get User Cart

Retrieves the details of the user&#39;s cart from the user ID.Shoppers are not allowed to execute this call. If this ever changes, then auth logic will need to be added

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String userId = "userId_example"; // String | Unique identifier of the user.
    Integer accountId = 56; // Integer | Unique identifier of the customer account.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Cart result = apiInstance.getUserCart(userId, accountId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#getUserCart");
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
| **userId** | **String**| Unique identifier of the user. | |
| **accountId** | **Integer**| Unique identifier of the customer account. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Cart**](Cart.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getUserCartSummary"></a>
# **getUserCartSummary**
> CartSummary getUserCartSummary(userId, accountId, responseFields)

Get User Cart Summary

Retrieves the number of items in the active cart, total cost of items in the cart and the cart expiration by userId. All anonymous idle carts that do not proceed to checkout expire after 14 days.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String userId = "userId_example"; // String | Unique identifier of the user.
    Integer accountId = 56; // Integer | Unique identifier of the customer account.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CartSummary result = apiInstance.getUserCartSummary(userId, accountId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#getUserCartSummary");
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
| **userId** | **String**| Unique identifier of the user. | |
| **accountId** | **Integer**| Unique identifier of the customer account. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CartSummary**](CartSummary.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="rejectSuggestedDiscount"></a>
# **rejectSuggestedDiscount**
> Cart rejectSuggestedDiscount(cartId, discountId, responseFields)

Reject Suggested Discount

Reject Suggested Discount

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique Identifier of the Cart
    Integer discountId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Cart result = apiInstance.rejectSuggestedDiscount(cartId, discountId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#rejectSuggestedDiscount");
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
| **cartId** | **String**| Unique Identifier of the Cart | |
| **discountId** | **Integer**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Cart**](Cart.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeAllCartItems"></a>
# **removeAllCartItems**
> Cart removeAllCartItems()

Remove All Cart Items

Clears all the cart items from the cart of a current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    try {
      Cart result = apiInstance.removeAllCartItems();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#removeAllCartItems");
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

[**Cart**](Cart.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeAllCartItemsByCartId"></a>
# **removeAllCartItemsByCartId**
> Cart removeAllCartItemsByCartId(cartId)

Remove All Cart Items By CartId

Clears all the cart items from the cart by the cartId.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart.
    try {
      Cart result = apiInstance.removeAllCartItemsByCartId(cartId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#removeAllCartItemsByCartId");
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
| **cartId** | **String**| Unique identifier of the cart. | |

### Return type

[**Cart**](Cart.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeAllMessages"></a>
# **removeAllMessages**
> removeAllMessages()

Remove All Messages

Removes all messages associated with the cart of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    try {
      apiInstance.removeAllMessages();
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#removeAllMessages");
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

<a name="removeCoupon"></a>
# **removeCoupon**
> Cart removeCoupon(cartId, couponCode)

Remove Coupon

Remove a coupon that had been previously applied to the cart.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart with the coupon you want to remove.
    String couponCode = "couponCode_example"; // String | Coupon code to remove.
    try {
      Cart result = apiInstance.removeCoupon(cartId, couponCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#removeCoupon");
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
| **cartId** | **String**| Unique identifier of the cart with the coupon you want to remove. | |
| **couponCode** | **String**| Coupon code to remove. | |

### Return type

[**Cart**](Cart.md)

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
> Cart removeCoupons(cartId)

Remove Coupons

Removes all coupons that had been previously applied to the cart.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart with the coupon you want to remove.
    try {
      Cart result = apiInstance.removeCoupons(cartId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#removeCoupons");
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
| **cartId** | **String**| Unique identifier of the cart with the coupon you want to remove. | |

### Return type

[**Cart**](Cart.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeMessage"></a>
# **removeMessage**
> removeMessage(messageId)

Remove Message

Removes a single message associated with the cart of the current shopper specified by messageId.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String messageId = "messageId_example"; // String | Unique identifier of the message to delete.
    try {
      apiInstance.removeMessage(messageId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#removeMessage");
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
| **messageId** | **String**| Unique identifier of the message to delete. | |

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

<a name="updateCart"></a>
# **updateCart**
> Cart updateCart(responseFields, cart)

Update Cart

Updates the cart of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Cart cart = new Cart(); // Cart | All properties of the cart to update. Required property: Product.ProductCode.
    try {
      Cart result = apiInstance.updateCart(responseFields, cart);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#updateCart");
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
| **cart** | [**Cart**](Cart.md)| All properties of the cart to update. Required property: Product.ProductCode. | [optional] |

### Return type

[**Cart**](Cart.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCartByCartId"></a>
# **updateCartByCartId**
> Cart updateCartByCartId(cartId, responseFields, cart)

Update Cart By Cart Id

Updates the cart specified by cart ID

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Cart cart = new Cart(); // Cart | All properties of the cart to update. Required property: Product.ProductCode.
    try {
      Cart result = apiInstance.updateCartByCartId(cartId, responseFields, cart);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#updateCartByCartId");
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
| **cartId** | **String**| Unique identifier of the cart. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **cart** | [**Cart**](Cart.md)| All properties of the cart to update. Required property: Product.ProductCode. | [optional] |

### Return type

[**Cart**](Cart.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCartItem"></a>
# **updateCartItem**
> CartItem updateCartItem(cartItemId, zipCode, responseFields, cartItem)

Update Cart Item

Updates a particular cart item in the cart of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartItemId = "cartItemId_example"; // String | Unique identifier of the cart item.
    String zipCode = "zipCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CartItem cartItem = new CartItem(); // CartItem | All properties of the updated cart item. Required property: Product.ProductCode.
    try {
      CartItem result = apiInstance.updateCartItem(cartItemId, zipCode, responseFields, cartItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#updateCartItem");
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
| **cartItemId** | **String**| Unique identifier of the cart item. | |
| **zipCode** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **cartItem** | [**CartItem**](CartItem.md)| All properties of the updated cart item. Required property: Product.ProductCode. | [optional] |

### Return type

[**CartItem**](CartItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCartItemByCartId"></a>
# **updateCartItemByCartId**
> CartItem updateCartItemByCartId(cartId, cartItemId, zipCode, responseFields, cartItem)

Update Cart Item By CartId

Updates a particular cart item in the cart specified by card Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart.
    String cartItemId = "cartItemId_example"; // String | Unique identifier of the cart item.
    String zipCode = "zipCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CartItem cartItem = new CartItem(); // CartItem | All properties of the updated cart item. Required property: Product.ProductCode.
    try {
      CartItem result = apiInstance.updateCartItemByCartId(cartId, cartItemId, zipCode, responseFields, cartItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#updateCartItemByCartId");
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
| **cartId** | **String**| Unique identifier of the cart. | |
| **cartItemId** | **String**| Unique identifier of the cart item. | |
| **zipCode** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **cartItem** | [**CartItem**](CartItem.md)| All properties of the updated cart item. Required property: Product.ProductCode. | [optional] |

### Return type

[**CartItem**](CartItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCartItemQuantity"></a>
# **updateCartItemQuantity**
> CartItem updateCartItemQuantity(cartItemId, quantity, responseFields, itemQuantityUpdate)

Update Cart Item Quantity

Updates the quantity of an individual cart item in the cart of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartItemId = "cartItemId_example"; // String | Unique identifier of the cart item.
    Integer quantity = 56; // Integer | New quantity for the specified cart item.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ItemQuantityUpdate itemQuantityUpdate = new ItemQuantityUpdate(); // ItemQuantityUpdate | Update fields on the item.
    try {
      CartItem result = apiInstance.updateCartItemQuantity(cartItemId, quantity, responseFields, itemQuantityUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#updateCartItemQuantity");
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
| **cartItemId** | **String**| Unique identifier of the cart item. | |
| **quantity** | **Integer**| New quantity for the specified cart item. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **itemQuantityUpdate** | [**ItemQuantityUpdate**](ItemQuantityUpdate.md)| Update fields on the item. | [optional] |

### Return type

[**CartItem**](CartItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCartItemQuantityByCartId"></a>
# **updateCartItemQuantityByCartId**
> CartItem updateCartItemQuantityByCartId(cartId, cartItemId, quantity, responseFields, itemQuantityUpdate)

Update Cart Item Quantity By CartId

Updates the quantity of an individual cart item in the cart specified by cart Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart.
    String cartItemId = "cartItemId_example"; // String | Unique identifier of the cart item.
    Integer quantity = 56; // Integer | New quantity for the specified cart item.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ItemQuantityUpdate itemQuantityUpdate = new ItemQuantityUpdate(); // ItemQuantityUpdate | 
    try {
      CartItem result = apiInstance.updateCartItemQuantityByCartId(cartId, cartItemId, quantity, responseFields, itemQuantityUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#updateCartItemQuantityByCartId");
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
| **cartId** | **String**| Unique identifier of the cart. | |
| **cartItemId** | **String**| Unique identifier of the cart item. | |
| **quantity** | **Integer**| New quantity for the specified cart item. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **itemQuantityUpdate** | [**ItemQuantityUpdate**](ItemQuantityUpdate.md)|  | [optional] |

### Return type

[**CartItem**](CartItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCartItems"></a>
# **updateCartItems**
> List&lt;CartItem&gt; updateCartItems(throwErrorOnInvalidItems, zipCode, removeInvalidItems, responseFields, cartItem)

Update Cart Items

Updates multiple cart items in the cart of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    Boolean throwErrorOnInvalidItems = true; // Boolean | When set to true none of the items will be updated when some items are invalid. when set to false valid items are updated and invalid items are reverted or removed based on removeInvalidItems flag
    String zipCode = "zipCode_example"; // String | Zip Code used for inventory reservation if cart having STH items.
    Boolean removeInvalidItems = true; // Boolean | When set to true and throwErrorOnInvalidItems is false, invalid items will be removed from cart instead of reverted. This parameter is ignored when throwErrorOnInvalidItems is true.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<CartItem> cartItem = Arrays.asList(); // List<CartItem> | The items to update in the cart. Each item must include Id property.
    try {
      List<CartItem> result = apiInstance.updateCartItems(throwErrorOnInvalidItems, zipCode, removeInvalidItems, responseFields, cartItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#updateCartItems");
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
| **throwErrorOnInvalidItems** | **Boolean**| When set to true none of the items will be updated when some items are invalid. when set to false valid items are updated and invalid items are reverted or removed based on removeInvalidItems flag | [optional] |
| **zipCode** | **String**| Zip Code used for inventory reservation if cart having STH items. | [optional] |
| **removeInvalidItems** | **Boolean**| When set to true and throwErrorOnInvalidItems is false, invalid items will be removed from cart instead of reverted. This parameter is ignored when throwErrorOnInvalidItems is true. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **cartItem** | [**List&lt;CartItem&gt;**](CartItem.md)| The items to update in the cart. Each item must include Id property. | [optional] |

### Return type

[**List&lt;CartItem&gt;**](CartItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCartItemsByCartId"></a>
# **updateCartItemsByCartId**
> List&lt;CartItem&gt; updateCartItemsByCartId(cartId, throwErrorOnInvalidItems, zipCode, removeInvalidItems, responseFields, cartItem)

Update Cart Items By CartId

Updates multiple cart items in the cart specified by cartId.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart.
    Boolean throwErrorOnInvalidItems = true; // Boolean | When set to true none of the items will be updated when some items are invalid. when set to false valid items are updated and invalid items are reverted or removed based on removeInvalidItems flag
    String zipCode = "zipCode_example"; // String | Zip Code used for inventory reservation if cart having STH items.
    Boolean removeInvalidItems = true; // Boolean | When set to true and throwErrorOnInvalidItems is false, invalid items will be removed from cart instead of reverted. This parameter is ignored when throwErrorOnInvalidItems is true.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<CartItem> cartItem = Arrays.asList(); // List<CartItem> | The items to update in the cart. Each item must include Id property.
    try {
      List<CartItem> result = apiInstance.updateCartItemsByCartId(cartId, throwErrorOnInvalidItems, zipCode, removeInvalidItems, responseFields, cartItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#updateCartItemsByCartId");
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
| **cartId** | **String**| Unique identifier of the cart. | |
| **throwErrorOnInvalidItems** | **Boolean**| When set to true none of the items will be updated when some items are invalid. when set to false valid items are updated and invalid items are reverted or removed based on removeInvalidItems flag | [optional] |
| **zipCode** | **String**| Zip Code used for inventory reservation if cart having STH items. | [optional] |
| **removeInvalidItems** | **Boolean**| When set to true and throwErrorOnInvalidItems is false, invalid items will be removed from cart instead of reverted. This parameter is ignored when throwErrorOnInvalidItems is true. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **cartItem** | [**List&lt;CartItem&gt;**](CartItem.md)| The items to update in the cart. Each item must include Id property. | [optional] |

### Return type

[**List&lt;CartItem&gt;**](CartItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateExtendedProperties"></a>
# **updateExtendedProperties**
> List&lt;ExtendedProperty&gt; updateExtendedProperties(upsert, responseFields, extendedProperty)

Update Extended Properties

Update extended properties on the current cart.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    Boolean upsert = false; // Boolean | Allow insert or update
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ExtendedProperty> extendedProperty = Arrays.asList(); // List<ExtendedProperty> | Extended properties
    try {
      List<ExtendedProperty> result = apiInstance.updateExtendedProperties(upsert, responseFields, extendedProperty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#updateExtendedProperties");
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
| **upsert** | **Boolean**| Allow insert or update | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **extendedProperty** | [**List&lt;ExtendedProperty&gt;**](ExtendedProperty.md)| Extended properties | [optional] |

### Return type

[**List&lt;ExtendedProperty&gt;**](ExtendedProperty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateExtendedProperty"></a>
# **updateExtendedProperty**
> ExtendedProperty updateExtendedProperty(key, upsert, responseFields, extendedProperty)

Update Extended Property

Update extended property on the current cart using the key.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String key = "key_example"; // String | Unique identifier of the cart item
    Boolean upsert = false; // Boolean | Extended property
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ExtendedProperty extendedProperty = new ExtendedProperty(); // ExtendedProperty | Extended property
    try {
      ExtendedProperty result = apiInstance.updateExtendedProperty(key, upsert, responseFields, extendedProperty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#updateExtendedProperty");
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
| **key** | **String**| Unique identifier of the cart item | |
| **upsert** | **Boolean**| Extended property | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **extendedProperty** | [**ExtendedProperty**](ExtendedProperty.md)| Extended property | [optional] |

### Return type

[**ExtendedProperty**](ExtendedProperty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateUserCart"></a>
# **updateUserCart**
> Cart updateUserCart(userId, accountId, responseFields, cart)

Update User Cart

Updates the cart of the user specified by user ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartApi apiInstance = new CartApi(defaultClient);
    String userId = "userId_example"; // String | Unique identifier of the user.
    Integer accountId = 56; // Integer | Unique identifier of the customer account.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Cart cart = new Cart(); // Cart | All properties of the cart to update. Required property: Product.ProductCode.
    try {
      Cart result = apiInstance.updateUserCart(userId, accountId, responseFields, cart);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#updateUserCart");
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
| **userId** | **String**| Unique identifier of the user. | |
| **accountId** | **Integer**| Unique identifier of the customer account. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **cart** | [**Cart**](Cart.md)| All properties of the cart to update. Required property: Product.ProductCode. | [optional] |

### Return type

[**Cart**](Cart.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

