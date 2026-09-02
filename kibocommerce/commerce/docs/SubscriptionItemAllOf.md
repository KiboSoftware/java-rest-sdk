

# SubscriptionItemAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**List&lt;SubscriptionLineAttribute&gt;**](SubscriptionLineAttribute.md) | Extensible attributes for this subscription line. |  [optional] |
|**fulfillmentLocationCode** | **String** | Location code from which to obtain this item |  [optional] |
|**fulfillmentMethod** | **String** | Fulfillment method used to fulfill this item |  [optional] |
|**id** | **String** | Unique identifier of the order line item. System-supplied and read-only. |  [optional] |
|**isOnetimeItem** | **Boolean** | is onetime item |  [optional] |
|**parentItemCode** | **String** | Product code of the parent item if split because of the splitItemOnSubsription attribute on the item |  [optional] |
|**shippingMethodCode** | **String** | Code that uniquely identifies the shipping method. |  [optional] |
|**shippingMethodName** | **String** | Readable name of the shipping method. |  [optional] |


## Implemented Interfaces

* Serializable


