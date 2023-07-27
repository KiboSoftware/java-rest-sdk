

# View

A view provides GET access to documents within the documentList the view belongs to. The view can designate which document fields are returned (projection) and  a security model for providing GET access independent of the documentList's security model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A view is addressed via its name, which is unique within the documentList or documentListType in which it is defined. |  [optional] |
|**usages** | **List&lt;String&gt;** | tbd |  [optional] |
|**metadata** | **Object** | The metadata field allows arbitrary data to be stored on the view. |  [optional] |
|**isVisibleInStorefront** | **Boolean** | The isVisibleInStorefront field indicates whether documents in the view can be accessed from the Mozu storefront application. If true, the storefront application and storefront client application (javascript tier)   can GET documents from the view. |  [optional] |
|**filter** | **String** | Filter criteria to apply automatically when documents from this view are accessed, using the standard Mozu filter syntax. Only documents matching the filter criteria will be returned.   Any filter provided by an operation is combined with the view filter. |  [optional] |
|**includeInactiveMode** | **String** | If view documents are requested with includeInactive&#x3D;true, then this controls which documents return. If includeInactive is not provided or set to false, then only active documents return.  If not set, or set to \&quot;all\&quot;, then all documents return.  If set to \&quot;active\&quot;, then only documents within the active date range and documents with no active date range are returned.  If set to \&quot;scheduled\&quot;, then only documents with an active date range in the future are returned.  If set to \&quot;activeOrScheduled\&quot;, then only documents that are active or documents with an active date range in the future are returned.  If set to \&quot;ended\&quot;, then only documents with an active date range in the past are returned. |  [optional] |
|**isAdminDefault** | **Boolean** |  |  [optional] |
|**fields** | [**List&lt;ViewField&gt;**](ViewField.md) | Designation of which document fields are returned (projection) when GETing documents from the view. |  [optional] |


## Implemented Interfaces

* Serializable


