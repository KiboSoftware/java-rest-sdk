# InventoryLocationGroupApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocationGroups**](InventoryLocationGroupApi.md#getLocationGroups) | **GET** /commerce/inventory/v1/locationGroup | Get Location Groups |


<a name="getLocationGroups"></a>
# **getLocationGroups**
> List&lt;LocationGroupResponse&gt; getLocationGroups(xVolTenant)

Get Location Groups

Get LocationGroups

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryLocationGroupApi;

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

    InventoryLocationGroupApi apiInstance = new InventoryLocationGroupApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    try {
      List<LocationGroupResponse> result = apiInstance.getLocationGroups(xVolTenant);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xVolTenant** | **Integer**| Tenant ID | |

### Return type

[**List&lt;LocationGroupResponse&gt;**](LocationGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

