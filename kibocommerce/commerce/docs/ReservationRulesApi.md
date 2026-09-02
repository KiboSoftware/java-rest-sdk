# ReservationRulesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRecordsByCallOffOrder**](ReservationRulesApi.md#getRecordsByCallOffOrder) | **GET** /commerce/jobs/reservation-rules/call-offs/{callOffOrderId}/runs | GET /call-offs/{callOffOrderId}/runs — every audit record that touched |
| [**getRecordsByRuleIdRecent**](ReservationRulesApi.md#getRecordsByRuleIdRecent) | **GET** /commerce/jobs/reservation-rules/rules/{ruleId}/recent | GET /rules/{ruleId}/recent — records for one rule within an optional |
| [**getRecordsByRunId**](ReservationRulesApi.md#getRecordsByRunId) | **GET** /commerce/jobs/reservation-rules/runs/{runId} | GET /runs/{runId} — every audit record produced by a single run, in |
| [**getRunSummaries**](ReservationRulesApi.md#getRunSummaries) | **GET** /commerce/jobs/reservation-rules/runs | GET /runs — per-run summaries (aggregated counts by outcome) within an |
| [**run**](ReservationRulesApi.md#run) | **POST** /commerce/jobs/reservation-rules/run | Triggers an on-demand Reservation Rules Engine run for the caller&#39;s |


<a name="getRecordsByCallOffOrder"></a>
# **getRecordsByCallOffOrder**
> ReservationRunHistoryRecordCollection getRecordsByCallOffOrder(callOffOrderId, pageSize, pageToken, responseFields)

GET /call-offs/{callOffOrderId}/runs — every audit record that touched

a given CallOffOrder, most recent first. Drives the order-detail \&quot;reservation history\&quot; panel.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReservationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationRulesApi apiInstance = new ReservationRulesApi(defaultClient);
    String callOffOrderId = "callOffOrderId_example"; // String | 
    Integer pageSize = 56; // Integer | 
    String pageToken = "pageToken_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReservationRunHistoryRecordCollection result = apiInstance.getRecordsByCallOffOrder(callOffOrderId, pageSize, pageToken, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationRulesApi#getRecordsByCallOffOrder");
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
| **pageSize** | **Integer**|  | [optional] |
| **pageToken** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ReservationRunHistoryRecordCollection**](ReservationRunHistoryRecordCollection.md)

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
> ReservationRunHistoryRecordCollection getRecordsByRuleIdRecent(ruleId, fromUtc, toUtc, pageSize, pageToken, responseFields)

GET /rules/{ruleId}/recent — records for one rule within an optional

date range, most recent first. Powers the rule-detail \&quot;recent runs\&quot; panel.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReservationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationRulesApi apiInstance = new ReservationRulesApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    OffsetDateTime fromUtc = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime toUtc = OffsetDateTime.now(); // OffsetDateTime | 
    Integer pageSize = 56; // Integer | 
    String pageToken = "pageToken_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReservationRunHistoryRecordCollection result = apiInstance.getRecordsByRuleIdRecent(ruleId, fromUtc, toUtc, pageSize, pageToken, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationRulesApi#getRecordsByRuleIdRecent");
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
| **pageSize** | **Integer**|  | [optional] |
| **pageToken** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ReservationRunHistoryRecordCollection**](ReservationRunHistoryRecordCollection.md)

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
> ReservationRunHistoryRecordCollection getRecordsByRunId(runId, pageSize, pageToken, responseFields)

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
import com.kibocommerce.sdk.commerce.api.ReservationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationRulesApi apiInstance = new ReservationRulesApi(defaultClient);
    String runId = "runId_example"; // String | 
    Integer pageSize = 56; // Integer | 
    String pageToken = "pageToken_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReservationRunHistoryRecordCollection result = apiInstance.getRecordsByRunId(runId, pageSize, pageToken, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationRulesApi#getRecordsByRunId");
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
| **pageSize** | **Integer**|  | [optional] |
| **pageToken** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ReservationRunHistoryRecordCollection**](ReservationRunHistoryRecordCollection.md)

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
> ReservationRunSummaryCollection getRunSummaries(fromUtc, toUtc, pageSize, pageToken, responseFields)

GET /runs — per-run summaries (aggregated counts by outcome) within an

optional date range; most-recent run first.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReservationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationRulesApi apiInstance = new ReservationRulesApi(defaultClient);
    OffsetDateTime fromUtc = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime toUtc = OffsetDateTime.now(); // OffsetDateTime | 
    Integer pageSize = 56; // Integer | 
    String pageToken = "pageToken_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReservationRunSummaryCollection result = apiInstance.getRunSummaries(fromUtc, toUtc, pageSize, pageToken, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationRulesApi#getRunSummaries");
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
| **pageSize** | **Integer**|  | [optional] |
| **pageToken** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ReservationRunSummaryCollection**](ReservationRunSummaryCollection.md)

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

Triggers an on-demand Reservation Rules Engine run for the caller&#39;s

{tenantId, siteId}.  Default behavior (&#x60;sync&#x3D;false&#x60;): publishes the same &#x60;ReservationRuleEngineStart&#x60; event the cron scheduler does, returns HTTP 202 + JobKey within ~200ms p95 (publish-and-return; no batch work in the request thread). Debug bypass (&#x60;?sync&#x3D;true&#x60;): SKIPS kibo.jobs + RabbitMQ + MassTransit consumer entirely. Executes the orchestrator inline on the request thread and returns HTTP 200 with the run&#39;s final state + elapsed milliseconds. Intended for local repro and integration smoke only — the request can hold the thread for the full duration of the run. Still subject to the per-{tenantId, siteId} single-writer lease, so a concurrent async run will SKIP this one.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ReservationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationRulesApi apiInstance = new ReservationRulesApi(defaultClient);
    Boolean sync = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.run(sync, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationRulesApi#run");
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

