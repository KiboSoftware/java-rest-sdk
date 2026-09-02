# ProductRuleApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**prodcutRulePreview**](ProductRuleApi.md#prodcutRulePreview) | **POST** /commerce/rules/product/evaluate/preview | Preview Product Rule |


<a name="prodcutRulePreview"></a>
# **prodcutRulePreview**
> ProductSearchSimplifiedResult prodcutRulePreview(sortBy, pageSize, startIndex, fieldList, responseFields, catalogRuntimesProductRule)

Preview Product Rule

Previews a new product rule by searching for products in the admin index that meet the rule criteria

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductRuleApi apiInstance = new ProductRuleApi(defaultClient);
    String sortBy = "sortBy_example"; // String | 
    Integer pageSize = 56; // Integer | 
    Integer startIndex = 0; // Integer | 
    String fieldList = "fieldList_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogRuntimesProductRule catalogRuntimesProductRule = new CatalogRuntimesProductRule(); // CatalogRuntimesProductRule | 
    try {
      ProductSearchSimplifiedResult result = apiInstance.prodcutRulePreview(sortBy, pageSize, startIndex, fieldList, responseFields, catalogRuntimesProductRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductRuleApi#prodcutRulePreview");
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
| **sortBy** | **String**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **fieldList** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogRuntimesProductRule** | [**CatalogRuntimesProductRule**](CatalogRuntimesProductRule.md)|  | [optional] |

### Return type

[**ProductSearchSimplifiedResult**](ProductSearchSimplifiedResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

