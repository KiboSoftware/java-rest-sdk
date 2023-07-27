

# EventEvent

The external/public Event entity used specifically in PULL/POLL event scenarios

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for an event |  [optional] |
|**tenantId** | **Integer** | TenantId |  [optional] |
|**masterCatalogId** | **Integer** | MasterCatalogId |  [optional] |
|**catalogId** | **Integer** | CatalogId |  [optional] |
|**siteId** | **Integer** | SiteId |  [optional] |
|**topic** | **String** | The topic of the event (i.e. product.created) |  [optional] |
|**entityId** | **String** | The identifier / ID of the entity that changed (i.e. product code) |  [optional] |
|**isTest** | **Boolean** | Is this a test? |  [optional] |
|**correlationId** | **String** | The Correlation Id of the original API request that caused this event to occur |  [optional] |
|**extendedProperties** | [**List&lt;EventExtendedProperty&gt;**](EventExtendedProperty.md) | Extended properties. Note: This is purposefully not a CollectionBase type wrapper so consumers start to get used to not having counts returned. |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


