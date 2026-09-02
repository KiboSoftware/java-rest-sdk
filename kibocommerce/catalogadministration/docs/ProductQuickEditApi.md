# ProductQuickEditApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateProductInCatalog**](ProductQuickEditApi.md#updateProductInCatalog) | **POST** /commerce/catalog/admin/quickedit/products/productincatalog | Quick Edit Product in Catalog |
| [**updateProductProperties**](ProductQuickEditApi.md#updateProductProperties) | **POST** /commerce/catalog/admin/quickedit/products/properties | Quick Edit Properties |
| [**updateProductType**](ProductQuickEditApi.md#updateProductType) | **POST** /commerce/catalog/admin/quickedit/products/producttype | Endpoint used to apply updates for product type |
| [**updateProducts**](ProductQuickEditApi.md#updateProducts) | **POST** /commerce/catalog/admin/quickedit/products | Quick Edit Products |


<a name="updateProductInCatalog"></a>
# **updateProductInCatalog**
> QuickEditResponse updateProductInCatalog(responseFields, quickEditProductInCatalogActions)

Quick Edit Product in Catalog

Updates products in catalog through quick edit. Values will be     added, not replaced. The Quick Edit APIs are designed primarily for the Quick Edit UI. They are not advised for bulk product updates through a batch job. For efficiently updating your catalog through a batch job, use the Import Export APIs or the Catalog Administration APIs directly.

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

    ProductQuickEditApi apiInstance = new ProductQuickEditApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    QuickEditProductInCatalogActions quickEditProductInCatalogActions = new QuickEditProductInCatalogActions(); // QuickEditProductInCatalogActions | Mozu.ProductAdmin.Contracts.QuickEditProductInCatalogActions
    try {
      QuickEditResponse result = apiInstance.updateProductInCatalog(responseFields, quickEditProductInCatalogActions);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **quickEditProductInCatalogActions** | [**QuickEditProductInCatalogActions**](QuickEditProductInCatalogActions.md)| Mozu.ProductAdmin.Contracts.QuickEditProductInCatalogActions | [optional] |

### Return type

[**QuickEditResponse**](QuickEditResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProductProperties"></a>
# **updateProductProperties**
> QuickEditResponse updateProductProperties(responseFields, quickEditProductPropertyActions)

Quick Edit Properties

Updates product properties through quick edits. Values will be added, not replaced. The Quick Edit APIs are designed primarily for the Quick Edit UI. They are not advised for bulk product updates through a batch job. For efficiently updating your catalog through a batch job, use the Import Export APIs or the Catalog Administration APIs directly.

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

    ProductQuickEditApi apiInstance = new ProductQuickEditApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    QuickEditProductPropertyActions quickEditProductPropertyActions = new QuickEditProductPropertyActions(); // QuickEditProductPropertyActions | Mozu.ProductAdmin.Contracts.QuickEditProductPropertyActions
    try {
      QuickEditResponse result = apiInstance.updateProductProperties(responseFields, quickEditProductPropertyActions);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **quickEditProductPropertyActions** | [**QuickEditProductPropertyActions**](QuickEditProductPropertyActions.md)| Mozu.ProductAdmin.Contracts.QuickEditProductPropertyActions | [optional] |

### Return type

[**QuickEditResponse**](QuickEditResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProductType"></a>
# **updateProductType**
> QuickEditChangeProductTypeResponse updateProductType(responseFields, quickEditChangeProductTypeActions)

Endpoint used to apply updates for product type

Endpoint used to apply updates for product type

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

    ProductQuickEditApi apiInstance = new ProductQuickEditApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    QuickEditChangeProductTypeActions quickEditChangeProductTypeActions = new QuickEditChangeProductTypeActions(); // QuickEditChangeProductTypeActions | Mozu.ProductAdmin.Contracts.QuickEditChangeProductTypeActions
    try {
      QuickEditChangeProductTypeResponse result = apiInstance.updateProductType(responseFields, quickEditChangeProductTypeActions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductQuickEditApi#updateProductType");
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
| **quickEditChangeProductTypeActions** | [**QuickEditChangeProductTypeActions**](QuickEditChangeProductTypeActions.md)| Mozu.ProductAdmin.Contracts.QuickEditChangeProductTypeActions | [optional] |

### Return type

[**QuickEditChangeProductTypeResponse**](QuickEditChangeProductTypeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProducts"></a>
# **updateProducts**
> QuickEditResponse updateProducts(responseFields, quickEditProductActions)

Quick Edit Products

Applies top level product updates. The Quick Edit APIs are designed primarily for the Quick Edit UI. They are not advised for bulk product updates through a batch job. For efficiently updating your catalog through a batch job, use the Import Export APIs or the Catalog Administration APIs directly.

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

    ProductQuickEditApi apiInstance = new ProductQuickEditApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    QuickEditProductActions quickEditProductActions = new QuickEditProductActions(); // QuickEditProductActions | 
    try {
      QuickEditResponse result = apiInstance.updateProducts(responseFields, quickEditProductActions);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **quickEditProductActions** | [**QuickEditProductActions**](QuickEditProductActions.md)|  | [optional] |

### Return type

[**QuickEditResponse**](QuickEditResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

