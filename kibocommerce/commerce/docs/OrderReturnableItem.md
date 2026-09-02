

# OrderReturnableItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appliedReturnRuleInfo** | [**AppliedReturnRuleInfo**](AppliedReturnRuleInfo.md) |  |  [optional] |
|**fulfillmentFields** | [**List&lt;FulfillmentField&gt;**](FulfillmentField.md) | List of unique product identifiers for an item on shipment |  [optional] |
|**fulfillmentStatus** | **String** |  |  [optional] |
|**mfgPartNumber** | **String** |  |  [optional] |
|**orderItemId** | **String** |  |  [optional] |
|**orderItemOptionAttributeFQN** | **String** |  |  [optional] |
|**orderLineId** | **Integer** |  |  [optional] |
|**parentProductCode** | **String** |  |  [optional] |
|**parentProductName** | **String** |  |  [optional] |
|**productCode** | **String** | The product code of the associated item. |  [optional] |
|**productName** | **String** | The name of the associated product. |  [optional] |
|**quantityFulfilled** | **Integer** | The number of units fulfilled. |  [optional] |
|**quantityOrdered** | **Integer** | The number of units ordered. |  [optional] |
|**quantityRejected** | **Integer** |  |  [optional] |
|**quantityReturnable** | **Integer** |  |  [optional] [readonly] |
|**quantityReturned** | **Integer** | The number if times this item configuration was found in live returns (not cancelled or rejected). |  [optional] |
|**shipmentItemId** | **Integer** | Shipment Item Id Number associated with product |  [optional] |
|**shipmentNumber** | **Integer** | Shipment Number associated with product |  [optional] |
|**sku** | **String** |  |  [optional] |
|**unitQuantity** | **Integer** |  |  [optional] |


## Implemented Interfaces

* Serializable


