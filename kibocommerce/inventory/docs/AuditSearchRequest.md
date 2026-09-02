

# AuditSearchRequest

Request for searching audits

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditID** | **Integer** | Audit identifier |  [optional] |
|**auditStatus** | **String** | Audit Status |  [optional] |
|**binName** | **String** | Name of the bin |  [optional] |
|**dateRange** | [**DateRange**](DateRange.md) |  |  [optional] |
|**products** | [**List&lt;ProductMatch&gt;**](ProductMatch.md) | List of matching products |  [optional] |
|**locationCode** | **String** | Location Code |  [optional] |
|**pageNum** | **Integer** | which page to show |  [optional] |
|**pageSize** | **Integer** | how many results to show per page |  [optional] |
|**sortBy** | **String** | index to sort results by |  [optional] |
|**userID** | **Integer** | user id |  [optional] |


## Implemented Interfaces

* Serializable


