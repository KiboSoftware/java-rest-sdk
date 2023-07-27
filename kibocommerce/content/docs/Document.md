

# Document

Container for schema-enforced and schemaless data. A document is primarily used to store content (html, text,  numbers, dates, JSON, binary data) that is directly or indirectly used for the storefront website experience  and may be addressed via the Hypr theming engine language. A document belongs to a documentList and has an  underlying documentType.  The documentType describes any required and optional schema. Additionally, a binary  object may be stored on the document's content subresource and edge cached via the Mozu CDN.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Read-only, system generated 32 digit alpha-numeric string that uniquely identifies the document. |  [optional] |
|**name** | **String** | The fully qualified name of the document including path.  Unique within the documentList. This field is a required field, but it can be updated. |  [optional] |
|**path** | **String** | ReadOnly, path portion of the Name property. |  [optional] |
|**publishSetCode** | **String** | The name of the publish set that this document belongs to, if any. |  [optional] |
|**extension** | **String** | If applicable, the file extension associated with the document content. |  [optional] |
|**documentTypeFQN** | **String** | The full name of the documentType that underlies this document.  This field must be supplied upon document creation and cannot be updated. |  [optional] |
|**listFQN** | **String** | The fully qualified name of the documentList to which the document belongs.  This field is read-only and represents which documentList the document is created in. |  [optional] |
|**contentLength** | **Long** | The size of the content subresource in decimal number of OCTETs.  When updating the content subresource, the  contentLength is captured from the  Content-Length header, if present, or is otherwise computed from the total size of the http body. |  [optional] |
|**contentMimeType** | **String** | The mime type of the document&#39;s binary content, provided via the Content-Type header when updating the content  subresource. If no value is provided then \&quot;application/octet-stream\&quot; is set by default. |  [optional] |
|**contentUpdateDate** | **OffsetDateTime** | The date and time the most recent content update was made via the content subresource. UTC date/time.  System-supplied and read-only. |  [optional] |
|**publishState** | **String** | The current publish status of the document. If publishing is not supported or is currently disabled in the  documentList then the value will be \&quot;active\&quot;.  If publishing is supported and enabled, then the publish state may be \&quot;draft\&quot; or \&quot;active\&quot;. A document may have both  an \&quot;active\&quot; and \&quot;draft\&quot; version. The publishState  denotes which version of the document being interacted with. This field is read-only. |  [optional] |
|**properties** | **Object** | A JSON object of name/value pairs. Name parts are matched against the underlying documentType properties names. Any  matching name parts must have a value part that conforms to the matching property schema.  Any non-matching name/value pairs are considered dynamic schema and may have a value part of valid JSON.  The properties field can be used for sorting/filtering and can be projected in the documents returned within a  documentList view. |  [optional] |
|**insertDate** | **OffsetDateTime** | The date and time the document was added to the documentList. This field is system-supplied and read-only. |  [optional] |
|**updateDate** | **OffsetDateTime** | The date and time the most recent document update was made. If publishing is enabled, then this value will  represent  the last draft update if the publishState is draft, or the last publish date if the publishState is active. |  [optional] |
|**activeDateRange** | [**ContentActiveDateRange**](ContentActiveDateRange.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


