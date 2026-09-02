

# CandidateSuggestionsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**environmentID** | **Integer** |  |  [optional] |
|**exclusionListLocationCode** | [**List&lt;ExclusionListEntryLocationCode&gt;**](ExclusionListEntryLocationCode.md) |  |  [optional] |
|**extendedCustomerInfo** | [**ExtendedCustomerInfo**](ExtendedCustomerInfo.md) |  |  [optional] |
|**extendedOrderInfo** | [**ExtendedOrderInfo**](ExtendedOrderInfo.md) |  |  [optional] |
|**futureDateLimit** | **OffsetDateTime** |  |  [optional] |
|**futureExclusionListLocationCode** | [**List&lt;ExclusionListEntryLocationCode&gt;**](ExclusionListEntryLocationCode.md) |  |  [optional] |
|**inventoryRequestType** | [**InventoryRequestTypeEnum**](#InventoryRequestTypeEnum) |  |  [optional] |
|**isExpress** | **Boolean** |  |  [optional] |
|**items** | [**List&lt;OrderRoutingOrderItem&gt;**](OrderRoutingOrderItem.md) |  |  |
|**locationCodeWhiteList** | **List&lt;String&gt;** |  |  [optional] |
|**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) |  |  |
|**pickupLocationCode** | **String** |  |  [optional] |
|**shippingAddress** | [**OrderRoutingShippingAddress**](OrderRoutingShippingAddress.md) |  |  [optional] |
|**sort** | [**SortEnum**](#SortEnum) |  |  [optional] |
|**strategyID** | **String** |  |  [optional] |
|**tags** | **Map&lt;String, String&gt;** |  |  [optional] |



## Enum: InventoryRequestTypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| ANY | &quot;ANY&quot; |
| PARTIAL | &quot;PARTIAL&quot; |
| ALL_STORES | &quot;ALL_STORES&quot; |



## Enum: OrderTypeEnum

| Name | Value |
|---- | -----|
| DIRECTSHIP | &quot;DIRECTSHIP&quot; |
| TRANSFER | &quot;TRANSFER&quot; |
| STH_CONSOLIDATED | &quot;STH_CONSOLIDATED&quot; |
| RETURN | &quot;RETURN&quot; |
| DISPOSITION | &quot;DISPOSITION&quot; |
| DELIVERY | &quot;DELIVERY&quot; |
| BOPIS | &quot;BOPIS&quot; |



## Enum: SortEnum

| Name | Value |
|---- | -----|
| SUGGESTION_SORT | &quot;SUGGESTION_SORT&quot; |


## Implemented Interfaces

* Serializable


