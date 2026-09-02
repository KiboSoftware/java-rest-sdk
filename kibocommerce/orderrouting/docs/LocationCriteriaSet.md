

# LocationCriteriaSet


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**columnDefinitions** | [**Set&lt;LocationCriteriaSetDataDefinition&gt;**](LocationCriteriaSetDataDefinition.md) |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] |
|**creatorUsername** | **String** |  |  [optional] |
|**environmentID** | **Integer** |  |  |
|**fileName** | **String** |  |  |
|**locationCriteriaSetID** | **Integer** |  |  [optional] |
|**locationCriteriaSetMap** | [**SetMultimapIntegerLocationCriteriaSetRow**](SetMultimapIntegerLocationCriteriaSetRow.md) |  |  [optional] |
|**locationCriteriaSetRows** | [**SetMultimapIntegerLocationCriteriaSetRow**](SetMultimapIntegerLocationCriteriaSetRow.md) |  |  [optional] |
|**pathString** | **String** |  |  [optional] |
|**persisted** | **Boolean** |  |  [optional] |
|**readyState** | [**ReadyStateEnum**](#ReadyStateEnum) |  |  [optional] |
|**siteID** | **Integer** |  |  |
|**tenantID** | **Integer** |  |  |
|**updated** | **OffsetDateTime** |  |  [optional] |
|**updaterUsername** | **String** |  |  [optional] |
|**userContext** | [**UserContextInformation**](UserContextInformation.md) |  |  [optional] |



## Enum: ReadyStateEnum

| Name | Value |
|---- | -----|
| READY | &quot;dataset.ready&quot; |
| PROCESSING | &quot;dataset.processing&quot; |
| ERROR_PROCESSING | &quot;dataset.error.processing&quot; |


## Implemented Interfaces

* Serializable


