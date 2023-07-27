

# GroupAfterAction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionID** | **Integer** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] |
|**creatorUsername** | **String** |  |  [optional] |
|**environmentID** | **Integer** |  |  [optional] |
|**failoverAction** | [**FailoverActionEnum**](#FailoverActionEnum) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**pathString** | **String** |  |  [optional] |
|**persisted** | **Boolean** |  |  [optional] |
|**restartAttempt** | [**RestartAttemptEnum**](#RestartAttemptEnum) |  |  [optional] |
|**siteID** | **Integer** |  |  [optional] |
|**tenantID** | **Integer** |  |  [optional] |
|**updated** | **OffsetDateTime** |  |  [optional] |
|**updaterUsername** | **String** |  |  [optional] |
|**userContext** | [**UserContextInformation**](UserContextInformation.md) |  |  [optional] |



## Enum: FailoverActionEnum

| Name | Value |
|---- | -----|
| LINE_ITEM_SPLIT_ASSIGN_IF_FULFILLED | &quot;LINE_ITEM_SPLIT_ASSIGN_IF_FULFILLED&quot; |
| LINE_ITEM_SPLIT_CANCEL_WITHOUT_INVENTORY | &quot;LINE_ITEM_SPLIT_CANCEL_WITHOUT_INVENTORY&quot; |
| QUANTITY_SPLIT_ASSIGN_IF_FULFILLED | &quot;QUANTITY_SPLIT_ASSIGN_IF_FULFILLED&quot; |
| QUANTITY_SPLIT_CANCEL_WITHOUT_INVENTORY | &quot;QUANTITY_SPLIT_CANCEL_WITHOUT_INVENTORY&quot; |
| CANCEL_ORDER | &quot;CANCEL_ORDER&quot; |
| ASSIGN_TO_CUSTOMER_CARE | &quot;ASSIGN_TO_CUSTOMER_CARE&quot; |
| ASSIGN_TO_GROUP | &quot;ASSIGN_TO_GROUP&quot; |
| LINE_ITEM_SPLIT_ASSIGN_CUSTOMER_CARE_WITHOUT_INVENTORY | &quot;LINE_ITEM_SPLIT_ASSIGN_CUSTOMER_CARE_WITHOUT_INVENTORY&quot; |
| QUANTITY_SPLIT_ASSIGN_CUSTOMER_CARE_WITHOUT_INVENTORY | &quot;QUANTITY_SPLIT_ASSIGN_CUSTOMER_CARE_WITHOUT_INVENTORY&quot; |
| SEND_ORDER_TO_BIDDING | &quot;SEND_ORDER_TO_BIDDING&quot; |
| LINE_ITEM_SPLIT_BACKORDER_WITHOUT_INVENTORY | &quot;LINE_ITEM_SPLIT_BACKORDER_WITHOUT_INVENTORY&quot; |
| QUANTITY_SPLIT_BACKORDER_WITHOUT_INVENTORY | &quot;QUANTITY_SPLIT_BACKORDER_WITHOUT_INVENTORY&quot; |
| ASSIGN_TO_BACKORDER | &quot;ASSIGN_TO_BACKORDER&quot; |



## Enum: RestartAttemptEnum

| Name | Value |
|---- | -----|
| START_AT_BEGINNING | &quot;START_AT_BEGINNING&quot; |
| CURRENT_GROUP | &quot;CURRENT_GROUP&quot; |
| GROUP_RANK | &quot;GROUP_RANK&quot; |


## Implemented Interfaces

* Serializable


