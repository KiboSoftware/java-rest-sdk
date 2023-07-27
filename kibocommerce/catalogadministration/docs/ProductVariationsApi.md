# ProductVariationsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProductVariationLocalizedDeltaPrice**](ProductVariationsApi.md#addProductVariationLocalizedDeltaPrice) | **POST** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice | Add product variation localized delta price |
| [**addProductVariationLocalizedPrice**](ProductVariationsApi.md#addProductVariationLocalizedPrice) | **POST** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice | Add product variation localized price |
| [**deleteProductVariation**](ProductVariationsApi.md#deleteProductVariation) | **DELETE** /commerce/catalog/admin/products/{productCode}/variations/{variationKey} | Delete product variation |
| [**deleteProductVariationLocalizedDeltaPrice**](ProductVariationsApi.md#deleteProductVariationLocalizedDeltaPrice) | **DELETE** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice/{currencyCode} | Delete product variation localized delta price |
| [**deleteProductVariationLocalizedPrice**](ProductVariationsApi.md#deleteProductVariationLocalizedPrice) | **DELETE** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice/{currencyCode} | Delete product variation localized price |
| [**getProductVariation**](ProductVariationsApi.md#getProductVariation) | **GET** /commerce/catalog/admin/products/{productCode}/variations/{variationKey} | Get product variation |
| [**getProductVariationLocalizedDeltaPrice**](ProductVariationsApi.md#getProductVariationLocalizedDeltaPrice) | **GET** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice/{currencyCode} | Get product variation localized delta price |
| [**getProductVariationLocalizedDeltaPrices**](ProductVariationsApi.md#getProductVariationLocalizedDeltaPrices) | **GET** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice | Get product variation localized delta prices |
| [**getProductVariationLocalizedPrice**](ProductVariationsApi.md#getProductVariationLocalizedPrice) | **GET** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice/{currencyCode} | Get product variation localized price |
| [**getProductVariationLocalizedPrices**](ProductVariationsApi.md#getProductVariationLocalizedPrices) | **GET** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice | Get product variation localized prices |
| [**getProductVariations**](ProductVariationsApi.md#getProductVariations) | **GET** /commerce/catalog/admin/products/{productCode}/variations | Get product variations |
| [**updateProductVariation**](ProductVariationsApi.md#updateProductVariation) | **PUT** /commerce/catalog/admin/products/{productCode}/variations/{variationKey} | Update product variation |
| [**updateProductVariationLocalizedDeltaPrice**](ProductVariationsApi.md#updateProductVariationLocalizedDeltaPrice) | **PUT** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice/{currencyCode} | Update product variation localized delta price |
| [**updateProductVariationLocalizedDeltaPrices**](ProductVariationsApi.md#updateProductVariationLocalizedDeltaPrices) | **PUT** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice | Update product variation localized delta prices |
| [**updateProductVariationLocalizedPrice**](ProductVariationsApi.md#updateProductVariationLocalizedPrice) | **PUT** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice/{currencyCode} | Update product variation localized price |
| [**updateProductVariationLocalizedPrices**](ProductVariationsApi.md#updateProductVariationLocalizedPrices) | **PUT** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice | Update product variation localized prices |
| [**updateProductVariations**](ProductVariationsApi.md#updateProductVariations) | **PUT** /commerce/catalog/admin/products/{productCode}/variations | Update product variations |


<a name="addProductVariationLocalizedDeltaPrice"></a>
# **addProductVariationLocalizedDeltaPrice**
> ProductVariationDeltaPrice addProductVariationLocalizedDeltaPrice(productCode, variationKey, productVariationDeltaPrice)

Add product variation localized delta price



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductVariationsApi;

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    ProductVariationDeltaPrice productVariationDeltaPrice = new ProductVariationDeltaPrice(); // ProductVariationDeltaPrice | 
    try {
      ProductVariationDeltaPrice result = apiInstance.addProductVariationLocalizedDeltaPrice(productCode, variationKey, productVariationDeltaPrice);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductVariationsApi#addProductVariationLocalizedDeltaPrice");
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
| **productCode** | **String**|  | |
| **variationKey** | **String**|  | |
| **productVariationDeltaPrice** | [**ProductVariationDeltaPrice**](ProductVariationDeltaPrice.md)|  | [optional] |

### Return type

[**ProductVariationDeltaPrice**](ProductVariationDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addProductVariationLocalizedPrice"></a>
# **addProductVariationLocalizedPrice**
> ProductVariationFixedPrice addProductVariationLocalizedPrice(productCode, variationKey, productVariationFixedPrice)

Add product variation localized price



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductVariationsApi;

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    ProductVariationFixedPrice productVariationFixedPrice = new ProductVariationFixedPrice(); // ProductVariationFixedPrice | 
    try {
      ProductVariationFixedPrice result = apiInstance.addProductVariationLocalizedPrice(productCode, variationKey, productVariationFixedPrice);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductVariationsApi#addProductVariationLocalizedPrice");
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
| **productCode** | **String**|  | |
| **variationKey** | **String**|  | |
| **productVariationFixedPrice** | [**ProductVariationFixedPrice**](ProductVariationFixedPrice.md)|  | [optional] |

### Return type

[**ProductVariationFixedPrice**](ProductVariationFixedPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteProductVariation"></a>
# **deleteProductVariation**
> deleteProductVariation(productCode, variationKey)

Delete product variation

Deletes an existing product variation.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductVariationsApi;

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-created code associated with the product, for example, a SKU. Required.
    String variationKey = "variationKey_example"; // String | Unique identifier for a single product variation. System-supplied and read-only.
    try {
      apiInstance.deleteProductVariation(productCode, variationKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductVariationsApi#deleteProductVariation");
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
| **productCode** | **String**| Merchant-created code associated with the product, for example, a SKU. Required. | |
| **variationKey** | **String**| Unique identifier for a single product variation. System-supplied and read-only. | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteProductVariationLocalizedDeltaPrice"></a>
# **deleteProductVariationLocalizedDeltaPrice**
> deleteProductVariationLocalizedDeltaPrice(productCode, variationKey, currencyCode)

Delete product variation localized delta price



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductVariationsApi;

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    try {
      apiInstance.deleteProductVariationLocalizedDeltaPrice(productCode, variationKey, currencyCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductVariationsApi#deleteProductVariationLocalizedDeltaPrice");
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
| **productCode** | **String**|  | |
| **variationKey** | **String**|  | |
| **currencyCode** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteProductVariationLocalizedPrice"></a>
# **deleteProductVariationLocalizedPrice**
> deleteProductVariationLocalizedPrice(productCode, variationKey, currencyCode)

Delete product variation localized price



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductVariationsApi;

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    try {
      apiInstance.deleteProductVariationLocalizedPrice(productCode, variationKey, currencyCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductVariationsApi#deleteProductVariationLocalizedPrice");
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
| **productCode** | **String**|  | |
| **variationKey** | **String**|  | |
| **currencyCode** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProductVariation"></a>
# **getProductVariation**
> ProductVariation getProductVariation(productCode, variationKey)

Get product variation

Retrieves an existing product variation for a specific product and variation key.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductVariationsApi;

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-created code associated with the product, for example, a SKU. Required.
    String variationKey = "variationKey_example"; // String | Unique identifier for a single product variation. System-supplied and read-only.
    try {
      ProductVariation result = apiInstance.getProductVariation(productCode, variationKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductVariationsApi#getProductVariation");
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
| **productCode** | **String**| Merchant-created code associated with the product, for example, a SKU. Required. | |
| **variationKey** | **String**| Unique identifier for a single product variation. System-supplied and read-only. | |

### Return type

[**ProductVariation**](ProductVariation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProductVariationLocalizedDeltaPrice"></a>
# **getProductVariationLocalizedDeltaPrice**
> ProductVariationDeltaPrice getProductVariationLocalizedDeltaPrice(productCode, variationKey, currencyCode)

Get product variation localized delta price



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductVariationsApi;

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    try {
      ProductVariationDeltaPrice result = apiInstance.getProductVariationLocalizedDeltaPrice(productCode, variationKey, currencyCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductVariationsApi#getProductVariationLocalizedDeltaPrice");
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
| **productCode** | **String**|  | |
| **variationKey** | **String**|  | |
| **currencyCode** | **String**|  | |

### Return type

[**ProductVariationDeltaPrice**](ProductVariationDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProductVariationLocalizedDeltaPrices"></a>
# **getProductVariationLocalizedDeltaPrices**
> List&lt;ProductVariationDeltaPrice&gt; getProductVariationLocalizedDeltaPrices(productCode, variationKey)

Get product variation localized delta prices



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductVariationsApi;

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    try {
      List<ProductVariationDeltaPrice> result = apiInstance.getProductVariationLocalizedDeltaPrices(productCode, variationKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductVariationsApi#getProductVariationLocalizedDeltaPrices");
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
| **productCode** | **String**|  | |
| **variationKey** | **String**|  | |

### Return type

[**List&lt;ProductVariationDeltaPrice&gt;**](ProductVariationDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProductVariationLocalizedPrice"></a>
# **getProductVariationLocalizedPrice**
> ProductVariationFixedPrice getProductVariationLocalizedPrice(productCode, variationKey, currencyCode)

Get product variation localized price



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductVariationsApi;

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    try {
      ProductVariationFixedPrice result = apiInstance.getProductVariationLocalizedPrice(productCode, variationKey, currencyCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductVariationsApi#getProductVariationLocalizedPrice");
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
| **productCode** | **String**|  | |
| **variationKey** | **String**|  | |
| **currencyCode** | **String**|  | |

### Return type

[**ProductVariationFixedPrice**](ProductVariationFixedPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProductVariationLocalizedPrices"></a>
# **getProductVariationLocalizedPrices**
> List&lt;ProductVariationFixedPrice&gt; getProductVariationLocalizedPrices(productCode, variationKey)

Get product variation localized prices



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductVariationsApi;

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    try {
      List<ProductVariationFixedPrice> result = apiInstance.getProductVariationLocalizedPrices(productCode, variationKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductVariationsApi#getProductVariationLocalizedPrices");
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
| **productCode** | **String**|  | |
| **variationKey** | **String**|  | |

### Return type

[**List&lt;ProductVariationFixedPrice&gt;**](ProductVariationFixedPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProductVariations"></a>
# **getProductVariations**
> ProductVariationPagedCollection getProductVariations(productCode, startIndex, pageSize, sortBy, filter)

Get product variations

Retrieves a paged list of product variations for a specific product according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductVariationsApi;

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-supplied code associated with the product, for example, a SKU. Required.
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set  where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items,  startIndex=3. The default value is 0. Optional.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a  query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending  (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not  equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw =  starts with, or cont = contains. Optional.
    try {
      ProductVariationPagedCollection result = apiInstance.getProductVariations(productCode, startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductVariationsApi#getProductVariations");
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
| **productCode** | **String**| Merchant-supplied code associated with the product, for example, a SKU. Required. | |
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set  where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items,  startIndex&#x3D;3. The default value is 0. Optional. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a  query. The default value is 20 and the maximum value is 200. Optional. | [optional] [default to 0] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending  (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not  equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D;  starts with, or cont &#x3D; contains. Optional. | [optional] |

### Return type

[**ProductVariationPagedCollection**](ProductVariationPagedCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProductVariation"></a>
# **updateProductVariation**
> ProductVariation updateProductVariation(productCode, variationKey, productVariation)

Update product variation

Modifies an existing product variation specified by its variation key. Typically used to change the price or               inventory count of an existing product variation. Read-only options are ignored.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductVariationsApi;

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-created code associated with the product, for example, a SKU. Required.
    String variationKey = "variationKey_example"; // String | Unique identifier for a single variation. System-supplied and read-only.
    ProductVariation productVariation = new ProductVariation(); // ProductVariation | Properties of the product variation that you are modifying. Required.
    try {
      ProductVariation result = apiInstance.updateProductVariation(productCode, variationKey, productVariation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductVariationsApi#updateProductVariation");
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
| **productCode** | **String**| Merchant-created code associated with the product, for example, a SKU. Required. | |
| **variationKey** | **String**| Unique identifier for a single variation. System-supplied and read-only. | |
| **productVariation** | [**ProductVariation**](ProductVariation.md)| Properties of the product variation that you are modifying. Required. | [optional] |

### Return type

[**ProductVariation**](ProductVariation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProductVariationLocalizedDeltaPrice"></a>
# **updateProductVariationLocalizedDeltaPrice**
> ProductVariationDeltaPrice updateProductVariationLocalizedDeltaPrice(productCode, variationKey, currencyCode, productVariationDeltaPrice)

Update product variation localized delta price



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductVariationsApi;

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    ProductVariationDeltaPrice productVariationDeltaPrice = new ProductVariationDeltaPrice(); // ProductVariationDeltaPrice | 
    try {
      ProductVariationDeltaPrice result = apiInstance.updateProductVariationLocalizedDeltaPrice(productCode, variationKey, currencyCode, productVariationDeltaPrice);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductVariationsApi#updateProductVariationLocalizedDeltaPrice");
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
| **productCode** | **String**|  | |
| **variationKey** | **String**|  | |
| **currencyCode** | **String**|  | |
| **productVariationDeltaPrice** | [**ProductVariationDeltaPrice**](ProductVariationDeltaPrice.md)|  | [optional] |

### Return type

[**ProductVariationDeltaPrice**](ProductVariationDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProductVariationLocalizedDeltaPrices"></a>
# **updateProductVariationLocalizedDeltaPrices**
> List&lt;ProductVariationDeltaPrice&gt; updateProductVariationLocalizedDeltaPrices(productCode, variationKey, productVariationDeltaPrice)

Update product variation localized delta prices



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductVariationsApi;

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    List<ProductVariationDeltaPrice> productVariationDeltaPrice = Arrays.asList(); // List<ProductVariationDeltaPrice> | 
    try {
      List<ProductVariationDeltaPrice> result = apiInstance.updateProductVariationLocalizedDeltaPrices(productCode, variationKey, productVariationDeltaPrice);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductVariationsApi#updateProductVariationLocalizedDeltaPrices");
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
| **productCode** | **String**|  | |
| **variationKey** | **String**|  | |
| **productVariationDeltaPrice** | [**List&lt;ProductVariationDeltaPrice&gt;**](ProductVariationDeltaPrice.md)|  | [optional] |

### Return type

[**List&lt;ProductVariationDeltaPrice&gt;**](ProductVariationDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProductVariationLocalizedPrice"></a>
# **updateProductVariationLocalizedPrice**
> ProductVariationFixedPrice updateProductVariationLocalizedPrice(productCode, variationKey, currencyCode, productVariationFixedPrice)

Update product variation localized price



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductVariationsApi;

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    ProductVariationFixedPrice productVariationFixedPrice = new ProductVariationFixedPrice(); // ProductVariationFixedPrice | 
    try {
      ProductVariationFixedPrice result = apiInstance.updateProductVariationLocalizedPrice(productCode, variationKey, currencyCode, productVariationFixedPrice);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductVariationsApi#updateProductVariationLocalizedPrice");
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
| **productCode** | **String**|  | |
| **variationKey** | **String**|  | |
| **currencyCode** | **String**|  | |
| **productVariationFixedPrice** | [**ProductVariationFixedPrice**](ProductVariationFixedPrice.md)|  | [optional] |

### Return type

[**ProductVariationFixedPrice**](ProductVariationFixedPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProductVariationLocalizedPrices"></a>
# **updateProductVariationLocalizedPrices**
> List&lt;ProductVariationFixedPrice&gt; updateProductVariationLocalizedPrices(productCode, variationKey, productVariationFixedPrice)

Update product variation localized prices



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductVariationsApi;

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    List<ProductVariationFixedPrice> productVariationFixedPrice = Arrays.asList(); // List<ProductVariationFixedPrice> | 
    try {
      List<ProductVariationFixedPrice> result = apiInstance.updateProductVariationLocalizedPrices(productCode, variationKey, productVariationFixedPrice);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductVariationsApi#updateProductVariationLocalizedPrices");
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
| **productCode** | **String**|  | |
| **variationKey** | **String**|  | |
| **productVariationFixedPrice** | [**List&lt;ProductVariationFixedPrice&gt;**](ProductVariationFixedPrice.md)|  | [optional] |

### Return type

[**List&lt;ProductVariationFixedPrice&gt;**](ProductVariationFixedPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProductVariations"></a>
# **updateProductVariations**
> ProductVariationCollection updateProductVariations(productCode, productVariationCollection)

Update product variations

Modifies multiple product variations for an existing product in one operation. Use to set IsActive to true for               variations that represent configurable options for sale. Also use to change the price or inventory count of an               existing product variation. Read-only options are ignored.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductVariationsApi;

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-supplied code associated with the product, for example, a SKU. Required.
    ProductVariationCollection productVariationCollection = new ProductVariationCollection(); // ProductVariationCollection | Properties of the product variations that you are modifying. Required.
    try {
      ProductVariationCollection result = apiInstance.updateProductVariations(productCode, productVariationCollection);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductVariationsApi#updateProductVariations");
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
| **productCode** | **String**| Merchant-supplied code associated with the product, for example, a SKU. Required. | |
| **productVariationCollection** | [**ProductVariationCollection**](ProductVariationCollection.md)| Properties of the product variations that you are modifying. Required. | [optional] |

### Return type

[**ProductVariationCollection**](ProductVariationCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

