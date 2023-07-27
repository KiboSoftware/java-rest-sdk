

# ProductLocalizedSEOContent

Container for language-specific content to display on the storefront. You'll have a container for each supported language (LocaleCode). This enables you to display a product in multiple languages yet manage it as a single product internally.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**localeCode** | **String** | Lanugage used for product content. Currently, only en_US is supported. |  [optional] |
|**metaTagTitle** | **String** | Metadata title. Metadata can be used to manage information internally. Sometimes used for SEO. |  [optional] |
|**metaTagDescription** | **String** | Metadata description. Metadata can be used to manage information internally. Sometimes used for SEO. |  [optional] |
|**metaTagKeywords** | **String** | Metadata keywords. Metadata can be used to manage information internally. Sometimes used for SEO. |  [optional] |
|**titleTagTitle** | **String** | Used to customize the HTML title tag within the head section of the product details page |  [optional] |
|**seoFriendlyUrl** | **String** | Human-readable identifier that you can give to the product to create friendly URLs. For example,   instead of \&quot;http: //example.com/products?category&#x3D;2&amp;id&#x3D;25,\&quot; the friendly URL can be \&quot;http: //example.com/products/category/2/25.\&quot; |  [optional] |


## Implemented Interfaces

* Serializable


