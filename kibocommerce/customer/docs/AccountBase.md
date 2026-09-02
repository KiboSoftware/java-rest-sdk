

# AccountBase

Customer account. Customers provide contact information, view order history, and set email preferences on their account.  Merchants can edit accounts to add internal notes or assign them to segments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountType** | **String** | Type of account. |  [optional] |
|**attributes** | [**List&lt;CustomerAttribute&gt;**](CustomerAttribute.md) | List of attributes for the account. |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**commerceSummary** | [**CommerceSummary**](CommerceSummary.md) |  |  [optional] |
|**companyOrOrganization** | **String** | The company or organization name for an account. |  [optional] |
|**contacts** | [**List&lt;CustomerContact&gt;**](CustomerContact.md) | List of contacts for this account. A customer account can have multiple contacts for billing and shipping addresses. |  [optional] |
|**customerSet** | **String** |  |  [optional] |
|**customerSinceDate** | **OffsetDateTime** | Date when the customer account is created. |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**id** | **Integer** | Unique identifier of the account, also known as a customer number. |  [optional] |
|**migrationRequired** | **Boolean** | Indicates Subscription migration is required or not. |  [optional] |
|**notes** | [**List&lt;CustomerNote&gt;**](CustomerNote.md) | List of notes for the account. Merchants use these internal notes, for example, to make a note of a customer&#39;s interests or complaints.  Notes are available only from the merchant&#39;s view, customers cannot view these notes. |  [optional] |
|**segments** | [**List&lt;CustomerCustomerSegment&gt;**](CustomerCustomerSegment.md) | List of segments assigned to account. Merchants create segments, for example, to manage discounts or assign VIP status.  Then they assign the account to the segment. An account can belong to several segments or none at all. |  [optional] |
|**taxExempt** | **Boolean** |  |  [optional] |
|**taxId** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


