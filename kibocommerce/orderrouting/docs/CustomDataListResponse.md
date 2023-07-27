

# CustomDataListResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**created** | **String** |  |  [optional] |
|**creator** | **String** |  |  [optional] |
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) |  |  [optional] |
|**entries** | [**List&lt;CustomDataListEntryResponse&gt;**](CustomDataListEntryResponse.md) |  |  [optional] |
|**environmentID** | **Integer** |  |  [optional] |
|**id** | **Integer** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**notes** | **String** |  |  [optional] |
|**siteID** | **Integer** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**tenantID** | **Integer** |  |  [optional] |
|**updated** | **String** |  |  [optional] |
|**updater** | **String** |  |  [optional] |



## Enum: DataTypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;STRING&quot; |
| NUMBER | &quot;NUMBER&quot; |
| LOCATION | &quot;LOCATION&quot; |
| DATE | &quot;DATE&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| READY | &quot;dataset.ready&quot; |
| PROCESSING | &quot;dataset.processing&quot; |
| ERROR_PROCESSING | &quot;dataset.error.processing&quot; |


## Implemented Interfaces

* Serializable


