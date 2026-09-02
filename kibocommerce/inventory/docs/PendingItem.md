

# PendingItem

Pending Item

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**locationCode** | **String** | Location Code |  [optional] |
|**orderID** | **Integer** | Order Identifier |  [optional] |
|**partNumber** | **String** | Part/Product Number |  [optional] |
|**pendingItemID** | **Integer** | Pending Item Identifier |  [optional] |
|**quantity** | **Integer** | The number of items affected for this log entry |  [optional] |
|**shipmentID** | **Integer** | Shipment Identifier |  [optional] |
|**sku** | **String** | Stock Keeping Unit |  [optional] |
|**toBin** | **String** | To Bin ID |  [optional] |
|**toBinID** | **Integer** | To Bin ID |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Pending Item type |  [optional] |
|**upc** | **String** | Universal Product Code |  [optional] |
|**messages** | **List&lt;String&gt;** | List of messages |  [optional] |
|**numResults** | **Integer** | Number of results |  [optional] |
|**success** | **Boolean** | Flag for success |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BIN | &quot;TYPE_BIN&quot; |
| DC | &quot;TYPE_DC&quot; |
| AUDIT | &quot;TYPE_AUDIT&quot; |
| RESTOCK | &quot;TYPE_RESTOCK&quot; |


## Implemented Interfaces

* Serializable


