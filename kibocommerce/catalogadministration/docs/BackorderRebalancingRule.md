

# BackorderRebalancingRule

Contract DTO for a BackorderRebalancing rule. Rules determine priority ordering for shipments in the Backorder Queue when inventory becomes available.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**code** | **String** |  |  [optional] |
|**customerRules** | **List&lt;String&gt;** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**endDate** | **OffsetDateTime** | End of the rule&#39;s effective window. Null &#x3D; never expires. Must be &gt;&#x3D; StartDate when both supplied. |  [optional] |
|**isActive** | **Boolean** | Read-only. Computed server-side: true when the current UTC instant is inside the effective window (StartDate null/≤now AND EndDate null/≥now), false otherwise. A rule with no dates is always active. This reflects the effective window alone and does not incorporate the enabled flag. |  [optional] |
|**metaData** | **Object** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**productRules** | [**List&lt;ProductRuleCode&gt;**](ProductRuleCode.md) |  |  [optional] |
|**rank** | **Integer** |  |  [optional] |
|**shipmentRules** | [**List&lt;ShipmentRuleCode&gt;**](ShipmentRuleCode.md) |  |  [optional] |
|**sortAttribute** | **String** |  |  [optional] |
|**startDate** | **OffsetDateTime** | Start of the rule&#39;s effective window. Null &#x3D; no lower bound (already active). |  [optional] |
|**timeFenceDays** | **Integer** | Time fence in days. Inclusive [0, 365]. |  [optional] |


## Implemented Interfaces

* Serializable


