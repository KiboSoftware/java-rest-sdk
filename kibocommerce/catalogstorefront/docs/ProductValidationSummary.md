

# ProductValidationSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productCode** | **String** | Merchant-created code associated with the product, for example, a SKU. |  [optional] |
|**purchaseLocation** | **String** | The location where the product is being purchased.. default is null. Products can have different prices  by purchaseLocation via custom priceListResolution.... |  [optional] |
|**productUsage** | **String** | The UsageType of this product (Standard, Configurable, Bundle, Component) |  [optional] |
|**fulfillmentTypesSupported** | **List&lt;String&gt;** | Indicates the fulfillment types the product supports. |  [optional] |
|**goodsType** | **String** | The GoodsType of the product (Physical, Digital, DigitalCredit....) |  [optional] |
|**bundledProducts** | [**List&lt;BundledProductSummary&gt;**](BundledProductSummary.md) | The list of Bundled products included in this product. This is only populated when ProductUsage&#x3D;Bundle |  [optional] |
|**upc** | **String** | UPC code of the product. |  [optional] |
|**mfgPartNumber** | **String** | Manufacturer part number. |  [optional] |
|**variationProductCode** | **String** | For a product with options, the code of the product variation that represents the current selection of product options. |  [optional] |
|**purchasableState** | [**ProductPurchasableState**](ProductPurchasableState.md) |  |  [optional] |
|**price** | [**CatalogRuntimesProductPrice**](CatalogRuntimesProductPrice.md) |  |  [optional] |
|**measurements** | [**CatalogRuntimesPackageMeasurements**](CatalogRuntimesPackageMeasurements.md) |  |  [optional] |
|**isPackagedStandAlone** | **Boolean** | Is this product shipped in its own package |  [optional] |
|**image** | [**ProductImage**](ProductImage.md) |  |  [optional] |
|**productShortDescription** | **String** | Brief description of the product typically used when the product is displayed in a list or search results. |  [optional] |
|**productName** | **String** | Name of the product. |  [optional] |
|**categories** | [**List&lt;CatalogRuntimesCategory&gt;**](CatalogRuntimesCategory.md) | Categories to which the product belongs. |  [optional] |
|**properties** | [**List&lt;CatalogRuntimesProductProperty&gt;**](CatalogRuntimesProductProperty.md) | List of product Properties. |  [optional] |
|**pricingBehavior** | [**CatalogRuntimesProductPricingBehaviorInfo**](CatalogRuntimesProductPricingBehaviorInfo.md) |  |  [optional] |
|**inventoryInfo** | [**CatalogRuntimesProductInventoryInfo**](CatalogRuntimesProductInventoryInfo.md) |  |  [optional] |
|**isTaxable** | **Boolean** | If true, the product listed on the live order is subject to tax. |  [optional] |
|**productType** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


