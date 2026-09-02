# ProductOptionsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOption**](ProductOptionsApi.md#addOption) | **POST** /commerce/catalog/admin/products/{productCode}/Options | Add Product Option |
| [**deleteOption**](ProductOptionsApi.md#deleteOption) | **DELETE** /commerce/catalog/admin/products/{productCode}/Options/{attributeFQN} | Delete Product Option |
| [**getOption**](ProductOptionsApi.md#getOption) | **GET** /commerce/catalog/admin/products/{productCode}/Options/{attributeFQN} | Get Product Option |
| [**getOptions**](ProductOptionsApi.md#getOptions) | **GET** /commerce/catalog/admin/products/{productCode}/Options | Get Product Options |
| [**updateOption**](ProductOptionsApi.md#updateOption) | **PUT** /commerce/catalog/admin/products/{productCode}/Options/{attributeFQN} | Update Product Option |


<a name="addOption"></a>
# **addOption**
> CatalogAdminsProductOption addOption(productCode, responseFields, catalogAdminsProductOption)

Add Product Option

Add an option to a product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductOptionsApi apiInstance = new ProductOptionsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsProductOption catalogAdminsProductOption = new CatalogAdminsProductOption(); // CatalogAdminsProductOption | 
    try {
      CatalogAdminsProductOption result = apiInstance.addOption(productCode, responseFields, catalogAdminsProductOption);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductOptionsApi#addOption");
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
| **catalogAdminsProductOption** | [**CatalogAdminsProductOption**](CatalogAdminsProductOption.md)|  | [optional] |

### Return type

[**CatalogAdminsProductOption**](CatalogAdminsProductOption.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteOption"></a>
# **deleteOption**
> deleteOption(productCode, attributeFQN)

Delete Product Option

Delete a individual option for a product.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductOptionsApi apiInstance = new ProductOptionsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      apiInstance.deleteOption(productCode, attributeFQN);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductOptionsApi#deleteOption");
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

<a name="getOption"></a>
# **getOption**
> CatalogAdminsProductOption getOption(productCode, attributeFQN, responseFields)

Get Product Option

Get an individual option for a product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductOptionsApi apiInstance = new ProductOptionsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogAdminsProductOption result = apiInstance.getOption(productCode, attributeFQN, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductOptionsApi#getOption");
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

[**CatalogAdminsProductOption**](CatalogAdminsProductOption.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getOptions"></a>
# **getOptions**
> List&lt;CatalogAdminsProductOption&gt; getOptions(productCode, responseFields)

Get Product Options

Get options for a product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductOptionsApi apiInstance = new ProductOptionsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<CatalogAdminsProductOption> result = apiInstance.getOptions(productCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductOptionsApi#getOptions");
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

[**List&lt;CatalogAdminsProductOption&gt;**](CatalogAdminsProductOption.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateOption"></a>
# **updateOption**
> CatalogAdminsProductOption updateOption(productCode, attributeFQN, responseFields, catalogAdminsProductOption)

Update Product Option

Update an individual option for a product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductOptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductOptionsApi apiInstance = new ProductOptionsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsProductOption catalogAdminsProductOption = new CatalogAdminsProductOption(); // CatalogAdminsProductOption | 
    try {
      CatalogAdminsProductOption result = apiInstance.updateOption(productCode, attributeFQN, responseFields, catalogAdminsProductOption);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductOptionsApi#updateOption");
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
| **catalogAdminsProductOption** | [**CatalogAdminsProductOption**](CatalogAdminsProductOption.md)|  | [optional] |

### Return type

[**CatalogAdminsProductOption**](CatalogAdminsProductOption.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

