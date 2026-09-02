# ProductExtrasApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addExtra**](ProductExtrasApi.md#addExtra) | **POST** /commerce/catalog/admin/products/{productCode}/Extras | Add Product Extra |
| [**addExtraValueLocalizedDeltaPrice**](ProductExtrasApi.md#addExtraValueLocalizedDeltaPrice) | **POST** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice | Add Extra Localized Delta Price |
| [**deleteExtra**](ProductExtrasApi.md#deleteExtra) | **DELETE** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN} | Delete Product Extra |
| [**deleteExtraValueLocalizedDeltaPrice**](ProductExtrasApi.md#deleteExtraValueLocalizedDeltaPrice) | **DELETE** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice/{currencyCode} | Delete Extra Localized Delta Price |
| [**getExtra**](ProductExtrasApi.md#getExtra) | **GET** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN} | Get Product Extra |
| [**getExtraValueLocalizedDeltaPrice**](ProductExtrasApi.md#getExtraValueLocalizedDeltaPrice) | **GET** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice/{currencyCode} | Get Extra Localized Delta Price by Currency |
| [**getExtraValueLocalizedDeltaPrices**](ProductExtrasApi.md#getExtraValueLocalizedDeltaPrices) | **GET** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice | Get Extra Localized Delta Price |
| [**getExtras**](ProductExtrasApi.md#getExtras) | **GET** /commerce/catalog/admin/products/{productCode}/Extras | Get Product Extras |
| [**updateExtra**](ProductExtrasApi.md#updateExtra) | **PUT** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN} | Update Product Extra |
| [**updateExtraValueLocalizedDeltaPrice**](ProductExtrasApi.md#updateExtraValueLocalizedDeltaPrice) | **PUT** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice/{currencyCode} | Update Extra Localized Delta Price by Currency |
| [**updateExtraValueLocalizedDeltaPrices**](ProductExtrasApi.md#updateExtraValueLocalizedDeltaPrices) | **PUT** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice | Update Extra Localized Delta Price |


<a name="addExtra"></a>
# **addExtra**
> ProductExtra addExtra(productCode, responseFields, productExtra)

Add Product Extra

Add extra. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductExtrasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductExtra productExtra = new ProductExtra(); // ProductExtra | 
    try {
      ProductExtra result = apiInstance.addExtra(productCode, responseFields, productExtra);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductExtrasApi#addExtra");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productExtra** | [**ProductExtra**](ProductExtra.md)|  | [optional] |

### Return type

[**ProductExtra**](ProductExtra.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addExtraValueLocalizedDeltaPrice"></a>
# **addExtraValueLocalizedDeltaPrice**
> ProductExtraValueDeltaPrice addExtraValueLocalizedDeltaPrice(productCode, attributeFQN, value, responseFields, productExtraValueDeltaPrice)

Add Extra Localized Delta Price

Add a extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductExtrasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductExtraValueDeltaPrice productExtraValueDeltaPrice = new ProductExtraValueDeltaPrice(); // ProductExtraValueDeltaPrice | 
    try {
      ProductExtraValueDeltaPrice result = apiInstance.addExtraValueLocalizedDeltaPrice(productCode, attributeFQN, value, responseFields, productExtraValueDeltaPrice);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductExtrasApi#addExtraValueLocalizedDeltaPrice");
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
| **attributeFQN** | **String**|  | |
| **value** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productExtraValueDeltaPrice** | [**ProductExtraValueDeltaPrice**](ProductExtraValueDeltaPrice.md)|  | [optional] |

### Return type

[**ProductExtraValueDeltaPrice**](ProductExtraValueDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteExtra"></a>
# **deleteExtra**
> deleteExtra(productCode, attributeFQN)

Delete Product Extra

Delete extra

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductExtrasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      apiInstance.deleteExtra(productCode, attributeFQN);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductExtrasApi#deleteExtra");
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
| **attributeFQN** | **String**|  | |

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

<a name="deleteExtraValueLocalizedDeltaPrice"></a>
# **deleteExtraValueLocalizedDeltaPrice**
> deleteExtraValueLocalizedDeltaPrice(productCode, attributeFQN, value, currencyCode)

Delete Extra Localized Delta Price

Delete extra value localized delta price.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductExtrasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    try {
      apiInstance.deleteExtraValueLocalizedDeltaPrice(productCode, attributeFQN, value, currencyCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductExtrasApi#deleteExtraValueLocalizedDeltaPrice");
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
| **attributeFQN** | **String**|  | |
| **value** | **String**|  | |
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

<a name="getExtra"></a>
# **getExtra**
> ProductExtra getExtra(productCode, attributeFQN, responseFields)

Get Product Extra

Get individual extra. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductExtrasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ProductExtra result = apiInstance.getExtra(productCode, attributeFQN, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductExtrasApi#getExtra");
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
| **attributeFQN** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ProductExtra**](ProductExtra.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getExtraValueLocalizedDeltaPrice"></a>
# **getExtraValueLocalizedDeltaPrice**
> ProductExtraValueDeltaPrice getExtraValueLocalizedDeltaPrice(productCode, attributeFQN, value, currencyCode, responseFields)

Get Extra Localized Delta Price by Currency

Get extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductExtrasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ProductExtraValueDeltaPrice result = apiInstance.getExtraValueLocalizedDeltaPrice(productCode, attributeFQN, value, currencyCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductExtrasApi#getExtraValueLocalizedDeltaPrice");
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
| **attributeFQN** | **String**|  | |
| **value** | **String**|  | |
| **currencyCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ProductExtraValueDeltaPrice**](ProductExtraValueDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getExtraValueLocalizedDeltaPrices"></a>
# **getExtraValueLocalizedDeltaPrices**
> List&lt;ProductExtraValueDeltaPrice&gt; getExtraValueLocalizedDeltaPrices(productCode, attributeFQN, value, responseFields)

Get Extra Localized Delta Price

Get extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductExtrasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ProductExtraValueDeltaPrice> result = apiInstance.getExtraValueLocalizedDeltaPrices(productCode, attributeFQN, value, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductExtrasApi#getExtraValueLocalizedDeltaPrices");
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
| **attributeFQN** | **String**|  | |
| **value** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;ProductExtraValueDeltaPrice&gt;**](ProductExtraValueDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getExtras"></a>
# **getExtras**
> List&lt;ProductExtra&gt; getExtras(productCode, responseFields)

Get Product Extras

Get extras for the product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductExtrasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ProductExtra> result = apiInstance.getExtras(productCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductExtrasApi#getExtras");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;ProductExtra&gt;**](ProductExtra.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateExtra"></a>
# **updateExtra**
> ProductExtra updateExtra(productCode, attributeFQN, responseFields, productExtra)

Update Product Extra

Update extra. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductExtrasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductExtra productExtra = new ProductExtra(); // ProductExtra | 
    try {
      ProductExtra result = apiInstance.updateExtra(productCode, attributeFQN, responseFields, productExtra);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductExtrasApi#updateExtra");
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
| **attributeFQN** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productExtra** | [**ProductExtra**](ProductExtra.md)|  | [optional] |

### Return type

[**ProductExtra**](ProductExtra.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateExtraValueLocalizedDeltaPrice"></a>
# **updateExtraValueLocalizedDeltaPrice**
> ProductExtraValueDeltaPrice updateExtraValueLocalizedDeltaPrice(productCode, attributeFQN, value, currencyCode, responseFields, productExtraValueDeltaPrice)

Update Extra Localized Delta Price by Currency

Update extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductExtrasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductExtraValueDeltaPrice productExtraValueDeltaPrice = new ProductExtraValueDeltaPrice(); // ProductExtraValueDeltaPrice | 
    try {
      ProductExtraValueDeltaPrice result = apiInstance.updateExtraValueLocalizedDeltaPrice(productCode, attributeFQN, value, currencyCode, responseFields, productExtraValueDeltaPrice);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductExtrasApi#updateExtraValueLocalizedDeltaPrice");
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
| **attributeFQN** | **String**|  | |
| **value** | **String**|  | |
| **currencyCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productExtraValueDeltaPrice** | [**ProductExtraValueDeltaPrice**](ProductExtraValueDeltaPrice.md)|  | [optional] |

### Return type

[**ProductExtraValueDeltaPrice**](ProductExtraValueDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateExtraValueLocalizedDeltaPrices"></a>
# **updateExtraValueLocalizedDeltaPrices**
> List&lt;ProductExtraValueDeltaPrice&gt; updateExtraValueLocalizedDeltaPrices(productCode, attributeFQN, value, responseFields, productExtraValueDeltaPrice)

Update Extra Localized Delta Price

Update extra value localized delta price. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductExtrasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ProductExtraValueDeltaPrice> productExtraValueDeltaPrice = Arrays.asList(); // List<ProductExtraValueDeltaPrice> | 
    try {
      List<ProductExtraValueDeltaPrice> result = apiInstance.updateExtraValueLocalizedDeltaPrices(productCode, attributeFQN, value, responseFields, productExtraValueDeltaPrice);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductExtrasApi#updateExtraValueLocalizedDeltaPrices");
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
| **attributeFQN** | **String**|  | |
| **value** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productExtraValueDeltaPrice** | [**List&lt;ProductExtraValueDeltaPrice&gt;**](ProductExtraValueDeltaPrice.md)|  | [optional] |

### Return type

[**List&lt;ProductExtraValueDeltaPrice&gt;**](ProductExtraValueDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

