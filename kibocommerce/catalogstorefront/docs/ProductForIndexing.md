

# ProductForIndexing


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**slices** | [**List&lt;CatalogRuntimesProduct&gt;**](CatalogRuntimesProduct.md) |  |  [optional] |
|**productCode** | **String** | Merchant-created code associated with the product, for example, a SKU. |  [optional] |
|**purchaseLocation** | **String** | The location where the product is being purchased.. default is null. Products can have different prices  by purchaseLocation via custom priceListResolution.... |  [optional] |
|**productSequence** | **Integer** | System generated monotonically increasing sequence |  [optional] |
|**productUsage** | **String** | The UsageType of this product (Standard, Configurable, Bundle, Component, Collection) |  [optional] |
|**fulfillmentTypesSupported** | **List&lt;String&gt;** | Indicates the fulfillment types the product supports. |  [optional] |
|**goodsType** | **String** | The GoodsType of the product (Physical, Digital, DigitalCredit....) |  [optional] |
|**bundledProducts** | [**List&lt;CatalogRuntimesBundledProduct&gt;**](CatalogRuntimesBundledProduct.md) | The list of Bundled products included in this product. This is only populated when ProductUsage&#x3D;Bundle |  [optional] |
|**content** | [**ProductContent**](ProductContent.md) |  |  [optional] |
|**purchasableState** | [**ProductPurchasableState**](ProductPurchasableState.md) |  |  [optional] |
|**isActive** | **Boolean** | If true, the product exists. If not, the product should not appear in search results. |  [optional] |
|**publishState** | **String** | Represents the published state of the product returned. Valid values for ValueType are defined in PublishStateConst. |  [optional] |
|**price** | [**CatalogRuntimesProductPrice**](CatalogRuntimesProductPrice.md) |  |  [optional] |
|**priceRange** | [**ProductPriceRange**](ProductPriceRange.md) |  |  [optional] |
|**volumePriceBands** | [**List&lt;ProductVolumePrice&gt;**](ProductVolumePrice.md) | For products with bulk pricing... this will be populated with pricebands, depending on what options have been selected... |  [optional] |
|**volumePriceRange** | [**ProductPriceRange**](ProductPriceRange.md) |  |  [optional] |
|**availableShippingDiscounts** | [**List&lt;CatalogRuntimesDiscount&gt;**](CatalogRuntimesDiscount.md) | List of potential shipping discounts available for this product. |  [optional] |
|**productType** | **String** |  |  [optional] |
|**productTypeId** | **Integer** |  |  [optional] |
|**isTaxable** | **Boolean** | If true, the product is subject to tax. |  [optional] |
|**isRecurring** | **Boolean** | If true, the product can be purchased or fulfilled at regular intervals, for example, monthly billing or a subscription. |  [optional] |
|**pricingBehavior** | [**CatalogRuntimesProductPricingBehaviorInfo**](CatalogRuntimesProductPricingBehaviorInfo.md) |  |  [optional] |
|**inventoryInfo** | [**CatalogRuntimesProductInventoryInfo**](CatalogRuntimesProductInventoryInfo.md) |  |  [optional] |
|**createDate** | **OffsetDateTime** | When the product was created with the product admin resource. |  [optional] |
|**updateDate** | **OffsetDateTime** | When the product was last modified with the product admin resource. |  [optional] |
|**dateFirstAvailableInCatalog** | **OffsetDateTime** |  |  [optional] |
|**catalogStartDate** | **OffsetDateTime** |  |  [optional] |
|**catalogEndDate** | **OffsetDateTime** |  |  [optional] |
|**daysAvailableInCatalog** | **Integer** |  |  [optional] |
|**upc** | **String** | UPC code of the product. |  [optional] |
|**upCs** | **List&lt;String&gt;** | UPC code of the products (populated for configurable products). |  [optional] |
|**mfgPartNumber** | **String** | Manufacturer part number. |  [optional] |
|**mfgPartNumbers** | **List&lt;String&gt;** | Manufacturer part numbers (populated for configurable products). |  [optional] |
|**variationProductCode** | **String** | When a configurable product has IsPurchasable&#x3D;true on a GetProduct, this property will be populated for submission to cart. |  [optional] |
|**categories** | [**List&lt;CatalogRuntimesCategory&gt;**](CatalogRuntimesCategory.md) | List of categories to which this product belongs. |  [optional] |
|**measurements** | [**CatalogRuntimesPackageMeasurements**](CatalogRuntimesPackageMeasurements.md) |  |  [optional] |
|**isPackagedStandAlone** | **Boolean** | Is this product shipped in its own package |  [optional] |
|**properties** | [**List&lt;CatalogRuntimesProductProperty&gt;**](CatalogRuntimesProductProperty.md) | List of product properties. These are attributes that might apply to multiple products, for example, price, size, manufacturer. These attributes cannot be configured by the shopper. |  [optional] |
|**options** | [**List&lt;CatalogRuntimesProductOption&gt;**](CatalogRuntimesProductOption.md) | List of the product&#39;s configurable options and extras.   Includes whether an option is configurable (for example, a T-shirt) or an Extra (for example, monogram or gift-wrapping). |  [optional] |
|**variations** | [**List&lt;VariationSummary&gt;**](VariationSummary.md) |  |  [optional] |
|**validPriceLists** | **List&lt;String&gt;** | List of valid pricelists for the product |  [optional] |
|**locationsInStock** | **List&lt;String&gt;** | Any location code (eq) or array of location codes which are in stock. |  [optional] |
|**slicingAttributeFQN** | **String** |  |  [optional] |
|**productImageGroups** | [**List&lt;CatalogRuntimesProductImageGroup&gt;**](CatalogRuntimesProductImageGroup.md) | List of the image groups this product uses.  Image groups are used to map different images to different product options.  If the product doesn&#39;t have options then all images will be in the default  image group. |  [optional] |
|**sliceValue** | **String** | Readonly value of the selected value of the option corresponding to the Mozu.ProductRuntime.Contracts.Product.SlicingAttributeFQN |  [optional] |
|**productCollections** | [**List&lt;CatalogRuntimesProductCollectionInfo&gt;**](CatalogRuntimesProductCollectionInfo.md) | List of product codes of product collections that this product is a member of. |  [optional] |
|**productCollectionMembers** | [**List&lt;ProductCollectionMember&gt;**](ProductCollectionMember.md) | list of member products that are part of the collection  This requires that the ProductUsage be set to Collection |  [optional] |
|**collectionMembersProductContent** | [**List&lt;ProductContent&gt;**](ProductContent.md) | Only used for indexing |  [optional] |
|**score** | **Double** | The item&#39;s search engine relevancy score. |  [optional] |
|**personalizationScore** | **Double** |  |  [optional] |


## Implemented Interfaces

* Serializable


