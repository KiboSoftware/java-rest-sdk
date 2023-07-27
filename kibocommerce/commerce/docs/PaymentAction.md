

# PaymentAction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionName** | **String** | Name of the Action to post |  [optional] |
|**currencyCode** | **String** | ISO currency code for the transaction. Currently, only USD is supported. |  [optional] |
|**checkNumber** | **String** | If paying by check, the check number. |  [optional] |
|**returnUrl** | **String** | If paying by Paypal Express or some other potential non-gateway payment provider, a return redirect URL must be provided. |  [optional] |
|**cancelUrl** | **String** | If paying by Paypal Express or some other potential non-gateway payment provider, a cancel redirect URL must be provided.  This will be used if something goes wrong on the third-party side. |  [optional] |
|**amount** | **Double** | Amount of funds to withdraw to pay for this order. |  [optional] |
|**interactionDate** | **OffsetDateTime** | Date the interaction occurred |  [optional] |
|**newBillingInfo** | [**BillingInfo**](BillingInfo.md) |  |  [optional] |
|**referenceSourcePaymentId** | **String** | Reference payment id from which to copy the billing info. |  [optional] |
|**manualGatewayInteraction** | [**PaymentGatewayInteraction**](PaymentGatewayInteraction.md) |  |  [optional] |
|**externalTransactionId** | **String** |  |  [optional] |
|**data** | **Object** | Custom data from payment providers |  [optional] |
|**recaptcha** | **String** | Recaptcha for validation. |  [optional] |


## Implemented Interfaces

* Serializable


