# SearchPreviewApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchPreviewAsync**](SearchPreviewApi.md#searchPreviewAsync) | **POST** /commerce/catalog/storefront/productsearch/preview | Search preview |
| [**siteSearchPreviewAsync**](SearchPreviewApi.md#siteSearchPreviewAsync) | **POST** /commerce/catalog/storefront/productsearch/sitesearchpreview | Site search preview |


<a name="searchPreviewAsync"></a>
# **searchPreviewAsync**
> ProductSearchPreviewResult searchPreviewAsync(findProductsPreviewParameters)

Search preview

Though this endpoint only returns data, the decision has been made to make it a POST because the request body will be larger than what a url length can contain.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.SearchPreviewApi;

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

    SearchPreviewApi apiInstance = new SearchPreviewApi(defaultClient);
    FindProductsPreviewParameters findProductsPreviewParameters = new FindProductsPreviewParameters(); // FindProductsPreviewParameters | 
    try {
      ProductSearchPreviewResult result = apiInstance.searchPreviewAsync(findProductsPreviewParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchPreviewApi#searchPreviewAsync");
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
| **findProductsPreviewParameters** | [**FindProductsPreviewParameters**](FindProductsPreviewParameters.md)|  | [optional] |

### Return type

[**ProductSearchPreviewResult**](ProductSearchPreviewResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="siteSearchPreviewAsync"></a>
# **siteSearchPreviewAsync**
> ProductSearchPreviewResult siteSearchPreviewAsync(findProductsPreviewParameters)

Site search preview

Though this endpoint only returns data, the decision has been made to make it a POST because the request body will be larger than what a url length can contain.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.SearchPreviewApi;

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

    SearchPreviewApi apiInstance = new SearchPreviewApi(defaultClient);
    FindProductsPreviewParameters findProductsPreviewParameters = new FindProductsPreviewParameters(); // FindProductsPreviewParameters | 
    try {
      ProductSearchPreviewResult result = apiInstance.siteSearchPreviewAsync(findProductsPreviewParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchPreviewApi#siteSearchPreviewAsync");
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
| **findProductsPreviewParameters** | [**FindProductsPreviewParameters**](FindProductsPreviewParameters.md)|  | [optional] |

### Return type

[**ProductSearchPreviewResult**](ProductSearchPreviewResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

