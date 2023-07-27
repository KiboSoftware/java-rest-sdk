

# OrderValidationMessage

Validation message returned by an order validator.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderItemId** | **String** | Order item id that this message applies to.  Can be empty. |  [optional] |
|**messageType** | **String** | Identifier to indicate the type of the message, See OrderValidatorMessageTypeConst for options. |  [optional] |
|**message** | **String** | Actual message returned by the validator. |  [optional] |


## Implemented Interfaces

* Serializable


