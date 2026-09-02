# InventoryJobApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAllOldInventory**](InventoryJobApi.md#deleteAllOldInventory) | **DELETE** /commerce/inventory/v1/deleteOldInventory/allSilo/{months} | Delete All Old Inventory |
| [**deleteOldInventory**](InventoryJobApi.md#deleteOldInventory) | **DELETE** /commerce/inventory/v1/deleteOldInventory/{months} | Delete Old Inventory |
| [**getJob**](InventoryJobApi.md#getJob) | **GET** /commerce/inventory/v1/queue/{jobID} | Get Job |
| [**getJobs**](InventoryJobApi.md#getJobs) | **GET** /commerce/inventory/v1/queue | Get Jobs |


<a name="deleteAllOldInventory"></a>
# **deleteAllOldInventory**
> List&lt;JobIDResponse&gt; deleteAllOldInventory(months)

Delete All Old Inventory

Deletes older records from inventory table of all silos

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryJobApi apiInstance = new InventoryJobApi(defaultClient);
    Integer months = 56; // Integer | The x months before which we want the records to get deleted
    try {
      List<JobIDResponse> result = apiInstance.deleteAllOldInventory(months);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryJobApi#deleteAllOldInventory");
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
| **months** | **Integer**| The x months before which we want the records to get deleted | |

### Return type

[**List&lt;JobIDResponse&gt;**](JobIDResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="deleteOldInventory"></a>
# **deleteOldInventory**
> JobIDResponse deleteOldInventory(months)

Delete Old Inventory

Deletes older records from inventory table

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryJobApi apiInstance = new InventoryJobApi(defaultClient);
    Integer months = 56; // Integer | The x months before which we want the records to get deleted
    try {
      JobIDResponse result = apiInstance.deleteOldInventory(months);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryJobApi#deleteOldInventory");
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
| **months** | **Integer**| The x months before which we want the records to get deleted | |

### Return type

[**JobIDResponse**](JobIDResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="getJob"></a>
# **getJob**
> JobQueueResponse getJob(jobID)

Get Job

Get the specified inventory job. Use this call to monitor the status of inventory upload, refresh, adjust, or deletion jobs. Once you have a job ID — returned by endpoints such as Delete Inventory, Delete Items, Refresh Inventory, or Adjust Inventory — continue polling this endpoint until the job reaches a terminal status (&#x60;SUCCESS&#x60; or &#x60;FAILED&#x60;). For polling patterns and monitoring guidance during bulk inventory deletions, see the &lt;a href&#x3D;\&quot;/pages/bulk-inventory-deletion\&quot;&gt;Bulk Inventory Deletion guide&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryJobApi apiInstance = new InventoryJobApi(defaultClient);
    Long jobID = 56L; // Long | Id of bin to get
    try {
      JobQueueResponse result = apiInstance.getJob(jobID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryJobApi#getJob");
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
| **jobID** | **Long**| Id of bin to get | |

### Return type

[**JobQueueResponse**](JobQueueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Job Not Found |  -  |

<a name="getJobs"></a>
# **getJobs**
> List&lt;JobQueueResponse&gt; getJobs(locationCode, limit, owner, types, originalFilename)

Get Jobs

Get the requested jobs.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryJobApi apiInstance = new InventoryJobApi(defaultClient);
    String locationCode = "locationCode_example"; // String | Tenant specified unique Identifier of the owning location
    Integer limit = 56; // Integer | The maximum number of results to return, defaults to 100 for most
    String owner = "owner_example"; // String | User that owns the job
    List<String> types = Arrays.asList(); // List<String> | Type of the Job Queue Request
    String originalFilename = "originalFilename_example"; // String | The full name of the file that was picked up at the secure droppoint server before being split up by location.
    try {
      List<JobQueueResponse> result = apiInstance.getJobs(locationCode, limit, owner, types, originalFilename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryJobApi#getJobs");
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
| **locationCode** | **String**| Tenant specified unique Identifier of the owning location | [optional] |
| **limit** | **Integer**| The maximum number of results to return, defaults to 100 for most | [optional] |
| **owner** | **String**| User that owns the job | [optional] |
| **types** | [**List&lt;String&gt;**](String.md)| Type of the Job Queue Request | [optional] [enum: REFRESH, ADJUST, RELEASE_SHIPMENTS, CREATE_PICK_WAVE, CLOSE_PICK_WAVE, PUT_AWAY_FILE, SHORT_PICK_ERROR, BIN_AUDIT_START, BIN_AUDIT_COMPLETION, CREATE_BIN_AUDIT, RELEASE_PENDING_ITEMS] |
| **originalFilename** | **String**| The full name of the file that was picked up at the secure droppoint server before being split up by location. | [optional] |

### Return type

[**List&lt;JobQueueResponse&gt;**](JobQueueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Job Not Found |  -  |

