# TenantsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTenant**](TenantsApi.md#getTenant) | **GET** /platform/tenants/{tenantId} | Get Tenant by ID |


<a name="getTenant"></a>
# **getTenant**
> Tenant getTenant(tenantId, responseFields)

Get Tenant by ID

Retrieve information about a tenant. The attributes object will contain flags indicating whether or not certain features are enabled on the tenant. Kibo employees can reference &lt;a href&#x3D;\&quot;/pages/tenant-attributes\&quot;&gt;this internal-only documentation&lt;/a&gt; for a list of all attributes. &lt;/ul&gt;

### Example
```java
// Import classes:
import com.kibocommerce.sdk.common.ApiClient;
import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.common.Configuration;
import com.kibocommerce.sdk.common.auth.*;
import com.kibocommerce.sdk.common.models.*;
import com.kibocommerce.sdk.common.api.TenantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    Integer tenantId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Tenant result = apiInstance.getTenant(tenantId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#getTenant");
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
| **tenantId** | **Integer**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Tenant**](Tenant.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

