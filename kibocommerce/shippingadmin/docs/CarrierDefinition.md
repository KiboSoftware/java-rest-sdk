

# CarrierDefinition

A carrier definition including config field metadata.  Can either be a built-in system carrier or an Extensible Carrier installed via a <see cref=\"T:Mozu.ShippingAdmin.Contracts.Carriers.CarrierInstallation\">carrier installation</see>.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**carrierId** | **String** |  |  [optional] |
|**isBuiltIn** | **Boolean** |  |  [optional] |
|**certified** | **Boolean** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**logoUrl** | **String** |  |  [optional] |
|**configFields** | [**List&lt;CarrierCredentialSetMetadata&gt;**](CarrierCredentialSetMetadata.md) |  |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


