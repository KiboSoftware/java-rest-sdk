

# ApplicationAttribute

Holds attribute definitions for AppVersion

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributeCodes** | **String** | Comma delimited list of attribute codes. |  [optional] |
|**attributeJson** | **String** | json representation of attribute definitions |  [optional] |
|**attributes** | [**List&lt;AppDevAttribute&gt;**](AppDevAttribute.md) |  |  [optional] |
|**isAppliedToBase** | **Boolean** |  |  [optional] |
|**packageId** | **Integer** |  |  [optional] |
|**productTypeJson** | **String** | Will contain ProductTypeCollection if Product, else AttributeSet |  [optional] |
|**sourceTenantId** | **Integer** | Source Tenant Id |  [optional] |
|**sourceTenantName** | **String** | Source Tenant Name |  [optional] |
|**subsystem** | **String** | Customer, Order, or Product |  [optional] |


## Implemented Interfaces

* Serializable


