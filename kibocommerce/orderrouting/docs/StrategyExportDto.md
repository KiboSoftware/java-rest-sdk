

# StrategyExportDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** |  |  [optional] |
|**candidateSortStrategy** | [**CandidateSortStrategyEnum**](#CandidateSortStrategyEnum) |  |  [optional] |
|**dependentDataLists** | [**List&lt;CustomDataListsModel&gt;**](CustomDataListsModel.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) |  |  [optional] |
|**preferAtomicAssignments** | **Boolean** |  |  [optional] |
|**scenarios** | [**List&lt;ScenarioResponse&gt;**](ScenarioResponse.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**strategyId** | **String** |  |  [optional] |



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



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| LIVE | &quot;LIVE&quot; |
| STAGED | &quot;STAGED&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |
| IGNORED | &quot;IGNORED&quot; |


## Implemented Interfaces

* Serializable


