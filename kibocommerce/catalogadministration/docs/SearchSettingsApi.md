# SearchSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSearchSetting**](SearchSettingsApi.md#addSearchSetting) | **POST** /commerce/catalog/admin/search/settings | Add Search Settings |
| [**deleteSearchSetting**](SearchSettingsApi.md#deleteSearchSetting) | **DELETE** /commerce/catalog/admin/search/settings/{name} | Delete Search Settings by Name |
| [**deleteSiteSearchSettings**](SearchSettingsApi.md#deleteSiteSearchSettings) | **DELETE** /commerce/catalog/admin/search/{name}/sitesearchsettings | Delete Site Search Settings |
| [**getSearchSetting**](SearchSettingsApi.md#getSearchSetting) | **GET** /commerce/catalog/admin/search/settings/{name} | Get Search Settings by Name |
| [**getSearchSettings**](SearchSettingsApi.md#getSearchSettings) | **GET** /commerce/catalog/admin/search/settings | Get Search Settings |
| [**getSiteSearchSettings**](SearchSettingsApi.md#getSiteSearchSettings) | **GET** /commerce/catalog/admin/search/{name}/sitesearchsettings | Get Site Search Settings |
| [**getSystemDefaultSettings**](SearchSettingsApi.md#getSystemDefaultSettings) | **GET** /commerce/catalog/admin/search/settings/systemdefault | Get System Default Search Settings |
| [**updateSearchSetting**](SearchSettingsApi.md#updateSearchSetting) | **PUT** /commerce/catalog/admin/search/settings/{name} | Update Search Settings by Name |
| [**updateSiteSearchSettings**](SearchSettingsApi.md#updateSiteSearchSettings) | **PUT** /commerce/catalog/admin/search/{name}/sitesearchsettings | Update Site Search Settings |
| [**updateSpellCheck**](SearchSettingsApi.md#updateSpellCheck) | **PUT** /commerce/catalog/admin/search/spellcheck | Update Spellcheck Settings |


<a name="addSearchSetting"></a>
# **addSearchSetting**
> SearchSettings addSearchSetting(fromSystemDefault, copyFromName, name, makeDefault, responseFields, searchSettings)

Add Search Settings

Adds the Search Settings for a specific site.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    Boolean fromSystemDefault = false; // Boolean | 
    String copyFromName = "copyFromName_example"; // String | 
    String name = "name_example"; // String | 
    Boolean makeDefault = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SearchSettings searchSettings = new SearchSettings(); // SearchSettings | 
    try {
      SearchSettings result = apiInstance.addSearchSetting(fromSystemDefault, copyFromName, name, makeDefault, responseFields, searchSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSettingsApi#addSearchSetting");
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
| **fromSystemDefault** | **Boolean**|  | [optional] [default to false] |
| **copyFromName** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **makeDefault** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **searchSettings** | [**SearchSettings**](SearchSettings.md)|  | [optional] |

### Return type

[**SearchSettings**](SearchSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteSearchSetting"></a>
# **deleteSearchSetting**
> SearchSettings deleteSearchSetting(name)

Delete Search Settings by Name

Delete the Search Settings for a specific site by name.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      SearchSettings result = apiInstance.deleteSearchSetting(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSettingsApi#deleteSearchSetting");
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
| **name** | **String**|  | |

### Return type

[**SearchSettings**](SearchSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteSiteSearchSettings"></a>
# **deleteSiteSearchSettings**
> deleteSiteSearchSettings(name)

Delete Site Search Settings

Deletes the SiteSearchSettings for a specific SearchSetting by name.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      apiInstance.deleteSiteSearchSettings(name);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSettingsApi#deleteSiteSearchSettings");
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
| **name** | **String**|  | |

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

<a name="getSearchSetting"></a>
# **getSearchSetting**
> SearchSettings getSearchSetting(name, responseFields)

Get Search Settings by Name

Get specific site search settings by name.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    String name = "name_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SearchSettings result = apiInstance.getSearchSetting(name, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSettingsApi#getSearchSetting");
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
| **name** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SearchSettings**](SearchSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSearchSettings"></a>
# **getSearchSettings**
> SearchSettingsCollection getSearchSettings(responseFields)

Get Search Settings

Get site search settings list.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SearchSettingsCollection result = apiInstance.getSearchSettings(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSettingsApi#getSearchSettings");
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

[**SearchSettingsCollection**](SearchSettingsCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSiteSearchSettings"></a>
# **getSiteSearchSettings**
> SiteSearchSettings getSiteSearchSettings(name, responseFields)

Get Site Search Settings

Get SiteSearchSettings for a specific SearchSettings by name.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    String name = "name_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SiteSearchSettings result = apiInstance.getSiteSearchSettings(name, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSettingsApi#getSiteSearchSettings");
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
| **name** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SiteSearchSettings**](SiteSearchSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSystemDefaultSettings"></a>
# **getSystemDefaultSettings**
> SearchSettings getSystemDefaultSettings(responseFields)

Get System Default Search Settings

Get the system default search settings.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SearchSettings result = apiInstance.getSystemDefaultSettings(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSettingsApi#getSystemDefaultSettings");
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

[**SearchSettings**](SearchSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSearchSetting"></a>
# **updateSearchSetting**
> SearchSettings updateSearchSetting(name, responseFields, searchSettings)

Update Search Settings by Name

Update site search settings for a specific site by name.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    String name = "name_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SearchSettings searchSettings = new SearchSettings(); // SearchSettings | 
    try {
      SearchSettings result = apiInstance.updateSearchSetting(name, responseFields, searchSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSettingsApi#updateSearchSetting");
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
| **name** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **searchSettings** | [**SearchSettings**](SearchSettings.md)|  | [optional] |

### Return type

[**SearchSettings**](SearchSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSiteSearchSettings"></a>
# **updateSiteSearchSettings**
> SiteSearchSettings updateSiteSearchSettings(name, responseFields, siteSearchSettings)

Update Site Search Settings

Updates the SiteSearchSettings for a specific SearchSetting by name.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    String name = "name_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SiteSearchSettings siteSearchSettings = new SiteSearchSettings(); // SiteSearchSettings | 
    try {
      SiteSearchSettings result = apiInstance.updateSiteSearchSettings(name, responseFields, siteSearchSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSettingsApi#updateSiteSearchSettings");
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
| **name** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **siteSearchSettings** | [**SiteSearchSettings**](SiteSearchSettings.md)|  | [optional] |

### Return type

[**SiteSearchSettings**](SiteSearchSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSpellCheck"></a>
# **updateSpellCheck**
> updateSpellCheck(responseFields, spellcheckUpdate)

Update Spellcheck Settings

Update Spellcheck for SiteSearchSettings.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SpellcheckUpdate spellcheckUpdate = new SpellcheckUpdate(); // SpellcheckUpdate | 
    try {
      apiInstance.updateSpellCheck(responseFields, spellcheckUpdate);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchSettingsApi#updateSpellCheck");
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
| **spellcheckUpdate** | [**SpellcheckUpdate**](SpellcheckUpdate.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

