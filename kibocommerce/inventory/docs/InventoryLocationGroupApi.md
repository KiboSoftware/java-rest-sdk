# InventoryLocationGroupApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocationGroups**](InventoryLocationGroupApi.md#getLocationGroups) | **GET** /commerce/inventory/v1/locationGroup | Get Location Groups |


<a name="getLocationGroups"></a>
# **getLocationGroups**
> List&lt;LocationGroupResponse&gt; getLocationGroups()

Get Location Groups

Get LocationGroups

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryLocationGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryLocationGroupApi apiInstance = new InventoryLocationGroupApi(defaultClient);
    try {
      List<LocationGroupResponse> result = apiInstance.getLocationGroups();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryLocationGroupApi#getLocationGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;LocationGroupResponse&gt;**](LocationGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

