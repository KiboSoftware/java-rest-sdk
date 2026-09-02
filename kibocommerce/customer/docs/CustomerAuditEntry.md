

# CustomerAuditEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**application** | **String** | Applicattion associated with this entry |  [optional] |
|**customerAccountId** | **Integer** | Customer associated with this entry |  [optional] |
|**customerAuditEntryId** | **Integer** | Id of this entry |  [optional] |
|**description** | **String** | Description of the change (UI Displayable) |  [optional] |
|**entryDate** | **OffsetDateTime** | Date of the Entry |  [optional] |
|**entryUser** | **String** | User ID associated with this Entry |  [optional] |
|**fieldPath** | **String** | Path of the field value being changed (e.g. /Customer/Contacts/1/FirstName) |  [optional] |
|**newValue** | **String** | New Value after this event |  [optional] |
|**oldValue** | **String** | Original value before this event |  [optional] |
|**site** | **String** | Site associated wit this entry |  [optional] |


## Implemented Interfaces

* Serializable


