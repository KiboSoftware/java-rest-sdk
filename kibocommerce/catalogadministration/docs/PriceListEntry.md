

# PriceListEntry

Category

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**cost** | **Double** |  |  [optional] |
|**costMode** | **String** |  |  [optional] |
|**currencyCode** | **String** |  |  |
|**discountsRestricted** | **Boolean** |  |  [optional] |
|**discountsRestrictedEndDate** | **OffsetDateTime** |  |  [optional] |
|**discountsRestrictedMode** | **String** |  |  [optional] |
|**discountsRestrictedStartDate** | **OffsetDateTime** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**extraEntries** | [**List&lt;PriceListEntryExtra&gt;**](PriceListEntryExtra.md) |  |  [optional] |
|**isVariation** | **Boolean** |  |  [optional] |
|**map** | **Double** |  |  [optional] |
|**mapEndDate** | **OffsetDateTime** |  |  [optional] |
|**mapMode** | **String** |  |  [optional] |
|**mapStartDate** | **OffsetDateTime** |  |  [optional] |
|**msrp** | **Double** |  |  [optional] |
|**msrpMode** | **String** |  |  [optional] |
|**options** | [**List&lt;CatalogAdminsProductOption&gt;**](CatalogAdminsProductOption.md) |  |  [optional] |
|**priceEntries** | [**List&lt;PriceListEntryPrice&gt;**](PriceListEntryPrice.md) |  |  [optional] |
|**priceListCode** | **String** | External unique identifier of the PriceList. Must be unique an only contain url sanitized characters. Max length is 50 |  [optional] |
|**priceListEntryMode** | **String** |  |  [optional] |
|**priceListEntrySequence** | **Integer** |  |  [optional] |
|**priceListEntryTypeCode** | **String** |  |  [optional] |
|**productCode** | **String** |  |  |
|**productName** | **String** |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |


## Implemented Interfaces

* Serializable


