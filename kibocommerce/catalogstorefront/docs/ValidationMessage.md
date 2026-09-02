

# ValidationMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** | Message displayed to the user when this validation failure occurred. |  [optional] |
|**severity** | **String** | Severity level of the validation failure.  Must be one of the values in SeverityConst. |  [optional] |
|**source** | **String** | What invoked the validation.  Must be one of the values in SourceTypeConst. |  [optional] |
|**sourceId** | **String** | Unique identifier of the source that invoked the validation failure. |  [optional] |
|**validationType** | **String** | Type of validation error that occurred. This can be checked programatically.   Must be one of the values in ValidationTypeConst. |  [optional] |


## Implemented Interfaces

* Serializable


