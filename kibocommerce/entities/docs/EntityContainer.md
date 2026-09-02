

# EntityContainer

The metadata and Entity contents for an entity persisted in an EntityList in MZDB. The Item property contains the json representation of the Entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogId** | **Integer** |  |  [optional] |
|**createBy** | **String** |  |  [optional] |
|**createDate** | **OffsetDateTime** |  |  [optional] |
|**id** | **String** | The unique identifier for the Entity. |  [optional] |
|**item** | **Object** | The entity in json format. |  [optional] |
|**listFullName** | **String** | The nameSpace and name for the EntityList in the format name@nameSpace. |  [optional] |
|**localeCode** | **String** | The localeCode for the Entity. This will only be populated for EntityLists that are created with IsLocaleSpecific set to true. |  [optional] |
|**masterCatalogId** | **Integer** |  |  [optional] |
|**siteId** | **Integer** |  |  [optional] |
|**tenantId** | **Integer** |  |  [optional] |
|**updateBy** | **String** |  |  [optional] |
|**updateDate** | **OffsetDateTime** |  |  [optional] |
|**userId** | **String** | The userId of the shopper account associated with this Entity. This will only be populated for EntityLists that are creaetd with IsShopperSpecific set to true. |  [optional] |


## Implemented Interfaces

* Serializable


