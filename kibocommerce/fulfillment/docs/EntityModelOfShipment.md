

# EntityModelOfShipment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**Links**](Links.md) |  |  [optional] |
|**acceptedDate** | **OffsetDateTime** |  |  [optional] |
|**alternateContact** | [**FulfillmentAPIContact**](FulfillmentAPIContact.md) |  |  [optional] |
|**appeasementReason** | [**FulfillmentAPIAppeasementReason**](FulfillmentAPIAppeasementReason.md) |  |  [optional] |
|**assignedLocationCode** | **String** |  |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**auditInfo** | [**FulfillmentAPIAuditInfo**](FulfillmentAPIAuditInfo.md) |  |  [optional] |
|**canceledItems** | [**List&lt;CanceledItem&gt;**](CanceledItem.md) |  |  [optional] |
|**carrier** | **String** |  |  [optional] |
|**cartId** | **String** |  |  [optional] |
|**changeMessages** | [**List&lt;FulfillmentAPIChangeMessage&gt;**](FulfillmentAPIChangeMessage.md) |  |  [optional] |
|**channel** | **String** |  |  [optional] |
|**childShipmentNumbers** | **List&lt;Integer&gt;** |  |  [optional] |
|**currencyCode** | **String** |  |  [optional] |
|**currentRunId** | **String** | Run currently mutating this shipment (&#x3D;&#x3D; Kibo.Jobs jobId); null when idle (FR-059d) |  [optional] |
|**customer** | [**FulfillmentAPICustomer**](FulfillmentAPICustomer.md) |  |  [optional] |
|**customerAccountId** | **Integer** |  |  [optional] |
|**customerAddressId** | **Integer** |  |  [optional] |
|**customerTaxId** | **String** |  |  [optional] |
|**data** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**deliveryWindow** | [**FulfillmentAPIDeliveryWindow**](FulfillmentAPIDeliveryWindow.md) |  |  [optional] |
|**destination** | [**FulfillmentAPIDestination**](FulfillmentAPIDestination.md) |  |  [optional] |
|**dutyAdjustment** | **BigDecimal** |  |  [optional] |
|**dutyTotal** | **BigDecimal** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**expectedDeliveryDate** | **OffsetDateTime** |  |  [optional] |
|**externalOrderId** | **String** |  |  [optional] |
|**fulfillmentDate** | **OffsetDateTime** |  |  [optional] |
|**fulfillmentLocationCode** | **String** |  |  [optional] |
|**fulfillmentPriority** | **Integer** |  |  [optional] |
|**fulfillmentStatus** | [**FulfillmentStatusEnum**](#FulfillmentStatusEnum) |  |  [optional] |
|**futureDate** | **OffsetDateTime** |  |  [optional] |
|**groupId** | **String** |  |  [optional] |
|**handlingAdjustment** | **BigDecimal** |  |  [optional] |
|**handlingSubtotal** | **BigDecimal** |  |  [optional] |
|**handlingTaxAdjustment** | **BigDecimal** |  |  [optional] |
|**handlingTaxTotal** | **BigDecimal** |  |  [optional] |
|**handlingTotal** | **BigDecimal** |  |  [optional] |
|**holdReleaseDate** | **OffsetDateTime** |  |  [optional] |
|**isAutoAssigned** | **Boolean** |  |  [optional] |
|**isCrossDockEligible** | **Boolean** |  |  [optional] |
|**isDropship** | **Boolean** |  |  [optional] |
|**isExpress** | **Boolean** |  |  [optional] |
|**isFlatRateShipping** | **Boolean** |  |  [optional] |
|**isHistoricalImport** | **Boolean** |  |  [optional] |
|**isImmutable** | **Boolean** |  |  [optional] |
|**isOptInForSms** | **Boolean** |  |  [optional] |
|**items** | [**List&lt;FilterOptionDtoResultItem&gt;**](FilterOptionDtoResultItem.md) |  |  [optional] |
|**lastCancellationDate** | **OffsetDateTime** |  |  [optional] |
|**lineItemSubtotal** | **BigDecimal** |  |  [optional] |
|**lineItemTaxAdjustment** | **BigDecimal** |  |  [optional] |
|**lineItemTaxTotal** | **BigDecimal** |  |  [optional] |
|**lineItemTotal** | **BigDecimal** |  |  [optional] |
|**lowestComplianceLevel** | **String** |  |  [optional] |
|**masterTrackingNumber** | **String** |  |  [optional] |
|**minutesSinceOnWorkflowStep** | **Long** |  |  [optional] |
|**minutesSinceOrdered** | **Long** |  |  [optional] |
|**mutabilityInfo** | [**MutabilityInfo**](MutabilityInfo.md) |  |  [optional] |
|**orderId** | **String** |  |  [optional] |
|**orderNumber** | **Integer** |  |  [optional] |
|**orderSubmitDate** | **OffsetDateTime** |  |  [optional] |
|**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) |  |  [optional] |
|**originalEdd** | **OffsetDateTime** | First expectedDeliveryDate this shipment ever carried (write-once, never cleared); non-null marks that the shipment has, at some point, had an EDD. Server-managed (FR-060); ignored on inbound writes. |  [optional] |
|**originalShipmentNumber** | **Integer** |  |  [optional] |
|**packageReceivingEligible** | **Boolean** | FR-014/FR-016 multi-package-receiving eligibility signal. Only present when the MULTI_PACKAGE_RECEIVING_FOR_TRANSFER_SHIPMENTS tenant attribute is enabled and the transfer shipment has at least one package; null otherwise so tenants without the attribute enabled see no shape change (US2-AC2). |  [optional] |
|**packages** | [**List&lt;FulfillmentAPIPackage&gt;**](FulfillmentAPIPackage.md) |  |  [optional] |
|**packagesPendingCount** | **Integer** | US4 progress display: packagesTotalCount minus packagesReceivedCount. Null when not eligible/flag disabled. |  [optional] |
|**packagesReceivedCount** | **Integer** | US4 progress display: count of packages with receiptStatus&#x3D;RECEIVED. Null when not eligible/flag disabled. |  [optional] |
|**packagesTotalCount** | **Integer** | US4 progress display: total expected package count. Null when not eligible/flag disabled. |  [optional] |
|**parentCheckoutNumber** | **Integer** |  |  [optional] |
|**parentShipmentNumber** | **Integer** |  |  [optional] |
|**paymentInvoice** | [**PaymentInvoice**](PaymentInvoice.md) |  |  [optional] |
|**pickStatus** | [**PickStatusEnum**](#PickStatusEnum) |  |  [optional] |
|**pickType** | [**PickTypeEnum**](#PickTypeEnum) |  |  [optional] |
|**pickWaveNumber** | **Integer** |  |  [optional] |
|**pickupInfo** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**priorityInfo** | [**PriorityInfo**](PriorityInfo.md) |  |  [optional] |
|**readyForPickup** | **Boolean** |  |  [optional] |
|**readyForPickupDate** | **OffsetDateTime** |  |  [optional] |
|**readyToCapture** | **Boolean** |  |  [optional] |
|**reassignedItems** | [**List&lt;ReassignedItem&gt;**](ReassignedItem.md) |  |  [optional] |
|**receivedDate** | **OffsetDateTime** |  |  [optional] |
|**rejectedItems** | [**List&lt;RejectedItem&gt;**](RejectedItem.md) |  |  [optional] |
|**runInfo** | [**List&lt;RunInfo&gt;**](RunInfo.md) | Capped per-run history of operations that created/mutated this shipment (FR-059d) |  [optional] |
|**sentCustomerAtStoreNotification** | **Boolean** |  |  [optional] |
|**sentCustomerInTransitNotification** | **Boolean** |  |  [optional] |
|**shipDate** | **OffsetDateTime** |  |  [optional] |
|**shipmentAdjustment** | **BigDecimal** |  |  [optional] |
|**shipmentAttributes** | [**List&lt;FulfillmentAPIShipmentAttribute&gt;**](FulfillmentAPIShipmentAttribute.md) |  |  [optional] |
|**shipmentConsolidationId** | **String** |  |  [optional] |
|**shipmentGroup** | **String** |  |  [optional] |
|**shipmentNotes** | [**List&lt;FulfillmentAPIShipmentNote&gt;**](FulfillmentAPIShipmentNote.md) |  |  [optional] |
|**shipmentNumber** | **Integer** |  |  [optional] |
|**shipmentStatus** | [**ShipmentStatusEnum**](#ShipmentStatusEnum) |  |  [optional] |
|**shipmentStatusReason** | [**FulfillmentAPIShipmentStatusReason**](FulfillmentAPIShipmentStatusReason.md) |  |  [optional] |
|**shipmentType** | [**ShipmentTypeEnum**](#ShipmentTypeEnum) | Shipment type code |  |
|**shippingAdjustment** | **BigDecimal** |  |  [optional] |
|**shippingMethodCode** | **String** |  |  [optional] |
|**shippingMethodName** | **String** |  |  [optional] |
|**shippingSubtotal** | **BigDecimal** |  |  [optional] |
|**shippingTaxAdjustment** | **BigDecimal** |  |  [optional] |
|**shippingTaxTotal** | **BigDecimal** |  |  [optional] |
|**shippingTotal** | **BigDecimal** |  |  [optional] |
|**shopperNotes** | [**FulfillmentAPIShopperNotes**](FulfillmentAPIShopperNotes.md) |  |  [optional] |
|**siteId** | **Integer** |  |  [optional] |
|**slas** | [**List&lt;Sla&gt;**](Sla.md) |  |  [optional] |
|**substitutedItems** | [**List&lt;FulfillmentAPISubstitutedItem&gt;**](FulfillmentAPISubstitutedItem.md) |  |  [optional] |
|**taxData** | **Object** |  |  [optional] |
|**tenantId** | **Integer** |  |  [optional] |
|**total** | **BigDecimal** |  |  [optional] |
|**transferShipmentNumbers** | **List&lt;Integer&gt;** |  |  [optional] |
|**transferredItems** | [**List&lt;TransferredItem&gt;**](TransferredItem.md) |  |  [optional] |
|**transitTime** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**workflowProcessContainerId** | **String** |  |  [optional] |
|**workflowProcessId** | **String** |  |  [optional] |
|**workflowProcessVersion** | **String** |  |  [optional] |
|**workflowState** | [**FulfillmentAPIWorkflowState**](FulfillmentAPIWorkflowState.md) |  |  [optional] |



## Enum: FulfillmentStatusEnum

| Name | Value |
|---- | -----|
| NOTFULFILLED | &quot;NotFulfilled&quot; |
| FULFILLED | &quot;Fulfilled&quot; |



## Enum: OrderTypeEnum

| Name | Value |
|---- | -----|
| OFFLINE | &quot;Offline&quot; |
| ONLINE | &quot;Online&quot; |



## Enum: PickStatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| IN_WAVE | &quot;IN_WAVE&quot; |
| PICKED | &quot;PICKED&quot; |
| TRANSFER | &quot;TRANSFER&quot; |
| COMPLETE | &quot;COMPLETE&quot; |



## Enum: PickTypeEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;NORMAL&quot; |
| SINGLE | &quot;SINGLE&quot; |
| MULTIPLE | &quot;MULTIPLE&quot; |



## Enum: ShipmentStatusEnum

| Name | Value |
|---- | -----|
| READY | &quot;READY&quot; |
| REASSIGNED | &quot;REASSIGNED&quot; |
| BACKORDER | &quot;BACKORDER&quot; |
| CANCELED | &quot;CANCELED&quot; |
| FULFILLED | &quot;FULFILLED&quot; |
| CUSTOMER_CARE | &quot;CUSTOMER_CARE&quot; |
| DELETED | &quot;DELETED&quot; |
| FUTURE | &quot;FUTURE&quot; |



## Enum: ShipmentTypeEnum

| Name | Value |
|---- | -----|
| STH | &quot;STH&quot; |
| BOPIS | &quot;BOPIS&quot; |
| BOPIS_CURBSIDE | &quot;BOPIS_Curbside&quot; |
| TRANSFER | &quot;Transfer&quot; |
| CURBSIDE | &quot;Curbside&quot; |
| DIGITAL | &quot;Digital&quot; |
| DELIVERY | &quot;Delivery&quot; |


## Implemented Interfaces

* Serializable


