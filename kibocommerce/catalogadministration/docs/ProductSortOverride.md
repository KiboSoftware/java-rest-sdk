

# ProductSortOverride

Represents a product that is positioned out of its normal sort position.  It can be boosted to the top of the list, positioned exactly or buried at the bottom

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productCode** | **String** | The product code of the product being overridden |  |
|**sliceValue** | **String** | The slicing value of the product being overridden |  [optional] |
|**position** | **Integer** | Indicates the relative position of the product to other overridden products.  Position is absolute if IsPinned is true.  Not applicable to buried products. Buried products will be given a default  position of -1 |  [optional] |
|**isPinned** | **Boolean** | Flag to indicate that the product is pinned at the specified position.  Not applicable to buried products |  [optional] |


## Implemented Interfaces

* Serializable


