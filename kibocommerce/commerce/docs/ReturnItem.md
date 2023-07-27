

# ReturnItem



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifer of the return |  [optional] |
|**orderItemId** | **String** | The OrderItem that this ReturnItem is associated with. Either the Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.Product or the OrderItemId must be present. |  [optional] |
|**orderLineId** | **Integer** | The OrderLineId that this ReturnItem is associated with. If Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.OrderItemId is present, the OrderLineId should be present also. |  [optional] |
|**orderItemOptionAttributeFQN** | **String** | If this item refers to a product extra, provide the item&#39;s corresponding OptionAttributeFQN. |  [optional] |
|**product** | [**CommerceRuntimeProduct**](CommerceRuntimeProduct.md) |  |  [optional] |
|**reasons** | [**List&lt;ReturnReason&gt;**](ReturnReason.md) | For a given return reason (Damaged, Defective, MissingParts, DifferentExpectations, Late, NoLongerWanted, Other),  how many of the above OrderItem are to be replaced.  This value is provided by the Shopper when they request a Return. |  [optional] |
|**excludeProductExtras** | **Boolean** | If this return item refers to a product/bundle that has product extras, this specifies whether those child items should be included or excluded.  For backward compatibility, a null value will be treated as false, i.e. include the extras. |  [optional] |
|**returnType** | **String** | Specifies whether the requested resolution for this item is Refund or Replace. |  [optional] |
|**returnNotRequired** | **Boolean** | Specifies whether this item should be returned to the merchant, e.g. if the item is irreparably damaged and it&#39;s not worth shipping back.  Even if this is set to true, Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.QuantityShipped should still be set to the quantity of items involved in the return. |  [optional] |
|**quantityReceived** | **Integer** | The amount of this item actually received from the shopper. It may differ from the sum of the ReturnReasons.  This is populated by the system when the Receive action is performed. |  [optional] |
|**receiveStatus** | **String** | Describes the receive status of this item.  If Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.ReturnNotRequired is {true}, then this should be Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.ItemReceiveStatusConst.NOT_REQUESTED.  Otherwise the value should be Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.ItemReceiveStatusConst.RECEIVED or Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.ItemReceiveStatusConst.WAITING depending on Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.QuantityReceived. |  [optional] |
|**quantityShipped** | **Integer** | The quantity of this item fulfilled on the parent order. |  [optional] |
|**replaceStatus** | **String** | Describes the replace status of this item.  If Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.ReturnType is Mozu.CommerceRuntime.Contracts.Returns.Return.ReturnTypeConst.REFUND, then this should be Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.ItemReplaceStatusConst.NOT_REQUESTED.  Otherwise the value should be Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.ItemReplaceStatusConst.REPLACED or Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.ItemReplaceStatusConst.NOT_REPLACED depending on Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.QuantityReplaced. |  [optional] |
|**quantityRestockable** | **Integer** | Of the quantity returned, how many of this item can be added back into the inventory? This item is set by the merchant via an UpdateReturn call.  It is used during the Restock action to set some quantity of this item back into the inventory management system. |  [optional] |
|**quantityRestocked** | **Integer** | Field to specify How many items added to inventory |  [optional] |
|**refundAmount** | **Double** | If a refund is issued for the return, how much of the refund amount is for this particular item. |  [optional] |
|**returnProcessingFeeApplied** | **Double** | The processing fee on the item that gets persisted into the database |  [optional] |
|**shippingAndHandlingRefunded** | **Boolean** | Determines if shipping and handling is returned on the item |  [optional] |
|**quantityRefunded** | **Integer** | The quantity of the item being refunded is specified in this field |  [optional] |
|**refundStatus** | **String** | Describes the refund status of this item.  If Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.ReturnType is Mozu.CommerceRuntime.Contracts.Returns.Return.ReturnTypeConst.REPLACE, then this should be Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.ItemRefundStatusConst.NOT_REQUESTED.  Otherwise the value should be Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.ItemRefundStatusConst.REFUNDED or Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.ItemRefundStatusConst.NOT_REFUNDED depending on Mozu.CommerceRuntime.Contracts.Returns.ReturnItem.RefundAmount. |  [optional] |
|**quantityReplaced** | **Integer** | Specifies the quantity of this item that has been marked as replaced, i.e. it has been used to generate a replacement order for the return.  Note that the quantity replaced may not line up with the quantity of the item actually sent back to the shopper,  such as in the case of an exchange, e.g. swapping a medium shirt for a large shirt. |  [optional] |
|**notes** | [**List&lt;OrderNote&gt;**](OrderNote.md) | Any merchant-supplied notes for this ReturnItem. |  [optional] |
|**productLossAmount** | **Double** | The loss incurred of the returned products, used for accounting purposes. |  [optional] |
|**productLossTaxAmount** | **Double** | The tax on the returned products, used for accounting purposes. |  [optional] |
|**shippingLossAmount** | **Double** | The loss incurred of the returned product shipping, used for accounting purposes. |  [optional] |
|**shippingLossTaxAmount** | **Double** | The tax on the returned product shipping, used for accounting purposes. |  [optional] |
|**bundledProducts** | [**List&lt;ReturnBundle&gt;**](ReturnBundle.md) | Deprecated. Not used. |  [optional] |
|**totalWithoutWeightedShippingAndHandling** | **Double** | Taxable Subtotal including Weighted Order amounts |  [optional] |
|**totalWithWeightedShippingAndHandling** | **Double** | Line item total with line item, Tax, Weighted Tax with Weighted shipping and handling costs |  [optional] |
|**shipmentItemId** | **Integer** | The identifer of the item |  [optional] |
|**shipmentNumber** | **Integer** |  |  [optional] |
|**data** | **Object** | Custom data for a given vendor set within the commerce process. |  [optional] |
|**inventoryTags** | [**List&lt;InventoryTags&gt;**](InventoryTags.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


