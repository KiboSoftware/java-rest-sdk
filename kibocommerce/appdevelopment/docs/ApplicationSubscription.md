

# ApplicationSubscription

Defines an event that an Application Version is subscribed to.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationSubscriptionId** | **Integer** | The unique identifier of an ApplicationVersionEvent record. |  [optional] |
|**applicationEndPoint** | **String** | The End Point where the event information will be sent to when the event is fired. |  [optional] |
|**events** | [**List&lt;AppDevEvent&gt;**](AppDevEvent.md) |  |  [optional] |
|**packageId** | **Integer** |  |  [optional] |
|**noCallback** | **Boolean** |  |  [optional] |


## Implemented Interfaces

* Serializable


