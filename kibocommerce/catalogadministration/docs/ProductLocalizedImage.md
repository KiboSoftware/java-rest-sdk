

# ProductLocalizedImage

Contains the image label and alternate text for a product image or video in the language specified by LocalCode.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**altText** | **String** | Descriptive text associated with the image or video that appears on the storefront. |  [optional] |
|**cmsId** | **String** | Id of the image in the CMS. |  [optional] |
|**id** | **Integer** | Unique identifier of the image. System-supplied and read-only. |  [optional] |
|**imageLabel** | **String** | Image title that appears on the storefront. |  [optional] |
|**imageUrl** | **String** | URL of the image. |  [optional] |
|**localeCode** | **String** | Language used for the image content. |  [optional] |
|**mediaType** | **String** | Type of media. Used by the client to determine how to render the image or video or what have you. |  [optional] |
|**productImageGroupId** | **String** | Image group to which this image belongs.  Default is null. |  [optional] |
|**sequence** | **Integer** | For products with multiple images, the order in which this image appears on the storefront. |  [optional] |
|**videoUrl** | **String** | URL of a video associated with the product. |  [optional] |


## Implemented Interfaces

* Serializable


