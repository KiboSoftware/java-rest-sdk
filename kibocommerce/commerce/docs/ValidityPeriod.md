

# ValidityPeriod

Represents the validity window for a Blanket Order. Call-off orders can only be placed while the current date is within this period.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endDate** | **OffsetDateTime** | End date of the validity period. Must be after StartDate. |  [optional] |
|**startDate** | **OffsetDateTime** | Start date of the validity period. Must be today or in the future on creation. |  [optional] |


## Implemented Interfaces

* Serializable


