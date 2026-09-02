# WorkflowProcessApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDefinitionImage**](WorkflowProcessApi.md#getDefinitionImage) | **GET** /commerce/processes/definitionImage/{containerIdOrAlias}/{processId} | Get Process Definition Image |
| [**getWorkflowProcess**](WorkflowProcessApi.md#getWorkflowProcess) | **GET** /commerce/processes/definitions/{containerIdOrAlias}/{processId} | Get Process Definition |
| [**getWorkflowProcessByShipmentType**](WorkflowProcessApi.md#getWorkflowProcessByShipmentType) | **GET** /commerce/processes/shipmentType/{shipmentType} | getWorkflowProcessByShipmentType |
| [**getWorkflowProcessByShipmentTypeLocationCode**](WorkflowProcessApi.md#getWorkflowProcessByShipmentTypeLocationCode) | **GET** /commerce/processes/shipmentType/{shipmentType}/location/{locationCode} | getWorkflowProcessByShipmentTypeLocationCode |
| [**getWorkflowProcessByShipmentTypeLocationGroupCode**](WorkflowProcessApi.md#getWorkflowProcessByShipmentTypeLocationGroupCode) | **GET** /commerce/processes/shipmentType/{shipmentType}/locationGroup/{locationGroupCode} | getWorkflowProcessByShipmentTypeLocationGroupCode |
| [**getWorkflowProcesses**](WorkflowProcessApi.md#getWorkflowProcesses) | **GET** /commerce/processes/definitions | Get Process Definitions |


<a name="getDefinitionImage"></a>
# **getDefinitionImage**
> String getDefinitionImage(containerIdOrAlias, processId)

Get Process Definition Image

Get a process definition image.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.WorkflowProcessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    WorkflowProcessApi apiInstance = new WorkflowProcessApi(defaultClient);
    String containerIdOrAlias = "containerIdOrAlias_example"; // String | containerIdOrAlias
    String processId = "processId_example"; // String | processId
    try {
      String result = apiInstance.getDefinitionImage(containerIdOrAlias, processId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowProcessApi#getDefinitionImage");
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
| **containerIdOrAlias** | **String**| containerIdOrAlias | |
| **processId** | **String**| processId | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/svg+xml, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getWorkflowProcess"></a>
# **getWorkflowProcess**
> EntityModelOfWorkflowProcess getWorkflowProcess(containerIdOrAlias, processId)

Get Process Definition

Get a specific process definition by ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.WorkflowProcessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    WorkflowProcessApi apiInstance = new WorkflowProcessApi(defaultClient);
    String containerIdOrAlias = "containerIdOrAlias_example"; // String | containerIdOrAlias
    String processId = "processId_example"; // String | processId
    try {
      EntityModelOfWorkflowProcess result = apiInstance.getWorkflowProcess(containerIdOrAlias, processId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowProcessApi#getWorkflowProcess");
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
| **containerIdOrAlias** | **String**| containerIdOrAlias | |
| **processId** | **String**| processId | |

### Return type

[**EntityModelOfWorkflowProcess**](EntityModelOfWorkflowProcess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getWorkflowProcessByShipmentType"></a>
# **getWorkflowProcessByShipmentType**
> EntityModelOfWorkflowProcess getWorkflowProcessByShipmentType(shipmentType)

getWorkflowProcessByShipmentType

Get workflow process details by shipment type.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.WorkflowProcessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    WorkflowProcessApi apiInstance = new WorkflowProcessApi(defaultClient);
    String shipmentType = "shipmentType_example"; // String | shipmentType
    try {
      EntityModelOfWorkflowProcess result = apiInstance.getWorkflowProcessByShipmentType(shipmentType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowProcessApi#getWorkflowProcessByShipmentType");
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
| **shipmentType** | **String**| shipmentType | |

### Return type

[**EntityModelOfWorkflowProcess**](EntityModelOfWorkflowProcess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getWorkflowProcessByShipmentTypeLocationCode"></a>
# **getWorkflowProcessByShipmentTypeLocationCode**
> EntityModelOfWorkflowProcess getWorkflowProcessByShipmentTypeLocationCode(locationCode, shipmentType)

getWorkflowProcessByShipmentTypeLocationCode

Get workflow process details by shipment type and location code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.WorkflowProcessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    WorkflowProcessApi apiInstance = new WorkflowProcessApi(defaultClient);
    String locationCode = "locationCode_example"; // String | locationCode
    String shipmentType = "shipmentType_example"; // String | shipmentType
    try {
      EntityModelOfWorkflowProcess result = apiInstance.getWorkflowProcessByShipmentTypeLocationCode(locationCode, shipmentType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowProcessApi#getWorkflowProcessByShipmentTypeLocationCode");
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
| **locationCode** | **String**| locationCode | |
| **shipmentType** | **String**| shipmentType | |

### Return type

[**EntityModelOfWorkflowProcess**](EntityModelOfWorkflowProcess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getWorkflowProcessByShipmentTypeLocationGroupCode"></a>
# **getWorkflowProcessByShipmentTypeLocationGroupCode**
> EntityModelOfWorkflowProcess getWorkflowProcessByShipmentTypeLocationGroupCode(locationGroupCode, shipmentType)

getWorkflowProcessByShipmentTypeLocationGroupCode

Get workflow process details by shipment type and location group code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.WorkflowProcessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    WorkflowProcessApi apiInstance = new WorkflowProcessApi(defaultClient);
    String locationGroupCode = "locationGroupCode_example"; // String | locationGroupCode
    String shipmentType = "shipmentType_example"; // String | shipmentType
    try {
      EntityModelOfWorkflowProcess result = apiInstance.getWorkflowProcessByShipmentTypeLocationGroupCode(locationGroupCode, shipmentType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowProcessApi#getWorkflowProcessByShipmentTypeLocationGroupCode");
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
| **locationGroupCode** | **String**| locationGroupCode | |
| **shipmentType** | **String**| shipmentType | |

### Return type

[**EntityModelOfWorkflowProcess**](EntityModelOfWorkflowProcess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getWorkflowProcesses"></a>
# **getWorkflowProcesses**
> PagedModelOfEntityModelOfWorkflowProcess getWorkflowProcesses(page, pageSize, sort)

Get Process Definitions

Get a list of process definitions.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.WorkflowProcessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    WorkflowProcessApi apiInstance = new WorkflowProcessApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String sort = "sort_example"; // String | 
    try {
      PagedModelOfEntityModelOfWorkflowProcess result = apiInstance.getWorkflowProcesses(page, pageSize, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowProcessApi#getWorkflowProcesses");
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
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **sort** | **String**|  | [optional] |

### Return type

[**PagedModelOfEntityModelOfWorkflowProcess**](PagedModelOfEntityModelOfWorkflowProcess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

