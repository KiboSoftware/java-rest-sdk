

# CommerceRuntimeProduct

The product as it appears on the order item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mfgPartNumber** | **String** | Manufacturing Part Number of the product. |  [optional] |
|**upc** | **String** | Universal Product Code of the product. |  [optional] |
|**sku** | **String** | Product Identifier specific to the store |  [optional] |
|**fulfillmentTypesSupported** | **List&lt;String&gt;** | Types of fulfillment that are supported for this product. |  [optional] |
|**imageAlternateText** | **String** | Descriptive text of the image associated with the product in the language specified by LocaleCode. |  [optional] |
|**imageUrl** | **String** | URL of the image that appears next to the product on the order item. Optional. |  [optional] |
|**variationProductCode** | **String** | For configurable products, the unique identifier of the product variation that has been selected. |  [optional] |
|**options** | [**List&lt;CommerceRuntimeProductOption&gt;**](CommerceRuntimeProductOption.md) | If the product contains configurable or stand-alone options, the list of product options that the shopper selected for this product. |  [optional] |
|**properties** | [**List&lt;CommerceRuntimeProductProperty&gt;**](CommerceRuntimeProductProperty.md) | If the product contains properties, the list of properties that the shopper selected for this product. |  [optional] |
|**categories** | [**List&lt;CommerceRuntimeCategory&gt;**](CommerceRuntimeCategory.md) | Categories to which this product belongs. |  [optional] |
|**price** | [**CommerceRuntimeProductPrice**](CommerceRuntimeProductPrice.md) |  |  [optional] |
|**discountsRestricted** | **Boolean** | Is the product discount restricted |  [optional] |
|**discountsRestrictedStartDate** | **OffsetDateTime** | Product discount restriction start date |  [optional] |
|**discountsRestrictedEndDate** | **OffsetDateTime** | Product discount restriction end date |  [optional] |
|**isRecurring** | **Boolean** | If true, the product is purchased or fulfilled at regular intervals, for example, a monthly billing or a subscription. |  [optional] |
|**isTaxable** | **Boolean** | If true, the product is eligible for tax. |  [optional] |
|**productType** | **String** | Type of product, which can be a product with configurable options, a product with stand-alone options, or a simple product with no options. |  [optional] |
|**productUsage** | **String** | Usage of the product, primarily used to indicate a bundle in this context |  [optional] |
|**bundledProducts** | [**List&lt;CommerceRuntimeBundledProduct&gt;**](CommerceRuntimeBundledProduct.md) | Products bundled with this product (if the current product is a bundle) |  [optional] |
|**fulfillmentFields** | [**List&lt;CommerceRuntimeFulfillmentField&gt;**](CommerceRuntimeFulfillmentField.md) | List of unique product identifiers for an item on shipment |  [optional] |
|**productCode** | **String** | Merchant-created code that uniquely identifies the product. |  [optional] |
|**name** | **String** | Name of the product, this is the current value of the product&#39;s name in the language specified by LocaleCode. |  [optional] |
|**description** | **String** | Short description of the product in the language specified by LocaleCode. |  [optional] |
|**goodsType** | **String** | Goods Type |  [optional] |
|**isPackagedStandAlone** | **Boolean** | Indicates that this product ships by itself. |  [optional] |
|**stock** | [**ProductStock**](ProductStock.md) |  |  [optional] |
|**productReservationId** | **Integer** | Reservation ID associated with this product in the bundle. |  [optional] |
|**allocationId** | **Integer** | Allocation ID associated with this product on this order. |  [optional] |
|**allocationExpiration** | **OffsetDateTime** | Allocation ID associated with this product on this order. |  [optional] |
|**measurements** | [**CommerceRuntimePackageMeasurements**](CommerceRuntimePackageMeasurements.md) |  |  [optional] |
|**fulfillmentStatus** | **String** | Fulfillment status of the product. |  [optional] |


## Implemented Interfaces

* Serializable


