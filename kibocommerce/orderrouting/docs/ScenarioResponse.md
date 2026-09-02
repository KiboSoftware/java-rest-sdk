

# ScenarioResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** |  |  [optional] |
|**defaultGroup** | **Boolean** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**filterLogicalGroups** | [**List&lt;ScenarioFilterLogicalGroupResponse&gt;**](ScenarioFilterLogicalGroupResponse.md) |  |  [optional] |
|**filters** | [**List&lt;ScenarioFilterResponse&gt;**](ScenarioFilterResponse.md) |  |  [optional] |
|**locations** | **List&lt;String&gt;** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**noMatch** | [**NoMatchEnum**](#NoMatchEnum) |  |  [optional] |
|**partialMatch** | [**PartialMatchEnum**](#PartialMatchEnum) |  |  [optional] |
|**primarySorting** | [**PrimarySortingEnum**](#PrimarySortingEnum) |  |  [optional] |
|**rank** | **Integer** |  |  [optional] |
|**restartAttemptForNoMatch** | [**RestartAttemptForNoMatchEnum**](#RestartAttemptForNoMatchEnum) |  |  [optional] |
|**restartAttemptForPartialAssignment** | [**RestartAttemptForPartialAssignmentEnum**](#RestartAttemptForPartialAssignmentEnum) |  |  [optional] |
|**restartGroupIdForNoMatch** | **Integer** |  |  [optional] |
|**restartGroupIdForPartialAssignment** | **Integer** |  |  [optional] |
|**scenarioID** | **Integer** |  |  [optional] |
|**secondarySorting** | [**SecondarySortingEnum**](#SecondarySortingEnum) |  |  [optional] |
|**strategyID** | **String** |  |  [optional] |
|**unselectedLocations** | **List&lt;String&gt;** |  |  [optional] |



## Enum: NoMatchEnum

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



## Enum: PartialMatchEnum

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



## Enum: PrimarySortingEnum

| Name | Value |
|---- | -----|
| RANK | &quot;RANK&quot; |
| DISTANCE | &quot;DISTANCE&quot; |
| LTD | &quot;LTD&quot; |
| COST | &quot;COST&quot; |
| RANDOM | &quot;RANDOM&quot; |
| DATA_SET | &quot;DATA_SET&quot; |
| LOWEST_AVAILABLE | &quot;LOWEST_AVAILABLE&quot; |
| HIGHEST_AVAILABLE | &quot;HIGHEST_AVAILABLE&quot; |
| EXCESS_COUNT | &quot;EXCESS_COUNT&quot; |
| EXCESS_PERCENTAGE | &quot;EXCESS_PERCENTAGE&quot; |



## Enum: RestartAttemptForNoMatchEnum

| Name | Value |
|---- | -----|
| START_AT_BEGINNING | &quot;START_AT_BEGINNING&quot; |
| CURRENT_GROUP | &quot;CURRENT_GROUP&quot; |
| GROUP_RANK | &quot;GROUP_RANK&quot; |



## Enum: RestartAttemptForPartialAssignmentEnum

| Name | Value |
|---- | -----|
| START_AT_BEGINNING | &quot;START_AT_BEGINNING&quot; |
| CURRENT_GROUP | &quot;CURRENT_GROUP&quot; |
| GROUP_RANK | &quot;GROUP_RANK&quot; |



## Enum: SecondarySortingEnum

| Name | Value |
|---- | -----|
| RANK | &quot;RANK&quot; |
| DISTANCE | &quot;DISTANCE&quot; |
| LTD | &quot;LTD&quot; |
| COST | &quot;COST&quot; |
| RANDOM | &quot;RANDOM&quot; |
| DATA_SET | &quot;DATA_SET&quot; |
| LOWEST_AVAILABLE | &quot;LOWEST_AVAILABLE&quot; |
| HIGHEST_AVAILABLE | &quot;HIGHEST_AVAILABLE&quot; |
| EXCESS_COUNT | &quot;EXCESS_COUNT&quot; |
| EXCESS_PERCENTAGE | &quot;EXCESS_PERCENTAGE&quot; |


## Implemented Interfaces

* Serializable


