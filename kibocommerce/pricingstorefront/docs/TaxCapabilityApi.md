# TaxCapabilityApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTax**](TaxCapabilityApi.md#getTax) | **POST** /tax | Get Tax |


<a name="getTax"></a>
# **getTax**
> ThrirdPartyOrderTaxContext getTax(thrirdPartyTaxableOrder)

Get Tax

Get Tax

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.TaxCapabilityApi;

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

    TaxCapabilityApi apiInstance = new TaxCapabilityApi(defaultClient);
    ThrirdPartyTaxableOrder thrirdPartyTaxableOrder = new ThrirdPartyTaxableOrder(); // ThrirdPartyTaxableOrder | 
    try {
      ThrirdPartyOrderTaxContext result = apiInstance.getTax(thrirdPartyTaxableOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxCapabilityApi#getTax");
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
| **thrirdPartyTaxableOrder** | [**ThrirdPartyTaxableOrder**](ThrirdPartyTaxableOrder.md)|  | [optional] |

### Return type

[**ThrirdPartyOrderTaxContext**](ThrirdPartyOrderTaxContext.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

