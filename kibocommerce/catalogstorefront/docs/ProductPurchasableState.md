

# ProductPurchasableState

Current state of the product purchase, that is, whether it is ready to be purchased. For products with configurable options,     /// the product is purchaseable if the shopper has selected all required options. If not, a message lists which required options are missing.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isPurchasable** | **Boolean** | If true, this product is currently available for purchase. For products with options, this is false until the shopper selects all required options. |  [optional] |
|**messages** | [**List&lt;ValidationMessage&gt;**](ValidationMessage.md) | Message associated with this product if it is not ready to be purchased. For products with options, message contains which required options are missing. |  [optional] |


## Implemented Interfaces

* Serializable


