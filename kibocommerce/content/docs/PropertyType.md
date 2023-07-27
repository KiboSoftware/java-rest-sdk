

# PropertyType

The schema a document property value must implement. A propertyType is created at a tenant scope and is therefore shared amongst all child contexts (masterCatalog, catalog, site).  A propertyType is analogous to the type argument of a class property in object oriented programming.   A propertyType's dataType field is analogous to an intrinsic value type in object oriented programming, or to a column data type in relational database terminology.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name component of the propertyType, name@namespace. The name must be unique within the namespace component and cannot be updated. |  [optional] |
|**namespace** | **String** | The namespace component of the propertyType, name@namespace. The issued dev account namespace must be used unless elevated privileges allow a blank namespace to be used. The namespace cannot be updated. |  [optional] |
|**propertyTypeFQN** | **String** | The unique identifier of the propertyTYpe, represented by name@namespace. The propertyTypeFQN must be provided when creating the propertyType, or the name and namespace fields must be provided. |  [optional] |
|**adminName** | **String** | The administrative name of the propertyType. |  [optional] |
|**installationPackage** | **String** | Optionally, a propertyType can be defined in an installationPackage and then installed into a tenant. Installed propertyTypes can only be updated via installation upgrades.   Currently only internal Mozu platform components can create installations. This field is system-supplied and read-only. |  [optional] |
|**version** | **String** | The version of the installationPackge installed. This field is read-only. |  [optional] |
|**dataType** | **String** | The underlying value type that can be held in the document&#39;s property value. Valid values are  string  number  boolean  datetime  json  The dataType is analogous to an intrinsic value type in object oriented programming, or to a column data type in relational database terminology. |  [optional] |
|**isQueryable** | **Boolean** | tbd |  [optional] |
|**isSortable** | **Boolean** | tbd |  [optional] |
|**isAggregatable** | **Boolean** | tbd |  [optional] |


## Implemented Interfaces

* Serializable


