

# CallOffReleaseRule

Call-Off Release Rule contract (CAT-7736). Tenant-owned, internally master-catalog-scoped ranked admin rule for the B2B Supply Chain OMS call-off order release pipeline.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**callOffOrderRules** | **List&lt;String&gt;** | Referenced Call-Off-Order Rule codes. Max 1 entry. At least one of ProductRules, CustomerRules, or CallOffOrderRules must be non-empty (FR-007, FR-008). |  [optional] |
|**code** | **String** | Unique identifier. Auto-generated on create if not supplied. Immutable after creation. Max 30 characters; must match GeneralAlphaNumericCharactersRegex (FR-005, FR-016). |  [optional] |
|**customerRules** | **List&lt;String&gt;** | Referenced Customer Rule codes. Max 1 entry (FR-007, FR-008). |  [optional] |
|**daysBeforeShipDate** | **Integer** | Days before the ship date within which this rule applies. Inclusive [0, 365] (FR-015). |  [optional] |
|**description** | **String** | Optional description. Max 500 characters (FR-003). |  [optional] |
|**enabled** | **Boolean** | Whether the rule is active. Defaults to true on insert (FR-003, FR-011). |  [optional] |
|**endDate** | **OffsetDateTime** | End of the rule&#39;s effective window. Null &#x3D; never expires. Must be &gt;&#x3D; StartDate when both supplied. |  [optional] |
|**isActive** | **Boolean** | Read-only. Computed server-side: true when the current UTC instant is inside the effective window (StartDate null/≤now AND EndDate null/≥now), false otherwise. A rule with no dates is always active. This reflects the effective window alone and does not incorporate the enabled flag. |  [optional] |
|**metaData** | **Object** | Opaque JSON metadata passthrough. Persisted as nvarchar(MAX). Cleared on PUT if omitted (FR-023). |  [optional] |
|**minimumFillRate** | **Integer** | Minimum fill rate threshold [0, 100] (integer percentage). 0 is valid (FR-027). |  [optional] |
|**name** | **String** | Display name. Required. Max 200 characters (FR-003). |  [optional] |
|**productRules** | [**List&lt;ProductRuleCode&gt;**](ProductRuleCode.md) | Referenced Product Rule criteria. Max 1 entry. Each entry requires both code and masterCatalogId; the (code, masterCatalogId) pair must resolve to an existing ProductRule with RuleType&#x3D;CallOffRelease (FR-007, FR-008). |  [optional] |
|**rank** | **Integer** | Priority rank, unique per (TenantId, MasterCatalogId). Auto-assigned to MAX(Rank)+1 when omitted or ≤0 on create (FR-006, FR-017). |  [optional] |
|**sortAttribute** | **String** | Optional tiebreaker attribute name used by the downstream call-off release engine. Max 50 characters. null, absent, and empty are all accepted (FR-026). |  [optional] |
|**startDate** | **OffsetDateTime** | Start of the rule&#39;s effective window. Null &#x3D; no lower bound (already active). |  [optional] |
|**validForAllSites** | **Boolean** | When true the rule applies to all tenant sites; ValidSites is ignored (FR-022). |  [optional] |
|**validSites** | **List&lt;Integer&gt;** | Site IDs this rule applies to. Each must be tenant-owned (FR-007, FR-022). |  [optional] |


## Implemented Interfaces

* Serializable


