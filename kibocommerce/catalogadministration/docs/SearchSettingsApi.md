# SearchSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSearchSetting**](SearchSettingsApi.md#addSearchSetting) | **POST** /commerce/catalog/admin/search/settings | Add search setting |
| [**deleteSearchSetting**](SearchSettingsApi.md#deleteSearchSetting) | **DELETE** /commerce/catalog/admin/search/settings/{name} | Delete search setting |
| [**deleteSiteSearchSettings**](SearchSettingsApi.md#deleteSiteSearchSettings) | **DELETE** /commerce/catalog/admin/search/{name}/sitesearchsettings | Delete site search settings |
| [**getSearchSetting**](SearchSettingsApi.md#getSearchSetting) | **GET** /commerce/catalog/admin/search/settings/{name} | Get search setting |
| [**getSearchSettings**](SearchSettingsApi.md#getSearchSettings) | **GET** /commerce/catalog/admin/search/settings | Get search settings |
| [**getSiteSearchSettings**](SearchSettingsApi.md#getSiteSearchSettings) | **GET** /commerce/catalog/admin/search/{name}/sitesearchsettings | Get site search settings |
| [**getSystemDefaultSettings**](SearchSettingsApi.md#getSystemDefaultSettings) | **GET** /commerce/catalog/admin/search/settings/systemdefault | Get system default search setting |
| [**updateSearchSetting**](SearchSettingsApi.md#updateSearchSetting) | **PUT** /commerce/catalog/admin/search/settings/{name} | Update search setting |
| [**updateSiteSearchSettings**](SearchSettingsApi.md#updateSiteSearchSettings) | **PUT** /commerce/catalog/admin/search/{name}/sitesearchsettings | Update site search settings |
| [**updateSpellCheck**](SearchSettingsApi.md#updateSpellCheck) | **PUT** /commerce/catalog/admin/search/spellcheck | Update Spellcheck settings |


<a name="addSearchSetting"></a>
# **addSearchSetting**
> SearchSettings addSearchSetting(fromSystemDefault, copyFromName, name, makeDefault, searchSettings)

Add search setting

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    Boolean fromSystemDefault = false; // Boolean | 
    String copyFromName = "copyFromName_example"; // String | 
    String name = "name_example"; // String | 
    Boolean makeDefault = false; // Boolean | 
    SearchSettings searchSettings = new SearchSettings(); // SearchSettings | 
    try {
      SearchSettings result = apiInstance.addSearchSetting(fromSystemDefault, copyFromName, name, makeDefault, searchSettings);
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
| **searchSettings** | [**SearchSettings**](SearchSettings.md)|  | [optional] |

### Return type

[**SearchSettings**](SearchSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteSearchSetting"></a>
# **deleteSearchSetting**
> SearchSettings deleteSearchSetting(name)

Delete search setting

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteSiteSearchSettings"></a>
# **deleteSiteSearchSettings**
> deleteSiteSearchSettings(name)

Delete site search settings

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSearchSetting"></a>
# **getSearchSetting**
> SearchSettings getSearchSetting(name)

Get search setting

Get site search settings by name.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      SearchSettings result = apiInstance.getSearchSetting(name);
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

### Return type

[**SearchSettings**](SearchSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSearchSettings"></a>
# **getSearchSettings**
> SearchSettingsCollection getSearchSettings()

Get search settings

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    try {
      SearchSettingsCollection result = apiInstance.getSearchSettings();
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
This endpoint does not need any parameter.

### Return type

[**SearchSettingsCollection**](SearchSettingsCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSiteSearchSettings"></a>
# **getSiteSearchSettings**
> SiteSearchSettings getSiteSearchSettings(name)

Get site search settings

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      SiteSearchSettings result = apiInstance.getSiteSearchSettings(name);
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

### Return type

[**SiteSearchSettings**](SiteSearchSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSystemDefaultSettings"></a>
# **getSystemDefaultSettings**
> SearchSettings getSystemDefaultSettings()

Get system default search setting

Get the system default search settings

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    try {
      SearchSettings result = apiInstance.getSystemDefaultSettings();
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
This endpoint does not need any parameter.

### Return type

[**SearchSettings**](SearchSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSearchSetting"></a>
# **updateSearchSetting**
> SearchSettings updateSearchSetting(name, searchSettings)

Update search setting

Updates the Search Settings for a specific site.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    String name = "name_example"; // String | 
    SearchSettings searchSettings = new SearchSettings(); // SearchSettings | 
    try {
      SearchSettings result = apiInstance.updateSearchSetting(name, searchSettings);
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
| **searchSettings** | [**SearchSettings**](SearchSettings.md)|  | [optional] |

### Return type

[**SearchSettings**](SearchSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSiteSearchSettings"></a>
# **updateSiteSearchSettings**
> SiteSearchSettings updateSiteSearchSettings(name, siteSearchSettings)

Update site search settings

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    String name = "name_example"; // String | 
    SiteSearchSettings siteSearchSettings = new SiteSearchSettings(); // SiteSearchSettings | 
    try {
      SiteSearchSettings result = apiInstance.updateSiteSearchSettings(name, siteSearchSettings);
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
| **siteSearchSettings** | [**SiteSearchSettings**](SiteSearchSettings.md)|  | [optional] |

### Return type

[**SiteSearchSettings**](SiteSearchSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSpellCheck"></a>
# **updateSpellCheck**
> updateSpellCheck(spellcheckUpdate)

Update Spellcheck settings

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchSettingsApi apiInstance = new SearchSettingsApi(defaultClient);
    SpellcheckUpdate spellcheckUpdate = new SpellcheckUpdate(); // SpellcheckUpdate | 
    try {
      apiInstance.updateSpellCheck(spellcheckUpdate);
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
| **spellcheckUpdate** | [**SpellcheckUpdate**](SpellcheckUpdate.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

