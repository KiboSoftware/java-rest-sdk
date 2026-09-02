

# BlanketOrderItem

A single product commitment within a Blanket Order. Each line tracks its own lifecycle independently.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**List&lt;BlanketOrderItemAttribute&gt;**](BlanketOrderItemAttribute.md) | Line-level extensible attributes. Use Mozu.CommerceRuntime.Contracts.BlanketOrders.BlanketOrderAttribute on &#x60;BlanketOrder.Attributes&#x60; for header-level attributes. |  [optional] |
|**auditInfo** | [**CoreApiContractsAuditInfo**](CoreApiContractsAuditInfo.md) |  |  [optional] |
|**consumedQuantity** | **Integer** | Total quantity consumed by call-off orders. System-managed. |  [optional] |
|**id** | **String** | Unique identifier for this line. System-supplied. |  [optional] |
|**lineId** | **Integer** | Auto-assigned sequential line number within the order. |  [optional] |
|**product** | [**BlanketOrderProductReference**](BlanketOrderProductReference.md) |  |  [optional] |
|**quantity** | **Integer** | Total committed quantity for this product line. |  [optional] |
|**remainingQuantity** | **Integer** | Remaining available quantity (Quantity - ConsumedQuantity). System-managed. |  [optional] |
|**reservedQuantity** | **Integer** | Quantity currently reserved by active call-off allocations against this blanket item. System-managed; not client-settable. Updated only via the internal consumption/ restoration ledger (BlanketOrderHandler.ConsumeAsync/RestoreAsync). |  [optional] |
|**status** | **String** | Current line status managed by the line-level transition table. |  [optional] |
|**unitPrice** | **Double** | Agreed unit price for this product line. |  [optional] |
|**unreservedQuantity** | **Integer** | Computed: Quantity - ReservedQuantity. The blanket&#39;s balance not yet reserved by call-off allocations. Not persisted. |  [optional] [readonly] |


## Implemented Interfaces

* Serializable


