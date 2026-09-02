

# ReleaseLineOutcome

Per-line outcome surfaced on Mozu.CommerceRuntime.Contracts.SupplyChain.ReleaseRules.ReleaseRunHistoryRecord.LineOutcomes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**evaluatedFillRate** | **Double** |  |  [optional] |
|**evaluatedShipDate** | **OffsetDateTime** |  |  [optional] |
|**itemId** | **String** | The CallOffOrder line — the auto-generated GUID             &#x60;CallOffOrderItem.Id&#x60;, used as the join key into &#x60;order.Items[]&#x60;. |  [optional] |
|**lineId** | **Integer** | The operator-visible line sequence number (1, 2, ...) from             &#x60;CallOffOrderItem.LineId&#x60;. Null when the line could not be resolved             back to the live order. |  [optional] |
|**lineOutcome** | **String** |  |  [optional] |
|**salesOrderId** | **String** |  |  [optional] |
|**skipReason** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


