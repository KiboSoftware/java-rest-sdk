

# CallOffOrderRuleSchema

Response body for `GET /commerce/rules/callOffOrder/schema`. Tenant-scoped authoring contract for rule-builder UIs — reflects `CallOffOrderExpressionContext` and `CallOffOrderItemExpressionContext` plus the tenant's dynamic call-off order attribute slot.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**context** | **String** | Schema-version identifier. Always &#x60;\&quot;CallOffOrderExpressionContext\&quot;&#x60; in v1. |  [optional] |
|**dynamicFields** | [**List&lt;DynamicFieldSlot&gt;**](DynamicFieldSlot.md) | One entry per dynamic slot. v1 has a single entry for &#x60;attributes.*&#x60;. |  [optional] |
|**staticFields** | [**List&lt;StaticField&gt;**](StaticField.md) | One entry per &#x60;[ExpressionContextProperty]&#x60; on the context: header fields plus the flattened item-level fields under the &#x60;items.*&#x60; namespace. |  [optional] |


## Implemented Interfaces

* Serializable


