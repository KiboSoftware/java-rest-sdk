# TaxesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**storefrontEstimateTaxes**](TaxesApi.md#storefrontEstimateTaxes) | **POST** /commerce/catalog/storefront/tax/estimate-order | Estimate Order Tax |


<a name="storefrontEstimateTaxes"></a>
# **storefrontEstimateTaxes**
> OrderTaxContext storefrontEstimateTaxes(responseFields, taxableOrder)

Estimate Order Tax

Retrieves a tax context for the given order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.TaxesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TaxesApi apiInstance = new TaxesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    TaxableOrder taxableOrder = new TaxableOrder(); // TaxableOrder | 
    try {
      OrderTaxContext result = apiInstance.storefrontEstimateTaxes(responseFields, taxableOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxesApi#storefrontEstimateTaxes");
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
| **taxableOrder** | [**TaxableOrder**](TaxableOrder.md)|  | [optional] |

### Return type

[**OrderTaxContext**](OrderTaxContext.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

