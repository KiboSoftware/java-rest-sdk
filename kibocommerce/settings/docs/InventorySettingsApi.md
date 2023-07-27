# InventorySettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInventorySettings**](InventorySettingsApi.md#createInventorySettings) | **POST** /commerce/settings/inventory/inventorySettings | Create Inventory Settings |
| [**getInventorySettings**](InventorySettingsApi.md#getInventorySettings) | **GET** /commerce/settings/inventory/inventorySettings | Get Inventory Settings |
| [**updateInventorySettings**](InventorySettingsApi.md#updateInventorySettings) | **PUT** /commerce/settings/inventory/inventorySettings | Update Inventory Settings |


<a name="createInventorySettings"></a>
# **createInventorySettings**
> InventorySettings createInventorySettings(inventorySettings)

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    InventorySettingsApi apiInstance = new InventorySettingsApi(defaultClient);
    InventorySettings inventorySettings = new InventorySettings(); // InventorySettings | 
    try {
      InventorySettings result = apiInstance.createInventorySettings(inventorySettings);
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
| **inventorySettings** | [**InventorySettings**](InventorySettings.md)|  | [optional] |

### Return type

[**InventorySettings**](InventorySettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getInventorySettings"></a>
# **getInventorySettings**
> InventorySettings getInventorySettings()

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    InventorySettingsApi apiInstance = new InventorySettingsApi(defaultClient);
    try {
      InventorySettings result = apiInstance.getInventorySettings();
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
This endpoint does not need any parameter.

### Return type

[**InventorySettings**](InventorySettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateInventorySettings"></a>
# **updateInventorySettings**
> InventorySettings updateInventorySettings(inventorySettings)

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    InventorySettingsApi apiInstance = new InventorySettingsApi(defaultClient);
    InventorySettings inventorySettings = new InventorySettings(); // InventorySettings | 
    try {
      InventorySettings result = apiInstance.updateInventorySettings(inventorySettings);
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
| **inventorySettings** | [**InventorySettings**](InventorySettings.md)|  | [optional] |

### Return type

[**InventorySettings**](InventorySettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

