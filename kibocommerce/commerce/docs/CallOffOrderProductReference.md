

# CallOffOrderProductReference

Lightweight product identity for Call-Off Order Items. Extended fields are stamped from the catalog at call-off creation (Kibo mode) and carried through to the released Sales Order, avoiding per-line catalog lookups at release time.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bundledProducts** | [**List&lt;BundledProduct&gt;**](BundledProduct.md) | Bundle component lines. Populated only when Mozu.CommerceRuntime.Contracts.CallOffOrders.ProductReference.ProductUsage is \&quot;Bundle\&quot;. Stamped at create. Immutable. |  [optional] |
|**combinedProductCode** | **String** | Returns VariationProductCode if not null/whitespace, otherwise ProductCode. This value is computed on the domain model and mapped directly to the contract via Mapster convention-based mapping — no recalculation on the contract side. UI should use the items.product.combinedproductcode filter for variation-aware product searches instead of items.product.productcode. |  [optional] |
|**fulfillmentTypesSupported** | **List&lt;String&gt;** | Fulfillment types the product supports (e.g. \&quot;Shipping\&quot;, \&quot;Pickup\&quot;). Stamped from the catalog at call-off creation. Immutable. |  [optional] |
|**goodsType** | **String** | Goods type (e.g. \&quot;Physical\&quot;, \&quot;Digital\&quot;, \&quot;Service\&quot;). Routes shipment creation. Stamped at create. Immutable. |  [optional] |
|**name** | **String** | Display name of the product. |  [optional] |
|**options** | [**List&lt;CommerceRuntimeProductOption&gt;**](CommerceRuntimeProductOption.md) | Configurable option selections for this variant. Stamped at create. Immutable. |  [optional] |
|**productCode** | **String** | Product code (SKU). Must match the Blanket Order line product when the parent call-off references a Blanket Order. |  [optional] |
|**productUsage** | **String** | Product usage classification (e.g. \&quot;Bundle\&quot;, \&quot;Standard\&quot;). Drives bundle line splitting at shipment creation. Stamped at create. Immutable. |  [optional] |
|**variationProductCode** | **String** | Variation product code for the selected variant. Stamped at create. Immutable. |  [optional] |


## Implemented Interfaces

* Serializable


