

# OrderValidationResult

The result of an order validator.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**validationId** | **String** | Identifier set by the capability that states the id of this specific validation attempt |  [optional] |
|**validatorName** | **String** | Identifier set by the capability that states the specific name of this validator. |  [optional] |
|**validatorType** | **String** | Identifies the type of the validator (types are enumerated in OrderValidatorTypeConst) |  [optional] |
|**status** | **String** | Status of the order validation result.  See OrderValidatorStatusConst for options. |  [optional] |
|**createdDate** | **OffsetDateTime** | DateTime that this validation result was created |  [optional] |
|**messages** | [**List&lt;OrderValidationMessage&gt;**](OrderValidationMessage.md) | Messages returned by the order validator |  [optional] |


## Implemented Interfaces

* Serializable


