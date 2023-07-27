

# DocumentListType

A documentListType instructs the Mozu platform to automatically create documentLists within a scopeType. Example: Creating a documentListType in tenant X with a   scopeType of site tells the Mozu platform to immediately create a documentList in each site tenant X has. The Mozu platform will also automatically create a new   documentList for every site subsequently provisioned in tenant X. Any defaultDocuments defined on the documentListType will be created within   each documentList. Each documentList will be addressable via the documenetListType's fully qualified name and will, by default, use the documentListType's views,   usages and metadata. Therefore the documentListType can be used to centrally manage each associated documentList.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name component of the documentListTypeFQN, name@namespace. The name must be unique within the namespace component and cannot be updated.  Each documentList created from the documentListType will use this value. |  [optional] |
|**namespace** | **String** | The namespace component of the documentListTypeFQN, name@namespace. The issued dev account namespace must be used unless elevated privileges allow a blank namespace to be used. The namespace cannot be updated.  Each documentList created from the documentListType will use this value. |  [optional] |
|**documentListTypeFQN** | **String** | The unique identifier of the documentListType, represented by name@namespace. The documentListTypeFQN must be provided when creating the documentListType, or the name and namespace fields must be provided.  This field cannot be updated and each documentList created from the documentListType will use this value. |  [optional] |
|**scopeType** | **String** | The context level at which this documentListType will create documentLists. Valid values are \&quot;tenant\&quot;, \&quot;masterCatalog\&quot;, \&quot;catalog\&quot; and \&quot;site\&quot;. This field is read-only after insert. |  [optional] |
|**installationPackage** | **String** | Optionally, a documentListType can be defined in an installationPackage and then installed into a tenant. Installed documentListsTypes can only be updated via installation upgrades.   Currently only internal Mozu platform components can create installations. This field is system-supplied and read-only. |  [optional] |
|**version** | **String** | The version of the installationPackge installed. This field is read-only. |  [optional] |
|**defaultDocuments** | [**List&lt;DocumentInstallation&gt;**](DocumentInstallation.md) | The definition of any documents to create when a documentList is created. |  [optional] |
|**documentTypeFQNs** | **List&lt;String&gt;** | The full names (name@namespace) of the types of documents that can be created within the documentLists belonging to this documentListType.   Each documentList created from the documentListType will use this value, but it can be overridden in an individual documentList. |  [optional] |
|**supportsPublishing** | **Boolean** | Determines if documentLists belonging to this documentListType will support drafting and publishing documents.   This field defaults to false and cannot be updated. Each documentList created from the documentListType will use this value. |  [optional] |
|**enablePublishing** | **Boolean** | Determines if documentLists belonging to this documentListType have publishing turned on or off.   Each documentList created from the documentListType will use this value, but it can be overridden in an individual documentList. |  [optional] |
|**supportsActiveDateRanges** | **Boolean** | Determines if documentLists belonging to this documentListType will support drafting and ActiveDateRanges documents.   This field defaults to false and cannot be updated. Each documentList created from the documentListType will use this value. |  [optional] |
|**enableActiveDateRanges** | **Boolean** | Determines if documentLists belonging to this documentListType have ActiveDateRanges turned on or off.   Each documentList created from the documentListType will use this value, but it can be overridden in an individual documentList. |  [optional] |
|**views** | [**List&lt;View&gt;**](View.md) | An array of one or more views, which each allow GET access to a projection of fields from the documents in the given documentList.   Each documentList created from this documentListType will use this value, but it can be overridden in an individual documentList. |  [optional] |
|**usages** | **List&lt;String&gt;** | An array of strings that describes to the Mozu platform the manner(s) in which a documentList can be used. The following values are valid:  entitymanager -- the documentList should be visible in the Admin Content/Entities screen, which allows admin users to create, manage and publish documents within the documentList.  sitebuilder -- the documentList should be visible in Sitebuilder. A documentList will display in the Sitebuilder Navigation Content List node, which supports document creation, management and web cms integration.  Each documentList created from this documentListType will use this value, but it can be overridden in an individual documentList. |  [optional] |
|**metadata** | **Object** | Allows arbitrary data to be stored on the documentListType. Each documentList created from this documentListType will use this value,   but it can be overridden in an individual documentList. |  [optional] |


## Implemented Interfaces

* Serializable


