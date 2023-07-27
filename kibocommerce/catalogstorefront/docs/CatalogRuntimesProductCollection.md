

# CatalogRuntimesProductCollection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nextCursorMark** | **String** | If a cursorMark is provided on the request, then the nextCursorMark will be populated on the response.  Provide this value as the cursorMark argument on the next request. If a cursorMark is provided on the request and the nextCursorMark value is null, then the end of the resultset was reached |  [optional] |
|**startIndex** | **Integer** |  |  [optional] |
|**pageSize** | **Integer** |  |  [optional] |
|**pageCount** | **Integer** |  |  [optional] |
|**totalCount** | **Integer** |  |  [optional] |
|**items** | [**List&lt;CatalogRuntimesProduct&gt;**](CatalogRuntimesProduct.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


