

# PingEvent

Only utilized for testing

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**catalogId** | **Integer** | CatalogId |  [optional] |
|**correlationId** | **String** | The Correlation Id of the original API request that caused this event to occur |  [optional] |
|**entityId** | **String** | The identifier / ID of the entity that changed (i.e. product code) |  [optional] |
|**extendedProperties** | [**List&lt;EventExtendedProperty&gt;**](EventExtendedProperty.md) | Extended properties. Note: This is purposefully not a CollectionBase type wrapper so consumers start to get used to not having counts returned. |  [optional] |
|**id** | **String** | The unique identifier for an event |  [optional] |
|**isTest** | **Boolean** | Is this a test? |  [optional] |
|**masterCatalogId** | **Integer** | MasterCatalogId |  [optional] |
|**siteId** | **Integer** | SiteId |  [optional] |
|**tenantId** | **Integer** | TenantId |  [optional] |
|**topic** | **String** | The topic of the event (i.e. product.created) |  [optional] |
|**endpoint** | **String** | The Endpoint to ping |  [optional] |


## Implemented Interfaces

* Serializable


