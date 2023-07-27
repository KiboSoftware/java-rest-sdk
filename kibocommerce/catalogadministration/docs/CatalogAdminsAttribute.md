

# CatalogAdminsAttribute

Attribute

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adminName** | **String** | Name of the product displayed in the admin, This field does not need to be unqiue, but is required. It can include spaces...and is limited to a length of 50. |  [optional] |
|**namespace** | **String** | NameSpace, each application creating attributes will have a uniqe namespace to avoid name (Code) collisions. The namespace provided must be a valid registered  namespace. If no namespace is specified it is assumed to be the namespace of the Tenant. |  [optional] |
|**attributeCode** | **String** | Unique identifier of the Attribute. Must be unique within a namespace and cannot be changed once the attribute is created. This value will be generated and match the attribute  sequence if not provided on create. |  [optional] |
|**attributeFQN** | **String** | Attribute fully qualified name, Read only value that combines namespace and attribute code as NameSpace~AttributeCode |  [optional] |
|**isValueMappingAttribute** | **Boolean** | Specifies if this attribute can can be used to generalize values of another attribute |  [optional] |
|**valueMappingAttributeFQN** | **String** | Attribute fully qualified name of a corresponding value mapping atribuite |  [optional] |
|**attributeSequence** | **Integer** | Read only System generated monotonically increasing unique sequence for each attribute created. |  [optional] |
|**attributeDataTypeSequence** | **Integer** | Read only System generated monotonically increasing unique sequence for each attribute,DataType created (this is used to optimize indexed field names in search). |  [optional] |
|**masterCatalogId** | **Integer** | Indentifier of the master that this attribute is a member of. System-supplied and read-only. Attributes will be created in the MasterCatalog of the supplied context. |  [optional] |
|**inputType** | **String** | The InputType type of the attribute. Must be a valid value for InputType defined in InputTypeConst and the combination of types set must match an entry in the AttributeTypeRules resource.   This value cannot be changed after create |  [optional] |
|**valueType** | **String** | The ValueType of the attribute.  Must be a valid value for ValueType defined in ValueTypeTypeConst and the combination of types set must match an entry in the AttributeTypeRules resource.   This value cannot be changed after create |  [optional] |
|**dataType** | **String** | The DataType of the attribute.  Must be a valid value for DataType defined in DataTypeTypeConst and the combination of types set must match an entry in the AttributeTypeRules resource.   This value cannot be changed after create |  [optional] |
|**isOption** | **Boolean** | Specifies if this attribute can have a usage type of Option in a ProductType. This value can only be true when when it matches an AttributeTypeRule in the AttributeTypeRules resource. |  [optional] |
|**isExtra** | **Boolean** | Specifies if this attribute can have a usage type of Extra in a ProductType. This value can only be true when when it matches an AttributeTypeRule in the AttributeTypeRules resource. |  [optional] |
|**isProperty** | **Boolean** | Specifies if this attribute can have a usage type of Property in a ProductType. This value can only be true when when it matches an AttributeTypeRule in the AttributeTypeRules resource. |  [optional] |
|**availableForOrderRouting** | **Boolean** | Specifies if this attribute is available for order routing |  [optional] |
|**attributeMetadata** | [**List&lt;CatalogAdminsAttributeMetadataItem&gt;**](CatalogAdminsAttributeMetadataItem.md) | Attribute Metadata. This list can contain opaque data (key value pairs) that can be used as a property bag for UI concerns. |  [optional] |
|**content** | [**CatalogAdminsAttributeLocalizedContent**](CatalogAdminsAttributeLocalizedContent.md) |  |  [optional] |
|**localizedContent** | [**List&lt;CatalogAdminsAttributeLocalizedContent&gt;**](CatalogAdminsAttributeLocalizedContent.md) | The Content of an attribute. This content is always in the default language of the MasterCatalog. |  [optional] |
|**validation** | [**CatalogAdminsAttributeValidation**](CatalogAdminsAttributeValidation.md) |  |  [optional] |
|**vocabularyValues** | [**List&lt;CatalogAdminsAttributeVocabularyValue&gt;**](CatalogAdminsAttributeVocabularyValue.md) | The list of Values for this attribute. Only available for ValueType:PredefinedVocabulary |  [optional] |
|**searchSettings** | [**AttributeSearchSettings**](AttributeSearchSettings.md) |  |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


