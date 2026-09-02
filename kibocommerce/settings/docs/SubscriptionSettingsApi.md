# SubscriptionSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSubscriptionSettings**](SubscriptionSettingsApi.md#createSubscriptionSettings) | **POST** /commerce/settings/subscription/subscriptionsettings | Create Subscription Settings |
| [**getSubscriptionSettings**](SubscriptionSettingsApi.md#getSubscriptionSettings) | **GET** /commerce/settings/subscription/subscriptionsettings | Get Subscription Settings |
| [**updateSubscriptionSettings**](SubscriptionSettingsApi.md#updateSubscriptionSettings) | **PUT** /commerce/settings/subscription/subscriptionsettings | Update Subscription Settings |


<a name="createSubscriptionSettings"></a>
# **createSubscriptionSettings**
> SubscriptionSettings createSubscriptionSettings(responseFields, subscriptionSettings)

Create Subscription Settings

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

    SubscriptionSettingsApi apiInstance = new SubscriptionSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SubscriptionSettings subscriptionSettings = new SubscriptionSettings(); // SubscriptionSettings | 
    try {
      SubscriptionSettings result = apiInstance.createSubscriptionSettings(responseFields, subscriptionSettings);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionSettings** | [**SubscriptionSettings**](SubscriptionSettings.md)|  | [optional] |

### Return type

[**SubscriptionSettings**](SubscriptionSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSubscriptionSettings"></a>
# **getSubscriptionSettings**
> SubscriptionSettings getSubscriptionSettings(responseFields)

Get Subscription Settings

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

    SubscriptionSettingsApi apiInstance = new SubscriptionSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SubscriptionSettings result = apiInstance.getSubscriptionSettings(responseFields);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SubscriptionSettings**](SubscriptionSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSubscriptionSettings"></a>
# **updateSubscriptionSettings**
> SubscriptionSettings updateSubscriptionSettings(responseFields, subscriptionSettings)

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

    SubscriptionSettingsApi apiInstance = new SubscriptionSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SubscriptionSettings subscriptionSettings = new SubscriptionSettings(); // SubscriptionSettings | 
    try {
      SubscriptionSettings result = apiInstance.updateSubscriptionSettings(responseFields, subscriptionSettings);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **subscriptionSettings** | [**SubscriptionSettings**](SubscriptionSettings.md)|  | [optional] |

### Return type

[**SubscriptionSettings**](SubscriptionSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

