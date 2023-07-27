

# ReassignShipment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockAssignment** | **Boolean** | If true, order routing will not suggest that any shipments with these items be assigned to the original location. This persists until the inventory records for these items are updated. When the records are updated, blockAssignment will automatically be disabled again to allow new assignments. This is an optional parameter and defaults to false if not provided in the request. |  [optional] |
|**fulfillmentLocationCode** | **String** |  |  [optional] |
|**isUserAction** | **Boolean** |  |  [optional] |
|**items** | [**List&lt;ReassignItem&gt;**](ReassignItem.md) |  |  [optional] |
|**reassignedReason** | [**ReassignedReason**](ReassignedReason.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


