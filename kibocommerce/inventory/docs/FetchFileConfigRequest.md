

# FetchFileConfigRequest

Request for Fetch File Configs

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fetchFileConfigID** | **Integer** | Fetch File Config ID |  [optional] |
|**active** | **Boolean** | Flag for active state |  |
|**emailList** | **String** | Email List |  [optional] |
|**refreshEnabled** | **Boolean** | Flag for Refresh Enabled |  [optional] |
|**refreshFileDescription** | **String** | Description for the refresh file |  [optional] |
|**updateEnabled** | **Boolean** | Flag for Update Enabled |  [optional] |
|**updateFileDescription** | **String** | Description for the update file |  [optional] |
|**ftpServer** | **String** | FTP server address |  |
|**ftpUsername** | **String** | FTP server username |  |
|**ftpPassword** | **String** | FTP server password |  |
|**ftpPort** | **Integer** | FTP server port |  [optional] |
|**ftpRemotePath** | **String** | FTP server remote path |  |
|**ftpRemotePathArchive** | **String** | FTP server remote path archive |  [optional] |
|**region** | **String** | S3 Region |  [optional] |
|**bucket** | **String** | S3 Bucket |  [optional] |
|**s3Path** | **String** | S3 Bucket Path (directory) |  [optional] |
|**archiveBucket** | **String** | S3 Archive Bucket |  [optional] |
|**s3ArchivePath** | **String** | S3 Archive Bucket Path (directory) |  [optional] |
|**lockName** | **String** | Lock name |  |
|**postProcessAction** | **Integer** | Enum denoting action post processing |  |
|**useControlFile** | **Boolean** | Flag for using control file |  [optional] |
|**multipleFiles** | **Boolean** | Flag for using multiple files |  [optional] |
|**zeroOutNegatives** | **Boolean** | Flag for converting negatives to zero |  [optional] |
|**testFTPConfigs** | **Boolean** | Flag for if its a test ftp config |  [optional] |
|**fieldNameMap** | **List&lt;String&gt;** | List of field names |  [optional] |
|**ignoreExtraFields** | **Boolean** | Flag for ignoring extra fields |  [optional] |
|**blankQuantityIsZero** | **Boolean** | Flag to convert null quantities to zero |  [optional] |
|**csvDelimiter** | **String** | Delimiter |  [optional] |
|**productMapping** | [**ProductMappingEnum**](#ProductMappingEnum) | Enum for fetch file productMapping |  [optional] |
|**locationCode** | **String** | Location Code |  [optional] |
|**userID** | **Integer** | user id |  [optional] |
|**pageSize** | **Integer** | how many results to show per page |  [optional] |
|**pageNum** | **Integer** | which page to show |  [optional] |
|**sortBy** | **String** | index to sort results by |  [optional] |



## Enum: ProductMappingEnum

| Name | Value |
|---- | -----|
| PART_NUMBER_WITH_UPC | &quot;SWAP_PART_NUMBER_WITH_UPC&quot; |
| SKU_WITH_UPC | &quot;SWAP_SKU_WITH_UPC&quot; |


## Implemented Interfaces

* Serializable


