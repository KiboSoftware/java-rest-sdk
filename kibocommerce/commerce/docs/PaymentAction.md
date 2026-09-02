

# PaymentAction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionName** | **String** | Name of the Action to post |  [optional] |
|**amount** | **Double** | Amount of funds to withdraw to pay for this order. |  [optional] |
|**cancelUrl** | **String** | If paying by Paypal Express or some other potential non-gateway payment provider, a cancel redirect URL must be provided. This will be used if something goes wrong on the third-party side. |  [optional] |
|**checkNumber** | **String** | If paying by check, the check number. |  [optional] |
|**currencyCode** | **String** | ISO currency code for the transaction. Currently, only USD is supported. |  [optional] |
|**data** | **Object** | Custom data from payment providers |  [optional] |
|**externalTransactionId** | **String** |  |  [optional] |
|**installmentPlanCode** | **String** | Stores the Installment Plan code. Installment is only supported on subscription orders |  [optional] |
|**interactionDate** | **OffsetDateTime** | Date the interaction occurred |  [optional] |
|**manualGatewayInteraction** | [**PaymentGatewayInteraction**](PaymentGatewayInteraction.md) |  |  [optional] |
|**newBillingInfo** | [**BillingInfo**](BillingInfo.md) |  |  [optional] |
|**recaptcha** | **String** | Recaptcha for validation. |  [optional] |
|**referenceSourcePaymentId** | **String** | Reference payment id from which to copy the billing info. |  [optional] |
|**returnUrl** | **String** | If paying by Paypal Express or some other potential non-gateway payment provider, a return redirect URL must be provided. |  [optional] |


## Implemented Interfaces

* Serializable


