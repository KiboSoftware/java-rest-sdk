

# ProductMappingRequest

Request needed to interact with Product Mappings

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**direction** | [**DirectionEnum**](#DirectionEnum) | Enum for direction of the mapping |  [optional] |
|**mapping** | [**MappingEnum**](#MappingEnum) | Enum for mapping rule |  [optional] |
|**locationCode** | **String** | Location Code |  [optional] |
|**pageNum** | **Integer** | which page to show |  [optional] |
|**pageSize** | **Integer** | how many results to show per page |  [optional] |
|**sortBy** | **String** | index to sort results by |  [optional] |
|**userID** | **Integer** | user id |  [optional] |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| INBOUND | &quot;INBOUND&quot; |
| OUTBOUND | &quot;OUTBOUND&quot; |
| SKIP | &quot;SKIP&quot; |



## Enum: MappingEnum

| Name | Value |
|---- | -----|
| DEFAULT_MAPPING | &quot;DEFAULT_MAPPING&quot; |
| CUSTOM_MAPPING_PART_TO_ALL | &quot;CUSTOM_MAPPING_PART_TO_ALL&quot; |
| CUSTOM_MAPPING_PART_TO_SKU | &quot;CUSTOM_MAPPING_PART_TO_SKU&quot; |
| CUSTOM_MAPPING_ONLY_UPC | &quot;CUSTOM_MAPPING_ONLY_UPC&quot; |
| CUSTOM_MAPPING_PART_TO_UPC_IF_EMPTY | &quot;CUSTOM_MAPPING_PART_TO_UPC_IF_EMPTY&quot; |
| CUSTOM_MAPPING_SKU_TO_PART_UPC_SKU | &quot;CUSTOM_MAPPING_SKU_TO_PART_UPC_SKU&quot; |
| CUSTOM_MAPPING_SKU_TO_PART | &quot;CUSTOM_MAPPING_SKU_TO_PART&quot; |


## Implemented Interfaces

* Serializable


