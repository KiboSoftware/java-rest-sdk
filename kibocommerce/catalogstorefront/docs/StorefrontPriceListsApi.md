# StorefrontPriceListsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**storefrontGetPriceList**](StorefrontPriceListsApi.md#storefrontGetPriceList) | **GET** /commerce/catalog/storefront/pricelists/{priceListCode} | Get Price List |
| [**storefrontGetResolvedPriceList**](StorefrontPriceListsApi.md#storefrontGetResolvedPriceList) | **GET** /commerce/catalog/storefront/pricelists/resolved | Get Resolved Price List (GET) |
| [**storefrontGetResolvedPriceList2**](StorefrontPriceListsApi.md#storefrontGetResolvedPriceList2) | **POST** /commerce/catalog/storefront/pricelists/resolved | Get Resolved Price List (POST) |


<a name="storefrontGetPriceList"></a>
# **storefrontGetPriceList**
> CatalogRuntimesPriceList storefrontGetPriceList(priceListCode, responseFields)

Get Price List

Retrieves the price list for the given priceListCode

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.StorefrontPriceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontPriceListsApi apiInstance = new StorefrontPriceListsApi(defaultClient);
    String priceListCode = "priceListCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogRuntimesPriceList result = apiInstance.storefrontGetPriceList(priceListCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontPriceListsApi#storefrontGetPriceList");
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
| **priceListCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogRuntimesPriceList**](CatalogRuntimesPriceList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontGetResolvedPriceList"></a>
# **storefrontGetResolvedPriceList**
> ResolvedPriceList storefrontGetResolvedPriceList(customerAccountId, responseFields)

Get Resolved Price List (GET)

This is primarily used when creating an offline order for a shopper. You can use this operation alongside custom Arc.js actions to alter the price list to which a shopper resolves.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.StorefrontPriceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontPriceListsApi apiInstance = new StorefrontPriceListsApi(defaultClient);
    Integer customerAccountId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ResolvedPriceList result = apiInstance.storefrontGetResolvedPriceList(customerAccountId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontPriceListsApi#storefrontGetResolvedPriceList");
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
| **customerAccountId** | **Integer**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ResolvedPriceList**](ResolvedPriceList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontGetResolvedPriceList2"></a>
# **storefrontGetResolvedPriceList2**
> ResolvedPriceList storefrontGetResolvedPriceList2(responseFields, body)

Get Resolved Price List (POST)

This is primarily used when creating an offline order for a shopper. You can use this operation alongside custom Arc.js actions to alter the price list to which a shopper resolves.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.StorefrontPriceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontPriceListsApi apiInstance = new StorefrontPriceListsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Object body = null; // Object | 
    try {
      ResolvedPriceList result = apiInstance.storefrontGetResolvedPriceList2(responseFields, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontPriceListsApi#storefrontGetResolvedPriceList2");
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
| **body** | **Object**|  | [optional] |

### Return type

[**ResolvedPriceList**](ResolvedPriceList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

