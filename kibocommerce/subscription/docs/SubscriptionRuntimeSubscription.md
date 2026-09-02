

# SubscriptionRuntimeSubscription


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adjustment** | [**Adjustment**](Adjustment.md) |  |  [optional] |
|**attributes** | [**List&lt;SubscriptionAttribute&gt;**](SubscriptionAttribute.md) |  |  [optional] |
|**auditInfo** | [**CoreApiContractsAuditInfo**](CoreApiContractsAuditInfo.md) |  |  [optional] |
|**changeMessages** | [**List&lt;CommerceRuntimeChangeMessage&gt;**](CommerceRuntimeChangeMessage.md) | Change Messages |  [optional] |
|**channelCode** | **String** | Unique identifier of the channel for this item. |  [optional] |
|**couponCodes** | **List&lt;String&gt;** | Coupon codes associated with this Subscription. |  [optional] |
|**currencyCode** | **String** | ISO Currency Code. |  [optional] |
|**customerAccountId** | **Integer** | Unique identifier of the customer account. |  [optional] |
|**customerInteractionType** | **String** | Determines the interaction type that a customer will use to create this object. Valid values are: Website, Store, Call, Unknown |  [optional] |
|**customerTaxId** | **String** | The customers tax ID. If Customer Account ID exists in the system, will set this. |  [optional] [readonly] |
|**data** | **Object** | Custom data for a given vendor set within the commerce process. |  [optional] |
|**discountedSubtotal** | **Double** | Discounted Subtotal |  [optional] |
|**dutyAmount** | **Double** |  |  [optional] |
|**dutyTotal** | **Double** |  |  [optional] |
|**email** | **String** | Email address for checkout |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**feeTotal** | **Double** |  |  [optional] |
|**frequency** | [**Frequency**](Frequency.md) |  |  [optional] |
|**frequencyAuditInfo** | [**CoreApiContractsAuditInfo**](CoreApiContractsAuditInfo.md) |  |  [optional] |
|**fulfillmentInfo** | [**FulfillmentInfo**](FulfillmentInfo.md) |  |  [optional] |
|**handlingAdjustment** | [**Adjustment**](Adjustment.md) |  |  [optional] |
|**handlingAmount** | **Double** |  |  [optional] |
|**handlingDiscounts** | [**List&lt;CommerceRuntimeAppliedDiscount&gt;**](CommerceRuntimeAppliedDiscount.md) |  |  [optional] |
|**handlingSubTotal** | **Double** |  |  [optional] |
|**handlingTax** | **Double** |  |  [optional] |
|**handlingTaxTotal** | **Double** |  |  [optional] |
|**handlingTotal** | **Double** |  |  [optional] |
|**hasDraft** | **Boolean** | Does this subscription have a draft version. |  [optional] |
|**id** | **String** | Unique identifier. |  [optional] |
|**invalidCoupons** | [**List&lt;InvalidCoupon&gt;**](InvalidCoupon.md) | A list of invalid coupons that were attempted on the Subscription |  [optional] |
|**ipAddress** | **String** | IP address of the user placing the order. (User or customer?) |  [optional] |
|**isDraft** | **Boolean** | Is this subscription a draft version |  [optional] |
|**isImport** | **Boolean** |  |  [optional] |
|**isOrderReminderEmailSent** | **Boolean** | Has order reminder email sent. |  [optional] |
|**isPartialDraft** | **Boolean** | Is this subscription draft is a partial draft. |  [optional] |
|**isReactivationReminderEmailSent** | **Boolean** | Has reactivation reminder email sent. |  [optional] |
|**isTaxExempt** | **Boolean** | Unique identifier of the customer account. |  [optional] [readonly] |
|**itemLevelAdjustmentsTotal** | **Double** | The total value of all line item adjustments |  [optional] |
|**itemLevelHandlingDiscountTotal** | **Double** |  |  [optional] |
|**itemLevelProductDiscountTotal** | **Double** | The total value of item-level product discounts. |  [optional] |
|**itemLevelShippingDiscountTotal** | **Double** |  |  [optional] |
|**itemTaxTotal** | **Double** | Total tax on products. |  [optional] |
|**itemTotal** | **Double** | The total product cost, accounting for discounts and tax. |  [optional] |
|**items** | [**List&lt;SubscriptionItem&gt;**](SubscriptionItem.md) | List of items in the Subscription. |  [optional] |
|**lastContinuityOrderDateOnSubPaused** | **OffsetDateTime** |  |  [optional] |
|**lastOrderNowDate** | **OffsetDateTime** | Indicate when \&quot;order now\&quot; and \&quot;partial order now\&quot; performed last time. |  [optional] |
|**lineItemSubtotalWithOrderAdjustments** | **Double** | Line Item Subtotals with Order Adjustments |  [optional] |
|**locationCode** | **String** | Identifies the location at which the order was placed if the order was placed externally. |  [optional] |
|**nextOrderDate** | **OffsetDateTime** |  |  [optional] |
|**nextOrderDateAuditInfo** | [**CoreApiContractsAuditInfo**](CoreApiContractsAuditInfo.md) |  |  [optional] |
|**nextOrderDateOffsetCounter** | **Integer** | counter to keep track of nextOrderDate limit. |  [optional] |
|**notes** | [**List&lt;OrderNote&gt;**](OrderNote.md) | Notes |  [optional] |
|**number** | **Integer** | Subscription number. |  [optional] |
|**orderDiscounts** | [**List&lt;CommerceRuntimeAppliedDiscount&gt;**](CommerceRuntimeAppliedDiscount.md) |  |  [optional] |
|**orderLevelHandlingDiscountTotal** | **Double** |  |  [optional] |
|**orderLevelProductDiscountTotal** | **Double** | The total value of order-level (group-level) product discounts. |  [optional] |
|**orderLevelShippingDiscountTotal** | **Double** |  |  [optional] |
|**ordinal** | **Integer** |  |  [optional] |
|**parentOrderId** | **String** | The parent order id from which the subscription was created. |  [optional] |
|**pauseDate** | **OffsetDateTime** |  |  [optional] |
|**payment** | [**Payment**](Payment.md) |  |  [optional] |
|**paymentErrorCode** | **String** |  |  [optional] |
|**previousFrequency** | [**Frequency**](Frequency.md) |  |  [optional] |
|**previousNextOrderDate** | **OffsetDateTime** |  |  [optional] |
|**priceListCode** | **String** | Price-list code for the Subscription |  [optional] |
|**processingErrorMessage** | **String** | LastErrorMessage from subscription ProcessingInfo. |  [optional] |
|**reactivationDate** | **OffsetDateTime** | This property is being used for reactivation email templete |  [optional] |
|**reasons** | [**List&lt;SubscriptionReason&gt;**](SubscriptionReason.md) |  |  [optional] |
|**shippingAdjustment** | [**Adjustment**](Adjustment.md) |  |  [optional] |
|**shippingAmount** | **Double** |  |  [optional] |
|**shippingDiscounts** | [**List&lt;ShippingDiscount&gt;**](ShippingDiscount.md) |  |  [optional] |
|**shippingSubTotal** | **Double** |  |  [optional] |
|**shippingTax** | **Double** |  |  [optional] |
|**shippingTaxTotal** | **Double** |  |  [optional] |
|**shippingTotal** | **Double** |  |  [optional] |
|**siteId** | **Integer** | Unique identifier of the Site. |  [optional] |
|**skipCounter** | **Integer** | counter to keep track of skip limit |  [optional] |
|**sourceDevice** | **String** | Source device of the user placing the order. (User or customer?) |  [optional] |
|**status** | **String** |  |  [optional] |
|**subTotal** | **Double** | Subtotal before any coupon codes, taxes, fees, etc. |  [optional] |
|**taxData** | **Object** | Storage for any additional/custom tax data. |  [optional] |
|**tenantId** | **Integer** | Unique identifier of the Tenant. |  [optional] |
|**total** | **Double** | Final total |  [optional] |
|**trial** | [**Trial**](Trial.md) |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**visitId** | **String** | Identifies the Visit ID that was current when the order was placed or when the cart was last updated. |  [optional] |
|**webSessionId** | **String** | Identifies the web session used to place the order or last update the cart. |  [optional] |


## Implemented Interfaces

* Serializable


