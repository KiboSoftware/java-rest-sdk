

# HeadlessAppRuntimeLogResponse

Response object for looking up headless storefront runtime logs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isTruncated** | **Boolean** | Flag to indicate if all results were returned. If IsTruncated is true, use NextToken to retrieve additional results. |  [optional] |
|**logs** | [**List&lt;HeadlessAppRuntimeLog&gt;**](HeadlessAppRuntimeLog.md) | A list of items representing headless application build jobs. |  [optional] |
|**maxResults** | **Integer** | The max result provided in runtime log lookup |  [optional] |
|**nextToken** | **String** | A token used for paginating through runtime logs on subsequent requests. |  [optional] |
|**prefix** | **String** | The prefix provided in runtime log lookup |  [optional] |


## Implemented Interfaces

* Serializable


