

# ItemConsumption

Per-item detail within a ConsumptionRecord, tracking the quantity consumed from a specific Blanket Order item and the remaining balance after the operation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blanketOrderItemId** | **String** | The Blanket Order item ID that was consumed. |  [optional] |
|**productCode** | **String** | Product code of the consumed item. |  [optional] |
|**quantity** | **Integer** | Quantity consumed (positive) or restored (negative for reversals). |  [optional] |
|**remainingAfter** | **Integer** | Remaining quantity on the Blanket Order item after this operation. |  [optional] |
|**reservedQuantity** | **Integer** | Reservation-ledger adjustment magnitude for BlanketOrderItem.ReservedQuantity. Always a non-negative magnitude — direction is determined by which method applies it (BlanketOrderHandler.ConsumeAsync adds it, RestoreAsync subtracts it), mirroring the existing Mozu.CommerceRuntime.Contracts.BlanketOrders.ItemConsumption.Quantity field&#39;s convention. Defaults to 0 for commitment-only operations (e.g. new call-off creation before any allocation). |  [optional] |
|**variationProductCode** | **String** | For configurable products, the variation product code of the consumed item. |  [optional] |


## Implemented Interfaces

* Serializable


