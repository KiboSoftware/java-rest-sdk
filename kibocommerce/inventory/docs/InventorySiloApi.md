# InventorySiloApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateTenantSiloConfig**](InventorySiloApi.md#updateTenantSiloConfig) | **POST** /commerce/inventory/v1/silo/siloConfig | Update Tenant Silo Config |


<a name="updateTenantSiloConfig"></a>
# **updateTenantSiloConfig**
> TenantSiloConfigModel updateTenantSiloConfig(updateTenantSiloConfigRequest)

Update Tenant Silo Config

Updates tenant silo config

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventorySiloApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventorySiloApi apiInstance = new InventorySiloApi(defaultClient);
    UpdateTenantSiloConfigRequest updateTenantSiloConfigRequest = new UpdateTenantSiloConfigRequest(); // UpdateTenantSiloConfigRequest | Request to create tenant silo config
    try {
      TenantSiloConfigModel result = apiInstance.updateTenantSiloConfig(updateTenantSiloConfigRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventorySiloApi#updateTenantSiloConfig");
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
| **updateTenantSiloConfigRequest** | [**UpdateTenantSiloConfigRequest**](UpdateTenantSiloConfigRequest.md)| Request to create tenant silo config | |

### Return type

[**TenantSiloConfigModel**](TenantSiloConfigModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

