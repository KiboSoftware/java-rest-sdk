# AddressValidationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**validateAddress**](AddressValidationApi.md#validateAddress) | **POST** /commerce/customer/addressvalidation | Validate Address |


<a name="validateAddress"></a>
# **validateAddress**
> AddressValidationResponse validateAddress(addressValidationRequest)

Validate Address

Allows merchants and services to validate an address against the configured AddressValidator capability in SiteSettings, fallback uses USPS Address Validation.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.AddressValidationApi;

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

    AddressValidationApi apiInstance = new AddressValidationApi(defaultClient);
    AddressValidationRequest addressValidationRequest = new AddressValidationRequest(); // AddressValidationRequest | 
    try {
      AddressValidationResponse result = apiInstance.validateAddress(addressValidationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressValidationApi#validateAddress");
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
| **addressValidationRequest** | [**AddressValidationRequest**](AddressValidationRequest.md)|  | [optional] |

### Return type

[**AddressValidationResponse**](AddressValidationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

