

# ProductSubstitution


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productCode** | **String** | Merchant-created code associated with the product, for example, a SKU. |  [optional] |
|**baseProductCode** | **String** | When a configurable product has IsPurchasable&#x3D;true on a GetProduct, this property will be populated for submission to cart. |  [optional] |
|**productName** | **String** |  |  [optional] |
|**productUsage** | **String** | The UsageType of this product (Standard, Configurable, Bundle, Component, Collection) |  [optional] |
|**upc** | **String** | UPC code of the products (populated for configurable products). |  [optional] |
|**mfgPartNumber** | **String** | Manufacturer part number. |  [optional] |
|**price** | [**CatalogRuntimesProductPrice**](CatalogRuntimesProductPrice.md) |  |  [optional] |
|**productImages** | [**List&lt;ProductImage&gt;**](ProductImage.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


