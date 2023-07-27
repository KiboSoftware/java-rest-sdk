

# CommerceRuntimeProductPrice

Price of the product with any sale and discounts applied.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**price** | **Double** | Price of the product. This is the price that the merchant intends to sell the product if no sale price is present. |  [optional] |
|**salePrice** | **Double** | Current sale price of the product, which is a specific numerical amount (not a percentage off). |  [optional] |
|**tenantOverridePrice** | **Double** | An override price applied on the product by the tenant. |  [optional] |
|**msrp** | **Double** | MSRP of product. |  [optional] |
|**creditValue** | **Double** | Credit Value when the product happens to be a gift card or similar product |  [optional] |
|**priceListCode** | **String** | Pricelist code for the product |  [optional] |
|**priceListEntryMode** | **String** | Pricelist entry mode of the product.  Note: possible values are below  1. null : Product doesn&#39;t participate in pricelist  2. Bulk : Bulk volume price available(unit price vary based on quantity)  3. Simple: |  [optional] |


## Implemented Interfaces

* Serializable


