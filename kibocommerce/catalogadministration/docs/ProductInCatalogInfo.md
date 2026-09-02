

# ProductInCatalogInfo

Use the Products resource to create and manage products for your store. You can create products with options that a shopper configures (such as a T-shirt color and size). The system can manage inventory for all combinations of your product options, and can calculate tax and shipping costs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeDateRange** | [**CatalogAdminsActiveDateRange**](CatalogAdminsActiveDateRange.md) |  |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**catalogId** | **Integer** | The CatalogId of the catalog that the product is associated with (The catalog must a valid catalog within the MasterCatalog that the product belongs to) |  [optional] |
|**dateFirstAvailableInCatalog** | **OffsetDateTime** | Date this product was first Available for sale in the catalog. This is utilized in expressions that reference DaysInCatloag. |  [optional] |
|**isActive** | **Boolean** | If true, the product is marked as available for sale in the catalog. Setting a product to IsActive &#x3D; false will prevent it from being shown on the customer facing storefront. |  [optional] |
|**isPriceOverridden** | **Boolean** | If true, the price for this product is overridden in the catalog. If false, the MasterCatalog level price will be used for the product. |  [optional] |
|**price** | [**CatalogAdminsProductPrice**](CatalogAdminsProductPrice.md) |  |  [optional] |
|**primaryProductCategory** | [**ProductCategory**](ProductCategory.md) |  |  [optional] |
|**productCategories** | [**List&lt;ProductCategory&gt;**](ProductCategory.md) | Categories to which the product belongs for this catalog. |  [optional] |


## Implemented Interfaces

* Serializable


