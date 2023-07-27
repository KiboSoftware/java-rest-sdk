

# CommerceSummary

Commerce (orders and wishlists) on a customer account which lists all the orders the customer has made with the order date, order amount, and status. Includes cancellations and returns.  Also includes wishlist information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalOrderAmount** | [**CurrencyAmount**](CurrencyAmount.md) |  |  [optional] |
|**orderCount** | **Integer** | Number of orders listed in the order history of a customer account. |  [optional] |
|**lastOrderDate** | **OffsetDateTime** | When the last order was placed. |  [optional] |
|**wishlistCount** | **Integer** | Number of wishlists listed in the wishlist count of a customer account |  [optional] |
|**visitsCount** | **Integer** | Number of visits for this customer across the entire tenant. |  [optional] |


## Implemented Interfaces

* Serializable


