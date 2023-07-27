

# CommerceRuntimeShippingRate

How much the customer and merchant pay for shipping based on the current shipping rate.   The cost can differ between the merchant and customer depending on any merchant discounts or   extra fees.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**shippingMethodCode** | **String** | Code that uniquely identifies the selected shipping method. |  [optional] |
|**shippingMethodName** | **String** | Shipping Method Name |  [optional] |
|**shippingZoneCode** | **String** | The shipping zone to which this rate applies. |  [optional] |
|**isValid** | **Boolean** | If true, the shipping rate is valid. |  [optional] |
|**messages** | **List&lt;String&gt;** | Messages and detail about why the shipping rate may be invalid. |  [optional] |
|**data** | **Object** | Custom data returned by the shipping service. |  [optional] |
|**currencyCode** | **String** | ISO currency code such as US dollars. Currently, only USD is supported. |  [optional] |
|**price** | **Double** | How much the customer pays for shipping which includes any shipping discounts that the merchant offers. |  [optional] |


## Implemented Interfaces

* Serializable


