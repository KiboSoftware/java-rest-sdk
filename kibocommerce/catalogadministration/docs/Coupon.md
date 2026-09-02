

# Coupon

Coupon in a coupon set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**canBeDeleted** | **Boolean** |  |  [optional] |
|**couponCode** | **String** | The code the customer uses to claim this coupon |  |
|**couponSetCode** | **String** | Link to associated coupon |  [optional] |
|**couponSetId** | **Integer** | ReadOnly system id for releated couponset. |  [optional] |
|**redemptionCount** | **Integer** | Total number of times this code has been redeemed. ReadOnly, calculated. Only returned with response group includeCounts |  [optional] |


## Implemented Interfaces

* Serializable


