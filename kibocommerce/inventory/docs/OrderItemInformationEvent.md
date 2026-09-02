

# OrderItemInformationEvent

Order Item Information Event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **String** | Date of the event |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Type of event |  [optional] |
|**quantity** | **Integer** | Quantity |  [optional] |
|**messages** | **List&lt;String&gt;** | List of messages |  [optional] |
|**numResults** | **Integer** | Number of results |  [optional] |
|**success** | **Boolean** | Flag for success |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| ALLOCATED | &quot;ALLOCATED&quot; |
| DEALLOCATED | &quot;DEALLOCATED&quot; |
| FULFILLED | &quot;FULFILLED&quot; |
| PICKED | &quot;PICKED&quot; |
| DEALLOCATE_FULFILL | &quot;DEALLOCATE_FULFILL&quot; |


## Implemented Interfaces

* Serializable


