

# CommerceAggregate

Base class for cart and order

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
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


