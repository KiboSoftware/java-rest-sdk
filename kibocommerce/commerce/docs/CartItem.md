

# CartItem

Details of an item in the shopper's cart, such as the product name, stock count, unit price, discounts, quantity ordered, and total price.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the item in the cart. |  [optional] |
|**fulfillmentLocationCode** | **String** | Location code from which to obtain this item |  [optional] |
|**fulfillmentMethod** | **String** | Fulfillment method used to fulfill this item |  [optional] |
|**subscription** | [**SubscriptionInfo**](SubscriptionInfo.md) |  |  [optional] |
|**localeCode** | **String** | Locale code for language that appears in text and descriptions on the site, for example, en_US.   This is not the currency code. Currently only en_US is supported. |  [optional] |
|**purchaseLocation** | **String** | The location where the product is being purchased.. default is null. Products can have different prices  by purchaseLocation via custom priceListResolution... |  [optional] |
|**lineId** | **Integer** | The line id assigned to the order item. Visible only in the Admin, this is set from the Admin or  in CommerceRuntime when a cart is converted to an order. |  [optional] |
|**product** | [**CommerceRuntimeProduct**](CommerceRuntimeProduct.md) |  |  [optional] |
|**quantity** | **Integer** | Number of products ordered. |  [optional] |
|**isRecurring** | **Boolean** | If true, the cart item lists a product that can be purchased or fulfilled at regular intervals, for example, monthly billing or a subscription. |  [optional] |
|**isTaxable** | **Boolean** | Not implemented. If true, the cart item is eligible for tax. |  [optional] |
|**subtotal** | **Double** | Line item subtotal (quantity multiplied by price) before discounts. |  [optional] |
|**extendedTotal** | **Double** | Line item extended total (quantity multiplied by unit extended price) before discounts. |  [optional] |
|**taxableTotal** | **Double** | Line item subtotal (quantity multiplied by price) before discounts. |  [optional] |
|**discountTotal** | **Double** | How much the shopper saves with the applied discount or sale price. This is a negative number. |  [optional] |
|**discountedTotal** | **Double** | Subtotal minus any discounts. |  [optional] |
|**itemTaxTotal** | **Double** | Total price of taxes that apply to products in this item. |  [optional] |
|**shippingTaxTotal** | **Double** | Total price of taxes that apply to the shipping of this item. |  [optional] |
|**shippingTotal** | **Double** | Total price of shipping that apply to this item. |  [optional] |
|**handlingAmount** | **Double** | Handling Amount for this item |  [optional] |
|**feeTotal** | **Double** | Not implemented. Total cost of fees that apply to this item. |  [optional] |
|**total** | **Double** | Total price of this cart item taking into account any discounts. |  [optional] |
|**unitPrice** | [**CommerceUnitPrice**](CommerceUnitPrice.md) |  |  [optional] |
|**productDiscount** | [**CommerceRuntimeAppliedLineItemProductDiscount**](CommerceRuntimeAppliedLineItemProductDiscount.md) |  |  [optional] |
|**productDiscounts** | [**List&lt;CommerceRuntimeAppliedLineItemProductDiscount&gt;**](CommerceRuntimeAppliedLineItemProductDiscount.md) | A list of discounts applied to the product |  [optional] |
|**shippingDiscounts** | [**List&lt;CommerceRuntimeAppliedLineItemShippingDiscount&gt;**](CommerceRuntimeAppliedLineItemShippingDiscount.md) | A discount applied to the shipping |  [optional] |
|**data** | **Object** | Custom data for a given vendor set within the commerce process. |  [optional] |
|**taxData** | **Object** | Storage for any additional/custom tax data. |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**shippingAmountBeforeDiscountsAndAdjustments** | **Double** | Shipping amount before Discounts and adjustments |  [optional] |
|**weightedOrderAdjustment** | **Double** | Order Level Manual Adjustment applied to this Item |  [optional] |
|**weightedOrderDiscount** | **Double** | Order Level Discount applied to this Item |  [optional] |
|**adjustedLineItemSubtotal** | **Double** | Order Level taxable sub total |  [optional] |
|**totalWithoutWeightedShippingAndHandling** | **Double** | Taxable Subtotal including Weighted Order amounts |  [optional] |
|**weightedOrderTax** | **Double** | Order Level tax applied to this Item |  [optional] |
|**weightedOrderShipping** | **Double** | Order Level Shipping applied to this Item |  [optional] |
|**weightedOrderShippingDiscount** | **Double** | Order Level Shipping discount applied to this Item |  [optional] |
|**weightedOrderShippingManualAdjustment** | **Double** | Order Level Shipping Manual Adjustment applied to this Item |  [optional] |
|**weightedOrderShippingTax** | **Double** | Order Level Shipping Tax applied to this Item |  [optional] |
|**weightedOrderHandlingFee** | **Double** | Order Level handling fee applied to this item |  [optional] |
|**weightedOrderHandlingFeeTax** | **Double** | Order Level handling fee tax applied to this item |  [optional] |
|**weightedOrderHandlingFeeDiscount** | **Double** | Order Level handling fee discount applied to this item |  [optional] |
|**weightedOrderDuty** | **Double** | Order Level Duty applied to this Item |  [optional] |
|**totalWithWeightedShippingAndHandling** | **Double** | Line item total with line item, Tax, Weighted Tax with Weighted shipping and handling costs |  [optional] |
|**weightedOrderHandlingAdjustment** | **Double** | Order level handling adjusment that applies to this item. |  [optional] |
|**autoAddDiscountId** | **Integer** | Track the discoutid from which the item was auto added |  [optional] |
|**isAssemblyRequired** | **Boolean** | Assembly Required for this order item |  [optional] |
|**childItemIds** | **List&lt;String&gt;** | List of Child Item Ids for this order item |  [optional] |
|**parentItemId** | **String** | Indicates Parent Item Id for this order item |  [optional] |
|**inventoryTags** | [**List&lt;InventoryTags&gt;**](InventoryTags.md) |  |  [optional] |
|**lineItemAdjustment** | **Double** |  |  [optional] |


## Implemented Interfaces

* Serializable


