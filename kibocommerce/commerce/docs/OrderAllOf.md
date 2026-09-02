

# OrderAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptedDate** | **OffsetDateTime** | When the order was accepted by the merchant |  [optional] |
|**acceptsMarketing** | **Boolean** | Does the customer accept marketing |  [optional] |
|**adjustment** | [**Adjustment**](Adjustment.md) |  |  [optional] |
|**alternateContact** | [**AlternateContact**](AlternateContact.md) |  |  [optional] |
|**amountAvailableForRefund** | **Double** | This property represents AmountCaptured - AmountRefunded via returns. It is read only. |  [optional] |
|**amountRefunded** | **Double** | A counter for how much money has been issued in refunds. This calculated field does NOT include refunds issued in returns. |  [optional] |
|**amountRemainingForPayment** | **Double** | A counter for how much of the order total has not been claimed by payments. This is computed by Order.Total-(sum of Order.Payments where State is not voided/declined) |  [optional] |
|**attributes** | [**List&lt;CommerceRuntimeOrderAttribute&gt;**](CommerceRuntimeOrderAttribute.md) |  |  [optional] |
|**availableActions** | **List&lt;String&gt;** | Actions available to the payment |  [optional] |
|**billingInfo** | [**BillingInfo**](BillingInfo.md) |  |  [optional] |
|**callOffOrderId** | **String** | Identifier of the originating Call-Off Order, if this Sales Order was released from a Call-Off Order. Null for standard orders. |  [optional] |
|**canceledItems** | [**List&lt;OrderCanceledItem&gt;**](OrderCanceledItem.md) | Items canceled on the Order due to Rule violation |  [optional] |
|**cancelledDate** | **OffsetDateTime** | Date the order was cancelled. |  [optional] |
|**closedDate** | **OffsetDateTime** | Date the order was closed. A closed order means that the order has been processed and items shipped. |  [optional] |
|**continuityOrderOrdinal** | **Integer** | The ordinal to track the Continuity order. |  [optional] |
|**couponCodes** | **List&lt;String&gt;** | Coupon codes associated with this order.  Only set on order import. |  [optional] |
|**credits** | [**List&lt;Credit&gt;**](Credit.md) |  |  [optional] |
|**customerAccountId** | **Integer** | Unique identifier of the customer account. |  [optional] |
|**customerTaxId** | **String** | The customers tax ID.  If Customer Account ID exists in the system, will set this. |  [optional] |
|**digitalPackages** | [**List&lt;DigitalPackage&gt;**](DigitalPackage.md) | Fulfillment digital packages associated with this order. |  [optional] |
|**dutyAmount** | **Double** | Order level duty or tariff amount. Does not take into account duties or tariffs specifically on items on the order |  [optional] |
|**dutyTotal** | **Double** | Duties or tariffs for the Order as well as OrderItems (e.g. if the Order has a $5 duty or tariff for any reason and an OrderItem has a $2 duty or tariff then the value in this property would be $7) |  [optional] |
|**email** | **String** | Email address of the customer at the time the order is placed. |  [optional] |
|**externalId** | **String** | An order number to link this order to an external system |  [optional] |
|**forceDeliveryConsolidationOnSplitShipments** | **Boolean** | Overrides the Fulfillment SiteSetting value for &#x60;ForceDeliveryConsolidationOnSplitShipments&#x60;. TODO autogen instead of manual addition |  [optional] |
|**forceSTHConsolidationOnSplitShipments** | **Boolean** | Overrides the Fulfillment SiteSetting value for &#x60;ForceSTHConsolidationOnSplitShipments&#x60;. TODO autogen instead of manual addition |  [optional] |
|**fulfillmentStatus** | **String** | Current fulfillment status, which can be \&quot;NotFulfilled,\&quot;, \&quot;PartiallyFulfilled\&quot;, or \&quot;Fufilled.\&quot;  System-supplied and read-only.  Values are available in FulfillmentStatusConst of this class. |  [optional] |
|**handlingAdjustment** | [**Adjustment**](Adjustment.md) |  |  [optional] |
|**handlingAmount** | **Double** | Order level handling fees excluding any discounts. |  [optional] |
|**handlingDiscounts** | [**List&lt;CommerceRuntimeAppliedDiscount&gt;**](CommerceRuntimeAppliedDiscount.md) | The list of historically-applied handling discounts.  The active one will have IsExcluded &#x3D;&#x3D; false |  [optional] |
|**handlingSubTotal** | **Double** | Handling fees for the Order as well as OrderItems (e.g. if the Order has a $5 handling fee and an OrderItem has a $2 handling fee per item quantity and the quantity of items is 2 then the value in this property would be $9) |  [optional] |
|**handlingTotal** | **Double** | Handling fees including any discounts. |  [optional] |
|**hasDraft** | **Boolean** | Does this order have a draft version. |  [optional] |
|**importDate** | **OffsetDateTime** | Date this item was imported |  [optional] |
|**invalidCoupons** | [**List&lt;InvalidCoupon&gt;**](InvalidCoupon.md) | A list of invalid coupons that were attempted on the order |  [optional] |
|**ipAddress** | **String** | IP address of the user placing the order. (User or customer?) |  [optional] |
|**isContinuityOrder** | **Boolean** | Flag to check if the order is continuityOrder. |  [optional] |
|**isDraft** | **Boolean** | Is this order a draft version |  [optional] |
|**isEligibleForReturns** | **Boolean** | Marker for determining if the order is a) complete or b) has some items that are shipped and not part of any other return |  [optional] |
|**isFulfillable** | **Boolean** | Flag to indicate whether it is safe to proceed with fulfillment on shipments on the order. |  [optional] |
|**isHistoricalImport** | **Boolean** | Indicates this was an order in a terminal state (completed/canceled) that was imported into the system for historical purposes. |  [optional] |
|**isImport** | **Boolean** | Was this order initiated from an external system |  [optional] |
|**isOptInForSms** | **Boolean** | Whether the shopper opts in to curbside text notifications. |  [optional] |
|**isPartialOrder** | **Boolean** | Returns &#x60;true&#x60; if this order originated from a checkout and has sibling partial orders, otherwise &#x60;false&#x60;. |  [optional] |
|**isTaxExempt** | **Boolean** | Unique identifier of the customer account. |  [optional] |
|**isUnified** | **Boolean** | Was this order created by the Unified platform. |  [optional] |
|**items** | [**List&lt;OrderItem&gt;**](OrderItem.md) | List of items in the order. |  [optional] |
|**locationCode** | **String** | Identifies the location at which the order was placed if the order was placed externally. |  [optional] |
|**notes** | [**List&lt;OrderNote&gt;**](OrderNote.md) | Internal notes that a merchant may add to the order. Maximum 250 characters. |  [optional] |
|**orderNumber** | **Integer** | Order Number. This is an integer that is only assigned after an order is placed and enters the open state. |  [optional] |
|**originalCartId** | **String** | Unique identifier for the cart that was converted to order. |  [optional] |
|**originalQuoteId** | **String** | If this order originated from a quote, this is the identifier of the originating quote. |  [optional] |
|**originalQuoteNumber** | **Integer** | If this order originated from a quote, this is the number of the originating quote. |  [optional] |
|**packages** | [**List&lt;CommerceRuntimePackage&gt;**](CommerceRuntimePackage.md) | Shipping package associated with this order. |  [optional] |
|**parentCheckoutId** | **String** | If this order originated from a multi-ship enabled site, this is the identifier of the originating checkout. |  [optional] |
|**parentCheckoutNumber** | **Integer** | If this order originated from a multi-ship enabled site, this is the number of the originating checkout. |  [optional] |
|**parentOrderId** | **String** | If this Order has a parent order, this should be the parent&#39;s ID. |  [optional] |
|**parentOrderNumber** | **Integer** | If this order has a parent order, this should be the parent&#39;s Mozu.CommerceRuntime.Contracts.Orders.Order.OrderNumber. |  [optional] |
|**parentReturnId** | **String** | If this order was created as part of a return, this should be the return&#39;s ID. |  [optional] |
|**parentReturnNumber** | **Integer** | If this order was created as part of a return, this should be the return&#39;s ReturnNumber. |  [optional] |
|**partialOrderCount** | **Integer** | If this order originated from a checkout, this is the total number of orders created from that checkout. |  [optional] |
|**partialOrderNumber** | **Integer** | If this order originated from a checkout, this is a sequence number out of the total orders created from that checkout. |  [optional] |
|**paymentStatus** | **String** | Current status of payment, which can be \&quot;Null,\&quot; \&quot;AwaitingCheck,\&quot; \&quot;AwaitingPayment,\&quot; \&quot;Paid,\&quot; \&quot;Authorized,\&quot; or \&quot;Void.\&quot;  System-supplied and read-only. |  [optional] |
|**payments** | [**List&lt;Payment&gt;**](Payment.md) | Payment transaction associated with this order. It is the entire payment interchange between the merchant  who is forwarding the customer&#39;s payment information and the payment service who is authorizing and  capturing payment. Payment can be either by credit card, check, or PayPal. |  [optional] |
|**pickups** | [**List&lt;Pickup&gt;**](Pickup.md) | Fulfillment pickups associated with this order. |  [optional] |
|**priceListCode** | **String** | Pricelist code for the order |  [optional] |
|**readyToCapture** | **Boolean** |  |  [optional] |
|**refunds** | [**List&lt;Refund&gt;**](Refund.md) | Refunds associated with this order. A refund is a single exchange of money from merchant to customer that either encapsulates a refund to a credit card or an issuance of a store credit. Refunds does not reduce the &#39;amount collected&#39; on an order and it is possible for refunds to exceed the total order amount. |  [optional] |
|**releaseShipmentDate** | **OffsetDateTime** |  |  [optional] |
|**reservationId** | **String** | Inventory Reservation id for order. |  [optional] |
|**restrictCancellation** | **Boolean** | Settings this flag on the order will restrict user from Cancelling the order |  [optional] |
|**restrictEdit** | **Boolean** | Setting this flag on the order will restrict user from editing the order |  [optional] |
|**returnStatus** | **String** | System-supplied and read-only. |  [optional] |
|**shipmentCreationOffset** | **Integer** | Release Shipment After(in minutes) (Order Submitted Date). |  [optional] |
|**shipments** | [**List&lt;Shipment&gt;**](Shipment.md) | Package shipments associated with this order. |  [optional] |
|**shippingAdjustment** | [**Adjustment**](Adjustment.md) |  |  [optional] |
|**shippingDiscounts** | [**List&lt;ShippingDiscount&gt;**](ShippingDiscount.md) |  |  [optional] |
|**shippingGroups** | [**List&lt;ShippingGrouping&gt;**](ShippingGrouping.md) | List of order grouping. |  [optional] |
|**shopperNotes** | [**ShopperNotes**](ShopperNotes.md) |  |  [optional] |
|**sourceDevice** | **String** | Source device of the user placing the order. (User or customer?) |  [optional] |
|**status** | **String** | Current status of the order, which can be viewed in OrderStatusConst. System-supplied and read-only. |  [optional] |
|**submittedDate** | **OffsetDateTime** | When the customer placed (submitted) the order. |  [optional] |
|**subscriptionIds** | **List&lt;String&gt;** | All the subscriptions associated with the current order. |  [optional] |
|**totalCollected** | **Double** | Total amount of money collected on the order via payments. |  [optional] |
|**type** | **String** | Is this Order Online or Offline? Online means shopper entered at checkout, offline means a phone order. |  [optional] |
|**validationResults** | [**List&lt;OrderValidationResult&gt;**](OrderValidationResult.md) | Validation results for the order when processes against validation capabilities. |  [optional] |
|**version** | **String** | Version for concurrency purposes |  [optional] |


## Implemented Interfaces

* Serializable


