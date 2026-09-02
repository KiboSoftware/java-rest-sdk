# PackingSuggestionApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCartPackingSuggestions**](PackingSuggestionApi.md#getCartPackingSuggestions) | **POST** /commerce/shipments/cartonization/packingSuggestions | getCartPackingSuggestions |
| [**getCartonizationRejectionReasons**](PackingSuggestionApi.md#getCartonizationRejectionReasons) | **GET** /commerce/shipments/cartonization/rejectionReasons | getCartonizationRejectionReasons |
| [**getPackingSuggestions**](PackingSuggestionApi.md#getPackingSuggestions) | **POST** /commerce/shipments/{shipmentNumber}/cartonization/packingSuggestions | getPackingSuggestions |
| [**rejectPackingSuggestion**](PackingSuggestionApi.md#rejectPackingSuggestion) | **POST** /commerce/shipments/{shipmentNumber}/cartonization/reject | rejectPackingSuggestion |


<a name="getCartPackingSuggestions"></a>
# **getCartPackingSuggestions**
> PackingSuggestionResponseDto getCartPackingSuggestions(xVolTenant, cartPackingSuggestionRequestDto, xVolSite)

getCartPackingSuggestions

getCartPackingSuggestions

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PackingSuggestionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PackingSuggestionApi apiInstance = new PackingSuggestionApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    CartPackingSuggestionRequestDto cartPackingSuggestionRequestDto = new CartPackingSuggestionRequestDto(); // CartPackingSuggestionRequestDto | request
    Integer xVolSite = 56; // Integer | 
    try {
      PackingSuggestionResponseDto result = apiInstance.getCartPackingSuggestions(xVolTenant, cartPackingSuggestionRequestDto, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackingSuggestionApi#getCartPackingSuggestions");
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
| **xVolTenant** | **Integer**|  | |
| **cartPackingSuggestionRequestDto** | [**CartPackingSuggestionRequestDto**](CartPackingSuggestionRequestDto.md)| request | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**PackingSuggestionResponseDto**](PackingSuggestionResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getCartonizationRejectionReasons"></a>
# **getCartonizationRejectionReasons**
> List&lt;CartonizationRejectionReason&gt; getCartonizationRejectionReasons(xVolTenant, xVolSite)

getCartonizationRejectionReasons

getCartonizationRejectionReasons

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PackingSuggestionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PackingSuggestionApi apiInstance = new PackingSuggestionApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      List<CartonizationRejectionReason> result = apiInstance.getCartonizationRejectionReasons(xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackingSuggestionApi#getCartonizationRejectionReasons");
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
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**List&lt;CartonizationRejectionReason&gt;**](CartonizationRejectionReason.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getPackingSuggestions"></a>
# **getPackingSuggestions**
> PackingSuggestionResponseDto getPackingSuggestions(shipmentNumber, xVolTenant, packingSuggestionRequestDto, xVolSite)

getPackingSuggestions

getPackingSuggestions

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PackingSuggestionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PackingSuggestionApi apiInstance = new PackingSuggestionApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    PackingSuggestionRequestDto packingSuggestionRequestDto = new PackingSuggestionRequestDto(); // PackingSuggestionRequestDto | request
    Integer xVolSite = 56; // Integer | 
    try {
      PackingSuggestionResponseDto result = apiInstance.getPackingSuggestions(shipmentNumber, xVolTenant, packingSuggestionRequestDto, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackingSuggestionApi#getPackingSuggestions");
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
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **packingSuggestionRequestDto** | [**PackingSuggestionRequestDto**](PackingSuggestionRequestDto.md)| request | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**PackingSuggestionResponseDto**](PackingSuggestionResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="rejectPackingSuggestion"></a>
# **rejectPackingSuggestion**
> EntityModelOfShipment rejectPackingSuggestion(shipmentNumber, xVolTenant, packingSuggestionRejectionRequest, ifMatch, xVolSite)

rejectPackingSuggestion

rejectPackingSuggestion

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PackingSuggestionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PackingSuggestionApi apiInstance = new PackingSuggestionApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    PackingSuggestionRejectionRequest packingSuggestionRejectionRequest = new PackingSuggestionRejectionRequest(); // PackingSuggestionRejectionRequest | request
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.rejectPackingSuggestion(shipmentNumber, xVolTenant, packingSuggestionRejectionRequest, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackingSuggestionApi#rejectPackingSuggestion");
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
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **packingSuggestionRejectionRequest** | [**PackingSuggestionRejectionRequest**](PackingSuggestionRejectionRequest.md)| request | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cartonization rejected successfully - returns updated shipment with ETag |  -  |
| **201** | Created |  -  |
| **400** | Validation failed - invalid reason code or missing required details |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Shipment not found |  -  |
| **412** | Precondition failed - shipment has been modified |  -  |

