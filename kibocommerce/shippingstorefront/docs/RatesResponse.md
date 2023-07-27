

# RatesResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Resolved Shipping Zone Code.  This value can be null if the tenant/site does not have shipping zones defined or there are no matching   shipping zones for the request (e.g. the only zone defined is \&quot;UNITED-STATES\&quot; and the destination address of the rate request is in Canada) |  [optional] |
|**resolvedShippingZoneCode** | **String** |  |  [optional] |
|**shippingZoneCodes** | **List&lt;String&gt;** |  |  [optional] |
|**rates** | [**List&lt;CarrierRatesResponse&gt;**](CarrierRatesResponse.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


