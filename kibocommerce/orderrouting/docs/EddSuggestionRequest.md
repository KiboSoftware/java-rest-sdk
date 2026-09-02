

# EddSuggestionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bundlingStrategy** | [**BundlingStrategyEnum**](#BundlingStrategyEnum) |  |  [optional] |
|**cartID** | **String** |  |  [optional] |
|**customData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**eddItems** | [**List&lt;EDDOrderItem&gt;**](EDDOrderItem.md) |  |  |
|**eddItemsAndRegenerateOrderItems** | [**List&lt;EDDOrderItem&gt;**](EDDOrderItem.md) |  |  [optional] |
|**environmentID** | **Integer** |  |  [optional] |
|**exclusionListLocationCode** | [**List&lt;ExclusionListEntryLocationCode&gt;**](ExclusionListEntryLocationCode.md) |  |  [optional] |
|**extendedCustomerInfo** | [**ExtendedCustomerInfo**](ExtendedCustomerInfo.md) |  |  [optional] |
|**extendedOrderInfo** | [**ExtendedOrderInfo**](ExtendedOrderInfo.md) |  |  [optional] |
|**externalResponseID** | **String** |  |  [optional] |
|**forceSTHConsolidationOnSplitShipments** | **Boolean** |  |  [optional] |
|**fraud** | **Integer** |  |  [optional] |
|**futureDateLimit** | **OffsetDateTime** |  |  [optional] |
|**futureExclusionListLocationCode** | [**List&lt;ExclusionListEntryLocationCode&gt;**](ExclusionListEntryLocationCode.md) |  |  [optional] |
|**inventoryRequestType** | [**InventoryRequestTypeEnum**](#InventoryRequestTypeEnum) |  |  [optional] |
|**isExpress** | **Boolean** |  |  [optional] |
|**locationCodeWhiteList** | **List&lt;String&gt;** |  |  [optional] |
|**numShipmentsNotInRequest** | **Integer** |  |  [optional] |
|**orderID** | **Integer** |  |  [optional] |
|**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) | The order type for the Estimated Delivery Date (EDD) suggestion. Accepts &#x60;DIRECTSHIP&#x60;, &#x60;TRANSFER&#x60;, &#x60;DELIVERY&#x60;, or &#x60;BOPIS&#x60;. |  |
|**pickupLocationCode** | **String** |  |  [optional] |
|**remorsePeriodInMinutes** | **Integer** |  |  [optional] |
|**shippingAddress** | [**OrderRoutingShippingAddress**](OrderRoutingShippingAddress.md) |  |  [optional] |
|**shippingMethod** | **String** |  |  [optional] |
|**sort** | [**SortEnum**](#SortEnum) |  |  [optional] |
|**sthConsolidationLocationOverride** | **String** |  |  [optional] |
|**strategyID** | **String** |  |  [optional] |
|**tags** | **Map&lt;String, String&gt;** |  |  [optional] |
|**total** | **BigDecimal** |  |  |



## Enum: BundlingStrategyEnum

| Name | Value |
|---- | -----|
| ITEM_DEPENDENCY | &quot;ITEM_DEPENDENCY&quot; |



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
| DELIVERY | &quot;DELIVERY&quot; |
| BOPIS | &quot;BOPIS&quot; |



## Enum: SortEnum

| Name | Value |
|---- | -----|
| SUGGESTION_SORT | &quot;SUGGESTION_SORT&quot; |


## Implemented Interfaces

* Serializable


