

# EntityList

The definition of an MZDB EntityList which describes the characteristics of the EntityList on a per tenant basis. EntityLists are created at the tenant level, but instances of the EntityLists are implicitly created at the appropriate context level as entities are added or removed from the EntityList.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantId** | **Integer** |  |  [optional] |
|**nameSpace** | **String** | The nameSpace for the EntityList which must be within the nameSpace scope of the developer Account for the creating application.  The name and namespace are formatted as name@nameSpace when specified as fullName. An EntityLists fullName must be unique within the tenant in which it is created. |  [optional] |
|**name** | **String** | The name for the EntityList which must be unique within the namespace provided.  The name and namespace are formatted as name@nameSpace when specified as fullName. An EntityLists fullName must be unique within the tenant in which it is created. |  [optional] |
|**contextLevel** | **String** | At which context level are entities stored in the list. Possible values are \&quot;tenant\&quot;, \&quot;site\&quot;, \&quot;masterCatalog\&quot; or \&quot;catalog\&quot;.  Each list instance will exist at this context level for the tenant. |  [optional] |
|**useSystemAssignedId** | **Boolean** | Indicates whether or not Mozu should assign a generated identifier for each entity in the list or whether a unique identifier will be provided for each identity. If set to false, then a value must be provided for the IdProperty for the list. |  [optional] |
|**idProperty** | [**IndexedProperty**](IndexedProperty.md) |  |  [optional] |
|**indexA** | [**IndexedProperty**](IndexedProperty.md) |  |  [optional] |
|**indexB** | [**IndexedProperty**](IndexedProperty.md) |  |  [optional] |
|**indexC** | [**IndexedProperty**](IndexedProperty.md) |  |  [optional] |
|**indexD** | [**IndexedProperty**](IndexedProperty.md) |  |  [optional] |
|**isVisibleInStorefront** | **Boolean** | Indicates whether Enitities in the EntityList are allowed to be accessed from a Mozu storefront. |  [optional] |
|**isLocaleSpecific** | **Boolean** | Indicates whether MZDB should store entities in the EntityList instance specific to the localeCode provided.  If true, all operations on the EntityList will be filtered by the provided localeCode on the request or using the defautLocaleCode for the context.  All entities created in the EntityList will be stored with the localeCode provided on the request or the defautLocaleCode for the context as an additional implicit key. The default value is false. |  [optional] |
|**isShopperSpecific** | **Boolean** | Indicates whether MZDB should store entities in the EntityList instance specific to the current shopper on the request.  If true, all operations on the EntityList will be filtered by the id of the shopper from the shopper claims provided on the request.  All entities created in the EntityList will be stored with the id of the shopper from the shopper claims provided on the request as an additional implicit key. The default value is false. |  [optional] |
|**isSandboxDataCloningSupported** | **Boolean** | Indicates whether MZDB should clone all of the Entities in the EntityList when cloning an existing sandbox for which this list is already defined.  The default value is false. |  [optional] |
|**views** | [**List&lt;ListView&gt;**](ListView.md) | The ListViews defined for this EntityList.  ListViews may be used to automatically filter an EntityList or transform the Entities in the list to a new Schema. |  [optional] |
|**usages** | **List&lt;String&gt;** | Usages are arbitratry sting values used to provide instructions for other applications as to the intended areas where the list should be used. Mozu uses the \&quot;admin\&quot; usage valued to indicate that an EntityList should appear in the EntityManager in the Admin UI.  The values are open ended and applications may provide any value for a usage. This field can be used in queries to the EntityList. |  [optional] |
|**metadata** | **Object** | An arbitrary json property to be used by external applications for any purpose. MZDB will persist and retrieve the metadata without any restrictions. |  [optional] |
|**createDate** | **OffsetDateTime** |  |  [optional] |
|**updateDate** | **OffsetDateTime** |  |  [optional] |


## Implemented Interfaces

* Serializable


