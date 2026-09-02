

# EDDOrderItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**backorderable** | **Boolean** |  |  [optional] |
|**basicItem** | **Boolean** |  |  [optional] |
|**condition** | **String** |  |  [optional] |
|**customItemData** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**dimensionUnit** | [**DimensionUnitEnum**](#DimensionUnitEnum) |  |  [optional] |
|**extendedProductInfo** | [**ExtendedProductInfo**](ExtendedProductInfo.md) |  |  [optional] |
|**futureOrderable** | **Boolean** |  |  [optional] |
|**granularInventoryItem** | **Boolean** |  |  [optional] |
|**height** | **Double** |  |  [optional] |
|**isPreassigned** | **Boolean** |  |  [optional] |
|**itemDependency** | **Integer** |  |  [optional] |
|**length** | **Double** |  |  [optional] |
|**orderItemID** | **Integer** |  |  [optional] |
|**partNumber** | **String** |  |  [optional] |
|**preAssignedLocations** | [**List&lt;PreAssignedLocation&gt;**](PreAssignedLocation.md) |  |  [optional] |
|**productChildItems** | [**List&lt;ProductChildItem&gt;**](ProductChildItem.md) |  |  [optional] |
|**productTitle** | **String** |  |  [optional] |
|**productUsage** | [**ProductUsageEnum**](#ProductUsageEnum) |  |  [optional] |
|**quantity** | **Integer** |  |  [optional] |
|**serialNumber** | **String** |  |  [optional] |
|**shippingMethod** | **String** |  |  [optional] |
|**sku** | **String** |  |  [optional] |
|**tags** | **Map&lt;String, String&gt;** |  |  [optional] |
|**taxable** | **Boolean** |  |  [optional] |
|**upc** | **String** |  |  [optional] |
|**weight** | **Double** |  |  [optional] |
|**weightUnit** | [**WeightUnitEnum**](#WeightUnitEnum) |  |  [optional] |
|**width** | **Double** |  |  [optional] |



## Enum: DimensionUnitEnum

| Name | Value |
|---- | -----|
| KG | &quot;kg&quot; |
| CM | &quot;cm&quot; |
| M | &quot;m&quot; |
| LITERS | &quot;liters&quot; |
| GRAMS | &quot;grams&quot; |
| OZ | &quot;oz&quot; |
| LB | &quot;lb&quot; |
| INCHES | &quot;inches&quot; |
| FT | &quot;ft&quot; |



## Enum: ProductUsageEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;standard&quot; |
| CONFIGURABLE | &quot;configurable&quot; |
| BUNDLE | &quot;bundle&quot; |
| PRODUCTWITHEXTRAS | &quot;productWithExtras&quot; |



## Enum: WeightUnitEnum

| Name | Value |
|---- | -----|
| KG | &quot;kg&quot; |
| CM | &quot;cm&quot; |
| M | &quot;m&quot; |
| LITERS | &quot;liters&quot; |
| GRAMS | &quot;grams&quot; |
| OZ | &quot;oz&quot; |
| LB | &quot;lb&quot; |
| INCHES | &quot;inches&quot; |
| FT | &quot;ft&quot; |


## Implemented Interfaces

* Serializable


