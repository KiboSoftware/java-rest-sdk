

# PaymentCard

If the customer is paying by credit card, the card holder's details, such as the name on the card, number, billing   address, and expiration dates.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentServiceCardId** | **String** | Credit card number. |  [optional] |
|**isUsedRecurring** | **Boolean** | If true, the credit card is charged on a regular interval, such as for a subscription. (Not supported currently.) |  [optional] |
|**nameOnCard** | **String** | Card holder&#39;s name as it appears on the card. |  [optional] |
|**isCardInfoSaved** | **Boolean** | If true, the card information is stored in the customer&#39;s account. |  [optional] |
|**isTokenized** | **Boolean** | If true, the card is tokenized by external provider |  [optional] |
|**ccLastFour** | **String** | Last four digit of Credit card  Only for OMS Only tenant. |  [optional] |
|**paymentOrCardType** | **String** | Card type such as Visa, MasterCard, American Express, or Discover. |  [optional] |
|**cardNumberPartOrMask** | **String** | The visible part of the card number that the merchant uses to refer to   payment information, for example, the last for digits of the card number. |  [optional] |
|**expireMonth** | **Integer** | Month when the card expires. |  [optional] |
|**expireYear** | **Integer** | Year when the card expires. |  [optional] |
|**bin** | **String** | Year when the card expires. |  [optional] |


## Implemented Interfaces

* Serializable


