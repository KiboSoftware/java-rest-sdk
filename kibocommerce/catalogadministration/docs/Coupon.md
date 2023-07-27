

# Coupon

Coupon in a coupon set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**couponSetId** | **Integer** | ReadOnly system id for releated couponset. |  [optional] |
|**couponSetCode** | **String** | Link to associated coupon |  [optional] |
|**couponCode** | **String** | The code the customer uses to claim this coupon |  |
|**canBeDeleted** | **Boolean** |  |  [optional] |
|**redemptionCount** | **Integer** | Total number of times this code has been redeemed. ReadOnly, calculated.  Only returned with response group includeCounts |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


