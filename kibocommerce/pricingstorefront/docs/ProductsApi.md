# ProductsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**storefrontSecureFindItemDiscounts**](ProductsApi.md#storefrontSecureFindItemDiscounts) | **POST** /commerce/catalog/storefront/discounts/secure/products | Get Secure Item Discounts |
| [**storefrontSecureFindOrderDiscounts**](ProductsApi.md#storefrontSecureFindOrderDiscounts) | **POST** /commerce/catalog/storefront/discounts/secure/orders | Get Secure Order Discounts |
| [**storefrontSecureGetItemDiscounts**](ProductsApi.md#storefrontSecureGetItemDiscounts) | **GET** /commerce/catalog/storefront/discounts/secure/products/{productCode} | Get Secure Item Discounts by Product |


<a name="storefrontSecureFindItemDiscounts"></a>
# **storefrontSecureFindItemDiscounts**
> List&lt;FindDiscountsResponse&gt; storefrontSecureFindItemDiscounts(nonPublicOnly, responseFields, findItemDiscountsRequest)

Get Secure Item Discounts

Retrieves a list of non-public discounts according to specified filter criteria. These can only be accessed by users with the Discount Read behavior.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    Boolean nonPublicOnly = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    FindItemDiscountsRequest findItemDiscountsRequest = new FindItemDiscountsRequest(); // FindItemDiscountsRequest | 
    try {
      List<FindDiscountsResponse> result = apiInstance.storefrontSecureFindItemDiscounts(nonPublicOnly, responseFields, findItemDiscountsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#storefrontSecureFindItemDiscounts");
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
| **nonPublicOnly** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **findItemDiscountsRequest** | [**FindItemDiscountsRequest**](FindItemDiscountsRequest.md)|  | [optional] |

### Return type

[**List&lt;FindDiscountsResponse&gt;**](FindDiscountsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontSecureFindOrderDiscounts"></a>
# **storefrontSecureFindOrderDiscounts**
> List&lt;FindDiscountsResponse&gt; storefrontSecureFindOrderDiscounts(nonPublicOnly, responseFields, findOrderDiscountsRequest)

Get Secure Order Discounts

Retrieves a list of non-public discounts according to specified filter criteria. These can only be accessed by users with the Discount Read behavior.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    Boolean nonPublicOnly = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    FindOrderDiscountsRequest findOrderDiscountsRequest = new FindOrderDiscountsRequest(); // FindOrderDiscountsRequest | 
    try {
      List<FindDiscountsResponse> result = apiInstance.storefrontSecureFindOrderDiscounts(nonPublicOnly, responseFields, findOrderDiscountsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#storefrontSecureFindOrderDiscounts");
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
| **nonPublicOnly** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **findOrderDiscountsRequest** | [**FindOrderDiscountsRequest**](FindOrderDiscountsRequest.md)|  | [optional] |

### Return type

[**List&lt;FindDiscountsResponse&gt;**](FindDiscountsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontSecureGetItemDiscounts"></a>
# **storefrontSecureGetItemDiscounts**
> FindDiscountsResponse storefrontSecureGetItemDiscounts(productCode, nonPublicOnly, responseFields)

Get Secure Item Discounts by Product

Retrieves a list of non-public discounts according to specified filter criteria. These can only be accessed by users with the Discount Read behavior.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    Boolean nonPublicOnly = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      FindDiscountsResponse result = apiInstance.storefrontSecureGetItemDiscounts(productCode, nonPublicOnly, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#storefrontSecureGetItemDiscounts");
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
| **productCode** | **String**|  | |
| **nonPublicOnly** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**FindDiscountsResponse**](FindDiscountsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

