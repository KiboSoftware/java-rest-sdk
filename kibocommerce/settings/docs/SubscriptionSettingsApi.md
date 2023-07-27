# SubscriptionSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSubscriptionSettings**](SubscriptionSettingsApi.md#createSubscriptionSettings) | **POST** /commerce/settings/subscription/subscriptionsettings | Create subscription settings |
| [**getSubscriptionSettings**](SubscriptionSettingsApi.md#getSubscriptionSettings) | **GET** /commerce/settings/subscription/subscriptionsettings | Retrieves existing subscription settings |
| [**updateSubscriptionSettings**](SubscriptionSettingsApi.md#updateSubscriptionSettings) | **PUT** /commerce/settings/subscription/subscriptionsettings | Update Subscription Settings |


<a name="createSubscriptionSettings"></a>
# **createSubscriptionSettings**
> SubscriptionSettings createSubscriptionSettings(subscriptionSettings)

Create subscription settings

Creates new subscription settings for a site

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.SubscriptionSettingsApi;

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

    SubscriptionSettingsApi apiInstance = new SubscriptionSettingsApi(defaultClient);
    SubscriptionSettings subscriptionSettings = new SubscriptionSettings(); // SubscriptionSettings | 
    try {
      SubscriptionSettings result = apiInstance.createSubscriptionSettings(subscriptionSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionSettingsApi#createSubscriptionSettings");
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
| **subscriptionSettings** | [**SubscriptionSettings**](SubscriptionSettings.md)|  | [optional] |

### Return type

[**SubscriptionSettings**](SubscriptionSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSubscriptionSettings"></a>
# **getSubscriptionSettings**
> SubscriptionSettings getSubscriptionSettings()

Retrieves existing subscription settings

Retrieves existing subscription settings for a site

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.SubscriptionSettingsApi;

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

    SubscriptionSettingsApi apiInstance = new SubscriptionSettingsApi(defaultClient);
    try {
      SubscriptionSettings result = apiInstance.getSubscriptionSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionSettingsApi#getSubscriptionSettings");
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

[**SubscriptionSettings**](SubscriptionSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSubscriptionSettings"></a>
# **updateSubscriptionSettings**
> SubscriptionSettings updateSubscriptionSettings(subscriptionSettings)

Update Subscription Settings

Modifies existing subscription settings for a site

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.SubscriptionSettingsApi;

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

    SubscriptionSettingsApi apiInstance = new SubscriptionSettingsApi(defaultClient);
    SubscriptionSettings subscriptionSettings = new SubscriptionSettings(); // SubscriptionSettings | 
    try {
      SubscriptionSettings result = apiInstance.updateSubscriptionSettings(subscriptionSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionSettingsApi#updateSubscriptionSettings");
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
| **subscriptionSettings** | [**SubscriptionSettings**](SubscriptionSettings.md)|  | [optional] |

### Return type

[**SubscriptionSettings**](SubscriptionSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

