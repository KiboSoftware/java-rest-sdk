

# CarrierDefinition

A carrier definition including config field metadata.  Can either be a built-in system carrier or an Extensible Carrier installed via a <see cref=\"T:Mozu.ShippingAdmin.Contracts.Carriers.CarrierInstallation\">carrier installation</see>.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**carrierId** | **String** |  |  [optional] |
|**certified** | **Boolean** |  |  [optional] |
|**configFields** | [**List&lt;CarrierCredentialSetMetadata&gt;**](CarrierCredentialSetMetadata.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**features** | **List&lt;String&gt;** |  |  [optional] |
|**isBuiltIn** | **Boolean** |  |  [optional] |
|**logoUrl** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


