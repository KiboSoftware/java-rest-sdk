# RenditionApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**renderOrderSummary1**](RenditionApi.md#renderOrderSummary1) | **GET** /commerce/fulfillment/orders/{orderId}/summary/html | renderOrderSummary |
| [**renderReturnReceipt**](RenditionApi.md#renderReturnReceipt) | **GET** /commerce/fulfillment/returns/{returnId}/receipt/html | renderReturnReceipt |


<a name="renderOrderSummary1"></a>
# **renderOrderSummary1**
> EntityModelOfRenderedContent renderOrderSummary1(orderId)

renderOrderSummary

Render an order summary in HTML.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RenditionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RenditionApi apiInstance = new RenditionApi(defaultClient);
    String orderId = "orderId_example"; // String | orderId
    try {
      EntityModelOfRenderedContent result = apiInstance.renderOrderSummary1(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RenditionApi#renderOrderSummary1");
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
| **orderId** | **String**| orderId | |

### Return type

[**EntityModelOfRenderedContent**](EntityModelOfRenderedContent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="renderReturnReceipt"></a>
# **renderReturnReceipt**
> EntityModelOfRenderedContent renderReturnReceipt(returnId)

renderReturnReceipt

Render a return receipt in HTML.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RenditionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RenditionApi apiInstance = new RenditionApi(defaultClient);
    String returnId = "returnId_example"; // String | returnId
    try {
      EntityModelOfRenderedContent result = apiInstance.renderReturnReceipt(returnId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RenditionApi#renderReturnReceipt");
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
| **returnId** | **String**| returnId | |

### Return type

[**EntityModelOfRenderedContent**](EntityModelOfRenderedContent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

