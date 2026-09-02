

# ShippingGrouping


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fulfillmentLocationCode** | **String** | The Fulfillment location used by items in this grouping. |  [optional] |
|**fulfillmentMethod** | **String** | The FulfillmentMethod used by items in this grouping. |  [optional] |
|**handlingAmount** | **Double** | Group level order handling fees. |  [optional] |
|**handlingDiscounts** | [**List&lt;CommerceRuntimeAppliedDiscount&gt;**](CommerceRuntimeAppliedDiscount.md) |  |  [optional] |
|**handlingTax** | **Double** | Group level order handling taxes. |  [optional] |
|**handlingTaxTotal** | **Double** | The total handling tax for this group, accounting for both group-level and item-level handling tax. |  [optional] |
|**handlingTotal** | **Double** | The total handling cost for this group, accounting for discounts and tax. |  [optional] |
|**id** | **String** | A unique identifier for this grouping. |  [optional] |
|**orderItemIds** | **List&lt;String&gt;** | Identifiers of the items that make up this grouping. |  [optional] |
|**shippingDiscounts** | [**List&lt;ShippingDiscount&gt;**](ShippingDiscount.md) |  |  [optional] |
|**shippingMethodCode** | **String** | Code that uniquely identifies the shipping method such as \&quot;Ground,\&quot; \&quot;Overnight\&quot;. |  [optional] |
|**shippingMethodName** | **String** | Readable name of the shipping method. |  [optional] |
|**shippingTaxTotal** | **Double** | The total shipping tax for this group, accounting for both group-level and item-level shipping tax. |  [optional] |
|**shippingTotal** | **Double** | The total shipping cost for this group, accounting for discounts and tax. |  [optional] |


## Implemented Interfaces

* Serializable


