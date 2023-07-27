

# OrderTaxContext


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**itemTaxContexts** | [**List&lt;ItemTaxContext&gt;**](ItemTaxContext.md) | Taxes applied to each item in the order. |  [optional] |
|**shippingTax** | **Double** | Rollup shipping tax for this order |  [optional] |
|**handlingFeeTax** | **Double** | The handling fee tax amount for this line item |  [optional] |
|**orderTax** | **Double** | Rollup tax on the order not including shipping |  [optional] |
|**taxData** | **Object** | Storage for any additional/custom tax data. |  [optional] |


## Implemented Interfaces

* Serializable


