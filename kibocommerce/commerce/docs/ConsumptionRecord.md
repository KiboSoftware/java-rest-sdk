

# ConsumptionRecord

Audit entry recording the consumption or restoration of Blanket Order balance by a call-off order. Stored in a separate BlanketOrderConsumptionRecord collection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callOffOrderId** | **String** | The call-off order that triggered this consumption or reversal. |  [optional] |
|**consumptionTime** | **OffsetDateTime** | Timestamp of the consumption event. System-supplied. |  [optional] |
|**id** | **String** | Unique identifier. System-supplied. |  [optional] |
|**itemConsumptions** | [**List&lt;ItemConsumption&gt;**](ItemConsumption.md) | Per-line consumption details. |  [optional] |
|**type** | **String** | Type of record: \&quot;Consumption\&quot; or \&quot;Reversal\&quot;. |  [optional] |
|**userId** | **String** | User who performed the action. |  [optional] |


## Implemented Interfaces

* Serializable


