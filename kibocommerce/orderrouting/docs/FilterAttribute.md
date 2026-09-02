

# FilterAttribute


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extensibleAttributeFQN** | **String** |  |  [optional] |
|**filterTypeGroup** | [**FilterTypeGroupEnum**](#FilterTypeGroupEnum) |  |  [optional] |
|**langTag** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**propertyPath** | **String** |  |  [optional] |
|**unitType** | [**UnitTypeEnum**](#UnitTypeEnum) |  |  [optional] |
|**vocabularyListValues** | **String** |  |  [optional] |



## Enum: FilterTypeGroupEnum

| Name | Value |
|---- | -----|
| ORDER_INFO | &quot;ORDER_INFO&quot; |
| FULFILLMENT_LOCATION_INFO | &quot;FULFILLMENT_LOCATION_INFO&quot; |
| FULFILLMENT_INVENTORY_INFO | &quot;FULFILLMENT_INVENTORY_INFO&quot; |
| ITEM_ATTRIBUTES | &quot;ITEM_ATTRIBUTES&quot; |
| CUSTOMER_INFORMATION | &quot;CUSTOMER_INFORMATION&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| EXTENSIBLE_FULFILLMENT_LOCATION_INFO | &quot;EXTENSIBLE_FULFILLMENT_LOCATION_INFO&quot; |
| EXTENSIBLE_ORDER_INFO | &quot;EXTENSIBLE_ORDER_INFO&quot; |
| EXTENSIBLE_PRODUCT_INFO | &quot;EXTENSIBLE_PRODUCT_INFO&quot; |
| EXTENSIBLE_CUSTOMER_INFO | &quot;EXTENSIBLE_CUSTOMER_INFO&quot; |
| EXTENSIBLE_B2B_CUSTOMER_INFO | &quot;EXTENSIBLE_B2B_CUSTOMER_INFO&quot; |
| EXTENSIBLE_INVENTORY_INFO | &quot;EXTENSIBLE_INVENTORY_INFO&quot; |



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


