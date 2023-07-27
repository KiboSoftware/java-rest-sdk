

# TaxableOrder

Properties of a taxable order

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderDate** | **OffsetDateTime** | Date on which the order is/was submitted.  Cannot be a future date. |  [optional] |
|**taxContext** | [**TaxContext**](TaxContext.md) |  |  [optional] |
|**lineItems** | [**List&lt;TaxableLineItem&gt;**](TaxableLineItem.md) | List of taxable items. |  [optional] |
|**shippingAmount** | **Double** | Shipping Amount rolled up for the order |  [optional] |
|**currencyCode** | **String** | The currency code for this order |  [optional] |
|**handlingFee** | **Double** | Handling Fee |  [optional] |
|**originalDocumentCode** | **String** | The order id of the original order.  This can be used to track changes to the order for taxing purposes. |  [optional] |
|**orderId** | **String** |  |  [optional] |
|**orderNumber** | **Integer** |  |  [optional] |
|**originalOrderDate** | **OffsetDateTime** | The date of the original order.  This is used when calculating changes to the Taxable Order, evaluating them at this time rather than the present. |  [optional] |
|**data** | **Object** |  |  [optional] |
|**attributes** | [**List&lt;TaxAttribute&gt;**](TaxAttribute.md) |  |  [optional] |
|**shippingDiscounts** | [**List&lt;AppliedOrderShippingDiscount&gt;**](AppliedOrderShippingDiscount.md) | The list of historically-applied shipping discounts.  The active one will have IsExcluded &#x3D;&#x3D; false |  [optional] |
|**shippingDiscount** | [**AppliedOrderShippingDiscount**](AppliedOrderShippingDiscount.md) |  |  [optional] |
|**orderDiscounts** | [**List&lt;PricingRuntimeAppliedDiscount&gt;**](PricingRuntimeAppliedDiscount.md) | The discount that has been applied to the cart itself. If multiple discounts exist, this is the discount that the system applies because it offers the best savings for the shopper. This is a negative number. |  [optional] |
|**orderDiscount** | [**PricingRuntimeAppliedDiscount**](PricingRuntimeAppliedDiscount.md) |  |  [optional] |
|**handlingDiscounts** | [**List&lt;PricingRuntimeAppliedDiscount&gt;**](PricingRuntimeAppliedDiscount.md) | The list of historically-applied handling discounts.  The active one will have IsExcluded &#x3D;&#x3D; false |  [optional] |
|**handlingDiscount** | [**PricingRuntimeAppliedDiscount**](PricingRuntimeAppliedDiscount.md) |  |  [optional] |
|**shippingMethodCode** | **String** | Code that uniquely identifies the shipping method such as \&quot;Ground,\&quot; \&quot;Overnight,\&quot; or \&quot;Digital.\&quot;  The site&#39;s shipping settings lists the valid shipping methods specified for this site. |  [optional] |
|**shippingMethodName** | **String** | Readable name of the shipping method |  [optional] |
|**taxRequestType** | **String** | Used to differentiate between an Order and a Return being used as the source of this Taxable Order |  [optional] |


## Implemented Interfaces

* Serializable


