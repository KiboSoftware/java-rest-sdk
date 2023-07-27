# SynonymApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listSynonyms**](SynonymApi.md#listSynonyms) | **GET** /commerce/catalog/admin/searchSchema/synonyms | List Synonyms |
| [**updateSynonyms**](SynonymApi.md#updateSynonyms) | **POST** /commerce/catalog/admin/searchSchema/synonyms/reload | Update Synonyms |


<a name="listSynonyms"></a>
# **listSynonyms**
> String listSynonyms(language)

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SynonymApi apiInstance = new SynonymApi(defaultClient);
    String language = "language_example"; // String | 
    try {
      String result = apiInstance.listSynonyms(language);
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

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSynonyms"></a>
# **updateSynonyms**
> Boolean updateSynonyms()

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SynonymApi apiInstance = new SynonymApi(defaultClient);
    try {
      Boolean result = apiInstance.updateSynonyms();
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
This endpoint does not need any parameter.

### Return type

**Boolean**

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

