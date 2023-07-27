

# CatalogAdminsProductCollectionInfo

Information about the relationship between a Mozu.ProductAdmin.Contracts.Product and a productCollection (product with usagetype of collection)  This is only represented on the product member side of the relationship.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**collectionProductCode** | **String** | Product code of the product that is the collection that the containing product belongs to |  [optional] |
|**collectionName** | **String** | Collection name in the language of the master catalog |  [optional] |
|**isPrimaryCollection** | **Boolean** | True when this is the primary collection for the containing product. |  [optional] |


## Implemented Interfaces

* Serializable


