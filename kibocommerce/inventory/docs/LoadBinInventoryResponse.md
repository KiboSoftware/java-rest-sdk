

# LoadBinInventoryResponse

Response object for loading bin inventory

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**binQuantities** | [**List&lt;BinProductQuantities&gt;**](BinProductQuantities.md) | List of new bin product quantities |  [optional] |
|**binsCreated** | **List&lt;String&gt;** | Names of created bins |  [optional] |
|**productsCreated** | [**List&lt;InventoryProduct&gt;**](InventoryProduct.md) | List of products created |  [optional] |
|**unitsAdded** | **Integer** | Number of units added |  [optional] |
|**unitsRemoved** | **Integer** | Number of removed units |  [optional] |
|**messages** | **List&lt;String&gt;** | List of messages |  [optional] |
|**numResults** | **Integer** | Number of results |  [optional] |
|**success** | **Boolean** | Flag for success |  [optional] |


## Implemented Interfaces

* Serializable


