

# ExternalPaymentToken

Structured payment token for external (non-Mozu) payment processors.  Distinct from legacy PaymentToken (Apple Pay / PayPal).  Used in COM-10873 externally tokenized payments feature.  Validation rules: - All three fields (PaymentServiceTokenId, Type, Provider) are required - Type must match BillingInfo.PaymentType (case-insensitive) - Feature gate (externalTokenizationEnabled) must be true

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentServiceTokenId** | **String** | Actual token value from the external payment provider. |  [optional] |
|**provider** | **String** | External token provider identifier (e.g., \&quot;Stripe\&quot;, \&quot;Square\&quot;, \&quot;PayPal\&quot;). |  [optional] |
|**type** | **String** | Payment method type (e.g., \&quot;CreditCard\&quot;, \&quot;PayPal\&quot;, \&quot;ApplePay\&quot;). Must match BillingInfo.PaymentType exactly (case-insensitive). |  [optional] |


## Implemented Interfaces

* Serializable


