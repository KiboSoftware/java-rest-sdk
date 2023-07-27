

# UpgradeToB2BAccountResponse

This class is used for sending custom response while upgrading the B2C accounts to B2B.  The custom response returns a list of success, skipped and error accountIDs while upgrade.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**successAccountIds** | **List&lt;Integer&gt;** |  |  [optional] |
|**skippedAccountIds** | **List&lt;Integer&gt;** |  |  [optional] |
|**errorAccountIds** | [**List&lt;UpgradeToB2BAccountError&gt;**](UpgradeToB2BAccountError.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


