

# CallOffOrderRule

Tenant-scoped, expression-based rule that selects Mozu.CommerceRuntime.Contracts.CallOffOrders.CallOffOrder entities for downstream composite consumers (e.g. CallOff Reservation Rule in Catalog).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**CoreApiContractsAuditInfo**](CoreApiContractsAuditInfo.md) |  |  [optional] |
|**code** | **String** | Tenant-unique stable identifier referenced by composite consumers. Matches &#x60;[A-Za-z0-9_-]+&#x60;. Auto-generated from Mozu.CommerceRuntime.Contracts.CallOffOrderRules.CallOffOrderRule.Name when omitted on create. Immutable after create. |  [optional] |
|**description** | **String** | Optional rule purpose / authoring notes. Max 2000 chars. |  [optional] |
|**enabled** | **Boolean** | If &#x60;false&#x60;, the evaluate endpoint rejects the rule with HTTP 400. Lifecycle CRUD reads continue to return it. Default &#x60;true&#x60; on create. |  [optional] |
|**expression** | [**DynamicExpression**](DynamicExpression.md) |  |  [optional] |
|**id** | **String** | System-generated unique identifier (MozuObjectId). Server-set; ignored on write. |  [optional] |
|**metaData** | **Object** | Free-form consumer-specific metadata. Mirrors &#x60;PurchaseLimitRule.MetaData&#x60;. |  [optional] |
|**name** | **String** | Human-readable rule name. Required; non-empty; max 255 chars. |  [optional] |
|**ruleType** | **String** | Identifies which composite consumer family uses this rule. Free string matching &#x60;[A-Za-z0-9_-]+&#x60;. Well-known values: &#x60;\&quot;Reservation\&quot;&#x60;, &#x60;\&quot;PurchaseLimit\&quot;&#x60;, &#x60;\&quot;Custom\&quot;&#x60;. |  [optional] |
|**tenantId** | **Integer** | Tenant identifier. Populated from &#x60;IApiContext&#x60; on the server. Never accepted from the client request body. |  [optional] |


## Implemented Interfaces

* Serializable


