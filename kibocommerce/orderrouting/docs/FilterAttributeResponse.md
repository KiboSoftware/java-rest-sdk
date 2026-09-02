

# FilterAttributeResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedValues** | **List&lt;String&gt;** |  |  [optional] |
|**customValueTypes** | **List&lt;String&gt;** |  |  [optional] |
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) |  |  [optional] |
|**extensibleAttributeFQN** | **String** |  |  [optional] |
|**filterAttributePath** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**isExtensible** | **Boolean** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**unitOptions** | **List&lt;String&gt;** |  |  [optional] |
|**unitType** | [**UnitTypeEnum**](#UnitTypeEnum) |  |  [optional] |



## Enum: DataTypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;STRING&quot; |
| STRING_LIST | &quot;STRING_LIST&quot; |
| NUMBER | &quot;NUMBER&quot; |
| NUMBER_LIST | &quot;NUMBER_LIST&quot; |
| BOOLEAN | &quot;BOOLEAN&quot; |
| DATE | &quot;DATE&quot; |



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


