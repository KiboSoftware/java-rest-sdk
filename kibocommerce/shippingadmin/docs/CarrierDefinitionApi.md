# CarrierDefinitionApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCarrierDefinition**](CarrierDefinitionApi.md#getCarrierDefinition) | **GET** /commerce/shipping/admin/carriers/definitions/{carrierId} | Get Carrier Definition |
| [**getCarrierDefinitions**](CarrierDefinitionApi.md#getCarrierDefinitions) | **GET** /commerce/shipping/admin/carriers/definitions | Get Carrier Definitions |


<a name="getCarrierDefinition"></a>
# **getCarrierDefinition**
> CarrierDefinition getCarrierDefinition(carrierId, responseFields)

Get Carrier Definition

Retrieves the carrier definition for the specified carrier

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

    CarrierDefinitionApi apiInstance = new CarrierDefinitionApi(defaultClient);
    String carrierId = "carrierId_example"; // String | The carrier ID.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CarrierDefinition result = apiInstance.getCarrierDefinition(carrierId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CarrierDefinition**](CarrierDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCarrierDefinitions"></a>
# **getCarrierDefinitions**
> List&lt;CarrierDefinition&gt; getCarrierDefinitions(responseFields)

Get Carrier Definitions

Retrieves all shipping carrier definitions for the specified tenant

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

    CarrierDefinitionApi apiInstance = new CarrierDefinitionApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<CarrierDefinition> result = apiInstance.getCarrierDefinitions(responseFields);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;CarrierDefinition&gt;**](CarrierDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

