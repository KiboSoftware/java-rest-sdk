# SearchCategorySuggestSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCategorySuggestSettings**](SearchCategorySuggestSettingsApi.md#deleteCategorySuggestSettings) | **DELETE** /commerce/catalog/admin/search/{name}/categorysuggestsettings | Delete Category Suggest Settings |
| [**getCategorySuggestSettings**](SearchCategorySuggestSettingsApi.md#getCategorySuggestSettings) | **GET** /commerce/catalog/admin/search/{name}/categorysuggestsettings | Get Category Suggest Settings |
| [**updateCategorySuggestSettings**](SearchCategorySuggestSettingsApi.md#updateCategorySuggestSettings) | **PUT** /commerce/catalog/admin/search/{name}/categorysuggestsettings | Update Category Suggest Settings |


<a name="deleteCategorySuggestSettings"></a>
# **deleteCategorySuggestSettings**
> deleteCategorySuggestSettings(name)

Delete Category Suggest Settings

Deletes the CategorySuggestSettings for a specific SearchSetting by name.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchCategorySuggestSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchCategorySuggestSettingsApi apiInstance = new SearchCategorySuggestSettingsApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      apiInstance.deleteCategorySuggestSettings(name);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchCategorySuggestSettingsApi#deleteCategorySuggestSettings");
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

<a name="getCategorySuggestSettings"></a>
# **getCategorySuggestSettings**
> SuggestSettings getCategorySuggestSettings(name, responseFields)

Get Category Suggest Settings

Get CategorySuggestSettings for a specific SearchSettings.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchCategorySuggestSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchCategorySuggestSettingsApi apiInstance = new SearchCategorySuggestSettingsApi(defaultClient);
    String name = "name_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SuggestSettings result = apiInstance.getCategorySuggestSettings(name, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchCategorySuggestSettingsApi#getCategorySuggestSettings");
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

[**SuggestSettings**](SuggestSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCategorySuggestSettings"></a>
# **updateCategorySuggestSettings**
> SuggestSettings updateCategorySuggestSettings(name, responseFields, suggestSettings)

Update Category Suggest Settings

Adds or updates the CategorySuggestSettings for a specific SearchSetting.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchCategorySuggestSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchCategorySuggestSettingsApi apiInstance = new SearchCategorySuggestSettingsApi(defaultClient);
    String name = "name_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SuggestSettings suggestSettings = new SuggestSettings(); // SuggestSettings | 
    try {
      SuggestSettings result = apiInstance.updateCategorySuggestSettings(name, responseFields, suggestSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchCategorySuggestSettingsApi#updateCategorySuggestSettings");
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
| **suggestSettings** | [**SuggestSettings**](SuggestSettings.md)|  | [optional] |

### Return type

[**SuggestSettings**](SuggestSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

