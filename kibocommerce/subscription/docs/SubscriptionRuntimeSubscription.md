

# SubscriptionRuntimeSubscription


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier. |  [optional] |
|**siteId** | **Integer** | Unique identifier of the Site. |  [optional] |
|**tenantId** | **Integer** | Unique identifier of the Tenant. |  [optional] |
|**number** | **Integer** | Subscription number. |  [optional] |
|**parentOrderId** | **String** | The parent order id from which the subscription was created. |  [optional] |
|**items** | [**List&lt;SubscriptionItem&gt;**](SubscriptionItem.md) | List of items in the Subscription. |  [optional] |
|**payment** | [**Payment**](Payment.md) |  |  [optional] |
|**priceListCode** | **String** | Price-list code for the Subscription |  [optional] |
|**notes** | [**List&lt;OrderNote&gt;**](OrderNote.md) | Notes |  [optional] |
|**oneTimeCouponCodes** | **List&lt;String&gt;** | One-time coupon to the subscription. This coupon will fall off after the next continuity order is created. |  [optional] |
|**changeMessages** | [**List&lt;CommerceRuntimeChangeMessage&gt;**](CommerceRuntimeChangeMessage.md) | Change Messages |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**fulfillmentInfo** | [**FulfillmentInfo**](FulfillmentInfo.md) |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**customerAccountId** | **Integer** | Unique identifier of the customer account. |  [optional] |
|**email** | **String** | Email address for checkout |  [optional] |
|**customerTaxId** | **String** | The customers tax ID. If Customer Account ID exists in the system, will set this. |  [optional] [readonly] |
|**isTaxExempt** | **Boolean** | Unique identifier of the customer account. |  [optional] [readonly] |
|**currencyCode** | **String** | ISO Currency Code. |  [optional] |
|**data** | **Object** | Custom data for a given vendor set within the commerce process. |  [optional] |
|**taxData** | **Object** | Storage for any additional/custom tax data. |  [optional] |
|**channelCode** | **String** | Unique identifier of the channel for this item. |  [optional] |
|**locationCode** | **String** | Identifies the location at which the order was placed if the order was placed externally. |  [optional] |
|**ipAddress** | **String** | IP address of the user placing the order. (User or customer?) |  [optional] |
|**sourceDevice** | **String** | Source device of the user placing the order. (User or customer?) |  [optional] |
|**visitId** | **String** | Identifies the Visit ID that was current when the order was placed or when the cart was last updated. |  [optional] |
|**webSessionId** | **String** | Identifies the web session used to place the order or last update the cart. |  [optional] |
|**customerInteractionType** | **String** | Determines the interaction type that a customer will use to create this object.  Valid values are: Website, Store, Call, Unknown |  [optional] |
|**frequency** | [**Frequency**](Frequency.md) |  |  [optional] |
|**previousFrequency** | [**Frequency**](Frequency.md) |  |  [optional] |
|**frequencyAuditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**nextOrderDate** | **OffsetDateTime** |  |  [optional] |
|**previousNextOrderDate** | **OffsetDateTime** |  |  [optional] |
|**nextOrderDateAuditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**lastContinuityOrderDateOnSubPaused** | **OffsetDateTime** |  |  [optional] |
|**ordinal** | **Integer** |  |  [optional] |
|**paymentErrorCode** | **String** |  |  [optional] |
|**trial** | [**Trial**](Trial.md) |  |  [optional] |
|**orderDiscounts** | [**List&lt;CommerceRuntimeAppliedDiscount&gt;**](CommerceRuntimeAppliedDiscount.md) |  |  [optional] |
|**subTotal** | **Double** | Subtotal before any coupon codes, taxes, fees, etc. |  [optional] |
|**itemLevelProductDiscountTotal** | **Double** | The total value of item-level product discounts. |  [optional] |
|**itemLevelAdjustmentsTotal** | **Double** | The total value of all line item adjustments |  [optional] |
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
|**status** | **String** |  |  [optional] |
|**reasons** | [**List&lt;SubscriptionReason&gt;**](SubscriptionReason.md) |  |  [optional] |
|**couponCodes** | **List&lt;String&gt;** | Coupon codes associated with this Subscription. |  [optional] |
|**invalidCoupons** | [**List&lt;InvalidCoupon&gt;**](InvalidCoupon.md) | A list of invalid coupons that were attempted on the Subscription |  [optional] |
|**isImport** | **Boolean** |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**lineItemSubtotalWithOrderAdjustments** | **Double** | Line Item Subtotals with Order Adjustments |  [optional] |
|**discountedSubtotal** | **Double** | Discounted Subtotal |  [optional] |
|**onetimeProducts** | [**List&lt;OnetimeProduct&gt;**](OnetimeProduct.md) |  |  [optional] |
|**onetimeShippingMethod** | [**OnetimeShippingMethod**](OnetimeShippingMethod.md) |  |  [optional] |
|**nextOrderDateOffsetCounter** | **Integer** | counter to keep track of nextOrderDate limit. |  [optional] |
|**subscriptionSkipCounter** | **Integer** | counter to keep track of skip limit |  [optional] |
|**isDraft** | **Boolean** | Is this subscription a draft version |  [optional] |
|**hasDraft** | **Boolean** | Does this subscription have a draft version. |  [optional] |
|**isPartialDraft** | **Boolean** | Is this subscription draft is a partial draft. |  [optional] |
|**isOrderReminderEmailSent** | **Boolean** | Has order reminder email sent. |  [optional] |
|**isReactivationReminderEmailSent** | **Boolean** | Has reactivation reminder email sent. |  [optional] |
|**reactivationDate** | **OffsetDateTime** | This property is being used for reactivation email templete |  [optional] |
|**subscriptionPauseDate** | **OffsetDateTime** |  |  [optional] |


## Implemented Interfaces

* Serializable


