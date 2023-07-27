

# TaxableLineItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the line item. |  [optional] |
|**productCode** | **String** | Unique code of the product. |  [optional] |
|**variantProductCode** | **String** | For configurable products, the unique identifier of the product variation that has been selected. |  [optional] |
|**productName** | **String** | Name of the product. |  [optional] |
|**productProperties** | [**List&lt;PricingRuntimeProductProperty&gt;**](PricingRuntimeProductProperty.md) | Custom Properties of the product (i.e. inclues TaxCode) |  [optional] |
|**quantity** | **Integer** | The number of products for this line item |  [optional] |
|**lineItemPrice** | **Double** | The line item subtotal of quantity * Product.TaxablePrice |  [optional] |
|**discountTotal** | **Double** | How much the shopper saves with the applied discount or sale price. This is a negative number. |  [optional] |
|**discountedTotal** | **Double** | Subtotal minus any discounts. |  [optional] |
|**shippingAmount** | **Double** | The line item shipping amount. |  [optional] |
|**handlingAmount** | **Double** | Handling Amount for this item |  [optional] |
|**feeTotal** | **Double** | Not implemented. Total cost of fees that apply to this item. |  [optional] |
|**isTaxable** | **Boolean** | Is the Product taxable |  [optional] |
|**reason** | **String** | Clarifications on the reason this item is being taxed/returned? |  [optional] |
|**data** | **Object** |  |  [optional] |
|**productDiscount** | [**PricingRuntimeAppliedLineItemProductDiscount**](PricingRuntimeAppliedLineItemProductDiscount.md) |  |  [optional] |
|**shippingDiscount** | [**PricingRuntimeAppliedLineItemShippingDiscount**](PricingRuntimeAppliedLineItemShippingDiscount.md) |  |  [optional] |
|**productDiscounts** | [**List&lt;PricingRuntimeAppliedLineItemProductDiscount&gt;**](PricingRuntimeAppliedLineItemProductDiscount.md) | A list of discounts applied to the product |  [optional] |
|**shippingDiscounts** | [**List&lt;PricingRuntimeAppliedLineItemShippingDiscount&gt;**](PricingRuntimeAppliedLineItemShippingDiscount.md) | A discount applied to the shipping |  [optional] |
|**originAddress** | [**CommerceRuntimeAddress**](CommerceRuntimeAddress.md) |  |  [optional] |
|**destinationAddress** | [**CommerceRuntimeAddress**](CommerceRuntimeAddress.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


