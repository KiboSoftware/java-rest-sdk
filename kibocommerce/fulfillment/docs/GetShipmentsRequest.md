

# GetShipmentsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bypassSearchIndex** | **Boolean** |  |  [optional] |
|**filter** | **String** |  |  [optional] |
|**isExpress** | **Boolean** |  |  [optional] |
|**isLate** | **Boolean** |  |  [optional] |
|**locationGroupCode** | **String** |  |  [optional] |
|**page** | **Integer** |  |  [optional] |
|**pageSize** | **Integer** |  |  [optional] |
|**pickStatus** | [**PickStatusEnum**](#PickStatusEnum) |  |  [optional] |
|**pickWaveType** | [**PickWaveTypeEnum**](#PickWaveTypeEnum) |  |  [optional] |
|**pickable** | **Boolean** |  |  [optional] |
|**quickSearch** | **String** |  |  [optional] |
|**slaCompliance** | **String** |  |  [optional] |
|**sort** | **String** |  |  [optional] |
|**timePeriodUnit** | [**TimePeriodUnitEnum**](#TimePeriodUnitEnum) |  |  [optional] |
|**timePeriodValue** | **Integer** |  |  [optional] |
|**workflowTaskName** | **String** |  |  [optional] |



## Enum: PickStatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| IN_WAVE | &quot;IN_WAVE&quot; |
| PICKED | &quot;PICKED&quot; |
| TRANSFER | &quot;TRANSFER&quot; |
| COMPLETE | &quot;COMPLETE&quot; |



## Enum: PickWaveTypeEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;NORMAL&quot; |
| SINGLE | &quot;SINGLE&quot; |
| MULTIPLE | &quot;MULTIPLE&quot; |



## Enum: TimePeriodUnitEnum

| Name | Value |
|---- | -----|
| HOURS | &quot;HOURS&quot; |
| DAYS | &quot;DAYS&quot; |
| WEEKS | &quot;WEEKS&quot; |
| MONTHS | &quot;MONTHS&quot; |
| YEARS | &quot;YEARS&quot; |


## Implemented Interfaces

* Serializable


