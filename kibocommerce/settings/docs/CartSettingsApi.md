# CartSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCartSettings**](CartSettingsApi.md#createCartSettings) | **POST** /commerce/settings/cart/cartsettings | Create Cart Settings |
| [**getCartSettings**](CartSettingsApi.md#getCartSettings) | **GET** /commerce/settings/cart/cartsettings | Get Cart Settings |
| [**updateCartSettings**](CartSettingsApi.md#updateCartSettings) | **PUT** /commerce/settings/cart/cartsettings | Update Cart Settings |


<a name="createCartSettings"></a>
# **createCartSettings**
> CartSettings createCartSettings(responseFields, cartSettings)

Create Cart Settings

Creates new cart settings. If enabling the Handling Fee, note that doing so does not display handling fees as line items in your storefront&#39;s checkout page. Rather, it simply includes the cost of the handling fees in the total. To display handling fees as line items in the checkout page, ask your theme developer to make the necessary changes.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.CartSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartSettingsApi apiInstance = new CartSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CartSettings cartSettings = new CartSettings(); // CartSettings | 
    try {
      CartSettings result = apiInstance.createCartSettings(responseFields, cartSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartSettingsApi#createCartSettings");
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
| **cartSettings** | [**CartSettings**](CartSettings.md)|  | [optional] |

### Return type

[**CartSettings**](CartSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCartSettings"></a>
# **getCartSettings**
> CartSettings getCartSettings(responseFields)

Get Cart Settings

Retrieves existing cart settings.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.CartSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartSettingsApi apiInstance = new CartSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CartSettings result = apiInstance.getCartSettings(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartSettingsApi#getCartSettings");
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

[**CartSettings**](CartSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCartSettings"></a>
# **updateCartSettings**
> CartSettings updateCartSettings(responseFields, cartSettings)

Update Cart Settings

Modifies existing cart settings. If enabling the Handling Fee, note that doing so does not display handling fees as line items in your storefront&#39;s checkout page. Rather, it simply includes the cost of the handling fees in the total. To display handling fees as line items in the checkout page, ask your theme developer to make the necessary changes.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.CartSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CartSettingsApi apiInstance = new CartSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CartSettings cartSettings = new CartSettings(); // CartSettings | 
    try {
      CartSettings result = apiInstance.updateCartSettings(responseFields, cartSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartSettingsApi#updateCartSettings");
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
| **cartSettings** | [**CartSettings**](CartSettings.md)|  | [optional] |

### Return type

[**CartSettings**](CartSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

