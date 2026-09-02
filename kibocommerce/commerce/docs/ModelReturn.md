

# ModelReturn



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionRequired** | **Boolean** | To find Returns that have failed to refund. |  [optional] |
|**attributes** | [**List&lt;ReturnAttribute&gt;**](ReturnAttribute.md) | Collection of custom attributes associated with the return. |  [optional] |
|**auditInfo** | [**CoreApiContractsAuditInfo**](CoreApiContractsAuditInfo.md) |  |  [optional] |
|**availableActions** | **List&lt;String&gt;** | Current available actions. |  [optional] |
|**canInitiateRefund** | **Boolean** | To identify Return is refundable or not. |  [optional] |
|**changeMessages** | [**List&lt;CommerceRuntimeChangeMessage&gt;**](CommerceRuntimeChangeMessage.md) | Change messages related to the return. |  [optional] |
|**channelCode** | **String** | Unique identifier of the channel for this item. |  [optional] |
|**contact** | [**Contact**](Contact.md) |  |  [optional] |
|**currencyCode** | **String** | ISO Currency Code. Currently, only USD is supported. |  [optional] |
|**customerAccountId** | **Integer** | Unique identifier of the customer account. |  [optional] |
|**customerInteractionType** | **String** | Determines the interaction type that a customer will use to create this object. Valid values are: Website, Store, Call, Unknown |  [optional] |
|**data** | **Object** | Custom data for a given vendor set within the commerce process. |  [optional] |
|**externalId** | **String** | A return can be created from an external system. This field is used to store the external id. |  [optional] |
|**id** | **String** | Unique Identifier for this Return |  [optional] |
|**isUnified** | **Boolean** | Was this return created by the Unified platform. |  [optional] |
|**items** | [**List&lt;ReturnItem&gt;**](ReturnItem.md) | The list of items being returned by the Shopper and replaced by the Merchant in this Return. |  [optional] |
|**locationCode** | **String** | Location code where the return was made/processed |  [optional] |
|**lossTotal** | **Double** | Sum of the ProductLossTotal and the ShippingLossTotal. |  [optional] |
|**notes** | [**List&lt;OrderNote&gt;**](OrderNote.md) | Any Merchant Notes for this Return. |  [optional] |
|**originalOrderId** | **String** | The Id of the Order that this Return was generated from. |  [optional] |
|**originalOrderNumber** | **Integer** | The order number that this return was generated from. |  [optional] |
|**overrideReturnRule** | **Boolean** | When this is set to true, the  return rules will be ignored, and a return will be created without any checks. |  [optional] |
|**packages** | [**List&lt;CommerceRuntimePackage&gt;**](CommerceRuntimePackage.md) | Shipping package associated with this return. |  [optional] |
|**payments** | [**List&lt;Payment&gt;**](Payment.md) | Any Refund payments associated with this Return. |  [optional] |
|**pickupDate** | **OffsetDateTime** | Pickupdate is the date when the return was picked up by the carrier. This is optional. |  [optional] |
|**productLossTaxTotal** | **Double** | The Total Taxes assessed on the product loss. |  [optional] |
|**productLossTotal** | **Double** | The Total Loss Amount is equal to the (cost of item) * quantity of item returned. It is meant to represent the product value to the merchant of the items damaged or returned by a shopper. |  [optional] |
|**receiveStatus** | **String** | A rollup status describing whether the return items have been received. See Mozu.CommerceRuntime.Contracts.Returns.Return.ReceiveStatusConst for possible values. |  [optional] |
|**refundAmount** | **Double** | If this Return was refunded,  how much was credited to the shopper? This amount is summed from the refund payments. |  [optional] |
|**refundStatus** | **String** | A rollup status describing whether the return items have been refunded. See Mozu.CommerceRuntime.Contracts.Returns.Return.RefundStatusConst for possible values. |  [optional] |
|**refundToGC** | **Boolean** | If this Flag is true, Refund will be done on new Gift Card. |  [optional] |
|**replaceStatus** | **String** | A rollup status describing whether the return items have been marked as replaced. See Mozu.CommerceRuntime.Contracts.Returns.Return.ReplaceStatusConst for possible values. |  [optional] |
|**returnNumber** | **Integer** | A human-facing identifier that is unique within a tenant to represent the sequential ordering of Returns. |  [optional] |
|**returnOrderId** | **String** | The Id of the Order that represents the items shipped to the shopper for this Return. |  [optional] |
|**returnType** | **String** | Specifies whether this Return was a Refund or a Replace |  [optional] |
|**rmaDeadline** | **OffsetDateTime** | The deadline for a Shopper to ship the items in this Return to the Merchant. |  [optional] |
|**shipOrBillCountryCode** | **String** | ShipOrBillCountryCode contains country code of shipping address or Billing address |  [optional] |
|**shipOrBillState** | **String** | ShipOrBillState contains state/province of shipping address or Billing address |  [optional] |
|**shippingLossTaxTotal** | **Double** | The Total Taxes assessed on the shipping loss. |  [optional] |
|**shippingLossTotal** | **Double** | The Shipping Loss Total is equal to the (shipping cost of item) * quantity of item returned. It is meant to represent the product value to the merchant of the items damaged or returned by a shopper. |  [optional] |
|**siteId** | **Integer** | Unique identifier of the Site. |  [optional] |
|**status** | **String** | The Status of the Return.  Valid values are      Null, Created, ReturnAuthorized, ReturnPending, ReturnReceived, ReplacementShipped, Cancelled, and Closed. |  [optional] |
|**taxData** | **Object** | Storage for any additional/custom tax data. |  [optional] |
|**tenantId** | **Integer** | Unique identifier of the Tenant. |  [optional] |
|**userId** | **String** | Unique identifier of the current user. |  [optional] |
|**visitId** | **String** | Identifies the Visit ID that was current when the order was placed or when the cart was last updated. |  [optional] |
|**webSessionId** | **String** | Identifies the web session used to place the order or last update the cart. |  [optional] |


## Implemented Interfaces

* Serializable


