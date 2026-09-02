

# ReverseLogisticsSuggestionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalResponseID** | **String** |  |  [optional] |
|**responseID** | **Integer** |  |  [optional] |
|**reverseLogisticsSuggestions** | [**Map&lt;String, ReturnAssignmentSuggestion&gt;**](ReturnAssignmentSuggestion.md) |  |  [optional] |
|**route** | [**RouteEnum**](#RouteEnum) |  |  [optional] |
|**stateChangeSuggestions** | [**Map&lt;String, ReverseLogisticsStateChangeSuggestion&gt;**](ReverseLogisticsStateChangeSuggestion.md) |  |  [optional] |
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


