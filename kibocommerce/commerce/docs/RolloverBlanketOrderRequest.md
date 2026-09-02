

# RolloverBlanketOrderRequest

Request DTO for rolling over an expired Blanket Order to a new order. Used by POST /blanketorders/{blanketOrderId}/rollover endpoint. ICKY-2647: Blanket Order Rollover

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endDate** | **OffsetDateTime** | End date for the new Blanket Order&#39;s validity period. Must be after StartDate. |  [optional] |
|**selectedLineItemIds** | **List&lt;String&gt;** | Line item IDs to include in the new Blanket Order. Only Open status items are eligible for rollover. |  [optional] |
|**startDate** | **OffsetDateTime** | Start date for the new Blanket Order&#39;s validity period. |  [optional] |


## Implemented Interfaces

* Serializable


