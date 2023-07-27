

# RateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**isoCurrencyCode** | **String** |  |  [optional] |
|**originAddress** | [**CommerceRuntimeAddress**](CommerceRuntimeAddress.md) |  |  [optional] |
|**destinationAddress** | [**CommerceRuntimeAddress**](CommerceRuntimeAddress.md) |  |  [optional] |
|**carrierIds** | **List&lt;String&gt;** | Optional.  If one or more Carrier Ids are specified then only the rates for the specified carrier(&#39;s/s&#39;) configured service types or shipping methods will be calculated resulting in better performance. |  [optional] |
|**shippingServiceTypes** | **List&lt;String&gt;** | Optional.  If one or more Shipping Service Type Codes are specified then only the specified rates for the specified carrier(&#39;s/s&#39;) configured service types or shipping methods will be calculated resulting in better performance. |  [optional] |
|**orderTotal** | **Double** | The OrderTotal to be used in rate calculation |  [optional] |
|**orderDiscountedSubTotal** | **Double** | The Order SubTotal After Discounts to be used in rate calculation |  [optional] |
|**handlingTotal** | **Double** | The order Handling total after discounts to be used in rate calculation |  [optional] |
|**relatedOrderId** | **String** | The Order ID to be used in rate calculation  Informational only |  [optional] |
|**relatedOrderNumber** | **Integer** | The Order Number to be used in rate calculation  Informational only |  [optional] |
|**isDestinationAddressCommercial** | **Boolean** | Is the destination address a commercial address? |  [optional] |
|**items** | [**List&lt;RateRequestItem&gt;**](RateRequestItem.md) |  |  [optional] |
|**estimatedShipmentDate** | **OffsetDateTime** | Estimate Date/Time when the shipment for this will be sent.  Primarily utilize to estimate delivery date. |  [optional] |
|**attributes** | [**List&lt;RateRequestAttribute&gt;**](RateRequestAttribute.md) | Order Attributes. Made available for Arc.js to use |  [optional] |
|**customAttributes** | [**List&lt;CustomAttribute&gt;**](CustomAttribute.md) |  |  [optional] |
|**data** | **Object** |  |  [optional] |


## Implemented Interfaces

* Serializable


