

# CreatePickWave


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowEmptyWave** | **Boolean** |  |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**binRanges** | [**List&lt;PickWaveBinRange&gt;**](PickWaveBinRange.md) |  |  [optional] |
|**fulfillableShipmentsOnly** | **Boolean** |  |  [optional] |
|**fulfillmentLocationCode** | **String** |  |  |
|**includeZeroInventory** | **Boolean** |  |  [optional] |
|**lockWave** | **Boolean** |  |  [optional] |
|**maxShipments** | **Integer** |  |  |
|**pickWaveType** | [**PickWaveTypeEnum**](#PickWaveTypeEnum) |  |  [optional] |
|**products** | [**List&lt;PickWaveProductMatch&gt;**](PickWaveProductMatch.md) |  |  [optional] |
|**shipmentDateEnd** | **OffsetDateTime** |  |  [optional] |
|**shipmentDateStart** | **OffsetDateTime** |  |  [optional] |
|**shipmentType** | [**ShipmentTypeEnum**](#ShipmentTypeEnum) |  |  |
|**shippingOption** | [**ShippingOptionEnum**](#ShippingOptionEnum) |  |  [optional] |



## Enum: PickWaveTypeEnum

| Name | Value |
|---- | -----|
| MULTIPLE | &quot;MULTIPLE&quot; |
| NORMAL | &quot;NORMAL&quot; |
| SINGLE | &quot;SINGLE&quot; |



## Enum: ShipmentTypeEnum

| Name | Value |
|---- | -----|
| BOPIS | &quot;BOPIS&quot; |
| STH | &quot;STH&quot; |



## Enum: ShippingOptionEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| EXPRESS_ONLY | &quot;EXPRESS_ONLY&quot; |
| STANDARD_ONLY | &quot;STANDARD_ONLY&quot; |


## Implemented Interfaces

* Serializable


