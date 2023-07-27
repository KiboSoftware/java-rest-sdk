# ProductOptionsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOption**](ProductOptionsApi.md#addOption) | **POST** /commerce/catalog/admin/products/{productCode}/Options | Add option |
| [**deleteOption**](ProductOptionsApi.md#deleteOption) | **DELETE** /commerce/catalog/admin/products/{productCode}/Options/{attributeFQN} | Delete option |
| [**getOption**](ProductOptionsApi.md#getOption) | **GET** /commerce/catalog/admin/products/{productCode}/Options/{attributeFQN} | Get option |
| [**getOptions**](ProductOptionsApi.md#getOptions) | **GET** /commerce/catalog/admin/products/{productCode}/Options | Get options |
| [**updateOption**](ProductOptionsApi.md#updateOption) | **PUT** /commerce/catalog/admin/products/{productCode}/Options/{attributeFQN} | Update option |


<a name="addOption"></a>
# **addOption**
> CatalogAdminsProductOption addOption(productCode, catalogAdminsProductOption)

Add option

Add option

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductOptionsApi apiInstance = new ProductOptionsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    CatalogAdminsProductOption catalogAdminsProductOption = new CatalogAdminsProductOption(); // CatalogAdminsProductOption | 
    try {
      CatalogAdminsProductOption result = apiInstance.addOption(productCode, catalogAdminsProductOption);
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
| **catalogAdminsProductOption** | [**CatalogAdminsProductOption**](CatalogAdminsProductOption.md)|  | [optional] |

### Return type

[**CatalogAdminsProductOption**](CatalogAdminsProductOption.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteOption"></a>
# **deleteOption**
> deleteOption(productCode, attributeFQN)

Delete option

Delete individual option

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOption"></a>
# **getOption**
> CatalogAdminsProductOption getOption(productCode, attributeFQN)

Get option

Get individual option

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductOptionsApi apiInstance = new ProductOptionsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      CatalogAdminsProductOption result = apiInstance.getOption(productCode, attributeFQN);
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

### Return type

[**CatalogAdminsProductOption**](CatalogAdminsProductOption.md)

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
> List&lt;CatalogAdminsProductOption&gt; getOptions(productCode)

Get options

Get options for the product

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductOptionsApi apiInstance = new ProductOptionsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    try {
      List<CatalogAdminsProductOption> result = apiInstance.getOptions(productCode);
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

### Return type

[**List&lt;CatalogAdminsProductOption&gt;**](CatalogAdminsProductOption.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateOption"></a>
# **updateOption**
> CatalogAdminsProductOption updateOption(productCode, attributeFQN, catalogAdminsProductOption)

Update option

Update individual option

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductOptionsApi apiInstance = new ProductOptionsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String attributeFQN = "attributeFQN_example"; // String | 
    CatalogAdminsProductOption catalogAdminsProductOption = new CatalogAdminsProductOption(); // CatalogAdminsProductOption | 
    try {
      CatalogAdminsProductOption result = apiInstance.updateOption(productCode, attributeFQN, catalogAdminsProductOption);
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
| **catalogAdminsProductOption** | [**CatalogAdminsProductOption**](CatalogAdminsProductOption.md)|  | [optional] |

### Return type

[**CatalogAdminsProductOption**](CatalogAdminsProductOption.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

