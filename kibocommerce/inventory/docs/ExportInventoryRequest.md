

# ExportInventoryRequest

Export Inventory Request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exportSettingsName** | **String** | Name of the Export Settings to use |  [optional] |
|**exportSettingsFTPName** | **String** | Name of the FTP Settings to use. Will only check for this if exportID is already set |  [optional] |
|**exportSettingsS3Name** | **String** | Name of the S3 Settings to use. Will only check for this if exportID is already set |  [optional] |
|**development** | **Boolean** | Flag for sending the exports to the development droppoint |  [optional] |
|**locationCode** | **String** | Location Code |  [optional] |
|**userID** | **Integer** | user id |  [optional] |
|**pageSize** | **Integer** | how many results to show per page |  [optional] |
|**pageNum** | **Integer** | which page to show |  [optional] |
|**sortBy** | **String** | index to sort results by |  [optional] |


## Implemented Interfaces

* Serializable


