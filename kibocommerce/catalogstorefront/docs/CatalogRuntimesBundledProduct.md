

# CatalogRuntimesBundledProduct


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | [**ProductContent**](ProductContent.md) |  |  [optional] |
|**productCode** | **String** | Merchant-created code associated with the product, for example, a SKU. |  [optional] |
|**goodsType** | **String** | The GoodsType of this product (Physical, Digital, DigitalCredit) |  [optional] |
|**quantity** | **Integer** | The quantity of the bundled product |  [optional] |
|**measurements** | [**CatalogRuntimesPackageMeasurements**](CatalogRuntimesPackageMeasurements.md) |  |  [optional] |
|**isPackagedStandAlone** | **Boolean** | Is this product shipped in its own package |  [optional] |
|**inventoryInfo** | [**CatalogRuntimesProductInventoryInfo**](CatalogRuntimesProductInventoryInfo.md) |  |  [optional] |
|**optionAttributeFQN** | **String** | Fully Qualified Name of the selected option&#39;s attribute (only applies to Products as extras) |  [optional] |
|**optionValue** | **Object** | Value of the selected option (only applies to Products as extras) |  [optional] |
|**creditValue** | **Double** | Credit Value applicable to this product. Should only be present on DigitalCredit goodsType.... |  [optional] |
|**productType** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


