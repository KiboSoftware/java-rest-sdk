

# ExportSettings

Export Settings

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**directShip** | **Boolean** | Flag for only using locations with Direct Ship enabled |  [optional] |
|**exportSingleFile** | **Boolean** | Flag for exporting as a single file |  [optional] |
|**exportType** | [**ExportTypeEnum**](#ExportTypeEnum) | Type of exportGG for the settings |  |
|**fileFormat** | [**FileFormatEnum**](#FileFormatEnum) | Format for the export file |  |
|**fileName** | **String** | Name for the export file |  [optional] |
|**floor** | [**FloorEnum**](#FloorEnum) | Floor |  [optional] |
|**ftpInformation** | [**List&lt;ExportSettingsFTP&gt;**](ExportSettingsFTP.md) | List of export FTP settings |  |
|**ignoreNegativeInventoryLocations** | **Boolean** | Flag for excluding negative inventory locations |  [optional] |
|**includeAttributes** | **Boolean** | Flag for including attributes |  [optional] |
|**isClassic** | **Boolean** | Flag for marking the setting as a classic export |  [optional] |
|**locationGroupIDs** | **List&lt;Integer&gt;** | Location Group Ids associated with the settings |  [optional] |
|**ltd** | [**LtdEnum**](#LtdEnum) | LTD |  [optional] |
|**name** | **String** | Export Settings Name |  |
|**onlySendActiveLocations** | **Boolean** | Flag for only sending from active locations |  [optional] |
|**onlySendAvailable** | **Boolean** | Flag for only sending available |  [optional] |
|**pickup** | **Boolean** | Flag for only using locations with In Store Pickup enabled |  [optional] |
|**productMapping** | [**ProductMappingEnum**](#ProductMappingEnum) | Enum for export productMapping |  [optional] |
|**s3Information** | [**List&lt;ExportSettingsS3&gt;**](ExportSettingsS3.md) | List of export S3 settings |  [optional] |
|**safetyStock** | [**SafetyStockEnum**](#SafetyStockEnum) | Safety Stock |  [optional] |
|**shortenFilename** | **Boolean** | Flag for using shortened filenames |  [optional] |
|**siteIDs** | **List&lt;Integer&gt;** | Site Ids associated with the settings |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Associative Map of &lt;String, String&gt; for tagCategoryName &#x3D;&gt; tagName |  [optional] |
|**transfer** | **Boolean** | Flag for only using locations with Transfer enabled |  [optional] |
|**untransformedFileName** | **String** | Untransformed File Name |  [optional] |
|**untransformedZipFileName** | **String** | Untransformed Zip File Name |  [optional] |
|**zipFileName** | **String** | Name for the zipped file |  [optional] |
|**zipFiles** | **Boolean** | Flag for zipping the files |  [optional] |



## Enum: ExportTypeEnum

| Name | Value |
|---- | -----|
| AGGREGATE | &quot;AGGREGATE&quot; |
| LOCATION | &quot;LOCATION&quot; |



## Enum: FileFormatEnum

| Name | Value |
|---- | -----|
| XML | &quot;XML&quot; |
| CSV | &quot;CSV&quot; |



## Enum: FloorEnum

| Name | Value |
|---- | -----|
| MAX | &quot;FLOOR_MAX&quot; |
| MIN | &quot;FLOOR_MIN&quot; |
| AVG | &quot;FLOOR_AVG&quot; |
| SUM | &quot;FLOOR_SUM&quot; |



## Enum: LtdEnum

| Name | Value |
|---- | -----|
| MAX | &quot;LTD_MAX&quot; |
| MIN | &quot;LTD_MIN&quot; |
| AVG | &quot;LTD_AVG&quot; |
| SUM | &quot;LTD_SUM&quot; |



## Enum: ProductMappingEnum

| Name | Value |
|---- | -----|
| PART_NUMBER_WITH_UPC | &quot;SWAP_PART_NUMBER_WITH_UPC&quot; |
| SKU_WITH_UPC | &quot;SWAP_SKU_WITH_UPC&quot; |



## Enum: SafetyStockEnum

| Name | Value |
|---- | -----|
| MAX | &quot;SAFETY_STOCK_MAX&quot; |
| MIN | &quot;SAFETY_STOCK_MIN&quot; |
| AVG | &quot;SAFETY_STOCK_AVG&quot; |
| SUM | &quot;SAFETY_STOCK_SUM&quot; |


## Implemented Interfaces

* Serializable


