

# CommerceRuntimeChangeMessage

A message displayed by the system based on the last  action, for example, when a product price has changed. System-supplied and read-only.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the  message. System-supplied. Read-only. |  [optional] |
|**correlationId** | **String** | Correlation Id |  [optional] |
|**userId** | **String** | User Id that identifies the user that performed the related change |  [optional] |
|**userFirstName** | **String** | User First Name |  [optional] |
|**userLastName** | **String** | User Last Name |  [optional] |
|**userScopeType** | **String** | User Type (e.g. Shopper, Admin, etc.) |  [optional] |
|**appId** | **String** | App Id that identifies the user that performed the related change |  [optional] |
|**appKey** | **String** | App Key |  [optional] |
|**appName** | **String** | App Name |  [optional] |
|**subjectType** | **String** | Subject of the message, for example, \&quot;Product.\&quot; System-supplied. Read-only. |  [optional] |
|**success** | **Boolean** | Indicates if the message is related to a success or failure. |  [optional] |
|**identifier** | **String** | Unique identifier to what the message pertains, which can be a cart item, cart or another generic entity. System-supplied. Read-only. |  [optional] |
|**subject** | **String** | Text on the subject line of the message, for example, the product name. System-supplied. Read-only. |  [optional] |
|**verb** | **String** | Action applicable to the message. This can be \&quot;Increased,\&quot; when the product price has increased, \&quot;Decreased,\&quot; when the   product price has decreased, and \&quot;Invalidated,\&quot; when the product is no longer available. System-supplied. Read-only. |  [optional] |
|**message** | **String** | Human readable message. System-supplied. Read-only. |  [optional] |
|**metadata** | **Object** | Data. This property will be a JSON array that will contain 0-N items, when there is 1 item it will still be an array containing only one item. System-supplied. Read-only. |  [optional] |
|**oldValue** | **String** | Original price of the item. System-supplied. Read-only. |  [optional] |
|**newValue** | **String** | Current price of the item. System-supplied. Read-only. |  [optional] |
|**amount** | **Double** | Monetary amount that pertains to the change if applicable |  [optional] |
|**createDate** | **OffsetDateTime** | When the message was created. System-supplied. Read-only. |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** | Additional Data. This property will be a Dictionary of objects. |  [optional] |


## Implemented Interfaces

* Serializable


