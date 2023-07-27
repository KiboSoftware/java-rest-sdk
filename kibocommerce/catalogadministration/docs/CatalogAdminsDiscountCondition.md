

# CatalogAdminsDiscountCondition

Specifies constraints that must be satified for a discount to be applied to a target.  Constraints are Anded together

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxRedemptionCount** | **Integer** | Maximum number of times that the discount can be redeemed. Default is null (no limit to discount redemptions). |  [optional] |
|**requiresCoupon** | **Boolean** | If true, the shopper needs to enter a coupon code to redeem the discount. |  [optional] |
|**couponCode** | **String** | Code of the coupon associated with the discount (if a coupon code is required). The merchant can supply the code or the system can generate it. |  [optional] |
|**requiresAuthenticatedUser** | **Boolean** | Determines is this discount can be used by an anonymous user   Defaults to false to allow discounts for anonymous users. |  [optional] |
|**includedPaymentWorkflows** | **List&lt;String&gt;** | List of payment types that trigger this discount to be valid. |  [optional] |
|**includedCategories** | [**List&lt;CategoryDiscountCondition&gt;**](CategoryDiscountCondition.md) | List of categories that must be purchased in order for the discount to be valid. |  [optional] |
|**excludedCategories** | [**List&lt;CategoryDiscountCondition&gt;**](CategoryDiscountCondition.md) | List of categories to discount. When a discount applies to a category, all products in the category are discounted. |  [optional] |
|**includedProducts** | [**List&lt;ProductDiscountCondition&gt;**](ProductDiscountCondition.md) | List of products that are eligible for the discount. |  [optional] |
|**excludedProducts** | [**List&lt;ProductDiscountCondition&gt;**](ProductDiscountCondition.md) | List of products that are eligible for the discount. |  [optional] |
|**customerSegments** | [**List&lt;CatalogAdminsCustomerSegment&gt;**](CatalogAdminsCustomerSegment.md) | List of customer groups for which the discount applies |  [optional] |
|**minimumQuantityRequiredProducts** | **Integer** | Minimum quantity of products in the specified IncludedProducts that must be purchased to  qualify for the associated discount.  Defaults to 1 if  null and IncludedProducts has values. |  [optional] |
|**minimumQuantityProductsRequiredInCategories** | **Integer** | Minimum quantity of products in the categories specified in IncludedCategories that must be purchased to  qualify for the associated discount.  Defaults to 1 if  null and IncludedCategories has values |  [optional] |
|**minimumOrderAmount** | **Double** | Only applies to order.  Minimum order subtotal after discounts in order for the associated discount to be applied |  [optional] |
|**maximumOrderAmount** | **Double** | Only applies to order.  Maximum order subtotal after discounts in order for the associated discount to be applied |  [optional] |
|**categoriesToExcludeFromMinOrderTotal** | [**List&lt;CategoryDiscountCondition&gt;**](CategoryDiscountCondition.md) | List of categories to discount. When a discount applies to a category, all products in the category are discounted. |  [optional] |
|**productsToExcludeFromMinOrderTotal** | [**List&lt;ProductDiscountCondition&gt;**](ProductDiscountCondition.md) | List of products that are eligible for the discount. |  [optional] |
|**minimumLifetimeValueAmount** | **Double** | Minimum lifetime value amount required for this discount to apply |  [optional] |
|**startDate** | **OffsetDateTime** | Date when the discount can goes into effect, in the format yyyy-mm-dd. |  [optional] |
|**expirationDate** | **OffsetDateTime** | Date when the discount expires. Default is null (no expiration date). |  [optional] |
|**minimumCategorySubtotalBeforeDiscounts** | **Double** | Minimum amount that must be purchased in the combined categories defined in   IncludedCategories.  Amount is calculated before discounting.  Not used if IncludedCategories is empty. |  [optional] |
|**minimumRequiredQuantityPerRedemption** | **Integer** | Defines a minimum quantity that is required for a target only discount |  [optional] |
|**validSubscriptionFrequencies** | **List&lt;String&gt;** | List of subscription frequencies to which the discount will apply. |  [optional] |
|**validSubscriptionContinuityOrdinals** | **List&lt;Integer&gt;** | Ordinals at which a continuity order should receive the discount. |  [optional] |
|**minDistinctProductsRequired** | **Integer** | The minimum number of distinct products on the order  Not a quantity calculation. |  [optional] |
|**minTotalOrderQuantity** | **Integer** | The order must contain at least this total quantity of items for the discount to apply.  You must buy a combined quantity of at least x amount. |  [optional] |
|**pricingContext** | **String** | The pricing context must match on this value for the discount to apply.  This only matters for tenants that use subscription products |  [optional] |
|**continuityRecurrenceSettings** | [**ContinuityRecurrenceSettings**](ContinuityRecurrenceSettings.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


