

# ShipmentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**carrierId** | **String** |  |  [optional] |
|**consolidationReferences** | [**List&lt;ConsolidationReference&gt;**](ConsolidationReference.md) | Consolidation references for Order Number, Shipment Number and Order Id |  [optional] |
|**customAttributes** | [**List&lt;CustomAttribute&gt;**](CustomAttribute.md) | Carrier specific options  Ex: RequiresDeliveryConfirmation when using usps with non-express mail service type. |  [optional] |
|**customerReferences** | [**List&lt;CustomerReferences&gt;**](CustomerReferences.md) |  |  [optional] |
|**fulfillmentMethod** | **String** | Fulfillment method for the shipment. STH / Delivery. Empty will be assumed as STH. |  [optional] |
|**isoCurrencyCode** | **String** |  |  [optional] |
|**labelFormat** | **String** | Returns the Label in the requested format. Specify either \&quot;LASER\&quot; or \&quot;THERMAL\&quot; format. Actual supported image formats vary by carrier. |  [optional] |
|**relatedOrderId** | **String** | The related Order ID for this shipment request. Informational only. |  [optional] |
|**relatedOrderNumber** | **Integer** | The related Order Number for this shipment request. Informational only. |  [optional] |
|**relatedShipmentNumber** | **Integer** | The related Shipment Number for this shipment request. Informational only. |  [optional] |
|**shipment** | [**ShippingRuntimeShipment**](ShippingRuntimeShipment.md) |  |  [optional] |
|**shipmentRequestType** | **String** | Selected Shipment Request Type. |  [optional] |
|**shippingServiceType** | **String** | Selected Shipping Service Type. |  [optional] |
|**signatureOption** | **String** | Specify an optional signature option for this shipment. All packages will inherit this option value automatically. Set this option on the package level to override this value. |  [optional] |


## Implemented Interfaces

* Serializable


