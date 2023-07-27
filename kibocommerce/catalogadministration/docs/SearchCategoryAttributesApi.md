# SearchCategoryAttributesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchCategoryAttributes**](SearchCategoryAttributesApi.md#searchCategoryAttributes) | **GET** /commerce/catalog/admin/categories/searchCategoryAttributes | Search Category Attributes |


<a name="searchCategoryAttributes"></a>
# **searchCategoryAttributes**
> CatalogAdminsCategoryPagedCollection searchCategoryAttributes(startIndex, pageSize, sortBy, filter, includeAttributes, responseGroups)

Search Category Attributes

Retrieves a list of categories according to any specified filter criteria and sort options for attributes.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SearchCategoryAttributesApi;

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

    SearchCategoryAttributesApi apiInstance = new SearchCategoryAttributesApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    Boolean includeAttributes = false; // Boolean | 
    String responseGroups = "responseGroups_example"; // String | 
    try {
      CatalogAdminsCategoryPagedCollection result = apiInstance.searchCategoryAttributes(startIndex, pageSize, sortBy, filter, includeAttributes, responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchCategoryAttributesApi#searchCategoryAttributes");
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
| **pageSize** | **Integer**|  | [optional] [default to 0] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **includeAttributes** | **Boolean**|  | [optional] [default to false] |
| **responseGroups** | **String**|  | [optional] |

### Return type

[**CatalogAdminsCategoryPagedCollection**](CatalogAdminsCategoryPagedCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

