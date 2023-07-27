# SearchSynonymsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSynonymDefinition**](SearchSynonymsApi.md#addSynonymDefinition) | **POST** /commerce/catalog/admin/search/synonyms | Add synonym definition |
| [**deleteSynonymDefinition**](SearchSynonymsApi.md#deleteSynonymDefinition) | **DELETE** /commerce/catalog/admin/search/synonyms/{synonymId} | Delete synonym definition |
| [**getAllSynonymDefinitionCollectionsForMasterCatalog**](SearchSynonymsApi.md#getAllSynonymDefinitionCollectionsForMasterCatalog) | **GET** /commerce/catalog/admin/search/master-catalog-synonym-definitions/{languageCode} | Get synonym definition collections |
| [**getSynonymDefinition**](SearchSynonymsApi.md#getSynonymDefinition) | **GET** /commerce/catalog/admin/search/synonyms/{synonymId} | Get synonym definition |
| [**getSynonymDefinitionCollection**](SearchSynonymsApi.md#getSynonymDefinitionCollection) | **GET** /commerce/catalog/admin/search/synonym-definitions/{localeCode} | Get synonym definition collection |
| [**getSynonymDefinitions**](SearchSynonymsApi.md#getSynonymDefinitions) | **GET** /commerce/catalog/admin/search/synonyms | Get synonym definitions |
| [**updateSynonymDefinition**](SearchSynonymsApi.md#updateSynonymDefinition) | **PUT** /commerce/catalog/admin/search/synonyms/{synonymId} | Update synonym definition |
| [**updateSynonymDefinitionCollection**](SearchSynonymsApi.md#updateSynonymDefinitionCollection) | **POST** /commerce/catalog/admin/search/synonym-definitions/{localeCode} | Add/Update synonym definition collection |


<a name="addSynonymDefinition"></a>
# **addSynonymDefinition**
> SynonymDefinition addSynonymDefinition(synonymDefinition)

Add synonym definition

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchSynonymsApi apiInstance = new SearchSynonymsApi(defaultClient);
    SynonymDefinition synonymDefinition = new SynonymDefinition(); // SynonymDefinition | 
    try {
      SynonymDefinition result = apiInstance.addSynonymDefinition(synonymDefinition);
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
| **synonymDefinition** | [**SynonymDefinition**](SynonymDefinition.md)|  | [optional] |

### Return type

[**SynonymDefinition**](SynonymDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteSynonymDefinition"></a>
# **deleteSynonymDefinition**
> deleteSynonymDefinition(synonymId)

Delete synonym definition

Delete synonym definition

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAllSynonymDefinitionCollectionsForMasterCatalog"></a>
# **getAllSynonymDefinitionCollectionsForMasterCatalog**
> SynonymDefinitionCollection getAllSynonymDefinitionCollectionsForMasterCatalog(languageCode)

Get synonym definition collections

Get synonym definition collections

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchSynonymsApi apiInstance = new SearchSynonymsApi(defaultClient);
    String languageCode = "languageCode_example"; // String | 
    try {
      SynonymDefinitionCollection result = apiInstance.getAllSynonymDefinitionCollectionsForMasterCatalog(languageCode);
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

### Return type

[**SynonymDefinitionCollection**](SynonymDefinitionCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSynonymDefinition"></a>
# **getSynonymDefinition**
> SynonymDefinition getSynonymDefinition(synonymId)

Get synonym definition

Get synonym definition

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchSynonymsApi apiInstance = new SearchSynonymsApi(defaultClient);
    Integer synonymId = 56; // Integer | 
    try {
      SynonymDefinition result = apiInstance.getSynonymDefinition(synonymId);
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

### Return type

[**SynonymDefinition**](SynonymDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSynonymDefinitionCollection"></a>
# **getSynonymDefinitionCollection**
> SynonymDefinitionCollection getSynonymDefinitionCollection(localeCode)

Get synonym definition collection

Get synonym definition collection

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchSynonymsApi apiInstance = new SearchSynonymsApi(defaultClient);
    String localeCode = "localeCode_example"; // String | 
    try {
      SynonymDefinitionCollection result = apiInstance.getSynonymDefinitionCollection(localeCode);
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

### Return type

[**SynonymDefinitionCollection**](SynonymDefinitionCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSynonymDefinitions"></a>
# **getSynonymDefinitions**
> SynonymDefinitionPagedCollection getSynonymDefinitions(startIndex, pageSize, sortBy, filter)

Get synonym definitions

Get synonym definitions

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchSynonymsApi apiInstance = new SearchSynonymsApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    try {
      SynonymDefinitionPagedCollection result = apiInstance.getSynonymDefinitions(startIndex, pageSize, sortBy, filter);
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

### Return type

[**SynonymDefinitionPagedCollection**](SynonymDefinitionPagedCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSynonymDefinition"></a>
# **updateSynonymDefinition**
> SynonymDefinition updateSynonymDefinition(synonymId, synonymDefinition)

Update synonym definition

Update synonym definition

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchSynonymsApi apiInstance = new SearchSynonymsApi(defaultClient);
    Integer synonymId = 56; // Integer | 
    SynonymDefinition synonymDefinition = new SynonymDefinition(); // SynonymDefinition | 
    try {
      SynonymDefinition result = apiInstance.updateSynonymDefinition(synonymId, synonymDefinition);
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
| **synonymDefinition** | [**SynonymDefinition**](SynonymDefinition.md)|  | [optional] |

### Return type

[**SynonymDefinition**](SynonymDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSynonymDefinitionCollection"></a>
# **updateSynonymDefinitionCollection**
> SynonymDefinitionCollection updateSynonymDefinitionCollection(localeCode, synonymDefinitionCollection)

Add/Update synonym definition collection

Upsert synonym definition collection

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchSynonymsApi apiInstance = new SearchSynonymsApi(defaultClient);
    String localeCode = "localeCode_example"; // String | 
    SynonymDefinitionCollection synonymDefinitionCollection = new SynonymDefinitionCollection(); // SynonymDefinitionCollection | 
    try {
      SynonymDefinitionCollection result = apiInstance.updateSynonymDefinitionCollection(localeCode, synonymDefinitionCollection);
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
| **synonymDefinitionCollection** | [**SynonymDefinitionCollection**](SynonymDefinitionCollection.md)|  | [optional] |

### Return type

[**SynonymDefinitionCollection**](SynonymDefinitionCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

