

# DynamicFieldSlot

Authoring descriptor for a dynamic field slot.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**definitionsEndpoint** | **String** | Endpoint the UI fans out to in order to resolve dynamic values. |  [optional] |
|**isDynamic** | **Boolean** | Always &#x60;true&#x60; for a dynamic slot. |  [optional] |
|**namePattern** | **String** | Name template, e.g. &#x60;\&quot;attributes.{fqn}\&quot;&#x60;. |  [optional] |
|**operatorsByDataType** | **Map&lt;String, List&lt;String&gt;&gt;** | Map from &#x60;AttributeDataType&#x60; name to allowed operators. Drives the per-data-type operator narrowing the validator enforces at save time. |  [optional] |
|**pathLabel** | **String** | Human-readable UI label. |  [optional] |


## Implemented Interfaces

* Serializable


