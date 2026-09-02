# InventorySettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInventorySettings**](InventorySettingsApi.md#createInventorySettings) | **POST** /commerce/settings/inventory/inventorySettings | Create Inventory Settings |
| [**getInventorySettings**](InventorySettingsApi.md#getInventorySettings) | **GET** /commerce/settings/inventory/inventorySettings | Get Inventory Settings |
| [**updateInventorySettings**](InventorySettingsApi.md#updateInventorySettings) | **PUT** /commerce/settings/inventory/inventorySettings | Update Inventory Settings |


<a name="createInventorySettings"></a>
# **createInventorySettings**
> InventorySettings createInventorySettings(responseFields, inventorySettings)

Create Inventory Settings

Creates inventory settings for the site

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.InventorySettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InventorySettingsApi apiInstance = new InventorySettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    InventorySettings inventorySettings = new InventorySettings(); // InventorySettings | 
    try {
      InventorySettings result = apiInstance.createInventorySettings(responseFields, inventorySettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventorySettingsApi#createInventorySettings");
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
| **inventorySettings** | [**InventorySettings**](InventorySettings.md)|  | [optional] |

### Return type

[**InventorySettings**](InventorySettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getInventorySettings"></a>
# **getInventorySettings**
> InventorySettings getInventorySettings(responseFields)

Get Inventory Settings

Retrieves existing inventory settings for the site which contain inventory export job settings.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.InventorySettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InventorySettingsApi apiInstance = new InventorySettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      InventorySettings result = apiInstance.getInventorySettings(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventorySettingsApi#getInventorySettings");
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

[**InventorySettings**](InventorySettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateInventorySettings"></a>
# **updateInventorySettings**
> InventorySettings updateInventorySettings(responseFields, inventorySettings)

Update Inventory Settings

Modifies existing inventory settings

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.InventorySettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InventorySettingsApi apiInstance = new InventorySettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    InventorySettings inventorySettings = new InventorySettings(); // InventorySettings | 
    try {
      InventorySettings result = apiInstance.updateInventorySettings(responseFields, inventorySettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventorySettingsApi#updateInventorySettings");
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
| **inventorySettings** | [**InventorySettings**](InventorySettings.md)|  | [optional] |

### Return type

[**InventorySettings**](InventorySettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

