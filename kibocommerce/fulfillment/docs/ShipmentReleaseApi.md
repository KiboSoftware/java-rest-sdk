# ShipmentReleaseApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clearReleaseInfo**](ShipmentReleaseApi.md#clearReleaseInfo) | **DELETE** /commerce/shipments/{shipmentNumber}/release | clearReleaseInfo |
| [**getReleaseInfo**](ShipmentReleaseApi.md#getReleaseInfo) | **GET** /commerce/shipments/{shipmentNumber}/release | getReleaseInfo |
| [**patchReleaseInfo**](ShipmentReleaseApi.md#patchReleaseInfo) | **PATCH** /commerce/shipments/{shipmentNumber}/release | patchReleaseInfo |
| [**updateReleaseInfo**](ShipmentReleaseApi.md#updateReleaseInfo) | **PUT** /commerce/shipments/{shipmentNumber}/release | updateReleaseInfo |


<a name="clearReleaseInfo"></a>
# **clearReleaseInfo**
> EntityModelOfShipment clearReleaseInfo(shipmentNumber, xVolTenant, ifMatch, xVolSite)

clearReleaseInfo

clearReleaseInfo

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentReleaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentReleaseApi apiInstance = new ShipmentReleaseApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.clearReleaseInfo(shipmentNumber, xVolTenant, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentReleaseApi#clearReleaseInfo");
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

<a name="getReleaseInfo"></a>
# **getReleaseInfo**
> ShipmentReleaseDto getReleaseInfo(shipmentNumber, xVolTenant, xVolSite)

getReleaseInfo

getReleaseInfo

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentReleaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentReleaseApi apiInstance = new ShipmentReleaseApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      ShipmentReleaseDto result = apiInstance.getReleaseInfo(shipmentNumber, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentReleaseApi#getReleaseInfo");
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

[**ShipmentReleaseDto**](ShipmentReleaseDto.md)

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

<a name="patchReleaseInfo"></a>
# **patchReleaseInfo**
> EntityModelOfShipment patchReleaseInfo(shipmentNumber, xVolTenant, shipmentReleaseDto, ifMatch, xVolSite)

patchReleaseInfo

patchReleaseInfo

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentReleaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentReleaseApi apiInstance = new ShipmentReleaseApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    ShipmentReleaseDto shipmentReleaseDto = new ShipmentReleaseDto(); // ShipmentReleaseDto | releaseDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.patchReleaseInfo(shipmentNumber, xVolTenant, shipmentReleaseDto, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentReleaseApi#patchReleaseInfo");
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
| **shipmentReleaseDto** | [**ShipmentReleaseDto**](ShipmentReleaseDto.md)| releaseDto | |
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
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="updateReleaseInfo"></a>
# **updateReleaseInfo**
> EntityModelOfShipment updateReleaseInfo(shipmentNumber, xVolTenant, shipmentReleaseDto, ifMatch, xVolSite)

updateReleaseInfo

updateReleaseInfo

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentReleaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentReleaseApi apiInstance = new ShipmentReleaseApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    ShipmentReleaseDto shipmentReleaseDto = new ShipmentReleaseDto(); // ShipmentReleaseDto | releaseDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.updateReleaseInfo(shipmentNumber, xVolTenant, shipmentReleaseDto, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentReleaseApi#updateReleaseInfo");
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
| **shipmentReleaseDto** | [**ShipmentReleaseDto**](ShipmentReleaseDto.md)| releaseDto | |
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

