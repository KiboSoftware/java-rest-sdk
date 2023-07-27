

# CustomerAccount

Customer account. Customers provide contact information, view order history, and set email preferences on their account.   Merchants can edit accounts to add internal notes or assign them to segments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailAddress** | **String** | \&quot;Email addresss of the customer. |  [optional] |
|**userName** | **String** | User name for the customer account. |  [optional] |
|**firstName** | **String** | First name of the customer. |  [optional] |
|**lastName** | **String** | Last name of the customer. |  [optional] |
|**localeCode** | **String** | Locale Code. |  [optional] |
|**userId** | **String** | Unique identifier of the user who is currently logged in. This is null if the user is anonymous (not logged in).  Unicode data with a maximum length of 55 characters. |  [optional] |
|**isAnonymous** | **Boolean** | Is the account Anonymous? |  [optional] |
|**isLocked** | **Boolean** | Is the account locked? |  [optional] |
|**isActive** | **Boolean** | Is the account active? |  [optional] |
|**acceptsMarketing** | **Boolean** | If true, the customer prefers to receive marketing material such as newsletters or email offers. |  [optional] |
|**hasExternalPassword** | **Boolean** | Indicates if an external password is set on this account |  [optional] |
|**id** | **Integer** | Unique identifier of the account, also known as a customer number. |  [optional] |
|**customerSet** | **String** |  |  [optional] |
|**commerceSummary** | [**CommerceSummary**](CommerceSummary.md) |  |  [optional] |
|**contacts** | [**List&lt;CustomerContact&gt;**](CustomerContact.md) | List of contacts for this account. A customer account can have multiple contacts for billing and shipping addresses. |  [optional] |
|**companyOrOrganization** | **String** | The company or organization name for an account. |  [optional] |
|**notes** | [**List&lt;CustomerNote&gt;**](CustomerNote.md) | List of notes for the account. Merchants use these internal notes, for example, to make a note of a customer&#39;s interests or complaints.   Notes are available only from the merchant&#39;s view, customers cannot view these notes. |  [optional] |
|**attributes** | [**List&lt;CustomerAttribute&gt;**](CustomerAttribute.md) | List of attributes for the account. |  [optional] |
|**segments** | [**List&lt;CustomerCustomerSegment&gt;**](CustomerCustomerSegment.md) | List of segments assigned to account. Merchants create segments, for example, to manage discounts or assign VIP status.   Then they assign the account to the segment. An account can belong to several segments or none at all. |  [optional] |
|**taxExempt** | **Boolean** |  |  [optional] |
|**taxId** | **String** |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**customerSinceDate** | **OffsetDateTime** | Date when the customer account is created. |  [optional] |
|**accountType** | **String** | Type of account. |  [optional] |
|**migrationRequired** | **Boolean** | Indicates Subscription migration is required or not. |  [optional] |


## Implemented Interfaces

* Serializable


