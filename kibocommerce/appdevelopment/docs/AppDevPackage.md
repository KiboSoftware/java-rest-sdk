

# AppDevPackage



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiVersion** | **String** |  |  [optional] |
|**appConfigUrl** | **String** | This will be used by the 3rd party developers to set a URL the intalled  applications can call from the Tenant installation/ |  [optional] |
|**appId** | **String** |  |  [optional] |
|**appKey** | **String** | App Key for the package in question. |  [optional] |
|**appSchemeVersion** | **Integer** |  |  [optional] |
|**applicationAttributes** | [**List&lt;ApplicationAttribute&gt;**](ApplicationAttribute.md) |  |  [optional] |
|**applicationBehaviors** | [**List&lt;ApplicationBehavior&gt;**](ApplicationBehavior.md) | List of Application Behaviors that apply to this version of the application. |  [optional] |
|**applicationCapabilities** | [**List&lt;ApplicationCapability&gt;**](ApplicationCapability.md) |  |  [optional] |
|**applicationCapabilityTypes** | [**List&lt;ApplicationCapabilityType&gt;**](ApplicationCapabilityType.md) |  |  [optional] |
|**applicationDescription** | **String** |  |  [optional] |
|**applicationDetailId** | **Integer** |  |  [optional] |
|**applicationEntitlements** | [**List&lt;ApplicationEntitlement&gt;**](ApplicationEntitlement.md) |  |  [optional] |
|**applicationId** | **Integer** |  |  [optional] |
|**applicationName** | **String** |  |  [optional] |
|**applicationOwnerDevAccountId** | **Integer** | This is the DevAccountId that owns the application |  [optional] |
|**applicationStatus** | **String** |  |  [optional] |
|**applicationStatusId** | **Integer** |  |  [optional] |
|**applicationStatusName** | **String** |  |  [optional] |
|**applicationSubscriptions** | [**List&lt;ApplicationSubscription&gt;**](ApplicationSubscription.md) |  |  [optional] |
|**applicationTypeId** | **Integer** |  |  [optional] |
|**applicationTypeName** | **String** |  |  [optional] |
|**applicationUpdateDate** | **OffsetDateTime** |  |  [optional] |
|**assetFileCount** | **Integer** |  |  [optional] |
|**attributeNamespace** | **String** |  |  [optional] |
|**dataNamespace** | **String** |  |  [optional] |
|**hasApplicationVersions** | **Boolean** |  |  [optional] |
|**id** | **Integer** |  |  [optional] |
|**isDeleted** | **Boolean** |  |  [optional] |
|**isLocked** | **Boolean** |  |  [optional] |
|**isReleasePackage** | **Boolean** |  |  [optional] |
|**legacyNamespace** | **String** |  |  [optional] |
|**majorVersion** | **Integer** |  |  [optional] |
|**minorVersion** | **Integer** |  |  [optional] |
|**namespace** | **String** |  |  [optional] |
|**namespaceRegistryId** | **String** |  |  [optional] |
|**packageDescription** | **String** |  |  [optional] |
|**packageGuid** | **String** |  |  [optional] |
|**packageName** | **String** |  |  [optional] |
|**parentThemeAppKey** | **String** | The parent theme AppKey if this is a theme and  the theme extends a valid, published theme. |  [optional] |
|**parentThemeName** | **String** |  |  [optional] |
|**publishedParentSemanticVersion** | **String** |  |  [optional] |
|**publishedParentThemeId** | **Integer** |  |  [optional] |
|**revision** | **Integer** |  |  [optional] |
|**semanticVersionRange** | **String** |  |  [optional] |
|**sharedSecret** | **String** |  |  [optional] |
|**themeEngineVersion** | **String** |  |  [optional] |
|**updateAvailable** | **Boolean** | Whether or not there&#39;s a theme update. |  [optional] |
|**updateDate** | **OffsetDateTime** |  |  [optional] |
|**updateParentAppKey** | **String** | The AppKey is a runtime type. This only applies for themes that inherit from another theme. It shows the most current update available. |  [optional] |
|**updateParentThemeName** | **String** | This only applies for themes that inherit from another theme. It shows the name of the most current update available. |  [optional] |
|**updateParentThemeVersion** | **String** | This only applies for themes that inherit from another theme. It shows the version of the most current update available. |  [optional] |
|**userId** | **String** |  |  [optional] |
|**validApplicationStatusIdList** | **List&lt;Integer&gt;** | List of Statuses that the application can move to during the application lifecycle. This is based on what the current value of the ApplicatinStatusId is. |  [optional] |


## Implemented Interfaces

* Serializable


