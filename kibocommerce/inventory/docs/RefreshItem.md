

# RefreshItem

Refresh Item

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**LTD** | **BigDecimal** | Custom field used for store prioritization |  [optional] |
|**attributes** | **List&lt;String&gt;** | List of Item Attributes |  [optional] |
|**binID** | **Integer** | Bin Location Identifier |  [optional] |
|**condition** | **String** | Describes the state of the product |  [optional] |
|**date** | **OffsetDateTime** | Used by the retailer for storing information related to manufacturing date or expiry date and use date to allocate for better stock management |  [optional] |
|**deliveryDate** | **OffsetDateTime** | Date at which this inventory will become available. Expected format &#39;2020-09-28T12:00:00-0500&#39; |  [optional] |
|**externalID** | **String** | External Identifier for the given future inventory record. Will not create a new future inventory record unless deliveryDate is specified |  [optional] |
|**floor** | **Integer** | Absolute minimum quantity of this item that should be in stock at any time |  [optional] |
|**granularInventoryTrackingEnabled** | **Boolean** |  |  [optional] [readonly] |
|**inventoryLocatorName** | **String** | The inventory locator name of the item |  [optional] |
|**lotCode** | **String** | Track which lot a product is manufactured in |  [optional] |
|**partNumber** | **String** | Part/Product Number |  [optional] |
|**quantity** | **Integer** | Current Quantity of Item |  [optional] |
|**safetyStock** | **Integer** | Quantity of this item the location wants to keep in stock to ensure stock isn&#39;t completely depleted |  [optional] |
|**serialNumber** | **String** | A serial number is unique to a specific, physical unit of inventory |  [optional] |
|**sku** | **String** | Stock Keeping Unit |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Associative Map of &lt;String, String&gt; for tagCategoryName &#x3D;&gt; tagName |  [optional] |
|**upc** | **String** | Universal Product Code |  [optional] |


## Implemented Interfaces

* Serializable


