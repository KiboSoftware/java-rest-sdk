

# CatalogAdminsThresholdMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**discountId** | **Integer** | Unique identifier of the discount. System-supplied and read-only. |  |
|**thresholdValue** | **Double** | The cart total amount that must be met before the threshold message is displayed |  |
|**isActive** | **Boolean** | Indicates if threshold messages are active for this discount |  [optional] |
|**showInCart** | **Boolean** | Indicates if the threshold message will display in the cart |  [optional] |
|**showOnCheckout** | **Boolean** | Indicates if the threshold message will display on the checkout page |  [optional] |
|**requiresCouponCode** | **Boolean** | Indicates if the threshold message will display when a promo code is evaluated |  [optional] |
|**content** | [**ThresholdMessageLocalizedContent**](ThresholdMessageLocalizedContent.md) |  |  |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


