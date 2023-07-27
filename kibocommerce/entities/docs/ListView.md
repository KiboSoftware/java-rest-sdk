

# ListView


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the ListView. This must be unique for the EntityList. |  [optional] |
|**usages** | **List&lt;String&gt;** | Usages are arbitratry sting values used to provide instructions for other applications as to the intended areas where the view should be used. Mozu uses the \&quot;admin\&quot; usage valued to indicate that a ListView should appear in the EntityManager in the Admin UI.  The values are open ended and applications may provide any value for a usage. This field can be used in queries to the EntityList. |  [optional] |
|**metaData** | **Object** | An arbitrary json property to be used by external applications for any purpose. MZDB will persist and retrieve the metadata without any restrictions. |  [optional] |
|**security** | **String** | less restrictive than collection/list security. public | admin | owner |  [optional] |
|**filter** | **String** | Indicates a implicitly applied filter to the EntityList for to which the ListView is associated. All queries to the ListView will have this filter applied implicitly. |  [optional] |
|**defaultSort** | **String** | Indicates a default sort to be applied to the ListView. |  [optional] |
|**fields** | [**List&lt;ListViewField&gt;**](ListViewField.md) | The list of ViewFields for this view. ViewFields can be used to filter or transform the underlying Entity to provide an optimized format for applications which query the ListView.  If no ViewFields are specified, entities will be returned for the View with no transform applied. |  [optional] |


## Implemented Interfaces

* Serializable


