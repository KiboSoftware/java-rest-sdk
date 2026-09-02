

# SafetyStockRule

Represents a rule for safety stock in the product administration system.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**code** | **String** | Gets or sets the unique identifier of the SafetyStockRule. If not given provided on create one will be assigned. Read-only after creation. |  [optional] |
|**description** | **String** | Gets or sets the description of the SafetyStockRule. |  [optional] |
|**enabled** | **Boolean** | Gets or sets whether the SafetyStockRule is enabled. |  [optional] |
|**endDate** | **OffsetDateTime** | End of the rule&#39;s effective window. Null &#x3D; never expires. Must be &gt;&#x3D; StartDate when both supplied. |  [optional] |
|**isActive** | **Boolean** | Read-only. Computed server-side: true when the current UTC instant is inside the effective window (StartDate null/≤now AND EndDate null/≥now), false otherwise. A rule with no dates is always active. This reflects the effective window alone and does not incorporate the enabled flag. |  [optional] |
|**locationCodes** | **List&lt;String&gt;** | Gets or sets the list of location codes where the SafetyStockRule applies. |  [optional] |
|**locationGroups** | **List&lt;String&gt;** | Gets or sets the list of location groups where the SafetyStockRule applies. |  [optional] |
|**metaData** | **Object** | Metadata for the Safety stock rule which is a json format, used to store additional information |  [optional] |
|**name** | **String** | Gets or sets the name of the SafetyStockRule. |  [optional] |
|**productRules** | [**List&lt;ProductRuleCode&gt;**](ProductRuleCode.md) | Gets or sets the list of product rules associated with the SafetyStockRule. |  [optional] |
|**quantity** | **Integer** | Gets or sets the quantity defined by the SafetyStockRule. |  [optional] |
|**rank** | **Integer** | Gets or sets the rank of the SafetyStockRule. When not given or zero, a value will be assigned. |  [optional] |
|**startDate** | **OffsetDateTime** | Start of the rule&#39;s effective window. Null &#x3D; no lower bound (already active). |  [optional] |


## Implemented Interfaces

* Serializable


