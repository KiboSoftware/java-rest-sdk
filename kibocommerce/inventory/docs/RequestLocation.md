

# RequestLocation

Request Location

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**unit** | [**UnitEnum**](#UnitEnum) | Unit of distance used for radius |  [optional] |
|**radius** | **BigDecimal** | Distance from location |  [optional] |
|**postalCode** | **String** | Postal Code of this location |  [optional] |
|**latitude** | **BigDecimal** | Latitude coordinate of this location |  [optional] |
|**longitude** | **BigDecimal** | Longitude coordinate of this location |  [optional] |
|**countryCode** | **String** | Country Code for this location |  [optional] |
|**locationCode** | **String** | Location Code for this location. This being set will trigger GetInventoryByLocation |  [optional] |
|**addressID** | **Integer** | Address ID for this location |  [optional] |
|**customerID** | **Integer** | CustomerID ID for this location |  [optional] |
|**addressLine1** | **String** | Address line 1 for this location |  [optional] |
|**phone** | **String** | Phone number for this location |  [optional] |
|**city** | **String** | City for this location |  [optional] |
|**state** | **String** | State for this location |  [optional] |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| MILES | &quot;MILES&quot; |
| KM | &quot;KM&quot; |


## Implemented Interfaces

* Serializable


