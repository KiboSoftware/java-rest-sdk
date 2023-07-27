

# EventSubscription

The subscription entity used specifically in PUSH event scenarios where a third-party desires to receive notification of events

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for a subscription |  [optional] |
|**appId** | **String** | Application identifier for subscription |  [optional] |
|**apiVersion** | **String** | ApiVersion |  [optional] |
|**topics** | **List&lt;String&gt;** | A list of topics that the subscription relates to |  [optional] |
|**subscribingTenants** | [**List&lt;SubscribingTenant&gt;**](SubscribingTenant.md) | A list of subscribers or subscribing tenants that the subscription relates to |  [optional] |
|**notificationDeliveryType** | **String** | Notification delivery type which is a string representation of an enumeration of values.  Example: Http (this is case insensitive, so http may also be passed in) |  [optional] |
|**contentType** | **String** | Content type of the payload that will be delivered.  This is utilized in combination with the notification delivery type.  Example:  A HTTP Post (notification delivery type) is performed with a JSON representation of the event data (content type). |  [optional] |
|**endpoint** | **String** | The delivery endpoint that will receive notifications when events concerning the specified topics on the subscription occur.  The format of the endpoint may differ depending on the notification type.  For example, the endpoint may be a URL in some cases and an email address in others if multiple notification types are available. |  [optional] |
|**confirmed** | **Boolean** | A boolean value that indicates if the subscription endpoint has been confirmed |  [optional] |
|**isActive** | **Boolean** | A boolean value that indicates if the subscription is active.  The subscription may be inactive due to repeated downtimes at the endpoint.  If they subscription is deactivated the subscription owner or application will need to reactivate it for notifications to be delivered. |  [optional] |
|**noCallback** | **Boolean** | A boolean value that indicates if events should be delivered that resulted from an API call by the application.  If true, any events that occur as a result of a direct API call by the same application will not be delivered. This can prevent an endless loop in certain scenarios. |  [optional] |
|**createDate** | **OffsetDateTime** | When the entity was created. System-supplied and read-only. |  [optional] |
|**updateDate** | **OffsetDateTime** | When the entity was updated. System-supplied and read-only. |  [optional] |
|**createBy** | **String** | Identifier of the user who created the entity. System-supplied and read-only. |  [optional] |
|**updateBy** | **String** | Identifier of the user who updated the entity. System-supplied and read-only. |  [optional] |


## Implemented Interfaces

* Serializable


