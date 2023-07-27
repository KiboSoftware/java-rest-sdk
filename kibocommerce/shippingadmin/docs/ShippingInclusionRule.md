

# ShippingInclusionRule

An object to bind service types to shipping target rules and/or product target rules

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The system generated id of this shipping inclusion rule |  [optional] |
|**sequence** | **Integer** | The sequence in which this rule is preferred over others |  [optional] |
|**shippingTargetRuleCodes** | **List&lt;String&gt;** | The shipping target rule codes associated with this rule  &lt;remarks&gt;leave empty or null to denote all destinations&lt;/remarks&gt; |  [optional] |
|**productTargetRuleCodes** | **List&lt;String&gt;** | the product target rule codes associated with this rule  &lt;remarks&gt;leave empty or null to denote all products&lt;/remarks&gt; |  [optional] |
|**serviceTypes** | [**List&lt;ServiceType&gt;**](ServiceType.md) | the servicetypes associated with this rule  &lt;remarks&gt;leave empty or null to denote all carriers and subsequent service types&lt;/remarks&gt; |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


