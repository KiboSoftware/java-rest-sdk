# ProductSortDefinitionsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProductSortDefinition**](ProductSortDefinitionsApi.md#addProductSortDefinition) | **POST** /commerce/catalog/admin/productsortdefinitions | Add product sort definition |
| [**deleteProductSortDefinition**](ProductSortDefinitionsApi.md#deleteProductSortDefinition) | **DELETE** /commerce/catalog/admin/productsortdefinitions/{productSortDefinitionId} | Delete product sort definition |
| [**getProductSortDefinition**](ProductSortDefinitionsApi.md#getProductSortDefinition) | **GET** /commerce/catalog/admin/productsortdefinitions/{productSortDefinitionId} | Get product sort definition |
| [**getProductSortDefinitions**](ProductSortDefinitionsApi.md#getProductSortDefinitions) | **GET** /commerce/catalog/admin/productsortdefinitions | Get product sort definitions |
| [**updateProductSortDefinition**](ProductSortDefinitionsApi.md#updateProductSortDefinition) | **PUT** /commerce/catalog/admin/productsortdefinitions/{productSortDefinitionId} | Update product sort definition |


<a name="addProductSortDefinition"></a>
# **addProductSortDefinition**
> ProductSortDefinition addProductSortDefinition(useProvidedId, productSortDefinition)

Add product sort definition

Adds a new product sort definition.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductSortDefinitionsApi;

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

    ProductSortDefinitionsApi apiInstance = new ProductSortDefinitionsApi(defaultClient);
    Boolean useProvidedId = false; // Boolean | If true, the provided Id value will be used as the ProductSortDefinitionId. If omitted or false, the system will generate a ProductSortDefinitionId
    ProductSortDefinition productSortDefinition = new ProductSortDefinition(); // ProductSortDefinition | Properties of the new product sort definition. Required properties of StartDate and Name.
    try {
      ProductSortDefinition result = apiInstance.addProductSortDefinition(useProvidedId, productSortDefinition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductSortDefinitionsApi#addProductSortDefinition");
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
| **useProvidedId** | **Boolean**| If true, the provided Id value will be used as the ProductSortDefinitionId. If omitted or false, the system will generate a ProductSortDefinitionId | [optional] [default to false] |
| **productSortDefinition** | [**ProductSortDefinition**](ProductSortDefinition.md)| Properties of the new product sort definition. Required properties of StartDate and Name. | [optional] |

### Return type

[**ProductSortDefinition**](ProductSortDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteProductSortDefinition"></a>
# **deleteProductSortDefinition**
> deleteProductSortDefinition(productSortDefinitionId)

Delete product sort definition

Deletes the product sort definition specified by its ProductSortDefinitionID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductSortDefinitionsApi;

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

    ProductSortDefinitionsApi apiInstance = new ProductSortDefinitionsApi(defaultClient);
    Integer productSortDefinitionId = 56; // Integer | Unique identifier of the product sort definition.
    try {
      apiInstance.deleteProductSortDefinition(productSortDefinitionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductSortDefinitionsApi#deleteProductSortDefinition");
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
| **productSortDefinitionId** | **Integer**| Unique identifier of the product sort definition. | |

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

<a name="getProductSortDefinition"></a>
# **getProductSortDefinition**
> ProductSortDefinition getProductSortDefinition(productSortDefinitionId)

Get product sort definition

Gets a single product sort definition.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductSortDefinitionsApi;

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

    ProductSortDefinitionsApi apiInstance = new ProductSortDefinitionsApi(defaultClient);
    Integer productSortDefinitionId = 56; // Integer | Unique identifier of the product sort definition.
    try {
      ProductSortDefinition result = apiInstance.getProductSortDefinition(productSortDefinitionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductSortDefinitionsApi#getProductSortDefinition");
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
| **productSortDefinitionId** | **Integer**| Unique identifier of the product sort definition. | |

### Return type

[**ProductSortDefinition**](ProductSortDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProductSortDefinitions"></a>
# **getProductSortDefinitions**
> ProductSortDefinitionPagedCollection getProductSortDefinitions(startIndex, pageSize, sortBy, filter)

Get product sort definitions

Retrieves a list of product sort definitions according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductSortDefinitionsApi;

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

    ProductSortDefinitionsApi apiInstance = new ProductSortDefinitionsApi(defaultClient);
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. The default value is 0.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    try {
      ProductSortDefinitionPagedCollection result = apiInstance.getProductSortDefinitions(startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductSortDefinitionsApi#getProductSortDefinitions");
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. The default value is 0. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. | [optional] [default to 0] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |

### Return type

[**ProductSortDefinitionPagedCollection**](ProductSortDefinitionPagedCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProductSortDefinition"></a>
# **updateProductSortDefinition**
> ProductSortDefinition updateProductSortDefinition(productSortDefinitionId, productSortDefinition)

Update product sort definition

Updates the details of a product sort definition.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductSortDefinitionsApi;

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

    ProductSortDefinitionsApi apiInstance = new ProductSortDefinitionsApi(defaultClient);
    Integer productSortDefinitionId = 56; // Integer | Unique identifier of the product sort definition.
    ProductSortDefinition productSortDefinition = new ProductSortDefinition(); // ProductSortDefinition | The details of the product sort definition to update.
    try {
      ProductSortDefinition result = apiInstance.updateProductSortDefinition(productSortDefinitionId, productSortDefinition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductSortDefinitionsApi#updateProductSortDefinition");
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
| **productSortDefinitionId** | **Integer**| Unique identifier of the product sort definition. | |
| **productSortDefinition** | [**ProductSortDefinition**](ProductSortDefinition.md)| The details of the product sort definition to update. | [optional] |

### Return type

[**ProductSortDefinition**](ProductSortDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

