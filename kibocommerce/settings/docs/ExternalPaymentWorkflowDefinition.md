

# ExternalPaymentWorkflowDefinition

This class describes credentials and enablement for the various third-party payment workflows that we will integrate with.  Examples include Paypal Express, Amazon Payments, Google Wallet, etc.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Should be one of Contracts.Constants.ThirdPartyWorkflowNames. |  [optional] |
|**namespace** | **String** |  |  [optional] |
|**fullyQualifiedName** | **String** |  |  [optional] |
|**description** | **String** | Information about this definition for display purposes in the &#39;Payment and Checkout Settings&#39;  admin ui.  This field may contain valid html tags |  [optional] |
|**isEnabled** | **Boolean** |  |  [optional] |
|**isLegacy** | **Boolean** | Indicates if this is a legacy implementation using ARC only  or using the new extensible implementation. |  [optional] |
|**credentials** | [**List&lt;ThirdPartyCredentialField&gt;**](ThirdPartyCredentialField.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


