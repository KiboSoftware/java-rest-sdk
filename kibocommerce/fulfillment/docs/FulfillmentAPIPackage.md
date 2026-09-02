

# FulfillmentAPIPackage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**auditInfo** | [**FulfillmentAPIAuditInfo**](FulfillmentAPIAuditInfo.md) |  |  [optional] |
|**carrier** | **String** |  |  [optional] |
|**carrierName** | **String** |  |  [optional] |
|**cartonization** | [**CartonizationDto**](CartonizationDto.md) |  |  [optional] |
|**fullyMatched** | **Boolean** | Whether every line item&#39;s received+substituted quantity matched its expected quantity for this package. Null until received or when not eligible/flag disabled. |  [optional] |
|**fxcbDocumentsUrl** | **String** |  |  [optional] |
|**fxcbPackNotificationId** | **String** |  |  [optional] |
|**hasLabel** | **Boolean** |  |  [optional] |
|**integratorId** | **String** |  |  [optional] |
|**labelFormat** | **String** |  |  [optional] |
|**manifestId** | **String** |  |  [optional] |
|**measurements** | [**FulfillmentAPIPackageMeasurements**](FulfillmentAPIPackageMeasurements.md) |  |  [optional] |
|**packageConsolidationId** | **String** |  |  [optional] |
|**packageId** | **String** |  |  [optional] |
|**packagingType** | **String** |  |  [optional] |
|**packingSlipItemDetails** | [**List&lt;PackingSlipItemDetailDto&gt;**](PackingSlipItemDetailDto.md) |  |  [optional] |
|**packingSlipNumber** | **Integer** |  |  [optional] |
|**receiptStatus** | [**ReceiptStatusEnum**](#ReceiptStatusEnum) | Package-level receipt status (NOT_RECEIVED/RECEIVED). Null when not eligible/tenant attribute disabled. |  [optional] |
|**receivedBy** | **String** | User ID that received this package. Null until received or when not eligible/flag disabled. |  [optional] |
|**receivedDate** | **OffsetDateTime** | Timestamp this package was marked received. Null until received or when not eligible/flag disabled. |  [optional] |
|**receivingMethod** | [**ReceivingMethodEnum**](#ReceivingMethodEnum) | Method used to receive this package (TRACKING_NUMBER_RECEIPT/ITEM_VALIDATION). Null until received or when not eligible/flag disabled. |  [optional] |
|**returnCarrier** | **String** |  |  [optional] |
|**returnTrackingNumbers** | **List&lt;String&gt;** |  |  [optional] |
|**returnTrackings** | [**List&lt;FulfillmentAPITracking&gt;**](FulfillmentAPITracking.md) |  |  [optional] |
|**shippingMethodCode** | **String** |  |  [optional] |
|**shippingMethodName** | **String** |  |  [optional] |
|**signatureRequired** | **Boolean** |  |  [optional] |
|**stringBarcode** | **String** |  |  [optional] |
|**trackingNumbers** | **List&lt;String&gt;** |  |  [optional] |
|**trackings** | [**List&lt;FulfillmentAPITracking&gt;**](FulfillmentAPITracking.md) |  |  [optional] |



## Enum: ReceiptStatusEnum

| Name | Value |
|---- | -----|
| NOT_RECEIVED | &quot;NOT_RECEIVED&quot; |
| RECEIVED | &quot;RECEIVED&quot; |



## Enum: ReceivingMethodEnum

| Name | Value |
|---- | -----|
| TRACKING_NUMBER_RECEIPT | &quot;TRACKING_NUMBER_RECEIPT&quot; |
| ITEM_VALIDATION | &quot;ITEM_VALIDATION&quot; |
| WHOLE_SHIPMENT_RECEIPT | &quot;WHOLE_SHIPMENT_RECEIPT&quot; |


## Implemented Interfaces

* Serializable


