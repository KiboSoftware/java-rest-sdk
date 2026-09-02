

# PaymentGatewayInteraction

Represents a manually entered payment gateway interaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gatewayAVSCodes** | **String** | Not populated by incoming request. |  [optional] |
|**gatewayAuthCode** | **String** | Gateway Transaction Id from PCIaaS.  Not populated by incoming request. |  [optional] |
|**gatewayCVV2Codes** | **String** | Not populated by incoming request. |  [optional] |
|**gatewayInteractionId** | **Integer** | Gateway Transaction Id from PCIaaS.  Not populated by incoming request. |  [optional] |
|**gatewayResponseCode** | **String** | Not populated by incoming request. |  [optional] |
|**gatewayResponseText** | **String** | Gateway response text. Supplied by PCIaaS. |  [optional] |
|**gatewayTransactionId** | **String** | Gateway Transaction Id from PCIaaS.  Not populated by incoming request. |  [optional] |
|**isOrderRefund** | **Boolean** | Indicates the manual interaction is for a refund on an order. |  [optional] |


## Implemented Interfaces

* Serializable


