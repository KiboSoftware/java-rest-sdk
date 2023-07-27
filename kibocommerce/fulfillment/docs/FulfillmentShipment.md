

# FulfillmentShipment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptedDate** | **OffsetDateTime** |  |  [optional] |
|**alternateContact** | [**FulfillmentContact**](FulfillmentContact.md) |  |  [optional] |
|**appeasementReason** | [**FulfillmentAppeasementReason**](FulfillmentAppeasementReason.md) |  |  [optional] |
|**assignedLocationCode** | **String** |  |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**auditInfo** | [**AuditInfo0**](AuditInfo0.md) |  |  [optional] |
|**canceledItems** | [**List&lt;FulfillmentCanceledItem&gt;**](FulfillmentCanceledItem.md) |  |  [optional] |
|**cartId** | **String** |  |  [optional] |
|**changeMessages** | [**List&lt;FulfillmentChangeMessage&gt;**](FulfillmentChangeMessage.md) |  |  [optional] |
|**childShipmentNumbers** | **List&lt;Integer&gt;** |  |  [optional] |
|**currencyCode** | **String** |  |  [optional] |
|**customer** | [**FulfillmentCustomer**](FulfillmentCustomer.md) |  |  [optional] |
|**customerAccountId** | **Integer** |  |  [optional] |
|**customerAddressId** | **Integer** |  |  [optional] |
|**customerTaxId** | **String** |  |  [optional] |
|**data** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**destination** | [**FulfillmentDestination**](FulfillmentDestination.md) |  |  [optional] |
|**dutyAdjustment** | **BigDecimal** |  |  [optional] |
|**dutyTotal** | **BigDecimal** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**externalOrderId** | **String** |  |  [optional] |
|**fulfillmentDate** | **OffsetDateTime** |  |  [optional] |
|**fulfillmentLocationCode** | **String** |  |  [optional] |
|**fulfillmentStatus** | [**FulfillmentStatusEnum**](#FulfillmentStatusEnum) |  |  [optional] |
|**futureDate** | **OffsetDateTime** |  |  [optional] |
|**handlingAdjustment** | **BigDecimal** |  |  [optional] |
|**handlingSubtotal** | **BigDecimal** |  |  [optional] |
|**handlingTaxAdjustment** | **BigDecimal** |  |  [optional] |
|**handlingTaxTotal** | **BigDecimal** |  |  [optional] |
|**handlingTotal** | **BigDecimal** |  |  [optional] |
|**isAutoAssigned** | **Boolean** |  |  [optional] |
|**isExpress** | **Boolean** |  |  [optional] |
|**isHistoricalImport** | **Boolean** |  |  [optional] |
|**isOptInForSms** | **Boolean** |  |  [optional] |
|**items** | [**List&lt;FulfillmentItem&gt;**](FulfillmentItem.md) |  |  [optional] |
|**lineItemSubtotal** | **BigDecimal** |  |  [optional] |
|**lineItemTaxAdjustment** | **BigDecimal** |  |  [optional] |
|**lineItemTaxTotal** | **BigDecimal** |  |  [optional] |
|**lineItemTotal** | **BigDecimal** |  |  [optional] |
|**orderId** | **String** |  |  |
|**orderNumber** | **Integer** |  |  |
|**orderSubmitDate** | **OffsetDateTime** |  |  [optional] |
|**originalShipmentNumber** | **Integer** |  |  [optional] |
|**packages** | [**List&lt;FulfillmentPackage&gt;**](FulfillmentPackage.md) |  |  [optional] |
|**parentCheckoutNumber** | **Integer** |  |  [optional] |
|**parentShipmentNumber** | **Integer** |  |  [optional] |
|**pickStatus** | [**PickStatusEnum**](#PickStatusEnum) |  |  [optional] |
|**pickType** | [**PickTypeEnum**](#PickTypeEnum) |  |  [optional] |
|**pickWaveNumber** | **Integer** |  |  [optional] |
|**pickupInfo** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**readyForPickup** | **Boolean** |  |  [optional] |
|**readyForPickupDate** | **OffsetDateTime** |  |  [optional] |
|**readyToCapture** | **Boolean** |  |  [optional] |
|**reassignedItems** | [**List&lt;ReassignedItem&gt;**](ReassignedItem.md) |  |  [optional] |
|**receivedDate** | **OffsetDateTime** |  |  [optional] |
|**rejectedItems** | [**List&lt;RejectedItem&gt;**](RejectedItem.md) |  |  [optional] |
|**sentCustomerAtStoreNotification** | **Boolean** |  |  [optional] |
|**sentCustomerInTransitNotification** | **Boolean** |  |  [optional] |
|**shipmentAdjustment** | **BigDecimal** |  |  [optional] |
|**shipmentNotes** | [**List&lt;FulfillmentShipmentNote&gt;**](FulfillmentShipmentNote.md) |  |  [optional] |
|**shipmentNumber** | **Integer** |  |  [optional] |
|**shipmentStatus** | [**ShipmentStatusEnum**](#ShipmentStatusEnum) |  |  [optional] |
|**shipmentStatusReason** | [**FulfillmentShipmentStatusReason**](FulfillmentShipmentStatusReason.md) |  |  [optional] |
|**shipmentType** | **String** |  |  |
|**shippingAdjustment** | **BigDecimal** |  |  [optional] |
|**shippingMethodCode** | **String** |  |  [optional] |
|**shippingMethodName** | **String** |  |  [optional] |
|**shippingSubtotal** | **BigDecimal** |  |  [optional] |
|**shippingTaxAdjustment** | **BigDecimal** |  |  [optional] |
|**shippingTaxTotal** | **BigDecimal** |  |  [optional] |
|**shippingTotal** | **BigDecimal** |  |  [optional] |
|**shopperNotes** | [**FulfillmentFulfillmentShopperNotes**](FulfillmentFulfillmentShopperNotes.md) |  |  [optional] |
|**siteId** | **Integer** |  |  [optional] |
|**taxData** | **Object** |  |  [optional] |
|**tenantId** | **Integer** |  |  [optional] |
|**total** | **BigDecimal** |  |  |
|**transferShipmentNumbers** | **List&lt;Integer&gt;** |  |  [optional] |
|**transferredItems** | [**List&lt;TransferredItem&gt;**](TransferredItem.md) |  |  [optional] |
|**transitTime** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**workflowProcessContainerId** | **String** |  |  [optional] |
|**workflowProcessId** | **String** |  |  [optional] |
|**workflowState** | [**FulfillmentWorkflowState**](FulfillmentWorkflowState.md) |  |  [optional] |



## Enum: FulfillmentStatusEnum

| Name | Value |
|---- | -----|
| FULFILLED | &quot;Fulfilled&quot; |
| NOTFULFILLED | &quot;NotFulfilled&quot; |



## Enum: PickStatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| IN_WAVE | &quot;IN_WAVE&quot; |
| PICKED | &quot;PICKED&quot; |
| TRANSFER | &quot;TRANSFER&quot; |



## Enum: PickTypeEnum

| Name | Value |
|---- | -----|
| MULTIPLE | &quot;MULTIPLE&quot; |
| NORMAL | &quot;NORMAL&quot; |
| SINGLE | &quot;SINGLE&quot; |



## Enum: ShipmentStatusEnum

| Name | Value |
|---- | -----|
| BACKORDER | &quot;BACKORDER&quot; |
| CANCELED | &quot;CANCELED&quot; |
| CUSTOMER_CARE | &quot;CUSTOMER_CARE&quot; |
| DELETED | &quot;DELETED&quot; |
| FULFILLED | &quot;FULFILLED&quot; |
| FUTURE | &quot;FUTURE&quot; |
| READY | &quot;READY&quot; |
| REASSIGNED | &quot;REASSIGNED&quot; |


## Implemented Interfaces

* Serializable


