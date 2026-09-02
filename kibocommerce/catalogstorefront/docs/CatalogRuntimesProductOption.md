

# CatalogRuntimesProductOption

An option for a product and its list of values, if any. Also includes whether the option is configurable or stand-alone, whether it is required, whether it can have mulitple values and whether the shopper can supply its value (for example, engraved initials).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributeDetail** | [**AttributeDetail**](AttributeDetail.md) |  |  [optional] |
|**attributeFQN** | **String** | Attribute fully qualified name |  [optional] |
|**isMultiValue** | **Boolean** | If true, more than one value can be assigned to an option. Only possible with stand-alone options. |  [optional] |
|**isProductImageGroupSelector** | **Boolean** |  |  [optional] |
|**isRequired** | **Boolean** | If true, the shopper must provide a value for the option before it can be purchased. |  [optional] |
|**values** | [**List&lt;CatalogRuntimesProductOptionValue&gt;**](CatalogRuntimesProductOptionValue.md) | Possible choices for an option, for example, values of the option \&quot;Color\&quot; can be \&quot;red,\&quot; \&quot;white,\&quot; and \&quot;blue.\&quot; |  [optional] |


## Implemented Interfaces

* Serializable


