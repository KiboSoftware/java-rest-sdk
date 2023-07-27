

# CatalogAdminsTag

A generic tag that can be used for any purpose.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tagCode** | **String** | A unique code per catalog. Limit 500 characters. |  |
|**tagName** | **String** | Readonly and computed from TagCode. If using hierarchical tag-codes, only the last node |  [optional] [readonly] |
|**tagPath** | **String** | Readonly and computed from TagCode. If using hierarchical tag-codes, the node path without the TagName |  [optional] [readonly] |


## Implemented Interfaces

* Serializable


