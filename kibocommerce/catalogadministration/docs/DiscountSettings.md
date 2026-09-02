

# DiscountSettings

Tenant level discount settings

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customProperties** | [**List&lt;CustomProperty&gt;**](CustomProperty.md) | Discount settings additional custom properties for storing property codes and names. |  [optional] |
|**doNotApplyToHandlingFees** | **Boolean** | Prevents discounts from applying to handling fees |  [optional] |
|**rejectSelfDefeatingDiscounts** | **Boolean** | When true, the line-item planning loop rejects discounts whose application would violate their own minimum order amount constraint. |  [optional] |
|**stackingConfiguration** | [**StackingConfiguration**](StackingConfiguration.md) |  |  [optional] |
|**usePostDiscountedOrderValue** | **Boolean** | Use the pre or post line item discounts order total to evaluate the order minimum constraint |  [optional] |


## Implemented Interfaces

* Serializable


