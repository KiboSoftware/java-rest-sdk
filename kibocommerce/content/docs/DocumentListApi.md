# DocumentListApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDocumentList**](DocumentListApi.md#createDocumentList) | **POST** /content/documentlists | Create DocumentList |
| [**deleteDocumentList**](DocumentListApi.md#deleteDocumentList) | **DELETE** /content/documentlists/{documentListName} | Delete Document List |
| [**getDocumentList**](DocumentListApi.md#getDocumentList) | **GET** /content/documentlists/{documentListName} | Get Document List |
| [**getDocumentLists**](DocumentListApi.md#getDocumentLists) | **GET** /content/documentlists | Get Document Lists |
| [**updateDocumentList**](DocumentListApi.md#updateDocumentList) | **PUT** /content/documentlists/{documentListName} | Update Document List |


<a name="createDocumentList"></a>
# **createDocumentList**
> DocumentList createDocumentList(responseFields, documentList)

Create DocumentList

Create DocumentList

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentListApi apiInstance = new DocumentListApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    DocumentList documentList = new DocumentList(); // DocumentList | DocumentListName
    try {
      DocumentList result = apiInstance.createDocumentList(responseFields, documentList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentListApi#createDocumentList");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **documentList** | [**DocumentList**](DocumentList.md)| DocumentListName | [optional] |

### Return type

[**DocumentList**](DocumentList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, text/plain
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteDocumentList"></a>
# **deleteDocumentList**
> deleteDocumentList(documentListName)

Delete Document List

Delete Document List

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentListApi apiInstance = new DocumentListApi(defaultClient);
    String documentListName = "documentListName_example"; // String | Name of content documentListName to delete
    try {
      apiInstance.deleteDocumentList(documentListName);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentListApi#deleteDocumentList");
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
| **documentListName** | **String**| Name of content documentListName to delete | |

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

<a name="getDocumentList"></a>
# **getDocumentList**
> DocumentList getDocumentList(documentListName, responseFields)

Get Document List

Get Document List. The document list can only be accessed if the API context is inclusive of the document list&#39;s scope. A document list always belongs to a tenant context, denoted by the scopeType and scopeId fields. For example, if a list belongs to Catalog 123 then it is denoted by scopeType&#x3D;catalog and scopeId&#x3D;123.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentListApi apiInstance = new DocumentListApi(defaultClient);
    String documentListName = "documentListName_example"; // String | Name of document documentListName to retrieve
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      DocumentList result = apiInstance.getDocumentList(documentListName, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentListApi#getDocumentList");
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
| **documentListName** | **String**| Name of document documentListName to retrieve | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**DocumentList**](DocumentList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDocumentLists"></a>
# **getDocumentLists**
> DocumentListCollection getDocumentLists(pageSize, startIndex, responseFields)

Get Document Lists

Retrieve a paged documentListName of all document lists

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentListApi apiInstance = new DocumentListApi(defaultClient);
    Integer pageSize = 56; // Integer | maximum number of items to return
    Integer startIndex = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      DocumentListCollection result = apiInstance.getDocumentLists(pageSize, startIndex, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentListApi#getDocumentLists");
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
| **pageSize** | **Integer**| maximum number of items to return | [optional] |
| **startIndex** | **Integer**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**DocumentListCollection**](DocumentListCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateDocumentList"></a>
# **updateDocumentList**
> DocumentList updateDocumentList(documentListName, responseFields, documentList)

Update Document List

Update Document List. The document list can only be accessed if the API context is inclusive of the document list&#39;s scope. A document list always belongs to a tenant context, denoted by the scopeType and scopeId fields. For example, if a list belongs to Catalog 123 then it is denoted by scopeType&#x3D;catalog and scopeId&#x3D;123.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentListApi apiInstance = new DocumentListApi(defaultClient);
    String documentListName = "documentListName_example"; // String | The name of the documentList to update
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    DocumentList documentList = new DocumentList(); // DocumentList | Content Collection values to apply
    try {
      DocumentList result = apiInstance.updateDocumentList(documentListName, responseFields, documentList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentListApi#updateDocumentList");
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
| **documentListName** | **String**| The name of the documentList to update | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **documentList** | [**DocumentList**](DocumentList.md)| Content Collection values to apply | [optional] |

### Return type

[**DocumentList**](DocumentList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, text/plain
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

