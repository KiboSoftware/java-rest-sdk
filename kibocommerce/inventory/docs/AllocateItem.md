

# AllocateItem

Item for Allocation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**partNumber** | **String** | part number |  [optional] |
|**upc** | **String** | upc |  [optional] |
|**sku** | **String** | sku |  [optional] |
|**quantity** | **Integer** | quantity |  |
|**orderID** | **Integer** | order ID |  |
|**orderItemID** | **Integer** | order item ID |  |
|**cartID** | **String** | Cart ID (GUID) |  [optional] |
|**reservationID** | **String** | Reservation ID |  [optional] |
|**cartItemID** | **String** | Cart Item ID (GUID) |  [optional] |
|**shipmentID** | **Integer** | shipment ID |  |
|**locationCode** | **String** | location Code |  [optional] |
|**previousOrderItemID** | **Integer** | previous order item ID |  [optional] |
|**binID** | **Integer** | Bin Location Identifier |  [optional] |
|**blockAssignment** | **Boolean** | Block assignment of item at product/location level. ONLY allowed on deallocate. |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Associative Map of &lt;String, String&gt; for tagCategoryName &#x3D;&gt; tagName |  [optional] |
|**futureDate** | **OffsetDateTime** | Future Date at which the inventory should be allocated against. Expected format &#39;2020-09-28T12:00:00-0500&#39; |  [optional] |


## Implemented Interfaces

* Serializable


