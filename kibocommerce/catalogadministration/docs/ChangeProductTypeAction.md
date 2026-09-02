

# ChangeProductTypeAction

List of JsonPatch operations to be applied to a Mozu.ProductAdmin.Contracts.Product

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ignoreDataLoss** | **Boolean** | Whether to ignore data loss. If true, data loss will be ignored. If false, the product will not be updated when warnings are encountered |  [optional] |
|**patches** | [**ProductV1PatchDocument**](ProductV1PatchDocument.md) |  |  [optional] |
|**productCode** | **String** | Product code of the target product |  [optional] |
|**saveAndPublish** | **Boolean** | If true and publishing is enabled, actions are applied to a draft version of the product and then the draft is published otherwise changes are saved to the live product. |  [optional] |
|**testMode** | **Boolean** | Whether to run in test mode.  If true, no changes will be made. |  [optional] |


## Implemented Interfaces

* Serializable


