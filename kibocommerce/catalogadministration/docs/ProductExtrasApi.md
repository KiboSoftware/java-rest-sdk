# ProductExtrasApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addExtra**](ProductExtrasApi.md#addExtra) | **POST** /commerce/catalog/admin/products/{productCode}/Extras | Add extra |
| [**addExtraValueLocalizedDeltaPrice**](ProductExtrasApi.md#addExtraValueLocalizedDeltaPrice) | **POST** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice | Add extra value localized delta price |
| [**deleteExtra**](ProductExtrasApi.md#deleteExtra) | **DELETE** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN} | Delete extra |
| [**deleteExtraValueLocalizedDeltaPrice**](ProductExtrasApi.md#deleteExtraValueLocalizedDeltaPrice) | **DELETE** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice/{currencyCode} | Delete extra value localized delta price |
| [**getExtra**](ProductExtrasApi.md#getExtra) | **GET** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN} | Get extra |
| [**getExtraValueLocalizedDeltaPrice**](ProductExtrasApi.md#getExtraValueLocalizedDeltaPrice) | **GET** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice/{currencyCode} | Get extra value localized delta price |
| [**getExtraValueLocalizedDeltaPrices**](ProductExtrasApi.md#getExtraValueLocalizedDeltaPrices) | **GET** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice | Get extra value localized delta prices |
| [**getExtras**](ProductExtrasApi.md#getExtras) | **GET** /commerce/catalog/admin/products/{productCode}/Extras | Get extras |
| [**updateExtra**](ProductExtrasApi.md#updateExtra) | **PUT** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN} | Update extra |
| [**updateExtraValueLocalizedDeltaPrice**](ProductExtrasApi.md#updateExtraValueLocalizedDeltaPrice) | **PUT** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice/{currencyCode} | Update extra value localized delta price |
| [**updateExtraValueLocalizedDeltaPrices**](ProductExtrasApi.md#updateExtraValueLocalizedDeltaPrices) | **PUT** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice | Update extra value localized delta prices |


<a name="addExtra"></a>
# **addExtra**
> ProductExtra addExtra(productCode, productExtra)

Add extra

Add extra

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    ProductExtra productExtra = new ProductExtra(); // ProductExtra | 
    try {
      ProductExtra result = apiInstance.addExtra(productCode, productExtra);
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
| **productExtra** | [**ProductExtra**](ProductExtra.md)|  | [optional] |

### Return type

[**ProductExtra**](ProductExtra.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addExtraValueLocalizedDeltaPrice"></a>
# **addExtraValueLocalizedDeltaPrice**
> ProductExtraValueDeltaPrice addExtraValueLocalizedDeltaPrice(productCode, attributeFQN, value, productExtraValueDeltaPrice)

Add extra value localized delta price



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    ProductExtraValueDeltaPrice productExtraValueDeltaPrice = new ProductExtraValueDeltaPrice(); // ProductExtraValueDeltaPrice | 
    try {
      ProductExtraValueDeltaPrice result = apiInstance.addExtraValueLocalizedDeltaPrice(productCode, attributeFQN, value, productExtraValueDeltaPrice);
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
| **productExtraValueDeltaPrice** | [**ProductExtraValueDeltaPrice**](ProductExtraValueDeltaPrice.md)|  | [optional] |

### Return type

[**ProductExtraValueDeltaPrice**](ProductExtraValueDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteExtra"></a>
# **deleteExtra**
> deleteExtra(productCode, attributeFQN)

Delete extra

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteExtraValueLocalizedDeltaPrice"></a>
# **deleteExtraValueLocalizedDeltaPrice**
> deleteExtraValueLocalizedDeltaPrice(productCode, attributeFQN, value, currencyCode)

Delete extra value localized delta price



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getExtra"></a>
# **getExtra**
> ProductExtra getExtra(productCode, attributeFQN)

Get extra

Get individual extra.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      ProductExtra result = apiInstance.getExtra(productCode, attributeFQN);
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

### Return type

[**ProductExtra**](ProductExtra.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getExtraValueLocalizedDeltaPrice"></a>
# **getExtraValueLocalizedDeltaPrice**
> ProductExtraValueDeltaPrice getExtraValueLocalizedDeltaPrice(productCode, attributeFQN, value, currencyCode)

Get extra value localized delta price



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    try {
      ProductExtraValueDeltaPrice result = apiInstance.getExtraValueLocalizedDeltaPrice(productCode, attributeFQN, value, currencyCode);
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

### Return type

[**ProductExtraValueDeltaPrice**](ProductExtraValueDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getExtraValueLocalizedDeltaPrices"></a>
# **getExtraValueLocalizedDeltaPrices**
> List&lt;ProductExtraValueDeltaPrice&gt; getExtraValueLocalizedDeltaPrices(productCode, attributeFQN, value)

Get extra value localized delta prices



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    try {
      List<ProductExtraValueDeltaPrice> result = apiInstance.getExtraValueLocalizedDeltaPrices(productCode, attributeFQN, value);
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

### Return type

[**List&lt;ProductExtraValueDeltaPrice&gt;**](ProductExtraValueDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getExtras"></a>
# **getExtras**
> List&lt;ProductExtra&gt; getExtras(productCode)

Get extras

Get extras for the product.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    try {
      List<ProductExtra> result = apiInstance.getExtras(productCode);
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

### Return type

[**List&lt;ProductExtra&gt;**](ProductExtra.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateExtra"></a>
# **updateExtra**
> ProductExtra updateExtra(productCode, attributeFQN, productExtra)

Update extra

Update extra

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    ProductExtra productExtra = new ProductExtra(); // ProductExtra | 
    try {
      ProductExtra result = apiInstance.updateExtra(productCode, attributeFQN, productExtra);
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
| **productExtra** | [**ProductExtra**](ProductExtra.md)|  | [optional] |

### Return type

[**ProductExtra**](ProductExtra.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateExtraValueLocalizedDeltaPrice"></a>
# **updateExtraValueLocalizedDeltaPrice**
> ProductExtraValueDeltaPrice updateExtraValueLocalizedDeltaPrice(productCode, attributeFQN, value, currencyCode, productExtraValueDeltaPrice)

Update extra value localized delta price



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    ProductExtraValueDeltaPrice productExtraValueDeltaPrice = new ProductExtraValueDeltaPrice(); // ProductExtraValueDeltaPrice | 
    try {
      ProductExtraValueDeltaPrice result = apiInstance.updateExtraValueLocalizedDeltaPrice(productCode, attributeFQN, value, currencyCode, productExtraValueDeltaPrice);
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
| **productExtraValueDeltaPrice** | [**ProductExtraValueDeltaPrice**](ProductExtraValueDeltaPrice.md)|  | [optional] |

### Return type

[**ProductExtraValueDeltaPrice**](ProductExtraValueDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateExtraValueLocalizedDeltaPrices"></a>
# **updateExtraValueLocalizedDeltaPrices**
> List&lt;ProductExtraValueDeltaPrice&gt; updateExtraValueLocalizedDeltaPrices(productCode, attributeFQN, value, productExtraValueDeltaPrice)

Update extra value localized delta prices



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductExtrasApi apiInstance = new ProductExtrasApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    List<ProductExtraValueDeltaPrice> productExtraValueDeltaPrice = Arrays.asList(); // List<ProductExtraValueDeltaPrice> | 
    try {
      List<ProductExtraValueDeltaPrice> result = apiInstance.updateExtraValueLocalizedDeltaPrices(productCode, attributeFQN, value, productExtraValueDeltaPrice);
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
| **productExtraValueDeltaPrice** | [**List&lt;ProductExtraValueDeltaPrice&gt;**](ProductExtraValueDeltaPrice.md)|  | [optional] |

### Return type

[**List&lt;ProductExtraValueDeltaPrice&gt;**](ProductExtraValueDeltaPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

