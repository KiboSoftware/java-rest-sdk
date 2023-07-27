

# B2BUser

Customer account. Customers provide contact information, view order history, and set email preferences on their account.   Merchants can edit accounts to add internal notes or assign them to segments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailAddress** | **String** |  |  [optional] |
|**userName** | **String** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**localeCode** | **String** |  |  [optional] |
|**userId** | **String** | Unique identifier of the user who is currently logged in. This is null if the user is anonymous (not logged in).  Unicode data with a maximum length of 55 characters. |  [optional] |
|**roles** | [**List&lt;UserRole&gt;**](UserRole.md) |  |  [optional] |
|**isLocked** | **Boolean** |  |  [optional] |
|**isActive** | **Boolean** |  |  [optional] |
|**isRemoved** | **Boolean** |  |  [optional] |
|**acceptsMarketing** | **Boolean** | If true, the customer prefers to receive marketing material such as newsletters or email offers. |  [optional] |
|**hasExternalPassword** | **Boolean** | Indicates if an external password is set on this account |  [optional] |


## Implemented Interfaces

* Serializable


