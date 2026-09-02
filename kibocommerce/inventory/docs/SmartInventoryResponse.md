

# SmartInventoryResponse

Response from smart inventory endpoints indicating the processing method used

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobID** | **String** | The job identifier for tracking asynchronous requests. This field is null for synchronous requests. |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) | The processing method used: &#39;sync&#39; for synchronous processing or &#39;async&#39; for asynchronous processing. Kibo determines the routing based on payload size. |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| SYNC | &quot;sync&quot; |
| ASYNC | &quot;async&quot; |


## Implemented Interfaces

* Serializable


