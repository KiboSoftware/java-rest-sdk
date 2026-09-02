# ProductRuleUsagesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getProductRuleUsages**](ProductRuleUsagesApi.md#getProductRuleUsages) | **GET** /commerce/rules/product/{code}/usages | Get Product Rule Usages |


<a name="getProductRuleUsages"></a>
# **getProductRuleUsages**
> ProductRuleUsageCollection getProductRuleUsages(code, startIndex, pageSize, responseFields)

Get Product Rule Usages

Retrieves the usages of a product rule across rule types.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductRuleUsagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductRuleUsagesApi apiInstance = new ProductRuleUsagesApi(defaultClient);
    String code = "code_example"; // String | The product rule code.
    Integer startIndex = 0; // Integer | The start index.
    Integer pageSize = 0; // Integer | The page size.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ProductRuleUsageCollection result = apiInstance.getProductRuleUsages(code, startIndex, pageSize, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductRuleUsagesApi#getProductRuleUsages");
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
| **code** | **String**| The product rule code. | |
| **startIndex** | **Integer**| The start index. | [optional] [default to 0] |
| **pageSize** | **Integer**| The page size. | [optional] [default to 0] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ProductRuleUsageCollection**](ProductRuleUsageCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

