

# SuggestionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assignmentSuggestionShipmentGroups** | [**List&lt;AssignmentSuggestionShipmentGroup&gt;**](AssignmentSuggestionShipmentGroup.md) |  |  [optional] |
|**assignmentSuggestions** | **Map&lt;String, List&lt;AssignmentSuggestion&gt;&gt;** |  |  [optional] |
|**attributes** | [**List&lt;OrderRoutingOrderAttribute&gt;**](OrderRoutingOrderAttribute.md) |  |  [optional] |
|**availableLocations** | **List&lt;Integer&gt;** |  |  [optional] |
|**data** | **Map&lt;String, String&gt;** |  |  [optional] |
|**emptyResponse** | **Boolean** |  |  [optional] |
|**externalResponseID** | **String** |  |  [optional] |
|**futureAssignmentSuggestions** | **Map&lt;String, List&lt;AssignmentSuggestion&gt;&gt;** |  |  [optional] |
|**responseID** | **Integer** |  |  [optional] |
|**route** | [**RouteEnum**](#RouteEnum) |  |  [optional] |
|**stateChangeSuggestions** | [**Map&lt;String, StateChangeSuggestion&gt;**](StateChangeSuggestion.md) |  |  [optional] |
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


