# ProductPropertiesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProperty**](ProductPropertiesApi.md#addProperty) | **POST** /commerce/catalog/admin/products/{productCode}/Properties | Add Product Property |
| [**addPropertyValueLocalizedContent**](ProductPropertiesApi.md#addPropertyValueLocalizedContent) | **POST** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent | Add Product Property Localized Content |
| [**deleteProperty**](ProductPropertiesApi.md#deleteProperty) | **DELETE** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN} | Delete Product Property |
| [**deletePropertyValueLocalizedContent**](ProductPropertiesApi.md#deletePropertyValueLocalizedContent) | **DELETE** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent/{localeCode} | Delete Product Property Localized Content by Locale |
| [**getProperties**](ProductPropertiesApi.md#getProperties) | **GET** /commerce/catalog/admin/products/{productCode}/Properties | Get Product Properties |
| [**getProperty**](ProductPropertiesApi.md#getProperty) | **GET** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN} | Get Product Property |
| [**getPropertyValueLocalizedContent**](ProductPropertiesApi.md#getPropertyValueLocalizedContent) | **GET** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent/{localeCode} | Get Product Property Localized Content by Locale |
| [**getPropertyValueLocalizedContents**](ProductPropertiesApi.md#getPropertyValueLocalizedContents) | **GET** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent | Get Product Property Localized Contents |
| [**updateProperty**](ProductPropertiesApi.md#updateProperty) | **PUT** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN} | Update Product Property |
| [**updatePropertyValueLocalizedContent**](ProductPropertiesApi.md#updatePropertyValueLocalizedContent) | **PUT** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent/{localeCode} | Update Product Property Localized Content by Locale |
| [**updatePropertyValueLocalizedContents**](ProductPropertiesApi.md#updatePropertyValueLocalizedContents) | **PUT** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent | Update Product Property Localized Content |


<a name="addProperty"></a>
# **addProperty**
> CatalogAdminsProductProperty addProperty(productCode, batchJobCode, responseFields, catalogAdminsProductProperty)

Add Product Property

Add a property to a product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String batchJobCode = "batchJobCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsProductProperty catalogAdminsProductProperty = new CatalogAdminsProductProperty(); // CatalogAdminsProductProperty | 
    try {
      CatalogAdminsProductProperty result = apiInstance.addProperty(productCode, batchJobCode, responseFields, catalogAdminsProductProperty);
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
| **batchJobCode** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsProductProperty** | [**CatalogAdminsProductProperty**](CatalogAdminsProductProperty.md)|  | [optional] |

### Return type

[**CatalogAdminsProductProperty**](CatalogAdminsProductProperty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addPropertyValueLocalizedContent"></a>
# **addPropertyValueLocalizedContent**
> ProductPropertyValueLocalizedContent addPropertyValueLocalizedContent(productCode, attributeFQN, value, responseFields, productPropertyValueLocalizedContent)

Add Product Property Localized Content

Add property value localized content.

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent = new ProductPropertyValueLocalizedContent(); // ProductPropertyValueLocalizedContent | 
    try {
      ProductPropertyValueLocalizedContent result = apiInstance.addPropertyValueLocalizedContent(productCode, attributeFQN, value, responseFields, productPropertyValueLocalizedContent);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productPropertyValueLocalizedContent** | [**ProductPropertyValueLocalizedContent**](ProductPropertyValueLocalizedContent.md)|  | [optional] |

### Return type

[**ProductPropertyValueLocalizedContent**](ProductPropertyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteProperty"></a>
# **deleteProperty**
> deleteProperty(productCode, attributeFQN, batchJobCode)

Delete Product Property

Delete a specific product property.

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String batchJobCode = "batchJobCode_example"; // String | 
    try {
      apiInstance.deleteProperty(productCode, attributeFQN, batchJobCode);
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
| **batchJobCode** | **String**|  | [optional] |

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

<a name="deletePropertyValueLocalizedContent"></a>
# **deletePropertyValueLocalizedContent**
> deletePropertyValueLocalizedContent(productCode, attributeFQN, value, localeCode)

Delete Product Property Localized Content by Locale

Delete property value localized content by locale code.

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProperties"></a>
# **getProperties**
> List&lt;CatalogAdminsProductProperty&gt; getProperties(productCode, responseFields)

Get Product Properties

Get properties for a product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<CatalogAdminsProductProperty> result = apiInstance.getProperties(productCode, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;CatalogAdminsProductProperty&gt;**](CatalogAdminsProductProperty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProperty"></a>
# **getProperty**
> CatalogAdminsProductProperty getProperty(productCode, attributeFQN, responseFields)

Get Product Property

Get a specific product property. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogAdminsProductProperty result = apiInstance.getProperty(productCode, attributeFQN, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogAdminsProductProperty**](CatalogAdminsProductProperty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPropertyValueLocalizedContent"></a>
# **getPropertyValueLocalizedContent**
> ProductPropertyValueLocalizedContent getPropertyValueLocalizedContent(productCode, attributeFQN, value, localeCode, responseFields)

Get Product Property Localized Content by Locale

Get property value localized content.

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String localeCode = "localeCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ProductPropertyValueLocalizedContent result = apiInstance.getPropertyValueLocalizedContent(productCode, attributeFQN, value, localeCode, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ProductPropertyValueLocalizedContent**](ProductPropertyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPropertyValueLocalizedContents"></a>
# **getPropertyValueLocalizedContents**
> List&lt;ProductPropertyValueLocalizedContent&gt; getPropertyValueLocalizedContents(productCode, attributeFQN, value, responseFields)

Get Product Property Localized Contents

Get property value localized content.

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ProductPropertyValueLocalizedContent> result = apiInstance.getPropertyValueLocalizedContents(productCode, attributeFQN, value, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;ProductPropertyValueLocalizedContent&gt;**](ProductPropertyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProperty"></a>
# **updateProperty**
> CatalogAdminsProductProperty updateProperty(productCode, attributeFQN, batchJobCode, allowSyscalcValueUpdates, responseFields, catalogAdminsProductProperty)

Update Product Property

Update a specific product property. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String batchJobCode = "batchJobCode_example"; // String | 
    Boolean allowSyscalcValueUpdates = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsProductProperty catalogAdminsProductProperty = new CatalogAdminsProductProperty(); // CatalogAdminsProductProperty | 
    try {
      CatalogAdminsProductProperty result = apiInstance.updateProperty(productCode, attributeFQN, batchJobCode, allowSyscalcValueUpdates, responseFields, catalogAdminsProductProperty);
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
| **batchJobCode** | **String**|  | [optional] |
| **allowSyscalcValueUpdates** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsProductProperty** | [**CatalogAdminsProductProperty**](CatalogAdminsProductProperty.md)|  | [optional] |

### Return type

[**CatalogAdminsProductProperty**](CatalogAdminsProductProperty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updatePropertyValueLocalizedContent"></a>
# **updatePropertyValueLocalizedContent**
> ProductPropertyValueLocalizedContent updatePropertyValueLocalizedContent(productCode, attributeFQN, value, localeCode, responseFields, productPropertyValueLocalizedContent)

Update Product Property Localized Content by Locale

Update property value localized content by locale code.

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String localeCode = "localeCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent = new ProductPropertyValueLocalizedContent(); // ProductPropertyValueLocalizedContent | 
    try {
      ProductPropertyValueLocalizedContent result = apiInstance.updatePropertyValueLocalizedContent(productCode, attributeFQN, value, localeCode, responseFields, productPropertyValueLocalizedContent);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productPropertyValueLocalizedContent** | [**ProductPropertyValueLocalizedContent**](ProductPropertyValueLocalizedContent.md)|  | [optional] |

### Return type

[**ProductPropertyValueLocalizedContent**](ProductPropertyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updatePropertyValueLocalizedContents"></a>
# **updatePropertyValueLocalizedContents**
> List&lt;ProductPropertyValueLocalizedContent&gt; updatePropertyValueLocalizedContents(productCode, attributeFQN, value, responseFields, productPropertyValueLocalizedContent)

Update Product Property Localized Content

Update property value localized content.

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

    ProductPropertiesApi apiInstance = new ProductPropertiesApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ProductPropertyValueLocalizedContent> productPropertyValueLocalizedContent = Arrays.asList(); // List<ProductPropertyValueLocalizedContent> | 
    try {
      List<ProductPropertyValueLocalizedContent> result = apiInstance.updatePropertyValueLocalizedContents(productCode, attributeFQN, value, responseFields, productPropertyValueLocalizedContent);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productPropertyValueLocalizedContent** | [**List&lt;ProductPropertyValueLocalizedContent&gt;**](ProductPropertyValueLocalizedContent.md)|  | [optional] |

### Return type

[**List&lt;ProductPropertyValueLocalizedContent&gt;**](ProductPropertyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

