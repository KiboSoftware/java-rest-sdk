

# DiscountLocalizedContent

Container for the language-specific name of the discount. You will have a container for each supported language (LocaleCode). This enables you to display the discount name in multiple languages yet manage it as a single discount internally.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**customPropertyValues** | [**CustomPropertyValues**](CustomPropertyValues.md) |  |  [optional] |
|**friendlyDescription** | **String** | Promotional text or HTML that can be utilized as friendly content like \&quot;Buy this product now and get X!\&quot; |  [optional] |
|**localeCode** | **String** | Lanugage used for the discount in the current catalog. Defaults setting for the active catalog. |  [optional] |
|**name** | **String** | Name of the discount. |  |


## Implemented Interfaces

* Serializable


