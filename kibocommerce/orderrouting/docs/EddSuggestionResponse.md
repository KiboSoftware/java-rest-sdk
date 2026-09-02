

# EddSuggestionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assignmentSuggestionShipmentGroups** | [**List&lt;AssignmentSuggestionShipmentGroup&gt;**](AssignmentSuggestionShipmentGroup.md) |  |  [optional] |
|**attributes** | [**List&lt;OrderRoutingOrderAttribute&gt;**](OrderRoutingOrderAttribute.md) |  |  [optional] |
|**availableLocations** | **List&lt;Integer&gt;** |  |  [optional] |
|**customData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**data** | **Map&lt;String, String&gt;** |  |  [optional] |
|**eddAssignments** | [**List&lt;EddItemSuggestion&gt;**](EddItemSuggestion.md) |  |  [optional] |
|**eddCalculationLog** | [**EddCalculationLog**](EddCalculationLog.md) |  |  [optional] |
|**eddCalculationLogID** | **Integer** |  |  [optional] |
|**externalResponseID** | **String** |  |  [optional] |
|**responseID** | **Integer** |  |  [optional] |
|**route** | [**RouteEnum**](#RouteEnum) |  |  [optional] |
|**stateChangeSuggestions** | **Map&lt;String, List&lt;EDDStateChangeSuggestion&gt;&gt;** |  |  [optional] |
|**suggestionLog** | [**SuggestionLog**](SuggestionLog.md) |  |  [optional] |



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


