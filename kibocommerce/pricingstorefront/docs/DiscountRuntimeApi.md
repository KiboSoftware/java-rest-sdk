# DiscountRuntimeApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAutoAddTarget**](DiscountRuntimeApi.md#getAutoAddTarget) | **GET** /commerce/catalog/storefront/discounts/autoaddtarget/{discountId} | Get Auto Add Target |


<a name="getAutoAddTarget"></a>
# **getAutoAddTarget**
> AutoAddDiscountTarget getAutoAddTarget(discountId)

Get Auto Add Target

Get Auto Add Target

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.DiscountRuntimeApi;

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

    DiscountRuntimeApi apiInstance = new DiscountRuntimeApi(defaultClient);
    Integer discountId = 56; // Integer | 
    try {
      AutoAddDiscountTarget result = apiInstance.getAutoAddTarget(discountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountRuntimeApi#getAutoAddTarget");
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
| **discountId** | **Integer**|  | |

### Return type

[**AutoAddDiscountTarget**](AutoAddDiscountTarget.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

