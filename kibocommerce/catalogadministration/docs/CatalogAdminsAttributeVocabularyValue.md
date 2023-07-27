

# CatalogAdminsAttributeVocabularyValue

Value of an attribute

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**valueSequence** | **Integer** | Read only System generated monotonically increasing unique sequence. |  [optional] |
|**value** | **Object** | The actual value of the attribute vocabulary. This value must be unique within the vocabulary for a single attribute and match the datatype of the attribute.   String data type requires a canonical value here or one will be system generated if null. The actual string content displayed to users should be stored as Content.   String values require content to be present.  Once this value is set it cannot be changed. |  [optional] |
|**mappedGenericValues** | **List&lt;Object&gt;** | The actual values of the related generic attribute. This value must match the datatype of the attribute and already exist   within the Vocabulary values of the related ValueMappingAttribute. Only supporting string at this time. |  [optional] |
|**productName** | **String** | The ProductName when the Attribute DataType is ProductCode. |  [optional] |
|**content** | [**AttributeVocabularyValueLocalizedContent**](AttributeVocabularyValueLocalizedContent.md) |  |  [optional] |
|**localizedContent** | [**List&lt;AttributeVocabularyValueLocalizedContent&gt;**](AttributeVocabularyValueLocalizedContent.md) | The Content of an attribute value. This content is in multiple locals supported by the master catalog and is only valid for String DataType. |  [optional] |
|**displayOrder** | **Integer** | The order in which the attribute value displays. If you omit a value for this property, Mozu infers the display order from the attribute value&#39;s position the list. |  [optional] |


## Implemented Interfaces

* Serializable


