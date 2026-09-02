

# AppliedLineItemDiscount

Details of the discount applied to a product.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**couponCode** | **String** | Code of the coupon associated with the discount (if a coupon code is required in order to receive the discount). |  [optional] |
|**couponSetId** | **Integer** | Contains coupon set id if there is one |  [optional] |
|**discount** | [**PricingRuntimeDiscount2**](PricingRuntimeDiscount2.md) |  |  [optional] |
|**impact** | **Double** | Value of the discount, that is how much the shopper saves if discount is applied. |  [optional] |
|**impactPerUnit** | **Double** | Discount impact per unit for the quantity applied. This value is not rounded. ImpactPerUnit * Quantity &#x3D; Impact @ Quantity |  [optional] |
|**isForced** | **Boolean** | Signifies that the discount is forced and not applied via best match. |  [optional] |
|**normalizedImpact** | **Double** |  |  [optional] |
|**quantity** | **Integer** | Quantity of items from the line item that the discount applies to. |  [optional] |


## Implemented Interfaces

* Serializable


