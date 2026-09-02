# ShippingApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCarriers**](ShippingApi.md#getCarriers) | **GET** /commerce/catalog/storefront/shipping/carriers | Get Carriers |
| [**getLabels**](ShippingApi.md#getLabels) | **POST** /commerce/catalog/storefront/shipping/request-labels | Get Labels |
| [**getLabelsByTrackingNumber**](ShippingApi.md#getLabelsByTrackingNumber) | **POST** /commerce/catalog/storefront/shipping/get-labels | Get Labels By Tracking Number |
| [**getMultiRates**](ShippingApi.md#getMultiRates) | **POST** /commerce/catalog/storefront/shipping/request-multi-rates | Get Multi Rates |
| [**getRates**](ShippingApi.md#getRates) | **POST** /commerce/catalog/storefront/shipping/request-rates | Get Rates |
| [**getTransitTimes**](ShippingApi.md#getTransitTimes) | **POST** /commerce/catalog/storefront/shipping/transit-times | Get Transit Times |


<a name="getCarriers"></a>
# **getCarriers**
> CarrierResponse getCarriers(responseFields)

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

    ShippingApi apiInstance = new ShippingApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CarrierResponse result = apiInstance.getCarriers(responseFields);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CarrierResponse**](CarrierResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getLabels"></a>
# **getLabels**
> ShippingRuntimeShipmentResponse getLabels(responseFields, shipmentRequest)

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

    ShippingApi apiInstance = new ShippingApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ShipmentRequest shipmentRequest = new ShipmentRequest(); // ShipmentRequest | 
    try {
      ShippingRuntimeShipmentResponse result = apiInstance.getLabels(responseFields, shipmentRequest);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **shipmentRequest** | [**ShipmentRequest**](ShipmentRequest.md)|  | [optional] |

### Return type

[**ShippingRuntimeShipmentResponse**](ShippingRuntimeShipmentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getLabelsByTrackingNumber"></a>
# **getLabelsByTrackingNumber**
> LabelResponse getLabelsByTrackingNumber(responseFields, labelRequest)

Get Labels By Tracking Number

Get shipping labels by tracking number.

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

    ShippingApi apiInstance = new ShippingApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    LabelRequest labelRequest = new LabelRequest(); // LabelRequest | 
    try {
      LabelResponse result = apiInstance.getLabelsByTrackingNumber(responseFields, labelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingApi#getLabelsByTrackingNumber");
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
| **labelRequest** | [**LabelRequest**](LabelRequest.md)|  | [optional] |

### Return type

[**LabelResponse**](LabelResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getMultiRates"></a>
# **getMultiRates**
> List&lt;RatesResponseGroup&gt; getMultiRates(includeRawResponse, responseFields, rateRequestGroup)

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

    ShippingApi apiInstance = new ShippingApi(defaultClient);
    Boolean includeRawResponse = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<RateRequestGroup> rateRequestGroup = Arrays.asList(); // List<RateRequestGroup> | 
    try {
      List<RatesResponseGroup> result = apiInstance.getMultiRates(includeRawResponse, responseFields, rateRequestGroup);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **rateRequestGroup** | [**List&lt;RateRequestGroup&gt;**](RateRequestGroup.md)|  | [optional] |

### Return type

[**List&lt;RatesResponseGroup&gt;**](RatesResponseGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getRates"></a>
# **getRates**
> RatesResponse getRates(includeRawResponse, responseFields, rateRequest)

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

    ShippingApi apiInstance = new ShippingApi(defaultClient);
    Boolean includeRawResponse = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    RateRequest rateRequest = new RateRequest(); // RateRequest | 
    try {
      RatesResponse result = apiInstance.getRates(includeRawResponse, responseFields, rateRequest);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **rateRequest** | [**RateRequest**](RateRequest.md)|  | [optional] |

### Return type

[**RatesResponse**](RatesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getTransitTimes"></a>
# **getTransitTimes**
> TransitTimesResponse getTransitTimes(responseFields, transitTimesRequest)

Get Transit Times

Get Transit Times

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

    ShippingApi apiInstance = new ShippingApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    TransitTimesRequest transitTimesRequest = new TransitTimesRequest(); // TransitTimesRequest | 
    try {
      TransitTimesResponse result = apiInstance.getTransitTimes(responseFields, transitTimesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingApi#getTransitTimes");
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
| **transitTimesRequest** | [**TransitTimesRequest**](TransitTimesRequest.md)|  | [optional] |

### Return type

[**TransitTimesResponse**](TransitTimesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

