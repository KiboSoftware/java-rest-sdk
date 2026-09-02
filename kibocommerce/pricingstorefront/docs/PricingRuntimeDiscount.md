

# PricingRuntimeDiscount

Represents a discount for runtime API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Double** |     Amount of the discount, as a percentage or monetary amount, for example 15% or $15. Must be either null or greater than zero. |  [optional] |
|**amountType** | **String** | Gets or sets the AmountType of the discount. Values: Percentage, Amount, FixedPrice, FreeAutoAdd |  [optional] |
|**canBeStackedUpon** | **Boolean** | Indicates whether or not stacking is enabled for this discount |  [optional] |
|**code** | **String** | Gets or sets the code associated with the discount. |  [optional] |
|**conditions** | [**RuntimeDiscountCondition**](RuntimeDiscountCondition.md) |  |  [optional] |
|**content** | **Map&lt;String, String&gt;** | Gets or sets the content of the discount. |  [optional] |
|**customProperties** | [**List&lt;DiscountCustomProperty&gt;**](DiscountCustomProperty.md) | Gets or sets the custom properties of the discount. |  [optional] |
|**doesNotApplyToMultiShipToOrders** | **Boolean** | Flag to allow or prevent application to multi-ship-to orders, Only applicable to shipping discounts. |  [optional] |
|**doesNotApplyToProductsWithSalePrice** | **Boolean** | Determines whether a discount applies to items with a sale price. Applicable  on order and line item discounts. For line items, when this is true, the discount will  be disqualified. For order level discounts, when true, the discount will not be applied  to those items that have a sale price. |  [optional] |
|**doesNotApplyToSalePrice** | **Boolean** | Determines if the discount should apply to sale price or regular price only. Discounts will apply to sale prices by default. Only applies to LineItem product discounts. |  [optional] |
|**expirationDate** | **OffsetDateTime** | Gets or sets the expiration date of the discount. |  [optional] |
|**hasPurchaseConditions** | **Boolean** | Indicates if this discount has purchase conditions that must be met before  the discount is applied |  [optional] |
|**id** | **Integer** | Gets or sets the unique identifier for the discount. |  [optional] |
|**includedPriceLists** | **List&lt;String&gt;** | Products receiving a price from a price list specified here or a child of a specified  price list can be discounted. |  [optional] |
|**isBxGx** | **Boolean** | Readonly property indicating that the condition required purchase is the  same as the target items.  Used in BxGx and BoGo type discounts. |  [optional] |
|**isGroupDiscount** | **Boolean** | When set to true then the discount is applied to all of the target items once the minimum quantity per redemption is met. |  [optional] |
|**isPublic** | **Boolean** | Gets or sets a value indicating whether the discount is public. |  [optional] |
|**isSubscriptionDiscount** | **Boolean** | Gets or sets a value indicating whether the discount is a subscription discount. |  [optional] |
|**isUnconditional** | **Boolean** | Gets or sets a value indicating whether the discount is unconditional. |  [optional] |
|**labels** | **List&lt;String&gt;** | List of distinct labels associated with the discount. |  [optional] |
|**maximumDiscountImpactPerOrder** | **Double** | Maximum impact this discount can apply on a single order.  Must be either null or greater than zero. |  [optional] |
|**maximumDiscountImpactPerRedemption** | **Double** | Maximum impact this discount can apply on a single line item.  Must be either null or greater than zero. |  [optional] |
|**maximumRedemptionsPerOrder** | **Integer** | Maximum number of redemptions for the discount per registered user. |  [optional] |
|**maximumUsesPerUser** | **Integer** | Maximum number of times a user can redeem this discount.  Must be either null or greater than zero. |  [optional] |
|**preventLineItemShippingDiscounts** | **Boolean** | Prevents Line Item Shipping discounts from being applied when a Line Item Product   discount has been applied |  [optional] |
|**preventOrderProductDiscounts** | **Boolean** | Prevents Order Product discounts from being applied when a Line Item Product   or Shipping discount has been applied |  [optional] |
|**preventOrderShippingDiscounts** | **Boolean** | Prevents Order Shipping discounts from being applied when a Line Item Product/Shipping   or Order Product discount has been applied |  [optional] |
|**pricingContext** | **String** | The pricing context this discount is applicable to. Values: Any, OnlinePurchase, ContinuityOrder |  [optional] |
|**purchaseRequirementType** | **String** | Used to determin how discount is evaluated.  When set to TargetOnly, then only the Target is used to drive the purchase requirement.  When set to Combination, then the Target and Condition are used to drive the purchase requirement. |  [optional] |
|**reevalFreeItemMinOrderPostDiscounts** | **Boolean** | Enables post-order-discount minimum re-evaluation for eligible free-item discounts. Values null and false are treated as disabled. |  [optional] |
|**scope** | **String** | Gets or sets the scope of the discount. Values: Order, LineItem |  [optional] |
|**stackingLayer** | **Integer** | Indicates which stacking layer this discount is a part of |  [optional] |
|**startDate** | **OffsetDateTime** | Gets or sets the start date of the discount. |  [optional] |
|**target** | [**RuntimeDiscountTarget**](RuntimeDiscountTarget.md) |  |  [optional] |
|**thresholdMessage** | [**CommerceRuntimeThresholdMessage**](CommerceRuntimeThresholdMessage.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


