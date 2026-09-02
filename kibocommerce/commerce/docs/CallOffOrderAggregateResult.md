

# CallOffOrderAggregateResult

Result of aggregating call-off order requested quantity across all sites for a tenant. Includes the grand total and optional breakdowns by product code, customer account, order status, and requested ship month.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**byCustomer** | [**List&lt;CallOffOrderDemandEntry&gt;**](CallOffOrderDemandEntry.md) | Requested quantity broken down by customer account. Each entry&#39;s &#x60;Key&#x60; is the customer account id as a string, or &#x60;\&quot;anonymous\&quot;&#x60; for orders without an account. |  [optional] |
|**byProductCode** | [**List&lt;CallOffOrderDemandEntry&gt;**](CallOffOrderDemandEntry.md) | Requested quantity broken down by product code. Each entry&#39;s &#x60;Key&#x60; is a product code. Only product codes with at least one matching item appear here. |  [optional] |
|**byRequestedShipMonth** | [**List&lt;CallOffOrderDemandEntry&gt;**](CallOffOrderDemandEntry.md) | Requested quantity broken down by the month of &#x60;items[].requestedShipDate&#x60;. Each entry&#39;s &#x60;Key&#x60; is an ISO-8601 month string (e.g. &#x60;\&quot;2026-03\&quot;&#x60;). Items without a requested ship date are excluded from this breakdown. |  [optional] |
|**byStatus** | [**List&lt;CallOffOrderDemandEntry&gt;**](CallOffOrderDemandEntry.md) | Requested quantity broken down by call-off order status. Each entry&#39;s &#x60;Key&#x60; is the order-level status string (e.g. &#x60;\&quot;Open\&quot;&#x60;, &#x60;\&quot;Completed\&quot;&#x60;). |  [optional] |
|**totalRequestedQty** | **Long** | Sum of &#x60;items[].requestedQty&#x60; across all matched call-off order items. |  [optional] |


## Implemented Interfaces

* Serializable


