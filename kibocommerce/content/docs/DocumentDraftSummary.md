

# DocumentDraftSummary

Summary information on a Document Draft

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeUpdateDate** | **OffsetDateTime** | The date and time the document was last published, if any. |  [optional] |
|**activeUpdatedBy** | **String** |  |  [optional] |
|**catalogId** | **Integer** |  |  [optional] |
|**documentTypeFQN** | **String** | The full name of the documentType that underlies this document. |  [optional] |
|**draftUpdateDate** | **OffsetDateTime** | The date and time the document draft was last updated. |  [optional] |
|**id** | **String** | The system generated 32 digit alpha-numeric string that uniquely identifies the document. |  [optional] |
|**listFQN** | **String** | The fully qualified name of the documentList to which the document belongs. |  [optional] |
|**masterCatalogId** | **Integer** |  |  [optional] |
|**name** | **String** | The unique name of the document. |  [optional] |
|**publishSetCode** | **String** |  |  [optional] |
|**publishType** | **String** | Denotes the type of draft.  \&quot;Created\&quot; -- the document has never been published.  \&quot;Updated\&quot; -- the document has an \&quot;active\&quot; version and this is a subsequent draft. \&quot;Deleted\&quot; -- the \&quot;active\&quot; document will be permanently deleted when this draft is published. |  [optional] |
|**siteId** | **Integer** |  |  [optional] |
|**updatedBy** | **String** | The userId or applicationId that last updated the draft document. |  [optional] |


## Implemented Interfaces

* Serializable


