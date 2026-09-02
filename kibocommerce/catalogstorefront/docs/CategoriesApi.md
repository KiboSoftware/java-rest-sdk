# CategoriesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**storefrontGetCategories**](CategoriesApi.md#storefrontGetCategories) | **GET** /commerce/catalog/storefront/categories | Get Product Categories |
| [**storefrontGetCategory**](CategoriesApi.md#storefrontGetCategory) | **GET** /commerce/catalog/storefront/categories/{categoryId} | Get Product Category |
| [**storefrontGetCategoryTree**](CategoriesApi.md#storefrontGetCategoryTree) | **GET** /commerce/catalog/storefront/categories/tree | Get Category Tree |


<a name="storefrontGetCategories"></a>
# **storefrontGetCategories**
> CatalogRuntimesCategoryPagedCollection storefrontGetCategories(filter, startIndex, pageSize, sortBy, includeAttributes, responseFields)

Get Product Categories

Retrieves a list of product categories that appear on the storefront as a flat list. Hidden categories do not appear in the list.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.CategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    String filter = "filter_example"; // String | Optional. A set of filter expressions representing the search parameters for a query:             eq=equals, ne=not equals, gt=greater than, lt = less than, gt = greater than or equals, le = less than or equals,             sw = starts with, or cont = contains.
    Integer startIndex = 56; // Integer | Optional. Used to page results from a query.             Indicates the zero-based offset in the complete result set where the returned entities begin.             For example, with a pageSize of 25, to get the 51st through the 75th items, startIndex=3.             The default value is 0.
    Integer pageSize = 56; // Integer | Optional. Used to page results from a query.             Indicates the maximum number of entities to return from a query. Default value: 20. Maximum value: 200.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear.             Either ascending order (a-z) which accepts 'asc' or 'ASC' or descending order (z-a) which accepts 'desc' or 'DESC'.             The sortBy parameter follows an available property.             For example, to sort results by category ID ascending, use sortBy=categoryId asc.
    Boolean includeAttributes = false; // Boolean | Optional. Used to include Category Attributes in response
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogRuntimesCategoryPagedCollection result = apiInstance.storefrontGetCategories(filter, startIndex, pageSize, sortBy, includeAttributes, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#storefrontGetCategories");
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
| **filter** | **String**| Optional. A set of filter expressions representing the search parameters for a query:             eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than, gt &#x3D; greater than or equals, le &#x3D; less than or equals,             sw &#x3D; starts with, or cont &#x3D; contains. | [optional] |
| **startIndex** | **Integer**| Optional. Used to page results from a query.             Indicates the zero-based offset in the complete result set where the returned entities begin.             For example, with a pageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3.             The default value is 0. | [optional] |
| **pageSize** | **Integer**| Optional. Used to page results from a query.             Indicates the maximum number of entities to return from a query. Default value: 20. Maximum value: 200. | [optional] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear.             Either ascending order (a-z) which accepts &#39;asc&#39; or &#39;ASC&#39; or descending order (z-a) which accepts &#39;desc&#39; or &#39;DESC&#39;.             The sortBy parameter follows an available property.             For example, to sort results by category ID ascending, use sortBy&#x3D;categoryId asc. | [optional] |
| **includeAttributes** | **Boolean**| Optional. Used to include Category Attributes in response | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogRuntimesCategoryPagedCollection**](CatalogRuntimesCategoryPagedCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontGetCategory"></a>
# **storefrontGetCategory**
> CatalogRuntimesCategory storefrontGetCategory(categoryId, allowInactive, includeAttributes, responseFields)

Get Product Category

Retrieves the name and details of a category that appears on the storefront. 

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.CategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    Integer categoryId = 56; // Integer | Required. Unique identifier of the category whose details you want to get.
    Boolean allowInactive = true; // Boolean | Optional. Allow the return of items with the IsDisplayed flag set to false.
    Boolean includeAttributes = false; // Boolean | Optional. If True, Return Category Attributes collection with Category
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogRuntimesCategory result = apiInstance.storefrontGetCategory(categoryId, allowInactive, includeAttributes, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#storefrontGetCategory");
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
| **categoryId** | **Integer**| Required. Unique identifier of the category whose details you want to get. | |
| **allowInactive** | **Boolean**| Optional. Allow the return of items with the IsDisplayed flag set to false. | [optional] |
| **includeAttributes** | **Boolean**| Optional. If True, Return Category Attributes collection with Category | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogRuntimesCategory**](CatalogRuntimesCategory.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontGetCategoryTree"></a>
# **storefrontGetCategoryTree**
> CatalogRuntimesCategoryCollection storefrontGetCategoryTree(includeAttributes, responseFields)

Get Category Tree

Retrieves the list of product categories that appear on the storefront organized in a hierarchical format. Hidden categories do not appear in the list.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.CategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    Boolean includeAttributes = false; // Boolean | Optional. If True, Return Category Attributes collection with Category
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogRuntimesCategoryCollection result = apiInstance.storefrontGetCategoryTree(includeAttributes, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#storefrontGetCategoryTree");
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
| **includeAttributes** | **Boolean**| Optional. If True, Return Category Attributes collection with Category | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogRuntimesCategoryCollection**](CatalogRuntimesCategoryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

