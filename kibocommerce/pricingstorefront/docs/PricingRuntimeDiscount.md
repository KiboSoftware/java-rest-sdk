

# PricingRuntimeDiscount

Name of the discount that can be applied and its expiration date. The discount can be on a single product or the  entire order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**discountId** | **Integer** | Unique identifier of the discount. System-supplied and read-only. |  [optional] |
|**name** | **String** | Name of the discount. |  [optional] |
|**friendlyDescription** | **String** | Friendly description of the discount. |  [optional] |
|**amount** | **Double** |  |  [optional] |
|**scope** | **String** |  |  [optional] |
|**maxRedemptions** | **Integer** |  |  [optional] |
|**maximumUsesPerUser** | **Integer** |  |  [optional] |
|**requiresAuthenticatedUser** | **Boolean** |  |  [optional] |
|**doesNotApplyToProductsWithSalePrice** | **Boolean** |  |  [optional] |
|**maximumRedemptionsPerOrder** | **Integer** |  |  [optional] |
|**maximumDiscountValuePerOrder** | **Double** |  |  [optional] |
|**maxDiscountValuePerRedemption** | **Double** |  |  [optional] |
|**doesNotApplyToMultiShipToOrders** | **Boolean** |  |  [optional] |
|**includedPriceLists** | **List&lt;String&gt;** |  |  [optional] |
|**redemptions** | **Integer** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**amountType** | **String** | Type of discount, which can be either a percentage off the price, a specific monetary amount, or free. Possible values: \&quot;Percentage,\&quot; \&quot;Amount,\&quot; and \&quot;Free\&quot;. |  [optional] |
|**target** | [**PricingRuntimeDiscountTarget**](PricingRuntimeDiscountTarget.md) |  |  [optional] |
|**condition** | [**PricingRuntimeDiscountCondition**](PricingRuntimeDiscountCondition.md) |  |  [optional] |
|**expirationDate** | **OffsetDateTime** | When the discount expires. If null, there&#39;s no expiration date. |  [optional] |
|**stackingLayer** | **Integer** |  |  [optional] |


## Implemented Interfaces

* Serializable


