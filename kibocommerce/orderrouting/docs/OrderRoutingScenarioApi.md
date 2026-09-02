# OrderRoutingScenarioApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createScenario**](OrderRoutingScenarioApi.md#createScenario) | **POST** /commerce/orders/orderrouting/api/v1/strategies/{strategyID}/scenarios | Create Scenario |
| [**deleteScenario**](OrderRoutingScenarioApi.md#deleteScenario) | **DELETE** /commerce/orders/orderrouting/api/v1/strategies/{strategyID}/scenarios/{scenarioID} | Delete Scenario |
| [**exportScenariosToCsv**](OrderRoutingScenarioApi.md#exportScenariosToCsv) | **GET** /commerce/orders/orderrouting/api/v1/strategies/{strategyID}/scenarios/export/csv | Export Scenarios To Csv |
| [**getScenarioById**](OrderRoutingScenarioApi.md#getScenarioById) | **GET** /commerce/orders/orderrouting/api/v1/strategies/{strategyID}/scenarios/{scenarioID} | Get Scenario By Id |
| [**importScenariosFromCsv**](OrderRoutingScenarioApi.md#importScenariosFromCsv) | **POST** /commerce/orders/orderrouting/api/v1/strategies/{strategyID}/scenarios/import/csv | Import Scenarios From Csv |
| [**updateScenario**](OrderRoutingScenarioApi.md#updateScenario) | **PUT** /commerce/orders/orderrouting/api/v1/strategies/{strategyID}/scenarios/{scenarioID} | Update Scenario |


<a name="createScenario"></a>
# **createScenario**
> ScenarioResponse createScenario(xVolTenant, xVolSite, strategyID, upsertScenarioRequest)

Create Scenario

Create Scenario

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingScenarioApi apiInstance = new OrderRoutingScenarioApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    String strategyID = "strategyID_example"; // String | 
    UpsertScenarioRequest upsertScenarioRequest = new UpsertScenarioRequest(); // UpsertScenarioRequest | 
    try {
      ScenarioResponse result = apiInstance.createScenario(xVolTenant, xVolSite, strategyID, upsertScenarioRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingScenarioApi#createScenario");
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
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | |
| **strategyID** | **String**|  | |
| **upsertScenarioRequest** | [**UpsertScenarioRequest**](UpsertScenarioRequest.md)|  | |

### Return type

[**ScenarioResponse**](ScenarioResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="deleteScenario"></a>
# **deleteScenario**
> deleteScenario(xVolTenant, xVolSite, strategyID, scenarioID)

Delete Scenario

Delete Scenario

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingScenarioApi apiInstance = new OrderRoutingScenarioApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    String strategyID = "strategyID_example"; // String | 
    Integer scenarioID = 56; // Integer | 
    try {
      apiInstance.deleteScenario(xVolTenant, xVolSite, strategyID, scenarioID);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingScenarioApi#deleteScenario");
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
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | |
| **strategyID** | **String**|  | |
| **scenarioID** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="exportScenariosToCsv"></a>
# **exportScenariosToCsv**
> List&lt;byte[]&gt; exportScenariosToCsv(xVolTenant, xVolSite, strategyID)

Export Scenarios To Csv

Export Scenarios To Csv

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingScenarioApi apiInstance = new OrderRoutingScenarioApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    String strategyID = "strategyID_example"; // String | 
    try {
      List<byte[]> result = apiInstance.exportScenariosToCsv(xVolTenant, xVolSite, strategyID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingScenarioApi#exportScenariosToCsv");
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
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | |
| **strategyID** | **String**|  | |

### Return type

**List&lt;byte[]&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="getScenarioById"></a>
# **getScenarioById**
> ScenarioResponse getScenarioById(xVolTenant, xVolSite, strategyID, scenarioID)

Get Scenario By Id

Get Scenario By Id

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingScenarioApi apiInstance = new OrderRoutingScenarioApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    String strategyID = "strategyID_example"; // String | 
    Integer scenarioID = 56; // Integer | 
    try {
      ScenarioResponse result = apiInstance.getScenarioById(xVolTenant, xVolSite, strategyID, scenarioID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingScenarioApi#getScenarioById");
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
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | |
| **strategyID** | **String**|  | |
| **scenarioID** | **Integer**|  | |

### Return type

[**ScenarioResponse**](ScenarioResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="importScenariosFromCsv"></a>
# **importScenariosFromCsv**
> Object importScenariosFromCsv(xVolTenant, xVolSite, strategyID, _file, failOnUnknownLocation)

Import Scenarios From Csv

Import Scenarios From Csv

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingScenarioApi apiInstance = new OrderRoutingScenarioApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    String strategyID = "strategyID_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    Boolean failOnUnknownLocation = false; // Boolean | 
    try {
      Object result = apiInstance.importScenariosFromCsv(xVolTenant, xVolSite, strategyID, _file, failOnUnknownLocation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingScenarioApi#importScenariosFromCsv");
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
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | |
| **strategyID** | **String**|  | |
| **_file** | **File**|  | |
| **failOnUnknownLocation** | **Boolean**|  | [optional] [default to false] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="updateScenario"></a>
# **updateScenario**
> ScenarioResponse updateScenario(xVolTenant, xVolSite, strategyID, scenarioID, upsertScenarioRequest)

Update Scenario

Update Scenario

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingScenarioApi apiInstance = new OrderRoutingScenarioApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    String strategyID = "strategyID_example"; // String | 
    Integer scenarioID = 56; // Integer | 
    UpsertScenarioRequest upsertScenarioRequest = new UpsertScenarioRequest(); // UpsertScenarioRequest | 
    try {
      ScenarioResponse result = apiInstance.updateScenario(xVolTenant, xVolSite, strategyID, scenarioID, upsertScenarioRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingScenarioApi#updateScenario");
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
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | |
| **strategyID** | **String**|  | |
| **scenarioID** | **Integer**|  | |
| **upsertScenarioRequest** | [**UpsertScenarioRequest**](UpsertScenarioRequest.md)|  | |

### Return type

[**ScenarioResponse**](ScenarioResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

