# DocumentPublishingApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteDocumentDrafts**](DocumentPublishingApi.md#deleteDocumentDrafts) | **POST** /content/documentpublishing/draft | Delete Document Drafts |
| [**listDocumentDraftSummaries**](DocumentPublishingApi.md#listDocumentDraftSummaries) | **GET** /content/documentpublishing/draft | Get Document Draft Summaries |
| [**publishDocuments**](DocumentPublishingApi.md#publishDocuments) | **PUT** /content/documentpublishing/active | Publish Documents |


<a name="deleteDocumentDrafts"></a>
# **deleteDocumentDrafts**
> deleteDocumentDrafts(documentLists, requestBody)

Delete Document Drafts

Remove draft of each Document associated with te id in documentIds. Send empty body to remove all drafts

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentPublishingApi;

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

    DocumentPublishingApi apiInstance = new DocumentPublishingApi(defaultClient);
    String documentLists = "documentLists_example"; // String | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      apiInstance.deleteDocumentDrafts(documentLists, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentPublishingApi#deleteDocumentDrafts");
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
| **documentLists** | **String**|  | [optional] |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: text/plain, application/octet-stream, application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listDocumentDraftSummaries"></a>
# **listDocumentDraftSummaries**
> DocumentDraftSummaryPagedCollection listDocumentDraftSummaries(pageSize, startIndex, documentLists)

Get Document Draft Summaries

Get Document Draft Summaries

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentPublishingApi;

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

    DocumentPublishingApi apiInstance = new DocumentPublishingApi(defaultClient);
    Integer pageSize = 56; // Integer | maximum number of items to return
    Integer startIndex = 56; // Integer | 
    String documentLists = "documentLists_example"; // String | 
    try {
      DocumentDraftSummaryPagedCollection result = apiInstance.listDocumentDraftSummaries(pageSize, startIndex, documentLists);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentPublishingApi#listDocumentDraftSummaries");
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
| **documentLists** | **String**|  | [optional] |

### Return type

[**DocumentDraftSummaryPagedCollection**](DocumentDraftSummaryPagedCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="publishDocuments"></a>
# **publishDocuments**
> publishDocuments(documentLists, requestBody)

Publish Documents

Publishes draft of each Document associated with the id in documentIds. Send empty body to publish all drafts

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentPublishingApi;

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

    DocumentPublishingApi apiInstance = new DocumentPublishingApi(defaultClient);
    String documentLists = "documentLists_example"; // String | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      apiInstance.publishDocuments(documentLists, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentPublishingApi#publishDocuments");
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
| **documentLists** | **String**|  | [optional] |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: text/plain, application/octet-stream, application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

