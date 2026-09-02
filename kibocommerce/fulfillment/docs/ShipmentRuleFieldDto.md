

# ShipmentRuleFieldDto

Metadata for a shipment rule field including operators, data type, and UI grouping information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowNullOnRight** | **Boolean** | Whether null values are allowed on the right side of the operator |  |
|**apiFieldName** | **String** | API field name for RSQL filter construction |  [optional] |
|**apiOperators** | [**List&lt;RuleOperatorDto&gt;**](RuleOperatorDto.md) | Comprehensive operator metadata with display text and RSQL syntax |  [optional] |
|**applicableTo** | **String** | Attribute scope (Shipment, ShipmentItem, ShipmentAndShipmentItem) for custom attributes only |  [optional] |
|**dataType** | **String** | Data type of the field (string, enum, date, boolean, number) |  |
|**displayValue** | **String** | Human-readable display name for UI |  |
|**fieldName** | **String** | Field name identifier used internally |  |
|**ruleFieldType** | **String** | Field type for UI grouping (ShipmentField, ShipmentAttribute, ItemAttribute) |  [optional] |
|**ruleFieldTypeDisplayValue** | **String** | Display value for the field type group header |  [optional] |
|**sortDescriptor** | [**SortDescriptorDto**](SortDescriptorDto.md) |  |  [optional] |
|**sortable** | **Boolean** | Whether this field supports sorting in result sets |  [optional] |
|**supportedOperators** | **List&lt;String&gt;** | List of supported operator codes (legacy, use apiOperators instead) |  |
|**validEnumValues** | [**List&lt;ShipmentRuleEnumValueDto&gt;**](ShipmentRuleEnumValueDto.md) | List of valid enumerated values for enum/list data types |  [optional] |


## Implemented Interfaces

* Serializable


