

# AttributeInProductType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributeDetail** | [**CatalogAdminsAttribute**](CatalogAdminsAttribute.md) |  |  [optional] |
|**attributeFQN** | **String** | Unique identifier of the Attribute. Must be an attribute fully qualilfied name that already exists. If no namespace is specified Tenant is assumed |  [optional] |
|**displayInfo** | [**AttributeInProductTypeDisplayInfo**](AttributeInProductTypeDisplayInfo.md) |  |  [optional] |
|**isAdminOnlyProperty** | **Boolean** | If true, this property is not available on the storefront. If false, this property will be available on storefront. The IsHiddenProperty hides the property from the customer, but is still available from the API. |  [optional] |
|**isHiddenProperty** | **Boolean** | If True, the property is hidden in the storefront. This field only applies to properties. |  [optional] |
|**isInheritedFromBaseType** | **Boolean** | If True, the attribute is part of the base product type and can only have order modified. |  [optional] |
|**isMultiValueProperty** | **Boolean** | If True, the property can have multiple values selected on the product. Only applies to PredefinedVocabulary properties. |  [optional] |
|**isProductDetailsOnlyProperty** | **Boolean** | If True this property will not be returned  storefront product listings (Search,GetProduct) it will still be returned on GetProduct, ValidateProduct...) |  [optional] |
|**isRequiredByAdmin** | **Boolean** | If True, the admin must include this attribute in products of this productType |  [optional] |
|**order** | **Integer** | Used to order the display of the attributes within a section |  [optional] |
|**vocabularyValues** | [**List&lt;AttributeVocabularyValueInProductType&gt;**](AttributeVocabularyValueInProductType.md) | The collection of vocabulary values included in this product type. |  [optional] |


## Implemented Interfaces

* Serializable


