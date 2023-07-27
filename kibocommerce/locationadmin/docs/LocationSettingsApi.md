# LocationSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocationUsage**](LocationSettingsApi.md#getLocationUsage) | **GET** /commerce/settings/locationUsages/{code} | Get Location Usage |
| [**getLocationUsages**](LocationSettingsApi.md#getLocationUsages) | **GET** /commerce/settings/locationUsages | Get Location Usages |
| [**updateLocationUsageAsync**](LocationSettingsApi.md#updateLocationUsageAsync) | **PUT** /commerce/settings/locationUsages/{code} | Update Location Usage Async |


<a name="getLocationUsage"></a>
# **getLocationUsage**
> LocationUsage getLocationUsage(code)

Get Location Usage

Get a locationUsage for the Site.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationSettingsApi;

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

    LocationSettingsApi apiInstance = new LocationSettingsApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      LocationUsage result = apiInstance.getLocationUsage(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationSettingsApi#getLocationUsage");
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
| **code** | **String**|  | |

### Return type

[**LocationUsage**](LocationUsage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getLocationUsages"></a>
# **getLocationUsages**
> LocationUsageCollection getLocationUsages()

Get Location Usages

Get the locationUsages for the Site.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationSettingsApi;

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

    LocationSettingsApi apiInstance = new LocationSettingsApi(defaultClient);
    try {
      LocationUsageCollection result = apiInstance.getLocationUsages();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationSettingsApi#getLocationUsages");
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

[**LocationUsageCollection**](LocationUsageCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateLocationUsageAsync"></a>
# **updateLocationUsageAsync**
> LocationUsage updateLocationUsageAsync(code, locationUsage)

Update Location Usage Async

Update a locationUsage for the Site.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationSettingsApi;

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

    LocationSettingsApi apiInstance = new LocationSettingsApi(defaultClient);
    String code = "code_example"; // String | 
    LocationUsage locationUsage = new LocationUsage(); // LocationUsage | 
    try {
      LocationUsage result = apiInstance.updateLocationUsageAsync(code, locationUsage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationSettingsApi#updateLocationUsageAsync");
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
| **code** | **String**|  | |
| **locationUsage** | [**LocationUsage**](LocationUsage.md)|  | [optional] |

### Return type

[**LocationUsage**](LocationUsage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

