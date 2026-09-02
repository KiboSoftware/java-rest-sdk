

# PO1Loop

PO1 Loop - Baseline Item Data Loop Contains complete line item information including baseline data, pricing, physical details, and related segments

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**administrativeCommunicationsContact** | [**List&lt;AdministrativeCommunicationsContact&gt;**](AdministrativeCommunicationsContact.md) | PER - Administrative Communications Contact To identify a person or office to whom administrative communications should be directed |  [optional] |
|**baselineItemData** | [**List&lt;BaselineItemData&gt;**](BaselineItemData.md) | PO1 - Baseline Item Data To specify basic and most frequently used line item data |  [optional] |
|**carrierDetailsRoutingSequenceTransitTime** | [**List&lt;CarrierDetailsRoutingSequenceTransitTime&gt;**](CarrierDetailsRoutingSequenceTransitTime.md) | TD5 - Carrier Details (Routing Sequence/Transit Time) To specify the carrier and sequence of routing and provide transit time information |  [optional] |
|**conditionsOfSale** | [**List&lt;SalesRequirements&gt;**](SalesRequirements.md) | IT8 - Conditions of Sale To specify the conditions under which the sale is made |  [optional] |
|**currency** | [**List&lt;Currency&gt;**](Currency.md) | CUR - Currency To specify the currency (dollars, pounds, francs, etc.) used in a transaction |  [optional] |
|**dateTimeReference** | [**List&lt;DateTimeReference&gt;**](DateTimeReference.md) | DTM - Date/Time Reference To specify pertinent dates and times |  [optional] |
|**discountDetail** | [**List&lt;MonetaryAmountInformation&gt;**](MonetaryAmountInformation.md) | DIS - Discount Detail To specify the exact type and terms of various discount information |  [optional] |
|**installmentInformation** | [**List&lt;MonetaryAmountInformation&gt;**](MonetaryAmountInformation.md) | INC - Installment Information To specify installment billing arrangement information |  [optional] |
|**itemIdentification** | [**List&lt;BaselineItemData&gt;**](BaselineItemData.md) | LIN - Item Identification To specify basic item identification data |  [optional] |
|**itemPhysicalDetails** | [**List&lt;ItemPhysicalDetails&gt;**](ItemPhysicalDetails.md) | PO4 - Item Physical Details To specify physical measurements or counts, including dimensions, tolerances, variances, and weights |  [optional] |
|**leadTime** | [**List&lt;DateTimeReference&gt;**](DateTimeReference.md) | LDT - Lead Time To specify lead time for availability of products and services |  [optional] |
|**loopHeaderTrailer** | [**List&lt;Text&gt;**](Text.md) | LS/LE - Loop Header/Loop Trailer To indicate that the next segment begins a loop |  [optional] |
|**monetaryAmountInformation** | [**List&lt;MonetaryAmountInformation&gt;**](MonetaryAmountInformation.md) | AMT - Monetary Amount Information To indicate the total monetary amount |  [optional] |
|**n1Loop** | [**List&lt;N1Loop&gt;**](N1Loop.md) | N1 Loop - Party Identification Loop Contains party information for the line item |  [optional] |
|**packagingInformation** | [**List&lt;Text&gt;**](Text.md) | PKG - Marking, Packaging, Loading To describe marking, packaging, loading, and unloading requirements |  [optional] |
|**packagingLoop** | [**List&lt;Text&gt;**](Text.md) | PKG - Marking, Packaging, Loading Loop Contains packaging information and related details |  [optional] |
|**paperwork** | [**List&lt;Text&gt;**](Text.md) | PWK - Paperwork To identify the type or transmission or both of paperwork or supporting information |  [optional] |
|**paperworkLoop** | [**List&lt;Text&gt;**](Text.md) | PWK - Paperwork Loop Contains paperwork identification and related information |  [optional] |
|**piDLoop** | [**List&lt;PIDLoop&gt;**](PIDLoop.md) | PID - Product/Item Description To describe a product or process in coded or free-form format |  [optional] |
|**pricingLoop** | [**List&lt;CTPLoop&gt;**](CTPLoop.md) | CTP - Pricing Information To specify pricing information |  [optional] |
|**productItemDescriptionLoop** | [**List&lt;PIDLoop&gt;**](PIDLoop.md) | PID Loop - Product/Item Description Loop Contains product/item descriptions and related information |  [optional] |
|**referenceInformation** | [**List&lt;ReferenceInformation&gt;**](ReferenceInformation.md) | REF - Reference Information To specify identifying information |  [optional] |
|**salesRequirements** | [**List&lt;SalesRequirements&gt;**](SalesRequirements.md) | CSH - Sales Requirements To specify sales conditions |  [optional] |
|**serviceCharacteristic** | [**List&lt;ProductItemDescription&gt;**](ProductItemDescription.md) | SI - Service Characteristic Identification To specify service characteristic data |  [optional] |
|**servicePromotionAllowanceChargeLoop** | [**List&lt;SACLoop&gt;**](SACLoop.md) | SAC - Service, Promotion, Allowance, or Charge Information To request or identify a service, promotion, allowance, or charge; or to report a condition |  [optional] |
|**sublineItemDetail** | [**List&lt;BaselineItemData&gt;**](BaselineItemData.md) | SLN - Subline Item Detail To specify product subline detail item data |  [optional] |
|**termsOfSale** | [**List&lt;TermsOfSaleDeferredTermsOfSale&gt;**](TermsOfSaleDeferredTermsOfSale.md) | ITD - Terms of Sale/Deferred Terms of Sale To specify terms of sale |  [optional] |


## Implemented Interfaces

* Serializable


