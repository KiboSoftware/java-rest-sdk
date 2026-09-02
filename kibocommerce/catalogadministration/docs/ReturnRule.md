

# ReturnRule

Return Rule contract

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**code** | **String** | Unique identifier of the Return. |  [optional] |
|**customerRules** | **List&lt;String&gt;** | List of customer rule codes that apply to the Return |  [optional] |
|**description** | **String** | Return description |  [optional] |
|**enabled** | **Boolean** | Indicates if the Return is enabled |  [optional] |
|**endDate** | **OffsetDateTime** | End of the rule&#39;s effective window. Null &#x3D; never expires. Must be &gt;&#x3D; StartDate when both supplied. |  [optional] |
|**isActive** | **Boolean** | Read-only. Computed server-side: true when the current UTC instant is inside the effective window (StartDate null/≤now AND EndDate null/≥now), false otherwise. A rule with no dates is always active. This reflects the effective window alone and does not incorporate the enabled flag. |  [optional] |
|**isReturnable** | **Boolean** | Indicates if the Return is IsReturnable |  [optional] |
|**maxDays** | **Integer** | Maximum Days of the Return |  [optional] |
|**maxQty** | **Integer** | Maximum quantity of the Return |  [optional] |
|**metaData** | **Object** | Metadata for the ReturnRule which is a json format, used to store additional information |  [optional] |
|**name** | **String** | Return name |  [optional] |
|**productRules** | **List&lt;String&gt;** | List of product rule codes that apply to the Return |  [optional] |
|**rank** | **Integer** | Rank of the Return |  [optional] |
|**startDate** | **OffsetDateTime** | Start of the rule&#39;s effective window. Null &#x3D; no lower bound (already active). |  [optional] |
|**validForAllSites** | **Boolean** | Indicates if the ReturnRule is valid for all sites |  [optional] |
|**validSites** | **List&lt;Integer&gt;** | List of site IDs that the ReturnRule is valid for |  [optional] |


## Implemented Interfaces

* Serializable


