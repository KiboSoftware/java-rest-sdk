# InventoryBlockAssignmentApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**blockAssignment**](InventoryBlockAssignmentApi.md#blockAssignment) | **POST** /commerce/inventory/v5/inventory/blockAssignment | Block Assignment |


<a name="blockAssignment"></a>
# **blockAssignment**
> BaseResponse blockAssignment(xVolTenant, blockAssignmentRequest)

Block Assignment

Setting the blockAssignment flag to true for the product based on the given request

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryBlockAssignmentApi;

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

    InventoryBlockAssignmentApi apiInstance = new InventoryBlockAssignmentApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    BlockAssignmentRequest blockAssignmentRequest = new BlockAssignmentRequest(); // BlockAssignmentRequest | Request to block assignment on the product
    try {
      BaseResponse result = apiInstance.blockAssignment(xVolTenant, blockAssignmentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryBlockAssignmentApi#blockAssignment");
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
| **blockAssignmentRequest** | [**BlockAssignmentRequest**](BlockAssignmentRequest.md)| Request to block assignment on the product | |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **500** | Internal Server Error |  -  |

