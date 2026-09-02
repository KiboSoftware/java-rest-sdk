# RedactionApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**executeRedaction**](RedactionApi.md#executeRedaction) | **POST** /platform/data/redaction/execute/{reportId} | Execute Redaction |
| [**generateRedactionReport**](RedactionApi.md#generateRedactionReport) | **POST** /platform/data/redaction/report | Generate Redaction Report |
| [**getRedactionReport**](RedactionApi.md#getRedactionReport) | **GET** /platform/data/redaction/report/{reportId} | Get Redaction Report |
| [**listRedactionReports**](RedactionApi.md#listRedactionReports) | **GET** /platform/data/redaction/report | List Redaction Reports |


<a name="executeRedaction"></a>
# **executeRedaction**
> RedactionReportResponse executeRedaction(reportId, responseFields)

Execute Redaction

Executes an approved draft redaction report. This action is irreversible — it permanently removes or overwrites all PII identified in the report. The report status changes from Draft to Executed and operationLog is populated. See the &lt;a href&#x3D;\&quot;/developer-guides/redaction-services\&quot;&gt;Redaction Services Developer Guide&lt;/a&gt; for the complete workflow and warnings.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.gdpr.ApiClient;
import com.kibocommerce.sdk.gdpr.ApiException;
import com.kibocommerce.sdk.gdpr.Configuration;
import com.kibocommerce.sdk.gdpr.auth.*;
import com.kibocommerce.sdk.gdpr.models.*;
import com.kibocommerce.sdk.gdpr.api.RedactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RedactionApi apiInstance = new RedactionApi(defaultClient);
    String reportId = "reportId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      RedactionReportResponse result = apiInstance.executeRedaction(reportId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedactionApi#executeRedaction");
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
| **reportId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**RedactionReportResponse**](RedactionReportResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="generateRedactionReport"></a>
# **generateRedactionReport**
> RedactionReportResponse generateRedactionReport(responseFields, createReportRequest)

Generate Redaction Report

Creates a draft redaction report by scanning tenant data for all PII associated with the specified data subject. No data is modified at this stage. Review the returned report before executing. See the &lt;a href&#x3D;\&quot;/developer-guides/redaction-services\&quot;&gt;Redaction Services Developer Guide&lt;/a&gt; for the complete two-phase workflow.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.gdpr.ApiClient;
import com.kibocommerce.sdk.gdpr.ApiException;
import com.kibocommerce.sdk.gdpr.Configuration;
import com.kibocommerce.sdk.gdpr.auth.*;
import com.kibocommerce.sdk.gdpr.models.*;
import com.kibocommerce.sdk.gdpr.api.RedactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RedactionApi apiInstance = new RedactionApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CreateReportRequest createReportRequest = new CreateReportRequest(); // CreateReportRequest | 
    try {
      RedactionReportResponse result = apiInstance.generateRedactionReport(responseFields, createReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedactionApi#generateRedactionReport");
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
| **createReportRequest** | [**CreateReportRequest**](CreateReportRequest.md)|  | [optional] |

### Return type

[**RedactionReportResponse**](RedactionReportResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getRedactionReport"></a>
# **getRedactionReport**
> RedactionReportResponse getRedactionReport(reportId, responseFields)

Get Redaction Report

Retrieves a single redaction report by ID. Returns the full report including affectedEntities and, after execution, the operationLog. Use this to review a draft before executing or to audit a completed redaction. See the &lt;a href&#x3D;\&quot;/developer-guides/redaction-services\&quot;&gt;Redaction Services Developer Guide&lt;/a&gt; for field descriptions.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.gdpr.ApiClient;
import com.kibocommerce.sdk.gdpr.ApiException;
import com.kibocommerce.sdk.gdpr.Configuration;
import com.kibocommerce.sdk.gdpr.auth.*;
import com.kibocommerce.sdk.gdpr.models.*;
import com.kibocommerce.sdk.gdpr.api.RedactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RedactionApi apiInstance = new RedactionApi(defaultClient);
    String reportId = "reportId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      RedactionReportResponse result = apiInstance.getRedactionReport(reportId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedactionApi#getRedactionReport");
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
| **reportId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**RedactionReportResponse**](RedactionReportResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listRedactionReports"></a>
# **listRedactionReports**
> RedactionReportSummaryListResponse listRedactionReports(status, page, pageSize, from, to, responseFields)

List Redaction Reports

Lists redaction reports for the tenant, with optional filtering by status (Draft or Executed) and date range. Returns summary objects without affectedEntities or operationLog; retrieve individual reports by ID for full details. See the &lt;a href&#x3D;\&quot;/developer-guides/redaction-services\&quot;&gt;Redaction Services Developer Guide&lt;/a&gt; for auditing guidance.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.gdpr.ApiClient;
import com.kibocommerce.sdk.gdpr.ApiException;
import com.kibocommerce.sdk.gdpr.Configuration;
import com.kibocommerce.sdk.gdpr.auth.*;
import com.kibocommerce.sdk.gdpr.models.*;
import com.kibocommerce.sdk.gdpr.api.RedactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RedactionApi apiInstance = new RedactionApi(defaultClient);
    String status = "status_example"; // String | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      RedactionReportSummaryListResponse result = apiInstance.listRedactionReports(status, page, pageSize, from, to, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedactionApi#listRedactionReports");
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
| **status** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **from** | **OffsetDateTime**|  | [optional] |
| **to** | **OffsetDateTime**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**RedactionReportSummaryListResponse**](RedactionReportSummaryListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

