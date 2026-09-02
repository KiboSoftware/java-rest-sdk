

# AggregateResponse

Response for aggregating Inventory

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**available** | **Integer** | The quantity the location has that are available for purchase |  [optional] |
|**floor** | **Integer** | Absolute minimum quantity of this item that should be in stock at any time |  [optional] |
|**onHand** | **Integer** | The quantity the location has in its possession |  [optional] |
|**partNumber** | **String** | Part/Product Number |  [optional] |
|**sku** | **String** | Stock Keeping Unit |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Associative Map of &lt;String, String&gt; for tagCategoryName &#x3D;&gt; tagName |  [optional] |
|**tenantID** | **Integer** | Manufacturer Identifier |  [optional] |
|**upc** | **String** | Universal Product Code |  [optional] |
|**messages** | **List&lt;String&gt;** | List of messages |  [optional] |
|**numResults** | **Integer** | Number of results |  [optional] |
|**success** | **Boolean** | Flag for success |  [optional] |


## Implemented Interfaces

* Serializable


