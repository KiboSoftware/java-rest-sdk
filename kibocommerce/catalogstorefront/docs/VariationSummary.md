

# VariationSummary

Details of a product, including its product code, name, description, options (if any), and current state--whether the product can be purchased given the options selected currently.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inventoryInfo** | [**CatalogRuntimesProductInventoryInfo**](CatalogRuntimesProductInventoryInfo.md) |  |  [optional] |
|**options** | [**List&lt;VariationOption&gt;**](VariationOption.md) | The combination of options that resolve to this variation product |  [optional] |
|**productCode** | **String** | Merchant-created code associated with the variation product, for example, a SKU. |  [optional] |
|**upc** | **String** | UPC code of the variant product |  [optional] |


## Implemented Interfaces

* Serializable


