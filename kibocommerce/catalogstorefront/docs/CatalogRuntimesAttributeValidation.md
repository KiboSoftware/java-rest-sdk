

# CatalogRuntimesAttributeValidation

Used to validate attributes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxDateValue** | **OffsetDateTime** | For validating a DateTime attribute value, maximum datetime allowed. |  [optional] |
|**maxNumericValue** | **Double** | For validating Number attribute value, maximum number allowed. |  [optional] |
|**maxStringLength** | **Integer** | For validating strings, maximum length allowed for a string. |  [optional] |
|**minDateValue** | **OffsetDateTime** | For validating a DateTime attribute value, minimum datetime allowed. |  [optional] |
|**minNumericValue** | **Double** | For validating Number attribute value, minimum number allowed. |  [optional] |
|**minStringLength** | **Integer** | For validating strings, minimum length allowed for a string. |  [optional] |
|**regularExpression** | **String** | Regular expression to run against the attribute value. This should follow JavaScript/EMCA&#39;s Regular Expression syntax. |  [optional] |


## Implemented Interfaces

* Serializable


