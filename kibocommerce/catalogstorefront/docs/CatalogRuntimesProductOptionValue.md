

# CatalogRuntimesProductOptionValue

Value of product option...\"red,\" \"white,\" \"blue.\"

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **Object** |  |  [optional] |
|**attributeValueId** | **Integer** | Unique Id for the Value |  [optional] |
|**stringValue** | **String** | Localized Value in the language of the locale code only available for dataType string |  [optional] |
|**isEnabled** | **Boolean** | If true, this option is enabled and can be selected. During configuration, this returns false of this option value is invalid with other current selected options. |  [optional] |
|**isSelected** | **Boolean** | If true, this is the option that is currently selected. It can be either the default value or one that the shopper has selected. |  [optional] |
|**isDefault** | **Boolean** | If true, this is the default value that the merchant supplied. |  [optional] |
|**deltaWeight** | **Double** | How much this option weighs above the weight of the product. |  [optional] |
|**deltaPrice** | **Double** | How much this option costs above the cost of the product. |  [optional] |
|**shopperEnteredValue** | **Object** | How much this option costs above the cost of the product. |  [optional] |
|**bundledProduct** | [**CatalogRuntimesBundledProduct**](CatalogRuntimesBundledProduct.md) |  |  [optional] |
|**displayInfo** | [**CatalogRuntimesAttributeVocabularyValueDisplayInfo**](CatalogRuntimesAttributeVocabularyValueDisplayInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


