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
> TaxableTerritory addTaxableTerritory(responseFields, taxableTerritory)

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

    GeneralSettingsApi apiInstance = new GeneralSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    TaxableTerritory taxableTerritory = new TaxableTerritory(); // TaxableTerritory | 
    try {
      TaxableTerritory result = apiInstance.addTaxableTerritory(responseFields, taxableTerritory);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **taxableTerritory** | [**TaxableTerritory**](TaxableTerritory.md)|  | [optional] |

### Return type

[**TaxableTerritory**](TaxableTerritory.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createCustomRouteSettings"></a>
# **createCustomRouteSettings**
> CustomRouteSettings createCustomRouteSettings(responseFields, customRouteSettings)

Create Custom Route Settings

Creates a new custom route settings. Custom routing allows you to display SEO-friendly URLs on your site that map behind-the-scenes to resources such as a product page or a search results page. With custom routing, you gain advanced control over the URL structures on your site and can more visibly highlight the products or categories your shoppers are interested in purchasing.

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

    GeneralSettingsApi apiInstance = new GeneralSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CustomRouteSettings customRouteSettings = new CustomRouteSettings(); // CustomRouteSettings | 
    try {
      CustomRouteSettings result = apiInstance.createCustomRouteSettings(responseFields, customRouteSettings);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **customRouteSettings** | [**CustomRouteSettings**](CustomRouteSettings.md)|  | [optional] |

### Return type

[**CustomRouteSettings**](CustomRouteSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteCustomRouteSettings"></a>
# **deleteCustomRouteSettings**
> deleteCustomRouteSettings()

Delete Custom Route Settings

Deletes custom route settings.

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCustomRouteSettings"></a>
# **getCustomRouteSettings**
> CustomRouteSettings getCustomRouteSettings(responseFields)

Get Custom Route Settings

Gets custom route settings. Custom routing allows you to display SEO-friendly URLs on your site that map behind-the-scenes to resources such as a product page or a search results page. With custom routing, you gain advanced control over the URL structures on your site and can more visibly highlight the products or categories your shoppers are interested in purchasing.

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

    GeneralSettingsApi apiInstance = new GeneralSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CustomRouteSettings result = apiInstance.getCustomRouteSettings(responseFields);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CustomRouteSettings**](CustomRouteSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getGeneralSettings"></a>
# **getGeneralSettings**
> GeneralSettings getGeneralSettings(responseFields)

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

    GeneralSettingsApi apiInstance = new GeneralSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      GeneralSettings result = apiInstance.getGeneralSettings(responseFields);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**GeneralSettings**](GeneralSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getTaxableTerritories"></a>
# **getTaxableTerritories**
> List&lt;TaxableTerritory&gt; getTaxableTerritories(responseFields)

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

    GeneralSettingsApi apiInstance = new GeneralSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<TaxableTerritory> result = apiInstance.getTaxableTerritories(responseFields);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;TaxableTerritory&gt;**](TaxableTerritory.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCustomRouteSettings"></a>
# **updateCustomRouteSettings**
> CustomRouteSettings updateCustomRouteSettings(responseFields, customRouteSettings)

Update Custom Route Settings

Updates custom route settings. Custom routing allows you to display SEO-friendly URLs on your site that map behind-the-scenes to resources such as a product page or a search results page. With custom routing, you gain advanced control over the URL structures on your site and can more visibly highlight the products or categories your shoppers are interested in purchasing.

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

    GeneralSettingsApi apiInstance = new GeneralSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CustomRouteSettings customRouteSettings = new CustomRouteSettings(); // CustomRouteSettings | 
    try {
      CustomRouteSettings result = apiInstance.updateCustomRouteSettings(responseFields, customRouteSettings);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **customRouteSettings** | [**CustomRouteSettings**](CustomRouteSettings.md)|  | [optional] |

### Return type

[**CustomRouteSettings**](CustomRouteSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateGeneralSettings"></a>
# **updateGeneralSettings**
> GeneralSettings updateGeneralSettings(responseFields, generalSettings)

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

    GeneralSettingsApi apiInstance = new GeneralSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    GeneralSettings generalSettings = new GeneralSettings(); // GeneralSettings | Properties of the updated general settings. Required properties: WebsiteName, SiteTimeZone, SiteTimeFormat, SenderEmailAddress, and ReplyEmailAddress.
    try {
      GeneralSettings result = apiInstance.updateGeneralSettings(responseFields, generalSettings);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **generalSettings** | [**GeneralSettings**](GeneralSettings.md)| Properties of the updated general settings. Required properties: WebsiteName, SiteTimeZone, SiteTimeFormat, SenderEmailAddress, and ReplyEmailAddress. | [optional] |

### Return type

[**GeneralSettings**](GeneralSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateTaxableTerritories"></a>
# **updateTaxableTerritories**
> List&lt;TaxableTerritory&gt; updateTaxableTerritories(responseFields, taxableTerritory)

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

    GeneralSettingsApi apiInstance = new GeneralSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<TaxableTerritory> taxableTerritory = Arrays.asList(); // List<TaxableTerritory> | 
    try {
      List<TaxableTerritory> result = apiInstance.updateTaxableTerritories(responseFields, taxableTerritory);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **taxableTerritory** | [**List&lt;TaxableTerritory&gt;**](TaxableTerritory.md)|  | [optional] |

### Return type

[**List&lt;TaxableTerritory&gt;**](TaxableTerritory.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

