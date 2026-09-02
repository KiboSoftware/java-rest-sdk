# FieldTypeDefinitionApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFieldTypeDefinitions**](FieldTypeDefinitionApi.md#getFieldTypeDefinitions) | **GET** /commerce/catalog/admin/searchSchema/fieldTypes/{language} | Get Field Type Definitions |


<a name="getFieldTypeDefinitions"></a>
# **getFieldTypeDefinitions**
> List&lt;FieldTypeDefinitionRepositoryEntry&gt; getFieldTypeDefinitions(language, responseFields)

Get Field Type Definitions

Get Field Type Definitions

### Example
```java
// Import classes:
import com.kibocommerce.sdk.solrschemamanager.ApiClient;
import com.kibocommerce.sdk.solrschemamanager.ApiException;
import com.kibocommerce.sdk.solrschemamanager.Configuration;
import com.kibocommerce.sdk.solrschemamanager.auth.*;
import com.kibocommerce.sdk.solrschemamanager.models.*;
import com.kibocommerce.sdk.solrschemamanager.api.FieldTypeDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FieldTypeDefinitionApi apiInstance = new FieldTypeDefinitionApi(defaultClient);
    String language = "language_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<FieldTypeDefinitionRepositoryEntry> result = apiInstance.getFieldTypeDefinitions(language, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldTypeDefinitionApi#getFieldTypeDefinitions");
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
| **language** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;FieldTypeDefinitionRepositoryEntry&gt;**](FieldTypeDefinitionRepositoryEntry.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

