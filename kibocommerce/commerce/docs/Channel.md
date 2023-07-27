

# Channel

Channel used to group sites for commerce purposes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantId** | **Integer** | Tenant that owns the channel. |  [optional] |
|**code** | **String** | Code to uniquely identify the channel. |  [optional] |
|**name** | **String** | Friendly name of the channel. |  [optional] |
|**region** | **String** | Region of the channel. |  [optional] |
|**countryCode** | **String** | Country code of the channel. |  [optional] |
|**groupCode** | **String** | Code to uniquely identify the channel group, if any that contains this channel. |  [optional] |
|**siteIds** | **List&lt;Integer&gt;** | A list of site Id&#39;s that this channel contains. |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


