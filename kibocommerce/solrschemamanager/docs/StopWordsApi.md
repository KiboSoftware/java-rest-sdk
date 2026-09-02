# StopWordsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downLoadStopWords**](StopWordsApi.md#downLoadStopWords) | **GET** /commerce/catalog/admin/searchSchema/stopwords/{language} | Get Stopwords |
| [**uploadStopWords**](StopWordsApi.md#uploadStopWords) | **PUT** /commerce/catalog/admin/searchSchema/stopwords/{language} | Add Stopwords |


<a name="downLoadStopWords"></a>
# **downLoadStopWords**
> downLoadStopWords(language, responseFields)

Get Stopwords

Downloads the stopwords file for the language. This is a .txt file, not a JSON response.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.solrschemamanager.ApiClient;
import com.kibocommerce.sdk.solrschemamanager.ApiException;
import com.kibocommerce.sdk.solrschemamanager.Configuration;
import com.kibocommerce.sdk.solrschemamanager.auth.*;
import com.kibocommerce.sdk.solrschemamanager.models.*;
import com.kibocommerce.sdk.solrschemamanager.api.StopWordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    StopWordsApi apiInstance = new StopWordsApi(defaultClient);
    String language = "language_example"; // String | Language code (en, es, fr)
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.downLoadStopWords(language, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling StopWordsApi#downLoadStopWords");
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
| **language** | **String**| Language code (en, es, fr) | |
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

<a name="uploadStopWords"></a>
# **uploadStopWords**
> List&lt;String&gt; uploadStopWords(language, responseFields)

Add Stopwords

Upload a stopwords file for a language as a list of strings. This should be a .txt file, not JSON.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.solrschemamanager.ApiClient;
import com.kibocommerce.sdk.solrschemamanager.ApiException;
import com.kibocommerce.sdk.solrschemamanager.Configuration;
import com.kibocommerce.sdk.solrschemamanager.auth.*;
import com.kibocommerce.sdk.solrschemamanager.models.*;
import com.kibocommerce.sdk.solrschemamanager.api.StopWordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    StopWordsApi apiInstance = new StopWordsApi(defaultClient);
    String language = "language_example"; // String | Language code use by the site (en, es, fr)
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<String> result = apiInstance.uploadStopWords(language, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StopWordsApi#uploadStopWords");
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
| **language** | **String**| Language code use by the site (en, es, fr) | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

