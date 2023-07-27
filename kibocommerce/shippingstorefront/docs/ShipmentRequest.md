

# ShipmentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isoCurrencyCode** | **String** |  |  [optional] |
|**shipment** | [**ShippingRuntimeShipment**](ShippingRuntimeShipment.md) |  |  [optional] |
|**customAttributes** | [**List&lt;CustomAttribute&gt;**](CustomAttribute.md) | Carrier specific options    Ex: RequiresDeliveryConfirmation when using usps with non-express mail service type. |  [optional] |
|**carrierId** | **String** |  |  [optional] |
|**shippingServiceType** | **String** | Selected Shipping Service Type. |  [optional] |
|**shipmentRequestType** | **String** | Selected Shipment Request Type. |  [optional] |
|**requiresSignature** | **Boolean** | Designates that the shipment requires a signature for delivery  Not fully implemented... |  [optional] |
|**labelFormat** | **String** |  |  [optional] |
|**customerReferences** | [**List&lt;CustomerReferences&gt;**](CustomerReferences.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


