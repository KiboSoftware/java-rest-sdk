

# PickWaveRule

Represents a rule for pick wave in the product administration system.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**code** | **String** | Gets or sets the unique identifier of the PickWaveRule. If not given provided on create one will be assigned. Read-only after creation. |  [optional] |
|**customerRules** | **List&lt;String&gt;** | Gets or sets the list of Customer Rule where the PickWaveRule applies. |  [optional] |
|**description** | **String** | Gets or sets the description of the PickWaveRule. |  [optional] |
|**enabled** | **Boolean** | Gets or sets whether the PickWaveRule is enabled. |  [optional] |
|**endDate** | **OffsetDateTime** | End of the rule&#39;s effective window. Null &#x3D; never expires. Must be &gt;&#x3D; StartDate when both supplied. |  [optional] |
|**isActive** | **Boolean** | Read-only. Computed server-side: true when the current UTC instant is inside the effective window (StartDate null/≤now AND EndDate null/≥now), false otherwise. A rule with no dates is always active. This reflects the effective window alone and does not incorporate the enabled flag. |  [optional] |
|**name** | **String** | Gets or sets the name of the PickWaveRule. |  [optional] |
|**productRules** | [**List&lt;ProductRuleCode&gt;**](ProductRuleCode.md) | Gets or sets the list of product rules associated with the PickWaveRule. |  [optional] |
|**shipmentRules** | [**List&lt;ShipmentRuleCode&gt;**](ShipmentRuleCode.md) | Gets or sets the list of Shipment Rule where the PickWaveRule applies. |  [optional] |
|**startDate** | **OffsetDateTime** | Start of the rule&#39;s effective window. Null &#x3D; no lower bound (already active). |  [optional] |


## Implemented Interfaces

* Serializable


