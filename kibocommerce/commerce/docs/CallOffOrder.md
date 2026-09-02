

# CallOffOrder

A buyer's delivery request, either linked to a Blanket Order or standalone.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**List&lt;CallOffOrderAttribute&gt;**](CallOffOrderAttribute.md) | Custom attributes extending AbstractAttribute. Flows downstream to Sales Orders and Shipments in later phases. |  [optional] |
|**auditInfo** | [**CoreApiContractsAuditInfo**](CoreApiContractsAuditInfo.md) |  |  [optional] |
|**availableActions** | **List&lt;String&gt;** | Actions valid for the current status. Computed on read; not persisted. |  [optional] |
|**blanketOrderId** | **String** | Identifier of the parent Blanket Order if this call-off draws from one; null for standalone call-offs. |  [optional] |
|**cancelledBy** | **String** | User who cancelled the call-off order. |  [optional] |
|**cancelledDate** | **OffsetDateTime** | Cancellation timestamp. |  [optional] |
|**cancelledReason** | [**CommerceRuntimeCanceledReason**](CommerceRuntimeCanceledReason.md) |  |  [optional] |
|**changeMessages** | [**List&lt;CallOffOrderChangeMessage&gt;**](CallOffOrderChangeMessage.md) | Change messages describing mutations to this call-off order. Hydrated from a separate collection on read; not embedded on the document. |  [optional] |
|**channelCode** | **String** | Channel origin (e.g. \&quot;wholesale\&quot;, \&quot;ecommerce\&quot;, \&quot;EDI\&quot;). |  [optional] |
|**completedAt** | **OffsetDateTime** | Timestamp when all lines reached terminal status. |  [optional] |
|**creditHold** | [**CreditHoldStatus**](CreditHoldStatus.md) |  |  [optional] |
|**currencyCode** | **String** | Currency code (ISO 4217). Must match the parent Blanket Order currency when one is referenced. |  [optional] |
|**customerAccountId** | **Integer** | B2B Account identifier. Must reference an active B2B account. |  [optional] |
|**data** | **Object** | Vendor / extension custom data, free-form JSON. |  [optional] |
|**destinations** | [**List&lt;CommerceRuntimeDestination&gt;**](CommerceRuntimeDestination.md) | Shipping destinations. Items reference these by DestinationId (IDestinationContainer pattern). |  [optional] |
|**externalId** | **String** | Buyer&#39;s own reference number / idempotency key (e.g. release number from an ERP). Unique per tenant when supplied. |  [optional] |
|**id** | **String** | System-generated unique identifier (MozuObjectId). |  [optional] |
|**items** | [**List&lt;CallOffOrderItem&gt;**](CallOffOrderItem.md) | Requested product line items. |  [optional] |
|**notes** | [**List&lt;OrderNote&gt;**](OrderNote.md) | Structured notes attached to the call-off order. |  [optional] |
|**number** | **Integer** | Human-readable sequential number, auto-generated per tenant. |  [optional] |
|**payments** | [**List&lt;CallOffPayment&gt;**](CallOffPayment.md) | Optional payment(s) on this call-off order. Max 1 in v1 (PurchaseOrder only). At release, each sibling Sales Order carries the same PO number and billing info, with Amount &#x3D; that order&#39;s individual Total. |  [optional] |
|**priceListCode** | **String** | Resolved price list code locked at create. Null for External mode. Not body-settable — set by the service via price-list resolution. Immutable after create. |  [optional] |
|**pricingMode** | **String** | Pricing mode: &#x60;Kibo&#x60; (default — prices resolved from catalog/price list) or &#x60;External&#x60; (caller-supplied prices stored as-is). Immutable after create. See Mozu.CommerceRuntime.Contracts.PricingModeConst. |  [optional] |
|**reservationId** | **String** | Inventory reservation identifier. Set when inventory is reserved for this call-off order. |  [optional] |
|**siteId** | **Integer** | Site identifier. Populated from the API context on read. |  [optional] |
|**status** | **String** | Current call-off order status. One of: Hold, PartiallyReserved, PartiallyReleased, Completed, Cancelled. |  [optional] |
|**tenantId** | **Integer** | Tenant identifier. Populated from the API context on read. |  [optional] |
|**totalAmount** | **Double** | Denormalized header total — sum of non-cancelled line LineTotal values. System-maintained; not client-settable. |  [optional] |
|**version** | **String** | Optimistic locking version. Initialized to \&quot;1\&quot; and incremented as a string on each update. |  [optional] |


## Implemented Interfaces

* Serializable


