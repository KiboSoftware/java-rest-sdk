# PickWaveRuleEvaluateApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**evaluatePickWaveRule**](PickWaveRuleEvaluateApi.md#evaluatePickWaveRule) | **POST** /commerce/rules/pickwave/evaluate | Evaluate Pick Wave Rules |


<a name="evaluatePickWaveRule"></a>
# **evaluatePickWaveRule**
> PickWaveEvalResponseCollection evaluatePickWaveRule(responseFields, pickWaveEvalRequest)

Evaluate Pick Wave Rules

Evaluate the &lt;a href&#x3D;\&quot;/pages/pick-wave-rules\&quot;&gt;pick wave rules&lt;/a&gt; for given products and shipment rules

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PickWaveRuleEvaluateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PickWaveRuleEvaluateApi apiInstance = new PickWaveRuleEvaluateApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PickWaveEvalRequest pickWaveEvalRequest = new PickWaveEvalRequest(); // PickWaveEvalRequest | The request containing the products and shipment rules to evaluate
    try {
      PickWaveEvalResponseCollection result = apiInstance.evaluatePickWaveRule(responseFields, pickWaveEvalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveRuleEvaluateApi#evaluatePickWaveRule");
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
| **pickWaveEvalRequest** | [**PickWaveEvalRequest**](PickWaveEvalRequest.md)| The request containing the products and shipment rules to evaluate | [optional] |

### Return type

[**PickWaveEvalResponseCollection**](PickWaveEvalResponseCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

