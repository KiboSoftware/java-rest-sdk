

# RuntimeDiscountTarget


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**categories** | [**List&lt;PricingRuntimeTargetedCategory&gt;**](PricingRuntimeTargetedCategory.md) | List of categories to discount. When a discount applies to a category, all products in the category are discounted. |  [optional] |
|**doNotApplyToHandlingFees** | **Boolean** | Prevents the discount from being applied to handling fees |  [optional] |
|**excludeItemsWithExistingProductDiscounts** | **Boolean** | Prevents order scoped discounts from layering over items that already have a product discount with the  same type. |  [optional] |
|**excludeItemsWithExistingShippingDiscounts** | **Boolean** | Prevents order scoped discounts from layering over items that already have a shipping discount with the  same type. |  [optional] |
|**excludedCategories** | [**List&lt;PricingRuntimeTargetedCategory&gt;**](PricingRuntimeTargetedCategory.md) | List of categories to exclude from the discount. Useful to exclude specific child categories. |  [optional] |
|**excludedCategoriesOperator** | **String** | Applies to Included categories Defaults to Any |  [optional] |
|**excludedProducts** | [**List&lt;TargetedProduct&gt;**](TargetedProduct.md) | List of products that are excluded from the discount. |  [optional] |
|**includeAllProducts** | **Boolean** | If yes, the discount applies to all products sold on the storefront. |  [optional] |
|**includedCategoriesOperator** | **String** | Applies to Included categories When Any, the target product can belong to any specified category. When All, the target product must belong to all specified categories. Defaults to Any |  [optional] |
|**maximumQuantityPerRedemption** | **Integer** | When a condition is specified, this property limits the number of items that can be targeted per discount redemption with an order. if multiple redemptions are allowed per order then multiples of this value would be allowed in multiples of the associated  condition. If no condition is specified then this value is not used.   If null and condition exists, then defaults to 1. |  [optional] |
|**products** | [**List&lt;TargetedProduct&gt;**](TargetedProduct.md) | List of products that are eligible for the discount. |  [optional] |
|**shippingMethods** | [**List&lt;PricingRuntimeTargetedShippingMethod&gt;**](PricingRuntimeTargetedShippingMethod.md) | Shipping method that is eligible for shipping discounts. This is a shipping method defined in Shipping Settings. |  [optional] |
|**shippingZones** | [**List&lt;PricingRuntimeTargetedShippingZone&gt;**](PricingRuntimeTargetedShippingZone.md) | Shipping Zones that are applicable for this discount |  [optional] |
|**type** | **String** |     Type of target to which the discount applies. Possible values: &lt;pre&gt;Product&lt;/pre&gt; or &lt;pre&gt;Shipping&lt;/pre&gt;.  If this is a &lt;pre&gt;Product&lt;/pre&gt; type, you can specify which products or categories that the discount applies to.     If this is a &lt;pre&gt;Shipping&lt;/pre&gt; type then you must specify which shipping methods apply. |  [optional] |


## Implemented Interfaces

* Serializable


