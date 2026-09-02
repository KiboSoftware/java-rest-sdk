# ShipmentMetadataApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getQueryDescriptor**](ShipmentMetadataApi.md#getQueryDescriptor) | **GET** /commerce/shipments/metadata/query-descriptor | getQueryDescriptor |
| [**getRuleFields**](ShipmentMetadataApi.md#getRuleFields) | **GET** /commerce/shipments/metadata/rule-fields | getRuleFields |


<a name="getQueryDescriptor"></a>
# **getQueryDescriptor**
> QueryDescriptorDto getQueryDescriptor(xVolTenant, xVolSite)

getQueryDescriptor

getQueryDescriptor

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentMetadataApi apiInstance = new ShipmentMetadataApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      QueryDescriptorDto result = apiInstance.getQueryDescriptor(xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentMetadataApi#getQueryDescriptor");
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
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**QueryDescriptorDto**](QueryDescriptorDto.md)

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

<a name="getRuleFields"></a>
# **getRuleFields**
> List&lt;ShipmentRuleFieldDto&gt; getRuleFields(xVolTenant, filter, xVolSite)

getRuleFields

getRuleFields

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentMetadataApi apiInstance = new ShipmentMetadataApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    String filter = "filter_example"; // String | filter
    Integer xVolSite = 56; // Integer | 
    try {
      List<ShipmentRuleFieldDto> result = apiInstance.getRuleFields(xVolTenant, filter, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentMetadataApi#getRuleFields");
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
| **filter** | **String**| filter | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**List&lt;ShipmentRuleFieldDto&gt;**](ShipmentRuleFieldDto.md)

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

