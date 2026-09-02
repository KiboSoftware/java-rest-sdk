

# BundledProductBase

Details of a product, including its product code, name, description, options (if any), and current state--whether the product can be purchased given the options selected currently.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**creditValue** | **Double** | Credit Value applicable to this product. Should only be present on DigitalCredit goodsType.... |  [optional] |
|**goodsType** | **String** | The GoodsType of this product (Physical, Digital, DigitalCredit) |  [optional] |
|**inventoryInfo** | [**CatalogRuntimesProductInventoryInfo**](CatalogRuntimesProductInventoryInfo.md) |  |  [optional] |
|**isPackagedStandAlone** | **Boolean** | Is this product shipped in its own package |  [optional] |
|**measurements** | [**CatalogRuntimesPackageMeasurements**](CatalogRuntimesPackageMeasurements.md) |  |  [optional] |
|**optionAttributeFQN** | **String** | Fully Qualified Name of the selected option&#39;s attribute (only applies to Products as extras) |  [optional] |
|**optionValue** | **Object** | Value of the selected option (only applies to Products as extras) |  [optional] |
|**productCode** | **String** | Merchant-created code associated with the product, for example, a SKU. |  [optional] |
|**productType** | **String** |  |  [optional] |
|**quantity** | **Integer** | The quantity of the bundled product |  [optional] |


## Implemented Interfaces

* Serializable


