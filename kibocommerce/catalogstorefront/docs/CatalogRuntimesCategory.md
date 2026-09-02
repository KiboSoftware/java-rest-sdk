

# CatalogRuntimesCategory

The category hierarchy of your store as it appears on the storefront. This is the category heirarchy defined with the admin/category resource except for any categories with an IsDisplayed value set to false.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**List&lt;CatalogRuntimesCategoryAttribute&gt;**](CatalogRuntimesCategoryAttribute.md) |  |  [optional] |
|**categoryCode** | **String** | External unique identifier of the category. |  [optional] |
|**categoryId** | **Integer** | Internal unique identifier of the category. System-supplied and read-only. |  [optional] |
|**childrenCategories** | [**List&lt;CatalogRuntimesCategory&gt;**](CatalogRuntimesCategory.md) | List of subcategories that belong to this category. |  [optional] |
|**content** | [**CategoryContent**](CategoryContent.md) |  |  [optional] |
|**count** | **Integer** | Indicates whether the category should be displayed. |  [optional] |
|**isDisplayed** | **Boolean** | Indicates whether the category should be displayed. |  [optional] |
|**parentCategory** | [**CatalogRuntimesCategory**](CatalogRuntimesCategory.md) |  |  [optional] |
|**sequence** | **Integer** | Order in which categories appear when they are at the same level (siblings). For example, categories can be sequenced so that a specific category always appears first (or last). |  [optional] |
|**shouldSlice** | **Boolean** | Indicates whether the category should be sliced |  [optional] |
|**updateDate** | **OffsetDateTime** | Last Modified Date Time |  [optional] |


## Implemented Interfaces

* Serializable


