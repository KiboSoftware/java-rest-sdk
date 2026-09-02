# AddressValidationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**validateAddress**](AddressValidationApi.md#validateAddress) | **POST** /commerce/customer/addressvalidation | Validate Address |


<a name="validateAddress"></a>
# **validateAddress**
> AddressValidationResponse validateAddress(responseFields, addressValidationRequest)

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

    AddressValidationApi apiInstance = new AddressValidationApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    AddressValidationRequest addressValidationRequest = new AddressValidationRequest(); // AddressValidationRequest | 
    try {
      AddressValidationResponse result = apiInstance.validateAddress(responseFields, addressValidationRequest);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **addressValidationRequest** | [**AddressValidationRequest**](AddressValidationRequest.md)|  | [optional] |

### Return type

[**AddressValidationResponse**](AddressValidationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

