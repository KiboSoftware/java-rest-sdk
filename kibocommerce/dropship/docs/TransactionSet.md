

# TransactionSet

TransactionSet - Complete 850 Purchase Order Transaction Set Contains all segments and loops for a complete EDI 850 Purchase Order transaction

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**administrativeCommunicationsContact** | [**List&lt;AdministrativeCommunicationsContact&gt;**](AdministrativeCommunicationsContact.md) | PER - Administrative Communications Contact To identify a person or office to whom administrative communications should be directed |  [optional] |
|**advertisingDemographicInformation** | [**List&lt;Text&gt;**](Text.md) | ADV - Advertising Demographic Information To specify advertising demographic information |  [optional] |
|**beginningSegmentForPurchaseOrder** | [**List&lt;BeginningSegmentForPurchaseOrder&gt;**](BeginningSegmentForPurchaseOrder.md) | BEG - Beginning Segment for Purchase Order To indicate the beginning of the Purchase Order Transaction Set and transmit identifying numbers and dates |  [optional] |
|**carrierDetails** | [**List&lt;CarrierDetailsRoutingSequenceTransitTime&gt;**](CarrierDetailsRoutingSequenceTransitTime.md) | TD1 - Carrier Details (Quantity and Weight) To specify the transportation details relative to commodity, weight, and quantity |  [optional] |
|**carrierEquipmentDetails** | [**List&lt;CarrierDetailsRoutingSequenceTransitTime&gt;**](CarrierDetailsRoutingSequenceTransitTime.md) | TD3 - Carrier Details (Equipment) To specify transportation details relating to the equipment used by the carrier |  [optional] |
|**carrierSpecialHandling** | [**List&lt;CarrierDetailsRoutingSequenceTransitTime&gt;**](CarrierDetailsRoutingSequenceTransitTime.md) | TD4 - Carrier Details (Special Handling, or Hazardous Materials, or Both) To specify transportation special handling requirements, or hazardous materials, or both |  [optional] |
|**codeSourceInformation** | [**List&lt;Text&gt;**](Text.md) | LM - Code Source Information To transmit standard code list identification information |  [optional] |
|**ctTLoop** | [**List&lt;CTTLoop&gt;**](CTTLoop.md) | CTT Loop - Transaction Totals Loop Contains transaction totals and related monetary information |  [optional] |
|**currency** | [**List&lt;Currency&gt;**](Currency.md) | CUR - Currency To specify the currency (dollars, pounds, francs, etc.) used in a transaction |  [optional] |
|**dateTimeReference** | [**List&lt;DateTimeReference&gt;**](DateTimeReference.md) | DTM - Date/Time Reference To specify pertinent dates and times |  [optional] |
|**discountDetail** | [**List&lt;MonetaryAmountInformation&gt;**](MonetaryAmountInformation.md) | DIS - Discount Detail To specify the exact type and terms of various discount information |  [optional] |
|**extendedReferenceLoop** | [**List&lt;N9Loop&gt;**](N9Loop.md) | N9 Loop - Extended Reference Information Loop Contains extended reference information and related text |  [optional] |
|**installmentInformation** | [**List&lt;MonetaryAmountInformation&gt;**](MonetaryAmountInformation.md) | INC - Installment Information To specify installment billing arrangement information |  [optional] |
|**itemIdentification** | [**List&lt;BaselineItemData&gt;**](BaselineItemData.md) | LIN - Item Identification To specify basic item identification data |  [optional] |
|**leadTime** | [**List&lt;DateTimeReference&gt;**](DateTimeReference.md) | LDT - Lead Time To specify lead time for availability of products and services |  [optional] |
|**marksAndNumbers** | [**List&lt;Text&gt;**](Text.md) | MAN - Marks and Numbers To indicate identifying marks and numbers for shipping containers |  [optional] |
|**measurements** | [**List&lt;ItemPhysicalDetails&gt;**](ItemPhysicalDetails.md) | MEA - Measurements To specify physical measurements or counts, including dimensions, tolerances, variances, and weights |  [optional] |
|**n1Loop** | [**List&lt;N1Loop&gt;**](N1Loop.md) | N1 Loop - Party Identification Loop Contains party information including identification, additional names, location, and geographic details |  [optional] |
|**pO1Loop** | [**List&lt;PO1Loop&gt;**](PO1Loop.md) | PO1 Loop - Baseline Item Data Loop Contains complete line item information including baseline data, pricing, physical details, and related segments |  [optional] |
|**packagingInformation** | [**List&lt;Text&gt;**](Text.md) | PKG - Marking, Packaging, Loading To describe marking, packaging, loading, and unloading requirements |  [optional] |
|**paperwork** | [**List&lt;Text&gt;**](Text.md) | PWK - Paperwork To identify the type or transmission or both of paperwork or supporting information |  [optional] |
|**periodAmount** | [**List&lt;MonetaryAmountInformation&gt;**](MonetaryAmountInformation.md) | PAM - Period Amount To indicate a quantity, and/or amount for an identified period |  [optional] |
|**pricingInformation** | [**List&lt;PricingInformation&gt;**](PricingInformation.md) | CTP - Pricing Information To specify pricing information |  [optional] |
|**productItemDescription** | [**List&lt;ProductItemDescription&gt;**](ProductItemDescription.md) | PID - Product/Item Description To describe a product or process in coded or free-form format |  [optional] |
|**referenceInformation** | [**List&lt;ReferenceInformation&gt;**](ReferenceInformation.md) | REF - Reference Information To specify identifying information |  [optional] |
|**salesRequirements** | [**List&lt;SalesRequirements&gt;**](SalesRequirements.md) | CSH - Sales Requirements To specify sales conditions |  [optional] |
|**serviceCharacteristic** | [**List&lt;ProductItemDescription&gt;**](ProductItemDescription.md) | SI - Service Characteristic Identification To specify service characteristic data |  [optional] |
|**servicePromotionAllowanceChargeLoop** | [**List&lt;SACLoop&gt;**](SACLoop.md) | SAC Loop - Service, Promotion, Allowance, or Charge Information Loop To request or identify a service, promotion, allowance, or charge; or to report a condition |  [optional] |
|**specificationIdentifier** | [**List&lt;ProductItemDescription&gt;**](ProductItemDescription.md) | SPI - Specification Identifier To provide a description of the included specification or technical data items |  [optional] |
|**taxReference** | [**List&lt;ReferenceInformation&gt;**](ReferenceInformation.md) | TAX - Tax Reference To specify tax information |  [optional] |
|**termsOfSaleDeferredTermsOfSale** | [**List&lt;TermsOfSaleDeferredTermsOfSale&gt;**](TermsOfSaleDeferredTermsOfSale.md) | ITD - Terms of Sale/Deferred Terms of Sale To specify terms of sale |  [optional] |
|**transactionSetHeader** | [**List&lt;TransactionSetHeader&gt;**](TransactionSetHeader.md) | ST - Transaction Set Header To indicate the start of a transaction set and to assign a control number |  [optional] |
|**transactionSetTrailer** | [**List&lt;TransactionSetTrailer&gt;**](TransactionSetTrailer.md) | SE - Transaction Set Trailer To indicate the end of the transaction set and provide the count of the transmitted segments (including the beginning (ST) and ending (SE) segments) |  [optional] |


## Implemented Interfaces

* Serializable


