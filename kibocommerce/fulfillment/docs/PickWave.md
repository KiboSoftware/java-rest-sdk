

# PickWave


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**auditInfo** | [**AuditInfo0**](AuditInfo0.md) |  |  [optional] |
|**changeMessages** | [**List&lt;FulfillmentChangeMessage&gt;**](FulfillmentChangeMessage.md) |  |  [optional] |
|**contents** | [**List&lt;PickWaveContent&gt;**](PickWaveContent.md) |  |  [optional] |
|**fulfillmentLocationCode** | **String** |  |  [optional] |
|**maxShipments** | **Integer** |  |  [optional] |
|**parentPickWaveNumber** | **Integer** |  |  [optional] |
|**pickType** | [**PickTypeEnum**](#PickTypeEnum) |  |  [optional] |
|**pickWaveId** | **String** |  |  [optional] |
|**pickWaveNumber** | **Integer** |  |  [optional] |
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
| MULTIPLE | &quot;MULTIPLE&quot; |
| NORMAL | &quot;NORMAL&quot; |
| SINGLE | &quot;SINGLE&quot; |



## Enum: PickWaveStatusEnum

| Name | Value |
|---- | -----|
| CLOSED | &quot;CLOSED&quot; |
| ERROR | &quot;ERROR&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| PENDING | &quot;PENDING&quot; |
| PENDING_RECOVERY | &quot;PENDING_RECOVERY&quot; |


## Implemented Interfaces

* Serializable


