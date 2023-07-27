

# AuditRecordChange

Group all related audit changes into AuditRecordChange.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Indicate type of change like Add, Update, Remove. |  [optional] |
|**path** | **String** | This will applicable only to the nested objects (Collection) on the quote like Quote Items, Destination contacts.  This field will indicate which item in the collection got modified exactly.  Null path means it&#39;s not nested on the quote object. |  [optional] |
|**fields** | [**List&lt;AuditRecordChangeField&gt;**](AuditRecordChangeField.md) | List of actual changes. |  [optional] |


## Implemented Interfaces

* Serializable


