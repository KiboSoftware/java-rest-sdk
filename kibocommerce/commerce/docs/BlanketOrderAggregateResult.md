

# BlanketOrderAggregateResult

Result of aggregating blanket order remaining quantity. Includes the grand total, per-product-code sums, and optional breakdowns by customer account and order status.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**byCustomer** | [**List&lt;BlanketOrderDemandEntry&gt;**](BlanketOrderDemandEntry.md) | Remaining quantity broken down by customer account. Each entry&#39;s &#x60;Key&#x60; is the customer account id as a string, or &#x60;\&quot;anonymous\&quot;&#x60; for orders without an account. |  [optional] |
|**byProductCode** | [**List&lt;BlanketOrderDemandEntry&gt;**](BlanketOrderDemandEntry.md) | Remaining quantity broken down by product code. Each entry&#39;s &#x60;Key&#x60; is a product code. Only product codes with at least one matching item appear here (no zero-quantity back-fill). |  [optional] |
|**byStatus** | [**List&lt;BlanketOrderDemandEntry&gt;**](BlanketOrderDemandEntry.md) | Remaining quantity broken down by blanket order status. Each entry&#39;s &#x60;Key&#x60; is the order-level status string (e.g. &#x60;\&quot;Active\&quot;&#x60;, &#x60;\&quot;Completed\&quot;&#x60;). |  [optional] |
|**totalRemainingQuantity** | **Long** | Sum of &#x60;items[].remainingQuantity&#x60; across all matched blanket orders. |  [optional] |


## Implemented Interfaces

* Serializable


