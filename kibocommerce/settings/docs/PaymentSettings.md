

# PaymentSettings

Payment gateway settings defined for this site. A payment gateway is an e-commerce application service provider that authorizes   payments for e-businesses and online retailers. You can define multiple payment gateway settings but only one is active at a time.   Authorize.net is the only payment gateway supported currently.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gateways** | [**List&lt;Gateway&gt;**](Gateway.md) |  |  [optional] |
|**externalPaymentWorkflowDefinitions** | [**List&lt;ExternalPaymentWorkflowDefinition&gt;**](ExternalPaymentWorkflowDefinition.md) |  |  [optional] |
|**payByMail** | **Boolean** |  |  [optional] |
|**purchaseOrder** | [**PurchaseOrderPaymentDefinition**](PurchaseOrderPaymentDefinition.md) |  |  [optional] |
|**jobSettings** | [**OrderJobSettings**](OrderJobSettings.md) |  |  [optional] |
|**paymentRanking** | **String** |  |  [optional] |
|**refundRanking** | **String** |  |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


