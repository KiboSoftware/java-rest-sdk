

# CatalogAdminsCategory

Category

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Internal unique identifier of the category. System-supplied and read-only. |  [optional] |
|**categoryType** | **String** | The Type of Category Static, Dyanmic, DynamicPreComputed |  [optional] |
|**catalogId** | **Integer** | The CatalogId that the category belongs to. |  [optional] |
|**parentCategoryId** | **Integer** | Unique identifier of the category to which this category belongs. If nil, this is a top-level category. System-supplied and read-only. |  [optional] |
|**parentCategoryCode** | **String** |  |  [optional] |
|**parentCategoryName** | **String** |  |  [optional] |
|**parentIsActive** | **Boolean** |  |  [optional] |
|**categoryCode** | **String** | External unique identifier of the category. |  [optional] |
|**isActive** | **Boolean** | If false, the category is considered unavailable in runtime (default is true if not specified on create) |  [optional] |
|**isDisplayed** | **Boolean** | If true, the category appears to shoppers on the storefront. |  [optional] |
|**sequence** | **Integer** | Order in which categories appear when they are at the same level (siblings). For example, you could change the sequence of categories so that a specific category always appears first. |  [optional] |
|**content** | [**CategoryLocalizedContent**](CategoryLocalizedContent.md) |  |  [optional] |
|**dynamicExpression** | [**DynamicExpression**](DynamicExpression.md) |  |  [optional] |
|**productCount** | **Integer** | Number of products contained in this category. This count includes all products contained in any subcategories of this category. |  [optional] |
|**childCount** | **Integer** | Number of subcategories that belong to this category. These subcategories are at the same level (siblings). |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**shouldSlice** | **Boolean** | If True, search displays sliced view |  [optional] |
|**activeDateStart** | **OffsetDateTime** | Active Start Date |  [optional] |
|**activeDateEnd** | **OffsetDateTime** | Active end Date |  [optional] |
|**attributes** | [**List&lt;CatalogAdminsCategoryAttribute&gt;**](CatalogAdminsCategoryAttribute.md) | List of attributes for the category. |  [optional] |


## Implemented Interfaces

* Serializable


