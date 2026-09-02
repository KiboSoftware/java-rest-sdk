

# InStockNotificationSubscription

Inventory in-stock notification subscription.  Notification sender/processor view.  Generally for internal consumption only.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**customerId** | **Integer** | Id of the N:Mozu.Customer that this subscription is assigned to. Optional.  E-mail or CustomerId are required. |  [optional] |
|**email** | **String** | Email.  E-mail or CustomerId are required. |  [optional] |
|**id** | **Integer** | Unique identifier |  [optional] |
|**locationCode** | **String** | Location Code |  [optional] |
|**productCode** | **String** | Product Code |  [optional] |
|**userId** | **String** | User Id for multi-user b2b accounts |  [optional] |


## Implemented Interfaces

* Serializable


