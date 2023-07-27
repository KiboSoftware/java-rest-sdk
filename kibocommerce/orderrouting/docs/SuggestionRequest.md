

# SuggestionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bundlingStrategy** | [**BundlingStrategyEnum**](#BundlingStrategyEnum) |  |  [optional] |
|**cartID** | **String** |  |  [optional] |
|**customData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**environmentID** | **Integer** |  |  [optional] |
|**exclusionListLocationCode** | [**List&lt;ExclusionListEntryLocationCode&gt;**](ExclusionListEntryLocationCode.md) |  |  [optional] |
|**extendedCustomerInfo** | [**ExtendedCustomerInfo**](ExtendedCustomerInfo.md) |  |  [optional] |
|**extendedOrderInfo** | [**ExtendedOrderInfo**](ExtendedOrderInfo.md) |  |  [optional] |
|**externalResponseID** | **String** |  |  [optional] |
|**fraud** | **Integer** |  |  [optional] |
|**futureDateLimit** | **OffsetDateTime** |  |  [optional] |
|**futureExclusionListLocationCode** | [**List&lt;ExclusionListEntryLocationCode&gt;**](ExclusionListEntryLocationCode.md) |  |  [optional] |
|**inventoryRequestType** | [**InventoryRequestTypeEnum**](#InventoryRequestTypeEnum) |  |  [optional] |
|**isExpress** | **Boolean** |  |  [optional] |
|**items** | [**List&lt;ApiDocumentationOrderItem&gt;**](ApiDocumentationOrderItem.md) |  |  [optional] |
|**locationCodeWhiteList** | **List&lt;String&gt;** |  |  [optional] |
|**numShipmentsNotInRequest** | **Integer** |  |  [optional] |
|**orderID** | **Integer** |  |  [optional] |
|**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) |  |  [optional] |
|**pickupLocationCode** | **String** |  |  [optional] |
|**shippingAddress** | [**ShippingAddress**](ShippingAddress.md) |  |  [optional] |
|**tags** | **Map&lt;String, String&gt;** |  |  [optional] |
|**total** | **BigDecimal** |  |  [optional] |



## Enum: BundlingStrategyEnum

| Name | Value |
|---- | -----|
| ITEM_DEPENDENCY | &quot;ITEM_DEPENDENCY&quot; |



## Enum: InventoryRequestTypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| PARTIAL | &quot;PARTIAL&quot; |
| ANY | &quot;ANY&quot; |
| ALL_STORES | &quot;ALL_STORES&quot; |



## Enum: OrderTypeEnum

| Name | Value |
|---- | -----|
| DIRECTSHIP | &quot;DIRECTSHIP&quot; |
| TRANSFER | &quot;TRANSFER&quot; |
| STH_CONSOLIDATED | &quot;STH_CONSOLIDATED&quot; |


## Implemented Interfaces

* Serializable


