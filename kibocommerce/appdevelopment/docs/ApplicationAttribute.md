

# ApplicationAttribute

Holds attribute definitions for AppVersion

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subsystem** | **String** | Customer, Order, or Product |  [optional] |
|**attributeJson** | **String** | json representation of attribute definitions |  [optional] |
|**productTypeJson** | **String** | Will contain ProductTypeCollection if Product, else AttributeSet |  [optional] |
|**isAppliedToBase** | **Boolean** |  |  [optional] |
|**sourceTenantId** | **Integer** | Source Tenant Id |  [optional] |
|**sourceTenantName** | **String** | Source Tenant Name |  [optional] |
|**attributeCodes** | **String** | Comma delimited list of attribute codes. |  [optional] |
|**packageId** | **Integer** |  |  [optional] |
|**attributes** | [**List&lt;AppDevAttribute&gt;**](AppDevAttribute.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


