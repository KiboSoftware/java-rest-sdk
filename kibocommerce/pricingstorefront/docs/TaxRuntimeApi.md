# TaxRuntimeApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**estimateTaxes**](TaxRuntimeApi.md#estimateTaxes) | **POST** /commerce/catalog/storefront/tax/estimate-order | Estimate Taxes |


<a name="estimateTaxes"></a>
# **estimateTaxes**
> OrderTaxContext estimateTaxes(taxableOrder)

Estimate Taxes

Estimate Taxes

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.TaxRuntimeApi;

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

    TaxRuntimeApi apiInstance = new TaxRuntimeApi(defaultClient);
    TaxableOrder taxableOrder = new TaxableOrder(); // TaxableOrder | 
    try {
      OrderTaxContext result = apiInstance.estimateTaxes(taxableOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxRuntimeApi#estimateTaxes");
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
| **taxableOrder** | [**TaxableOrder**](TaxableOrder.md)|  | [optional] |

### Return type

[**OrderTaxContext**](OrderTaxContext.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

