# ProductsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProduct**](ProductsApi.md#addProduct) | **POST** /commerce/catalog/admin/products | Add Product |
| [**addProductInCatalog**](ProductsApi.md#addProductInCatalog) | **POST** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs | Add Product in Catalogs |
| [**changeProductType**](ProductsApi.md#changeProductType) | **POST** /commerce/catalog/admin/products/{productCode}/changeproducttype | Change product type. |
| [**deleteProduct**](ProductsApi.md#deleteProduct) | **DELETE** /commerce/catalog/admin/products/{productCode} | Delete Product |
| [**deleteProductInCatalog**](ProductsApi.md#deleteProductInCatalog) | **DELETE** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs/{catalogId} | Delete Product in Catalog |
| [**getProduct**](ProductsApi.md#getProduct) | **GET** /commerce/catalog/admin/products/{productCode} | Get Product |
| [**getProductInCatalog**](ProductsApi.md#getProductInCatalog) | **GET** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs/{catalogId} | Get Product in Catalog |
| [**getProductInCatalogs**](ProductsApi.md#getProductInCatalogs) | **GET** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs | Get Products in Catalogs |
| [**getProducts**](ProductsApi.md#getProducts) | **GET** /commerce/catalog/admin/products | Get Products |
| [**renameProductCodes**](ProductsApi.md#renameProductCodes) | **POST** /commerce/catalog/admin/products/Actions/RenameProductCodes | Rename Product Codes |
| [**updateProduct**](ProductsApi.md#updateProduct) | **PUT** /commerce/catalog/admin/products/{productCode} | Update Product |
| [**updateProductInCatalog**](ProductsApi.md#updateProductInCatalog) | **PUT** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs/{catalogId} | Update Product in Catalog |
| [**updateProductInCatalogs**](ProductsApi.md#updateProductInCatalogs) | **PUT** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs | Update Product in Catalogs |


<a name="addProduct"></a>
# **addProduct**
> CatalogAdminsProduct addProduct(batchJobCode, responseFields, catalogAdminsProduct)

Add Product

Creates a new product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String batchJobCode = "batchJobCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsProduct catalogAdminsProduct = new CatalogAdminsProduct(); // CatalogAdminsProduct | Properties of the new product. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. Mozu.ProductAdmin.Contracts.Product
    try {
      CatalogAdminsProduct result = apiInstance.addProduct(batchJobCode, responseFields, catalogAdminsProduct);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#addProduct");
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
| **catalogAdminsProduct** | [**CatalogAdminsProduct**](CatalogAdminsProduct.md)| Properties of the new product. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. Mozu.ProductAdmin.Contracts.Product | [optional] |

### Return type

[**CatalogAdminsProduct**](CatalogAdminsProduct.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addProductInCatalog"></a>
# **addProductInCatalog**
> ProductInCatalogInfo addProductInCatalog(productCode, responseFields, productInCatalogInfo)

Add Product in Catalogs

Add a product to catalogs. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductInCatalogInfo productInCatalogInfo = new ProductInCatalogInfo(); // ProductInCatalogInfo | 
    try {
      ProductInCatalogInfo result = apiInstance.addProductInCatalog(productCode, responseFields, productInCatalogInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#addProductInCatalog");
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
| **productInCatalogInfo** | [**ProductInCatalogInfo**](ProductInCatalogInfo.md)|  | [optional] |

### Return type

[**ProductInCatalogInfo**](ProductInCatalogInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="changeProductType"></a>
# **changeProductType**
> ProductTypeChangeResponse changeProductType(productCode, responseFields, productTypeChangeRequest)

Change product type.

Change a product&#39;s product type. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductTypeChangeRequest productTypeChangeRequest = new ProductTypeChangeRequest(); // ProductTypeChangeRequest | 
    try {
      ProductTypeChangeResponse result = apiInstance.changeProductType(productCode, responseFields, productTypeChangeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#changeProductType");
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
| **productTypeChangeRequest** | [**ProductTypeChangeRequest**](ProductTypeChangeRequest.md)|  | [optional] |

### Return type

[**ProductTypeChangeResponse**](ProductTypeChangeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteProduct"></a>
# **deleteProduct**
> deleteProduct(productCode, batchJobCode)

Delete Product

Deletes the product specified by its product code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-created code associated with the product, for example, a SKU. Required.
    String batchJobCode = "batchJobCode_example"; // String | 
    try {
      apiInstance.deleteProduct(productCode, batchJobCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#deleteProduct");
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

<a name="deleteProductInCatalog"></a>
# **deleteProductInCatalog**
> deleteProductInCatalog(productCode, catalogId)

Delete Product in Catalog

Delete a product in a particular catalog.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    Integer catalogId = 56; // Integer | 
    try {
      apiInstance.deleteProductInCatalog(productCode, catalogId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#deleteProductInCatalog");
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

<a name="getProduct"></a>
# **getProduct**
> CatalogAdminsProduct getProduct(productCode, responseGroups, responseFields)

Get Product

Retrieves details about a product based on the specified response group. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-created code associated with the product, for example, a SKU. Required.
    String responseGroups = "responseGroups_example"; // String | Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogAdminsProduct result = apiInstance.getProduct(productCode, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getProduct");
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

[**CatalogAdminsProduct**](CatalogAdminsProduct.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProductInCatalog"></a>
# **getProductInCatalog**
> ProductInCatalogInfo getProductInCatalog(productCode, catalogId, responseFields)

Get Product in Catalog

Retrieves a product in a particular catalog. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    Integer catalogId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ProductInCatalogInfo result = apiInstance.getProductInCatalog(productCode, catalogId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getProductInCatalog");
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

[**ProductInCatalogInfo**](ProductInCatalogInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProductInCatalogs"></a>
# **getProductInCatalogs**
> List&lt;ProductInCatalogInfo&gt; getProductInCatalogs(productCode, responseFields)

Get Products in Catalogs

Retrieve products in catalogs. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ProductInCatalogInfo> result = apiInstance.getProductInCatalogs(productCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getProductInCatalogs");
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

[**List&lt;ProductInCatalogInfo&gt;**](ProductInCatalogInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProducts"></a>
# **getProducts**
> CatalogAdminsProductCollection getProducts(startIndex, pageSize, sortBy, responseGroups, filter, q, qLimit, noCount, responseFields)

Get Products

Retrieves a list of products according to any specified filter criteria and sort options. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
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
      CatalogAdminsProductCollection result = apiInstance.getProducts(startIndex, pageSize, sortBy, responseGroups, filter, q, qLimit, noCount, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getProducts");
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

[**CatalogAdminsProductCollection**](CatalogAdminsProductCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="renameProductCodes"></a>
# **renameProductCodes**
> renameProductCodes(responseFields, productCodeRename)

Rename Product Codes

Action that allows productCodes to be renamed.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ProductCodeRename> productCodeRename = Arrays.asList(); // List<ProductCodeRename> | An array specifying the existing productCode and the new productCode it should be renamed to
    try {
      apiInstance.renameProductCodes(responseFields, productCodeRename);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#renameProductCodes");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productCodeRename** | [**List&lt;ProductCodeRename&gt;**](ProductCodeRename.md)| An array specifying the existing productCode and the new productCode it should be renamed to | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProduct"></a>
# **updateProduct**
> CatalogAdminsProduct updateProduct(productCode, batchJobCode, responseFields, catalogAdminsProduct)

Update Product

Modifies an existing product. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-created code associated with the product, for example, a SKU. Required.
    String batchJobCode = "batchJobCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsProduct catalogAdminsProduct = new CatalogAdminsProduct(); // CatalogAdminsProduct | Properties of the product that you want to update. Required properties: ProductCode, Content.ProductName, and Price.ListPrice.
    try {
      CatalogAdminsProduct result = apiInstance.updateProduct(productCode, batchJobCode, responseFields, catalogAdminsProduct);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#updateProduct");
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
| **catalogAdminsProduct** | [**CatalogAdminsProduct**](CatalogAdminsProduct.md)| Properties of the product that you want to update. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. | [optional] |

### Return type

[**CatalogAdminsProduct**](CatalogAdminsProduct.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProductInCatalog"></a>
# **updateProductInCatalog**
> ProductInCatalogInfo updateProductInCatalog(productCode, catalogId, responseFields, productInCatalogInfo)

Update Product in Catalog

Update a product in a particular catalog. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    Integer catalogId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductInCatalogInfo productInCatalogInfo = new ProductInCatalogInfo(); // ProductInCatalogInfo | 
    try {
      ProductInCatalogInfo result = apiInstance.updateProductInCatalog(productCode, catalogId, responseFields, productInCatalogInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#updateProductInCatalog");
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
| **productInCatalogInfo** | [**ProductInCatalogInfo**](ProductInCatalogInfo.md)|  | [optional] |

### Return type

[**ProductInCatalogInfo**](ProductInCatalogInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProductInCatalogs"></a>
# **updateProductInCatalogs**
> List&lt;ProductInCatalogInfo&gt; updateProductInCatalogs(productCode, responseFields, productInCatalogInfo)

Update Product in Catalogs

Updates existing products across your catalogs. This current version of the Products API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access product data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ProductInCatalogInfo> productInCatalogInfo = Arrays.asList(); // List<ProductInCatalogInfo> | 
    try {
      List<ProductInCatalogInfo> result = apiInstance.updateProductInCatalogs(productCode, responseFields, productInCatalogInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#updateProductInCatalogs");
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
| **productInCatalogInfo** | [**List&lt;ProductInCatalogInfo&gt;**](ProductInCatalogInfo.md)|  | [optional] |

### Return type

[**List&lt;ProductInCatalogInfo&gt;**](ProductInCatalogInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

