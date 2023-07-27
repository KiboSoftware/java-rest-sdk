# RenditionApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**renderOrderSummaryUsingGET**](RenditionApi.md#renderOrderSummaryUsingGET) | **GET** /commerce/fulfillment/orders/{orderId}/summary/html | Render Order Summary |
| [**renderReturnReceiptUsingGET**](RenditionApi.md#renderReturnReceiptUsingGET) | **GET** /commerce/fulfillment/returns/{returnId}/receipt/html | Render Return Receipt |


<a name="renderOrderSummaryUsingGET"></a>
# **renderOrderSummaryUsingGET**
> EntityModelOfstring renderOrderSummaryUsingGET(orderId)

Render Order Summary

Render order summary in HTML format for printing

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RenditionApi;

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

    RenditionApi apiInstance = new RenditionApi(defaultClient);
    String orderId = "orderId_example"; // String | orderId
    try {
      EntityModelOfstring result = apiInstance.renderOrderSummaryUsingGET(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RenditionApi#renderOrderSummaryUsingGET");
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

[**EntityModelOfstring**](EntityModelOfstring.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

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

<a name="renderReturnReceiptUsingGET"></a>
# **renderReturnReceiptUsingGET**
> EntityModelOfstring renderReturnReceiptUsingGET(returnId)

Render Return Receipt

Render return receipt in HTML format for printing

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RenditionApi;

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

    RenditionApi apiInstance = new RenditionApi(defaultClient);
    String returnId = "returnId_example"; // String | returnId
    try {
      EntityModelOfstring result = apiInstance.renderReturnReceiptUsingGET(returnId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RenditionApi#renderReturnReceiptUsingGET");
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

[**EntityModelOfstring**](EntityModelOfstring.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

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

