

# AppliedLineItemProductDiscount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**couponCode** | **String** | Code of the coupon associated with the discount if a coupon code is required to get the discount. |  [optional] |
|**data** | **Object** | Stores any custom data sent from external discounts. |  [optional] |
|**discount** | [**Discount**](Discount.md) |  |  [optional] |
|**excluded** | **Boolean** | Determines whether or not this discount is set up to be ignored by the pricing runtime. |  [optional] |
|**groupId** | **String** | Group identifier for the discount. |  [optional] |
|**impact** | **Double** | Value of the discount applied. This is a negative number to be subtracted from the original price to get the final price. |  [optional] |
|**appliesToSalePrice** | **Boolean** | Determines if the discount applies to the sale price of the order |  [optional] |
|**impactPerUnit** | **Double** | Impact for a quantity of one product; that is, the value of the discount for one product. |  [optional] |
|**productQuantity** | **Integer** | Quantity of products priced. This is always one unless calculating pricing on the order or cart. |  [optional] |
|**discountQuantity** | **Integer** | The number of the line item that can be used for this particular discount. |  [optional] |


## Implemented Interfaces

* Serializable


