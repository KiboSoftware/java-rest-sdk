

# HeadlessAppRuntimeLog

Response object representing a s3 object containing headless storefront runtime logs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | The key for the s3 log object. |  [optional] |
|**lastModified** | **OffsetDateTime** | The last modified datetime |  [optional] |
|**logUrl** | **String** | The presigned URL to download the log collection, valid for 4 hours. |  [optional] |
|**size** | **Long** | The size of the log collection |  [optional] |


## Implemented Interfaces

* Serializable


