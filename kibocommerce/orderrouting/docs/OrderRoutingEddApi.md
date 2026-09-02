# OrderRoutingEddApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**suggestRoutingWithEDD**](OrderRoutingEddApi.md#suggestRoutingWithEDD) | **POST** /commerce/orders/orderrouting/api/v1/routing/edd/suggestion | Suggest Routing With EDD |


<a name="suggestRoutingWithEDD"></a>
# **suggestRoutingWithEDD**
> EddSuggestionResponse suggestRoutingWithEDD(xVolTenant, xVolSite, eddSuggestionRequest, returnSuggestionLog, returnEddCalculationLog)

Suggest Routing With EDD

Suggest Routing With EDD

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingEddApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingEddApi apiInstance = new OrderRoutingEddApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    EddSuggestionRequest eddSuggestionRequest = new EddSuggestionRequest(); // EddSuggestionRequest | 
    Boolean returnSuggestionLog = false; // Boolean | 
    Boolean returnEddCalculationLog = false; // Boolean | 
    try {
      EddSuggestionResponse result = apiInstance.suggestRoutingWithEDD(xVolTenant, xVolSite, eddSuggestionRequest, returnSuggestionLog, returnEddCalculationLog);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingEddApi#suggestRoutingWithEDD");
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
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |
| **eddSuggestionRequest** | [**EddSuggestionRequest**](EddSuggestionRequest.md)|  | |
| **returnSuggestionLog** | **Boolean**|  | [optional] [default to false] |
| **returnEddCalculationLog** | **Boolean**|  | [optional] [default to false] |

### Return type

[**EddSuggestionResponse**](EddSuggestionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

