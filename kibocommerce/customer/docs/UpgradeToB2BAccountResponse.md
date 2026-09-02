

# UpgradeToB2BAccountResponse

This class is used for sending custom response while upgrading the B2C accounts to B2B. The custom response returns a list of success, skipped and error accountIDs while upgrade.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errorAccountIds** | [**List&lt;UpgradeToB2BAccountError&gt;**](UpgradeToB2BAccountError.md) |  |  [optional] |
|**skippedAccountIds** | **List&lt;Integer&gt;** |  |  [optional] |
|**successAccountIds** | **List&lt;Integer&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


