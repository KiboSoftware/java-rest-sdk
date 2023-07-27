

# SuggestionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assignmentSuggestions** | **Map&lt;String, List&lt;AssignmentSuggestion&gt;&gt;** |  |  [optional] |
|**availableLocations** | **List&lt;Integer&gt;** |  |  [optional] |
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


## Implemented Interfaces

* Serializable


