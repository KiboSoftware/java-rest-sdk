

# CallOffOrderRuleEvalRequest

Request body for `POST /commerce/rules/callOffOrder/{code}/evaluate`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pageSize** | **Integer** | Requested page size. Defaults to 50 when omitted. Values above 200 are silently clamped to 200 per FR-009. |  [optional] |
|**pageToken** | **String** | Opaque cursor returned by a prior response&#39;s &#x60;NextPageToken&#x60;. Null on the first page. |  [optional] |
|**statusFilter** | **String** | Optional Call-Off Order status (e.g. &#x60;\&quot;Hold\&quot;&#x60;) AND-composed with the rule predicate at evaluation time. |  [optional] |


## Implemented Interfaces

* Serializable


