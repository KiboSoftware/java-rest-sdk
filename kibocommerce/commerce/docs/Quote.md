

# Quote


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adjustment** | [**Adjustment**](Adjustment.md) |  |  [optional] |
|**auditHistory** | [**List&lt;AuditRecord&gt;**](AuditRecord.md) | User modified Audit History |  [optional] |
|**auditInfo** | [**CoreApiContractsAuditInfo**](CoreApiContractsAuditInfo.md) |  |  [optional] |
|**channelCode** | **String** | Unique identifier of the channel for this item. |  [optional] |
|**comments** | [**List&lt;QuoteComment&gt;**](QuoteComment.md) | Comments on a quote |  [optional] |
|**couponCodes** | **List&lt;String&gt;** | Coupon codes associated with this Quote. |  [optional] |
|**currencyCode** | **String** | ISO Currency Code. |  [optional] |
|**customerAccountId** | **Integer** | Unique identifier of the customer account. |  [optional] |
|**customerInteractionType** | **String** | Determines the interaction type that a customer will use to create this object. Valid values are: Website, Store, Call, Unknown |  [optional] |
|**customerTaxId** | **String** | The customers tax ID. If Customer Account ID exists in the system, will set this. |  [optional] [readonly] |
|**data** | **Object** | Custom data for a given vendor set within the commerce process. |  [optional] |
|**dutyAmount** | **Double** |  |  [optional] |
|**dutyTotal** | **Double** |  |  [optional] |
|**email** | **String** | Email address for checkout |  [optional] |
|**expirationDate** | **OffsetDateTime** | When the quote will no longer be active. That is, the quote is considered abandoned.  Date in UTC Date/Time. |  [optional] |
|**feeTotal** | **Double** |  |  [optional] |
|**fulfillmentInfo** | [**FulfillmentInfo**](FulfillmentInfo.md) |  |  [optional] |
|**handlingAdjustment** | [**Adjustment**](Adjustment.md) |  |  [optional] |
|**handlingAmount** | **Double** |  |  [optional] |
|**handlingDiscounts** | [**List&lt;CommerceRuntimeAppliedDiscount&gt;**](CommerceRuntimeAppliedDiscount.md) |  |  [optional] |
|**handlingSubTotal** | **Double** |  |  [optional] |
|**handlingTax** | **Double** |  |  [optional] |
|**handlingTaxTotal** | **Double** |  |  [optional] |
|**handlingTotal** | **Double** |  |  [optional] |
|**hasDraft** | **Boolean** | Does this quote have a draft |  [optional] |
|**id** | **String** | Unique identifier. |  [optional] |
|**invalidCoupons** | [**List&lt;InvalidCoupon&gt;**](InvalidCoupon.md) | A list of invalid coupons that were attempted on the quote |  [optional] |
|**ipAddress** | **String** | IP address of the user placing the order. (User or customer?) |  [optional] |
|**isDraft** | **Boolean** | Is this quote a draft |  [optional] |
|**isTaxExempt** | **Boolean** | Unique identifier of the customer account. |  [optional] [readonly] |
|**itemLevelHandlingDiscountTotal** | **Double** |  |  [optional] |
|**itemLevelProductDiscountTotal** | **Double** | The total value of item-level product discounts. |  [optional] |
|**itemLevelShippingDiscountTotal** | **Double** |  |  [optional] |
|**itemTaxTotal** | **Double** | Total tax on products. |  [optional] |
|**itemTotal** | **Double** | The total product cost, accounting for discounts and tax. |  [optional] |
|**items** | [**List&lt;OrderItem&gt;**](OrderItem.md) | List of items in the Quote. |  [optional] |
|**locationCode** | **String** | Identifies the location at which the order was placed if the order was placed externally. |  [optional] |
|**name** | **String** | Name of the quote |  [optional] |
|**number** | **Integer** | Auto generated number that is assigned to the quote when creation. |  [optional] |
|**orderDiscounts** | [**List&lt;CommerceRuntimeAppliedDiscount&gt;**](CommerceRuntimeAppliedDiscount.md) |  |  [optional] |
|**orderLevelHandlingDiscountTotal** | **Double** |  |  [optional] |
|**orderLevelProductDiscountTotal** | **Double** | The total value of order-level (group-level) product discounts. |  [optional] |
|**orderLevelShippingDiscountTotal** | **Double** |  |  [optional] |
|**priceListCode** | **String** | Pricelist code for the checkout |  [optional] |
|**shippingAdjustment** | [**Adjustment**](Adjustment.md) |  |  [optional] |
|**shippingAmount** | **Double** |  |  [optional] |
|**shippingDiscounts** | [**List&lt;ShippingDiscount&gt;**](ShippingDiscount.md) |  |  [optional] |
|**shippingSubTotal** | **Double** |  |  [optional] |
|**shippingTax** | **Double** |  |  [optional] |
|**shippingTaxTotal** | **Double** |  |  [optional] |
|**shippingTotal** | **Double** |  |  [optional] |
|**siteId** | **Integer** | Unique identifier of the Site. |  [optional] |
|**sourceDevice** | **String** | Source device of the user placing the order. (User or customer?) |  [optional] |
|**status** | **String** |  |  [optional] |
|**subTotal** | **Double** | Subtotal before any coupon codes, taxes, fees, etc. |  [optional] |
|**submittedDate** | **OffsetDateTime** | When the customer placed (submitted) the Quote. |  [optional] |
|**taxData** | **Object** | Storage for any additional/custom tax data. |  [optional] |
|**tenantId** | **Integer** | Unique identifier of the Tenant. |  [optional] |
|**total** | **Double** | Final total |  [optional] |
|**userId** | **String** |  |  [optional] |
|**visitId** | **String** | Identifies the Visit ID that was current when the order was placed or when the cart was last updated. |  [optional] |
|**webSessionId** | **String** | Identifies the web session used to place the order or last update the cart. |  [optional] |


## Implemented Interfaces

* Serializable


