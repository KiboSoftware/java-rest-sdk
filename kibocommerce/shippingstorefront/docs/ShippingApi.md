# ShippingApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelLabels**](ShippingApi.md#cancelLabels) | **POST** /commerce/catalog/storefront/shipping/cancel-labels | Cancel Labels |
| [**getCarriers**](ShippingApi.md#getCarriers) | **GET** /commerce/catalog/storefront/shipping/carriers | Get Carriers |
| [**getLabels**](ShippingApi.md#getLabels) | **POST** /commerce/catalog/storefront/shipping/request-labels | Get Labels |
| [**getManifest**](ShippingApi.md#getManifest) | **POST** /commerce/catalog/storefront/shipping/request-manifest | Get Manifest |
| [**getManifestURL**](ShippingApi.md#getManifestURL) | **GET** /commerce/catalog/storefront/shipping/{carrierId}/get-manifest-url/{manifestId} | Get Manifest URL |
| [**getMultiRates**](ShippingApi.md#getMultiRates) | **POST** /commerce/catalog/storefront/shipping/request-multi-rates | Get Multi Rates |
| [**getRates**](ShippingApi.md#getRates) | **POST** /commerce/catalog/storefront/shipping/request-rates | Get Rates |


<a name="cancelLabels"></a>
# **cancelLabels**
> CancelLabelResponse cancelLabels(cancelLabelRequest)

Cancel Labels

Cancel a Unused Label

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingstorefront.ApiClient;
import com.kibocommerce.sdk.shippingstorefront.ApiException;
import com.kibocommerce.sdk.shippingstorefront.Configuration;
import com.kibocommerce.sdk.shippingstorefront.auth.*;
import com.kibocommerce.sdk.shippingstorefront.models.*;
import com.kibocommerce.sdk.shippingstorefront.api.ShippingApi;

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

    ShippingApi apiInstance = new ShippingApi(defaultClient);
    CancelLabelRequest cancelLabelRequest = new CancelLabelRequest(); // CancelLabelRequest | 
    try {
      CancelLabelResponse result = apiInstance.cancelLabels(cancelLabelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingApi#cancelLabels");
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
| **cancelLabelRequest** | [**CancelLabelRequest**](CancelLabelRequest.md)|  | [optional] |

### Return type

[**CancelLabelResponse**](CancelLabelResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCarriers"></a>
# **getCarriers**
> CarrierResponse getCarriers()

Get Carriers

Get a list of supported carriers.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingstorefront.ApiClient;
import com.kibocommerce.sdk.shippingstorefront.ApiException;
import com.kibocommerce.sdk.shippingstorefront.Configuration;
import com.kibocommerce.sdk.shippingstorefront.auth.*;
import com.kibocommerce.sdk.shippingstorefront.models.*;
import com.kibocommerce.sdk.shippingstorefront.api.ShippingApi;

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

    ShippingApi apiInstance = new ShippingApi(defaultClient);
    try {
      CarrierResponse result = apiInstance.getCarriers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingApi#getCarriers");
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

[**CarrierResponse**](CarrierResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getLabels"></a>
# **getLabels**
> ShipmentResponse getLabels(shipmentRequest)

Get Labels

Get Shipping Label for the Service Type Requested

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingstorefront.ApiClient;
import com.kibocommerce.sdk.shippingstorefront.ApiException;
import com.kibocommerce.sdk.shippingstorefront.Configuration;
import com.kibocommerce.sdk.shippingstorefront.auth.*;
import com.kibocommerce.sdk.shippingstorefront.models.*;
import com.kibocommerce.sdk.shippingstorefront.api.ShippingApi;

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

    ShippingApi apiInstance = new ShippingApi(defaultClient);
    ShipmentRequest shipmentRequest = new ShipmentRequest(); // ShipmentRequest | 
    try {
      ShipmentResponse result = apiInstance.getLabels(shipmentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingApi#getLabels");
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
| **shipmentRequest** | [**ShipmentRequest**](ShipmentRequest.md)|  | [optional] |

### Return type

[**ShipmentResponse**](ShipmentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getManifest"></a>
# **getManifest**
> ManifestResponse getManifest(shippingRuntimeManifestRequest)

Get Manifest

Get Manifest for the list Shipping Labels

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingstorefront.ApiClient;
import com.kibocommerce.sdk.shippingstorefront.ApiException;
import com.kibocommerce.sdk.shippingstorefront.Configuration;
import com.kibocommerce.sdk.shippingstorefront.auth.*;
import com.kibocommerce.sdk.shippingstorefront.models.*;
import com.kibocommerce.sdk.shippingstorefront.api.ShippingApi;

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

    ShippingApi apiInstance = new ShippingApi(defaultClient);
    ShippingRuntimeManifestRequest shippingRuntimeManifestRequest = new ShippingRuntimeManifestRequest(); // ShippingRuntimeManifestRequest | 
    try {
      ManifestResponse result = apiInstance.getManifest(shippingRuntimeManifestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingApi#getManifest");
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
| **shippingRuntimeManifestRequest** | [**ShippingRuntimeManifestRequest**](ShippingRuntimeManifestRequest.md)|  | [optional] |

### Return type

[**ManifestResponse**](ManifestResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getManifestURL"></a>
# **getManifestURL**
> String getManifestURL(carrierId, manifestId)

Get Manifest URL

Get Manifest URL for the Manifest Id

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingstorefront.ApiClient;
import com.kibocommerce.sdk.shippingstorefront.ApiException;
import com.kibocommerce.sdk.shippingstorefront.Configuration;
import com.kibocommerce.sdk.shippingstorefront.auth.*;
import com.kibocommerce.sdk.shippingstorefront.models.*;
import com.kibocommerce.sdk.shippingstorefront.api.ShippingApi;

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

    ShippingApi apiInstance = new ShippingApi(defaultClient);
    String carrierId = "carrierId_example"; // String | 
    String manifestId = "manifestId_example"; // String | 
    try {
      String result = apiInstance.getManifestURL(carrierId, manifestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingApi#getManifestURL");
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
| **manifestId** | **String**|  | |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getMultiRates"></a>
# **getMultiRates**
> List&lt;RatesResponseGroup&gt; getMultiRates(includeRawResponse, rateRequestGroup)

Get Multi Rates

Get List of Rate Responses for a List of Rate Requests

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingstorefront.ApiClient;
import com.kibocommerce.sdk.shippingstorefront.ApiException;
import com.kibocommerce.sdk.shippingstorefront.Configuration;
import com.kibocommerce.sdk.shippingstorefront.auth.*;
import com.kibocommerce.sdk.shippingstorefront.models.*;
import com.kibocommerce.sdk.shippingstorefront.api.ShippingApi;

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

    ShippingApi apiInstance = new ShippingApi(defaultClient);
    Boolean includeRawResponse = false; // Boolean | 
    List<RateRequestGroup> rateRequestGroup = Arrays.asList(); // List<RateRequestGroup> | 
    try {
      List<RatesResponseGroup> result = apiInstance.getMultiRates(includeRawResponse, rateRequestGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingApi#getMultiRates");
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
| **includeRawResponse** | **Boolean**|  | [optional] [default to false] |
| **rateRequestGroup** | [**List&lt;RateRequestGroup&gt;**](RateRequestGroup.md)|  | [optional] |

### Return type

[**List&lt;RatesResponseGroup&gt;**](RatesResponseGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getRates"></a>
# **getRates**
> RatesResponse getRates(includeRawResponse, rateRequest)

Get Rates

Get Rate Responses for a Rate Request

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingstorefront.ApiClient;
import com.kibocommerce.sdk.shippingstorefront.ApiException;
import com.kibocommerce.sdk.shippingstorefront.Configuration;
import com.kibocommerce.sdk.shippingstorefront.auth.*;
import com.kibocommerce.sdk.shippingstorefront.models.*;
import com.kibocommerce.sdk.shippingstorefront.api.ShippingApi;

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

    ShippingApi apiInstance = new ShippingApi(defaultClient);
    Boolean includeRawResponse = false; // Boolean | 
    RateRequest rateRequest = new RateRequest(); // RateRequest | 
    try {
      RatesResponse result = apiInstance.getRates(includeRawResponse, rateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingApi#getRates");
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
| **includeRawResponse** | **Boolean**|  | [optional] [default to false] |
| **rateRequest** | [**RateRequest**](RateRequest.md)|  | [optional] |

### Return type

[**RatesResponse**](RatesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

