# SchemaDefinitionApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSchemaDefinition**](SchemaDefinitionApi.md#getSchemaDefinition) | **GET** /commerce/catalog/admin/searchSchema/definition/{language} | Get Schema Definition |
| [**listSchemaDefinitions**](SchemaDefinitionApi.md#listSchemaDefinitions) | **GET** /commerce/catalog/admin/searchSchema/definition | List Schema Definitions |
| [**publish**](SchemaDefinitionApi.md#publish) | **POST** /commerce/catalog/admin/searchSchema/definition/{language}/publish | Publish |
| [**revert**](SchemaDefinitionApi.md#revert) | **POST** /commerce/catalog/admin/searchSchema/definition/{language}/revert | Revert |
| [**updateSchemaDefinition**](SchemaDefinitionApi.md#updateSchemaDefinition) | **PUT** /commerce/catalog/admin/searchSchema/definition/{language} | Update Schema Definition |


<a name="getSchemaDefinition"></a>
# **getSchemaDefinition**
> SchemaDefinition getSchemaDefinition(language, published, responseFields)

Get Schema Definition

Get Schema Definition

### Example
```java
// Import classes:
import com.kibocommerce.sdk.solrschemamanager.ApiClient;
import com.kibocommerce.sdk.solrschemamanager.ApiException;
import com.kibocommerce.sdk.solrschemamanager.Configuration;
import com.kibocommerce.sdk.solrschemamanager.auth.*;
import com.kibocommerce.sdk.solrschemamanager.models.*;
import com.kibocommerce.sdk.solrschemamanager.api.SchemaDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SchemaDefinitionApi apiInstance = new SchemaDefinitionApi(defaultClient);
    String language = "language_example"; // String | 
    Boolean published = true; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SchemaDefinition result = apiInstance.getSchemaDefinition(language, published, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemaDefinitionApi#getSchemaDefinition");
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
| **published** | **Boolean**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SchemaDefinition**](SchemaDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listSchemaDefinitions"></a>
# **listSchemaDefinitions**
> List&lt;SchemaDefinition&gt; listSchemaDefinitions(responseFields)

List Schema Definitions

List Schema Definitions

### Example
```java
// Import classes:
import com.kibocommerce.sdk.solrschemamanager.ApiClient;
import com.kibocommerce.sdk.solrschemamanager.ApiException;
import com.kibocommerce.sdk.solrschemamanager.Configuration;
import com.kibocommerce.sdk.solrschemamanager.auth.*;
import com.kibocommerce.sdk.solrschemamanager.models.*;
import com.kibocommerce.sdk.solrschemamanager.api.SchemaDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SchemaDefinitionApi apiInstance = new SchemaDefinitionApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<SchemaDefinition> result = apiInstance.listSchemaDefinitions(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemaDefinitionApi#listSchemaDefinitions");
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

[**List&lt;SchemaDefinition&gt;**](SchemaDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="publish"></a>
# **publish**
> Boolean publish(language, reindex, responseFields)

Publish

Publish

### Example
```java
// Import classes:
import com.kibocommerce.sdk.solrschemamanager.ApiClient;
import com.kibocommerce.sdk.solrschemamanager.ApiException;
import com.kibocommerce.sdk.solrschemamanager.Configuration;
import com.kibocommerce.sdk.solrschemamanager.auth.*;
import com.kibocommerce.sdk.solrschemamanager.models.*;
import com.kibocommerce.sdk.solrschemamanager.api.SchemaDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SchemaDefinitionApi apiInstance = new SchemaDefinitionApi(defaultClient);
    String language = "language_example"; // String | 
    Boolean reindex = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Boolean result = apiInstance.publish(language, reindex, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemaDefinitionApi#publish");
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
| **reindex** | **Boolean**|  | [optional] [default to false] |
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

<a name="revert"></a>
# **revert**
> Boolean revert(language, responseFields)

Revert

Revert

### Example
```java
// Import classes:
import com.kibocommerce.sdk.solrschemamanager.ApiClient;
import com.kibocommerce.sdk.solrschemamanager.ApiException;
import com.kibocommerce.sdk.solrschemamanager.Configuration;
import com.kibocommerce.sdk.solrschemamanager.auth.*;
import com.kibocommerce.sdk.solrschemamanager.models.*;
import com.kibocommerce.sdk.solrschemamanager.api.SchemaDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SchemaDefinitionApi apiInstance = new SchemaDefinitionApi(defaultClient);
    String language = "language_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Boolean result = apiInstance.revert(language, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemaDefinitionApi#revert");
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

<a name="updateSchemaDefinition"></a>
# **updateSchemaDefinition**
> SchemaDefinition updateSchemaDefinition(language, responseFields, schemaDefinition)

Update Schema Definition

Update Schema Definition

### Example
```java
// Import classes:
import com.kibocommerce.sdk.solrschemamanager.ApiClient;
import com.kibocommerce.sdk.solrschemamanager.ApiException;
import com.kibocommerce.sdk.solrschemamanager.Configuration;
import com.kibocommerce.sdk.solrschemamanager.auth.*;
import com.kibocommerce.sdk.solrschemamanager.models.*;
import com.kibocommerce.sdk.solrschemamanager.api.SchemaDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SchemaDefinitionApi apiInstance = new SchemaDefinitionApi(defaultClient);
    String language = "language_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SchemaDefinition schemaDefinition = new SchemaDefinition(); // SchemaDefinition | 
    try {
      SchemaDefinition result = apiInstance.updateSchemaDefinition(language, responseFields, schemaDefinition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemaDefinitionApi#updateSchemaDefinition");
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
| **schemaDefinition** | [**SchemaDefinition**](SchemaDefinition.md)|  | [optional] |

### Return type

[**SchemaDefinition**](SchemaDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, application/zip, text/plain
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

