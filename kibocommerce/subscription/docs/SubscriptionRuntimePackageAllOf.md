

# SubscriptionRuntimePackageAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**carrier** | **String** | Carrier of this package |  [optional] |
|**fxcbDocumentsUrl** | **String** |  |  [optional] |
|**fxcbPackNotificationId** | **String** |  |  [optional] |
|**hasLabel** | **Boolean** | If there is a shipping label present for this Package, this will be set to true |  [optional] |
|**integratorId** | **String** |  |  [optional] |
|**labelFormat** | **String** |  |  [optional] |
|**manifestId** | **String** |  |  [optional] |
|**measurements** | [**CommerceRuntimePackageMeasurements**](CommerceRuntimePackageMeasurements.md) |  |  [optional] |
|**packageId** | **String** |  |  [optional] |
|**packagingType** | **String** | Packaging type of this package |  [optional] |
|**packingSlipItemDetails** | [**List&lt;PackingSlipItemDetail&gt;**](PackingSlipItemDetail.md) | PackingSlipItemDetails for this package |  [optional] |
|**packingSlipNumber** | **Integer** | PackingSlipNumber for this package |  [optional] |
|**returnCarrier** | **String** |  |  [optional] |
|**returnTrackingNumbers** | **List&lt;String&gt;** |  |  [optional] |
|**returnTrackings** | [**List&lt;CommerceRuntimeTracking&gt;**](CommerceRuntimeTracking.md) |  |  [optional] |
|**shipmentId** | **String** | ID of the related shipment |  [optional] |
|**shippingMethodCode** | **String** | Code describing the shipping method. |  [optional] |
|**shippingMethodName** | **String** | Name of the shipping method |  [optional] |
|**signatureRequired** | **Boolean** | SignatureRequired for this package |  [optional] |
|**trackingNumber** | **String** | Tracking number of this package (to support classic use cases) |  [optional] |
|**trackingNumbers** | **List&lt;String&gt;** | Tracking number of this package |  [optional] |
|**trackings** | [**List&lt;CommerceRuntimeTracking&gt;**](CommerceRuntimeTracking.md) | Tracking number and url data for this package |  [optional] |


## Implemented Interfaces

* Serializable


