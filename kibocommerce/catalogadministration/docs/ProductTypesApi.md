# ProductTypesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addExtra**](ProductTypesApi.md#addExtra) | **POST** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Extras | Add extra |
| [**addOption**](ProductTypesApi.md#addOption) | **POST** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Options | Add option |
| [**addProductType**](ProductTypesApi.md#addProductType) | **POST** /commerce/catalog/admin/attributedefinition/producttypes | Add product type |
| [**addProperty**](ProductTypesApi.md#addProperty) | **POST** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties | Add product type property |
| [**addVariantProperty**](ProductTypesApi.md#addVariantProperty) | **POST** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/VariantProperties | Add variant property |
| [**deleteExtra**](ProductTypesApi.md#deleteExtra) | **DELETE** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Extras/{attributeFQN} | Delete extra |
| [**deleteOption**](ProductTypesApi.md#deleteOption) | **DELETE** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Options/{attributeFQN} | Delete option |
| [**deleteProductType**](ProductTypesApi.md#deleteProductType) | **DELETE** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId} | Delete product type |
| [**deleteProperty**](ProductTypesApi.md#deleteProperty) | **DELETE** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties/{attributeFQN} | Delete product type property |
| [**deleteVariantProperty**](ProductTypesApi.md#deleteVariantProperty) | **DELETE** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/VariantProperties/{attributeFQN} | Delete variant property |
| [**generateProductVariations**](ProductTypesApi.md#generateProductVariations) | **POST** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/variations | Generate product variations |
| [**getExtra**](ProductTypesApi.md#getExtra) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Extras/{attributeFQN} | Get extra |
| [**getExtras**](ProductTypesApi.md#getExtras) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Extras | Get extras |
| [**getOption**](ProductTypesApi.md#getOption) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Options/{attributeFQN} | Get option |
| [**getOptions**](ProductTypesApi.md#getOptions) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Options | Get options |
| [**getProductType**](ProductTypesApi.md#getProductType) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId} | Get product type |
| [**getProductTypes**](ProductTypesApi.md#getProductTypes) | **GET** /commerce/catalog/admin/attributedefinition/producttypes | Get product types |
| [**getProperties**](ProductTypesApi.md#getProperties) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties | Get product type properties |
| [**getProperty**](ProductTypesApi.md#getProperty) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties/{attributeFQN} | Get product type property |
| [**getVariantProperties**](ProductTypesApi.md#getVariantProperties) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/VariantProperties | Get variant properties |
| [**getVariantProperty**](ProductTypesApi.md#getVariantProperty) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/VariantProperties/{attributeFQN} | Get variant property |
| [**updateExtra**](ProductTypesApi.md#updateExtra) | **PUT** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Extras/{attributeFQN} | Update extra |
| [**updateOption**](ProductTypesApi.md#updateOption) | **PUT** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Options/{attributeFQN} | Update option |
| [**updateProductType**](ProductTypesApi.md#updateProductType) | **PUT** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId} | Update product type |
| [**updateProperty**](ProductTypesApi.md#updateProperty) | **PUT** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties/{attributeFQN} | Update product type property |
| [**updateVariantProperty**](ProductTypesApi.md#updateVariantProperty) | **PUT** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/VariantProperties/{attributeFQN} | Update variant property |


<a name="addExtra"></a>
# **addExtra**
> AttributeInProductType addExtra(productTypeId, attributeInProductType)

Add extra

Add extra.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    AttributeInProductType attributeInProductType = new AttributeInProductType(); // AttributeInProductType | 
    try {
      AttributeInProductType result = apiInstance.addExtra(productTypeId, attributeInProductType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#addExtra");
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
| **productTypeId** | **Integer**|  | |
| **attributeInProductType** | [**AttributeInProductType**](AttributeInProductType.md)|  | [optional] |

### Return type

[**AttributeInProductType**](AttributeInProductType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addOption"></a>
# **addOption**
> AttributeInProductType addOption(productTypeId, attributeInProductType)

Add option

Add option.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    AttributeInProductType attributeInProductType = new AttributeInProductType(); // AttributeInProductType | 
    try {
      AttributeInProductType result = apiInstance.addOption(productTypeId, attributeInProductType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#addOption");
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
| **productTypeId** | **Integer**|  | |
| **attributeInProductType** | [**AttributeInProductType**](AttributeInProductType.md)|  | [optional] |

### Return type

[**AttributeInProductType**](AttributeInProductType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addProductType"></a>
# **addProductType**
> ProductType addProductType(productType)

Add product type

Get product type by Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    ProductType productType = new ProductType(); // ProductType | 
    try {
      ProductType result = apiInstance.addProductType(productType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#addProductType");
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
| **productType** | [**ProductType**](ProductType.md)|  | [optional] |

### Return type

[**ProductType**](ProductType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addProperty"></a>
# **addProperty**
> AttributeInProductType addProperty(productTypeId, attributeInProductType)

Add product type property

Add property.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    AttributeInProductType attributeInProductType = new AttributeInProductType(); // AttributeInProductType | 
    try {
      AttributeInProductType result = apiInstance.addProperty(productTypeId, attributeInProductType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#addProperty");
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
| **productTypeId** | **Integer**|  | |
| **attributeInProductType** | [**AttributeInProductType**](AttributeInProductType.md)|  | [optional] |

### Return type

[**AttributeInProductType**](AttributeInProductType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addVariantProperty"></a>
# **addVariantProperty**
> AttributeInProductType addVariantProperty(productTypeId, attributeInProductType)

Add variant property

Add variant property.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    AttributeInProductType attributeInProductType = new AttributeInProductType(); // AttributeInProductType | 
    try {
      AttributeInProductType result = apiInstance.addVariantProperty(productTypeId, attributeInProductType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#addVariantProperty");
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
| **productTypeId** | **Integer**|  | |
| **attributeInProductType** | [**AttributeInProductType**](AttributeInProductType.md)|  | [optional] |

### Return type

[**AttributeInProductType**](AttributeInProductType.md)

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
> deleteExtra(productTypeId, attributeFQN)

Delete extra

Delete extra.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      apiInstance.deleteExtra(productTypeId, attributeFQN);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#deleteExtra");
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
| **productTypeId** | **Integer**|  | |
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

<a name="deleteOption"></a>
# **deleteOption**
> deleteOption(productTypeId, attributeFQN)

Delete option

Delete option.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      apiInstance.deleteOption(productTypeId, attributeFQN);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#deleteOption");
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
| **productTypeId** | **Integer**|  | |
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

<a name="deleteProductType"></a>
# **deleteProductType**
> deleteProductType(productTypeId)

Delete product type

Delete product type.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    try {
      apiInstance.deleteProductType(productTypeId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#deleteProductType");
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
| **productTypeId** | **Integer**|  | |

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

<a name="deleteProperty"></a>
# **deleteProperty**
> deleteProperty(productTypeId, attributeFQN)

Delete product type property

Delete property.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      apiInstance.deleteProperty(productTypeId, attributeFQN);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#deleteProperty");
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
| **productTypeId** | **Integer**|  | |
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

<a name="deleteVariantProperty"></a>
# **deleteVariantProperty**
> deleteVariantProperty(productTypeId, attributeFQN)

Delete variant property

Delete variant property.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      apiInstance.deleteVariantProperty(productTypeId, attributeFQN);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#deleteVariantProperty");
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
| **productTypeId** | **Integer**|  | |
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

<a name="generateProductVariations"></a>
# **generateProductVariations**
> ProductVariationPagedCollection generateProductVariations(productTypeId, productCode, startIndex, pageSize, sortBy, filter, catalogAdminsProductOption)

Generate product variations



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    String productCode = "productCode_example"; // String | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    List<CatalogAdminsProductOption> catalogAdminsProductOption = Arrays.asList(); // List<CatalogAdminsProductOption> | 
    try {
      ProductVariationPagedCollection result = apiInstance.generateProductVariations(productTypeId, productCode, startIndex, pageSize, sortBy, filter, catalogAdminsProductOption);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#generateProductVariations");
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
| **productTypeId** | **Integer**|  | |
| **productCode** | **String**|  | [optional] |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 0] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **catalogAdminsProductOption** | [**List&lt;CatalogAdminsProductOption&gt;**](CatalogAdminsProductOption.md)|  | [optional] |

### Return type

[**ProductVariationPagedCollection**](ProductVariationPagedCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getExtra"></a>
# **getExtra**
> AttributeInProductType getExtra(productTypeId, attributeFQN)

Get extra

Get extra.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      AttributeInProductType result = apiInstance.getExtra(productTypeId, attributeFQN);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#getExtra");
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
| **productTypeId** | **Integer**|  | |
| **attributeFQN** | **String**|  | |

### Return type

[**AttributeInProductType**](AttributeInProductType.md)

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
> List&lt;AttributeInProductType&gt; getExtras(productTypeId)

Get extras

Get extras.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    try {
      List<AttributeInProductType> result = apiInstance.getExtras(productTypeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#getExtras");
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
| **productTypeId** | **Integer**|  | |

### Return type

[**List&lt;AttributeInProductType&gt;**](AttributeInProductType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOption"></a>
# **getOption**
> AttributeInProductType getOption(productTypeId, attributeFQN)

Get option

Get individual option.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      AttributeInProductType result = apiInstance.getOption(productTypeId, attributeFQN);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#getOption");
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
| **productTypeId** | **Integer**|  | |
| **attributeFQN** | **String**|  | |

### Return type

[**AttributeInProductType**](AttributeInProductType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOptions"></a>
# **getOptions**
> List&lt;AttributeInProductType&gt; getOptions(productTypeId)

Get options

Get options for the product type.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    try {
      List<AttributeInProductType> result = apiInstance.getOptions(productTypeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#getOptions");
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
| **productTypeId** | **Integer**|  | |

### Return type

[**List&lt;AttributeInProductType&gt;**](AttributeInProductType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProductType"></a>
# **getProductType**
> ProductType getProductType(productTypeId)

Get product type

Get product type by Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    try {
      ProductType result = apiInstance.getProductType(productTypeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#getProductType");
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
| **productTypeId** | **Integer**|  | |

### Return type

[**ProductType**](ProductType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProductTypes"></a>
# **getProductTypes**
> ProductTypeCollection getProductTypes(startIndex, pageSize, sortBy, filter, responseGroups)

Get product types

Retrieves a list of product types according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a single query. The default value is 20 and the maximum value is 200.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending or descending order. For example, to sort the results by “ID” ascending then by “CreateDate” descending, use: id asc,createdate desc.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String responseGroups = "responseGroups_example"; // String | Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode.
    try {
      ProductTypeCollection result = apiInstance.getProductTypes(startIndex, pageSize, sortBy, filter, responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#getProductTypes");
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a single query. The default value is 20 and the maximum value is 200. | [optional] [default to 0] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending or descending order. For example, to sort the results by “ID” ascending then by “CreateDate” descending, use: id asc,createdate desc. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **responseGroups** | **String**| Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode. | [optional] |

### Return type

[**ProductTypeCollection**](ProductTypeCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProperties"></a>
# **getProperties**
> List&lt;AttributeInProductType&gt; getProperties(productTypeId)

Get product type properties

Get properties.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    try {
      List<AttributeInProductType> result = apiInstance.getProperties(productTypeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#getProperties");
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
| **productTypeId** | **Integer**|  | |

### Return type

[**List&lt;AttributeInProductType&gt;**](AttributeInProductType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProperty"></a>
# **getProperty**
> AttributeInProductType getProperty(productTypeId, attributeFQN)

Get product type property

Get property.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      AttributeInProductType result = apiInstance.getProperty(productTypeId, attributeFQN);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#getProperty");
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
| **productTypeId** | **Integer**|  | |
| **attributeFQN** | **String**|  | |

### Return type

[**AttributeInProductType**](AttributeInProductType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getVariantProperties"></a>
# **getVariantProperties**
> List&lt;AttributeInProductType&gt; getVariantProperties(productTypeId)

Get variant properties

Get variant properties.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    try {
      List<AttributeInProductType> result = apiInstance.getVariantProperties(productTypeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#getVariantProperties");
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
| **productTypeId** | **Integer**|  | |

### Return type

[**List&lt;AttributeInProductType&gt;**](AttributeInProductType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getVariantProperty"></a>
# **getVariantProperty**
> AttributeInProductType getVariantProperty(productTypeId, attributeFQN)

Get variant property

Get variant property.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      AttributeInProductType result = apiInstance.getVariantProperty(productTypeId, attributeFQN);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#getVariantProperty");
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
| **productTypeId** | **Integer**|  | |
| **attributeFQN** | **String**|  | |

### Return type

[**AttributeInProductType**](AttributeInProductType.md)

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
> AttributeInProductType updateExtra(productTypeId, attributeFQN, attributeInProductType)

Update extra

Update extra.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    String attributeFQN = "attributeFQN_example"; // String | 
    AttributeInProductType attributeInProductType = new AttributeInProductType(); // AttributeInProductType | 
    try {
      AttributeInProductType result = apiInstance.updateExtra(productTypeId, attributeFQN, attributeInProductType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#updateExtra");
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
| **productTypeId** | **Integer**|  | |
| **attributeFQN** | **String**|  | |
| **attributeInProductType** | [**AttributeInProductType**](AttributeInProductType.md)|  | [optional] |

### Return type

[**AttributeInProductType**](AttributeInProductType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateOption"></a>
# **updateOption**
> AttributeInProductType updateOption(productTypeId, attributeFQN, attributeInProductType)

Update option

Update option.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    String attributeFQN = "attributeFQN_example"; // String | 
    AttributeInProductType attributeInProductType = new AttributeInProductType(); // AttributeInProductType | 
    try {
      AttributeInProductType result = apiInstance.updateOption(productTypeId, attributeFQN, attributeInProductType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#updateOption");
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
| **productTypeId** | **Integer**|  | |
| **attributeFQN** | **String**|  | |
| **attributeInProductType** | [**AttributeInProductType**](AttributeInProductType.md)|  | [optional] |

### Return type

[**AttributeInProductType**](AttributeInProductType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProductType"></a>
# **updateProductType**
> ProductType updateProductType(productTypeId, productType)

Update product type

Update product type.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    ProductType productType = new ProductType(); // ProductType | 
    try {
      ProductType result = apiInstance.updateProductType(productTypeId, productType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#updateProductType");
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
| **productTypeId** | **Integer**|  | |
| **productType** | [**ProductType**](ProductType.md)|  | [optional] |

### Return type

[**ProductType**](ProductType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProperty"></a>
# **updateProperty**
> AttributeInProductType updateProperty(productTypeId, attributeFQN, attributeInProductType)

Update product type property

Update property.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    String attributeFQN = "attributeFQN_example"; // String | 
    AttributeInProductType attributeInProductType = new AttributeInProductType(); // AttributeInProductType | 
    try {
      AttributeInProductType result = apiInstance.updateProperty(productTypeId, attributeFQN, attributeInProductType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#updateProperty");
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
| **productTypeId** | **Integer**|  | |
| **attributeFQN** | **String**|  | |
| **attributeInProductType** | [**AttributeInProductType**](AttributeInProductType.md)|  | [optional] |

### Return type

[**AttributeInProductType**](AttributeInProductType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateVariantProperty"></a>
# **updateVariantProperty**
> AttributeInProductType updateVariantProperty(productTypeId, attributeFQN, attributeInProductType)

Update variant property

Update variant property.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductTypesApi;

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

    ProductTypesApi apiInstance = new ProductTypesApi(defaultClient);
    Integer productTypeId = 56; // Integer | 
    String attributeFQN = "attributeFQN_example"; // String | 
    AttributeInProductType attributeInProductType = new AttributeInProductType(); // AttributeInProductType | 
    try {
      AttributeInProductType result = apiInstance.updateVariantProperty(productTypeId, attributeFQN, attributeInProductType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypesApi#updateVariantProperty");
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
| **productTypeId** | **Integer**|  | |
| **attributeFQN** | **String**|  | |
| **attributeInProductType** | [**AttributeInProductType**](AttributeInProductType.md)|  | [optional] |

### Return type

[**AttributeInProductType**](AttributeInProductType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

