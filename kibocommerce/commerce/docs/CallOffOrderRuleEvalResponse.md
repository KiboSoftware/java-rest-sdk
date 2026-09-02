

# CallOffOrderRuleEvalResponse

Response body for `POST /commerce/rules/callOffOrder/{code}/evaluate`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callOffOrderIds** | **List&lt;String&gt;** | Matched Call-Off Order ids, up to &#x60;PageSize&#x60;, ordered by &#x60;_id&#x60; ascending. |  [optional] |
|**nextPageToken** | **String** | Cursor for the next page; null when this is the last page. |  [optional] |
|**ruleCode** | **String** | Echoed input rule code for client correlation. |  [optional] |
|**totalCount** | **Integer** | Total number of matching orders across all pages (not capped at &#x60;PageSize&#x60;). |  [optional] |


## Implemented Interfaces

* Serializable


