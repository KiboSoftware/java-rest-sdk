

# EventDeliveryAttempt

The external/public Event entity used specifically in PULL/POLL event scenarios

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deliveryStatus** | **String** | Status of the delivery process (EventDeliveryStatusType). System-supplied and read-only. |  [optional] |
|**errorType** | **String** | Type of error that occurred, if the delivery was unsuccessful |  [optional] |
|**httpStatus** | [**HttpStatus**](HttpStatus.md) |  |  [optional] |
|**message** | **String** | HTTP message returned by the remote endpoint |  [optional] |
|**executionDate** | **OffsetDateTime** | The date that the delivery was attempted |  [optional] |


## Implemented Interfaces

* Serializable


