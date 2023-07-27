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
> DocumentListType createDocumentListType(documentListType)

Create Document List Type

Create Document List Type

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    DocumentListTypeApi apiInstance = new DocumentListTypeApi(defaultClient);
    DocumentListType documentListType = new DocumentListType(); // DocumentListType | 
    try {
      DocumentListType result = apiInstance.createDocumentListType(documentListType);
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
| **documentListType** | [**DocumentListType**](DocumentListType.md)|  | [optional] |

### Return type

[**DocumentListType**](DocumentListType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: text/plain, application/octet-stream, application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDocumentListType"></a>
# **getDocumentListType**
> DocumentListType getDocumentListType(documentListTypeFQN)

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    DocumentListTypeApi apiInstance = new DocumentListTypeApi(defaultClient);
    String documentListTypeFQN = "documentListTypeFQN_example"; // String | 
    try {
      DocumentListType result = apiInstance.getDocumentListType(documentListTypeFQN);
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

### Return type

[**DocumentListType**](DocumentListType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDocumentListTypes"></a>
# **getDocumentListTypes**
> DocumentListTypeCollection getDocumentListTypes(pageSize, startIndex)

Get Document List Types

Get Document List Types

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    DocumentListTypeApi apiInstance = new DocumentListTypeApi(defaultClient);
    Integer pageSize = 56; // Integer | 
    Integer startIndex = 56; // Integer | 
    try {
      DocumentListTypeCollection result = apiInstance.getDocumentListTypes(pageSize, startIndex);
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

### Return type

[**DocumentListTypeCollection**](DocumentListTypeCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateDocumentListType"></a>
# **updateDocumentListType**
> DocumentListType updateDocumentListType(documentListTypeFQN, documentListType)

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    DocumentListTypeApi apiInstance = new DocumentListTypeApi(defaultClient);
    String documentListTypeFQN = "documentListTypeFQN_example"; // String | The name of the document documentListName to update
    DocumentListType documentListType = new DocumentListType(); // DocumentListType | Content Collection values to apply
    try {
      DocumentListType result = apiInstance.updateDocumentListType(documentListTypeFQN, documentListType);
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
| **documentListType** | [**DocumentListType**](DocumentListType.md)| Content Collection values to apply | [optional] |

### Return type

[**DocumentListType**](DocumentListType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: text/plain, application/octet-stream, application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

