

# EddAssignmentSuggestion


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | **Map&lt;String, String&gt;** |  |  [optional] |
|**estimatedDeliveryDates** | [**List&lt;EstimatedDeliveryDate&gt;**](EstimatedDeliveryDate.md) |  |  [optional] |
|**futureDate** | **OffsetDateTime** |  |  [optional] |
|**futureDateString** | **String** |  |  [optional] |
|**locationCode** | **String** |  |  [optional] |
|**orderItemID** | **Integer** |  |  [optional] |
|**quantity** | **Integer** |  |  [optional] |
|**route** | [**RouteEnum**](#RouteEnum) |  |  [optional] |
|**shipmentGroup** | **String** |  |  [optional] |
|**transferToLocationCode** | **String** |  |  [optional] |
|**upc** | **String** |  |  [optional] |



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


