

# CreditTransaction

Credit Transactions are used to make adjustments to a Credit Balance

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**comments** | **String** | Comments about the transaction.  Depending on the user interface, these comments may be readable by authorized users or customers. |  [optional] |
|**data** | **Object** | Custom data for credit transactions |  [optional] |
|**id** | **Integer** | Id unique within the tenant ReadOnly |  [optional] |
|**impactAmount** | **Double** | Amount to apply to Credit Balance Required |  [optional] |
|**orderId** | **String** |  |  [optional] |
|**transactionType** | **String** | Mozu.Customer.Contracts.Credit.CreditTransaction.CreditTransactionType             Requried |  [optional] |


## Implemented Interfaces

* Serializable


