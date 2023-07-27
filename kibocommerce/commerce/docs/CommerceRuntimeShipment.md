

# CommerceRuntimeShipment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the shipment |  [optional] |
|**externalShipmentId** | **String** |  |  [optional] |
|**number** | **Integer** |  |  [optional] |
|**orderId** | **String** |  |  [optional] |
|**orderNumber** | **Integer** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**currencyCode** | **String** |  |  [optional] |
|**customerAccountId** | **Integer** |  |  [optional] |
|**customerTaxId** | **String** |  |  [optional] [readonly] |
|**shipmentType** | **String** |  |  [optional] |
|**shippingMethodCode** | **String** |  |  [optional] |
|**shippingMethodName** | **String** |  |  [optional] |
|**fulfillmentLocationCode** | **String** |  |  [optional] |
|**origin** | [**CommerceRuntimeContact**](CommerceRuntimeContact.md) |  |  [optional] |
|**destination** | [**CommerceRuntimeDestination**](CommerceRuntimeDestination.md) |  |  [optional] |
|**shipmentStatus** | **String** |  |  [optional] |
|**shipmentStatusReason** | [**CommerceRuntimeShipmentStatusReason**](CommerceRuntimeShipmentStatusReason.md) |  |  [optional] |
|**transferShipmentNumbers** | **List&lt;Integer&gt;** |  |  [optional] |
|**isTransfer** | **Boolean** |  |  [optional] |
|**originalShipmentNumber** | **Integer** |  |  [optional] |
|**parentCheckoutNumber** | **Integer** |  |  [optional] |
|**parentShipmentNumber** | **Integer** |  |  [optional] |
|**fulfillmentStatus** | **String** |  |  [optional] |
|**workflowProcessId** | **String** |  |  [optional] |
|**workflowProcessContainerId** | **String** |  |  [optional] |
|**workflowState** | [**CommerceRuntimeWorkflowState**](CommerceRuntimeWorkflowState.md) |  |  [optional] |
|**backorderCreatedDate** | **Integer** |  |  [optional] |
|**fulfillmentDate** | **OffsetDateTime** |  |  [optional] |
|**futureDate** | **OffsetDateTime** |  |  [optional] |
|**orderSubmitDate** | **OffsetDateTime** |  |  [optional] |
|**pickStatus** | **String** |  |  [optional] |
|**pickType** | **String** |  |  [optional] |
|**changeMessages** | [**List&lt;CommerceRuntimeChangeMessage&gt;**](CommerceRuntimeChangeMessage.md) |  |  [optional] |
|**packages** | [**List&lt;CommerceRuntimePackage&gt;**](CommerceRuntimePackage.md) |  |  [optional] |
|**items** | [**List&lt;ShipmentItem&gt;**](ShipmentItem.md) |  |  [optional] |
|**canceledItems** | [**List&lt;CommerceRuntimeCanceledItem&gt;**](CommerceRuntimeCanceledItem.md) |  |  [optional] |
|**data** | **Object** |  |  [optional] |
|**taxData** | **Object** |  |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**shipmentAdjustment** | **Double** |  |  [optional] |
|**lineItemSubtotal** | **Double** |  |  [optional] |
|**lineItemTaxAdjustment** | **Double** |  |  [optional] |
|**lineItemTaxTotal** | **Double** |  |  [optional] |
|**lineItemTotal** | **Double** |  |  [optional] |
|**shippingAdjustment** | **Double** |  |  [optional] |
|**shippingSubtotal** | **Double** |  |  [optional] |
|**shippingTaxAdjustment** | **Double** |  |  [optional] |
|**shippingTaxTotal** | **Double** |  |  [optional] |
|**shippingTotal** | **Double** |  |  [optional] |
|**handlingAdjustment** | **Double** |  |  [optional] |
|**handlingSubtotal** | **Double** |  |  [optional] |
|**handlingTaxAdjustment** | **Double** |  |  [optional] |
|**handlingTaxTotal** | **Double** |  |  [optional] |
|**handlingTotal** | **Double** |  |  [optional] |
|**dutyAdjustment** | **Double** |  |  [optional] |
|**dutyTotal** | **Double** |  |  [optional] |
|**total** | **Double** |  |  [optional] |
|**cost** | **Double** |  |  [optional] |
|**externalOrderId** | **String** |  |  [optional] |
|**isExpress** | **Boolean** |  |  [optional] |
|**readyToCapture** | **Boolean** |  |  [optional] |
|**pickupInfo** | **Object** |  |  [optional] |
|**shopperNotes** | [**CommerceRuntimeFulfillmentShopperNotes**](CommerceRuntimeFulfillmentShopperNotes.md) |  |  [optional] |
|**customer** | [**CommerceRuntimeCustomer**](CommerceRuntimeCustomer.md) |  |  [optional] |
|**shipmentNotes** | [**List&lt;CommerceRuntimeShipmentNote&gt;**](CommerceRuntimeShipmentNote.md) |  |  [optional] |
|**alternateContact** | [**FulfillmentAlternateContact**](FulfillmentAlternateContact.md) |  |  [optional] |
|**substitutedItems** | [**List&lt;SubstitutedItem&gt;**](SubstitutedItem.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


