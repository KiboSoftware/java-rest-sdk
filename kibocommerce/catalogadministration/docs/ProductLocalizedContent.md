

# ProductLocalizedContent

Container for language-specific content to display on the storefront. You'll have a container for each supported language (LocaleCode). This enables you to display a product in multiple languages yet manage it as a single product internally.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**localeCode** | **String** | Lanugage used for product content. Currently, only en_US is supported. |  [optional] |
|**productName** | **String** | Name of the product. |  [optional] |
|**productFullDescription** | **String** | Long description of the product typically used for a product details page. |  [optional] |
|**productShortDescription** | **String** | Brief description of the product typically used when the product is displayed in a list or search results. |  [optional] |
|**productImages** | [**List&lt;ProductLocalizedImage&gt;**](ProductLocalizedImage.md) | List of images associated with the product. |  [optional] |


## Implemented Interfaces

* Serializable


