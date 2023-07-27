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
> DocumentType createDocumentType(documentType)

Create Document Type

Create Document Type

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    DocumentTypeApi apiInstance = new DocumentTypeApi(defaultClient);
    DocumentType documentType = new DocumentType(); // DocumentType | 
    try {
      DocumentType result = apiInstance.createDocumentType(documentType);
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
| **documentType** | [**DocumentType**](DocumentType.md)|  | [optional] |

### Return type

[**DocumentType**](DocumentType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: text/plain, application/octet-stream, application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDocumentType"></a>
# **getDocumentType**
> DocumentType getDocumentType(documentTypeName)

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    DocumentTypeApi apiInstance = new DocumentTypeApi(defaultClient);
    String documentTypeName = "documentTypeName_example"; // String | 
    try {
      DocumentType result = apiInstance.getDocumentType(documentTypeName);
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

### Return type

[**DocumentType**](DocumentType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDocumentTypes"></a>
# **getDocumentTypes**
> DocumentTypeCollection getDocumentTypes(pageSize, startIndex)

Get Document Types

Get Document Types

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    DocumentTypeApi apiInstance = new DocumentTypeApi(defaultClient);
    Integer pageSize = 56; // Integer | 
    Integer startIndex = 56; // Integer | 
    try {
      DocumentTypeCollection result = apiInstance.getDocumentTypes(pageSize, startIndex);
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

### Return type

[**DocumentTypeCollection**](DocumentTypeCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateDocumentType"></a>
# **updateDocumentType**
> DocumentType updateDocumentType(documentTypeName, documentType)

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    DocumentTypeApi apiInstance = new DocumentTypeApi(defaultClient);
    String documentTypeName = "documentTypeName_example"; // String | 
    DocumentType documentType = new DocumentType(); // DocumentType | 
    try {
      DocumentType result = apiInstance.updateDocumentType(documentTypeName, documentType);
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
| **documentType** | [**DocumentType**](DocumentType.md)|  | [optional] |

### Return type

[**DocumentType**](DocumentType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: text/plain, application/octet-stream, application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

