

# PaymentInteraction

A single interaction of a potential list of intereactions for a transaction. The scope of the transaction is the entire payment  interchange. It is created upon authorization and is used for all subsequent interactions performed against the authorize,  such as consecutive captures.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of this payment transaction interaction. |  [optional] |
|**gatewayInteractionId** | **Integer** | Unique identifier of the gateway interaction. Used for credit card transactions, where the  payment service creates a GatewayInteractionId for each transaction interaction. |  [optional] |
|**paymentId** | **String** | Unique identifier of the original transaction of which this current interaction is a part. |  [optional] |
|**orderId** | **String** | Unique identifier of the order with which this transaction is associated. |  [optional] |
|**target** | [**PaymentActionTarget**](PaymentActionTarget.md) |  |  [optional] |
|**currencyCode** | **String** | ISO currency code for the transaction. Currently, only USD is supported. |  [optional] |
|**interactionType** | **String** | Types of transaction interactions which can be \&quot;Authorization,\&quot; \&quot;Capture,\&quot; \&quot;AuthorizeAndCapture,\&quot;  \&quot;Void,\&quot; or \&quot;Credit,\&quot; \&quot;CheckRequested,\&quot; or \&quot;CheckReceived.\&quot; |  [optional] |
|**checkNumber** | **String** | If paying by check, the check number. |  [optional] |
|**status** | **String** | Status of the payment transaction interaction which can be either \&quot;Success\&quot; or \&quot;Failure.\&quot; |  [optional] |
|**paymentEntryStatus** | **String** | Status of the payment when the transaction interaction was created |  [optional] |
|**isRecurring** | **Boolean** | If true, the product is purchased or fulfilled at regular intervals, for example, a monthly billing or a subscription. (Not currently implemented.) |  [optional] |
|**isManual** | **Boolean** | If the payment is a manual payment, this is set to true |  [optional] |
|**gatewayTransactionId** | **String** | Unique identifier of the transaction supplied by PCIaaS. |  [optional] |
|**gatewayAuthCode** | **String** | If required by the payment gateway, the authorization code of the transaction. Supplied by PCIaaS. |  [optional] |
|**gatewayAVSCodes** | **String** | Gateway AVS Codes. Supplied by PCIaaS. |  [optional] |
|**gatewayCVV2Codes** | **String** | Gateway CVV2 Codes. Supplied by PCIaaS. |  [optional] |
|**gatewayResponseCode** | **String** | Gateway response code. Supplied by PCIaaS. |  [optional] |
|**gatewayResponseText** | **String** | Gateway response text. Supplied by PCIaaS. |  [optional] |
|**gatewayResponseData** | [**List&lt;PaymentGatewayResponseData&gt;**](PaymentGatewayResponseData.md) | A List of payment response data required to act on authorization when using external order management systems |  [optional] |
|**paymentTransactionInteractionIdReference** | **Integer** | Unique identifier of previous PaymentTransactionInteraction that this PaymentTransactionInteraction is modifying.  For instance, when crediting a capture, set the PaymentTransactionInteractionIdReference to the capture PaymentTransactionInteractionID. |  [optional] |
|**amount** | **Double** | Amount of funds associated with this interaction. |  [optional] |
|**note** | **String** | Note to be entered by merchant/application |  [optional] |
|**interactionDate** | **OffsetDateTime** | Date the interaction occurred |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**returnId** | **String** | Return Id, if the interaction is a Credit for a return-refund. |  [optional] |
|**refundId** | **String** | Refund Id, if the interaction is for a stand alone refund. |  [optional] |
|**capturableShipmentsSummary** | [**List&lt;CapturableShipmentSummary&gt;**](CapturableShipmentSummary.md) | Stores pairings of shipment number to shipment total for all captured shipments. This was added for generating TLogs. |  [optional] |


## Implemented Interfaces

* Serializable


