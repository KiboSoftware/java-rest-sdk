

# CustomDataList


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**created** | **OffsetDateTime** |  |  [optional] |
|**creatorUsername** | **String** |  |  [optional] |
|**customDataListID** | **Integer** |  |  [optional] |
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) |  |  |
|**entries** | [**List&lt;CustomDataListEntry&gt;**](CustomDataListEntry.md) |  |  [optional] |
|**environmentID** | **Integer** |  |  |
|**fileName** | **String** |  |  [optional] |
|**name** | **String** |  |  |
|**notes** | **String** |  |  [optional] |
|**pathString** | **String** |  |  [optional] |
|**persisted** | **Boolean** |  |  [optional] |
|**siteID** | **Integer** |  |  |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**stringValues** | **Set&lt;String&gt;** |  |  [optional] |
|**tenantID** | **Integer** |  |  |
|**updated** | **OffsetDateTime** |  |  [optional] |
|**updaterUsername** | **String** |  |  [optional] |
|**userContext** | [**UserContextInformation**](UserContextInformation.md) |  |  [optional] |
|**values** | **Set&lt;Object&gt;** |  |  [optional] |



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


