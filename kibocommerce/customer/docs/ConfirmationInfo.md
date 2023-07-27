

# ConfirmationInfo

Used to update a user's forgotten password. Contains the user's email address, new password, and the confirmation code   that is required to update the password.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userName** | **String** | UserName of the user who has requested a new password. |  [optional] |
|**confirmationCode** | **String** | Confirmation code that a user supplies when requesting a new password. |  [optional] |
|**newPassword** | **String** | The user&#39;s new password. |  [optional] |


## Implemented Interfaces

* Serializable


