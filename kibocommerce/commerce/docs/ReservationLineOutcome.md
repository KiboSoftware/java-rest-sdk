

# ReservationLineOutcome


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**itemId** | **String** | The CallOffOrder line — the auto-generated GUID             &#x60;CallOffOrderItem.Id&#x60;, used as the join key into &#x60;order.Items[]&#x60;. |  [optional] |
|**lineId** | **Integer** | The operator-visible line sequence number (1, 2, ...) from             &#x60;CallOffOrderItem.LineId&#x60;. |  [optional] |
|**newFillRate** | **Double** |  |  [optional] |
|**newLineStatus** | **String** |  |  [optional] |
|**newReservedQty** | **Integer** |  |  [optional] |
|**previousReservedQty** | **Integer** |  |  [optional] |
|**productCode** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


