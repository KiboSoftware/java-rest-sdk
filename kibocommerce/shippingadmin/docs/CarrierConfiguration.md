

# CarrierConfiguration


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Carrier Id (usually a shortname of a carrier, e.g. FedEx) |  [optional] |
|**enabled** | **Boolean** | Indicates that this CarrierConfiguration should be used at runtime |  [optional] |
|**enabledForReturns** | **Boolean** | Indicates that this CarrierConfiguration should be the default for returns shipping |  [optional] |
|**settings** | [**List&lt;Setting&gt;**](Setting.md) | Carrier Configuration Settings |  [optional] |
|**customTableRates** | [**List&lt;CustomTableRate&gt;**](CustomTableRate.md) | A list of custom table rates for the &#39;Custom&#39; carrier  &lt;remarks&gt;only use this if Id &#x3D;&#x3D; &#39;Custom&#39;&lt;/remarks&gt; |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**areCredentialsSet** | **Boolean** | Indicates whether the credentials/passwords are set.  &lt;remarks&gt;Credetials are updated only if this flag is set to true&lt;/remarks&gt; |  [optional] |


## Implemented Interfaces

* Serializable


