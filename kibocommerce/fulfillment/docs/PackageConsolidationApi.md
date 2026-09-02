# PackageConsolidationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPackageToPackageConsolidation**](PackageConsolidationApi.md#addPackageToPackageConsolidation) | **PUT** /commerce/shipments/{shipmentNumber}/consolidated/packages/{packageConsolidationId}/add/{packageId} | addPackageToPackageConsolidation |
| [**addTrackingForConsolidation**](PackageConsolidationApi.md#addTrackingForConsolidation) | **PUT** /commerce/shipments/{shipmentNumber}/consolidated/packages/{packageConsolidationId}/tracking | Add Tracking for Existing Package Consolidation |
| [**addTrackingForConsolidation1**](PackageConsolidationApi.md#addTrackingForConsolidation1) | **PUT** /commerce/shipments/{shipmentNumber}/consolidated/packages/tracking | addTrackingForConsolidation |
| [**createPackageConsolidation**](PackageConsolidationApi.md#createPackageConsolidation) | **POST** /commerce/shipments/{shipmentNumber}/consolidated/packages | createPackageConsolidation |
| [**deletePackageConsolidation**](PackageConsolidationApi.md#deletePackageConsolidation) | **DELETE** /commerce/shipments/{shipmentNumber}/consolidated/packages/{packageConsolidationId} | deletePackageConsolidation |
| [**getPackageConsolidation**](PackageConsolidationApi.md#getPackageConsolidation) | **GET** /commerce/shipments/{shipmentNumber}/consolidated/packages/{packageConsolidationId} | getPackageConsolidation |
| [**removeAllPackageConsolidationsFromShipment**](PackageConsolidationApi.md#removeAllPackageConsolidationsFromShipment) | **DELETE** /commerce/shipments/{shipmentNumber}/consolidated/packages/remove/bulk | removeAllPackageConsolidationsFromShipment |
| [**removeShipmentFromPackageConsolidation**](PackageConsolidationApi.md#removeShipmentFromPackageConsolidation) | **DELETE** /commerce/shipments/{shipmentNumber}/consolidated/packages/{packageConsolidationId}/remove/{packageId} | Remove Specific Package from Package Consolidation |
| [**removeShipmentFromPackageConsolidation1**](PackageConsolidationApi.md#removeShipmentFromPackageConsolidation1) | **DELETE** /commerce/shipments/{shipmentNumber}/consolidated/packages/{packageConsolidationId}/remove | removeShipmentFromPackageConsolidation |
| [**saveCartonizationForConsolidation**](PackageConsolidationApi.md#saveCartonizationForConsolidation) | **POST** /commerce/shipments/{shipmentNumber}/consolidated/packages/cartonization/save | saveCartonizationForConsolidation |


<a name="addPackageToPackageConsolidation"></a>
# **addPackageToPackageConsolidation**
> EntityModelOfShipment addPackageToPackageConsolidation(packageConsolidationId, packageId, shipmentNumber, xVolTenant, ifMatch, xVolSite)

addPackageToPackageConsolidation

addPackageToPackageConsolidation

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PackageConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PackageConsolidationApi apiInstance = new PackageConsolidationApi(defaultClient);
    String packageConsolidationId = "packageConsolidationId_example"; // String | packageConsolidationId
    String packageId = "packageId_example"; // String | packageId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.addPackageToPackageConsolidation(packageConsolidationId, packageId, shipmentNumber, xVolTenant, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageConsolidationApi#addPackageToPackageConsolidation");
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
| **packageConsolidationId** | **String**| packageConsolidationId | |
| **packageId** | **String**| packageId | |
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
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="addTrackingForConsolidation"></a>
# **addTrackingForConsolidation**
> EntityModelOfPackageConsolidationResponse addTrackingForConsolidation(packageConsolidationId, shipmentNumber, xVolTenant, fulfillmentAPIPackage, ifMatch, xVolSite)

Add Tracking for Existing Package Consolidation

addTrackingForConsolidation

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PackageConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PackageConsolidationApi apiInstance = new PackageConsolidationApi(defaultClient);
    String packageConsolidationId = "packageConsolidationId_example"; // String | packageConsolidationId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    FulfillmentAPIPackage fulfillmentAPIPackage = new FulfillmentAPIPackage(); // FulfillmentAPIPackage | packageDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfPackageConsolidationResponse result = apiInstance.addTrackingForConsolidation(packageConsolidationId, shipmentNumber, xVolTenant, fulfillmentAPIPackage, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageConsolidationApi#addTrackingForConsolidation");
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
| **packageConsolidationId** | **String**| packageConsolidationId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **fulfillmentAPIPackage** | [**FulfillmentAPIPackage**](FulfillmentAPIPackage.md)| packageDto | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfPackageConsolidationResponse**](EntityModelOfPackageConsolidationResponse.md)

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

<a name="addTrackingForConsolidation1"></a>
# **addTrackingForConsolidation1**
> EntityModelOfPackageConsolidationResponse addTrackingForConsolidation1(packageConsolidationId, shipmentNumber, xVolTenant, fulfillmentAPIPackage, ifMatch, xVolSite)

addTrackingForConsolidation

addTrackingForConsolidation

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PackageConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PackageConsolidationApi apiInstance = new PackageConsolidationApi(defaultClient);
    String packageConsolidationId = "packageConsolidationId_example"; // String | packageConsolidationId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    FulfillmentAPIPackage fulfillmentAPIPackage = new FulfillmentAPIPackage(); // FulfillmentAPIPackage | packageDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfPackageConsolidationResponse result = apiInstance.addTrackingForConsolidation1(packageConsolidationId, shipmentNumber, xVolTenant, fulfillmentAPIPackage, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageConsolidationApi#addTrackingForConsolidation1");
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
| **packageConsolidationId** | **String**| packageConsolidationId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **fulfillmentAPIPackage** | [**FulfillmentAPIPackage**](FulfillmentAPIPackage.md)| packageDto | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfPackageConsolidationResponse**](EntityModelOfPackageConsolidationResponse.md)

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

<a name="createPackageConsolidation"></a>
# **createPackageConsolidation**
> EntityModelOfPackageConsolidationResponse createPackageConsolidation(shipmentNumber, xVolTenant, packageConsolidationRequest, ifMatch, xVolSite)

createPackageConsolidation

createPackageConsolidation

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PackageConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PackageConsolidationApi apiInstance = new PackageConsolidationApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    PackageConsolidationRequest packageConsolidationRequest = new PackageConsolidationRequest(); // PackageConsolidationRequest | request
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfPackageConsolidationResponse result = apiInstance.createPackageConsolidation(shipmentNumber, xVolTenant, packageConsolidationRequest, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageConsolidationApi#createPackageConsolidation");
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
| **packageConsolidationRequest** | [**PackageConsolidationRequest**](PackageConsolidationRequest.md)| request | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfPackageConsolidationResponse**](EntityModelOfPackageConsolidationResponse.md)

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

<a name="deletePackageConsolidation"></a>
# **deletePackageConsolidation**
> deletePackageConsolidation(packageConsolidationId, shipmentNumber, xVolTenant, ifMatch, xVolSite)

deletePackageConsolidation

deletePackageConsolidation

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PackageConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PackageConsolidationApi apiInstance = new PackageConsolidationApi(defaultClient);
    String packageConsolidationId = "packageConsolidationId_example"; // String | packageConsolidationId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      apiInstance.deletePackageConsolidation(packageConsolidationId, shipmentNumber, xVolTenant, ifMatch, xVolSite);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageConsolidationApi#deletePackageConsolidation");
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
| **packageConsolidationId** | **String**| packageConsolidationId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="getPackageConsolidation"></a>
# **getPackageConsolidation**
> EntityModelOfPackageConsolidationResponse getPackageConsolidation(packageConsolidationId, shipmentNumber, xVolTenant, xVolSite)

getPackageConsolidation

getPackageConsolidation

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PackageConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PackageConsolidationApi apiInstance = new PackageConsolidationApi(defaultClient);
    String packageConsolidationId = "packageConsolidationId_example"; // String | packageConsolidationId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfPackageConsolidationResponse result = apiInstance.getPackageConsolidation(packageConsolidationId, shipmentNumber, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageConsolidationApi#getPackageConsolidation");
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
| **packageConsolidationId** | **String**| packageConsolidationId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfPackageConsolidationResponse**](EntityModelOfPackageConsolidationResponse.md)

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

<a name="removeAllPackageConsolidationsFromShipment"></a>
# **removeAllPackageConsolidationsFromShipment**
> removeAllPackageConsolidationsFromShipment(shipmentNumber, xVolTenant, xVolSite)

removeAllPackageConsolidationsFromShipment

removeAllPackageConsolidationsFromShipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PackageConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PackageConsolidationApi apiInstance = new PackageConsolidationApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      apiInstance.removeAllPackageConsolidationsFromShipment(shipmentNumber, xVolTenant, xVolSite);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageConsolidationApi#removeAllPackageConsolidationsFromShipment");
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
| **xVolSite** | **Integer**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="removeShipmentFromPackageConsolidation"></a>
# **removeShipmentFromPackageConsolidation**
> removeShipmentFromPackageConsolidation(packageConsolidationId, packageId, shipmentNumber, xVolTenant, ifMatch, xVolSite)

Remove Specific Package from Package Consolidation

removeShipmentFromPackageConsolidation

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PackageConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PackageConsolidationApi apiInstance = new PackageConsolidationApi(defaultClient);
    String packageConsolidationId = "packageConsolidationId_example"; // String | packageConsolidationId
    String packageId = "packageId_example"; // String | packageId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      apiInstance.removeShipmentFromPackageConsolidation(packageConsolidationId, packageId, shipmentNumber, xVolTenant, ifMatch, xVolSite);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageConsolidationApi#removeShipmentFromPackageConsolidation");
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
| **packageConsolidationId** | **String**| packageConsolidationId | |
| **packageId** | **String**| packageId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="removeShipmentFromPackageConsolidation1"></a>
# **removeShipmentFromPackageConsolidation1**
> removeShipmentFromPackageConsolidation1(packageConsolidationId, packageId, shipmentNumber, xVolTenant, ifMatch, xVolSite)

removeShipmentFromPackageConsolidation

removeShipmentFromPackageConsolidation

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PackageConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PackageConsolidationApi apiInstance = new PackageConsolidationApi(defaultClient);
    String packageConsolidationId = "packageConsolidationId_example"; // String | packageConsolidationId
    String packageId = "packageId_example"; // String | packageId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      apiInstance.removeShipmentFromPackageConsolidation1(packageConsolidationId, packageId, shipmentNumber, xVolTenant, ifMatch, xVolSite);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageConsolidationApi#removeShipmentFromPackageConsolidation1");
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
| **packageConsolidationId** | **String**| packageConsolidationId | |
| **packageId** | **String**| packageId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="saveCartonizationForConsolidation"></a>
# **saveCartonizationForConsolidation**
> EntityModelOfShipment saveCartonizationForConsolidation(shipmentNumber, xVolTenant, acceptedPackingSuggestionRequest, ifMatch, xVolSite)

saveCartonizationForConsolidation

saveCartonizationForConsolidation

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PackageConsolidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PackageConsolidationApi apiInstance = new PackageConsolidationApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    AcceptedPackingSuggestionRequest acceptedPackingSuggestionRequest = new AcceptedPackingSuggestionRequest(); // AcceptedPackingSuggestionRequest | acceptedPackingSuggestion
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.saveCartonizationForConsolidation(shipmentNumber, xVolTenant, acceptedPackingSuggestionRequest, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageConsolidationApi#saveCartonizationForConsolidation");
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
| **acceptedPackingSuggestionRequest** | [**AcceptedPackingSuggestionRequest**](AcceptedPackingSuggestionRequest.md)| acceptedPackingSuggestion | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

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

