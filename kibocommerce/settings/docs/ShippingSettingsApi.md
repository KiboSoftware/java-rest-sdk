# ShippingSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrderHandlingFee**](ShippingSettingsApi.md#createOrderHandlingFee) | **POST** /commerce/settings/shipping/orderhandlingfee | Creates the site&#39;s order handling fee as it appears in shipping settings. Allows you to add the return address in shipping settings without modifying any other settings. |
| [**getOrderHandlingFee**](ShippingSettingsApi.md#getOrderHandlingFee) | **GET** /commerce/settings/shipping/orderhandlingfee | Get Order Handling Fee |
| [**getSiteShippingSettings**](ShippingSettingsApi.md#getSiteShippingSettings) | **GET** /commerce/settings/shipping | Get Site Shipping Settings |
| [**updateOrderHandlingFee**](ShippingSettingsApi.md#updateOrderHandlingFee) | **PUT** /commerce/settings/shipping/orderhandlingfee | Updates the site&#39;s shipping return address as it appears in shipping settings. Allows you to update the address in shipping settings without modifying any other settings. |


<a name="createOrderHandlingFee"></a>
# **createOrderHandlingFee**
> SiteShippingHandlingFee createOrderHandlingFee(siteShippingHandlingFee)

Creates the site&#39;s order handling fee as it appears in shipping settings. Allows you to add the return address in shipping settings without modifying any other settings.

OBSOLETE: Handling fees are now defined via shipping admin   Creates site&#39;s shipping handling fee.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.ShippingSettingsApi;

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

    ShippingSettingsApi apiInstance = new ShippingSettingsApi(defaultClient);
    SiteShippingHandlingFee siteShippingHandlingFee = new SiteShippingHandlingFee(); // SiteShippingHandlingFee | New order handling fee to create. Required properties: Amount.
    try {
      SiteShippingHandlingFee result = apiInstance.createOrderHandlingFee(siteShippingHandlingFee);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingSettingsApi#createOrderHandlingFee");
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
| **siteShippingHandlingFee** | [**SiteShippingHandlingFee**](SiteShippingHandlingFee.md)| New order handling fee to create. Required properties: Amount. | [optional] |

### Return type

[**SiteShippingHandlingFee**](SiteShippingHandlingFee.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOrderHandlingFee"></a>
# **getOrderHandlingFee**
> SiteShippingHandlingFee getOrderHandlingFee()

Get Order Handling Fee

OBSOLETE: Handling fees are now defined via shipping admin   Retrieves the site&#39;s shipping handling fee.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.ShippingSettingsApi;

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

    ShippingSettingsApi apiInstance = new ShippingSettingsApi(defaultClient);
    try {
      SiteShippingHandlingFee result = apiInstance.getOrderHandlingFee();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingSettingsApi#getOrderHandlingFee");
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

[**SiteShippingHandlingFee**](SiteShippingHandlingFee.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSiteShippingSettings"></a>
# **getSiteShippingSettings**
> SiteShippingSettings getSiteShippingSettings()

Get Site Shipping Settings

Retrievs site&#39;s current shipping settings including information about the active shipping rate provider,  return address, shipping methods, and which countries that you can ship to.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.ShippingSettingsApi;

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

    ShippingSettingsApi apiInstance = new ShippingSettingsApi(defaultClient);
    try {
      SiteShippingSettings result = apiInstance.getSiteShippingSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingSettingsApi#getSiteShippingSettings");
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

[**SiteShippingSettings**](SiteShippingSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateOrderHandlingFee"></a>
# **updateOrderHandlingFee**
> SiteShippingHandlingFee updateOrderHandlingFee(siteShippingHandlingFee)

Updates the site&#39;s shipping return address as it appears in shipping settings. Allows you to update the address in shipping settings without modifying any other settings.

OBSOLETE: Handling fees are now defined via shipping admin   Updates the site&#39;s shipping handling fee.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.ShippingSettingsApi;

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

    ShippingSettingsApi apiInstance = new ShippingSettingsApi(defaultClient);
    SiteShippingHandlingFee siteShippingHandlingFee = new SiteShippingHandlingFee(); // SiteShippingHandlingFee | Properties of the site's order handling fee. Required properties: Amount.
    try {
      SiteShippingHandlingFee result = apiInstance.updateOrderHandlingFee(siteShippingHandlingFee);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingSettingsApi#updateOrderHandlingFee");
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
| **siteShippingHandlingFee** | [**SiteShippingHandlingFee**](SiteShippingHandlingFee.md)| Properties of the site&#39;s order handling fee. Required properties: Amount. | [optional] |

### Return type

[**SiteShippingHandlingFee**](SiteShippingHandlingFee.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

