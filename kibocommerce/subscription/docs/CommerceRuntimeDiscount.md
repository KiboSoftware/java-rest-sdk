

# CommerceRuntimeDiscount

Discounts that apply to the order, if any. For example, when the   subtotal of the order exceeds a certain amount, or for free shipping.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the discount. |  [optional] |
|**name** | **String** | Name of the discount in the language specified by LocaleCode. |  [optional] |
|**itemIds** | **List&lt;String&gt;** | List of discounts for each order item. |  [optional] |
|**expirationDate** | **OffsetDateTime** | Date when the discount expires. Default is null (no expiration date). |  [optional] |
|**hasMultipleTargetProducts** | **Boolean** | Indicates that the discount targets more than a product.  Used  primarily for BoGa discounts with multiple targets. |  [optional] |


## Implemented Interfaces

* Serializable


