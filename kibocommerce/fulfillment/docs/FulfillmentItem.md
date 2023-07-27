

# FulfillmentItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actualPrice** | **BigDecimal** |  |  [optional] |
|**allocatedQuantity** | **Integer** |  |  [optional] |
|**allowsBackOrder** | **Boolean** |  |  [optional] |
|**allowsFutureAllocate** | **Boolean** |  |  [optional] |
|**appeasementReason** | [**FulfillmentAppeasementReason**](FulfillmentAppeasementReason.md) |  |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**auditInfo** | [**AuditInfo0**](AuditInfo0.md) |  |  [optional] |
|**backorderReleaseDate** | **OffsetDateTime** |  |  [optional] |
|**cartItemId** | **String** |  |  [optional] |
|**childItemIds** | **List&lt;String&gt;** |  |  [optional] |
|**creditCurrencyCode** | **String** |  |  [optional] |
|**creditValue** | **BigDecimal** |  |  [optional] |
|**data** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**duty** | **BigDecimal** |  |  [optional] |
|**expectedDeliveryDate** | **OffsetDateTime** |  |  [optional] |
|**fulfillmentFields** | [**List&lt;FulfillmentFulfillmentField&gt;**](FulfillmentFulfillmentField.md) |  |  [optional] |
|**giftCards** | [**List&lt;FulfillmentGiftCard&gt;**](FulfillmentGiftCard.md) |  |  [optional] |
|**goodsType** | [**GoodsTypeEnum**](#GoodsTypeEnum) |  |  [optional] |
|**handling** | **BigDecimal** |  |  |
|**handlingDiscount** | **BigDecimal** |  |  [optional] |
|**handlingTax** | **BigDecimal** |  |  |
|**imageUrl** | **String** |  |  [optional] |
|**inventoryTags** | [**List&lt;FulfillmentInventoryTag&gt;**](FulfillmentInventoryTag.md) |  |  [optional] |
|**isAssemblyRequired** | **Boolean** |  |  [optional] |
|**isPackagedStandAlone** | **Boolean** |  |  [optional] |
|**isReservedInventory** | **Boolean** |  |  [optional] |
|**isTaxable** | **Boolean** |  |  [optional] |
|**itemDiscount** | **BigDecimal** |  |  [optional] |
|**itemTax** | **BigDecimal** |  |  |
|**lineId** | **Integer** |  |  |
|**lineItemAdjustment** | **BigDecimal** |  |  [optional] |
|**lineItemCost** | **BigDecimal** |  |  [optional] |
|**locatorName** | **String** |  |  [optional] |
|**manageStock** | **Boolean** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**optionAttributeFQN** | **String** |  |  [optional] |
|**options** | [**List&lt;FulfillmentProductOption&gt;**](FulfillmentProductOption.md) |  |  [optional] |
|**originalOrderItemId** | **String** |  |  [optional] |
|**overridePrice** | **BigDecimal** |  |  [optional] |
|**parentItemId** | **String** |  |  [optional] |
|**partNumber** | **String** |  |  [optional] |
|**productCode** | **String** |  |  [optional] |
|**quantity** | **Integer** |  |  |
|**readyForPickupQuantity** | **Integer** |  |  [optional] |
|**shipping** | **BigDecimal** |  |  |
|**shippingDiscount** | **BigDecimal** |  |  [optional] |
|**shippingTax** | **BigDecimal** |  |  |
|**sku** | **String** |  |  [optional] |
|**taxData** | **Object** |  |  [optional] |
|**taxableHandling** | **BigDecimal** |  |  [optional] |
|**taxableLineItemCost** | **BigDecimal** |  |  [optional] |
|**taxableShipping** | **BigDecimal** |  |  [optional] |
|**transferQuantity** | **Integer** |  |  [optional] |
|**trueTransferQuantity** | **Integer** |  |  [optional] |
|**unitPrice** | **BigDecimal** |  |  [optional] |
|**upc** | **String** |  |  [optional] |
|**variationProductCode** | **String** |  |  [optional] |
|**weight** | **BigDecimal** |  |  [optional] |
|**weightUnit** | **String** |  |  [optional] |
|**weightedDutyAdjustment** | **BigDecimal** |  |  [optional] |
|**weightedHandlingAdjustment** | **BigDecimal** |  |  [optional] |
|**weightedHandlingTaxAdjustment** | **BigDecimal** |  |  [optional] |
|**weightedLineItemTaxAdjustment** | **BigDecimal** |  |  [optional] |
|**weightedShipmentAdjustment** | **BigDecimal** |  |  [optional] |
|**weightedShippingAdjustment** | **BigDecimal** |  |  [optional] |
|**weightedShippingTaxAdjustment** | **BigDecimal** |  |  [optional] |



## Enum: GoodsTypeEnum

| Name | Value |
|---- | -----|
| DIGITAL | &quot;Digital&quot; |
| DIGITALCREDIT | &quot;DigitalCredit&quot; |
| DIGITALGIFTCARD | &quot;DigitalGiftCard&quot; |
| PHYSICAL | &quot;Physical&quot; |
| SERVICE | &quot;Service&quot; |


## Implemented Interfaces

* Serializable


