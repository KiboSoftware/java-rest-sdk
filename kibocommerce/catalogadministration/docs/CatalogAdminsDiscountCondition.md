

# CatalogAdminsDiscountCondition

Specifies constraints that must be satified for a discount to be applied to a target. Constraints are Anded together

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**categoriesToExcludeFromMinOrderTotal** | [**List&lt;CategoryDiscountCondition&gt;**](CategoryDiscountCondition.md) | List of categories to discount. When a discount applies to a category, all products in the category are discounted. |  [optional] |
|**continuityRecurrenceSettings** | [**ContinuityRecurrenceSettings**](ContinuityRecurrenceSettings.md) |  |  [optional] |
|**couponCode** | **String** | Code of the coupon associated with the discount (if a coupon code is required). The merchant can supply the code or the system can generate it. |  [optional] |
|**customerSegments** | [**List&lt;CatalogAdminsCustomerSegment&gt;**](CatalogAdminsCustomerSegment.md) | List of customer groups for which the discount applies |  [optional] |
|**excludedCategories** | [**List&lt;CategoryDiscountCondition&gt;**](CategoryDiscountCondition.md) | List of categories to discount. When a discount applies to a category, all products in the category are discounted. |  [optional] |
|**excludedProducts** | [**List&lt;ProductDiscountCondition&gt;**](ProductDiscountCondition.md) | List of products that are eligible for the discount. |  [optional] |
|**exclusiveLocationCodes** | **List&lt;String&gt;** | List of locations where the item/order should be fulfilled for the discount to be valid. |  [optional] |
|**exclusiveSiteIds** | **List&lt;Integer&gt;** | The discount condition for site Ids, if present the discount will be applied only to these sites. If not present discount will work for all sites in a catalog. |  [optional] |
|**expirationDate** | **OffsetDateTime** | Date when the discount expires. Default is null (no expiration date). |  [optional] |
|**expression** | [**CatalogAdminsDynamicExpression**](CatalogAdminsDynamicExpression.md) |  |  [optional] |
|**includedCategories** | [**List&lt;CategoryDiscountCondition&gt;**](CategoryDiscountCondition.md) | List of categories that must be purchased in order for the discount to be valid. |  [optional] |
|**includedPaymentWorkflows** | **List&lt;String&gt;** | List of payment types that trigger this discount to be valid. |  [optional] |
|**includedProducts** | [**List&lt;ProductDiscountCondition&gt;**](ProductDiscountCondition.md) | List of products that are eligible for the discount. |  [optional] |
|**maxRedemptionCount** | **Integer** | Maximum number of times that the discount can be redeemed. Default is null (no limit to discount redemptions). |  [optional] |
|**maximumOrderAmount** | **Double** | Only applies to order. Maximum order subtotal after discounts in order for the associated discount to be applied |  [optional] |
|**minDistinctProductsRequired** | **Integer** | The minimum number of distinct products on the order Not a quantity calculation. |  [optional] |
|**minTotalOrderQuantity** | **Integer** | The order must contain at least this total quantity of items for the discount to apply. You must buy a combined quantity of at least x amount. |  [optional] |
|**minimumCategorySubtotalBeforeDiscounts** | **Double** | Minimum amount that must be purchased in the combined categories defined in  IncludedCategories.  Amount is calculated before discounting. Not used if IncludedCategories is empty. |  [optional] |
|**minimumLifetimeValueAmount** | **Double** | Minimum lifetime value amount required for this discount to apply |  [optional] |
|**minimumOrderAmount** | **Double** | Only applies to order. Minimum order subtotal after discounts in order for the associated discount to be applied |  [optional] |
|**minimumQuantityProductsRequiredInCategories** | **Integer** | Minimum quantity of products in the categories specified in IncludedCategories that must be purchased to qualify for the associated discount. Defaults to 1 if  null and IncludedCategories has values |  [optional] |
|**minimumQuantityRequiredProducts** | **Integer** | Minimum quantity of products in the specified IncludedProducts that must be purchased to qualify for the associated discount. Defaults to 1 if  null and IncludedProducts has values. |  [optional] |
|**minimumRequiredQuantityPerRedemption** | **Integer** | Defines a minimum quantity that is required for a target only discount |  [optional] |
|**pricingContext** | **String** | The pricing context must match on this value for the discount to apply. This only matters for tenants that use subscription products |  [optional] |
|**productsToExcludeFromMinOrderTotal** | [**List&lt;ProductDiscountCondition&gt;**](ProductDiscountCondition.md) | List of products that are eligible for the discount. |  [optional] |
|**requiresAuthenticatedUser** | **Boolean** | Determines is this discount can be used by an anonymous user  Defaults to false to allow discounts for anonymous users. |  [optional] |
|**requiresCoupon** | **Boolean** | If true, the shopper needs to enter a coupon code to redeem the discount. |  [optional] |
|**startDate** | **OffsetDateTime** | Date when the discount can goes into effect, in the format yyyy-mm-dd. |  [optional] |
|**validFulfillmentMethods** | **List&lt;String&gt;** | The discount condition for fulfillment methods, if present the discount will be applied only to these fulfillment methods. This must be a value defined in FulfillmentMethodConst below. |  [optional] |
|**validSubscriptionContinuityOrdinals** | **List&lt;Integer&gt;** | Ordinals at which a continuity order should receive the discount. |  [optional] |
|**validSubscriptionFrequencies** | **List&lt;String&gt;** | List of subscription frequencies to which the discount will apply. |  [optional] |


## Implemented Interfaces

* Serializable


