# DiscountSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDiscountSettings**](DiscountSettingsApi.md#getDiscountSettings) | **GET** /commerce/catalog/admin/discountsettings/{catalogId} | Get Discount Settings |
| [**updateDiscountSettings**](DiscountSettingsApi.md#updateDiscountSettings) | **PUT** /commerce/catalog/admin/discountsettings/{catalogId} | Update Discount Settings |


<a name="getDiscountSettings"></a>
# **getDiscountSettings**
> DiscountSettings getDiscountSettings(catalogId, responseFields)

Get Discount Settings

Retrieves the discount settings of a particular catalog.

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

    DiscountSettingsApi apiInstance = new DiscountSettingsApi(defaultClient);
    Integer catalogId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      DiscountSettings result = apiInstance.getDiscountSettings(catalogId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**DiscountSettings**](DiscountSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateDiscountSettings"></a>
# **updateDiscountSettings**
> DiscountSettings updateDiscountSettings(catalogId, responseFields, discountSettings)

Update Discount Settings

Updates the discount settings of a particular catalog.

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

    DiscountSettingsApi apiInstance = new DiscountSettingsApi(defaultClient);
    Integer catalogId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    DiscountSettings discountSettings = new DiscountSettings(); // DiscountSettings | 
    try {
      DiscountSettings result = apiInstance.updateDiscountSettings(catalogId, responseFields, discountSettings);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **discountSettings** | [**DiscountSettings**](DiscountSettings.md)|  | [optional] |

### Return type

[**DiscountSettings**](DiscountSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

