

# CommerceRuntimeSubstitutedItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actualPrice** | **Double** |  |  [optional] |
|**allocatedQuantity** | **Integer** |  |  [optional] |
|**allowsBackOrder** | **Boolean** |  |  [optional] |
|**allowsFutureAllocate** | **Boolean** |  |  [optional] |
|**allowsSubstitution** | **Boolean** |  |  [optional] |
|**appeasementReason** | [**FulfillmentServiceAppeasementReason**](FulfillmentServiceAppeasementReason.md) |  |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**auditInfo** | [**FulfillmentServiceAuditInfo**](FulfillmentServiceAuditInfo.md) |  |  [optional] |
|**autoSubstitution** | **Boolean** |  |  [optional] |
|**backorderReleaseDate** | **OffsetDateTime** |  |  [optional] |
|**bundleInfo** | [**FulfillmentServiceBundleInfo**](FulfillmentServiceBundleInfo.md) |  |  [optional] |
|**cartItemId** | **String** |  |  [optional] |
|**childItemIds** | **List&lt;String&gt;** |  |  [optional] |
|**condition** | **String** |  |  [optional] |
|**creditCurrencyCode** | **String** |  |  [optional] |
|**creditValue** | **Double** |  |  [optional] |
|**data** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**duty** | **Double** |  |  [optional] |
|**expectedDeliveryDate** | **OffsetDateTime** |  |  [optional] |
|**fulfillmentFields** | [**List&lt;FulfillmentServiceFulfillmentField&gt;**](FulfillmentServiceFulfillmentField.md) |  |  [optional] |
|**giftCards** | [**List&lt;FulfillmentServiceGiftCard&gt;**](FulfillmentServiceGiftCard.md) |  |  [optional] |
|**giftMessage** | **String** |  |  [optional] |
|**goodsType** | **String** |  |  [optional] |
|**handling** | **Double** |  |  [optional] |
|**handlingDiscount** | **Double** |  |  [optional] |
|**handlingTax** | **Double** |  |  [optional] |
|**height** | **Double** |  |  [optional] |
|**imageUrl** | **String** |  |  [optional] |
|**inventoryAllocations** | [**List&lt;FulfillmentServiceInventoryAllocation&gt;**](FulfillmentServiceInventoryAllocation.md) |  |  [optional] |
|**inventoryTags** | [**List&lt;FulfillmentServiceInventoryTag&gt;**](FulfillmentServiceInventoryTag.md) |  |  [optional] |
|**isAssemblyRequired** | **Boolean** |  |  [optional] |
|**isGift** | **Boolean** |  |  [optional] |
|**isPackagedStandAlone** | **Boolean** |  |  [optional] |
|**isReservedInventory** | **Boolean** |  |  [optional] |
|**isTaxable** | **Boolean** |  |  [optional] |
|**itemDiscount** | **Double** |  |  [optional] |
|**itemTax** | **Double** |  |  [optional] |
|**length** | **Double** |  |  [optional] |
|**lineId** | **Integer** |  |  [optional] |
|**lineItemAdjustment** | **Double** |  |  [optional] |
|**lineItemCost** | **Double** |  |  [optional] |
|**locatorName** | **String** |  |  [optional] |
|**manageStock** | **Boolean** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**optionAttributeFQN** | **String** |  |  [optional] |
|**options** | [**List&lt;FulfillmentServiceProductOption&gt;**](FulfillmentServiceProductOption.md) |  |  [optional] |
|**originalLineId** | **Integer** |  |  [optional] |
|**originalOrderItemId** | **String** |  |  [optional] |
|**originalQuantity** | **Integer** |  |  [optional] |
|**overridePrice** | **Double** |  |  [optional] |
|**parentItemId** | **String** |  |  [optional] |
|**partNumber** | **String** |  |  [optional] |
|**priceMode** | **String** |  |  [optional] |
|**productCode** | **String** |  |  [optional] |
|**purchaseLocation** | **String** |  |  [optional] |
|**quantity** | **Integer** |  |  [optional] |
|**readyForPickupQuantity** | **Integer** |  |  [optional] |
|**returnRuleInfo** | [**FulfillmentServiceReturnRuleInfo**](FulfillmentServiceReturnRuleInfo.md) |  |  [optional] |
|**serialNumber** | **String** |  |  [optional] |
|**shipmentItemAttributes** | [**List&lt;FulfillmentServiceShipmentItemAttribute&gt;**](FulfillmentServiceShipmentItemAttribute.md) |  |  [optional] |
|**shipping** | **Double** |  |  [optional] |
|**shippingDiscount** | **Double** |  |  [optional] |
|**shippingTax** | **Double** |  |  [optional] |
|**sku** | **String** |  |  [optional] |
|**stockValidationStatus** | **String** |  |  [optional] |
|**substituteInfo** | [**FulfillmentServiceSubstituteInfo**](FulfillmentServiceSubstituteInfo.md) |  |  [optional] |
|**substituteItemLineIds** | **List&lt;Integer&gt;** |  |  [optional] |
|**substituteQuantity** | **Integer** |  |  [optional] |
|**substituteReason** | [**FulfillmentServiceSubstituteReason**](FulfillmentServiceSubstituteReason.md) |  |  [optional] |
|**substitutionType** | **String** |  |  [optional] |
|**taxData** | **Object** |  |  [optional] |
|**taxableHandling** | **Double** |  |  [optional] |
|**taxableLineItemCost** | **Double** |  |  [optional] |
|**taxableShipping** | **Double** |  |  [optional] |
|**timeFenceDays** | **Integer** |  |  [optional] |
|**transferQuantity** | **Integer** |  |  [optional] |
|**trueTransferQuantity** | **Integer** |  |  [optional] |
|**unitPrice** | **Double** |  |  [optional] |
|**upc** | **String** |  |  [optional] |
|**validatedQuantity** | **Integer** |  |  [optional] |
|**variationProductCode** | **String** |  |  [optional] |
|**weight** | **Double** |  |  [optional] |
|**weightUnit** | **String** |  |  [optional] |
|**weightedDutyAdjustment** | **Double** |  |  [optional] |
|**weightedHandlingAdjustment** | **Double** |  |  [optional] |
|**weightedHandlingTaxAdjustment** | **Double** |  |  [optional] |
|**weightedLineItemTaxAdjustment** | **Double** |  |  [optional] |
|**weightedOrderHandlingFee** | **Double** |  |  [optional] |
|**weightedOrderHandlingFeeDiscount** | **Double** |  |  [optional] |
|**weightedOrderHandlingFeeTax** | **Double** |  |  [optional] |
|**weightedShipmentAdjustment** | **Double** |  |  [optional] |
|**weightedShippingAdjustment** | **Double** |  |  [optional] |
|**weightedShippingTaxAdjustment** | **Double** |  |  [optional] |
|**width** | **Double** |  |  [optional] |


## Implemented Interfaces

* Serializable


