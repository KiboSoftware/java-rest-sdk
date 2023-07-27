

# Payment

Payment transaction associated with this order. It is the entire payment interchange between the merchant who is forwarding the customer's payment   information and the payment service who is authorizing and capturing payment. Payment can be either by credit card, check, or PayPal. (PayPal not  currently supported.)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of this order transaction. |  [optional] |
|**groupId** | [**PaymentActionTarget**](PaymentActionTarget.md) |  |  [optional] |
|**paymentServiceTransactionId** | **String** | Unique identifier of the transaction, specified by the payment service processesing this transaction. |  [optional] |
|**availableActions** | **List&lt;String&gt;** | Actions available to the payment |  [optional] |
|**orderId** | **String** | Unique identifier of the order with which this transaction is associated. |  [optional] |
|**paymentType** | **String** | Type of Payment |  [optional] |
|**paymentWorkflow** | **String** | The source of data for this payment.  By default, this will be set to &#39;mozu&#39; |  [optional] |
|**externalTransactionId** | **String** | The external/third party transaction Id for this payment. This is used to store the transaction Id from digital wallet like Visa Checkout |  [optional] |
|**billingInfo** | [**BillingInfo**](BillingInfo.md) |  |  [optional] |
|**data** | **Object** | Custom data from payment providers |  [optional] |
|**status** | **String** | Current status of this transaction which are described by the PaymentStatusConst class. |  [optional] |
|**subPayments** | [**List&lt;SubPayment&gt;**](SubPayment.md) | List of sub payments that correspond to child orders in case of multiship orders. |  [optional] |
|**interactions** | [**List&lt;PaymentInteraction&gt;**](PaymentInteraction.md) | List of intereactions for this transaction. A transaction is created upon authorization and lasts across the payment   interchange, which can consist of multiple interactions, such as consecutive captures. |  [optional] |
|**isRecurring** | **Boolean** | If true, the product is purchased or fulfilled at regular intervals, for example,   monthly billing or a subscription. (Not currently supported.) |  [optional] |
|**amountCollected** | **Double** | Amount collected on the payment |  [optional] |
|**amountCredited** | **Double** | Amount credited back to the payment. |  [optional] |
|**amountRequested** | **Double** | Derived from the Amount on the initial payment create, used to help storefront determine how much can be captured for multiple payments.  See Order.AmountRemainingForPayment for an example. |  [optional] |
|**changeMessages** | [**List&lt;CommerceRuntimeChangeMessage&gt;**](CommerceRuntimeChangeMessage.md) | Change messages related to the payment. |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**gatewayGiftCard** | [**GatewayGiftCard**](GatewayGiftCard.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


