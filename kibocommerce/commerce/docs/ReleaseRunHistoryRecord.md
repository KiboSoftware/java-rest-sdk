

# ReleaseRunHistoryRecord

Audit record returned by the 4 history GET endpoints under `/commerce/jobs/release-rules/`. Schema mirrors the domain entity in `Mozu.CommerceRuntime.Domain.Entities.SupplyChain.ReleaseRules.ReleaseRunHistoryRecord`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callOffOrderId** | **String** |  |  [optional] |
|**callOffOrderNumber** | **Integer** |  |  [optional] |
|**eligibilityReason** | **String** |  |  [optional] |
|**failureDetail** | [**List&lt;ReleaseRunFailureDetail&gt;**](ReleaseRunFailureDetail.md) |  |  [optional] |
|**finishedAt** | **OffsetDateTime** |  |  [optional] |
|**holderId** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**lineOutcomes** | [**List&lt;ReleaseLineOutcome&gt;**](ReleaseLineOutcome.md) |  |  [optional] |
|**newHeaderStatus** | **String** |  |  [optional] |
|**outcome** | **String** |  |  [optional] |
|**previousHeaderStatus** | **String** |  |  [optional] |
|**ruleId** | **String** |  |  [optional] |
|**ruleRank** | **Integer** |  |  [optional] |
|**runId** | **String** |  |  [optional] |
|**salesOrderIds** | **List&lt;String&gt;** |  |  [optional] |
|**siteId** | **Integer** |  |  [optional] |
|**startedAt** | **OffsetDateTime** |  |  [optional] |
|**tenantId** | **Integer** |  |  [optional] |


## Implemented Interfaces

* Serializable


