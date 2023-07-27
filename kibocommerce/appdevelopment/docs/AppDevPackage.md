

# AppDevPackage



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**updateDate** | **OffsetDateTime** |  |  [optional] |
|**applicationUpdateDate** | **OffsetDateTime** |  |  [optional] |
|**id** | **Integer** |  |  [optional] |
|**applicationName** | **String** |  |  [optional] |
|**applicationTypeId** | **Integer** |  |  [optional] |
|**applicationTypeName** | **String** |  |  [optional] |
|**majorVersion** | **Integer** |  |  [optional] |
|**minorVersion** | **Integer** |  |  [optional] |
|**revision** | **Integer** |  |  [optional] |
|**sharedSecret** | **String** |  |  [optional] |
|**applicationStatusId** | **Integer** |  |  [optional] |
|**applicationStatusName** | **String** |  |  [optional] |
|**apiVersion** | **String** |  |  [optional] |
|**applicationDescription** | **String** |  |  [optional] |
|**themeEngineVersion** | **String** |  |  [optional] |
|**namespace** | **String** |  |  [optional] |
|**validApplicationStatusIdList** | **List&lt;Integer&gt;** | List of Statuses that the application can move to during the application lifecycle.  This is based on what the current value of the ApplicatinStatusId is. |  [optional] |
|**appSchemeVersion** | **Integer** |  |  [optional] |
|**appConfigUrl** | **String** | This will be used by the 3rd party developers to set a URL the intalled   applications can call from the Tenant installation/ |  [optional] |
|**isReleasePackage** | **Boolean** |  |  [optional] |
|**packageName** | **String** |  |  [optional] |
|**packageDescription** | **String** |  |  [optional] |
|**dataNamespace** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**appId** | **String** |  |  [optional] |
|**applicationId** | **Integer** |  |  [optional] |
|**applicationDetailId** | **Integer** |  |  [optional] |
|**isLocked** | **Boolean** |  |  [optional] |
|**isDeleted** | **Boolean** |  |  [optional] |
|**assetFileCount** | **Integer** |  |  [optional] |
|**packageGuid** | **String** |  |  [optional] |
|**applicationStatus** | **String** |  |  [optional] |
|**applicationBehaviors** | [**List&lt;ApplicationBehavior&gt;**](ApplicationBehavior.md) | List of Application Behaviors that apply to this version of the application. |  [optional] |
|**applicationSubscriptions** | [**List&lt;ApplicationSubscription&gt;**](ApplicationSubscription.md) |  |  [optional] |
|**applicationCapabilityTypes** | [**List&lt;ApplicationCapabilityType&gt;**](ApplicationCapabilityType.md) |  |  [optional] |
|**applicationAttributes** | [**List&lt;ApplicationAttribute&gt;**](ApplicationAttribute.md) |  |  [optional] |
|**applicationCapabilities** | [**List&lt;ApplicationCapability&gt;**](ApplicationCapability.md) |  |  [optional] |
|**applicationEntitlements** | [**List&lt;ApplicationEntitlement&gt;**](ApplicationEntitlement.md) |  |  [optional] |
|**attributeNamespace** | **String** |  |  [optional] |
|**hasApplicationVersions** | **Boolean** |  |  [optional] |
|**legacyNamespace** | **String** |  |  [optional] |
|**namespaceRegistryId** | **String** |  |  [optional] |
|**publishedParentThemeId** | **Integer** |  |  [optional] |
|**publishedParentSemanticVersion** | **String** |  |  [optional] |
|**semanticVersionRange** | **String** |  |  [optional] |
|**parentThemeName** | **String** |  |  [optional] |
|**parentThemeAppKey** | **String** | The parent theme AppKey if this is a theme and   the theme extends a valid, published theme. |  [optional] |
|**updateParentAppKey** | **String** | The AppKey is a runtime type.  This only applies for themes that inherit from another theme.  It shows the most current update available. |  [optional] |
|**updateAvailable** | **Boolean** | Whether or not there&#39;s a theme update. |  [optional] |
|**appKey** | **String** | App Key for the package in question. |  [optional] |
|**updateParentThemeName** | **String** | This only applies for themes that inherit from another theme.  It shows the name of the most current update available. |  [optional] |
|**updateParentThemeVersion** | **String** | This only applies for themes that inherit from another theme.  It shows the version of the most current update available. |  [optional] |
|**applicationOwnerDevAccountId** | **Integer** | This is the DevAccountId that owns the application |  [optional] |


## Implemented Interfaces

* Serializable


