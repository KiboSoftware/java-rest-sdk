

# AllocateItem

Item for Allocation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**binID** | **Integer** | Bin Location Identifier |  [optional] |
|**blockAssignment** | **Boolean** | Block assignment of item at product/location level. ONLY allowed on deallocate. |  [optional] |
|**cartID** | **String** | Cart ID (GUID) |  [optional] |
|**cartItemID** | **String** | Cart Item ID (GUID) |  [optional] |
|**condition** | **String** | Descriptor for the state of the product. Only used in Allocate calls. |  [optional] |
|**date** | **OffsetDateTime** | Used by the retailer for storing information related to manufacturing date or expiry date and use date to allocate for better stock management. Only used in Allocate calls. |  [optional] |
|**futureDate** | **OffsetDateTime** | Future Date at which the inventory should be allocated against. Expected format &#39;2020-09-28T12:00:00-0500&#39; |  [optional] |
|**locationCode** | **String** | location Code |  [optional] |
|**lotCode** | **String** | Extra Uniqueness Identifier used track which lot a product is manufactured in. Only used in Allocate calls. |  [optional] |
|**orderID** | **Integer** | The Order Number in UCP |  |
|**orderItemID** | **Integer** | order item ID |  |
|**partNumber** | **String** | part number |  [optional] |
|**previousOrderItemID** | **Integer** | previous order item ID |  [optional] |
|**quantity** | **Integer** | quantity |  |
|**reservationID** | **String** | Reservation ID |  [optional] |
|**serialNumber** | **String** | A serial number unique to a specific, physical unit of inventory. Limit of 30 characters. Only used in Allocate calls. |  [optional] |
|**shipmentID** | **Integer** | shipment ID |  |
|**sku** | **String** | sku |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Associative Map of &lt;String, String&gt; for tagCategoryName &#x3D;&gt; tagName |  [optional] |
|**upc** | **String** | upc |  [optional] |


## Implemented Interfaces

* Serializable


