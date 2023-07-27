

# CatalogAdminsProduct

Use the Products resource to create and manage products for your store. You can create products with options that a shopper configures (such as a T-shirt color and size). The system can manage inventory for all combinations of your product options, and can calculate tax and shipping costs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productCode** | **String** | Merchant-created code identifier associated with the product, for example, a SKU or product item number. |  [optional] |
|**productUsage** | **String** | Indicates the usage type of this product. Must be one of the values in ProductUsageConst. |  [optional] |
|**fulfillmentTypesSupported** | **List&lt;String&gt;** | Indicates the fulfillment types the product supports. |  [optional] |
|**masterCatalogId** | **Integer** | Identifier of the Master Catalog that this product is a member of. System-supplied and read-only |  [optional] |
|**productSequence** | **Integer** | System generated monotonically increasing sequence |  [optional] |
|**productTypeId** | **Integer** | Unique identifier of the productType of the product. Refers to a valid ProductType that was previously created with the ProductType resource. |  [optional] |
|**isValidForProductType** | **Boolean** | Read only flag that indicates if the product meets the product type constraints (All adminRequired attributes have a valid value) |  [optional] |
|**baseProductCode** | **String** | This is the base product ProductCode of a product that is a variation. It is read-only and only populated for products that are variations of a configurable base product. |  [optional] |
|**productInCatalogs** | [**List&lt;ProductInCatalogInfo&gt;**](ProductInCatalogInfo.md) | Catalog specific info for each catalog a product is valid in. There should always be one or more entries here. |  [optional] |
|**content** | [**ProductLocalizedContent**](ProductLocalizedContent.md) |  |  [optional] |
|**price** | [**CatalogAdminsProductPrice**](CatalogAdminsProductPrice.md) |  |  [optional] |
|**pricingBehavior** | [**CatalogAdminsProductPricingBehaviorInfo**](CatalogAdminsProductPricingBehaviorInfo.md) |  |  [optional] |
|**seoContent** | [**ProductLocalizedSEOContent**](ProductLocalizedSEOContent.md) |  |  [optional] |
|**options** | [**List&lt;CatalogAdminsProductOption&gt;**](CatalogAdminsProductOption.md) | The Options defined in the product Type that are currently assigned to this product |  [optional] |
|**extras** | [**List&lt;ProductExtra&gt;**](ProductExtra.md) | The Extras defined in the product Type that are currently assigned to this product |  [optional] |
|**properties** | [**List&lt;CatalogAdminsProductProperty&gt;**](CatalogAdminsProductProperty.md) | The Properties defined in the product Type that are currently assigned to this product |  [optional] |
|**isTaxable** | **Boolean** | If true, the product is subject to tax. |  [optional] |
|**inventoryInfo** | [**CatalogAdminsProductInventoryInfo**](CatalogAdminsProductInventoryInfo.md) |  |  [optional] |
|**shippingClassId** | **Integer** |  |  [optional] |
|**isRecurring** | **Boolean** | If true, the product can be purchased or fulfilled at regular intervals, for example, monthly billing or a subscription. |  [optional] |
|**upc** | **String** | UPC code of the product. |  [optional] |
|**supplierInfo** | [**ProductSupplierInfo**](ProductSupplierInfo.md) |  |  [optional] |
|**isPackagedStandAlone** | **Boolean** | Does this product need to be packaged on its own |  [optional] |
|**standAlonePackageType** | **String** | When packaged alone this is the package type |  [optional] |
|**packageHeight** | [**CommerceRuntimeMeasurement**](CommerceRuntimeMeasurement.md) |  |  [optional] |
|**packageWidth** | [**CommerceRuntimeMeasurement**](CommerceRuntimeMeasurement.md) |  |  [optional] |
|**packageLength** | [**CommerceRuntimeMeasurement**](CommerceRuntimeMeasurement.md) |  |  [optional] |
|**packageWeight** | [**CommerceRuntimeMeasurement**](CommerceRuntimeMeasurement.md) |  |  [optional] |
|**applicableDiscounts** | [**List&lt;CatalogAdminsDiscount&gt;**](CatalogAdminsDiscount.md) | Read only. List of discounts that are available for a product. |  [optional] |
|**isVariation** | **Boolean** | Read only. If true, this is a product variation of a product with configurable options. System-supplied and read-only. |  [optional] |
|**variationKey** | **String** | Read only. If IsVariation true, thish provides a unique key to manage the variation of the base product. |  [optional] |
|**hasConfigurableOptions** | **Boolean** | Read only. If true, this product has configurable options. The product is not purchasable until the shopper selects options that resolve to a product variation. System-supplied and read-only. |  [optional] |
|**hasStandAloneOptions** | **Boolean** | Read only. If true, the product has stand-alone options that a shopper may select. System-supplied and read-only. |  [optional] |
|**variationOptions** | [**List&lt;ProductVariationOption&gt;**](ProductVariationOption.md) | Read only List of variations that exist for a product. This is only populated when IsVariation is true. To get the list of options, the GET request must include the VariationOptions response group. |  [optional] |
|**publishingInfo** | [**ProductPublishingInfo**](ProductPublishingInfo.md) |  |  [optional] |
|**bundledProducts** | [**List&lt;CatalogAdminsBundledProduct&gt;**](CatalogAdminsBundledProduct.md) | list of other products that are included in a BundleProduct  This requires that the ProductUsage be set to Bundle |  [optional] |
|**productCollectionProducts** | [**List&lt;ProductCollectionProduct&gt;**](ProductCollectionProduct.md) | list of other products that are members of a ProductCollection  This requires that the ProductUsage be set to Collection |  [optional] |
|**productCollections** | [**List&lt;CatalogAdminsProductCollectionInfo&gt;**](CatalogAdminsProductCollectionInfo.md) | List of Mozu.ProductAdmin.Contracts.ProductCollectionInfo that this product belongs to |  [optional] |
|**productImageGroups** | [**List&lt;CatalogAdminsProductImageGroup&gt;**](CatalogAdminsProductImageGroup.md) | List of the image groups this product uses.  Image groups are used to map different images to different product options.  If the product doesn&#39;t have options then all images will be in the default  image group. |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**slicingSettings** | [**SlicingSettings**](SlicingSettings.md) |  |  [optional] |
|**primaryProductCollectionCode** | **String** | When this product belongs to a product collection this is the product id for the primary collection. |  [optional] |


## Implemented Interfaces

* Serializable


