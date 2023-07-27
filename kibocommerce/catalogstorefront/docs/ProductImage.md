

# ProductImage

Image or video associated with a product.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**imageLabel** | **String** | Image title.  Unicode data with a maximum length of 50 characters. |  [optional] |
|**altText** | **String** | Descriptive text associated with the image. Unicode data with a maximum length of 200 characters. |  [optional] |
|**imageUrl** | **String** | Image URL. Unicode data with a maximum length of 4000 characters. |  [optional] |
|**cmsId** | **String** | Id of the image in the CMS. |  [optional] |
|**videoUrl** | **String** | URL of the video. Unicode data with a maximum length of 4000 characters. |  [optional] |
|**mediaType** | **String** | Type of media. Used by the client to determine how to render the image or video or what have you. |  [optional] |
|**sequence** | **Integer** | For products with multiple images, the sequence is the order in which this image appears. Whole number data. Required. |  [optional] |
|**productImageGroupId** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


