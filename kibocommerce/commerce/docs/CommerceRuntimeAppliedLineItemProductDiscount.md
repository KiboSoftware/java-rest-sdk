

# CommerceRuntimeAppliedLineItemProductDiscount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appliesToSalePrice** | **Boolean** | Determines if the discount applies to the sale price of the order |  [optional] |
|**discountQuantity** | **Integer** | The number of the line item that can be used for this particular discount. |  [optional] |
|**impact** | **Double** | Value of the discount applied. This is a negative number to be subtracted from the original price to get the final price. |  [optional] |
|**discount** | [**CommerceRuntimeDiscount**](CommerceRuntimeDiscount.md) |  |  [optional] |
|**couponCode** | **String** | Code of the coupon associated with the discount if a coupon code is required to get the discount. |  [optional] |
|**excluded** | **Boolean** | Determines whether or not this discount is set up to be ignored by the pricing runtime. |  [optional] |


## Implemented Interfaces

* Serializable


