

# CatalogRuntimesProductPrice

Price of the product with any sale and discounts applied.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**msrp** | **Double** | Manufacturer suggested Retail price, this may be null if one is not set in the catalog. |  [optional] |
|**price** | **Double** | Listed Price of the product. This is the price that the merchant intends to sell the product for if no sale is active. |  [optional] |
|**priceType** | **String** | Futher clarification of what value is being returned in the Price field |  [optional] |
|**salePrice** | **Double** | Current sale price of the product. This can be either a specific numerical amount or it can be calculated based on an active discount. Optional. |  [optional] |
|**salePriceType** | **String** |  |  [optional] |
|**catalogSalePrice** | **Double** | Current sale price of the product listed in the catalog. This is not typically dispalyed directly to the user as it will be listed in SalePrice if applicable. |  [optional] |
|**catalogListPrice** | **Double** | Current Price Listed in the catalog. |  [optional] |
|**priceListEntryEndDate** | **OffsetDateTime** | EndDate if PriceListEntry present. |  [optional] |
|**discount** | [**CatalogRuntimesAppliedDiscount**](CatalogRuntimesAppliedDiscount.md) |  |  [optional] |
|**creditValue** | **Double** | Credit Value applicable to this product. Should only be present on DigitalCredit goodsType.... |  [optional] |
|**effectivePricelistCode** | **String** | The priceList that was applied to this product |  [optional] |
|**priceListEntryCode** | **String** | The specific PriceListCode that was applied (includes inheritence |  [optional] |
|**priceListEntryMode** | **String** | IF a PriceList Entry was applied to this price it will be (simple, bulk...) |  [optional] |


## Implemented Interfaces

* Serializable


