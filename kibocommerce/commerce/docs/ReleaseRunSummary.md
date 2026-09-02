

# ReleaseRunSummary

Aggregated per-run summary returned by `GET /commerce/jobs/release-rules/runs`. Counts mirror the four terminal outcomes on `ReleaseRunOutcome`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**failedCount** | **Integer** |  |  [optional] |
|**finishedAt** | **OffsetDateTime** |  |  [optional] |
|**partialFailedCount** | **Integer** |  |  [optional] |
|**releasedCount** | **Integer** |  |  [optional] |
|**runId** | **String** |  |  [optional] |
|**siteId** | **Integer** |  |  [optional] |
|**skippedNotEligibleCount** | **Integer** |  |  [optional] |
|**startedAt** | **OffsetDateTime** |  |  [optional] |
|**tenantId** | **Integer** |  |  [optional] |
|**totalCount** | **Integer** |  |  [optional] |


## Implemented Interfaces

* Serializable


