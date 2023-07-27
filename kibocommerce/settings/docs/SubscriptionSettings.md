

# SubscriptionSettings

Subscription settings defined or this site

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**continuityOrderDateOffset** | **Integer** | Specifies the number of days before the next order date to create the continuity order. |  [optional] |
|**pauseSubscriptionOffset** | **Integer** | Specifies the number of continuity orders should be placed before activating the subscription. |  [optional] |
|**nextOrderDateOffset** | **Integer** | Specifies the number of days to update the next order date from existing next order date. |  [optional] |
|**skipSubscriptionOffset** | **Integer** | Specifies the number of times the subscription can be skipped |  [optional] |
|**subscriptionOrderReminderOffset** | **Integer** | Specifies the number of days to send subscription order reminder email before the next continuity order. |  [optional] |
|**orderNowResetNextOrderDate** | **Boolean** | Specifies if order now action resets next order date |  [optional] |
|**subscriptionPauseLimitReminderOffset** | **Integer** | Specifies the number of days prior to when we need to send a   \&quot;subscription pause limit reached reminder\&quot; email before the pause limit is reached. |  [optional] |
|**subscriptionPausedReminderOffset** | **Integer** | Specifies the number of days to send subscription paused reminder email. |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


