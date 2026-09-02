

# ProductValidationSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bundledProducts** | [**List&lt;BundledProductSummary&gt;**](BundledProductSummary.md) | The list of Bundled products included in this product. This is only populated when ProductUsage&#x3D;Bundle |  [optional] |
|**categories** | [**List&lt;CatalogRuntimesCategory&gt;**](CatalogRuntimesCategory.md) | Categories to which the product belongs. |  [optional] |
|**fulfillmentTypesSupported** | **List&lt;String&gt;** | Indicates the fulfillment types the product supports. |  [optional] |
|**goodsType** | **String** | The GoodsType of the product (Physical, Digital, DigitalCredit....) |  [optional] |
|**image** | [**ProductImage**](ProductImage.md) |  |  [optional] |
|**inventoryInfo** | [**CatalogRuntimesProductInventoryInfo**](CatalogRuntimesProductInventoryInfo.md) |  |  [optional] |
|**isPackagedStandAlone** | **Boolean** | Is this product shipped in its own package |  [optional] |
|**isTaxable** | **Boolean** | If true, the product listed on the live order is subject to tax. |  [optional] |
|**measurements** | [**CatalogRuntimesPackageMeasurements**](CatalogRuntimesPackageMeasurements.md) |  |  [optional] |
|**mfgPartNumber** | **String** | Manufacturer part number. |  [optional] |
|**price** | [**CatalogRuntimesProductPrice**](CatalogRuntimesProductPrice.md) |  |  [optional] |
|**pricingBehavior** | [**CatalogRuntimesProductPricingBehaviorInfo**](CatalogRuntimesProductPricingBehaviorInfo.md) |  |  [optional] |
|**productCode** | **String** | Merchant-created code associated with the product, for example, a SKU. |  [optional] |
|**productName** | **String** | Name of the product. |  [optional] |
|**productShortDescription** | **String** | Brief description of the product typically used when the product is displayed in a list or search results. |  [optional] |
|**productType** | **String** |  |  [optional] |
|**productUsage** | **String** | The UsageType of this product (Standard, Configurable, Bundle, Component) |  [optional] |
|**properties** | [**List&lt;CatalogRuntimesProductProperty&gt;**](CatalogRuntimesProductProperty.md) | List of product Properties. |  [optional] |
|**purchasableState** | [**ProductPurchasableState**](ProductPurchasableState.md) |  |  [optional] |
|**purchaseLocation** | **String** | The location where the product is being purchased.. default is null. Products can have different prices by purchaseLocation via custom priceListResolution.... |  [optional] |
|**upc** | **String** | UPC code of the product. |  [optional] |
|**variationProductCode** | **String** | For a product with options, the code of the product variation that represents the current selection of product options. |  [optional] |


## Implemented Interfaces

* Serializable


