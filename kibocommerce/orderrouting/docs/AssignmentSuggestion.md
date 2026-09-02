

# AssignmentSuggestion


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bopisFulfillmentDate** | **OffsetDateTime** |  |  [optional] |
|**bopisProcessingTimeHours** | **Integer** |  |  [optional] |
|**data** | **Map&lt;String, String&gt;** |  |  [optional] |
|**futureDate** | **OffsetDateTime** |  |  [optional] |
|**futureDateString** | **String** |  |  [optional] |
|**locationCode** | **String** |  |  [optional] |
|**locationID** | **Integer** |  |  [optional] |
|**orderItemID** | **Integer** |  |  [optional] |
|**quantity** | **Integer** |  |  [optional] |
|**receiveProcessingTimeHours** | **Integer** |  |  [optional] |
|**route** | [**RouteEnum**](#RouteEnum) |  |  [optional] |
|**shipmentGroup** | **String** |  |  [optional] |
|**sthFulfillmentDate** | **OffsetDateTime** |  |  [optional] |
|**sthProcessingTimeHours** | **Integer** |  |  [optional] |
|**transferFulfillmentDate** | **OffsetDateTime** |  |  [optional] |
|**transferProcessingTimeHours** | **Integer** |  |  [optional] |
|**transferToLocationCode** | **String** |  |  [optional] |



## Enum: RouteEnum

| Name | Value |
|---- | -----|
| DIRECTSHIP | &quot;DIRECTSHIP&quot; |
| TRANSFER | &quot;TRANSFER&quot; |
| STH_CONSOLIDATED | &quot;STH_CONSOLIDATED&quot; |
| RETURN | &quot;RETURN&quot; |
| DISPOSITION | &quot;DISPOSITION&quot; |
| DELIVERY | &quot;DELIVERY&quot; |
| BOPIS | &quot;BOPIS&quot; |


## Implemented Interfaces

* Serializable


