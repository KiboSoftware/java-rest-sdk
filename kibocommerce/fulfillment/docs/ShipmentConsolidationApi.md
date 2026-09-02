# ShipmentConsolidationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addShipmentToConsolidationGroup**](ShipmentConsolidationApi.md#addShipmentToConsolidationGroup) | **PUT** /commerce/shipments/{shipmentNumber}/consolidated/shipments/{shipmentConsolidationId}/add/{shipmentNumberToAdd} | Add Shipment to Existing Consolidation Group |
| [**addShipmentToConsolidationGroup1**](ShipmentConsolidationApi.md#addShipmentToConsolidationGroup1) | **PUT** /commerce/shipments/{shipmentNumber}/consolidated/shipments/add/{shipmentNumberToAdd} | addShipmentToConsolidationGroup |
| [**consolidateShipments**](ShipmentConsolidationApi.md#consolidateShipments) | **POST** /commerce/shipments/{shipmentNumber}/consolidated/shipments/{shipmentConsolidationId} | Add Shipments to Existing Consolidation Group |
| [**consolidateShipments1**](ShipmentConsolidationApi.md#consolidateShipments1) | **POST** /commerce/shipments/{shipmentNumber}/consolidated/shipments | consolidateShipments |
| [**getConsolidatedShipments**](ShipmentConsolidationApi.md#getConsolidatedShipments) | **GET** /commerce/shipments/{shipmentNumber}/consolidated/shipments/{shipmentConsolidationId} | Get Consolidation Group by ID |
| [**getConsolidatedShipments1**](ShipmentConsolidationApi.md#getConsolidatedShipments1) | **GET** /commerce/shipments/{shipmentNumber}/consolidated/shipments | getConsolidatedShipments |
| [**getConsolidationCandidateShipments**](ShipmentConsolidationApi.md#getConsolidationCandidateShipments) | **GET** /commerce/shipments/{shipmentNumber}/consolidated/shipments/candidates | getConsolidationCandidateShipments |
| [**removeCurrentShipmentFromConsolidation**](ShipmentConsolidationApi.md#removeCurrentShipmentFromConsolidation) | **DELETE** /commerce/shipments/{shipmentNumber}/consolidated/shipments/{shipmentConsolidationId} | Remove Shipment from Consolidation Group by ID |
| [**removeCurrentShipmentFromConsolidation1**](ShipmentConsolidationApi.md#removeCurrentShipmentFromConsolidation1) | **DELETE** /commerce/shipments/{shipmentNumber}/consolidated/shipments | removeCurrentShipmentFromConsolidation |
| [**removeSpecificShipmentFromConsolidationGroup**](ShipmentConsolidationApi.md#removeSpecificShipmentFromConsolidationGroup) | **PUT** /commerce/shipments/{shipmentNumber}/consolidated/shipments/{shipmentConsolidationId}/remove/{shipmentNumberToRemove} | Remove Specific Shipment from Existing Consolidation Group |
| [**removeSpecificShipmentFromConsolidationGroup1**](ShipmentConsolidationApi.md#removeSpecificShipmentFromConsolidationGroup1) | **PUT** /commerce/shipments/{shipmentNumber}/consolidated/shipments/remove/{shipmentNumberToRemove} | removeSpecificShipmentFromConsolidationGroup |


<a name="addShipmentToConsolidationGroup"></a>
# **addShipmentToConsolidationGroup**
> CollectionModelOfEntityModelOfShipment addShipmentToConsolidationGroup(shipmentConsolidationId, shipmentNumber, shipmentNumberToAdd, xVolTenant, ifMatch, xVolSite)

Add Shipment to Existing Consolidation Group

addShipmentToConsolidationGroup

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentConsolidationApi apiInstance = new ShipmentConsolidationApi(defaultClient);
    String shipmentConsolidationId = "shipmentConsolidationId_example"; // String | shipmentConsolidationId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer shipmentNumberToAdd = 56; // Integer | shipmentNumberToAdd
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      CollectionModelOfEntityModelOfShipment result = apiInstance.addShipmentToConsolidationGroup(shipmentConsolidationId, shipmentNumber, shipmentNumberToAdd, xVolTenant, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentConsolidationApi#addShipmentToConsolidationGroup");
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
| **shipmentConsolidationId** | **String**| shipmentConsolidationId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **shipmentNumberToAdd** | **Integer**| shipmentNumberToAdd | |
| **xVolTenant** | **Integer**|  | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**CollectionModelOfEntityModelOfShipment**](CollectionModelOfEntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="addShipmentToConsolidationGroup1"></a>
# **addShipmentToConsolidationGroup1**
> CollectionModelOfEntityModelOfShipment addShipmentToConsolidationGroup1(shipmentConsolidationId, shipmentNumber, shipmentNumberToAdd, xVolTenant, ifMatch, xVolSite)

addShipmentToConsolidationGroup

addShipmentToConsolidationGroup

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentConsolidationApi apiInstance = new ShipmentConsolidationApi(defaultClient);
    String shipmentConsolidationId = "shipmentConsolidationId_example"; // String | shipmentConsolidationId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer shipmentNumberToAdd = 56; // Integer | shipmentNumberToAdd
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      CollectionModelOfEntityModelOfShipment result = apiInstance.addShipmentToConsolidationGroup1(shipmentConsolidationId, shipmentNumber, shipmentNumberToAdd, xVolTenant, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentConsolidationApi#addShipmentToConsolidationGroup1");
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
| **shipmentConsolidationId** | **String**| shipmentConsolidationId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **shipmentNumberToAdd** | **Integer**| shipmentNumberToAdd | |
| **xVolTenant** | **Integer**|  | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**CollectionModelOfEntityModelOfShipment**](CollectionModelOfEntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="consolidateShipments"></a>
# **consolidateShipments**
> CollectionModelOfEntityModelOfShipment consolidateShipments(shipmentConsolidationId, shipmentNumber, xVolTenant, shipmentConsolidationRequest, ifMatch, xVolSite)

Add Shipments to Existing Consolidation Group

consolidateShipments

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentConsolidationApi apiInstance = new ShipmentConsolidationApi(defaultClient);
    String shipmentConsolidationId = "shipmentConsolidationId_example"; // String | shipmentConsolidationId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    ShipmentConsolidationRequest shipmentConsolidationRequest = new ShipmentConsolidationRequest(); // ShipmentConsolidationRequest | request
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      CollectionModelOfEntityModelOfShipment result = apiInstance.consolidateShipments(shipmentConsolidationId, shipmentNumber, xVolTenant, shipmentConsolidationRequest, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentConsolidationApi#consolidateShipments");
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
| **shipmentConsolidationId** | **String**| shipmentConsolidationId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **shipmentConsolidationRequest** | [**ShipmentConsolidationRequest**](ShipmentConsolidationRequest.md)| request | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**CollectionModelOfEntityModelOfShipment**](CollectionModelOfEntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="consolidateShipments1"></a>
# **consolidateShipments1**
> CollectionModelOfEntityModelOfShipment consolidateShipments1(shipmentConsolidationId, shipmentNumber, xVolTenant, shipmentConsolidationRequest, ifMatch, xVolSite)

consolidateShipments

consolidateShipments

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentConsolidationApi apiInstance = new ShipmentConsolidationApi(defaultClient);
    String shipmentConsolidationId = "shipmentConsolidationId_example"; // String | shipmentConsolidationId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    ShipmentConsolidationRequest shipmentConsolidationRequest = new ShipmentConsolidationRequest(); // ShipmentConsolidationRequest | request
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      CollectionModelOfEntityModelOfShipment result = apiInstance.consolidateShipments1(shipmentConsolidationId, shipmentNumber, xVolTenant, shipmentConsolidationRequest, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentConsolidationApi#consolidateShipments1");
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
| **shipmentConsolidationId** | **String**| shipmentConsolidationId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **shipmentConsolidationRequest** | [**ShipmentConsolidationRequest**](ShipmentConsolidationRequest.md)| request | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**CollectionModelOfEntityModelOfShipment**](CollectionModelOfEntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getConsolidatedShipments"></a>
# **getConsolidatedShipments**
> CollectionModelOfEntityModelOfShipment getConsolidatedShipments(shipmentConsolidationId, shipmentNumber, xVolTenant, xVolSite)

Get Consolidation Group by ID

getConsolidatedShipments

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentConsolidationApi apiInstance = new ShipmentConsolidationApi(defaultClient);
    String shipmentConsolidationId = "shipmentConsolidationId_example"; // String | shipmentConsolidationId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      CollectionModelOfEntityModelOfShipment result = apiInstance.getConsolidatedShipments(shipmentConsolidationId, shipmentNumber, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentConsolidationApi#getConsolidatedShipments");
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
| **shipmentConsolidationId** | **String**| shipmentConsolidationId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**CollectionModelOfEntityModelOfShipment**](CollectionModelOfEntityModelOfShipment.md)

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

<a name="getConsolidatedShipments1"></a>
# **getConsolidatedShipments1**
> CollectionModelOfEntityModelOfShipment getConsolidatedShipments1(shipmentConsolidationId, shipmentNumber, xVolTenant, xVolSite)

getConsolidatedShipments

getConsolidatedShipments

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentConsolidationApi apiInstance = new ShipmentConsolidationApi(defaultClient);
    String shipmentConsolidationId = "shipmentConsolidationId_example"; // String | shipmentConsolidationId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      CollectionModelOfEntityModelOfShipment result = apiInstance.getConsolidatedShipments1(shipmentConsolidationId, shipmentNumber, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentConsolidationApi#getConsolidatedShipments1");
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
| **shipmentConsolidationId** | **String**| shipmentConsolidationId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**CollectionModelOfEntityModelOfShipment**](CollectionModelOfEntityModelOfShipment.md)

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

<a name="getConsolidationCandidateShipments"></a>
# **getConsolidationCandidateShipments**
> EntityModelOfPackageConsolidationCandidatesResponse getConsolidationCandidateShipments(shipmentNumber, xVolTenant, bypassSearchIndex, filter, isExpress, isLate, locationGroupCode, page, pageSize, pickStatus, pickWaveType, pickable, quickSearch, slaCompliance, sort, timePeriodUnit, timePeriodValue, workflowTaskName, xVolSite)

getConsolidationCandidateShipments

getConsolidationCandidateShipments

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentConsolidationApi apiInstance = new ShipmentConsolidationApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    Boolean bypassSearchIndex = true; // Boolean | 
    String filter = "filter_example"; // String | 
    Boolean isExpress = true; // Boolean | 
    Boolean isLate = true; // Boolean | 
    String locationGroupCode = "locationGroupCode_example"; // String | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String pickStatus = "AVAILABLE"; // String | 
    String pickWaveType = "NORMAL"; // String | 
    Boolean pickable = true; // Boolean | 
    String quickSearch = "quickSearch_example"; // String | 
    String slaCompliance = "slaCompliance_example"; // String | 
    String sort = "sort_example"; // String | 
    String timePeriodUnit = "HOURS"; // String | 
    Integer timePeriodValue = 56; // Integer | 
    String workflowTaskName = "workflowTaskName_example"; // String | 
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfPackageConsolidationCandidatesResponse result = apiInstance.getConsolidationCandidateShipments(shipmentNumber, xVolTenant, bypassSearchIndex, filter, isExpress, isLate, locationGroupCode, page, pageSize, pickStatus, pickWaveType, pickable, quickSearch, slaCompliance, sort, timePeriodUnit, timePeriodValue, workflowTaskName, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentConsolidationApi#getConsolidationCandidateShipments");
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
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **bypassSearchIndex** | **Boolean**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **isExpress** | **Boolean**|  | [optional] |
| **isLate** | **Boolean**|  | [optional] |
| **locationGroupCode** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **pickStatus** | **String**|  | [optional] [enum: AVAILABLE, IN_WAVE, PICKED, TRANSFER, COMPLETE] |
| **pickWaveType** | **String**|  | [optional] [enum: NORMAL, SINGLE, MULTIPLE] |
| **pickable** | **Boolean**|  | [optional] |
| **quickSearch** | **String**|  | [optional] |
| **slaCompliance** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **timePeriodUnit** | **String**|  | [optional] [enum: HOURS, DAYS, WEEKS, MONTHS, YEARS] |
| **timePeriodValue** | **Integer**|  | [optional] |
| **workflowTaskName** | **String**|  | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfPackageConsolidationCandidatesResponse**](EntityModelOfPackageConsolidationCandidatesResponse.md)

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

<a name="removeCurrentShipmentFromConsolidation"></a>
# **removeCurrentShipmentFromConsolidation**
> EntityModelOfShipment removeCurrentShipmentFromConsolidation(shipmentConsolidationId, shipmentNumber, xVolTenant, ifMatch, xVolSite)

Remove Shipment from Consolidation Group by ID

removeCurrentShipmentFromConsolidation

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentConsolidationApi apiInstance = new ShipmentConsolidationApi(defaultClient);
    String shipmentConsolidationId = "shipmentConsolidationId_example"; // String | shipmentConsolidationId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.removeCurrentShipmentFromConsolidation(shipmentConsolidationId, shipmentNumber, xVolTenant, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentConsolidationApi#removeCurrentShipmentFromConsolidation");
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
| **shipmentConsolidationId** | **String**| shipmentConsolidationId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="removeCurrentShipmentFromConsolidation1"></a>
# **removeCurrentShipmentFromConsolidation1**
> EntityModelOfShipment removeCurrentShipmentFromConsolidation1(shipmentConsolidationId, shipmentNumber, xVolTenant, ifMatch, xVolSite)

removeCurrentShipmentFromConsolidation

removeCurrentShipmentFromConsolidation

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentConsolidationApi apiInstance = new ShipmentConsolidationApi(defaultClient);
    String shipmentConsolidationId = "shipmentConsolidationId_example"; // String | shipmentConsolidationId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.removeCurrentShipmentFromConsolidation1(shipmentConsolidationId, shipmentNumber, xVolTenant, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentConsolidationApi#removeCurrentShipmentFromConsolidation1");
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
| **shipmentConsolidationId** | **String**| shipmentConsolidationId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="removeSpecificShipmentFromConsolidationGroup"></a>
# **removeSpecificShipmentFromConsolidationGroup**
> EntityModelOfShipment removeSpecificShipmentFromConsolidationGroup(shipmentConsolidationId, shipmentNumber, shipmentNumberToRemove, xVolTenant, ifMatch, xVolSite)

Remove Specific Shipment from Existing Consolidation Group

removeSpecificShipmentFromConsolidationGroup

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentConsolidationApi apiInstance = new ShipmentConsolidationApi(defaultClient);
    String shipmentConsolidationId = "shipmentConsolidationId_example"; // String | shipmentConsolidationId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer shipmentNumberToRemove = 56; // Integer | shipmentNumberToRemove
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.removeSpecificShipmentFromConsolidationGroup(shipmentConsolidationId, shipmentNumber, shipmentNumberToRemove, xVolTenant, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentConsolidationApi#removeSpecificShipmentFromConsolidationGroup");
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
| **shipmentConsolidationId** | **String**| shipmentConsolidationId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **shipmentNumberToRemove** | **Integer**| shipmentNumberToRemove | |
| **xVolTenant** | **Integer**|  | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="removeSpecificShipmentFromConsolidationGroup1"></a>
# **removeSpecificShipmentFromConsolidationGroup1**
> EntityModelOfShipment removeSpecificShipmentFromConsolidationGroup1(shipmentConsolidationId, shipmentNumber, shipmentNumberToRemove, xVolTenant, ifMatch, xVolSite)

removeSpecificShipmentFromConsolidationGroup

removeSpecificShipmentFromConsolidationGroup

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentConsolidationApi apiInstance = new ShipmentConsolidationApi(defaultClient);
    String shipmentConsolidationId = "shipmentConsolidationId_example"; // String | shipmentConsolidationId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer shipmentNumberToRemove = 56; // Integer | shipmentNumberToRemove
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.removeSpecificShipmentFromConsolidationGroup1(shipmentConsolidationId, shipmentNumber, shipmentNumberToRemove, xVolTenant, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentConsolidationApi#removeSpecificShipmentFromConsolidationGroup1");
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
| **shipmentConsolidationId** | **String**| shipmentConsolidationId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **shipmentNumberToRemove** | **Integer**| shipmentNumberToRemove | |
| **xVolTenant** | **Integer**|  | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

