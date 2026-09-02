

# B2BUser

Customer account. Customers provide contact information, view order history, and set email preferences on their account.  Merchants can edit accounts to add internal notes or assign them to segments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptsMarketing** | **Boolean** | If true, the customer prefers to receive marketing material such as newsletters or email offers. |  [optional] |
|**emailAddress** | **String** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**hasExternalPassword** | **Boolean** | Indicates if an external password is set on this account |  [optional] |
|**isActive** | **Boolean** |  |  [optional] |
|**isLocked** | **Boolean** |  |  [optional] |
|**isRemoved** | **Boolean** |  |  [optional] |
|**last2FaDate** | **OffsetDateTime** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**localeCode** | **String** |  |  [optional] |
|**roles** | [**List&lt;UserRole&gt;**](UserRole.md) |  |  [optional] |
|**userId** | **String** | Unique identifier of the user who is currently logged in. This is null if the user is anonymous (not logged in).  Unicode data with a maximum length of 55 characters. |  [optional] |
|**userName** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


