

# BlanketOrder

Represents a contractual commitment between the seller and a B2B Account to supply goods at predetermined prices and quantities over a specified period.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**List&lt;BlanketOrderAttribute&gt;**](BlanketOrderAttribute.md) | Custom attributes at the header level. |  [optional] |
|**auditInfo** | [**CoreApiContractsAuditInfo**](CoreApiContractsAuditInfo.md) |  |  [optional] |
|**availableActions** | **List&lt;String&gt;** | Available lifecycle actions from the current status. Populated on read. |  [optional] |
|**buyerContact** | [**AlternateContact**](AlternateContact.md) |  |  [optional] |
|**canceledReason** | [**CommerceRuntimeCanceledReason**](CommerceRuntimeCanceledReason.md) |  |  [optional] |
|**cancelledDate** | **OffsetDateTime** | Date when the order was cancelled. System-supplied, read-only. |  [optional] |
|**changeMessages** | [**List&lt;CommerceRuntimeChangeMessage&gt;**](CommerceRuntimeChangeMessage.md) | Change messages associated with this Blanket Order. Hydrated from a separate collection. |  [optional] |
|**channelCode** | **String** | Channel code for multi-channel context. |  [optional] |
|**currencyCode** | **String** | Currency code (default \&quot;USD\&quot;). |  [optional] |
|**customerAccountId** | **Integer** |  |  [optional] |
|**data** | **Object** | Extensibility data bag for tenant-specific custom data. |  [optional] |
|**externalId** | **String** | External reference identifier for integration with external systems. |  [optional] |
|**id** | **String** |  |  [optional] |
|**items** | [**List&lt;BlanketOrderItem&gt;**](BlanketOrderItem.md) | Product commitment Items for this Blanket Order. |  [optional] |
|**notes** | [**List&lt;OrderNote&gt;**](OrderNote.md) | Internal notes for merchant use. |  [optional] |
|**number** | **Integer** | Auto-generated sequential Blanket Order number. System-supplied, read-only. |  [optional] |
|**priceListCode** | **String** | Price list code for pricing context. Resolved and locked at create. Immutable. |  [optional] |
|**pricingMode** | **String** | Pricing mode: &#x60;Kibo&#x60; (default — prices resolved from catalog/price list) or &#x60;External&#x60; (caller-supplied prices stored as-is). Immutable after create. See Mozu.CommerceRuntime.Contracts.PricingModeConst. |  [optional] |
|**reservationMode** | **String** | Reservation mode for this blanket order. Values: &#x60;NetworkLevel&#x60; | &#x60;CallOffLevel&#x60; (default). When &#x60;NetworkLevel&#x60;, the blanket&#39;s uncalled balance is tracked in a ledger used for network-wide ATS/ATP netting. Immutable after creation. |  [optional] |
|**sellerContact** | [**AlternateContact**](AlternateContact.md) |  |  [optional] |
|**siteId** | **Integer** |  |  [optional] |
|**status** | **String** | Current status managed by the StatusEngine transition table. |  [optional] |
|**tenantId** | **Integer** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**validityPeriod** | [**ValidityPeriod**](ValidityPeriod.md) |  |  [optional] |
|**version** | **String** | Optimistic concurrency token. System-supplied. |  [optional] |


## Implemented Interfaces

* Serializable


