

# CatalogAdminsProductPrice

Price of the product and currency used.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isoCurrencyCode** | **String** | Currency code. |  [optional] |
|**price** | **Double** | Price of the product. This is the price the merchant intends to sell the product if no sale price is present. |  [optional] |
|**salePrice** | **Double** | Current sale price of the product. Sale price is a numeric (monetary) amount, not a percentage off. |  [optional] |
|**msrp** | **Double** | Manufacturer Suggested Retail Price. + |  [optional] |
|**map** | **Double** | Minimum Advertised Price |  [optional] |
|**mapStartDate** | **OffsetDateTime** | Minimum Advertised Price effective start date (null &#x3D; begining of time) |  [optional] |
|**mapEndDate** | **OffsetDateTime** | Minimum Advertised Price effectivity end date (null &#x3D; forever) |  [optional] |
|**creditValue** | **Double** | Credit amt of the product |  [optional] |


## Implemented Interfaces

* Serializable


