

# Quote


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier. |  [optional] |
|**name** | **String** | Name of the quote |  [optional] |
|**siteId** | **Integer** | Unique identifier of the Site. |  [optional] |
|**tenantId** | **Integer** | Unique identifier of the Tenant. |  [optional] |
|**number** | **Integer** | Auto generated number that is assigned to the quote when creation. |  [optional] |
|**submittedDate** | **OffsetDateTime** | When the customer placed (submitted) the Quote. |  [optional] |
|**items** | [**List&lt;CommerceRuntimeOrderItem&gt;**](CommerceRuntimeOrderItem.md) | List of items in the Quote. |  [optional] |
|**auditHistory** | [**List&lt;AuditRecord&gt;**](AuditRecord.md) | User modified Audit History |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**comments** | [**List&lt;QuoteComment&gt;**](QuoteComment.md) | Comments on a quote |  [optional] |
|**expirationDate** | **OffsetDateTime** | When the quote will no longer be active. That is, the quote is considered abandoned.   Date in UTC Date/Time. |  [optional] |
|**fulfillmentInfo** | [**FulfillmentInfo**](FulfillmentInfo.md) |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**customerAccountId** | **Integer** | Unique identifier of the customer account. |  [optional] |
|**email** | **String** | Email address for checkout |  [optional] |
|**customerTaxId** | **String** | The customers tax ID. If Customer Account ID exists in the system, will set this. |  [optional] [readonly] |
|**isTaxExempt** | **Boolean** | Unique identifier of the customer account. |  [optional] [readonly] |
|**currencyCode** | **String** | ISO Currency Code. |  [optional] |
|**priceListCode** | **String** | Pricelist code for the checkout |  [optional] |
|**data** | **Object** | Custom data for a given vendor set within the commerce process. |  [optional] |
|**taxData** | **Object** | Storage for any additional/custom tax data. |  [optional] |
|**channelCode** | **String** | Unique identifier of the channel for this item. |  [optional] |
|**locationCode** | **String** | Identifies the location at which the order was placed if the order was placed externally. |  [optional] |
|**ipAddress** | **String** | IP address of the user placing the order. (User or customer?) |  [optional] |
|**sourceDevice** | **String** | Source device of the user placing the order. (User or customer?) |  [optional] |
|**visitId** | **String** | Identifies the Visit ID that was current when the order was placed or when the cart was last updated. |  [optional] |
|**webSessionId** | **String** | Identifies the web session used to place the order or last update the cart. |  [optional] |
|**customerInteractionType** | **String** | Determines the interaction type that a customer will use to create this object.  Valid values are: Website, Store, Call, Unknown |  [optional] |
|**orderDiscounts** | [**List&lt;CommerceRuntimeAppliedDiscount&gt;**](CommerceRuntimeAppliedDiscount.md) |  |  [optional] |
|**subTotal** | **Double** | Subtotal before any coupon codes, taxes, fees, etc. |  [optional] |
|**itemLevelProductDiscountTotal** | **Double** | The total value of item-level product discounts. |  [optional] |
|**orderLevelProductDiscountTotal** | **Double** | The total value of order-level (group-level) product discounts. |  [optional] |
|**itemTaxTotal** | **Double** | Total tax on products. |  [optional] |
|**adjustment** | [**Adjustment**](Adjustment.md) |  |  [optional] |
|**itemTotal** | **Double** | The total product cost, accounting for discounts and tax. |  [optional] |
|**total** | **Double** | Final total |  [optional] |
|**shippingDiscounts** | [**List&lt;ShippingDiscount&gt;**](ShippingDiscount.md) |  |  [optional] |
|**itemLevelShippingDiscountTotal** | **Double** |  |  [optional] |
|**orderLevelShippingDiscountTotal** | **Double** |  |  [optional] |
|**shippingAmount** | **Double** |  |  [optional] |
|**shippingAdjustment** | [**Adjustment**](Adjustment.md) |  |  [optional] |
|**shippingSubTotal** | **Double** |  |  [optional] |
|**shippingTax** | **Double** |  |  [optional] |
|**shippingTaxTotal** | **Double** |  |  [optional] |
|**shippingTotal** | **Double** |  |  [optional] |
|**handlingDiscounts** | [**List&lt;CommerceRuntimeAppliedDiscount&gt;**](CommerceRuntimeAppliedDiscount.md) |  |  [optional] |
|**itemLevelHandlingDiscountTotal** | **Double** |  |  [optional] |
|**orderLevelHandlingDiscountTotal** | **Double** |  |  [optional] |
|**handlingAmount** | **Double** |  |  [optional] |
|**handlingAdjustment** | [**Adjustment**](Adjustment.md) |  |  [optional] |
|**handlingSubTotal** | **Double** |  |  [optional] |
|**handlingTax** | **Double** |  |  [optional] |
|**handlingTaxTotal** | **Double** |  |  [optional] |
|**handlingTotal** | **Double** |  |  [optional] |
|**dutyAmount** | **Double** |  |  [optional] |
|**dutyTotal** | **Double** |  |  [optional] |
|**feeTotal** | **Double** |  |  [optional] |
|**isDraft** | **Boolean** | Is this quote a draft |  [optional] |
|**hasDraft** | **Boolean** | Does this quote have a draft |  [optional] |
|**status** | **String** |  |  [optional] |
|**couponCodes** | **List&lt;String&gt;** | Coupon codes associated with this Quote. |  [optional] |
|**invalidCoupons** | [**List&lt;InvalidCoupon&gt;**](InvalidCoupon.md) | A list of invalid coupons that were attempted on the quote |  [optional] |


## Implemented Interfaces

* Serializable


