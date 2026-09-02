

# PricingRuntimeAppliedDiscount

Details of the applied discount, including how much the shopper saves if the discount is applied and the coupon code required to redeem the discount, if any.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**couponCode** | **String** | Code of the coupon associated with the discount (if a coupon code is required in order to receive the discount). |  [optional] |
|**couponSetId** | **Integer** | Contains coupon set id if there is one |  [optional] |
|**discount** | [**PricingRuntimeDiscount2**](PricingRuntimeDiscount2.md) |  |  [optional] |
|**impact** | **Double** | Value of the discount, that is how much the shopper saves if discount is applied. |  [optional] |


## Implemented Interfaces

* Serializable


