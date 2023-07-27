

# OrderProcessingSettings

Order processing (credit card payment authorization) setting defined for this site.   Can choose when the shopper’s credit card is authorized and charged. Possibilities include, \"authorize and charge the shopper's credit card for the full   order amount when the order is placed,\" \"authorize the shopper's credit card for the full amount when the order is placed and charge the credit card when the order is shipped,\" or   \"authorize and charge the shopper's credit card for the full amount when the order is shipped.\"

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentProcessingFlowType** | **String** | Credit card payment authorization setting. Options can be authorize and charge the shopper&#39;s credit card when the order is placed, \&quot;AuthorizeAndCaptureOnOrderPlacement,\&quot;   authorize the shopper&#39;s credit card when the order is placed and charge the credit card when the shipped, \&quot;AuthorizeOnOrderPlacementAndCaptureOnOrderShipment,\&quot;   or authorize and charge the shopper&#39;s credit card for the full amount when the order is shipped, \&quot;AuthorizeAndCaptureOnOrderShipment.\&quot; |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**useOverridePriceToCalculateDiscounts** | **Boolean** | Use the override price on products to calculate discounts |  [optional] |
|**abandonedOrderThresholdInMinutes** | **Integer** | Abandoned Order Threshold in minutes indicates the number of minutes until a pending order is considered abandoned. |  [optional] |
|**giftCardProcessingType** | **String** | Gift card payment authorization setting. Options can be authorize and charge the shopper&#39;s credit card when the order is placed, \&quot;AuthorizeAndCaptureOnOrderPlacement,\&quot;   authorize the shopper&#39;s gift card when the order is placed and charge the gift card when it is shipped, \&quot;AuthorizeOnOrderPlacementAndCaptureOnOrderShipment,\&quot;   or authorize and charge the shopper&#39;s gift card for the full amount when the order is shipped, \&quot;AuthorizeAndCaptureOnOrderShipment.\&quot; |  [optional] |
|**giftCardRefundCreditProcessingType** | **String** | GiftCrd Refund/Credit flow, wither to existing or new giftcard |  [optional] |
|**thirdPartyPaymentSettings** | [**List&lt;ThirdPartyPaymentSetting&gt;**](ThirdPartyPaymentSetting.md) | Order processing settings for Third party payments  Ex- ApplePay using AuthorizeOnOrderPlacementAndCaptureOnOrderShipment for processing orders |  [optional] |


## Implemented Interfaces

* Serializable


