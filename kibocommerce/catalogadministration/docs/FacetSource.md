

# FacetSource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of field, or FQN of attribute |  [optional] |
|**type** | **String** | The type of source field used by the facet. Allowable values are: Element, Attribute.   Must be a valid value for DataType defined in FacetFieldTypeConst. |  [optional] |
|**name** | **String** | Read-only system-generated label for the source field. |  [optional] |
|**dataType** | **String** | Read-only system-generated DataType of the Attribute or Element source field. Will be valid value for DataType defined in DataTypeConst. |  [optional] |
|**allowsRangeQuery** | **Boolean** | Read-only system-generated indicator of whether the source field supports RangeQuery type facets. |  [optional] |


## Implemented Interfaces

* Serializable


