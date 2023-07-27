# FulfillmentStorefrontApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getShipmentUsingGET1**](FulfillmentStorefrontApi.md#getShipmentUsingGET1) | **GET** /commerce/fulfillment/storefront/shipments/{shipmentNumber} | Get Shipment |
| [**getShipmentsUsingGET1**](FulfillmentStorefrontApi.md#getShipmentsUsingGET1) | **GET** /commerce/fulfillment/storefront/shipments | Get Shipments |


<a name="getShipmentUsingGET1"></a>
# **getShipmentUsingGET1**
> EntityModelOfShipment getShipmentUsingGET1(shipmentNumber)

Get Shipment

Get shipment information. Note that the schema supports both assignedLocationCode and fulfillmentLocationCode fields at the shipment level. These fields are usually the same, except when assignedLocationCode becomes the receiving location code after a transfer shipment is shipped.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.FulfillmentStorefrontApi;

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

    FulfillmentStorefrontApi apiInstance = new FulfillmentStorefrontApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      EntityModelOfShipment result = apiInstance.getShipmentUsingGET1(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentStorefrontApi#getShipmentUsingGET1");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getShipmentsUsingGET1"></a>
# **getShipmentsUsingGET1**
> PagedModelOfEntityModelOfShipment getShipmentsUsingGET1(bypassSearchIndex, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName)

Get Shipments

Get Shipments

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.FulfillmentStorefrontApi;

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

    FulfillmentStorefrontApi apiInstance = new FulfillmentStorefrontApi(defaultClient);
    Boolean bypassSearchIndex = true; // Boolean | 
    String filter = "filter_example"; // String | 
    Boolean isLate = true; // Boolean | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String quickSearch = "quickSearch_example"; // String | 
    String sort = "sort_example"; // String | 
    String workflowTaskName = "workflowTaskName_example"; // String | 
    try {
      PagedModelOfEntityModelOfShipment result = apiInstance.getShipmentsUsingGET1(bypassSearchIndex, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentStorefrontApi#getShipmentsUsingGET1");
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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

