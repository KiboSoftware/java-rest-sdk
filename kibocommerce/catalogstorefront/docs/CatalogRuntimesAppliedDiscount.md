

# CatalogRuntimesAppliedDiscount

Discount applied to the product.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**couponCode** | **String** | If the discount is a coupon, code associated with the coupon. |  [optional] |
|**discount** | [**CatalogRuntimesDiscount**](CatalogRuntimesDiscount.md) |  |  [optional] |
|**discounts** | [**List&lt;CatalogRuntimesDiscount&gt;**](CatalogRuntimesDiscount.md) | Discount name and expiration date. |  [optional] |
|**impact** | **Double** | The new calculated price of the product. That is, the product price minus the discount amount. |  [optional] |


## Implemented Interfaces

* Serializable


