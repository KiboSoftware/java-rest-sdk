

# RefreshItem

Refresh Item

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**partNumber** | **String** | Part/Product Number |  [optional] |
|**upc** | **String** | Universal Product Code |  [optional] |
|**sku** | **String** | Stock Keeping Unit |  [optional] |
|**binID** | **Integer** | Bin Location Identifier |  [optional] |
|**LTD** | **Float** | Custom field used for store prioritization |  [optional] |
|**floor** | **Integer** | Absolute minimum quantity of this item that should be in stock at any time |  [optional] |
|**safetyStock** | **Integer** | Quantity of this item the location wants to keep in stock to ensure stock isn&#39;t completely depleted |  [optional] |
|**quantity** | **Integer** | Current Quantity of Item |  [optional] |
|**retailPrice** | **BigDecimal** | Stock Keeping Unit |  [optional] |
|**currencyID** | **Integer** | The price of the item |  [optional] |
|**inventoryLocatorName** | **String** | The inventory locator name of the item |  [optional] |
|**attributes** | **List&lt;String&gt;** | List of Item Attributes |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Associative Map of &lt;String, String&gt; for tagCategoryName &#x3D;&gt; tagName |  [optional] |
|**deliveryDate** | **OffsetDateTime** | Date at which this inventory will become available. Expected format &#39;2020-09-28T12:00:00-0500&#39; |  [optional] |


## Implemented Interfaces

* Serializable


