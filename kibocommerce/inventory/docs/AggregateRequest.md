

# AggregateRequest

Request for aggregating inventory

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**includeFutureInventory** | [**IncludeFutureInventoryEnum**](#IncludeFutureInventoryEnum) | Enum for including future inventory: [futureOnly, futureAndCurrent] |  [optional] |
|**transferEnabled** | **Object** | Filter results by locations that have transfer enabled (true) or don&#39;t (false) |  [optional] |
|**directShip** | **Boolean** | Whether to limit results to locations that are shipping enabled |  [optional] |
|**forceDefaultsForUnspecifiedTagCategories** | **Boolean** | Whether to force populate default tags onto the request if they are unspecified for any tag category |  [optional] |
|**futureEndDate** | **OffsetDateTime** | Future end Date at which the inventory should be allocated against. |  [optional] |
|**futureStartDate** | **OffsetDateTime** | Future start Date at which the inventory should be allocated against. |  [optional] |
|**ignoreSafetyStock** | **Boolean** | Whether to ignore the safety stock buffer put in place |  [optional] |
|**includeNegativeFutureInventory** | **Boolean** | Whether to allow items with negative future inventory in the results |  [optional] |
|**includeNegativeInventory** | **Boolean** | Whether to allow items with negative inventory in the results |  [optional] |
|**items** | [**List&lt;InventoryItem&gt;**](InventoryItem.md) | List of Items to search on |  |
|**pickup** | **Boolean** | Filter results by pickup enabled (true) or not (false) |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Associative Map of &lt;String, String&gt; for tagCategoryName &#x3D;&gt; tagName |  [optional] |
|**locationCode** | **String** | Location Code |  [optional] |
|**pageNum** | **Integer** | which page to show |  [optional] |
|**pageSize** | **Integer** | how many results to show per page |  [optional] |
|**sortBy** | **String** | index to sort results by |  [optional] |
|**userID** | **Integer** | user id |  [optional] |



## Enum: IncludeFutureInventoryEnum

| Name | Value |
|---- | -----|
| FUTUREONLY | &quot;futureOnly&quot; |
| FUTUREANDCURRENT | &quot;futureAndCurrent&quot; |


## Implemented Interfaces

* Serializable


