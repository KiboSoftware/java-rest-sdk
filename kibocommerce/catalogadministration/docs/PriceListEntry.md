

# PriceListEntry

Category

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**priceListCode** | **String** | External unique identifier of the PriceList. Must be unique an only contain url sanitized characters. Max length is  50 |  [optional] |
|**priceListEntrySequence** | **Integer** |  |  [optional] |
|**productCode** | **String** |  |  |
|**productName** | **String** |  |  [optional] |
|**isVariation** | **Boolean** |  |  [optional] |
|**options** | [**List&lt;CatalogAdminsProductOption&gt;**](CatalogAdminsProductOption.md) |  |  [optional] |
|**currencyCode** | **String** |  |  |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**priceListEntryMode** | **String** |  |  [optional] |
|**priceListEntryTypeCode** | **String** |  |  [optional] |
|**discountsRestrictedMode** | **String** |  |  [optional] |
|**discountsRestricted** | **Boolean** |  |  [optional] |
|**discountsRestrictedStartDate** | **OffsetDateTime** |  |  [optional] |
|**discountsRestrictedEndDate** | **OffsetDateTime** |  |  [optional] |
|**msrpMode** | **String** |  |  [optional] |
|**msrp** | **Double** |  |  [optional] |
|**mapMode** | **String** |  |  [optional] |
|**map** | **Double** |  |  [optional] |
|**mapStartDate** | **OffsetDateTime** |  |  [optional] |
|**mapEndDate** | **OffsetDateTime** |  |  [optional] |
|**costMode** | **String** |  |  [optional] |
|**cost** | **Double** |  |  [optional] |
|**priceEntries** | [**List&lt;PriceListEntryPrice&gt;**](PriceListEntryPrice.md) |  |  [optional] |
|**extraEntries** | [**List&lt;PriceListEntryExtra&gt;**](PriceListEntryExtra.md) |  |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


