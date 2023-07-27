# InventoryFutureDateApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adjustFutureDate**](InventoryFutureDateApi.md#adjustFutureDate) | **PUT** /adjustFutureDate/{futureInventoryID} | Adjust Future Date |


<a name="adjustFutureDate"></a>
# **adjustFutureDate**
> JobQueueResponse adjustFutureDate(xVolTenant, futureInventoryID)

Adjust Future Date

Adjust future_date of future inventory

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryFutureDateApi;

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

    InventoryFutureDateApi apiInstance = new InventoryFutureDateApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    Long futureInventoryID = 56L; // Long | id of the future_inventory row in db
    try {
      JobQueueResponse result = apiInstance.adjustFutureDate(xVolTenant, futureInventoryID);
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **futureInventoryID** | **Long**| id of the future_inventory row in db | |

### Return type

[**JobQueueResponse**](JobQueueResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Future Inventory ID not found |  -  |

