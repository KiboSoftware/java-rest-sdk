

# CallOffOrderDemandEntry

A single bucket in a call-off order aggregate breakdown: the summed requested quantity for a group (product code, customer account, status, or month) plus a count of matching orders.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | The grouping key value. Meaning depends on the breakdown dimension: product code string, customer account id string, order status string, or ISO-8601 month string (yyyy-MM) for the monthly breakdown. |  [optional] |
|**orderCount** | **Integer** | Number of distinct call-off orders in this bucket. |  [optional] |
|**totalRequestedQty** | **Long** | Sum of &#x60;items[].requestedQty&#x60; for call-off orders in this bucket. |  [optional] |


## Implemented Interfaces

* Serializable


