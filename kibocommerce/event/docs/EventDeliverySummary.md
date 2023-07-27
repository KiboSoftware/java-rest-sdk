

# EventDeliverySummary

The external/public Event entity used specifically in PULL/POLL event scenarios

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The unique identifier for an event delivery summary |  [optional] |
|**deliveryStatus** | **String** | Status of the delivery process (EventDeliveryStatusType) |  [optional] |
|**eventSummary** | [**EventSummary**](EventSummary.md) |  |  [optional] |
|**isRunning** | **Boolean** | Indicates whether delivery of the event is currently being attempted at this moment in time |  [optional] |
|**lastExecutionDate** | **OffsetDateTime** | The date that the delivery was last attempted (either successfully or not) |  [optional] |
|**nextExecutionDate** | **OffsetDateTime** | The date that the delivery will next be attempted, if the event has not been successfully delivered yet and there are still retries remaining |  [optional] |
|**retriesRemaining** | **Integer** | Number of delivery attempts remaining |  [optional] |
|**createDate** | **OffsetDateTime** | Create Date |  [optional] |
|**updateDate** | **OffsetDateTime** | Update Date |  [optional] |
|**deliveryAttempts** | [**List&lt;EventDeliveryAttempt&gt;**](EventDeliveryAttempt.md) | Details about each attempted delivery of the event to the endpoint |  [optional] |


## Implemented Interfaces

* Serializable


