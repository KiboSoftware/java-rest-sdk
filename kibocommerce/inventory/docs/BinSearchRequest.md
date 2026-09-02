

# BinSearchRequest

Request needed for searching for bins

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**binName** | **String** | Partial match of bin name |  [optional] |
|**product** | [**InventoryProduct**](InventoryProduct.md) |  |  [optional] |
|**showNegativeInventory** | **Boolean** | Flag for showing negative inventory |  [optional] |
|**sortAscending** | **Boolean** | Flag for sorting ascending |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Associative Map of &lt;String, String&gt; for tagCategoryName &#x3D;&gt; tagName |  [optional] |
|**locationCode** | **String** | Location Code |  [optional] |
|**pageNum** | **Integer** | which page to show |  [optional] |
|**pageSize** | **Integer** | how many results to show per page |  [optional] |
|**sortBy** | **String** | index to sort results by |  [optional] |
|**userID** | **Integer** | user id |  [optional] |


## Implemented Interfaces

* Serializable


