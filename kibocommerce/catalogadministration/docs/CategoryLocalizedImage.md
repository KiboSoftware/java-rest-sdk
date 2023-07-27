

# CategoryLocalizedImage

Contains the image label and alternate text for a category image or video in the language specified by LocalCode.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the image. System-supplied and read-only. |  [optional] |
|**localeCode** | **String** | Language used for the image content. |  [optional] |
|**imageLabel** | **String** | Image title that appears on the storefront. |  [optional] |
|**altText** | **String** | Descriptive text associated with the image or video that appears on the storefront. |  [optional] |
|**imageUrl** | **String** | URL of the image. |  [optional] |
|**cmsId** | **String** | Id of the image in the CMS. |  [optional] |
|**videoUrl** | **String** | URL of a video associated with the category. |  [optional] |
|**mediaType** | **String** | Type of media. Used by the client to determine how to render the image or video or what have you. |  [optional] |
|**sequence** | **Integer** | For categories with multiple images, the order in which this image appears on the storefront. |  [optional] |


## Implemented Interfaces

* Serializable


