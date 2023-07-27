# ProductPropertiesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProperty**](ProductPropertiesApi.md#addProperty) | **POST** /commerce/catalog/admin/products/{productCode}/Properties | Add property |
| [**addPropertyValueLocalizedContent**](ProductPropertiesApi.md#addPropertyValueLocalizedContent) | **POST** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent | Add property value localized content |
| [**deleteProperty**](ProductPropertiesApi.md#deleteProperty) | **DELETE** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN} | Delete property |
| [**deletePropertyValueLocalizedContent**](ProductPropertiesApi.md#deletePropertyValueLocalizedContent) | **DELETE** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent/{localeCode} | Delete property value localized content |
| [**getProperties**](ProductPropertiesApi.md#getProperties) | **GET** /commerce/catalog/admin/products/{productCode}/Properties | Get properties |
| [**getProperty**](ProductPropertiesApi.md#getProperty) | **GET** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN} | Get property |
| [**getPropertyValueLocalizedContent**](ProductPropertiesApi.md#getPropertyValueLocalizedContent) | **GET** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent/{localeCode} | Get property value localized content |
| [**getPropertyValueLocalizedContents**](ProductPropertiesApi.md#getPropertyValueLocalizedContents) | **GET** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent | Get property value localized contents |
| [**updateProperty**](ProductPropertiesApi.md#updateProperty) | **PUT** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN} | Update property |
| [**updatePropertyValueLocalizedContent**](ProductPropertiesApi.md#updatePropertyValueLocalizedContent) | **PUT** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent/{localeCode} | Update property value localized content |
| [**updatePropertyValueLocalizedContents**](ProductPropertiesApi.md#updatePropertyValueLocalizedContents) | **PUT** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent | Update property value localized contents |


<a name="addProperty"></a>
# **addProperty**
> CatalogAdminsProductProperty addProperty(productCode, catalogAdminsProductProperty)

Add property

Add property

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductPropertiesApi;

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    CatalogAdminsProductProperty catalogAdminsProductProperty = new CatalogAdminsProductProperty(); // CatalogAdminsProductProperty | 
    try {
      CatalogAdminsProductProperty result = apiInstance.addProperty(productCode, catalogAdminsProductProperty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPropertiesApi#addProperty");
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
| **catalogAdminsProductProperty** | [**CatalogAdminsProductProperty**](CatalogAdminsProductProperty.md)|  | [optional] |

### Return type

[**CatalogAdminsProductProperty**](CatalogAdminsProductProperty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addPropertyValueLocalizedContent"></a>
# **addPropertyValueLocalizedContent**
> ProductPropertyValueLocalizedContent addPropertyValueLocalizedContent(productCode, attributeFQN, value, productPropertyValueLocalizedContent)

Add property value localized content



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductPropertiesApi;

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent = new ProductPropertyValueLocalizedContent(); // ProductPropertyValueLocalizedContent | 
    try {
      ProductPropertyValueLocalizedContent result = apiInstance.addPropertyValueLocalizedContent(productCode, attributeFQN, value, productPropertyValueLocalizedContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPropertiesApi#addPropertyValueLocalizedContent");
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
| **productPropertyValueLocalizedContent** | [**ProductPropertyValueLocalizedContent**](ProductPropertyValueLocalizedContent.md)|  | [optional] |

### Return type

[**ProductPropertyValueLocalizedContent**](ProductPropertyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteProperty"></a>
# **deleteProperty**
> deleteProperty(productCode, attributeFQN)

Delete property

Delete Property

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductPropertiesApi;

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      apiInstance.deleteProperty(productCode, attributeFQN);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPropertiesApi#deleteProperty");
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

<a name="deletePropertyValueLocalizedContent"></a>
# **deletePropertyValueLocalizedContent**
> deletePropertyValueLocalizedContent(productCode, attributeFQN, value, localeCode)

Delete property value localized content



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductPropertiesApi;

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String localeCode = "localeCode_example"; // String | 
    try {
      apiInstance.deletePropertyValueLocalizedContent(productCode, attributeFQN, value, localeCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPropertiesApi#deletePropertyValueLocalizedContent");
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
| **localeCode** | **String**|  | |

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

<a name="getProperties"></a>
# **getProperties**
> List&lt;CatalogAdminsProductProperty&gt; getProperties(productCode)

Get properties

Get properties for the product

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductPropertiesApi;

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    try {
      List<CatalogAdminsProductProperty> result = apiInstance.getProperties(productCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPropertiesApi#getProperties");
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

[**List&lt;CatalogAdminsProductProperty&gt;**](CatalogAdminsProductProperty.md)

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
> CatalogAdminsProductProperty getProperty(productCode, attributeFQN)

Get property

Get individual property

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductPropertiesApi;

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      CatalogAdminsProductProperty result = apiInstance.getProperty(productCode, attributeFQN);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPropertiesApi#getProperty");
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

[**CatalogAdminsProductProperty**](CatalogAdminsProductProperty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPropertyValueLocalizedContent"></a>
# **getPropertyValueLocalizedContent**
> ProductPropertyValueLocalizedContent getPropertyValueLocalizedContent(productCode, attributeFQN, value, localeCode)

Get property value localized content



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductPropertiesApi;

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String localeCode = "localeCode_example"; // String | 
    try {
      ProductPropertyValueLocalizedContent result = apiInstance.getPropertyValueLocalizedContent(productCode, attributeFQN, value, localeCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPropertiesApi#getPropertyValueLocalizedContent");
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
| **localeCode** | **String**|  | |

### Return type

[**ProductPropertyValueLocalizedContent**](ProductPropertyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPropertyValueLocalizedContents"></a>
# **getPropertyValueLocalizedContents**
> List&lt;ProductPropertyValueLocalizedContent&gt; getPropertyValueLocalizedContents(productCode, attributeFQN, value)

Get property value localized contents



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductPropertiesApi;

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    try {
      List<ProductPropertyValueLocalizedContent> result = apiInstance.getPropertyValueLocalizedContents(productCode, attributeFQN, value);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPropertiesApi#getPropertyValueLocalizedContents");
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

[**List&lt;ProductPropertyValueLocalizedContent&gt;**](ProductPropertyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProperty"></a>
# **updateProperty**
> CatalogAdminsProductProperty updateProperty(productCode, attributeFQN, catalogAdminsProductProperty)

Update property

Update property

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductPropertiesApi;

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    CatalogAdminsProductProperty catalogAdminsProductProperty = new CatalogAdminsProductProperty(); // CatalogAdminsProductProperty | 
    try {
      CatalogAdminsProductProperty result = apiInstance.updateProperty(productCode, attributeFQN, catalogAdminsProductProperty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPropertiesApi#updateProperty");
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
| **catalogAdminsProductProperty** | [**CatalogAdminsProductProperty**](CatalogAdminsProductProperty.md)|  | [optional] |

### Return type

[**CatalogAdminsProductProperty**](CatalogAdminsProductProperty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updatePropertyValueLocalizedContent"></a>
# **updatePropertyValueLocalizedContent**
> ProductPropertyValueLocalizedContent updatePropertyValueLocalizedContent(productCode, attributeFQN, value, localeCode, productPropertyValueLocalizedContent)

Update property value localized content



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductPropertiesApi;

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String localeCode = "localeCode_example"; // String | 
    ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent = new ProductPropertyValueLocalizedContent(); // ProductPropertyValueLocalizedContent | 
    try {
      ProductPropertyValueLocalizedContent result = apiInstance.updatePropertyValueLocalizedContent(productCode, attributeFQN, value, localeCode, productPropertyValueLocalizedContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPropertiesApi#updatePropertyValueLocalizedContent");
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
| **localeCode** | **String**|  | |
| **productPropertyValueLocalizedContent** | [**ProductPropertyValueLocalizedContent**](ProductPropertyValueLocalizedContent.md)|  | [optional] |

### Return type

[**ProductPropertyValueLocalizedContent**](ProductPropertyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updatePropertyValueLocalizedContents"></a>
# **updatePropertyValueLocalizedContents**
> List&lt;ProductPropertyValueLocalizedContent&gt; updatePropertyValueLocalizedContents(productCode, attributeFQN, value, productPropertyValueLocalizedContent)

Update property value localized contents



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductPropertiesApi;

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    List<ProductPropertyValueLocalizedContent> productPropertyValueLocalizedContent = Arrays.asList(); // List<ProductPropertyValueLocalizedContent> | 
    try {
      List<ProductPropertyValueLocalizedContent> result = apiInstance.updatePropertyValueLocalizedContents(productCode, attributeFQN, value, productPropertyValueLocalizedContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPropertiesApi#updatePropertyValueLocalizedContents");
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
| **productPropertyValueLocalizedContent** | [**List&lt;ProductPropertyValueLocalizedContent&gt;**](ProductPropertyValueLocalizedContent.md)|  | [optional] |

### Return type

[**List&lt;ProductPropertyValueLocalizedContent&gt;**](ProductPropertyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

