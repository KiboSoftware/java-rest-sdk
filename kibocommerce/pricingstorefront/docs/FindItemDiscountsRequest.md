

# FindItemDiscountsRequest

Request parameters to search for discounts

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerSegmentIds** | **List&lt;Integer&gt;** | List of customer segments that the discounts are applicable to. If not specified, only discounts that are not restricted to any customer segment are returned. When specified, only discounts that are applicable to one of the specified customer segments are returned. |  [optional] |
|**includeUnconditional** | **Boolean** | When true, include discounts that are applied when there is no condition on the discount. By default, these are not included. |  [optional] |
|**isPurchaseRequirement** | **Boolean** | Set false to exclude discounts that require one of the specified products to be purchased default is true |  [optional] |
|**labels** | **List&lt;String&gt;** | List of discount labels to filter discounts by. Limit: 10 labels |  [optional] |
|**locationCodes** | **List&lt;String&gt;** | List of location codes to filter discounts by. when not specified all discounts are returned. |  [optional] |
|**productCodes** | **List&lt;String&gt;** | List of product codes to query for discounts Limit: 20 product codes |  [optional] |
|**targetType** | **String** | Types of discounts to search for Product, Shipping, or All when not specified, all types are returned. |  [optional] |
|**isTarget** | **Boolean** | Set false to exclude discounts that require one of the specified products to be a target Default is true |  [optional] |


## Implemented Interfaces

* Serializable


