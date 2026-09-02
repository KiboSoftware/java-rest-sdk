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
| [**createOrderLineAttributes**](OrderApi.md#createOrderLineAttributes) | **POST** /commerce/orders/{orderId}/items/{orderItemId}/attributes | Create line-level attributes on an order item; skips FQNs that already exist |
| [**createOrderNote**](OrderApi.md#createOrderNote) | **POST** /commerce/orders/{orderId}/notes | Create Order Note |
| [**createPackage**](OrderApi.md#createPackage) | **POST** /commerce/orders/{orderId}/packages | Apply Package to Order |
| [**createPackageShipments**](OrderApi.md#createPackageShipments) | **POST** /commerce/orders/{orderId}/shipments | Create A Shipment |
| [**createPaymentAction**](OrderApi.md#createPaymentAction) | **POST** /commerce/orders/{orderId}/payments/actions | Create Payment Action |
| [**createPickup**](OrderApi.md#createPickup) | **POST** /commerce/orders/{orderId}/pickups | Create Pickup |
| [**createRefund**](OrderApi.md#createRefund) | **POST** /commerce/orders/{orderId}/refunds | Create Refund |
| [**createShipmentAttributes**](OrderApi.md#createShipmentAttributes) | **POST** /commerce/orders/{orderId}/shipments/{shipmentNumber}/attributes | Creates attributes on a shipment |
| [**deleteDigitalPackage**](OrderApi.md#deleteDigitalPackage) | **DELETE** /commerce/orders/{orderId}/digitalpackages/{digitalPackageId} | Delete Digital Package |
| [**deleteExtendedProperties**](OrderApi.md#deleteExtendedProperties) | **DELETE** /commerce/orders/{orderId}/extendedproperties | Delete Extended Properties |
| [**deleteExtendedProperty**](OrderApi.md#deleteExtendedProperty) | **DELETE** /commerce/orders/{orderId}/extendedproperties/{key} | Delete Extended Property |
| [**deleteOrderData**](OrderApi.md#deleteOrderData) | **DELETE** /commerce/orders/{orderId}/data/{orderDataId} | Delete Order Data |
| [**deleteOrderDraft**](OrderApi.md#deleteOrderDraft) | **PUT** /commerce/orders/{orderId}/draft | Delete Order Draft |
| [**deleteOrderItem**](OrderApi.md#deleteOrderItem) | **DELETE** /commerce/orders/{orderId}/items/{orderItemId} | Delete Order Item |
| [**deleteOrderItemData**](OrderApi.md#deleteOrderItemData) | **DELETE** /commerce/orders/{orderId}/item/{orderItemId}/data/{orderItemDataId} | Delete Order Item Data |
| [**deleteOrderLineAttribute**](OrderApi.md#deleteOrderLineAttribute) | **DELETE** /commerce/orders/{orderId}/items/{orderItemId}/attributes/{attributeFqn} | Delete a single line-level attribute from an order item by FQN |
| [**deleteOrderNote**](OrderApi.md#deleteOrderNote) | **DELETE** /commerce/orders/{orderId}/notes/{noteId} | Delete Order Note |
| [**deletePackage**](OrderApi.md#deletePackage) | **DELETE** /commerce/orders/{orderId}/packages/{packageId} | Delete Order Package |
| [**deletePickup**](OrderApi.md#deletePickup) | **DELETE** /commerce/orders/{orderId}/pickups/{pickupId} | Delete Pickup |
| [**deleteShipment**](OrderApi.md#deleteShipment) | **DELETE** /commerce/orders/{orderId}/shipments/{shipmentId} | Delete An Existing Order Shipment |
| [**deleteShipmentAttributes**](OrderApi.md#deleteShipmentAttributes) | **DELETE** /commerce/orders/{orderId}/shipments/{shipmentNumber}/attributes | Deletes attributes from a shipment |
| [**evaluateOrderRollupStatus**](OrderApi.md#evaluateOrderRollupStatus) | **PUT** /commerce/orders/{orderId}/evaluaterollupstatus | Evaluate Order Rollup Status |
| [**getAvailableActions**](OrderApi.md#getAvailableActions) | **GET** /commerce/orders/{orderId}/actions | Get Available Actions |
| [**getAvailableDigitalPackageFulfillmentActions**](OrderApi.md#getAvailableDigitalPackageFulfillmentActions) | **GET** /commerce/orders/{orderId}/digitalpackages/{digitalPackageId}/actions | Get Available Digital Package Fulfillment Actions |
| [**getAvailablePackageFulfillmentActions**](OrderApi.md#getAvailablePackageFulfillmentActions) | **GET** /commerce/orders/{orderId}/packages/{packageId}/actions | Retrieves Available Fulfillment Actions |
| [**getAvailablePaymentActions**](OrderApi.md#getAvailablePaymentActions) | **GET** /commerce/orders/{orderId}/payments/{paymentId}/actions | Get Available Payment Actions |
| [**getAvailablePickupFulfillmentActions**](OrderApi.md#getAvailablePickupFulfillmentActions) | **GET** /commerce/orders/{orderId}/pickups/{pickupId}/actions | Get Available Pickup Fulfillment Actions |
| [**getAvailableShipmentMethods**](OrderApi.md#getAvailableShipmentMethods) | **GET** /commerce/orders/{orderId}/shipments/methods | Get Available Shipment Methods |
| [**getBillingInfo**](OrderApi.md#getBillingInfo) | **GET** /commerce/orders/{orderId}/billinginfo | Get Billing Info |
| [**getDigitalPackage**](OrderApi.md#getDigitalPackage) | **GET** /commerce/orders/{orderId}/digitalpackages/{digitalPackageId} | Get Digital Package |
| [**getExtendedProperties**](OrderApi.md#getExtendedProperties) | **GET** /commerce/orders/{orderId}/extendedproperties | Get Extended Properties |
| [**getFulfillmentInfo**](OrderApi.md#getFulfillmentInfo) | **GET** /commerce/orders/{orderId}/fulfillmentinfo | Get Fulfillment Info |
| [**getOrder**](OrderApi.md#getOrder) | **GET** /commerce/orders/{orderId} | Get Order |
| [**getOrderAttributes**](OrderApi.md#getOrderAttributes) | **GET** /commerce/orders/{orderId}/attributes | Get Order Attributes |
| [**getOrderData**](OrderApi.md#getOrderData) | **GET** /commerce/orders/{orderId}/data | Get Order Data |
| [**getOrderItem**](OrderApi.md#getOrderItem) | **GET** /commerce/orders/{orderId}/items/{orderItemId} | Get Order Item |
| [**getOrderItemData**](OrderApi.md#getOrderItemData) | **GET** /commerce/orders/{orderId}/item/{orderItemId}/data | Get Order Item Data |
| [**getOrderItemViaLineId**](OrderApi.md#getOrderItemViaLineId) | **GET** /commerce/orders/{orderId}/items/{lineId} | Get Order Item Via LineId |
| [**getOrderItems**](OrderApi.md#getOrderItems) | **GET** /commerce/orders/{orderId}/items | Get Order Items |
| [**getOrderLineAttributes**](OrderApi.md#getOrderLineAttributes) | **GET** /commerce/orders/{orderId}/items/{orderItemId}/attributes | Get all line-level attributes for an order item |
| [**getOrderNote**](OrderApi.md#getOrderNote) | **GET** /commerce/orders/{orderId}/notes/{noteId} | Get Order Note |
| [**getOrderNotes**](OrderApi.md#getOrderNotes) | **GET** /commerce/orders/{orderId}/notes | Get Order Notes |
| [**getOrderReturnableItems**](OrderApi.md#getOrderReturnableItems) | **GET** /commerce/orders/{orderId}/returnableitems | Get Order Returnable Items |
| [**getOrders**](OrderApi.md#getOrders) | **GET** /commerce/orders | Get Orders |
| [**getPackage**](OrderApi.md#getPackage) | **GET** /commerce/orders/{orderId}/packages/{packageId} | Get Order Package |
| [**getPackageLabel**](OrderApi.md#getPackageLabel) | **GET** /commerce/orders/{orderId}/packages/{packageId}/label | Get Order Package Label |
| [**getPayment**](OrderApi.md#getPayment) | **GET** /commerce/orders/{orderId}/payments/{paymentId} | Get Payment |
| [**getPayments**](OrderApi.md#getPayments) | **GET** /commerce/orders/{orderId}/payments | Get Payments |
| [**getPickup**](OrderApi.md#getPickup) | **GET** /commerce/orders/{orderId}/pickups/{pickupId} | Get Pickup |
| [**getQueuedHistoricalOrder**](OrderApi.md#getQueuedHistoricalOrder) | **GET** /commerce/orders/queuedorders/historical/{orderId} | Get Queued Historical Order |
| [**getQueuedHistoricalOrders**](OrderApi.md#getQueuedHistoricalOrders) | **GET** /commerce/orders/queuedorders/historical | Get Queued Historical Orders |
| [**getQueuedOrder**](OrderApi.md#getQueuedOrder) | **GET** /commerce/orders/queuedorders/{orderId} | Get Queued Order |
| [**getQueuedOrders**](OrderApi.md#getQueuedOrders) | **GET** /commerce/orders/queuedorders | Get Queued Orders |
| [**getReasons**](OrderApi.md#getReasons) | **GET** /commerce/orders/cancel/reasons | Get Order Cancel Reasons |
| [**getRefundReasons**](OrderApi.md#getRefundReasons) | **GET** /commerce/orders/refunds/refundreasons | Get Refund Reasons |
| [**getShipment**](OrderApi.md#getShipment) | **GET** /commerce/orders/{orderId}/shipments/{shipmentId} | Get Shipment |
| [**getShipmentAttributes**](OrderApi.md#getShipmentAttributes) | **GET** /commerce/orders/{orderId}/shipments/{shipmentNumber}/attributes | Gets all attributes for a shipment |
| [**getTaxableOrders**](OrderApi.md#getTaxableOrders) | **GET** /commerce/orders/{orderId}/taxableorders | Get Taxable Orders |
| [**getValidationResults**](OrderApi.md#getValidationResults) | **GET** /commerce/orders/{orderId}/validationresults | Get Validation Results |
| [**performFulfillmentAction**](OrderApi.md#performFulfillmentAction) | **POST** /commerce/orders/{orderId}/fulfillment/actions | Perform Fulfillment Action |
| [**performOrderAction**](OrderApi.md#performOrderAction) | **POST** /commerce/orders/{orderId}/actions | Perform Order Action |
| [**performPaymentAction**](OrderApi.md#performPaymentAction) | **POST** /commerce/orders/{orderId}/payments/{paymentId}/actions | Perform Payment Action |
| [**priceOrder**](OrderApi.md#priceOrder) | **POST** /commerce/orders/price | Price Order |
| [**processDigitalWallet**](OrderApi.md#processDigitalWallet) | **PUT** /commerce/orders/{orderId}/digitalWallet/{digitalWalletType} | Process Digital Wallet |
| [**processReturnRules**](OrderApi.md#processReturnRules) | **POST** /commerce/orders/{orderId}/processreturnrules | Process Return Rules |
| [**removeAdjustment**](OrderApi.md#removeAdjustment) | **DELETE** /commerce/orders/{orderId}/adjustment | Remove Adjustment |
| [**removeAlternateContact**](OrderApi.md#removeAlternateContact) | **PUT** /commerce/orders/{orderId}/removealternatecontact | Remove Alternate Contact |
| [**removeCoupon**](OrderApi.md#removeCoupon) | **DELETE** /commerce/orders/{orderId}/coupons/{couponCode} | Remove Coupon |
| [**removeCoupons**](OrderApi.md#removeCoupons) | **DELETE** /commerce/orders/{orderId}/coupons | Remove Coupons |
| [**removeHandlingAdjustment**](OrderApi.md#removeHandlingAdjustment) | **DELETE** /commerce/orders/{orderId}/adjustment/handling | Remove Handling Adjustment |
| [**removeShippingAdjustment**](OrderApi.md#removeShippingAdjustment) | **DELETE** /commerce/orders/{orderId}/adjustment/shipping | Remove Shipping Adjustment |
| [**repriceCanceledShipment**](OrderApi.md#repriceCanceledShipment) | **POST** /commerce/orders/{orderId}/shipments/repricecanceledshipment | Reprice Canceled Shipment |
| [**repriceShipment**](OrderApi.md#repriceShipment) | **POST** /commerce/orders/{orderId}/shipments/{shipmentNumber}/reprice | Reprice Shipment |
| [**repriceSubstitutes**](OrderApi.md#repriceSubstitutes) | **POST** /commerce/orders/{orderId}/shipments/{shipmentNumber}/repricesubstitutes | Reprice Substitutes |
| [**resendGatewayGiftCardEmail**](OrderApi.md#resendGatewayGiftCardEmail) | **PUT** /commerce/orders/{orderId}/giftcard/{giftcardId}/resend | Resend Gateway Gift Card Email |
| [**resendOrderConfirmationEmail**](OrderApi.md#resendOrderConfirmationEmail) | **PUT** /commerce/orders/{orderId}/email/resend | Resend Order Confirmation Email |
| [**resendPackageFulfillmentEmail**](OrderApi.md#resendPackageFulfillmentEmail) | **POST** /commerce/orders/{orderId}/fulfillment/email/resend | Resend Package Fulfillment Email |
| [**resendRefundEmail**](OrderApi.md#resendRefundEmail) | **PUT** /commerce/orders/{orderId}/refunds/{refundId} | Resend Refund Email |
| [**setBillingInfo**](OrderApi.md#setBillingInfo) | **PUT** /commerce/orders/{orderId}/billinginfo | Set Billing Info |
| [**setFulFillmentInfo**](OrderApi.md#setFulFillmentInfo) | **PUT** /commerce/orders/{orderId}/fulfillmentinfo | Set Fulfillment Info |
| [**smsOptOut**](OrderApi.md#smsOptOut) | **PUT** /commerce/orders/sms/optout/{siteId} | Sms Opt Out |
| [**splitOrderIntoShipment**](OrderApi.md#splitOrderIntoShipment) | **GET** /commerce/orders/{orderId}/converttoship | Split Order Into Shipment |
| [**splitShipments**](OrderApi.md#splitShipments) | **POST** /commerce/orders/{orderId}/shipments/{shipmentNumber}/split | Split Shipments |
| [**updateDigitalPackage**](OrderApi.md#updateDigitalPackage) | **PUT** /commerce/orders/{orderId}/digitalpackages/{digitalPackageId} | Update Digital Package |
| [**updateExtendedProperties**](OrderApi.md#updateExtendedProperties) | **PUT** /commerce/orders/{orderId}/extendedproperties | Updated Extended Properties |
| [**updateExtendedProperty**](OrderApi.md#updateExtendedProperty) | **PUT** /commerce/orders/{orderId}/extendedproperties/{key} | Update Extended Property |
| [**updateGiftInfo**](OrderApi.md#updateGiftInfo) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/updateGiftInfo | Update Order Item Gift Information |
| [**updateItemDeliveryDate**](OrderApi.md#updateItemDeliveryDate) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/deliverydate | Update the Delivery Date of Order Item |
| [**updateItemDuty**](OrderApi.md#updateItemDuty) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/dutyAmount/{dutyAmount} | Update Item Duty |
| [**updateItemFulfillment**](OrderApi.md#updateItemFulfillment) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/fulfillment | Update Item Fulfillment |
| [**updateItemProductPrice**](OrderApi.md#updateItemProductPrice) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/price/{price} | Update Item Product Price |
| [**updateItemQuantity**](OrderApi.md#updateItemQuantity) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/quantity/{quantity} | Update Item Quantity |
| [**updateOrder**](OrderApi.md#updateOrder) | **PUT** /commerce/orders/{orderId} | Update Order |
| [**updateOrderAttributes**](OrderApi.md#updateOrderAttributes) | **PUT** /commerce/orders/{orderId}/attributes | Update Order Attributes |
| [**updateOrderData**](OrderApi.md#updateOrderData) | **PUT** /commerce/orders/{orderId}/data/{orderDataId} | Update Order Data |
| [**updateOrderDiscount**](OrderApi.md#updateOrderDiscount) | **PUT** /commerce/orders/{orderId}/discounts/{discountId} | Update Order Discount |
| [**updateOrderItemData**](OrderApi.md#updateOrderItemData) | **PUT** /commerce/orders/{orderId}/item/{orderItemId}/data/{orderItemDataId} | Update Order Item Data |
| [**updateOrderItemDiscount**](OrderApi.md#updateOrderItemDiscount) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/discounts/{discountId} | Update Order Item Discount |
| [**updateOrderLineAttributes**](OrderApi.md#updateOrderLineAttributes) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/attributes | Upsert line-level attributes on an order item |
| [**updateOrderNote**](OrderApi.md#updateOrderNote) | **PUT** /commerce/orders/{orderId}/notes/{noteId} | Update Order Note |
| [**updateOrderRestrictions**](OrderApi.md#updateOrderRestrictions) | **PUT** /commerce/orders/{orderId}/updateorderrestrictions | Update Order Restrictions |
| [**updatePackage**](OrderApi.md#updatePackage) | **PUT** /commerce/orders/{orderId}/packages/{packageId} | Update Order Package |
| [**updatePickup**](OrderApi.md#updatePickup) | **PUT** /commerce/orders/{orderId}/pickups/{pickupId} | Update Pickup |
| [**updateShipmentAdjustments**](OrderApi.md#updateShipmentAdjustments) | **POST** /commerce/orders/{orderId}/shipments/{shipmentNumber}/adjustments | Update Shipment Adjustments |
| [**updateShipmentAndItemsAdjustment**](OrderApi.md#updateShipmentAndItemsAdjustment) | **POST** /commerce/orders/{orderId}/shipments/{shipmentNumber}/adjustments/bulk | Update Shipment and Multiple Shipment Items Adjustment |
| [**updateShipmentAttributes**](OrderApi.md#updateShipmentAttributes) | **PUT** /commerce/orders/{orderId}/shipments/{shipmentNumber}/attributes | Updates attributes on a shipment |
| [**updateShipmentItem**](OrderApi.md#updateShipmentItem) | **POST** /commerce/orders/{orderId}/shipments/{shipmentNumber}/item/{itemId}/adjustments | Update Shipment Item |
| [**updateShippingAndSuggestions**](OrderApi.md#updateShippingAndSuggestions) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/UpdateShippingAndSuggestions | Update Shipping and Suggestions |
| [**updateSubscriptionInfo**](OrderApi.md#updateSubscriptionInfo) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/subscriptionInfo | Update Order Item Subscription Info |
| [**upsertAlternateContact**](OrderApi.md#upsertAlternateContact) | **PUT** /commerce/orders/{orderId}/upsertalternatecontact | Add/Update Alternate Contact |
| [**upsertGiftMessage**](OrderApi.md#upsertGiftMessage) | **POST** /commerce/orders/{orderId}/shipments/upsertgiftmessage | Upsert Gift Message |
| [**upsertInventoryTags**](OrderApi.md#upsertInventoryTags) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/upsertInventoryTags | Upsert Inventory Tags on OrderItem |
| [**upsertSubstituteInfo**](OrderApi.md#upsertSubstituteInfo) | **PUT** /commerce/orders/{orderId}/items/{orderItemId}/upsertSubstituteInfo | Updates SubstituteInfo on OrderItem |


<a name="addExtendedProperties"></a>
# **addExtendedProperties**
> List&lt;ExtendedProperty&gt; addExtendedProperties(orderId, updateMode, version, responseFields, extendedProperty)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ExtendedProperty> extendedProperty = Arrays.asList(); // List<ExtendedProperty> | Extended properties.
    try {
      List<ExtendedProperty> result = apiInstance.addExtendedProperties(orderId, updateMode, version, responseFields, extendedProperty);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **extendedProperty** | [**List&lt;ExtendedProperty&gt;**](ExtendedProperty.md)| Extended properties. | [optional] |

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

<a name="addValidationResult"></a>
# **addValidationResult**
> OrderValidationResult addValidationResult(orderId, responseFields, orderValidationResult)

Add Validation Result

Adds a validation result to an order from an external system. This endpoint is used by asynchronous validators that review orders after submission and push results back into Kibo — for example, a fraud service that processes orders in a background queue. The &lt;code&gt;validationId&lt;/code&gt; and &lt;code&gt;createdDate&lt;/code&gt; fields are required. The &lt;code&gt;status&lt;/code&gt; value (&lt;code&gt;Pass&lt;/code&gt;, &lt;code&gt;Review&lt;/code&gt;, &lt;code&gt;Fail&lt;/code&gt;, or &lt;code&gt;Error&lt;/code&gt;) determines whether the order proceeds to fulfillment or is held in &lt;code&gt;PendingReview&lt;/code&gt;. See the &lt;a href&#x3D;\&quot;/pages/order-validators-and-fraud-check-applications\&quot;&gt;Order Validators and Fraud Check Applications&lt;/a&gt; guide for the full schema, status effects, and implementation guidance.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order to which you want to add a note.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    OrderValidationResult orderValidationResult = new OrderValidationResult(); // OrderValidationResult | The order validation result.
    try {
      OrderValidationResult result = apiInstance.addValidationResult(orderId, responseFields, orderValidationResult);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **orderValidationResult** | [**OrderValidationResult**](OrderValidationResult.md)| The order validation result. | [optional] |

### Return type

[**OrderValidationResult**](OrderValidationResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="applyAdjustment"></a>
# **applyAdjustment**
> Order applyAdjustment(orderId, updateMode, version, responseFields, adjustment)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the coupon.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Adjustment adjustment = new Adjustment(); // Adjustment | Adjustment to apply to the order
    try {
      Order result = apiInstance.applyAdjustment(orderId, updateMode, version, responseFields, adjustment);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **adjustment** | [**Adjustment**](Adjustment.md)| Adjustment to apply to the order | [optional] |

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

<a name="applyCoupon"></a>
# **applyCoupon**
> Order applyCoupon(orderId, couponCode, updateMode, version, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the coupon.
    String couponCode = "couponCode_example"; // String | Coupon code that the customer supplies to get the discounted price.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Order result = apiInstance.applyCoupon(orderId, couponCode, updateMode, version, responseFields);
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

<a name="applyHandlingAdjustment"></a>
# **applyHandlingAdjustment**
> Order applyHandlingAdjustment(orderId, updateMode, version, responseFields, adjustment)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Adjustment adjustment = new Adjustment(); // Adjustment | 
    try {
      Order result = apiInstance.applyHandlingAdjustment(orderId, updateMode, version, responseFields, adjustment);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **adjustment** | [**Adjustment**](Adjustment.md)|  | [optional] |

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

<a name="applyShippingAdjustment"></a>
# **applyShippingAdjustment**
> Order applyShippingAdjustment(orderId, updateMode, version, responseFields, adjustment)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the coupon.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Adjustment adjustment = new Adjustment(); // Adjustment | Adjustment to apply to the order
    try {
      Order result = apiInstance.applyShippingAdjustment(orderId, updateMode, version, responseFields, adjustment);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **adjustment** | [**Adjustment**](Adjustment.md)| Adjustment to apply to the order | [optional] |

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

<a name="autoCapturePayments"></a>
# **autoCapturePayments**
> Order autoCapturePayments(orderId, forceCapture, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order you want to auto capture.
    Boolean forceCapture = false; // Boolean | Also capture unfulfilled shipments (excluding backorder). Used when credit card auths are about to expire.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Order result = apiInstance.autoCapturePayments(orderId, forceCapture, responseFields);
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

<a name="cancelOrder"></a>
# **cancelOrder**
> Order cancelOrder(orderId, responseFields, commerceRuntimeCanceledReason)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CommerceRuntimeCanceledReason commerceRuntimeCanceledReason = new CommerceRuntimeCanceledReason(); // CommerceRuntimeCanceledReason | 
    try {
      Order result = apiInstance.cancelOrder(orderId, responseFields, commerceRuntimeCanceledReason);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **commerceRuntimeCanceledReason** | [**CommerceRuntimeCanceledReason**](CommerceRuntimeCanceledReason.md)|  | [optional] |

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

<a name="changeOrderPriceList"></a>
# **changeOrderPriceList**
> Order changeOrderPriceList(orderId, updateMode, version, responseFields, body)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order to change
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    String body = "body_example"; // String | The code for the pricelist to apply
    try {
      Order result = apiInstance.changeOrderPriceList(orderId, updateMode, version, responseFields, body);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **body** | **String**| The code for the pricelist to apply | [optional] |

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

<a name="changeOrderUserId"></a>
# **changeOrderUserId**
> Order changeOrderUserId(orderId, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order to change.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Order result = apiInstance.changeOrderUserId(orderId, responseFields);
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

<a name="createDigitalPackage"></a>
# **createDigitalPackage**
> DigitalPackage createDigitalPackage(orderId, responseFields, digitalPackage)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the digital package.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    DigitalPackage digitalPackage = new DigitalPackage(); // DigitalPackage | Digital Package to create and add to the order
    try {
      DigitalPackage result = apiInstance.createDigitalPackage(orderId, responseFields, digitalPackage);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **digitalPackage** | [**DigitalPackage**](DigitalPackage.md)| Digital Package to create and add to the order | [optional] |

### Return type

[**DigitalPackage**](DigitalPackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createOrder"></a>
# **createOrder**
> Order createOrder(cartId, quoteId, responseFields, order)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart. This is the original cart ID expressed as a GUID.
    String quoteId = "quoteId_example"; // String | Unique identifier of the quote.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Order order = new Order(); // Order | All properties of the order to place.
    try {
      Order result = apiInstance.createOrder(cartId, quoteId, responseFields, order);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **order** | [**Order**](Order.md)| All properties of the order to place. | [optional] |

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

<a name="createOrderAttributes"></a>
# **createOrderAttributes**
> List&lt;CommerceRuntimeOrderAttribute&gt; createOrderAttributes(orderId, responseFields, commerceRuntimeOrderAttribute)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order to which you want to add a attributeSet.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<CommerceRuntimeOrderAttribute> commerceRuntimeOrderAttribute = Arrays.asList(); // List<CommerceRuntimeOrderAttribute> | Attributes to upsert.
    try {
      List<CommerceRuntimeOrderAttribute> result = apiInstance.createOrderAttributes(orderId, responseFields, commerceRuntimeOrderAttribute);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **commerceRuntimeOrderAttribute** | [**List&lt;CommerceRuntimeOrderAttribute&gt;**](CommerceRuntimeOrderAttribute.md)| Attributes to upsert. | [optional] |

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

<a name="createOrderItem"></a>
# **createOrderItem**
> Order createOrderItem(orderId, updateMode, version, skipInventoryCheck, zipCode, responseFields, orderItem)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | ID of the order to add an item to.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    Boolean skipInventoryCheck = true; // Boolean | Determines wheter or not to check inventory on an item when adding an item to the order or when placing an order
    String zipCode = "zipCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    OrderItem orderItem = new OrderItem(); // OrderItem | All properties of the new cart item. Required property: Product.ProductCode.
    try {
      Order result = apiInstance.createOrderItem(orderId, updateMode, version, skipInventoryCheck, zipCode, responseFields, orderItem);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **orderItem** | [**OrderItem**](OrderItem.md)| All properties of the new cart item. Required property: Product.ProductCode. | [optional] |

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

<a name="createOrderLineAttributes"></a>
# **createOrderLineAttributes**
> List&lt;OrderLineAttribute&gt; createOrderLineAttributes(orderId, orderItemId, responseFields, orderLineAttribute)

Create line-level attributes on an order item; skips FQNs that already exist

Create line-level attributes on an order item; skips FQNs that already exist.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String orderItemId = "orderItemId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<OrderLineAttribute> orderLineAttribute = Arrays.asList(); // List<OrderLineAttribute> | 
    try {
      List<OrderLineAttribute> result = apiInstance.createOrderLineAttributes(orderId, orderItemId, responseFields, orderLineAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createOrderLineAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **orderLineAttribute** | [**List&lt;OrderLineAttribute&gt;**](OrderLineAttribute.md)|  | [optional] |

### Return type

[**List&lt;OrderLineAttribute&gt;**](OrderLineAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createOrderNote"></a>
# **createOrderNote**
> OrderNote createOrderNote(orderId, responseFields, orderNote)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order to which you want to add a note.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    OrderNote orderNote = new OrderNote(); // OrderNote | Text of the note. Maximum 256 characters.
    try {
      OrderNote result = apiInstance.createOrderNote(orderId, responseFields, orderNote);
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

<a name="createPackage"></a>
# **createPackage**
> CommerceRuntimePackage createPackage(orderId, responseFields, commerceRuntimePackage)

Apply Package to Order

Applies a package to an existing order.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the package.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CommerceRuntimePackage commerceRuntimePackage = new CommerceRuntimePackage(); // CommerceRuntimePackage | Package to create and add to the order
    try {
      CommerceRuntimePackage result = apiInstance.createPackage(orderId, responseFields, commerceRuntimePackage);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **commerceRuntimePackage** | [**CommerceRuntimePackage**](CommerceRuntimePackage.md)| Package to create and add to the order | [optional] |

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
> List&lt;CommerceRuntimePackage&gt; createPackageShipments(orderId, responseFields, requestBody)

Create A Shipment

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order which is ready to be shipped.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<String> requestBody = Arrays.asList(); // List<String> | Package ids to use in creating shipments.
    try {
      List<CommerceRuntimePackage> result = apiInstance.createPackageShipments(orderId, responseFields, requestBody);
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

<a name="createPaymentAction"></a>
# **createPaymentAction**
> Order createPaymentAction(orderId, responseFields, paymentAction)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose payment action you want to change.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PaymentAction paymentAction = new PaymentAction(); // PaymentAction | Action to be performed, along with any metadata.
    try {
      Order result = apiInstance.createPaymentAction(orderId, responseFields, paymentAction);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **paymentAction** | [**PaymentAction**](PaymentAction.md)| Action to be performed, along with any metadata. | [optional] |

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

<a name="createPickup"></a>
# **createPickup**
> Pickup createPickup(orderId, responseFields, pickup)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the pickup.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Pickup pickup = new Pickup(); // Pickup | Pickup to create and add to the order
    try {
      Pickup result = apiInstance.createPickup(orderId, responseFields, pickup);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **pickup** | [**Pickup**](Pickup.md)| Pickup to create and add to the order | [optional] |

### Return type

[**Pickup**](Pickup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createRefund"></a>
# **createRefund**
> Refund createRefund(orderId, responseFields, refund)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the package.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Refund refund = new Refund(); // Refund | Refund to create on the order
    try {
      Refund result = apiInstance.createRefund(orderId, responseFields, refund);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **refund** | [**Refund**](Refund.md)| Refund to create on the order | [optional] |

### Return type

[**Refund**](Refund.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createShipmentAttributes"></a>
# **createShipmentAttributes**
> List&lt;ShipmentAttribute&gt; createShipmentAttributes(orderId, shipmentNumber, responseFields, shipmentAttribute)

Creates attributes on a shipment

Creates attributes on a shipment.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    Integer shipmentNumber = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ShipmentAttribute> shipmentAttribute = Arrays.asList(); // List<ShipmentAttribute> | 
    try {
      List<ShipmentAttribute> result = apiInstance.createShipmentAttributes(orderId, shipmentNumber, responseFields, shipmentAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createShipmentAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **shipmentAttribute** | [**List&lt;ShipmentAttribute&gt;**](ShipmentAttribute.md)|  | [optional] |

### Return type

[**List&lt;ShipmentAttribute&gt;**](ShipmentAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteOrderData"></a>
# **deleteOrderData**
> Object deleteOrderData(orderId, orderDataId)

Delete Order Data

Delete Value of the given Key in the OrderData bag.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique Identifier of the Order you want to Delete the Databag for
    String orderDataId = "orderDataId_example"; // String | URLEncoded Key for the Value you want to Delete from the Order DataBag
    try {
      Object result = apiInstance.deleteOrderData(orderId, orderDataId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#deleteOrderData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique Identifier of the Order you want to Delete the Databag for | |
| **orderDataId** | **String**| URLEncoded Key for the Value you want to Delete from the Order DataBag | |

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

<a name="deleteOrderDraft"></a>
# **deleteOrderDraft**
> deleteOrderDraft(orderId, version, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | The order ID to update.
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.deleteOrderDraft(orderId, version, responseFields);
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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteOrderItemData"></a>
# **deleteOrderItemData**
> Object deleteOrderItemData(orderId, orderItemId, orderItemDataId)

Delete Order Item Data

Deletes the Value of the given Key in the OrderItem Data bag.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique Identifier of the Order you want to get the Items for
    String orderItemId = "orderItemId_example"; // String | Unique Identifier of the OrderItem you want to delete the Databag for
    String orderItemDataId = "orderItemDataId_example"; // String | URLEncoded Key for the Value you want to Delete from the OrderItem DataBag
    try {
      Object result = apiInstance.deleteOrderItemData(orderId, orderItemId, orderItemDataId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#deleteOrderItemData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique Identifier of the Order you want to get the Items for | |
| **orderItemId** | **String**| Unique Identifier of the OrderItem you want to delete the Databag for | |
| **orderItemDataId** | **String**| URLEncoded Key for the Value you want to Delete from the OrderItem DataBag | |

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

<a name="deleteOrderLineAttribute"></a>
# **deleteOrderLineAttribute**
> deleteOrderLineAttribute(orderId, orderItemId, attributeFqn)

Delete a single line-level attribute from an order item by FQN

Delete a single line-level attribute from an order item by FQN.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String orderItemId = "orderItemId_example"; // String | 
    String attributeFqn = "attributeFqn_example"; // String | 
    try {
      apiInstance.deleteOrderLineAttribute(orderId, orderItemId, attributeFqn);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#deleteOrderLineAttribute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deletePackage"></a>
# **deletePackage**
> deletePackage(orderId, packageId)

Delete Order Package

Delete an order package.

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

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
> deleteShipment(orderId, shipmentId)

Delete An Existing Order Shipment

Deletes an existing order shipment.

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteShipmentAttributes"></a>
# **deleteShipmentAttributes**
> deleteShipmentAttributes(orderId, shipmentNumber, requestBody)

Deletes attributes from a shipment

Deletes attributes from a shipment.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    Integer shipmentNumber = 56; // Integer | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      apiInstance.deleteShipmentAttributes(orderId, shipmentNumber, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#deleteShipmentAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional] |

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

<a name="evaluateOrderRollupStatus"></a>
# **evaluateOrderRollupStatus**
> Order evaluateOrderRollupStatus(orderId, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Order result = apiInstance.evaluateOrderRollupStatus(orderId, responseFields);
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

<a name="getAvailableActions"></a>
# **getAvailableActions**
> List&lt;String&gt; getAvailableActions(orderId, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose available order actions you want to get.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<String> result = apiInstance.getAvailableActions(orderId, responseFields);
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

<a name="getAvailableDigitalPackageFulfillmentActions"></a>
# **getAvailableDigitalPackageFulfillmentActions**
> List&lt;String&gt; getAvailableDigitalPackageFulfillmentActions(orderId, digitalPackageId, responseFields)

Get Available Digital Package Fulfillment Actions

Get available digital package fulfillment actions.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order on which to get a list of available actions.
    String digitalPackageId = "digitalPackageId_example"; // String | Package ID to get fulfillment actions for.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<String> result = apiInstance.getAvailableDigitalPackageFulfillmentActions(orderId, digitalPackageId, responseFields);
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

<a name="getAvailablePackageFulfillmentActions"></a>
# **getAvailablePackageFulfillmentActions**
> List&lt;String&gt; getAvailablePackageFulfillmentActions(orderId, packageId, responseFields)

Retrieves Available Fulfillment Actions

Retrieves the available fulfillment actions.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order on which to get a list of available actions.
    String packageId = "packageId_example"; // String | Package ID to get fulfillment actions for.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<String> result = apiInstance.getAvailablePackageFulfillmentActions(orderId, packageId, responseFields);
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

<a name="getAvailablePaymentActions"></a>
# **getAvailablePaymentActions**
> List&lt;String&gt; getAvailablePaymentActions(orderId, paymentId, responseFields)

Get Available Payment Actions

Retrieves available payment actions which depends on the status of the order&#39;s payment transaction.  Possible actions can be \&quot;Create,\&quot; \&quot;Capture,\&quot; \&quot;Void,\&quot; \&quot;AuthCapture,\&quot; or \&quot;ReceiveCheck.\&quot;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose available payment actions you want to get.
    String paymentId = "paymentId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<String> result = apiInstance.getAvailablePaymentActions(orderId, paymentId, responseFields);
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

<a name="getAvailablePickupFulfillmentActions"></a>
# **getAvailablePickupFulfillmentActions**
> List&lt;String&gt; getAvailablePickupFulfillmentActions(orderId, pickupId, responseFields)

Get Available Pickup Fulfillment Actions

Get the available pickup fulfillment actions.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order on which to get a list of available actions.
    String pickupId = "pickupId_example"; // String | Pickup ID to get fulfillment actions for.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<String> result = apiInstance.getAvailablePickupFulfillmentActions(orderId, pickupId, responseFields);
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

<a name="getAvailableShipmentMethods"></a>
# **getAvailableShipmentMethods**
> List&lt;CommerceRuntimeShippingRate&gt; getAvailableShipmentMethods(orderId, draft, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose shipping methods you want to get.
    Boolean draft = true; // Boolean | Gets a draft copy of the order if one is available.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<CommerceRuntimeShippingRate> result = apiInstance.getAvailableShipmentMethods(orderId, draft, responseFields);
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

<a name="getBillingInfo"></a>
# **getBillingInfo**
> BillingInfo getBillingInfo(orderId, draft, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose customer's payment source you want to get.
    Boolean draft = true; // Boolean | Determines whether the draft version should be retrieved if one exists.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BillingInfo result = apiInstance.getBillingInfo(orderId, draft, responseFields);
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
| **orderId** | **String**| Unique identifier of the order whose customer&#39;s payment source you want to get. | |
| **draft** | **Boolean**| Determines whether the draft version should be retrieved if one exists. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**BillingInfo**](BillingInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDigitalPackage"></a>
# **getDigitalPackage**
> DigitalPackage getDigitalPackage(orderId, digitalPackageId, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the package.
    String digitalPackageId = "digitalPackageId_example"; // String | Digital Package Id
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      DigitalPackage result = apiInstance.getDigitalPackage(orderId, digitalPackageId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**DigitalPackage**](DigitalPackage.md)

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
> List&lt;ExtendedProperty&gt; getExtendedProperties(orderId, draft, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    Boolean draft = true; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ExtendedProperty> result = apiInstance.getExtendedProperties(orderId, draft, responseFields);
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

<a name="getFulfillmentInfo"></a>
# **getFulfillmentInfo**
> FulfillmentInfo getFulfillmentInfo(orderId, draft, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order.
    Boolean draft = true; // Boolean | Determines whether the draft version should be retrieved if one exists.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      FulfillmentInfo result = apiInstance.getFulfillmentInfo(orderId, draft, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**FulfillmentInfo**](FulfillmentInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getOrder"></a>
# **getOrder**
> Order getOrder(orderId, draft, includeBin, mode, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose details you want.
    Boolean draft = true; // Boolean | Gets a draft copy of the order if one is available
    Boolean includeBin = false; // Boolean | Whether to include BIN numbers on credit card payments
    String mode = "mode_example"; // String | 'synthesized' to provide a synthesized order from shipment data
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Order result = apiInstance.getOrder(orderId, draft, includeBin, mode, responseFields);
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

<a name="getOrderAttributes"></a>
# **getOrderAttributes**
> List&lt;CommerceRuntimeOrderAttribute&gt; getOrderAttributes(orderId, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose attributeSets you want to get.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<CommerceRuntimeOrderAttribute> result = apiInstance.getOrderAttributes(orderId, responseFields);
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

<a name="getOrderData"></a>
# **getOrderData**
> Object getOrderData(orderId, responseFields)

Get Order Data

Retrieves all the values in the Order Data bag

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique Identifier of the Order whose Data you want to get
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Object result = apiInstance.getOrderData(orderId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrderData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique Identifier of the Order whose Data you want to get | |
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

<a name="getOrderItem"></a>
# **getOrderItem**
> OrderItem getOrderItem(orderId, orderItemId, draft, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose item you want to get.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item whose details you want to get.
    Boolean draft = true; // Boolean | Gets a draft copy of the order if one is available
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      OrderItem result = apiInstance.getOrderItem(orderId, orderItemId, draft, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**OrderItem**](OrderItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getOrderItemData"></a>
# **getOrderItemData**
> Object getOrderItemData(orderId, orderItemId, responseFields)

Get Order Item Data

Retrieves a specific value in the OrderItem Data bag.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique Identifier of the Order you want to get the Order Items for
    String orderItemId = "orderItemId_example"; // String | Unique Identifier of the OrderItem whose Data you want to get
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Object result = apiInstance.getOrderItemData(orderId, orderItemId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrderItemData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique Identifier of the Order you want to get the Order Items for | |
| **orderItemId** | **String**| Unique Identifier of the OrderItem whose Data you want to get | |
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

<a name="getOrderItemViaLineId"></a>
# **getOrderItemViaLineId**
> OrderItem getOrderItemViaLineId(orderId, lineId, draft, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose item you want to get.
    Integer lineId = 56; // Integer | Line ID of the order item whose details you want to get.
    Boolean draft = true; // Boolean | Gets a draft copy of the order if one is available
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      OrderItem result = apiInstance.getOrderItemViaLineId(orderId, lineId, draft, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**OrderItem**](OrderItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getOrderItems"></a>
# **getOrderItems**
> OrderItemCollection getOrderItems(orderId, draft, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose items you want to get.
    Boolean draft = true; // Boolean | Gets a draft copy of the order if one is available
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      OrderItemCollection result = apiInstance.getOrderItems(orderId, draft, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**OrderItemCollection**](OrderItemCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getOrderLineAttributes"></a>
# **getOrderLineAttributes**
> List&lt;OrderLineAttribute&gt; getOrderLineAttributes(orderId, orderItemId, responseFields)

Get all line-level attributes for an order item

Get all line-level attributes for an order item.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String orderItemId = "orderItemId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<OrderLineAttribute> result = apiInstance.getOrderLineAttributes(orderId, orderItemId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrderLineAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;OrderLineAttribute&gt;**](OrderLineAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getOrderNote"></a>
# **getOrderNote**
> OrderNote getOrderNote(orderId, noteId, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose note you want to get.
    String noteId = "noteId_example"; // String | Unique identifier of the note whose text you want to get.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      OrderNote result = apiInstance.getOrderNote(orderId, noteId, responseFields);
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

<a name="getOrderNotes"></a>
# **getOrderNotes**
> List&lt;OrderNote&gt; getOrderNotes(orderId, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose notes you want to get.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<OrderNote> result = apiInstance.getOrderNotes(orderId, responseFields);
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

<a name="getOrderReturnableItems"></a>
# **getOrderReturnableItems**
> OrderReturnableItemCollection getOrderReturnableItems(orderId, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      OrderReturnableItemCollection result = apiInstance.getOrderReturnableItems(orderId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**OrderReturnableItemCollection**](OrderReturnableItemCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getOrders"></a>
# **getOrders**
> OrderCollection getOrders(startIndex, pageSize, sortBy, filter, q, qLimit, includeBin, responseGroups, mode, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    Integer startIndex = 56; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.              For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=50. The default value is 0. Optional.
    Integer pageSize = 56; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals,              gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String q = "q_example"; // String | Text to perform a search on
    Integer qLimit = 56; // Integer | Limit of the records to include in a search, used for global search
    Boolean includeBin = false; // Boolean | Whether to include BIN numbers on credit card payments
    String responseGroups = "responseGroups_example"; // String | Response groups to return or filter the order graph
    String mode = "mode_example"; // String | 'synthesized' to provide a synthesized order from shipment data
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      OrderCollection result = apiInstance.getOrders(startIndex, pageSize, sortBy, filter, q, qLimit, includeBin, responseGroups, mode, responseFields);
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.              For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;50. The default value is 0. Optional. | [optional] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals,              gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **q** | **String**| Text to perform a search on | [optional] |
| **qLimit** | **Integer**| Limit of the records to include in a search, used for global search | [optional] |
| **includeBin** | **Boolean**| Whether to include BIN numbers on credit card payments | [optional] [default to false] |
| **responseGroups** | **String**| Response groups to return or filter the order graph | [optional] |
| **mode** | **String**| &#39;synthesized&#39; to provide a synthesized order from shipment data | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**OrderCollection**](OrderCollection.md)

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
> CommerceRuntimePackage getPackage(orderId, packageId, responseFields)

Get Order Package

Get an order package.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the package.
    String packageId = "packageId_example"; // String | Package to remove from the order
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CommerceRuntimePackage result = apiInstance.getPackage(orderId, packageId, responseFields);
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
> getPackageLabel(orderId, packageId, responseFields)

Get Order Package Label

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the package.
    String packageId = "packageId_example"; // String | Package to remove from the order
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.getPackageLabel(orderId, packageId, responseFields);
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
> Payment getPayment(orderId, paymentId, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose payment transaction you want to get.
    String paymentId = "paymentId_example"; // String | Unique identifier of the payment transaction you want to get.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Payment result = apiInstance.getPayment(orderId, paymentId, responseFields);
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

<a name="getPayments"></a>
# **getPayments**
> PaymentCollection getPayments(orderId, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose payment transactions you want to get.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PaymentCollection result = apiInstance.getPayments(orderId, responseFields);
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

<a name="getPickup"></a>
# **getPickup**
> Pickup getPickup(orderId, pickupId, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the pickup.
    String pickupId = "pickupId_example"; // String | Pickup to remove from the order
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Pickup result = apiInstance.getPickup(orderId, pickupId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Pickup**](Pickup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getQueuedHistoricalOrder"></a>
# **getQueuedHistoricalOrder**
> Order getQueuedHistoricalOrder(orderId, responseFields)

Get Queued Historical Order

Retrieves the details of a historical order specified by the order ID.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose details you want.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Order result = apiInstance.getQueuedHistoricalOrder(orderId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getQueuedHistoricalOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

<a name="getQueuedHistoricalOrders"></a>
# **getQueuedHistoricalOrders**
> QueuedOrderCollection getQueuedHistoricalOrders(startIndex, pageSize, sortBy, filter, qLimit, responseFields)

Get Queued Historical Orders

Retrieves a list of queued historical orders according to any specified filter criteria and sort options.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    Integer startIndex = 56; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.              For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=50. The default value is 0. Optional.
    Integer pageSize = 56; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals,              gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    Integer qLimit = 56; // Integer | Limit of the records to include in a search, used for global search
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      QueuedOrderCollection result = apiInstance.getQueuedHistoricalOrders(startIndex, pageSize, sortBy, filter, qLimit, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getQueuedHistoricalOrders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **qLimit** | **Integer**| Limit of the records to include in a search, used for global search | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**QueuedOrderCollection**](QueuedOrderCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getQueuedOrder"></a>
# **getQueuedOrder**
> Order getQueuedOrder(orderId, responseFields)

Get Queued Order

RRetrieves the details of an order specified by the order ID.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose details you want.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Order result = apiInstance.getQueuedOrder(orderId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getQueuedOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

<a name="getQueuedOrders"></a>
# **getQueuedOrders**
> QueuedOrderCollection getQueuedOrders(startIndex, pageSize, sortBy, filter, qLimit, responseFields)

Get Queued Orders

Retrieves a list of queuedorders according to any specified filter criteria and sort options.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    Integer startIndex = 56; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.              For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=50. The default value is 0. Optional.
    Integer pageSize = 56; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals,              gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    Integer qLimit = 56; // Integer | Limit of the records to include in a search, used for global search
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      QueuedOrderCollection result = apiInstance.getQueuedOrders(startIndex, pageSize, sortBy, filter, qLimit, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getQueuedOrders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **qLimit** | **Integer**| Limit of the records to include in a search, used for global search | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**QueuedOrderCollection**](QueuedOrderCollection.md)

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
> CancelReasonCollection getReasons(resourceType, category, skip, take, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String resourceType = "resourceType_example"; // String | 
    String category = "SHOPPER"; // String | 
    Integer skip = 0; // Integer | 
    Integer take = 50; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CancelReasonCollection result = apiInstance.getReasons(resourceType, category, skip, take, responseFields);
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
| **resourceType** | **String**|  | [optional] |
| **category** | **String**|  | [optional] [default to SHOPPER] |
| **skip** | **Integer**|  | [optional] [default to 0] |
| **take** | **Integer**|  | [optional] [default to 50] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CancelReasonCollection**](CancelReasonCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getRefundReasons"></a>
# **getRefundReasons**
> RefundReasonCollection getRefundReasons(responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      RefundReasonCollection result = apiInstance.getRefundReasons(responseFields);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**RefundReasonCollection**](RefundReasonCollection.md)

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
> Shipment getShipment(orderId, shipmentId, responseFields)

Get Shipment

Allows a shipment to be retrieved for the order. This API only applies to previous version of eCommerce. Get the UCP shipment documentation &lt;a href&#x3D;\&quot;/api-reference/order/get-shipment\&quot;&gt;here&lt;/a&gt;

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | ID of the order
    String shipmentId = "shipmentId_example"; // String | Shipment ID of the order.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Shipment result = apiInstance.getShipment(orderId, shipmentId, responseFields);
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

<a name="getShipmentAttributes"></a>
# **getShipmentAttributes**
> List&lt;ShipmentAttribute&gt; getShipmentAttributes(orderId, shipmentNumber, responseFields)

Gets all attributes for a shipment

Gets all attributes for a shipment.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    Integer shipmentNumber = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ShipmentAttribute> result = apiInstance.getShipmentAttributes(orderId, shipmentNumber, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getShipmentAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;ShipmentAttribute&gt;**](ShipmentAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getTaxableOrders"></a>
# **getTaxableOrders**
> List&lt;PricingTaxableOrder&gt; getTaxableOrders(orderId, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose taxable orders you want to get.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<PricingTaxableOrder> result = apiInstance.getTaxableOrders(orderId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;PricingTaxableOrder&gt;**](PricingTaxableOrder.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getValidationResults"></a>
# **getValidationResults**
> List&lt;OrderValidationResult&gt; getValidationResults(orderId, responseFields)

Get Validation Results

Retrieves all validation results stored on an order. Each result represents the outcome of an order validator capability — such as a fraud check — that was called when the order was submitted. Results include the validator status (&lt;code&gt;Pass&lt;/code&gt;, &lt;code&gt;Review&lt;/code&gt;, &lt;code&gt;Fail&lt;/code&gt;, or &lt;code&gt;Error&lt;/code&gt;), validator type, and any messages returned by the validator. See the &lt;a href&#x3D;\&quot;/pages/order-validators-and-fraud-check-applications\&quot;&gt;Order Validators and Fraud Check Applications&lt;/a&gt; guide for full details on how validation results affect order state.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order to which you want to add a note.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<OrderValidationResult> result = apiInstance.getValidationResults(orderId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;OrderValidationResult&gt;**](OrderValidationResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="performFulfillmentAction"></a>
# **performFulfillmentAction**
> Order performFulfillmentAction(orderId, responseFields, fulfillmentAction)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order which is ready to be shipped.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    FulfillmentAction fulfillmentAction = new FulfillmentAction(); // FulfillmentAction | Action to perform along with metadata about which packages, digital packages, or pickups to perform the action on
    try {
      Order result = apiInstance.performFulfillmentAction(orderId, responseFields, fulfillmentAction);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **fulfillmentAction** | [**FulfillmentAction**](FulfillmentAction.md)| Action to perform along with metadata about which packages, digital packages, or pickups to perform the action on | [optional] |

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

<a name="performOrderAction"></a>
# **performOrderAction**
> Order performOrderAction(orderId, responseFields, orderAction)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    OrderAction orderAction = new OrderAction(); // OrderAction | Action to perform, which can be \"SubmitOrder\", \"ValidateOrder\", \"AcceptOrder\", \"CancelOrder\", \"CompleteOrder\", \"AbandonOrder\", \"ReopenOrder\".
    try {
      Order result = apiInstance.performOrderAction(orderId, responseFields, orderAction);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **orderAction** | [**OrderAction**](OrderAction.md)| Action to perform, which can be \&quot;SubmitOrder\&quot;, \&quot;ValidateOrder\&quot;, \&quot;AcceptOrder\&quot;, \&quot;CancelOrder\&quot;, \&quot;CompleteOrder\&quot;, \&quot;AbandonOrder\&quot;, \&quot;ReopenOrder\&quot;. | [optional] |

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

<a name="performPaymentAction"></a>
# **performPaymentAction**
> Order performPaymentAction(orderId, paymentId, responseFields, paymentAction)

Perform Payment Action

Performs a specific payment action. Available actions depend on the current status of the payment transaction. If in doubt, get a list of available &lt;a href&#x3D;\&quot;/pages/payment-states#payment-actions\&quot;&gt;payment actions&lt;/a&gt; first.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose payment action you want to change.
    String paymentId = "paymentId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PaymentAction paymentAction = new PaymentAction(); // PaymentAction | Action to be performed, along with any metadata.
    try {
      Order result = apiInstance.performPaymentAction(orderId, paymentId, responseFields, paymentAction);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **paymentAction** | [**PaymentAction**](PaymentAction.md)| Action to be performed, along with any metadata. | [optional] |

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

<a name="priceOrder"></a>
# **priceOrder**
> Order priceOrder(refreshShipping, responseFields, order)

Price Order

Order price.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    Boolean refreshShipping = true; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Order order = new Order(); // Order | 
    try {
      Order result = apiInstance.priceOrder(refreshShipping, responseFields, order);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **order** | [**Order**](Order.md)|  | [optional] |

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

<a name="processDigitalWallet"></a>
# **processDigitalWallet**
> Order processDigitalWallet(orderId, digitalWalletType, responseFields, digitalWallet)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String digitalWalletType = "digitalWalletType_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    DigitalWallet digitalWallet = new DigitalWallet(); // DigitalWallet | 
    try {
      Order result = apiInstance.processDigitalWallet(orderId, digitalWalletType, responseFields, digitalWallet);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **digitalWallet** | [**DigitalWallet**](DigitalWallet.md)|  | [optional] |

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

<a name="processReturnRules"></a>
# **processReturnRules**
> List&lt;ProcessReturnRuleItemResponse&gt; processReturnRules(orderId, responseFields, processReturnRuleItemCollection)

Process Return Rules

Applies the return rules to the shipment items and responds if items are eligible for return. Provides fulfillment information for order items such as quantity ordered, fulfilled, and returned. Indicates which items are eligible for return.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProcessReturnRuleItemCollection processReturnRuleItemCollection = new ProcessReturnRuleItemCollection(); // ProcessReturnRuleItemCollection | List of the shipments and their items to validate return rules
    try {
      List<ProcessReturnRuleItemResponse> result = apiInstance.processReturnRules(orderId, responseFields, processReturnRuleItemCollection);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#processReturnRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **processReturnRuleItemCollection** | [**ProcessReturnRuleItemCollection**](ProcessReturnRuleItemCollection.md)| List of the shipments and their items to validate return rules | [optional] |

### Return type

[**List&lt;ProcessReturnRuleItemResponse&gt;**](ProcessReturnRuleItemResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeAlternateContact"></a>
# **removeAlternateContact**
> Order removeAlternateContact(orderId, responseFields)

Remove Alternate Contact

Remove alternate contact from order and shipments.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Order result = apiInstance.removeAlternateContact(orderId, responseFields);
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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="repriceCanceledShipment"></a>
# **repriceCanceledShipment**
> RepriceCanceledShipmentResponse repriceCanceledShipment(orderId, responseFields, repriceCanceledShipmentRequest)

Reprice Canceled Shipment

Reprices a fully canceled shipment or when the last item is canceled.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    RepriceCanceledShipmentRequest repriceCanceledShipmentRequest = new RepriceCanceledShipmentRequest(); // RepriceCanceledShipmentRequest | Payload contains ActiveShipments and CanceledShipment.             ActiveShipments are the active shipments from the order to redistribute costs to.             CanceledShipment is the shipment being canceled.
    try {
      RepriceCanceledShipmentResponse result = apiInstance.repriceCanceledShipment(orderId, responseFields, repriceCanceledShipmentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#repriceCanceledShipment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **repriceCanceledShipmentRequest** | [**RepriceCanceledShipmentRequest**](RepriceCanceledShipmentRequest.md)| Payload contains ActiveShipments and CanceledShipment.             ActiveShipments are the active shipments from the order to redistribute costs to.             CanceledShipment is the shipment being canceled. | [optional] |

### Return type

[**RepriceCanceledShipmentResponse**](RepriceCanceledShipmentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="repriceShipment"></a>
# **repriceShipment**
> Shipment repriceShipment(shipmentNumber, orderId, isItemCancellationContext, responseFields, repriceShipmentObject)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | 
    String orderId = "orderId_example"; // String | 
    Boolean isItemCancellationContext = false; // Boolean | FFMT svc will pass this as true while canceling  shipment item.             If it is true shipping costs will retain.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    RepriceShipmentObject repriceShipmentObject = new RepriceShipmentObject(); // RepriceShipmentObject | 
    try {
      Shipment result = apiInstance.repriceShipment(shipmentNumber, orderId, isItemCancellationContext, responseFields, repriceShipmentObject);
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
| **isItemCancellationContext** | **Boolean**| FFMT svc will pass this as true while canceling  shipment item.             If it is true shipping costs will retain. | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **repriceShipmentObject** | [**RepriceShipmentObject**](RepriceShipmentObject.md)|  | [optional] |

### Return type

[**Shipment**](Shipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="repriceSubstitutes"></a>
# **repriceSubstitutes**
> Shipment repriceSubstitutes(shipmentNumber, orderId, responseFields, repriceShipmentObject)

Reprice Substitutes

Reprice substitute items in shipments.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | 
    String orderId = "orderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    RepriceShipmentObject repriceShipmentObject = new RepriceShipmentObject(); // RepriceShipmentObject | 
    try {
      Shipment result = apiInstance.repriceSubstitutes(shipmentNumber, orderId, responseFields, repriceShipmentObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#repriceSubstitutes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **repriceShipmentObject** | [**RepriceShipmentObject**](RepriceShipmentObject.md)|  | [optional] |

### Return type

[**Shipment**](Shipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="resendGatewayGiftCardEmail"></a>
# **resendGatewayGiftCardEmail**
> resendGatewayGiftCardEmail(orderId, giftcardId, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String giftcardId = "giftcardId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.resendGatewayGiftCardEmail(orderId, giftcardId, responseFields);
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

<a name="resendOrderConfirmationEmail"></a>
# **resendOrderConfirmationEmail**
> resendOrderConfirmationEmail(orderId, responseFields, orderAction)

Resend Order Confirmation Email

Resend order confirmation email specified by the Order Id. The only supported actionName for the request body is SubmitOrder.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    OrderAction orderAction = new OrderAction(); // OrderAction | 
    try {
      apiInstance.resendOrderConfirmationEmail(orderId, responseFields, orderAction);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **orderAction** | [**OrderAction**](OrderAction.md)|  | [optional] |

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

<a name="resendPackageFulfillmentEmail"></a>
# **resendPackageFulfillmentEmail**
> Order resendPackageFulfillmentEmail(orderId, responseFields, fulfillmentAction)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    FulfillmentAction fulfillmentAction = new FulfillmentAction(); // FulfillmentAction | 
    try {
      Order result = apiInstance.resendPackageFulfillmentEmail(orderId, responseFields, fulfillmentAction);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **fulfillmentAction** | [**FulfillmentAction**](FulfillmentAction.md)|  | [optional] |

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

<a name="resendRefundEmail"></a>
# **resendRefundEmail**
> resendRefundEmail(orderId, refundId, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String refundId = "refundId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.resendRefundEmail(orderId, refundId, responseFields);
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

<a name="setBillingInfo"></a>
# **setBillingInfo**
> BillingInfo setBillingInfo(orderId, updateMode, version, responseFields, billingInfo)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose payment source you want to update.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    BillingInfo billingInfo = new BillingInfo(); // BillingInfo | All the properties that you want the payment source object to contain.
    try {
      BillingInfo result = apiInstance.setBillingInfo(orderId, updateMode, version, responseFields, billingInfo);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **billingInfo** | [**BillingInfo**](BillingInfo.md)| All the properties that you want the payment source object to contain. | [optional] |

### Return type

[**BillingInfo**](BillingInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="setFulFillmentInfo"></a>
# **setFulFillmentInfo**
> FulfillmentInfo setFulFillmentInfo(orderId, updateMode, version, responseFields, fulfillmentInfo)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose fulfillment information you want to change.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    FulfillmentInfo fulfillmentInfo = new FulfillmentInfo(); // FulfillmentInfo | All properties that you want the updated fulfillment information to have.
    try {
      FulfillmentInfo result = apiInstance.setFulFillmentInfo(orderId, updateMode, version, responseFields, fulfillmentInfo);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **fulfillmentInfo** | [**FulfillmentInfo**](FulfillmentInfo.md)| All properties that you want the updated fulfillment information to have. | [optional] |

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

<a name="smsOptOut"></a>
# **smsOptOut**
> smsOptOut(siteId, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String siteId = "siteId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.smsOptOut(siteId, responseFields);
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

<a name="splitOrderIntoShipment"></a>
# **splitOrderIntoShipment**
> List&lt;Shipment&gt; splitOrderIntoShipment(orderId, responseFields)

Split Order Into Shipment

Split Order Into Shipment

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<Shipment> result = apiInstance.splitOrderIntoShipment(orderId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#splitOrderIntoShipment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;Shipment&gt;**](Shipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="splitShipments"></a>
# **splitShipments**
> List&lt;Shipment&gt; splitShipments(orderId, shipmentNumber, responseFields, splitShipmentsObject)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String shipmentNumber = "shipmentNumber_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SplitShipmentsObject splitShipmentsObject = new SplitShipmentsObject(); // SplitShipmentsObject | 
    try {
      List<Shipment> result = apiInstance.splitShipments(orderId, shipmentNumber, responseFields, splitShipmentsObject);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **splitShipmentsObject** | [**SplitShipmentsObject**](SplitShipmentsObject.md)|  | [optional] |

### Return type

[**List&lt;Shipment&gt;**](Shipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateDigitalPackage"></a>
# **updateDigitalPackage**
> DigitalPackage updateDigitalPackage(orderId, digitalPackageId, responseFields, digitalPackage)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the package.
    String digitalPackageId = "digitalPackageId_example"; // String | Package to update on the order
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    DigitalPackage digitalPackage = new DigitalPackage(); // DigitalPackage | Package content to update on the order
    try {
      DigitalPackage result = apiInstance.updateDigitalPackage(orderId, digitalPackageId, responseFields, digitalPackage);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **digitalPackage** | [**DigitalPackage**](DigitalPackage.md)| Package content to update on the order | [optional] |

### Return type

[**DigitalPackage**](DigitalPackage.md)

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
> List&lt;ExtendedProperty&gt; updateExtendedProperties(orderId, updateMode, version, upsert, responseFields, extendedProperty)

Updated Extended Properties

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    Boolean upsert = false; // Boolean | Allow insert or update
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ExtendedProperty> extendedProperty = Arrays.asList(); // List<ExtendedProperty> | Extended properties
    try {
      List<ExtendedProperty> result = apiInstance.updateExtendedProperties(orderId, updateMode, version, upsert, responseFields, extendedProperty);
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
> ExtendedProperty updateExtendedProperty(orderId, key, updateMode, version, upsert, responseFields, extendedProperty)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item
    String key = "key_example"; // String | Key
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    Boolean upsert = false; // Boolean | Allow insert or update
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ExtendedProperty extendedProperty = new ExtendedProperty(); // ExtendedProperty | Extended property
    try {
      ExtendedProperty result = apiInstance.updateExtendedProperty(orderId, key, updateMode, version, upsert, responseFields, extendedProperty);
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

<a name="updateGiftInfo"></a>
# **updateGiftInfo**
> Order updateGiftInfo(orderId, orderItemId, updateMode, version, responseFields, giftInfo)

Update Order Item Gift Information

Updates the gift information on an order item

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    GiftInfo giftInfo = new GiftInfo(); // GiftInfo | Mozu.CommerceRuntime.Contracts.Orders.GiftInfo to use as the update source
    try {
      Order result = apiInstance.updateGiftInfo(orderId, orderItemId, updateMode, version, responseFields, giftInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateGiftInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **giftInfo** | [**GiftInfo**](GiftInfo.md)| Mozu.CommerceRuntime.Contracts.Orders.GiftInfo to use as the update source | [optional] |

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

<a name="updateItemDeliveryDate"></a>
# **updateItemDeliveryDate**
> Order updateItemDeliveryDate(orderId, orderItemId, updateMode, version, responseFields, body)

Update the Delivery Date of Order Item

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    OffsetDateTime body = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      Order result = apiInstance.updateItemDeliveryDate(orderId, orderItemId, updateMode, version, responseFields, body);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **body** | **OffsetDateTime**|  | [optional] |

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

<a name="updateItemDuty"></a>
# **updateItemDuty**
> Order updateItemDuty(orderId, orderItemId, dutyAmount, updateMode, version, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    Double dutyAmount = 3.4D; // Double | Duty amount to update the item product to.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Order result = apiInstance.updateItemDuty(orderId, orderItemId, dutyAmount, updateMode, version, responseFields);
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

<a name="updateItemFulfillment"></a>
# **updateItemFulfillment**
> Order updateItemFulfillment(orderId, orderItemId, updateMode, version, zipCode, responseFields, orderItem)

Update Item Fulfillment

Updates the fulfillment method and/or location of an individual order item in the order of the current shopper.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String zipCode = "zipCode_example"; // String | Zip Code used for inventory reservation if order having STH items
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    OrderItem orderItem = new OrderItem(); // OrderItem | The order item containing fulfillment information to update.
    try {
      Order result = apiInstance.updateItemFulfillment(orderId, orderItemId, updateMode, version, zipCode, responseFields, orderItem);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **orderItem** | [**OrderItem**](OrderItem.md)| The order item containing fulfillment information to update. | [optional] |

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

<a name="updateItemProductPrice"></a>
# **updateItemProductPrice**
> Order updateItemProductPrice(orderId, orderItemId, price, isOverRidePriceSalePrice, updateMode, version, responseFields)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    Double price = 3.4D; // Double | Price to update the item product to.
    Boolean isOverRidePriceSalePrice = false; // Boolean | Indicate override price is sale price or list price.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Order result = apiInstance.updateItemProductPrice(orderId, orderItemId, price, isOverRidePriceSalePrice, updateMode, version, responseFields);
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
| **isOverRidePriceSalePrice** | **Boolean**| Indicate override price is sale price or list price. | [optional] [default to false] |
| **updateMode** | **String**| Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft) | [optional] |
| **version** | **String**| Determines whether or not to check versioning of items for concurrency purposes. | [optional] |
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

<a name="updateItemQuantity"></a>
# **updateItemQuantity**
> Order updateItemQuantity(orderId, orderItemId, quantity, updateMode, version, responseFields, itemQuantityUpdate)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order item.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    Integer quantity = 56; // Integer | New quantity for the specified order item.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ItemQuantityUpdate itemQuantityUpdate = new ItemQuantityUpdate(); // ItemQuantityUpdate | Update fields on the item.
    try {
      Order result = apiInstance.updateItemQuantity(orderId, orderItemId, quantity, updateMode, version, responseFields, itemQuantityUpdate);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **itemQuantityUpdate** | [**ItemQuantityUpdate**](ItemQuantityUpdate.md)| Update fields on the item. | [optional] |

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

<a name="updateOrder"></a>
# **updateOrder**
> Order updateOrder(orderId, updateMode, version, responseFields, order)

Update Order

Updates an existing order. The fields that can be modified depend on the current state of the order and the &#x60;updateMode&#x60; used.  ## Update Modes  | Mode | Value | Description | |------|-------|-------------| | &#x60;ApplyToOriginal&#x60; | (default) | Applies changes directly to the order. For accepted orders, the order must pass editability checks or the call will be rejected (except for &#x60;ExternalId&#x60; on partial orders). | | &#x60;ApplyToDraft&#x60; | &#x60;ApplyToDraft&#x60; | Applies changes to a draft copy of the order. The original order is not modified. A draft is automatically created if one does not exist. The draft has &#x60;Status&#x3D;Pending&#x60; and passes editability checks, so all editable fields can be set on the draft. | | &#x60;ApplyAndCommit&#x60; | &#x60;ApplyAndCommit&#x60; | Applies changes to the draft and then commits the draft back to the original order. For accepted orders, this creates new shipments from the draft order items. |  ## Editability Rules  An order is considered **not editable** when any of the following are true:  - The order has been accepted (&#x60;AcceptedDate&#x60; is set, meaning shipments have been created). - The order status is not one of: &#x60;Pending&#x60;, &#x60;PendingReview&#x60;, or &#x60;PendingShipment&#x60;. - The order is a partial/split order in a non-&#x60;Pending&#x60;/non-&#x60;PendingShipment&#x60; status.  When the order is not editable and &#x60;updateMode&#x3D;ApplyToOriginal&#x60;, the API will return a &#x60;403 Forbidden&#x60; error, **except** for the &#x60;ExternalId&#x60; field on partial orders (see below).  When &#x60;updateMode&#x3D;ApplyToDraft&#x60;, the changes are applied to the draft copy which is always in &#x60;Pending&#x60; status, so the editability restriction does not block the update.  ## Fields Updated by UpdateOrder  ### Always Updated (Regardless of Order Status)  These fields are copied from the request body to the order on every call, whether the order is pre-acceptance or post-acceptance (when using draft mode):  | Field | Notes | |-------|-------| | &#x60;Email&#x60; | Overwrites the existing value. | | &#x60;SourceDevice&#x60; | Overwrites the existing value. | | &#x60;AcceptsMarketing&#x60; | Only updated if the incoming value is non-null; otherwise the existing value is preserved. | | &#x60;VisitId&#x60; | Overwrites the existing value. | | &#x60;WebSessionId&#x60; | Overwrites the existing value. | | &#x60;CustomerInteractionType&#x60; | Overwrites the existing value. | | &#x60;ShopperNotes&#x60; | Overwrites the existing value. | | &#x60;AlternateContact&#x60; | Overwrites the existing value. | | &#x60;ShipmentCreationOffset&#x60; | Validated: must be &#x60;-1&#x60; or a positive integer from &#x60;1&#x60; to &#x60;7200&#x60;. | | &#x60;ParentOrderId&#x60; | Validated: cannot be set to the order&#39;s own ID; the referenced parent order must exist. | | &#x60;ExternalId&#x60; | Can be set or changed, but **cannot be cleared** once set. If the incoming value is null or empty, the existing value is preserved. | | &#x60;FulfillmentInfo&#x60; | Updated via &#x60;SetFulfillmentInfoAsync&#x60; if a non-null value is provided. |  ### Conditionally Updated  | Field | Condition | Notes | |-------|-----------|-------| | &#x60;UserId&#x60; | Only if &#x60;CustomerAccountId&#x60; is null **and** &#x60;UserId&#x60; is currently blank on the order. | Once set, &#x60;UserId&#x60; cannot be changed via this API. | | &#x60;CustomerAccountId&#x60; | Only if &#x60;CustomerAccountId&#x60; is currently null on the order. | Once set, &#x60;CustomerAccountId&#x60; cannot be changed via this API. If not yet set and the caller is not an anonymous shopper, a customer account is created or looked up automatically. | | &#x60;DutyAmount&#x60; | Only if the order is in a **modifiable** status (not &#x60;Completed&#x60;, &#x60;Cancelled&#x60;, &#x60;Null&#x60;, or &#x60;Abandoned&#x60;). | If the order is in a terminal status and the incoming &#x60;DutyAmount&#x60; differs from the existing value, a &#x60;cannotUpdateDutyAmount&#x60; validation error is thrown. If the duty total changes, the pricing pipeline is re-executed. | | &#x60;BillingInfo&#x60; | Only if the order has **not** been accepted (&#x60;HasBeenAccepted &#x3D; false&#x60;). | Ignored on accepted orders. Use the dedicated [Set Billing Info](/api-reference/order/set-billing-info) API instead. | | &#x60;IPAddress&#x60; | Only for **offline** orders (&#x60;Type &#x3D; Offline&#x60;). | For online orders, the IP address is set from the client request automatically (pre-submission only). | | &#x60;OriginalCartId&#x60; | Only for **offline** orders, and only if a non-empty value is provided. | Used for cart takeover scenarios. |  ### Post-Acceptance Discount Exclusions  When the order **has** been accepted, the API supports updating **discount exclusions** on existing order-level and shipping-level discounts:  - &#x60;OrderDiscounts&#x60; -- each discount&#39;s exclusion flag can be toggled via &#x60;UpdateDiscountExclusion&#x60;. - &#x60;ShippingDiscounts&#x60; -- each discount&#39;s exclusion flag can be toggled via &#x60;UpdateDiscountExclusion&#x60;.  If any discount exclusion is changed, the pricing pipeline is re-executed to recalculate totals.  This is the **only** pricing-related modification available on accepted orders through this endpoint (outside of draft mode).  ### ExternalId on Non-Editable Partial Orders  As a special case, if the order fails editability checks (e.g., it is a partial/split order that has been accepted) but the request body includes a non-empty &#x60;ExternalId&#x60;, the &#x60;ExternalId&#x60; is updated and the order is saved immediately. No other fields are modified and no pricing pipeline is executed. This is the only field that bypasses the editability restriction outside of draft mode.  ## Draft Mode Behavior (ApplyToDraft / ApplyAndCommit)  When &#x60;updateMode&#x3D;ApplyToDraft&#x60;:  1. The system retrieves or creates a draft copy of the order. The draft is a separate embedded document with &#x60;Status&#x3D;Pending&#x60; and &#x60;IsDraft&#x3D;true&#x60;. 2. All field updates listed above are applied to the **draft**, not the original order. 3. The draft is persisted. The original order is unchanged. 4. The draft is returned in the response.  When &#x60;updateMode&#x3D;ApplyAndCommit&#x60;:  1. The same field updates are applied to the draft. 2. After updates, the system calls &#x60;CreateShipmentsFromDraftOrder&#x60;, which:    - Validates the order is in draft mode and has items.    - Splits the draft order into shipments via the fulfillment routing engine.    - Evaluates and updates the rollup status on the original order.    - Adds a &#x60;PostSubmitItemsAdded&#x60; change message to the original order.    - Clears the draft from the original order. 3. The updated original order (with new shipments) is returned.  ## Pricing Pipeline  The update order pricing pipeline is re-executed when:  - &#x60;DutyAmount&#x60; changes (and the order is in a modifiable status). - A discount exclusion is toggled on an accepted order.  When the pipeline runs, it recalculates order totals, taxes, and applied discounts.  ## Summary: What Can You Update on an Accepted Order with Shipments?  ### Directly (updateMode&#x3D;ApplyToOriginal)  | Updatable | Field | |-----------|-------| | Yes | &#x60;Email&#x60; | | Yes | &#x60;SourceDevice&#x60; | | Yes | &#x60;AcceptsMarketing&#x60; | | Yes | &#x60;VisitId&#x60; | | Yes | &#x60;WebSessionId&#x60; | | Yes | &#x60;CustomerInteractionType&#x60; | | Yes | &#x60;ShopperNotes&#x60; | | Yes | &#x60;AlternateContact&#x60; | | Yes | &#x60;ShipmentCreationOffset&#x60; | | Yes | &#x60;ParentOrderId&#x60; | | Yes | &#x60;ExternalId&#x60; (set/change only, not clear) | | Yes | &#x60;FulfillmentInfo&#x60; | | Yes | &#x60;DutyAmount&#x60; (if order is not in terminal status) | | Yes | &#x60;OrderDiscounts&#x60; / &#x60;ShippingDiscounts&#x60; (exclusion flag only) | | **No** | &#x60;BillingInfo&#x60; (ignored after acceptance; use [Set Billing Info](/api-reference/order/set-billing-info)) | | **No** | &#x60;UserId&#x60; (locked once set) | | **No** | &#x60;CustomerAccountId&#x60; (locked once set) | | **No** | &#x60;IPAddress&#x60; (online orders only, pre-submission only) | | **No** | &#x60;Items&#x60; (use draft mode or the dedicated Order Items API) |  ### Via Draft Mode (updateMode&#x3D;ApplyToDraft then ApplyAndCommit)  All of the above fields, plus the ability to modify items on the draft and commit them as new shipments on the original order.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | The order ID to update.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Order order = new Order(); // Order | All properties of the order to place.
    try {
      Order result = apiInstance.updateOrder(orderId, updateMode, version, responseFields, order);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **order** | [**Order**](Order.md)| All properties of the order to place. | [optional] |

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

<a name="updateOrderAttributes"></a>
# **updateOrderAttributes**
> List&lt;CommerceRuntimeOrderAttribute&gt; updateOrderAttributes(orderId, removeMissing, responseFields, commerceRuntimeOrderAttribute)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose attributeSet you want to update.
    Boolean removeMissing = false; // Boolean | Indicates that items missing from the collection should be removed.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<CommerceRuntimeOrderAttribute> commerceRuntimeOrderAttribute = Arrays.asList(); // List<CommerceRuntimeOrderAttribute> | Attributes to upsert.
    try {
      List<CommerceRuntimeOrderAttribute> result = apiInstance.updateOrderAttributes(orderId, removeMissing, responseFields, commerceRuntimeOrderAttribute);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **commerceRuntimeOrderAttribute** | [**List&lt;CommerceRuntimeOrderAttribute&gt;**](CommerceRuntimeOrderAttribute.md)| Attributes to upsert. | [optional] |

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

<a name="updateOrderData"></a>
# **updateOrderData**
> Object updateOrderData(orderId, orderDataId, responseFields, body)

Update Order Data

Insert / Updates the Value of the given Key in the OrderData bag.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique Identifier of the Order you want to insert / update the Databag for
    String orderDataId = "orderDataId_example"; // String | URLEncoded Key for the Value you want to Insert / Update from the Order DataBag
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Object body = null; // Object | Data Object you are trying to insert / update
    try {
      Object result = apiInstance.updateOrderData(orderId, orderDataId, responseFields, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateOrderData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique Identifier of the Order you want to insert / update the Databag for | |
| **orderDataId** | **String**| URLEncoded Key for the Value you want to Insert / Update from the Order DataBag | |
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

<a name="updateOrderDiscount"></a>
# **updateOrderDiscount**
> Order updateOrderDiscount(orderId, discountId, updateMode, version, responseFields, commerceRuntimeAppliedDiscount)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the coupon.
    Integer discountId = 56; // Integer | Identifies the discount to be updated.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CommerceRuntimeAppliedDiscount commerceRuntimeAppliedDiscount = new CommerceRuntimeAppliedDiscount(); // CommerceRuntimeAppliedDiscount | Discount information to use as the update source.
    try {
      Order result = apiInstance.updateOrderDiscount(orderId, discountId, updateMode, version, responseFields, commerceRuntimeAppliedDiscount);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **commerceRuntimeAppliedDiscount** | [**CommerceRuntimeAppliedDiscount**](CommerceRuntimeAppliedDiscount.md)| Discount information to use as the update source. | [optional] |

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

<a name="updateOrderItemData"></a>
# **updateOrderItemData**
> Object updateOrderItemData(orderId, orderItemId, orderItemDataId, responseFields, body)

Update Order Item Data

Insert / Updates the Value of the given Key in the OrderItem Data bag.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique Identifier of the Order you want to get the Items for
    String orderItemId = "orderItemId_example"; // String | Unique Identifier of the OrderItem you want to Insert / Update the Databag for
    String orderItemDataId = "orderItemDataId_example"; // String | URLEncoded Key for the Value you want to Insert / Update from the OrderItem DataBag
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Object body = null; // Object | Data Object you are trying to insert / update
    try {
      Object result = apiInstance.updateOrderItemData(orderId, orderItemId, orderItemDataId, responseFields, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateOrderItemData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique Identifier of the Order you want to get the Items for | |
| **orderItemId** | **String**| Unique Identifier of the OrderItem you want to Insert / Update the Databag for | |
| **orderItemDataId** | **String**| URLEncoded Key for the Value you want to Insert / Update from the OrderItem DataBag | |
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

<a name="updateOrderItemDiscount"></a>
# **updateOrderItemDiscount**
> Order updateOrderItemDiscount(orderId, orderItemId, discountId, updateMode, version, responseFields, commerceRuntimeAppliedDiscount)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the coupon.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    Integer discountId = 56; // Integer | Identifies the discount to be updated.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit,   ApplyToOriginal, ApplyToDraft).
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CommerceRuntimeAppliedDiscount commerceRuntimeAppliedDiscount = new CommerceRuntimeAppliedDiscount(); // CommerceRuntimeAppliedDiscount | Discount information to use as the update source.
    try {
      Order result = apiInstance.updateOrderItemDiscount(orderId, orderItemId, discountId, updateMode, version, responseFields, commerceRuntimeAppliedDiscount);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **commerceRuntimeAppliedDiscount** | [**CommerceRuntimeAppliedDiscount**](CommerceRuntimeAppliedDiscount.md)| Discount information to use as the update source. | [optional] |

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

<a name="updateOrderLineAttributes"></a>
# **updateOrderLineAttributes**
> List&lt;OrderLineAttribute&gt; updateOrderLineAttributes(orderId, orderItemId, removeMissing, responseFields, orderLineAttribute)

Upsert line-level attributes on an order item

Upsert line-level attributes on an order item.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String orderItemId = "orderItemId_example"; // String | 
    Boolean removeMissing = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<OrderLineAttribute> orderLineAttribute = Arrays.asList(); // List<OrderLineAttribute> | 
    try {
      List<OrderLineAttribute> result = apiInstance.updateOrderLineAttributes(orderId, orderItemId, removeMissing, responseFields, orderLineAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateOrderLineAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **removeMissing** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **orderLineAttribute** | [**List&lt;OrderLineAttribute&gt;**](OrderLineAttribute.md)|  | [optional] |

### Return type

[**List&lt;OrderLineAttribute&gt;**](OrderLineAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateOrderNote"></a>
# **updateOrderNote**
> OrderNote updateOrderNote(orderId, noteId, responseFields, orderNote)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order whose note you want to update.
    String noteId = "noteId_example"; // String | Unique identifier of the note whose text you want to update.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    OrderNote orderNote = new OrderNote(); // OrderNote | Text of the note.
    try {
      OrderNote result = apiInstance.updateOrderNote(orderId, noteId, responseFields, orderNote);
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

<a name="updateOrderRestrictions"></a>
# **updateOrderRestrictions**
> Order updateOrderRestrictions(orderId, restrictEdit, restrictCancellation, responseFields)

Update Order Restrictions

Updates the flags for restricting edits and/or cancellations by users without override user behaviors.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    Boolean restrictEdit = true; // Boolean | 
    Boolean restrictCancellation = true; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Order result = apiInstance.updateOrderRestrictions(orderId, restrictEdit, restrictCancellation, responseFields);
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

<a name="updatePackage"></a>
# **updatePackage**
> CommerceRuntimePackage updatePackage(orderId, packageId, responseFields, commerceRuntimePackage)

Update Order Package

Updates an order package.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the package.
    String packageId = "packageId_example"; // String | Package to update on the order
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CommerceRuntimePackage commerceRuntimePackage = new CommerceRuntimePackage(); // CommerceRuntimePackage | Package content to update on the order
    try {
      CommerceRuntimePackage result = apiInstance.updatePackage(orderId, packageId, responseFields, commerceRuntimePackage);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **commerceRuntimePackage** | [**CommerceRuntimePackage**](CommerceRuntimePackage.md)| Package content to update on the order | [optional] |

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

<a name="updatePickup"></a>
# **updatePickup**
> Pickup updatePickup(orderId, pickupId, responseFields, pickup)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the pickup.
    String pickupId = "pickupId_example"; // String | Pickup to update on the order
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Pickup pickup = new Pickup(); // Pickup | Pickup content to update on the order
    try {
      Pickup result = apiInstance.updatePickup(orderId, pickupId, responseFields, pickup);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **pickup** | [**Pickup**](Pickup.md)| Pickup content to update on the order | [optional] |

### Return type

[**Pickup**](Pickup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateShipmentAdjustments"></a>
# **updateShipmentAdjustments**
> Shipment updateShipmentAdjustments(orderId, shipmentNumber, responseFields, shipmentAdjustment)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    Integer shipmentNumber = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ShipmentAdjustment shipmentAdjustment = new ShipmentAdjustment(); // ShipmentAdjustment | 
    try {
      Shipment result = apiInstance.updateShipmentAdjustments(orderId, shipmentNumber, responseFields, shipmentAdjustment);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **shipmentAdjustment** | [**ShipmentAdjustment**](ShipmentAdjustment.md)|  | [optional] |

### Return type

[**Shipment**](Shipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateShipmentAndItemsAdjustment"></a>
# **updateShipmentAndItemsAdjustment**
> Shipment updateShipmentAndItemsAdjustment(orderId, shipmentNumber, responseFields, shipmentAndItemsAdjustment)

Update Shipment and Multiple Shipment Items Adjustment

Updates shipment and shipment items adjustment.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    Integer shipmentNumber = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ShipmentAndItemsAdjustment shipmentAndItemsAdjustment = new ShipmentAndItemsAdjustment(); // ShipmentAndItemsAdjustment | 
    try {
      Shipment result = apiInstance.updateShipmentAndItemsAdjustment(orderId, shipmentNumber, responseFields, shipmentAndItemsAdjustment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateShipmentAndItemsAdjustment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **shipmentAndItemsAdjustment** | [**ShipmentAndItemsAdjustment**](ShipmentAndItemsAdjustment.md)|  | [optional] |

### Return type

[**Shipment**](Shipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateShipmentAttributes"></a>
# **updateShipmentAttributes**
> List&lt;ShipmentAttribute&gt; updateShipmentAttributes(orderId, shipmentNumber, removeMissing, responseFields, shipmentAttribute)

Updates attributes on a shipment

Updates attributes on a shipment.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    Integer shipmentNumber = 56; // Integer | 
    Boolean removeMissing = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ShipmentAttribute> shipmentAttribute = Arrays.asList(); // List<ShipmentAttribute> | 
    try {
      List<ShipmentAttribute> result = apiInstance.updateShipmentAttributes(orderId, shipmentNumber, removeMissing, responseFields, shipmentAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateShipmentAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **removeMissing** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **shipmentAttribute** | [**List&lt;ShipmentAttribute&gt;**](ShipmentAttribute.md)|  | [optional] |

### Return type

[**List&lt;ShipmentAttribute&gt;**](ShipmentAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateShipmentItem"></a>
# **updateShipmentItem**
> Shipment updateShipmentItem(orderId, shipmentNumber, itemId, responseFields, shipmentItemAdjustment)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    Integer shipmentNumber = 56; // Integer | 
    Integer itemId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ShipmentItemAdjustment shipmentItemAdjustment = new ShipmentItemAdjustment(); // ShipmentItemAdjustment | 
    try {
      Shipment result = apiInstance.updateShipmentItem(orderId, shipmentNumber, itemId, responseFields, shipmentItemAdjustment);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **shipmentItemAdjustment** | [**ShipmentItemAdjustment**](ShipmentItemAdjustment.md)|  | [optional] |

### Return type

[**Shipment**](Shipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateShippingAndSuggestions"></a>
# **updateShippingAndSuggestions**
> Order updateShippingAndSuggestions(orderId, orderItemId, updateMode, version, responseFields, itemFulfillmentInfo)

Update Shipping and Suggestions

Updates the shipping and suggestions information of an individual order item in the order.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ItemFulfillmentInfo itemFulfillmentInfo = new ItemFulfillmentInfo(); // ItemFulfillmentInfo | The item fulfillment information to update.
    try {
      Order result = apiInstance.updateShippingAndSuggestions(orderId, orderItemId, updateMode, version, responseFields, itemFulfillmentInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateShippingAndSuggestions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **itemFulfillmentInfo** | [**ItemFulfillmentInfo**](ItemFulfillmentInfo.md)| The item fulfillment information to update. | [optional] |

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

<a name="updateSubscriptionInfo"></a>
# **updateSubscriptionInfo**
> Order updateSubscriptionInfo(orderId, orderItemId, responseFields, subscriptionInfo)

Update Order Item Subscription Info

Update a subscription info on the order item, applies only to Draft Order.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order with which to associate the coupon.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SubscriptionInfo subscriptionInfo = new SubscriptionInfo(); // SubscriptionInfo | Mozu.CommerceRuntime.Contracts.Subscriptions.SubscriptionInfo to use as the update source
    try {
      Order result = apiInstance.updateSubscriptionInfo(orderId, orderItemId, responseFields, subscriptionInfo);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionInfo** | [**SubscriptionInfo**](SubscriptionInfo.md)| Mozu.CommerceRuntime.Contracts.Subscriptions.SubscriptionInfo to use as the update source | [optional] |

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

<a name="upsertAlternateContact"></a>
# **upsertAlternateContact**
> Order upsertAlternateContact(orderId, responseFields, alternateContact)

Add/Update Alternate Contact

Add/update an alternate contact.

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    AlternateContact alternateContact = new AlternateContact(); // AlternateContact | 
    try {
      Order result = apiInstance.upsertAlternateContact(orderId, responseFields, alternateContact);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **alternateContact** | [**AlternateContact**](AlternateContact.md)|  | [optional] |

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

<a name="upsertGiftMessage"></a>
# **upsertGiftMessage**
> Order upsertGiftMessage(orderId, responseFields, giftMessage)

Upsert Gift Message

Upserts the gift message on a shipment

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    GiftMessage giftMessage = new GiftMessage(); // GiftMessage | 
    try {
      Order result = apiInstance.upsertGiftMessage(orderId, responseFields, giftMessage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#upsertGiftMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **giftMessage** | [**GiftMessage**](GiftMessage.md)|  | [optional] |

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

<a name="upsertInventoryTags"></a>
# **upsertInventoryTags**
> Order upsertInventoryTags(orderId, orderItemId, updateMode, version, responseFields, inventoryTags)

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<InventoryTags> inventoryTags = Arrays.asList(); // List<InventoryTags> | Mozu.CommerceRuntime.Contracts.Commerce.InventoryTags to use as the update source
    try {
      Order result = apiInstance.upsertInventoryTags(orderId, orderItemId, updateMode, version, responseFields, inventoryTags);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **inventoryTags** | [**List&lt;InventoryTags&gt;**](InventoryTags.md)| Mozu.CommerceRuntime.Contracts.Commerce.InventoryTags to use as the update source | [optional] |

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

<a name="upsertSubstituteInfo"></a>
# **upsertSubstituteInfo**
> Order upsertSubstituteInfo(orderId, orderItemId, updateMode, version, responseFields, substituteInfo)

Updates SubstituteInfo on OrderItem

Updates SubstituteInfo on OrderItem

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

    OrderApi apiInstance = new OrderApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique identifier of the order.
    String orderItemId = "orderItemId_example"; // String | Unique identifier of the order item.
    String updateMode = "updateMode_example"; // String | Determines the update strategy for this update (ApplyAndCommit, ApplyToOriginal, ApplyToDraft)
    String version = "version_example"; // String | Determines whether or not to check versioning of items for concurrency purposes.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SubstituteInfo substituteInfo = new SubstituteInfo(); // SubstituteInfo | Mozu.CommerceRuntime.Contracts.Commerce.SubstituteInfo to use as the update source
    try {
      Order result = apiInstance.upsertSubstituteInfo(orderId, orderItemId, updateMode, version, responseFields, substituteInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#upsertSubstituteInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **substituteInfo** | [**SubstituteInfo**](SubstituteInfo.md)| Mozu.CommerceRuntime.Contracts.Commerce.SubstituteInfo to use as the update source | [optional] |

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

