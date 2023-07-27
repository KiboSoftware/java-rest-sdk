

# SearchSuggestion

A suggested result based on the search query

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**suggestionType** | **String** | The type of Suggestion (e.g. Term, Product, Category).   Will be one of the values of the SuggestionTypeConst type. |  [optional] |
|**suggestion** | **Object** | A suggested entity based on the search query. Use the SuggestionType to determine the type of entity.  Could be a SearchTerm, Product, or Category |  [optional] |


## Implemented Interfaces

* Serializable


