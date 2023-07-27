# InventorySiloApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateTenantSiloConfig**](InventorySiloApi.md#updateTenantSiloConfig) | **POST** /commerce/inventory/v1/silo/siloConfig | Update Tenant Silo Config |


<a name="updateTenantSiloConfig"></a>
# **updateTenantSiloConfig**
> TenantSiloConfigModel updateTenantSiloConfig(xVolTenant, updateTenantSiloConfigRequest)

Update Tenant Silo Config

Updates tenant silo config

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventorySiloApi;

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

    InventorySiloApi apiInstance = new InventorySiloApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    UpdateTenantSiloConfigRequest updateTenantSiloConfigRequest = new UpdateTenantSiloConfigRequest(); // UpdateTenantSiloConfigRequest | Request to create tenant silo config
    try {
      TenantSiloConfigModel result = apiInstance.updateTenantSiloConfig(xVolTenant, updateTenantSiloConfigRequest);
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **updateTenantSiloConfigRequest** | [**UpdateTenantSiloConfigRequest**](UpdateTenantSiloConfigRequest.md)| Request to create tenant silo config | |

### Return type

[**TenantSiloConfigModel**](TenantSiloConfigModel.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

