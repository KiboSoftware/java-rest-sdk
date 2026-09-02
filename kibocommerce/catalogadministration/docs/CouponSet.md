

# CouponSet

Represents a claimable item that allows a user to use one or more discounts.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assignedDiscountCount** | **Integer** | ReadOnly sum of all redemptions for this coupon. Use \&quot;counts\&quot; response group. |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**canBeDeleted** | **Boolean** | Signifies that the coupon has not been exported and can be updated ReadOnly |  [optional] |
|**couponCodeCount** | **Integer** | Count of associated couponCodes. Must use \&quot;counts\&quot; response group to get this value ReadOnly |  [optional] |
|**couponCodeType** | **String** | Determines if the coupon is a persisted list of codes (static) or a list based on generated specification (dynamic). |  [optional] |
|**couponSetCode** | **String** | Unique tenant supplied identifier. Used as the prefix for generated sets. Required System generated if left null. |  [optional] |
|**endDate** | **OffsetDateTime** | Date and time that the coupon codes becomes expired |  [optional] |
|**id** | **Integer** | Internal unique identifier of the couponset. System-supplied and read-only. |  [optional] |
|**maxRedemptionsPerCouponCode** | **Integer** | Maximum number of times any code can de used. Must be null or &gt;&#x3D; 1 (0 is invalid). Defaults to 1 on creation if null. |  [optional] |
|**maxRedemptionsPerUser** | **Integer** | Maximum number of times any single user can redeem any code. Must be null or &gt;&#x3D; 1 (0 is invalid). Defaults to 1 on creation only when legacy tenant behavior is enabled; otherwise null is preserved. |  [optional] |
|**name** | **String** | CouponSet Name |  |
|**redemptionCount** | **Integer** | ReadOnly count of all redemptions for this coupon set. |  [optional] |
|**setSize** | **Integer** | Sets the number of codes to generate for dynamic coupons Required when CouponCodeType is \&quot;Dynamic\&quot; |  [optional] |
|**startDate** | **OffsetDateTime** | Date and time that the coupon codes becomes active |  [optional] |
|**status** | **String** | CouponSet status which can be: Active, Expired,  Inactive System-supplied and read-only. |  [optional] |


## Implemented Interfaces

* Serializable


