# DiscountSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDiscountSettings**](DiscountSettingsApi.md#getDiscountSettings) | **GET** /commerce/catalog/admin/discountsettings/{catalogId} | Get discount settings |
| [**updateDiscountSettings**](DiscountSettingsApi.md#updateDiscountSettings) | **PUT** /commerce/catalog/admin/discountsettings/{catalogId} | Update discount settings |


<a name="getDiscountSettings"></a>
# **getDiscountSettings**
> DiscountSettings getDiscountSettings(catalogId)

Get discount settings



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.DiscountSettingsApi;

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

    DiscountSettingsApi apiInstance = new DiscountSettingsApi(defaultClient);
    Integer catalogId = 56; // Integer | 
    try {
      DiscountSettings result = apiInstance.getDiscountSettings(catalogId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountSettingsApi#getDiscountSettings");
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
| **catalogId** | **Integer**|  | |

### Return type

[**DiscountSettings**](DiscountSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateDiscountSettings"></a>
# **updateDiscountSettings**
> DiscountSettings updateDiscountSettings(catalogId, discountSettings)

Update discount settings



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.DiscountSettingsApi;

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

    DiscountSettingsApi apiInstance = new DiscountSettingsApi(defaultClient);
    Integer catalogId = 56; // Integer | 
    DiscountSettings discountSettings = new DiscountSettings(); // DiscountSettings | 
    try {
      DiscountSettings result = apiInstance.updateDiscountSettings(catalogId, discountSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountSettingsApi#updateDiscountSettings");
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
| **catalogId** | **Integer**|  | |
| **discountSettings** | [**DiscountSettings**](DiscountSettings.md)|  | [optional] |

### Return type

[**DiscountSettings**](DiscountSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

