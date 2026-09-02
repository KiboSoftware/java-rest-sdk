

# ProductSubstitution


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baseProductCode** | **String** | When a configurable product has IsPurchasable&#x3D;true on a GetProduct, this property will be populated for submission to cart. |  [optional] |
|**bundledProducts** | [**List&lt;CatalogRuntimesBundledProduct&gt;**](CatalogRuntimesBundledProduct.md) | The list of Bundled products included in this product. This is only populated when ProductUsage&#x3D;Bundle |  [optional] |
|**mfgPartNumber** | **String** | Manufacturer part number. |  [optional] |
|**price** | [**CatalogRuntimesProductPrice**](CatalogRuntimesProductPrice.md) |  |  [optional] |
|**productCode** | **String** | Merchant-created code associated with the product, for example, a SKU. |  [optional] |
|**productImages** | [**List&lt;ProductImage&gt;**](ProductImage.md) |  |  [optional] |
|**productName** | **String** |  |  [optional] |
|**productUsage** | **String** | The UsageType of this product (Standard, Configurable, Bundle, Component, Collection) |  [optional] |
|**upc** | **String** | UPC code of the products (populated for configurable products). |  [optional] |


## Implemented Interfaces

* Serializable


