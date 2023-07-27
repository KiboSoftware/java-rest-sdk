

# AllocateInventoryRequest

Request needed for allocating inventory

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**items** | [**List&lt;AllocateItem&gt;**](AllocateItem.md) | list of AllocateItems |  |
|**orderDate** | **String** | order date |  [optional] |
|**orderWeight** | **Integer** | order weight |  [optional] |
|**decrementOnHandOnDeallocate** | **Boolean** | flag to determine deallocation on decrements |  [optional] |
|**autoAssign** | **Boolean** | flag to determine whether the allocation was due to auto assignment |  [optional] |
|**locationCode** | **String** | Location Code |  [optional] |
|**userID** | **Integer** | user id |  [optional] |
|**pageSize** | **Integer** | how many results to show per page |  [optional] |
|**pageNum** | **Integer** | which page to show |  [optional] |
|**sortBy** | **String** | index to sort results by |  [optional] |


## Implemented Interfaces

* Serializable


