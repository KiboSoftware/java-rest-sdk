

# ApplicationSubscription

Defines an event that an Application Version is subscribed to.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationEndPoint** | **String** | The End Point where the event information will be sent to when the event is fired. |  [optional] |
|**applicationSubscriptionId** | **Integer** | The unique identifier of an ApplicationVersionEvent record. |  [optional] |
|**events** | [**List&lt;AppDevEvent&gt;**](AppDevEvent.md) |  |  [optional] |
|**noCallback** | **Boolean** |  |  [optional] |
|**packageId** | **Integer** |  |  [optional] |


## Implemented Interfaces

* Serializable


