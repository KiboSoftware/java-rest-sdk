

# CustomerAuditEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerAccountId** | **Integer** | Customer associated with this entry |  [optional] |
|**customerAuditEntryId** | **Integer** | Id of this entry |  [optional] |
|**entryDate** | **OffsetDateTime** | Date of the Entry |  [optional] |
|**entryUser** | **String** | User ID associated with this Entry |  [optional] |
|**application** | **String** | Applicattion associated with this entry |  [optional] |
|**site** | **String** | Site associated wit this entry |  [optional] |
|**description** | **String** | Description of the change (UI Displayable) |  [optional] |
|**fieldPath** | **String** | Path of the field value being changed (e.g. /Customer/Contacts/1/FirstName) |  [optional] |
|**oldValue** | **String** | Original value before this event |  [optional] |
|**newValue** | **String** | New Value after this event |  [optional] |


## Implemented Interfaces

* Serializable


