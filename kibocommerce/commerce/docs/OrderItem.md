

# OrderItem

A single line item of an order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adjustedLineItemSubtotal** | **Double** | Order Level taxable sub total |  [optional] |
|**auditInfo** | [**CoreApiContractsAuditInfo**](CoreApiContractsAuditInfo.md) |  |  [optional] |
|**autoAddDiscountId** | **Integer** | Track the discountId from which the item was auto added |  [optional] |
|**childItemIds** | **List&lt;String&gt;** | List of Child Item Ids for this order item |  [optional] |
|**data** | **Object** | Custom data for a given vendor set within the commerce process. |  [optional] |
|**discountTotal** | **Double** | How much the shopper saves with the applied discount or sale price. This is a negative number. |  [optional] |
|**discountedTotal** | **Double** | Subtotal minus any discounts. |  [optional] |
|**dutyAmount** | **Double** | Duty or Tariff for this item |  [optional] |
|**extendedTotal** | **Double** | Line item extended total (quantity multiplied by unit extended price) before discounts. |  [optional] |
|**feeTotal** | **Double** | Not implemented. Total cost of fees that apply to this item. |  [optional] |
|**handlingAmount** | **Double** | Product-level handling fee for this item (e.g. special packaging, hazmat fees). This does NOT include order-level handling fees — those are in Mozu.CommerceRuntime.Contracts.Commerce.CommerceItem.WeightedOrderHandlingFee. Total handling on the shipment &#x3D; HandlingAmount + WeightedOrderHandlingFee. |  [optional] |
|**inventoryTags** | [**List&lt;InventoryTags&gt;**](InventoryTags.md) |  |  [optional] |
|**isAssemblyRequired** | **Boolean** | Assembly Required for this order item |  [optional] |
|**isRecurring** | **Boolean** | If true, the cart item lists a product that can be purchased or fulfilled at regular intervals, for example, monthly billing or a subscription. |  [optional] |
|**isTaxable** | **Boolean** | Not implemented. If true, the cart item is eligible for tax. |  [optional] |
|**itemTaxTotal** | **Double** | Total price of taxes that apply to products in this item. |  [optional] |
|**lineId** | **Integer** | The line id assigned to the order item. Visible only in the Admin, this is set from the Admin or in CommerceRuntime when a cart is converted to an order. |  [optional] |
|**lineItemAdjustment** | **Double** |  |  [optional] |
|**localeCode** | **String** | Locale code for language that appears in text and descriptions on the site, for example, en_US.  This is not the currency code. Currently only en_US is supported. |  [optional] |
|**parentItemId** | **String** | Indicates Parent Item Id for this order item |  [optional] |
|**product** | [**CommerceRuntimeProduct**](CommerceRuntimeProduct.md) |  |  [optional] |
|**productDiscount** | [**AppliedLineItemProductDiscount**](AppliedLineItemProductDiscount.md) |  |  [optional] |
|**productDiscounts** | [**List&lt;AppliedLineItemProductDiscount&gt;**](AppliedLineItemProductDiscount.md) | A list of discounts applied to the product |  [optional] |
|**purchaseLocation** | **String** | The location where the product is being purchased.. default is null. Products can have different prices by purchaseLocation via custom priceListResolution... |  [optional] |
|**quantity** | **Integer** | Number of products ordered. |  [optional] |
|**shippingAmountBeforeDiscountsAndAdjustments** | **Double** | Shipping amount before Discounts and adjustments |  [optional] |
|**shippingDiscounts** | [**List&lt;AppliedLineItemShippingDiscount&gt;**](AppliedLineItemShippingDiscount.md) | A discount applied to the shipping |  [optional] |
|**shippingTaxTotal** | **Double** | Total price of taxes that apply to the shipping of this item. |  [optional] |
|**shippingTotal** | **Double** | Total price of shipping that apply to this item. |  [optional] |
|**substituteInfo** | [**SubstituteInfo**](SubstituteInfo.md) |  |  [optional] |
|**subtotal** | **Double** | Line item subtotal (quantity multiplied by price) before discounts. |  [optional] |
|**taxData** | **Object** | Storage for any additional/custom tax data. |  [optional] |
|**taxableTotal** | **Double** | Line item subtotal (quantity multiplied by price) before discounts. |  [optional] |
|**total** | **Double** | Total price of this cart item taking into account any discounts. |  [optional] |
|**totalWithWeightedShippingAndHandling** | **Double** | Line item total with line item, Tax, Weighted Tax with Weighted shipping and handling costs |  [optional] |
|**totalWithoutWeightedShippingAndHandling** | **Double** | Taxable Subtotal including Weighted Order amounts |  [optional] |
|**unitPrice** | [**CommerceUnitPrice**](CommerceUnitPrice.md) |  |  [optional] |
|**weightedOrderAdjustment** | **Double** | Order Level Manual Adjustment applied to this Item |  [optional] |
|**weightedOrderDiscount** | **Double** | Order Level Discount applied to this Item |  [optional] |
|**weightedOrderDuty** | **Double** | Order Level Duty applied to this Item |  [optional] |
|**weightedOrderHandlingAdjustment** | **Double** | Order-level handling manual adjustment allocated to this item. |  [optional] |
|**weightedOrderHandlingFee** | **Double** | Order-level handling fee allocated to this item (e.g. flat handling fee spread across all items). This is separate from product-level handling in Mozu.CommerceRuntime.Contracts.Commerce.CommerceItem.HandlingAmount. Total handling on the shipment &#x3D; HandlingAmount + WeightedOrderHandlingFee. |  [optional] |
|**weightedOrderHandlingFeeDiscount** | **Double** | Order-level handling fee discount allocated to this item. |  [optional] |
|**weightedOrderHandlingFeeTax** | **Double** | Total handling tax for this item (covers both product-level and order-level handling tax combined). On the shipment item, this is split into: HandlingTax (total) and WeightedOrderHandlingFeeTax (order-level portion only). |  [optional] |
|**weightedOrderShipping** | **Double** | Order Level Shipping applied to this Item |  [optional] |
|**weightedOrderShippingDiscount** | **Double** | Order Level Shipping discount applied to this Item |  [optional] |
|**weightedOrderShippingManualAdjustment** | **Double** | Order Level Shipping Manual Adjustment applied to this Item |  [optional] |
|**weightedOrderShippingTax** | **Double** | Order Level Shipping Tax applied to this Item |  [optional] |
|**weightedOrderTax** | **Double** | Order Level tax applied to this Item |  [optional] |
|**attributes** | [**List&lt;OrderLineAttribute&gt;**](OrderLineAttribute.md) | Extensible attributes for this order line. |  [optional] |
|**callOffOrderItemId** | **String** | Identifier of the originating Call-Off Order line item, if this item was released from a Call-Off Order line. Null for standard order items. |  [optional] |
|**deliveryWindow** | [**DeliveryWindow**](DeliveryWindow.md) |  |  [optional] |
|**destinationId** | **String** | The destination associated with this item when used with a multi-ship checkout. |  [optional] |
|**expectedDeliveryDate** | **OffsetDateTime** | Expected Delivery Date of shipment |  [optional] |
|**fulfillmentLocationCode** | **String** | Location code from which to obtain this item |  [optional] |
|**fulfillmentMethod** | **String** | Fulfillment method used to fulfill this item |  [optional] |
|**giftInfo** | [**GiftInfo**](GiftInfo.md) |  |  [optional] |
|**id** | **String** | Unique identifier of the order line item. System-supplied and read-only. |  [optional] |
|**isReservationEnabled** | **Boolean** | Flag to indicate reserve inventory in cart |  [optional] |
|**originalCartItemId** | **String** | Unique identifier of the cart item that is associated with this line item.  (This is the original Cart Item ID expressed as a GUID.) |  [optional] |
|**priceMode** | **String** | Determines if the item is using external or internal(catalog) pricing |  [optional] |
|**requestedShipDate** | **OffsetDateTime** | Requested ship date carried from the Call-Off Order line (spec COM-10941 follow-up). |  [optional] |
|**returnRuleInfo** | [**ReturnRuleInfo**](ReturnRuleInfo.md) |  |  [optional] |
|**shippingMethodCode** | **String** | Code that uniquely identifies the shipping method. |  [optional] |
|**shippingMethodName** | **String** | Readable name of the shipping method. |  [optional] |
|**subscription** | [**SubscriptionInfo**](SubscriptionInfo.md) |  |  [optional] |
|**suggestions** | [**List&lt;Suggestion&gt;**](Suggestion.md) | Routing suggestions |  [optional] |
|**timeFenceDays** | **Integer** | Time-fence tolerance (days) carried from the Call-Off Order line&#39;s bound ReservationRule. |  [optional] |


## Implemented Interfaces

* Serializable


