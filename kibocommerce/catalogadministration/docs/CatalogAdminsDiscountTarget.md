

# CatalogAdminsDiscountTarget

What to discount. Specifies the type of discount (percentage off, monetary amount, or free shipping) and which products, categories, or shipping methods are eligible for the discount.  Can also specify the minimum amount that the order must total for the discount to apply.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** |     Type of target to which the discount applies. Possible values: &lt;pre&gt;Product&lt;/pre&gt; or &lt;pre&gt;Shipping&lt;/pre&gt;.   If this is a &lt;pre&gt;Product&lt;/pre&gt; type, you can specify which products or categories that the discount applies to.      If this is a &lt;pre&gt;Shipping&lt;/pre&gt; type then you must specify which shipping methods apply. |  |
|**includeAllProducts** | **Boolean** | If yes, the discount applies to all products sold on the storefront. |  [optional] |
|**includedCategoriesOperator** | **String** | Applies to Included categories  When Any, the target product can belong to any specified category.  When All, the target product must belong to all specified categories.  Defaults to Any |  [optional] |
|**categories** | [**List&lt;TargetedCategory&gt;**](TargetedCategory.md) | List of categories to discount. When a discount applies to a category, all products in the category are discounted. |  [optional] |
|**excludedCategoriesOperator** | **String** | Applies to Included categories  Defaults to Any |  [optional] |
|**excludedCategories** | [**List&lt;TargetedCategory&gt;**](TargetedCategory.md) | List of categories to exclude from the discount. Useful to exclude specific child categories. |  [optional] |
|**products** | [**List&lt;TargetedProduct&gt;**](TargetedProduct.md) | List of products that are eligible for the discount. |  [optional] |
|**excludedProducts** | [**List&lt;TargetedProduct&gt;**](TargetedProduct.md) | List of products that are excluded from the discount. |  [optional] |
|**excludeItemsWithExistingShippingDiscounts** | **Boolean** | Prevents order scoped discounts from layering over items that already have a shipping discount with the   same type. |  [optional] |
|**excludeItemsWithExistingProductDiscounts** | **Boolean** | Prevents order scoped discounts from layering over items that already have a product discount with the   same type. |  [optional] |
|**shippingMethods** | [**List&lt;TargetedShippingMethod&gt;**](TargetedShippingMethod.md) | Shipping method that is eligible for shipping discounts. This is a shipping method defined in Shipping Settings. |  [optional] |
|**shippingZones** | [**List&lt;TargetedShippingZone&gt;**](TargetedShippingZone.md) | Shipping Zones that are applicable for this discount |  [optional] |
|**doNotApplyToHandlingFees** | **Boolean** | Prevents the discount from being applied to handling fees |  [optional] |
|**maximumQuantityPerRedemption** | **Integer** | When a condition is specified, this property limits the number of items that can be targeted per discount redemption with an order.  if multiple redemptions are allowed per order then multiples of this value would be allowed in multiples of the associated   condition.  If no condition is specified then this value is not used.    If null and condition exists, then defaults to 1. |  [optional] |
|**appliesToLeastExpensiveProductsFirst** | **Boolean** | Determines which way the discount is optimized.  Consumers favor(default - false/null) or tenants favor (when this is set to true)  Applies to discounts where target is not a specific product or list of products.    May also impact behavior of Buy X Get Y so that X is the most expensive items and Y the least expensive. |  [optional] |


## Implemented Interfaces

* Serializable


