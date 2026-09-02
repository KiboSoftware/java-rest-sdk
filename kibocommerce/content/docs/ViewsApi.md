# ViewsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getViewDocuments**](ViewsApi.md#getViewDocuments) | **GET** /content/documentlists/{documentListName}/views/{viewName}/documents | Get View Documents |


<a name="getViewDocuments"></a>
# **getViewDocuments**
> DocumentCollection getViewDocuments(documentListName, viewName, filter, sortBy, pageSize, startIndex, includeInactive, fullSearch, responseFields)

Get View Documents

When fullSearch is &#x60;true&#x60;, performs an exhaustive search to ensure all matching documents are returned. May be slower on very large lists. Returns HTTP 400 if the document list exceeds the configured maximum size (default 100,000). Defaults to &#x60;false&#x60;, which performs a faster search optimized for recently updated documents.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.ViewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ViewsApi apiInstance = new ViewsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String viewName = "viewName_example"; // String | 
    String filter = "filter_example"; // String | 
    String sortBy = "sortBy_example"; // String | 
    Integer pageSize = 56; // Integer | 
    Integer startIndex = 56; // Integer | 
    Boolean includeInactive = true; // Boolean | 
    Boolean fullSearch = false; // Boolean | When `true`, performs an exhaustive search guaranteeing all matching documents are returned. Slower than the default on large lists. Returns HTTP 400 if the document list exceeds the configured maximum size threshold (default 100,000). Defaults to `false`, optimizing for speed.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      DocumentCollection result = apiInstance.getViewDocuments(documentListName, viewName, filter, sortBy, pageSize, startIndex, includeInactive, fullSearch, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#getViewDocuments");
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
| **viewName** | **String**|  | |
| **filter** | **String**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **startIndex** | **Integer**|  | [optional] |
| **includeInactive** | **Boolean**|  | [optional] |
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

