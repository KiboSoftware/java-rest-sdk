# CarrierConfigurationGlobalApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllServiceTypes**](CarrierConfigurationGlobalApi.md#getAllServiceTypes) | **GET** /commerce/shipping/global/carriers/serviceTypes/{localeCode} | Used for retrieving the available service types for the Mozu Default Application carriers |
| [**getCarrierServiceTypes**](CarrierConfigurationGlobalApi.md#getCarrierServiceTypes) | **GET** /commerce/shipping/global/carriers/{carrierId}/serviceTypes/{localeCode} | Used for retrieving the available service types for the Mozu Default Application carriers |


<a name="getAllServiceTypes"></a>
# **getAllServiceTypes**
> List&lt;ServiceType&gt; getAllServiceTypes(localeCode)

Used for retrieving the available service types for the Mozu Default Application carriers

Used for retrieving the available service types for the Mozu Default Application carriers

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.CarrierConfigurationGlobalApi;

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

    CarrierConfigurationGlobalApi apiInstance = new CarrierConfigurationGlobalApi(defaultClient);
    String localeCode = "localeCode_example"; // String | 
    try {
      List<ServiceType> result = apiInstance.getAllServiceTypes(localeCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierConfigurationGlobalApi#getAllServiceTypes");
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
| **localeCode** | **String**|  | |

### Return type

[**List&lt;ServiceType&gt;**](ServiceType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCarrierServiceTypes"></a>
# **getCarrierServiceTypes**
> List&lt;ServiceType&gt; getCarrierServiceTypes(carrierId, localeCode)

Used for retrieving the available service types for the Mozu Default Application carriers

Used for retrieving the available service types for the Mozu Default Application carriers

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.CarrierConfigurationGlobalApi;

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

    CarrierConfigurationGlobalApi apiInstance = new CarrierConfigurationGlobalApi(defaultClient);
    String carrierId = "carrierId_example"; // String | 
    String localeCode = "localeCode_example"; // String | 
    try {
      List<ServiceType> result = apiInstance.getCarrierServiceTypes(carrierId, localeCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierConfigurationGlobalApi#getCarrierServiceTypes");
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
| **carrierId** | **String**|  | |
| **localeCode** | **String**|  | |

### Return type

[**List&lt;ServiceType&gt;**](ServiceType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

