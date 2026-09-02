# ReleaseRulesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRecordsByCallOffOrder**](ReleaseRulesApi.md#getRecordsByCallOffOrder) | **GET** /commerce/jobs/release-rules/call-offs/{callOffOrderId}/runs | GET /call-offs/{callOffOrderId}/runs — every audit record that touched |
| [**getRecordsByRuleIdRecent**](ReleaseRulesApi.md#getRecordsByRuleIdRecent) | **GET** /commerce/jobs/release-rules/rules/{ruleId}/recent | GET /rules/{ruleId}/recent — records for one rule within an optional |
| [**getRecordsByRunId**](ReleaseRulesApi.md#getRecordsByRunId) | **GET** /commerce/jobs/release-rules/runs/{runId} | GET /runs/{runId} — every audit record produced by a single run, in |
| [**getRunSummaries**](ReleaseRulesApi.md#getRunSummaries) | **GET** /commerce/jobs/release-rules/runs | GET /runs — per-run summaries (aggregated outcome counts) within an |
| [**run**](ReleaseRulesApi.md#run) | **POST** /commerce/jobs/release-rules/run | Triggers an on-demand Release Rules Engine run for the caller&#39;s |


<a name="getRecordsByCallOffOrder"></a>
# **getRecordsByCallOffOrder**
> ReleaseRunHistoryRecordCollection getRecordsByCallOffOrder(callOffOrderId, startIndex, pageSize, filter, sortBy, responseFields)

GET /call-offs/{callOffOrderId}/runs — every audit record that touched

a given CallOffOrder, most recent first.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReleaseRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReleaseRulesApi apiInstance = new ReleaseRulesApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 56; // Integer | 
    String filter = "filter_example"; // String | 
    String sortBy = "sortBy_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReleaseRunHistoryRecordCollection result = apiInstance.getRecordsByCallOffOrder(callOffOrderId, startIndex, pageSize, filter, sortBy, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseRulesApi#getRecordsByCallOffOrder");
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
| **callOffOrderId** | **String**|  | |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ReleaseRunHistoryRecordCollection**](ReleaseRunHistoryRecordCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getRecordsByRuleIdRecent"></a>
# **getRecordsByRuleIdRecent**
> ReleaseRunHistoryRecordCollection getRecordsByRuleIdRecent(ruleId, fromUtc, toUtc, startIndex, pageSize, filter, sortBy, responseFields)

GET /rules/{ruleId}/recent — records for one rule within an optional

date range, most recent first.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReleaseRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReleaseRulesApi apiInstance = new ReleaseRulesApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    OffsetDateTime fromUtc = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime toUtc = OffsetDateTime.now(); // OffsetDateTime | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 56; // Integer | 
    String filter = "filter_example"; // String | 
    String sortBy = "sortBy_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReleaseRunHistoryRecordCollection result = apiInstance.getRecordsByRuleIdRecent(ruleId, fromUtc, toUtc, startIndex, pageSize, filter, sortBy, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseRulesApi#getRecordsByRuleIdRecent");
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
| **ruleId** | **String**|  | |
| **fromUtc** | **OffsetDateTime**|  | [optional] |
| **toUtc** | **OffsetDateTime**|  | [optional] |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ReleaseRunHistoryRecordCollection**](ReleaseRunHistoryRecordCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getRecordsByRunId"></a>
# **getRecordsByRunId**
> ReleaseRunHistoryRecordCollection getRecordsByRunId(runId, startIndex, pageSize, filter, sortBy, responseFields)

GET /runs/{runId} — every audit record produced by a single run, in

chronological order. Drill-down from the runs list.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReleaseRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReleaseRulesApi apiInstance = new ReleaseRulesApi(defaultClient);
    String runId = "runId_example"; // String | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 56; // Integer | 
    String filter = "filter_example"; // String | 
    String sortBy = "sortBy_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReleaseRunHistoryRecordCollection result = apiInstance.getRecordsByRunId(runId, startIndex, pageSize, filter, sortBy, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseRulesApi#getRecordsByRunId");
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
| **runId** | **String**|  | |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ReleaseRunHistoryRecordCollection**](ReleaseRunHistoryRecordCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getRunSummaries"></a>
# **getRunSummaries**
> ReleaseRunSummaryCollection getRunSummaries(fromUtc, toUtc, startIndex, pageSize, filter, sortBy, responseFields)

GET /runs — per-run summaries (aggregated outcome counts) within an

optional date range; most-recent run first.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReleaseRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReleaseRulesApi apiInstance = new ReleaseRulesApi(defaultClient);
    OffsetDateTime fromUtc = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime toUtc = OffsetDateTime.now(); // OffsetDateTime | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 56; // Integer | 
    String filter = "filter_example"; // String | 
    String sortBy = "sortBy_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReleaseRunSummaryCollection result = apiInstance.getRunSummaries(fromUtc, toUtc, startIndex, pageSize, filter, sortBy, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseRulesApi#getRunSummaries");
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
| **fromUtc** | **OffsetDateTime**|  | [optional] |
| **toUtc** | **OffsetDateTime**|  | [optional] |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ReleaseRunSummaryCollection**](ReleaseRunSummaryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="run"></a>
# **run**
> run(sync, responseFields)

Triggers an on-demand Release Rules Engine run for the caller&#39;s

{tenantId, siteId}.  Default behavior (&#x60;sync&#x3D;false&#x60;): publishes the same &#x60;ReleaseRuleEngineStart&#x60; event the cron scheduler does, returns HTTP 202 + JobKey within ~200ms p95. Debug bypass (&#x60;?sync&#x3D;true&#x60;): SKIPS kibo.jobs + RabbitMQ + MassTransit consumer entirely. Executes the orchestrator inline.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReleaseRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReleaseRulesApi apiInstance = new ReleaseRulesApi(defaultClient);
    Boolean sync = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.run(sync, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseRulesApi#run");
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
| **sync** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

