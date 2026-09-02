# DocumentsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**copyDocuments**](DocumentsApi.md#copyDocuments) | **PUT** /content/documentlists/{documentListName}/documents/copy | Copy Document |
| [**createDocument**](DocumentsApi.md#createDocument) | **POST** /content/documentlists/{documentListName}/documents | Create Document |
| [**deleteByPath**](DocumentsApi.md#deleteByPath) | **DELETE** /content/documentlists/{documentListName}/documents | Delete Documents |
| [**deleteDocument**](DocumentsApi.md#deleteDocument) | **DELETE** /content/documentlists/{documentListName}/documents/{documentId} | Delete Document |
| [**deleteDocumentContent**](DocumentsApi.md#deleteDocumentContent) | **DELETE** /content/documentlists/{documentListName}/documents/{documentId}/content | Delete Document Content |
| [**deleteTreeDocumentContent**](DocumentsApi.md#deleteTreeDocumentContent) | **DELETE** /content/documentlists/{documentListName}/documentTree/{documentName}/content | Delete Document Content by Path |
| [**getDocument**](DocumentsApi.md#getDocument) | **GET** /content/documentlists/{documentListName}/documents/{documentId} | Get Document |
| [**getDocumentContent**](DocumentsApi.md#getDocumentContent) | **GET** /content/documentlists/{documentListName}/documents/{documentId}/content | Get Document Content |
| [**getDocumentContentHead**](DocumentsApi.md#getDocumentContentHead) | **HEAD** /content/documentlists/{documentListName}/documents/{documentId}/content | Get Document Content Headers |
| [**getDocuments**](DocumentsApi.md#getDocuments) | **GET** /content/documentlists/{documentListName}/documents | Get Documents |
| [**getTreeDocument**](DocumentsApi.md#getTreeDocument) | **GET** /content/documentlists/{documentListName}/documentTree/{documentName} | Get Document by Path |
| [**getTreeDocumentContent**](DocumentsApi.md#getTreeDocumentContent) | **GET** /content/documentlists/{documentListName}/documentTree/{documentName}/content | Get Document Content by Path |
| [**getTreeDocumentContentHead**](DocumentsApi.md#getTreeDocumentContentHead) | **HEAD** /content/documentlists/{documentListName}/documentTree/{documentName}/content | Get Document Content Headers by Path |
| [**moveByPath**](DocumentsApi.md#moveByPath) | **PUT** /content/documentlists/{documentListName}/documents/move | Move Document |
| [**patchDocument**](DocumentsApi.md#patchDocument) | **PATCH** /content/documentlists/{documentListName}/documents/{documentId} | Patch Document |
| [**transformDocumentContent**](DocumentsApi.md#transformDocumentContent) | **GET** /content/documentlists/{documentListName}/documents/{documentId}/transform | Get Resized Image |
| [**transformTreeDocumentContent**](DocumentsApi.md#transformTreeDocumentContent) | **GET** /content/documentlists/{documentListName}/documentTree/{documentName}/transform | Get Resized Image by Path |
| [**updateDocument**](DocumentsApi.md#updateDocument) | **PUT** /content/documentlists/{documentListName}/documents/{documentId} | Update Document |
| [**updateDocumentContent**](DocumentsApi.md#updateDocumentContent) | **PUT** /content/documentlists/{documentListName}/documents/{documentId}/content | Update Document Content |
| [**updateTreeDocumentContent**](DocumentsApi.md#updateTreeDocumentContent) | **PUT** /content/documentlists/{documentListName}/documentTree/{documentName}/content | Update Document Content by Path |


<a name="copyDocuments"></a>
# **copyDocuments**
> DocumentCopyResponse copyDocuments(documentListName, responseFields, documentCopyRequest)

Copy Document

Copy Document

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | DocumentListName name where the documents reside
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    DocumentCopyRequest documentCopyRequest = new DocumentCopyRequest(); // DocumentCopyRequest | Request containing Document Ids to copy and the destination path
    try {
      DocumentCopyResponse result = apiInstance.copyDocuments(documentListName, responseFields, documentCopyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#copyDocuments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**| DocumentListName name where the documents reside | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **documentCopyRequest** | [**DocumentCopyRequest**](DocumentCopyRequest.md)| Request containing Document Ids to copy and the destination path | [optional] |

### Return type

[**DocumentCopyResponse**](DocumentCopyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, text/plain
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createDocument"></a>
# **createDocument**
> Document createDocument(documentListName, responseFields, document)

Create Document

Create Document. However, if you are creating an empty folder in the files list then you only need to provide the name, documentTypeFQN, and listFQN fields - replace the name value with the full path of your folder.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Document document = new Document(); // Document | The Mozu.Content.Contracts.Document to Add to the Mozu.Content.Contracts.DocumentList
    try {
      Document result = apiInstance.createDocument(documentListName, responseFields, document);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#createDocument");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **document** | [**Document**](Document.md)| The Mozu.Content.Contracts.Document to Add to the Mozu.Content.Contracts.DocumentList | [optional] |

### Return type

[**Document**](Document.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, text/plain
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteByPath"></a>
# **deleteByPath**
> deleteByPath(documentListName, path)

Delete Documents

Delete Documents

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String path = "path_example"; // String | 
    try {
      apiInstance.deleteByPath(documentListName, path);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#deleteByPath");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**|  | |
| **path** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteDocument"></a>
# **deleteDocument**
> deleteDocument(documentListName, documentId)

Delete Document

Delete Document

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String documentId = "documentId_example"; // String | 
    try {
      apiInstance.deleteDocument(documentListName, documentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#deleteDocument");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**|  | |
| **documentId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteDocumentContent"></a>
# **deleteDocumentContent**
> deleteDocumentContent(documentListName, documentId)

Delete Document Content

Delete Document Content

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String documentId = "documentId_example"; // String | 
    try {
      apiInstance.deleteDocumentContent(documentListName, documentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#deleteDocumentContent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**|  | |
| **documentId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteTreeDocumentContent"></a>
# **deleteTreeDocumentContent**
> deleteTreeDocumentContent(documentListName, documentName, contentHttpRequestMessage)

Delete Document Content by Path

Delete Document Content by Path

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String documentName = "documentName_example"; // String | 
    ContentHttpRequestMessage contentHttpRequestMessage = new ContentHttpRequestMessage(); // ContentHttpRequestMessage | 
    try {
      apiInstance.deleteTreeDocumentContent(documentListName, documentName, contentHttpRequestMessage);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#deleteTreeDocumentContent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**|  | |
| **documentName** | **String**|  | |
| **contentHttpRequestMessage** | [**ContentHttpRequestMessage**](ContentHttpRequestMessage.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, text/plain
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDocument"></a>
# **getDocument**
> Document getDocument(documentListName, documentId, includeInactive, responseFields)

Get Document

Get Document

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String documentId = "documentId_example"; // String | 
    Boolean includeInactive = true; // Boolean | if this call should include a adocument that isn't active in the given preview date
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Document result = apiInstance.getDocument(documentListName, documentId, includeInactive, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getDocument");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**|  | |
| **documentId** | **String**|  | |
| **includeInactive** | **Boolean**| if this call should include a adocument that isn&#39;t active in the given preview date | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Document**](Document.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDocumentContent"></a>
# **getDocumentContent**
> getDocumentContent(documentListName, documentId, responseFields)

Get Document Content

Get Document Content

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String documentId = "documentId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.getDocumentContent(documentListName, documentId, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getDocumentContent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**|  | |
| **documentId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDocumentContentHead"></a>
# **getDocumentContentHead**
> getDocumentContentHead(documentListName, documentId, includeInactive, responseFields)

Get Document Content Headers

Get Document Content Headers

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String documentId = "documentId_example"; // String | 
    String includeInactive = "includeInactive_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.getDocumentContentHead(documentListName, documentId, includeInactive, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getDocumentContentHead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**|  | |
| **documentId** | **String**|  | |
| **includeInactive** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDocuments"></a>
# **getDocuments**
> DocumentCollection getDocuments(documentListName, filter, sortBy, pageSize, startIndex, includeInactive, path, includeSubPaths, queryScope, fullSearch, responseFields)

Get Documents

Get Documents. To search documents along a particular path, use the filter path such as in \&quot;folder1\\folder2\\\&quot;. If no path is provided, then the query will be a global search as it searches from the root of the tree hierarchy.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String filter = "filter_example"; // String | Mozu.Content.Contracts.PropertyType filter expression to match against document properties. <seealso cref=\"T:Mozu.Core.FilterParsing.FilterParser\" />
    String sortBy = "sortBy_example"; // String | Sort expression.  <seealso cref=\"T:Mozu.Core.FilterParsing.SortParser\" />
    Integer pageSize = 56; // Integer | Page size
    Integer startIndex = 56; // Integer | First item in the page to return from the total result set
    Boolean includeInactive = true; // Boolean | if this call should include a adocument that isn't active in the given preview date
    String path = "path_example"; // String | path from which to return documents
    Boolean includeSubPaths = false; // Boolean | if true this call will populate Subpaths
    String queryScope = "SpecifiedPathOnly"; // String | Determines if the path parameter is used to scope the query to the specified path or ignored for a global scope.             Defaults to specified path only. Valid values are: SpecifiedPathOnly, Global
    Boolean fullSearch = false; // Boolean | When `true`, performs an exhaustive search guaranteeing all matching documents are returned. Slower than the default on large lists. Returns HTTP 400 if the document list exceeds the configured maximum size threshold (default 100,000). Defaults to `false`, optimizing for speed.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      DocumentCollection result = apiInstance.getDocuments(documentListName, filter, sortBy, pageSize, startIndex, includeInactive, path, includeSubPaths, queryScope, fullSearch, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getDocuments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**|  | |
| **filter** | **String**| Mozu.Content.Contracts.PropertyType filter expression to match against document properties. &lt;seealso cref&#x3D;\&quot;T:Mozu.Core.FilterParsing.FilterParser\&quot; /&gt; | [optional] |
| **sortBy** | **String**| Sort expression.  &lt;seealso cref&#x3D;\&quot;T:Mozu.Core.FilterParsing.SortParser\&quot; /&gt; | [optional] |
| **pageSize** | **Integer**| Page size | [optional] |
| **startIndex** | **Integer**| First item in the page to return from the total result set | [optional] |
| **includeInactive** | **Boolean**| if this call should include a adocument that isn&#39;t active in the given preview date | [optional] |
| **path** | **String**| path from which to return documents | [optional] |
| **includeSubPaths** | **Boolean**| if true this call will populate Subpaths | [optional] [default to false] |
| **queryScope** | **String**| Determines if the path parameter is used to scope the query to the specified path or ignored for a global scope.             Defaults to specified path only. Valid values are: SpecifiedPathOnly, Global | [optional] [default to SpecifiedPathOnly] |
| **fullSearch** | **Boolean**| When &#x60;true&#x60;, performs an exhaustive search guaranteeing all matching documents are returned. Slower than the default on large lists. Returns HTTP 400 if the document list exceeds the configured maximum size threshold (default 100,000). Defaults to &#x60;false&#x60;, optimizing for speed. | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**DocumentCollection**](DocumentCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getTreeDocument"></a>
# **getTreeDocument**
> Document getTreeDocument(documentListName, documentName, includeInactive, responseFields)

Get Document by Path

Retrieves a specific Document within the specified ContentCollection using the specified document name, unique within a specific folder with the specified documentId, version, and status.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String documentName = "documentName_example"; // String | 
    Boolean includeInactive = true; // Boolean | if this call should include a document that isn't active in the given preview date
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Document result = apiInstance.getTreeDocument(documentListName, documentName, includeInactive, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getTreeDocument");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**|  | |
| **documentName** | **String**|  | |
| **includeInactive** | **Boolean**| if this call should include a document that isn&#39;t active in the given preview date | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Document**](Document.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getTreeDocumentContent"></a>
# **getTreeDocumentContent**
> getTreeDocumentContent(documentListName, documentName, responseFields)

Get Document Content by Path

Returns transformations on a document. For example, resizing an image.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String documentName = "documentName_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.getTreeDocumentContent(documentListName, documentName, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getTreeDocumentContent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**|  | |
| **documentName** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getTreeDocumentContentHead"></a>
# **getTreeDocumentContentHead**
> getTreeDocumentContentHead(documentListName, documentName, responseFields)

Get Document Content Headers by Path

Get Document Content Headers by Path

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String documentName = "documentName_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.getTreeDocumentContentHead(documentListName, documentName, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getTreeDocumentContentHead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**|  | |
| **documentName** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="moveByPath"></a>
# **moveByPath**
> DocumentMoveSummary moveByPath(documentListName, sourcePath, destPath, renameDuplicates, previewMode, responseFields)

Move Document

Move Document. This updates the path on all documents within a given source path to a new destination path, such as when moving documents between folders. Individual document moves should be made through the UpdateDocument operation instead.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | DocumentListName name where the document resides
    String sourcePath = "sourcePath_example"; // String | Source path
    String destPath = "destPath_example"; // String | Destination path
    Boolean renameDuplicates = true; // Boolean | Flag to rename file if duplicate filename exists in destination (defaults to true)
    Boolean previewMode = false; // Boolean | Flag to denote whether to preview move operation or actually perform (defaults to false)
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      DocumentMoveSummary result = apiInstance.moveByPath(documentListName, sourcePath, destPath, renameDuplicates, previewMode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#moveByPath");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**| DocumentListName name where the document resides | |
| **sourcePath** | **String**| Source path | [optional] |
| **destPath** | **String**| Destination path | [optional] |
| **renameDuplicates** | **Boolean**| Flag to rename file if duplicate filename exists in destination (defaults to true) | [optional] [default to true] |
| **previewMode** | **Boolean**| Flag to denote whether to preview move operation or actually perform (defaults to false) | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**DocumentMoveSummary**](DocumentMoveSummary.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="patchDocument"></a>
# **patchDocument**
> Document patchDocument(documentListName, documentId, responseFields, document)

Patch Document

Patch Document

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String documentId = "documentId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Document document = new Document(); // Document | 
    try {
      Document result = apiInstance.patchDocument(documentListName, documentId, responseFields, document);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#patchDocument");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**|  | |
| **documentId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **document** | [**Document**](Document.md)|  | [optional] |

### Return type

[**Document**](Document.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, text/plain
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="transformDocumentContent"></a>
# **transformDocumentContent**
> transformDocumentContent(documentListName, documentId, width, height, max, maxWidth, maxHeight, crop, quality, responseFields)

Get Resized Image

Returns transformations on a document. For example, resizing an image.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String documentId = "documentId_example"; // String | 
    Integer width = 56; // Integer | 
    Integer height = 56; // Integer | 
    Integer max = 56; // Integer | 
    Integer maxWidth = 56; // Integer | 
    Integer maxHeight = 56; // Integer | 
    String crop = "crop_example"; // String | 
    Integer quality = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.transformDocumentContent(documentListName, documentId, width, height, max, maxWidth, maxHeight, crop, quality, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#transformDocumentContent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**|  | |
| **documentId** | **String**|  | |
| **width** | **Integer**|  | [optional] |
| **height** | **Integer**|  | [optional] |
| **max** | **Integer**|  | [optional] |
| **maxWidth** | **Integer**|  | [optional] |
| **maxHeight** | **Integer**|  | [optional] |
| **crop** | **String**|  | [optional] |
| **quality** | **Integer**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="transformTreeDocumentContent"></a>
# **transformTreeDocumentContent**
> transformTreeDocumentContent(documentListName, documentName, width, height, max, maxWidth, maxHeight, crop, quality, responseFields)

Get Resized Image by Path

Returns transformations on a document. For example, resizing an image. By Path

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String documentName = "documentName_example"; // String | 
    Integer width = 56; // Integer | 
    Integer height = 56; // Integer | 
    Integer max = 56; // Integer | 
    Integer maxWidth = 56; // Integer | 
    Integer maxHeight = 56; // Integer | 
    String crop = "crop_example"; // String | 
    Integer quality = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.transformTreeDocumentContent(documentListName, documentName, width, height, max, maxWidth, maxHeight, crop, quality, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#transformTreeDocumentContent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**|  | |
| **documentName** | **String**|  | |
| **width** | **Integer**|  | [optional] |
| **height** | **Integer**|  | [optional] |
| **max** | **Integer**|  | [optional] |
| **maxWidth** | **Integer**|  | [optional] |
| **maxHeight** | **Integer**|  | [optional] |
| **crop** | **String**|  | [optional] |
| **quality** | **Integer**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateDocument"></a>
# **updateDocument**
> Document updateDocument(documentListName, documentId, responseFields, document)

Update Document

Update Document

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | DocumentListName name where the document resides
    String documentId = "documentId_example"; // String | Id of the document to update
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Document document = new Document(); // Document | 
    try {
      Document result = apiInstance.updateDocument(documentListName, documentId, responseFields, document);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#updateDocument");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**| DocumentListName name where the document resides | |
| **documentId** | **String**| Id of the document to update | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **document** | [**Document**](Document.md)|  | [optional] |

### Return type

[**Document**](Document.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, text/plain
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateDocumentContent"></a>
# **updateDocumentContent**
> updateDocumentContent(documentListName, documentId, responseFields, contentHttpRequestMessage)

Update Document Content

Update Document Content

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String documentId = "documentId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ContentHttpRequestMessage contentHttpRequestMessage = new ContentHttpRequestMessage(); // ContentHttpRequestMessage | 
    try {
      apiInstance.updateDocumentContent(documentListName, documentId, responseFields, contentHttpRequestMessage);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#updateDocumentContent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**|  | |
| **documentId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **contentHttpRequestMessage** | [**ContentHttpRequestMessage**](ContentHttpRequestMessage.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, text/plain
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateTreeDocumentContent"></a>
# **updateTreeDocumentContent**
> updateTreeDocumentContent(documentListName, documentName, responseFields, contentHttpRequestMessage)

Update Document Content by Path

Update Document Content by Path

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | The Mozu.Content.Contracts.DocumentList in which the document resides
    String documentName = "documentName_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ContentHttpRequestMessage contentHttpRequestMessage = new ContentHttpRequestMessage(); // ContentHttpRequestMessage | Binary document content to store must be less than 16M
    try {
      apiInstance.updateTreeDocumentContent(documentListName, documentName, responseFields, contentHttpRequestMessage);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#updateTreeDocumentContent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentListName** | **String**| The Mozu.Content.Contracts.DocumentList in which the document resides | |
| **documentName** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **contentHttpRequestMessage** | [**ContentHttpRequestMessage**](ContentHttpRequestMessage.md)| Binary document content to store must be less than 16M | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, text/plain
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

