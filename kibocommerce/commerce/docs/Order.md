

# Order

Order form.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderNumber** | **Integer** | Order Number. This is an integer that is only assigned after an order is placed and enters the open state. |  [optional] |
|**locationCode** | **String** | Identifies the location at which the order was placed if the order was placed externally. |  [optional] |
|**version** | **String** | Version for concurrency purposes |  [optional] |
|**parentOrderId** | **String** | If this Order has a parent order, this should be the parent&#39;s ID. |  [optional] |
|**parentOrderNumber** | **Integer** | If this order has a parent order, this should be the parent&#39;s Mozu.CommerceRuntime.Contracts.Orders.Order.OrderNumber. |  [optional] |
|**parentCheckoutId** | **String** | If this order originated from a multi-ship enabled site, this is the identifier of the originating checkout. |  [optional] |
|**parentCheckoutNumber** | **Integer** | If this order originated from a multi-ship enabled site, this is the number of the originating checkout. |  [optional] |
|**partialOrderNumber** | **Integer** | If this order originated from a checkout, this is a sequence number out of the total orders created from that checkout. |  [optional] |
|**partialOrderCount** | **Integer** | If this order originated from a checkout, this is the total number of orders created from that checkout. |  [optional] |
|**isPartialOrder** | **Boolean** | Returns {true} if this order originated from a checkout and has sibling partial orders, otherwise {false}. |  [optional] |
|**parentReturnId** | **String** | If this order was created as part of a return, this should be the return&#39;s ID. |  [optional] |
|**parentReturnNumber** | **Integer** | If this order was created as part of a return, this should be the return&#39;s ReturnNumber. |  [optional] |
|**originalCartId** | **String** | Unique identifier for the cart that was converted to order. |  [optional] |
|**originalQuoteId** | **String** | If this order originated from a quote, this is the identifier of the originating quote. |  [optional] |
|**originalQuoteNumber** | **Integer** | If this order originated from a quote, this is the number of the originating quote. |  [optional] |
|**priceListCode** | **String** | Pricelist code for the order |  [optional] |
|**availableActions** | **List&lt;String&gt;** | Actions available to the payment |  [optional] |
|**shopperNotes** | [**CommerceRuntimeShopperNotes**](CommerceRuntimeShopperNotes.md) |  |  [optional] |
|**customerAccountId** | **Integer** | Unique identifier of the customer account. |  [optional] |
|**customerTaxId** | **String** | The customers tax ID.  If Customer Account ID exists in the system, will set this. |  [optional] |
|**isTaxExempt** | **Boolean** | Unique identifier of the customer account. |  [optional] |
|**email** | **String** | Email address of the customer at the time the order is placed. |  [optional] |
|**alternateContact** | [**AlternateContact**](AlternateContact.md) |  |  [optional] |
|**ipAddress** | **String** | IP address of the user placing the order. (User or customer?) |  [optional] |
|**sourceDevice** | **String** | Source device of the user placing the order. (User or customer?) |  [optional] |
|**acceptsMarketing** | **Boolean** | Does the customer accept marketing |  [optional] |
|**status** | **String** | Current status of the order, which can be viewed in OrderStatusConst. System-supplied and read-only. |  [optional] |
|**type** | **String** | Is this Order Online or Offline? Online means shopper entered at checkout, offline means a phone order. |  [optional] |
|**paymentStatus** | **String** | Current status of payment, which can be \&quot;Null,\&quot; \&quot;AwaitingCheck,\&quot; \&quot;AwaitingPayment,\&quot; \&quot;Paid,\&quot; \&quot;Authorized,\&quot; or \&quot;Void.\&quot;   System-supplied and read-only. |  [optional] |
|**returnStatus** | **String** | System-supplied and read-only. |  [optional] |
|**isEligibleForReturns** | **Boolean** | Marker for determining if the order is a) complete or b) has some items that are shipped and not part of any other return |  [optional] |
|**totalCollected** | **Double** | Total amount of money collected on the order via payments. |  [optional] |
|**attributes** | [**List&lt;CommerceRuntimeOrderAttribute&gt;**](CommerceRuntimeOrderAttribute.md) |  |  [optional] |
|**adjustment** | [**Adjustment**](Adjustment.md) |  |  [optional] |
|**shippingAdjustment** | [**Adjustment**](Adjustment.md) |  |  [optional] |
|**handlingAdjustment** | [**Adjustment**](Adjustment.md) |  |  [optional] |
|**shippingDiscounts** | [**List&lt;ShippingDiscount&gt;**](ShippingDiscount.md) |  |  [optional] |
|**handlingDiscounts** | [**List&lt;CommerceRuntimeAppliedDiscount&gt;**](CommerceRuntimeAppliedDiscount.md) | The list of historically-applied handling discounts.  The active one will have IsExcluded &#x3D;&#x3D; false |  [optional] |
|**handlingAmount** | **Double** | Order level handling fees excluding any discounts. |  [optional] |
|**handlingSubTotal** | **Double** | Handling fees for the Order as well as OrderItems (e.g. if the Order has a $5 handling fee and an OrderItem has a $2 handling fee per item quantity and the quantity of items is 2 then the value in this property would be $9) |  [optional] |
|**handlingTotal** | **Double** | Handling fees including any discounts. |  [optional] |
|**dutyAmount** | **Double** | Order level duty or tariff amount. Does not take into account duties or tariffs specifically on items on the order |  [optional] |
|**dutyTotal** | **Double** | Duties or tariffs for the Order as well as OrderItems (e.g. if the Order has a $5 duty or tariff for any reason and an OrderItem has a $2 duty or tariff then the value in this property would be $7) |  [optional] |
|**fulfillmentStatus** | **String** | Current fulfillment status, which can be \&quot;NotFulfilled,\&quot;, \&quot;PartiallyFulfilled\&quot;, or \&quot;Fufilled.\&quot;   System-supplied and read-only.  Values are available in FulfillmentStatusConst of this class. |  [optional] |
|**isFulfillable** | **Boolean** | Flag to indicate whether it is safe to proceed with fulfillment on shipments on the order. |  [optional] |
|**submittedDate** | **OffsetDateTime** | When the customer placed (submitted) the order. |  [optional] |
|**shipmentCreationOffset** | **Integer** | Release Shipment After(in minutes) (Order Submitted Date). |  [optional] |
|**releaseShipmentDate** | **OffsetDateTime** |  |  [optional] |
|**cancelledDate** | **OffsetDateTime** | Date the order was cancelled. |  [optional] |
|**closedDate** | **OffsetDateTime** | Date the order was closed. A closed order means that the order has been processed and items shipped. |  [optional] |
|**acceptedDate** | **OffsetDateTime** | When the order was accepted by the merchant |  [optional] |
|**notes** | [**List&lt;OrderNote&gt;**](OrderNote.md) | Internal notes that a merchant may add to the order. Maximum 250 characters. |  [optional] |
|**items** | [**List&lt;CommerceRuntimeOrderItem&gt;**](CommerceRuntimeOrderItem.md) | List of items in the order. |  [optional] |
|**validationResults** | [**List&lt;OrderValidationResult&gt;**](OrderValidationResult.md) | Validation results for the order when processes against validation capabilities. |  [optional] |
|**billingInfo** | [**BillingInfo**](BillingInfo.md) |  |  [optional] |
|**payments** | [**List&lt;Payment&gt;**](Payment.md) | Payment transaction associated with this order. It is the entire payment interchange between the merchant   who is forwarding the customer&#39;s payment information and the payment service who is authorizing and   capturing payment. Payment can be either by credit card, check, or PayPal. |  [optional] |
|**refunds** | [**List&lt;Refund&gt;**](Refund.md) | Refunds associated with this order. A refund is a single exchange of money from merchant to customer  that either encapsulates a refund to a credit card or an issuance of a store credit.  Refunds does not reduce the &#39;amount collected&#39; on an order and it is possible for refunds to exceed the total order amount. |  [optional] |
|**credits** | [**List&lt;CommerceRuntimeCredit&gt;**](CommerceRuntimeCredit.md) |  |  [optional] |
|**packages** | [**List&lt;CommerceRuntimePackage&gt;**](CommerceRuntimePackage.md) | Shipping package associated with this order. |  [optional] |
|**pickups** | [**List&lt;Pickup&gt;**](Pickup.md) | Fulfillment pickups associated with this order. |  [optional] |
|**digitalPackages** | [**List&lt;DigitalPackage&gt;**](DigitalPackage.md) | Fulfillment digital packages associated with this order. |  [optional] |
|**shipments** | [**List&lt;CommerceRuntimeShipment&gt;**](CommerceRuntimeShipment.md) | Package shipments associated with this order. |  [optional] |
|**isDraft** | **Boolean** | Is this order a draft version |  [optional] |
|**hasDraft** | **Boolean** | Does this order have a draft version. |  [optional] |
|**isImport** | **Boolean** | Was this order initiated from an external system |  [optional] |
|**isHistoricalImport** | **Boolean** | Indicates this was an order in a terminal state (completed/canceled) that was imported into the system for historical purposes. |  [optional] |
|**importDate** | **OffsetDateTime** | Date this item was imported |  [optional] |
|**isUnified** | **Boolean** | Was this order created by the Unified platform. |  [optional] |
|**externalId** | **String** | An order number to link this order to an external system |  [optional] |
|**couponCodes** | **List&lt;String&gt;** | Coupon codes associated with this order.  Only set on order import. |  [optional] |
|**invalidCoupons** | [**List&lt;InvalidCoupon&gt;**](InvalidCoupon.md) | A list of invalid coupons that were attempted on the order |  [optional] |
|**amountAvailableForRefund** | **Double** | This property represents AmountCaptured - AmountRefunded via returns.  It is read only. |  [optional] |
|**amountRemainingForPayment** | **Double** | A counter for how much of the order total has not been claimed by payments.  This is computed by Order.Total-(sum of Order.Payments where State is not voided/declined) |  [optional] |
|**amountRefunded** | **Double** | A counter for how much money has been issued in refunds.  This calculated field does NOT include refunds issued in returns. |  [optional] |
|**readyToCapture** | **Boolean** |  |  [optional] |
|**isOptInForSms** | **Boolean** | Whether the shopper opts in to curbside text notifications. |  [optional] |
|**subscriptionIds** | **List&lt;String&gt;** | All the subscriptions associated with the current order. |  [optional] |
|**continuityOrderOrdinal** | **Integer** | The ordinal to track the Continuity order. |  [optional] |
|**reservationId** | **String** | Inventory Reservation id for order. |  [optional] |
|**restrictEdit** | **Boolean** | Setting this flag on the order will restrict user from editing the order |  [optional] |
|**restrictCancellation** | **Boolean** | Settings this flag on the order will restrict user from Cancelling the order |  [optional] |
|**userId** | **String** | Unique identifier of the shopper who created the cart. |  [optional] |
|**id** | **String** | Unique identifier of the CommerceAggregate object (e.g. order, cart, wishlist, etc.). |  [optional] |
|**tenantId** | **Integer** | Unique identifier of the Tenant. |  [optional] |
|**siteId** | **Integer** | Unique identifier of the Site. |  [optional] |
|**channelCode** | **String** | Unique identifier of the channel for this item. |  [optional] |
|**currencyCode** | **String** | ISO Currency Code. Currently, only USD is supported. |  [optional] |
|**visitId** | **String** | Identifies the Visit ID that was current when the order was placed or when the cart was last updated. |  [optional] |
|**webSessionId** | **String** | Identifies the web session used to place the order or last update the cart. |  [optional] |
|**customerInteractionType** | **String** | Determines the interaction type that a customer will use to create this object.  Valid values are: Website, Store, Call, Unknown |  [optional] |
|**fulfillmentInfo** | [**FulfillmentInfo**](FulfillmentInfo.md) |  |  [optional] |
|**orderDiscounts** | [**List&lt;CommerceRuntimeAppliedDiscount&gt;**](CommerceRuntimeAppliedDiscount.md) | The discount that has been applied to the cart itself. If multiple discounts exist, this is the discount that the system applies because it offers the best savings for the shopper. This is a negative number. |  [optional] |
|**suggestedDiscounts** | [**List&lt;SuggestedDiscount&gt;**](SuggestedDiscount.md) |  |  [optional] |
|**rejectedDiscounts** | [**List&lt;SuggestedDiscount&gt;**](SuggestedDiscount.md) |  |  [optional] |
|**data** | **Object** | Custom data for a given vendor set within the commerce process. |  [optional] |
|**taxData** | **Object** | Storage for any additional/custom tax data. |  [optional] |
|**subtotal** | **Double** | Combined price for all cart items, including all selected options but excluding any discounts. |  [optional] |
|**discountedSubtotal** | **Double** | Combined price for all cart items, including all selected options as well as any discounts. |  [optional] |
|**discountTotal** | **Double** | Amount of the discounts applied to all items in the cart. This is a negative number.  This also includes the order level discounts. |  [optional] |
|**discountedTotal** | **Double** | Subtotal minus the discounted total |  [optional] |
|**shippingTotal** | **Double** | Shipping does not appear on cart. |  [optional] |
|**shippingSubTotal** | **Double** | Shipping total without discounts applied. |  [optional] |
|**shippingTaxTotal** | **Double** | Not implemented. Tax does not appear on cart. |  [optional] |
|**handlingTaxTotal** | **Double** | Total tax on handling |  [optional] |
|**itemTaxTotal** | **Double** | Not implemented. Tax does not appear on cart. |  [optional] |
|**taxTotal** | **Double** | Tax does not appear on cart. |  [optional] |
|**feeTotal** | **Double** | Not implemented. Total cost of fees for all items in the cart. |  [optional] |
|**total** | **Double** | Final total amount of the order including all discounts, shipping, and tax. |  [optional] |
|**lineItemSubtotalWithOrderAdjustments** | **Double** | Line Item Subtotals with Order Adjustments |  [optional] |
|**shippingAmountBeforeDiscountsAndAdjustments** | **Double** | Shipping Amount before discount and adjustments |  [optional] |
|**lastValidationDate** | **OffsetDateTime** | Occasionally the commerce runtime may validate that item/product names, descriptions, and prices have not changed.   If changed, it updates LastValidationDate. |  [optional] |
|**expirationDate** | **OffsetDateTime** | When the order will no longer be active. That is, the order is considered abandoned.   Orders of anonymous shoppers expire after 14 days of inactivity.   An order never expires for shoppers who are logged into their account.   Date in UTC Date/Time. |  [optional] |
|**changeMessages** | [**List&lt;CommerceRuntimeChangeMessage&gt;**](CommerceRuntimeChangeMessage.md) | List of messages displayed by the system based on the last cart action, for example, when a product price has changed or is out-of-stock. System-supplied and read-only. |  [optional] |
|**extendedProperties** | [**List&lt;ExtendedProperty&gt;**](ExtendedProperty.md) | Extra properties (key-value pairs) that extend the primary object. Think of this as a property bag of string keys and string values. |  [optional] |
|**discountThresholdMessages** | [**List&lt;CommerceRuntimeThresholdMessage&gt;**](CommerceRuntimeThresholdMessage.md) | List of Mozu.CommerceRuntime.Contracts.Commerce.ThresholdMessage objects that are valid for the current value of the cart/order. |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


