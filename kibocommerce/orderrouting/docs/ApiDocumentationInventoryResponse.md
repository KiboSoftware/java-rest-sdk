

# ApiDocumentationInventoryResponse

Inventory Response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allocated** | **Integer** | The quantity the location has that are already allocated. |  [optional] |
|**attributes** | **List&lt;String&gt;** | List of Inventory Attributes |  [optional] |
|**available** | **Integer** | The quantity the location has that are available for purchase |  [optional] |
|**blockAssignment** | **Boolean** | Whether or not the product is blocked for assignment |  [optional] |
|**countryCode** | **String** | The country code of this location |  [optional] |
|**currencyID** | **Integer** | The currency identifier for the retailPrice |  [optional] |
|**directShip** | **Boolean** | Whether this location can ship to a consumer |  [optional] |
|**distance** | **BigDecimal** | The distance in miles from this location to the item&#39;s destination |  [optional] |
|**floor** | **Integer** | Absolute minimum quantity of this item that should be in stock at any time |  [optional] |
|**futureInventory** | [**List&lt;ApiDocumentationFutureInventory&gt;**](ApiDocumentationFutureInventory.md) |  |  [optional] |
|**inventoryLocatorName** | **String** | The inventory locator name of the individual item |  [optional] |
|**locationCode** | **String** | Location Code |  [optional] |
|**locationName** | **String** | Location Name |  [optional] |
|**ltd** | **BigDecimal** | Custom field used for store prioritization |  [optional] |
|**messages** | **List&lt;String&gt;** | List of messages |  [optional] |
|**numResults** | **Integer** | Number of results |  [optional] |
|**onHand** | **Integer** | The quantity the location has in its possession |  [optional] |
|**partNumber** | **String** | Part/Product Number |  [optional] |
|**pending** | **Integer** | The quantity the location has that are pending. |  [optional] |
|**pickup** | **Boolean** | Whether a consumer can pick up product at this location (store) |  [optional] |
|**retailPrice** | **BigDecimal** | The price of the product at this location |  [optional] |
|**safetyStock** | **Integer** | Quantity of this item the location wants to keep in stock to ensure stock isn&#39;t completely depleted |  [optional] |
|**sku** | **String** | Stock Keeping Unit |  [optional] |
|**success** | **Boolean** | Flag for success |  [optional] |
|**taggedInventory** | [**List&lt;ApiDocumentationTagQuantity&gt;**](ApiDocumentationTagQuantity.md) |  |  [optional] |
|**tenantID** | **Integer** | Tenant Identifier |  [optional] |
|**transferEnabled** | **Boolean** | Whether the location can ship to another location (store), thus restocking that location. |  [optional] |
|**upc** | **String** | Universal Product Code |  [optional] |


## Implemented Interfaces

* Serializable


