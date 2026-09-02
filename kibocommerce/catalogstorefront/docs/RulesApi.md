# RulesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**runtimeEvaluatePurchaseLimit**](RulesApi.md#runtimeEvaluatePurchaseLimit) | **POST** /commerce/rules/purchaselimit/evaluate | Evaluate Purchase Limits |
| [**runtimeEvaluateReturn**](RulesApi.md#runtimeEvaluateReturn) | **POST** /commerce/rules/return/evaluate | Evaluate Return Eligibility |
| [**runtimeEvaluateSafetyStock**](RulesApi.md#runtimeEvaluateSafetyStock) | **POST** /commerce/rules/safetystock/evaluate | Evaluate Safety Stock Rules |


<a name="runtimeEvaluatePurchaseLimit"></a>
# **runtimeEvaluatePurchaseLimit**
> PurchaseLimitEvalResponseCollection runtimeEvaluatePurchaseLimit(responseFields, purchaseLimitEvalRequest)

Evaluate Purchase Limits

Evaluate the purchase limits for given products and customer.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RulesApi apiInstance = new RulesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PurchaseLimitEvalRequest purchaseLimitEvalRequest = new PurchaseLimitEvalRequest(); // PurchaseLimitEvalRequest | The request containing the products and customer to evaluate
    try {
      PurchaseLimitEvalResponseCollection result = apiInstance.runtimeEvaluatePurchaseLimit(responseFields, purchaseLimitEvalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#runtimeEvaluatePurchaseLimit");
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
| **purchaseLimitEvalRequest** | [**PurchaseLimitEvalRequest**](PurchaseLimitEvalRequest.md)| The request containing the products and customer to evaluate | [optional] |

### Return type

[**PurchaseLimitEvalResponseCollection**](PurchaseLimitEvalResponseCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="runtimeEvaluateReturn"></a>
# **runtimeEvaluateReturn**
> ReturnEvalResponseCollection runtimeEvaluateReturn(responseFields, returnEvalRequest)

Evaluate Return Eligibility

Evaluate the return eligibility for given products and customer

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RulesApi apiInstance = new RulesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ReturnEvalRequest returnEvalRequest = new ReturnEvalRequest(); // ReturnEvalRequest | The request containing the products and customer to evaluate
    try {
      ReturnEvalResponseCollection result = apiInstance.runtimeEvaluateReturn(responseFields, returnEvalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#runtimeEvaluateReturn");
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
| **returnEvalRequest** | [**ReturnEvalRequest**](ReturnEvalRequest.md)| The request containing the products and customer to evaluate | [optional] |

### Return type

[**ReturnEvalResponseCollection**](ReturnEvalResponseCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="runtimeEvaluateSafetyStock"></a>
# **runtimeEvaluateSafetyStock**
> List&lt;SafetyStockEvalResponse&gt; runtimeEvaluateSafetyStock(responseFields, safetyStockEvalRequest)

Evaluate Safety Stock Rules

Evaluate the safety stock for given products and locations

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RulesApi apiInstance = new RulesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<SafetyStockEvalRequest> safetyStockEvalRequest = Arrays.asList(); // List<SafetyStockEvalRequest> | The request containing the products and customer to evaluate
    try {
      List<SafetyStockEvalResponse> result = apiInstance.runtimeEvaluateSafetyStock(responseFields, safetyStockEvalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#runtimeEvaluateSafetyStock");
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
| **safetyStockEvalRequest** | [**List&lt;SafetyStockEvalRequest&gt;**](SafetyStockEvalRequest.md)| The request containing the products and customer to evaluate | [optional] |

### Return type

[**List&lt;SafetyStockEvalResponse&gt;**](SafetyStockEvalResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

