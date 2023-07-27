

# CarrierCredential

Stores a reference to a Mozu.ShippingAdmin.Contracts.Carriers.CarrierCredentialSet for use at different levels.  Valid levels include Site, Location Group, and Location. Different levels may be used for rates versus labels.  Site level is overriden by Location Group level which is overriden by Location level.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**carrierId** | **String** | The Carrier ID associated with this carrier credential.  Usually the short name of a carrier (e.g., \&quot;FedEx\&quot;). |  [optional] |
|**siteId** | **Integer** | The Site ID associated with this carrier credential, if any. |  [optional] |
|**locationGroupCode** | **String** | The Location Group Code associated with this carrier credential, if any. |  [optional] |
|**locationCode** | **String** | The Location Code associated with this carrier credential, if any. |  [optional] |
|**credentialSet** | [**CarrierCredentialSet**](CarrierCredentialSet.md) |  |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


