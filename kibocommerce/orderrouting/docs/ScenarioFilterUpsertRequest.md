

# ScenarioFilterUpsertRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**booleanOperator** | [**BooleanOperatorEnum**](#BooleanOperatorEnum) |  |  |
|**changed** | **Boolean** |  |  [optional] |
|**customValue** | **Object** |  |  [optional] |
|**customValueUnit** | **String** |  |  [optional] |
|**dataListID** | **Integer** |  |  [optional] |
|**dataPointAttributePath** | **String** |  |  [optional] |
|**dataPointExtensibleAttributeFQN** | **String** |  |  [optional] |
|**dataPointExtensibleAttributeName** | **String** |  |  [optional] |
|**dataPointExtensibleAttributeType** | **String** |  |  [optional] |
|**extensibleAttributeFQN** | **String** |  |  [optional] |
|**extensibleAttributeName** | **String** |  |  [optional] |
|**filterAttributePath** | **String** |  |  |
|**filterID** | **Integer** |  |  [optional] |
|**filterLogicalGroupOrderIndex** | **Integer** |  |  |
|**filterType** | [**FilterTypeEnum**](#FilterTypeEnum) |  |  |
|**isDataPointExtensible** | **Boolean** |  |  [optional] |
|**isExtensible** | **Boolean** |  |  [optional] |
|**itemCustomAttributeName** | **String** |  |  [optional] |
|**name** | **String** |  |  |
|**orderIndex** | **Integer** |  |  |



## Enum: BooleanOperatorEnum

| Name | Value |
|---- | -----|
| EQUAL | &quot;filter.logic.equal&quot; |
| NOT_EQUAL | &quot;filter.logic.not.equal&quot; |
| GREATER_THAN | &quot;filter.logic.greater.than&quot; |
| LESS_THAN | &quot;filter.logic.less.than&quot; |
| GREATER_OR_EQUAL | &quot;filter.logic.greater.or.equal&quot; |
| LESS_OR_EQUAL | &quot;filter.logic.less.or.equal&quot; |
| IN | &quot;filter.logic.in&quot; |
| NOT_IN | &quot;filter.logic.not.in&quot; |
| BETWEEN | &quot;filter.logic.between&quot; |
| STARTS_WITH | &quot;filter.logic.starts.with&quot; |
| ENDS_WITH | &quot;filter.logic.ends.with&quot; |
| CONTAINS | &quot;filter.logic.contains&quot; |
| DOES_NOT_CONTAIN | &quot;filter.logic.does.not.contain&quot; |
| SUBSET | &quot;filter.logic.subset&quot; |



## Enum: FilterTypeEnum

| Name | Value |
|---- | -----|
| CUSTOMVALUE | &quot;filter.type.customValue&quot; |
| CUSTOMDATALIST | &quot;filter.type.customDataList&quot; |
| DATASET | &quot;filter.type.dataSet&quot; |
| DATAPOINT | &quot;filter.type.dataPoint&quot; |


## Implemented Interfaces

* Serializable


