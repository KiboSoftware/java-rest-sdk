# CancelReasonsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getReasons**](CancelReasonsApi.md#getReasons) | **GET** /cancel/reasons | Get Cancel Reasons |


<a name="getReasons"></a>
# **getReasons**
> CancelReasonCollection getReasons(resourceType, category, skip, take, responseFields)

Get Cancel Reasons

Returns cancellation reasons for the specified resource type and category. Category defaults to SHOPPER. Category matching is case-insensitive.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CancelReasonsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CancelReasonsApi apiInstance = new CancelReasonsApi(defaultClient);
    String resourceType = "resourceType_example"; // String | 
    String category = "SHOPPER"; // String | 
    Integer skip = 0; // Integer | 
    Integer take = 50; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CancelReasonCollection result = apiInstance.getReasons(resourceType, category, skip, take, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancelReasonsApi#getReasons");
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
| **resourceType** | **String**|  | [optional] |
| **category** | **String**|  | [optional] [default to SHOPPER] |
| **skip** | **Integer**|  | [optional] [default to 0] |
| **take** | **Integer**|  | [optional] [default to 50] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CancelReasonCollection**](CancelReasonCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

