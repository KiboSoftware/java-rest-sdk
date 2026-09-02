

# ApplicationEntitlement



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appKey** | **String** |  |  [optional] |
|**appOwnerDevAccountId** | **Integer** | Denotes the application owner dev account id |  [optional] |
|**applicationEntitlementId** | **Integer** |  |  [optional] |
|**applicationId** | **Integer** |  |  [optional] |
|**applicationLicenseType** | **String** |  |  [optional] |
|**applicationName** | **String** |  |  [optional] |
|**applicationStatusId** | **String** |  |  [optional] |
|**applicationTransactions** | [**List&lt;ApplicationTransaction&gt;**](ApplicationTransaction.md) |  |  [optional] |
|**applicationVersion** | **String** |  |  [optional] |
|**deletedBy** | **String** | User id that soft-deleted this entitlement during an application delete cascade (null if active). |  [optional] |
|**deletedByFirstName** | **String** | First name of the user who soft-deleted this entitlement, resolved from Mozu.AppDev.Contracts.ApplicationEntitlement.DeletedBy on read (null if active or unresolved). |  [optional] |
|**deletedByLastName** | **String** | Last name of the user who soft-deleted this entitlement, resolved from Mozu.AppDev.Contracts.ApplicationEntitlement.DeletedBy on read (null if active or unresolved). |  [optional] |
|**deletedDate** | **OffsetDateTime** | UTC timestamp when this entitlement was soft-deleted during an application delete cascade (null if active). |  [optional] |
|**devAccountId** | **Integer** | Denotes which DevAccountId is the application installed in |  [optional] |
|**effectiveEndDate** | **OffsetDateTime** |  |  [optional] |
|**effectiveStartDate** | **OffsetDateTime** |  |  [optional] |
|**entitlementStatus** | **String** |  |  [optional] |
|**installedAppsApplicationId** | **String** |  |  [optional] |
|**installedByFirstName** | **String** |  |  [optional] |
|**installedByLastName** | **String** |  |  [optional] |
|**installedDate** | **OffsetDateTime** |  |  [optional] |
|**packageId** | **Integer** |  |  [optional] |
|**packageName** | **String** |  |  [optional] |
|**siteId** | **Integer** |  |  [optional] |
|**tenantId** | **Integer** |  |  [optional] |
|**tenantName** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


