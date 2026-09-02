# StorefrontApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getShipment1**](StorefrontApi.md#getShipment1) | **GET** /commerce/fulfillment/storefront/shipments/{shipmentNumber} | Get Storefront Shipment |
| [**getShipments1**](StorefrontApi.md#getShipments1) | **GET** /commerce/fulfillment/storefront/shipments | Get Storefront Shipments |


<a name="getShipment1"></a>
# **getShipment1**
> EntityModelOfShipment getShipment1(shipmentNumber)

Get Storefront Shipment

Retrieve a storefront shipment by number.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      EntityModelOfShipment result = apiInstance.getShipment1(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#getShipment1");
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

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getShipments1"></a>
# **getShipments1**
> PagedModelOfEntityModelOfShipment getShipments1(bypassSearchIndex, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName)

Get Storefront Shipments

Retrieve all storefront shipments.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    Boolean bypassSearchIndex = true; // Boolean | 
    String filter = "filter_example"; // String | 
    Boolean isLate = true; // Boolean | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String quickSearch = "quickSearch_example"; // String | 
    String sort = "sort_example"; // String | 
    String workflowTaskName = "workflowTaskName_example"; // String | 
    try {
      PagedModelOfEntityModelOfShipment result = apiInstance.getShipments1(bypassSearchIndex, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#getShipments1");
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
| **bypassSearchIndex** | **Boolean**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **isLate** | **Boolean**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **quickSearch** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **workflowTaskName** | **String**|  | [optional] |

### Return type

[**PagedModelOfEntityModelOfShipment**](PagedModelOfEntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

