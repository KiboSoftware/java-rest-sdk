

# AutoCaptureJob

Contains settings for the auto-capture payment feature.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**interval** | **Integer** | How often this job should run in minutes. |  [optional] |
|**isEnabled** | **Boolean** | Specifies whether this job should run. |  [optional] |
|**flexibleCapture** | [**FlexibleCapture**](FlexibleCapture.md) |  |  [optional] |
|**forceCaptureOnFirstCapture** | **Boolean** | Specifies whether all available funds should be collected once any shipment is ready for capture. |  [optional] |


## Implemented Interfaces

* Serializable


