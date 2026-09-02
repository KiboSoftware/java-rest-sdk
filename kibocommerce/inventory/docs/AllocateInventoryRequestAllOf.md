

# AllocateInventoryRequestAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoAssign** | **Boolean** | flag to determine whether the allocation was due to auto assignment |  [optional] |
|**decrementOnHandOnDeallocate** | **Boolean** | flag to determine deallocation on decrements |  [optional] |
|**items** | [**List&lt;AllocateItem&gt;**](AllocateItem.md) | list of AllocateItems |  [optional] |
|**orderDate** | **String** | order date |  [optional] |
|**orderWeight** | **Integer** | order weight |  [optional] |
|**runSynchronous** | **Boolean** | flag to determine whether the allocation should run synchronously, defaults to false |  [optional] |


## Implemented Interfaces

* Serializable


