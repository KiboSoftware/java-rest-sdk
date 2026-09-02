

# SuggestionLog


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**created** | **OffsetDateTime** |  |  [optional] |
|**creatorUsername** | **String** |  |  [optional] |
|**environmentID** | **Integer** |  |  |
|**events** | [**List&lt;SuggestionEvent&gt;**](SuggestionEvent.md) |  |  [optional] |
|**externalResponseID** | **String** |  |  [optional] |
|**fieldsForNewEddSuggestionRequest** | [**NewEddRequestSuggestionEvent**](NewEddRequestSuggestionEvent.md) |  |  [optional] |
|**fieldsForNewReturnsSuggestionRequest** | [**NewReverseLogisticsRequestSuggestionEvent**](NewReverseLogisticsRequestSuggestionEvent.md) |  |  [optional] |
|**fieldsForNewSuggestionRequest** | [**NewRequestSuggestionEvent**](NewRequestSuggestionEvent.md) |  |  [optional] |
|**orderID** | **Integer** |  |  [optional] |
|**orderTypeCategory** | [**OrderTypeCategoryEnum**](#OrderTypeCategoryEnum) |  |  [optional] |
|**pathString** | **String** |  |  [optional] |
|**persisted** | **Boolean** |  |  [optional] |
|**returnID** | **Integer** |  |  [optional] |
|**siteID** | **Integer** |  |  |
|**suggestionID** | **Integer** |  |  [optional] |
|**tenantID** | **Integer** |  |  |
|**updated** | **OffsetDateTime** |  |  [optional] |
|**updaterUsername** | **String** |  |  [optional] |
|**userContext** | [**UserContextInformation**](UserContextInformation.md) |  |  [optional] |



## Enum: OrderTypeCategoryEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;STANDARD&quot; |
| REVERSE_LOGISTICS | &quot;REVERSE_LOGISTICS&quot; |
| ESTIMATED_DELIVERY_DATE | &quot;ESTIMATED_DELIVERY_DATE&quot; |
| EDD_SUGGESTION | &quot;EDD_SUGGESTION&quot; |


## Implemented Interfaces

* Serializable


