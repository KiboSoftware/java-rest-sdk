

# CustomerCredit

Represetation of a store credit or gift card.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activationDate** | **OffsetDateTime** | Date the credit was activated.  Null if card is not active. Credits must be activated before they can be used. ReadOnly after activation |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**code** | **String** | Unique number identifier representing this credit. Number may be generated or set by the Tenant Number is unique within the Tenant context. ReadOnly after credit creation |  [optional] |
|**creditType** | **String** | Type of Credit. Mozu.Customer.Contracts.Credit.Credit.CreditTypeConst Required. ReadOnly after credit creation |  [optional] |
|**creditTypeId** | **Integer** |  |  [optional] |
|**currencyCode** | **String** | Currency Code |  [optional] |
|**currentBalance** | **Double** | Do we want to track this here? Current Balance ReadOnly |  [optional] |
|**customCreditType** | **String** | Name of custom credit type Optional. |  [optional] |
|**customerId** | **Integer** | Id of the N:Mozu.Customer that this credit is assigned to. Optional. |  [optional] |
|**expirationDate** | **OffsetDateTime** | Date after which this credit is no longer valid Optional Defaults to 365 days |  [optional] |
|**initialBalance** | **Double** | Balance assigned when credit was initially created. May be zero and updated later. ReadOnly after intial credit creation |  [optional] |


## Implemented Interfaces

* Serializable


