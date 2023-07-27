# SearchProductSuggestSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteProductSuggestSettings**](SearchProductSuggestSettingsApi.md#deleteProductSuggestSettings) | **DELETE** /commerce/catalog/admin/search/{name}/productsuggestsettings | Delete product suggest settings |
| [**getProductSuggestSettings**](SearchProductSuggestSettingsApi.md#getProductSuggestSettings) | **GET** /commerce/catalog/admin/search/{name}/productsuggestsettings | Get [roduct suggest settings |
| [**updateProductSuggestSettings**](SearchProductSuggestSettingsApi.md#updateProductSuggestSettings) | **PUT** /commerce/catalog/admin/search/{name}/productsuggestsettings | Add/Update product suggest settings |


<a name="deleteProductSuggestSettings"></a>
# **deleteProductSuggestSettings**
> deleteProductSuggestSettings(name)

Delete product suggest settings

Deletes the ProductSuggestSettings for a specific SearchSetting by name.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchProductSuggestSettingsApi;

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

    SearchProductSuggestSettingsApi apiInstance = new SearchProductSuggestSettingsApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      apiInstance.deleteProductSuggestSettings(name);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchProductSuggestSettingsApi#deleteProductSuggestSettings");
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

<a name="getProductSuggestSettings"></a>
# **getProductSuggestSettings**
> SuggestSettings getProductSuggestSettings(name)

Get [roduct suggest settings

Get ProductSuggestSettings for a specific SearchSettings by name.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchProductSuggestSettingsApi;

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

    SearchProductSuggestSettingsApi apiInstance = new SearchProductSuggestSettingsApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      SuggestSettings result = apiInstance.getProductSuggestSettings(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchProductSuggestSettingsApi#getProductSuggestSettings");
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

[**SuggestSettings**](SuggestSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProductSuggestSettings"></a>
# **updateProductSuggestSettings**
> ProductSuggestSettings updateProductSuggestSettings(name, productSuggestSettings)

Add/Update product suggest settings

Adds or Updates (Upsert) the ProductSuggestSettings for a specific SearchSetting by name.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchProductSuggestSettingsApi;

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

    SearchProductSuggestSettingsApi apiInstance = new SearchProductSuggestSettingsApi(defaultClient);
    String name = "name_example"; // String | 
    ProductSuggestSettings productSuggestSettings = new ProductSuggestSettings(); // ProductSuggestSettings | 
    try {
      ProductSuggestSettings result = apiInstance.updateProductSuggestSettings(name, productSuggestSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchProductSuggestSettingsApi#updateProductSuggestSettings");
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
| **productSuggestSettings** | [**ProductSuggestSettings**](ProductSuggestSettings.md)|  | [optional] |

### Return type

[**ProductSuggestSettings**](ProductSuggestSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

