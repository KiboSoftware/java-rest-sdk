

# ProductPatchAction

List of JsonPatch operations to be applied to a Mozu.ProductAdmin.Contracts.Product

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**patches** | [**ProductV1PatchDocument**](ProductV1PatchDocument.md) |  |  [optional] |
|**productCode** | **String** | Target product code |  [optional] |
|**saveAndPublish** | **Boolean** | If true and publishing is enabled, actions are applied to a draft version of the product and then the draft is published otherwise changes are saved to the live product. |  [optional] |


## Implemented Interfaces

* Serializable


