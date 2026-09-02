

# EventSummary

Event Summary is a trimmed version of an event that is utilized when displaying the event delivery (aka webhook, HTTP callback, HTTP POST) process history/details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogId** | **Integer** | Catalog Id |  [optional] |
|**correlationId** | **String** | Correlation Id |  [optional] |
|**createDate** | **OffsetDateTime** | Create Date |  [optional] |
|**entityId** | **String** | Entity Id |  [optional] |
|**eventId** | **String** | Note: Remember in the contract version to convert this Guid to ToString(\&quot;N\&quot;) so the dashes are not present |  [optional] |
|**extendedProperties** | [**List&lt;EventExtendedProperty&gt;**](EventExtendedProperty.md) | Extended properties. Note: This is purposefully not a CollectionBase type wrapper so consumers start to get used to not having counts returned. |  [optional] |
|**masterCatalogId** | **Integer** | Master Catalog Id |  [optional] |
|**siteId** | **Integer** | Site Id |  [optional] |
|**tenantId** | **Integer** | Tenant Id |  [optional] |
|**topic** | **String** | Topic |  [optional] |


## Implemented Interfaces

* Serializable


