# DocumentListTypeApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDocumentListType**](DocumentListTypeApi.md#createDocumentListType) | **POST** /content/documentlistTypes | Create Document List Type |
| [**getDocumentListType**](DocumentListTypeApi.md#getDocumentListType) | **GET** /content/documentlistTypes/{documentListTypeFQN} | Get Document List Type |
| [**getDocumentListTypes**](DocumentListTypeApi.md#getDocumentListTypes) | **GET** /content/documentlistTypes | Get Document List Types |
| [**updateDocumentListType**](DocumentListTypeApi.md#updateDocumentListType) | **PUT** /content/documentlistTypes/{documentListTypeFQN} | Update Document List Type |


<a name="createDocumentListType"></a>
# **createDocumentListType**
> DocumentListType createDocumentListType(responseFields, documentListType)

Create Document List Type

Create Document List Type. Creating a new documentListType will tell the Content service to immediately create a document list of the new type within the set scopeType. For instance, a scopeType of \&quot;site\&quot; will create a list in each site for the tenant. Any defaultDocuments defined for the type will be created within each list, which will be addressable via the type&#39;s fully qualified name (FQN) and will use the type&#39;s defined views, usages, and metadata by default.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentListTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentListTypeApi apiInstance = new DocumentListTypeApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    DocumentListType documentListType = new DocumentListType(); // DocumentListType | 
    try {
      DocumentListType result = apiInstance.createDocumentListType(responseFields, documentListType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentListTypeApi#createDocumentListType");
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
| **documentListType** | [**DocumentListType**](DocumentListType.md)|  | [optional] |

### Return type

[**DocumentListType**](DocumentListType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, text/plain
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDocumentListType"></a>
# **getDocumentListType**
> DocumentListType getDocumentListType(documentListTypeFQN, responseFields)

Get Document List Type

Get Document List Type

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentListTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentListTypeApi apiInstance = new DocumentListTypeApi(defaultClient);
    String documentListTypeFQN = "documentListTypeFQN_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      DocumentListType result = apiInstance.getDocumentListType(documentListTypeFQN, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentListTypeApi#getDocumentListType");
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
| **documentListTypeFQN** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**DocumentListType**](DocumentListType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDocumentListTypes"></a>
# **getDocumentListTypes**
> DocumentListTypeCollection getDocumentListTypes(pageSize, startIndex, responseFields)

Get Document List Types

Get Document List Types. The list type denotes a content type for that list of folders, sub-folders, and documents. The immutable document list types that are defined out-of-the-box are pages, siteSnippets, files, siteSettings, catalogContent, pageTemplateContent, emailTemplateContent, and entityEditors.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentListTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentListTypeApi apiInstance = new DocumentListTypeApi(defaultClient);
    Integer pageSize = 56; // Integer | 
    Integer startIndex = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      DocumentListTypeCollection result = apiInstance.getDocumentListTypes(pageSize, startIndex, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentListTypeApi#getDocumentListTypes");
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
| **pageSize** | **Integer**|  | [optional] |
| **startIndex** | **Integer**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**DocumentListTypeCollection**](DocumentListTypeCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateDocumentListType"></a>
# **updateDocumentListType**
> DocumentListType updateDocumentListType(documentListTypeFQN, responseFields, documentListType)

Update Document List Type

Update Document List Type

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentListTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentListTypeApi apiInstance = new DocumentListTypeApi(defaultClient);
    String documentListTypeFQN = "documentListTypeFQN_example"; // String | The name of the document documentListName to update
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    DocumentListType documentListType = new DocumentListType(); // DocumentListType | Content Collection values to apply
    try {
      DocumentListType result = apiInstance.updateDocumentListType(documentListTypeFQN, responseFields, documentListType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentListTypeApi#updateDocumentListType");
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
| **documentListTypeFQN** | **String**| The name of the document documentListName to update | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **documentListType** | [**DocumentListType**](DocumentListType.md)| Content Collection values to apply | [optional] |

### Return type

[**DocumentListType**](DocumentListType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, text/plain
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

