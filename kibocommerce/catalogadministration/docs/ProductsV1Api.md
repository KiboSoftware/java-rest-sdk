# ProductsV1Api

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProduct2**](ProductsV1Api.md#addProduct2) | **POST** /commerce/catalog/admin/productsV1 | Add Product |
| [**addProductInCatalog1**](ProductsV1Api.md#addProductInCatalog1) | **POST** /commerce/catalog/admin/productsV1/{productCode}/ProductInCatalogs | Add Product in Catalogs |
| [**getProduct5**](ProductsV1Api.md#getProduct5) | **GET** /commerce/catalog/admin/productsV1/{productCode} | Get Product |
| [**getProductInCatalog3**](ProductsV1Api.md#getProductInCatalog3) | **GET** /commerce/catalog/admin/productsV1/{productCode}/ProductInCatalogs/{catalogId} | Get Product in Catalog |
| [**getProductInCatalogs4**](ProductsV1Api.md#getProductInCatalogs4) | **GET** /commerce/catalog/admin/productsV1/{productCode}/ProductInCatalogs | Get Products in Catalogs |
| [**getProducts6**](ProductsV1Api.md#getProducts6) | **GET** /commerce/catalog/admin/productsV1 | Get Products |
| [**updateProduct9**](ProductsV1Api.md#updateProduct9) | **PUT** /commerce/catalog/admin/productsV1/{productCode} | Update Product |
| [**updateProductInCatalog7**](ProductsV1Api.md#updateProductInCatalog7) | **PUT** /commerce/catalog/admin/productsV1/{productCode}/ProductInCatalogs/{catalogId} | Update Product in Catalog |
| [**updateProductInCatalogs8**](ProductsV1Api.md#updateProductInCatalogs8) | **PUT** /commerce/catalog/admin/productsV1/{productCode}/ProductInCatalogs | Update Products in Catalogs |


<a name="addProduct2"></a>
# **addProduct2**
> ProductV1 addProduct2(batchJobCode, responseFields, productV1)

Add Product

Creates a new product. This is the legacy version of the Products API,  which allows you to access product data that hasn&#39;t yet been rewritten to the newer  API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to  support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsV1Api apiInstance = new ProductsV1Api(defaultClient);
    String batchJobCode = "batchJobCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductV1 productV1 = new ProductV1(); // ProductV1 | Properties of the new product. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. Mozu.ProductAdmin.Contracts.Product
    try {
      ProductV1 result = apiInstance.addProduct2(batchJobCode, responseFields, productV1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsV1Api#addProduct2");
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
| **batchJobCode** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productV1** | [**ProductV1**](ProductV1.md)| Properties of the new product. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. Mozu.ProductAdmin.Contracts.Product | [optional] |

### Return type

[**ProductV1**](ProductV1.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addProductInCatalog1"></a>
# **addProductInCatalog1**
> ProductInCatalogInfoV1 addProductInCatalog1(productCode, responseFields, productInCatalogInfoV1)

Add Product in Catalogs

Adds a new product to your catalogs. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsV1Api apiInstance = new ProductsV1Api(defaultClient);
    String productCode = "productCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductInCatalogInfoV1 productInCatalogInfoV1 = new ProductInCatalogInfoV1(); // ProductInCatalogInfoV1 | 
    try {
      ProductInCatalogInfoV1 result = apiInstance.addProductInCatalog1(productCode, responseFields, productInCatalogInfoV1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsV1Api#addProductInCatalog1");
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
| **productInCatalogInfoV1** | [**ProductInCatalogInfoV1**](ProductInCatalogInfoV1.md)|  | [optional] |

### Return type

[**ProductInCatalogInfoV1**](ProductInCatalogInfoV1.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProduct5"></a>
# **getProduct5**
> ProductV1 getProduct5(productCode, responseGroups, responseFields)

Get Product

Retrieves details about a product based on the specified response group. This is the legacy version of the Products API,  which allows you to access product data that hasn&#39;t yet been rewritten to the newer  API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to  support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsV1Api apiInstance = new ProductsV1Api(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-created code associated with the product, for example, a SKU. Required.
    String responseGroups = "responseGroups_example"; // String | Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ProductV1 result = apiInstance.getProduct5(productCode, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsV1Api#getProduct5");
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
| **responseGroups** | **String**| Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ProductV1**](ProductV1.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProductInCatalog3"></a>
# **getProductInCatalog3**
> ProductInCatalogInfoV1 getProductInCatalog3(productCode, catalogId, responseFields)

Get Product in Catalog

Retrieves a product in a particular catalog. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsV1Api apiInstance = new ProductsV1Api(defaultClient);
    String productCode = "productCode_example"; // String | 
    Integer catalogId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ProductInCatalogInfoV1 result = apiInstance.getProductInCatalog3(productCode, catalogId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsV1Api#getProductInCatalog3");
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
| **catalogId** | **Integer**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ProductInCatalogInfoV1**](ProductInCatalogInfoV1.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProductInCatalogs4"></a>
# **getProductInCatalogs4**
> List&lt;ProductInCatalogInfoV1&gt; getProductInCatalogs4(productCode, responseFields)

Get Products in Catalogs

Retrieve existing products across all catalog. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsV1Api apiInstance = new ProductsV1Api(defaultClient);
    String productCode = "productCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ProductInCatalogInfoV1> result = apiInstance.getProductInCatalogs4(productCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsV1Api#getProductInCatalogs4");
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

[**List&lt;ProductInCatalogInfoV1&gt;**](ProductInCatalogInfoV1.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProducts6"></a>
# **getProducts6**
> ProductCollectionV1 getProducts6(startIndex, pageSize, sortBy, responseGroups, filter, q, qLimit, noCount, responseFields)

Get Products

Retrieves a list of products according to any specified filter criteria and sort options. This is the legacy version of the Products API,  which allows you to access product data that hasn&#39;t yet been rewritten to the newer  API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to  support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsV1Api apiInstance = new ProductsV1Api(defaultClient);
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a single query. The default value is 20 and the maximum value is 200.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending or descending order. For example, to sort the results by “ID” ascending then by “CreateDate” descending, use: id asc,createdate desc.
    String responseGroups = "responseGroups_example"; // String | Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String q = "q_example"; // String | 
    Integer qLimit = 56; // Integer | 
    Boolean noCount = true; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ProductCollectionV1 result = apiInstance.getProducts6(startIndex, pageSize, sortBy, responseGroups, filter, q, qLimit, noCount, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsV1Api#getProducts6");
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
| **responseGroups** | **String**| Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **q** | **String**|  | [optional] |
| **qLimit** | **Integer**|  | [optional] |
| **noCount** | **Boolean**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ProductCollectionV1**](ProductCollectionV1.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProduct9"></a>
# **updateProduct9**
> ProductV1 updateProduct9(productCode, batchJobCode, responseFields, productV1)

Update Product

Modifies an existing product. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsV1Api apiInstance = new ProductsV1Api(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-created code associated with the product, for example, a SKU. Required.
    String batchJobCode = "batchJobCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductV1 productV1 = new ProductV1(); // ProductV1 | Properties of the product that you want to update. Required properties: ProductCode, Content.ProductName, and Price.ListPrice.
    try {
      ProductV1 result = apiInstance.updateProduct9(productCode, batchJobCode, responseFields, productV1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsV1Api#updateProduct9");
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
| **batchJobCode** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productV1** | [**ProductV1**](ProductV1.md)| Properties of the product that you want to update. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. | [optional] |

### Return type

[**ProductV1**](ProductV1.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProductInCatalog7"></a>
# **updateProductInCatalog7**
> ProductInCatalogInfoV1 updateProductInCatalog7(productCode, catalogId, responseFields, productInCatalogInfoV1)

Update Product in Catalog

Updates products in a particular catalog. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsV1Api apiInstance = new ProductsV1Api(defaultClient);
    String productCode = "productCode_example"; // String | 
    Integer catalogId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductInCatalogInfoV1 productInCatalogInfoV1 = new ProductInCatalogInfoV1(); // ProductInCatalogInfoV1 | 
    try {
      ProductInCatalogInfoV1 result = apiInstance.updateProductInCatalog7(productCode, catalogId, responseFields, productInCatalogInfoV1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsV1Api#updateProductInCatalog7");
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
| **catalogId** | **Integer**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productInCatalogInfoV1** | [**ProductInCatalogInfoV1**](ProductInCatalogInfoV1.md)|  | [optional] |

### Return type

[**ProductInCatalogInfoV1**](ProductInCatalogInfoV1.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProductInCatalogs8"></a>
# **updateProductInCatalogs8**
> List&lt;ProductInCatalogInfoV1&gt; updateProductInCatalogs8(productCode, responseFields, productInCatalogInfoV1)

Update Products in Catalogs

Updates existing products across your catalogs. This is the legacy version of the Products API, which allows you to access product data that hasn&#39;t yet been rewritten to the newer API model with localizedContent. If possible, Kibo recommends calling the /products endpoint with an x-api-version header set to \&quot;1\&quot; instead of using this V1 endpoint (as it may be deprecated at some point). This is only necessary if you upgraded your implementation to use the new API version by default to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsV1Api apiInstance = new ProductsV1Api(defaultClient);
    String productCode = "productCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ProductInCatalogInfoV1> productInCatalogInfoV1 = Arrays.asList(); // List<ProductInCatalogInfoV1> | 
    try {
      List<ProductInCatalogInfoV1> result = apiInstance.updateProductInCatalogs8(productCode, responseFields, productInCatalogInfoV1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsV1Api#updateProductInCatalogs8");
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
| **productInCatalogInfoV1** | [**List&lt;ProductInCatalogInfoV1&gt;**](ProductInCatalogInfoV1.md)|  | [optional] |

### Return type

[**List&lt;ProductInCatalogInfoV1&gt;**](ProductInCatalogInfoV1.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

