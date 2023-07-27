# FilebasedPackageApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFile**](FilebasedPackageApi.md#getFile) | **GET** /platform/appdev/filebasedpackage/packages/{applicationKey} | Get File |


<a name="getFile"></a>
# **getFile**
> AppDevHttpResponseMessage getFile(applicationKey, fileName)

Get File

Get File

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.FilebasedPackageApi;

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

    FilebasedPackageApi apiInstance = new FilebasedPackageApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    String fileName = "fileName_example"; // String | 
    try {
      AppDevHttpResponseMessage result = apiInstance.getFile(applicationKey, fileName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilebasedPackageApi#getFile");
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
| **applicationKey** | **String**|  | |
| **fileName** | **String**|  | [optional] |

### Return type

[**AppDevHttpResponseMessage**](AppDevHttpResponseMessage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

