

# AppliedProductDiscount

Details of the discount applied to a product.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productQuantity** | **Integer** | Quantity of products priced. This is always one unless calculating pricing on the order or cart. |  [optional] |
|**impactPerUnit** | **Double** | Impact for a quantity of one product; that is, the value of the discount for one product. |  [optional] |
|**appliesToSalePrice** | **Boolean** | Determines if the discount applies to the sale price of the order |  [optional] |
|**impact** | **Double** | Value of the discount applied. This is a negative number to be subtracted from the original price to get the final price. |  [optional] |
|**discount** | [**CommerceRuntimeDiscount**](CommerceRuntimeDiscount.md) |  |  [optional] |
|**couponCode** | **String** | Code of the coupon associated with the discount if a coupon code is required to get the discount. |  [optional] |
|**excluded** | **Boolean** | Determines whether or not this discount is set up to be ignored by the pricing runtime. |  [optional] |


## Implemented Interfaces

* Serializable


