# ProductsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProduct**](ProductsApi.md#addProduct) | **POST** /commerce/catalog/admin/products | Add product |
| [**addProductInCatalog**](ProductsApi.md#addProductInCatalog) | **POST** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs | Add product in catalog |
| [**changeProductType**](ProductsApi.md#changeProductType) | **POST** /commerce/catalog/admin/products/{productCode}/changeproducttype | Change product type. |
| [**deleteProduct**](ProductsApi.md#deleteProduct) | **DELETE** /commerce/catalog/admin/products/{productCode} | Delete product |
| [**deleteProductInCatalog**](ProductsApi.md#deleteProductInCatalog) | **DELETE** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs/{catalogId} | Delete product in catalog |
| [**getProduct**](ProductsApi.md#getProduct) | **GET** /commerce/catalog/admin/products/{productCode} | Get product |
| [**getProductInCatalog**](ProductsApi.md#getProductInCatalog) | **GET** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs/{catalogId} | Get product in catalog |
| [**getProductInCatalogs**](ProductsApi.md#getProductInCatalogs) | **GET** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs | Update products in catalog |
| [**getProducts**](ProductsApi.md#getProducts) | **GET** /commerce/catalog/admin/products | Get products |
| [**renameProductCodes**](ProductsApi.md#renameProductCodes) | **POST** /commerce/catalog/admin/products/Actions/RenameProductCodes | Rename product codes |
| [**updateProduct**](ProductsApi.md#updateProduct) | **PUT** /commerce/catalog/admin/products/{productCode} | Update product |
| [**updateProductInCatalog**](ProductsApi.md#updateProductInCatalog) | **PUT** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs/{catalogId} | Update product in catalog |
| [**updateProductInCatalogs**](ProductsApi.md#updateProductInCatalogs) | **PUT** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs | Update products in catalog |


<a name="addProduct"></a>
# **addProduct**
> CatalogAdminsProduct addProduct(catalogAdminsProduct)

Add product

Creates a new product. You supply a product name, product code, price and other product characteristics such as its attributes, categories where the product belongs, whether the product has configurable options, stand-alone options, and so on.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    CatalogAdminsProduct catalogAdminsProduct = new CatalogAdminsProduct(); // CatalogAdminsProduct | Properties of the new product. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. Mozu.ProductAdmin.Contracts.Product
    try {
      CatalogAdminsProduct result = apiInstance.addProduct(catalogAdminsProduct);
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
| **catalogAdminsProduct** | [**CatalogAdminsProduct**](CatalogAdminsProduct.md)| Properties of the new product. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. Mozu.ProductAdmin.Contracts.Product | [optional] |

### Return type

[**CatalogAdminsProduct**](CatalogAdminsProduct.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addProductInCatalog"></a>
# **addProductInCatalog**
> ProductInCatalogInfo addProductInCatalog(productCode, productInCatalogInfo)

Add product in catalog



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    ProductInCatalogInfo productInCatalogInfo = new ProductInCatalogInfo(); // ProductInCatalogInfo | 
    try {
      ProductInCatalogInfo result = apiInstance.addProductInCatalog(productCode, productInCatalogInfo);
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
| **productInCatalogInfo** | [**ProductInCatalogInfo**](ProductInCatalogInfo.md)|  | [optional] |

### Return type

[**ProductInCatalogInfo**](ProductInCatalogInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="changeProductType"></a>
# **changeProductType**
> ProductTypeChangeResponse changeProductType(productCode, productTypeChangeRequest)

Change product type.

Change a product&#39;s product type.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    ProductTypeChangeRequest productTypeChangeRequest = new ProductTypeChangeRequest(); // ProductTypeChangeRequest | 
    try {
      ProductTypeChangeResponse result = apiInstance.changeProductType(productCode, productTypeChangeRequest);
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
| **productTypeChangeRequest** | [**ProductTypeChangeRequest**](ProductTypeChangeRequest.md)|  | [optional] |

### Return type

[**ProductTypeChangeResponse**](ProductTypeChangeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteProduct"></a>
# **deleteProduct**
> deleteProduct(productCode)

Delete product

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-created code associated with the product, for example, a SKU. Required.
    try {
      apiInstance.deleteProduct(productCode);
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

<a name="deleteProductInCatalog"></a>
# **deleteProductInCatalog**
> deleteProductInCatalog(productCode, catalogId)

Delete product in catalog



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProduct"></a>
# **getProduct**
> CatalogAdminsProduct getProduct(productCode, responseGroups)

Get product

Retrieves details about a product based on the specified response group. For example, to get the BaseProductCode of a product.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-created code associated with the product, for example, a SKU. Required.
    String responseGroups = "responseGroups_example"; // String | Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode.
    try {
      CatalogAdminsProduct result = apiInstance.getProduct(productCode, responseGroups);
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

### Return type

[**CatalogAdminsProduct**](CatalogAdminsProduct.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProductInCatalog"></a>
# **getProductInCatalog**
> ProductInCatalogInfo getProductInCatalog(productCode, catalogId)

Get product in catalog



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    Integer catalogId = 56; // Integer | 
    try {
      ProductInCatalogInfo result = apiInstance.getProductInCatalog(productCode, catalogId);
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

### Return type

[**ProductInCatalogInfo**](ProductInCatalogInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProductInCatalogs"></a>
# **getProductInCatalogs**
> List&lt;ProductInCatalogInfo&gt; getProductInCatalogs(productCode)

Update products in catalog



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    try {
      List<ProductInCatalogInfo> result = apiInstance.getProductInCatalogs(productCode);
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

### Return type

[**List&lt;ProductInCatalogInfo&gt;**](ProductInCatalogInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProducts"></a>
# **getProducts**
> CatalogAdminsProductCollection getProducts(startIndex, pageSize, sortBy, responseGroups, filter, q, qLimit, noCount)

Get products

Retrieves a list of products according to any specified filter criteria and sort options.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a single query. The default value is 20 and the maximum value is 200.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending or descending order. For example, to sort the results by “ID” ascending then by “CreateDate” descending, use: id asc,createdate desc.
    String responseGroups = "responseGroups_example"; // String | Used to get more specific information from the request. For example to get discounts applied to a product use the AppliedProducts response group. Available response groups: ApplicableDiscounts, VariationOptions, and BaseProductCode.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String q = "q_example"; // String | 
    Integer qLimit = 56; // Integer | 
    Boolean noCount = true; // Boolean | 
    try {
      CatalogAdminsProductCollection result = apiInstance.getProducts(startIndex, pageSize, sortBy, responseGroups, filter, q, qLimit, noCount);
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

### Return type

[**CatalogAdminsProductCollection**](CatalogAdminsProductCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="renameProductCodes"></a>
# **renameProductCodes**
> renameProductCodes(productCodeRename)

Rename product codes

Action that allows productCodes to be Renamed. Changing the resource identifier of a product could cause problems for established products.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    List<ProductCodeRename> productCodeRename = Arrays.asList(); // List<ProductCodeRename> | An array specifying the existing productCode and the new productCode it should be renamed to
    try {
      apiInstance.renameProductCodes(productCodeRename);
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
| **productCodeRename** | [**List&lt;ProductCodeRename&gt;**](ProductCodeRename.md)| An array specifying the existing productCode and the new productCode it should be renamed to | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProduct"></a>
# **updateProduct**
> CatalogAdminsProduct updateProduct(productCode, catalogAdminsProduct)

Update product

Modifies an existing product.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-created code associated with the product, for example, a SKU. Required.
    CatalogAdminsProduct catalogAdminsProduct = new CatalogAdminsProduct(); // CatalogAdminsProduct | Properties of the product that you want to update. Required properties: ProductCode, Content.ProductName, and Price.ListPrice.
    try {
      CatalogAdminsProduct result = apiInstance.updateProduct(productCode, catalogAdminsProduct);
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
| **catalogAdminsProduct** | [**CatalogAdminsProduct**](CatalogAdminsProduct.md)| Properties of the product that you want to update. Required properties: ProductCode, Content.ProductName, and Price.ListPrice. | [optional] |

### Return type

[**CatalogAdminsProduct**](CatalogAdminsProduct.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProductInCatalog"></a>
# **updateProductInCatalog**
> ProductInCatalogInfo updateProductInCatalog(productCode, catalogId, productInCatalogInfo)

Update product in catalog



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    Integer catalogId = 56; // Integer | 
    ProductInCatalogInfo productInCatalogInfo = new ProductInCatalogInfo(); // ProductInCatalogInfo | 
    try {
      ProductInCatalogInfo result = apiInstance.updateProductInCatalog(productCode, catalogId, productInCatalogInfo);
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
| **productInCatalogInfo** | [**ProductInCatalogInfo**](ProductInCatalogInfo.md)|  | [optional] |

### Return type

[**ProductInCatalogInfo**](ProductInCatalogInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProductInCatalogs"></a>
# **updateProductInCatalogs**
> List&lt;ProductInCatalogInfo&gt; updateProductInCatalogs(productCode, productInCatalogInfo)

Update products in catalog

Use the Products resource to create and manage products for your store. You can create products with options that a shopper configures (such as a T-shirt color and size). The system can manage inventory for all combinations of your product options, and can calculate tax and shipping costs.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    List<ProductInCatalogInfo> productInCatalogInfo = Arrays.asList(); // List<ProductInCatalogInfo> | 
    try {
      List<ProductInCatalogInfo> result = apiInstance.updateProductInCatalogs(productCode, productInCatalogInfo);
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
| **productInCatalogInfo** | [**List&lt;ProductInCatalogInfo&gt;**](ProductInCatalogInfo.md)|  | [optional] |

### Return type

[**List&lt;ProductInCatalogInfo&gt;**](ProductInCatalogInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

