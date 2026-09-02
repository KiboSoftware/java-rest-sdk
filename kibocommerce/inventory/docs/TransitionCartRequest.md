

# TransitionCartRequest

Request needed for transitioning cart allocations to order/shipment allocations

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cartID** | **String** | Cart ID that we are transitioning the allocation from |  |
|**items** | [**List&lt;TransitionCartItem&gt;**](TransitionCartItem.md) | list of TransitionCartItem |  |
|**orderID** | **Integer** | Order ID for the cart to transition to |  |
|**locationCode** | **String** | Location Code |  [optional] |
|**pageNum** | **Integer** | which page to show |  [optional] |
|**pageSize** | **Integer** | how many results to show per page |  [optional] |
|**sortBy** | **String** | index to sort results by |  [optional] |
|**userID** | **Integer** | user id |  [optional] |


## Implemented Interfaces

* Serializable


