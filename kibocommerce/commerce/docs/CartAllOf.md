

# CartAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cartMessage** | [**CartMessage**](CartMessage.md) |  |  [optional] |
|**cartMessages** | [**List&lt;CartMessage&gt;**](CartMessage.md) |  |  [optional] |
|**couponCodes** | **List&lt;String&gt;** | Coupon codes associated with this order.  Only set on order import. |  [optional] |
|**handlingAmount** | **Double** | Order level handling fees excluding any discounts. |  [optional] |
|**handlingSubTotal** | **Double** | Handling fees for the Order as well as CartItems (e.g. if the Cart has a $5 handling fee and an CartItem has a $2 handling fee per item quantity and the quantity of items is 2 then the value in this property would be $9) |  [optional] |
|**handlingTotal** | **Double** | Handling fees including any discounts. |  [optional] |
|**invalidCoupons** | [**List&lt;InvalidCoupon&gt;**](InvalidCoupon.md) | A list of invalid coupons that were attempted on the cart |  [optional] |
|**items** | [**List&lt;CartItem&gt;**](CartItem.md) | List of items in the cart. |  [optional] |
|**priceListCode** | **String** | Pricelist code |  [optional] |
|**reservationId** | **String** | Inventory Reservation id for a cart. |  [optional] |
|**shippingGroups** | [**List&lt;ShippingGrouping&gt;**](ShippingGrouping.md) | List of groupings. The grouping is determined by the ShippingGrouper based on the items in the cart.  Each grouping represents a set of items that can be fulfilled together, typically because they share the same fulfillment method, shipping method and a location. |  [optional] |
|**zipCode** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


