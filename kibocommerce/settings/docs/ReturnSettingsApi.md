# ReturnSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReturnSettings**](ReturnSettingsApi.md#createReturnSettings) | **POST** /commerce/settings/return/returnsettings | Create Return Settings |
| [**getReturnSettings**](ReturnSettingsApi.md#getReturnSettings) | **GET** /commerce/settings/return/returnsettings | Get Return Settings |
| [**updateReturnSettings**](ReturnSettingsApi.md#updateReturnSettings) | **PUT** /commerce/settings/return/returnsettings | Update Return Settings |


<a name="createReturnSettings"></a>
# **createReturnSettings**
> ReturnSettings createReturnSettings(returnSettings)

Create Return Settings

Creates return settings which includes return processing fee, return shipping location   and return label creation on fulfillment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.ReturnSettingsApi;

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

    ReturnSettingsApi apiInstance = new ReturnSettingsApi(defaultClient);
    ReturnSettings returnSettings = new ReturnSettings(); // ReturnSettings | 
    try {
      ReturnSettings result = apiInstance.createReturnSettings(returnSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnSettingsApi#createReturnSettings");
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
| **returnSettings** | [**ReturnSettings**](ReturnSettings.md)|  | [optional] |

### Return type

[**ReturnSettings**](ReturnSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getReturnSettings"></a>
# **getReturnSettings**
> ReturnSettings getReturnSettings()

Get Return Settings

Retrieves return settings which includes return processing fee, return shipping location   and return label creation on fulfillment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.ReturnSettingsApi;

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

    ReturnSettingsApi apiInstance = new ReturnSettingsApi(defaultClient);
    try {
      ReturnSettings result = apiInstance.getReturnSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnSettingsApi#getReturnSettings");
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

[**ReturnSettings**](ReturnSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateReturnSettings"></a>
# **updateReturnSettings**
> ReturnSettings updateReturnSettings(returnSettings)

Update Return Settings

Modifies existing fulfillment settings which includes return processing fee, return shipping location   and return label creation on fulfillment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.ReturnSettingsApi;

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

    ReturnSettingsApi apiInstance = new ReturnSettingsApi(defaultClient);
    ReturnSettings returnSettings = new ReturnSettings(); // ReturnSettings | 
    try {
      ReturnSettings result = apiInstance.updateReturnSettings(returnSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnSettingsApi#updateReturnSettings");
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
| **returnSettings** | [**ReturnSettings**](ReturnSettings.md)|  | [optional] |

### Return type

[**ReturnSettings**](ReturnSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

