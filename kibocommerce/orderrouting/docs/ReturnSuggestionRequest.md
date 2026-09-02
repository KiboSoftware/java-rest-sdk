

# ReturnSuggestionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bundlingStrategy** | [**BundlingStrategyEnum**](#BundlingStrategyEnum) |  |  [optional] |
|**customData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**environmentID** | **Integer** |  |  [optional] |
|**exclusionListLocationCode** | [**List&lt;ExclusionListEntryLocationCode&gt;**](ExclusionListEntryLocationCode.md) |  |  [optional] |
|**extendedCustomerInfo** | [**ExtendedCustomerInfo**](ExtendedCustomerInfo.md) |  |  [optional] |
|**extendedOrderInfo** | [**ExtendedOrderInfo**](ExtendedOrderInfo.md) |  |  [optional] |
|**externalResponseID** | **String** |  |  [optional] |
|**fraud** | **Integer** |  |  [optional] |
|**isExpress** | **Boolean** |  |  [optional] |
|**items** | [**List&lt;ReverseLogisticsItem&gt;**](ReverseLogisticsItem.md) |  |  |
|**locationCodeWhiteList** | **List&lt;String&gt;** |  |  [optional] |
|**orderID** | **Integer** |  |  [optional] |
|**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) |  |  |
|**returnID** | **Integer** |  |  [optional] |
|**shippingAddress** | [**OrderRoutingShippingAddress**](OrderRoutingShippingAddress.md) |  |  [optional] |
|**strategyID** | **String** |  |  [optional] |
|**tags** | **Map&lt;String, String&gt;** |  |  [optional] |
|**total** | **BigDecimal** |  |  |



## Enum: BundlingStrategyEnum

| Name | Value |
|---- | -----|
| ITEM_DEPENDENCY | &quot;ITEM_DEPENDENCY&quot; |



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


## Implemented Interfaces

* Serializable


