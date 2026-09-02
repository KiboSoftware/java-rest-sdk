# HeadlessAppApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApplicationBuildJobs**](HeadlessAppApi.md#getApplicationBuildJobs) | **GET** /platform/appdev/headless-app/builds/{branchName} | Get Application Build Jobs |
| [**getApplicationBuildLog**](HeadlessAppApi.md#getApplicationBuildLog) | **GET** /platform/appdev/headless-app/builds/{branchName}/logs/{jobId} | Get Application Build Log |
| [**getRuntimeLogs**](HeadlessAppApi.md#getRuntimeLogs) | **GET** /platform/appdev/headless-app/logs/runtime | Get Runtime Logs |


<a name="getApplicationBuildJobs"></a>
# **getApplicationBuildJobs**
> HeadlessAppBuildJobResponse getApplicationBuildJobs(branchName, maxResults, nextToken, responseFields)

Get Application Build Jobs

Get the builds of a specific code branch for a Kibo Hosted Headless application.\\r\\nA Kibo site must be first linked to a headless hosted application before using this API.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.HeadlessAppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    HeadlessAppApi apiInstance = new HeadlessAppApi(defaultClient);
    String branchName = "branchName_example"; // String | The name of the branch to use for the request
    Integer maxResults = 20; // Integer | The maximum number of records to list in a single response. defaults to 20, maximum is 100
    String nextToken = "nextToken_example"; // String | A pagination token
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      HeadlessAppBuildJobResponse result = apiInstance.getApplicationBuildJobs(branchName, maxResults, nextToken, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HeadlessAppApi#getApplicationBuildJobs");
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
| **branchName** | **String**| The name of the branch to use for the request | |
| **maxResults** | **Integer**| The maximum number of records to list in a single response. defaults to 20, maximum is 100 | [optional] [default to 20] |
| **nextToken** | **String**| A pagination token | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**HeadlessAppBuildJobResponse**](HeadlessAppBuildJobResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getApplicationBuildLog"></a>
# **getApplicationBuildLog**
> HeadlessAppBuildLog getApplicationBuildLog(branchName, jobId, responseFields)

Get Application Build Log

Get the build logs of a specifc code branch and build for a Kibo Hosted Headless application.\\r\\nA Kibo site must be first linked to a headless hosted application before using this API.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.HeadlessAppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    HeadlessAppApi apiInstance = new HeadlessAppApi(defaultClient);
    String branchName = "branchName_example"; // String | The name of the branch to use for the request
    String jobId = "jobId_example"; // String | The Identifier of the build to retrieve logs for
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      HeadlessAppBuildLog result = apiInstance.getApplicationBuildLog(branchName, jobId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HeadlessAppApi#getApplicationBuildLog");
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
| **branchName** | **String**| The name of the branch to use for the request | |
| **jobId** | **String**| The Identifier of the build to retrieve logs for | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**HeadlessAppBuildLog**](HeadlessAppBuildLog.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getRuntimeLogs"></a>
# **getRuntimeLogs**
> HeadlessAppRuntimeLogResponse getRuntimeLogs(prefix, maxResults, nextToken, responseFields)

Get Runtime Logs

Get the runtime logs, as s3 objects, for a Kibo Hosted Headless application. A Kibo site must be first linked to a headless hosted application before using this API.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.HeadlessAppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    HeadlessAppApi apiInstance = new HeadlessAppApi(defaultClient);
    String prefix = "prefix_example"; // String | The optional date filter, in the format \"yyyy-mm-dd-hh\".             example usage:                 for year 2024, datePrefix=2024                 for first month of 2024, datePrefix=2024-01                 for first day, first month of 2024, datePrefix=2024-01-01
    Integer maxResults = 300; // Integer | The maximum number of records to list in a single response. defaults to 20, maximum is 100
    String nextToken = "nextToken_example"; // String | A pagination token
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      HeadlessAppRuntimeLogResponse result = apiInstance.getRuntimeLogs(prefix, maxResults, nextToken, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HeadlessAppApi#getRuntimeLogs");
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
| **prefix** | **String**| The optional date filter, in the format \&quot;yyyy-mm-dd-hh\&quot;.             example usage:                 for year 2024, datePrefix&#x3D;2024                 for first month of 2024, datePrefix&#x3D;2024-01                 for first day, first month of 2024, datePrefix&#x3D;2024-01-01 | [optional] |
| **maxResults** | **Integer**| The maximum number of records to list in a single response. defaults to 20, maximum is 100 | [optional] [default to 300] |
| **nextToken** | **String**| A pagination token | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**HeadlessAppRuntimeLogResponse**](HeadlessAppRuntimeLogResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

