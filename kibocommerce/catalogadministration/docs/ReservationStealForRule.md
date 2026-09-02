

# ReservationStealForRule

Reservation Steal-For Rule contract (CAT-7911). Structurally identical to Mozu.ProductAdmin.Contracts.ReservationRules.ReservationRule except it does not have `TimeFenceDays`; instead it adds an explicit Mozu.ProductAdmin.Contracts.ReservationStealForRules.ReservationStealForRule.StartDate/Mozu.ProductAdmin.Contracts.ReservationStealForRules.ReservationStealForRule.EndDate window during which the rule is enabled — the same effective-date-window concept used by Discounts and Price Lists, not a reworded time fence. Fully independent of the sibling Mozu.ProductAdmin.Contracts.ReservationStealFromRules.ReservationStealFromRule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**callOffOrderRules** | **List&lt;String&gt;** | Referenced call-off-order rule codes. Max 1 entry. |  [optional] |
|**code** | **String** | Unique identifier. Auto-generated when omitted on create. |  [optional] |
|**customerRules** | **List&lt;String&gt;** | Referenced customer rule codes. Max 1 entry. |  [optional] |
|**description** | **String** | Optional description, max 500 chars. |  [optional] |
|**enabled** | **Boolean** | Whether the rule is active. Defaults to true when omitted/null on create or update. |  [optional] |
|**endDate** | **OffsetDateTime** | End of the rule&#39;s effective window. Null &#x3D; never expires. Must be &gt;&#x3D; StartDate when both supplied. |  [optional] |
|**isActive** | **Boolean** | Read-only. Computed server-side: true when the current UTC instant is inside the effective window (StartDate null/≤now AND EndDate null/≥now), false otherwise. A rule with no dates is always active. This reflects the effective window alone and does not incorporate the enabled flag. |  [optional] |
|**metaData** | **Object** | Opaque JSON metadata. Passed through unchanged. |  [optional] |
|**name** | **String** | Display name. Required, max 200 chars. |  [optional] |
|**productRules** | [**List&lt;ProductRuleCode&gt;**](ProductRuleCode.md) | Referenced product rules. Max 1 entry. |  [optional] |
|**rank** | **Integer** | Priority rank, unique per master catalog within the tenant. Auto-assigned on create when omitted or ≤0. Rejected (not auto-assigned) on update when omitted or ≤0. |  [optional] |
|**sortAttribute** | **String** | Optional tiebreaker attribute name used by the reservation-stealing engine when two candidates match. Max 50 chars. |  [optional] |
|**startDate** | **OffsetDateTime** | Start of the rule&#39;s effective window. Null &#x3D; no lower bound. |  [optional] |
|**validForAllSites** | **Boolean** | When true the rule applies to all sites; ValidSites is ignored. When false/omitted and             ValidSites is also omitted, ValidSites auto-populates with the calling site from the request             context (FR-022); the save is rejected if no site context is available. |  [optional] |
|**validSites** | **List&lt;Integer&gt;** | Site IDs this rule applies to. |  [optional] |


## Implemented Interfaces

* Serializable


