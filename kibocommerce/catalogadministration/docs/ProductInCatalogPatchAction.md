

# ProductInCatalogPatchAction

List of JsonPatch operations to be applied to a Mozu.ProductAdmin.Contracts.ProductInCatalogInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogId** | **Integer** | CatalogId |  [optional] |
|**patches** | [**ProductInCatalogInfoV1PatchDocument**](ProductInCatalogInfoV1PatchDocument.md) |  |  [optional] |
|**productCode** | **String** | Product code of the target product |  [optional] |
|**saveAndPublish** | **Boolean** | If true and publishing is enabled, actions are applied to a draft version of the product and then the draft is published otherwise changes are saved to the live product. |  [optional] |


## Implemented Interfaces

* Serializable


