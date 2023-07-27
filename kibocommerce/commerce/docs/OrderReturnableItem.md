

# OrderReturnableItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productCode** | **String** | The product code of the associated item. |  [optional] |
|**productName** | **String** | The name of the associated product. |  [optional] |
|**shipmentNumber** | **Integer** | Shipment Number associated with product |  [optional] |
|**shipmentItemId** | **Integer** | Shipment Item Id Number associated with product |  [optional] |
|**quantityOrdered** | **Integer** | The number of units ordered. |  [optional] |
|**quantityFulfilled** | **Integer** | The number of units fulfilled. |  [optional] |
|**quantityReturned** | **Integer** | The number if times this item configuration was found in live returns (not cancelled or rejected). |  [optional] |
|**quantityRejected** | **Integer** |  |  [optional] |
|**quantityReturnable** | **Integer** |  |  [optional] [readonly] |
|**fulfillmentStatus** | **String** |  |  [optional] |
|**orderItemId** | **String** |  |  [optional] |
|**orderLineId** | **Integer** |  |  [optional] |
|**orderItemOptionAttributeFQN** | **String** |  |  [optional] |
|**unitQuantity** | **Integer** |  |  [optional] |
|**parentProductCode** | **String** |  |  [optional] |
|**parentProductName** | **String** |  |  [optional] |
|**fulfillmentFields** | [**List&lt;CommerceRuntimeFulfillmentField&gt;**](CommerceRuntimeFulfillmentField.md) | List of unique product identifiers for an item on shipment |  [optional] |
|**sku** | **String** |  |  [optional] |
|**mfgPartNumber** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


