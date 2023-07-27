

# ThrirdPartyTaxContext

The context for the tax calculation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**taxContextId** | **String** | The unique id of this context. Will typically be the OrderId or CartId, depending when the tax is being calculated. |  [optional] |
|**customerId** | **String** | A unique id for a customer.  This may be the userid, checking with Avalara to determine the meaning of this |  [optional] |
|**taxExemptId** | **String** | Tax exemption id.  Indicates that this customer or user is tax exempt |  [optional] |
|**taxShipping** | **Boolean** | Indicates whether shipping amounts should be taxed |  [optional] |
|**originAddress** | [**CommerceRuntimeAddress**](CommerceRuntimeAddress.md) |  |  [optional] |
|**destinationAddress** | [**CommerceRuntimeAddress**](CommerceRuntimeAddress.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


