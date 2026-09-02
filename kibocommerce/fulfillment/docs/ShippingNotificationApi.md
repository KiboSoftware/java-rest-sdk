# ShippingNotificationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**handleCarrierNotification**](ShippingNotificationApi.md#handleCarrierNotification) | **POST** /commerce/fulfillment/shipping/notifications/{carrier} | Handle Carrier Notifications |


<a name="handleCarrierNotification"></a>
# **handleCarrierNotification**
> String handleCarrierNotification(carrier, paramMap)

Handle Carrier Notifications

Handle carrier notifications.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShippingNotificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShippingNotificationApi apiInstance = new ShippingNotificationApi(defaultClient);
    String carrier = "carrier_example"; // String | carrier
    String paramMap = "paramMap_example"; // String | paramMap
    try {
      String result = apiInstance.handleCarrierNotification(carrier, paramMap);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingNotificationApi#handleCarrierNotification");
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
| **carrier** | **String**| carrier | |
| **paramMap** | **String**| paramMap | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

