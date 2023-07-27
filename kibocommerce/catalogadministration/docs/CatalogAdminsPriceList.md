

# CatalogAdminsPriceList

Category

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**priceListCode** | **String** | External unique identifier of the PriceList. Must be unique an only contain url sanitized characters. Max length is 50 |  |
|**priceListSequence** | **Integer** |  |  [optional] |
|**parentPriceListCode** | **String** | Parent PriceList code, Can be null for root level priceLists |  [optional] |
|**parentPriceListName** | **String** | Parent PriceList name, Can be null for root level priceLists. Read only in contract. |  [optional] |
|**name** | **String** | Name of the priceList. Max length is 100 |  |
|**description** | **String** | Description of the price list. Max length is 300 |  [optional] |
|**enabled** | **Boolean** | Is the price list enabled and valid in the storefront. Default is true. |  [optional] |
|**filteredInStorefront** | **Boolean** | When true, only products with valid price list entries will be visible in the storefront. Default is false |  [optional] |
|**validForAllSites** | **Boolean** | When true, no valid sites need to be specifiied. Price list is considered valid for all sites. Default is true |  [optional] |
|**validSites** | **List&lt;Integer&gt;** | When ValidForAllSites &#x3D; false, a list of siteIDs that the price list is valid for should be supplied |  [optional] |
|**defaultForSites** | **List&lt;Integer&gt;** |  |  [optional] |
|**indexedSites** | **List&lt;Integer&gt;** |  |  [optional] |
|**mappedCustomerSegments** | **List&lt;String&gt;** | List of customer segment code associated with this price list.  Used to resolve default price list |  [optional] |
|**rank** | **Integer** | Used to prioritize price list resolution when more than 1 price list maps |  [optional] |
|**resolvable** | **Boolean** | Determines if this price list can be resolved as the current price list   within a session. |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


