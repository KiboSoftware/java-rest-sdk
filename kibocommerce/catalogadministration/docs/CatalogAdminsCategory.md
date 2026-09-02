

# CatalogAdminsCategory

Category

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeDateEnd** | **OffsetDateTime** | Active end Date |  [optional] |
|**activeDateStart** | **OffsetDateTime** | Active Start Date |  [optional] |
|**attributes** | [**List&lt;CatalogAdminsCategoryAttribute&gt;**](CatalogAdminsCategoryAttribute.md) | List of attributes for the category. |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**catalogId** | **Integer** | The CatalogId that the category belongs to. |  [optional] |
|**categoryCode** | **String** | External unique identifier of the category. |  [optional] |
|**categoryType** | **String** | The Type of Category Static, Dyanmic, DynamicPreComputed |  [optional] |
|**childCount** | **Integer** | Number of subcategories that belong to this category. These subcategories are at the same level (siblings). |  [optional] |
|**content** | [**CategoryLocalizedContent**](CategoryLocalizedContent.md) |  |  [optional] |
|**dynamicExpression** | [**CatalogAdminsDynamicExpression**](CatalogAdminsDynamicExpression.md) |  |  [optional] |
|**id** | **Integer** | Internal unique identifier of the category. System-supplied and read-only. |  [optional] |
|**isActive** | **Boolean** | If false, the category is considered unavailable in runtime (default is true if not specified on create) |  [optional] |
|**isDisplayed** | **Boolean** | If true, the category appears to shoppers on the storefront. |  [optional] |
|**localizedContent** | [**List&lt;CategoryLocalizedContent&gt;**](CategoryLocalizedContent.md) | Container for language-specific content to display on the storefront. You&#39;ll have a container for each supported language (LocaleCode).  This enables you to display a category in multiple languages yet manage it as a single category internally. |  [optional] |
|**parentCategoryCode** | **String** |  |  [optional] |
|**parentCategoryId** | **Integer** | Unique identifier of the category to which this category belongs. If nil, this is a top-level category. System-supplied and read-only. |  [optional] |
|**parentCategoryName** | **String** |  |  [optional] |
|**parentIsActive** | **Boolean** |  |  [optional] |
|**productCount** | **Integer** | Number of products contained in this category. This count includes all products contained in any subcategories of this category. |  [optional] |
|**sequence** | **Integer** | Order in which categories appear when they are at the same level (siblings). For example, you could change the sequence of categories so that a specific category always appears first. |  [optional] |
|**shouldSlice** | **Boolean** | If True, search displays sliced view |  [optional] |


## Implemented Interfaces

* Serializable


