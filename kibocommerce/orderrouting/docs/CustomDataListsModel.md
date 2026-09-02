

# CustomDataListsModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customDataListId** | **Integer** |  |  [optional] |
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**entries** | [**List&lt;CustomDataListEntryModel&gt;**](CustomDataListEntryModel.md) |  |  [optional] |
|**entryCount** | **Integer** |  |  [optional] |
|**fileName** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |



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


