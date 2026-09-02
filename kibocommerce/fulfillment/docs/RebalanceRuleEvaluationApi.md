# RebalanceRuleEvaluationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**evaluateBackorderRebalancing**](RebalanceRuleEvaluationApi.md#evaluateBackorderRebalancing) | **POST** /commerce/rebalance/evaluate/backorder | evaluateBackorderRebalancing |
| [**evaluateFutureRebalancing**](RebalanceRuleEvaluationApi.md#evaluateFutureRebalancing) | **POST** /commerce/rebalance/evaluate/future | evaluateFutureRebalancing |


<a name="evaluateBackorderRebalancing"></a>
# **evaluateBackorderRebalancing**
> Object evaluateBackorderRebalancing(tenantId, xVolTenant, xVolSite)

evaluateBackorderRebalancing

evaluateBackorderRebalancing

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalanceRuleEvaluationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalanceRuleEvaluationApi apiInstance = new RebalanceRuleEvaluationApi(defaultClient);
    Integer tenantId = 56; // Integer | tenantId
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      Object result = apiInstance.evaluateBackorderRebalancing(tenantId, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalanceRuleEvaluationApi#evaluateBackorderRebalancing");
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
| **tenantId** | **Integer**| tenantId | |
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="evaluateFutureRebalancing"></a>
# **evaluateFutureRebalancing**
> Object evaluateFutureRebalancing(tenantId, xVolTenant, xVolSite)

evaluateFutureRebalancing

evaluateFutureRebalancing

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RebalanceRuleEvaluationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RebalanceRuleEvaluationApi apiInstance = new RebalanceRuleEvaluationApi(defaultClient);
    Integer tenantId = 56; // Integer | tenantId
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      Object result = apiInstance.evaluateFutureRebalancing(tenantId, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebalanceRuleEvaluationApi#evaluateFutureRebalancing");
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
| **tenantId** | **Integer**| tenantId | |
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

