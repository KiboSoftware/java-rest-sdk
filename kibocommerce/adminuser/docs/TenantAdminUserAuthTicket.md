

# TenantAdminUserAuthTicket


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**user** | [**UserProfile**](UserProfile.md) |  |  [optional] |
|**createdOn** | **OffsetDateTime** |  |  [optional] |
|**jwtAccessToken** | **String** |  |  [optional] |
|**accessToken** | **String** |  |  [optional] |
|**accessTokenExpiration** | **OffsetDateTime** |  |  [optional] |
|**refreshToken** | **String** |  |  [optional] |
|**redirect** | **String** |  |  [optional] |
|**refreshTokenExpiration** | **OffsetDateTime** |  |  [optional] |
|**tenant** | [**AdminUserTenant**](AdminUserTenant.md) |  |  [optional] |
|**availableTenants** | [**List&lt;AdminUserTenant&gt;**](AdminUserTenant.md) |  |  [optional] |
|**grantedBehaviors** | **List&lt;Integer&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


