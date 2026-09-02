

# CommerceRuntimeShippingRateAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | **Object** | Custom data returned by the shipping service. |  [optional] |
|**fulfillmentMethod** | **String** | Fulfillment method of the shipping rate. eg) Ship or Delivery |  [optional] |
|**isValid** | **Boolean** | If true, the shipping rate is valid. |  [optional] |
|**messages** | **List&lt;String&gt;** | Messages and detail about why the shipping rate may be invalid. |  [optional] |
|**shippingItemRates** | [**List&lt;CommerceRuntimeShippingItemRate&gt;**](CommerceRuntimeShippingItemRate.md) |  |  [optional] |
|**shippingMethodCode** | **String** | Code that uniquely identifies the selected shipping method. |  [optional] |
|**shippingMethodName** | **String** | Shipping Method Name |  [optional] |
|**shippingZoneCode** | **String** | The shipping zone to which this rate applies. |  [optional] |


## Implemented Interfaces

* Serializable


