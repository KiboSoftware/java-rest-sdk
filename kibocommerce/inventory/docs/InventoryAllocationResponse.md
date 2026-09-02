

# InventoryAllocationResponse

InventoryAllocationResponse Object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**condition** | **String** |  |  [optional] |
|**date** | **OffsetDateTime** |  |  [optional] |
|**futureDate** | **OffsetDateTime** | Future Date at which the inventory should be allocated against. Expected format &#39;2020-09-28T12:00:00-0500&#39; |  [optional] |
|**lotCode** | **String** |  |  [optional] |
|**orderItemID** | **Integer** | order item ID |  [optional] |
|**quantity** | **Integer** | quantity |  [optional] |
|**serialNumber** | **String** |  |  [optional] |
|**state** | **String** | state |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Associative Map of &lt;String, String&gt; for tagCategoryName &#x3D;&gt; tagName |  [optional] |
|**upc** | **String** | upc |  [optional] |


## Implemented Interfaces

* Serializable


