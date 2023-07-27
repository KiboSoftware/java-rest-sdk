

# ProductVariation

The ProductVariation resource helps merchants manage their products with configurable options. Using this resource, the system creates a matrix of all possible combinations of the product options and the merchant confirms which variations match products for sale. For example, a T-shirt with three color and three size options has nine possible product variations. The system keeps track of inventory for each variation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isActive** | **Boolean** | If true, the merchant accepts the variation generated from the configurable options as a product offering. If IsActive is false then the product variation is not for sale--either because it was never a product offering or it was permanently dropped. IsActive is not intended for temporary unavailability. Default is false. |  [optional] |
|**isOrphan** | **Boolean** | If true, the variation is no longer possible. The system sets IsOrphan to true when the merchant has changed something to make this variation impossible. For example, if the merchant stopped selling all \&quot;small\&quot; shirts, all product variations with the \&quot;small\&quot; option are set to IsOrphan. System-supplied and read-only. |  [optional] |
|**variationExists** | **Boolean** | If true, the product variation exists. When the merchant sets IsActive to true, the system sets VariationExists to true and creates a Variation Key as a unique identifier for this variation. System-supplied and read-only. |  [optional] |
|**variationkey** | **String** | Unique identifier for a single variation (\&quot;small\&quot; + \&quot;red\&quot; + \&quot;short-sleeved\&quot;). System-supplied and read-only. |  [optional] |
|**variationProductCode** | **String** | Descriptive code to refer to a single variation. Typically this is a sequence appended to the base ProduceCode. A merchant can create this code to easily recognize a product variation. By default, the system creates this code by appending a number to the base product. After the merchant supplies this code, it becomes read-only. |  [optional] |
|**deltaPrice** | [**ProductVariationDeltaPrice**](ProductVariationDeltaPrice.md) |  |  [optional] |
|**localizedDeltaPrice** | [**List&lt;ProductVariationDeltaPrice&gt;**](ProductVariationDeltaPrice.md) | How much more the variation costs above the cost of the base product. If the price of the base product changes, this price is adjusted accordingly.  This collection allows for multiple currencies. |  [optional] |
|**fixedPrice** | [**ProductVariationFixedPrice**](ProductVariationFixedPrice.md) |  |  [optional] |
|**localizedFixedPrice** | [**List&lt;ProductVariationFixedPrice&gt;**](ProductVariationFixedPrice.md) | Price of the variation using fixed per currency  This collection allows for multiple currencies. |  [optional] |
|**deltaWeight** | **Double** | Weight of the product with this variation. |  [optional] |
|**fixedWeight** | **Double** | Fixed weight of the product with this variation. |  [optional] |
|**options** | [**List&lt;ProductVariationOption&gt;**](ProductVariationOption.md) | List of values for this product variation: such as \&quot;small, \&quot;red.. these are read only here as the variationKey defines the values \&quot; |  [optional] |
|**properties** | [**List&lt;ProductVariationProperty&gt;**](ProductVariationProperty.md) | List of properties specific to this variation |  [optional] |
|**upc** | **String** | Price Lookup Unit code for the product |  [optional] |
|**fulfillmentTypesSupported** | **List&lt;String&gt;** | Indicates the fulfillment types the product supports. |  [optional] |
|**supplierInfo** | [**ProductSupplierInfo**](ProductSupplierInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


