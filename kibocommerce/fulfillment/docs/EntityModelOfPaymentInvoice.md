

# EntityModelOfPaymentInvoice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**Links**](Links.md) |  |  [optional] |
|**currency** | **String** |  |  [optional] |
|**data** | **Object** |  |  [optional] |
|**invoiceDate** | **OffsetDateTime** |  |  [optional] |
|**invoiceNumber** | **String** |  |  [optional] |
|**lineItems** | [**List&lt;InvoiceLineItem&gt;**](InvoiceLineItem.md) |  |  [optional] |
|**rawEdiData** | **String** |  |  [optional] |
|**references** | [**InvoiceReferences**](InvoiceReferences.md) |  |  [optional] |
|**taxes** | [**List&lt;InvoiceTax&gt;**](InvoiceTax.md) |  |  [optional] |
|**terms** | [**InvoiceTerms**](InvoiceTerms.md) |  |  [optional] |
|**totalAmount** | **BigDecimal** |  |  [optional] |
|**vendor** | [**InvoiceVendor**](InvoiceVendor.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


