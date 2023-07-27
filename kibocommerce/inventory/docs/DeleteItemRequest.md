

# DeleteItemRequest

Request needed for deleting inventory

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dryRun** | **Boolean** | Flag used to differentiate between a test and a non-test run. |  [optional] |
|**explicit** | **Boolean** | Flag used to request explicit inventory, location, pick wave, and audit information for each request item. |  [optional] |
|**locationCodes** | **List&lt;String&gt;** | An array of locationCodes to be considered for item-deletion purposes. Optional.     All locationCodes associated with the requesting tenant will be considered if no locationCodes are provided. |  [optional] |
|**allLocations** | **Boolean** | Flag used to request deletion of inventory across all locations (overrides locationCodes). |  [optional] |
|**partNumber** | **String** | The part number of the item to be deleted. Supports basic regex operators: .*+?^$[] |  [optional] |
|**upc** | **String** | The upc of the item to be deleted. Supports basic regex operators: .*+?^$[] |  [optional] |
|**sku** | **String** | The sku of the item to be deleted. Supports basic regex operators: .*+?^$[] |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Associative Map of &lt;String, String&gt; for tagCategoryName &#x3D;&gt; tagName |  [optional] |


## Implemented Interfaces

* Serializable


