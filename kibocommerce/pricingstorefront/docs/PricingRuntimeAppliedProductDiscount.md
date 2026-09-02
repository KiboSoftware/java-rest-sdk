

# PricingRuntimeAppliedProductDiscount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**couponCode** | **String** | Code of the coupon associated with the discount (if a coupon code is required in order to receive the discount). |  [optional] |
|**couponSetId** | **Integer** | Contains coupon set id if there is one |  [optional] |
|**discount** | [**PricingRuntimeDiscount2**](PricingRuntimeDiscount2.md) |  |  [optional] |
|**impact** | **Double** | Value of the discount, that is how much the shopper saves if discount is applied. |  [optional] |
|**appliesToSalePrice** | **Boolean** | Indicates that this discount is to be applied to the sale price if true or the list price if false. This only applies to product and line item discounts. |  [optional] |
|**normalizedImpact** | **Double** | The impact of the discount normalized against the sale price if there is one. |  [optional] |


## Implemented Interfaces

* Serializable


