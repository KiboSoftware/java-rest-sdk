

# TransitionCartRequest

Request needed for transitioning cart allocations to order/shipment allocations

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**items** | [**List&lt;TransitionCartItem&gt;**](TransitionCartItem.md) | list of TransitionCartItem |  |
|**cartID** | **String** | Cart ID that we are transitioning the allocation from |  |
|**orderID** | **Integer** | Order ID for the cart to transition to |  |
|**locationCode** | **String** | Location Code |  [optional] |
|**userID** | **Integer** | user id |  [optional] |
|**pageSize** | **Integer** | how many results to show per page |  [optional] |
|**pageNum** | **Integer** | which page to show |  [optional] |
|**sortBy** | **String** | index to sort results by |  [optional] |


## Implemented Interfaces

* Serializable


