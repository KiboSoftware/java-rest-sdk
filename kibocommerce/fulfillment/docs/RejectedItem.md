

# RejectedItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actualPrice** | **BigDecimal** |  |  [optional] |
|**allocatedQuantity** | **Integer** |  |  [optional] |
|**allowsBackOrder** | **Boolean** |  |  [optional] |
|**allowsFutureAllocate** | **Boolean** |  |  [optional] |
|**allowsSubstitution** | **Boolean** |  |  [optional] |
|**appeasementReason** | [**FulfillmentAPIAppeasementReason**](FulfillmentAPIAppeasementReason.md) |  |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**auditInfo** | [**FulfillmentAPIAuditInfo**](FulfillmentAPIAuditInfo.md) |  |  [optional] |
|**autoSubstitution** | **Boolean** |  |  [optional] |
|**backorderReleaseDate** | **OffsetDateTime** |  |  [optional] |
|**blockAssignment** | **Boolean** |  |  [optional] |
|**bundleInfo** | [**FulfillmentAPIBundleInfo**](FulfillmentAPIBundleInfo.md) |  |  [optional] |
|**cartItemId** | **String** |  |  [optional] |
|**childItemIds** | **List&lt;String&gt;** |  |  [optional] |
|**condition** | **String** |  |  [optional] |
|**creditCurrencyCode** | **String** |  |  [optional] |
|**creditValue** | **BigDecimal** |  |  [optional] |
|**data** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**duty** | **BigDecimal** |  |  [optional] |
|**expectedDeliveryDate** | **OffsetDateTime** |  |  [optional] |
|**fulfillmentFields** | [**List&lt;FulfillmentAPIFulfillmentField&gt;**](FulfillmentAPIFulfillmentField.md) |  |  [optional] |
|**giftCards** | [**List&lt;FulfillmentAPIGiftCard&gt;**](FulfillmentAPIGiftCard.md) |  |  [optional] |
|**giftMessage** | **String** |  |  [optional] |
|**goodsType** | [**GoodsTypeEnum**](#GoodsTypeEnum) |  |  [optional] |
|**handling** | **BigDecimal** |  |  [optional] |
|**handlingDiscount** | **BigDecimal** |  |  [optional] |
|**handlingTax** | **BigDecimal** |  |  [optional] |
|**height** | **BigDecimal** |  |  [optional] |
|**holdBlockAssignment** | **Boolean** |  |  [optional] |
|**imageUrl** | **String** |  |  [optional] |
|**inventoryAllocations** | [**List&lt;InventoryAllocation&gt;**](InventoryAllocation.md) |  |  [optional] |
|**inventoryTags** | [**List&lt;InventoryTag&gt;**](InventoryTag.md) |  |  [optional] |
|**isAssemblyRequired** | **Boolean** |  |  [optional] |
|**isGift** | **Boolean** |  |  [optional] |
|**isPackagedStandAlone** | **Boolean** |  |  [optional] |
|**isReservedInventory** | **Boolean** |  |  [optional] |
|**isTaxable** | **Boolean** |  |  [optional] |
|**itemDiscount** | **BigDecimal** |  |  [optional] |
|**itemTax** | **BigDecimal** |  |  [optional] |
|**length** | **BigDecimal** |  |  [optional] |
|**lineId** | **Integer** |  |  [optional] |
|**lineItemAdjustment** | **BigDecimal** |  |  [optional] |
|**lineItemCost** | **BigDecimal** |  |  [optional] |
|**locatorName** | **String** |  |  [optional] |
|**manageStock** | **Boolean** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**optionAttributeFQN** | **String** |  |  [optional] |
|**options** | [**List&lt;FulfillmentAPIProductOption&gt;**](FulfillmentAPIProductOption.md) |  |  [optional] |
|**originalLineId** | **Integer** |  |  [optional] |
|**originalOrderItemId** | **String** |  |  [optional] |
|**originalQuantity** | **Integer** |  |  [optional] |
|**overridePrice** | **BigDecimal** |  |  [optional] |
|**parentItemId** | **String** |  |  [optional] |
|**partNumber** | **String** |  |  [optional] |
|**priceMode** | [**PriceModeEnum**](#PriceModeEnum) |  |  [optional] |
|**productCode** | **String** |  |  [optional] |
|**purchaseLocation** | **String** |  |  [optional] |
|**quantity** | **Integer** |  |  [optional] |
|**readyForPickupQuantity** | **Integer** |  |  [optional] |
|**rejectedReason** | [**RejectedReason**](RejectedReason.md) |  |  [optional] |
|**returnRuleInfo** | [**FulfillmentAPIReturnRuleInfo**](FulfillmentAPIReturnRuleInfo.md) |  |  [optional] |
|**serialNumber** | **String** |  |  [optional] |
|**shipmentItemAttributes** | [**List&lt;ShipmentItemAttribute&gt;**](ShipmentItemAttribute.md) |  |  [optional] |
|**shipping** | **BigDecimal** |  |  [optional] |
|**shippingDiscount** | **BigDecimal** |  |  [optional] |
|**shippingTax** | **BigDecimal** |  |  [optional] |
|**sku** | **String** |  |  [optional] |
|**stockValidationStatus** | **String** |  |  [optional] |
|**substituteInfo** | [**FulfillmentAPISubstituteInfo**](FulfillmentAPISubstituteInfo.md) |  |  [optional] |
|**substituteQuantity** | **Integer** |  |  [optional] |
|**substitutionType** | [**SubstitutionTypeEnum**](#SubstitutionTypeEnum) |  |  [optional] |
|**taxData** | **Object** |  |  [optional] |
|**taxableHandling** | **BigDecimal** |  |  [optional] |
|**taxableLineItemCost** | **BigDecimal** |  |  [optional] |
|**taxableShipping** | **BigDecimal** |  |  [optional] |
|**timeFenceDays** | **Integer** |  |  [optional] |
|**transferQuantity** | **Integer** | This is deprecated. |  [optional] |
|**trueTransferQuantity** | **Integer** | This is the actual quantity transferred. |  [optional] |
|**unitPrice** | **BigDecimal** |  |  [optional] |
|**upc** | **String** |  |  [optional] |
|**validatedQuantity** | **Integer** |  |  [optional] |
|**variationProductCode** | **String** |  |  [optional] |
|**weight** | **BigDecimal** |  |  [optional] |
|**weightUnit** | **String** |  |  [optional] |
|**weightedDutyAdjustment** | **BigDecimal** |  |  [optional] |
|**weightedHandlingAdjustment** | **BigDecimal** |  |  [optional] |
|**weightedHandlingTaxAdjustment** | **BigDecimal** |  |  [optional] |
|**weightedLineItemTaxAdjustment** | **BigDecimal** |  |  [optional] |
|**weightedOrderHandlingFee** | **BigDecimal** |  |  [optional] |
|**weightedOrderHandlingFeeDiscount** | **BigDecimal** |  |  [optional] |
|**weightedOrderHandlingFeeTax** | **BigDecimal** |  |  [optional] |
|**weightedShipmentAdjustment** | **BigDecimal** |  |  [optional] |
|**weightedShippingAdjustment** | **BigDecimal** |  |  [optional] |
|**weightedShippingTaxAdjustment** | **BigDecimal** |  |  [optional] |
|**width** | **BigDecimal** |  |  [optional] |



## Enum: GoodsTypeEnum

| Name | Value |
|---- | -----|
| PHYSICAL | &quot;Physical&quot; |
| DIGITAL | &quot;Digital&quot; |
| DIGITALCREDIT | &quot;DigitalCredit&quot; |
| DIGITALGIFTCARD | &quot;DigitalGiftCard&quot; |
| SERVICE | &quot;Service&quot; |



## Enum: PriceModeEnum

| Name | Value |
|---- | -----|
| INTERNAL | &quot;Internal&quot; |
| EXTERNAL | &quot;External&quot; |



## Enum: SubstitutionTypeEnum

| Name | Value |
|---- | -----|
| PRE_FULFILLMENT | &quot;PRE_FULFILLMENT&quot; |
| AT_FULFILLMENT | &quot;AT_FULFILLMENT&quot; |


## Implemented Interfaces

* Serializable


