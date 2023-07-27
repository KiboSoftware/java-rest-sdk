

# InStockNotificationSubscription

Inventory in-stock notification subscription.  Notification sender/processor view.  Generally for internal consumption only.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier |  [optional] |
|**email** | **String** | Email.  E-mail or CustomerId are required. |  [optional] |
|**customerId** | **Integer** | Id of the N:Mozu.Customer  that this subscription is assigned to.  Optional.  E-mail or CustomerId are required. |  [optional] |
|**productCode** | **String** | Product Code |  [optional] |
|**locationCode** | **String** | Location Code |  [optional] |
|**userId** | **String** | User Id for multi-user b2b accounts |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


