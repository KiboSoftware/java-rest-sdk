

# Shipment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alternateContact** | [**FulfillmentAlternateContact**](FulfillmentAlternateContact.md) |  |  [optional] |
|**attributes** | [**List&lt;ShipmentAttribute&gt;**](ShipmentAttribute.md) |  |  [optional] |
|**auditInfo** | [**CoreApiContractsAuditInfo**](CoreApiContractsAuditInfo.md) |  |  [optional] |
|**backorderCreatedDate** | **Integer** |  |  [optional] |
|**canceledItems** | [**List&lt;FulfillmentCanceledItem&gt;**](FulfillmentCanceledItem.md) |  |  [optional] |
|**changeMessages** | [**List&lt;CommerceRuntimeChangeMessage&gt;**](CommerceRuntimeChangeMessage.md) |  |  [optional] |
|**cost** | **Double** |  |  [optional] |
|**currencyCode** | **String** |  |  [optional] |
|**customer** | [**CommerceRuntimeCustomer**](CommerceRuntimeCustomer.md) |  |  [optional] |
|**customerAccountId** | **Integer** |  |  [optional] |
|**customerTaxId** | **String** |  |  [optional] [readonly] |
|**data** | **Object** |  |  [optional] |
|**destination** | [**CommerceRuntimeDestination**](CommerceRuntimeDestination.md) |  |  [optional] |
|**dutyAdjustment** | **Double** |  |  [optional] |
|**dutyTotal** | **Double** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**expectedDeliveryDate** | **OffsetDateTime** |  |  [optional] |
|**externalOrderId** | **String** |  |  [optional] |
|**externalShipmentId** | **String** |  |  [optional] |
|**fulfillmentDate** | **OffsetDateTime** |  |  [optional] |
|**fulfillmentLocationCode** | **String** |  |  [optional] |
|**fulfillmentStatus** | **String** |  |  [optional] |
|**futureDate** | **OffsetDateTime** |  |  [optional] |
|**groupId** | **String** | Identifier of the order-level shipping group (&#x60;ShippingGrouping.Id&#x60;) whose items are fulfilled by this shipment.  Distinct from the internal routing group key stored on the domain entity. |  [optional] |
|**handlingAdjustment** | **Double** |  |  [optional] |
|**handlingSubtotal** | **Double** |  |  [optional] |
|**handlingTaxAdjustment** | **Double** |  |  [optional] |
|**handlingTaxTotal** | **Double** |  |  [optional] |
|**handlingTotal** | **Double** |  |  [optional] |
|**holdReleaseDate** | **OffsetDateTime** |  |  [optional] |
|**id** | **String** | ID of the shipment |  [optional] |
|**isExpress** | **Boolean** |  |  [optional] |
|**isFlatRateShipping** | **Boolean** |  |  [optional] |
|**isTransfer** | **Boolean** |  |  [optional] |
|**items** | [**List&lt;ShipmentItem&gt;**](ShipmentItem.md) |  |  [optional] |
|**lineItemSubtotal** | **Double** |  |  [optional] |
|**lineItemTaxAdjustment** | **Double** |  |  [optional] |
|**lineItemTaxTotal** | **Double** |  |  [optional] |
|**lineItemTotal** | **Double** |  |  [optional] |
|**number** | **Integer** |  |  [optional] |
|**orderId** | **String** |  |  [optional] |
|**orderNumber** | **Integer** |  |  [optional] |
|**orderSubmitDate** | **OffsetDateTime** |  |  [optional] |
|**origin** | [**Contact**](Contact.md) |  |  [optional] |
|**originalShipmentNumber** | **Integer** |  |  [optional] |
|**packages** | [**List&lt;CommerceRuntimePackage&gt;**](CommerceRuntimePackage.md) |  |  [optional] |
|**parentCheckoutNumber** | **Integer** |  |  [optional] |
|**parentShipmentNumber** | **Integer** |  |  [optional] |
|**pickStatus** | **String** |  |  [optional] |
|**pickType** | **String** |  |  [optional] |
|**pickupInfo** | **Object** |  |  [optional] |
|**readyToCapture** | **Boolean** |  |  [optional] |
|**requestedShipDate** | **OffsetDateTime** | Requested ship date, carried from the originating OrderItem (Call-Off release, spec COM-10941 follow-up). Null for shipments not tied to a Call-Off Order line. |  [optional] |
|**shipmentAdjustment** | **Double** |  |  [optional] |
|**shipmentNotes** | [**List&lt;CommerceRuntimeShipmentNote&gt;**](CommerceRuntimeShipmentNote.md) |  |  [optional] |
|**shipmentStatus** | **String** |  |  [optional] |
|**shipmentStatusReason** | [**CommerceRuntimeShipmentStatusReason**](CommerceRuntimeShipmentStatusReason.md) |  |  [optional] |
|**shipmentType** | **String** |  |  [optional] |
|**shippingAdjustment** | **Double** |  |  [optional] |
|**shippingMethodCode** | **String** |  |  [optional] |
|**shippingMethodName** | **String** |  |  [optional] |
|**shippingSubtotal** | **Double** |  |  [optional] |
|**shippingTaxAdjustment** | **Double** |  |  [optional] |
|**shippingTaxTotal** | **Double** |  |  [optional] |
|**shippingTotal** | **Double** |  |  [optional] |
|**shopperNotes** | [**FulfillmentShopperNotes**](FulfillmentShopperNotes.md) |  |  [optional] |
|**substitutedItems** | [**List&lt;CommerceRuntimeSubstitutedItem&gt;**](CommerceRuntimeSubstitutedItem.md) |  |  [optional] |
|**taxData** | **Object** |  |  [optional] |
|**total** | **Double** |  |  [optional] |
|**transferShipmentNumbers** | **List&lt;Integer&gt;** |  |  [optional] |
|**workflowProcessContainerId** | **String** |  |  [optional] |
|**workflowProcessId** | **String** |  |  [optional] |
|**workflowState** | [**CommerceRuntimeWorkflowState**](CommerceRuntimeWorkflowState.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


