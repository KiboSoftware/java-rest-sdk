

# ShipmentItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actualPrice** | **Double** |  |  [optional] |
|**allowsSubstitution** | **Boolean** |  |  [optional] |
|**auditInfo** | [**CoreApiContractsAuditInfo**](CoreApiContractsAuditInfo.md) |  |  [optional] |
|**backorderReleaseDate** | **OffsetDateTime** |  |  [optional] |
|**bundleInfo** | [**BundleInfo**](BundleInfo.md) |  |  [optional] |
|**cartItemId** | **String** |  |  [optional] |
|**childItemIds** | **List&lt;String&gt;** |  |  [optional] |
|**condition** | **String** |  |  [optional] |
|**data** | **Object** |  |  [optional] |
|**duty** | **Double** |  |  [optional] |
|**expectedDeliveryDate** | **OffsetDateTime** |  |  [optional] |
|**fulfillmentFields** | [**List&lt;CommerceRuntimeFulfillmentField&gt;**](CommerceRuntimeFulfillmentField.md) |  |  [optional] |
|**fulfillmentLocationCode** | **String** |  |  [optional] |
|**giftCards** | [**List&lt;CommerceRuntimeGiftCard&gt;**](CommerceRuntimeGiftCard.md) |  |  [optional] |
|**giftMessage** | **String** | Gift message for item |  [optional] |
|**handling** | **Double** | Total handling amount for this item, combining both product-level and order-level handling fees. To get the product-level handling portion: Handling - WeightedOrderHandlingFee. |  [optional] |
|**handlingDiscount** | **Double** |  |  [optional] |
|**handlingTax** | **Double** | Total handling tax for this item, combining both product-level and order-level handling tax. To get the product-level handling tax: HandlingTax - WeightedOrderHandlingFeeTax. |  [optional] |
|**imageUrl** | **String** |  |  [optional] |
|**inventoryTags** | [**List&lt;InventoryTags&gt;**](InventoryTags.md) |  |  [optional] |
|**isAssemblyRequired** | **Boolean** |  |  [optional] |
|**isGift** | **Boolean** | Indicate item is gift or not |  [optional] |
|**isPackagedStandAlone** | **Boolean** |  |  [optional] |
|**isReservedInventory** | **Boolean** |  |  [optional] |
|**isSubstitutable** | **Boolean** |  |  [optional] |
|**isTaxable** | **Boolean** |  |  [optional] |
|**itemDiscount** | **Double** |  |  [optional] |
|**itemTax** | **Double** |  |  [optional] |
|**lineAttributes** | [**List&lt;ShipmentLineAttribute&gt;**](ShipmentLineAttribute.md) | Extensible attributes for this shipment line. Named &#x60;LineAttributes&#x60; rather than &#x60;Attributes&#x60; because &#x60;Attributes&#x60; is already a System.Collections.Generic.Dictionary&#x60;2 of product attributes on Mozu.CommerceRuntime.Contracts.Fulfillment.ShipmentItem. |  [optional] |
|**lineId** | **Integer** |  |  [optional] |
|**lineItemAdjustment** | **Double** |  |  [optional] |
|**lineItemCost** | **Double** |  |  [optional] |
|**locatorName** | **String** |  |  [optional] |
|**measurements** | [**CommerceRuntimePackageMeasurements**](CommerceRuntimePackageMeasurements.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**optionAttributeFQN** | **String** |  |  [optional] |
|**options** | [**List&lt;CommerceRuntimeProductOption&gt;**](CommerceRuntimeProductOption.md) |  |  [optional] |
|**originalLineId** | **Integer** |  |  [optional] |
|**originalOrderItemId** | **String** |  |  [optional] |
|**originalQuantity** | **Integer** |  |  [optional] |
|**overridePrice** | **Double** |  |  [optional] |
|**parentId** | **String** |  |  [optional] |
|**parentItemId** | **String** |  |  [optional] |
|**partNumber** | **String** |  |  [optional] |
|**priceMode** | **String** | Determines if the item is using external or internal(catalog) pricing |  [optional] |
|**productCode** | **String** |  |  [optional] |
|**purchaseLocation** | **String** |  |  [optional] |
|**quantity** | **Integer** |  |  [optional] |
|**readyForPickupQuantity** | **Integer** |  |  [optional] |
|**returnRuleInfo** | [**ReturnRuleInfo**](ReturnRuleInfo.md) |  |  [optional] |
|**serialNumber** | **String** |  |  [optional] |
|**shipping** | **Double** |  |  [optional] |
|**shippingDiscount** | **Double** |  |  [optional] |
|**shippingTax** | **Double** |  |  [optional] |
|**sku** | **String** |  |  [optional] |
|**substituteInfo** | [**SubstituteInfo**](SubstituteInfo.md) |  |  [optional] |
|**substituteQuantity** | **Integer** |  |  [optional] |
|**substitutionType** | **String** |  |  [optional] |
|**taxData** | **Object** |  |  [optional] |
|**taxableHandling** | **Double** |  |  [optional] |
|**taxableLineItemCost** | **Double** |  |  [optional] |
|**taxableShipping** | **Double** |  |  [optional] |
|**timeFenceDays** | **Integer** | Time-fence tolerance (days), carried from the originating OrderItem (Call-Off release, spec COM-10941 follow-up). Null for shipment items not tied to a Call-Off Order line. |  [optional] |
|**unitPrice** | **Double** |  |  [optional] |
|**upc** | **String** |  |  [optional] |
|**variationProductCode** | **String** |  |  [optional] |
|**weightedDutyAdjustment** | **Double** |  |  [optional] |
|**weightedHandlingAdjustment** | **Double** |  |  [optional] |
|**weightedHandlingTaxAdjustment** | **Double** |  |  [optional] |
|**weightedLineItemTaxAdjustment** | **Double** |  |  [optional] |
|**weightedOrderHandlingFee** | **Double** | Order-level handling fee allocated to this item. This represents only the order-level portion of handling, not product-level handling fees. Product-level handling can be derived as: Handling - WeightedOrderHandlingFee. During item cancellation with Granular Retention, order-level handling is retained on active items while product-level handling scales proportionally with quantity. |  [optional] |
|**weightedOrderHandlingFeeDiscount** | **Double** | Discount applied to the order-level handling fee only. |  [optional] |
|**weightedOrderHandlingFeeTax** | **Double** | Tax on the order-level handling fee only (not total handling tax). Product-level handling tax can be derived as: HandlingTax - WeightedOrderHandlingFeeTax. |  [optional] |
|**weightedShipmentAdjustment** | **Double** |  |  [optional] |
|**weightedShippingAdjustment** | **Double** |  |  [optional] |
|**weightedShippingTaxAdjustment** | **Double** |  |  [optional] |


## Implemented Interfaces

* Serializable


