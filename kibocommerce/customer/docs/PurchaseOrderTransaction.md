

# PurchaseOrderTransaction

Customer purchase order transaction log

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerPurchaseOrderAccountId** | **Integer** | Unique identifier for Customer purchase order account |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**siteId** | **Integer** | Site Id associated with transaction log |  [optional] |
|**tenantId** | **Integer** | Tenant Id associated with transaction log |  [optional] |
|**transactionDate** | **OffsetDateTime** | Date when the transaction was made on a purchase order account |  [optional] |
|**orderId** | **String** | Unique identifier for an order |  [optional] |
|**purchaseOrderNumber** | **String** | Purchase order number |  [optional] |
|**transactionAmount** | **Double** | Transaction amount in transaction log for a purchase order account |  [optional] |
|**creditLimit** | **Double** | Maximum credit available on a purchase order account |  [optional] |
|**additionalTransactionDetail** | **String** | Any additional transaction detail other than transaction description |  [optional] |
|**availableBalance** | **Double** | Current available balance on Purchase Order account |  [optional] |
|**transactionTypeId** | **Integer** |  Purchase Order transaction type  1 - Line of Credit Change  2 - Order Submitted  3 - Payment Collected  4 - Payment Voided  5 - Payment Refund  6 - Manual Adjustment |  [optional] |
|**transactionDescription** | **String** | Purchase Order transaction description  Line of Credit Change  Order Submitted  Payment Collected  Payment Voided  Payment Refund  Manual Adjustment |  [optional] |
|**author** | **String** |  |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


