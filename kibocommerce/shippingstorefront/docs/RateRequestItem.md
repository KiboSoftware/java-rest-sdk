

# RateRequestItem

Represents an item in a rate request, inheriting from RequestItem.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | **Object** |  |  [optional] |
|**itemId** | **String** |  |  [optional] |
|**quantity** | **Integer** |  |  [optional] |
|**unitMeasurements** | [**ItemMeasurements**](ItemMeasurements.md) |  |  [optional] |
|**fulfillmentMethod** | **String** | The fulfillment method on item to fetch rates for. Supported values are Ship and Delivery. Will assume Ship if nothing is passed. |  [optional] |
|**itemTotal** | **Integer** | Item total. |  [optional] |
|**productSummaries** | [**List&lt;ProductSummary&gt;**](ProductSummary.md) | If Product Summaries are populated, this information will be utilized in Product Rules (e.g. ProductCode eq \&quot;ABC\&quot; or (Weight.Unit eq \&quot;lbs\&quot; and Weight.Value ge 50) |  [optional] |
|**shipsByItself** | **Boolean** |  |  [optional] |


## Implemented Interfaces

* Serializable


