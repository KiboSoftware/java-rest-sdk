# RoleApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRoles**](RoleApi.md#getRoles) | **GET** /platform/adminuser/roles | Get Roles |


<a name="getRoles"></a>
# **getRoles**
> RoleCollection getRoles(startIndex, pageSize, filter)

Get Roles

Retrieves a list of all roles defined for this tenant.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.RoleApi;

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

    RoleApi apiInstance = new RoleApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 25; // Integer | 
    String filter = "filter_example"; // String | Optional filter param to filter the roles
    try {
      RoleCollection result = apiInstance.getRoles(startIndex, pageSize, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoleApi#getRoles");
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
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 25] |
| **filter** | **String**| Optional filter param to filter the roles | [optional] |

### Return type

[**RoleCollection**](RoleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

