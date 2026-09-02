

# StaticField

Authoring descriptor for a single declared expression field.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowNullRightSide** | **Boolean** | True when &#x60;eq null&#x60; / &#x60;ne null&#x60; predicates are valid. |  [optional] |
|**dataType** | **String** | One of: &#x60;String&#x60;, &#x60;Integer&#x60;, &#x60;Decimal&#x60;, &#x60;DateTime&#x60;, &#x60;Boolean&#x60;. |  [optional] |
|**enumValues** | **List&lt;String&gt;** | Present when the field has a constrained value set (e.g. &#x60;status&#x60;, &#x60;items.fulfillmentType&#x60;). |  [optional] |
|**name** | **String** | Filter-syntax field name (e.g. &#x60;\&quot;items.fulfillmentType\&quot;&#x60;). |  [optional] |
|**nullable** | **Boolean** | True when the underlying field accepts null comparison values. |  [optional] |
|**operators** | **List&lt;String&gt;** | Allowed operator codes for this field. Subset of &#x60;eq&#x60;, &#x60;ne&#x60;, &#x60;in&#x60;, &#x60;gt&#x60;, &#x60;ge&#x60;, &#x60;lt&#x60;, &#x60;le&#x60;. |  [optional] |
|**pathLabel** | **String** | Human-readable UI label (e.g. &#x60;\&quot;Item Fulfillment Type\&quot;&#x60;). |  [optional] |
|**scope** | **String** | &#x60;\&quot;item\&quot;&#x60; for item-level fields; absent for header fields. |  [optional] |
|**semantics** | **String** | &#x60;\&quot;anyMatch\&quot;&#x60; on item-level fields to communicate             ANY-item-matches semantics. |  [optional] |


## Implemented Interfaces

* Serializable


