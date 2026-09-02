

# CommerceRuntimeAppliedDiscount

Discount applied to the order, which is a negative number to be subtracted from the original price to get the final price.  If multiple discounts for the order exist, this is the value most advantageous to the shopper.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**couponCode** | **String** | Code of the coupon associated with the discount if a coupon code is required to get the discount. |  [optional] |
|**data** | **Object** | Stores any custom data sent from external discounts. |  [optional] |
|**discount** | [**CommerceRuntimeDiscount**](CommerceRuntimeDiscount.md) |  |  [optional] |
|**excluded** | **Boolean** | Determines whether or not this discount is set up to be ignored by the pricing runtime. |  [optional] |
|**groupId** | **String** | Group identifier for the discount. |  [optional] |
|**impact** | **Double** | Value of the discount applied. This is a negative number to be subtracted from the original price to get the final price. |  [optional] |


## Implemented Interfaces

* Serializable


