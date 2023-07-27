# PriceListsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**storefrontGetPriceList**](PriceListsApi.md#storefrontGetPriceList) | **GET** /commerce/catalog/storefront/pricelists/{priceListCode} | Get price list |
| [**storefrontGetResolvedPriceList**](PriceListsApi.md#storefrontGetResolvedPriceList) | **GET** /commerce/catalog/storefront/pricelists/resolved | Get resolved price list |
| [**storefrontGetResolvedPriceList2**](PriceListsApi.md#storefrontGetResolvedPriceList2) | **POST** /commerce/catalog/storefront/pricelists/resolved | Get resolved price list |


<a name="storefrontGetPriceList"></a>
# **storefrontGetPriceList**
> CatalogRuntimesPriceList storefrontGetPriceList(priceListCode)

Get price list

Retrieves the price list for the given priceListCode

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.PriceListsApi;

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

    PriceListsApi apiInstance = new PriceListsApi(defaultClient);
    String priceListCode = "priceListCode_example"; // String | 
    try {
      CatalogRuntimesPriceList result = apiInstance.storefrontGetPriceList(priceListCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListsApi#storefrontGetPriceList");
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

### Return type

[**CatalogRuntimesPriceList**](CatalogRuntimesPriceList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="storefrontGetResolvedPriceList"></a>
# **storefrontGetResolvedPriceList**
> ResolvedPriceList storefrontGetResolvedPriceList(customerAccountId)

Get resolved price list



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.PriceListsApi;

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

    PriceListsApi apiInstance = new PriceListsApi(defaultClient);
    Integer customerAccountId = 56; // Integer | 
    try {
      ResolvedPriceList result = apiInstance.storefrontGetResolvedPriceList(customerAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListsApi#storefrontGetResolvedPriceList");
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

### Return type

[**ResolvedPriceList**](ResolvedPriceList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="storefrontGetResolvedPriceList2"></a>
# **storefrontGetResolvedPriceList2**
> ResolvedPriceList storefrontGetResolvedPriceList2(body)

Get resolved price list



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.PriceListsApi;

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

    PriceListsApi apiInstance = new PriceListsApi(defaultClient);
    Object body = null; // Object | 
    try {
      ResolvedPriceList result = apiInstance.storefrontGetResolvedPriceList2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListsApi#storefrontGetResolvedPriceList2");
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
| **body** | **Object**|  | [optional] |

### Return type

[**ResolvedPriceList**](ResolvedPriceList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

