

# ApiDocumentationTagQuantity

Response object for a tag quantity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allocated** | **Integer** | The quantity the location has that are already allocated for this tag |  [optional] |
|**available** | **Integer** | The quantity the location has that are available for purchase for this tag |  [optional] |
|**futureInventory** | [**List&lt;ApiDocumentationFutureInventory&gt;**](ApiDocumentationFutureInventory.md) |  |  [optional] |
|**onHand** | **Integer** | The quantity the the location has in its possession for this tag |  [optional] |
|**pending** | **Integer** | The quantity the location has that are pending for this tag |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Associative Map of &lt;String, String&gt; for tagCategoryName &#x3D;&gt; tagName |  [optional] |


## Implemented Interfaces

* Serializable


