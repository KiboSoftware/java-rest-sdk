

# OrderItemInformation

Order Item Information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allocated** | **Integer** | The quantity the location has that are allocated |  [optional] |
|**allocates** | **Integer** | Total number of allocations |  [optional] |
|**available** | **Integer** | The quantity the location has that are available for purchase |  [optional] |
|**binID** | **Integer** | Bin Identifier |  [optional] |
|**deallocates** | **Integer** | Total number of deallocations |  [optional] |
|**events** | [**List&lt;OrderItemInformationEvent&gt;**](OrderItemInformationEvent.md) | Order Identifier |  [optional] |
|**floor** | **Integer** | Absolute minimum quantity of this item that should be in stock at any time |  [optional] |
|**fulfills** | **Integer** | Total number of fulfillments. Should never be greater than 1. |  [optional] |
|**locationActive** | **Boolean** | Flag for whether the location is active |  [optional] |
|**locationCode** | **Integer** | External Store Identifier |  [optional] |
|**locationID** | **Integer** | Location Identifier |  [optional] |
|**locationName** | **String** | Location Name |  [optional] |
|**ltd** | **String** | Custom field used for store prioritization |  [optional] |
|**onHand** | **Integer** | The quantity the location has in its possession |  [optional] |
|**orderID** | **Integer** | Order Identifier |  [optional] |
|**orderItemID** | **Integer** | Order Item Identifier |  [optional] |
|**partNumber** | **String** | Part/Product Number |  [optional] |
|**pendingQuantity** | **Integer** | Pending quantity (WMS only) |  [optional] |
|**picks** | **Integer** | Total number of picks (WMS only) |  [optional] |
|**safetyStock** | **Integer** | Quantity of this item the location wants to keep in stock to ensure stock isn&#39;t completely depleted |  [optional] |
|**sku** | **String** | Stock Keeping Unit |  [optional] |
|**upc** | **String** | Universal Product Code |  [optional] |
|**messages** | **List&lt;String&gt;** | List of messages |  [optional] |
|**numResults** | **Integer** | Number of results |  [optional] |
|**success** | **Boolean** | Flag for success |  [optional] |


## Implemented Interfaces

* Serializable


