# DocumentTypeApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDocumentType**](DocumentTypeApi.md#createDocumentType) | **POST** /content/documenttypes | Create Document Type |
| [**getDocumentType**](DocumentTypeApi.md#getDocumentType) | **GET** /content/documenttypes/{documentTypeName} | Get Document Type |
| [**getDocumentTypes**](DocumentTypeApi.md#getDocumentTypes) | **GET** /content/documenttypes | Get Document Types |
| [**updateDocumentType**](DocumentTypeApi.md#updateDocumentType) | **PUT** /content/documenttypes/{documentTypeName} | Update Document Type |


<a name="createDocumentType"></a>
# **createDocumentType**
> DocumentType createDocumentType(responseFields, documentType)

Create Document Type

Create Document Type. All documents have a Document Type that describes the schema that the document must implement and its associated metadata, and is validated whenever a document is created or modified. The immutable types defined out-of-the-box are web_page, entityEditor, document, image, snippets, productContent, categoryContent, pageTemplateContent, emailTemplateContent, and folder.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentTypeApi apiInstance = new DocumentTypeApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    DocumentType documentType = new DocumentType(); // DocumentType | 
    try {
      DocumentType result = apiInstance.createDocumentType(responseFields, documentType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentTypeApi#createDocumentType");
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
| **documentType** | [**DocumentType**](DocumentType.md)|  | [optional] |

### Return type

[**DocumentType**](DocumentType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, text/plain
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDocumentType"></a>
# **getDocumentType**
> DocumentType getDocumentType(documentTypeName, responseFields)

Get Document Type

Get Document Type

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentTypeApi apiInstance = new DocumentTypeApi(defaultClient);
    String documentTypeName = "documentTypeName_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      DocumentType result = apiInstance.getDocumentType(documentTypeName, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentTypeApi#getDocumentType");
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
| **documentTypeName** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**DocumentType**](DocumentType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDocumentTypes"></a>
# **getDocumentTypes**
> DocumentTypeCollection getDocumentTypes(pageSize, startIndex, responseFields)

Get Document Types

Get Document Types. All documents have a Document Type that describes the schema that the document must implement and its associated metadata, and is validated whenever a document is created or modified. The immutable types defined out-of-the-box are web_page, entityEditor, document, image, snippets, productContent, categoryContent, pageTemplateContent, emailTemplateContent, and folder.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentTypeApi apiInstance = new DocumentTypeApi(defaultClient);
    Integer pageSize = 56; // Integer | 
    Integer startIndex = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      DocumentTypeCollection result = apiInstance.getDocumentTypes(pageSize, startIndex, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentTypeApi#getDocumentTypes");
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

[**DocumentTypeCollection**](DocumentTypeCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateDocumentType"></a>
# **updateDocumentType**
> DocumentType updateDocumentType(documentTypeName, responseFields, documentType)

Update Document Type

Update Document Type

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DocumentTypeApi apiInstance = new DocumentTypeApi(defaultClient);
    String documentTypeName = "documentTypeName_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    DocumentType documentType = new DocumentType(); // DocumentType | 
    try {
      DocumentType result = apiInstance.updateDocumentType(documentTypeName, responseFields, documentType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentTypeApi#updateDocumentType");
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
| **documentTypeName** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **documentType** | [**DocumentType**](DocumentType.md)|  | [optional] |

### Return type

[**DocumentType**](DocumentType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, text/plain
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

