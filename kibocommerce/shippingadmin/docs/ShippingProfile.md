

# ShippingProfile



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Merchant entered unique identifier for a ShippingProfile |  [optional] |
|**targetedSiteIds** | **List&lt;Integer&gt;** | The siteid&#39;s for which this profile applies  &lt;remarks&gt;for now there is a 1-1 relationship between this profile and site so only 1 siteid should be in this list&lt;/remarks&gt; |  [optional] |
|**shippingInclusionRules** | [**List&lt;ShippingInclusionRule&gt;**](ShippingInclusionRule.md) |  |  [optional] |
|**productHandlingFeeRules** | [**List&lt;HandlingFeeRule&gt;**](HandlingFeeRule.md) |  |  [optional] |
|**orderHandlingFeeRules** | [**List&lt;HandlingFeeRule&gt;**](HandlingFeeRule.md) |  |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


