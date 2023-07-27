

# ProductTypeChangeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**targetProductTypeId** | **Integer** | The target product type id to move the product to. |  [optional] |
|**ignoreDataLoss** | **Boolean** | When set to true any attributes or values that were set on the product that are  not defined the target product type will be lost.  When false, the process will stop  without making updates if there are any conditions that would result in dataloss.  Validation output will be returned. Defaults to false. |  [optional] |
|**testMode** | **Boolean** | When set to true no updates will be made but the validation will return any  warnings or failures. Defaults to false. |  [optional] |
|**shouldFailFast** | **Boolean** | When true the validation will stop on the first error.  Defaults to run all validation. |  [optional] |


## Implemented Interfaces

* Serializable


