

# ViewField

The projection of an individual field in a view.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the field projected into the view document, meaning the name given to the target field after it is projected.  The name must be unique within the list of viewFields provided in the view. |  [optional] |
|**target** | **String** | Specifies the document field to project. First-class fields will be returned on the document, but can be projected into the view properties.   Valid first-class fields include name, id, documentTypeFqn, listFqn and publishState. Dynamic fields within the properties field can be projected by prefixing the target string with \&quot;properties.\&quot;  Example: \&quot;properties.property1\&quot;. If a property is an object, then dot notation can be used to walk to particular subelements. Example: \&quot;properties.property1.subProperty1\&quot;  Individual array elements can be selected as well. Example: \&quot;properties.property1.subProperty1.subSubArray[2].propertyOnArrayItem\&quot;  Any target miss will result in a null value returning for the projected field. |  [optional] |


## Implemented Interfaces

* Serializable


