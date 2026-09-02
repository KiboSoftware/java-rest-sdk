# PublishingApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**discardDrafts**](PublishingApi.md#discardDrafts) | **POST** /commerce/catalog/admin/publishing/discarddrafts | Discard Drafts |


<a name="discardDrafts"></a>
# **discardDrafts**
> discardDrafts(responseFields, publishingScope)

Discard Drafts

Deletes the draft version of product changes (pending product changes) for each product code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PublishingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PublishingApi apiInstance = new PublishingApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PublishingScope publishingScope = new PublishingScope(); // PublishingScope | 
    try {
      apiInstance.discardDrafts(responseFields, publishingScope);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublishingApi#discardDrafts");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **publishingScope** | [**PublishingScope**](PublishingScope.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

