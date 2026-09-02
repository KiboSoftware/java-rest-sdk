

# PickWave


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**auditInfo** | [**FulfillmentAPIAuditInfo**](FulfillmentAPIAuditInfo.md) |  |  [optional] |
|**changeMessages** | [**List&lt;FulfillmentAPIChangeMessage&gt;**](FulfillmentAPIChangeMessage.md) |  |  [optional] |
|**contents** | [**List&lt;PickWaveContent&gt;**](PickWaveContent.md) |  |  [optional] |
|**fulfillmentLocationCode** | **String** |  |  [optional] |
|**maxShipments** | **Integer** |  |  [optional] |
|**parentPickWaveNumber** | **Integer** |  |  [optional] |
|**pickType** | [**PickTypeEnum**](#PickTypeEnum) |  |  [optional] |
|**pickWaveId** | **String** |  |  [optional] |
|**pickWaveNumber** | **Integer** |  |  [optional] |
|**pickWaveRuleCode** | **String** |  |  [optional] |
|**pickWaveStatus** | [**PickWaveStatusEnum**](#PickWaveStatusEnum) |  |  [optional] |
|**recoveryPickWaveNumber** | **Integer** |  |  [optional] |
|**shipmentNumbers** | **List&lt;Integer&gt;** |  |  [optional] |
|**shipmentType** | **String** |  |  [optional] |
|**tenantId** | **Integer** |  |  [optional] |
|**userDisplayName** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |



## Enum: PickTypeEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;NORMAL&quot; |
| SINGLE | &quot;SINGLE&quot; |
| MULTIPLE | &quot;MULTIPLE&quot; |



## Enum: PickWaveStatusEnum

| Name | Value |
|---- | -----|
| ERROR | &quot;ERROR&quot; |
| PENDING | &quot;PENDING&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| CLOSED | &quot;CLOSED&quot; |
| PENDING_RECOVERY | &quot;PENDING_RECOVERY&quot; |


## Implemented Interfaces

* Serializable


