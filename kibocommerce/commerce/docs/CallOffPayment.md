

# CallOffPayment

Optional payment commitment on a call-off order. v1 supports only PurchaseOrder payment type. At release, this payment is mapped onto each sibling Sales Order via `IPaymentHandler.CreatePaymentActionAsync` with Amount = that order's Total.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Double** | Optional total authorization amount. Defaults to the call-off TotalAmount when null. Per-destination Sales Order payment uses that order&#39;s individual Total. |  [optional] |
|**billingInfo** | [**BillingInfo**](BillingInfo.md) |  |  [optional] |
|**data** | **Object** | ERP / extensibility data bag. |  [optional] |
|**paymentTerms** | **String** | Payment terms code (e.g. \&quot;Net30\&quot;). Optional; defaults to B2B account terms downstream. |  [optional] |
|**paymentType** | **String** | Payment type — only &#x60;PurchaseOrder&#x60; is supported in v1. See Mozu.CommerceRuntime.Contracts.CallOffOrders.CallOffPayment.PaymentTypeConst. |  [optional] |
|**purchaseOrderNumber** | **String** | Buyer&#39;s PO number. Required when Mozu.CommerceRuntime.Contracts.CallOffOrders.CallOffPayment.PaymentType is PurchaseOrder. |  [optional] |


## Implemented Interfaces

* Serializable


