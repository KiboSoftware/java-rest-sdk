

# UpdateStrategyResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** |  |  [optional] |
|**candidateSortStrategy** | [**CandidateSortStrategyEnum**](#CandidateSortStrategyEnum) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) |  |  [optional] |
|**preferAtomicAssignments** | **Boolean** |  |  [optional] |
|**scenarios** | [**List&lt;ScenarioRankDto&gt;**](ScenarioRankDto.md) |  |  [optional] |
|**strategyID** | **String** |  |  [optional] |



## Enum: CandidateSortStrategyEnum

| Name | Value |
|---- | -----|
| MINIMIZE_SHIPMENTS | &quot;MINIMIZE_SHIPMENTS&quot; |
| GROUP_RANK_AND_QUANTITY | &quot;GROUP_RANK_AND_QUANTITY&quot; |
| QUANTITY | &quot;QUANTITY&quot; |
| DISTANCE | &quot;DISTANCE&quot; |



## Enum: OrderTypeEnum

| Name | Value |
|---- | -----|
| DIRECTSHIP | &quot;DIRECTSHIP&quot; |
| TRANSFER | &quot;TRANSFER&quot; |
| STH_CONSOLIDATED | &quot;STH_CONSOLIDATED&quot; |
| RETURN | &quot;RETURN&quot; |
| DISPOSITION | &quot;DISPOSITION&quot; |
| DELIVERY | &quot;DELIVERY&quot; |
| BOPIS | &quot;BOPIS&quot; |


## Implemented Interfaces

* Serializable


