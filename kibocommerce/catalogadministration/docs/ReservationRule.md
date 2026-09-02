

# ReservationRule

Reservation Rule contract (CAT-7686)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**callOffOrderRules** | **List&lt;String&gt;** | Referenced call-off-order rule codes. Max 1 entry. |  [optional] |
|**code** | **String** | Unique identifier. Auto-generated when omitted on create. |  [optional] |
|**customerRules** | **List&lt;String&gt;** | Referenced customer rule codes. Max 1 entry. |  [optional] |
|**description** | **String** | Optional description, max 500 chars. |  [optional] |
|**enabled** | **Boolean** | Whether the rule is active. Defaults to true on insert. |  [optional] |
|**endDate** | **OffsetDateTime** | End of the rule&#39;s effective window. Null &#x3D; never expires. Must be &gt;&#x3D; StartDate when both supplied. |  [optional] |
|**isActive** | **Boolean** | Read-only. Computed server-side: true when the current UTC instant is inside the effective window (StartDate null/≤now AND EndDate null/≥now), false otherwise. A rule with no dates is always active. This reflects the effective window alone and does not incorporate the enabled flag. |  [optional] |
|**metaData** | **Object** | Opaque JSON metadata. Passed through unchanged. |  [optional] |
|**name** | **String** | Display name. Required, max 200 chars. |  [optional] |
|**productRules** | [**List&lt;ProductRuleCode&gt;**](ProductRuleCode.md) | Referenced product rules. Max 1 entry. |  [optional] |
|**rank** | **Integer** | Priority rank, unique per master catalog within the tenant. Auto-assigned when omitted or ≤0. |  [optional] |
|**sortAttribute** | **String** | Optional tiebreaker attribute name used by the reservation engine when two call-off orders match. Max 50 chars. |  [optional] |
|**startDate** | **OffsetDateTime** | Start of the rule&#39;s effective window. Null &#x3D; no lower bound (already active). |  [optional] |
|**timeFenceDays** | **Integer** | Time fence in days. Inclusive [0, 365]. |  [optional] |
|**validForAllSites** | **Boolean** | When true the rule applies to all sites; ValidSites is ignored. |  [optional] |
|**validSites** | **List&lt;Integer&gt;** | Site IDs this rule applies to. Optional — when omitted and ValidForAllSites is not true, the server auto-sets ValidForAllSites&#x3D;true (FR-022). |  [optional] |


## Implemented Interfaces

* Serializable


