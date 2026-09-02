# SubstitutionsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSubstituteItems**](SubstitutionsApi.md#addSubstituteItems) | **PUT** /commerce/shipments/{shipmentNumber}/substituteItems | addSubstituteItems |
| [**getSubstituteItems**](SubstitutionsApi.md#getSubstituteItems) | **GET** /commerce/shipments/{shipmentNumber}/substituteItems | getSubstituteItems |
| [**removeSubstituteItems**](SubstitutionsApi.md#removeSubstituteItems) | **PUT** /commerce/shipments/{shipmentNumber}/substituteItems/remove | removeSubstituteItems |


<a name="addSubstituteItems"></a>
# **addSubstituteItems**
> EntityModelOfShipment addSubstituteItems(shipmentNumber, xVolTenant, substituteItemsRequest, ifMatch, xVolSite)

addSubstituteItems

addSubstituteItems

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.SubstitutionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    SubstitutionsApi apiInstance = new SubstitutionsApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    SubstituteItemsRequest substituteItemsRequest = new SubstituteItemsRequest(); // SubstituteItemsRequest | substituteItemsRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.addSubstituteItems(shipmentNumber, xVolTenant, substituteItemsRequest, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubstitutionsApi#addSubstituteItems");
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
| **substituteItemsRequest** | [**SubstituteItemsRequest**](SubstituteItemsRequest.md)| substituteItemsRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getSubstituteItems"></a>
# **getSubstituteItems**
> CollectionModelOfSubstitutableItemResponse getSubstituteItems(shipmentNumber, xVolTenant, originalLineId, productCode, xVolSite)

getSubstituteItems

getSubstituteItems

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.SubstitutionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    SubstitutionsApi apiInstance = new SubstitutionsApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    Integer originalLineId = 56; // Integer | 
    String productCode = "productCode_example"; // String | 
    Integer xVolSite = 56; // Integer | 
    try {
      CollectionModelOfSubstitutableItemResponse result = apiInstance.getSubstituteItems(shipmentNumber, xVolTenant, originalLineId, productCode, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubstitutionsApi#getSubstituteItems");
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
| **originalLineId** | **Integer**|  | [optional] |
| **productCode** | **String**|  | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**CollectionModelOfSubstitutableItemResponse**](CollectionModelOfSubstitutableItemResponse.md)

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

<a name="removeSubstituteItems"></a>
# **removeSubstituteItems**
> EntityModelOfShipment removeSubstituteItems(shipmentNumber, xVolTenant, substituteItemsRequest, ifMatch, xVolSite)

removeSubstituteItems

removeSubstituteItems

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.SubstitutionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    SubstitutionsApi apiInstance = new SubstitutionsApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    SubstituteItemsRequest substituteItemsRequest = new SubstituteItemsRequest(); // SubstituteItemsRequest | substituteItemsRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.removeSubstituteItems(shipmentNumber, xVolTenant, substituteItemsRequest, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubstitutionsApi#removeSubstituteItems");
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
| **substituteItemsRequest** | [**SubstituteItemsRequest**](SubstituteItemsRequest.md)| substituteItemsRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

