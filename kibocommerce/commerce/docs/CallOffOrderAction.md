

# CallOffOrderAction

Request payload for executing a lifecycle action on a Call-Off Order (e.g. cancel, release).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionName** | **String** | Name of the action to execute. Must be present in the call-off order&#39;s current AvailableActions list. |  [optional] |
|**itemIds** | **List&lt;String&gt;** | Optional list of item IDs to target. When null or empty, the action applies to every item on the order. |  [optional] |
|**reason** | [**Reason**](Reason.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


