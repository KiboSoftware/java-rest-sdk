

# CatalogAdminsThresholdMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**content** | [**ThresholdMessageLocalizedContent**](ThresholdMessageLocalizedContent.md) |  |  [optional] |
|**discountId** | **Integer** | Unique identifier of the discount. System-supplied and read-only. |  |
|**isActive** | **Boolean** | Indicates if threshold messages are active for this discount |  [optional] |
|**localizedContent** | [**List&lt;ThresholdMessageLocalizedContent&gt;**](ThresholdMessageLocalizedContent.md) | Container for the language-specific name of the threshold message. You will have a container for each supported language (LocaleCode). This enables you to display the message in multiple languages yet manage it as a single message internally. |  [optional] |
|**requiresCouponCode** | **Boolean** | Indicates if the threshold message will display when a promo code is evaluated |  [optional] |
|**showInCart** | **Boolean** | Indicates if the threshold message will display in the cart |  [optional] |
|**showOnCheckout** | **Boolean** | Indicates if the threshold message will display on the checkout page |  [optional] |
|**thresholdValue** | **Double** | The cart total amount that must be met before the threshold message is displayed |  |


## Implemented Interfaces

* Serializable


