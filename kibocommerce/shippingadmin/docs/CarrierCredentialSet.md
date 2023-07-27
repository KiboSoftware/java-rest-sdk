

# CarrierCredentialSet

Stores a set of <see cref=\"T:Mozu.ShippingAdmin.Contracts.Carriers.CarrierCredentialSetValue\">carrier credential key-value pairs</see>.  Sets are stored at the tenant level and referenced by a Mozu.ShippingAdmin.Contracts.Carriers.CarrierCredential.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**carrierId** | **String** | The Carrier ID associated with this credential set.  Usually the short name of a carrier (e.g., \&quot;FedEx\&quot;). |  [optional] |
|**code** | **String** | A unique code identifying this credential set.  The code is only guaranteed to be unique at the tenant and carrier level. |  [optional] |
|**name** | **String** | A name (i.e., nickname) for this credential set. |  [optional] |
|**values** | [**List&lt;CarrierCredentialSetValue&gt;**](CarrierCredentialSetValue.md) | A collection of values contained in this credential set. |  [optional] |
|**integrationId** | **String** | Specifies the ID returned from an integration. |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


