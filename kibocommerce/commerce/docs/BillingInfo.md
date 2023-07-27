

# BillingInfo

Customer's payment details such as payment type (credit card, check by mail, or PayPal)  and cardholder information if payment is by credit card.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentType** | **String** | Type of payment, such as credit card, check by mail, or PayPal.  see Mozu.CommerceRuntime.Contracts.Payments.PaymentTypeConst for valid values |  [optional] |
|**paymentWorkflow** | **String** |  |  [optional] |
|**billingContact** | [**CommerceRuntimeContact**](CommerceRuntimeContact.md) |  |  [optional] |
|**isSameBillingShippingAddress** | **Boolean** | Indicates that billing and shipping address are the same |  [optional] |
|**card** | [**PaymentCard**](PaymentCard.md) |  |  [optional] |
|**token** | [**PaymentToken**](PaymentToken.md) |  |  [optional] |
|**purchaseOrder** | [**PurchaseOrderPayment**](PurchaseOrderPayment.md) |  |  [optional] |
|**check** | [**CheckPayment**](CheckPayment.md) |  |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**storeCreditCode** | **String** | The store credit to use for this purchase |  [optional] |
|**storeCreditType** | **String** | The type of store credit used for this purchase |  [optional] |
|**customCreditType** | **String** | Name of custom stored credit type |  [optional] |
|**externalTransactionId** | **String** | Transaction Id from third party payment source like Visa Checkout, Amazon |  [optional] |
|**isRecurring** | **Boolean** | Indicates whether the payment is used in recurring transactions. ex- subscription payments |  [optional] |
|**recurringTransactionId** | **String** | Recurring Payment Id returned by Payment Gateway  networkTransactionId for vantiv  previousTransactionId for cybersource etc |  [optional] |
|**data** | **Object** | Custom data from payment providers |  [optional] |


## Implemented Interfaces

* Serializable


