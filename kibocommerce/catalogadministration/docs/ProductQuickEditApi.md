# ProductQuickEditApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateProductInCatalog**](ProductQuickEditApi.md#updateProductInCatalog) | **POST** /commerce/catalog/admin/quickedit/products/productincatalog | Endpoint  is used to update product in Catalog |
| [**updateProductProperties**](ProductQuickEditApi.md#updateProductProperties) | **POST** /commerce/catalog/admin/quickedit/products/properties | Endpoint used to apply properties updates  Values will be added not replaced |
| [**updateProducts**](ProductQuickEditApi.md#updateProducts) | **POST** /commerce/catalog/admin/quickedit/products | Endpoint used to apply top level product updates  Downside is that the whole product has to be hydrated |


<a name="updateProductInCatalog"></a>
# **updateProductInCatalog**
> QuickEditResponse updateProductInCatalog(quickEditProductInCatalogActions)

Endpoint  is used to update product in Catalog

 Values will be added not replaced.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductQuickEditApi;

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

    ProductQuickEditApi apiInstance = new ProductQuickEditApi(defaultClient);
    QuickEditProductInCatalogActions quickEditProductInCatalogActions = new QuickEditProductInCatalogActions(); // QuickEditProductInCatalogActions | Mozu.ProductAdmin.Contracts.QuickEditProductInCatalogActions
    try {
      QuickEditResponse result = apiInstance.updateProductInCatalog(quickEditProductInCatalogActions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductQuickEditApi#updateProductInCatalog");
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
| **quickEditProductInCatalogActions** | [**QuickEditProductInCatalogActions**](QuickEditProductInCatalogActions.md)| Mozu.ProductAdmin.Contracts.QuickEditProductInCatalogActions | [optional] |

### Return type

[**QuickEditResponse**](QuickEditResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProductProperties"></a>
# **updateProductProperties**
> QuickEditResponse updateProductProperties(quickEditProductPropertyActions)

Endpoint used to apply properties updates  Values will be added not replaced



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductQuickEditApi;

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

    ProductQuickEditApi apiInstance = new ProductQuickEditApi(defaultClient);
    QuickEditProductPropertyActions quickEditProductPropertyActions = new QuickEditProductPropertyActions(); // QuickEditProductPropertyActions | Mozu.ProductAdmin.Contracts.QuickEditProductPropertyActions
    try {
      QuickEditResponse result = apiInstance.updateProductProperties(quickEditProductPropertyActions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductQuickEditApi#updateProductProperties");
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
| **quickEditProductPropertyActions** | [**QuickEditProductPropertyActions**](QuickEditProductPropertyActions.md)| Mozu.ProductAdmin.Contracts.QuickEditProductPropertyActions | [optional] |

### Return type

[**QuickEditResponse**](QuickEditResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProducts"></a>
# **updateProducts**
> QuickEditResponse updateProducts(quickEditProductActions)

Endpoint used to apply top level product updates  Downside is that the whole product has to be hydrated



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductQuickEditApi;

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

    ProductQuickEditApi apiInstance = new ProductQuickEditApi(defaultClient);
    QuickEditProductActions quickEditProductActions = new QuickEditProductActions(); // QuickEditProductActions | 
    try {
      QuickEditResponse result = apiInstance.updateProducts(quickEditProductActions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductQuickEditApi#updateProducts");
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
| **quickEditProductActions** | [**QuickEditProductActions**](QuickEditProductActions.md)|  | [optional] |

### Return type

[**QuickEditResponse**](QuickEditResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

