# FulfillmentWorkflowApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDefinitionImageUsingGET**](FulfillmentWorkflowApi.md#getDefinitionImageUsingGET) | **GET** /commerce/processes/definitionImage/{containerIdOrAlias}/{processId} | Get Definition Image |
| [**getWorkflowProcessByShipmentTypeLocationCodeUsingGET**](FulfillmentWorkflowApi.md#getWorkflowProcessByShipmentTypeLocationCodeUsingGET) | **GET** /commerce/processes/shipmentType/{shipmentType}/location/{locationCode} | Get Workflow Process by Shipment Type and Location Code |
| [**getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET**](FulfillmentWorkflowApi.md#getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET) | **GET** /commerce/processes/shipmentType/{shipmentType}/locationGroup/{locationGroupCode} | Get Workflow Process by Shipment Type and Location Group Code |
| [**getWorkflowProcessByShipmentTypeUsingGET**](FulfillmentWorkflowApi.md#getWorkflowProcessByShipmentTypeUsingGET) | **GET** /commerce/processes/shipmentType/{shipmentType} | Get Workflow Process by Shipment Type |
| [**getWorkflowProcessUsingGET**](FulfillmentWorkflowApi.md#getWorkflowProcessUsingGET) | **GET** /commerce/processes/definitions/{containerIdOrAlias}/{processId} | Get Workflow Process |
| [**getWorkflowProcessesUsingGET**](FulfillmentWorkflowApi.md#getWorkflowProcessesUsingGET) | **GET** /commerce/processes/definitions | Get Workflow Processes |


<a name="getDefinitionImageUsingGET"></a>
# **getDefinitionImageUsingGET**
> String getDefinitionImageUsingGET(containerIdOrAlias, processId)

Get Definition Image

Get Definition Image

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.FulfillmentWorkflowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    FulfillmentWorkflowApi apiInstance = new FulfillmentWorkflowApi(defaultClient);
    String containerIdOrAlias = "containerIdOrAlias_example"; // String | containerIdOrAlias
    String processId = "processId_example"; // String | processId
    try {
      String result = apiInstance.getDefinitionImageUsingGET(containerIdOrAlias, processId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentWorkflowApi#getDefinitionImageUsingGET");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

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

<a name="getWorkflowProcessByShipmentTypeLocationCodeUsingGET"></a>
# **getWorkflowProcessByShipmentTypeLocationCodeUsingGET**
> EntityModelOfWorkflowProcess getWorkflowProcessByShipmentTypeLocationCodeUsingGET(shipmentType, locationCode)

Get Workflow Process by Shipment Type and Location Code

Get Workflow Process by Shipment Type and Location Code

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.FulfillmentWorkflowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    FulfillmentWorkflowApi apiInstance = new FulfillmentWorkflowApi(defaultClient);
    String shipmentType = "shipmentType_example"; // String | shipmentType
    String locationCode = "locationCode_example"; // String | locationCode
    try {
      EntityModelOfWorkflowProcess result = apiInstance.getWorkflowProcessByShipmentTypeLocationCodeUsingGET(shipmentType, locationCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentWorkflowApi#getWorkflowProcessByShipmentTypeLocationCodeUsingGET");
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
| **locationCode** | **String**| locationCode | |

### Return type

[**EntityModelOfWorkflowProcess**](EntityModelOfWorkflowProcess.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET"></a>
# **getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET**
> EntityModelOfWorkflowProcess getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET(shipmentType, locationGroupCode)

Get Workflow Process by Shipment Type and Location Group Code

Get Workflow Process by Shipment Type and Location Group Code

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.FulfillmentWorkflowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    FulfillmentWorkflowApi apiInstance = new FulfillmentWorkflowApi(defaultClient);
    String shipmentType = "shipmentType_example"; // String | shipmentType
    String locationGroupCode = "locationGroupCode_example"; // String | locationGroupCode
    try {
      EntityModelOfWorkflowProcess result = apiInstance.getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET(shipmentType, locationGroupCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentWorkflowApi#getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET");
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
| **locationGroupCode** | **String**| locationGroupCode | |

### Return type

[**EntityModelOfWorkflowProcess**](EntityModelOfWorkflowProcess.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getWorkflowProcessByShipmentTypeUsingGET"></a>
# **getWorkflowProcessByShipmentTypeUsingGET**
> EntityModelOfWorkflowProcess getWorkflowProcessByShipmentTypeUsingGET(shipmentType)

Get Workflow Process by Shipment Type

Get Workflow Process by Shipment Type

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.FulfillmentWorkflowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    FulfillmentWorkflowApi apiInstance = new FulfillmentWorkflowApi(defaultClient);
    String shipmentType = "shipmentType_example"; // String | shipmentType
    try {
      EntityModelOfWorkflowProcess result = apiInstance.getWorkflowProcessByShipmentTypeUsingGET(shipmentType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentWorkflowApi#getWorkflowProcessByShipmentTypeUsingGET");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getWorkflowProcessUsingGET"></a>
# **getWorkflowProcessUsingGET**
> EntityModelOfWorkflowProcess getWorkflowProcessUsingGET(containerIdOrAlias, processId)

Get Workflow Process

Get Workflow Process

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.FulfillmentWorkflowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    FulfillmentWorkflowApi apiInstance = new FulfillmentWorkflowApi(defaultClient);
    String containerIdOrAlias = "containerIdOrAlias_example"; // String | containerIdOrAlias
    String processId = "processId_example"; // String | processId
    try {
      EntityModelOfWorkflowProcess result = apiInstance.getWorkflowProcessUsingGET(containerIdOrAlias, processId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentWorkflowApi#getWorkflowProcessUsingGET");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getWorkflowProcessesUsingGET"></a>
# **getWorkflowProcessesUsingGET**
> PagedModelOfEntityModelOfWorkflowProcess getWorkflowProcessesUsingGET(page, pageSize, sort)

Get Workflow Processes

Get Workflow Processes

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.FulfillmentWorkflowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    FulfillmentWorkflowApi apiInstance = new FulfillmentWorkflowApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String sort = "sort_example"; // String | 
    try {
      PagedModelOfEntityModelOfWorkflowProcess result = apiInstance.getWorkflowProcessesUsingGET(page, pageSize, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentWorkflowApi#getWorkflowProcessesUsingGET");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

