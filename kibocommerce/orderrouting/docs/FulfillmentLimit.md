

# FulfillmentLimit


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**created** | **OffsetDateTime** |  |  [optional] |
|**creatorUsername** | **String** |  |  [optional] |
|**durationType** | [**DurationTypeEnum**](#DurationTypeEnum) |  |  |
|**environmentID** | **Integer** |  |  |
|**fulfillmentLimit** | **BigDecimal** |  |  |
|**fulfillmentLimitID** | **Integer** |  |  [optional] |
|**fulfillmentType** | [**FulfillmentTypeEnum**](#FulfillmentTypeEnum) |  |  |
|**name** | **String** |  |  [optional] |
|**pathString** | **String** |  |  [optional] |
|**persisted** | **Boolean** |  |  [optional] |
|**siteID** | **Integer** |  |  |
|**tenantID** | **Integer** |  |  |
|**updated** | **OffsetDateTime** |  |  [optional] |
|**updaterUsername** | **String** |  |  [optional] |
|**userContext** | [**UserContextInformation**](UserContextInformation.md) |  |  [optional] |



## Enum: DurationTypeEnum

| Name | Value |
|---- | -----|
| HOURS | &quot;HOURS&quot; |
| DAYS | &quot;DAYS&quot; |
| WEEKS | &quot;WEEKS&quot; |
| MONTHS | &quot;MONTHS&quot; |



## Enum: FulfillmentTypeEnum

| Name | Value |
|---- | -----|
| ORDERS | &quot;ORDERS&quot; |
| ITEMS | &quot;ITEMS&quot; |
| DOLLARS | &quot;DOLLARS&quot; |


## Implemented Interfaces

* Serializable


