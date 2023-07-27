

# ProductInCatalogInfo

Use the Products resource to create and manage products for your store.  You can create products with options that a shopper configures  (such as a T-shirt color and size). The system can manage inventory for all  combinations of your product options, and can calculate tax and shipping costs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogId** | **Integer** | The CatalogId of the catalog that the product is associated with (The catalog must a valid catalog within the MasterCatalog that the product belongs to) |  [optional] |
|**isActive** | **Boolean** | If true, the product is marked as available for sale in the catalog. Setting a product to IsActive &#x3D; false will prevent it from being shown on the customer facing storefront. |  [optional] |
|**isContentOverridden** | **Boolean** | If true, the content for this product is overridden in the catalog. If false, the MasterCatalog level content will be used for the product. |  [optional] |
|**content** | [**ProductLocalizedContent**](ProductLocalizedContent.md) |  |  [optional] |
|**isPriceOverridden** | **Boolean** | If true, the price for this product is overridden in the catalog. If false, the MasterCatalog level price will be used for the product. |  [optional] |
|**price** | [**CatalogAdminsProductPrice**](CatalogAdminsProductPrice.md) |  |  [optional] |
|**isSeoContentOverridden** | **Boolean** | If true, the SEO content for this product is overridden in the catalog. If false, the MasterCatalog level SEO content will be used for the product. |  [optional] |
|**seoContent** | [**ProductLocalizedSEOContent**](ProductLocalizedSEOContent.md) |  |  [optional] |
|**productCategories** | [**List&lt;ProductCategory&gt;**](ProductCategory.md) | Categories to which the product belongs for this catalog. |  [optional] |
|**primaryProductCategory** | [**ProductCategory**](ProductCategory.md) |  |  [optional] |
|**dateFirstAvailableInCatalog** | **OffsetDateTime** | Date this product was first Available for sale in the catalog. This is utilized in expressions that reference DaysInCatloag. |  [optional] |
|**activeDateRange** | [**CatalogAdminsActiveDateRange**](CatalogAdminsActiveDateRange.md) |  |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


