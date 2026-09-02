

# CreatePickWave


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowEmptyWave** | **Boolean** |  |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**binRanges** | [**List&lt;PickWaveBinRange&gt;**](PickWaveBinRange.md) |  |  [optional] |
|**fulfillableShipmentsOnly** | **Boolean** |  |  [optional] |
|**fulfillmentLocationCode** | **String** |  |  [optional] |
|**includeZeroInventory** | **Boolean** |  |  [optional] |
|**lockWave** | **Boolean** |  |  [optional] |
|**maxShipments** | **Integer** |  |  [optional] |
|**pickWaveType** | [**PickWaveTypeEnum**](#PickWaveTypeEnum) |  |  [optional] |
|**products** | [**List&lt;PickWaveProductMatch&gt;**](PickWaveProductMatch.md) |  |  [optional] |
|**shipmentDateEnd** | **OffsetDateTime** |  |  [optional] |
|**shipmentDateStart** | **OffsetDateTime** |  |  [optional] |
|**shipmentType** | [**ShipmentTypeEnum**](#ShipmentTypeEnum) |  |  [optional] |
|**shippingOption** | [**ShippingOptionEnum**](#ShippingOptionEnum) |  |  [optional] |



## Enum: PickWaveTypeEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;NORMAL&quot; |
| SINGLE | &quot;SINGLE&quot; |
| MULTIPLE | &quot;MULTIPLE&quot; |



## Enum: ShipmentTypeEnum

| Name | Value |
|---- | -----|
| STH | &quot;STH&quot; |
| BOPIS | &quot;BOPIS&quot; |



## Enum: ShippingOptionEnum

| Name | Value |
|---- | -----|
| STANDARD_ONLY | &quot;STANDARD_ONLY&quot; |
| EXPRESS_ONLY | &quot;EXPRESS_ONLY&quot; |
| ALL | &quot;ALL&quot; |


## Implemented Interfaces

* Serializable


