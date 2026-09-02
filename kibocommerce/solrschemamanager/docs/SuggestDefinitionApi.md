# SuggestDefinitionApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downLoadSuggest**](SuggestDefinitionApi.md#downLoadSuggest) | **GET** /commerce/catalog/admin/searchSchema/suggest/{language} | Downloads the suggest file for the site |
| [**getSuggestSettings**](SuggestDefinitionApi.md#getSuggestSettings) | **GET** /commerce/catalog/admin/searchSchema/suggest/settings/{language} | Gets the suggester settings for the site |
| [**updateSuggestSettings**](SuggestDefinitionApi.md#updateSuggestSettings) | **PUT** /commerce/catalog/admin/searchSchema/suggest/settings/{language} | Updates the suggester settings for the site |
| [**uploadSuggest**](SuggestDefinitionApi.md#uploadSuggest) | **PUT** /commerce/catalog/admin/searchSchema/suggest/{language} | Uploads a suggest file for the site in tab separated format) |


<a name="downLoadSuggest"></a>
# **downLoadSuggest**
> downLoadSuggest(language, responseFields)

Downloads the suggest file for the site

Downloads the suggest file for the site

### Example
```java
// Import classes:
import com.kibocommerce.sdk.solrschemamanager.ApiClient;
import com.kibocommerce.sdk.solrschemamanager.ApiException;
import com.kibocommerce.sdk.solrschemamanager.Configuration;
import com.kibocommerce.sdk.solrschemamanager.auth.*;
import com.kibocommerce.sdk.solrschemamanager.models.*;
import com.kibocommerce.sdk.solrschemamanager.api.SuggestDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SuggestDefinitionApi apiInstance = new SuggestDefinitionApi(defaultClient);
    String language = "language_example"; // String | Language code used by the site (en, es, fr)
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.downLoadSuggest(language, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuggestDefinitionApi#downLoadSuggest");
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
| **language** | **String**| Language code used by the site (en, es, fr) | |
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

<a name="getSuggestSettings"></a>
# **getSuggestSettings**
> Suggester getSuggestSettings(language, responseFields)

Gets the suggester settings for the site

Gets the suggester settings for the site

### Example
```java
// Import classes:
import com.kibocommerce.sdk.solrschemamanager.ApiClient;
import com.kibocommerce.sdk.solrschemamanager.ApiException;
import com.kibocommerce.sdk.solrschemamanager.Configuration;
import com.kibocommerce.sdk.solrschemamanager.auth.*;
import com.kibocommerce.sdk.solrschemamanager.models.*;
import com.kibocommerce.sdk.solrschemamanager.api.SuggestDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SuggestDefinitionApi apiInstance = new SuggestDefinitionApi(defaultClient);
    String language = "language_example"; // String | Language code use by the site (en, es, fr)
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Suggester result = apiInstance.getSuggestSettings(language, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuggestDefinitionApi#getSuggestSettings");
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

[**Suggester**](Suggester.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSuggestSettings"></a>
# **updateSuggestSettings**
> Suggester updateSuggestSettings(language, responseFields, suggester)

Updates the suggester settings for the site

Updates the suggester settings for the site

### Example
```java
// Import classes:
import com.kibocommerce.sdk.solrschemamanager.ApiClient;
import com.kibocommerce.sdk.solrschemamanager.ApiException;
import com.kibocommerce.sdk.solrschemamanager.Configuration;
import com.kibocommerce.sdk.solrschemamanager.auth.*;
import com.kibocommerce.sdk.solrschemamanager.models.*;
import com.kibocommerce.sdk.solrschemamanager.api.SuggestDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SuggestDefinitionApi apiInstance = new SuggestDefinitionApi(defaultClient);
    String language = "language_example"; // String | Language code use by the site (en, es, fr)
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Suggester suggester = new Suggester(); // Suggester | Suggest definition in
    try {
      Suggester result = apiInstance.updateSuggestSettings(language, responseFields, suggester);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuggestDefinitionApi#updateSuggestSettings");
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
| **suggester** | [**Suggester**](Suggester.md)| Suggest definition in | [optional] |

### Return type

[**Suggester**](Suggester.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, application/zip, text/plain
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="uploadSuggest"></a>
# **uploadSuggest**
> List&lt;String&gt; uploadSuggest(language, responseFields)

Uploads a suggest file for the site in tab separated format)

Uploads a suggest file for the site in tab separated format)

### Example
```java
// Import classes:
import com.kibocommerce.sdk.solrschemamanager.ApiClient;
import com.kibocommerce.sdk.solrschemamanager.ApiException;
import com.kibocommerce.sdk.solrschemamanager.Configuration;
import com.kibocommerce.sdk.solrschemamanager.auth.*;
import com.kibocommerce.sdk.solrschemamanager.models.*;
import com.kibocommerce.sdk.solrschemamanager.api.SuggestDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SuggestDefinitionApi apiInstance = new SuggestDefinitionApi(defaultClient);
    String language = "language_example"; // String | language code use by the site (en, es, fr)
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<String> result = apiInstance.uploadSuggest(language, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuggestDefinitionApi#uploadSuggest");
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
| **language** | **String**| language code use by the site (en, es, fr) | |
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

