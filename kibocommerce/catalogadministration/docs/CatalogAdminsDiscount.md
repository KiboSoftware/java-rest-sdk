

# CatalogAdminsDiscount

Allows you to define and manage discounts to apply to your products, product categories, or orders. The discounts can be a specified monetary amount off the price, percentage off the price, or for free shipping. You can create a coupon code that applies to the discount.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Double** |     Amount of the discount, as a percentage or monetary amount, for example 15% or $15. Must be either null or greater than zero. |  [optional] |
|**amountType** | **String** | Type of discount, which can be either a percentage off the price,  a specific monetary amount, or free.  Possible values:   Percentage   Amount   Free  FixedPrice |  |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**canBeDeleted** | **Boolean** | Signifies that the discount is not referenced and can be hard deleted |  [optional] |
|**canBeStackedUpon** | **Boolean** | Indicates whether or not stacking is enabled for this discount |  [optional] |
|**code** | **String** | Indicates unique code for the discount, if not present Discount Id is used as a code. |  [optional] |
|**conditions** | [**CatalogAdminsDiscountCondition**](CatalogAdminsDiscountCondition.md) |  |  [optional] |
|**content** | [**DiscountLocalizedContent**](DiscountLocalizedContent.md) |  |  [optional] |
|**currentRedemptionCount** | **Integer** | How many times this discount has been redeemed. System-supplied and read-only. |  [optional] |
|**doesNotApplyToMultiShipToOrders** | **Boolean** | Flag to allow or prevent application to multi-ship-to orders, Only applicable to shipping discounts. |  [optional] |
|**doesNotApplyToProductsWithSalePrice** | **Boolean** | Determines whether or not a discount applies to a items with a sale price.  Applicable  on order and line item discounts.  For line items, when this is true, the discount will  be disqualified.  For order level discounts, when true, the discount will not be applied  to those items have a sale price. |  [optional] |
|**doesNotApplyToSalePrice** | **Boolean** | Determines if the discount should apply to sale price or regular price only. Discounts will apply to sale prices by default. Only applies to LineItem product discounts. |  [optional] |
|**hasPurchaseConditions** | **Boolean** | Indicates if this discount has purchase conditions that must be met before  the discount is applied |  [optional] |
|**id** | **Integer** | Unique identifier of the discount. System-supplied and read-only. |  [optional] |
|**includedPriceLists** | **List&lt;String&gt;** | Products receiving a price from a price list specified here or a child of a specified  price list can be discounted. |  [optional] |
|**isBxGx** | **Boolean** | Readonly property indicating that the condition required purchase is the  same as the target items.  Used in BxGx and BoGo type discounts. |  [optional] |
|**isDisabled** | **Boolean** | Signifies if the discount is disabled (Null is treated as false) |  [optional] |
|**isPublic** | **Boolean** | Determines whether the discount is available for every shopper. |  [optional] |
|**isSubscriptionDiscount** | **Boolean** | Determines how discounts will be evaluated for subscription items and during continuity orders. |  [optional] |
|**labels** | **List&lt;String&gt;** | Indicates unique discount labels. |  [optional] |
|**localizedContent** | [**List&lt;DiscountLocalizedContent&gt;**](DiscountLocalizedContent.md) | Container for the language-specific name of the discount. You will have a container for each supported language (LocaleCode). This enables you to display the discount name in multiple languages yet manage it as a single discount internally. |  [optional] |
|**maximumDiscountImpactPerOrder** | **Double** | Maximum impact this discount can apply on a single order.  Must be either null or greater than zero. |  [optional] |
|**maximumDiscountImpactPerRedemption** | **Double** | Maximum impact this discount can apply on a single line item.  Must be either null or greater than zero. |  [optional] |
|**maximumRedemptionsPerOrder** | **Integer** | Maximum number of redemptions allowed per order. If null, defaults to unlimited. |  [optional] |
|**maximumUsesPerUser** | **Integer** | Maximum number of times a user can redeem this discount.  Must be either null or greater than zero. |  [optional] |
|**preventLineItemShippingDiscounts** | **Boolean** | Prevents Line Item Shipping discounts from being applied when a Line Item Product   discount has been applied |  [optional] |
|**preventOrderProductDiscounts** | **Boolean** | Prevents Order Product discounts from being applied when a Line Item Product   or Shipping discount has been applied |  [optional] |
|**preventOrderShippingDiscounts** | **Boolean** | Prevents Order Shipping discounts from being applied when a Line Item Product/Shipping   or Order Product discount has been applied |  [optional] |
|**purchaseRequirementType** | **String** | The type of purchase requirement for this discount, either purchase conditions and targets which    Supports BoGo, and BxGx scenarios. Or Target only that only have a target and no purchase conditions |  [optional] |
|**reevalFreeItemMinOrderPostDiscounts** | **Boolean** | Enables post-order-discount minimum re-evaluation for eligible free-item discounts. Values null and false are treated as disabled. |  [optional] |
|**scope** | **String** | Scope to which the discount applies, valid values are: Order, LineItem |  |
|**stackingLayer** | **Integer** | Indicates which stacking layer this discount is a part of |  [optional] |
|**status** | **String** | Discount status which can be \&quot;Active,\&quot; \&quot;Scheduled,\&quot; or \&quot;Expired.\&quot; System-supplied and read-only. |  [optional] |
|**tagCodes** | **List&lt;String&gt;** | System-supplied and read-only. |  [optional] |
|**target** | [**CatalogAdminsDiscountTarget**](CatalogAdminsDiscountTarget.md) |  |  |
|**thresholdMessage** | [**CatalogAdminsThresholdMessage**](CatalogAdminsThresholdMessage.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


