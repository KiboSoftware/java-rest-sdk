

# PricingRuntimeDiscountCondition


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requiresCoupon** | **Boolean** | If true, the shopper needs to enter a coupon code to redeem the discount. |  [optional] |
|**couponCode** | **String** | ShippingMethodCode of the coupon associated with the discount (if a coupon code is required). The merchant can supply the code or the system can generate it. |  [optional] |
|**minimumQuantityProductsRequiredInCategories** | **Integer** | Minimum quantity of products in the categories specified in IncludedCategories that must be purchased to  qualify for the associated discount.  Valid values are null and ints greater than zero |  [optional] |
|**includedCategoryIds** | **List&lt;Integer&gt;** | List of categories to discount. When a discount applies to a category, all products in the category are discounted. |  [optional] |
|**excludedCategoryIds** | **List&lt;Integer&gt;** | List of categories to discount. When a discount applies to a category, all products in the category are discounted. |  [optional] |
|**minimumQuantityRequiredProducts** | **Integer** | Minimum quantity of products in the specified IncludedProducts that must be purchased to  qualify for the associated discount.  Defaults to 0 |  [optional] |
|**includedProductCodes** | **List&lt;String&gt;** | List of products that are eligible for the discount. |  [optional] |
|**excludedProductCodes** | **List&lt;String&gt;** | List of products that are eligible for the discount. |  [optional] |
|**paymentWorkflows** | **List&lt;String&gt;** | List of payment types that are valid for this discount.  An empty list signifies all payment types. |  [optional] |
|**customerSegmentIds** | **List&lt;Integer&gt;** | List of customer groups for which the discount applies |  [optional] |
|**minimumOrderAmount** | **Double** | If the discount is for products, how many products must be purchased to be eligible for the discount.  If the discount is for an order, how much the order must total to be eligible for the discount. For example, you might want to offer a 10% discount on orders over $100. |  [optional] |
|**maximumOrderAmount** | **Double** | If the discount is for products, how many product can you have and still be eligible for the discount.  If the discount is for an order, what is the max the order can total to be eligible for the discount. For example, you might want to offer a 10% discount on orders under $100. |  [optional] |
|**minimumLifetimeValueAmount** | **Double** | Minimum lifetime value amount required for this discount to apply |  [optional] |
|**startDate** | **OffsetDateTime** | Date when the discount can goes into effect, in the format yyyy-mm-dd. |  [optional] |
|**expirationDate** | **OffsetDateTime** | Date when the discount expires. Default is null (no expiration date). |  [optional] |
|**minimumCategorySubtotalBeforeDiscounts** | **Double** | Minimum amount that must be purchased in the combined categories defined in   IncludedCategories.  Amount is calculated before discounting. |  [optional] |
|**minDistinctProductsRequired** | **Integer** | Minimum number of distinct products that must be purchased that are also not free. |  [optional] |


## Implemented Interfaces

* Serializable


