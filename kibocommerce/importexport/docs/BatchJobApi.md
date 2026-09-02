# BatchJobApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBatchJob**](BatchJobApi.md#createBatchJob) | **POST** /platform/data/batchJob | Create Batch Job |
| [**deleteBatchJob**](BatchJobApi.md#deleteBatchJob) | **DELETE** /platform/data/batchJob/{code} | Delete Batch Job |
| [**getAvailableActions**](BatchJobApi.md#getAvailableActions) | **GET** /platform/data/batchJob/actions/{code} | Get Available Actions |
| [**getBatchJob**](BatchJobApi.md#getBatchJob) | **GET** /platform/data/batchJob/{code} | Get Batch Job |
| [**getBatchJobItem**](BatchJobApi.md#getBatchJobItem) | **POST** /platform/data/batchJob/actions/{code}/items/{correlationId} | Get Batch Job Item |
| [**getBatchJobItems**](BatchJobApi.md#getBatchJobItems) | **POST** /platform/data/batchJob/actions/{code}/items | Get Batch Job Items |
| [**getBatchJobs**](BatchJobApi.md#getBatchJobs) | **GET** /platform/data/batchJob | Get Batch Jobs |
| [**getBatchSummaryJob**](BatchJobApi.md#getBatchSummaryJob) | **GET** /platform/data/batchJob/actions/{code}/summary | Get Batch Job Summary |
| [**getBatchSummaryJobs**](BatchJobApi.md#getBatchSummaryJobs) | **GET** /platform/data/batchJob/actions/summaries | Get Batch Job Summaries |
| [**performBatchAction**](BatchJobApi.md#performBatchAction) | **POST** /platform/data/batchJob/actions/{code} | Perform Batch Action |
| [**updateBatchJob**](BatchJobApi.md#updateBatchJob) | **PUT** /platform/data/batchJob/{code} | Update Batch Job |


<a name="createBatchJob"></a>
# **createBatchJob**
> BatchJob createBatchJob(responseFields, batchJob)

Create Batch Job

Creates a new batch job

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.BatchJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BatchJobApi apiInstance = new BatchJobApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    BatchJob batchJob = new BatchJob(); // BatchJob | 
    try {
      BatchJob result = apiInstance.createBatchJob(responseFields, batchJob);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchJobApi#createBatchJob");
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
| **batchJob** | [**BatchJob**](BatchJob.md)|  | [optional] |

### Return type

[**BatchJob**](BatchJob.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteBatchJob"></a>
# **deleteBatchJob**
> BatchJob deleteBatchJob(code)

Delete Batch Job

Deletes an existing batch job

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.BatchJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BatchJobApi apiInstance = new BatchJobApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      BatchJob result = apiInstance.deleteBatchJob(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchJobApi#deleteBatchJob");
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
| **code** | **String**|  | |

### Return type

[**BatchJob**](BatchJob.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAvailableActions"></a>
# **getAvailableActions**
> List&lt;String&gt; getAvailableActions(code, responseFields)

Get Available Actions

Retrieves all available actions for the specified batch job

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.BatchJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BatchJobApi apiInstance = new BatchJobApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<String> result = apiInstance.getAvailableActions(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchJobApi#getAvailableActions");
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
| **code** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getBatchJob"></a>
# **getBatchJob**
> BatchJob getBatchJob(code, responseFields)

Get Batch Job

Retrieves information about a specific batch job

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.BatchJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BatchJobApi apiInstance = new BatchJobApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BatchJob result = apiInstance.getBatchJob(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchJobApi#getBatchJob");
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
| **code** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**BatchJob**](BatchJob.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getBatchJobItem"></a>
# **getBatchJobItem**
> BatchJobItemResultSet getBatchJobItem(code, correlationId, responseFields)

Get Batch Job Item

Retrieves a specific item in a batch job

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.BatchJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BatchJobApi apiInstance = new BatchJobApi(defaultClient);
    String code = "code_example"; // String | 
    String correlationId = "correlationId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BatchJobItemResultSet result = apiInstance.getBatchJobItem(code, correlationId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchJobApi#getBatchJobItem");
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
| **code** | **String**|  | |
| **correlationId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**BatchJobItemResultSet**](BatchJobItemResultSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getBatchJobItems"></a>
# **getBatchJobItems**
> BatchJobItemResultSet getBatchJobItems(code, pageSize, startIndex, includeCount, processingStatus, resourceType, responseFields)

Get Batch Job Items

Retrieve a list of all batch job items. Query for items of a specific processing status and/or resource by appending ?processingStatus&#x3D;{processingStatus}&amp;resourceType&#x3D;{resourceType}. Resource type can be Products, ProductProperty, or Pricelistentries.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.BatchJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BatchJobApi apiInstance = new BatchJobApi(defaultClient);
    String code = "code_example"; // String | 
    Integer pageSize = 56; // Integer | 
    Integer startIndex = 56; // Integer | 
    Boolean includeCount = true; // Boolean | 
    String processingStatus = "processingStatus_example"; // String | 
    String resourceType = "resourceType_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BatchJobItemResultSet result = apiInstance.getBatchJobItems(code, pageSize, startIndex, includeCount, processingStatus, resourceType, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchJobApi#getBatchJobItems");
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
| **code** | **String**|  | |
| **pageSize** | **Integer**|  | [optional] |
| **startIndex** | **Integer**|  | [optional] |
| **includeCount** | **Boolean**|  | [optional] |
| **processingStatus** | **String**|  | [optional] |
| **resourceType** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**BatchJobItemResultSet**](BatchJobItemResultSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getBatchJobs"></a>
# **getBatchJobs**
> BatchJobCollection getBatchJobs(domain, pageSize, startIndex, status, includeCount, responseFields)

Get Batch Jobs

Gets all batch jobs

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.BatchJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BatchJobApi apiInstance = new BatchJobApi(defaultClient);
    String domain = "domain_example"; // String | 
    Integer pageSize = 56; // Integer | 
    Integer startIndex = 56; // Integer | 
    String status = "status_example"; // String | 
    Boolean includeCount = true; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BatchJobCollection result = apiInstance.getBatchJobs(domain, pageSize, startIndex, status, includeCount, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchJobApi#getBatchJobs");
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
| **domain** | **String**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **startIndex** | **Integer**|  | [optional] |
| **status** | **String**|  | [optional] |
| **includeCount** | **Boolean**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**BatchJobCollection**](BatchJobCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getBatchSummaryJob"></a>
# **getBatchSummaryJob**
> BatchJobSummary getBatchSummaryJob(code, responseFields)

Get Batch Job Summary

Retrieves a batch job summary by its code

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.BatchJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BatchJobApi apiInstance = new BatchJobApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BatchJobSummary result = apiInstance.getBatchSummaryJob(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchJobApi#getBatchSummaryJob");
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
| **code** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**BatchJobSummary**](BatchJobSummary.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getBatchSummaryJobs"></a>
# **getBatchSummaryJobs**
> BatchJobSummaryCollection getBatchSummaryJobs(domain, pageSize, startIndex, status, includeCount, responseFields)

Get Batch Job Summaries

Retrieves a list of all batch job summaries

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.BatchJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BatchJobApi apiInstance = new BatchJobApi(defaultClient);
    String domain = "domain_example"; // String | 
    Integer pageSize = 56; // Integer | 
    Integer startIndex = 56; // Integer | 
    String status = "status_example"; // String | 
    Boolean includeCount = true; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BatchJobSummaryCollection result = apiInstance.getBatchSummaryJobs(domain, pageSize, startIndex, status, includeCount, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchJobApi#getBatchSummaryJobs");
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
| **domain** | **String**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **startIndex** | **Integer**|  | [optional] |
| **status** | **String**|  | [optional] |
| **includeCount** | **Boolean**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**BatchJobSummaryCollection**](BatchJobSummaryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="performBatchAction"></a>
# **performBatchAction**
> BatchJob performBatchAction(code, responseFields, batchJobAction)

Perform Batch Action

Performs an action on the specified batch job. Possible actions are start, cancel, and reset actions. Reset can only be called for jobs that are already completed or canceled, and will remove all items so that you can re-use the empty job.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.BatchJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BatchJobApi apiInstance = new BatchJobApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    BatchJobAction batchJobAction = new BatchJobAction(); // BatchJobAction | 
    try {
      BatchJob result = apiInstance.performBatchAction(code, responseFields, batchJobAction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchJobApi#performBatchAction");
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
| **code** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **batchJobAction** | [**BatchJobAction**](BatchJobAction.md)|  | [optional] |

### Return type

[**BatchJob**](BatchJob.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateBatchJob"></a>
# **updateBatchJob**
> BatchJob updateBatchJob(code, responseFields, batchJob)

Update Batch Job

Updates an existing batch job. Currently only allows you to change the name of a job.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.importexport.ApiClient;
import com.kibocommerce.sdk.importexport.ApiException;
import com.kibocommerce.sdk.importexport.Configuration;
import com.kibocommerce.sdk.importexport.auth.*;
import com.kibocommerce.sdk.importexport.models.*;
import com.kibocommerce.sdk.importexport.api.BatchJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BatchJobApi apiInstance = new BatchJobApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    BatchJob batchJob = new BatchJob(); // BatchJob | 
    try {
      BatchJob result = apiInstance.updateBatchJob(code, responseFields, batchJob);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchJobApi#updateBatchJob");
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
| **code** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **batchJob** | [**BatchJob**](BatchJob.md)|  | [optional] |

### Return type

[**BatchJob**](BatchJob.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

