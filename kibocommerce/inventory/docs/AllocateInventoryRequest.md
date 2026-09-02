

# AllocateInventoryRequest

Request needed for allocating inventory

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**runSynchronous** | **Object** | flag to determine whether the runSyncronous flag is set and the allocation should be run synchronously |  [optional] |
|**autoAssign** | **Boolean** | flag to determine whether the allocation was due to auto assignment |  [optional] |
|**decrementOnHandOnDeallocate** | **Boolean** | flag to determine deallocation on decrements |  [optional] |
|**items** | [**List&lt;AllocateItem&gt;**](AllocateItem.md) | list of AllocateItems |  |
|**orderDate** | **String** | order date |  [optional] |
|**orderWeight** | **Integer** | order weight |  [optional] |
|**locationCode** | **String** | Location Code |  [optional] |
|**pageNum** | **Integer** | which page to show |  [optional] |
|**pageSize** | **Integer** | how many results to show per page |  [optional] |
|**sortBy** | **String** | index to sort results by |  [optional] |
|**userID** | **Integer** | user id |  [optional] |


## Implemented Interfaces

* Serializable


