

# BlanketOrderProductReference

Lightweight product identity for Blanket Order Items. Extended fields are stamped from the catalog at blanket creation and carried through to consumption tracking and call-off integration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bundledProducts** | [**List&lt;BundledProduct&gt;**](BundledProduct.md) | Bundle component lines. Populated only when Mozu.CommerceRuntime.Contracts.BlanketOrders.ProductReference.ProductUsage is \&quot;Bundle\&quot;. Stamped at create. Immutable. |  [optional] |
|**combinedProductCode** | **String** | Returns VariationProductCode if not null/whitespace, otherwise ProductCode. This value is computed on the domain model and mapped directly to the contract via Mapster convention-based mapping — no recalculation on the contract side. UI should use the items.product.combinedproductcode filter for variation-aware product searches instead of items.product.productcode. |  [optional] |
|**fulfillmentTypesSupported** | **List&lt;String&gt;** | Fulfillment types the product supports (e.g. \&quot;Shipping\&quot;, \&quot;Pickup\&quot;). Stamped from the catalog at blanket create. Immutable. |  [optional] |
|**goodsType** | **String** | Goods type (e.g. \&quot;Physical\&quot;, \&quot;Digital\&quot;, \&quot;Service\&quot;). Routes shipment creation. Stamped at create. Immutable. |  [optional] |
|**isBundle** | **Boolean** | Indicates if this product is a bundle (ProductUsage&#x3D;\&quot;Bundle\&quot; and has bundled products). |  [optional] [readonly] |
|**name** | **String** | Product display name. |  [optional] |
|**options** | [**List&lt;CommerceRuntimeProductOption&gt;**](CommerceRuntimeProductOption.md) | Configurable option selections for this variant. Stamped at create. Immutable. |  [optional] |
|**productCode** | **String** | Product code used for identification. |  [optional] |
|**productUsage** | **String** | Product usage type (e.g., \&quot;simple\&quot;, \&quot;collection\&quot;, \&quot;bundle_component\&quot;, \&quot;Configurable\&quot;). Used to enforce product eligibility rules for blanket orders. |  [optional] |
|**variationProductCode** | **String** | For configurable products, the unique identifier of the product variation. Either ProductCode or VariationProductCode must be provided. |  [optional] |


## Implemented Interfaces

* Serializable


