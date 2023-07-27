

# CreditTransaction

Credit Transactions are used to make adjustments to a Credit Balance

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Id unique within the tenant  ReadOnly |  [optional] |
|**transactionType** | **String** | Mozu.Customer.Contracts.Credit.CreditTransaction.CreditTransactionType              Requried |  [optional] |
|**comments** | **String** | Comments about the transaction.  Depending on the user interface, these comments may be readable by authorized users or customers. |  [optional] |
|**impactAmount** | **Double** | Amount to apply to Credit Balance  Required |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**orderId** | **String** |  |  [optional] |
|**data** | **Object** | Custom data for credit transactions |  [optional] |


## Implemented Interfaces

* Serializable


