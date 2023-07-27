

# HandlingFeeRule

An object to group a handling fee with zones, rules, and servicetypes

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The system generated id for this rule |  [optional] |
|**sequence** | **Integer** | The sequence in which this rule is preferred over others |  [optional] |
|**shippingTargetRuleCodes** | **List&lt;String&gt;** | The shipping target rule codes associated with this rule  &lt;remarks&gt;leave empty or null to denote all destinations&lt;/remarks&gt; |  [optional] |
|**productTargetRuleCodes** | **List&lt;String&gt;** | the product target rule codes associated with this rule  &lt;remarks&gt;leave empty or null to denote all products&lt;/remarks&gt; |  [optional] |
|**serviceTypes** | [**List&lt;ServiceType&gt;**](ServiceType.md) | the servicetypes associated with this rule  &lt;remarks&gt;leave empty or null to denote all carriers and subsequent service types&lt;/remarks&gt; |  [optional] |
|**valueType** | **String** | The type of this handling fee  &lt;value&gt;percentage&lt;/value&gt;&lt;value&gt;flatrate&lt;/value&gt; |  [optional] |
|**appliesTo** | **String** | The level at which this fee applies  &lt;value&gt;shippingrate&lt;/value&gt;&lt;value&gt;order&lt;/value&gt; |  [optional] |
|**value** | **Double** | The value of this fee |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


