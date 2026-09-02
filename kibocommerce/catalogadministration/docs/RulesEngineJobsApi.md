# RulesEngineJobsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createJob**](RulesEngineJobsApi.md#createJob) | **POST** /commerce/rules/jobs | Create rules engine job |


<a name="createJob"></a>
# **createJob**
> RulesEngineJobCreateResponse createJob(responseFields, rulesEngineJobCreateRequest)

Create rules engine job

Creates a new rules engine job, updates matching MZDB event statuses, and enqueues a RulesEngineJobCreatedEvent for publication. Publication is fire-and-forget via the internal message bus — a 201 response confirms the job was created and events were updated, but does not guarantee consumers have received the event. StampedCount reflects the number of events modified; SkippedCount reflects events that matched but were already in the target status.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.RulesEngineJobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RulesEngineJobsApi apiInstance = new RulesEngineJobsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    RulesEngineJobCreateRequest rulesEngineJobCreateRequest = new RulesEngineJobCreateRequest(); // RulesEngineJobCreateRequest | 
    try {
      RulesEngineJobCreateResponse result = apiInstance.createJob(responseFields, rulesEngineJobCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesEngineJobsApi#createJob");
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
| **rulesEngineJobCreateRequest** | [**RulesEngineJobCreateRequest**](RulesEngineJobCreateRequest.md)|  | [optional] |

### Return type

[**RulesEngineJobCreateResponse**](RulesEngineJobCreateResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

