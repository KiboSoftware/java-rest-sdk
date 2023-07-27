

# InventoryInventoryResponse

Inventory Response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**locationName** | **String** | Location Name |  [optional] |
|**locationCode** | **String** | Location Code |  [optional] |
|**tenantID** | **Integer** | Tenant Identifier |  [optional] |
|**onHand** | **Integer** | The quantity the location has in its possession |  [optional] |
|**available** | **Integer** | The quantity the location has that are available for purchase |  [optional] |
|**allocated** | **Integer** | The quantity the location has that are already allocated. |  [optional] |
|**pending** | **Integer** | The quantity the location has that are pending. |  [optional] |
|**partNumber** | **String** | Part/Product Number |  [optional] |
|**upc** | **String** | Universal Product Code |  [optional] |
|**sku** | **String** | Stock Keeping Unit |  [optional] |
|**blockAssignment** | **Boolean** | Whether or not the product is blocked for assignment |  [optional] |
|**ltd** | **BigDecimal** | Custom field used for store prioritization |  [optional] |
|**floor** | **Integer** | Absolute minimum quantity of this item that should be in stock at any time |  [optional] |
|**safetyStock** | **Integer** | Quantity of this item the location wants to keep in stock to ensure stock isn&#39;t completely depleted |  [optional] |
|**distance** | **BigDecimal** | The distance in miles from this location to the item&#39;s destination |  [optional] |
|**directShip** | **Boolean** | Whether this location can ship to a consumer |  [optional] |
|**transferEnabled** | **Boolean** | Whether the location can ship to another location (store), thus restocking that location. |  [optional] |
|**pickup** | **Boolean** | Whether a consumer can pick up product at this location (store) |  [optional] |
|**countryCode** | **String** | The country code of this location |  [optional] |
|**currencyID** | **Integer** | The currency identifier for the retailPrice |  [optional] |
|**retailPrice** | **BigDecimal** | The price of the product at this location |  [optional] |
|**inventoryLocatorName** | **String** | The inventory locator name of the individual item |  [optional] |
|**attributes** | **List&lt;String&gt;** | List of Inventory Attributes |  [optional] |
|**taggedInventory** | [**List&lt;InventoryTagQuantity&gt;**](InventoryTagQuantity.md) |  |  [optional] |
|**futureInventory** | [**List&lt;InventoryFutureInventory&gt;**](InventoryFutureInventory.md) |  |  [optional] |
|**success** | **Boolean** | Flag for success |  [optional] |
|**messages** | **List&lt;String&gt;** | List of messages |  [optional] |
|**numResults** | **Integer** | Number of results |  [optional] |


## Implemented Interfaces

* Serializable


