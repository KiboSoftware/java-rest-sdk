

# ProductType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the ProductType. System-supplied and read-only. |  [optional] |
|**name** | **String** | Name of the productType |  [optional] |
|**masterCatalogId** | **Integer** | Indentifier of the Master Catalog that this ProductType is a member of. System-supplied and read-only. |  [optional] |
|**isBaseProductType** | **Boolean** | System supplied and read only. There is only one BaseProductType per MasterCatalog. |  [optional] |
|**productCount** | **Integer** | Indicates the number of products currently using this Product Type. System-supplied and read-only. |  [optional] |
|**productUsages** | **List&lt;String&gt;** | List of ProductUsages supported by the ProductType. |  [optional] |
|**goodsType** | **String** | The TYpe of Goods of this product |  [optional] |
|**options** | [**List&lt;AttributeInProductType&gt;**](AttributeInProductType.md) | Collection of the Attributes that are Options in this productType |  [optional] |
|**extras** | [**List&lt;AttributeInProductType&gt;**](AttributeInProductType.md) | Collection of the Attributes that are Extras in this productType |  [optional] |
|**properties** | [**List&lt;AttributeInProductType&gt;**](AttributeInProductType.md) | Collection of the Attributes that are Properties in this productType |  [optional] |
|**variantProperties** | [**List&lt;AttributeInProductType&gt;**](AttributeInProductType.md) | Collection of the Attributes that are VariantProperties in this productType |  [optional] |
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


