

# InventoryRequestAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Inventory Request Type Enum |  [optional] |
|**items** | [**List&lt;ItemQuantity&gt;**](ItemQuantity.md) | List of Items to search on |  [optional] |
|**requestLocation** | [**RequestLocation**](RequestLocation.md) |  |  [optional] |
|**limit** | **Integer** | The maximum number of results to return, defaults to 100 for most |  [optional] |
|**locationWhitelist** | **List&lt;String&gt;** | List of location codes that are allowed to be included in results |  [optional] |
|**locationPriorityList** | **List&lt;String&gt;** | List of location codes that should be returned before all others, preventing them from being excluded by limit |  [optional] |
|**locationBlacklist** | **List&lt;String&gt;** | List of location codes that are NOT allowed to be included in results |  [optional] |
|**ignoreSafetyStock** | **Boolean** | Whether to ignore the safety stock buffer put in place |  [optional] |
|**includeNegativeInventory** | **Boolean** | Whether to allow items with negative inventory in the results |  [optional] |
|**directShip** | **Boolean** | Whether to limit results to locations that are shipping enabled |  [optional] |
|**transferEnabled** | **Boolean** | Filter results by locations that have transfer enabled (true) or don&#39;t (false) |  [optional] |
|**pickup** | **Boolean** | Filter results by locations that have finderbot enabled (true) or don&#39;t (false) |  [optional] |
|**includeInAggregateExport** | **Boolean** | Filter results by locations that have aggregate export enabled (true) or don&#39;t (false) |  [optional] |
|**includeInLocationExport** | **Boolean** | Filter results by locations that have physical storefronts (true) or don&#39;t (false) |  [optional] |
|**excludeBlockedAssignment** | **Boolean** | Filter out results that are blocked from assignment (at the product/location level)  |  [optional] |
|**includeAttributes** | **Boolean** | Flag to include attributes or not |  [optional] |
|**includeFutureInventory** | **Boolean** | If set to true, include future inventory in response (records that were set with a deliveryDate). |  [optional] |
|**includeNegativeFutureInventory** | **Boolean** | Whether to allow items with negative future inventory in the results |  [optional] |
|**deliveryDateBefore** | **OffsetDateTime** | DateTime to filter for only future inventory with a delivery date before or equal to the given date |  [optional] |
|**deliveryDateAfter** | **OffsetDateTime** | DateTime to filter for only future inventory with a delivery date after or equal to the given date |  [optional] |
|**sortByEnum** | [**SortByEnumEnum**](#SortByEnumEnum) | What to sort the inventory results by. Only used for GetInventoryByLocation calls (locationCode must be set) |  [optional] |
|**sortDescending** | **Boolean** | Whether to sort by descending order or not. Must be used in conjunction with the sortByEnum value |  [optional] |
|**forceDefaultsForUnspecifiedTagCategories** | **Boolean** | Whether to force populate default tags onto the request if they are unspecified for any tag category |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Associative Map of &lt;String, String&gt; for tagCategoryName &#x3D;&gt; tagName |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| PARTIAL | &quot;PARTIAL&quot; |
| ANY | &quot;ANY&quot; |
| ALL_STORES | &quot;ALL_STORES&quot; |



## Enum: SortByEnumEnum

| Name | Value |
|---- | -----|
| ON_HAND | &quot;ON_HAND&quot; |
| AVAILABLE | &quot;AVAILABLE&quot; |
| ALLOCATED | &quot;ALLOCATED&quot; |
| PART_NUMBER | &quot;PART_NUMBER&quot; |
| PRODUCT_ID | &quot;PRODUCT_ID&quot; |


## Implemented Interfaces

* Serializable


