

# CheckoutGrouping


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for this grouping. |  [optional] |
|**destinationId** | **String** | The DestinationId used by items in this grouping, which may be {null}. |  [optional] |
|**fulfillmentMethod** | **String** | The FulfillmentMethod used by items in this grouping. |  [optional] |
|**orderItemIds** | **List&lt;String&gt;** | Identifiers of the items that make up this grouping. |  [optional] |
|**shippingMethodCode** | **String** | Code that uniquely identifies the shipping method such as \&quot;Ground,\&quot; \&quot;Overnight,\&quot; or \&quot;Digital.\&quot;  The site&#39;s shipping settings lists the valid shipping methods specified for this site. |  [optional] |
|**shippingMethodName** | **String** | Readable name of the shipping method. |  [optional] |
|**standaloneGroup** | **Boolean** | Indicates whether a non ship group should combine with a ship group |  [optional] |
|**shippingDiscounts** | [**List&lt;ShippingDiscount&gt;**](ShippingDiscount.md) |  |  [optional] |
|**handlingDiscounts** | [**List&lt;CommerceRuntimeAppliedDiscount&gt;**](CommerceRuntimeAppliedDiscount.md) |  |  [optional] |
|**dutyAmount** | **Double** | Any duty fee applied directly to this group. Items can also have their own duty fee. |  [optional] |
|**dutyTotal** | **Double** | Total raw duty amounts for this group. |  [optional] |
|**shippingAmount** | **Double** | If a shipping method applies directly to this grouping (versus the items), this is the raw shipping amount for the group. |  [optional] |
|**shippingSubTotal** | **Double** | The raw shipping amount minus shipping discounts. |  [optional] |
|**itemLevelShippingDiscountTotal** | **Double** | The total value of item-level shipping discounts applied to this group. |  [optional] |
|**orderLevelShippingDiscountTotal** | **Double** | The total value of order-level (group-level) shipping discounts applied to this group. |  [optional] |
|**shippingTax** | **Double** | Group-level shipping tax. Does not account for item shipping tax. |  [optional] |
|**shippingTaxTotal** | **Double** | The total shipping tax for this group, accounting for both group-level and item-level shipping tax. |  [optional] |
|**shippingTotal** | **Double** | The total shipping cost for this group, accounting for discounts and tax. |  [optional] |
|**handlingAmount** | **Double** | The handling fee amount that&#39;s applicable to this grouping. |  [optional] |
|**handlingSubTotal** | **Double** | The total raw handling amounts minus handling discounts. |  [optional] |
|**itemLevelHandlingDiscountTotal** | **Double** | The total value of item-level handling discounts applied to this group. |  [optional] |
|**orderLevelHandlingDiscountTotal** | **Double** | The total value of order-level (group-level) handling discounts applied to this group. |  [optional] |
|**handlingTax** | **Double** | Group-level handling tax. Does not account for item handling tax. |  [optional] |
|**handlingTaxTotal** | **Double** | The total handling tax for this group, accounting for both group-level and item-level handling tax. |  [optional] |
|**handlingTotal** | **Double** | The total handling cost for this group, accounting for discounts and tax. |  [optional] |
|**taxData** | **Object** |  |  [optional] |


## Implemented Interfaces

* Serializable


