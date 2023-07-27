

# DocumentType

The schema a document must implement and associated metadata. A documentType is created at a tenant scope and is therefore shared amongst all child contexts (masterCatalog, catalog, site).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name component of the documentType, name@namespace. The name must be unique within the namespace component and cannot be updated. |  [optional] |
|**namespace** | **String** | The namespace component of the documentType, name@namespace. The issued dev account namespace must be used unless elevated privileges allow a blank namespace to be used. The namespace cannot be updated. |  [optional] |
|**documentTypeFQN** | **String** | The unique identifier of the documentType, represented by name@namespace. The documentTypeFQN must be provided when creating the documentType, or the name and namespace fields must be provided. |  [optional] |
|**adminName** | **String** | The administrative name of the documentType. |  [optional] |
|**installationPackage** | **String** | Optionally, a documentType can be defined in an installationPackage and then installed into a tenant. Installed documentTypes can only be updated via installation upgrades.   Currently only internal Mozu platform components can create installations. This field is system-supplied and read-only. |  [optional] |
|**version** | **String** | The version of the installationPackge installed. This field is read-only. |  [optional] |
|**metadata** | **Object** | Allows arbitrary data to be stored on the documentType. |  [optional] |
|**properties** | [**List&lt;Property&gt;**](Property.md) | An array of the schema elements that a document implementing this documentType will have. |  [optional] |


## Implemented Interfaces

* Serializable


