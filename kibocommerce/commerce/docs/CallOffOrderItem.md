

# CallOffOrderItem

A requested product quantity for delivery to a specific address.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actualDeliveryDate** | **OffsetDateTime** | Actual delivery date, recorded once the line has been physically delivered. |  [optional] |
|**attributes** | [**List&lt;CallOffOrderItemAttribute&gt;**](CallOffOrderItemAttribute.md) | Line-level custom attributes extending AbstractAttribute. |  [optional] |
|**blanketOrderItemId** | **String** | Identifier of the Blanket Order item this item draws from. Required when the parent call-off references a Blanket Order. |  [optional] |
|**cancelledBy** | **String** | User who cancelled this line. |  [optional] |
|**cancelledDate** | **OffsetDateTime** | Line cancellation timestamp. |  [optional] |
|**cancelledReason** | [**CommerceRuntimeCanceledReason**](CommerceRuntimeCanceledReason.md) |  |  [optional] |
|**destinationId** | **String** | Identifier of the Destination in the parent call-off&#39;s Destinations collection that this line ships to. |  [optional] |
|**eddStatus** | **String** | Lifecycle state of Mozu.CommerceRuntime.Contracts.CallOffOrders.CallOffOrderItem.ExpectedDeliveryDate: null until first calculated, \&quot;Provisional\&quot; while Hold/PartiallyReserved/FullyReserved, then locked to \&quot;Final\&quot; at release. Exposed as a string on this Contracts DTO (not the Domain-layer enum), matching this entity&#39;s existing convention for enum-backed fields (see FulfillmentType). |  [optional] |
|**expectedDeliveryDate** | **OffsetDateTime** | Expected delivery date, typically provided by the supplier or fulfillment system. |  [optional] |
|**fillRate** | **Double** | Computed fill ratio (ReservedQty / RequestedQty). Phase 2+. |  [optional] |
|**fulfillmentLocationCode** | **String** | Pickup location code. Meaningful only when &#x60;FulfillmentType &#x3D;&#x3D; \&quot;Pickup\&quot;&#x60;; ignored for Ship / Digital / Curbside / Delivery (downstream Order Routing handles those). Carried into the SalesOrder created by the Release Rules Engine (spec 005 FR-021). |  [optional] |
|**fulfillmentType** | **String** | Per-line fulfillment method. One of: Ship, Pickup, Digital, Curbside, Delivery. In a future release, CallOffOrderItem may extend FulfillableCommerceItem. |  [optional] |
|**id** | **String** | System-generated item identifier. |  [optional] |
|**inventoryTags** | [**List&lt;InventoryTags&gt;**](InventoryTags.md) | Name-value pairs scoping the inventory pool for reservation. Set at item creation and immutable once a reservation exists. |  [optional] |
|**lineId** | **Integer** | Sequential line identifier within the call-off, auto-assigned. |  [optional] |
|**lineTotal** | **Double** | Total amount for this line. Client-supplied in Mode 1; computed in Mode 2. |  [optional] |
|**product** | [**CallOffOrderProductReference**](CallOffOrderProductReference.md) |  |  [optional] |
|**purchaseLocation** | **String** | Purchase location (store/location code) captured from the request context at line creation. Used for catalog price resolution and carried to the released Sales Order. Immutable after create. |  [optional] |
|**releasedDate** | **OffsetDateTime** | Timestamp when this line was released to a Sales Order (Phase 3). |  [optional] |
|**releasedQty** | **Integer** | Quantity released to a Sales Order. Written in Phase 3; zero in Phases 1–2. |  [optional] |
|**requestedDeliveryDate** | **OffsetDateTime** | Buyer-requested delivery date for this line. |  [optional] |
|**requestedQty** | **Integer** | Buyer-requested quantity. |  [optional] |
|**requestedShipDate** | **OffsetDateTime** | Buyer-requested ship date. Must fall within the parent Blanket Order&#39;s validity period when a Blanket Order is referenced. |  [optional] |
|**reservedQty** | **Integer** | Quantity reserved by the inventory reservation engine. Written in Phase 2; zero in Phase 1. |  [optional] |
|**salesOrderId** | **String** | The SalesOrder id this line was released into. Null until the line transitions to &#x60;Released&#x60; by the Release Rules Engine (spec 005). Immutable thereafter. |  [optional] |
|**status** | **String** | Current line status. One of: Hold, PartiallyReserved, Released, Converted, Cancelled. |  [optional] |
|**timeFenceDays** | **Integer** | Time-fence tolerance (days) from the ReservationRule that produced this line&#39;s most recent reservation delta (spec COM-10941 follow-up). |  [optional] |
|**unitPrice** | **Double** | Per-line unit price. Overridable — may come from the Blanket Order, be client-supplied, or be buyer-negotiated. |  [optional] |


## Implemented Interfaces

* Serializable


