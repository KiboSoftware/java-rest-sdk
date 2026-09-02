

# ProductSortDefinition

Defines a default sort for a list of products and allows some products to be boosted to the top or pinned ot a specific position, or buried at the bottom of the list.  Only 10 items can be boosted or pinned and up to

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**boosted** | [**List&lt;ProductSortOverride&gt;**](ProductSortOverride.md) | List of products being positioned |  [optional] |
|**buried** | [**List&lt;ProductSortOverride&gt;**](ProductSortOverride.md) | List of products being positioned |  [optional] |
|**categoryId** | **Integer** |  |  [optional] |
|**endDate** | **OffsetDateTime** | Optional end date for a product sort definition |  [optional] |
|**name** | **String** | Short Name for the sort definition. Required. |  |
|**productSortDefinitionId** | **Integer** | System or user provided ID for the ProductSortDefinition |  [optional] |
|**sortExpressions** | [**List&lt;ProductSortExpression&gt;**](ProductSortExpression.md) | Sort expression to apply Max two expressions |  |
|**startDate** | **OffsetDateTime** | The Start Date when the sort definition becomes active |  |


## Implemented Interfaces

* Serializable


