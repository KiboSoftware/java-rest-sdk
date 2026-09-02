# SynonymApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listSynonyms**](SynonymApi.md#listSynonyms) | **GET** /commerce/catalog/admin/searchSchema/synonyms | List Synonyms |
| [**updateSynonyms**](SynonymApi.md#updateSynonyms) | **POST** /commerce/catalog/admin/searchSchema/synonyms/reload | Update Synonyms |


<a name="listSynonyms"></a>
# **listSynonyms**
> String listSynonyms(language, responseFields)

List Synonyms

List Synonyms

### Example
```java
// Import classes:
import com.kibocommerce.sdk.solrschemamanager.ApiClient;
import com.kibocommerce.sdk.solrschemamanager.ApiException;
import com.kibocommerce.sdk.solrschemamanager.Configuration;
import com.kibocommerce.sdk.solrschemamanager.auth.*;
import com.kibocommerce.sdk.solrschemamanager.models.*;
import com.kibocommerce.sdk.solrschemamanager.api.SynonymApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SynonymApi apiInstance = new SynonymApi(defaultClient);
    String language = "language_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      String result = apiInstance.listSynonyms(language, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SynonymApi#listSynonyms");
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
| **language** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSynonyms"></a>
# **updateSynonyms**
> Boolean updateSynonyms(responseFields)

Update Synonyms

Update Synonyms

### Example
```java
// Import classes:
import com.kibocommerce.sdk.solrschemamanager.ApiClient;
import com.kibocommerce.sdk.solrschemamanager.ApiException;
import com.kibocommerce.sdk.solrschemamanager.Configuration;
import com.kibocommerce.sdk.solrschemamanager.auth.*;
import com.kibocommerce.sdk.solrschemamanager.models.*;
import com.kibocommerce.sdk.solrschemamanager.api.SynonymApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SynonymApi apiInstance = new SynonymApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Boolean result = apiInstance.updateSynonyms(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SynonymApi#updateSynonyms");
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

### Return type

**Boolean**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

