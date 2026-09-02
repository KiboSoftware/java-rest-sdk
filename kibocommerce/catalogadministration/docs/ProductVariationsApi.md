# ProductVariationsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProductVariationLocalizedDeltaPrice**](ProductVariationsApi.md#addProductVariationLocalizedDeltaPrice) | **POST** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice | Add Product Variation Localized Delta Price |
| [**addProductVariationLocalizedPrice**](ProductVariationsApi.md#addProductVariationLocalizedPrice) | **POST** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice | Add Product Variation Localized Price |
| [**deleteProductVariation**](ProductVariationsApi.md#deleteProductVariation) | **DELETE** /commerce/catalog/admin/products/{productCode}/variations/{variationKey} | Delete Product Variation |
| [**deleteProductVariationLocalizedDeltaPrice**](ProductVariationsApi.md#deleteProductVariationLocalizedDeltaPrice) | **DELETE** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice/{currencyCode} | Delete Product Variation Localized Delta Price |
| [**deleteProductVariationLocalizedPrice**](ProductVariationsApi.md#deleteProductVariationLocalizedPrice) | **DELETE** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice/{currencyCode} | Delete Product Variation Localized Price by Currency |
| [**getProductVariation**](ProductVariationsApi.md#getProductVariation) | **GET** /commerce/catalog/admin/products/{productCode}/variations/{variationKey} | Get Product Variation |
| [**getProductVariationLocalizedDeltaPrice**](ProductVariationsApi.md#getProductVariationLocalizedDeltaPrice) | **GET** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice/{currencyCode} | Get Product Variation Localized Delta Price |
| [**getProductVariationLocalizedDeltaPrices**](ProductVariationsApi.md#getProductVariationLocalizedDeltaPrices) | **GET** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice | Get Product Variation Localized Delta Prices |
| [**getProductVariationLocalizedPrice**](ProductVariationsApi.md#getProductVariationLocalizedPrice) | **GET** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice/{currencyCode} | Get Product Variation Localized Price by Currency |
| [**getProductVariationLocalizedPrices**](ProductVariationsApi.md#getProductVariationLocalizedPrices) | **GET** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice | Get Product Variation Localized Prices |
| [**getProductVariations**](ProductVariationsApi.md#getProductVariations) | **GET** /commerce/catalog/admin/products/{productCode}/variations | Get Product Variations |
| [**updateProductVariation**](ProductVariationsApi.md#updateProductVariation) | **PUT** /commerce/catalog/admin/products/{productCode}/variations/{variationKey} | Update Product Variation |
| [**updateProductVariationLocalizedDeltaPrice**](ProductVariationsApi.md#updateProductVariationLocalizedDeltaPrice) | **PUT** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice/{currencyCode} | Update Product Variation Localized Delta Price |
| [**updateProductVariationLocalizedDeltaPrices**](ProductVariationsApi.md#updateProductVariationLocalizedDeltaPrices) | **PUT** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice | Update Product Variation Localized Delta Prices |
| [**updateProductVariationLocalizedPrice**](ProductVariationsApi.md#updateProductVariationLocalizedPrice) | **PUT** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice/{currencyCode} | Update Product Variation Localized Price by Currency |
| [**updateProductVariationLocalizedPrices**](ProductVariationsApi.md#updateProductVariationLocalizedPrices) | **PUT** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice | Update Product Variation Localized Prices |
| [**updateProductVariations**](ProductVariationsApi.md#updateProductVariations) | **PUT** /commerce/catalog/admin/products/{productCode}/variations | Update Product Variations |


<a name="addProductVariationLocalizedDeltaPrice"></a>
# **addProductVariationLocalizedDeltaPrice**
> ProductVariationDeltaPrice addProductVariationLocalizedDeltaPrice(productCode, variationKey, responseFields, productVariationDeltaPrice)

Add Product Variation Localized Delta Price

Add a product variation localized delta price.

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductVariationDeltaPrice productVariationDeltaPrice = new ProductVariationDeltaPrice(); // ProductVariationDeltaPrice | 
    try {
      ProductVariationDeltaPrice result = apiInstance.addProductVariationLocalizedDeltaPrice(productCode, variationKey, responseFields, productVariationDeltaPrice);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productVariationDeltaPrice** | [**ProductVariationDeltaPrice**](ProductVariationDeltaPrice.md)|  | [optional] |

### Return type

[**ProductVariationDeltaPrice**](ProductVariationDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addProductVariationLocalizedPrice"></a>
# **addProductVariationLocalizedPrice**
> ProductVariationFixedPrice addProductVariationLocalizedPrice(productCode, variationKey, responseFields, productVariationFixedPrice)

Add Product Variation Localized Price

Add a product variation localized price.

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductVariationFixedPrice productVariationFixedPrice = new ProductVariationFixedPrice(); // ProductVariationFixedPrice | 
    try {
      ProductVariationFixedPrice result = apiInstance.addProductVariationLocalizedPrice(productCode, variationKey, responseFields, productVariationFixedPrice);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productVariationFixedPrice** | [**ProductVariationFixedPrice**](ProductVariationFixedPrice.md)|  | [optional] |

### Return type

[**ProductVariationFixedPrice**](ProductVariationFixedPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteProductVariation"></a>
# **deleteProductVariation**
> deleteProductVariation(productCode, variationKey)

Delete Product Variation

Deletes an existing product variation. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteProductVariationLocalizedDeltaPrice"></a>
# **deleteProductVariationLocalizedDeltaPrice**
> deleteProductVariationLocalizedDeltaPrice(productCode, variationKey, currencyCode)

Delete Product Variation Localized Delta Price

Delete the product variation localized delta prices for a specific currency.

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteProductVariationLocalizedPrice"></a>
# **deleteProductVariationLocalizedPrice**
> deleteProductVariationLocalizedPrice(productCode, variationKey, currencyCode)

Delete Product Variation Localized Price by Currency

Delete the product variation localized price for a specific currency code.

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProductVariation"></a>
# **getProductVariation**
> ProductVariation getProductVariation(productCode, variationKey, responseFields)

Get Product Variation

Retrieves an existing product variation for a specific product and variation key. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-created code associated with the product, for example, a SKU. Required.
    String variationKey = "variationKey_example"; // String | Unique identifier for a single product variation. System-supplied and read-only.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ProductVariation result = apiInstance.getProductVariation(productCode, variationKey, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ProductVariation**](ProductVariation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProductVariationLocalizedDeltaPrice"></a>
# **getProductVariationLocalizedDeltaPrice**
> ProductVariationDeltaPrice getProductVariationLocalizedDeltaPrice(productCode, variationKey, currencyCode, responseFields)

Get Product Variation Localized Delta Price

Retrieve the product variation localized delta prices for a specific currency.

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ProductVariationDeltaPrice result = apiInstance.getProductVariationLocalizedDeltaPrice(productCode, variationKey, currencyCode, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ProductVariationDeltaPrice**](ProductVariationDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProductVariationLocalizedDeltaPrices"></a>
# **getProductVariationLocalizedDeltaPrices**
> List&lt;ProductVariationDeltaPrice&gt; getProductVariationLocalizedDeltaPrices(productCode, variationKey, responseFields)

Get Product Variation Localized Delta Prices

Get product variation localized delta prices.

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ProductVariationDeltaPrice> result = apiInstance.getProductVariationLocalizedDeltaPrices(productCode, variationKey, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;ProductVariationDeltaPrice&gt;**](ProductVariationDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProductVariationLocalizedPrice"></a>
# **getProductVariationLocalizedPrice**
> ProductVariationFixedPrice getProductVariationLocalizedPrice(productCode, variationKey, currencyCode, responseFields)

Get Product Variation Localized Price by Currency

Get the product variation localized price for a specific currency code.

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ProductVariationFixedPrice result = apiInstance.getProductVariationLocalizedPrice(productCode, variationKey, currencyCode, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ProductVariationFixedPrice**](ProductVariationFixedPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProductVariationLocalizedPrices"></a>
# **getProductVariationLocalizedPrices**
> List&lt;ProductVariationFixedPrice&gt; getProductVariationLocalizedPrices(productCode, variationKey, responseFields)

Get Product Variation Localized Prices

Get product variation localized prices.

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ProductVariationFixedPrice> result = apiInstance.getProductVariationLocalizedPrices(productCode, variationKey, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;ProductVariationFixedPrice&gt;**](ProductVariationFixedPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProductVariations"></a>
# **getProductVariations**
> ProductVariationPagedCollection getProductVariations(productCode, startIndex, pageSize, sortBy, filter, responseFields)

Get Product Variations

Retrieves a paged list of product variations for a specific product according to any specified filter criteria and sort options. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-supplied code associated with the product, for example, a SKU. Required.
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ProductVariationPagedCollection result = apiInstance.getProductVariations(productCode, startIndex, pageSize, sortBy, filter, responseFields);
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] [default to 0] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ProductVariationPagedCollection**](ProductVariationPagedCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProductVariation"></a>
# **updateProductVariation**
> ProductVariation updateProductVariation(productCode, variationKey, responseFields, productVariation)

Update Product Variation

Modifies an existing product variation specified by its variation key. Typically used to change the price or inventory count of an existing product variation. Read-only options are ignored.&lt;br&gt;&lt;br&gt;This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-created code associated with the product, for example, a SKU. Required.
    String variationKey = "variationKey_example"; // String | Unique identifier for a single variation. System-supplied and read-only.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductVariation productVariation = new ProductVariation(); // ProductVariation | Properties of the product variation that you are modifying. Required.
    try {
      ProductVariation result = apiInstance.updateProductVariation(productCode, variationKey, responseFields, productVariation);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productVariation** | [**ProductVariation**](ProductVariation.md)| Properties of the product variation that you are modifying. Required. | [optional] |

### Return type

[**ProductVariation**](ProductVariation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProductVariationLocalizedDeltaPrice"></a>
# **updateProductVariationLocalizedDeltaPrice**
> ProductVariationDeltaPrice updateProductVariationLocalizedDeltaPrice(productCode, variationKey, currencyCode, responseFields, productVariationDeltaPrice)

Update Product Variation Localized Delta Price

Update the product variation localized delta prices for a specific currency.

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductVariationDeltaPrice productVariationDeltaPrice = new ProductVariationDeltaPrice(); // ProductVariationDeltaPrice | 
    try {
      ProductVariationDeltaPrice result = apiInstance.updateProductVariationLocalizedDeltaPrice(productCode, variationKey, currencyCode, responseFields, productVariationDeltaPrice);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productVariationDeltaPrice** | [**ProductVariationDeltaPrice**](ProductVariationDeltaPrice.md)|  | [optional] |

### Return type

[**ProductVariationDeltaPrice**](ProductVariationDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProductVariationLocalizedDeltaPrices"></a>
# **updateProductVariationLocalizedDeltaPrices**
> List&lt;ProductVariationDeltaPrice&gt; updateProductVariationLocalizedDeltaPrices(productCode, variationKey, responseFields, productVariationDeltaPrice)

Update Product Variation Localized Delta Prices

Update product variation localized delta prices.

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ProductVariationDeltaPrice> productVariationDeltaPrice = Arrays.asList(); // List<ProductVariationDeltaPrice> | 
    try {
      List<ProductVariationDeltaPrice> result = apiInstance.updateProductVariationLocalizedDeltaPrices(productCode, variationKey, responseFields, productVariationDeltaPrice);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productVariationDeltaPrice** | [**List&lt;ProductVariationDeltaPrice&gt;**](ProductVariationDeltaPrice.md)|  | [optional] |

### Return type

[**List&lt;ProductVariationDeltaPrice&gt;**](ProductVariationDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProductVariationLocalizedPrice"></a>
# **updateProductVariationLocalizedPrice**
> ProductVariationFixedPrice updateProductVariationLocalizedPrice(productCode, variationKey, currencyCode, responseFields, productVariationFixedPrice)

Update Product Variation Localized Price by Currency

Update the product variation localized price for a specific currency code.

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductVariationFixedPrice productVariationFixedPrice = new ProductVariationFixedPrice(); // ProductVariationFixedPrice | 
    try {
      ProductVariationFixedPrice result = apiInstance.updateProductVariationLocalizedPrice(productCode, variationKey, currencyCode, responseFields, productVariationFixedPrice);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productVariationFixedPrice** | [**ProductVariationFixedPrice**](ProductVariationFixedPrice.md)|  | [optional] |

### Return type

[**ProductVariationFixedPrice**](ProductVariationFixedPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProductVariationLocalizedPrices"></a>
# **updateProductVariationLocalizedPrices**
> List&lt;ProductVariationFixedPrice&gt; updateProductVariationLocalizedPrices(productCode, variationKey, responseFields, productVariationFixedPrice)

Update Product Variation Localized Prices

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationKey = "variationKey_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ProductVariationFixedPrice> productVariationFixedPrice = Arrays.asList(); // List<ProductVariationFixedPrice> | 
    try {
      List<ProductVariationFixedPrice> result = apiInstance.updateProductVariationLocalizedPrices(productCode, variationKey, responseFields, productVariationFixedPrice);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productVariationFixedPrice** | [**List&lt;ProductVariationFixedPrice&gt;**](ProductVariationFixedPrice.md)|  | [optional] |

### Return type

[**List&lt;ProductVariationFixedPrice&gt;**](ProductVariationFixedPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProductVariations"></a>
# **updateProductVariations**
> ProductVariationCollection updateProductVariations(productCode, responseFields, productVariationCollection)

Update Product Variations

Modifies multiple product variations for an existing product in one operation. Use to set IsActive to true for variations that represent configurable options for sale. Also use to change the price or inventory count of an existing product variation. Read-only options are ignored.&lt;br&gt;&lt;br&gt;This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

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

    ProductVariationsApi apiInstance = new ProductVariationsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-supplied code associated with the product, for example, a SKU. Required.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductVariationCollection productVariationCollection = new ProductVariationCollection(); // ProductVariationCollection | Properties of the product variations that you are modifying. Required.
    try {
      ProductVariationCollection result = apiInstance.updateProductVariations(productCode, responseFields, productVariationCollection);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productVariationCollection** | [**ProductVariationCollection**](ProductVariationCollection.md)| Properties of the product variations that you are modifying. Required. | [optional] |

### Return type

[**ProductVariationCollection**](ProductVariationCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

