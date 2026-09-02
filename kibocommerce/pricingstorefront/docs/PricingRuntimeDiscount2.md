

# PricingRuntimeDiscount2

Name of the discount that can be applied and its expiration date. The discount can be on a single product or the entire order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Double** |  |  [optional] |
|**amountType** | **String** | Type of discount, which can be either a percentage off the price, a specific monetary amount, or free. Possible values: \&quot;Percentage,\&quot; \&quot;Amount,\&quot; and \&quot;Free\&quot;. |  [optional] |
|**code** | **String** | Unique identifier of the discount. |  [optional] |
|**condition** | [**PricingRuntimeDiscountCondition**](PricingRuntimeDiscountCondition.md) |  |  [optional] |
|**discountId** | **Integer** | Unique identifier of the discount. System-supplied and read-only. |  [optional] |
|**doesNotApplyToMultiShipToOrders** | **Boolean** |  |  [optional] |
|**doesNotApplyToProductsWithSalePrice** | **Boolean** |  |  [optional] |
|**expirationDate** | **OffsetDateTime** | When the discount expires. If null, there&#39;s no expiration date. |  [optional] |
|**friendlyDescription** | **String** | Friendly description of the discount. |  [optional] |
|**includedPriceLists** | **List&lt;String&gt;** |  |  [optional] |
|**isPublic** | **Boolean** |  |  [optional] |
|**labels** | **List&lt;String&gt;** |  |  [optional] |
|**maxDiscountValuePerRedemption** | **Double** |  |  [optional] |
|**maxRedemptions** | **Integer** |  |  [optional] |
|**maximumDiscountValuePerOrder** | **Double** |  |  [optional] |
|**maximumRedemptionsPerOrder** | **Integer** |  |  [optional] |
|**maximumUsesPerUser** | **Integer** |  |  [optional] |
|**name** | **String** | Name of the discount. |  [optional] |
|**redemptions** | **Integer** |  |  [optional] |
|**requiresAuthenticatedUser** | **Boolean** |  |  [optional] |
|**scope** | **String** |  |  [optional] |
|**stackingLayer** | **Integer** |  |  [optional] |
|**target** | [**PricingRuntimeDiscountTarget**](PricingRuntimeDiscountTarget.md) |  |  [optional] |
|**type** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


