

# AttributeInProductType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributeFQN** | **String** | Unique identifier of the Attribute. Must be an attribute fully qualilfied name that already exists. If no namespace is specified Tenant is assumed |  [optional] |
|**isInheritedFromBaseType** | **Boolean** | If True, the attribute is part of the base product type and can only have order modified. |  [optional] |
|**order** | **Integer** | Used to order the display of the attributes within a section |  [optional] |
|**isRequiredByAdmin** | **Boolean** | If True, the admin must include this attribute in products of this productType |  [optional] |
|**isHiddenProperty** | **Boolean** | If True, the property is hidden in the storefront. This field only applies to properties. |  [optional] |
|**isAdminOnlyProperty** | **Boolean** | If true, this property is not available on the storefront. If false, this property will be available on storefront. The IsHiddenProperty hides the property from the customer, but is still available from the API. |  [optional] |
|**isProductDetailsOnlyProperty** | **Boolean** | If True this property will not be returned  storefront product listings (Search,GetProduct) it will still be returned on GetProduct, ValidateProduct...) |  [optional] |
|**isMultiValueProperty** | **Boolean** | If True, the property can have multiple values selected on the product. Only applies to PredefinedVocabulary properties. |  [optional] |
|**displayInfo** | [**AttributeInProductTypeDisplayInfo**](AttributeInProductTypeDisplayInfo.md) |  |  [optional] |
|**vocabularyValues** | [**List&lt;AttributeVocabularyValueInProductType&gt;**](AttributeVocabularyValueInProductType.md) | The collection of vocabulary values included in this product type. |  [optional] |
|**attributeDetail** | [**CatalogAdminsAttribute**](CatalogAdminsAttribute.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


