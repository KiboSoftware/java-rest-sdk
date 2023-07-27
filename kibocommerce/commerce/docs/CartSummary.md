

# CartSummary

Cart summary, which is the number of items in the active cart, total cost of items in the cart, and whether the cart has expired.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**itemCount** | **Integer** | Number of items in the active cart. |  [optional] |
|**totalQuantity** | **Integer** | Total quantity of all items in the cart |  [optional] |
|**total** | **Double** | Total cost of items in the active cart. |  [optional] |
|**isExpired** | **Boolean** | If true, the cart has reached its expiration date (Cart.ExpirationDate) and considered abandoned.   Carts of anonymous shoppers expire after 14 days of inactivity. |  [optional] |
|**hasActiveCart** | **Boolean** | If true, the cart is active. A shopper has added an item to a cart. |  [optional] |


## Implemented Interfaces

* Serializable


