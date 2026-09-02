# ShipmentResendEmailApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resendShipmentCancelEmail**](ShipmentResendEmailApi.md#resendShipmentCancelEmail) | **PUT** /commerce/shipments/{shipmentNumber}/resendCanceledEmail | resendShipmentCancelEmail |
| [**resendShipmentFulfillEmail**](ShipmentResendEmailApi.md#resendShipmentFulfillEmail) | **PUT** /commerce/shipments/{shipmentNumber}/resendFulfilledEmail | resendShipmentFulfillEmail |


<a name="resendShipmentCancelEmail"></a>
# **resendShipmentCancelEmail**
> resendShipmentCancelEmail(shipmentNumber, xVolTenant, xVolSite)

resendShipmentCancelEmail

resendShipmentCancelEmail

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentResendEmailApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentResendEmailApi apiInstance = new ShipmentResendEmailApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      apiInstance.resendShipmentCancelEmail(shipmentNumber, xVolTenant, xVolSite);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentResendEmailApi#resendShipmentCancelEmail");
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
| **xVolSite** | **Integer**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="resendShipmentFulfillEmail"></a>
# **resendShipmentFulfillEmail**
> resendShipmentFulfillEmail(shipmentNumber, xVolTenant, xVolSite)

resendShipmentFulfillEmail

resendShipmentFulfillEmail

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentResendEmailApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentResendEmailApi apiInstance = new ShipmentResendEmailApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      apiInstance.resendShipmentFulfillEmail(shipmentNumber, xVolTenant, xVolSite);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentResendEmailApi#resendShipmentFulfillEmail");
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
| **xVolSite** | **Integer**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

