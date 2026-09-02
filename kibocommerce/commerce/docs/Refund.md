

# Refund

Refund associated with an order. A refund is a single exchange of money from merchant to customer that either encapsulates a refund to a credit card or an issuance of a store credit. A refund does not reduce the 'amount collected' on an order and it is possible for a refund to exceed the total order amount.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Double** | Amount refunded. |  [optional] |
|**auditInfo** | [**CoreApiContractsAuditInfo**](CoreApiContractsAuditInfo.md) |  |  [optional] |
|**id** | **String** | Unique identifier of this order transaction. |  [optional] |
|**orderId** | **String** | Unique identifier of the order with which this refund is associated. |  [optional] |
|**payment** | [**Payment**](Payment.md) |  |  [optional] |
|**reason** | **String** | Merchant-entered reason for this refund. |  [optional] |
|**reasonCode** | **String** |  |  [optional] |
|**refundMethod** | **String** | Refund Method. |  [optional] |


## Implemented Interfaces

* Serializable


