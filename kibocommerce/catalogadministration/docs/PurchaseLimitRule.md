

# PurchaseLimitRule

Purchase Limit Rule contract

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**code** | **String** | Unique identifier of the PurchaseLimit. |  [optional] |
|**customerRules** | **List&lt;String&gt;** | List of customer rule codes that apply to the PurchaseLimit |  [optional] |
|**description** | **String** | PurchaseLimit description |  [optional] |
|**enabled** | **Boolean** | Indicates if the PurchaseLimit is enabled |  [optional] |
|**endDate** | **OffsetDateTime** | End of the rule&#39;s effective window. Null &#x3D; never expires. Must be &gt;&#x3D; StartDate when both supplied. |  [optional] |
|**isActive** | **Boolean** | Read-only. Computed server-side: true when the current UTC instant is inside the effective window (StartDate null/≤now AND EndDate null/≥now), false otherwise. A rule with no dates is always active. This reflects the effective window alone and does not incorporate the enabled flag. |  [optional] |
|**maxQty** | **Integer** | Maximum quantity of the PurchaseLimit |  [optional] |
|**metaData** | **Object** | Metadata for the PurchaseLimit which is a json format, used to store additional information |  [optional] |
|**name** | **String** | PurchaseLimit name |  [optional] |
|**productRules** | **List&lt;String&gt;** | List of product rule codes that apply to the PurchaseLimit |  [optional] |
|**rank** | **Integer** | Rank of the PurchaseLimit |  [optional] |
|**startDate** | **OffsetDateTime** | Start of the rule&#39;s effective window. Null &#x3D; no lower bound (already active). |  [optional] |
|**validForAllSites** | **Boolean** | Indicates if the PurchaseLimit is valid for all sites |  [optional] |
|**validSites** | **List&lt;Integer&gt;** | List of site IDs that the PurchaseLimit is valid for |  [optional] |


## Implemented Interfaces

* Serializable


