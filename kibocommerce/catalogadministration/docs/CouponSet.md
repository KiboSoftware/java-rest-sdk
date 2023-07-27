

# CouponSet

Represents a claimable item that allows a user to use one or more discounts.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Internal unique identifier of the couponset. System-supplied and read-only. |  [optional] |
|**couponSetCode** | **String** | Unique tenant supplied identifier.  Used as the prefix for generated sets.  Required  System generated if left null. |  [optional] |
|**name** | **String** | CouponSet Name |  |
|**couponCodeType** | **String** | Determines if the coupon is a persisted list of codes (static) or a list based on generated specification  (dynamic). |  [optional] |
|**status** | **String** | CouponSet status which can be: Active, Expired,  Inactive  System-supplied and read-only. |  [optional] |
|**canBeDeleted** | **Boolean** | Signifies that the coupon has not been exported and can be updated  ReadOnly |  [optional] |
|**maxRedemptionsPerUser** | **Integer** | Maximum number of times any single user can redeem any code.  Must be null, &gt;&#x3D;1 or -1.  Defaults to 1 on creation if null.  -1 indicates unlimited. |  [optional] |
|**maxRedemptionsPerCouponCode** | **Integer** | Maximum number of times any code can de used.  Must be null, &gt;&#x3D;1 or -1.  Defaults to 1 on creation if null.  -1 indicates unlimited. |  [optional] |
|**endDate** | **OffsetDateTime** | Date and time that the coupon codes becomes expired |  [optional] |
|**startDate** | **OffsetDateTime** | Date and time that the coupon codes becomes active |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**setSize** | **Integer** | Sets the number of codes to generate for dynamic coupons  Required when CouponCodeType is \&quot;Dynamic\&quot; |  [optional] |
|**couponCodeCount** | **Integer** | Count of associated couponCodes.  Must use \&quot;counts\&quot; response group to get this value  ReadOnly |  [optional] |
|**redemptionCount** | **Integer** | ReadOnly count of all redemptions for this coupon set. |  [optional] |
|**assignedDiscountCount** | **Integer** | ReadOnly sum of all redemptions for this coupon.  Use \&quot;counts\&quot; response group. |  [optional] |


## Implemented Interfaces

* Serializable


