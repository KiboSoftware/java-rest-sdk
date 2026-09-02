

# OrderItemLogResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **String** | The date of this log entry |  [optional] |
|**fixed** | **Boolean** | Whether this event has been fixed |  [optional] |
|**inventoryID** | **Integer** | Inventory Identifier |  [optional] |
|**locationCode** | **String** | Location Code Identifier |  [optional] |
|**orderID** | **Integer** | Order Identifier |  [optional] |
|**orderItemID** | **Integer** | Order Item Identifier |  [optional] |
|**partNumber** | **String** | Part/Product Number |  [optional] |
|**quantity** | **Integer** | The number of items affected for this log entry |  [optional] |
|**resolved** | **Boolean** | Whether this event is resolved |  [optional] |
|**shipmentID** | **Integer** | Shipment Identifier |  [optional] |
|**tenantID** | **Integer** | Tenant Identifier |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of logs to retrieve |  [optional] |
|**upc** | **String** | Universal Product Code |  [optional] |
|**userID** | **Integer** | User Identifier |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALLOCATE | &quot;ALLOCATE&quot; |
| DEALLOCATE | &quot;DEALLOCATE&quot; |
| FULFILL | &quot;FULFILL&quot; |
| PICK | &quot;PICK&quot; |


## Implemented Interfaces

* Serializable


