

# FetchFileConfigRequestAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | Flag for active state |  [optional] |
|**archiveBucket** | **String** | S3 Archive Bucket |  [optional] |
|**blankQuantityIsZero** | **Boolean** | Flag to convert null quantities to zero |  [optional] |
|**bucket** | **String** | S3 Bucket |  [optional] |
|**csvDelimiter** | **String** | Delimiter |  [optional] |
|**emailList** | **String** | Email List |  [optional] |
|**fetchFileConfigID** | **Integer** | Fetch File Config ID |  [optional] |
|**fieldNameMap** | **List&lt;String&gt;** | List of field names |  [optional] |
|**ftpPassword** | **String** | FTP server password |  [optional] |
|**ftpPort** | **Integer** | FTP server port |  [optional] |
|**ftpRemotePath** | **String** | FTP server remote path |  [optional] |
|**ftpRemotePathArchive** | **String** | FTP server remote path archive |  [optional] |
|**ftpServer** | **String** | FTP server address |  [optional] |
|**ftpUsername** | **String** | FTP server username |  [optional] |
|**ignoreExtraFields** | **Boolean** | Flag for ignoring extra fields |  [optional] |
|**lockName** | **String** | Lock name |  [optional] |
|**multipleFiles** | **Boolean** | Flag for using multiple files |  [optional] |
|**postProcessAction** | **Integer** | Enum denoting action post processing |  [optional] |
|**productMapping** | [**ProductMappingEnum**](#ProductMappingEnum) | Enum for fetch file productMapping |  [optional] |
|**refreshEnabled** | **Boolean** | Flag for Refresh Enabled |  [optional] |
|**refreshFileDescription** | **String** | Description for the refresh file |  [optional] |
|**region** | **String** | S3 Region |  [optional] |
|**s3ArchivePath** | **String** | S3 Archive Bucket Path (directory) |  [optional] |
|**s3Path** | **String** | S3 Bucket Path (directory) |  [optional] |
|**testFTPConfigs** | **Boolean** | Flag for if its a test ftp config |  [optional] |
|**updateEnabled** | **Boolean** | Flag for Update Enabled |  [optional] |
|**updateFileDescription** | **String** | Description for the update file |  [optional] |
|**useControlFile** | **Boolean** | Flag for using control file |  [optional] |
|**zeroOutNegatives** | **Boolean** | Flag for converting negatives to zero |  [optional] |



## Enum: ProductMappingEnum

| Name | Value |
|---- | -----|
| PART_NUMBER_WITH_UPC | &quot;SWAP_PART_NUMBER_WITH_UPC&quot; |
| SKU_WITH_UPC | &quot;SWAP_SKU_WITH_UPC&quot; |


## Implemented Interfaces

* Serializable


