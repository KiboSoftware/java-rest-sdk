# LocationGroupConfigurationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocationGroupConfiguration**](LocationGroupConfigurationApi.md#getLocationGroupConfiguration) | **GET** /commerce/admin/locationGroupConfiguration/{locationGroupCode} | Get Location Group Configuration |
| [**getLocationGroupConfigurationByLocationCode**](LocationGroupConfigurationApi.md#getLocationGroupConfigurationByLocationCode) | **GET** /commerce/admin/locationGroupConfiguration/location/{locationCode} | Get Location Group Configuration by Location |
| [**setLocationGroupConfiguration**](LocationGroupConfigurationApi.md#setLocationGroupConfiguration) | **PUT** /commerce/admin/locationGroupConfiguration/{locationGroupCode} | Set Location Group Configuration |


<a name="getLocationGroupConfiguration"></a>
# **getLocationGroupConfiguration**
> LocationGroupConfiguration getLocationGroupConfiguration(locationGroupCode, responseFields)

Get Location Group Configuration

Get this tenants Location Group Configuration Values by locationGroupCode.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationGroupConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationGroupConfigurationApi apiInstance = new LocationGroupConfigurationApi(defaultClient);
    String locationGroupCode = "locationGroupCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      LocationGroupConfiguration result = apiInstance.getLocationGroupConfiguration(locationGroupCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationGroupConfigurationApi#getLocationGroupConfiguration");
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
| **locationGroupCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**LocationGroupConfiguration**](LocationGroupConfiguration.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getLocationGroupConfigurationByLocationCode"></a>
# **getLocationGroupConfigurationByLocationCode**
> LocationGroupConfiguration getLocationGroupConfigurationByLocationCode(locationCode, responseFields)

Get Location Group Configuration by Location

Get this tenants Location Group Configuration Values by Location Code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationGroupConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationGroupConfigurationApi apiInstance = new LocationGroupConfigurationApi(defaultClient);
    String locationCode = "locationCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      LocationGroupConfiguration result = apiInstance.getLocationGroupConfigurationByLocationCode(locationCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationGroupConfigurationApi#getLocationGroupConfigurationByLocationCode");
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
| **locationCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**LocationGroupConfiguration**](LocationGroupConfiguration.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="setLocationGroupConfiguration"></a>
# **setLocationGroupConfiguration**
> LocationGroupConfiguration setLocationGroupConfiguration(locationGroupCode, responseFields, locationGroupConfiguration)

Set Location Group Configuration

Set this tenants Location Group Configuration Values.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationGroupConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationGroupConfigurationApi apiInstance = new LocationGroupConfigurationApi(defaultClient);
    String locationGroupCode = "locationGroupCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    LocationGroupConfiguration locationGroupConfiguration = new LocationGroupConfiguration(); // LocationGroupConfiguration | 
    try {
      LocationGroupConfiguration result = apiInstance.setLocationGroupConfiguration(locationGroupCode, responseFields, locationGroupConfiguration);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationGroupConfigurationApi#setLocationGroupConfiguration");
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
| **locationGroupCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **locationGroupConfiguration** | [**LocationGroupConfiguration**](LocationGroupConfiguration.md)|  | [optional] |

### Return type

[**LocationGroupConfiguration**](LocationGroupConfiguration.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

