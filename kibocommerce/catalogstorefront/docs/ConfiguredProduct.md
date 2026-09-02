

# ConfiguredProduct

Product as it is currently configured on the storefront. The configuration changes each time the shopper changes the product order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**availableShippingDiscounts** | [**List&lt;CatalogRuntimesDiscount&gt;**](CatalogRuntimesDiscount.md) | List of potential shipping discounts available for this product. |  [optional] |
|**fulfillmentTypesSupported** | **List&lt;String&gt;** | Indicates the fulfillment types the product supports. |  [optional] |
|**inventoryInfo** | [**CatalogRuntimesProductInventoryInfo**](CatalogRuntimesProductInventoryInfo.md) |  |  [optional] |
|**measurements** | [**CatalogRuntimesPackageMeasurements**](CatalogRuntimesPackageMeasurements.md) |  |  [optional] |
|**mfgPartNumber** | **String** | Manufacturer part number. |  [optional] |
|**options** | [**List&lt;CatalogRuntimesProductOption&gt;**](CatalogRuntimesProductOption.md) | Remaining options and option values that can be selected given the shopper&#39;s current selection of options. |  [optional] |
|**price** | [**CatalogRuntimesProductPrice**](CatalogRuntimesProductPrice.md) |  |  [optional] |
|**priceListEntryTypeProperty** | [**CatalogRuntimesProductProperty**](CatalogRuntimesProductProperty.md) |  |  [optional] |
|**priceRange** | [**ProductPriceRange**](ProductPriceRange.md) |  |  [optional] |
|**productCode** | **String** | Merchant-created code associated with the product, for example, a SKU. |  [optional] |
|**productImages** | [**List&lt;ProductImage&gt;**](ProductImage.md) | Images associated with the product. |  [optional] |
|**properties** | [**List&lt;CatalogRuntimesProductProperty&gt;**](CatalogRuntimesProductProperty.md) | Remaining options and option values that can be selected given the shopper&#39;s current selection of options. |  [optional] |
|**purchasableState** | [**ProductPurchasableState**](ProductPurchasableState.md) |  |  [optional] |
|**purchaseLocation** | **String** | The location where the product is being purchased.. default is null. Products can have different prices by purchaseLocation via custom priceListResolution.... |  [optional] |
|**upc** | **String** | UPC code of the product. |  [optional] |
|**variationProductCode** | **String** | For a product with options, the code of the product variation that represents the current selection of product options.  Question: is this right? |  [optional] |
|**volumePriceBands** | [**List&lt;ProductVolumePrice&gt;**](ProductVolumePrice.md) | For products with bulk pricing... this will be populated with pricebands, depending on what options have been selected... |  [optional] |
|**volumePriceRange** | [**ProductPriceRange**](ProductPriceRange.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


