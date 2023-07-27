

# EventSummary

Event Summary is a trimmed version of an event that is utilized when displaying the event delivery (aka webhook, HTTP callback, HTTP POST) process history/details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | Note: Remember in the contract version to convert this Guid to ToString(\&quot;N\&quot;) so the dashes are not present |  [optional] |
|**tenantId** | **Integer** | Tenant Id |  [optional] |
|**masterCatalogId** | **Integer** | Master Catalog Id |  [optional] |
|**catalogId** | **Integer** | Catalog Id |  [optional] |
|**siteId** | **Integer** | Site Id |  [optional] |
|**entityId** | **String** | Entity Id |  [optional] |
|**topic** | **String** | Topic |  [optional] |
|**extendedProperties** | [**List&lt;EventExtendedProperty&gt;**](EventExtendedProperty.md) | Extended properties. Note: This is purposefully not a CollectionBase type wrapper so consumers start to get used to not having counts returned. |  [optional] |
|**correlationId** | **String** | Correlation Id |  [optional] |
|**createDate** | **OffsetDateTime** | Create Date |  [optional] |


## Implemented Interfaces

* Serializable


