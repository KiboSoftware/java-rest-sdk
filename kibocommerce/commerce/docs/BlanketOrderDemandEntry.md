

# BlanketOrderDemandEntry

A single bucket in a blanket-order aggregate breakdown: the summed remaining quantity for a group (product code, customer account, or status) plus a count of matching orders.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | The grouping key value. Meaning depends on the breakdown dimension: product code string, customer account id string, or order status string. |  [optional] |
|**orderCount** | **Integer** | Number of distinct blanket orders in this bucket. |  [optional] |
|**totalRemainingQuantity** | **Long** | Sum of &#x60;items[].remainingQuantity&#x60; for blanket orders in this bucket. |  [optional] |


## Implemented Interfaces

* Serializable


