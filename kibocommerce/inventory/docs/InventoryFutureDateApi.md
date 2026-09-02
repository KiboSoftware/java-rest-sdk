# InventoryFutureDateApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adjustFutureDate**](InventoryFutureDateApi.md#adjustFutureDate) | **PUT** /adjustFutureDate/{futureInventoryID} | Adjust Future Date |


<a name="adjustFutureDate"></a>
# **adjustFutureDate**
> JobQueueResponse adjustFutureDate(futureInventoryID, adjustFutureDateRequest)

Adjust Future Date

Adjust future_date of future inventory

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryFutureDateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryFutureDateApi apiInstance = new InventoryFutureDateApi(defaultClient);
    Long futureInventoryID = 56L; // Long | id of the future_inventory row in db
    AdjustFutureDateRequest adjustFutureDateRequest = new AdjustFutureDateRequest(); // AdjustFutureDateRequest | Request for adjusting the future date
    try {
      JobQueueResponse result = apiInstance.adjustFutureDate(futureInventoryID, adjustFutureDateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryFutureDateApi#adjustFutureDate");
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
| **futureInventoryID** | **Long**| id of the future_inventory row in db | |
| **adjustFutureDateRequest** | [**AdjustFutureDateRequest**](AdjustFutureDateRequest.md)| Request for adjusting the future date | |

### Return type

[**JobQueueResponse**](JobQueueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Future Inventory ID not found |  -  |

