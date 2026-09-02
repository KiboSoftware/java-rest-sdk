

# LocationCriteriaSetDataDefinition


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**columnName** | **String** |  |  |
|**created** | **OffsetDateTime** |  |  [optional] |
|**creatorUsername** | **String** |  |  [optional] |
|**dataDefinitionID** | **Integer** |  |  [optional] |
|**dataUnitString** | **String** |  |  [optional] |
|**defaultValue** | **String** |  |  [optional] |
|**environmentID** | **Integer** |  |  |
|**filterable** | **Boolean** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**pathString** | **String** |  |  [optional] |
|**persisted** | **Boolean** |  |  [optional] |
|**siteID** | **Integer** |  |  |
|**sortable** | **Boolean** |  |  [optional] |
|**tenantID** | **Integer** |  |  |
|**unit** | [**AbstractFilterFilterUnit**](AbstractFilterFilterUnit.md) |  |  [optional] |
|**unitType** | [**UnitTypeEnum**](#UnitTypeEnum) |  |  [optional] |
|**updated** | **OffsetDateTime** |  |  [optional] |
|**updaterUsername** | **String** |  |  [optional] |
|**userContext** | [**UserContextInformation**](UserContextInformation.md) |  |  [optional] |



## Enum: UnitTypeEnum

| Name | Value |
|---- | -----|
| CURRENCY | &quot;unit.type.currency&quot; |
| DISTANCE | &quot;unit.type.distance&quot; |
| LENGTH | &quot;unit.type.length&quot; |
| VOLUME | &quot;unit.type.volume&quot; |
| AREA | &quot;unit.type.area&quot; |
| WEIGHT | &quot;unit.type.weight&quot; |
| DIMENSIONLESS | &quot;unit.type.dimensionless&quot; |


## Implemented Interfaces

* Serializable


