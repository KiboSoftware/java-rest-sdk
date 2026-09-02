

# OrderRoutingSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowInternationalAssignment** | **Boolean** |  |  |
|**autoAssignLimit** | **Integer** |  |  [optional] |
|**defaultStateChange** | [**DefaultStateChangeEnum**](#DefaultStateChangeEnum) |  |  |
|**failoverActions** | [**Set&lt;FailoverActionsEnum&gt;**](#Set&lt;FailoverActionsEnum&gt;) |  |  [optional] |
|**filterAttributes** | [**Set&lt;FilterAttribute&gt;**](FilterAttribute.md) |  |  [optional] |
|**maxFulfillingLocations** | **Integer** |  |  [optional] |
|**maxSplitItemLocations** | **Integer** |  |  [optional] |
|**productIdentifierMapping** | [**ProductIdentifierMappingEnum**](#ProductIdentifierMappingEnum) |  |  [optional] |
|**siteID** | **Integer** |  |  [optional] |
|**tenantID** | **Integer** |  |  [optional] |
|**tooManyAssignsAction** | [**TooManyAssignsActionEnum**](#TooManyAssignsActionEnum) |  |  |



## Enum: DefaultStateChangeEnum

| Name | Value |
|---- | -----|
| CANCEL | &quot;CANCEL&quot; |
| CUSTOMER_CARE | &quot;CUSTOMER_CARE&quot; |
| AVAILABLE | &quot;AVAILABLE&quot; |
| BACKORDER | &quot;BACKORDER&quot; |



## Enum: Set&lt;FailoverActionsEnum&gt;

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



## Enum: ProductIdentifierMappingEnum

| Name | Value |
|---- | -----|
| PART_NUMBER_ONLY | &quot;PART_NUMBER_ONLY&quot; |
| UPC_ONLY | &quot;UPC_ONLY&quot; |
| SKU_ONLY | &quot;SKU_ONLY&quot; |
| PART_NUMBER_AND_UPC | &quot;PART_NUMBER_AND_UPC&quot; |
| PART_NUMBER_AND_SKU | &quot;PART_NUMBER_AND_SKU&quot; |
| UPC_AND_SKU | &quot;UPC_AND_SKU&quot; |
| PART_NUMBER_AND_UPC_AND_SKU | &quot;PART_NUMBER_AND_UPC_AND_SKU&quot; |



## Enum: TooManyAssignsActionEnum

| Name | Value |
|---- | -----|
| CANCEL | &quot;CANCEL&quot; |
| CUSTOMER_CARE | &quot;CUSTOMER_CARE&quot; |
| AVAILABLE | &quot;AVAILABLE&quot; |
| BACKORDER | &quot;BACKORDER&quot; |


## Implemented Interfaces

* Serializable


