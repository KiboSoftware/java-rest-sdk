

# ShipmentRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**code** | **String** | Unique identifier of the ShipmentRule. System-supplied and read-only. |  [optional] |
|**description** | **String** | ShipmentRule description |  [optional] |
|**expression** | [**CatalogAdminsDynamicExpression**](CatalogAdminsDynamicExpression.md) |  |  [optional] |
|**metaData** | **Object** | Additional metadata. |  [optional] |
|**name** | **String** | ShipmentRule name |  [optional] |
|**ruleType** | **String** | Discriminator identifying the rule type that owns this shipment rule. Required on create and update. |  |


## Implemented Interfaces

* Serializable


