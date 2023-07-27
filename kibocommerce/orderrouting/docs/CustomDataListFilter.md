

# CustomDataListFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**booleanOperator** | [**BooleanOperatorEnum**](#BooleanOperatorEnum) |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] |
|**creatorUsername** | **String** |  |  [optional] |
|**customAttributeName** | **String** |  |  [optional] |
|**customDataListID** | **Integer** |  |  [optional] |
|**dataPointExtensibleAttributeFQN** | **String** |  |  [optional] |
|**dataPointExtensibleAttributeName** | **String** |  |  [optional] |
|**dataPointExtensibleAttributeType** | **String** |  |  [optional] |
|**dataPointExtensibleFilter** | **Boolean** |  |  [optional] |
|**dotDelimitedPropertyName** | **String** |  |  [optional] |
|**environmentID** | **Integer** |  |  [optional] |
|**extensibleAttributeFQN** | **String** |  |  [optional] |
|**extensibleAttributeName** | **String** |  |  [optional] |
|**extensibleAttributeType** | **String** |  |  [optional] |
|**extensibleFilter** | **Boolean** |  |  [optional] |
|**filterID** | **Integer** |  |  [optional] |
|**filterUnit** | [**UnitOfobject**](UnitOfobject.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**pathString** | **String** |  |  [optional] |
|**persisted** | **Boolean** |  |  [optional] |
|**siteID** | **Integer** |  |  [optional] |
|**tenantID** | **Integer** |  |  [optional] |
|**updated** | **OffsetDateTime** |  |  [optional] |
|**updaterUsername** | **String** |  |  [optional] |
|**userContext** | [**UserContextInformation**](UserContextInformation.md) |  |  [optional] |



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
| SUBSET | &quot;filter.logic.subset&quot; |


## Implemented Interfaces

* Serializable


