

# CatalogRuntimesProductInventoryInfo

Use the Products resource to create and manage products for your store. You can create products with options that a shopper configures (such as a T-shirt color and size). The system can manage inventory for all combinations of your product options, and can calculate tax and shipping costs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**manageStock** | **Boolean** | If true, the Products service manages inventory for this product. |  [optional] |
|**outOfStockBehavior** | **String** | The behvior when the ManageStock is true and the product is not in stock. |  [optional] |
|**onlineStockAvailable** | **Integer** | Number of product items currently available for purchase. |  [optional] |
|**onlineSoftStockAvailable** | **Integer** | Number of product items currently available for purchase. |  [optional] |
|**onlineLocationCode** | **String** | Directship location code for OnlineStockAvailable |  [optional] |
|**availableDate** | **OffsetDateTime** | Date the item will become available for back order if out of stock |  [optional] |
|**isSubstitutable** | **Boolean** | ReadOnly flag indicates is the product has substitutions defined |  [optional] |


## Implemented Interfaces

* Serializable


