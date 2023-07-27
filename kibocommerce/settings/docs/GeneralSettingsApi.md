# GeneralSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTaxableTerritory**](GeneralSettingsApi.md#addTaxableTerritory) | **POST** /commerce/settings/general/taxableterritories | Adds Taxable Territory |
| [**createCustomRouteSettings**](GeneralSettingsApi.md#createCustomRouteSettings) | **POST** /commerce/settings/general/customroutes | Create Custom Route Settings |
| [**deleteCustomRouteSettings**](GeneralSettingsApi.md#deleteCustomRouteSettings) | **DELETE** /commerce/settings/general/customroutes | Delete Custom Route Settings |
| [**getCustomRouteSettings**](GeneralSettingsApi.md#getCustomRouteSettings) | **GET** /commerce/settings/general/customroutes | Get Custom Route Settings |
| [**getGeneralSettings**](GeneralSettingsApi.md#getGeneralSettings) | **GET** /commerce/settings/general | Get General Settings |
| [**getTaxableTerritories**](GeneralSettingsApi.md#getTaxableTerritories) | **GET** /commerce/settings/general/taxableterritories | Get Taxable Territories |
| [**updateCustomRouteSettings**](GeneralSettingsApi.md#updateCustomRouteSettings) | **PUT** /commerce/settings/general/customroutes | Update Custom Route Settings |
| [**updateGeneralSettings**](GeneralSettingsApi.md#updateGeneralSettings) | **PUT** /commerce/settings/general | Update General Settings |
| [**updateTaxableTerritories**](GeneralSettingsApi.md#updateTaxableTerritories) | **PUT** /commerce/settings/general/taxableterritories | Update Taxable Territories |


<a name="addTaxableTerritory"></a>
# **addTaxableTerritory**
> TaxableTerritory addTaxableTerritory(taxableTerritory)

Adds Taxable Territory

Creates taxble territories for the site.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.GeneralSettingsApi;

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

    GeneralSettingsApi apiInstance = new GeneralSettingsApi(defaultClient);
    TaxableTerritory taxableTerritory = new TaxableTerritory(); // TaxableTerritory | 
    try {
      TaxableTerritory result = apiInstance.addTaxableTerritory(taxableTerritory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralSettingsApi#addTaxableTerritory");
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
| **taxableTerritory** | [**TaxableTerritory**](TaxableTerritory.md)|  | [optional] |

### Return type

[**TaxableTerritory**](TaxableTerritory.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createCustomRouteSettings"></a>
# **createCustomRouteSettings**
> CustomRouteSettings createCustomRouteSettings(customRouteSettings)

Create Custom Route Settings

Creates Custom Route Settings on a tenant which includes routes, validators and mappings

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.GeneralSettingsApi;

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

    GeneralSettingsApi apiInstance = new GeneralSettingsApi(defaultClient);
    CustomRouteSettings customRouteSettings = new CustomRouteSettings(); // CustomRouteSettings | 
    try {
      CustomRouteSettings result = apiInstance.createCustomRouteSettings(customRouteSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralSettingsApi#createCustomRouteSettings");
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
| **customRouteSettings** | [**CustomRouteSettings**](CustomRouteSettings.md)|  | [optional] |

### Return type

[**CustomRouteSettings**](CustomRouteSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteCustomRouteSettings"></a>
# **deleteCustomRouteSettings**
> deleteCustomRouteSettings()

Delete Custom Route Settings

Deletes all existing custom route settings defined on the tenant

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.GeneralSettingsApi;

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

    GeneralSettingsApi apiInstance = new GeneralSettingsApi(defaultClient);
    try {
      apiInstance.deleteCustomRouteSettings();
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralSettingsApi#deleteCustomRouteSettings");
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

<a name="getCustomRouteSettings"></a>
# **getCustomRouteSettings**
> CustomRouteSettings getCustomRouteSettings()

Get Custom Route Settings

Retrieves Custom Route Settings on a tenant which includes routes, validators and mappings

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.GeneralSettingsApi;

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

    GeneralSettingsApi apiInstance = new GeneralSettingsApi(defaultClient);
    try {
      CustomRouteSettings result = apiInstance.getCustomRouteSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralSettingsApi#getCustomRouteSettings");
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

[**CustomRouteSettings**](CustomRouteSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getGeneralSettings"></a>
# **getGeneralSettings**
> GeneralSettings getGeneralSettings()

Get General Settings

Retrieves list of general settings for the site, which includes settings like theme, email, address validation etc.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.GeneralSettingsApi;

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

    GeneralSettingsApi apiInstance = new GeneralSettingsApi(defaultClient);
    try {
      GeneralSettings result = apiInstance.getGeneralSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralSettingsApi#getGeneralSettings");
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

[**GeneralSettings**](GeneralSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getTaxableTerritories"></a>
# **getTaxableTerritories**
> List&lt;TaxableTerritory&gt; getTaxableTerritories()

Get Taxable Territories

Retrieves list of taxble territories for the site.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.GeneralSettingsApi;

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

    GeneralSettingsApi apiInstance = new GeneralSettingsApi(defaultClient);
    try {
      List<TaxableTerritory> result = apiInstance.getTaxableTerritories();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralSettingsApi#getTaxableTerritories");
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

[**List&lt;TaxableTerritory&gt;**](TaxableTerritory.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateCustomRouteSettings"></a>
# **updateCustomRouteSettings**
> CustomRouteSettings updateCustomRouteSettings(customRouteSettings)

Update Custom Route Settings

Updates existing custom route settings defined on the tenant

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.GeneralSettingsApi;

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

    GeneralSettingsApi apiInstance = new GeneralSettingsApi(defaultClient);
    CustomRouteSettings customRouteSettings = new CustomRouteSettings(); // CustomRouteSettings | 
    try {
      CustomRouteSettings result = apiInstance.updateCustomRouteSettings(customRouteSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralSettingsApi#updateCustomRouteSettings");
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
| **customRouteSettings** | [**CustomRouteSettings**](CustomRouteSettings.md)|  | [optional] |

### Return type

[**CustomRouteSettings**](CustomRouteSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateGeneralSettings"></a>
# **updateGeneralSettings**
> GeneralSettings updateGeneralSettings(generalSettings)

Update General Settings

Updates general settings for the site, which includes settings like theme, email, address validation etc

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.GeneralSettingsApi;

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

    GeneralSettingsApi apiInstance = new GeneralSettingsApi(defaultClient);
    GeneralSettings generalSettings = new GeneralSettings(); // GeneralSettings | Properties of the updated general settings.  Required properties: WebsiteName, SiteTimeZone, SiteTimeFormat, SenderEmailAddress, and ReplyEmailAddress.
    try {
      GeneralSettings result = apiInstance.updateGeneralSettings(generalSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralSettingsApi#updateGeneralSettings");
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
| **generalSettings** | [**GeneralSettings**](GeneralSettings.md)| Properties of the updated general settings.  Required properties: WebsiteName, SiteTimeZone, SiteTimeFormat, SenderEmailAddress, and ReplyEmailAddress. | [optional] |

### Return type

[**GeneralSettings**](GeneralSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateTaxableTerritories"></a>
# **updateTaxableTerritories**
> List&lt;TaxableTerritory&gt; updateTaxableTerritories(taxableTerritory)

Update Taxable Territories

Updates taxble territories for the site.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.GeneralSettingsApi;

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

    GeneralSettingsApi apiInstance = new GeneralSettingsApi(defaultClient);
    List<TaxableTerritory> taxableTerritory = Arrays.asList(); // List<TaxableTerritory> | 
    try {
      List<TaxableTerritory> result = apiInstance.updateTaxableTerritories(taxableTerritory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralSettingsApi#updateTaxableTerritories");
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
| **taxableTerritory** | [**List&lt;TaxableTerritory&gt;**](TaxableTerritory.md)|  | [optional] |

### Return type

[**List&lt;TaxableTerritory&gt;**](TaxableTerritory.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

