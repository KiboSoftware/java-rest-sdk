

# ProductBase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allocationExpiration** | **OffsetDateTime** | Allocation ID associated with this product on this order. |  [optional] |
|**allocationId** | **Integer** | Allocation ID associated with this product on this order. |  [optional] |
|**description** | **String** | Short description of the product in the language specified by LocaleCode. |  [optional] |
|**fulfillmentStatus** | **String** | Fulfillment status of the product. |  [optional] |
|**goodsType** | **String** | Goods Type |  [optional] |
|**isPackagedStandAlone** | **Boolean** | Indicates that this product ships by itself. |  [optional] |
|**measurements** | [**CommerceRuntimePackageMeasurements**](CommerceRuntimePackageMeasurements.md) |  |  [optional] |
|**name** | **String** | Name of the product, this is the current value of the product&#39;s name in the language specified by LocaleCode. |  [optional] |
|**productCode** | **String** | Merchant-created code that uniquely identifies the product. |  [optional] |
|**productReservationId** | **Integer** | Reservation ID associated with this product in the bundle. |  [optional] |
|**stock** | [**ProductStock**](ProductStock.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


