

# ApiDocumentationFutureInventory

Future Inventory Model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allocated** | **Integer** | Expected change in the actual allocated inventory value when this future inventory record is released. |  [optional] |
|**available** | **Integer** | Expected change in the actual available inventory value when this future inventory record is released. |  [optional] |
|**createDate** | **OffsetDateTime** | Date the inventory was created. |  [optional] |
|**deliveryDate** | **OffsetDateTime** | Date at which this inventory will become available. Expected format &#39;2020-09-28T12:00:00-0500&#39; |  [optional] |
|**futureInventoryID** | **Integer** | Future Inventory unique identifier. |  [optional] |
|**onhand** | **Integer** | Expected change in the actual onhand inventory value when this future inventory record is released. |  [optional] |
|**pending** | **Integer** | Number of new expected pending items that would be created by releasing this future inventory record assuming no actual inventory is available |  [optional] |
|**type** | **String** | Type of future inventory update: REFRESH or ADJUST. |  [optional] |


## Implemented Interfaces

* Serializable


