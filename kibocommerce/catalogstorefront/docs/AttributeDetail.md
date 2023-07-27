

# AttributeDetail

Product Attribute properties common between a Product Propery, Option, and Extra

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**valueType** | **String** | The ValueType of the attribute. Valid values for ValueType are defined in ValueTypeTypeConst. |  [optional] |
|**inputType** | **String** | The InputType type of the attribute. Valid values for InputType are defined in InputTypeConst. |  [optional] |
|**dataType** | **String** | The DataType of the attribute. Valid values for DataType are defined in DataTypeTypeConst. |  [optional] |
|**usageType** | **String** | The UsageType of the attribute. Valid values for the usageType are defined in UsageTypeConst . |  [optional] |
|**dataTypeSequence** | **Integer** | A unique sequence of the attribute By dataType (used for common naming of fields in search index) |  [optional] |
|**name** | **String** | Name of the attribute in the language specified by LocaleCode. |  [optional] |
|**description** | **String** | Description of the attribute in the language specified by LocaleCode. |  [optional] |
|**validation** | [**CatalogAdminsAttributeValidation**](CatalogAdminsAttributeValidation.md) |  |  [optional] |
|**searchableInStorefront** | **Boolean** | Indicates whether the attribute value is searchable. |  [optional] |
|**searchDisplayValue** | **Boolean** | If true, the system will index the display value of string attributes instead of the canonical value for searching.   The canonical value will always be used for filtering. Does not apply for for non-string attributes. |  [optional] |
|**allowFilteringAndSortingInStorefront** | **Boolean** | Indicates whether the attribute should be able to be used in filters, facets, and sorting on the public storefront. |  [optional] |
|**indexValueWithCase** | **Boolean** | Indicates whether the attribtue value is indexed with case or not |  [optional] |
|**customWeightInStorefrontSearch** | **Boolean** | Indicates whether the attribtue value is indexed so that it can have a custom relevency weight compared to other attributes in a tokenized text search |  [optional] |
|**displayIntention** | **String** | Am optional hint to the theme about how this attribute should be displayed (what control to use) |  [optional] |
|**availableForOrderRouting** | **Boolean** | Indicates whether the attribute is available for order routing |  [optional] |


## Implemented Interfaces

* Serializable


