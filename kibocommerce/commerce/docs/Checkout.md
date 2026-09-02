

# Checkout


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptsMarketing** | **Boolean** | Does the customer accept marketing |  [optional] |
|**alternateContact** | [**AlternateContact**](AlternateContact.md) |  |  [optional] |
|**amountRemainingForPayment** | **Double** | A counter for how much of the total has not been claimed by payments. This is computed by Total - (sum of Payments where State is not Voided/Declined) |  [optional] |
|**attributes** | [**List&lt;CommerceRuntimeOrderAttribute&gt;**](CommerceRuntimeOrderAttribute.md) |  |  [optional] |
|**auditInfo** | [**CoreApiContractsAuditInfo**](CoreApiContractsAuditInfo.md) |  |  [optional] |
|**availableActions** | **List&lt;String&gt;** |  |  [optional] |
|**channelCode** | **String** | Unique identifier of the channel for this item. |  [optional] |
|**couponCodes** | **List&lt;String&gt;** | Coupon codes associated with this order. |  [optional] |
|**currencyCode** | **String** | ISO Currency Code. |  [optional] |
|**customerAccountId** | **Integer** | Unique identifier of the customer account. |  [optional] |
|**customerInteractionType** | **String** | Determines the interaction type that a customer will use to create this object. Valid values are: Website, Store, Call, Unknown |  [optional] |
|**customerTaxId** | **String** | The customers tax ID. If Customer Account ID exists in the system, will set this. |  [optional] [readonly] |
|**data** | **Object** | Custom data for a given vendor set within the commerce process. |  [optional] |
|**destinations** | [**List&lt;CommerceRuntimeDestination&gt;**](CommerceRuntimeDestination.md) |  |  [optional] |
|**discountThresholdMessages** | [**List&lt;ThresholdMessage&gt;**](ThresholdMessage.md) | List of Mozu.CommerceRuntime.Contracts.Commerce.ThresholdMessage objects that are valid for the current value of the cart/order. |  [optional] |
|**dutyTotal** | **Double** | Total duty fees |  [optional] |
|**email** | **String** | Email address for checkout |  [optional] |
|**feeTotal** | **Double** | Total Fees |  [optional] |
|**groupings** | [**List&lt;CheckoutGrouping&gt;**](CheckoutGrouping.md) | List of checkout grouping. |  [optional] |
|**handlingSubTotal** | **Double** | Pre-Discounted Handling Subtotal of the CommerceAggregate and its Items. Returns &#x60;null&#x60; if the calculated value is negative. |  [optional] |
|**handlingTaxTotal** | **Double** | Total tax on handling. |  [optional] |
|**handlingTotal** | **Double** | Overall handling total, accounting for line and order-level handling costs, any handling discounts, and handling tax. |  [optional] |
|**id** | **String** | Unique identifier. |  [optional] |
|**invalidCoupons** | [**List&lt;InvalidCoupon&gt;**](InvalidCoupon.md) | A list of invalid coupons that were attempted on the order. |  [optional] |
|**ipAddress** | **String** | IP address of the user placing the order. (User or customer?) |  [optional] |
|**isTaxExempt** | **Boolean** | Unique identifier of the customer account. |  [optional] [readonly] |
|**itemLevelHandlingDiscountTotal** | **Double** | The total value of item-level handling discounts. |  [optional] |
|**itemLevelProductDiscountTotal** | **Double** | The total value of item-level product discounts. |  [optional] |
|**itemLevelShippingDiscountTotal** | **Double** | The total value of item-level shipping discounts. |  [optional] |
|**itemTaxTotal** | **Double** | Total tax on products. |  [optional] |
|**itemTotal** | **Double** | The total product cost, accounting for discounts and tax. |  [optional] |
|**items** | [**List&lt;OrderItem&gt;**](OrderItem.md) | List of items in the checkout. |  [optional] |
|**locationCode** | **String** | Identifies the location at which the order was placed if the order was placed externally. |  [optional] |
|**number** | **Integer** | A checkout number that is only assigned after the checkout is placed. |  [optional] |
|**orderDiscounts** | [**List&lt;CommerceRuntimeAppliedDiscount&gt;**](CommerceRuntimeAppliedDiscount.md) |  |  [optional] |
|**orderLevelHandlingDiscountTotal** | **Double** | The total value of order-level (group-level) handling discounts. |  [optional] |
|**orderLevelProductDiscountTotal** | **Double** | The total value of order-level (group-level) product discounts. |  [optional] |
|**orderLevelShippingDiscountTotal** | **Double** | The total value of order-level (group-level) shipping discounts. |  [optional] |
|**originalCartId** | **String** | Unique identifier for the cart that was converted to checkout. |  [optional] |
|**payments** | [**List&lt;Payment&gt;**](Payment.md) | Payment transaction associated with this checkout. It is the entire payment interchange between the merchant  who is forwarding the customer&#39;s payment information and the payment service who is authorizing and  capturing payment. Payment can be either by credit card, check, or PayPal. |  [optional] |
|**priceListCode** | **String** | Pricelist code for the checkout |  [optional] |
|**shippingSubTotal** | **Double** | Shipping does not appear on cart. |  [optional] |
|**shippingTaxTotal** | **Double** | Total tax on shipping. |  [optional] |
|**shippingTotal** | **Double** | Overall shipping total, accounting for item and order-level shipping costs, any shipping discounts, and shipping tax. |  [optional] |
|**shopperNotes** | [**ShopperNotes**](ShopperNotes.md) |  |  [optional] |
|**siteId** | **Integer** | Unique identifier of the Site. |  [optional] |
|**sourceDevice** | **String** | Source device of the user placing the order. (User or customer?) |  [optional] |
|**subTotal** | **Double** | Subtotal before any coupon codes, taxes, fees, etc. |  [optional] |
|**submittedDate** | **OffsetDateTime** | When the customer placed (submitted) the order. |  [optional] |
|**suggestedDiscounts** | [**List&lt;SuggestedDiscount&gt;**](SuggestedDiscount.md) |  |  [optional] |
|**taxData** | **Object** | Storage for any additional/custom tax data. |  [optional] |
|**tenantId** | **Integer** | Unique identifier of the Tenant. |  [optional] |
|**total** | **Double** | Final total |  [optional] |
|**type** | **String** | Is this Order Online or Offline? Online means shopper entered at checkout, offline means a phone order. |  [optional] |
|**visitId** | **String** | Identifies the Visit ID that was current when the order was placed or when the cart was last updated. |  [optional] |
|**webSessionId** | **String** | Identifies the web session used to place the order or last update the cart. |  [optional] |


## Implemented Interfaces

* Serializable


