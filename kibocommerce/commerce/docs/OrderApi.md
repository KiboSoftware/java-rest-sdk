# OrderApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addExtendedProperties**](OrderApi.md#addExtendedProperties) | **POST** /commerce/orders/{orderId}/extendedproperties | Adds Extended Properties |
| [**addValidationResult**](OrderApi.md#addValidationResult) | **PUT** /commerce/orders/{orderId}/validationresults | Add Validation Result |
| [**applyAdjustment**](OrderApi.md#applyAdjustment) | **PUT** /commerce/orders/{orderId}/adjustment | Apply Adjustment |
| [**applyCoupon**](OrderApi.md#applyCoupon) | **PUT** /commerce/orders/{orderId}/coupons/{couponCode} | Apply Coupon |
| [**applyHandlingAdjustment**](OrderApi.md#applyHandlingAdjustment) | **PUT** /commerce/orders/{orderId}/adjustment/handling | Apply Handling Adjustment |
| [**applyShippingAdjustment**](OrderApi.md#applyShippingAdjustment) | **PUT** /commerce/orders/{orderId}/adjustment/shipping | Apply Shipping Adjustment |
| [**autoCapturePayments**](OrderApi.md#autoCapturePayments) | **POST** /commerce/orders/{orderId}/payments/autocapture | Auto Capture Payments |
| [**cancelOrder**](OrderApi.md#cancelOrder) | **PUT** /commerce/orders/cancel/{orderId} | Cancel Order |
| [**changeOrderPriceList**](OrderApi.md#changeOrderPriceList) | **PUT** /commerce/orders/{orderId}/priceList | Change Order Price List |
| [**changeOrderUserId**](OrderApi.md#changeOrderUserId) | **PUT** /commerce/orders/{orderId}/users | Change Order UserId |
| [**createDigitalPackage**](OrderApi.md#createDigitalPackage) | **POST** /commerce/orders/{orderId}/digitalpackages | Create Digital Package |
| [**createOrder**](OrderApi.md#createOrder) | **POST** /commerce/orders | Create Order |
| [**createOrderAttributes**](OrderApi.md#createOrderAttributes) | **POST** /commerce/orders/{orderId}/attributes | Create Order Attributes |
| [**createOrderItem**](OrderApi.md#createOrderItem) | **POST** /commerce/orders/{orderId}/items | Create Order Item |
| [**createOrderNote**](OrderApi.md#createOrderNote) | **POST** /commerce/orders/{orderId}/notes | Create Order Note |
| [**createPackage**](OrderApi.md#createPackage) | **POST** /commerce/orders/{orderId}/packages | Apply a package to the order |
| [**createPackageShipments**](OrderApi.md#createPackageShipments) | **POST** /commerce/orders/{orderId}/shipments | Creates a shipment by grouping together multiple packages into logical shipments |
| [**createPaymentAction**](OrderApi.md#createPaymentAction) | **POST** /commerce/orders/{orderId}/payments/actions | Create Payment Action |
| [**createPickup**](OrderApi.md#createPickup) | **POST** /commerce/orders/{orderId}/pickups | Create Pickup |
| [**createRefund**](OrderApi.md#createRefund) | **POST** /commerce/orders/{orderId}/refunds | Create Refund |
| [**deleteDigitalPackage**](OrderApi.md#deleteDigitalPackage) | **DELETE** /commerce/orders/{orderId}/digitalpackages/{digitalPackageId} | Delete Digital Package |
| [**deleteExtendedProperties**](OrderApi.md#deleteExtendedProperties) | **DELETE** /commerce/orders/{orderId}/extendedproperties | Delete Extended Properties |
| [**deleteExtendedProperty**](OrderApi.md#deleteExtendedProperty) | **DELETE** /commerce/orders/{orderId}/extendedproperties/{key} | Delete Extended Property |
| [**deleteOrderDraft**](OrderApi.md#deleteOrderDraft) | **PUT** /commerce/orders/{orderId}/draft | Delete Order Draft |
| [**deleteOrderItem**](OrderApi.md#deleteOrderItem) | **DELETE** /commerce/orders/{orderId}/items/{orderItemId} | Delete Order Item |
| [**deleteOrderNote**](OrderApi.md#deleteOrderNote) | **DELETE** /commerce/orders/{orderId}/notes/{noteId} | Delete Order Note |
| [**deletePackage**](OrderApi.md#deletePackage) | **DELETE** /commerce/orders/{orderId}/packages/{packageId} | Delete an order package |
| [**deletePickup**](OrderApi.md#deletePickup) | **DELETE** /commerce/orders/{orderId}/pickups/{pickupId} | Delete Pickup |
| [**deleteShipment**](OrderApi.md#deleteShipment) | **DELETE** /commerce/orders/{orderId}/shipments/{shipmentId} | Deletes an existing order shipment |
| [**evaluateOrderRollupStatus**](OrderApi.md#evaluateOrderRollupStatus) | **PUT** /commerce/orders/{orderId}/evaluaterollupstatus | Evaluate Order Rollup Status |
| [**getAvailableActions**](OrderApi.md#getAvailableActions) | **GET** /commerce/orders/{orderId}/actions | Get Available Actions |
| [**getAvailableDigitalPackageFulfillmentActions**](OrderApi.md#getAvailableDigitalPackageFulfillmentActions) | **GET** /commerce/orders/{orderId}/digitalpackages/{digitalPackageId}/actions | Get Available Digital Package Fulfillment Actions |
| [**getAvailablePackageFulfillmentActions**](OrderApi.md#getAvailablePackageFulfillmentActions) | **GET** /commerce/orders/{orderId}/packages/{packageId}/actions | Retrieves available fulfillment actions |
| [**getAvailablePaymentActions**](OrderApi.md#getAvailablePaymentActions) | **GET** /commerce/orders/{orderId}/payments/{paymentId}/actions | Get Available Payment Actions |
| [**getAvailablePickupFulfillmentActions**](OrderApi.md#getAvailablePickupFulfillmentActions) | **GET** /commerce/orders/{orderId}/pickups/{pickupId}/actions | Get Available Pickup Fulfillment Actions |
| [**getAvailableShipmentMethods**](OrderApi.md#getAvailableShipmentMethods) | **GET** /commerce/orders/{orderId}/shipments/methods | Get Available Shipment Methods |
| [**getBillingInfo**](OrderApi.md#getBillingInfo) | **GET** /commerce/orders/{orderId}/billinginfo | Get Billing Info |
| [**getDigitalPackage**](OrderApi.md#getDigitalPackage) | **GET** /commerce/orders/{orderId}/digitalpackages/{digitalPackageId} | Get Digital Package |
| [**getExtendedProperties**](OrderApi.md#getExtendedProperties) | **GET** /commerce/orders/{orderId}/extendedproperties | Get Extended Properties |
| [**getFulfillmentInfo**](OrderApi.md#getFulfillmentInfo) | **GET** /commerce/orders/{orderId}/fulfillmentinfo | Get Fulfillment Info |
| [**getOrder**](OrderApi.md#getOrder) | **GET** /commerce/orders/{orderId} | Get Order |
| [**getOrderAttributes**](OrderApi.md#getOrderAttributes) | **GET** /commerce/orders/{orderId}/attributes | Get Order Attributes |
| [**getOrderItem**](OrderApi.md#getOrderItem) | **GET** /commerce/orders/{orderId}/items/{orderItemId} | Get Order Item |
| [**getOrderItemViaLineId**](OrderApi.md#getOrderItemViaLineId) | **GET** /commerce/orders/{orderId}/items/{lineId} | Get Order Item Via LineId |
| [**getOrderItems**](OrderApi.md#getOrderItems) | **GET** /commerce/orders/{orderId}/items | Get Order Items |
| [**getOrderNote**](OrderApi.md#getOrderNote) | **GET** /commerce/orders/{orderId}/notes/{noteId} | Get Order Note |
| [**getOrderNotes**](OrderApi.md#getOrderNotes) | **GET** /commerce/orders/{orderId}/notes | Get Order Notes |
| [**getOrderReturnableItems**](OrderApi.md#getOrderReturnableItems) | **GET** /commerce/orders/{orderId}/returnableitems | Get Order Returnable Items |
| [**getOrders**](OrderApi.md#getOrders) | **GET** /commerce/orders | Get Orders |
| [**getPackage**](OrderApi.md#getPackage) | **GET** /commerce/orders/{orderId}/packages/{packageId} | Get an order package |
| [**getPackageLabel**](OrderApi.md#getPackageLabel) | **GET** /commerce/orders/{orderId}/packages/{packageId}/label | Get an order package label |
| [**getPayment**](OrderApi.md#getPayment) | **GET** /commerce/orders/{orderId}/payments/{paymentId} | Get Payment |
| [**getPayments**](OrderApi.md#getPayments) | **GET** /commerce/orders/{orderId}/payments | Get Payments |
| [**getPickup**](OrderApi.md#getPickup) | **GET** /commerce/orders/{orderId}/pickups/{pickupId} | Get Pickup |
| [**getReasons**](OrderApi.md#getReasons) | **GET** /commerce/orders/cancel/reasons | Get Order Cancel Reasons |
| [**getRefundReasons**](OrderApi.md#getRefundReasons) | **GET** /commerce/orders/refunds/refundreasons | Get Refund Reasons |
| [**getShipment**](OrderApi.md#getShipment) | **GET** /commerce/orders/{orderId}/shipments/{shipmentId} | Get Shipment |
| [**getTaxableOrders**](OrderApi.md#getTaxableOrders) | **GET** /commerce/orders/{orderId}/taxableorders | Get Taxable Orders |
| [**getValidationResults**](OrderApi.md#getValidationResults) | **GET** /commerce/orders/{orderId}/validationresults | Get Validation Results |
| [**performFulfillmentAction**](OrderApi.md#performFulfillmentAction) | **POST** /commerce/orders/{orderId}/fulfillment/actions | Perform Fulfillment Action |
| [**performOrderAction**](OrderApi.md#performOrderAction) | **POST** /commerce/orders/{orderId}/actions | Perform Order Action |
| [**performPaymentAction**](OrderApi.md#performPaymentAction) | **POST** /commerce/orders/{orderId}/payments/{paymentId}/actions | Perform Payment Action |
| [**priceOrder**](OrderApi.md#priceOrder) | **POST** /commerce/orders/price | Price Order |
| [**processDigitalWallet**](OrderApi.md#processDigitalWallet) | **PUT** /commerce/orders/{orderId}/digitalWallet/{digitalWalletType} | Process Digital Wallet |
| [**removeAdjustment**](OrderApi.md#removeAdjustment) | **DELETE** /commerce/orders/{orderId}/adjustment | Remove Adjustment |
| [**removeAlternateContact**](OrderApi.md#removeAlternateContact) | **PUT** /commerce/orders/{orderId}/removealternatecontact | Endpoint to remove alternate conatact from order and shipments. |
| [**removeCoupon**](OrderApi.md#removeCoupon) | **DELETE** /commerce/orders/{orderId}/coupons/{couponCode} | Remove Coupon |
| [**removeCoupons**](OrderApi.md#removeCoupons) | **DELETE** /commerce/orders/{orderId}/coupons | Remove Coupons |
| [**removeHandlingAdjustment**](OrderApi.md#removeHandlingAdjustment) | **DELETE** /commerce/orders/{orderId}/adjustment/handling | Remove Handling Adjustment |
| [**removeShippingAdjustment**](OrderApi.md#removeShippingAdjustment) | **DELETE** /commerce/orders/{orderId}/adjustment/shipping | Remove Shipping Adjustment |
| [**repriceShipment**](OrderApi.md#repriceShipment) | **POST** /commerce/orders/{orderId}/shipments/{shipmentNumber}/reprice | Reprice Shipment |
| [**resendGatewayGiftCardEmail**](OrderApi.md#resendGatewayGiftCardEmail) | **PUT** /commerce/orders/{orderId}/giftcard/{giftcardId}/resend | Resend Gateway Gift Card Email |
| [**resendOrderConfirmationEmail**](OrderApi.md#resendOrderConfirmationEmail) | **PUT** /commerce/orders/{orderId}/email/resend | Resend Order Confirmation Email |
| [**resendPackageFulfillmentEmail**](OrderApi.md#resendPackageFulfillmentEmail) | **POST** /commerce/orders/{orderId}/fulfillment/email/resend | Resend Package Fulfillment Email |
| [**resendRefundEmail**](OrderApi.md#resendRefundEmail) | **PUT** /commerce/orders/{orderId}/refunds/{refundId} | Resend Refund Email |
| [**setBillingInfo**](OrderApi.md#setBillingInfo) | **PUT** /commerce/orders/{orderId}/billinginfo | Set Billing Info |
| [**setFulFillmentInfo**](OrderApi.md#setFulFillmentInfo) | **PUT** /commerce/orders/{orderId}/fulfillmentinfo | Set Fulfillment Info |
| [**smsOptOut**](OrderApi.md#smsOptOut) | **PUT** /commerce/orders/sms/optout/{siteId} | Sms Opt Out |
| [**splitShipments**](OrderApi.md#splitShipments) | **POST** /commerce/orders/{orderId}/shipments/{shipmentNumber}/split | Split Shipments |
| [**updateDigitalPackage**](OrderApi.md#updateDigitalPackage) | **PUT** /commerce/orders/{orderId}/digitalpackages/{digitalPackageId} | Update Digital Package |
| [**updateExtendedProperties**](OrderApi.md#updateExtendedProperties) | **PUT** /commerce/orders/{orderId}/extendedproperties | Updated extended properties |
| [**updateExtendedProperty**](OrderApi.md#updateExtendedProperty) | **PUT** /commerce/orders/{orderId}/extendedproperties/{key} | Update Extended Property |
| [**updateItemDeliveryDate**](OrderApi.md#updateItemDeliveryDate) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/deliverydate | Updates the Delivery Date of a particular Order Item |
| [**updateItemDuty**](OrderApi.md#updateItemDuty) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/dutyAmount/{dutyAmount} | Update Item Duty |
| [**updateItemFulfillment**](OrderApi.md#updateItemFulfillment) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/fulfillment | Update Item Fulfillment |
| [**updateItemProductPrice**](OrderApi.md#updateItemProductPrice) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/price/{price} | Update Item Product Price |
| [**updateItemQuantity**](OrderApi.md#updateItemQuantity) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/quantity/{quantity} | Update Item Quantity |
| [**updateOrder**](OrderApi.md#updateOrder) | **PUT** /commerce/orders/{orderId} | Update Order |
| [**updateOrderAttributes**](OrderApi.md#updateOrderAttributes) | **PUT** /commerce/orders/{orderId}/attributes | Update Order Attributes |
| [**updateOrderDiscount**](OrderApi.md#updateOrderDiscount) | **PUT** /commerce/orders/{orderId}/discounts/{discountId} | Update Order Discount |
| [**updateOrderItemDiscount**](OrderApi.md#updateOrderItemDiscount) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/discounts/{discountId} | Update Order Item Discount |
| [**updateOrderNote**](OrderApi.md#updateOrderNote) | **PUT** /commerce/orders/{orderId}/notes/{noteId} | Update Order Note |
| [**updateOrderRestrictions**](OrderApi.md#updateOrderRestrictions) | **PUT** /commerce/orders/{orderId}/updateorderrestrictions | Update Order Restrictions |
| [**updatePackage**](OrderApi.md#updatePackage) | **PUT** /commerce/orders/{orderId}/packages/{packageId} | Delete an order package |
| [**updatePickup**](OrderApi.md#updatePickup) | **PUT** /commerce/orders/{orderId}/pickups/{pickupId} | Update Pickup |
| [**updateShipmentAdjustments**](OrderApi.md#updateShipmentAdjustments) | **POST** /commerce/orders/{orderId}/shipments/{shipmentNumber}/adjustments | Update Shipment Adjustments |
| [**updateShipmentItem**](OrderApi.md#updateShipmentItem) | **POST** /commerce/orders/{orderId}/shipments/{shipmentNumber}/item/{itemId}/adjustments | Update Shipment Item |
| [**updateSubscriptionInfo**](OrderApi.md#updateSubscriptionInfo) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/subscriptionInfo | Update Order Item Subscription Info, applies only to Draft Order |
| [**upsertAlternateContact**](OrderApi.md#upsertAlternateContact) | **PUT** /commerce/orders/{orderId}/upsertalternatecontact | Endpoint to add/update alternate contact |
| [**upsertInventoryTags**](OrderApi.md#upsertInventoryTags) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/upsertInventoryTags | Upsert Inventory Tags on OrderItem |


<a name="addExtendedProperties"></a>
# **addExtendedProperties**
> List&lt;ExtendedProperty&gt; addExtendedProperties(orderId, updateMode, version, extendedProperty)

Adds Extended Properties

Adds extended properties.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    List<ExtendedProperty> extendedProperty = Arrays.asList(); // List<ExtendedProperty> | Extended properties.
    try {
      List<ExtendedProperty> result = apiInstance.addExtendedProperties(orderId, updateMode, version, extendedProperty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#addExtendedProperties");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order item. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft) | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |
| **extendedProperty** | [**List&lt;ExtendedProperty&gt;**](ExtendedProperty.md)| Extended properties. | [optional] |

### Return type

[**List&lt;ExtendedProperty&gt;**](ExtendedProperty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addValidationResult"></a>
# **addValidationResult**
> OrderValidationResult addValidationResult(orderId, orderValidationResult)

Add Validation Result

Adds a validation result from an external system to an order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order to which you want to add a note.
    OrderValidationResult orderValidationResult = new OrderValidationResult(); // OrderValidationResult | The order validation result.
    try {
      OrderValidationResult result = apiInstance.addValidationResult(orderId, orderValidationResult);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#addValidationResult");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order to which you want to add a note. | |
| **orderValidationResult** | [**OrderValidationResult**](OrderValidationResult.md)| The order validation result. | [optional] |

### Return type

[**OrderValidationResult**](OrderValidationResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="applyAdjustment"></a>
# **applyAdjustment**
> Order applyAdjustment(orderId, updateMode, version, adjustment)

Apply Adjustment

Apply a pricing adjustment to the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the coupon.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    Adjustment adjustment = new Adjustment(); // Adjustment | Adjustment to apply to the order
    try {
      Order result = apiInstance.applyAdjustment(orderId, updateMode, version, adjustment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#applyAdjustment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the coupon. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft). | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |
| **adjustment** | [**Adjustment**](Adjustment.md)| Adjustment to apply to the order | [optional] |

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

<a name="applyCoupon"></a>
# **applyCoupon**
> Order applyCoupon(orderId, couponCode, updateMode, version)

Apply Coupon

Apply a coupon to the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the coupon.
    String couponCode = "couponCode_example"; // String | Coupon code that the customer supplies to get the discounted price.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    try {
      Order result = apiInstance.applyCoupon(orderId, couponCode, updateMode, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#applyCoupon");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the coupon. | |
| **couponCode** | **String**| Coupon code that the customer supplies to get the discounted price. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft). | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |

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

<a name="applyHandlingAdjustment"></a>
# **applyHandlingAdjustment**
> Order applyHandlingAdjustment(orderId, updateMode, version, adjustment)

Apply Handling Adjustment

Apply a handling adjustment to the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | 
    Adjustment adjustment = new Adjustment(); // Adjustment | 
    try {
      Order result = apiInstance.applyHandlingAdjustment(orderId, updateMode, version, adjustment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#applyHandlingAdjustment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft). | [optional] |
| **version** | **String**|  | [optional] |
| **adjustment** | [**Adjustment**](Adjustment.md)|  | [optional] |

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

<a name="applyShippingAdjustment"></a>
# **applyShippingAdjustment**
> Order applyShippingAdjustment(orderId, updateMode, version, adjustment)

Apply Shipping Adjustment

Apply a shipping adjustment to the order specified by order Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the coupon.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    Adjustment adjustment = new Adjustment(); // Adjustment | Adjustment to apply to the order
    try {
      Order result = apiInstance.applyShippingAdjustment(orderId, updateMode, version, adjustment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#applyShippingAdjustment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the coupon. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft). | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |
| **adjustment** | [**Adjustment**](Adjustment.md)| Adjustment to apply to the order | [optional] |

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

<a name="autoCapturePayments"></a>
# **autoCapturePayments**
> Order autoCapturePayments(orderId, forceCapture)

Auto Capture Payments

Amount to capture is total of fulfilled shipments - order adjustment - amount already captured.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order you want to auto capture.
    Boolean forceCapture = false; // Boolean | Also capture unfulfilled shipments (excluding backorder). Used when credit card auths are about to expire.
    try {
      Order result = apiInstance.autoCapturePayments(orderId, forceCapture);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#autoCapturePayments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order you want to auto capture. | |
| **forceCapture** | **Boolean**| Also capture unfulfilled shipments (excluding backorder). Used when credit card auths are about to expire. | [optional] [default to false] |

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

<a name="cancelOrder"></a>
# **cancelOrder**
> Order cancelOrder(orderId, commerceRuntimeCanceledReason)

Cancel Order

Cancel an order with the cancel reason.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    CommerceRuntimeCanceledReason commerceRuntimeCanceledReason = new CommerceRuntimeCanceledReason(); // CommerceRuntimeCanceledReason | 
    try {
      Order result = apiInstance.cancelOrder(orderId, commerceRuntimeCanceledReason);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#cancelOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **commerceRuntimeCanceledReason** | [**CommerceRuntimeCanceledReason**](CommerceRuntimeCanceledReason.md)|  | [optional] |

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

<a name="changeOrderPriceList"></a>
# **changeOrderPriceList**
> Order changeOrderPriceList(orderId, updateMode, version, body)

Change Order Price List

Changes the pricelist associated with an order.The desired price list code should be specified on the ApiContext.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order to change
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String body = "body_example"; // String | The code for the pricelist to apply
    try {
      Order result = apiInstance.changeOrderPriceList(orderId, updateMode, version, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#changeOrderPriceList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order to change | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft). | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |
| **body** | **String**| The code for the pricelist to apply | [optional] |

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

<a name="changeOrderUserId"></a>
# **changeOrderUserId**
> Order changeOrderUserId(orderId)

Change Order UserId

Changes the User ID associated with an order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order to change.
    try {
      Order result = apiInstance.changeOrderUserId(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#changeOrderUserId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order to change. | |

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

<a name="createDigitalPackage"></a>
# **createDigitalPackage**
> DigitalPackage createDigitalPackage(orderId, digitalPackage)

Create Digital Package

Apply a digital package to the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the digital package.
    DigitalPackage digitalPackage = new DigitalPackage(); // DigitalPackage | Digital Package to create and add to the order
    try {
      DigitalPackage result = apiInstance.createDigitalPackage(orderId, digitalPackage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createDigitalPackage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the digital package. | |
| **digitalPackage** | [**DigitalPackage**](DigitalPackage.md)| Digital Package to create and add to the order | [optional] |

### Return type

[**DigitalPackage**](DigitalPackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createOrder"></a>
# **createOrder**
> Order createOrder(cartId, quoteId, order)

Create Order

Creates a new order for no-cart quick-ordering scenarios. The full API payload required integration with the ecommerce front-end.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart. This is the original cart ID expressed as a GUID.
    String quoteId = "quoteId_example"; // String | Unique identifier of the quote.
    Order order = new Order(); // Order | All properties of the order to place.
    try {
      Order result = apiInstance.createOrder(cartId, quoteId, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **quoteId** | **String**| Unique identifier of the quote. | [optional] |
| **order** | [**Order**](Order.md)| All properties of the order to place. | [optional] |

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

<a name="createOrderAttributes"></a>
# **createOrderAttributes**
> List&lt;CommerceRuntimeOrderAttribute&gt; createOrderAttributes(orderId, commerceRuntimeOrderAttribute)

Create Order Attributes

Adds a attributeSet to the order. This is an internal attributeSet that the merchant might want to add to an order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order to which you want to add a attributeSet.
    List<CommerceRuntimeOrderAttribute> commerceRuntimeOrderAttribute = Arrays.asList(); // List<CommerceRuntimeOrderAttribute> | Attributes to upsert.
    try {
      List<CommerceRuntimeOrderAttribute> result = apiInstance.createOrderAttributes(orderId, commerceRuntimeOrderAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createOrderAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order to which you want to add a attributeSet. | |
| **commerceRuntimeOrderAttribute** | [**List&lt;CommerceRuntimeOrderAttribute&gt;**](CommerceRuntimeOrderAttribute.md)| Attributes to upsert. | [optional] |

### Return type

[**List&lt;CommerceRuntimeOrderAttribute&gt;**](CommerceRuntimeOrderAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createOrderItem"></a>
# **createOrderItem**
> Order createOrderItem(orderId, updateMode, version, skipInventoryCheck, zipCode, commerceRuntimeOrderItem)

Create Order Item

Adds a product or other item to the cart of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | ID of the order to add an item to.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    Boolean skipInventoryCheck = true; // Boolean | Determines wheter or not to check inventory on an item when adding an item to the order or when placing an order
    String zipCode = "zipCode_example"; // String | 
    CommerceRuntimeOrderItem commerceRuntimeOrderItem = new CommerceRuntimeOrderItem(); // CommerceRuntimeOrderItem | All properties of the new cart item. Required property: Product.ProductCode.
    try {
      Order result = apiInstance.createOrderItem(orderId, updateMode, version, skipInventoryCheck, zipCode, commerceRuntimeOrderItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createOrderItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| ID of the order to add an item to. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft) | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |
| **skipInventoryCheck** | **Boolean**| Determines wheter or not to check inventory on an item when adding an item to the order or when placing an order | [optional] |
| **zipCode** | **String**|  | [optional] |
| **commerceRuntimeOrderItem** | [**CommerceRuntimeOrderItem**](CommerceRuntimeOrderItem.md)| All properties of the new cart item. Required property: Product.ProductCode. | [optional] |

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

<a name="createOrderNote"></a>
# **createOrderNote**
> OrderNote createOrderNote(orderId, orderNote)

Create Order Note

Adds a note to the order. This is an internal note that the merchant might want to add to an order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order to which you want to add a note.
    OrderNote orderNote = new OrderNote(); // OrderNote | Text of the note. Maximum 256 characters.
    try {
      OrderNote result = apiInstance.createOrderNote(orderId, orderNote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createOrderNote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order to which you want to add a note. | |
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

<a name="createPackage"></a>
# **createPackage**
> CommerceRuntimePackage createPackage(orderId, commerceRuntimePackage)

Apply a package to the order



### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the package.
    CommerceRuntimePackage commerceRuntimePackage = new CommerceRuntimePackage(); // CommerceRuntimePackage | Package to create and add to the order
    try {
      CommerceRuntimePackage result = apiInstance.createPackage(orderId, commerceRuntimePackage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createPackage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the package. | |
| **commerceRuntimePackage** | [**CommerceRuntimePackage**](CommerceRuntimePackage.md)| Package to create and add to the order | [optional] |

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
> List&lt;CommerceRuntimePackage&gt; createPackageShipments(orderId, requestBody)

Creates a shipment by grouping together multiple packages into logical shipments



### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order which is ready to be shipped.
    List<String> requestBody = Arrays.asList(); // List<String> | Package ids to use in creating shipments.
    try {
      List<CommerceRuntimePackage> result = apiInstance.createPackageShipments(orderId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createPackageShipments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order which is ready to be shipped. | |
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

<a name="createPaymentAction"></a>
# **createPaymentAction**
> Order createPaymentAction(orderId, paymentAction)

Create Payment Action

Sets the action of the specified payment transaction interaction. Available actions depend on the current status of the payment transaction.If in doubt, get a list of available payment actions first.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose payment action you want to change.
    PaymentAction paymentAction = new PaymentAction(); // PaymentAction | Action to be performed, along with any metadata.
    try {
      Order result = apiInstance.createPaymentAction(orderId, paymentAction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createPaymentAction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose payment action you want to change. | |
| **paymentAction** | [**PaymentAction**](PaymentAction.md)| Action to be performed, along with any metadata. | [optional] |

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

<a name="createPickup"></a>
# **createPickup**
> Pickup createPickup(orderId, pickup)

Create Pickup

Apply a pickup to the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the pickup.
    Pickup pickup = new Pickup(); // Pickup | Pickup to create and add to the order
    try {
      Pickup result = apiInstance.createPickup(orderId, pickup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createPickup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the pickup. | |
| **pickup** | [**Pickup**](Pickup.md)| Pickup to create and add to the order | [optional] |

### Return type

[**Pickup**](Pickup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createRefund"></a>
# **createRefund**
> Refund createRefund(orderId, refund)

Create Refund

Apply a refund to the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the package.
    Refund refund = new Refund(); // Refund | Refund to create on the order
    try {
      Refund result = apiInstance.createRefund(orderId, refund);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createRefund");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the package. | |
| **refund** | [**Refund**](Refund.md)| Refund to create on the order | [optional] |

### Return type

[**Refund**](Refund.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteDigitalPackage"></a>
# **deleteDigitalPackage**
> deleteDigitalPackage(orderId, digitalPackageId)

Delete Digital Package

Delete an order digital package.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the package.
    String digitalPackageId = "digitalPackageId_example"; // String | Digital package to remove from the order
    try {
      apiInstance.deleteDigitalPackage(orderId, digitalPackageId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#deleteDigitalPackage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the package. | |
| **digitalPackageId** | **String**| Digital package to remove from the order | |

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

<a name="deleteExtendedProperties"></a>
# **deleteExtendedProperties**
> deleteExtendedProperties(orderId, updateMode, version, requestBody)

Delete Extended Properties

Delete extended properties on the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    List<String> requestBody = Arrays.asList(); // List<String> | Keys of extended properties
    try {
      apiInstance.deleteExtendedProperties(orderId, updateMode, version, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#deleteExtendedProperties");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order item | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft) | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |
| **requestBody** | [**List&lt;String&gt;**](String.md)| Keys of extended properties | [optional] |

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

<a name="deleteExtendedProperty"></a>
# **deleteExtendedProperty**
> deleteExtendedProperty(orderId, key, updateMode, version)

Delete Extended Property

Removes a particular order item from the order of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String key = "key_example"; // String | Unique identifier of the order item.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    try {
      apiInstance.deleteExtendedProperty(orderId, key, updateMode, version);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#deleteExtendedProperty");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **key** | **String**| Unique identifier of the order item. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft) | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |

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

<a name="deleteOrderDraft"></a>
# **deleteOrderDraft**
> deleteOrderDraft(orderId, version)

Delete Order Draft

Deletes a draft version of an order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | The order ID to update.
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    try {
      apiInstance.deleteOrderDraft(orderId, version);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#deleteOrderDraft");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order ID to update. | |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |

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

<a name="deleteOrderItem"></a>
# **deleteOrderItem**
> Order deleteOrderItem(orderId, orderItemId, updateMode, version)

Delete Order Item

Removes a particular order item from the order of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    try {
      Order result = apiInstance.deleteOrderItem(orderId, orderItemId, updateMode, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#deleteOrderItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **orderItemId** | **String**| Unique identifier of the order item. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft) | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |

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

<a name="deleteOrderNote"></a>
# **deleteOrderNote**
> deleteOrderNote(orderId, noteId)

Delete Order Note

Deletes a specific order note on an order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose note you want to delete.
    String noteId = "noteId_example"; // String | Unique identifier of the note whose text you want to delete.
    try {
      apiInstance.deleteOrderNote(orderId, noteId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#deleteOrderNote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose note you want to delete. | |
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

<a name="deletePackage"></a>
# **deletePackage**
> deletePackage(orderId, packageId)

Delete an order package



### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the package.
    String packageId = "packageId_example"; // String | Package to remove from the order
    try {
      apiInstance.deletePackage(orderId, packageId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#deletePackage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the package. | |
| **packageId** | **String**| Package to remove from the order | |

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

<a name="deletePickup"></a>
# **deletePickup**
> deletePickup(orderId, pickupId)

Delete Pickup

Delete an order pickup.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the pickup.
    String pickupId = "pickupId_example"; // String | Pickup to remove from the order
    try {
      apiInstance.deletePickup(orderId, pickupId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#deletePickup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the pickup. | |
| **pickupId** | **String**| Pickup to remove from the order | |

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
> deleteShipment(orderId, shipmentId)

Deletes an existing order shipment

Deletes an existing order shipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String shipmentId = "shipmentId_example"; // String | 
    try {
      apiInstance.deleteShipment(orderId, shipmentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#deleteShipment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **shipmentId** | **String**|  | |

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

<a name="evaluateOrderRollupStatus"></a>
# **evaluateOrderRollupStatus**
> Order evaluateOrderRollupStatus(orderId)

Evaluate Order Rollup Status

Evaluate Order Rollup Status

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    try {
      Order result = apiInstance.evaluateOrderRollupStatus(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#evaluateOrderRollupStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

<a name="getAvailableActions"></a>
# **getAvailableActions**
> List&lt;String&gt; getAvailableActions(orderId)

Get Available Actions

Retrieves available order actions which depends on the status of the order.Possible actions can be Create, Submit, SetAsProcessing, Close or Cancel.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose available order actions you want to get.
    try {
      List<String> result = apiInstance.getAvailableActions(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getAvailableActions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose available order actions you want to get. | |

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

<a name="getAvailableDigitalPackageFulfillmentActions"></a>
# **getAvailableDigitalPackageFulfillmentActions**
> List&lt;String&gt; getAvailableDigitalPackageFulfillmentActions(orderId, digitalPackageId)

Get Available Digital Package Fulfillment Actions

Retrieves available fulfillment actions.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order on which to get a list of available actions.
    String digitalPackageId = "digitalPackageId_example"; // String | Package ID to get fulfillment actions for.
    try {
      List<String> result = apiInstance.getAvailableDigitalPackageFulfillmentActions(orderId, digitalPackageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getAvailableDigitalPackageFulfillmentActions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order on which to get a list of available actions. | |
| **digitalPackageId** | **String**| Package ID to get fulfillment actions for. | |

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

<a name="getAvailablePackageFulfillmentActions"></a>
# **getAvailablePackageFulfillmentActions**
> List&lt;String&gt; getAvailablePackageFulfillmentActions(orderId, packageId)

Retrieves available fulfillment actions



### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order on which to get a list of available actions.
    String packageId = "packageId_example"; // String | Package ID to get fulfillment actions for.
    try {
      List<String> result = apiInstance.getAvailablePackageFulfillmentActions(orderId, packageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getAvailablePackageFulfillmentActions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order on which to get a list of available actions. | |
| **packageId** | **String**| Package ID to get fulfillment actions for. | |

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

<a name="getAvailablePaymentActions"></a>
# **getAvailablePaymentActions**
> List&lt;String&gt; getAvailablePaymentActions(orderId, paymentId)

Get Available Payment Actions

Retrieves available payment actions which depends on the status of the order&#39;s payment transaction.   Possible actions can be \&quot;Create,\&quot; \&quot;Capture,\&quot; \&quot;Void,\&quot; \&quot;AuthCapture,\&quot; or \&quot;ReceiveCheck.\&quot;

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose available payment actions you want to get.
    String paymentId = "paymentId_example"; // String | 
    try {
      List<String> result = apiInstance.getAvailablePaymentActions(orderId, paymentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getAvailablePaymentActions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose available payment actions you want to get. | |
| **paymentId** | **String**|  | |

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

<a name="getAvailablePickupFulfillmentActions"></a>
# **getAvailablePickupFulfillmentActions**
> List&lt;String&gt; getAvailablePickupFulfillmentActions(orderId, pickupId)

Get Available Pickup Fulfillment Actions

Retrieves available fulfillment actions.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order on which to get a list of available actions.
    String pickupId = "pickupId_example"; // String | Pickup ID to get fulfillment actions for.
    try {
      List<String> result = apiInstance.getAvailablePickupFulfillmentActions(orderId, pickupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getAvailablePickupFulfillmentActions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order on which to get a list of available actions. | |
| **pickupId** | **String**| Pickup ID to get fulfillment actions for. | |

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

<a name="getAvailableShipmentMethods"></a>
# **getAvailableShipmentMethods**
> List&lt;CommerceRuntimeShippingRate&gt; getAvailableShipmentMethods(orderId, draft)

Get Available Shipment Methods

Retrieves available shipping methods. Typically used to display available shipping method options on the checkout page.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose shipping methods you want to get.
    Boolean draft = true; // Boolean | Gets a draft copy of the order if one is available.
    try {
      List<CommerceRuntimeShippingRate> result = apiInstance.getAvailableShipmentMethods(orderId, draft);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getAvailableShipmentMethods");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose shipping methods you want to get. | |
| **draft** | **Boolean**| Gets a draft copy of the order if one is available. | [optional] |

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

<a name="getBillingInfo"></a>
# **getBillingInfo**
> BillingInfo getBillingInfo(orderId, draft)

Get Billing Info

Retrieves the customer&#39;s billing address.If paying by credit card, it retrieves the card&#39;s number, expiration date, card holder&#39;s name and billing address.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifer of the order whose customer's payment source you want to get.
    Boolean draft = true; // Boolean | Determines whether the draft version should be retrieved if one exists.
    try {
      BillingInfo result = apiInstance.getBillingInfo(orderId, draft);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getBillingInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifer of the order whose customer&#39;s payment source you want to get. | |
| **draft** | **Boolean**| Determines whether the draft version should be retrieved if one exists. | [optional] |

### Return type

[**BillingInfo**](BillingInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDigitalPackage"></a>
# **getDigitalPackage**
> DigitalPackage getDigitalPackage(orderId, digitalPackageId)

Get Digital Package

Get an order digital package.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the package.
    String digitalPackageId = "digitalPackageId_example"; // String | Digital Package Id
    try {
      DigitalPackage result = apiInstance.getDigitalPackage(orderId, digitalPackageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getDigitalPackage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the package. | |
| **digitalPackageId** | **String**| Digital Package Id | |

### Return type

[**DigitalPackage**](DigitalPackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getExtendedProperties"></a>
# **getExtendedProperties**
> List&lt;ExtendedProperty&gt; getExtendedProperties(orderId, draft)

Get Extended Properties

Get extended properties on an order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    Boolean draft = true; // Boolean | 
    try {
      List<ExtendedProperty> result = apiInstance.getExtendedProperties(orderId, draft);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getExtendedProperties");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **draft** | **Boolean**|  | [optional] |

### Return type

[**List&lt;ExtendedProperty&gt;**](ExtendedProperty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getFulfillmentInfo"></a>
# **getFulfillmentInfo**
> FulfillmentInfo getFulfillmentInfo(orderId, draft)

Get Fulfillment Info

Retrieves an order&#39;s fulfillment information specified by order ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order.
    Boolean draft = true; // Boolean | Determines whether the draft version should be retrieved if one exists.
    try {
      FulfillmentInfo result = apiInstance.getFulfillmentInfo(orderId, draft);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getFulfillmentInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order. | |
| **draft** | **Boolean**| Determines whether the draft version should be retrieved if one exists. | [optional] |

### Return type

[**FulfillmentInfo**](FulfillmentInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOrder"></a>
# **getOrder**
> Order getOrder(orderId, draft, includeBin, mode)

Get Order

Retrieves the details of an order specified by the order ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose details you want.
    Boolean draft = true; // Boolean | Gets a draft copy of the order if one is available
    Boolean includeBin = false; // Boolean | Whether to include BIN numbers on credit card payments
    String mode = "mode_example"; // String | 'synthesized' to provide a synthesized order from shipment data
    try {
      Order result = apiInstance.getOrder(orderId, draft, includeBin, mode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose details you want. | |
| **draft** | **Boolean**| Gets a draft copy of the order if one is available | [optional] |
| **includeBin** | **Boolean**| Whether to include BIN numbers on credit card payments | [optional] [default to false] |
| **mode** | **String**| &#39;synthesized&#39; to provide a synthesized order from shipment data | [optional] |

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

<a name="getOrderAttributes"></a>
# **getOrderAttributes**
> List&lt;CommerceRuntimeOrderAttribute&gt; getOrderAttributes(orderId)

Get Order Attributes

Retrieves a list of all attribute sets for an order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose attributeSets you want to get.
    try {
      List<CommerceRuntimeOrderAttribute> result = apiInstance.getOrderAttributes(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrderAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose attributeSets you want to get. | |

### Return type

[**List&lt;CommerceRuntimeOrderAttribute&gt;**](CommerceRuntimeOrderAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOrderItem"></a>
# **getOrderItem**
> CommerceRuntimeOrderItem getOrderItem(orderId, orderItemId, draft)

Get Order Item

Retrieves the details of a single order item.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose item you want to get.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item whose details you want to get.
    Boolean draft = true; // Boolean | Gets a draft copy of the order if one is available
    try {
      CommerceRuntimeOrderItem result = apiInstance.getOrderItem(orderId, orderItemId, draft);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrderItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose item you want to get. | |
| **orderItemId** | **String**| Unique identifier of the order item whose details you want to get. | |
| **draft** | **Boolean**| Gets a draft copy of the order if one is available | [optional] |

### Return type

[**CommerceRuntimeOrderItem**](CommerceRuntimeOrderItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOrderItemViaLineId"></a>
# **getOrderItemViaLineId**
> CommerceRuntimeOrderItem getOrderItemViaLineId(orderId, lineId, draft)

Get Order Item Via LineId

Retrieves the details of a single order item via its line id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose item you want to get.
    Integer lineId = 56; // Integer | Line ID of the order item whose details you want to get.
    Boolean draft = true; // Boolean | Gets a draft copy of the order if one is available
    try {
      CommerceRuntimeOrderItem result = apiInstance.getOrderItemViaLineId(orderId, lineId, draft);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrderItemViaLineId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose item you want to get. | |
| **lineId** | **Integer**| Line ID of the order item whose details you want to get. | |
| **draft** | **Boolean**| Gets a draft copy of the order if one is available | [optional] |

### Return type

[**CommerceRuntimeOrderItem**](CommerceRuntimeOrderItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOrderItems"></a>
# **getOrderItems**
> OrderItemCollection getOrderItems(orderId, draft)

Get Order Items

Retrieves the details of all items in an order specified by order Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose items you want to get.
    Boolean draft = true; // Boolean | Gets a draft copy of the order if one is available
    try {
      OrderItemCollection result = apiInstance.getOrderItems(orderId, draft);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrderItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose items you want to get. | |
| **draft** | **Boolean**| Gets a draft copy of the order if one is available | [optional] |

### Return type

[**OrderItemCollection**](OrderItemCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOrderNote"></a>
# **getOrderNote**
> OrderNote getOrderNote(orderId, noteId)

Get Order Note

Retrieves a specific order note from an order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose note you want to get.
    String noteId = "noteId_example"; // String | Unique identifier of the note whose text you want to get.
    try {
      OrderNote result = apiInstance.getOrderNote(orderId, noteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrderNote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose note you want to get. | |
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

<a name="getOrderNotes"></a>
# **getOrderNotes**
> List&lt;OrderNote&gt; getOrderNotes(orderId)

Get Order Notes

Retrieves a list of all notes for an order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose notes you want to get.
    try {
      List<OrderNote> result = apiInstance.getOrderNotes(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrderNotes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose notes you want to get. | |

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

<a name="getOrderReturnableItems"></a>
# **getOrderReturnableItems**
> OrderReturnableItemCollection getOrderReturnableItems(orderId)

Get Order Returnable Items

Provides fulfillment information for order items such as quantity ordered, fulfilled, and returned. Indicates which items are eligible for return.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    try {
      OrderReturnableItemCollection result = apiInstance.getOrderReturnableItems(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrderReturnableItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

### Return type

[**OrderReturnableItemCollection**](OrderReturnableItemCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOrders"></a>
# **getOrders**
> OrderCollection getOrders(startIndex, pageSize, sortBy, filter, q, qLimit, includeBin, responseGroups, mode)

Get Orders

Retrieves a list of orders according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    Integer startIndex = 56; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.               For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 56; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals,               gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String q = "q_example"; // String | Text to perform a search on
    Integer qLimit = 56; // Integer | Limit of the records to include in a search, used for global search
    Boolean includeBin = false; // Boolean | Whether to include BIN numbers on credit card payments
    String responseGroups = "responseGroups_example"; // String | Response groups to return or filter the order graph
    String mode = "mode_example"; // String | 'synthesized' to provide a synthesized order from shipment data
    try {
      OrderCollection result = apiInstance.getOrders(startIndex, pageSize, sortBy, filter, q, qLimit, includeBin, responseGroups, mode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.               For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. | [optional] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals,               gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **q** | **String**| Text to perform a search on | [optional] |
| **qLimit** | **Integer**| Limit of the records to include in a search, used for global search | [optional] |
| **includeBin** | **Boolean**| Whether to include BIN numbers on credit card payments | [optional] [default to false] |
| **responseGroups** | **String**| Response groups to return or filter the order graph | [optional] |
| **mode** | **String**| &#39;synthesized&#39; to provide a synthesized order from shipment data | [optional] |

### Return type

[**OrderCollection**](OrderCollection.md)

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
> CommerceRuntimePackage getPackage(orderId, packageId)

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
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the package.
    String packageId = "packageId_example"; // String | Package to remove from the order
    try {
      CommerceRuntimePackage result = apiInstance.getPackage(orderId, packageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getPackage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the package. | |
| **packageId** | **String**| Package to remove from the order | |

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
> getPackageLabel(orderId, packageId)

Get an order package label

Get an order package label

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the package.
    String packageId = "packageId_example"; // String | Package to remove from the order
    try {
      apiInstance.getPackageLabel(orderId, packageId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getPackageLabel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the package. | |
| **packageId** | **String**| Package to remove from the order | |

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
> Payment getPayment(orderId, paymentId)

Get Payment

Retrieves a specific payment transaction from the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose payment transaction you want to get.
    String paymentId = "paymentId_example"; // String | Unique identifier of the payment transaction you want to get.
    try {
      Payment result = apiInstance.getPayment(orderId, paymentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getPayment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose payment transaction you want to get. | |
| **paymentId** | **String**| Unique identifier of the payment transaction you want to get. | |

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

<a name="getPayments"></a>
# **getPayments**
> PaymentCollection getPayments(orderId)

Get Payments

Retrieves payment transactions for an order. Allows filtering and sorting.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose payment transactions you want to get.
    try {
      PaymentCollection result = apiInstance.getPayments(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getPayments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose payment transactions you want to get. | |

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

<a name="getPickup"></a>
# **getPickup**
> Pickup getPickup(orderId, pickupId)

Get Pickup

Gets a specified pickup on the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the pickup.
    String pickupId = "pickupId_example"; // String | Pickup to remove from the order
    try {
      Pickup result = apiInstance.getPickup(orderId, pickupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getPickup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the pickup. | |
| **pickupId** | **String**| Pickup to remove from the order | |

### Return type

[**Pickup**](Pickup.md)

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
> CancelReasonCollection getReasons(category)

Get Order Cancel Reasons

Gets order cancellation reasons based on a category.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String category = "SHOPPER"; // String | 
    try {
      CancelReasonCollection result = apiInstance.getReasons(category);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getReasons");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **category** | **String**|  | [optional] [default to SHOPPER] |

### Return type

[**CancelReasonCollection**](CancelReasonCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getRefundReasons"></a>
# **getRefundReasons**
> RefundReasonCollection getRefundReasons()

Get Refund Reasons

Gets all the refund reasons.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    try {
      RefundReasonCollection result = apiInstance.getRefundReasons();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getRefundReasons");
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

[**RefundReasonCollection**](RefundReasonCollection.md)

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
> CommerceRuntimeShipment getShipment(orderId, shipmentId)

Get Shipment

Allows a shipment to be retrieved for the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | ID of the order
    String shipmentId = "shipmentId_example"; // String | Shipment ID of the order.
    try {
      CommerceRuntimeShipment result = apiInstance.getShipment(orderId, shipmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getShipment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| ID of the order | |
| **shipmentId** | **String**| Shipment ID of the order. | |

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

<a name="getTaxableOrders"></a>
# **getTaxableOrders**
> List&lt;PricingTaxableOrder&gt; getTaxableOrders(orderId)

Get Taxable Orders

Gets an order divided up into \&quot;TaxableOrders\&quot; based on the source and delivery locations of the order items. Generally used for the purpose of splitting it into multiple taxable orders in order to fulfill the order in multiple locations.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose taxable orders you want to get.
    try {
      List<PricingTaxableOrder> result = apiInstance.getTaxableOrders(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getTaxableOrders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose taxable orders you want to get. | |

### Return type

[**List&lt;PricingTaxableOrder&gt;**](PricingTaxableOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getValidationResults"></a>
# **getValidationResults**
> List&lt;OrderValidationResult&gt; getValidationResults(orderId)

Get Validation Results

Gets list of validation results on an order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order to which you want to add a note.
    try {
      List<OrderValidationResult> result = apiInstance.getValidationResults(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getValidationResults");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order to which you want to add a note. | |

### Return type

[**List&lt;OrderValidationResult&gt;**](OrderValidationResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="performFulfillmentAction"></a>
# **performFulfillmentAction**
> Order performFulfillmentAction(orderId, fulfillmentAction)

Perform Fulfillment Action

Sets the fulfillment action to &#39;Ship&#39;. To ship an order, the order must have a customer name, the &#39;Open&#39; or &#39;OpenAdProcessing&#39; status, full shipping address, and shipping method.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order which is ready to be shipped.
    FulfillmentAction fulfillmentAction = new FulfillmentAction(); // FulfillmentAction | Action to perform along with metadata about which packages, digital packages, or pickups to perform the action on
    try {
      Order result = apiInstance.performFulfillmentAction(orderId, fulfillmentAction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#performFulfillmentAction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order which is ready to be shipped. | |
| **fulfillmentAction** | [**FulfillmentAction**](FulfillmentAction.md)| Action to perform along with metadata about which packages, digital packages, or pickups to perform the action on | [optional] |

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

<a name="performOrderAction"></a>
# **performOrderAction**
> Order performOrderAction(orderId, orderAction)

Perform Order Action

Set an action on the order. Available actions depend on the current status of the order. If in doubt, get a list of available order actions first.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order.
    OrderAction orderAction = new OrderAction(); // OrderAction | Action to perform, which can be \"SubmitOrder\", \"ValidateOrder\", \"AcceptOrder\", \"CancelOrder\", \"CompleteOrder\", \"AbandonOrder\", \"ReopenOrder\".
    try {
      Order result = apiInstance.performOrderAction(orderId, orderAction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#performOrderAction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order. | |
| **orderAction** | [**OrderAction**](OrderAction.md)| Action to perform, which can be \&quot;SubmitOrder\&quot;, \&quot;ValidateOrder\&quot;, \&quot;AcceptOrder\&quot;, \&quot;CancelOrder\&quot;, \&quot;CompleteOrder\&quot;, \&quot;AbandonOrder\&quot;, \&quot;ReopenOrder\&quot;. | [optional] |

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

<a name="performPaymentAction"></a>
# **performPaymentAction**
> Order performPaymentAction(orderId, paymentId, paymentAction)

Perform Payment Action

Performs a specific payment action. Available actions depend on the current status of the payment transaction.   If in doubt, get a list of available payment actions first.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose payment action you want to change.
    String paymentId = "paymentId_example"; // String | 
    PaymentAction paymentAction = new PaymentAction(); // PaymentAction | Action to be performed, along with any metadata.
    try {
      Order result = apiInstance.performPaymentAction(orderId, paymentId, paymentAction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#performPaymentAction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose payment action you want to change. | |
| **paymentId** | **String**|  | |
| **paymentAction** | [**PaymentAction**](PaymentAction.md)| Action to be performed, along with any metadata. | [optional] |

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

<a name="priceOrder"></a>
# **priceOrder**
> Order priceOrder(refreshShipping, order)

Price Order



### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    Boolean refreshShipping = true; // Boolean | 
    Order order = new Order(); // Order | 
    try {
      Order result = apiInstance.priceOrder(refreshShipping, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#priceOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **refreshShipping** | **Boolean**|  | [optional] |
| **order** | [**Order**](Order.md)|  | [optional] |

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

<a name="processDigitalWallet"></a>
# **processDigitalWallet**
> Order processDigitalWallet(orderId, digitalWalletType, digitalWallet)

Process Digital Wallet

Process digital wallet (used to hold 3rd party payment and shipping information) on the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String digitalWalletType = "digitalWalletType_example"; // String | 
    DigitalWallet digitalWallet = new DigitalWallet(); // DigitalWallet | 
    try {
      Order result = apiInstance.processDigitalWallet(orderId, digitalWalletType, digitalWallet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#processDigitalWallet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **digitalWalletType** | **String**|  | |
| **digitalWallet** | [**DigitalWallet**](DigitalWallet.md)|  | [optional] |

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

<a name="removeAdjustment"></a>
# **removeAdjustment**
> Order removeAdjustment(orderId, updateMode, version)

Remove Adjustment

Removes an adjustment that had been previously applied to the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with the coupon you want to remove.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    try {
      Order result = apiInstance.removeAdjustment(orderId, updateMode, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#removeAdjustment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with the coupon you want to remove. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft). | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |

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

<a name="removeAlternateContact"></a>
# **removeAlternateContact**
> Order removeAlternateContact(orderId)

Endpoint to remove alternate conatact from order and shipments.



### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    try {
      Order result = apiInstance.removeAlternateContact(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#removeAlternateContact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

<a name="removeCoupon"></a>
# **removeCoupon**
> Order removeCoupon(orderId, couponCode, updateMode, version)

Remove Coupon

Removes a coupon that had been previously applied to the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with the coupon you want to remove.
    String couponCode = "couponCode_example"; // String | Coupon code to remove.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    try {
      Order result = apiInstance.removeCoupon(orderId, couponCode, updateMode, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#removeCoupon");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with the coupon you want to remove. | |
| **couponCode** | **String**| Coupon code to remove. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft). | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |

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

<a name="removeCoupons"></a>
# **removeCoupons**
> Order removeCoupons(orderId, updateMode, version)

Remove Coupons

Removes all coupons that had been previously applied to the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with the coupon you want to remove.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    try {
      Order result = apiInstance.removeCoupons(orderId, updateMode, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#removeCoupons");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with the coupon you want to remove. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft). | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |

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

<a name="removeHandlingAdjustment"></a>
# **removeHandlingAdjustment**
> Order removeHandlingAdjustment(orderId, updateMode, version)

Remove Handling Adjustment

Removes a coupon that had been previously applied to the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String updateMode = "updateMode_example"; // String | 
    String version = "version_example"; // String | 
    try {
      Order result = apiInstance.removeHandlingAdjustment(orderId, updateMode, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#removeHandlingAdjustment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **updateMode** | **String**|  | [optional] |
| **version** | **String**|  | [optional] |

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

<a name="removeShippingAdjustment"></a>
# **removeShippingAdjustment**
> Order removeShippingAdjustment(orderId, updateMode, version)

Remove Shipping Adjustment

Removes an adjustment that had been previously applied to the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with the coupon you want to remove.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    try {
      Order result = apiInstance.removeShippingAdjustment(orderId, updateMode, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#removeShippingAdjustment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with the coupon you want to remove. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft). | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |

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

<a name="repriceShipment"></a>
# **repriceShipment**
> CommerceRuntimeShipment repriceShipment(shipmentNumber, orderId, repriceShipmentObject)

Reprice Shipment

Allows a shipment to be repriced.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | 
    String orderId = "orderId_example"; // String | 
    RepriceShipmentObject repriceShipmentObject = new RepriceShipmentObject(); // RepriceShipmentObject | 
    try {
      CommerceRuntimeShipment result = apiInstance.repriceShipment(shipmentNumber, orderId, repriceShipmentObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#repriceShipment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **shipmentNumber** | **Integer**|  | |
| **orderId** | **String**|  | |
| **repriceShipmentObject** | [**RepriceShipmentObject**](RepriceShipmentObject.md)|  | [optional] |

### Return type

[**CommerceRuntimeShipment**](CommerceRuntimeShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="resendGatewayGiftCardEmail"></a>
# **resendGatewayGiftCardEmail**
> resendGatewayGiftCardEmail(orderId, giftcardId)

Resend Gateway Gift Card Email

Resend gateway giftcard email.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String giftcardId = "giftcardId_example"; // String | 
    try {
      apiInstance.resendGatewayGiftCardEmail(orderId, giftcardId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#resendGatewayGiftCardEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **giftcardId** | **String**|  | |

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

<a name="resendOrderConfirmationEmail"></a>
# **resendOrderConfirmationEmail**
> resendOrderConfirmationEmail(orderId, orderAction)

Resend Order Confirmation Email

Resend order confirmation email specified by the order Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    OrderAction orderAction = new OrderAction(); // OrderAction | 
    try {
      apiInstance.resendOrderConfirmationEmail(orderId, orderAction);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#resendOrderConfirmationEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **orderAction** | [**OrderAction**](OrderAction.md)|  | [optional] |

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

<a name="resendPackageFulfillmentEmail"></a>
# **resendPackageFulfillmentEmail**
> Order resendPackageFulfillmentEmail(orderId, fulfillmentAction)

Resend Package Fulfillment Email

Resends the package fulfillment email.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    FulfillmentAction fulfillmentAction = new FulfillmentAction(); // FulfillmentAction | 
    try {
      Order result = apiInstance.resendPackageFulfillmentEmail(orderId, fulfillmentAction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#resendPackageFulfillmentEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **fulfillmentAction** | [**FulfillmentAction**](FulfillmentAction.md)|  | [optional] |

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

<a name="resendRefundEmail"></a>
# **resendRefundEmail**
> resendRefundEmail(orderId, refundId)

Resend Refund Email

Resend refund email.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String refundId = "refundId_example"; // String | 
    try {
      apiInstance.resendRefundEmail(orderId, refundId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#resendRefundEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **refundId** | **String**|  | |

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

<a name="setBillingInfo"></a>
# **setBillingInfo**
> BillingInfo setBillingInfo(orderId, updateMode, version, billingInfo)

Set Billing Info

Adds a payment source to the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose payment source you want to update.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    BillingInfo billingInfo = new BillingInfo(); // BillingInfo | All the properties that you want the payment source object to contain.
    try {
      BillingInfo result = apiInstance.setBillingInfo(orderId, updateMode, version, billingInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#setBillingInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose payment source you want to update. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft). | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |
| **billingInfo** | [**BillingInfo**](BillingInfo.md)| All the properties that you want the payment source object to contain. | [optional] |

### Return type

[**BillingInfo**](BillingInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="setFulFillmentInfo"></a>
# **setFulFillmentInfo**
> FulfillmentInfo setFulFillmentInfo(orderId, updateMode, version, fulfillmentInfo)

Set Fulfillment Info

Modifies an order&#39;s fulfillment information. For example, to update the fulfillment address, estimated delivery date, or the merchant&#39;s fulfillment cost.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose fulfillment information you want to change.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    FulfillmentInfo fulfillmentInfo = new FulfillmentInfo(); // FulfillmentInfo | All properties that you want the updated fulfillment information to have.
    try {
      FulfillmentInfo result = apiInstance.setFulFillmentInfo(orderId, updateMode, version, fulfillmentInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#setFulFillmentInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose fulfillment information you want to change. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft). | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |
| **fulfillmentInfo** | [**FulfillmentInfo**](FulfillmentInfo.md)| All properties that you want the updated fulfillment information to have. | [optional] |

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

<a name="smsOptOut"></a>
# **smsOptOut**
> smsOptOut(siteId)

Sms Opt Out

Opting out from the sms notifications.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String siteId = "siteId_example"; // String | 
    try {
      apiInstance.smsOptOut(siteId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#smsOptOut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siteId** | **String**|  | |

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

<a name="splitShipments"></a>
# **splitShipments**
> List&lt;CommerceRuntimeShipment&gt; splitShipments(orderId, shipmentNumber, splitShipmentsObject)

Split Shipments

Allows spliting an existing shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String shipmentNumber = "shipmentNumber_example"; // String | 
    SplitShipmentsObject splitShipmentsObject = new SplitShipmentsObject(); // SplitShipmentsObject | 
    try {
      List<CommerceRuntimeShipment> result = apiInstance.splitShipments(orderId, shipmentNumber, splitShipmentsObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#splitShipments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **shipmentNumber** | **String**|  | |
| **splitShipmentsObject** | [**SplitShipmentsObject**](SplitShipmentsObject.md)|  | [optional] |

### Return type

[**List&lt;CommerceRuntimeShipment&gt;**](CommerceRuntimeShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateDigitalPackage"></a>
# **updateDigitalPackage**
> DigitalPackage updateDigitalPackage(orderId, digitalPackageId, digitalPackage)

Update Digital Package

Updates a digital package on the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the package.
    String digitalPackageId = "digitalPackageId_example"; // String | Package to update on the order
    DigitalPackage digitalPackage = new DigitalPackage(); // DigitalPackage | Package content to update on the order
    try {
      DigitalPackage result = apiInstance.updateDigitalPackage(orderId, digitalPackageId, digitalPackage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateDigitalPackage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the package. | |
| **digitalPackageId** | **String**| Package to update on the order | |
| **digitalPackage** | [**DigitalPackage**](DigitalPackage.md)| Package content to update on the order | [optional] |

### Return type

[**DigitalPackage**](DigitalPackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateExtendedProperties"></a>
# **updateExtendedProperties**
> List&lt;ExtendedProperty&gt; updateExtendedProperties(orderId, updateMode, version, upsert, extendedProperty)

Updated extended properties

Update extended properties.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    Boolean upsert = false; // Boolean | Allow insert or update
    List<ExtendedProperty> extendedProperty = Arrays.asList(); // List<ExtendedProperty> | Extended properties
    try {
      List<ExtendedProperty> result = apiInstance.updateExtendedProperties(orderId, updateMode, version, upsert, extendedProperty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateExtendedProperties");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order item | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft) | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |
| **upsert** | **Boolean**| Allow insert or update | [optional] [default to false] |
| **extendedProperty** | [**List&lt;ExtendedProperty&gt;**](ExtendedProperty.md)| Extended properties | [optional] |

### Return type

[**List&lt;ExtendedProperty&gt;**](ExtendedProperty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateExtendedProperty"></a>
# **updateExtendedProperty**
> ExtendedProperty updateExtendedProperty(orderId, key, updateMode, version, upsert, extendedProperty)

Update Extended Property

Updated specific extended property

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item
    String key = "key_example"; // String | Key
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    Boolean upsert = false; // Boolean | Allow insert or update
    ExtendedProperty extendedProperty = new ExtendedProperty(); // ExtendedProperty | Extended property
    try {
      ExtendedProperty result = apiInstance.updateExtendedProperty(orderId, key, updateMode, version, upsert, extendedProperty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateExtendedProperty");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order item | |
| **key** | **String**| Key | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft) | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |
| **upsert** | **Boolean**| Allow insert or update | [optional] [default to false] |
| **extendedProperty** | [**ExtendedProperty**](ExtendedProperty.md)| Extended property | [optional] |

### Return type

[**ExtendedProperty**](ExtendedProperty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateItemDeliveryDate"></a>
# **updateItemDeliveryDate**
> Order updateItemDeliveryDate(orderId, orderItemId, updateMode, version, body)

Updates the Delivery Date of a particular Order Item

Updates the Delivery Date of a particular Order Item

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    OffsetDateTime body = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      Order result = apiInstance.updateItemDeliveryDate(orderId, orderItemId, updateMode, version, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateItemDeliveryDate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order item. | |
| **orderItemId** | **String**| Unique identifier of the order item. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft). | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |
| **body** | **OffsetDateTime**|  | [optional] |

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

<a name="updateItemDuty"></a>
# **updateItemDuty**
> Order updateItemDuty(orderId, orderItemId, dutyAmount, updateMode, version)

Update Item Duty

Updates the duty amount of an order item in the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    Double dutyAmount = 3.4D; // Double | Duty amount to update the item product to.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    try {
      Order result = apiInstance.updateItemDuty(orderId, orderItemId, dutyAmount, updateMode, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateItemDuty");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order item. | |
| **orderItemId** | **String**| Unique identifier of the order item. | |
| **dutyAmount** | **Double**| Duty amount to update the item product to. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft) | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |

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

<a name="updateItemFulfillment"></a>
# **updateItemFulfillment**
> Order updateItemFulfillment(orderId, orderItemId, updateMode, version, zipCode, commerceRuntimeOrderItem)

Update Item Fulfillment

Updates the fullfillment method and/or location of an individual order item in the order of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String zipCode = "zipCode_example"; // String | Zip Code used for inventory reservation if order having STH items
    CommerceRuntimeOrderItem commerceRuntimeOrderItem = new CommerceRuntimeOrderItem(); // CommerceRuntimeOrderItem | The order item containing fulfilment information to update.
    try {
      Order result = apiInstance.updateItemFulfillment(orderId, orderItemId, updateMode, version, zipCode, commerceRuntimeOrderItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateItemFulfillment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order item. | |
| **orderItemId** | **String**| Unique identifier of the order item. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft) | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |
| **zipCode** | **String**| Zip Code used for inventory reservation if order having STH items | [optional] |
| **commerceRuntimeOrderItem** | [**CommerceRuntimeOrderItem**](CommerceRuntimeOrderItem.md)| The order item containing fulfilment information to update. | [optional] |

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

<a name="updateItemProductPrice"></a>
# **updateItemProductPrice**
> Order updateItemProductPrice(orderId, orderItemId, price, updateMode, version)

Update Item Product Price

Updates the price of an individual order item in the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    Double price = 3.4D; // Double | Price to update the item product to.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    try {
      Order result = apiInstance.updateItemProductPrice(orderId, orderItemId, price, updateMode, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateItemProductPrice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order item. | |
| **orderItemId** | **String**| Unique identifier of the order item. | |
| **price** | **Double**| Price to update the item product to. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft) | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |

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

<a name="updateItemQuantity"></a>
# **updateItemQuantity**
> Order updateItemQuantity(orderId, orderItemId, quantity, updateMode, version)

Update Item Quantity

Updates the quantity of an individual order item in the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    Integer quantity = 56; // Integer | New quantity for the specified order item.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    try {
      Order result = apiInstance.updateItemQuantity(orderId, orderItemId, quantity, updateMode, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateItemQuantity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order item. | |
| **orderItemId** | **String**| Unique identifier of the order item. | |
| **quantity** | **Integer**| New quantity for the specified order item. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft) | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |

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

<a name="updateOrder"></a>
# **updateOrder**
> Order updateOrder(orderId, updateMode, version, order)

Update Order

Updates the billing and/or shipping information of an existing order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | The order ID to update.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    Order order = new Order(); // Order | All properties of the order to place.
    try {
      Order result = apiInstance.updateOrder(orderId, updateMode, version, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order ID to update. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft). | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |
| **order** | [**Order**](Order.md)| All properties of the order to place. | [optional] |

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

<a name="updateOrderAttributes"></a>
# **updateOrderAttributes**
> List&lt;CommerceRuntimeOrderAttribute&gt; updateOrderAttributes(orderId, removeMissing, commerceRuntimeOrderAttribute)

Update Order Attributes

Updates a specific order attribute set of an order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose attributeSet you want to update.
    Boolean removeMissing = false; // Boolean | Indicates that items missing from the collection should be removed.
    List<CommerceRuntimeOrderAttribute> commerceRuntimeOrderAttribute = Arrays.asList(); // List<CommerceRuntimeOrderAttribute> | Attributes to upsert.
    try {
      List<CommerceRuntimeOrderAttribute> result = apiInstance.updateOrderAttributes(orderId, removeMissing, commerceRuntimeOrderAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateOrderAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose attributeSet you want to update. | |
| **removeMissing** | **Boolean**| Indicates that items missing from the collection should be removed. | [optional] [default to false] |
| **commerceRuntimeOrderAttribute** | [**List&lt;CommerceRuntimeOrderAttribute&gt;**](CommerceRuntimeOrderAttribute.md)| Attributes to upsert. | [optional] |

### Return type

[**List&lt;CommerceRuntimeOrderAttribute&gt;**](CommerceRuntimeOrderAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateOrderDiscount"></a>
# **updateOrderDiscount**
> Order updateOrderDiscount(orderId, discountId, updateMode, version, commerceRuntimeAppliedDiscount)

Update Order Discount

Update existing discount on the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the coupon.
    Integer discountId = 56; // Integer | Identifies the discount to be updated.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    CommerceRuntimeAppliedDiscount commerceRuntimeAppliedDiscount = new CommerceRuntimeAppliedDiscount(); // CommerceRuntimeAppliedDiscount | Discount information to use as the update source.
    try {
      Order result = apiInstance.updateOrderDiscount(orderId, discountId, updateMode, version, commerceRuntimeAppliedDiscount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateOrderDiscount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the coupon. | |
| **discountId** | **Integer**| Identifies the discount to be updated. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft). | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |
| **commerceRuntimeAppliedDiscount** | [**CommerceRuntimeAppliedDiscount**](CommerceRuntimeAppliedDiscount.md)| Discount information to use as the update source. | [optional] |

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

<a name="updateOrderItemDiscount"></a>
# **updateOrderItemDiscount**
> Order updateOrderItemDiscount(orderId, orderItemId, discountId, updateMode, version, commerceRuntimeAppliedDiscount)

Update Order Item Discount

Update a discount on the order item to ignore or unignore it.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the coupon.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    Integer discountId = 56; // Integer | Identifies the discount to be updated.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    CommerceRuntimeAppliedDiscount commerceRuntimeAppliedDiscount = new CommerceRuntimeAppliedDiscount(); // CommerceRuntimeAppliedDiscount | Discount information to use as the update source.
    try {
      Order result = apiInstance.updateOrderItemDiscount(orderId, orderItemId, discountId, updateMode, version, commerceRuntimeAppliedDiscount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateOrderItemDiscount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the coupon. | |
| **orderItemId** | **String**| Unique identifier of the order item. | |
| **discountId** | **Integer**| Identifies the discount to be updated. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft). | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |
| **commerceRuntimeAppliedDiscount** | [**CommerceRuntimeAppliedDiscount**](CommerceRuntimeAppliedDiscount.md)| Discount information to use as the update source. | [optional] |

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

<a name="updateOrderNote"></a>
# **updateOrderNote**
> OrderNote updateOrderNote(orderId, noteId, orderNote)

Update Order Note

Updates a specific order note for an order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose note you want to update.
    String noteId = "noteId_example"; // String | Unique identifier of the note whose text you want to update.
    OrderNote orderNote = new OrderNote(); // OrderNote | Text of the note.
    try {
      OrderNote result = apiInstance.updateOrderNote(orderId, noteId, orderNote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateOrderNote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order whose note you want to update. | |
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

<a name="updateOrderRestrictions"></a>
# **updateOrderRestrictions**
> Order updateOrderRestrictions(orderId, restrictEdit, restrictCancellation)

Update Order Restrictions

Update Order Restrictions

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    Boolean restrictEdit = true; // Boolean | 
    Boolean restrictCancellation = true; // Boolean | 
    try {
      Order result = apiInstance.updateOrderRestrictions(orderId, restrictEdit, restrictCancellation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateOrderRestrictions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **restrictEdit** | **Boolean**|  | [optional] |
| **restrictCancellation** | **Boolean**|  | [optional] |

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

<a name="updatePackage"></a>
# **updatePackage**
> CommerceRuntimePackage updatePackage(orderId, packageId, commerceRuntimePackage)

Delete an order package



### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the package.
    String packageId = "packageId_example"; // String | Package to update on the order
    CommerceRuntimePackage commerceRuntimePackage = new CommerceRuntimePackage(); // CommerceRuntimePackage | Package content to update on the order
    try {
      CommerceRuntimePackage result = apiInstance.updatePackage(orderId, packageId, commerceRuntimePackage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updatePackage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the package. | |
| **packageId** | **String**| Package to update on the order | |
| **commerceRuntimePackage** | [**CommerceRuntimePackage**](CommerceRuntimePackage.md)| Package content to update on the order | [optional] |

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

<a name="updatePickup"></a>
# **updatePickup**
> Pickup updatePickup(orderId, pickupId, pickup)

Update Pickup

Updates pickup details on the order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the pickup.
    String pickupId = "pickupId_example"; // String | Pickup to update on the order
    Pickup pickup = new Pickup(); // Pickup | Pickup content to update on the order
    try {
      Pickup result = apiInstance.updatePickup(orderId, pickupId, pickup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updatePickup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the pickup. | |
| **pickupId** | **String**| Pickup to update on the order | |
| **pickup** | [**Pickup**](Pickup.md)| Pickup content to update on the order | [optional] |

### Return type

[**Pickup**](Pickup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateShipmentAdjustments"></a>
# **updateShipmentAdjustments**
> CommerceRuntimeShipment updateShipmentAdjustments(orderId, shipmentNumber, shipmentAdjustment)

Update Shipment Adjustments

Updates adjustments on shipments.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    Integer shipmentNumber = 56; // Integer | 
    ShipmentAdjustment shipmentAdjustment = new ShipmentAdjustment(); // ShipmentAdjustment | 
    try {
      CommerceRuntimeShipment result = apiInstance.updateShipmentAdjustments(orderId, shipmentNumber, shipmentAdjustment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateShipmentAdjustments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **shipmentNumber** | **Integer**|  | |
| **shipmentAdjustment** | [**ShipmentAdjustment**](ShipmentAdjustment.md)|  | [optional] |

### Return type

[**CommerceRuntimeShipment**](CommerceRuntimeShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateShipmentItem"></a>
# **updateShipmentItem**
> CommerceRuntimeShipment updateShipmentItem(orderId, shipmentNumber, itemId, shipmentItemAdjustment)

Update Shipment Item

Updates shipment item with new shipment adjustment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    Integer shipmentNumber = 56; // Integer | 
    Integer itemId = 56; // Integer | 
    ShipmentItemAdjustment shipmentItemAdjustment = new ShipmentItemAdjustment(); // ShipmentItemAdjustment | 
    try {
      CommerceRuntimeShipment result = apiInstance.updateShipmentItem(orderId, shipmentNumber, itemId, shipmentItemAdjustment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateShipmentItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **shipmentNumber** | **Integer**|  | |
| **itemId** | **Integer**|  | |
| **shipmentItemAdjustment** | [**ShipmentItemAdjustment**](ShipmentItemAdjustment.md)|  | [optional] |

### Return type

[**CommerceRuntimeShipment**](CommerceRuntimeShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSubscriptionInfo"></a>
# **updateSubscriptionInfo**
> Order updateSubscriptionInfo(orderId, orderItemId, subscriptionInfo)

Update Order Item Subscription Info, applies only to Draft Order

Update a subscription info on the order item.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the coupon.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    SubscriptionInfo subscriptionInfo = new SubscriptionInfo(); // SubscriptionInfo | Mozu.CommerceRuntime.Contracts.Subscriptions.SubscriptionInfo to use as the update source
    try {
      Order result = apiInstance.updateSubscriptionInfo(orderId, orderItemId, subscriptionInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateSubscriptionInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order with which to associate the coupon. | |
| **orderItemId** | **String**| Unique identifier of the order item. | |
| **subscriptionInfo** | [**SubscriptionInfo**](SubscriptionInfo.md)| Mozu.CommerceRuntime.Contracts.Subscriptions.SubscriptionInfo to use as the update source | [optional] |

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

<a name="upsertAlternateContact"></a>
# **upsertAlternateContact**
> Order upsertAlternateContact(orderId, alternateContact)

Endpoint to add/update alternate contact



### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    AlternateContact alternateContact = new AlternateContact(); // AlternateContact | 
    try {
      Order result = apiInstance.upsertAlternateContact(orderId, alternateContact);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#upsertAlternateContact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **alternateContact** | [**AlternateContact**](AlternateContact.md)|  | [optional] |

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

<a name="upsertInventoryTags"></a>
# **upsertInventoryTags**
> Order upsertInventoryTags(orderId, orderItemId, updateMode, version, inventoryTags)

Upsert Inventory Tags on OrderItem

You need to pass in all tags everytime

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderApi;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    List<InventoryTags> inventoryTags = Arrays.asList(); // List<InventoryTags> | Mozu.CommerceRuntime.Contracts.Commerce.InventoryTags to use as the update source
    try {
      Order result = apiInstance.upsertInventoryTags(orderId, orderItemId, updateMode, version, inventoryTags);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#upsertInventoryTags");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique identifier of the order. | |
| **orderItemId** | **String**| Unique identifier of the order item. | |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft) | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |
| **inventoryTags** | [**List&lt;InventoryTags&gt;**](InventoryTags.md)| Mozu.CommerceRuntime.Contracts.Commerce.InventoryTags to use as the update source | [optional] |

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

