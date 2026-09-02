

# LocationSort


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**created** | **OffsetDateTime** |  |  [optional] |
|**creatorUsername** | **String** |  |  [optional] |
|**descending** | **Boolean** |  |  [optional] |
|**environmentID** | **Integer** |  |  |
|**locationSortID** | **Integer** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**pathString** | **String** |  |  [optional] |
|**persisted** | **Boolean** |  |  [optional] |
|**siteID** | **Integer** |  |  |
|**sortingType** | [**SortingTypeEnum**](#SortingTypeEnum) |  |  |
|**suggestionEventListeners** | **Set&lt;Object&gt;** |  |  [optional] |
|**tenantID** | **Integer** |  |  |
|**updated** | **OffsetDateTime** |  |  [optional] |
|**updaterUsername** | **String** |  |  [optional] |
|**userContext** | [**UserContextInformation**](UserContextInformation.md) |  |  [optional] |



## Enum: SortingTypeEnum

| Name | Value |
|---- | -----|
| RANK | &quot;RANK&quot; |
| DISTANCE | &quot;DISTANCE&quot; |
| LTD | &quot;LTD&quot; |
| COST | &quot;COST&quot; |
| RANDOM | &quot;RANDOM&quot; |
| DATA_SET | &quot;DATA_SET&quot; |
| LOWEST_AVAILABLE | &quot;LOWEST_AVAILABLE&quot; |


## Implemented Interfaces

* Serializable


