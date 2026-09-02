

# FetchFileConfigRequest

Request for Fetch File Configs

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Object** |  |  |
|**blankQuantityIsZero** | **Object** |  |  [optional] |
|**ignoreExtraFields** | **Object** |  |  [optional] |
|**multipleFiles** | **Object** |  |  [optional] |
|**refreshEnabled** | **Object** |  |  [optional] |
|**updateEnabled** | **Object** |  |  [optional] |
|**useControlFile** | **Object** |  |  [optional] |
|**zeroOutNegatives** | **Object** |  |  [optional] |
|**archiveBucket** | **String** | S3 Archive Bucket |  [optional] |
|**bucket** | **String** | S3 Bucket |  [optional] |
|**csvDelimiter** | **String** | Delimiter |  [optional] |
|**emailList** | **String** | Email List |  [optional] |
|**fetchFileConfigID** | **Integer** | Fetch File Config ID |  [optional] |
|**fieldNameMap** | **List&lt;String&gt;** | List of field names |  [optional] |
|**ftpPassword** | **String** | FTP server password |  |
|**ftpPort** | **Integer** | FTP server port |  [optional] |
|**ftpRemotePath** | **String** | FTP server remote path |  |
|**ftpRemotePathArchive** | **String** | FTP server remote path archive |  [optional] |
|**ftpServer** | **String** | FTP server address |  |
|**ftpUsername** | **String** | FTP server username |  |
|**lockName** | **String** | Lock name |  |
|**postProcessAction** | **Integer** | Enum denoting action post processing |  |
|**productMapping** | [**ProductMappingEnum**](#ProductMappingEnum) | Enum for fetch file productMapping |  [optional] |
|**refreshFileDescription** | **String** | Description for the refresh file |  [optional] |
|**region** | **String** | S3 Region |  [optional] |
|**s3ArchivePath** | **String** | S3 Archive Bucket Path (directory) |  [optional] |
|**s3Path** | **String** | S3 Bucket Path (directory) |  [optional] |
|**testFTPConfigs** | **Boolean** | Flag for if its a test ftp config |  [optional] |
|**updateFileDescription** | **String** | Description for the update file |  [optional] |
|**locationCode** | **String** | Location Code |  [optional] |
|**pageNum** | **Integer** | which page to show |  [optional] |
|**pageSize** | **Integer** | how many results to show per page |  [optional] |
|**sortBy** | **String** | index to sort results by |  [optional] |
|**userID** | **Integer** | user id |  [optional] |



## Enum: ProductMappingEnum

| Name | Value |
|---- | -----|
| PART_NUMBER_WITH_UPC | &quot;SWAP_PART_NUMBER_WITH_UPC&quot; |
| SKU_WITH_UPC | &quot;SWAP_SKU_WITH_UPC&quot; |


## Implemented Interfaces

* Serializable


