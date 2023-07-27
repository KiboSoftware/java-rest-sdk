

# CategoryLocalizedContent

Container for language-specific content to display on the storefront. You'll have a container for each supported language (LocaleCode). This enables you to display a category in multiple languages yet manage it as a single category internally.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**categoryImages** | [**List&lt;CategoryLocalizedImage&gt;**](CategoryLocalizedImage.md) | List of images associated with the category. |  [optional] |
|**name** | **String** | Name of the category. |  [optional] |
|**description** | **String** | Description of the category to display on the storefront. |  [optional] |
|**pageTitle** | **String** | Title that appears at the top of new pages. |  [optional] |
|**localeCode** | **String** | Lanugage used for category content. Currently, only en_US is supported. |  [optional] |
|**metaTagTitle** | **String** | Metadata title. Metadata can be used to manage information internally. Sometimes used for SEO. |  [optional] |
|**metaTagDescription** | **String** | Metadata description. Metadata can be used to manage information internally. Sometimes used for SEO. |  [optional] |
|**metaTagKeywords** | **String** | Metadata keywords. Metadata can be used to manage information internally. Sometimes used for SEO. |  [optional] |
|**slug** | **String** | Human-readable identifier that you can give to the category to create friendly URLs. For example,   instead of \&quot;http: //example.com/products?category&#x3D;2&amp;id&#x3D;25,\&quot; the friendly URL can be \&quot;http: //example.com/products/category/2/25.\&quot; |  [optional] |


## Implemented Interfaces

* Serializable


