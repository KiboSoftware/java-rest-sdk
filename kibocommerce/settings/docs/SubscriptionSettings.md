

# SubscriptionSettings

Subscription settings defined or this site

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applyBestPriceOnContinuityOrder** | **Boolean** |  |  [optional] |
|**applyLatestItemPriceOnContinuityOrder** | **Boolean** | If this setting is enabled, the item price on the continuity order will be updated to the current price upon creation. |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**continuityOrderDateOffset** | **Integer** | Specifies the number of days before the next order date to create the continuity order. |  [optional] |
|**nextOrderDateOffset** | **Integer** | Specifies the number of days to update the next order date from existing next order date. |  [optional] |
|**orderNowResetNextOrderDate** | **Boolean** | Specifies if order now action resets next order date |  [optional] |
|**pauseSubscriptionOffset** | **Integer** | Specifies the number of continuity orders should be placed before activating the subscription. |  [optional] |
|**restrictOrderNowOffset** | **Integer** | Specifies the number of days, &#x60;order all items now&#x60; or &#x60;order partial items now&#x60; actions cannot be repeated from the last action. |  [optional] |
|**skipSubscriptionOffset** | **Integer** | Specifies the number of times the subscription can be skipped |  [optional] |
|**subscriptionOrderReminderOffset** | **Integer** | Specifies the number of days to send subscription order reminder email before the next continuity order. |  [optional] |
|**subscriptionPauseLimitReminderOffset** | **Integer** | Specifies the number of days prior to when we need to send a  \&quot;subscription pause limit reached reminder\&quot; email before the pause limit is reached. |  [optional] |
|**subscriptionPausedReminderOffset** | **Integer** | Specifies the number of days to send subscription paused reminder email. |  [optional] |


## Implemented Interfaces

* Serializable


