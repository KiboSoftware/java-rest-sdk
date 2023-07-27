# ViewsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getViewDocuments**](ViewsApi.md#getViewDocuments) | **GET** /content/documentlists/{documentListName}/views/{viewName}/documents | Get View Documents |


<a name="getViewDocuments"></a>
# **getViewDocuments**
> DocumentCollection getViewDocuments(documentListName, viewName, filter, sortBy, pageSize, startIndex, includeInactive)

Get View Documents

Get View Documents

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.ViewsApi;

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

    ViewsApi apiInstance = new ViewsApi(defaultClient);
    String documentListName = "documentListName_example"; // String | 
    String viewName = "viewName_example"; // String | 
    String filter = "filter_example"; // String | 
    String sortBy = "sortBy_example"; // String | 
    Integer pageSize = 56; // Integer | 
    Integer startIndex = 56; // Integer | 
    Boolean includeInactive = true; // Boolean | 
    try {
      DocumentCollection result = apiInstance.getViewDocuments(documentListName, viewName, filter, sortBy, pageSize, startIndex, includeInactive);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#getViewDocuments");
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
| **documentListName** | **String**|  | |
| **viewName** | **String**|  | |
| **filter** | **String**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **startIndex** | **Integer**|  | [optional] |
| **includeInactive** | **Boolean**|  | [optional] |

### Return type

[**DocumentCollection**](DocumentCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

