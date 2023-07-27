

# SubscribingTenant

A tenant that is associated with a subscription

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subscribingContextLevelType** | **String** | Type of Subscribing Context  !:SubscribingContextLevelTypeConst  Derived from state of the subscription.  If any Subscribing Sites exist (e.g. subscription is not at the Tenant Level, then the value will be Site) |  [optional] |
|**tenantId** | **Integer** | The tenant identifier |  [optional] |
|**isActive** | **Boolean** | Is the subscription active at the tenant level?  If the subscription context is at the Tenant Level this property will be utilized over the SiteLevel |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**subscribingSites** | [**List&lt;SubscribingSite&gt;**](SubscribingSite.md) | Subscribing Sites |  [optional] |


## Implemented Interfaces

* Serializable


