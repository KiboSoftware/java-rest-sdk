# SearchSynonymsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSynonymDefinition**](SearchSynonymsApi.md#addSynonymDefinition) | **POST** /commerce/catalog/admin/search/synonyms | Add Synonym Definition |
| [**deleteSynonymDefinition**](SearchSynonymsApi.md#deleteSynonymDefinition) | **DELETE** /commerce/catalog/admin/search/synonyms/{synonymId} | Delete Synonym Definition |
| [**getAllSynonymDefinitionCollectionsForMasterCatalog**](SearchSynonymsApi.md#getAllSynonymDefinitionCollectionsForMasterCatalog) | **GET** /commerce/catalog/admin/search/master-catalog-synonym-definitions/{languageCode} | Get Synonym Definition Collections |
| [**getSynonymDefinition**](SearchSynonymsApi.md#getSynonymDefinition) | **GET** /commerce/catalog/admin/search/synonyms/{synonymId} | Get Synonym Definition |
| [**getSynonymDefinitionCollection**](SearchSynonymsApi.md#getSynonymDefinitionCollection) | **GET** /commerce/catalog/admin/search/synonym-definitions/{localeCode} | Get Synonym Definition Collection |
| [**getSynonymDefinitions**](SearchSynonymsApi.md#getSynonymDefinitions) | **GET** /commerce/catalog/admin/search/synonyms | Get Synonym Definitions |
| [**updateSynonymDefinition**](SearchSynonymsApi.md#updateSynonymDefinition) | **PUT** /commerce/catalog/admin/search/synonyms/{synonymId} | Update Synonym Definition |
| [**updateSynonymDefinitionCollection**](SearchSynonymsApi.md#updateSynonymDefinitionCollection) | **POST** /commerce/catalog/admin/search/synonym-definitions/{localeCode} | Add Synonym Definition Collection |


<a name="addSynonymDefinition"></a>
# **addSynonymDefinition**
> SynonymDefinition addSynonymDefinition(responseFields, synonymDefinition)

Add Synonym Definition

Add synonym definition

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSynonymsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSynonymsApi apiInstance = new SearchSynonymsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SynonymDefinition synonymDefinition = new SynonymDefinition(); // SynonymDefinition | 
    try {
      SynonymDefinition result = apiInstance.addSynonymDefinition(responseFields, synonymDefinition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSynonymsApi#addSynonymDefinition");
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
| **synonymDefinition** | [**SynonymDefinition**](SynonymDefinition.md)|  | [optional] |

### Return type

[**SynonymDefinition**](SynonymDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteSynonymDefinition"></a>
# **deleteSynonymDefinition**
> deleteSynonymDefinition(synonymId)

Delete Synonym Definition

Delete a specific synonym definition by ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSynonymsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSynonymsApi apiInstance = new SearchSynonymsApi(defaultClient);
    Integer synonymId = 56; // Integer | 
    try {
      apiInstance.deleteSynonymDefinition(synonymId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSynonymsApi#deleteSynonymDefinition");
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
| **synonymId** | **Integer**|  | |

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

<a name="getAllSynonymDefinitionCollectionsForMasterCatalog"></a>
# **getAllSynonymDefinitionCollectionsForMasterCatalog**
> SynonymDefinitionCollection getAllSynonymDefinitionCollectionsForMasterCatalog(languageCode, responseFields)

Get Synonym Definition Collections

Get synonym definition collections.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSynonymsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSynonymsApi apiInstance = new SearchSynonymsApi(defaultClient);
    String languageCode = "languageCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SynonymDefinitionCollection result = apiInstance.getAllSynonymDefinitionCollectionsForMasterCatalog(languageCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSynonymsApi#getAllSynonymDefinitionCollectionsForMasterCatalog");
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
| **languageCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SynonymDefinitionCollection**](SynonymDefinitionCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSynonymDefinition"></a>
# **getSynonymDefinition**
> SynonymDefinition getSynonymDefinition(synonymId, responseFields)

Get Synonym Definition

Get a specific synonym definition by ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSynonymsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSynonymsApi apiInstance = new SearchSynonymsApi(defaultClient);
    Integer synonymId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SynonymDefinition result = apiInstance.getSynonymDefinition(synonymId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSynonymsApi#getSynonymDefinition");
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
| **synonymId** | **Integer**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SynonymDefinition**](SynonymDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSynonymDefinitionCollection"></a>
# **getSynonymDefinitionCollection**
> SynonymDefinitionCollection getSynonymDefinitionCollection(localeCode, responseFields)

Get Synonym Definition Collection

Get synonym definition collection.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSynonymsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSynonymsApi apiInstance = new SearchSynonymsApi(defaultClient);
    String localeCode = "localeCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SynonymDefinitionCollection result = apiInstance.getSynonymDefinitionCollection(localeCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSynonymsApi#getSynonymDefinitionCollection");
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
| **localeCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SynonymDefinitionCollection**](SynonymDefinitionCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSynonymDefinitions"></a>
# **getSynonymDefinitions**
> SynonymDefinitionPagedCollection getSynonymDefinitions(startIndex, pageSize, sortBy, filter, responseFields)

Get Synonym Definitions

Get synonym definitions.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSynonymsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSynonymsApi apiInstance = new SearchSynonymsApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SynonymDefinitionPagedCollection result = apiInstance.getSynonymDefinitions(startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSynonymsApi#getSynonymDefinitions");
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
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 0] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SynonymDefinitionPagedCollection**](SynonymDefinitionPagedCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSynonymDefinition"></a>
# **updateSynonymDefinition**
> SynonymDefinition updateSynonymDefinition(synonymId, responseFields, synonymDefinition)

Update Synonym Definition

Update a specific synonym definition by ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSynonymsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSynonymsApi apiInstance = new SearchSynonymsApi(defaultClient);
    Integer synonymId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SynonymDefinition synonymDefinition = new SynonymDefinition(); // SynonymDefinition | 
    try {
      SynonymDefinition result = apiInstance.updateSynonymDefinition(synonymId, responseFields, synonymDefinition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSynonymsApi#updateSynonymDefinition");
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
| **synonymId** | **Integer**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **synonymDefinition** | [**SynonymDefinition**](SynonymDefinition.md)|  | [optional] |

### Return type

[**SynonymDefinition**](SynonymDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSynonymDefinitionCollection"></a>
# **updateSynonymDefinitionCollection**
> SynonymDefinitionCollection updateSynonymDefinitionCollection(localeCode, responseFields, synonymDefinitionCollection)

Add Synonym Definition Collection

Add or update a synonym definition collection.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSynonymsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSynonymsApi apiInstance = new SearchSynonymsApi(defaultClient);
    String localeCode = "localeCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SynonymDefinitionCollection synonymDefinitionCollection = new SynonymDefinitionCollection(); // SynonymDefinitionCollection | 
    try {
      SynonymDefinitionCollection result = apiInstance.updateSynonymDefinitionCollection(localeCode, responseFields, synonymDefinitionCollection);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSynonymsApi#updateSynonymDefinitionCollection");
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
| **localeCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **synonymDefinitionCollection** | [**SynonymDefinitionCollection**](SynonymDefinitionCollection.md)|  | [optional] |

### Return type

[**SynonymDefinitionCollection**](SynonymDefinitionCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

