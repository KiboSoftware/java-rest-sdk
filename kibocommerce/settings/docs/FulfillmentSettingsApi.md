# FulfillmentSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFulfillmentSettings**](FulfillmentSettingsApi.md#createFulfillmentSettings) | **POST** /commerce/settings/fulfillment/fulfillmentsettings | Create Fulfillment Settings |
| [**getFulfillmentSettings**](FulfillmentSettingsApi.md#getFulfillmentSettings) | **GET** /commerce/settings/fulfillment/fulfillmentsettings | Get Fulfillment Settings |
| [**updateFulfillmentSettings**](FulfillmentSettingsApi.md#updateFulfillmentSettings) | **PUT** /commerce/settings/fulfillment/fulfillmentsettings | Update Fulfillment Settings |


<a name="createFulfillmentSettings"></a>
# **createFulfillmentSettings**
> FulfillmentSettings createFulfillmentSettings(fulfillmentSettings)

Create Fulfillment Settings

Creates fulfillment settings for the site, which includes bpm settings, ship to store, back order days etc.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.FulfillmentSettingsApi;

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

    FulfillmentSettingsApi apiInstance = new FulfillmentSettingsApi(defaultClient);
    FulfillmentSettings fulfillmentSettings = new FulfillmentSettings(); // FulfillmentSettings | 
    try {
      FulfillmentSettings result = apiInstance.createFulfillmentSettings(fulfillmentSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentSettingsApi#createFulfillmentSettings");
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
| **fulfillmentSettings** | [**FulfillmentSettings**](FulfillmentSettings.md)|  | [optional] |

### Return type

[**FulfillmentSettings**](FulfillmentSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getFulfillmentSettings"></a>
# **getFulfillmentSettings**
> FulfillmentSettings getFulfillmentSettings()

Get Fulfillment Settings

Retrieves existing fulfillment settings defined on the site

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.FulfillmentSettingsApi;

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

    FulfillmentSettingsApi apiInstance = new FulfillmentSettingsApi(defaultClient);
    try {
      FulfillmentSettings result = apiInstance.getFulfillmentSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentSettingsApi#getFulfillmentSettings");
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

[**FulfillmentSettings**](FulfillmentSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateFulfillmentSettings"></a>
# **updateFulfillmentSettings**
> FulfillmentSettings updateFulfillmentSettings(fulfillmentSettings)

Update Fulfillment Settings

Modifies existing fulfillment settings for the site, which includes bpm settings, ship to store, back order days etc.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.FulfillmentSettingsApi;

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

    FulfillmentSettingsApi apiInstance = new FulfillmentSettingsApi(defaultClient);
    FulfillmentSettings fulfillmentSettings = new FulfillmentSettings(); // FulfillmentSettings | 
    try {
      FulfillmentSettings result = apiInstance.updateFulfillmentSettings(fulfillmentSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentSettingsApi#updateFulfillmentSettings");
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
| **fulfillmentSettings** | [**FulfillmentSettings**](FulfillmentSettings.md)|  | [optional] |

### Return type

[**FulfillmentSettings**](FulfillmentSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

