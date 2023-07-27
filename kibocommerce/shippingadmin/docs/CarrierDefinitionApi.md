# CarrierDefinitionApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCarrierDefinition**](CarrierDefinitionApi.md#getCarrierDefinition) | **GET** /commerce/shipping/admin/carriers/definitions/{carrierId} | Returns a Mozu |
| [**getCarrierDefinitions**](CarrierDefinitionApi.md#getCarrierDefinitions) | **GET** /commerce/shipping/admin/carriers/definitions | Returns a list of Mozu |


<a name="getCarrierDefinition"></a>
# **getCarrierDefinition**
> CarrierDefinition getCarrierDefinition(carrierId)

Returns a Mozu

hippingAdmin.Contracts.Carriers.CarrierDefinition for the specified carrier.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.CarrierDefinitionApi;

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

    CarrierDefinitionApi apiInstance = new CarrierDefinitionApi(defaultClient);
    String carrierId = "carrierId_example"; // String | The carrier ID.
    try {
      CarrierDefinition result = apiInstance.getCarrierDefinition(carrierId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierDefinitionApi#getCarrierDefinition");
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
| **carrierId** | **String**| The carrier ID. | |

### Return type

[**CarrierDefinition**](CarrierDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCarrierDefinitions"></a>
# **getCarrierDefinitions**
> List&lt;CarrierDefinition&gt; getCarrierDefinitions()

Returns a list of Mozu

hippingAdmin.Contracts.Carriers.CarrierDefinitions for the specified tenant.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.CarrierDefinitionApi;

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

    CarrierDefinitionApi apiInstance = new CarrierDefinitionApi(defaultClient);
    try {
      List<CarrierDefinition> result = apiInstance.getCarrierDefinitions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierDefinitionApi#getCarrierDefinitions");
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

[**List&lt;CarrierDefinition&gt;**](CarrierDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

