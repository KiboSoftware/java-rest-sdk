

# OrderItemAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**List&lt;OrderLineAttribute&gt;**](OrderLineAttribute.md) | Extensible attributes for this order line. |  [optional] |
|**callOffOrderItemId** | **String** | Identifier of the originating Call-Off Order line item, if this item was released from a Call-Off Order line. Null for standard order items. |  [optional] |
|**deliveryWindow** | [**DeliveryWindow**](DeliveryWindow.md) |  |  [optional] |
|**destinationId** | **String** | The destination associated with this item when used with a multi-ship checkout. |  [optional] |
|**dutyAmount** | **Double** | Duty or Tariff for this item |  [optional] |
|**expectedDeliveryDate** | **OffsetDateTime** | Expected Delivery Date of shipment |  [optional] |
|**fulfillmentLocationCode** | **String** | Location code from which to obtain this item |  [optional] |
|**fulfillmentMethod** | **String** | Fulfillment method used to fulfill this item |  [optional] |
|**giftInfo** | [**GiftInfo**](GiftInfo.md) |  |  [optional] |
|**id** | **String** | Unique identifier of the order line item. System-supplied and read-only. |  [optional] |
|**isReservationEnabled** | **Boolean** | Flag to indicate reserve inventory in cart |  [optional] |
|**originalCartItemId** | **String** | Unique identifier of the cart item that is associated with this line item.  (This is the original Cart Item ID expressed as a GUID.) |  [optional] |
|**priceMode** | **String** | Determines if the item is using external or internal(catalog) pricing |  [optional] |
|**requestedShipDate** | **OffsetDateTime** | Requested ship date carried from the Call-Off Order line (spec COM-10941 follow-up). |  [optional] |
|**returnRuleInfo** | [**ReturnRuleInfo**](ReturnRuleInfo.md) |  |  [optional] |
|**shippingMethodCode** | **String** | Code that uniquely identifies the shipping method. |  [optional] |
|**shippingMethodName** | **String** | Readable name of the shipping method. |  [optional] |
|**subscription** | [**SubscriptionInfo**](SubscriptionInfo.md) |  |  [optional] |
|**suggestions** | [**List&lt;Suggestion&gt;**](Suggestion.md) | Routing suggestions |  [optional] |
|**timeFenceDays** | **Integer** | Time-fence tolerance (days) carried from the Call-Off Order line&#39;s bound ReservationRule. |  [optional] |


## Implemented Interfaces

* Serializable


